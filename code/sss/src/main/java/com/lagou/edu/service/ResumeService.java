package com.lagou.edu.service;

import com.lagou.edu.pojo.Resume;

import java.util.List;

/**
 * \* @Author: ZhuFangTao
 * \* @Date: 2020/5/19 9:34 上午
 * \
 */
public interface ResumeService {

    Resume queryById(long id);

    List<Resume> queryAll();

    Resume save(Resume resume);

    void delete(long id);
}