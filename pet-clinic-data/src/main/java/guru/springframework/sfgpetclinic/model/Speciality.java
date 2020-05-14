package guru.springframework.sfgpetclinic.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Table(name = "specialities")
public class Speciality extends BaseEntity{
    @Column(name = "description")
    private String description;
}
