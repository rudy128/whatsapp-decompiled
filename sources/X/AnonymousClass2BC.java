package X;

/* renamed from: X.2BC  reason: invalid class name */
public final class AnonymousClass2BC extends C23577Bm6 implements C22356B4k {
    public static final AnonymousClass2BC DEFAULT_INSTANCE;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 2;
    public static volatile C22357B4l PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 1;
    public static final int REF_FIELD_NUMBER = 3;
    public int bitField0_;
    public int deviceType_;
    public DSQ publicKey_ = DSQ.A00;
    public String ref_ = "";

    static {
        AnonymousClass2BC r1 = new AnonymousClass2BC();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass2BC.class);
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
                A1Z[1] = "publicKey_";
                A1Z[2] = "deviceType_";
                A1Z[3] = C65682ww.A00;
                A1Z[4] = "ref_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ဌ\u0001\u0003ဈ\u0002", A1Z);
            case 3:
                return new AnonymousClass2BC();
            case 4:
                return new AnonymousClass2AY();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass2BC.class) {
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
