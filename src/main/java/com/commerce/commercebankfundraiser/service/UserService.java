package com.commerce.commercebankfundraiser.service;

import com.commerce.commercebankfundraiser.exception.UserNotFoundException;
import com.commerce.commercebankfundraiser.model.User;
import com.commerce.commercebankfundraiser.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepo useRepo;

    @Autowired
    public UserService(UserRepo useRepo) {
        this.useRepo = useRepo;
    }
   public List<User> findAllUser()
   {
      return useRepo.findAll();
   }
   public User updateUser(User user) {
       return useRepo.save(user);
   }
   public User findUser(Long Id)
   {
       return useRepo.findUserById(Id).orElseThrow(()-> new UserNotFoundException("User by id"+ Id +"was not found"));
   }
   public void deleteUser(Long id)
   {
       useRepo.deleteUserById(id);
   }

}
