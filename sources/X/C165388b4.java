package X;

/* renamed from: X.8b4  reason: invalid class name and case insensitive filesystem */
public final class C165388b4 extends C23577Bm6 implements C22356B4k {
    public static final int CIPHERKEY_FIELD_NUMBER = 2;
    public static final C165388b4 DEFAULT_INSTANCE;
    public static final int INDEX_FIELD_NUMBER = 1;
    public static final int IV_FIELD_NUMBER = 4;
    public static final int MACKEY_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER;
    public int bitField0_;
    public DSQ cipherKey_;
    public int index_;
    public DSQ iv_;
    public DSQ macKey_;

    static {
        C165388b4 r1 = new C165388b4();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165388b4.class);
    }

    public C165388b4() {
        DSQ dsq = DSQ.A00;
        this.cipherKey_ = dsq;
        this.macKey_ = dsq;
        this.iv_ = dsq;
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
                A1a[1] = "index_";
                A1a[2] = "cipherKey_";
                A1a[3] = "macKey_";
                A1a[4] = "iv_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", A1a);
            case 3:
                return new C165388b4();
            case 4:
                return new C163708Wa();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165388b4.class) {
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
