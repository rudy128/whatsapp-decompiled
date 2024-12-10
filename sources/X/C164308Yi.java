package X;

/* renamed from: X.8Yi  reason: invalid class name and case insensitive filesystem */
public final class C164308Yi extends C23577Bm6 implements C22356B4k {
    public static final C164308Yi DEFAULT_INSTANCE;
    public static final int NONCE_FIELD_NUMBER = 2;
    public static volatile C22357B4l PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 1;
    public int bitField0_;
    public DSQ nonce_;
    public DSQ publicKey_;

    static {
        C164308Yi r1 = new C164308Yi();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C164308Yi.class);
    }

    public C164308Yi() {
        DSQ dsq = DSQ.A00;
        this.publicKey_ = dsq;
        this.nonce_ = dsq;
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Y = AnonymousClass8BW.A1Y();
                A1Y[1] = "publicKey_";
                A1Y[2] = "nonce_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", A1Y);
            case 3:
                return new C164308Yi();
            case 4:
                return new AnonymousClass8Rh();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164308Yi.class) {
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
