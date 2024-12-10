package X;

/* renamed from: X.8c3  reason: invalid class name */
public final class AnonymousClass8c3 extends C23577Bm6 implements C22356B4k {
    public static final int ACCEPT_END_TIMESTAMP_FIELD_NUMBER = 3;
    public static final int ACTION_FIELD_NUMBER = 1;
    public static final int AMOUNT_FIELD_NUMBER = 2;
    public static final int AMOUNT_RULE_FIELD_NUMBER = 4;
    public static final AnonymousClass8c3 DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 5;
    public static final int MANDATE_UPDATE_INFO_FIELD_NUMBER = 7;
    public static volatile C22357B4l PARSER = null;
    public static final int SEQ_NO_FIELD_NUMBER = 6;
    public static final int STATUS_FIELD_NUMBER = 8;
    public long acceptEndTimestamp_;
    public int action_;
    public int amountRule_;
    public C164948aK amount_;
    public int bitField0_;
    public String errorCode_ = "";
    public String mandateUpdateInfo_ = "";
    public byte memoizedIsInitialized = 2;
    public String seqNo_ = "";
    public int status_;

    static {
        AnonymousClass8c3 r1 = new AnonymousClass8c3();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass8c3.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        int i = 1;
        switch (num.intValue()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                if (obj == null) {
                    i = 0;
                }
                this.memoizedIsInitialized = (byte) i;
                return null;
            case 2:
                Object[] A1R = AnonymousClass8BS.A1R(9);
                A1R[1] = "action_";
                A1R[2] = "amount_";
                A1R[3] = "acceptEndTimestamp_";
                A1R[4] = "amountRule_";
                A1R[5] = "errorCode_";
                A1R[6] = "seqNo_";
                A1R[7] = "mandateUpdateInfo_";
                A1R[8] = "status_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0003\u0001ᔄ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ᔄ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bᔄ\u0007", A1R);
            case 3:
                return new AnonymousClass8c3();
            case 4:
                return new C163208Uc();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass8c3.class) {
                    b4l = PARSER;
                    if (b4l == null) {
                        C26105CsP csP = DNE.A01;
                        b4l = C17880vN.A0F(DEFAULT_INSTANCE);
                        PARSER = b4l;
                    }
                }
                return b4l;
            default:
                throw C17880vN.A0y();
        }
    }
}
