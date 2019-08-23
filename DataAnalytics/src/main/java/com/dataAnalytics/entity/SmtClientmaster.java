///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.clover.smt.entity;
//
//import java.io.Serializable;
//import java.util.Date;
//import java.util.List;
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
//
///**
// *
// * @author cloveruser
// */
//@Entity
//@Table(name = "smt_clientmaster")
//@NamedQueries({
//    @NamedQuery(name = "SmtClientmaster.findAll", query = "SELECT s FROM SmtClientmaster s")})
//public class SmtClientmaster implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Basic(optional = false)
//    @Column(name = "Client_ID")
//    private Integer clientID;
//    @Size(max = 10)
//    @Column(name = "Client_UniqueId")
//    private String clientUniqueId;
//    @Size(max = 40)
//    @Column(name = "Client_Name")
//    private String clientName;
//    @Size(max = 200)
//    @Column(name = "Client_Address_corporate")
//    private String clientAddresscorporate;
//    @Size(max = 20)
//    @Column(name = "Client_Business_Domain")
//    private String clientBusinessDomain;
//    @Size(max = 20)
//    @Column(name = "Client_Owner_Delivery")
//    private String clientOwnerDelivery;
//    @Size(max = 20)
//    @Column(name = "KAM")
//    private String kam;
//    @Size(max = 20)
//    @Column(name = "Sales_Owner1")
//    private String salesOwner1;
//    @Size(max = 20)
//    @Column(name = "Sales_Owner2")
//    private String salesOwner2;
//    @Size(max = 20)
//    @Column(name = "Sales_Owner3")
//    private String salesOwner3;
//    @Size(max = 20)
//    @Column(name = "CIO_Name")
//    private String cIOName;
//    @Size(max = 50)
//    @Column(name = "CIO_Email")
//    private String cIOEmail;
//    @Size(max = 20)
//    @Column(name = "CTO_Name")
//    private String cTOName;
//    @Size(max = 50)
//    @Column(name = "CTO_Email")
//    private String cTOEmail;
//    @Column(name = "CTO_Contact_Number")
//    private String cTOContactNumber;
//    @Size(max = 20)
//    @Column(name = "City")
//    private String city;
//    @Size(max = 20)
//    @Column(name = "Country")
//    private String country;
//    @Size(max = 20)
//    @Column(name = "pincode")
//    private String pincode;
//    @Column(name = "Penalty_Clause")
//    private Boolean penaltyClause;
//    @Size(max = 200)
//    @Column(name = "Penalty_Clause_desc")
//    private String penaltyClausedesc;
//    @Column(name = "Contract_Start_Date")
//    @Temporal(TemporalType.DATE)
//    private Date contractStartDate;
//    @Column(name = "Contract_End_Date")
//    @Temporal(TemporalType.DATE)
//    private Date contractEndDate;
//    @Size(max = 20)
//    @Column(name = "Client_Status")
//    private String clientStatus;
//    @Basic(optional = false)
//    @NotNull
//    @Column(name = "LSTUPDDT")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date lstupddt;
//    @Size(max = 20)
//    @Column(name = "LSTUPDUSR")
//    private String lstupdusr;
//    @Column(name = "LSTUPDSESS")
//    private Integer lstupdsess;
//    @OneToMany(mappedBy = "clientID")
//    private List<SmtResourceReplacementTransition> smtResourceReplacementTransitionList;
//    @OneToMany(mappedBy = "clientID")
//    private List<SmtDocumentdeliverytransactions> smtDocumentdeliverytransactionsList;
//    @OneToMany(mappedBy = "clientID")
//    private List<SmtEmployeereplacementdetails> smtEmployeereplacementdetailsList;
//    @OneToMany(mappedBy = "clientID")
//    private List<SmtDocumenttransactiondetails> smtDocumenttransactiondetailsList;
//    @OneToMany(mappedBy = "clientID")
//    private List<SmtIncidentmanagementtransaction> smtIncidentmanagementtransactionList;
//    @OneToMany(mappedBy = "clientID")
//    private List<SmtActivitytrasaction> smtActivitytrasactionList;
//    @OneToMany(mappedBy = "clientID")
//    private List<SmtClientactivitymaster> smtClientactivitymasterList;
//    @OneToMany(mappedBy = "clientID")
//    private List<SmtShifthandovertransaction> smtShifthandovertransactionList;
//    @OneToMany(mappedBy = "clientID")
//    private List<SmtEmployeeDeploymentDetails> smtEmployeeDeploymentDetailsList;
//
//    public List<SmtTicketraised> getSmtTicketraiseds() {
//        return smtTicketraiseds;
//    }
//
//    public void setSmtTicketraiseds(List<SmtTicketraised> smtTicketraiseds) {
//        this.smtTicketraiseds = smtTicketraiseds;
//    }
//    @OneToMany(mappedBy = "clientID")
//    private List<SmtClientservicedetail> smtClientservicedetailList;
//    @OneToMany(mappedBy = "clientID")
//    private List<SmtSlamanagement> slamanagements;
//
//    @OneToMany(mappedBy = "clientID")
//    private List<SmtTicketraised> smtTicketraiseds;
//
//    @OneToMany(mappedBy = "clientID")
//    private List<SmtDashboardManagement> dashboard;
//
//    public List<SmtDashboardManagement> getDashboard() {
//        return dashboard;
//    }
//
//    public void setDashboard(List<SmtDashboardManagement> dashboard) {
//        this.dashboard = dashboard;
//    }
//
//    public SmtClientmaster() {
//    }
//
//    public SmtClientmaster(Integer clientID) {
//        this.clientID = clientID;
//    }
//
//    public SmtClientmaster(Integer clientID, Date lstupddt) {
//        this.clientID = clientID;
//        this.lstupddt = lstupddt;
//    }
//
//    public List<SmtSlamanagement> getSlamanagements() {
//        return slamanagements;
//    }
//
//    public void setSlamanagements(List<SmtSlamanagement> slamanagements) {
//        this.slamanagements = slamanagements;
//    }
//
//    public Integer getClientID() {
//        return clientID;
//    }
//
//    public void setClientID(Integer clientID) {
//        this.clientID = clientID;
//    }
//
//    public String getClientUniqueId() {
//        return clientUniqueId;
//    }
//
//    public void setClientUniqueId(String clientUniqueId) {
//        this.clientUniqueId = clientUniqueId;
//    }
//
//    public String getClientName() {
//        return clientName;
//    }
//
//    public void setClientName(String clientName) {
//        this.clientName = clientName;
//    }
//
//    public String getClientAddresscorporate() {
//        return clientAddresscorporate;
//    }
//
//    public void setClientAddresscorporate(String clientAddresscorporate) {
//        this.clientAddresscorporate = clientAddresscorporate;
//    }
//
//    public String getClientBusinessDomain() {
//        return clientBusinessDomain;
//    }
//
//    public void setClientBusinessDomain(String clientBusinessDomain) {
//        this.clientBusinessDomain = clientBusinessDomain;
//    }
//
//    public String getClientOwnerDelivery() {
//        return clientOwnerDelivery;
//    }
//
//    public void setClientOwnerDelivery(String clientOwnerDelivery) {
//        this.clientOwnerDelivery = clientOwnerDelivery;
//    }
//
//    public String getKam() {
//        return kam;
//    }
//
//    public void setKam(String kam) {
//        this.kam = kam;
//    }
//
//    public String getSalesOwner1() {
//        return salesOwner1;
//    }
//
//    public void setSalesOwner1(String salesOwner1) {
//        this.salesOwner1 = salesOwner1;
//    }
//
//    public String getSalesOwner2() {
//        return salesOwner2;
//    }
//
//    public void setSalesOwner2(String salesOwner2) {
//        this.salesOwner2 = salesOwner2;
//    }
//
//    public String getSalesOwner3() {
//        return salesOwner3;
//    }
//
//    public void setSalesOwner3(String salesOwner3) {
//        this.salesOwner3 = salesOwner3;
//    }
//
//    public String getCIOName() {
//        return cIOName;
//    }
//
//    public void setCIOName(String cIOName) {
//        this.cIOName = cIOName;
//    }
//
//    public String getCIOEmail() {
//        return cIOEmail;
//    }
//
//    public void setCIOEmail(String cIOEmail) {
//        this.cIOEmail = cIOEmail;
//    }
//
//    public String getCTOName() {
//        return cTOName;
//    }
//
//    public void setCTOName(String cTOName) {
//        this.cTOName = cTOName;
//    }
//
//    public String getCTOEmail() {
//        return cTOEmail;
//    }
//
//    public void setCTOEmail(String cTOEmail) {
//        this.cTOEmail = cTOEmail;
//    }
//
//    public String getCTOContactNumber() {
//        return cTOContactNumber;
//    }
//
//    public void setCTOContactNumber(String cTOContactNumber) {
//        this.cTOContactNumber = cTOContactNumber;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }
//
//    public String getPincode() {
//        return pincode;
//    }
//
//    public void setPincode(String pincode) {
//        this.pincode = pincode;
//    }
//
//    public Boolean getPenaltyClause() {
//        return penaltyClause;
//    }
//
//    public void setPenaltyClause(Boolean penaltyClause) {
//        this.penaltyClause = penaltyClause;
//    }
//
//    public String getPenaltyClausedesc() {
//        return penaltyClausedesc;
//    }
//
//    public void setPenaltyClausedesc(String penaltyClausedesc) {
//        this.penaltyClausedesc = penaltyClausedesc;
//    }
//
//    public Date getContractStartDate() {
//        return contractStartDate;
//    }
//
//    public void setContractStartDate(Date contractStartDate) {
//        this.contractStartDate = contractStartDate;
//    }
//
//    public Date getContractEndDate() {
//        return contractEndDate;
//    }
//
//    public void setContractEndDate(Date contractEndDate) {
//        this.contractEndDate = contractEndDate;
//    }
//
//    public String getClientStatus() {
//        return clientStatus;
//    }
//
//    public void setClientStatus(String clientStatus) {
//        this.clientStatus = clientStatus;
//    }
//
//    public Date getLstupddt() {
//        return lstupddt;
//    }
//
//    public void setLstupddt(Date lstupddt) {
//        this.lstupddt = lstupddt;
//    }
//
//    public String getLstupdusr() {
//        return lstupdusr;
//    }
//
//    public void setLstupdusr(String lstupdusr) {
//        this.lstupdusr = lstupdusr;
//    }
//
//    public Integer getLstupdsess() {
//        return lstupdsess;
//    }
//
//    public void setLstupdsess(Integer lstupdsess) {
//        this.lstupdsess = lstupdsess;
//    }
//
//    public List<SmtResourceReplacementTransition> getSmtResourceReplacementTransitionList() {
//        return smtResourceReplacementTransitionList;
//    }
//
//    public void setSmtResourceReplacementTransitionList(List<SmtResourceReplacementTransition> smtResourceReplacementTransitionList) {
//        this.smtResourceReplacementTransitionList = smtResourceReplacementTransitionList;
//    }
//
//    public List<SmtDocumentdeliverytransactions> getSmtDocumentdeliverytransactionsList() {
//        return smtDocumentdeliverytransactionsList;
//    }
//
//    public void setSmtDocumentdeliverytransactionsList(List<SmtDocumentdeliverytransactions> smtDocumentdeliverytransactionsList) {
//        this.smtDocumentdeliverytransactionsList = smtDocumentdeliverytransactionsList;
//    }
//
//    public List<SmtEmployeereplacementdetails> getSmtEmployeereplacementdetailsList() {
//        return smtEmployeereplacementdetailsList;
//    }
//
//    public void setSmtEmployeereplacementdetailsList(List<SmtEmployeereplacementdetails> smtEmployeereplacementdetailsList) {
//        this.smtEmployeereplacementdetailsList = smtEmployeereplacementdetailsList;
//    }
//
//    public List<SmtDocumenttransactiondetails> getSmtDocumenttransactiondetailsList() {
//        return smtDocumenttransactiondetailsList;
//    }
//
//    public void setSmtDocumenttransactiondetailsList(List<SmtDocumenttransactiondetails> smtDocumenttransactiondetailsList) {
//        this.smtDocumenttransactiondetailsList = smtDocumenttransactiondetailsList;
//    }
//
//    public List<SmtIncidentmanagementtransaction> getSmtIncidentmanagementtransactionList() {
//        return smtIncidentmanagementtransactionList;
//    }
//
//    public void setSmtIncidentmanagementtransactionList(List<SmtIncidentmanagementtransaction> smtIncidentmanagementtransactionList) {
//        this.smtIncidentmanagementtransactionList = smtIncidentmanagementtransactionList;
//    }
//
//    public List<SmtActivitytrasaction> getSmtActivitytrasactionList() {
//        return smtActivitytrasactionList;
//    }
//
//    public void setSmtActivitytrasactionList(List<SmtActivitytrasaction> smtActivitytrasactionList) {
//        this.smtActivitytrasactionList = smtActivitytrasactionList;
//    }
//
//    public List<SmtClientactivitymaster> getSmtClientactivitymasterList() {
//        return smtClientactivitymasterList;
//    }
//
//    public void setSmtClientactivitymasterList(List<SmtClientactivitymaster> smtClientactivitymasterList) {
//        this.smtClientactivitymasterList = smtClientactivitymasterList;
//    }
//
//    public List<SmtShifthandovertransaction> getSmtShifthandovertransactionList() {
//        return smtShifthandovertransactionList;
//    }
//
//    public void setSmtShifthandovertransactionList(List<SmtShifthandovertransaction> smtShifthandovertransactionList) {
//        this.smtShifthandovertransactionList = smtShifthandovertransactionList;
//    }
//
//    public List<SmtEmployeeDeploymentDetails> getSmtEmployeeDeploymentDetailsList() {
//        return smtEmployeeDeploymentDetailsList;
//    }
//
//    public void setSmtEmployeeDeploymentDetailsList(List<SmtEmployeeDeploymentDetails> smtEmployeeDeploymentDetailsList) {
//        this.smtEmployeeDeploymentDetailsList = smtEmployeeDeploymentDetailsList;
//    }
//
//    public List<SmtClientservicedetail> getSmtClientservicedetailList() {
//        return smtClientservicedetailList;
//    }
//
//    public void setSmtClientservicedetailList(List<SmtClientservicedetail> smtClientservicedetailList) {
//        this.smtClientservicedetailList = smtClientservicedetailList;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (clientID != null ? clientID.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof SmtClientmaster)) {
//            return false;
//        }
//        SmtClientmaster other = (SmtClientmaster) object;
//        if ((this.clientID == null && other.clientID != null) || (this.clientID != null && !this.clientID.equals(other.clientID))) {
//            return false;
//        }
//        return true;
//    }
//
////    public String getCtoContactNumber() {
////        return ctoContactNumber;
////    }
////
////    public void setCtoContactNumber(String ctoContactNumber) {
////        this.ctoContactNumber = ctoContactNumber;
////    }
////    
//}
