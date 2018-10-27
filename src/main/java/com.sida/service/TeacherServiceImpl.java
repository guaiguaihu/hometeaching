package com.sida.service;

import com.sida.entity.Teacher;
import com.sida.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service("TeacherService")
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    @Transactional
    public void saveTeacher(Teacher teacher){
        teacherRepository.save(teacher);
    };

    @Override
    @Transactional
    public void updateTeacher(Teacher teacher){

    };
}
