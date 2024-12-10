package X;

/* renamed from: X.2BT  reason: invalid class name */
public final class AnonymousClass2BT extends C23577Bm6 implements C22356B4k {
    public static final int CLIENT_DEBUG_DATA_FIELD_NUMBER = 9;
    public static final AnonymousClass2BT DEFAULT_INSTANCE;
    public static final int DEVICE_INDEX_FIELD_NUMBER = 8;
    public static final int EXIT_CODE_FIELD_NUMBER = 7;
    public static final int EXTERNAL_MUTATIONS_FIELD_NUMBER = 3;
    public static final int KEY_ID_FIELD_NUMBER = 6;
    public static final int MUTATIONS_FIELD_NUMBER = 2;
    public static volatile C22357B4l PARSER = null;
    public static final int PATCH_MAC_FIELD_NUMBER = 5;
    public static final int SNAPSHOT_MAC_FIELD_NUMBER = 4;
    public static final int VERSION_FIELD_NUMBER = 1;
    public int bitField0_;
    public DSQ clientDebugData_;
    public int deviceIndex_;
    public AnonymousClass8ZS exitCode_;
    public C165718be externalMutations_;
    public C164148Xs keyId_;
    public EE9 mutations_ = C23579Bm9.A02;
    public DSQ patchMac_;
    public DSQ snapshotMac_;
    public C164178Xv version_;

    static {
        AnonymousClass2BT r1 = new AnonymousClass2BT();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass2BT.class);
    }

    public AnonymousClass2BT() {
        DSQ dsq = DSQ.A00;
        this.snapshotMac_ = dsq;
        this.patchMac_ = dsq;
        this.clientDebugData_ = dsq;
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
                A1Z[1] = "version_";
                A1Z[2] = "mutations_";
                A1Z[3] = AnonymousClass2B8.class;
                A1Z[4] = "externalMutations_";
                A1Z[5] = "snapshotMac_";
                A1Z[6] = "patchMac_";
                A1Z[7] = "keyId_";
                A1Z[8] = "exitCode_";
                A1Z[9] = "deviceIndex_";
                A1Z[10] = "clientDebugData_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ည\u0002\u0005ည\u0003\u0006ဉ\u0004\u0007ဉ\u0005\bဋ\u0006\tည\u0007", A1Z);
            case 3:
                return new AnonymousClass2BT();
            case 4:
                return new C45582Aq();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass2BT.class) {
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
