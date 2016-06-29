package study.zhaozhu.java;
/*package com.zz.test;

public class TestForLJ {
	package neu.lj.graduate.util.hbase;


	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.logging.Logger;

	import javax.sound.midi.VoiceStatus;

	import org.apache.hadoop.conf.Configuration;
	import org.apache.hadoop.hbase.HBaseConfiguration;
	import org.apache.hadoop.hbase.HColumnDescriptor;
	import org.apache.hadoop.hbase.HTableDescriptor;
	import org.apache.hadoop.hbase.KeyValue;
	import org.apache.hadoop.hbase.MasterNotRunningException;
	import org.apache.hadoop.hbase.ZooKeeperConnectionException;
	import org.apache.hadoop.hbase.client.Get;
	import org.apache.hadoop.hbase.client.HBaseAdmin;
	import org.apache.hadoop.hbase.client.HTable;
	import org.apache.hadoop.hbase.client.Put;
	import org.apache.hadoop.hbase.client.Result;
	import org.apache.hadoop.hbase.client.ResultScanner;
	import org.apache.hadoop.hbase.client.Scan;
	import org.apache.hadoop.hbase.filter.BinaryComparator;
	import org.apache.hadoop.hbase.filter.CompareFilter.CompareOp;
	import org.apache.hadoop.hbase.filter.Filter;
	import org.apache.hadoop.hbase.filter.RowFilter;
	import org.apache.hadoop.hbase.filter.SubstringComparator;
	import org.apache.hadoop.hbase.util.Bytes;
	import com.sun.jersey.core.spi.scanning.Scanner;
	import com.sun.jersey.core.spi.scanning.ScannerException;
	import com.sun.jersey.core.spi.scanning.ScannerListener;
	import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion.Static;



	*//**
	 * @author lj
	 * 
	 *2015-9-8
	 * 
	 *//*


	public class HbaseTableOP {

		public static Logger logger = Logger
				.getLogger(HbaseTableOP.class.getName());

		public static String TABLE_NAME = "UserTable";
		public static String FAMILY_NAMES[] = { "userinfo", "frideninfo","offlinemessage", "groupinfo", "log" };
		public static String QUORUN_MASTER = "hadoop11,hadoop12,hadoop13,hadoop15,hadoop17";

		public static Configuration conf = null;
		private  static int sum =0;

		//private static String tableName;

		static {
			conf = HBaseConfiguration.create();
			conf.set("hbase.zookeeper.quorum", QUORUN_MASTER);
			conf.set("hbase.zookeeper.property.clientPort", "2222");

		}

		public static void main(String[] args) throws Exception {
			HbaseTableOP hbOp = new HbaseTableOP();
			// TODO Auto-generated method stub

			//createTable(TABLE_NAME, FAMILY_NAMES);
			
			addData("10000000009", TABLE_NAME, "userinfo","username", "hadoop9");    	
			addData("10000000009", TABLE_NAME, "userinfo","password", "123456");    	
			addData("10000000008", TABLE_NAME, "userinfo","username", "hadoop8");
			addData("10000000008", TABLE_NAME, "userinfo","password", "123456");
			addData("10000000007", TABLE_NAME, "userinfo", "username","hadoop7");
			addData("10000000007", TABLE_NAME, "userinfo","password", "123456");
			addData("10000000006", TABLE_NAME, "userinfo", "password","123456");
		    addData("10000000006", TABLE_NAME, "userinfo", "username","hadoop6");
		    
		   addData("10000000008", TABLE_NAME, "userinfo","state", "0");
		   addData("10000000007", TABLE_NAME, "userinfo", "state","0");
		   addData("10000000006", TABLE_NAME, "userinfo","state", "1");
		   addData("10000000009", TABLE_NAME, "userinfo", "state","1");


		}



		public  static void createTable(String tableName, String[] familyNames) {
			HBaseAdmin admin;
			try {
				admin = new HBaseAdmin(conf);
				HTableDescriptor htd = new HTableDescriptor(tableName);
				if (admin.tableExists(tableName)) {
					admin.disableTable(tableName);
					admin.deleteTable(tableName);
					System.out.println(tableName + "is exist,delete it");
				}
				for (int i = 0; i < familyNames.length; i++) {
					htd.addFamily(new HColumnDescriptor(familyNames[i]));
				}
				admin.createTable(htd);
				System.out.println("table creates success!");
			} catch (MasterNotRunningException e) {

				e.printStackTrace();
			} catch (ZooKeeperConnectionException e) {

				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		public static  void addData (String rowKey, String tableName,String familyName, String columnName, String values)throws Exception {
			HBaseAdmin admin = new HBaseAdmin(conf);
			HTable table = new HTable(conf, Bytes.toBytes(tableName));
			Put put = new Put(Bytes.toBytes(rowKey));
			if (isExistFamily(tableName, familyName)) {
				put.add(Bytes.toBytes(familyName), Bytes.toBytes(columnName),Bytes.toBytes(values));

			}
			table.put(put);
			logger.info("add data Success!");

		}
		
		
		*//**
		 * @author lj
		 *
		 *只需要结果集时使用
		 *//*
		
		public static ResultScanner getResultScan(String tableName, String family) throws IOException { 
			 	Scan scan = new Scan();
		        scan.addFamily(Bytes.toBytes(family));
		        ResultScanner rscan = null;
		        HTable table = new HTable(conf, Bytes.toBytes(tableName));
		        rscan = table.getScanner(scan);
		        return rscan; 
		    }
		
		*//**
		 * @author lj
		 *
		 *2015-9-24
		 *
		 *marge the getResultScan and count;
		 *
		 *同时需要查询结果与结果集的大小是使用
		 *//*
		
		public  static List<ResultScanner> getResultScanAndCount(String tableName, String family,String qualifier) throws IOException {
		    List<Result>  list = new ArrayList<ResultScanner>(); 
		 	Scan scan = new Scan();
	        ResultScanner rscan = null;
	        ResultScanner rs = null;
	        HTable table = new HTable(conf, Bytes.toBytes(tableName));
	        int size = 0;
			String state;
			String value;
			
			if(qualifier.equals("")){//all number
				scan.addFamily(Bytes.toBytes(family));
				rscan = table.getScanner(scan);
				list.addA(rscan);
				
				for(Result r : rscan){
					  size ++;
					  for(KeyValue kv:r.list()){
							System.out.println(":family:"+kv.getFamily()
									+",qualifier:" +Bytes.toString(kv.getQualifier())
									+",value:" + Bytes.toString(kv.getValue())
									+",Timestamp:" + kv.getTimestamp());
							logger.info("--------------------------");
						}
					  System.out.println(size);
			      //  	logger.info("online_number is :"+size);
			     }
				 rs = rscan;
			}else{//computer the number of online
				list.add(rscan);
				scan.addColumn(Bytes.toBytes(family), Bytes.toBytes(qualifier));
				rscan = table.getScanner(scan);
			    for(Result r : rscan){
			        	 for (KeyValue kv : r.list()) {
			        		 state = Bytes.toStringBinary(kv.getQualifier());
			        		 value = Bytes.toString(kv.getValue());
			        		 if(state.equals(qualifier) && value.equals("1")){
			        			 size++;
			        		 }
			            }
			  //  logger.info("online_number is :"+size);
			        }
			    rs = rscan;
			}
			rscan.close();
			setSum(size);
	      //  return rscan;
			return list;
	        
	    }
		*//**
		 * @author lj
		 *返回结果集的大小，不需要结果集只需要大小时使用
		 *//*
		public static int count(String tableName, String family,String qualifier) throws IOException{
			//logger.info("online_number is computing");
	        ResultScanner rscan = null;
	        HTable table = new HTable(conf, Bytes.toBytes(tableName));
	        Scan scan = new Scan();
			
			int size = 0;
			String state;
			String value;
			
			if(qualifier.equals("")){//all number
				scan.addFamily(Bytes.toBytes(family));
				rscan = table.getScanner(scan);
				for(Result r : rscan){
					  size ++;
			      //  	logger.info("online_number is :"+size);
			     }
				 
			}else{//computer the number of online
				scan.addColumn(Bytes.toBytes(family), Bytes.toBytes(qualifier));
				rscan = table.getScanner(scan);
			    for(Result r : rscan){
			        	 for (KeyValue kv : r.list()) {
			        		 state = Bytes.toStringBinary(kv.getQualifier());
			        		 value = Bytes.toString(kv.getValue());
			        		 if(state.equals(qualifier) && value.equals("1")){
			        			 size++;
			        		 }
			            }
			  //  logger.info("online_number is :"+size);
			        }
			}

	    	logger.info("online_number is :"+size);
			return size;
		}
			
		*//**
		 * @author lj
		 *
		 *
		 *2015-9-23
		 *
		 * @throws IOException 
		 *//*
		
		public static ResultScanner searchByRowkey(String tableName,String family,CompareOp op, String rowKey) throws IOException{
			logger.info("searchByRowkey is start!");
			HTable table = new HTable(conf, Bytes.toBytes(tableName));
			Scan scan = new Scan() ;
			scan.addFamily(Bytes.toBytes(family));
			Filter filter;
			if(op.equals(CompareOp.NOT_EQUAL)){
				 filter = new RowFilter(CompareOp.EQUAL, new SubstringComparator(rowKey));
			}else{
				
				 filter = new RowFilter(op,new BinaryComparator(Bytes.toBytes(rowKey)));
			}
			scan.setFilter(filter);
			ResultScanner rs = table.getScanner(scan);
			for(KeyValue kv:rs.list()){
				System.out.println(rowKey+":family:"+kv.getFamily()
						+",qualifier:" +Bytes.toString(kv.getQualifier())
						+",value:" + Bytes.toString(kv.getValue())
						+",Timestamp:" + kv.getTimestamp());
				logger.info("--------------------------");
			}
			
			logger.info("searchByRowkey is end!");
			return rs;
			
			}
		 
		public static boolean isExistFamily(String tableName, String familyName)
				throws Exception {
			HBaseAdmin admin = new HBaseAdmin(conf);
			if (admin.tableExists((tableName))) {
				logger.info(tableName + " exits");
				HTable table = new HTable(conf, Bytes.toBytes(tableName));
				HColumnDescriptor[] hcd = table.getTableDescriptor().getColumnFamilies();

				for (int i = 0; i < hcd.length; i++) {
					if (hcd[i].getNameAsString().equals(familyName)) {
						logger.info(familyName + " exits");
						return true;
					}
					
				}
				logger.info(familyName + "isn't exits");
				return false;
			}else{
				return false;
			}

		}



		public static int getSum() {
			return sum;
		}



		public static void setSum(int sum) {
			HbaseTableOP.sum = sum;
		}
		

	}

}
*/