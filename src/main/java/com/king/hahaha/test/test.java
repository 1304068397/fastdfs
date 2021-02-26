package com.king.hahaha.test;

import com.king.hahaha.utils.FastDFSClient;
import org.junit.Test;
import org.springframework.stereotype.Component;

import java.io.File;

/**
 * @PackageName:com.king.hahaha.test
 * @ClassName:test
 * @Description:
 * @Author:王宗保
 * @Version V1.0.0
 * @Date:2021/2/26 11:06
 */
@Component
public class test {

    public void Upload(String fileUrl) {
        //String fileUrl = "F:\\GitCode\\hahaha\\src\\test\\java\\com\\king\\hahaha\\test.png";
        File file = new File(fileUrl);
        String str = FastDFSClient.uploadFile(file);
        FastDFSClient.getResAccessUrl(str);
    }

    @Test
    public void test() {
        System.out.println(test.class.getResource(""));
        System.out.println(test.class.getResource("/"));
    }
}
