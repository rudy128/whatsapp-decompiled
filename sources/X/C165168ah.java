package X;

/* renamed from: X.8ah  reason: invalid class name and case insensitive filesystem */
public final class C165168ah extends C23577Bm6 implements C22356B4k {
    public static final int CLAUSES_FIELD_NUMBER = 2;
    public static final int CLAUSE_TYPE_FIELD_NUMBER = 1;
    public static final C165168ah DEFAULT_INSTANCE;
    public static final int FILTERS_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER;
    public int bitField0_;
    public int clauseType_ = 1;
    public EE9 clauses_;
    public EE9 filters_;
    public byte memoizedIsInitialized = 2;

    static {
        C165168ah r1 = new C165168ah();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165168ah.class);
    }

    public C165168ah() {
        C23579Bm9 bm9 = C23579Bm9.A02;
        this.clauses_ = bm9;
        this.filters_ = bm9;
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
                Object[] A1R = AnonymousClass8BS.A1R(7);
                A1R[1] = "clauseType_";
                A1R[2] = C20429AKs.A00;
                A1R[3] = "clauses_";
                A1R[4] = C165168ah.class;
                A1R[5] = "filters_";
                A1R[6] = C165428b8.class;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0003\u0001ᔌ\u0000\u0002Л\u0003Л", A1R);
            case 3:
                return new C165168ah();
            case 4:
                return new C163228Ue();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165168ah.class) {
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
