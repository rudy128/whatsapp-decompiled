package X;

/* renamed from: X.8cB  reason: invalid class name and case insensitive filesystem */
public final class C165998cB extends C23577Bm6 implements C22356B4k {
    public static final int ARTIST_ATTRIBUTION_FIELD_NUMBER = 8;
    public static final int ARTWORK_DIRECT_PATH_FIELD_NUMBER = 5;
    public static final int ARTWORK_ENC_SHA256_FIELD_NUMBER = 7;
    public static final int ARTWORK_MEDIA_KEY_FIELD_NUMBER = 11;
    public static final int ARTWORK_SHA256_FIELD_NUMBER = 6;
    public static final int AUTHOR_FIELD_NUMBER = 3;
    public static final int COUNTRY_BLOCKLIST_FIELD_NUMBER = 9;
    public static final C165998cB DEFAULT_INSTANCE;
    public static final int IS_EXPLICIT_FIELD_NUMBER = 10;
    public static final int MUSIC_CONTENT_MEDIA_ID_FIELD_NUMBER = 1;
    public static volatile C22357B4l PARSER = null;
    public static final int SONG_ID_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 4;
    public String artistAttribution_;
    public String artworkDirectPath_ = "";
    public DSQ artworkEncSha256_;
    public DSQ artworkMediaKey_;
    public DSQ artworkSha256_;
    public String author_ = "";
    public int bitField0_;
    public DSQ countryBlocklist_;
    public boolean isExplicit_;
    public String musicContentMediaId_ = "";
    public String songId_ = "";
    public String title_ = "";

    static {
        C165998cB r1 = new C165998cB();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165998cB.class);
    }

    public C165998cB() {
        DSQ dsq = DSQ.A00;
        this.artworkSha256_ = dsq;
        this.artworkEncSha256_ = dsq;
        this.artistAttribution_ = "";
        this.countryBlocklist_ = dsq;
        this.artworkMediaKey_ = dsq;
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
                A1Z[1] = "musicContentMediaId_";
                A1Z[2] = "songId_";
                A1Z[3] = "author_";
                A1Z[4] = "title_";
                A1Z[5] = "artworkDirectPath_";
                A1Z[6] = "artworkSha256_";
                A1Z[7] = "artworkEncSha256_";
                A1Z[8] = "artistAttribution_";
                A1Z[9] = "countryBlocklist_";
                A1Z[10] = "isExplicit_";
                A1Z[11] = "artworkMediaKey_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ည\u0005\u0007ည\u0006\bဈ\u0007\tည\b\nဇ\t\u000bည\n", A1Z);
            case 3:
                return new C165998cB();
            case 4:
                return new AnonymousClass8SD();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165998cB.class) {
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
