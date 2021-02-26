package com.king.hahaha;

import com.king.hahaha.test.test;
import com.king.hahaha.utils.FastDFSClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FileClientApplicationTests {

    @Test
    public void Upload() {
        test test = new test();
        String fileUrl = "F:\\GitCode\\hahaha\\src\\test\\java\\com\\king\\hahaha\\test.png";
        test.Upload(fileUrl);
    }

    @Test
    public void Delete() {
        FastDFSClient.deleteFile("group1/M00/00/00/rBEAClu8OiSAFbN_AAbhXQnXzvw031.jpg");
    }

    @Test
    public void test() {
        System.out.println(FileClientApplicationTests.class.getResource(""));
        System.out.println(FileClientApplicationTests.class.getResource("/"));
    }
}