package X;

/* renamed from: X.8cf  reason: invalid class name and case insensitive filesystem */
public final class C166298cf extends C23577Bm6 implements C22356B4k {
    public static final int ARCHIVED_FIELD_NUMBER = 16;
    public static final int CAPI_CREATED_GROUP_FIELD_NUMBER = 48;
    public static final int COMMENTS_COUNT_FIELD_NUMBER = 45;
    public static final int CONTACT_PRIMARY_IDENTITY_KEY_FIELD_NUMBER = 23;
    public static final int CONVERSATION_TIMESTAMP_FIELD_NUMBER = 12;
    public static final int CREATED_AT_FIELD_NUMBER = 31;
    public static final int CREATED_BY_FIELD_NUMBER = 32;
    public static final C166298cf DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 33;
    public static final int DISAPPEARING_MODE_FIELD_NUMBER = 17;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 38;
    public static final int END_OF_HISTORY_TRANSFER_FIELD_NUMBER = 8;
    public static final int END_OF_HISTORY_TRANSFER_TYPE_FIELD_NUMBER = 11;
    public static final int EPHEMERAL_EXPIRATION_FIELD_NUMBER = 9;
    public static final int EPHEMERAL_SETTING_TIMESTAMP_FIELD_NUMBER = 10;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IS_DEFAULT_SUBGROUP_FIELD_NUMBER = 36;
    public static final int IS_PARENT_GROUP_FIELD_NUMBER = 35;
    public static final int LAST_MSG_TIMESTAMP_FIELD_NUMBER = 5;
    public static final int LID_JID_FIELD_NUMBER = 42;
    public static final int LID_ORIGIN_TYPE_FIELD_NUMBER = 44;
    public static final int LOCKED_FIELD_NUMBER = 46;
    public static final int MARKED_AS_UNREAD_FIELD_NUMBER = 19;
    public static final int MEDIA_VISIBILITY_FIELD_NUMBER = 27;
    public static final int MESSAGES_FIELD_NUMBER = 2;
    public static final int MUTE_END_TIME_FIELD_NUMBER = 25;
    public static final int NAME_FIELD_NUMBER = 13;
    public static final int NEW_JID_FIELD_NUMBER = 3;
    public static final int NOT_SPAM_FIELD_NUMBER = 15;
    public static final int OLD_JID_FIELD_NUMBER = 4;
    public static final int PARENT_GROUP_ID_FIELD_NUMBER = 37;
    public static volatile C22357B4l PARSER = null;
    public static final int PARTICIPANT_FIELD_NUMBER = 20;
    public static final int PINNED_FIELD_NUMBER = 24;
    public static final int PNH_DUPLICATE_LID_THREAD_FIELD_NUMBER = 41;
    public static final int PN_JID_FIELD_NUMBER = 39;
    public static final int P_HASH_FIELD_NUMBER = 14;
    public static final int READ_ONLY_FIELD_NUMBER = 7;
    public static final int SHARE_OWN_PN_FIELD_NUMBER = 40;
    public static final int SUPPORT_FIELD_NUMBER = 34;
    public static final int SUSPENDED_FIELD_NUMBER = 29;
    public static final int SYSTEM_MESSAGE_TO_INSERT_FIELD_NUMBER = 47;
    public static final int TC_TOKEN_FIELD_NUMBER = 21;
    public static final int TC_TOKEN_SENDER_TIMESTAMP_FIELD_NUMBER = 28;
    public static final int TC_TOKEN_TIMESTAMP_FIELD_NUMBER = 22;
    public static final int TERMINATED_FIELD_NUMBER = 30;
    public static final int UNREAD_COUNT_FIELD_NUMBER = 6;
    public static final int UNREAD_MENTION_COUNT_FIELD_NUMBER = 18;
    public static final int USERNAME_FIELD_NUMBER = 43;
    public static final int WALLPAPER_FIELD_NUMBER = 26;
    public boolean archived_;
    public int bitField0_;
    public int bitField1_;
    public boolean capiCreatedGroup_;
    public int commentsCount_;
    public DSQ contactPrimaryIdentityKey_;
    public long conversationTimestamp_;
    public long createdAt_;
    public String createdBy_;
    public String description_;
    public C166328ci disappearingMode_;
    public String displayName_;
    public int endOfHistoryTransferType_;
    public boolean endOfHistoryTransfer_;
    public int ephemeralExpiration_;
    public long ephemeralSettingTimestamp_;
    public String id_ = "";
    public boolean isDefaultSubgroup_;
    public boolean isParentGroup_;
    public long lastMsgTimestamp_;
    public String lidJid_;
    public String lidOriginType_;
    public boolean locked_;
    public boolean markedAsUnread_;
    public int mediaVisibility_;
    public byte memoizedIsInitialized = 2;
    public EE9 messages_;
    public long muteEndTime_;
    public String name_;
    public String newJid_;
    public boolean notSpam_;
    public String oldJid_;
    public String pHash_;
    public String parentGroupId_;
    public EE9 participant_;
    public int pinned_;
    public String pnJid_;
    public boolean pnhDuplicateLidThread_;
    public boolean readOnly_;
    public boolean shareOwnPn_;
    public boolean support_;
    public boolean suspended_;
    public int systemMessageToInsert_;
    public long tcTokenSenderTimestamp_;
    public long tcTokenTimestamp_;
    public DSQ tcToken_;
    public boolean terminated_;
    public int unreadCount_;
    public int unreadMentionCount_;
    public String username_;
    public AnonymousClass8ZQ wallpaper_;

