package X;

/* renamed from: X.8aJ  reason: invalid class name and case insensitive filesystem */
public final class C164938aJ extends C23577Bm6 implements C22356B4k {
    public static final int ASSOCIATION_TYPE_FIELD_NUMBER = 1;
    public static final C164938aJ DEFAULT_INSTANCE;
    public static final int MESSAGE_INDEX_FIELD_NUMBER = 3;
    public static final int PARENT_MESSAGE_KEY_FIELD_NUMBER = 2;
    public static volatile C22357B4l PARSER;
    public int associationType_;
    public int bitField0_;
    public int messageIndex_;
    public C166408cq parentMessageKey_;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.8aJ, X.Bm6] */
    static {
        ? bm6 = new C23577Bm6();
        DEFAULT_INSTANCE = bm6;
        C23577Bm6.A0E(bm6, C164938aJ.class);
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
                A1a[1] = "associationType_";
                A1a[2] = C20414AKd.A00;
                A1a[3] = "parentMessageKey_";
                A1a[4] = "messageIndex_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002", A1a);
            case 3:
                return new C23577Bm6();
            case 4:
                return new C163118Tt();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164938aJ.class) {
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
