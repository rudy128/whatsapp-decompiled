package X;

/* renamed from: X.8bw  reason: invalid class name and case insensitive filesystem */
public final class C165898bw extends C23577Bm6 implements C22356B4k {
    public static final int CANONICAL_URL_FIELD_NUMBER = 5;
    public static final C165898bw DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int HQ_THUMBNAIL_FIELD_NUMBER = 8;
    public static final int MATCH_TEXT_FIELD_NUMBER = 6;
    public static volatile C22357B4l PARSER = null;
    public static final int PREVIEW_TYPE_FIELD_NUMBER = 7;
    public static final int THUMB_DATA_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int URL_FIELD_NUMBER = 1;
    public int bitField0_;
    public String canonicalUrl_ = "";
    public String description_ = "";
    public C165808bn hqThumbnail_;
    public String matchText_ = "";
    public String previewType_ = "";
    public DSQ thumbData_ = DSQ.A00;
    public String title_ = "";
    public String url_ = "";

    static {
        C165898bw r1 = new C165898bw();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165898bw.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(9);
                A1Z[1] = "url_";
                A1Z[2] = "title_";
                A1Z[3] = "description_";
                A1Z[4] = "thumbData_";
                A1Z[5] = "canonicalUrl_";
                A1Z[6] = "matchText_";
                A1Z[7] = "previewType_";
                A1Z[8] = "hqThumbnail_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဉ\u0007", A1Z);
            case 3:
                return new C165898bw();
            case 4:
                return new AnonymousClass8TS();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165898bw.class) {
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
