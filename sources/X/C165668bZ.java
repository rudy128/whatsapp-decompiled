package X;

/* renamed from: X.8bZ  reason: invalid class name and case insensitive filesystem */
public final class C165668bZ extends C23577Bm6 implements C22356B4k {
    public static final int CAPTION_FIELD_NUMBER = 4;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 6;
    public static final C165668bZ DEFAULT_INSTANCE;
    public static final int INVITE_EXPIRATION_FIELD_NUMBER = 5;
    public static final int JPEG_THUMBNAIL_FIELD_NUMBER = 3;
    public static final int NEWSLETTER_JID_FIELD_NUMBER = 1;
    public static final int NEWSLETTER_NAME_FIELD_NUMBER = 2;
    public static volatile C22357B4l PARSER;
    public int bitField0_;
    public String caption_ = "";
    public C166278cd contextInfo_;
    public long inviteExpiration_;
    public DSQ jpegThumbnail_ = DSQ.A00;
    public String newsletterJid_ = "";
    public String newsletterName_ = "";

    static {
        C165668bZ r1 = new C165668bZ();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165668bZ.class);
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
                A1Z[1] = "newsletterJid_";
                A1Z[2] = "newsletterName_";
                A1Z[3] = "jpegThumbnail_";
                A1Z[4] = "caption_";
                A1Z[5] = "inviteExpiration_";
                A1Z[6] = "contextInfo_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဉ\u0005", A1Z);
            case 3:
                return new C165668bZ();
            case 4:
                return new AnonymousClass8TI();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165668bZ.class) {
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
