package com.example.onlineshopping.service;

import com.example.onlineshopping.domain.Role;
import com.example.onlineshopping.domain.User;
import com.example.onlineshopping.dto.CustomerDto;
import com.example.onlineshopping.globalExecption.UserNotFoundException;
import org.modelmapper.ModelMapper;
import com.example.onlineshopping.dto.UserDto;
import com.example.onlineshopping.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service @RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    public UserDto findById(long id){
        User user = userRepository.findById(id).orElse(null);
        if(user == null) {
            throw new UserNotFoundException("User id-" + id+ " not found");
        }
        return modelMapper.map(user, UserDto.class);
    }

    public UserDto createUser(UserDto userDto){
        return modelMapper.map(userRepository.save(modelMapper.map(userDto, User.class)), UserDto.class);
    }

//    public UserDto createCustomer(CustomerDto customerDto){
//        User user = customerDto.getUser();
//        user.setRole(new Role("CUSTOMER"));
//        user = userRepository.save(user);
//        customerDto.setUser(user);
////        customerRepository.save(modelMapper.map(customerDto, Customer.class));
//        return modelMapper.map(user, UserDto.class);
//    }

    public void deleteUser(UserDto userDto){
        userRepository.delete(modelMapper.map(userDto, User.class));
    }

    public void deleteUserById(long id){
        userRepository.deleteById(id);
    }

    public UserDto updateUser(long id, UserDto userDto){
        Boolean exists = userRepository.existsById(id);
        if(!exists)
            throw new UserNotFoundException("id-"+id);
        User u = modelMapper.map(userDto, User.class);
        u.setId(id);
        return modelMapper.map(userRepository.save(u), UserDto.class);
    }
}
