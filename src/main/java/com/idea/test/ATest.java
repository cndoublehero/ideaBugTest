package com.idea.test;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.map.ObjectMapper;
import com.idea.test.Result;

import java.util.List;

public class ATest {
    private final static ObjectMapper INSTANCE = new ObjectMapper();

    public Object loadOrderData(String orderId) {
        try {
            String resultXml = "";
            com.idea.test.Result result = INSTANCE
                    .readValue(resultXml,
                            com.idea.test.Result.class);
            String resultData = result.getData();
            if (StringUtils.isEmpty(resultData)) {
                return null;
            }
            List list = INSTANCE.readValue(resultData,List.class);
            if(CollectionUtils.isEmpty(list)) {
                return null;
            }
           return null;

        } catch (Exception e) {
        }

        return null;
    }

    public Object loadOrderDataFromHB(String orderId) {
        try {
            String resultXml = "";
            com.idea.test.Result result = INSTANCE
                    .readValue(resultXml,
                            com.idea.test.Result.class);
            String resultData = result.getData();
            if (StringUtils.isEmpty(resultData)) {
                return null;
            }
            List list = INSTANCE.readValue(resultData,List.class);
            if(CollectionUtils.isEmpty(list)) {
                return null;
            }
            return null;

        } catch (Exception e) {
        }

        return null;
    }


}
