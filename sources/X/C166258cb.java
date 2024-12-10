package X;

/* renamed from: X.8cb  reason: invalid class name and case insensitive filesystem */
public final class C166258cb extends C23577Bm6 implements C22356B4k {
    public static final int BACKGROUND_ARGB_FIELD_NUMBER = 8;
    public static final int CANONICAL_URL_FIELD_NUMBER = 4;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 17;
    public static final C166258cb DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 5;
    public static final int DONOTPLAYINLINE_FIELD_NUMBER = 18;
    public static final int FAVICONMMSMETADATA_FIELD_NUMBER = 33;
    public static final int FONT_FIELD_NUMBER = 9;
    public static final int INVITE_LINK_GROUP_TYPE_FIELD_NUMBER = 26;
    public static final int INVITE_LINK_GROUP_TYPE_V2_FIELD_NUMBER = 29;
    public static final int INVITE_LINK_PARENT_GROUP_SUBJECT_V2_FIELD_NUMBER = 27;
    public static final int INVITE_LINK_PARENT_GROUP_THUMBNAIL_V2_FIELD_NUMBER = 28;
    public static final int JPEG_THUMBNAIL_FIELD_NUMBER = 16;
    public static final int MATCHED_TEXT_FIELD_NUMBER = 2;
    public static final int MEDIA_KEY_FIELD_NUMBER = 22;
    public static final int MEDIA_KEY_TIMESTAMP_FIELD_NUMBER = 23;
    public static volatile C22357B4l PARSER = null;
    public static final int PREVIEW_TYPE_FIELD_NUMBER = 10;
    public static final int TEXT_ARGB_FIELD_NUMBER = 7;
    public static final int TEXT_FIELD_NUMBER = 1;
    public static final int THUMBNAIL_DIRECT_PATH_FIELD_NUMBER = 19;
    public static final int THUMBNAIL_ENC_SHA256_FIELD_NUMBER = 21;
    public static final int THUMBNAIL_HEIGHT_FIELD_NUMBER = 24;
    public static final int THUMBNAIL_SHA256_FIELD_NUMBER = 20;
    public static final int THUMBNAIL_WIDTH_FIELD_NUMBER = 25;
    public static final int TITLE_FIELD_NUMBER = 6;
    public static final int VIDEO_HEIGHT_FIELD_NUMBER = 31;
    public static final int VIDEO_WIDTH_FIELD_NUMBER = 32;
    public static final int VIEW_ONCE_FIELD_NUMBER = 30;
    public int backgroundArgb_;
    public int bitField0_;
    public String canonicalUrl_ = "";
    public C166278cd contextInfo_;
    public String description_ = "";
    public boolean doNotPlayInline_;
    public C165798bm faviconMMSMetadata_;
    public int font_;
    public int inviteLinkGroupTypeV2_;
    public int inviteLinkGroupType_;
    public String inviteLinkParentGroupSubjectV2_;
    public DSQ inviteLinkParentGroupThumbnailV2_;
    public DSQ jpegThumbnail_;
    public String matchedText_ = "";
    public long mediaKeyTimestamp_;
    public DSQ mediaKey_;
    public int previewType_;
    public int textArgb_;
    public String text_ = "";
    public String thumbnailDirectPath_;
    public DSQ thumbnailEncSha256_;
    public int thumbnailHeight_;
    public DSQ thumbnailSha256_;
    public int thumbnailWidth_;
    public String title_ = "";
    public int videoHeight_;
    public int videoWidth_;
    public boolean viewOnce_;

    static {
        C166258cb r1 = new C166258cb();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166258cb.class);
    }

    public C166258cb() {
        DSQ dsq = DSQ.A00;
        this.jpegThumbnail_ = dsq;
        this.thumbnailDirectPath_ = "";
        this.thumbnailSha256_ = dsq;
        this.thumbnailEncSha256_ = dsq;
        this.mediaKey_ = dsq;
        this.inviteLinkParentGroupSubjectV2_ = "";
        this.inviteLinkParentGroupThumbnailV2_ = dsq;
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(32);
                A1Z[1] = "text_";
                A1Z[2] = "matchedText_";
                A1Z[3] = "canonicalUrl_";
                A1Z[4] = "description_";
                A1Z[5] = "title_";
                A1Z[6] = "textArgb_";
                A1Z[7] = "backgroundArgb_";
                A1Z[8] = "font_";
                A1Z[9] = AKC.A00;
                A1Z[10] = "previewType_";
                A1Z[11] = AKE.A00;
                A1Z[12] = "jpegThumbnail_";
                A1Z[13] = "contextInfo_";
                A1Z[14] = "doNotPlayInline_";
                A1Z[15] = "thumbnailDirectPath_";
                A1Z[16] = "thumbnailSha256_";
                A1Z[17] = "thumbnailEncSha256_";
                A1Z[18] = "mediaKey_";
                A1Z[19] = "mediaKeyTimestamp_";
                A1Z[20] = "thumbnailHeight_";
                A1Z[21] = "thumbnailWidth_";
                A1Z[22] = "inviteLinkGroupType_";
                E69 e69 = AKD.A00;
                A1Z[23] = e69;
                A1Z[24] = "inviteLinkParentGroupSubjectV2_";
                A1Z[25] = "inviteLinkParentGroupThumbnailV2_";
                A1Z[26] = "inviteLinkGroupTypeV2_";
                A1Z[27] = e69;
                A1Z[28] = "viewOnce_";
                A1Z[29] = "videoHeight_";
                A1Z[30] = "videoWidth_";
                A1Z[31] = "faviconMMSMetadata_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u001b\u0000\u0001\u0001!\u001b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဆ\u0005\bဆ\u0006\tဌ\u0007\nဌ\b\u0010ည\t\u0011ဉ\n\u0012ဇ\u000b\u0013ဈ\f\u0014ည\r\u0015ည\u000e\u0016ည\u000f\u0017ဂ\u0010\u0018ဋ\u0011\u0019ဋ\u0012\u001aဌ\u0013\u001bဈ\u0014\u001cည\u0015\u001dဌ\u0016\u001eဇ\u0017\u001fဋ\u0018 ဋ\u0019!ဉ\u001a", A1Z);
            case 3:
                return new C166258cb();
            case 4:
                return new C163738Wd();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166258cb.class) {
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
