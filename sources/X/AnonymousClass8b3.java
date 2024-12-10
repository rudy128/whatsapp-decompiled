package X;

/* renamed from: X.8b3  reason: invalid class name */
public final class AnonymousClass8b3 extends C23577Bm6 implements C22356B4k {
    public static final AnonymousClass8b3 DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER = null;
    public static final int SENDERCHAINKEY_FIELD_NUMBER = 2;
    public static final int SENDERKEYID_FIELD_NUMBER = 1;
    public static final int SENDERMESSAGEKEYS_FIELD_NUMBER = 4;
    public static final int SENDERSIGNINGKEY_FIELD_NUMBER = 3;
    public int bitField0_;
    public C164608Zm senderChainKey_;
    public int senderKeyId_;
    public EE9 senderMessageKeys_ = C23579Bm9.A02;
    public C164628Zo senderSigningKey_;

    static {
        AnonymousClass8b3 r1 = new AnonymousClass8b3();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass8b3.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1b = AnonymousClass8BW.A1b();
                A1b[1] = "senderKeyId_";
                A1b[2] = "senderChainKey_";
                A1b[3] = "senderSigningKey_";
                A1b[4] = "senderMessageKeys_";
                A1b[5] = C164618Zn.class;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဋ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u001b", A1b);
            case 3:
                return new AnonymousClass8b3();
            case 4:
                return new AnonymousClass8WX();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass8b3.class) {
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
