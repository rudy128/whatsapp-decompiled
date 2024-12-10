package X;

/* renamed from: X.BnN  reason: case insensitive filesystem */
public final class C23654BnN extends C23577Bm6 implements C22356B4k {
    public static final int CHALLENGE_FIELD_NUMBER = 2;
    public static final C23654BnN DEFAULT_INSTANCE;
    public static final int ELLIPTICCURVE_FIELD_NUMBER = 3;
    public static final int KEYHINT_FIELD_NUMBER = 5;
    public static volatile C22357B4l PARSER = null;
    public static final int PUBLICKEY_FIELD_NUMBER = 1;
    public static final int SUPPORTEDPARAMETERS_FIELD_NUMBER = 4;
    public DSQ challenge_;
    public EE9 keyHint_;
    public int keyTypeCase_ = 0;
    public Object keyType_;
    public DSQ publicKey_;
    public int supportedParameters_;

    static {
        C23654BnN bnN = new C23654BnN();
        DEFAULT_INSTANCE = bnN;
        C23577Bm6.A0E(bnN, C23654BnN.class);
    }

    public C23654BnN() {
        DSQ dsq = DSQ.A00;
        this.publicKey_ = dsq;
        this.challenge_ = dsq;
        this.keyHint_ = C23579Bm9.A02;
    }
}
