package X;

/* renamed from: X.8bB  reason: invalid class name and case insensitive filesystem */
public final class C165458bB extends C23577Bm6 implements C22356B4k {
    public static final int COUNTRY_FIELD_NUMBER = 2;
    public static final int CREDENTIAL_ID_FIELD_NUMBER = 4;
    public static final C165458bB DEFAULT_INSTANCE;
    public static final int GATEWAY_NAME_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    public int bitField0_;
    public String country_ = "";
    public String credentialId_ = "";
    public String gatewayName_ = "";
    public byte memoizedIsInitialized = 2;
    public int status_;

    static {
        C165458bB r1 = new C165458bB();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165458bB.class);
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
                Object[] A1R = AnonymousClass8BS.A1R(6);
                A1R[1] = "status_";
                A1R[2] = C20436AKz.A00;
                A1R[3] = "country_";
                A1R[4] = "gatewayName_";
                A1R[5] = "credentialId_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᔌ\u0000\u0002ᔈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", A1R);
            case 3:
                return new C165458bB();
            case 4:
                return new AnonymousClass8VJ();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165458bB.class) {
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
