package com.commerce.commercebankfundraiser.service;

import com.commerce.commercebankfundraiser.exception.UserNotFoundException;
import com.commerce.commercebankfundraiser.model.PaytemInfo;
import com.commerce.commercebankfundraiser.repo.PaytemInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.List;

@Service
public class PaytemInfoService {
    private final PaytemInfoRepo paytemInfoRepo;

    @Autowired
    public PaytemInfoService(PaytemInfoRepo paytemInfoRepo) {
        this.paytemInfoRepo = paytemInfoRepo;
    }
    public List<PaytemInfo> findAllPaytemInfo()
    {
        return paytemInfoRepo.findAll();
    }
    public PaytemInfo updatePaytemInfo(PaytemInfo paytemInfo)
    {
        return paytemInfoRepo.save(paytemInfo);
    }
    public PaytemInfo findPaytemInfo(Long ID)
    {
        return paytemInfoRepo.findById(ID).orElseThrow(()->new UserNotFoundException("User by ID"+ ID + "was not found"));
    }
    public void deletePaytemInfo(Long id)
    {
        paytemInfoRepo.deletePaytemInfoById(id);
    }
}
