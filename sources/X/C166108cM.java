package X;

/* renamed from: X.8cM  reason: invalid class name and case insensitive filesystem */
public final class C166108cM extends C23577Bm6 implements C22356B4k {
    public static final int AMOUNT_1000_FIELD_NUMBER = 1;
    public static final int BANK_TRANSACTION_ID_FIELD_NUMBER = 2;
    public static final int CREDENTIAL_ID_FIELD_NUMBER = 3;
    public static final int CURRENCY_FIELD_NUMBER = 4;
    public static final C166108cM DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 5;
    public static final int GROUP_JID_FIELD_NUMBER = 6;
    public static final int MESSAGE_STANZA_ID_FIELD_NUMBER = 7;
    public static final int METADATA_FIELD_NUMBER = 14;
    public static volatile C22357B4l PARSER = null;
    public static final int RECIEVER_JID_FIELD_NUMBER = 8;
    public static final int SENDER_JID_FIELD_NUMBER = 9;
    public static final int STATUS_FIELD_NUMBER = 10;
    public static final int TIMESTAMP_FIELD_NUMBER = 11;
    public static final int TRANSACTION_ID_FIELD_NUMBER = 12;
    public static final int TYPE_FIELD_NUMBER = 13;
    public long amount1000_;
    public String bankTransactionId_ = "";
    public int bitField0_;
    public String credentialId_ = "";
    public String currency_ = "";
    public String errorCode_ = "";
    public String groupJid_ = "";
    public byte memoizedIsInitialized = 2;
    public String messageStanzaId_ = "";
    public C166178cT metadata_;
    public String recieverJid_ = "";
    public String senderJid_ = "";
    public long status_;
    public long timestamp_;
    public String transactionId_ = "";
    public int type_;

    static {
        C166108cM r1 = new C166108cM();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166108cM.class);
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
                Object[] A1R = AnonymousClass8BS.A1R(15);
                A1R[1] = "amount1000_";
                A1R[2] = "bankTransactionId_";
                A1R[3] = "credentialId_";
                A1R[4] = "currency_";
                A1R[5] = "errorCode_";
                A1R[6] = "groupJid_";
                A1R[7] = "messageStanzaId_";
                A1R[8] = "recieverJid_";
                A1R[9] = "senderJid_";
                A1R[10] = "status_";
                A1R[11] = "timestamp_";
                A1R[12] = "transactionId_";
                A1R[13] = "type_";
                A1R[14] = "metadata_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0001\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဃ\t\u000bဂ\n\fဈ\u000b\rင\f\u000eᐉ\r", A1R);
            case 3:
                return new C166108cM();
            case 4:
                return new AnonymousClass8WC();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166108cM.class) {
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
