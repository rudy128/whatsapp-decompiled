package X;

/* renamed from: X.BnL  reason: case insensitive filesystem */
public final class C23652BnL extends C23577Bm6 implements C22356B4k {
    public static final C23652BnL DEFAULT_INSTANCE;
    public static final int LINK_UUID_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER = null;
    public static final int STATE_FIELD_NUMBER = 1;
    public static final int USER_DATA_FIELD_NUMBER = 4;
    public static final int UUID_FIELD_NUMBER = 2;
    public DSQ linkUuid_;
    public int state_;
    public C27328Dbz userData_ = C27328Dbz.A00;
    public DSQ uuid_;

    static {
        C23652BnL bnL = new C23652BnL();
        DEFAULT_INSTANCE = bnL;
        C23577Bm6.A0E(bnL, C23652BnL.class);
    }

    public C23652BnL() {
        DSQ dsq = DSQ.A00;
        this.uuid_ = dsq;
        this.linkUuid_ = dsq;
    }
}
