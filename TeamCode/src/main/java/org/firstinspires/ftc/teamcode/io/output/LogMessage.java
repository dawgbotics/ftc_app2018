package org.firstinspires.ftc.teamcode.io.output;

public class LogMessage {

    public enum Priority {DEBUG, INFO, WARN, ERROR, FATAL}

    private Priority priority;
    private String message;
    private long timeStamp;

    public LogMessage(Priority priority, String message) {
        this.priority = priority;
        this.message = message;
        this.timeStamp = System.currentTimeMillis() / (long) 1000;
    }

    @Override
    public String toString() {
        return "(" + timeStamp + ") " + priority.name() + ": " + message;
    }
}
