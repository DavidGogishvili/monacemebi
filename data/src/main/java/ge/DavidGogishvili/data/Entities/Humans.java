package ge.DavidGogishvili.data.Entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@Table(schema = "public", name = "humans")
public class Humans  {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "humans_id_seq-generator")
    @SequenceGenerator(name = "humans_id_seq-generator", sequenceName = "humans_id_seq", allocationSize = 1)
    @Id
    private Integer id;

    @Column(name = "gender")
    private String gender;

    @Column(name = "name")
    private String name;

    @Column(name = "family_name")
    private String familyName;

    @Column(name = "age")
    private Integer age;
}