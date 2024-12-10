package X;

/* renamed from: X.8b6  reason: invalid class name and case insensitive filesystem */
public final class C165408b6 extends C23577Bm6 implements C22356B4k {
    public static final int CONTEXT_INFO_FIELD_NUMBER = 3;
    public static final C165408b6 DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER = null;
    public static final int SELECTED_BUTTON_ID_FIELD_NUMBER = 1;
    public static final int SELECTED_DISPLAY_TEXT_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 4;
    public int bitField0_;
    public C166278cd contextInfo_;
    public int responseCase_ = 0;
    public Object response_;
    public String selectedButtonId_ = "";
    public int type_;

    static {
        C165408b6 r1 = new C165408b6();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165408b6.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[7];
                objArr[0] = "response_";
                AnonymousClass8BU.A1P(objArr, "responseCase_");
                objArr[3] = "selectedButtonId_";
                objArr[4] = "contextInfo_";
                objArr[5] = "type_";
                objArr[6] = AK7.A00;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ျ\u0000\u0003ဉ\u0002\u0004ဌ\u0003", objArr);
            case 3:
                return new C165408b6();
            case 4:
                return new AnonymousClass8SX();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165408b6.class) {
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
