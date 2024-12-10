package X;

/* renamed from: X.8cd  reason: invalid class name and case insensitive filesystem */
public final class C166278cd extends C23577Bm6 implements C22356B4k {
    public static final int ACTION_LINK_FIELD_NUMBER = 33;
    public static final int ALWAYS_SHOW_AD_ATTRIBUTION_FIELD_NUMBER = 48;
    public static final int BUSINESS_MESSAGE_FORWARD_INFO_FIELD_NUMBER = 44;
    public static final int CONVERSION_DATA_FIELD_NUMBER = 19;
    public static final int CONVERSION_DELAY_SECONDS_FIELD_NUMBER = 20;
    public static final int CONVERSION_SOURCE_FIELD_NUMBER = 18;
    public static final int CTWA_PAYLOAD_FIELD_NUMBER = 55;
    public static final int CTWA_SIGNALS_FIELD_NUMBER = 54;
    public static final int DATA_SHARING_CONTEXT_FIELD_NUMBER = 47;
    public static final C166278cd DEFAULT_INSTANCE;
    public static final int DISAPPEARING_MODE_FIELD_NUMBER = 32;
    public static final int ENTRY_POINT_CONVERSION_APP_FIELD_NUMBER = 30;
    public static final int ENTRY_POINT_CONVERSION_DELAY_SECONDS_FIELD_NUMBER = 31;
    public static final int ENTRY_POINT_CONVERSION_EXTERNAL_MEDIUM_FIELD_NUMBER = 51;
    public static final int ENTRY_POINT_CONVERSION_EXTERNAL_SOURCE_FIELD_NUMBER = 50;
    public static final int ENTRY_POINT_CONVERSION_SOURCE_FIELD_NUMBER = 29;
    public static final int EPHEMERAL_SETTING_TIMESTAMP_FIELD_NUMBER = 26;
    public static final int EPHEMERAL_SHARED_SECRET_FIELD_NUMBER = 27;
    public static final int EXPIRATION_FIELD_NUMBER = 25;
    public static final int EXTERNAL_AD_REPLY_FIELD_NUMBER = 28;
    public static final int FEATURE_ELIGIBILITIES_FIELD_NUMBER = 49;
    public static final int FORWARDED_NEWSLETTER_MESSAGE_INFO_FIELD_NUMBER = 43;
    public static final int FORWARDING_SCORE_FIELD_NUMBER = 21;
    public static final int GROUP_MENTIONS_FIELD_NUMBER = 40;
    public static final int GROUP_SUBJECT_FIELD_NUMBER = 34;
    public static final int IS_FORWARDED_FIELD_NUMBER = 22;
    public static final int IS_SAMPLED_FIELD_NUMBER = 39;
    public static final int MENTIONED_JID_FIELD_NUMBER = 15;
    public static final int PARENT_GROUP_JID_FIELD_NUMBER = 35;
    public static volatile C22357B4l PARSER = null;
    public static final int PARTICIPANT_FIELD_NUMBER = 2;
    public static final int PLACEHOLDER_KEY_FIELD_NUMBER = 24;
    public static final int QUOTED_AD_FIELD_NUMBER = 23;
    public static final int QUOTED_MESSAGE_FIELD_NUMBER = 3;
    public static final int REMOTE_JID_FIELD_NUMBER = 4;
    public static final int SMB_CLIENT_CAMPAIGN_ID_FIELD_NUMBER = 45;
    public static final int STANZA_ID_FIELD_NUMBER = 1;
    public static final int STATUS_ATTRIBUTION_TYPE_FIELD_NUMBER = 57;
    public static final int TRUST_BANNER_ACTION_FIELD_NUMBER = 38;
    public static final int TRUST_BANNER_TYPE_FIELD_NUMBER = 37;
    public C164318Yj actionLink_;
    public boolean alwaysShowAdAttribution_;
    public int bitField0_;
    public int bitField1_;
    public AnonymousClass8XW businessMessageForwardInfo_;
    public DSQ conversionData_;
    public int conversionDelaySeconds_;
    public String conversionSource_;
    public DSQ ctwaPayload_;
    public String ctwaSignals_;
    public C164708Zw dataSharingContext_;
    public C166328ci disappearingMode_;
    public String entryPointConversionApp_;
    public int entryPointConversionDelaySeconds_;
    public String entryPointConversionExternalMedium_;
    public String entryPointConversionExternalSource_;
    public String entryPointConversionSource_;
    public long ephemeralSettingTimestamp_;
    public DSQ ephemeralSharedSecret_;
    public int expiration_;
    public C166238cZ externalAdReply_;
    public C164388Yq featureEligibilities_;
    public C165508bG forwardedNewsletterMessageInfo_;
    public int forwardingScore_;
    public EE9 groupMentions_;
    public String groupSubject_;
    public boolean isForwarded_;
    public boolean isSampled_;
    public EE9 mentionedJid_;
    public String parentGroupJid_;
    public String participant_ = "";
    public C166408cq placeholderKey_;
    public C165198ak quotedAd_;
    public C166418cr quotedMessage_;
    public String remoteJid_ = "";
    public String smbClientCampaignId_;
    public String stanzaId_ = "";
    public int statusAttributionType_;
    public int trustBannerAction_;
    public String trustBannerType_;

