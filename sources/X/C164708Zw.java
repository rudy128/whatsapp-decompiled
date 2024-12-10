package X;

/* renamed from: X.8Zw  reason: invalid class name and case insensitive filesystem */
public final class C164708Zw extends C23577Bm6 implements C22356B4k {
    public static final C164708Zw DEFAULT_INSTANCE;
    public static final int ENCRYPTED_SIGNAL_TOKEN_CONSENTED_FIELD_NUMBER = 2;
    public static final int PARAMETERS_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER = null;
    public static final int SHOW_MM_DISCLOSURE_FIELD_NUMBER = 1;
    public int bitField0_;
    public String encryptedSignalTokenConsented_ = "";
    public EE9 parameters_ = C23579Bm9.A02;
    public boolean showMmDisclosure_;

    static {
        C164708Zw r1 = new C164708Zw();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C164708Zw.class);
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
                A1a[1] = "showMmDisclosure_";
                A1a[2] = "encryptedSignalTokenConsented_";
                A1a[3] = "parameters_";
                A1a[4] = C165498bF.class;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003\u001b", A1a);
            case 3:
                return new C164708Zw();
            case 4:
                return new AnonymousClass8S5();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164708Zw.class) {
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
