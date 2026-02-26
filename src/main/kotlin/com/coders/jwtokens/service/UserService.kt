package com.coders.jwtokens.service;

import com.coders.jwtokens.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService (
    private val userRepository :UserRepository
){

}
