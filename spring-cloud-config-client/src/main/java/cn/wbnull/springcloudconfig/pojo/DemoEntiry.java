package cn.wbnull.springcloudconfig.pojo;

import java.io.Serializable;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DemoEntiry implements Serializable {

    private String version;

    private String profile;

}
