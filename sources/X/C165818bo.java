package X;

/* renamed from: X.8bo  reason: invalid class name and case insensitive filesystem */
public final class C165818bo extends C23577Bm6 implements C22356B4k {
    public static final int COMPANION_META_NONCE_FETCH_REQUEST_RESPONSE_FIELD_NUMBER = 7;
    public static final C165818bo DEFAULT_INSTANCE;
    public static final int FULL_HISTORY_SYNC_ON_DEMAND_REQUEST_RESPONSE_FIELD_NUMBER = 6;
    public static final int LINK_PREVIEW_RESPONSE_FIELD_NUMBER = 3;
    public static final int MEDIA_UPLOAD_RESULT_FIELD_NUMBER = 1;
    public static volatile C22357B4l PARSER = null;
    public static final int PLACEHOLDER_MESSAGE_RESEND_RESPONSE_FIELD_NUMBER = 4;
    public static final int STICKER_MESSAGE_FIELD_NUMBER = 2;
    public static final int WAFFLE_NONCE_FETCH_REQUEST_RESPONSE_FIELD_NUMBER = 5;
    public int bitField0_;
    public C164078Xl companionMetaNonceFetchRequestResponse_;
    public AnonymousClass8ZB fullHistorySyncOnDemandRequestResponse_;
    public C165898bw linkPreviewResponse_;
    public int mediaUploadResult_;
    public C164088Xm placeholderMessageResendResponse_;
    public C166218cX stickerMessage_;
    public AnonymousClass8ZC waffleNonceFetchRequestResponse_;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.8bo, X.Bm6] */
    static {
        ? bm6 = new C23577Bm6();
        DEFAULT_INSTANCE = bm6;
        C23577Bm6.A0E(bm6, C165818bo.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(9);
                A1Z[1] = "mediaUploadResult_";
                A1Z[2] = C20427AKq.A00;
                A1Z[3] = "stickerMessage_";
                A1Z[4] = "linkPreviewResponse_";
                A1Z[5] = "placeholderMessageResendResponse_";
                A1Z[6] = "waffleNonceFetchRequestResponse_";
                A1Z[7] = "fullHistorySyncOnDemandRequestResponse_";
                A1Z[8] = "companionMetaNonceFetchRequestResponse_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", A1Z);
            case 3:
                return new C23577Bm6();
            case 4:
                return new C163788Wi();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165818bo.class) {
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
