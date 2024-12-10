package X;

/* renamed from: X.2BI  reason: invalid class name */
public final class AnonymousClass2BI extends C23577Bm6 implements C22356B4k {
    public static final int ACCOUNT_SIGNATURE_FIELD_NUMBER = 3;
    public static final int ACCOUNT_SIGNATURE_KEY_FIELD_NUMBER = 2;
    public static final AnonymousClass2BI DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 1;
    public static final int DEVICE_SIGNATURE_FIELD_NUMBER = 4;
    public static volatile C22357B4l PARSER;
    public DSQ accountSignatureKey_;
    public DSQ accountSignature_;
    public int bitField0_;
    public DSQ details_;
    public DSQ deviceSignature_;

    static {
        AnonymousClass2BI r1 = new AnonymousClass2BI();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass2BI.class);
    }

    public AnonymousClass2BI() {
        DSQ dsq = DSQ.A00;
        this.details_ = dsq;
        this.accountSignatureKey_ = dsq;
        this.accountSignature_ = dsq;
        this.deviceSignature_ = dsq;
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(5);
                A1Z[1] = "details_";
                A1Z[2] = "accountSignatureKey_";
                A1Z[3] = "accountSignature_";
                A1Z[4] = "deviceSignature_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", A1Z);
            case 3:
                return new AnonymousClass2BI();
            case 4:
                return new AnonymousClass2AV();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass2BI.class) {
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
