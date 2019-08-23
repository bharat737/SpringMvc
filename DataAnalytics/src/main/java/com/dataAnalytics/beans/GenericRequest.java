
package com.dataAnalytics.beans;

import java.io.Serializable;

public class GenericRequest<DATA> implements Serializable {

    private DATA data;
    private String serviceId;

    public DATA getData() {
        return data;
    }

    public void setData(DATA data) {
        this.data = data;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

}
