package X;

/* renamed from: X.2BW  reason: invalid class name */
public final class AnonymousClass2BW extends C23577Bm6 implements C22356B4k {
    public static final AnonymousClass2BW DEFAULT_INSTANCE;
    public static final int FULL_SYNC_DAYS_LIMIT_FIELD_NUMBER = 1;
    public static final int FULL_SYNC_SIZE_MB_LIMIT_FIELD_NUMBER = 2;
    public static final int INLINE_INITIAL_PAYLOAD_IN_E2EE_MSG_FIELD_NUMBER = 4;
    public static volatile C22357B4l PARSER = null;
    public static final int RECENT_SYNC_DAYS_LIMIT_FIELD_NUMBER = 5;
    public static final int STORAGE_QUOTA_MB_FIELD_NUMBER = 3;
    public static final int SUPPORT_ADD_ON_HISTORY_SYNC_MIGRATION_FIELD_NUMBER = 13;
    public static final int SUPPORT_BIZ_HOSTED_MSG_FIELD_NUMBER = 9;
    public static final int SUPPORT_BOT_USER_AGENT_CHAT_HISTORY_FIELD_NUMBER = 7;
    public static final int SUPPORT_CAG_REACTIONS_AND_POLLS_FIELD_NUMBER = 8;
    public static final int SUPPORT_CALL_LOG_HISTORY_FIELD_NUMBER = 6;
    public static final int SUPPORT_FBID_BOT_CHAT_HISTORY_FIELD_NUMBER = 12;
    public static final int SUPPORT_HOSTED_GROUP_MSG_FIELD_NUMBER = 11;
    public static final int SUPPORT_MESSAGE_ASSOCIATION_FIELD_NUMBER = 14;
    public static final int SUPPORT_RECENT_SYNC_CHUNK_MESSAGE_COUNT_TUNING_FIELD_NUMBER = 10;
    public int bitField0_;
    public int fullSyncDaysLimit_;
    public int fullSyncSizeMbLimit_;
    public boolean inlineInitialPayloadInE2EeMsg_;
    public int recentSyncDaysLimit_;
    public int storageQuotaMb_;
    public boolean supportAddOnHistorySyncMigration_;
    public boolean supportBizHostedMsg_;
    public boolean supportBotUserAgentChatHistory_;
    public boolean supportCagReactionsAndPolls_;
    public boolean supportCallLogHistory_;
    public boolean supportFbidBotChatHistory_;
    public boolean supportHostedGroupMsg_;
    public boolean supportMessageAssociation_;
    public boolean supportRecentSyncChunkMessageCountTuning_;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Bm6, X.2BW] */
    static {
        ? bm6 = new C23577Bm6();
        DEFAULT_INSTANCE = bm6;
        C23577Bm6.A0E(bm6, AnonymousClass2BW.class);
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
                A1Z[1] = "fullSyncDaysLimit_";
                A1Z[2] = "fullSyncSizeMbLimit_";
                A1Z[3] = "storageQuotaMb_";
                A1Z[4] = "inlineInitialPayloadInE2EeMsg_";
                A1Z[5] = "recentSyncDaysLimit_";
                A1Z[6] = "supportCallLogHistory_";
                A1Z[7] = "supportBotUserAgentChatHistory_";
                A1Z[8] = "supportCagReactionsAndPolls_";
                A1Z[9] = "supportBizHostedMsg_";
                A1Z[10] = "supportRecentSyncChunkMessageCountTuning_";
                A1Z[11] = "supportHostedGroupMsg_";
                A1Z[12] = "supportFbidBotChatHistory_";
                A1Z[13] = "supportAddOnHistorySyncMigration_";
                A1Z[14] = "supportMessageAssociation_";
                return new C24953CRd(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဇ\u0003\u0005ဋ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nဇ\t\u000bဇ\n\fဇ\u000b\rဇ\f\u000eဇ\r", A1Z);
            case 3:
                return new C23577Bm6();
            case 4:
                return new AnonymousClass2Aa();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass2BW.class) {
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
