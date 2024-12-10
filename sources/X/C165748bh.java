package X;

/* renamed from: X.8bh  reason: invalid class name and case insensitive filesystem */
public final class C165748bh extends C23577Bm6 implements C22356B4k {
    public static final int ABRSETTINGS_FIELD_NUMBER = 2;
    public static final int APPLICATIONNAME_FIELD_NUMBER = 6;
    public static final int APPLICATIONTYPE_FIELD_NUMBER = 4;
    public static final int CONNECTIVITYSETTINGS_FIELD_NUMBER = 1;
    public static final C165748bh DEFAULT_INSTANCE;
    public static final int OVERRIDESETTINGS_FIELD_NUMBER = 5;
    public static volatile C22357B4l PARSER = null;
    public static final int SUPPORTEDVERSIONS_FIELD_NUMBER = 7;
    public static final int TIMERSETTINGS_FIELD_NUMBER = 3;
    public C165848br abrSettings_;
    public String applicationName_ = "";
    public int applicationType_;
    public C164228Ya connectivitySettings_;
    public C23648BnH overrideSettings_;
    public C164238Yb supportedVersions_;
    public C164248Yc timerSettings_;

    static {
        C165748bh r1 = new C165748bh();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165748bh.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\f\u0005\t\u0006Ȉ\u0007\t", new Object[]{"connectivitySettings_", "abrSettings_", "timerSettings_", "applicationType_", "overrideSettings_", "applicationName_", "supportedVersions_"});
            case 3:
                return new C165748bh();
            case 4:
                return new AnonymousClass8RV();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165748bh.class) {
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
