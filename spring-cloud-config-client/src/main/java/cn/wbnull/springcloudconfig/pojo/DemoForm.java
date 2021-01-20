package cn.wbnull.springcloudconfig.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DemoForm  implements Serializable {
    private String name;
    private int age;
}
