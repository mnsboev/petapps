package com.petapps.chat.repository

import com.petapps.chat.entity.Dialog
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DialogRepository: JpaRepository<Dialog, Long>