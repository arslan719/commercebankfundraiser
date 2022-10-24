package com.commerce.commercebankfundraiser.UserResouce;

import com.commerce.commercebankfundraiser.model.PaytemInfo;
import com.commerce.commercebankfundraiser.model.User;
import com.commerce.commercebankfundraiser.service.PaytemInfoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/PaytemInfo")
public class PaytemInfoResouce {
    private final PaytemInfoService paytemInfoService;

    public PaytemInfoResouce(PaytemInfoService paytemInfoService) {
        this.paytemInfoService = paytemInfoService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<PaytemInfo>>getPayteminfo(){
        List<PaytemInfo> paytemInfos = paytemInfoService.findAllPaytemInfo();
        return new ResponseEntity<>(paytemInfos, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<PaytemInfo>getPaytemById(@PathVariable("id")Long id)
    {
        PaytemInfo paytemInfo = paytemInfoService.findPaytemInfo(id);
        return new ResponseEntity<>(paytemInfo,HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<PaytemInfo> updatePaytemInfo(@RequestBody PaytemInfo paytemInfo)
    {
        PaytemInfo updatePayteminfo = paytemInfoService.updatePaytemInfo(paytemInfo);
        return new ResponseEntity<>(updatePayteminfo,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?>deletePaytemInfo(@PathVariable("id") Long id)
    {
        paytemInfoService.deletePaytemInfo(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
