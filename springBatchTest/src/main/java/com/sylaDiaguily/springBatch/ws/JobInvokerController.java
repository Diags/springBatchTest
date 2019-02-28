package com.sylaDiaguily.springBatch.ws;

import com.sylaDiaguily.springBatch.model.User;
import com.sylaDiaguily.springBatch.repository.UserRepository;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.Base64;

@RestController
@CrossOrigin
public class JobInvokerController {
    @Autowired
    JobLauncher jobLauncher;

    @Autowired
    Job job;
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/invokejob")
    public String handle() throws Exception {
        perform();
        return "Batch job has been invoked";

    }

    @Scheduled(cron = "0 */1 * * * ?")
    public void perform() throws Exception {
        JobParameters params = new JobParametersBuilder()
                .addString("JobID", String.valueOf(System.currentTimeMillis()))
                .toJobParameters();
        jobLauncher.run(job, params);
    }

    //    @GetMapping("/login")
//    @ResponseBody
//    public boolean login() {
//        return userRepository.findAll().stream().filter(user -> "user".equals(user.getName()) && "password".equals(user.getPasseWord())).findFirst() != null;
//    }
    @RequestMapping(value = "/user")
    public String user() {
        return "user";
    }

    @RequestMapping(value = "/admin")
    public String admin() {
        return "admin";
    }

    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }
}
