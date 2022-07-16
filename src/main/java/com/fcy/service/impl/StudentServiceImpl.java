package com.fcy.service.impl;

import com.fcy.pojo.Student;
import com.fcy.mapper.StudentMapper;
import com.fcy.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fcy
 * @since 2022-07-17
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}
