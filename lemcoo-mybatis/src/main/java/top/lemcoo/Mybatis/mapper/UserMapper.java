package top.lemcoo.Mybatis.mapper;

import org.springframework.stereotype.Repository;
import top.lemcoo.Mybatis.beans.User;

import java.util.List;

//@Mapper
@Repository
public interface UserMapper {

    List<User> getUserList();
}
