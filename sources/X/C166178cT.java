package X;

/* renamed from: X.8cT  reason: invalid class name and case insensitive filesystem */
public final class C166178cT extends C23577Bm6 implements C22356B4k {
    public static final int AMOUNT_FIELD_NUMBER = 1;
    public static final int COLLECT_REQUEST_ID_FIELD_NUMBER = 2;
    public static final int COUNTER_FIELD_NUMBER = 3;
    public static final C166178cT DEFAULT_INSTANCE;
    public static final int EXPIRY_TIMESTAMP_FIELD_NUMBER = 4;
    public static final int LAST_STATUS_TIMESTAMP_FIELD_NUMBER = 5;
    public static final int LOCAL_TRANSACTION_ID_FIELD_NUMBER = 6;
    public static final int MARKET_METADATA_FIELD_NUMBER = 15;
    public static final int MESSAGE_CONTAINS_BACKGROUND_FIELD_NUMBER = 20;
    public static final int MESSAGE_KEY_FIELD_NUMBER = 7;
    public static final int MESSAGE_TYPE_FIELD_NUMBER = 19;
    public static final int OFFER_CLAIM_FIELD_NUMBER = 18;
    public static final int ORDER_FIELD_NUMBER = 17;
    public static volatile C22357B4l PARSER = null;
    public static final int PREVIOUS_STATUS_FIELD_NUMBER = 8;
    public static final int PREVIOUS_TYPE_FIELD_NUMBER = 9;
    public static final int REFERENCE_MESSAGE_ID_FIELD_NUMBER = 11;
    public static final int SENDER_ALIAS_FIELD_NUMBER = 21;
    public static final int SERVICE_FIELD_NUMBER = 13;
    public static final int VERSION_FIELD_NUMBER = 14;
    public C164948aK amount_;
    public int bitField0_;
    public String collectRequestId_ = "";
    public String counter_ = "";
    public long expiryTimestamp_;
    public long lastStatusTimestamp_;
    public String localTransactionId_ = "";
    public C164668Zs marketMetadata_;
    public byte memoizedIsInitialized = 2;
    public boolean messageContainsBackground_;
    public C166408cq messageKey_;
    public int messageType_;
    public C165418b7 offerClaim_;
    public AnonymousClass8ZR order_;
    public long previousStatus_;
    public long previousType_;
    public String referenceMessageID_ = "";
    public String senderAlias_ = "";
    public String service_ = "";
    public int version_;

    static {
        C166178cT r1 = new C166178cT();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166178cT.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        int i = 1;
        switch (num.intValue()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                if (obj == null) {
                    i = 0;
                }
                this.memoizedIsInitialized = (byte) i;
                return null;
            case 2:
                Object[] A1R = AnonymousClass8BS.A1R(20);
                A1R[1] = "amount_";
                A1R[2] = "collectRequestId_";
                A1R[3] = "counter_";
                A1R[4] = "expiryTimestamp_";
                A1R[5] = "lastStatusTimestamp_";
                A1R[6] = "localTransactionId_";
                A1R[7] = "messageKey_";
                A1R[8] = "previousStatus_";
                A1R[9] = "previousType_";
                A1R[10] = "referenceMessageID_";
                A1R[11] = "service_";
                A1R[12] = "version_";
                A1R[13] = "marketMetadata_";
                A1R[14] = "order_";
                A1R[15] = "offerClaim_";
                A1R[16] = "messageType_";
                A1R[17] = C20428AKr.A00;
                A1R[18] = "messageContainsBackground_";
                A1R[19] = "senderAlias_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0012\u0000\u0001\u0001\u0015\u0012\u0000\u0000\u0005\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဉ\u0006\bᔂ\u0007\tᔂ\b\u000bဈ\t\rဈ\n\u000eᔄ\u000b\u000fᔉ\f\u0011ဉ\r\u0012ᐉ\u000e\u0013ဌ\u000f\u0014ဇ\u0010\u0015ဈ\u0011", A1R);
            case 3:
                return new C166178cT();
            case 4:
                return new AnonymousClass8UW();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166178cT.class) {
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
