package com.lagou.edu.service.impl;

import com.lagou.edu.mapper.ResumeMapper;
import com.lagou.edu.pojo.Resume;
import com.lagou.edu.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * \* @Author: ZhuFangTao
 * \* @Date: 2020/5/19 9:34 上午
 * \
 */
@Service("resumeService")
public class ResumeServiceImpl implements ResumeService {

    @Autowired
    private ResumeMapper resumeMapper;

    @Override
    public Resume queryById(long id) {
        Optional<Resume> resume = resumeMapper.findById(id);
        return resume.isPresent() ? resume.get() : null;
    }

    @Override
    public List<Resume> queryAll() {
        return resumeMapper.findAll();
    }

    @Override
    public Resume save(Resume resume) {
        return resumeMapper.save(resume);
    }

    @Override
    public void delete(long id) {
        resumeMapper.deleteById(id);
    }
}