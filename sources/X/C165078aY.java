package X;

/* renamed from: X.8aY  reason: invalid class name and case insensitive filesystem */
public final class C165078aY extends C23577Bm6 implements C22356B4k {
    public static final int CLIENT_FINISH_FIELD_NUMBER = 4;
    public static final int CLIENT_HELLO_FIELD_NUMBER = 2;
    public static final C165078aY DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER = null;
    public static final int SERVER_HELLO_FIELD_NUMBER = 3;
    public int bitField0_;
    public C164548Zg clientFinish_;
    public C165058aW clientHello_;
    public C165068aX serverHello_;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.8aY, X.Bm6] */
    static {
        ? bm6 = new C23577Bm6();
        DEFAULT_INSTANCE = bm6;
        C23577Bm6.A0E(bm6, C165078aY.class);
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
                A1Z[1] = "clientHello_";
                A1Z[2] = "serverHello_";
                A1Z[3] = "clientFinish_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", A1Z);
            case 3:
                return new C23577Bm6();
            case 4:
                return new C163698Vz();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165078aY.class) {
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
