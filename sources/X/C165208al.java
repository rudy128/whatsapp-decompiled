package X;

/* renamed from: X.8al  reason: invalid class name and case insensitive filesystem */
public final class C165208al extends C23577Bm6 implements C22356B4k {
    public static final int CAPTION_FIELD_NUMBER = 1;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 17;
    public static final C165208al DEFAULT_INSTANCE;
    public static final int EXPECTED_IMAGE_COUNT_FIELD_NUMBER = 2;
    public static final int EXPECTED_VIDEO_COUNT_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER;
    public int bitField0_;
    public String caption_ = "";
    public C166278cd contextInfo_;
    public int expectedImageCount_;
    public int expectedVideoCount_;

    static {
        C165208al r1 = new C165208al();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165208al.class);
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
                A1a[1] = "caption_";
                A1a[2] = "expectedImageCount_";
                A1a[3] = "expectedVideoCount_";
                A1a[4] = "contextInfo_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0011\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0011ဉ\u0003", A1a);
            case 3:
                return new C165208al();
            case 4:
                return new AnonymousClass8SM();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165208al.class) {
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
