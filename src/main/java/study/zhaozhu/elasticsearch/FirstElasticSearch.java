/**   
* @Title: FirstElasticSearch.java 
* @Description: TODO
* @author zhaozhu@luobotec.com
* @date 2016年7月1日 下午4:25:07 
* @powered by 北京萝卜科技有限公司
* @version V1.0   
*/
package study.zhaozhu.elasticsearch;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;

/**
 * @ClassName: FirstElasticSearch
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zhaozhu@luobotec.com
 * @date 2016年7月1日 下午4:25:07
 * 
 */
public class FirstElasticSearch {
	public static void main(String[] args) {
		
//		Settings settings = Settings.settingsBuilder().put("cluster.name", "myClusterName").build();
		
		try {
//			Client client = TransportClient.builder().settings(settings).build();
			Client client = TransportClient.builder().build()
					.addTransportAddress(new InetSocketTransportAddress(InetAddress.getLocalHost(), 9300));
			System.out.println(client);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}
}
