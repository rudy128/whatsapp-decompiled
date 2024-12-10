package X;

/* renamed from: X.8aG  reason: invalid class name and case insensitive filesystem */
public final class C164908aG extends C23577Bm6 implements C22356B4k {
    public static final int CATALOG_IMAGE_FIELD_NUMBER = 1;
    public static final C164908aG DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    public int bitField0_;
    public C166268cc catalogImage_;
    public String description_ = "";
    public String title_ = "";

    static {
        C164908aG r1 = new C164908aG();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C164908aG.class);
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
                A1Z[1] = "catalogImage_";
                A1Z[2] = "title_";
                A1Z[3] = "description_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", A1Z);
            case 3:
                return new C164908aG();
            case 4:
                return new C162978Tf();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164908aG.class) {
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
