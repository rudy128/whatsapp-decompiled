package X;

/* renamed from: X.BnJ  reason: case insensitive filesystem */
public final class C23650BnJ extends C23577Bm6 implements C22356B4k {
    public static final C23650BnJ DEFAULT_INSTANCE;
    public static final int DEVICEPUBLICKEY_FIELD_NUMBER = 4;
    public static final int ERROR_FIELD_NUMBER = 2;
    public static final int NONCE_FIELD_NUMBER = 1;
    public static volatile C22357B4l PARSER = null;
    public static final int SERVICEUUID_FIELD_NUMBER = 3;
    public DSQ devicePublicKey_;
    public int error_;
    public int nonce_;
    public DSQ serviceUUID_;

    static {
        C23650BnJ bnJ = new C23650BnJ();
        DEFAULT_INSTANCE = bnJ;
        C23577Bm6.A0E(bnJ, C23650BnJ.class);
    }

    public C23650BnJ() {
        DSQ dsq = DSQ.A00;
        this.serviceUUID_ = dsq;
        this.devicePublicKey_ = dsq;
    }
}