    static {
        C166278cd r1 = new C166278cd();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166278cd.class);
    }

    public C166278cd() {
        C23579Bm9 bm9 = C23579Bm9.A02;
        this.mentionedJid_ = bm9;
        this.conversionSource_ = "";
        DSQ dsq = DSQ.A00;
        this.conversionData_ = dsq;
        this.ephemeralSharedSecret_ = dsq;
        this.entryPointConversionSource_ = "";
        this.entryPointConversionApp_ = "";
        this.groupSubject_ = "";
        this.parentGroupJid_ = "";
        this.trustBannerType_ = "";
        this.groupMentions_ = bm9;
        this.smbClientCampaignId_ = "";
        this.entryPointConversionExternalSource_ = "";
        this.entryPointConversionExternalMedium_ = "";
        this.ctwaSignals_ = "";
        this.ctwaPayload_ = dsq;
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(42);
                A1Z[1] = "bitField1_";
                A1Z[2] = "stanzaId_";
                A1Z[3] = "participant_";
                A1Z[4] = "quotedMessage_";
                A1Z[5] = "remoteJid_";
                A1Z[6] = "mentionedJid_";
                A1Z[7] = "conversionSource_";
                A1Z[8] = "conversionData_";
                A1Z[9] = "conversionDelaySeconds_";
                A1Z[10] = "forwardingScore_";
                A1Z[11] = "isForwarded_";
                A1Z[12] = "quotedAd_";
                A1Z[13] = "placeholderKey_";
                A1Z[14] = "expiration_";
                A1Z[15] = "ephemeralSettingTimestamp_";
                A1Z[16] = "ephemeralSharedSecret_";
                A1Z[17] = "externalAdReply_";
                A1Z[18] = "entryPointConversionSource_";
                A1Z[19] = "entryPointConversionApp_";
                A1Z[20] = "entryPointConversionDelaySeconds_";
                A1Z[21] = "disappearingMode_";
                A1Z[22] = "actionLink_";
                A1Z[23] = "groupSubject_";
                A1Z[24] = "parentGroupJid_";
                A1Z[25] = "trustBannerType_";
                A1Z[26] = "trustBannerAction_";
                A1Z[27] = "isSampled_";
                A1Z[28] = "groupMentions_";
                A1Z[29] = C164418Yt.class;
                A1Z[30] = "forwardedNewsletterMessageInfo_";
                A1Z[31] = "businessMessageForwardInfo_";
                A1Z[32] = "smbClientCampaignId_";
                A1Z[33] = "dataSharingContext_";
                A1Z[34] = "alwaysShowAdAttribution_";
                A1Z[35] = "featureEligibilities_";
                A1Z[36] = "entryPointConversionExternalSource_";
                A1Z[37] = "entryPointConversionExternalMedium_";
                A1Z[38] = "ctwaSignals_";
                A1Z[39] = "ctwaPayload_";
                A1Z[40] = "statusAttributionType_";
                A1Z[41] = C20408AJx.A00;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001&\u0000\u0002\u00019&\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u000f\u001a\u0012ဈ\u0004\u0013ည\u0005\u0014ဋ\u0006\u0015ဋ\u0007\u0016ဇ\b\u0017ဉ\t\u0018ဉ\n\u0019ဋ\u000b\u001aဂ\f\u001bည\r\u001cဉ\u000e\u001dဈ\u000f\u001eဈ\u0010\u001fဋ\u0011 ဉ\u0012!ဉ\u0013\"ဈ\u0014#ဈ\u0015%ဈ\u0016&ဋ\u0017'ဇ\u0018(\u001b+ဉ\u0019,ဉ\u001a-ဈ\u001b/ဉ\u001c0ဇ\u001d1ဉ\u001e2ဈ\u001f3ဈ 6ဈ!7ည\"9ဌ#", A1Z);
            case 3:
                return new C166278cd();
            case 4:
                return new AnonymousClass8S3();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166278cd.class) {
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
