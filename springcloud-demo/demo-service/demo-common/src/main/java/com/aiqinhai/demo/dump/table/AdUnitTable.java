/**
 * @author ：yz
 * @date ：Created in 2020/3/15 15:58
 * @description：
 * @modified By：
 * @version: $
 */
package com.aiqinhai.demo.dump.table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdUnitTable {

    private Long unitId;
    private Integer unitStatus;
    private Integer positionType;

    private Long planId;
}
