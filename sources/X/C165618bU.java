package X;

/* renamed from: X.8bU  reason: invalid class name and case insensitive filesystem */
public final class C165618bU extends C23577Bm6 implements C22356B4k {
    public static final C165618bU DEFAULT_INSTANCE;
    public static final int EMBEDDED_ACTION_FIELD_NUMBER = 6;
    public static final int EMBEDDED_CONTENT_FIELD_NUMBER = 5;
    public static final int LOCATION_FIELD_NUMBER = 2;
    public static final int NEWSLETTER_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER = null;
    public static final int POLYGONVERTICES_FIELD_NUMBER = 1;
    public static final int SHOULD_SKIP_CONFIRMATION_FIELD_NUMBER = 4;
    public static final int TAPACTION_FIELD_NUMBER = 7;
    public int actionCase_ = 0;
    public Object action_;
    public int bitField0_;
    public C164398Yr embeddedContent_;
    public EE9 polygonVertices_ = C23579Bm9.A02;
    public boolean shouldSkipConfirmation_;

    static {
        C165618bU r1 = new C165618bU();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165618bU.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[10];
                objArr[0] = "action_";
                AnonymousClass8BU.A1P(objArr, "actionCase_");
                objArr[3] = "polygonVertices_";
                objArr[4] = C165278as.class;
                objArr[5] = C164718Zx.class;
                objArr[6] = C165508bG.class;
                objArr[7] = "shouldSkipConfirmation_";
                objArr[8] = "embeddedContent_";
                objArr[9] = AnonymousClass8ZI.class;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002ြ\u0000\u0003ြ\u0000\u0004ဇ\u0004\u0005ဉ\u0005\u0006်\u0000\u0007ြ\u0000", objArr);
            case 3:
                return new C165618bU();
            case 4:
                return new AnonymousClass8SJ();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165618bU.class) {
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
