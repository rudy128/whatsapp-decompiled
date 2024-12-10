package X;

/* renamed from: X.8aN  reason: invalid class name and case insensitive filesystem */
public final class C164968aN extends C23577Bm6 implements C22356B4k {
    public static final C164968aN DEFAULT_INSTANCE;
    public static final int HANDSHAKE_MATERIAL_FIELD_NUMBER = 2;
    public static final int IPLS_CLIENT_SECRET_DATA_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER = null;
    public static final int REQUEST_TYPE_FIELD_NUMBER = 1;
    public int bitField0_;
    public AnonymousClass8c0 handshakeMaterial_;
    public AnonymousClass8XI iplsClientSecretData_;
    public int requestType_;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.8aN, X.Bm6] */
    static {
        ? bm6 = new C23577Bm6();
        DEFAULT_INSTANCE = bm6;
        C23577Bm6.A0E(bm6, C164968aN.class);
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
                A1Z[1] = "requestType_";
                A1Z[2] = "handshakeMaterial_";
                A1Z[3] = "iplsClientSecretData_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", A1Z);
            case 3:
                return new C23577Bm6();
            case 4:
                return new AnonymousClass8UN();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164968aN.class) {
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