    static {
        C166298cf r1 = new C166298cf();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166298cf.class);
    }

    public C166298cf() {
        C23579Bm9 bm9 = C23579Bm9.A02;
        this.messages_ = bm9;
        this.newJid_ = "";
        this.oldJid_ = "";
        this.name_ = "";
        this.pHash_ = "";
        this.participant_ = bm9;
        DSQ dsq = DSQ.A00;
        this.tcToken_ = dsq;
        this.contactPrimaryIdentityKey_ = dsq;
        this.createdBy_ = "";
        this.description_ = "";
        this.parentGroupId_ = "";
        this.displayName_ = "";
        this.pnJid_ = "";
        this.lidJid_ = "";
        this.username_ = "";
        this.lidOriginType_ = "";
        this.systemMessageToInsert_ = 1;
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
                Object[] A1R = AnonymousClass8BS.A1R(55);
                AnonymousClass8BU.A1O(A1R, "bitField1_");
                A1R[3] = "messages_";
                A1R[4] = C164658Zr.class;
                A1R[5] = "newJid_";
                A1R[6] = "oldJid_";
                A1R[7] = "lastMsgTimestamp_";
                A1R[8] = "unreadCount_";
                A1R[9] = "readOnly_";
                A1R[10] = "endOfHistoryTransfer_";
                A1R[11] = "ephemeralExpiration_";
                A1R[12] = "ephemeralSettingTimestamp_";
                A1R[13] = "endOfHistoryTransferType_";
                A1R[14] = C20420AKj.A00;
                A1R[15] = "conversationTimestamp_";
                A1R[16] = "name_";
                A1R[17] = "pHash_";
                A1R[18] = "notSpam_";
                A1R[19] = "archived_";
                A1R[20] = "disappearingMode_";
                A1R[21] = "unreadMentionCount_";
                A1R[22] = "markedAsUnread_";
                A1R[23] = "participant_";
                A1R[24] = C164648Zq.class;
                A1R[25] = "tcToken_";
                A1R[26] = "tcTokenTimestamp_";
                A1R[27] = "contactPrimaryIdentityKey_";
                A1R[28] = "pinned_";
                A1R[29] = "muteEndTime_";
                A1R[30] = "wallpaper_";
                A1R[31] = "mediaVisibility_";
                A1R[32] = C20424AKn.A00;
                A1R[33] = "tcTokenSenderTimestamp_";
                A1R[34] = "suspended_";
                A1R[35] = "terminated_";
                A1R[36] = "createdAt_";
                A1R[37] = "createdBy_";
                A1R[38] = "description_";
                A1R[39] = "support_";
                A1R[40] = "isParentGroup_";
                A1R[41] = "isDefaultSubgroup_";
                A1R[42] = "parentGroupId_";
                A1R[43] = "displayName_";
                A1R[44] = "pnJid_";
                A1R[45] = "shareOwnPn_";
                A1R[46] = "pnhDuplicateLidThread_";
                A1R[47] = "lidJid_";
                A1R[48] = "username_";
                A1R[49] = "lidOriginType_";
                A1R[50] = "commentsCount_";
                A1R[51] = "locked_";
                A1R[52] = "systemMessageToInsert_";
                A1R[53] = C20426AKp.A00;
                A1R[54] = "capiCreatedGroup_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u00010\u0000\u0002\u000100\u0000\u0002\u0003\u0001ᔈ\u0000\u0002Л\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဃ\u0003\u0006ဋ\u0004\u0007ဇ\u0005\bဇ\u0006\tဋ\u0007\nဂ\b\u000bဌ\t\fဃ\n\rဈ\u000b\u000eဈ\f\u000fဇ\r\u0010ဇ\u000e\u0011ဉ\u000f\u0012ဋ\u0010\u0013ဇ\u0011\u0014Л\u0015ည\u0012\u0016ဃ\u0013\u0017ည\u0014\u0018ဋ\u0015\u0019ဃ\u0016\u001aဉ\u0017\u001bဌ\u0018\u001cဃ\u0019\u001dဇ\u001a\u001eဇ\u001b\u001fဃ\u001c ဈ\u001d!ဈ\u001e\"ဇ\u001f#ဇ $ဇ\"%ဈ!&ဈ#'ဈ$(ဇ%)ဇ&*ဈ'+ဈ(,ဈ)-ဋ*.ဇ+/ဌ,0ဇ-", A1R);
            case 3:
                return new C166298cf();
            case 4:
                return new C45662Ay();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166298cf.class) {
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
