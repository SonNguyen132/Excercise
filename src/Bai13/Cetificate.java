package Bai13;

public class Cetificate {
    private int certificateID;
    private String certificateName;
    private String certificateRank;
    private String getCertificateDate;

    public Cetificate(int certificateID, String certificateName, String certificateRank, String getCertificateDate) {
        this.certificateID = certificateID;
        this.certificateName = certificateName;
        this.certificateRank = certificateRank;
        this.getCertificateDate = getCertificateDate;
    }

    public int getCertificateID() {
        return certificateID;
    }

    public void setCertificateID(int certificateID) {
        this.certificateID = certificateID;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public String getCertificateRank() {
        return certificateRank;
    }

    public void setCertificateRank(String certificateRank) {
        this.certificateRank = certificateRank;
    }

    public String getGetCertificateDate() {
        return getCertificateDate;
    }

    public void setGetCertificateDate(String getCertificateDate) {
        this.getCertificateDate = getCertificateDate;
    }

    @Override
    public String toString() {
        return "Cetificate{" +
                "certificateID=" + certificateID +
                ", certificateName='" + certificateName + '\'' +
                ", certificateRank='" + certificateRank + '\'' +
                ", getCertificateDate='" + getCertificateDate + '\'' +
                '}';
    }
}
