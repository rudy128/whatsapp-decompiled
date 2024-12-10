package X;

/* renamed from: X.8ck  reason: invalid class name and case insensitive filesystem */
public final class C166348ck extends C23577Bm6 implements C22356B4k {
    public static final int CONTEXT_INFO_FIELD_NUMBER = 3;
    public static final C166348ck DEFAULT_INSTANCE;
    public static final int FOUR_ROW_TEMPLATE_FIELD_NUMBER = 1;
    public static final int HYDRATED_FOUR_ROW_TEMPLATE_FIELD_NUMBER = 2;
    public static final int HYDRATED_TEMPLATE_FIELD_NUMBER = 4;
    public static final int INTERACTIVE_MESSAGE_TEMPLATE_FIELD_NUMBER = 5;
    public static volatile C22357B4l PARSER = null;
    public static final int TEMPLATE_ID_FIELD_NUMBER = 9;
    public int bitField0_;
    public C166278cd contextInfo_;
    public int formatCase_ = 0;
    public Object format_;
    public C165868bt hydratedTemplate_;
    public String templateId_ = "";

    static {
        C166348ck r1 = new C166348ck();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166348ck.class);
    }

    public C165628bV A0R() {
        if (this.formatCase_ == 1) {
            return (C165628bV) this.format_;
        }
        return C165628bV.DEFAULT_INSTANCE;
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[9];
                objArr[0] = "format_";
                AnonymousClass8BU.A1P(objArr, "formatCase_");
                objArr[3] = C165628bV.class;
                objArr[4] = C165868bt.class;
                objArr[5] = "contextInfo_";
                objArr[6] = "hydratedTemplate_";
                objArr[7] = C166398cp.class;
                objArr[8] = "templateId_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0006\u0001\u0001\u0001\t\u0006\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ဉ\u0003\u0004ဉ\u0004\u0005ြ\u0000\tဈ\u0005", objArr);
            case 3:
                return new C166348ck();
            case 4:
                return new C163918Wv();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166348ck.class) {
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
