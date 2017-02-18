package org.maxwe.tao.server.service.tao.goods;

import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import org.maxwe.tao.server.ApplicationConfigure;
import org.maxwe.tao.server.service.tao.APIConstants;

/**
 * Created by Pengwei Ding on 2017-01-18 14:54.
 * Email: www.dingpengwei@foxmail.com www.dingpegnwei@gmail.com
 * Description: @TODO
 */
public class GoodsServices {

    public static void requestCategory() throws Exception {
        CategoryRequestModel categoryRequestModel = new CategoryRequestModel();
        categoryRequestModel.setMethodName("taobao.itemcats.get");
        categoryRequestModel.setFields("cid,parent_cid,name,is_parent");
        categoryRequestModel.setParent_cid(0);
        TaobaoClient taoBaoClient = APIConstants.getTaoBaoClient();
        GoodsResponseModel execute = taoBaoClient.execute(categoryRequestModel);
        System.out.println(execute.getBody());
    }

    public static void requestGoods() throws Exception {
        GoodsRequestModel goodsRequestModel = new GoodsRequestModel();
//        goodsRequestModel.setMethodName("taobao.tbk.item.get");
//        goodsRequestModel.setFields("nick");
//        goodsRequestModel.setQ("女装");
//        goodsRequestModel.setCat("16");
//        goodsRequestModel.setItemloc("杭州");
//        goodsRequestModel.setSort("tk_rate_des");
//        goodsRequestModel.setIs_tmall(false);
//        goodsRequestModel.setIs_overseas(false);
//        goodsRequestModel.setStart_price(0000);
//        goodsRequestModel.setEnd_price(9999);
//        goodsRequestModel.setStart_tk_rate(0000);
//        goodsRequestModel.setEnd_tk_rate(9999);
//        goodsRequestModel.setPlatform(2);
//        goodsRequestModel.setPage_no(1);
//        goodsRequestModel.setPage_size(20);
        TaobaoClient taoBaoClient = new DefaultTaobaoClient(APIConstants.URL_FORMAL, ApplicationConfigure.APP_KEY, ApplicationConfigure.APP_SECRET);
        GoodsResponseModel execute = taoBaoClient.execute(goodsRequestModel);
        System.out.println(execute.getBody());
    }

    public static void requestTaoPwd() throws Exception {

    }

    public static void main(String[] args) throws Exception {
        requestTaoPwd();
    }
}