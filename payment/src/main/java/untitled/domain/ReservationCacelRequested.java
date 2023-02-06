package untitled.domain;

import untitled.domain.*;
import untitled.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class ReservationCacelRequested extends AbstractEvent {

    private Long rsvId;
    private String officeId;
    private String status;
    private String payId;
}

