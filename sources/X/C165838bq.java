package X;

/* renamed from: X.8bq  reason: invalid class name and case insensitive filesystem */
public final class C165838bq extends C23577Bm6 implements C22356B4k {
    public static final int CREATEDAT_FIELD_NUMBER = 4;
    public static final C165838bq DEFAULT_INSTANCE;
    public static final int ISDELETED_FIELD_NUMBER = 6;
    public static final int LASTSENTAT_FIELD_NUMBER = 5;
    public static final int MEDIAID_FIELD_NUMBER = 7;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static volatile C22357B4l PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 3;
    public int bitField0_;
    public long createdAt_;
    public boolean isDeleted_;
    public long lastSentAt_;
    public String mediaId_ = "";
    public String message_ = "";
    public String name_ = "";
    public int type_;

    static {
        C165838bq r1 = new C165838bq();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165838bq.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(9);
                A1Z[1] = "name_";
                A1Z[2] = "message_";
                A1Z[3] = "type_";
                A1Z[4] = C20435AKy.A00;
                A1Z[5] = "createdAt_";
                A1Z[6] = "lastSentAt_";
                A1Z[7] = "isDeleted_";
                A1Z[8] = "mediaId_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဇ\u0005\u0007ဈ\u0006", A1Z);
            case 3:
                return new C165838bq();
            case 4:
                return new AnonymousClass8VH();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165838bq.class) {
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
