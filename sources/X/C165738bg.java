package X;

/* renamed from: X.8bg  reason: invalid class name and case insensitive filesystem */
public final class C165738bg extends C23577Bm6 implements C22356B4k {
    public static final int BASEKEY_FIELD_NUMBER = 2;
    public static final C165738bg DEFAULT_INSTANCE;
    public static final int IDENTITYKEY_FIELD_NUMBER = 3;
    public static final int MESSAGE_FIELD_NUMBER = 4;
    public static volatile C22357B4l PARSER = null;
    public static final int PREKEYID_FIELD_NUMBER = 1;
    public static final int REGISTRATIONID_FIELD_NUMBER = 5;
    public static final int SIGNEDPREKEYID_FIELD_NUMBER = 6;
    public DSQ baseKey_;
    public int bitField0_;
    public DSQ identityKey_;
    public DSQ message_;
    public int preKeyId_;
    public int registrationId_;
    public int signedPreKeyId_;

    static {
        C165738bg r1 = new C165738bg();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165738bg.class);
    }

    public C165738bg() {
        DSQ dsq = DSQ.A00;
        this.baseKey_ = dsq;
        this.identityKey_ = dsq;
        this.message_ = dsq;
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(7);
                A1Z[1] = "preKeyId_";
                A1Z[2] = "baseKey_";
                A1Z[3] = "identityKey_";
                A1Z[4] = "message_";
                A1Z[5] = "registrationId_";
                A1Z[6] = "signedPreKeyId_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဋ\u0001\u0002ည\u0003\u0003ည\u0004\u0004ည\u0005\u0005ဋ\u0000\u0006ဋ\u0002", A1Z);
            case 3:
                return new C165738bg();
            case 4:
                return new AnonymousClass8WQ();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165738bg.class) {
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
