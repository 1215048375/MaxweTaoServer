package org.maxwe.tao.server.service.account.user;

import org.maxwe.tao.server.service.history.HistoryEntity;

import java.util.LinkedList;

/**
 * Created by Pengwei Ding on 2017-01-09 14:09.
 * Email: www.dingpengwei@foxmail.com www.dingpegnwei@gmail.com
 * Description: @TODO
 */
public interface IUserServices {
    /**
     * 创建用户
     *
     * @param userEntity 用户对象
     * @return null if false
     */
    UserEntity create(UserEntity userEntity);

    /**
     * 更新密码
     *
     * @param userEntity 用户对象
     * @return
     */
    UserEntity updatePassword(UserEntity userEntity);

    /**
     * 使用激活码激活时候更新授权码出售方的历史
     * @param userEntity
     * @return
     */
    boolean updateActiveStatus(UserEntity userEntity,HistoryEntity historyEntity);

    /**
     * 通过业务ID查找
     *
     * @param id 业务ID
     * @return
     */
    UserEntity retrieveById(int id);

    /**
     * 通过手机号码查找
     *
     * @param cellphone 手机号码
     * @return
     */
    UserEntity retrieveByCellphone(String cellphone);

    /**
     * 通过授权人查找
     *
     * @param masterId 授权人的ID
     * @return
     */
    LinkedList<UserEntity> retrieveByMaster(String masterId);

    /**
     * 供管理端查询所有
     * @param pageIndex
     * @param pageSize
     * @return
     */
    LinkedList<UserEntity> retrieveAll(int pageIndex,int pageSize);
    int retrieveAllSum();
}
