package X;

/* renamed from: X.8bA  reason: invalid class name and case insensitive filesystem */
public final class C165448bA extends C23577Bm6 implements C22356B4k {
    public static final int COUNTRY_FIELD_NUMBER = 2;
    public static final int CREDENTIAL_ID_FIELD_NUMBER = 1;
    public static final C165448bA DEFAULT_INSTANCE;
    public static final int METADATA_FIELD_NUMBER = 4;
    public static volatile C22357B4l PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 3;
    public int bitField0_;
    public String country_ = "";
    public String credentialId_ = "";
    public byte memoizedIsInitialized = 2;
    public EE9 metadata_ = C23579Bm9.A02;
    public String type_ = "";

    static {
        C165448bA r1 = new C165448bA();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165448bA.class);
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
                A1R[1] = "credentialId_";
                A1R[2] = "country_";
                A1R[3] = "type_";
                A1R[4] = "metadata_";
                A1R[5] = C164678Zt.class;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0004\u0001ᔈ\u0000\u0002ᔈ\u0001\u0003ᔈ\u0002\u0004Л", A1R);
            case 3:
                return new C165448bA();
            case 4:
                return new AnonymousClass8V1();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165448bA.class) {
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
