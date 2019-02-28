package com.sylaDiaguily.springBatch.handleJob;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.stereotype.Component;

import javax.batch.runtime.JobExecution;

import static javax.batch.runtime.BatchStatus.COMPLETED;
import static org.springframework.batch.core.BatchStatus.STARTED;
import static org.springframework.batch.core.BatchStatus.STARTING;

@Component
public class InterceptingJobExecutionImlp implements JobExecutionListener {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    /**
     * Callback before a job executes.
     *
     * @param jobExecution the current {@link JobExecution}
     */
    @Override
    public void beforeJob(org.springframework.batch.core.JobExecution jobExecution) {
        if (jobExecution.getStatus().equals(STARTING)) {
            System.out.println("STARTING job");
            logger.info("STARTING job");
        }
        if (jobExecution.getStatus().equals(STARTED)) {
            System.out.println("STARTED job");
            logger.info("STARTED job");

        }
        if (jobExecution.getStatus().equals(COMPLETED)) {
            System.out.println("COMPLETED job");
            logger.info("COMPLETED job");
        }
    }

    /**
     * Callback after completion of a job. Called after both both successful and
     * failed executions. To perform logic on a particular status, use
     * "if (jobExecution.getStatus() == BatchStatus.X)".
     *
     * @param jobExecution the current {@link JobExecution}
     */
    @Override
    public void afterJob(org.springframework.batch.core.JobExecution jobExecution) {
        if (jobExecution.equals(COMPLETED)) {
            System.out.println("COMPLETED job");

        }
    }
}