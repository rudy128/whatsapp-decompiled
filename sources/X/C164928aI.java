package X;

/* renamed from: X.8aI  reason: invalid class name and case insensitive filesystem */
public final class C164928aI extends C23577Bm6 implements C22356B4k {
    public static final int BACKGROUND_FIELD_NUMBER = 4;
    public static final C164928aI DEFAULT_INSTANCE;
    public static final int NOTE_MESSAGE_FIELD_NUMBER = 2;
    public static volatile C22357B4l PARSER = null;
    public static final int REQUEST_MESSAGE_KEY_FIELD_NUMBER = 3;
    public C165978c9 background_;
    public int bitField0_;
    public C166418cr noteMessage_;
    public C166408cq requestMessageKey_;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.8aI, X.Bm6] */
    static {
        ? bm6 = new C23577Bm6();
        DEFAULT_INSTANCE = bm6;
        C23577Bm6.A0E(bm6, C164928aI.class);
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
                A1Z[1] = "noteMessage_";
                A1Z[2] = "requestMessageKey_";
                A1Z[3] = "background_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", A1Z);
            case 3:
                return new C23577Bm6();
            case 4:
                return new C163058Tn();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164928aI.class) {
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
