package lingutechies.vnlawadvisor.lawservice.PDTable;

import lingutechies.vnlawadvisor.lawservice.PDFile.DTO.PureFileProjection;
import lingutechies.vnlawadvisor.lawservice.PDTable.DTO.PureTableProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PDTableRepository extends JpaRepository<PDTable, Long> {
    @Query("SELECT new lingutechies.vnlawadvisor.lawservice.PDTable.DTO.PureTableProjection(t.id, t.html) " +
            "FROM PDTable t WHERE t.bangOfDieu.mapc = ?1 ")
    List<PureTableProjection> findAllByBangOfDieuMapc(String dieuMapc);
}
