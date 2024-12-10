package X;

/* renamed from: X.8Yw  reason: invalid class name and case insensitive filesystem */
public final class C164448Yw extends C23577Bm6 implements C22356B4k {
    public static final int COLLECTION_NAMES_FIELD_NUMBER = 1;
    public static final C164448Yw DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    public int bitField0_;
    public EE9 collectionNames_ = C23579Bm9.A02;
    public long timestamp_;

    static {
        C164448Yw r1 = new C164448Yw();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C164448Yw.class);
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
                A1Y[1] = "collectionNames_";
                A1Y[2] = "timestamp_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဂ\u0000", A1Y);
            case 3:
                return new C164448Yw();
            case 4:
                return new AnonymousClass8SN();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164448Yw.class) {
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
