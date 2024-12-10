package X;

/* renamed from: X.8aL  reason: invalid class name */
public final class AnonymousClass8aL extends C23577Bm6 implements C22356B4k {
    public static final AnonymousClass8aL DEFAULT_INSTANCE;
    public static final int LEAVE_REASON_FIELD_NUMBER = 2;
    public static final int LEAVE_TS_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER = null;
    public static final int USER_JID_FIELD_NUMBER = 1;
    public int bitField0_;
    public int leaveReason_;
    public long leaveTs_;
    public String userJid_ = "";

    static {
        AnonymousClass8aL r1 = new AnonymousClass8aL();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass8aL.class);
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
                A1a[1] = "userJid_";
                A1a[2] = "leaveReason_";
                A1a[3] = C20425AKo.A00;
                A1a[4] = "leaveTs_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဃ\u0002", A1a);
            case 3:
                return new AnonymousClass8aL();
            case 4:
                return new AnonymousClass8UH();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass8aL.class) {
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
