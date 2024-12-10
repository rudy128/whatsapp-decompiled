package X;

/* renamed from: X.8a6  reason: invalid class name and case insensitive filesystem */
public final class C164808a6 extends C23577Bm6 implements C22356B4k {
    public static final int BIZ_JID_FIELD_NUMBER = 1;
    public static final C164808a6 DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 2;
    public static final int MESSAGE_VERSION_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER;
    public int bitField0_;
    public String bizJid_ = "";
    public String id_ = "";
    public int messageVersion_ = 1;

    static {
        C164808a6 r1 = new C164808a6();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C164808a6.class);
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
                AnonymousClass8BU.A1O(A1Z, "bizJid_");
                A1Z[3] = "messageVersion_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002", A1Z);
            case 3:
                return new C164808a6();
            case 4:
                return new C162918Sz();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164808a6.class) {
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
