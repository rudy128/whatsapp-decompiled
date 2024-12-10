package X;

/* renamed from: X.8b2  reason: invalid class name and case insensitive filesystem */
public final class C165378b2 extends C23577Bm6 implements C22356B4k {
    public static final int CIPHERTEXT_FIELD_NUMBER = 4;
    public static final int COUNTER_FIELD_NUMBER = 2;
    public static final C165378b2 DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER = null;
    public static final int PREVIOUSCOUNTER_FIELD_NUMBER = 3;
    public static final int RATCHETKEY_FIELD_NUMBER = 1;
    public int bitField0_;
    public DSQ ciphertext_;
    public int counter_;
    public int previousCounter_;
    public DSQ ratchetKey_;

    static {
        C165378b2 r1 = new C165378b2();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165378b2.class);
    }

    public C165378b2() {
        DSQ dsq = DSQ.A00;
        this.ratchetKey_ = dsq;
        this.ciphertext_ = dsq;
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1a = AnonymousClass8BW.A1a();
                A1a[1] = "ratchetKey_";
                A1a[2] = "counter_";
                A1a[3] = "previousCounter_";
                A1a[4] = "ciphertext_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ည\u0003", A1a);
            case 3:
                return new C165378b2();
            case 4:
                return new AnonymousClass8WT();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165378b2.class) {
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
