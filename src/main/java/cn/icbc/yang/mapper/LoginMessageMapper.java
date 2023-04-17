package cn.icbc.yang.mapper;

import cn.icbc.yang.pojo.StudentMessage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cn.icbc.yang.pojo.LoginMessage;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yangyg
 * @since 2023-02-01
 */
public interface LoginMessageMapper extends BaseMapper<LoginMessage> {
    public List<LoginMessage> findLoginer(String name);
}
