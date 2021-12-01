package hu.cib.feladat1;

import lombok.Data;
import lombok.NonNull;

import java.time.LocalDate;

@Data
public class XItem {

    @NonNull
    String id;
    @NonNull
    LocalDate from;
    @NonNull
    LocalDate to;

    String configValue;

}
