package X;

/* renamed from: X.8cn  reason: invalid class name and case insensitive filesystem */
public final class C166378cn extends C23577Bm6 implements C22356B4k {
    public static final int AGENT_ACTION_FIELD_NUMBER = 27;
    public static final int ANDROID_UNSUPPORTED_ACTIONS_FIELD_NUMBER = 26;
    public static final int ARCHIVE_CHAT_ACTION_FIELD_NUMBER = 17;
    public static final int BOT_WELCOME_REQUEST_ACTION_FIELD_NUMBER = 45;
    public static final int CALL_LOG_ACTION_FIELD_NUMBER = 42;
    public static final int CHAT_ASSIGNMENT_FIELD_NUMBER = 35;
    public static final int CHAT_ASSIGNMENT_OPENED_STATUS_FIELD_NUMBER = 36;
    public static final int CHAT_LOCK_SETTINGS_FIELD_NUMBER = 51;
    public static final int CLEAR_CHAT_ACTION_FIELD_NUMBER = 21;
    public static final int CONTACT_ACTION_FIELD_NUMBER = 3;
    public static final int CUSTOM_PAYMENT_METHODS_ACTION_FIELD_NUMBER = 49;
    public static final C166378cn DEFAULT_INSTANCE;
    public static final int DELETE_CHAT_ACTION_FIELD_NUMBER = 22;
    public static final int DELETE_INDIVIDUAL_CALL_LOG_FIELD_NUMBER = 46;
    public static final int DELETE_MESSAGE_FOR_ME_ACTION_FIELD_NUMBER = 18;
    public static final int DEVICE_CAPABILITIES_FIELD_NUMBER = 54;
    public static final int EXTERNAL_WEB_BETA_ACTION_FIELD_NUMBER = 40;
    public static final int FAVORITES_ACTION_FIELD_NUMBER = 56;
    public static final int KEY_EXPIRATION_FIELD_NUMBER = 19;
    public static final int LABEL_ASSOCIATION_ACTION_FIELD_NUMBER = 15;
    public static final int LABEL_EDIT_ACTION_FIELD_NUMBER = 14;
    public static final int LABEL_REORDERING_ACTION_FIELD_NUMBER = 47;
    public static final int LOCALE_SETTING_FIELD_NUMBER = 16;
    public static final int LOCK_CHAT_ACTION_FIELD_NUMBER = 50;
    public static final int MARKETING_MESSAGE_ACTION_FIELD_NUMBER = 38;
    public static final int MARKETING_MESSAGE_BROADCAST_ACTION_FIELD_NUMBER = 39;
    public static final int MARK_CHAT_AS_READ_ACTION_FIELD_NUMBER = 20;
    public static final int MERCHANT_PAYMENT_PARTNER_ACTION_FIELD_NUMBER = 57;
    public static final int MUTE_ACTION_FIELD_NUMBER = 4;
    public static final int NOTE_EDIT_ACTION_FIELD_NUMBER = 55;
    public static final int NOTIFICATION_ACTIVITY_SETTING_ACTION_FIELD_NUMBER = 60;
    public static final int NUX_ACTION_FIELD_NUMBER = 31;
    public static volatile C22357B4l PARSER = null;
    public static final int PAYMENT_INFO_ACTION_FIELD_NUMBER = 48;
    public static final int PIN_ACTION_FIELD_NUMBER = 5;
    public static final int PN_FOR_LID_CHAT_ACTION_FIELD_NUMBER = 37;
    public static final int PRIMARY_FEATURE_FIELD_NUMBER = 24;
    public static final int PRIMARY_VERSION_ACTION_FIELD_NUMBER = 32;
    public static final int PRIVACY_SETTING_DISABLE_LINK_PREVIEWS_ACTION_FIELD_NUMBER = 53;
    public static final int PRIVACY_SETTING_RELAY_ALL_CALLS_FIELD_NUMBER = 41;
    public static final int PUSH_NAME_SETTING_FIELD_NUMBER = 7;
    public static final int QUICK_REPLY_ACTION_FIELD_NUMBER = 8;
    public static final int RECENT_EMOJI_WEIGHTS_ACTION_FIELD_NUMBER = 11;
    public static final int REMOVE_RECENT_STICKER_ACTION_FIELD_NUMBER = 34;
    public static final int SECURITY_NOTIFICATION_SETTING_FIELD_NUMBER = 6;
    public static final int STAR_ACTION_FIELD_NUMBER = 2;
    public static final int STATUS_PRIVACY_FIELD_NUMBER = 44;
    public static final int STICKER_ACTION_FIELD_NUMBER = 33;
    public static final int SUBSCRIPTION_ACTION_FIELD_NUMBER = 28;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    public static final int TIME_FORMAT_ACTION_FIELD_NUMBER = 30;
    public static final int UGC_BOT_FIELD_NUMBER = 43;
    public static final int UNARCHIVE_CHATS_SETTING_FIELD_NUMBER = 23;
    public static final int USERNAME_CHAT_START_MODE_FIELD_NUMBER = 59;
    public static final int USER_STATUS_MUTE_ACTION_FIELD_NUMBER = 29;
    public static final int WAFFLE_ACCOUNT_LINK_STATE_ACTION_FIELD_NUMBER = 58;
    public static final int WAMO_USER_IDENTIFIER_ACTION_FIELD_NUMBER = 52;
    public C164988aP agentAction_;
    public C164188Xw androidUnsupportedActions_;
    public AnonymousClass8ZV archiveChatAction_;
    public int bitField0_;
    public int bitField1_;
    public C164198Xx botWelcomeRequestAction_;
    public C164208Xy callLogAction_;
    public AnonymousClass8Y0 chatAssignmentOpenedStatus_;
    public C164218Xz chatAssignment_;
    public C164288Yg chatLockSettings_;
    public AnonymousClass8Y1 clearChatAction_;
    public C165318aw contactAction_;
    public AnonymousClass8Y2 customPaymentMethodsAction_;
    public AnonymousClass8Y3 deleteChatAction_;
    public AnonymousClass8ZW deleteIndividualCallLog_;
    public AnonymousClass8ZX deleteMessageForMeAction_;
    public AnonymousClass8XT deviceCapabilities_;
    public AnonymousClass8Y4 externalWebBetaAction_;
    public AnonymousClass8XL favoritesAction_;
    public AnonymousClass8Y6 keyExpiration_;
    public AnonymousClass8Y7 labelAssociationAction_;
    public C165548bN labelEditAction_;
    public AnonymousClass8XM labelReorderingAction_;
    public AnonymousClass8Y8 localeSetting_;
    public AnonymousClass8Y9 lockChatAction_;
    public AnonymousClass8ZY markChatAsReadAction_;
    public C165838bq marketingMessageAction_;
    public AnonymousClass8YA marketingMessageBroadcastAction_;
    public byte memoizedIsInitialized = 2;
    public C165458bB merchantPaymentPartnerAction_;
    public C164998aQ muteAction_;
    public C165558bO noteEditAction_;
    public AnonymousClass8YB notificationActivitySettingAction_;
    public AnonymousClass8YC nuxAction_;
    public AnonymousClass8YD paymentInfoAction_;
    public AnonymousClass8YE pinAction_;
    public AnonymousClass8YF pnForLidChatAction_;
    public AnonymousClass8XN primaryFeature_;
    public AnonymousClass8YG primaryVersionAction_;
    public AnonymousClass8YH privacySettingDisableLinkPreviewsAction_;
    public AnonymousClass8YI privacySettingRelayAllCalls_;
    public AnonymousClass8YJ pushNameSetting_;
    public C165568bP quickReplyAction_;
    public AnonymousClass8XO recentEmojiWeightsAction_;
    public AnonymousClass8YK removeRecentStickerAction_;
    public AnonymousClass8YL securityNotificationSetting_;
    public AnonymousClass8YM starAction_;
    public AnonymousClass8ZZ statusPrivacy_;
    public C166008cC stickerAction_;
    public C165008aR subscriptionAction_;
    public AnonymousClass8YN timeFormatAction_;
    public long timestamp_;
    public AnonymousClass8YO ugcBot_;
    public AnonymousClass8YP unarchiveChatsSetting_;
    public AnonymousClass8YQ userStatusMuteAction_;
    public AnonymousClass8YR usernameChatStartMode_;
    public AnonymousClass8YS waffleAccountLinkStateAction_;
    public AnonymousClass8YT wamoUserIdentifierAction_;

