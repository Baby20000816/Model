package com.soft1851.spring.web.spider;

import org.springframework.http.HttpEntity;

/**
 * @author jh_wu
 * @ClassName QuickStart
 * @Description TODO
 * @Date 2020/3/26:14:53
 * @Version 1.0
 **/
public class QuickStart {
//    public static void main(String[] args) throws Exception {
//        CloseableHttpClient httpclient = HttpClients.createDefault();
//        HttpGet httpGet = new HttpGet("http://targethost/homepage");
//        CloseableHttpResponse response1 = httpclient.execute(httpGet);
//// The underlying HTTP connection is still held by the response object
//// to allow the response content to be streamed directly from the network socket.
//// In order to ensure correct deallocation of system resources
//// the user MUST call CloseableHttpResponse#close() from a finally clause.
//// Please note that if response content is not fully consumed the underlying
//// connection cannot be safely re-used and will be shut down and discarded
//// by the connection manager.
//        try {
//            System.out.println(response1.getStatusLine());
//            HttpEntity entity1 = response1.getEntity();
//            // do something useful with the response body
//            // and ensure it is fully consumed
//            EntityUtils.consume(entity1);
//        } finally {
//            response1.close();
//        }
//
//        HttpPost httpPost = new HttpPost("http://targethost/login");
//        List <NameValuePair> nvps = new ArrayList <NameValuePair>();
//        nvps.add(new BasicNameValuePair("username", "vip"));
//        nvps.add(new BasicNameValuePair("password", "secret"));
//        httpPost.setEntity(new UrlEncodedFormEntity(nvps));
//        CloseableHttpResponse response2 = httpclient.execute(httpPost);
//
//        try {
//            System.out.println(response2.getStatusLine());
//            HttpEntity entity2 = response2.getEntity();
//            // do something useful with the response body
//            // and ensure it is fully consumed
//            EntityUtils.consume(entity2);
//        } finally {
//            response2.close();
//        }
//    }
}
