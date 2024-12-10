package X;

/* renamed from: X.8ar  reason: invalid class name and case insensitive filesystem */
public final class C165268ar extends C23577Bm6 implements C22356B4k {
    public static final C165268ar DEFAULT_INSTANCE;
    public static final int ENC_IV_FIELD_NUMBER = 3;
    public static final int ENC_PAYLOAD_FIELD_NUMBER = 2;
    public static volatile C22357B4l PARSER = null;
    public static final int SECRET_ENC_TYPE_FIELD_NUMBER = 4;
    public static final int TARGET_MESSAGE_KEY_FIELD_NUMBER = 1;
    public int bitField0_;
    public DSQ encIv_;
    public DSQ encPayload_;
    public int secretEncType_;
    public C166408cq targetMessageKey_;

    static {
        C165268ar r1 = new C165268ar();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165268ar.class);
    }

    public C165268ar() {
        DSQ dsq = DSQ.A00;
        this.encPayload_ = dsq;
        this.encIv_ = dsq;
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1b = AnonymousClass8BW.A1b();
                AnonymousClass8BX.A1P(A1b, "targetMessageKey_");
                A1b[4] = "secretEncType_";
                A1b[5] = C20411AKa.A00;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002\u0004ဌ\u0003", A1b);
            case 3:
                return new C165268ar();
            case 4:
                return new C163048Tm();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165268ar.class) {
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
