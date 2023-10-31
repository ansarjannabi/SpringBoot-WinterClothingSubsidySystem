package cn.company.service;

import cn.company.dao.EmpsDao;
import cn.company.domain.Emps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpsService {
    @Autowired
    private EmpsDao empsDao;

    public List<Emps> findAll(){
        return empsDao.findAll();
    }
}
