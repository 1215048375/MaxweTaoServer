package org.maxwe.tao.server.controller.history.model;

import java.util.List;

/**
 * Created by Pengwei Ding on 2017-03-04 21:32.
 * Email: www.dingpengwei@foxmail.com www.dingpegnwei@gmail.com
 * Description: 代理返点请求模型
 */
public class RebateResponseModel extends RebateRequestModel {
    private List<RebateModel> rebates;

    public RebateResponseModel() {
        super();
    }

    public RebateResponseModel(List<RebateModel> rebates) {
        this.rebates = rebates;
    }

    public List<RebateModel> getRebates() {
        return rebates;
    }

    public void setRebates(List<RebateModel> rebates) {
        this.rebates = rebates;
    }
}
