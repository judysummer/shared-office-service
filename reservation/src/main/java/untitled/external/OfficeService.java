package untitled.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;


@FeignClient(name = "Office", url = "${api.url.Office}")
public interface OfficeService {
    @RequestMapping(method= RequestMethod.POST, path="/offices")
    public void chkAndReqReserve(@RequestBody Office office);
}
