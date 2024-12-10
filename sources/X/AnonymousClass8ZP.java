package X;

/* renamed from: X.8ZP  reason: invalid class name */
public final class AnonymousClass8ZP extends C23577Bm6 implements C22356B4k {
    public static final AnonymousClass8ZP DEFAULT_INSTANCE;
    public static final int LID_JID_FIELD_NUMBER = 2;
    public static volatile C22357B4l PARSER = null;
    public static final int PN_JID_FIELD_NUMBER = 1;
    public int bitField0_;
    public String lidJid_ = "";
    public String pnJid_ = "";

    static {
        AnonymousClass8ZP r1 = new AnonymousClass8ZP();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass8ZP.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Y = AnonymousClass8BW.A1Y();
                A1Y[1] = "pnJid_";
                A1Y[2] = "lidJid_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", A1Y);
            case 3:
                return new AnonymousClass8ZP();
            case 4:
                return new AnonymousClass8UJ();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass8ZP.class) {
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
