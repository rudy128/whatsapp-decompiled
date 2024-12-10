package X;

/* renamed from: X.8aW  reason: invalid class name and case insensitive filesystem */
public final class C165058aW extends C23577Bm6 implements C22356B4k {
    public static final C165058aW DEFAULT_INSTANCE;
    public static final int EPHEMERAL_FIELD_NUMBER = 1;
    public static volatile C22357B4l PARSER = null;
    public static final int PAYLOAD_FIELD_NUMBER = 3;
    public static final int STATIC_FIELD_NUMBER = 2;
    public int bitField0_;
    public DSQ ephemeral_;
    public DSQ payload_;
    public DSQ static_;

    static {
        C165058aW r1 = new C165058aW();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165058aW.class);
    }

    public C165058aW() {
        DSQ dsq = DSQ.A00;
        this.ephemeral_ = dsq;
        this.static_ = dsq;
        this.payload_ = dsq;
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = AnonymousClass8BW.A1Z();
                A1Z[1] = "ephemeral_";
                A1Z[2] = "static_";
                A1Z[3] = "payload_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", A1Z);
            case 3:
                return new C165058aW();
            case 4:
                return new AnonymousClass8W1();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165058aW.class) {
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
