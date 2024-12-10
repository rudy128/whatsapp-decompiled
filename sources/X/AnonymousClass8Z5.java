package X;

/* renamed from: X.8Z5  reason: invalid class name */
public final class AnonymousClass8Z5 extends C23577Bm6 implements C22356B4k {
    public static final AnonymousClass8Z5 DEFAULT_INSTANCE;
    public static final int JPEG_THUMBNAIL_FIELD_NUMBER = 2;
    public static volatile C22357B4l PARSER = null;
    public static final int PRODUCT_ID_FIELD_NUMBER = 1;
    public int bitField0_;
    public DSQ jpegThumbnail_ = DSQ.A00;
    public String productId_ = "";

    static {
        AnonymousClass8Z5 r1 = new AnonymousClass8Z5();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass8Z5.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Y = AnonymousClass8BW.A1Y();
                A1Y[1] = "productId_";
                A1Y[2] = "jpegThumbnail_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", A1Y);
            case 3:
                return new AnonymousClass8Z5();
            case 4:
                return new AnonymousClass8T7();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass8Z5.class) {
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
