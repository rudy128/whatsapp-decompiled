package X;

/* renamed from: X.8bi  reason: invalid class name and case insensitive filesystem */
public final class C165758bi extends C23577Bm6 implements C22356B4k {
    public static final C165758bi DEFAULT_INSTANCE;
    public static final int INVOICE_URL_FIELD_NUMBER = 4;
    public static final int MANDATE_DETAILS_FIELD_NUMBER = 5;
    public static final int MANDATE_UPDATES_FIELD_NUMBER = 6;
    public static volatile C22357B4l PARSER = null;
    public static final int RECEIVER_HANDLE_FIELD_NUMBER = 2;
    public static final int SENDER_HANDLE_FIELD_NUMBER = 3;
    public static final int START_TIMESTAMP_FIELD_NUMBER = 1;
    public int bitField0_;
    public String invoiceUrl_ = "";
    public AnonymousClass8c7 mandateDetails_;
    public AnonymousClass8c3 mandateUpdates_;
    public byte memoizedIsInitialized = 2;
    public String receiverHandle_ = "";
    public String senderHandle_ = "";
    public long startTimestamp_;

    static {
        C165758bi r1 = new C165758bi();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165758bi.class);
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
                Object[] A1R = AnonymousClass8BS.A1R(7);
                A1R[1] = "startTimestamp_";
                A1R[2] = "receiverHandle_";
                A1R[3] = "senderHandle_";
                A1R[4] = "invoiceUrl_";
                A1R[5] = "mandateDetails_";
                A1R[6] = "mandateUpdates_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0002\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005", A1R);
            case 3:
                return new C165758bi();
            case 4:
                return new C163188Ua();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165758bi.class) {
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
