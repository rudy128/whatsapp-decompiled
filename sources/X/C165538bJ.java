package X;

/* renamed from: X.8bJ  reason: invalid class name and case insensitive filesystem */
public final class C165538bJ extends C23577Bm6 implements C22356B4k {
    public static final int CONTEXT_INFO_FIELD_NUMBER = 4;
    public static final C165538bJ DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 5;
    public static final int LIST_TYPE_FIELD_NUMBER = 2;
    public static volatile C22357B4l PARSER = null;
    public static final int SINGLE_SELECT_REPLY_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    public int bitField0_;
    public C166278cd contextInfo_;
    public String description_ = "";
    public int listType_;
    public C164048Xi singleSelectReply_;
    public String title_ = "";

    static {
        C165538bJ r1 = new C165538bJ();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165538bJ.class);
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
                A1Z[1] = "title_";
                A1Z[2] = "listType_";
                A1Z[3] = AKN.A00;
                A1Z[4] = "singleSelectReply_";
                A1Z[5] = "contextInfo_";
                A1Z[6] = "description_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဈ\u0004", A1Z);
            case 3:
                return new C165538bJ();
            case 4:
                return new AnonymousClass8TC();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165538bJ.class) {
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
