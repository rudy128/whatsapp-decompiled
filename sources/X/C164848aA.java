package X;

/* renamed from: X.8aA  reason: invalid class name and case insensitive filesystem */
public final class C164848aA extends C23577Bm6 implements C22356B4k {
    public static final C164848aA DEFAULT_INSTANCE;
    public static final int KEEP_TYPE_FIELD_NUMBER = 2;
    public static final int KEY_FIELD_NUMBER = 1;
    public static volatile C22357B4l PARSER = null;
    public static final int TIMESTAMP_MS_FIELD_NUMBER = 3;
    public int bitField0_;
    public int keepType_;
    public C166408cq key_;
    public long timestampMs_;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Bm6, X.8aA] */
    static {
        ? bm6 = new C23577Bm6();
        DEFAULT_INSTANCE = bm6;
        C23577Bm6.A0E(bm6, C164848aA.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1a = AnonymousClass8BW.A1a();
                A1a[1] = "key_";
                A1a[2] = "keepType_";
                A1a[3] = AK1.A00;
                A1a[4] = "timestampMs_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဂ\u0002", A1a);
            case 3:
                return new C23577Bm6();
            case 4:
                return new AnonymousClass8T4();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164848aA.class) {
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
