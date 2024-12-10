package X;

/* renamed from: X.8cp  reason: invalid class name and case insensitive filesystem */
public final class C166398cp extends C23577Bm6 implements C22356B4k {
    public static final int BODY_FIELD_NUMBER = 2;
    public static final int CAROUSEL_MESSAGE_FIELD_NUMBER = 7;
    public static final int COLLECTION_MESSAGE_FIELD_NUMBER = 5;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 15;
    public static final C166398cp DEFAULT_INSTANCE;
    public static final int FOOTER_FIELD_NUMBER = 3;
    public static final int HEADER_FIELD_NUMBER = 1;
    public static final int NATIVE_FLOW_MESSAGE_FIELD_NUMBER = 6;
    public static volatile C22357B4l PARSER = null;
    public static final int SHOP_STOREFRONT_MESSAGE_FIELD_NUMBER = 4;
    public int bitField0_;
    public C164018Xf body_;
    public C166278cd contextInfo_;
    public C164028Xg footer_;
    public C165638bW header_;
    public int interactiveMessageCase_ = 0;
    public Object interactiveMessage_;

    static {
        C166398cp r1 = new C166398cp();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166398cp.class);
    }

    public AnonymousClass8Z2 A0R() {
        if (this.interactiveMessageCase_ == 7) {
            return (AnonymousClass8Z2) this.interactiveMessage_;
        }
        return AnonymousClass8Z2.DEFAULT_INSTANCE;
    }

    public C164818a7 A0S() {
        if (this.interactiveMessageCase_ == 6) {
            return (C164818a7) this.interactiveMessage_;
        }
        return C164818a7.DEFAULT_INSTANCE;
    }

    public Integer A0T() {
        int i = this.interactiveMessageCase_;
        if (i == 0) {
            return AnonymousClass00R.A0Y;
        }
        if (i == 4) {
            return AnonymousClass00R.A00;
        }
        if (i == 5) {
            return AnonymousClass00R.A01;
        }
        if (i == 6) {
            return AnonymousClass00R.A0C;
        }
        if (i != 7) {
            return null;
        }
        return AnonymousClass00R.A0N;
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[11];
                objArr[0] = "interactiveMessage_";
                AnonymousClass8BU.A1P(objArr, "interactiveMessageCase_");
                objArr[3] = "header_";
                objArr[4] = "body_";
                objArr[5] = "footer_";
                objArr[6] = C164828a8.class;
                objArr[7] = C164808a6.class;
                objArr[8] = C164818a7.class;
                objArr[9] = AnonymousClass8Z2.class;
                objArr[10] = "contextInfo_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\b\u0001\u0001\u0001\u000f\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\u000fဉ\u0007", objArr);
            case 3:
                return new C166398cp();
            case 4:
                return new C163878Wr();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166398cp.class) {
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
