package com.lagou.edu.mapper;

import com.lagou.edu.pojo.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * \* @Author: ZhuFangTao
 * \* @Date: 2020/5/19 9:37 上午
 * \
 */
public interface ResumeMapper extends JpaRepository<Resume, Long>,
        JpaSpecificationExecutor<Resume> {

}