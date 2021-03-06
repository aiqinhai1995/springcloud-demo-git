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
public class AdCreativeTable {

    private Long adId;
    private String name;
    private Integer type;
    private Integer materialType;
    private Integer height;
    private Integer width;
    private Integer auditStatus;
    private String adUrl;
}
