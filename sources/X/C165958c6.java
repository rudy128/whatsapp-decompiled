package X;

/* renamed from: X.8c6  reason: invalid class name and case insensitive filesystem */
public final class C165958c6 extends C23577Bm6 implements C22356B4k {
    public static final C165958c6 DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER = null;
    public static final int RECEIVER_ACCOUNT_TYPE_FIELD_NUMBER = 5;
    public static final int RECIPIENT_KEY_HASH_FIELD_NUMBER = 8;
    public static final int RECIPIENT_KEY_INDEXES_FIELD_NUMBER = 10;
    public static final int RECIPIENT_TIMESTAMP_FIELD_NUMBER = 9;
    public static final int SENDER_ACCOUNT_TYPE_FIELD_NUMBER = 4;
    public static final int SENDER_KEY_HASH_FIELD_NUMBER = 1;
    public static final int SENDER_KEY_INDEXES_FIELD_NUMBER = 3;
    public static final int SENDER_TIMESTAMP_FIELD_NUMBER = 2;
    public int bitField0_;
    public int receiverAccountType_;
    public DSQ recipientKeyHash_;
    public int recipientKeyIndexesMemoizedSerializedSize = -1;
    public C28667EDj recipientKeyIndexes_;
    public long recipientTimestamp_;
    public int senderAccountType_;
    public DSQ senderKeyHash_;
    public int senderKeyIndexesMemoizedSerializedSize = -1;
    public C28667EDj senderKeyIndexes_;
    public long senderTimestamp_;

    static {
        C165958c6 r1 = new C165958c6();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165958c6.class);
    }

    public C165958c6() {
        DSQ dsq = DSQ.A00;
        this.senderKeyHash_ = dsq;
        Bm7 bm7 = Bm7.A02;
        this.senderKeyIndexes_ = bm7;
        this.recipientKeyHash_ = dsq;
        this.recipientKeyIndexes_ = bm7;
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(11);
                A1Z[1] = "senderKeyHash_";
                A1Z[2] = "senderTimestamp_";
                A1Z[3] = "senderKeyIndexes_";
                A1Z[4] = "senderAccountType_";
                E69 e69 = C65672wv.A00;
                A1Z[5] = e69;
                A1Z[6] = "receiverAccountType_";
                A1Z[7] = e69;
                A1Z[8] = "recipientKeyHash_";
                A1Z[9] = "recipientTimestamp_";
                A1Z[10] = "recipientKeyIndexes_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0002\u0000\u0001ည\u0000\u0002ဃ\u0001\u0003+\u0004ဌ\u0002\u0005ဌ\u0003\bည\u0004\tဃ\u0005\n+", A1Z);
            case 3:
                return new C165958c6();
            case 4:
                return new AnonymousClass8SA();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165958c6.class) {
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
