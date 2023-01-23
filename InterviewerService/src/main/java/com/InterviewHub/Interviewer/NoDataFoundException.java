package com.InterviewHub.Interviewer;

public class NoDataFoundException extends Exception {
    public NoDataFoundException(String no_such_data_found) {
        super(no_such_data_found);
    }
}
