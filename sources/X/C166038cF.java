package X;

/* renamed from: X.8cF  reason: invalid class name and case insensitive filesystem */
public final class C166038cF extends C23577Bm6 implements C22356B4k {
    public static final int CURRENCY_CODE_FIELD_NUMBER = 5;
    public static final C166038cF DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int FIRST_IMAGE_ID_FIELD_NUMBER = 11;
    public static volatile C22357B4l PARSER = null;
    public static final int PRICE_AMOUNT_1000_FIELD_NUMBER = 6;
    public static final int PRODUCT_ID_FIELD_NUMBER = 2;
    public static final int PRODUCT_IMAGE_COUNT_FIELD_NUMBER = 9;
    public static final int PRODUCT_IMAGE_FIELD_NUMBER = 1;
    public static final int RETAILER_ID_FIELD_NUMBER = 7;
    public static final int SALE_PRICE_AMOUNT_1000_FIELD_NUMBER = 12;
    public static final int SIGNED_URL_FIELD_NUMBER = 13;
    public static final int TITLE_FIELD_NUMBER = 3;
    public static final int URL_FIELD_NUMBER = 8;
    public int bitField0_;
    public String currencyCode_ = "";
    public String description_ = "";
    public String firstImageId_ = "";
    public long priceAmount1000_;
    public String productId_ = "";
    public int productImageCount_;
    public C166268cc productImage_;
    public String retailerId_ = "";
    public long salePriceAmount1000_;
    public String signedUrl_ = "";
    public String title_ = "";
    public String url_ = "";

    static {
        C166038cF r1 = new C166038cF();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166038cF.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(13);
                A1Z[1] = "productImage_";
                A1Z[2] = "productId_";
                A1Z[3] = "title_";
                A1Z[4] = "description_";
                A1Z[5] = "currencyCode_";
                A1Z[6] = "priceAmount1000_";
                A1Z[7] = "retailerId_";
                A1Z[8] = "url_";
                A1Z[9] = "productImageCount_";
                A1Z[10] = "firstImageId_";
                A1Z[11] = "salePriceAmount1000_";
                A1Z[12] = "signedUrl_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဈ\u0006\bဈ\u0007\tဋ\b\u000bဈ\t\fဂ\n\rဈ\u000b", A1Z);
            case 3:
                return new C166038cF();
            case 4:
                return new C162988Tg();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166038cF.class) {
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
