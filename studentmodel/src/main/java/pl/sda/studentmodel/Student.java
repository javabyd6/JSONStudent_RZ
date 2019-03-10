package pl.sda.studentmodel;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Remigiusz Zudzin
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    String name;
    String lastname;
    Integer index;

}
