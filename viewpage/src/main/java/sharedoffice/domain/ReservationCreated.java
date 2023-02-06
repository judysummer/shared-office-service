package sharedoffice.domain;

import sharedoffice.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class ReservationCreated extends AbstractEvent {

    private Long rsvId;
    private String officeId;
    private String status;
    private String payId;
}
