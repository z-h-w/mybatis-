package twm.mybatisdemo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import twm.mybatisdemo.pojo.EtcCarInfo;
import twm.mybatisdemo.pojo.EtcCarInfoExample;

public interface EtcCarInfoMapper {
    int countByExample(EtcCarInfoExample example);

    int deleteByExample(EtcCarInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(EtcCarInfo record);

    int insertSelective(EtcCarInfo record);

    List<EtcCarInfo> selectByExample(EtcCarInfoExample example);

    EtcCarInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EtcCarInfo record, @Param("example") EtcCarInfoExample example);

    int updateByExample(@Param("record") EtcCarInfo record, @Param("example") EtcCarInfoExample example);

    int updateByPrimaryKeySelective(EtcCarInfo record);

    int updateByPrimaryKey(EtcCarInfo record);
}