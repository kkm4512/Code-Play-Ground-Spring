package org.terror.codeplaygroundspring.responseApI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/tests")
    public ResponseEntity<BaseResponse> test() {
        Object[] datas = new Object[10];
        for ( int i=0; i<10; i++ ) {
            datas[i] = "테스트용 데이터들 " + i;
        }
        ResponseStatus responseStatus = ResponseStatus.SUCCESS;
        BaseResponse baseResponse = new BaseResponse(responseStatus,datas);
        String grp_cd;
        return ResponseEntity.status(responseStatus.getStatus().value()).body(baseResponse);

    }
}
