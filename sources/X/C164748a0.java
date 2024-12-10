package X;

/* renamed from: X.8a0  reason: invalid class name and case insensitive filesystem */
public final class C164748a0 extends C23577Bm6 implements C22356B4k {
    public static final int CONTACTS_FIELD_NUMBER = 2;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 17;
    public static final C164748a0 DEFAULT_INSTANCE;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 1;
    public static volatile C22357B4l PARSER;
    public int bitField0_;
    public EE9 contacts_ = C23579Bm9.A02;
    public C166278cd contextInfo_;
    public String displayName_ = "";

    static {
        C164748a0 r1 = new C164748a0();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C164748a0.class);
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
                A1a[1] = "displayName_";
                A1a[2] = "contacts_";
                A1a[3] = C164738Zz.class;
                A1a[4] = "contextInfo_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0011\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0011ဉ\u0001", A1a);
            case 3:
                return new C164748a0();
            case 4:
                return new C162718Sf();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164748a0.class) {
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
