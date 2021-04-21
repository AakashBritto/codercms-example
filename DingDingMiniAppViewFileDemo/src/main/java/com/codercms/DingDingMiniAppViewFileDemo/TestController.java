package com.codercms.DingDingMiniAppViewFileDemo;

import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiCspaceGetCustomSpaceRequest;
import com.dingtalk.api.request.OapiGettokenRequest;
import com.dingtalk.api.response.OapiCspaceGetCustomSpaceResponse;
import com.dingtalk.api.response.OapiGettokenResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * https://blog.csdn.net/Poison_AS/article/details/115322142
 */
@RestController
public class TestController {

    @Value("${appsecret}")
    public String appsecret;

    @Value("${appkey}")
    public String appkey;

    @Value("${agentId}")
    public String agentId;

    @Value("${domain}")
    public String domain;

    @PostMapping("/get-access-token")
    public String getAccessToken(){
        String result = "";

        try {
            DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/gettoken");
            OapiGettokenRequest request = new OapiGettokenRequest();

            System.out.println("appkey: " + appkey + "; appsecret: " + appsecret);

            request.setAppkey(appkey);
            request.setAppsecret(appsecret);
            request.setHttpMethod("GET");
            OapiGettokenResponse response = client.execute(request);

            System.out.println(response.getBody());

            result = response.getAccessToken();
        } catch (Exception ex) {

        }

        return result;
    }

    @PostMapping("/get-dingpan-space-id")
    public String getDingPanSpaceId() {
        String access_token = getAccessToken();

        String result = "";

        System.out.println("agentId: " + agentId + " domain: " + domain);

        try {
            DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/cspace/get_custom_space");
            OapiCspaceGetCustomSpaceRequest req = new OapiCspaceGetCustomSpaceRequest();
            req.setDomain(domain);
            req.setAgentId(agentId);
            req.setHttpMethod("GET");
            OapiCspaceGetCustomSpaceResponse rsp = client.execute(req, access_token);
            System.out.println(rsp.getBody());

            result = rsp.getSpaceid();
        } catch (Exception ex){

        }

        return result;
    }
}
