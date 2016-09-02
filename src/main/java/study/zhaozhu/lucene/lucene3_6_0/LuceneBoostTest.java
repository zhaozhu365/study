///**   
//* @Title: FirstLucene.java 
//* @Description: TODO
//* @author zhaozhu@luobotec.com
//* @date 2016年6月30日 上午9:44:57 
//* @powered by 北京萝卜科技有限公司
//* @version V1.0   
//*/
//package study.zhaozhu.lucene.lucene3_6_0;
//
//import java.io.File;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.apache.lucene.analysis.Analyzer;
//import org.apache.lucene.analysis.standard.StandardAnalyzer;
//import org.apache.lucene.document.Document;
//import org.apache.lucene.document.Field;
//import org.apache.lucene.index.IndexReader;
//import org.apache.lucene.index.IndexWriter;
//import org.apache.lucene.index.IndexWriterConfig;
//import org.apache.lucene.queryParser.QueryParser;
//import org.apache.lucene.search.IndexSearcher;
//import org.apache.lucene.search.Query;
//import org.apache.lucene.search.ScoreDoc;
//import org.apache.lucene.store.Directory;
//import org.apache.lucene.store.FSDirectory;
//import org.apache.lucene.util.Version;
//
///**
// * @ClassName: FirstLucene
// * @Description: TODO(这里用一句话描述这个类的作用)
// * @author zhaozhu
// * @date 2016年6月30日 上午9:44:57
// * 
// */
//public class LuceneBoostTest {
//
//	private static final Version LUCENE_VERSION = Version.LUCENE_36;
//
//	static Analyzer analyzer = new StandardAnalyzer(LUCENE_VERSION);
//	static Directory directory = null;
//
//	/** 测试语料 */
//	public static List<String> DIALOG = new ArrayList<>();
//	/** 测试关键词 */
//	public static String KEY_WORD = "你好啊";
//	/** 权重map */
//	public static Map<Integer, Float> BOOST_MAP = new HashMap<>();
//	/**
//	 * 此权重方法下的有效分数：2.5分
//	 */
//	/** 权重 */
//	public static float BOOST = 10.0f;
//
//	static {
//		DIALOG.add("你好");
//		DIALOG.add("你好啊");
//		DIALOG.add("你好啊世界");
//		DIALOG.add("你好啊世界1");
//		DIALOG.add("你好啊世界2");
//		DIALOG.add("你好啊世界3");
//		DIALOG.add("你好啊世界4");
//		DIALOG.add("你好啊世界5");
//		DIALOG.add("你好啊世界6");
//		DIALOG.add("你好啊世界7");
//		DIALOG.add("你好啊世界8");
//		DIALOG.add("你好啊世界9");
//		DIALOG.add("你好啊世界10");
//		DIALOG.add("你好啊世界11");
//		DIALOG.add("你好啊世界11");
//		DIALOG.add("你好啊世界1");
//		DIALOG.add("你好啊世界2");
//		DIALOG.add("你好啊世界3");
//		DIALOG.add("你好啊世界4");
//		DIALOG.add("你好啊世界5");
//		DIALOG.add("你好啊世界6");
//		DIALOG.add("你好啊世界7");
//		DIALOG.add("你好啊世界8");
//		DIALOG.add("你好啊世界9");
//		DIALOG.add("你好啊世界10");
//		DIALOG.add("你好啊世界11");
//		DIALOG.add("你好啊世界11");
//		DIALOG.add("你好啊世界1");
//		DIALOG.add("你好啊世界2");
//		DIALOG.add("你好啊世界3");
//		DIALOG.add("你好啊世界4");
//		DIALOG.add("你好啊世界5");
//		DIALOG.add("你好啊世界6");
//		DIALOG.add("你好啊世界7");
//		DIALOG.add("你好啊世界8");
//		DIALOG.add("你好啊世界9");
//		DIALOG.add("你好啊世界10");
//		DIALOG.add("你好啊世界11");
//		DIALOG.add("你好啊世界11");
//		DIALOG.add("你好啊世界洒大地上");
//		DIALOG.add("洒大地上");
//		DIALOG.add("啊但是大大");
//		DIALOG.add("下次 v 需现场 v");
//		DIALOG.add("挂号费挂号费");
//		DIALOG.add("而特热天热天");
//		DIALOG.add("把 v 不能不 vv 不能");
//		DIALOG.add("让他依然有人讨厌");
//		DIALOG.add("哟 iu 哦多少");
//		DIALOG.add("设置不同");
//		DIALOG.add("情人节白癜风");
//		DIALOG.add("那挖掘史蒂夫你");
//		DIALOG.add("洒大地上");
//		DIALOG.add("啊但是大大");
//		DIALOG.add("下次 v 需现场 v");
//		DIALOG.add("挂号费挂号费");
//		DIALOG.add("而特热天热天");
//		DIALOG.add("把 v 不能不 vv 不能");
//		DIALOG.add("让他依然有人讨厌");
//		DIALOG.add("哟 iu 哦多少");
//		DIALOG.add("设置不同");
//		DIALOG.add("情人节白癜风");
//		DIALOG.add("那挖掘史蒂夫你");
//		DIALOG.add("洒大地上");
//		DIALOG.add("啊但是大大");
//		DIALOG.add("下次 v 需现场 v");
//		DIALOG.add("挂号费挂号费");
//		DIALOG.add("而特热天热天");
//		DIALOG.add("把 v 不能不 vv 不能");
//		DIALOG.add("让他依然有人讨厌");
//		DIALOG.add("哟 iu 哦多少");
//		DIALOG.add("设置不同");
//		DIALOG.add("情人节白癜风");
//		DIALOG.add("那挖掘史蒂夫你");
//
//		BOOST_MAP.put(1, 10.0f);
//		BOOST_MAP.put(2, 5.0f);
//		BOOST_MAP.put(3, 3.3f);
//		BOOST_MAP.put(4, 3.0f);
//		BOOST_MAP.put(5, 2.0f);
//	}
//
//	public static void main(String[] args) {
//
//		String path = "/Users/zhaozhu/Development/zhaozhu_test_dir/";
//		try {
//			directory = FSDirectory.open(new File(path));
//
//			/** 创建索引 */
//			IndexWriterConfig config = new IndexWriterConfig(LUCENE_VERSION, analyzer);
//			IndexWriter iwriter = new IndexWriter(directory, config);
//
//			/** 先将旧的删除 */
//			iwriter.deleteAll();
//
//			/** 计算权重 */
//			if (DIALOG.size() == 1) {
//				// TODO ...
//			} else if (DIALOG.size() >= 2 && DIALOG.size() <= 10) {
//				BOOST = BOOST_MAP.get(2);
//			} else if (DIALOG.size() >= 10 && DIALOG.size() <= 20) {
//				BOOST = BOOST_MAP.get(3);
//			} else if (DIALOG.size() > 20) {
//				BOOST = BOOST_MAP.get(4);
//			}
//
//			System.out.println("DIALOG.size()=" + DIALOG.size());
//			System.out.println("BOOST=" + BOOST);
//
//			for (String words : DIALOG) {
//				Document doc = new Document();
//				doc.add(new Field("fieldname", words, Field.Store.YES, Field.Index.ANALYZED));
//
//				/** 设置权重 */
//				doc.setBoost(BOOST);
//
//				/** 将文档添加索引 */
//				iwriter.addDocument(doc);
//			}
//
//			/** 提交 */
//			iwriter.commit();
//			/** 关闭 */
//			iwriter.close();
//
//			/** 搜索索引 */
//			IndexReader iReader = IndexReader.open(directory);
//			IndexSearcher iSearcher = new IndexSearcher(iReader);
//
//			QueryParser parser = new QueryParser(LUCENE_VERSION, "fieldname", analyzer);
//			Query query = parser.parse(KEY_WORD);
//
//			ScoreDoc[] hits = iSearcher.search(query, DIALOG.size()).scoreDocs;
//
//			System.out.println("--------hits.length:" + hits.length + "--------");
//
//			for (int i = 0; i < hits.length; i++) {
//				Document hitDoc = iSearcher.doc(hits[i].doc);
//				System.out.println("fieldname:" + hitDoc.get("fieldname") + "------ score:" + hits[i].score);
//			}
//
//			iSearcher.close();
//			iReader.close();
//			directory.close();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			System.out.println("--------lucene end---------");
//		}
//	}
//
//}
