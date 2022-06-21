package com.test.vm.vmmobile.core.exception;

import java.util.Arrays;
import java.util.List;

public class ErrorResponse {

    private String mensaje = "Ocurrio un error desconocido.";
    private String[] parametros;
    private List<ErrorCampo> errorCampo;

    public ErrorResponse() {
    }

    public ErrorResponse(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "ErrorResponse{" +
                "mensaje='" + mensaje + '\'' +
                ", parametros=" + Arrays.toString(parametros) +
                ", errorCampo=" + errorCampo +
                '}';
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String[] getParametros() {
        return parametros;
    }

    public void setParametros(String[] parametros) {
        this.parametros = parametros;
    }

    public List<ErrorCampo> getErrorCampo() {
        return errorCampo;
    }

    public void setErrorCampo(List<ErrorCampo> errorCampo) {
        this.errorCampo = errorCampo;
    }
}
