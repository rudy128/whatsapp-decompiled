package X;

/* renamed from: X.8ba  reason: invalid class name and case insensitive filesystem */
public final class C165678ba extends C23577Bm6 implements C22356B4k {
    public static final C165678ba DEFAULT_INSTANCE;
    public static final int FULL_HISTORY_SYNC_ON_DEMAND_REQUEST_FIELD_NUMBER = 6;
    public static final int HISTORY_SYNC_ON_DEMAND_REQUEST_FIELD_NUMBER = 4;
    public static volatile C22357B4l PARSER = null;
    public static final int PEER_DATA_OPERATION_REQUEST_TYPE_FIELD_NUMBER = 1;
    public static final int PLACEHOLDER_MESSAGE_RESEND_REQUEST_FIELD_NUMBER = 5;
    public static final int REQUEST_STICKER_REUPLOAD_FIELD_NUMBER = 2;
    public static final int REQUEST_URL_PREVIEW_FIELD_NUMBER = 3;
    public int bitField0_;
    public AnonymousClass8Z9 fullHistorySyncOnDemandRequest_;
    public AnonymousClass2BP historySyncOnDemandRequest_;
    public int peerDataOperationRequestType_;
    public EE9 placeholderMessageResendRequest_;
    public EE9 requestStickerReupload_;
    public EE9 requestUrlPreview_;

    static {
        C165678ba r1 = new C165678ba();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165678ba.class);
    }

    public C165678ba() {
        C23579Bm9 bm9 = C23579Bm9.A02;
        this.requestStickerReupload_ = bm9;
        this.requestUrlPreview_ = bm9;
        this.placeholderMessageResendRequest_ = bm9;
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(11);
                A1Z[1] = "peerDataOperationRequestType_";
                A1Z[2] = AKS.A00;
                A1Z[3] = "requestStickerReupload_";
                A1Z[4] = C164068Xk.class;
                A1Z[5] = "requestUrlPreview_";
                A1Z[6] = AnonymousClass8ZA.class;
                A1Z[7] = "historySyncOnDemandRequest_";
                A1Z[8] = "placeholderMessageResendRequest_";
                A1Z[9] = C164058Xj.class;
                A1Z[10] = "fullHistorySyncOnDemandRequest_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0003\u0000\u0001ဌ\u0000\u0002\u001b\u0003\u001b\u0004ဉ\u0001\u0005\u001b\u0006ဉ\u0002", A1Z);
            case 3:
                return new C165678ba();
            case 4:
                return new AnonymousClass8TL();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165678ba.class) {
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
