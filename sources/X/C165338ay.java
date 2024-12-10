package X;

/* renamed from: X.8ay  reason: invalid class name and case insensitive filesystem */
public final class C165338ay extends C23577Bm6 implements C22356B4k {
    public static final int BACKUP_KEY_DATA_FIELD_NUMBER = 1;
    public static final C165338ay DEFAULT_INSTANCE;
    public static final int OPAQUE_CHALLENGE_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER = null;
    public static final int R3_FIELD_NUMBER = 2;
    public static final int TRANSCRIPT_FIELD_NUMBER = 4;
    public DSQ backupKeyData_;
    public int bitField0_;
    public DSQ opaqueChallenge_;
    public DSQ r3_;
    public DSQ transcript_;

    static {
        C165338ay r1 = new C165338ay();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165338ay.class);
    }

    public C165338ay() {
        DSQ dsq = DSQ.A00;
        this.backupKeyData_ = dsq;
        this.r3_ = dsq;
        this.opaqueChallenge_ = dsq;
        this.transcript_ = dsq;
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1a = AnonymousClass8BW.A1a();
                A1a[1] = "backupKeyData_";
                A1a[2] = "r3_";
                A1a[3] = "opaqueChallenge_";
                A1a[4] = "transcript_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", A1a);
            case 3:
                return new C165338ay();
            case 4:
                return new C163608Vq();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165338ay.class) {
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
