package org.maxwe.tao.server.controller.account.agent;


import org.maxwe.tao.server.controller.account.IAccountController;

/**
 * Created by Pengwei Ding on 2017-01-09 14:12.
 * Email: www.dingpengwei@foxmail.com www.dingpegnwei@gmail.com
 * Description:
 */
public interface IAgentController extends IAccountController {

    /**
     * 更新支付宝账户
     */
    void bank();

}
