package X;

/* renamed from: X.8aB  reason: invalid class name and case insensitive filesystem */
public final class C164858aB extends C23577Bm6 implements C22356B4k {
    public static final int BUSINESS_OWNER_JID_FIELD_NUMBER = 3;
    public static final C164858aB DEFAULT_INSTANCE;
    public static final int HEADER_IMAGE_FIELD_NUMBER = 2;
    public static volatile C22357B4l PARSER = null;
    public static final int PRODUCT_SECTIONS_FIELD_NUMBER = 1;
    public int bitField0_;
    public String businessOwnerJid_ = "";
    public AnonymousClass8Z5 headerImage_;
    public EE9 productSections_ = C23579Bm9.A02;

    static {
        C164858aB r1 = new C164858aB();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C164858aB.class);
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
                A1a[1] = "productSections_";
                A1a[2] = AnonymousClass8Z6.class;
                A1a[3] = "headerImage_";
                A1a[4] = "businessOwnerJid_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဈ\u0001", A1a);
            case 3:
                return new C164858aB();
            case 4:
                return new AnonymousClass8T8();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164858aB.class) {
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
