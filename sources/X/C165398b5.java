package X;

/* renamed from: X.8b5  reason: invalid class name and case insensitive filesystem */
public final class C165398b5 extends C23577Bm6 implements C22356B4k {
    public static final int CHAINKEY_FIELD_NUMBER = 3;
    public static final C165398b5 DEFAULT_INSTANCE;
    public static final int MESSAGEKEYS_FIELD_NUMBER = 4;
    public static volatile C22357B4l PARSER = null;
    public static final int SENDERRATCHETKEYPRIVATE_FIELD_NUMBER = 2;
    public static final int SENDERRATCHETKEY_FIELD_NUMBER = 1;
    public int bitField0_;
    public C164638Zp chainKey_;
    public EE9 messageKeys_ = C23579Bm9.A02;
    public DSQ senderRatchetKeyPrivate_;
    public DSQ senderRatchetKey_;

    static {
        C165398b5 r1 = new C165398b5();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165398b5.class);
    }

    public C165398b5() {
        DSQ dsq = DSQ.A00;
        this.senderRatchetKey_ = dsq;
        this.senderRatchetKeyPrivate_ = dsq;
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
                A1b[1] = "senderRatchetKey_";
                A1b[2] = "senderRatchetKeyPrivate_";
                A1b[3] = "chainKey_";
                A1b[4] = "messageKeys_";
                A1b[5] = C165388b4.class;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ည\u0000\u0002ည\u0001\u0003ဉ\u0002\u0004\u001b", A1b);
            case 3:
                return new C165398b5();
            case 4:
                return new C163848Wo();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165398b5.class) {
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
