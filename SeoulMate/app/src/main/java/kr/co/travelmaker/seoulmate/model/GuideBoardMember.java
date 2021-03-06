package kr.co.travelmaker.seoulmate.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class GuideBoardMember {
    private GuideMemberLicense guideMemberLicense;
    private GuideBoard guideBoard;
}