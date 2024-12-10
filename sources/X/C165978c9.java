package X;

/* renamed from: X.8c9  reason: invalid class name and case insensitive filesystem */
public final class C165978c9 extends C23577Bm6 implements C22356B4k {
    public static final C165978c9 DEFAULT_INSTANCE;
    public static final int FILE_LENGTH_FIELD_NUMBER = 2;
    public static final int HEIGHT_FIELD_NUMBER = 4;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int MEDIA_DATA_FIELD_NUMBER = 9;
    public static final int MIMETYPE_FIELD_NUMBER = 5;
    public static volatile C22357B4l PARSER = null;
    public static final int PLACEHOLDER_ARGB_FIELD_NUMBER = 6;
    public static final int SUBTEXT_ARGB_FIELD_NUMBER = 8;
    public static final int TEXT_ARGB_FIELD_NUMBER = 7;
    public static final int TYPE_FIELD_NUMBER = 10;
    public static final int WIDTH_FIELD_NUMBER = 3;
    public int bitField0_;
    public long fileLength_;
    public int height_;
    public String id_ = "";
    public AnonymousClass8bL mediaData_;
    public String mimetype_ = "";
    public int placeholderArgb_;
    public int subtextArgb_;
    public int textArgb_;
    public int type_;
    public int width_;

    static {
        C165978c9 r1 = new C165978c9();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165978c9.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(12);
                A1Z[1] = "id_";
                A1Z[2] = "fileLength_";
                A1Z[3] = "width_";
                A1Z[4] = "height_";
                A1Z[5] = "mimetype_";
                A1Z[6] = "placeholderArgb_";
                A1Z[7] = "textArgb_";
                A1Z[8] = "subtextArgb_";
                A1Z[9] = "mediaData_";
                A1Z[10] = "type_";
                A1Z[11] = C20416AKf.A00;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဃ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဈ\u0004\u0006ဆ\u0005\u0007ဆ\u0006\bဆ\u0007\tဉ\b\nဌ\t", A1Z);
            case 3:
                return new C165978c9();
            case 4:
                return new C163128Tu();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165978c9.class) {
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
