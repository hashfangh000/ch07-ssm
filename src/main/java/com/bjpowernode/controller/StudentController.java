package com.bjpowernode.controller;

import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/student")
public class StudentController {
    @Resource
    private StudentService service;
    //���ע��ѧ��
    @RequestMapping(value = "/addStudent.do")
    public ModelAndView addStudent(Student student){
        ModelAndView mv = new ModelAndView();
        String tips = "ע��ʧ��";
        //����service����student
        int nums = service.addStudent(student);
        if(nums > 0){
            //ע��ɹ�
            tips = "ѧ����" + student.getName() + "��ע��ɹ�";
        }
        //�������
        mv.addObject("tips" ,tips);
        //ָ�����ҳ��
        mv.setViewName("result");
        return mv;
    }
}//52
