package org.ldv.sushiapi.model.entity

import jakarta.persistence.*

@Entity
@Table(name = "aliments")
class Aliment (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val alimentId: Long,

    val nom: String,

    @OneToMany(mappedBy = "aliment") // aliment est attribut d'alimentBox
    val alimentBoxes: MutableList<AlimentBox>
){
}