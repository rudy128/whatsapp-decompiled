package X;

/* renamed from: X.8co  reason: invalid class name and case insensitive filesystem */
public final class C166388co extends C23577Bm6 implements C22356B4k {
    public static final int AGENT_ID_FIELD_NUMBER = 47;
    public static final int BIZ_PRIVACY_STATUS_FIELD_NUMBER = 36;
    public static final int BOT_MESSAGE_INVOKER_JID_FIELD_NUMBER = 58;
    public static final int BROADCAST_FIELD_NUMBER = 18;
    public static final int CLEAR_MEDIA_FIELD_NUMBER = 25;
    public static final int COMMENT_METADATA_FIELD_NUMBER = 59;
    public static final C166388co DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 27;
    public static final int EPHEMERAL_DURATION_FIELD_NUMBER = 33;
    public static final int EPHEMERAL_OFF_TO_ON_FIELD_NUMBER = 34;
    public static final int EPHEMERAL_OUT_OF_SYNC_FIELD_NUMBER = 35;
    public static final int EPHEMERAL_START_TIMESTAMP_FIELD_NUMBER = 32;
    public static final int EVENT_ADDITIONAL_METADATA_FIELD_NUMBER = 64;
    public static final int EVENT_RESPONSES_FIELD_NUMBER = 61;
    public static final int FINAL_LIVE_LOCATION_FIELD_NUMBER = 30;
    public static final int FUTUREPROOF_DATA_FIELD_NUMBER = 43;
    public static final int IGNORE_FIELD_NUMBER = 16;
    public static final int IS_1P_BIZ_BOT_MESSAGE_FIELD_NUMBER = 56;
    public static final int IS_GROUP_HISTORY_MESSAGE_FIELD_NUMBER = 57;
    public static final int IS_MENTIONED_IN_STATUS_FIELD_NUMBER = 65;
    public static final int IS_SUPPORT_AI_MESSAGE_FIELD_NUMBER = 70;
    public static final int KEEP_IN_CHAT_FIELD_NUMBER = 50;
    public static final int KEY_FIELD_NUMBER = 1;
    public static final int LABELS_FIELD_NUMBER = 28;
    public static final int MEDIA_CIPHERTEXT_SHA256_FIELD_NUMBER = 20;
    public static final int MEDIA_DATA_FIELD_NUMBER = 38;
    public static final int MESSAGE_ADD_ONS_FIELD_NUMBER = 68;
    public static final int MESSAGE_C2S_TIMESTAMP_FIELD_NUMBER = 6;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    public static final int MESSAGE_SECRET_FIELD_NUMBER = 49;
    public static final int MESSAGE_STUB_PARAMETERS_FIELD_NUMBER = 26;
    public static final int MESSAGE_STUB_TYPE_FIELD_NUMBER = 24;
    public static final int MESSAGE_TIMESTAMP_FIELD_NUMBER = 3;
    public static final int MULTICAST_FIELD_NUMBER = 21;
    public static final int NEWSLETTER_SERVER_ID_FIELD_NUMBER = 63;
    public static final int ORIGINAL_SELF_AUTHOR_USER_JID_STRING_FIELD_NUMBER = 51;
    public static volatile C22357B4l PARSER = null;
    public static final int PARTICIPANT_FIELD_NUMBER = 5;
    public static final int PAYMENT_INFO_FIELD_NUMBER = 29;
    public static final int PAYMENT_TRANSACTION_INFO_FIELD_NUMBER = 53;
    public static final int PHOTO_CHANGE_FIELD_NUMBER = 39;
    public static final int PIN_IN_CHAT_FIELD_NUMBER = 54;
    public static final int POLL_ADDITIONAL_METADATA_FIELD_NUMBER = 46;
    public static final int POLL_UPDATES_FIELD_NUMBER = 45;
    public static final int PREMIUM_MESSAGE_INFO_FIELD_NUMBER = 55;
    public static final int PUSH_NAME_FIELD_NUMBER = 19;
    public static final int QUOTED_PAYMENT_INFO_FIELD_NUMBER = 31;
    public static final int QUOTED_STICKER_DATA_FIELD_NUMBER = 42;
    public static final int REACTIONS_FIELD_NUMBER = 41;
    public static final int REPORTING_TOKEN_INFO_FIELD_NUMBER = 62;
    public static final int REVOKE_MESSAGE_TIMESTAMP_FIELD_NUMBER = 52;
    public static final int STARRED_FIELD_NUMBER = 17;
    public static final int STATUS_ALREADY_VIEWED_FIELD_NUMBER = 48;
    public static final int STATUS_FIELD_NUMBER = 4;
    public static final int STATUS_MENTIONS_FIELD_NUMBER = 66;
    public static final int STATUS_MENTION_MESSAGE_INFO_FIELD_NUMBER = 69;
    public static final int STATUS_MENTION_SOURCES_FIELD_NUMBER = 71;
    public static final int STATUS_PSA_FIELD_NUMBER = 44;
    public static final int URL_NUMBER_FIELD_NUMBER = 23;
    public static final int URL_TEXT_FIELD_NUMBER = 22;
    public static final int USER_RECEIPT_FIELD_NUMBER = 40;
    public static final int VERIFIED_BIZ_NAME_FIELD_NUMBER = 37;
    public String agentId_;
    public int bitField0_;
    public int bitField1_;
    public int bizPrivacyStatus_;
    public String botMessageInvokerJid_;
    public boolean broadcast_;
    public boolean clearMedia_;
    public C164558Zh commentMetadata_;
    public int duration_;
    public int ephemeralDuration_;
    public boolean ephemeralOffToOn_;
    public boolean ephemeralOutOfSync_;
    public long ephemeralStartTimestamp_;
    public AnonymousClass8YU eventAdditionalMetadata_;
    public EE9 eventResponses_;
    public C165968c8 finalLiveLocation_;
    public DSQ futureproofData_;
    public boolean ignore_;
    public boolean is1PBizBotMessage_;
    public boolean isGroupHistoryMessage_;
    public boolean isMentionedInStatus_;
    public boolean isSupportAiMessage_;
    public C165728bf keepInChat_;
    public C166408cq key_;
    public EE9 labels_;
    public DSQ mediaCiphertextSha256_;
    public AnonymousClass8YV mediaData_;
    public byte memoizedIsInitialized = 2;
    public EE9 messageAddOns_;
    public long messageC2STimestamp_;
    public DSQ messageSecret_;
    public EE9 messageStubParameters_;
    public int messageStubType_;
    public long messageTimestamp_;
    public C166418cr message_;
    public boolean multicast_;
    public long newsletterServerId_;
    public String originalSelfAuthorUserJidString_;
    public String participant_ = "";
    public C166078cJ paymentInfo_;
    public C166108cM paymentTransactionInfo_;
    public C165088aZ photoChange_;
    public C165588bR pinInChat_;
    public AnonymousClass8YW pollAdditionalMetadata_;
    public EE9 pollUpdates_;
    public AnonymousClass8YX premiumMessageInfo_;
    public String pushName_ = "";
    public C166078cJ quotedPaymentInfo_;
    public AnonymousClass8YV quotedStickerData_;
    public EE9 reactions_;
    public AnonymousClass8YY reportingTokenInfo_;
    public long revokeMessageTimestamp_;
    public boolean starred_;
    public boolean statusAlreadyViewed_;
    public AnonymousClass8YZ statusMentionMessageInfo_;
    public EE9 statusMentionSources_;
    public EE9 statusMentions_;
    public C164688Zu statusPsa_;
    public int status_ = 1;
    public boolean urlNumber_;
    public boolean urlText_;
    public EE9 userReceipt_;
    public String verifiedBizName_;

