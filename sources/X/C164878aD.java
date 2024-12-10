package X;

/* renamed from: X.8aD  reason: invalid class name and case insensitive filesystem */
public final class C164878aD extends C23577Bm6 implements C22356B4k {
    public static final C164878aD DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER = null;
    public static final int PEER_DATA_OPERATION_REQUEST_TYPE_FIELD_NUMBER = 1;
    public static final int PEER_DATA_OPERATION_RESULT_FIELD_NUMBER = 3;
    public static final int STANZA_ID_FIELD_NUMBER = 2;
    public int bitField0_;
    public int peerDataOperationRequestType_;
    public EE9 peerDataOperationResult_ = C23579Bm9.A02;
    public String stanzaId_ = "";

    static {
        C164878aD r1 = new C164878aD();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C164878aD.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1b = AnonymousClass8BW.A1b();
                A1b[1] = "peerDataOperationRequestType_";
                A1b[2] = AKS.A00;
                A1b[3] = "stanzaId_";
                A1b[4] = "peerDataOperationResult_";
                A1b[5] = C165818bo.class;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003\u001b", A1b);
            case 3:
                return new C164878aD();
            case 4:
                return new C163778Wh();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164878aD.class) {
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
