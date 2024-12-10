package X;

/* renamed from: X.8ai  reason: invalid class name and case insensitive filesystem */
public final class C165178ai extends C23577Bm6 implements C22356B4k {
    public static final int BACKUP_METADATA_FIELD_NUMBER = 4;
    public static final C165178ai DEFAULT_INSTANCE;
    public static final int HSM_CONTROLLED_KEY_DATA_FIELD_NUMBER = 3;
    public static final int KEY_TYPE_FIELD_NUMBER = 1;
    public static volatile C22357B4l PARSER = null;
    public static final int WA_PROVIDED_KEY_DATA_FIELD_NUMBER = 2;
    public C166288ce backupMetadata_;
    public int bitField0_;
    public AnonymousClass8XS hsmControlledKeyData_;
    public int keyType_;
    public C165468bC waProvidedKeyData_;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.8ai, X.Bm6] */
    static {
        ? bm6 = new C23577Bm6();
        DEFAULT_INSTANCE = bm6;
        C23577Bm6.A0E(bm6, C165178ai.class);
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
                A1b[1] = "keyType_";
                A1b[2] = C20397AJk.A00;
                A1b[3] = "waProvidedKeyData_";
                A1b[4] = "hsmControlledKeyData_";
                A1b[5] = "backupMetadata_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", A1b);
            case 3:
                return new C23577Bm6();
            case 4:
                return new C162538Ra();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165178ai.class) {
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
