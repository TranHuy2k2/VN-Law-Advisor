package lingutechies.vnlawadvisor.lawservice.ChiMucVBPL;

import jakarta.persistence.*;
import lingutechies.vnlawadvisor.lawservice.VBPL.VBPL;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@Entity
@Table(name="vb_chimuc")
@NoArgsConstructor
public class ChiMucVBPL {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="noi_dung", columnDefinition = "TEXT", nullable = false)
    private String noidung;

    @Column(name="loai", nullable = false)
    private String loai;

    @Column(nullable = false)
    private String ten;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chi_muc_cha")
    private ChiMucVBPL chiMucCha;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_vb")
    private VBPL vbpl;

}
