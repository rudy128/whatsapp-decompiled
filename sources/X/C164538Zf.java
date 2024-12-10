package X;

/* renamed from: X.8Zf  reason: invalid class name and case insensitive filesystem */
public final class C164538Zf extends C23577Bm6 implements C22356B4k {
    public static final int APP_CACHED_FIELD_NUMBER = 16;
    public static final C164538Zf DEFAULT_INSTANCE;
    public static final int DNS_METHOD_FIELD_NUMBER = 15;
    public static volatile C22357B4l PARSER;
    public boolean appCached_;
    public int bitField0_;
    public int dnsMethod_;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.8Zf, X.Bm6] */
    static {
        ? bm6 = new C23577Bm6();
        DEFAULT_INSTANCE = bm6;
        C23577Bm6.A0E(bm6, C164538Zf.class);
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
                A1Z[1] = "dnsMethod_";
                A1Z[2] = AL7.A00;
                A1Z[3] = "appCached_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u000f\u0010\u0002\u0000\u0000\u0000\u000fဌ\u0000\u0010ဇ\u0001", A1Z);
            case 3:
                return new C23577Bm6();
            case 4:
                return new C163658Vv();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164538Zf.class) {
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
