package com.example.springapp.service;

import com.example.springapp.entity.Agriculture;

public interface AgricultureService {

    Agriculture getAgricultureById(Long id);

    Agriculture getAgricultureByEmail(String email);

    Agriculture createAgriculture(Agriculture agriculture);
}
