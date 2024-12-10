package X;

/* renamed from: X.8Zk  reason: invalid class name and case insensitive filesystem */
public final class C164588Zk extends C23577Bm6 implements C22356B4k {
    public static final int CONTENT_FIELD_NUMBER = 1;
    public static final C164588Zk DEFAULT_INSTANCE;
    public static final int IDENTIFIER_FIELD_NUMBER = 2;
    public static volatile C22357B4l PARSER;
    public int bitField0_;
    public DSQ content_;
    public DSQ identifier_;

    static {
        C164588Zk r1 = new C164588Zk();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C164588Zk.class);
    }

    public C164588Zk() {
        DSQ dsq = DSQ.A00;
        this.content_ = dsq;
        this.identifier_ = dsq;
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
                A1Y[1] = "content_";
                A1Y[2] = "identifier_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", A1Y);
            case 3:
                return new C164588Zk();
            case 4:
                return new AnonymousClass8WO();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164588Zk.class) {
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
