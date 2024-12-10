package X;

/* renamed from: X.8Zs  reason: invalid class name and case insensitive filesystem */
public final class C164668Zs extends C23577Bm6 implements C22356B4k {
    public static final int BR_METADATA_FIELD_NUMBER = 2;
    public static final C164668Zs DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER = null;
    public static final int UPI_METADATA_FIELD_NUMBER = 1;
    public int bitField0_;
    public byte memoizedIsInitialized = 2;
    public int metadataValueCase_ = 0;
    public Object metadataValue_;

    static {
        C164668Zs r1 = new C164668Zs();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C164668Zs.class);
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
                Object[] objArr = new Object[5];
                objArr[0] = "metadataValue_";
                AnonymousClass8BU.A1P(objArr, "metadataValueCase_");
                objArr[3] = C165758bi.class;
                objArr[4] = C164138Xr.class;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐼ\u0000\u0002ြ\u0000", objArr);
            case 3:
                return new C164668Zs();
            case 4:
                return new AnonymousClass8UZ();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164668Zs.class) {
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
