package X;

/* renamed from: X.8bO  reason: invalid class name and case insensitive filesystem */
public final class C165558bO extends C23577Bm6 implements C22356B4k {
    public static final int CHATJID_FIELD_NUMBER = 2;
    public static final int CREATED_AT_FIELD_NUMBER = 3;
    public static final C165558bO DEFAULT_INSTANCE;
    public static final int DELETED_FIELD_NUMBER = 4;
    public static volatile C22357B4l PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int UNSTRUCTURED_CONTENT_FIELD_NUMBER = 5;
    public int bitField0_;
    public String chatJid_ = "";
    public long createdAt_;
    public boolean deleted_;
    public int type_ = 1;
    public String unstructuredContent_ = "";

    static {
        C165558bO r1 = new C165558bO();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165558bO.class);
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
                A1Z[1] = "type_";
                A1Z[2] = AL0.A00;
                A1Z[3] = "chatJid_";
                A1Z[4] = "createdAt_";
                A1Z[5] = "deleted_";
                A1Z[6] = "unstructuredContent_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005ဈ\u0004", A1Z);
            case 3:
                return new C165558bO();
            case 4:
                return new AnonymousClass8VL();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165558bO.class) {
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
