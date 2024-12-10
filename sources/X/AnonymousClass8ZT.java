package X;

/* renamed from: X.8ZT  reason: invalid class name */
public final class AnonymousClass8ZT extends C23577Bm6 implements C22356B4k {
    public static final int CALL_RESULT_FIELD_NUMBER = 2;
    public static final AnonymousClass8ZT DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER = null;
    public static final int USER_JID_FIELD_NUMBER = 1;
    public int bitField0_;
    public int callResult_;
    public String userJid_ = "";

    static {
        AnonymousClass8ZT r1 = new AnonymousClass8ZT();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass8ZT.class);
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
                A1Z[1] = "userJid_";
                A1Z[2] = "callResult_";
                A1Z[3] = C20432AKv.A00;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", A1Z);
            case 3:
                return new AnonymousClass8ZT();
            case 4:
                return new C163328Uo();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass8ZT.class) {
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
