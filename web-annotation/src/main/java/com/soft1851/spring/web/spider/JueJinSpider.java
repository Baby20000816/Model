package com.soft1851.spring.web.spider;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.soft1851.spring.web.entiy.Topic;
import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author jh_wu
 * @ClassName JueJinSpider
 * @Description TODO
 * @Date 2020/3/27:23:54
 * @Version 1.0
 **/
public class JueJinSpider {
    private static final Integer SUCCESS =200;
    public static List<Topic> getTopics() throws IOException {
        List<Topic> topics = new ArrayList<>();
        String url = "https://short-msg-ms.juejin.im/v1/topicList?uid=5e7e2119e51d45470b4fcc97&device_id=1585324313494&token=eyJhY2Nlc3NfdG9rZW4iOiJHSlV2c0pGM1JGODcwOWFEIiwicmVmcmVzaF90b2tlbiI6IjVtd250MkJmV1hRSk1DRjYiLCJ0b2tlbl90eXBlIjoibWFjIiwiZXhwaXJlX2luIjoyNTkyMDAwfQ%3D%3D&src=web&sortType=hot&page=0&pageSize=100";
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet get = new HttpGet(url);
        HttpClientContext context = HttpClientContext.create();
        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute(get,context);
        }catch (IOException e){
            e.printStackTrace();
        }
        if (response.getStatusLine().getStatusCode()==SUCCESS){
            HttpEntity entity = response.getEntity();
            String res = null;
            try {
                res= EntityUtils.toString(entity,"UTF-8");
            }catch (IOException e){
                e.printStackTrace();
            }
            JSONObject jsonObject = JSONObject.parseObject(res);
            JSONArray list = jsonObject.getJSONObject("d").getJSONArray("list");
            list.forEach(o -> {
                JSONObject json=JSONObject.parseObject(o.toString());
                Topic topic = Topic.builder()
                        .id(json.getString("objectId"))
                        .topicName(json.getString("title"))
                        .topicIcon(json.getString("icon"))
                        .description(json.getString("description"))
                        .msgCount(json.getInteger("msgsCount"))
                        .followsCount(json.getInteger("followersCount"))
                        .followed(json.getBoolean("followed"))
                        .build();
                topics.add(topic);
            });
        }
        else {
            System.out.println("失败");
        }
        try {
            response.close();
            httpClient.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        return topics;
    }

    public static void main(String[] args) throws IOException{
        System.out.println(getTopics());
    }
}
