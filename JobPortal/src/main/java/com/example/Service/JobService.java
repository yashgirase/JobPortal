package com.example.Service;

import com.example.Entity.Job;
import com.example.Entity.JobType;
import com.example.Repository.IJobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {
    @Autowired
    IJobRepository jobRepository;

    // Using crudRepository methods..
    public String postJob(Job job) {
        jobRepository.save(job);
        return "Job saved successfully to the portal..";
    }
    public String postMultipleJobs(List<Job> jobs) {
        jobRepository.saveAll(jobs);
        return "All jobs are successfully uploaded to the portal..";
    }

    public Optional<Job> getJobById(Long jobId) {
        return jobRepository.findById(jobId);
    }

    public Long getCountOfJobsOnPortal() {
        return jobRepository.count();
    }

    public Iterable<Job> getAllJobsOnPortal() {
        return jobRepository.findAll();
    }

    // Using custom finders.
    public List<Job> getJobsByType(JobType jobType) {
        return jobRepository.findByJobType(jobType);
    }

    public List<Job> getJobsByJobTypeAndCompanyName(JobType jobType, String companyName) {
        return jobRepository.findByJobTypeAndCompanyName(jobType , companyName);
    }

    public List<Job> getJobsByJobTypeAndSalaryInDescendingOrder(JobType jobType) {
        return jobRepository.findByJobTypeOrderBySalaryDesc(jobType);
    }

    public List<Job> getJobsByLocation(String location) {
        return jobRepository.findByLocation(location);
    }

    // Using Custom Query
    public List<Job> getAllJobs() {
        return jobRepository.getAllJobs();
    }




    public List<Job> getJobGreaterThanSalary(Double salary) {
        return jobRepository.getJobBySalary(salary);
    }

    public String deleteJob(Long id) {
        jobRepository.deleteJob(id);
        return "Job deleted successfully from portal";
    }
}
