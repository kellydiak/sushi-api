package org.ldv.sushiapi.model.entity

import jakarta.persistence.*

@Entity
@Table(name = "boxes")
class Box (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val boxId: Long,

    var nom: String,
    var nbPieces : Int,
    var prix : Double,
    var nom_Image : String,

    // Relation Many2Many des boxes aux saveurs
    @ManyToMany
    @JoinTable(
        name = "saveurs_boxes",
        joinColumns = [JoinColumn(name = "fk_box_id")],
        inverseJoinColumns = [JoinColumn(name = "fk_saveur_id")]
    )
    val saveurs : MutableSet<Saveur>,

    // Relation one2many d'une box à ses aliments
    @OneToMany(mappedBy = "box")
    val alimentBoxes: MutableList<AlimentBox>
){


}