package X;

/* renamed from: X.8a3  reason: invalid class name and case insensitive filesystem */
public final class C164778a3 extends C23577Bm6 implements C22356B4k {
    public static final C164778a3 DEFAULT_INSTANCE;
    public static final int ENC_IV_FIELD_NUMBER = 3;
    public static final int ENC_PAYLOAD_FIELD_NUMBER = 2;
    public static final int EVENT_CREATION_MESSAGE_KEY_FIELD_NUMBER = 1;
    public static volatile C22357B4l PARSER;
    public int bitField0_;
    public DSQ encIv_;
    public DSQ encPayload_;
    public C166408cq eventCreationMessageKey_;

    static {
        C164778a3 r1 = new C164778a3();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C164778a3.class);
    }

    public C164778a3() {
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
                Object[] A1Z = AnonymousClass8BW.A1Z();
                AnonymousClass8BX.A1P(A1Z, "eventCreationMessageKey_");
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", A1Z);
            case 3:
                return new C164778a3();
            case 4:
                return new C162768Sk();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164778a3.class) {
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
