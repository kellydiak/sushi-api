package org.ldv.sushiapi.model.entity

import jakarta.persistence.*

@Entity
@Table(name = "saveurs")
class Saveur (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val saveurId: Long,

    var nom: String,

    // La relation many2many est généré par la classe Box l'attribut saveurs
    @ManyToMany(mappedBy = "saveurs")
    val boxes: MutableSet<Box>
){
}