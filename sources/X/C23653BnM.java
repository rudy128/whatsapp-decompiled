package X;

/* renamed from: X.BnM  reason: case insensitive filesystem */
public final class C23653BnM extends C23577Bm6 implements C22356B4k {
    public static final int BASE_FIELD_NUMBER = 4;
    public static final C23653BnM DEFAULT_INSTANCE;
    public static final int IV_FIELD_NUMBER = 3;
    public static final int PARAMETERS_FIELD_NUMBER = 5;
    public static volatile C22357B4l PARSER = null;
    public static final int PUBLICKEY_FIELD_NUMBER = 1;
    public static final int SEED_FIELD_NUMBER = 2;
    public int base_;
    public DSQ iv_;
    public int parameters_;
    public DSQ publicKey_;
    public DSQ seed_;

    static {
        C23653BnM bnM = new C23653BnM();
        DEFAULT_INSTANCE = bnM;
        C23577Bm6.A0E(bnM, C23653BnM.class);
    }

    public C23653BnM() {
        DSQ dsq = DSQ.A00;
        this.publicKey_ = dsq;
        this.seed_ = dsq;
        this.iv_ = dsq;
    }
}
