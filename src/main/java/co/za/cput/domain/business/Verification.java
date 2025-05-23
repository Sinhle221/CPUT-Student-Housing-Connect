package co.za.cput.domain.business;
//Firstname: Siyabonga
//Lastname:Jiyane
//Student Number: 222359676

import java.util.Date;

public class Verification {

    private String verificationID;
    private Date verificationDate;
    private VerificationStatus status;

    public enum VerificationStatus {
        PENDING,
        APPROVED,
        REJECTED;
    }

    public Verification() {}

    private Verification(Builder builder) {
        this.verificationID = builder.verificationID;
        this.verificationDate = builder.verificationDate;
        this.status = builder.status;
    }

    public String getVerificationID() {
        return verificationID;
    }

    public Date getVerificationDate() {
        return verificationDate;
    }

    public VerificationStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Verification{" +
                "verificationID='" + getVerificationID() + '\'' +
                ", verificationDate=" + getVerificationDate() +
                ", status=" + getStatus() +
                '}';
    }

    public static class Builder {
        private String verificationID;
        private Date verificationDate;
        private VerificationStatus status;

        public Builder setVerificationID(String verificationID) {
            this.verificationID = verificationID;
            return this;
        }

        public Builder setVerificationDate(Date verificationDate) {
            this.verificationDate = verificationDate;
            return this;
        }

        public Builder setStatus(VerificationStatus status) {
            this.status = status;
            return this;
        }

        public Builder copy(Verification verification) {
            this.verificationID = verification.getVerificationID();
            this.verificationDate = verification.getVerificationDate();
            this.status = verification.getStatus();
            return this;
        }

        public Verification build() {
            return new Verification(this);
        }
    }
}
