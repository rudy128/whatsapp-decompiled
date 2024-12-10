package X;

/* renamed from: X.8bb  reason: invalid class name and case insensitive filesystem */
public final class C165688bb extends C23577Bm6 implements C22356B4k {
    public static final int BODY_FIELD_NUMBER = 5;
    public static final int BUSINESS_OWNER_JID_FIELD_NUMBER = 2;
    public static final int CATALOG_FIELD_NUMBER = 4;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 17;
    public static final C165688bb DEFAULT_INSTANCE;
    public static final int FOOTER_FIELD_NUMBER = 6;
    public static volatile C22357B4l PARSER = null;
    public static final int PRODUCT_FIELD_NUMBER = 1;
    public int bitField0_;
    public String body_ = "";
    public String businessOwnerJid_ = "";
    public C164908aG catalog_;
    public C166278cd contextInfo_;
    public String footer_ = "";
    public C166038cF product_;

    static {
        C165688bb r1 = new C165688bb();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165688bb.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(7);
                A1Z[1] = "product_";
                A1Z[2] = "businessOwnerJid_";
                A1Z[3] = "catalog_";
                A1Z[4] = "body_";
                A1Z[5] = "footer_";
                A1Z[6] = "contextInfo_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0011\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0004ဉ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0011ဉ\u0005", A1Z);
            case 3:
                return new C165688bb();
            case 4:
                return new C162968Te();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165688bb.class) {
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
