package X;

/* renamed from: X.8cJ  reason: invalid class name and case insensitive filesystem */
public final class C166078cJ extends C23577Bm6 implements C22356B4k {
    public static final int AMOUNT_1000_FIELD_NUMBER = 2;
    public static final int CURRENCY_DEPRECATED_FIELD_NUMBER = 1;
    public static final int CURRENCY_FIELD_NUMBER = 9;
    public static final C166078cJ DEFAULT_INSTANCE;
    public static final int EXCHANGE_AMOUNT_FIELD_NUMBER = 13;
    public static final int EXPIRY_TIMESTAMP_FIELD_NUMBER = 7;
    public static final int FUTUREPROOFED_FIELD_NUMBER = 8;
    public static volatile C22357B4l PARSER = null;
    public static final int PRIMARY_AMOUNT_FIELD_NUMBER = 12;
    public static final int RECEIVER_JID_FIELD_NUMBER = 3;
    public static final int REQUEST_MESSAGE_KEY_FIELD_NUMBER = 6;
    public static final int STATUS_FIELD_NUMBER = 4;
    public static final int TRANSACTION_TIMESTAMP_FIELD_NUMBER = 5;
    public static final int TXN_STATUS_FIELD_NUMBER = 10;
    public static final int USE_NOVI_FIAT_FORMAT_FIELD_NUMBER = 11;
    public long amount1000_;
    public int bitField0_;
    public int currencyDeprecated_;
    public String currency_ = "";
    public C164948aK exchangeAmount_;
    public long expiryTimestamp_;
    public boolean futureproofed_;
    public C164948aK primaryAmount_;
    public String receiverJid_ = "";
    public C166408cq requestMessageKey_;
    public int status_;
    public long transactionTimestamp_;
    public int txnStatus_;
    public boolean useNoviFiatFormat_;

    static {
        C166078cJ r1 = new C166078cJ();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166078cJ.class);
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
                A1Z[1] = "currencyDeprecated_";
                A1Z[2] = ALA.A00;
                A1Z[3] = "amount1000_";
                A1Z[4] = "receiverJid_";
                A1Z[5] = "status_";
                A1Z[6] = ALB.A00;
                A1Z[7] = "transactionTimestamp_";
                A1Z[8] = "requestMessageKey_";
                A1Z[9] = "expiryTimestamp_";
                A1Z[10] = "futureproofed_";
                A1Z[11] = "currency_";
                A1Z[12] = "txnStatus_";
                A1Z[13] = ALC.A00;
                A1Z[14] = "useNoviFiatFormat_";
                A1Z[15] = "primaryAmount_";
                A1Z[16] = "exchangeAmount_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဃ\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005ဃ\u0004\u0006ဉ\u0005\u0007ဃ\u0006\bဇ\u0007\tဈ\b\nဌ\t\u000bဇ\n\fဉ\u000b\rဉ\f", A1Z);
            case 3:
                return new C166078cJ();
            case 4:
                return new AnonymousClass8WB();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166078cJ.class) {
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
