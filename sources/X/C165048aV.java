package X;

/* renamed from: X.8aV  reason: invalid class name and case insensitive filesystem */
public final class C165048aV extends C23577Bm6 implements C22356B4k {
    public static final int ACCOUNT_ID_FIELD_NUMBER = 1;
    public static final C165048aV DEFAULT_INSTANCE;
    public static final int ENABLE_READ_RECEIPTS_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER = null;
    public static final int TOKEN_FIELD_NUMBER = 2;
    public long accountId_;
    public int bitField0_;
    public boolean enableReadReceipts_;
    public DSQ token_ = DSQ.A00;

    static {
        C165048aV r1 = new C165048aV();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165048aV.class);
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
                A1Z[1] = "accountId_";
                A1Z[2] = "token_";
                A1Z[3] = "enableReadReceipts_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဃ\u0000\u0002ည\u0001\u0003ဇ\u0002", A1Z);
            case 3:
                return new C165048aV();
            case 4:
                return new C163668Vw();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165048aV.class) {
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
