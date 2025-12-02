package org.ldv.sushiapi.model.entity

import jakarta.persistence.*
import org.ldv.sushiapi.model.id.AlimentBoxId

@Entity
@Table(name = "aliments_boxes")
class AlimentBox (
    @EmbeddedId
    val alimentBoxId : AlimentBoxId,

    @ManyToOne
    @MapsId("boxId") // On indique l'attribut correspondant à aliment BOx iD
    @JoinColumn(name = "fk_box_id")
    val box: Box,

    @ManyToOne
    @MapsId("alimentId")
    @JoinColumn(name="fk_aliment_id")
    val aliment: Aliment,

    val quantite : Int) {

}
