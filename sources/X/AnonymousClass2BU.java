package X;

/* renamed from: X.2BU  reason: invalid class name */
public final class AnonymousClass2BU extends C23577Bm6 implements C22356B4k {
    public static final int COLLECTION_NAME_FIELD_NUMBER = 4;
    public static final int CURRENT_LTHASH_FIELD_NUMBER = 1;
    public static final AnonymousClass2BU DEFAULT_INSTANCE;
    public static final int FIRST_FOUR_BYTES_FROM_A_HASH_OF_SNAPSHOT_MAC_KEY_FIELD_NUMBER = 5;
    public static final int IS_SENDER_PRIMARY_FIELD_NUMBER = 11;
    public static final int NEW_LTHASH_FIELD_NUMBER = 2;
    public static final int NEW_LTHASH_SUBTRACT_FIELD_NUMBER = 6;
    public static final int NUMBER_ADD_FIELD_NUMBER = 7;
    public static final int NUMBER_OVERRIDE_FIELD_NUMBER = 9;
    public static final int NUMBER_REMOVE_FIELD_NUMBER = 8;
    public static volatile C22357B4l PARSER = null;
    public static final int PATCH_VERSION_FIELD_NUMBER = 3;
    public static final int SENDER_PLATFORM_FIELD_NUMBER = 10;
    public int bitField0_;
    public DSQ collectionName_;
    public DSQ currentLthash_;
    public DSQ firstFourBytesFromAHashOfSnapshotMacKey_;
    public boolean isSenderPrimary_;
    public DSQ newLthashSubtract_;
    public DSQ newLthash_;
    public int numberAdd_;
    public int numberOverride_;
    public int numberRemove_;
    public DSQ patchVersion_;
    public int senderPlatform_;

    static {
        AnonymousClass2BU r1 = new AnonymousClass2BU();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass2BU.class);
    }

    public AnonymousClass2BU() {
        DSQ dsq = DSQ.A00;
        this.currentLthash_ = dsq;
        this.newLthash_ = dsq;
        this.patchVersion_ = dsq;
        this.collectionName_ = dsq;
        this.firstFourBytesFromAHashOfSnapshotMacKey_ = dsq;
        this.newLthashSubtract_ = dsq;
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(13);
                A1Z[1] = "currentLthash_";
                A1Z[2] = "newLthash_";
                A1Z[3] = "patchVersion_";
                A1Z[4] = "collectionName_";
                A1Z[5] = "firstFourBytesFromAHashOfSnapshotMacKey_";
                A1Z[6] = "newLthashSubtract_";
                A1Z[7] = "numberAdd_";
                A1Z[8] = "numberRemove_";
                A1Z[9] = "numberOverride_";
                A1Z[10] = "senderPlatform_";
                A1Z[11] = C65702wy.A00;
                A1Z[12] = "isSenderPrimary_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003\u0005ည\u0004\u0006ည\u0005\u0007င\u0006\bင\u0007\tင\b\nဌ\t\u000bဇ\n", A1Z);
            case 3:
                return new AnonymousClass2BU();
            case 4:
                return new C45612At();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass2BU.class) {
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
