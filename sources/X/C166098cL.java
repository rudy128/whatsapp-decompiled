package X;

/* renamed from: X.8cL  reason: invalid class name and case insensitive filesystem */
public final class C166098cL extends C23577Bm6 implements C22356B4k {
    public static final int CATALOG_TYPE_FIELD_NUMBER = 15;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 17;
    public static final C166098cL DEFAULT_INSTANCE;
    public static final int ITEM_COUNT_FIELD_NUMBER = 3;
    public static final int MESSAGE_FIELD_NUMBER = 6;
    public static final int MESSAGE_VERSION_FIELD_NUMBER = 12;
    public static final int ORDER_ID_FIELD_NUMBER = 1;
    public static final int ORDER_TITLE_FIELD_NUMBER = 7;
    public static volatile C22357B4l PARSER = null;
    public static final int SELLER_JID_FIELD_NUMBER = 8;
    public static final int STATUS_FIELD_NUMBER = 4;
    public static final int SURFACE_FIELD_NUMBER = 5;
    public static final int THUMBNAIL_FIELD_NUMBER = 2;
    public static final int TOKEN_FIELD_NUMBER = 9;
    public static final int TOTAL_AMOUNT_1000_FIELD_NUMBER = 10;
    public static final int TOTAL_CURRENCY_CODE_FIELD_NUMBER = 11;
    public int bitField0_;
    public String catalogType_ = "UNKNOWN";
    public C166278cd contextInfo_;
    public int itemCount_;
    public int messageVersion_ = 1;
    public String message_ = "";
    public String orderId_ = "";
    public String orderTitle_ = "";
    public String sellerJid_ = "";
    public int status_ = 1;
    public int surface_ = 1;
    public DSQ thumbnail_ = DSQ.A00;
    public String token_ = "";
    public long totalAmount1000_;
    public String totalCurrencyCode_ = "";

    static {
        C166098cL r1 = new C166098cL();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166098cL.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(17);
                A1Z[1] = "orderId_";
                A1Z[2] = "thumbnail_";
                A1Z[3] = "itemCount_";
                A1Z[4] = "status_";
                A1Z[5] = AKO.A00;
                A1Z[6] = "surface_";
                A1Z[7] = AKP.A00;
                A1Z[8] = "message_";
                A1Z[9] = "orderTitle_";
                A1Z[10] = "sellerJid_";
                A1Z[11] = "token_";
                A1Z[12] = "totalAmount1000_";
                A1Z[13] = "totalCurrencyCode_";
                A1Z[14] = "messageVersion_";
                A1Z[15] = "catalogType_";
                A1Z[16] = "contextInfo_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u0011\u000e\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003င\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဂ\t\u000bဈ\n\fင\f\u000fဈ\r\u0011ဉ\u000b", A1Z);
            case 3:
                return new C166098cL();
            case 4:
                return new AnonymousClass8TJ();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166098cL.class) {
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
