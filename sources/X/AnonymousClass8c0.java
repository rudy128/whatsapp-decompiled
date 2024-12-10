package X;

/* renamed from: X.8c0  reason: invalid class name */
public final class AnonymousClass8c0 extends C23577Bm6 implements C22356B4k {
    public static final int ACCOUNT_JID_FIELD_NUMBER = 1;
    public static final int CEK_PUB_FIELD_NUMBER = 5;
    public static final int CEK_PUB_SIGNATURE_FIELD_NUMBER = 7;
    public static final int CHALLENGE_RESPONSE_FIELD_NUMBER = 3;
    public static final int CIK_PUB_FIELD_NUMBER = 4;
    public static final AnonymousClass8c0 DEFAULT_INSTANCE;
    public static final int KEM_CIPHERTEXT_FIELD_NUMBER = 6;
    public static volatile C22357B4l PARSER = null;
    public static final int REQUEST_TYPE_FIELD_NUMBER = 8;
    public static final int SESSION_ID_FIELD_NUMBER = 2;
    public String accountJid_ = "";
    public int bitField0_;
    public DSQ cekPubSignature_;
    public DSQ cekPub_;
    public DSQ challengeResponse_;
    public DSQ cikPub_;
    public DSQ kemCiphertext_;
    public int requestType_;
    public String sessionId_ = "";

    static {
        AnonymousClass8c0 r1 = new AnonymousClass8c0();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass8c0.class);
    }

    public AnonymousClass8c0() {
        DSQ dsq = DSQ.A00;
        this.challengeResponse_ = dsq;
        this.cikPub_ = dsq;
        this.cekPub_ = dsq;
        this.kemCiphertext_ = dsq;
        this.cekPubSignature_ = dsq;
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
                A1Z[1] = "accountJid_";
                A1Z[2] = "sessionId_";
                A1Z[3] = "challengeResponse_";
                A1Z[4] = "cikPub_";
                A1Z[5] = "cekPub_";
                A1Z[6] = "kemCiphertext_";
                A1Z[7] = "cekPubSignature_";
                A1Z[8] = "requestType_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ည\u0002\u0004ည\u0003\u0005ည\u0004\u0006ည\u0005\u0007ည\u0006\bဌ\u0007", A1Z);
            case 3:
                return new AnonymousClass8c0();
            case 4:
                return new AnonymousClass8UL();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass8c0.class) {
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
