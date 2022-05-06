package com.hdfs_java_api;

import java.net.URI;
import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class Upload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Download();
		//upload();
	}
	
	public static void upload(){
		String localPath = "C:\\Users\\sanke\\Downloads\\test1.png";
		String uri = "hdfs://localhost:9820";
		String hdfsDir = "hdfs://localhost:9820/you";
		Configuration conf = new Configuration();
		FileSystem fs;
		try {
			fs = FileSystem.get(URI.create(uri), conf);
			fs.copyFromLocalFile(new Path(localPath), new Path(hdfsDir));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void Download() {

		String localPath = "C:\\Users\\sanke\\Documents\\Hadoop\\data";
		String uri = "hdfs://localhost:9820";
		String hdfsDir = "hdfs://localhost:9820/you/test1.png";
		Configuration conf = new Configuration();
		FileSystem fs;
		try {
			fs = FileSystem.get(URI.create(uri), conf);
			fs.copyToLocalFile(new Path(hdfsDir), new Path(localPath));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
