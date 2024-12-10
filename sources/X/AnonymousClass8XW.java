package X;

/* renamed from: X.8XW  reason: invalid class name */
public final class AnonymousClass8XW extends C23577Bm6 implements C22356B4k {
    public static final int BUSINESS_OWNER_JID_FIELD_NUMBER = 1;
    public static final AnonymousClass8XW DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER;
    public int bitField0_;
    public String businessOwnerJid_ = "";

    static {
        AnonymousClass8XW r1 = new AnonymousClass8XW();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass8XW.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1X = AnonymousClass8BW.A1X();
                A1X[1] = "businessOwnerJid_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", A1X);
            case 3:
                return new AnonymousClass8XW();
            case 4:
                return new AnonymousClass8S4();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass8XW.class) {
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
