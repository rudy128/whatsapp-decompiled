package X;

/* renamed from: X.8b1  reason: invalid class name and case insensitive filesystem */
public final class C165368b1 extends C23577Bm6 implements C22356B4k {
    public static final int CHAINKEY_FIELD_NUMBER = 3;
    public static final C165368b1 DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ITERATION_FIELD_NUMBER = 2;
    public static volatile C22357B4l PARSER = null;
    public static final int SIGNINGKEY_FIELD_NUMBER = 4;
    public int bitField0_;
    public DSQ chainKey_;
    public int id_;
    public int iteration_;
    public DSQ signingKey_;

    static {
        C165368b1 r1 = new C165368b1();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165368b1.class);
    }

    public C165368b1() {
        DSQ dsq = DSQ.A00;
        this.chainKey_ = dsq;
        this.signingKey_ = dsq;
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
                A1a[1] = "id_";
                A1a[2] = "iteration_";
                A1a[3] = "chainKey_";
                A1a[4] = "signingKey_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ည\u0002\u0004ည\u0003", A1a);
            case 3:
                return new C165368b1();
            case 4:
                return new AnonymousClass8WR();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165368b1.class) {
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
