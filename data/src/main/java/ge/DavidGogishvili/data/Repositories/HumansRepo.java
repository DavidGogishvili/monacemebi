package ge.DavidGogishvili.data.Repositories;

import ge.DavidGogishvili.data.Entities.Humans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HumansRepo extends JpaRepository <Humans, Integer> {

    @Query("SELECT h FROM Humans h WHERE " +
            "(:name IS NULL OR h.name LIKE %:name%) AND " +
            "(:age IS NULL OR h.age = :age) AND " +
            "(:gender IS NULL OR h.gender LIKE %:gender%) AND " +
            "(:familyName IS NULL OR h.familyName LIKE %:familyName%)")
    List<Humans> findHumansByCriteria(@Param("name") String name,
                                      @Param("age") Integer age,
                                      @Param("gender") String gender,
                                      @Param("familyName") String familyName);
}
