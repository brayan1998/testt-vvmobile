package com.test.vm.vmmobile.consultas.model.remote.response;

import com.test.vm.vmmobile.consultas.util.Pais;

import java.io.Serializable;
import java.util.List;

public class ConsultaPaisAllResponse implements Serializable {

    private Pais pais;

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
