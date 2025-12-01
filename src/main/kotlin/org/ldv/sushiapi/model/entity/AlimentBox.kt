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
    val box: Box,

    @ManyToOne

){
}