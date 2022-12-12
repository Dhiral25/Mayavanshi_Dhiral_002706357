/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Business.WorkQueue;

import java.util.Date;

/**
 *
 * @author DhiralM
 */
public class CovidCareRequest extends WorkRequest {
    
    
    private Date appointmentDate;
    private Boolean isHealthy;
    private Boolean isCovidVaccinated;

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public Boolean getIsHealthy() {
        return isHealthy;
    }

    public void setIsHealthy(Boolean isHealthy) {
        this.isHealthy = isHealthy;
    }

    public Boolean getIsCovidVaccinated() {
        return isCovidVaccinated;
    }

    public void setIsCovidVaccinated(Boolean isCovidVaccinated) {
        this.isCovidVaccinated = isCovidVaccinated;
    }

}
