package X;

/* renamed from: X.8b8  reason: invalid class name and case insensitive filesystem */
public final class C165428b8 extends C23577Bm6 implements C22356B4k {
    public static final int CLIENT_NOT_SUPPORTED_CONFIG_FIELD_NUMBER = 4;
    public static final C165428b8 DEFAULT_INSTANCE;
    public static final int FILTER_NAME_FIELD_NUMBER = 1;
    public static final int FILTER_RESULT_FIELD_NUMBER = 3;
    public static final int PARAMETERS_FIELD_NUMBER = 2;
    public static volatile C22357B4l PARSER;
    public int bitField0_;
    public int clientNotSupportedConfig_ = 1;
    public String filterName_ = "";
    public int filterResult_ = 1;
    public byte memoizedIsInitialized = 2;
    public C27328Dbz parameters_ = C27328Dbz.A00;

    static {
        C165428b8 r1 = new C165428b8();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165428b8.class);
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
                Object[] A1R = AnonymousClass8BS.A1R(8);
                A1R[1] = "filterName_";
                A1R[2] = "parameters_";
                A1R[3] = AnonymousClass9TY.A00;
                A1R[4] = "filterResult_";
                A1R[5] = C20431AKu.A00;
                A1R[6] = "clientNotSupportedConfig_";
                A1R[7] = C20430AKt.A00;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0002\u0001ᔈ\u0000\u00022\u0003ဌ\u0001\u0004ᔌ\u0002", A1R);
            case 3:
                return new C165428b8();
            case 4:
                return new C163218Ud();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165428b8.class) {
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
