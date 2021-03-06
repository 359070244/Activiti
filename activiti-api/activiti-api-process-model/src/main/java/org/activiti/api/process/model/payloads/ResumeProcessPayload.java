package org.activiti.api.process.model.payloads;

import java.util.UUID;

import org.activiti.api.model.shared.Payload;

public class ResumeProcessPayload implements Payload {

    private String id;
    private String processInstanceId;

    public ResumeProcessPayload() {
        this.id = UUID.randomUUID().toString();
    }

    @Override
    public String getId() {
        return id;
    }

    public ResumeProcessPayload(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }
}
