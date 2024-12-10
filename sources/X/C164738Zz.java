package X;

/* renamed from: X.8Zz  reason: invalid class name and case insensitive filesystem */
public final class C164738Zz extends C23577Bm6 implements C22356B4k {
    public static final int CONTEXT_INFO_FIELD_NUMBER = 17;
    public static final C164738Zz DEFAULT_INSTANCE;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 1;
    public static volatile C22357B4l PARSER = null;
    public static final int VCARD_FIELD_NUMBER = 16;
    public int bitField0_;
    public C166278cd contextInfo_;
    public String displayName_ = "";
    public String vcard_ = "";

    static {
        C164738Zz r1 = new C164738Zz();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C164738Zz.class);
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
                A1Z[1] = "displayName_";
                A1Z[2] = "vcard_";
                A1Z[3] = "contextInfo_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0011\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0010ဈ\u0001\u0011ဉ\u0002", A1Z);
            case 3:
                return new C164738Zz();
            case 4:
                return new C162708Se();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164738Zz.class) {
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
