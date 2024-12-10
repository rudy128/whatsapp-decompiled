package X;

/* renamed from: X.8cK  reason: invalid class name and case insensitive filesystem */
public final class C166088cK extends C23577Bm6 implements C22356B4k {
    public static final int CHUNK_ORDER_FIELD_NUMBER = 7;
    public static final C166088cK DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 5;
    public static final int ENC_HANDLE_FIELD_NUMBER = 14;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 4;
    public static final int FILE_LENGTH_FIELD_NUMBER = 2;
    public static final int FILE_SHA256_FIELD_NUMBER = 1;
    public static final int FULL_HISTORY_SYNC_ON_DEMAND_REQUEST_METADATA_FIELD_NUMBER = 13;
    public static final int INITIAL_HIST_BOOTSTRAP_INLINE_PAYLOAD_FIELD_NUMBER = 11;
    public static final int MEDIA_KEY_FIELD_NUMBER = 3;
    public static final int OLDEST_MSG_IN_CHUNK_TIMESTAMP_SEC_FIELD_NUMBER = 10;
    public static final int ORIGINAL_MESSAGE_ID_FIELD_NUMBER = 8;
    public static volatile C22357B4l PARSER = null;
    public static final int PEER_DATA_REQUEST_SESSION_ID_FIELD_NUMBER = 12;
    public static final int PROGRESS_FIELD_NUMBER = 9;
    public static final int SYNC_TYPE_FIELD_NUMBER = 6;
    public int bitField0_;
    public int chunkOrder_;
    public String directPath_ = "";
    public String encHandle_;
    public DSQ fileEncSha256_;
    public long fileLength_;
    public DSQ fileSha256_;
    public C163978Xb fullHistorySyncOnDemandRequestMetadata_;
    public DSQ initialHistBootstrapInlinePayload_;
    public DSQ mediaKey_;
    public long oldestMsgInChunkTimestampSec_;
    public String originalMessageId_ = "";
    public String peerDataRequestSessionId_;
    public int progress_;
    public int syncType_;

    static {
        C166088cK r1 = new C166088cK();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166088cK.class);
    }

    public C166088cK() {
        DSQ dsq = DSQ.A00;
        this.fileSha256_ = dsq;
        this.mediaKey_ = dsq;
        this.fileEncSha256_ = dsq;
        this.initialHistBootstrapInlinePayload_ = dsq;
        this.peerDataRequestSessionId_ = "";
        this.encHandle_ = "";
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(16);
                A1Z[1] = "fileSha256_";
                A1Z[2] = "fileLength_";
                A1Z[3] = "mediaKey_";
                A1Z[4] = "fileEncSha256_";
                A1Z[5] = "directPath_";
                A1Z[6] = "syncType_";
                A1Z[7] = AKI.A00;
                A1Z[8] = "chunkOrder_";
                A1Z[9] = "originalMessageId_";
                A1Z[10] = "progress_";
                A1Z[11] = "oldestMsgInChunkTimestampSec_";
                A1Z[12] = "initialHistBootstrapInlinePayload_";
                A1Z[13] = "peerDataRequestSessionId_";
                A1Z[14] = "fullHistorySyncOnDemandRequestMetadata_";
                A1Z[15] = "encHandle_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ည\u0000\u0002ဃ\u0001\u0003ည\u0002\u0004ည\u0003\u0005ဈ\u0004\u0006ဌ\u0005\u0007ဋ\u0006\bဈ\u0007\tဋ\b\nဂ\t\u000bည\n\fဈ\u000b\rဉ\f\u000eဈ\r", A1Z);
            case 3:
                return new C166088cK();
            case 4:
                return new C162878Sv();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166088cK.class) {
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
