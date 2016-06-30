/**   
* @Title: FirstLucene.java 
* @Description: TODO
* @author zhaozhu@luobotec.com
* @date 2016年6月30日 上午9:44:57 
* @powered by 北京萝卜科技有限公司
* @version V1.0   
*/
package study.zhaozhu.lucene.lucene3_6_0;

import java.io.File;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.queryParser.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;

/**
 * @ClassName: FirstLucene
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zhaozhu@luobotec.com
 * @date 2016年6月30日 上午9:44:57
 * 
 */
public class FirstLucene {

	private static final Version LUCENE_VERSION = Version.LUCENE_36;

	static Analyzer analyzer = new StandardAnalyzer(LUCENE_VERSION);
	static Directory directory = null;

	public static void main(String[] args) {

		String path = "/Users/zhaozhu/Development/zhaozhu_test_dir/";
		try {
			directory = FSDirectory.open(new File(path));

			// 创建索引
			IndexWriterConfig config = new IndexWriterConfig(LUCENE_VERSION, analyzer);
			IndexWriter iwriter = new IndexWriter(directory, config);

			Document doc = new Document();
			String text = "This is the text to be indexed.";
			doc.add(new Field("fieldname", text, Field.Store.YES, Field.Index.ANALYZED));
			iwriter.addDocument(doc);
			iwriter.commit();
			iwriter.close();

			// 搜索索引
			IndexReader iReader = IndexReader.open(directory);
			IndexSearcher iSearcher = new IndexSearcher(iReader);

			QueryParser parser = new QueryParser(LUCENE_VERSION, "fieldname", analyzer);
			Query query = parser.parse("text");

			ScoreDoc[] hits = iSearcher.search(query, 1).scoreDocs;
			
			System.out.println(hits.length);
			
			for (int i = 0; i < hits.length; i++) {
				Document hitDoc = iSearcher.doc(hits[i].doc);
				System.out.println(hitDoc.get("fieldname"));
			}
			
			
			iSearcher.close();
			iReader.close();
			directory.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("lucene end");
		}
	}

}
