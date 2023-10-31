package cn.company.dao;

import cn.company.domain.Emps;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmpsDao {

    //查询表中所有的数据
    @Select("select DEPTNO,DNAME,LOC from  dept")
    public List<Emps> findAll();

    @Update("update dept set DNAME = qw where DEPTNO = #{DEPTNO}")
    public void update(@Param("DEPTNO") int DEPTNO);

    


}
