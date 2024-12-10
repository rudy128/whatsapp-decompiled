package X;

/* renamed from: X.8bs  reason: invalid class name and case insensitive filesystem */
public final class C165858bs extends C23577Bm6 implements C22356B4k {
    public static final int BUTTONS_FIELD_NUMBER = 9;
    public static final int CONTENT_TEXT_FIELD_NUMBER = 6;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 8;
    public static final C165858bs DEFAULT_INSTANCE;
    public static final int DOCUMENT_MESSAGE_FIELD_NUMBER = 2;
    public static final int FOOTER_TEXT_FIELD_NUMBER = 7;
    public static final int HEADER_TYPE_FIELD_NUMBER = 10;
    public static final int IMAGE_MESSAGE_FIELD_NUMBER = 3;
    public static final int LOCATION_MESSAGE_FIELD_NUMBER = 5;
    public static volatile C22357B4l PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    public static final int VIDEO_MESSAGE_FIELD_NUMBER = 4;
    public int bitField0_;
    public EE9 buttons_ = C23579Bm9.A02;
    public String contentText_ = "";
    public C166278cd contextInfo_;
    public String footerText_ = "";
    public int headerCase_ = 0;
    public int headerType_;
    public Object header_;

    static {
        C165858bs r1 = new C165858bs();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165858bs.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[14];
                objArr[0] = "header_";
                AnonymousClass8BU.A1P(objArr, "headerCase_");
                objArr[3] = C166208cW.class;
                objArr[4] = C166268cc.class;
                objArr[5] = C166248ca.class;
                objArr[6] = C166028cE.class;
                objArr[7] = "contentText_";
                objArr[8] = "footerText_";
                objArr[9] = "contextInfo_";
                objArr[10] = "buttons_";
                objArr[11] = C165228an.class;
                objArr[12] = "headerType_";
                objArr[13] = AK6.A00;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\n\u0001\u0001\u0001\n\n\u0000\u0001\u0000\u0001ျ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ဈ\u0005\u0007ဈ\u0006\bဉ\u0007\t\u001b\nဌ\b", objArr);
            case 3:
                return new C165858bs();
            case 4:
                return new C163728Wc();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165858bs.class) {
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
