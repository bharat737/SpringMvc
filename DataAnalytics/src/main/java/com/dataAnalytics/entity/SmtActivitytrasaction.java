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
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
//import org.hibernate.annotations.LazyCollection;
//import org.hibernate.annotations.LazyCollectionOption;
//
///**
// *
// * @author cloveruser
// */
//@Entity
//@Table(name = "smt_activitytrasaction")
//@NamedQueries({
//    @NamedQuery(name = "SmtActivitytrasaction.findAll", query = "SELECT s FROM SmtActivitytrasaction s")})
//public class SmtActivitytrasaction implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Basic(optional = false)
//    @Column(name = "ActivityTrasactionID")
//    private Integer activityTrasactionID;
//    @Column(name = "activity_status")
//    private String activityStatus;
//    @Column(name = "ActivityDate")
//    @Temporal(TemporalType.DATE)
//    private Date activityDate;
//    @Size(max = 20)
//    @Column(name = "ActivityShift")
//    private String activityShift;
//    @Size(max = 40)
//    @Column(name = "ActivityType")
//    private String activityType;
//    @Column(name = "IssueTicketNumber")
//    private Integer issueTicketNumber;
//    @Column(name = "ActivityCarriedOverFromLastShift")
//    private Boolean activityCarriedOverFromLastShift;
//    @Size(max = 100)
//    @Column(name = "ReasonForPendency")
//    private String reasonForPendency;
//    @Column(name = "Remark")
//    private String remark;
//    @Column(name = "FilePath")
//    private Boolean filePath;
//    @Basic(optional = false)
//    @NotNull
//    @Column(name = "LSTUPDDT")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date lstupddt;
//    @Size(max = 20)
//    @Column(name = "Activity_StartTime")
//    private String Activity_StartTime;
//    @Size(max = 20)
//    @Column(name = "Activity_EndTime")
//    private String Activity_EndTime;
//    @Size(max = 20)
//    @Column(name = "Actual_Spend_Duration")
//    private String ActualSpendDuration;
//
//    @Size(max = 20)
//    @Column(name = "LSTUPDUSR")
//    private String lstupdusr;
//
//    @Column(name = "LSTUPDSESS")
//    private Integer lstupdsess;
//    @Column(name = "Activity_Exception_Flag")
//    private String ActivityExceptionFlag;
//    @Column(name = "Activity_Escalation_Required")
//    private String ActivityEscalationRequired;
//
//    @Column(name = "delete_status")
//    private Integer delete_status;
//    @JoinColumn(name = "Client_ID", referencedColumnName = "Client_ID")
//    @ManyToOne
//    private SmtClientmaster clientID;
//    @JoinColumn(name = "Technology_ID", referencedColumnName = "Technology_ID")
//    @ManyToOne
//    private SmtTechnologymaster technologyID;
//    @JoinColumn(name = "Employee_ID", referencedColumnName = "Employee_ID")
//    @ManyToOne
//    private SmtEmployeemaster employeeID;
//    @JoinColumn(name = "Activity_ID", referencedColumnName = "Activity_ID")
//    @ManyToOne
//    private SmtActivitymaster activityID;
//    @JoinColumn(name = "ClientActivity_ID", referencedColumnName = "ClientActivity_ID")
//    @ManyToOne
//    private SmtClientactivitymaster clientActivityID;
////    @OneToOne(mappedBy = "activityTrasactionID")
////    private SmtShifthandovertransaction smtShifthandovertransactionList;
//    @LazyCollection(LazyCollectionOption.FALSE)
//    @OneToMany(mappedBy = "activityTrasactionID")
//    private List<SmtShifthandovertransaction> smtShifthandovertransactionList;
//
//    @Size(max = 200)
//    @Column(name = "act_desc")
//    private String actDesc;
//
//    @Size(max = 50)
//    @Column(name = "env_type")
//    private String envType;
//
//    @Size(max = 20)
//    @Column(name = "criticality_level")
//    private String criticality;
//
//    @Column(name = "referal_activity")
//    private Integer referralActivity;
//
//    @Column(name = "closure_activity")
//    private Integer closureActivity;
//
//    @Column(name = "shift_handover_id")
//    private Integer shiftHandoverId;
//
//    @Size(max = 20)
//    @Column(name = "assignBy")
//    private String assignBy;
//
//    @Column(name = "shift_handover_ack")
//    private Integer shiftHandoverAck;
//
//    @Column(name = "txn_date")
//    @Temporal(TemporalType.DATE)
//    private Date txnDate;
//
//    @Size(max = 20)
//    @Column(name = "txn_shift")
//    private String txnShift;
//
//    @Size(max = 40)
//    @Column(name = "txn_status")
//    private String txnStatus;
//    
//    @Size(max = 20)
//    @Column(name = "txn_status")
//    private String transactionActivityStatus;
//
//    public String getTransactionActivityStatus() {
//        return transactionActivityStatus;
//    }
//
//    public void setTransactionActivityStatus(String transactionActivityStatus) {
//        this.transactionActivityStatus = transactionActivityStatus;
//    }
//
//    @OneToMany(mappedBy = "activityTrasactionID")
//    private List<SmtActivitytrasactionHistory> smtActivitytrasactionHistoryCollection;
//
//    public List<SmtActivitytrasactionHistory> getSmtActivitytrasactionHistoryCollection() {
//        return smtActivitytrasactionHistoryCollection;
//    }
//
//    public void setSmtActivitytrasactionHistoryCollection(List<SmtActivitytrasactionHistory> smtActivitytrasactionHistoryCollection) {
//        this.smtActivitytrasactionHistoryCollection = smtActivitytrasactionHistoryCollection;
//    }
//
//    @JoinColumn(name = "Raised_id", referencedColumnName = "Raised_id")
//    @ManyToOne
//    private SmtTicketraised raisedId;
//
//    public String getEnvType() {
//        return envType;
//    }
//
//    public void setEnvType(String envType) {
//        this.envType = envType;
//    }
//
//    public SmtTicketraised getRaisedId() {
//        return raisedId;
//    }
//
//    public void setRaisedId(SmtTicketraised raisedId) {
//        this.raisedId = raisedId;
//    }
//
//    
//
//    public String getActDesc() {
//        return actDesc;
//    }
//
//    public void setActDesc(String actDesc) {
//        this.actDesc = actDesc;
//    }
//
//    public String getActualSpendDuration() {
//        return ActualSpendDuration;
//    }
//
//    public void setActualSpendDuration(String ActualSpendDuration) {
//        this.ActualSpendDuration = ActualSpendDuration;
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
////    public SmtShifthandovertransaction getSmtShifthandovertransactionList() {
////        return smtShifthandovertransactionList;
////    }
////
////    public void setSmtShifthandovertransactionList(SmtShifthandovertransaction smtShifthandovertransactionList) {
////        this.smtShifthandovertransactionList = smtShifthandovertransactionList;
////    }
//    public SmtClientactivitymaster getClientActivityID() {
//        return clientActivityID;
//    }
//
//    public void setClientActivityID(SmtClientactivitymaster clientActivityID) {
//        this.clientActivityID = clientActivityID;
//    }
//
//    public SmtActivitytrasaction() {
//    }
//
//    public SmtActivitytrasaction(Integer activityTrasactionID) {
//        this.activityTrasactionID = activityTrasactionID;
//    }
//
//    public SmtActivitytrasaction(Integer activityTrasactionID, Date lstupddt) {
//        this.activityTrasactionID = activityTrasactionID;
//        this.lstupddt = lstupddt;
//    }
//
//    public String getActivityExceptionFlag() {
//        return ActivityExceptionFlag;
//    }
//
//    public void setActivityExceptionFlag(String ActivityExceptionFlag) {
//        this.ActivityExceptionFlag = ActivityExceptionFlag;
//    }
//
//    public String getActivityEscalationRequired() {
//        return ActivityEscalationRequired;
//    }
//
//    public void setActivityEscalationRequired(String ActivityEscalationRequired) {
//        this.ActivityEscalationRequired = ActivityEscalationRequired;
//    }
//
//    public Integer getActivityTrasactionID() {
//        return activityTrasactionID;
//    }
//
//    public void setActivityTrasactionID(Integer activityTrasactionID) {
//        this.activityTrasactionID = activityTrasactionID;
//    }
//
//    public String getActivityStatus() {
//        return activityStatus;
//    }
//
//    public void setActivityStatus(String activityStatus) {
//        this.activityStatus = activityStatus;
//    }
//
//    public Date getActivityDate() {
//        return activityDate;
//    }
//
//    public void setActivityDate(Date activityDate) {
//        this.activityDate = activityDate;
//    }
//
//    public String getActivityShift() {
//        return activityShift;
//    }
//
//    public void setActivityShift(String activityShift) {
//        this.activityShift = activityShift;
//    }
//
//    public String getActivityType() {
//        return activityType;
//    }
//
//    public void setActivityType(String activityType) {
//        this.activityType = activityType;
//    }
//
//    public Integer getIssueTicketNumber() {
//        return issueTicketNumber;
//    }
//
//    public void setIssueTicketNumber(Integer issueTicketNumber) {
//        this.issueTicketNumber = issueTicketNumber;
//    }
//
//    public Boolean getActivityCarriedOverFromLastShift() {
//        return activityCarriedOverFromLastShift;
//    }
//
//    public void setActivityCarriedOverFromLastShift(Boolean activityCarriedOverFromLastShift) {
//        this.activityCarriedOverFromLastShift = activityCarriedOverFromLastShift;
//    }
//
//    public String getReasonForPendency() {
//        return reasonForPendency;
//    }
//
//    public void setReasonForPendency(String reasonForPendency) {
//        this.reasonForPendency = reasonForPendency;
//    }
//
//    public String getRemark() {
//        return remark;
//    }
//
//    public void setRemark(String remark) {
//        this.remark = remark;
//    }
//
//    public Boolean getFilePath() {
//        return filePath;
//    }
//
//    public void setFilePath(Boolean filePath) {
//        this.filePath = filePath;
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
//    public SmtClientmaster getClientID() {
//        return clientID;
//    }
//
//    public void setClientID(SmtClientmaster clientID) {
//        this.clientID = clientID;
//    }
//
//    public SmtTechnologymaster getTechnologyID() {
//        return technologyID;
//    }
//
//    public void setTechnologyID(SmtTechnologymaster technologyID) {
//        this.technologyID = technologyID;
//    }
//
//    public SmtEmployeemaster getEmployeeID() {
//        return employeeID;
//    }
//
//    public void setEmployeeID(SmtEmployeemaster employeeID) {
//        this.employeeID = employeeID;
//    }
//
//    public SmtActivitymaster getActivityID() {
//        return activityID;
//    }
//
//    public void setActivityID(SmtActivitymaster activityID) {
//        this.activityID = activityID;
//    }
//
//    public String getActivity_StartTime() {
//        return Activity_StartTime;
//    }
//
//    public void setActivity_StartTime(String Activity_StartTime) {
//        this.Activity_StartTime = Activity_StartTime;
//    }
//
//    public String getActivity_EndTime() {
//        return Activity_EndTime;
//    }
//
//    public void setActivity_EndTime(String Activity_EndTime) {
//        this.Activity_EndTime = Activity_EndTime;
//    }
//
//    public Integer getDelete_status() {
//        return delete_status;
//    }
//
//    public void setDelete_status(Integer delete_status) {
//        this.delete_status = delete_status;
//    }
//
//    public String getCriticality() {
//        return criticality;
//    }
//
//    public void setCriticality(String criticality) {
//        this.criticality = criticality;
//    }
//
////    public SmtClientactivitymaster getClientActivityID() {
////        return clientActivityID;
////    }
////
////    public void setClientActivityID(SmtClientactivitymaster clientActivityID) {
////        this.clientActivityID = clientActivityID;
////    }
////    
//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (activityTrasactionID != null ? activityTrasactionID.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof SmtActivitytrasaction)) {
//            return false;
//        }
//        SmtActivitytrasaction other = (SmtActivitytrasaction) object;
//        if ((this.activityTrasactionID == null && other.activityTrasactionID != null) || (this.activityTrasactionID != null && !this.activityTrasactionID.equals(other.activityTrasactionID))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "com.clover.smt.beans.SmtActivitytrasaction[ activityTrasactionID=" + activityTrasactionID + " ]";
//    }
//
//    public Integer getReferralActivity() {
//        return referralActivity;
//    }
//
//    public void setReferralActivity(Integer referralActivity) {
//        this.referralActivity = referralActivity;
//    }
//
//    public Integer getClosureActivity() {
//        return closureActivity;
//    }
//
//    public void setClosureActivity(Integer closureActivity) {
//        this.closureActivity = closureActivity;
//    }
//
//    public Integer getShiftHandoverId() {
//        return shiftHandoverId;
//    }
//
//    public void setShiftHandoverId(Integer shiftHandoverId) {
//        this.shiftHandoverId = shiftHandoverId;
//    }
//
//    public String getAssignBy() {
//        return assignBy;
//    }
//
//    public void setAssignBy(String assignBy) {
//        this.assignBy = assignBy;
//    }
//
//    public Integer getShiftHandoverAck() {
//        return shiftHandoverAck;
//    }
//
//    public void setShiftHandoverAck(Integer shiftHandoverAck) {
//        this.shiftHandoverAck = shiftHandoverAck;
//    }
//
//    public Date getTxnDate() {
//        return txnDate;
//    }
//
//    public void setTxnDate(Date txnDate) {
//        this.txnDate = txnDate;
//    }
//
//    public String getTxnShift() {
//        return txnShift;
//    }
//
//    public void setTxnShift(String txnShift) {
//        this.txnShift = txnShift;
//    }
//
//    public String getTxnStatus() {
//        return txnStatus;
//    }
//
//    public void setTxnStatus(String txnStatus) {
//        this.txnStatus = txnStatus;
//    }
//
//}
