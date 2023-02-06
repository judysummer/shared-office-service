package untitled.domain;

import untitled.domain.*;
import untitled.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OfficDeleted extends AbstractEvent {

    private Long officeId;
    private String status;
    private String desc;
    private String reviewCnt;
    private String lastAction;

    public OfficDeleted(Office aggregate){
        super(aggregate);
    }
    public OfficDeleted(){
        super();
    }
}