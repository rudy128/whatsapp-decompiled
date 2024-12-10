package X;

/* renamed from: X.8aT  reason: invalid class name and case insensitive filesystem */
public final class C165028aT extends C23577Bm6 implements C22356B4k {
    public static final C165028aT DEFAULT_INSTANCE;
    public static final int LC_FIELD_NUMBER = 2;
    public static final int LG_FIELD_NUMBER = 1;
    public static volatile C22357B4l PARSER = null;
    public static final int VERIFIED_NAME_FIELD_NUMBER = 3;
    public int bitField0_;
    public String lc_ = "";
    public String lg_ = "";
    public String verifiedName_ = "";

    static {
        C165028aT r1 = new C165028aT();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165028aT.class);
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
                A1Z[1] = "lg_";
                A1Z[2] = "lc_";
                A1Z[3] = "verifiedName_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", A1Z);
            case 3:
                return new C165028aT();
            case 4:
                return new C163628Vs();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165028aT.class) {
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
