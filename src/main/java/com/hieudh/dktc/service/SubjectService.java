package com.hieudh.dktc.service;

import com.hieudh.dktc.entity.Subject;

import java.util.List;

public interface SubjectService {
    public List<Subject> findSubjectByCode(String maMon);
}