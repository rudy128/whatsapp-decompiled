package X;

/* renamed from: X.8ad  reason: invalid class name and case insensitive filesystem */
public final class C165128ad extends C23577Bm6 implements C22356B4k {
    public static final int BASEKEY_FIELD_NUMBER = 2;
    public static final C165128ad DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER = null;
    public static final int PREKEYID_FIELD_NUMBER = 1;
    public static final int SIGNEDPREKEYID_FIELD_NUMBER = 3;
    public DSQ baseKey_ = DSQ.A00;
    public int bitField0_;
    public int preKeyId_;
    public int signedPreKeyId_;

    static {
        C165128ad r1 = new C165128ad();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165128ad.class);
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
                A1Z[1] = "preKeyId_";
                A1Z[2] = "baseKey_";
                A1Z[3] = "signedPreKeyId_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ည\u0002\u0003င\u0001", A1Z);
            case 3:
                return new C165128ad();
            case 4:
                return new C163718Wb();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165128ad.class) {
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
