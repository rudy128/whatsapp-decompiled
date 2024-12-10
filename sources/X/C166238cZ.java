package X;

/* renamed from: X.8cZ  reason: invalid class name and case insensitive filesystem */
public final class C166238cZ extends C23577Bm6 implements C22356B4k {
    public static final int AD_CONTEXT_PREVIEW_DISMISSED_FIELD_NUMBER = 16;
    public static final int AUTOMATED_GREETING_MESSAGE_CTA_TYPE_FIELD_NUMBER = 23;
    public static final int AUTOMATED_GREETING_MESSAGE_SHOWN_FIELD_NUMBER = 18;
    public static final int BODY_FIELD_NUMBER = 2;
    public static final int CLICK_TO_WHATSAPP_CALL_FIELD_NUMBER = 15;
    public static final int CONTAINS_AUTO_REPLY_FIELD_NUMBER = 10;
    public static final int CTA_PAYLOAD_FIELD_NUMBER = 20;
    public static final int CTWA_CLID_FIELD_NUMBER = 13;
    public static final C166238cZ DEFAULT_INSTANCE;
    public static final int DISABLE_NUDGE_FIELD_NUMBER = 21;
    public static final int GREETING_MESSAGE_BODY_FIELD_NUMBER = 19;
    public static final int MEDIA_TYPE_FIELD_NUMBER = 3;
    public static final int MEDIA_URL_FIELD_NUMBER = 5;
    public static final int ORIGINAL_IMAGE_URL_FIELD_NUMBER = 22;
    public static volatile C22357B4l PARSER = null;
    public static final int REF_FIELD_NUMBER = 14;
    public static final int RENDER_LARGER_THUMBNAIL_FIELD_NUMBER = 11;
    public static final int SHOW_AD_ATTRIBUTION_FIELD_NUMBER = 12;
    public static final int SOURCE_APP_FIELD_NUMBER = 17;
    public static final int SOURCE_ID_FIELD_NUMBER = 8;
    public static final int SOURCE_TYPE_FIELD_NUMBER = 7;
    public static final int SOURCE_URL_FIELD_NUMBER = 9;
    public static final int THUMBNAIL_FIELD_NUMBER = 6;
    public static final int THUMBNAIL_URL_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 1;
    public boolean adContextPreviewDismissed_;
    public String automatedGreetingMessageCtaType_ = "";
    public boolean automatedGreetingMessageShown_;
    public int bitField0_;
    public String body_ = "";
    public boolean clickToWhatsappCall_;
    public boolean containsAutoReply_;
    public String ctaPayload_ = "";
    public String ctwaClid_ = "";
    public boolean disableNudge_;
    public String greetingMessageBody_ = "";
    public int mediaType_;
    public String mediaUrl_ = "";
    public String originalImageUrl_ = "";
    public String ref_ = "";
    public boolean renderLargerThumbnail_;
    public boolean showAdAttribution_;
    public String sourceApp_ = "";
    public String sourceId_ = "";
    public String sourceType_ = "";
    public String sourceUrl_ = "";
    public String thumbnailUrl_ = "";
    public DSQ thumbnail_ = DSQ.A00;
    public String title_ = "";

    static {
        C166238cZ r1 = new C166238cZ();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166238cZ.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(25);
                A1Z[1] = "title_";
                A1Z[2] = "body_";
                A1Z[3] = "mediaType_";
                A1Z[4] = C20406AJv.A00;
                A1Z[5] = "thumbnailUrl_";
                A1Z[6] = "mediaUrl_";
                A1Z[7] = "thumbnail_";
                A1Z[8] = "sourceType_";
                A1Z[9] = "sourceId_";
                A1Z[10] = "sourceUrl_";
                A1Z[11] = "containsAutoReply_";
                A1Z[12] = "renderLargerThumbnail_";
                A1Z[13] = "showAdAttribution_";
                A1Z[14] = "ctwaClid_";
                A1Z[15] = "ref_";
                A1Z[16] = "clickToWhatsappCall_";
                A1Z[17] = "adContextPreviewDismissed_";
                A1Z[18] = "sourceApp_";
                A1Z[19] = "automatedGreetingMessageShown_";
                A1Z[20] = "greetingMessageBody_";
                A1Z[21] = "ctaPayload_";
                A1Z[22] = "disableNudge_";
                A1Z[23] = "originalImageUrl_";
                A1Z[24] = "automatedGreetingMessageCtaType_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0017\u0000\u0001\u0001\u0017\u0017\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ည\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဇ\t\u000bဇ\n\fဇ\u000b\rဈ\f\u000eဈ\r\u000fဇ\u000e\u0010ဇ\u000f\u0011ဈ\u0010\u0012ဇ\u0011\u0013ဈ\u0012\u0014ဈ\u0013\u0015ဇ\u0014\u0016ဈ\u0015\u0017ဈ\u0016", A1Z);
            case 3:
                return new C166238cZ();
            case 4:
                return new AnonymousClass8S7();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166238cZ.class) {
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
