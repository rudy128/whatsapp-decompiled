package X;

/* renamed from: X.8cj  reason: invalid class name and case insensitive filesystem */
public final class C166338cj extends C23577Bm6 implements C22356B4k {
    public static final C166338cj DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER = null;
    public static final int REF_TOKEN_FIELD_NUMBER = 1;
    public static final int VERSION_FIELD_NUMBER = 2;
    public static final int WEBD_PAYLOAD_FIELD_NUMBER = 3;
    public static final int WEB_SUB_PLATFORM_FIELD_NUMBER = 4;
    public int bitField0_;
    public String refToken_ = "";
    public String version_ = "";
    public int webSubPlatform_;
    public C166018cD webdPayload_;

    static {
        C166338cj r1 = new C166338cj();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166338cj.class);
    }

    @Deprecated
    public boolean A0R() {
        return AnonymousClass8BW.A1Q(this.bitField0_);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1b = AnonymousClass8BW.A1b();
                A1b[1] = "refToken_";
                A1b[2] = "version_";
                A1b[3] = "webdPayload_";
                A1b[4] = "webSubPlatform_";
                A1b[5] = AL8.A00;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဌ\u0003", A1b);
            case 3:
                return new C166338cj();
            case 4:
                return new C163678Vx();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166338cj.class) {
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
