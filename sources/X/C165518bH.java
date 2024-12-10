package X;

/* renamed from: X.8bH  reason: invalid class name and case insensitive filesystem */
public final class C165518bH extends C23577Bm6 implements C22356B4k {
    public static final int CONSENTED_USERS_URL_FIELD_NUMBER = 3;
    public static final C165518bH DEFAULT_INSTANCE;
    public static final int DISPLAY_TEXT_FIELD_NUMBER = 1;
    public static volatile C22357B4l PARSER = null;
    public static final int URL_FIELD_NUMBER = 2;
    public static final int WEBVIEW_INTERACTION_FIELD_NUMBER = 5;
    public static final int WEBVIEW_PRESENTATION_FIELD_NUMBER = 4;
    public int bitField0_;
    public String consentedUsersUrl_ = "";
    public String displayText_ = "";
    public String url_ = "";
    public boolean webviewInteraction_;
    public int webviewPresentation_ = 1;

    static {
        C165518bH r1 = new C165518bH();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165518bH.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(7);
                A1Z[1] = "displayText_";
                A1Z[2] = "url_";
                A1Z[3] = "consentedUsersUrl_";
                A1Z[4] = "webviewPresentation_";
                A1Z[5] = AK0.A00;
                A1Z[6] = "webviewInteraction_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005ဇ\u0004", A1Z);
            case 3:
                return new C165518bH();
            case 4:
                return new AnonymousClass8SI();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165518bH.class) {
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