    static {
        C166388co r1 = new C166388co();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166388co.class);
    }

    public C179859Ke A0R() {
        C179859Ke A00 = C179859Ke.A00(this.messageStubType_);
        if (A00 == null) {
            return C179859Ke.A38;
        }
        return A00;
    }

    public String A0S(int i) {
        return C17880vN.A0w(this.messageStubParameters_, i);
    }

    public C166388co() {
        DSQ dsq = DSQ.A00;
        this.mediaCiphertextSha256_ = dsq;
        C23579Bm9 bm9 = C23579Bm9.A02;
        this.messageStubParameters_ = bm9;
        this.labels_ = bm9;
        this.verifiedBizName_ = "";
        this.userReceipt_ = bm9;
        this.reactions_ = bm9;
        this.futureproofData_ = dsq;
        this.pollUpdates_ = bm9;
        this.agentId_ = "";
        this.messageSecret_ = dsq;
        this.originalSelfAuthorUserJidString_ = "";
        this.botMessageInvokerJid_ = "";
        this.eventResponses_ = bm9;
        this.statusMentions_ = bm9;
        this.messageAddOns_ = bm9;
        this.statusMentionSources_ = bm9;
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        int i = 1;
        switch (num.intValue()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                if (obj == null) {
                    i = 0;
                }
                this.memoizedIsInitialized = (byte) i;
                return null;
            case 2:
                Object[] A1R = AnonymousClass8BS.A1R(70);
                A1R[1] = "bitField1_";
                A1R[2] = "key_";
                A1R[3] = "message_";
                A1R[4] = "messageTimestamp_";
                A1R[5] = "status_";
                A1R[6] = ALF.A00;
                A1R[7] = "participant_";
                A1R[8] = "messageC2STimestamp_";
                A1R[9] = "ignore_";
                A1R[10] = "starred_";
                A1R[11] = "broadcast_";
                A1R[12] = "pushName_";
                A1R[13] = "mediaCiphertextSha256_";
                A1R[14] = "multicast_";
                A1R[15] = "urlText_";
                A1R[16] = "urlNumber_";
                A1R[17] = "messageStubType_";
                A1R[18] = ALG.A00;
                A1R[19] = "clearMedia_";
                A1R[20] = "messageStubParameters_";
                A1R[21] = "duration_";
                A1R[22] = "labels_";
                A1R[23] = "paymentInfo_";
                A1R[24] = "finalLiveLocation_";
                A1R[25] = "quotedPaymentInfo_";
                A1R[26] = "ephemeralStartTimestamp_";
                A1R[27] = "ephemeralDuration_";
                A1R[28] = "ephemeralOffToOn_";
                A1R[29] = "ephemeralOutOfSync_";
                A1R[30] = "bizPrivacyStatus_";
                A1R[31] = ALE.A00;
                A1R[32] = "verifiedBizName_";
                A1R[33] = "mediaData_";
                A1R[34] = "photoChange_";
                A1R[35] = "userReceipt_";
                A1R[36] = C165768bj.class;
                A1R[37] = "reactions_";
                A1R[38] = C165608bT.class;
                A1R[39] = "quotedStickerData_";
                A1R[40] = "futureproofData_";
                A1R[41] = "statusPsa_";
                A1R[42] = "pollUpdates_";
                A1R[43] = C165598bS.class;
                A1R[44] = "pollAdditionalMetadata_";
                A1R[45] = "agentId_";
                A1R[46] = "statusAlreadyViewed_";
                A1R[47] = "messageSecret_";
                A1R[48] = "keepInChat_";
                A1R[49] = "originalSelfAuthorUserJidString_";
                A1R[50] = "revokeMessageTimestamp_";
                A1R[51] = "paymentTransactionInfo_";
                A1R[52] = "pinInChat_";
                A1R[53] = "premiumMessageInfo_";
                A1R[54] = "is1PBizBotMessage_";
                A1R[55] = "isGroupHistoryMessage_";
                A1R[56] = "botMessageInvokerJid_";
                A1R[57] = "commentMetadata_";
                A1R[58] = "eventResponses_";
                A1R[59] = C165348az.class;
                A1R[60] = "reportingTokenInfo_";
                A1R[61] = "newsletterServerId_";
                A1R[62] = "eventAdditionalMetadata_";
                A1R[63] = "isMentionedInStatus_";
                A1R[64] = "statusMentions_";
                A1R[65] = "messageAddOns_";
                A1R[66] = C165938c2.class;
                A1R[67] = "statusMentionMessageInfo_";
                A1R[68] = "isSupportAiMessage_";
                A1R[69] = "statusMentionSources_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001<\u0000\u0002\u0001G<\u0000\t\u0004\u0001ᔉ\u0000\u0002ဉ\u0001\u0003ဃ\u0002\u0004ဌ\u0003\u0005ဈ\u0004\u0006ဃ\u0005\u0010ဇ\u0006\u0011ဇ\u0007\u0012ဇ\b\u0013ဈ\t\u0014ည\n\u0015ဇ\u000b\u0016ဇ\f\u0017ဇ\r\u0018ဌ\u000e\u0019ဇ\u000f\u001a\u001a\u001bဋ\u0010\u001c\u001a\u001dဉ\u0011\u001eဉ\u0012\u001fဉ\u0013 ဃ\u0014!ဋ\u0015\"ဇ\u0016#ဇ\u0017$ဌ\u0018%ဈ\u0019&ဉ\u001a'ဉ\u001b(Л)\u001b*ဉ\u001c+ည\u001d,ᐉ\u001e-\u001b.ဉ\u001f/ဈ 0ဇ!1ည\"2ဉ#3ဈ$4ဃ%5ᐉ&6ဉ'7ဉ(8ဇ)9ဇ*:ဈ+;ဉ,=\u001b>ဉ-?ဃ.@ဉ/Aဇ0B\u001aD\u001bEဉ1Fဇ2G\u001a", A1R);
            case 3:
                return new C166388co();
            case 4:
                return new AnonymousClass8X1();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166388co.class) {
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
