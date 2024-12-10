package X;

/* renamed from: X.8bG  reason: invalid class name and case insensitive filesystem */
public final class C165508bG extends C23577Bm6 implements C22356B4k {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 5;
    public static final int CONTENT_TYPE_FIELD_NUMBER = 4;
    public static final C165508bG DEFAULT_INSTANCE;
    public static final int NEWSLETTER_JID_FIELD_NUMBER = 1;
    public static final int NEWSLETTER_NAME_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER = null;
    public static final int SERVER_MESSAGE_ID_FIELD_NUMBER = 2;
    public String accessibilityText_ = "";
    public int bitField0_;
    public int contentType_ = 1;
    public String newsletterJid_ = "";
    public String newsletterName_ = "";
    public int serverMessageId_;

    static {
        C165508bG r1 = new C165508bG();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165508bG.class);
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
                A1Z[1] = "newsletterJid_";
                A1Z[2] = "serverMessageId_";
                A1Z[3] = "newsletterName_";
                A1Z[4] = "contentType_";
                A1Z[5] = C20407AJw.A00;
                A1Z[6] = "accessibilityText_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005ဈ\u0004", A1Z);
            case 3:
                return new C165508bG();
            case 4:
                return new AnonymousClass8S9();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165508bG.class) {
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
