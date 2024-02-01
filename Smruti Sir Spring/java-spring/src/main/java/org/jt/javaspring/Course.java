package org.jt.javaspring;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Course {

    private String slNo;
    private String coursename;
    private String duration;
    private String fee;
}
