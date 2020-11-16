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

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdPlanTable {

    private Long id;
    private Long userId;
    private Integer planStatus;
    private Date startDate;
    private Date endDate;
}
