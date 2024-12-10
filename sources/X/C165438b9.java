package X;

/* renamed from: X.8b9  reason: invalid class name and case insensitive filesystem */
public final class C165438b9 extends C23577Bm6 implements C22356B4k {
    public static final C165438b9 DEFAULT_INSTANCE;
    public static final int INDEX_FIELD_NUMBER = 1;
    public static final int PADDING_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    public static final int VERSION_FIELD_NUMBER = 4;
    public int bitField0_;
    public DSQ index_;
    public byte memoizedIsInitialized = 2;
    public DSQ padding_;
    public C166378cn value_;
    public int version_;

    static {
        C165438b9 r1 = new C165438b9();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165438b9.class);
    }

    public C165438b9() {
        DSQ dsq = DSQ.A00;
        this.index_ = dsq;
        this.padding_ = dsq;
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
                Object[] A1R = AnonymousClass8BS.A1R(5);
                A1R[1] = "index_";
                A1R[2] = "value_";
                A1R[3] = "padding_";
                A1R[4] = "version_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ည\u0000\u0002ᐉ\u0001\u0003ည\u0002\u0004င\u0003", A1R);
            case 3:
                return new C165438b9();
            case 4:
                return new C163348Uq();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165438b9.class) {
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
