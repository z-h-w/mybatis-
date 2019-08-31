package twm.mybatisdemo.mapper;

import twm.mybatisdemo.pojo.EtcCustomer;

public interface EtcCustomerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EtcCustomer record);

    int insertSelective(EtcCustomer record);

    EtcCustomer selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EtcCustomer record);

    int updateByPrimaryKey(EtcCustomer record);
}