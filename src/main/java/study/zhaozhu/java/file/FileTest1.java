/**   
* @Title: FileTest1.java 
* @Description: TODO
* @author zhaozhu@luobotec.com
* @date 2016年5月24日 上午11:25:54 
* @powered by 北京萝卜科技有限公司
* @version V1.0   
*/
package study.zhaozhu.java.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName: FileTest1
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zhaozhu@luobotec.com
 * @date 2016年5月24日 上午11:25:54
 * 
 */
public class FileTest1 {
	public static void fileos3(String filename) {
		File file = new File(filename);
		BufferedWriter bw = null;
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			System.out.println(file.getName());
			
			String fpath = file.getParent() + "/" + file.getName();
			System.out.println("fpath=" + fpath);
			
			File file1 = new File(fpath);
			if (!file1.exists() || !file1.isDirectory()) {
				System.out.println("file1.mkdirs()=" + file1.mkdirs());
			}
			
			String fname = fpath + "";
			System.out.println("fname=" + fname);
			String line = null;
			String type = "";
			while ((line = br.readLine()) != null) {
				String[] strs = line.split(" ");
				if (!strs[0].equals(type)) {
					type = strs[0];
					fname = fpath + type;
					File f = new File(fname);
					if (!f.getParentFile().exists() || f.getParentFile() == null) {
						System.out.println("===");
						f.getParentFile().mkdirs();
					}
					bw = new BufferedWriter(new FileWriter(f));
				}
				String content = type;

				bw.append(content);
				bw.newLine();
				bw.flush();

			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				// fw.flush();
				bw.flush();
				bw.close();
				// fw.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) throws IOException {
		// String fname = "data.txt";
		String fname = "/Users/zhaozhu/Desktop/lj_file_test/file_test";

		fileos3(fname);
		System.out.println("end");
		
		File file1 = new File("/Users/zhaozhu/Desktop/lj_file_test/file_test2");
		if (!file1.exists() || !file1.isDirectory()) {
			System.out.println("file1.mkdirs()=" + file1.mkdirs());
		}
		
	}
}
