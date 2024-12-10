package X;

/* renamed from: X.8bW  reason: invalid class name and case insensitive filesystem */
public final class C165638bW extends C23577Bm6 implements C22356B4k {
    public static final C165638bW DEFAULT_INSTANCE;
    public static final int DOCUMENT_MESSAGE_FIELD_NUMBER = 3;
    public static final int HAS_MEDIA_ATTACHMENT_FIELD_NUMBER = 5;
    public static final int IMAGE_MESSAGE_FIELD_NUMBER = 4;
    public static final int JPEG_THUMBNAIL_FIELD_NUMBER = 6;
    public static final int LOCATION_MESSAGE_FIELD_NUMBER = 8;
    public static volatile C22357B4l PARSER = null;
    public static final int PRODUCT_MESSAGE_FIELD_NUMBER = 9;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int VIDEO_MESSAGE_FIELD_NUMBER = 7;
    public int bitField0_;
    public boolean hasMediaAttachment_;
    public int mediaCase_ = 0;
    public Object media_;
    public String subtitle_ = "";
    public String title_ = "";

    static {
        C165638bW r1 = new C165638bW();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165638bW.class);
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
                objArr[0] = "media_";
                AnonymousClass8BU.A1P(objArr, "mediaCase_");
                objArr[3] = "title_";
                objArr[4] = "subtitle_";
                objArr[5] = C166208cW.class;
                objArr[6] = C166268cc.class;
                objArr[7] = "hasMediaAttachment_";
                objArr[8] = C166248ca.class;
                objArr[9] = C166028cE.class;
                objArr[10] = C165688bb.class;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\t\u0001\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ြ\u0000\u0004ြ\u0000\u0005ဇ\b\u0006ွ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000", objArr);
            case 3:
                return new C165638bW();
            case 4:
                return new AnonymousClass8X3();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165638bW.class) {
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
