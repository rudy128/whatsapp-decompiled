package X;

/* renamed from: X.8bv  reason: invalid class name and case insensitive filesystem */
public final class C165888bv extends C23577Bm6 implements C22356B4k {
    public static final int CONTEXT_INFO_FIELD_NUMBER = 9;
    public static final C165888bv DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 7;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 6;
    public static final int FILE_SHA256_FIELD_NUMBER = 3;
    public static final int MEDIA_KEY_FIELD_NUMBER = 5;
    public static final int MEDIA_KEY_TIMESTAMP_FIELD_NUMBER = 8;
    public static final int MIMETYPE_FIELD_NUMBER = 2;
    public static volatile C22357B4l PARSER = null;
    public static final int URL_FIELD_NUMBER = 1;
    public int bitField0_;
    public C166278cd contextInfo_;
    public String directPath_;
    public DSQ fileEncSha256_;
    public DSQ fileSha256_;
    public long mediaKeyTimestamp_;
    public DSQ mediaKey_;
    public String mimetype_ = "";
    public String url_ = "";

    static {
        C165888bv r1 = new C165888bv();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165888bv.class);
    }

    public C165888bv() {
        DSQ dsq = DSQ.A00;
        this.fileSha256_ = dsq;
        this.mediaKey_ = dsq;
        this.fileEncSha256_ = dsq;
        this.directPath_ = "";
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
                A1Z[1] = "url_";
                A1Z[2] = "mimetype_";
                A1Z[3] = "fileSha256_";
                A1Z[4] = "mediaKey_";
                A1Z[5] = "fileEncSha256_";
                A1Z[6] = "directPath_";
                A1Z[7] = "mediaKeyTimestamp_";
                A1Z[8] = "contextInfo_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0005ည\u0003\u0006ည\u0004\u0007ဈ\u0005\bဂ\u0006\tဉ\u0007", A1Z);
            case 3:
                return new C165888bv();
            case 4:
                return new AnonymousClass8TH();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165888bv.class) {
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
