package X;

/* renamed from: X.2BK  reason: invalid class name */
public final class AnonymousClass2BK extends C23577Bm6 implements C22356B4k {
    public static final AnonymousClass2BK DEFAULT_INSTANCE;
    public static final int KEY_ID_FIELD_NUMBER = 4;
    public static final int MAC_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER = null;
    public static final int RECORDS_FIELD_NUMBER = 2;
    public static final int VERSION_FIELD_NUMBER = 1;
    public int bitField0_;
    public C164148Xs keyId_;
    public DSQ mac_ = DSQ.A00;
    public EE9 records_ = C23579Bm9.A02;
    public C164178Xv version_;

    static {
        AnonymousClass2BK r1 = new AnonymousClass2BK();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass2BK.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(6);
                A1Z[1] = "version_";
                A1Z[2] = "records_";
                A1Z[3] = AnonymousClass2BG.class;
                A1Z[4] = "mac_";
                A1Z[5] = "keyId_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ည\u0001\u0004ဉ\u0002", A1Z);
            case 3:
                return new AnonymousClass2BK();
            case 4:
                return new C45602As();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass2BK.class) {
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
