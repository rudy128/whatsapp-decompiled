package X;

/* renamed from: X.2BM  reason: invalid class name */
public final class AnonymousClass2BM extends C23577Bm6 implements C22356B4k {
    public static final int ACCOUNT_TYPE_FIELD_NUMBER = 4;
    public static final AnonymousClass2BM DEFAULT_INSTANCE;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 5;
    public static final int KEY_INDEX_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER = null;
    public static final int RAW_ID_FIELD_NUMBER = 1;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    public int accountType_;
    public int bitField0_;
    public int deviceType_;
    public int keyIndex_;
    public int rawId_;
    public long timestamp_;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.2BM, X.Bm6] */
    static {
        ? bm6 = new C23577Bm6();
        DEFAULT_INSTANCE = bm6;
        C23577Bm6.A0E(bm6, AnonymousClass2BM.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(8);
                A1Z[1] = "rawId_";
                A1Z[2] = "timestamp_";
                A1Z[3] = "keyIndex_";
                A1Z[4] = "accountType_";
                E69 e69 = C65672wv.A00;
                A1Z[5] = e69;
                A1Z[6] = "deviceType_";
                A1Z[7] = e69;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဃ\u0001\u0003ဋ\u0002\u0004ဌ\u0003\u0005ဌ\u0004", A1Z);
            case 3:
                return new C23577Bm6();
            case 4:
                return new AnonymousClass2AT();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass2BM.class) {
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
