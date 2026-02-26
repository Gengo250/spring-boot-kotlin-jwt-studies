package com.coders.jwtokens.service;

import com.coders.jwtokens.model.User
import com.coders.jwtokens.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.UUID

@Service
public class UserService (
    private val userRepository :UserRepository
){
    fun createUser(user : User): User? {
        val found = userRepository.findByEmail(user.email)
        return if(found == null){
            userRepository.save(user)
            user
        } else null
    }

    fun findByUUID(uuid: UUID) : User? =
        userRepository.findByUUID(uuid)
    fun findByAll() : List<User> =
        userRepository.findAll()
    fun deleteByUUID(uuid: UUID): Boolean =
        userRepository.deleteByUUID(uuid)


}
