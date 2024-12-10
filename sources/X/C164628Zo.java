package X;

/* renamed from: X.8Zo  reason: invalid class name and case insensitive filesystem */
public final class C164628Zo extends C23577Bm6 implements C22356B4k {
    public static final C164628Zo DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER = null;
    public static final int PRIVATE_FIELD_NUMBER = 2;
    public static final int PUBLIC_FIELD_NUMBER = 1;
    public int bitField0_;
    public DSQ private_;
    public DSQ public_;

    static {
        C164628Zo r1 = new C164628Zo();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C164628Zo.class);
    }

    public C164628Zo() {
        DSQ dsq = DSQ.A00;
        this.public_ = dsq;
        this.private_ = dsq;
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Y = AnonymousClass8BW.A1Y();
                A1Y[1] = "public_";
                A1Y[2] = "private_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", A1Y);
            case 3:
                return new C164628Zo();
            case 4:
                return new AnonymousClass8WZ();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164628Zo.class) {
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
