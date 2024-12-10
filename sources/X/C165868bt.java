package X;

/* renamed from: X.8bt  reason: invalid class name and case insensitive filesystem */
public final class C165868bt extends C23577Bm6 implements C22356B4k {
    public static final C165868bt DEFAULT_INSTANCE;
    public static final int DOCUMENT_MESSAGE_FIELD_NUMBER = 1;
    public static final int HYDRATED_BUTTONS_FIELD_NUMBER = 8;
    public static final int HYDRATED_CONTENT_TEXT_FIELD_NUMBER = 6;
    public static final int HYDRATED_FOOTER_TEXT_FIELD_NUMBER = 7;
    public static final int HYDRATED_TITLE_TEXT_FIELD_NUMBER = 2;
    public static final int IMAGE_MESSAGE_FIELD_NUMBER = 3;
    public static final int LOCATION_MESSAGE_FIELD_NUMBER = 5;
    public static final int MASK_LINKED_DEVICES_FIELD_NUMBER = 10;
    public static volatile C22357B4l PARSER = null;
    public static final int TEMPLATE_ID_FIELD_NUMBER = 9;
    public static final int VIDEO_MESSAGE_FIELD_NUMBER = 4;
    public int bitField0_;
    public EE9 hydratedButtons_ = C23579Bm9.A02;
    public String hydratedContentText_ = "";
    public String hydratedFooterText_ = "";
    public boolean maskLinkedDevices_;
    public String templateId_ = "";
    public int titleCase_ = 0;
    public Object title_;

    static {
        C165868bt r1 = new C165868bt();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165868bt.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[13];
                objArr[0] = "title_";
                AnonymousClass8BU.A1P(objArr, "titleCase_");
                objArr[3] = C166208cW.class;
                objArr[4] = C166268cc.class;
                objArr[5] = C166248ca.class;
                objArr[6] = C166028cE.class;
                objArr[7] = "hydratedContentText_";
                objArr[8] = "hydratedFooterText_";
                objArr[9] = "hydratedButtons_";
                objArr[10] = C166318ch.class;
                objArr[11] = "templateId_";
                objArr[12] = "maskLinkedDevices_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\n\u0001\u0001\u0001\n\n\u0000\u0001\u0000\u0001ြ\u0000\u0002ျ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ဈ\u0005\u0007ဈ\u0006\b\u001b\tဈ\u0007\nဇ\b", objArr);
            case 3:
                return new C165868bt();
            case 4:
                return new C163108Ts();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165868bt.class) {
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
