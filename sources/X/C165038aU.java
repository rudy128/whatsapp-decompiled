package X;

/* renamed from: X.8aU  reason: invalid class name and case insensitive filesystem */
public final class C165038aU extends C23577Bm6 implements C22356B4k {
    public static final C165038aU DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 1;
    public static volatile C22357B4l PARSER = null;
    public static final int SERVER_SIGNATURE_FIELD_NUMBER = 3;
    public static final int SIGNATURE_FIELD_NUMBER = 2;
    public int bitField0_;
    public DSQ details_;
    public DSQ serverSignature_;
    public DSQ signature_;

    static {
        C165038aU r1 = new C165038aU();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165038aU.class);
    }

    public C165038aU() {
        DSQ dsq = DSQ.A00;
        this.details_ = dsq;
        this.signature_ = dsq;
        this.serverSignature_ = dsq;
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
                A1Z[1] = "details_";
                A1Z[2] = "signature_";
                A1Z[3] = "serverSignature_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", A1Z);
            case 3:
                return new C165038aU();
            case 4:
                return new C163638Vt();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165038aU.class) {
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
