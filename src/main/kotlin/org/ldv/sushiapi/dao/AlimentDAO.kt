package org.ldv.sushiapi.dao

import  org.ldv.sushiapi.model.entity.Aliment
import org.springframework.data.jpa.repository.JpaRepository
interface AlimentDAO : JpaRepository<Aliment, Long>{
}