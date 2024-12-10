package X;

/* renamed from: X.8cQ  reason: invalid class name and case insensitive filesystem */
public final class C166148cQ extends C23577Bm6 implements C22356B4k {
    public static final int AI_WAIT_LIST_STATE_FIELD_NUMBER = 14;
    public static final int CALL_LOG_RECORDS_FIELD_NUMBER = 13;
    public static final int CHUNK_ORDER_FIELD_NUMBER = 5;
    public static final int COMPANION_META_NONCE_FIELD_NUMBER = 16;
    public static final int CONVERSATIONS_FIELD_NUMBER = 2;
    public static final C166148cQ DEFAULT_INSTANCE;
    public static final int GLOBAL_SETTINGS_FIELD_NUMBER = 8;
    public static volatile C22357B4l PARSER = null;
    public static final int PAST_PARTICIPANTS_FIELD_NUMBER = 12;
    public static final int PHONE_NUMBER_TO_LID_MAPPINGS_FIELD_NUMBER = 15;
    public static final int PROGRESS_FIELD_NUMBER = 6;
    public static final int PUSHNAMES_FIELD_NUMBER = 7;
    public static final int RECENT_STICKERS_FIELD_NUMBER = 11;
    public static final int SHAREABLE_CHAT_IDENTIFIER_ENCRYPTION_KEY_FIELD_NUMBER = 17;
    public static final int STATUS_V3_MESSAGES_FIELD_NUMBER = 3;
    public static final int SYNC_TYPE_FIELD_NUMBER = 1;
    public static final int THREAD_DS_TIMEFRAME_OFFSET_FIELD_NUMBER = 10;
    public static final int THREAD_ID_USER_SECRET_FIELD_NUMBER = 9;
    public int aiWaitListState_;
    public int bitField0_;
    public EE9 callLogRecords_;
    public int chunkOrder_;
    public String companionMetaNonce_;
    public EE9 conversations_;
    public C166198cV globalSettings_;
    public byte memoizedIsInitialized = 2;
    public EE9 pastParticipants_;
    public EE9 phoneNumberToLidMappings_;
    public int progress_;
    public EE9 pushnames_;
    public EE9 recentStickers_;
    public DSQ shareableChatIdentifierEncryptionKey_;
    public EE9 statusV3Messages_;
    public int syncType_;
    public int threadDsTimeframeOffset_;
    public DSQ threadIdUserSecret_;

    static {
        C166148cQ r1 = new C166148cQ();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166148cQ.class);
    }

    public C166148cQ() {
        C23579Bm9 bm9 = C23579Bm9.A02;
        this.conversations_ = bm9;
        this.statusV3Messages_ = bm9;
        this.pushnames_ = bm9;
        DSQ dsq = DSQ.A00;
        this.threadIdUserSecret_ = dsq;
        this.recentStickers_ = bm9;
        this.pastParticipants_ = bm9;
        this.callLogRecords_ = bm9;
        this.phoneNumberToLidMappings_ = bm9;
        this.companionMetaNonce_ = "";
        this.shareableChatIdentifierEncryptionKey_ = dsq;
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
                Object[] A1R = AnonymousClass8BS.A1R(26);
                A1R[1] = "syncType_";
                A1R[2] = C20423AKm.A00;
                A1R[3] = "conversations_";
                A1R[4] = C166298cf.class;
                A1R[5] = "statusV3Messages_";
                A1R[6] = C166388co.class;
                A1R[7] = "chunkOrder_";
                A1R[8] = "progress_";
                A1R[9] = "pushnames_";
                A1R[10] = AnonymousClass2B6.class;
                A1R[11] = "globalSettings_";
                A1R[12] = "threadIdUserSecret_";
                A1R[13] = "threadDsTimeframeOffset_";
                A1R[14] = "recentStickers_";
                A1R[15] = AnonymousClass2BV.class;
                A1R[16] = "pastParticipants_";
                A1R[17] = AnonymousClass8ZO.class;
                A1R[18] = "callLogRecords_";
                A1R[19] = C166128cO.class;
                A1R[20] = "aiWaitListState_";
                A1R[21] = C20422AKl.A00;
                A1R[22] = "phoneNumberToLidMappings_";
                A1R[23] = AnonymousClass8ZP.class;
                A1R[24] = "companionMetaNonce_";
                A1R[25] = "shareableChatIdentifierEncryptionKey_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0010\u0000\u0001\u0001\u0011\u0010\u0000\u0007\u0003\u0001ᔌ\u0000\u0002Л\u0003Л\u0005ဋ\u0001\u0006ဋ\u0002\u0007\u001b\bဉ\u0003\tည\u0004\nဋ\u0005\u000b\u001b\f\u001b\r\u001b\u000eဌ\u0006\u000f\u001b\u0010ဈ\u0007\u0011ည\b", A1R);
            case 3:
                return new C166148cQ();
            case 4:
                return new AnonymousClass8X2();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166148cQ.class) {
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
