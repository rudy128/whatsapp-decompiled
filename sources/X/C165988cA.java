package X;

/* renamed from: X.8cA  reason: invalid class name and case insensitive filesystem */
public final class C165988cA extends C23577Bm6 implements C22356B4k {
    public static final C165988cA DEFAULT_INSTANCE;
    public static final int EXPECTED_LINKS_COUNT_FIELD_NUMBER = 7;
    public static final int FAVICON_CDN_URL_FIELD_NUMBER = 13;
    public static final int PARENT_PLUGIN_TYPE_FIELD_NUMBER = 11;
    public static volatile C22357B4l PARSER = null;
    public static final int PLUGIN_TYPE_FIELD_NUMBER = 2;
    public static final int PLUGIN_VERSION_FIELD_NUMBER = 8;
    public static final int PROFILE_PHOTO_CDN_URL_FIELD_NUMBER = 4;
    public static final int PROVIDER_FIELD_NUMBER = 1;
    public static final int REFERENCE_INDEX_FIELD_NUMBER = 6;
    public static final int SEARCH_PROVIDER_URL_FIELD_NUMBER = 5;
    public static final int SEARCH_QUERY_FIELD_NUMBER = 9;
    public static final int THUMBNAIL_CDN_URL_FIELD_NUMBER = 3;
    public int bitField0_;
    public int expectedLinksCount_;
    public String faviconCdnUrl_ = "";
    public int parentPluginType_ = 1;
    public int pluginType_ = 1;
    public int pluginVersion_;
    public String profilePhotoCdnUrl_ = "";
    public int provider_ = 1;
    public int referenceIndex_;
    public String searchProviderUrl_ = "";
    public String searchQuery_ = "";
    public String thumbnailCdnUrl_ = "";

    static {
        C165988cA r1 = new C165988cA();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165988cA.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(15);
                A1Z[1] = "provider_";
                A1Z[2] = C20404AJt.A00;
                A1Z[3] = "pluginType_";
                E69 e69 = C20403AJs.A00;
                A1Z[4] = e69;
                A1Z[5] = "thumbnailCdnUrl_";
                A1Z[6] = "profilePhotoCdnUrl_";
                A1Z[7] = "searchProviderUrl_";
                A1Z[8] = "referenceIndex_";
                A1Z[9] = "expectedLinksCount_";
                A1Z[10] = "pluginVersion_";
                A1Z[11] = "searchQuery_";
                A1Z[12] = "parentPluginType_";
                A1Z[13] = e69;
                A1Z[14] = "faviconCdnUrl_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007\tဈ\b\u000bဌ\t\rဈ\n", A1Z);
            case 3:
                return new C165988cA();
            case 4:
                return new C162608Ru();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165988cA.class) {
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
