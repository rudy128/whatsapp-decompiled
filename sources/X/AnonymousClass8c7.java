package X;

/* renamed from: X.8c7  reason: invalid class name */
public final class AnonymousClass8c7 extends C23577Bm6 implements C22356B4k {
    public static final int ACCEPT_END_TIMESTAMP_FIELD_NUMBER = 1;
    public static final int ACCEPT_START_TIMESTAMP_FIELD_NUMBER = 2;
    public static final int AMOUNT_RULE_FIELD_NUMBER = 3;
    public static final AnonymousClass8c7 DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 4;
    public static final int FREQUENCY_RULE_FIELD_NUMBER = 5;
    public static final int IS_REVOCABLE_FIELD_NUMBER = 6;
    public static final int MANDATE_INFO_FIELD_NUMBER = 7;
    public static final int MANDATE_NO_FIELD_NUMBER = 8;
    public static final int ORIGINAL_AMOUNT_FIELD_NUMBER = 9;
    public static volatile C22357B4l PARSER;
    public long acceptEndTimestamp_;
    public long acceptStartTimestamp_;
    public int amountRule_;
    public int bitField0_;
    public String errorCode_ = "";
    public String frequencyRule_ = "";
    public boolean isRevocable_;
    public String mandateInfo_ = "";
    public String mandateNo_ = "";
    public byte memoizedIsInitialized = 2;
    public C164948aK originalAmount_;

    static {
        AnonymousClass8c7 r1 = new AnonymousClass8c7();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass8c7.class);
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
                Object[] A1R = AnonymousClass8BS.A1R(10);
                A1R[1] = "acceptEndTimestamp_";
                A1R[2] = "acceptStartTimestamp_";
                A1R[3] = "amountRule_";
                A1R[4] = "errorCode_";
                A1R[5] = "frequencyRule_";
                A1R[6] = "isRevocable_";
                A1R[7] = "mandateInfo_";
                A1R[8] = "mandateNo_";
                A1R[9] = "originalAmount_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0005\u0001ᔂ\u0000\u0002ᔂ\u0001\u0003ᔄ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ᔇ\u0005\u0007ဈ\u0006\bဈ\u0007\tᔉ\b", A1R);
            case 3:
                return new AnonymousClass8c7();
            case 4:
                return new C163198Ub();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass8c7.class) {
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
