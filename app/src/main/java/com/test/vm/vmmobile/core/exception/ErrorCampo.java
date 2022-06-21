package com.test.vm.vmmobile.core.exception;

public class ErrorCampo {

    private String objectName;
    private String field;
    private String message;

    @Override
    public String toString() {
        return "ErrorCampo{" +
                "objectName='" + objectName + '\'' +
                ", field='" + field + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
