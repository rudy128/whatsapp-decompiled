package X;

/* renamed from: X.8ak  reason: invalid class name and case insensitive filesystem */
public final class C165198ak extends C23577Bm6 implements C22356B4k {
    public static final int ADVERTISER_NAME_FIELD_NUMBER = 1;
    public static final int CAPTION_FIELD_NUMBER = 17;
    public static final C165198ak DEFAULT_INSTANCE;
    public static final int JPEG_THUMBNAIL_FIELD_NUMBER = 16;
    public static final int MEDIA_TYPE_FIELD_NUMBER = 2;
    public static volatile C22357B4l PARSER;
    public String advertiserName_ = "";
    public int bitField0_;
    public String caption_ = "";
    public DSQ jpegThumbnail_ = DSQ.A00;
    public int mediaType_;

    static {
        C165198ak r1 = new C165198ak();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165198ak.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1b = AnonymousClass8BW.A1b();
                A1b[1] = "advertiserName_";
                A1b[2] = "mediaType_";
                A1b[3] = C20405AJu.A00;
                A1b[4] = "jpegThumbnail_";
                A1b[5] = "caption_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0011\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0010ည\u0002\u0011ဈ\u0003", A1b);
            case 3:
                return new C165198ak();
            case 4:
                return new AnonymousClass8S2();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165198ak.class) {
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
