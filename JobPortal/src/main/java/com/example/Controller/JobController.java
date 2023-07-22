package com.example.Controller;

import com.example.Entity.Job;
import com.example.Entity.JobType;
import com.example.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class JobController {
    @Autowired
    JobService jobService;

// Using crudRepository methods..
    @PostMapping("job")
    public String postJob(@RequestBody Job job){
        return jobService.postJob(job);
    }
    @PostMapping("jobs")
    public String postMultipleJobs(@RequestBody  List<Job> jobs){
        return jobService.postMultipleJobs(jobs);
    }
    @GetMapping("job/jobId/{jobId}")
    public Optional<Job> getJobById(@PathVariable Long jobId){
       return jobService.getJobById(jobId);
    }
    @GetMapping("jobs/count")
    public Long getCountOfJobsOnPortal(){
      return jobService.getCountOfJobsOnPortal();
    }
    @GetMapping("jobs")
    public Iterable<Job> getAllJobsOnPortal(){
       return jobService.getAllJobsOnPortal();
    }

    // Using custom finders..
    @GetMapping("jobs/jobType/{jobType}")
    public List<Job> getJobsByType(@PathVariable JobType jobType){
        return jobService.getJobsByType(jobType);
    }
    @GetMapping("jobs/jobType/{jobType}/companyName/{companyName}")
    public List<Job> getJobsByJobTypeAndCompanyName(@PathVariable JobType jobType , @PathVariable String companyName){
        return jobService.getJobsByJobTypeAndCompanyName(jobType , companyName);
    }
    @GetMapping("jobs/jobType/{jobType}/salary/descendingOrder")
    public List<Job> getJobsByJobTypeAndSalaryInDescendingOrder(@PathVariable JobType jobType){
         return jobService.getJobsByJobTypeAndSalaryInDescendingOrder(jobType);
    }

    @GetMapping("jobs/location/{location}")
    public List<Job> getJobsByLocation(@PathVariable String location){
        return jobService.getJobsByLocation(location);
    }

    // Using Custom Query

    @GetMapping("jobs/portal")
    public List<Job> getAllJobs(){
        return jobService.getAllJobs();
    }

//    @PutMapping("job/location/{location}/jobId/{id}")
//    public void updateLocation( String location , Long id ){
//        jobService.updateLocation(location , id);
//    }
    @GetMapping("job/salary/{salary}")
    public List<Job> getJobGreaterThanSalary(@PathVariable Double salary){
        return jobService.getJobGreaterThanSalary(salary);
    }

    @DeleteMapping("job/id/{id}")
    public String deleteJob(@PathVariable Long id){
        return jobService.deleteJob(id);
    }

}