    static {
        C166378cn r1 = new C166378cn();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166378cn.class);
    }

    public boolean A0R() {
        return AnonymousClass8BW.A1Q(this.bitField0_);
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
                Object[] A1R = AnonymousClass8BS.A1R(57);
                A1R[1] = "bitField1_";
                A1R[2] = "timestamp_";
                A1R[3] = "starAction_";
                A1R[4] = "contactAction_";
                A1R[5] = "muteAction_";
                A1R[6] = "pinAction_";
                A1R[7] = "securityNotificationSetting_";
                A1R[8] = "pushNameSetting_";
                A1R[9] = "quickReplyAction_";
                A1R[10] = "recentEmojiWeightsAction_";
                A1R[11] = "labelEditAction_";
                A1R[12] = "labelAssociationAction_";
                A1R[13] = "localeSetting_";
                A1R[14] = "archiveChatAction_";
                A1R[15] = "deleteMessageForMeAction_";
                A1R[16] = "keyExpiration_";
                A1R[17] = "markChatAsReadAction_";
                A1R[18] = "clearChatAction_";
                A1R[19] = "deleteChatAction_";
                A1R[20] = "unarchiveChatsSetting_";
                A1R[21] = "primaryFeature_";
                A1R[22] = "androidUnsupportedActions_";
                A1R[23] = "agentAction_";
                A1R[24] = "subscriptionAction_";
                A1R[25] = "userStatusMuteAction_";
                A1R[26] = "timeFormatAction_";
                A1R[27] = "nuxAction_";
                A1R[28] = "primaryVersionAction_";
                A1R[29] = "stickerAction_";
                A1R[30] = "removeRecentStickerAction_";
                A1R[31] = "chatAssignment_";
                A1R[32] = "chatAssignmentOpenedStatus_";
                A1R[33] = "pnForLidChatAction_";
                A1R[34] = "marketingMessageAction_";
                A1R[35] = "marketingMessageBroadcastAction_";
                A1R[36] = "externalWebBetaAction_";
                A1R[37] = "privacySettingRelayAllCalls_";
                A1R[38] = "callLogAction_";
                A1R[39] = "ugcBot_";
                A1R[40] = "statusPrivacy_";
                A1R[41] = "botWelcomeRequestAction_";
                A1R[42] = "deleteIndividualCallLog_";
                A1R[43] = "labelReorderingAction_";
                A1R[44] = "paymentInfoAction_";
                A1R[45] = "customPaymentMethodsAction_";
                A1R[46] = "lockChatAction_";
                A1R[47] = "chatLockSettings_";
                A1R[48] = "wamoUserIdentifierAction_";
                A1R[49] = "privacySettingDisableLinkPreviewsAction_";
                A1R[50] = "deviceCapabilities_";
                A1R[51] = "noteEditAction_";
                A1R[52] = "favoritesAction_";
                A1R[53] = "merchantPaymentPartnerAction_";
                A1R[54] = "waffleAccountLinkStateAction_";
                A1R[55] = "usernameChatStartMode_";
                A1R[56] = "notificationActivitySettingAction_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u00017\u0000\u0002\u0001<7\u0000\u0000\u0002\u0001ဂ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\u000bဉ\b\u000eဉ\t\u000fဉ\n\u0010ဉ\u000b\u0011ဉ\f\u0012ဉ\r\u0013ဉ\u000e\u0014ဉ\u000f\u0015ဉ\u0010\u0016ဉ\u0011\u0017ဉ\u0012\u0018ဉ\u0013\u001aဉ\u0014\u001bဉ\u0015\u001cဉ\u0016\u001dဉ\u0017\u001eဉ\u0018\u001fဉ\u0019 ဉ\u001a!ဉ\u001b\"ဉ\u001c#ဉ\u001d$ဉ\u001e%ဉ\u001f&ဉ 'ဉ!(ဉ\")ဉ#*ဉ$+ဉ%,ဉ&-ဉ'.ဉ(/ဉ)0ဉ*1ᐉ+2ဉ,3ဉ-4ဉ.5ဉ/6ဉ07ဉ18ဉ29ᐉ3:ဉ4;ဉ5<ဉ6", A1R);
            case 3:
                return new C166378cn();
            case 4:
                return new C163398Uv();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166378cn.class) {
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
