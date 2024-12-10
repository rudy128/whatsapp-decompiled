package X;

/* renamed from: X.8bj  reason: invalid class name and case insensitive filesystem */
public final class C165768bj extends C23577Bm6 implements C22356B4k {
    public static final C165768bj DEFAULT_INSTANCE;
    public static final int DELIVERED_DEVICE_JID_FIELD_NUMBER = 6;
    public static volatile C22357B4l PARSER = null;
    public static final int PENDING_DEVICE_JID_FIELD_NUMBER = 5;
    public static final int PLAYED_TIMESTAMP_FIELD_NUMBER = 4;
    public static final int READ_TIMESTAMP_FIELD_NUMBER = 3;
    public static final int RECEIPT_TIMESTAMP_FIELD_NUMBER = 2;
    public static final int USER_JID_FIELD_NUMBER = 1;
    public int bitField0_;
    public EE9 deliveredDeviceJid_;
    public byte memoizedIsInitialized = 2;
    public EE9 pendingDeviceJid_;
    public long playedTimestamp_;
    public long readTimestamp_;
    public long receiptTimestamp_;
    public String userJid_ = "";

    static {
        C165768bj r1 = new C165768bj();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165768bj.class);
    }

    public C165768bj() {
        C23579Bm9 bm9 = C23579Bm9.A02;
        this.pendingDeviceJid_ = bm9;
        this.deliveredDeviceJid_ = bm9;
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
                Object[] A1R = AnonymousClass8BS.A1R(7);
                A1R[1] = "userJid_";
                A1R[2] = "receiptTimestamp_";
                A1R[3] = "readTimestamp_";
                A1R[4] = "playedTimestamp_";
                A1R[5] = "pendingDeviceJid_";
                A1R[6] = "deliveredDeviceJid_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0001\u0001ᔈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001a\u0006\u001a", A1R);
            case 3:
                return new C165768bj();
            case 4:
                return new AnonymousClass8WM();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165768bj.class) {
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
