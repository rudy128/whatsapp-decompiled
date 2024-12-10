package X;

/* renamed from: X.8b7  reason: invalid class name and case insensitive filesystem */
public final class C165418b7 extends C23577Bm6 implements C22356B4k {
    public static final C165418b7 DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 2;
    public static final int INCENTIVE_TRANSACTION_ID_FIELD_NUMBER = 3;
    public static final int OFFER_ID_FIELD_NUMBER = 1;
    public static final int PARENT_TRANSACTION_ID_FIELD_NUMBER = 4;
    public static volatile C22357B4l PARSER;
    public int bitField0_;
    public long id_;
    public String incentiveTransactionId_ = "";
    public byte memoizedIsInitialized = 2;
    public long offerId_;
    public String parentTransactionId_ = "";

    static {
        C165418b7 r1 = new C165418b7();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165418b7.class);
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
                AnonymousClass8BU.A1O(A1R, "offerId_");
                A1R[3] = "incentiveTransactionId_";
                A1R[4] = "parentTransactionId_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᔂ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", A1R);
            case 3:
                return new C165418b7();
            case 4:
                return new AnonymousClass8UX();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165418b7.class) {
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
