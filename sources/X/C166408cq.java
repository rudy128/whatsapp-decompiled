package X;

/* renamed from: X.8cq  reason: invalid class name and case insensitive filesystem */
public final class C166408cq extends C23577Bm6 implements C22356B4k {
    public static final C166408cq DEFAULT_INSTANCE;
    public static final int FROM_ME_FIELD_NUMBER = 2;
    public static final int ID_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER = null;
    public static final int PARTICIPANT_FIELD_NUMBER = 4;
    public static final int REMOTE_JID_FIELD_NUMBER = 1;
    public int bitField0_;
    public boolean fromMe_;
    public String id_ = "";
    public String participant_ = "";
    public String remoteJid_ = "";

    static {
        C166408cq r1 = new C166408cq();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166408cq.class);
    }

    public static AnonymousClass8X7 A00() {
        return (AnonymousClass8X7) DEFAULT_INSTANCE.A0N();
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
                A1a[1] = "remoteJid_";
                A1a[2] = "fromMe_";
                A1a[3] = "id_";
                A1a[4] = "participant_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", A1a);
            case 3:
                return new C166408cq();
            case 4:
                return new AnonymousClass8X7();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166408cq.class) {
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
