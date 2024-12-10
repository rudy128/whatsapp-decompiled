package X;

/* renamed from: X.1g0  reason: invalid class name and case insensitive filesystem */
public class C31711g0 extends Exception {
    public static final long serialVersionUID = 1;
    public String banAppealToken;
    public String banMessage;
    public int code;
    public long expiration_time;
    public int expire_time_out;
    public String faqUrl;
    public boolean isEu;
    public String logoutMainButtonText;
    public String logoutMainButtonUrl;
    public String logoutMessageHeader;
    public String logoutMessageLocale;
    public String logoutMessageSubtext;
    public String logoutSecondaryButtonText;
    public String logoutSecondaryButtonUrl;
    public String regInfo;
    public final int serverErrorCode;
    public final int type;
    public String violationReason;
    public int violationSourceAcct;
    public int violationType;

    public C31711g0(int i, int i2) {
        this.type = i;
        this.serverErrorCode = i2;
    }
}
