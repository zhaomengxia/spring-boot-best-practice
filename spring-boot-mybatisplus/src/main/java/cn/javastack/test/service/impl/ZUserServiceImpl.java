package cn.javastack.test.service.impl;

import cn.javastack.test.entity.ZUser;
import cn.javastack.test.mapper.ZUserMapper;
import cn.javastack.test.service.IZUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-03-06
 */
@Service
public class ZUserServiceImpl extends ServiceImpl<ZUserMapper, ZUser> implements IZUserService {

}
