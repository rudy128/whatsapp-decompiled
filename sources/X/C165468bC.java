package X;

/* renamed from: X.8bC  reason: invalid class name and case insensitive filesystem */
public final class C165468bC extends C23577Bm6 implements C22356B4k {
    public static final int BACKUP_CIPHER_HEADER_FIELD_NUMBER = 1;
    public static final C165468bC DEFAULT_INSTANCE;
    public static final int ENCRYPTION_IV_FIELD_NUMBER = 5;
    public static final int GOOGLE_ID_SALT_FIELD_NUMBER = 4;
    public static final int KEY_VERSION_FIELD_NUMBER = 2;
    public static volatile C22357B4l PARSER = null;
    public static final int SERVER_SALT_FIELD_NUMBER = 3;
    public DSQ backupCipherHeader_;
    public int bitField0_;
    public DSQ encryptionIv_;
    public DSQ googleIdSalt_;
    public String keyVersion_ = "";
    public DSQ serverSalt_;

    static {
        C165468bC r1 = new C165468bC();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165468bC.class);
    }

    public C165468bC() {
        DSQ dsq = DSQ.A00;
        this.backupCipherHeader_ = dsq;
        this.serverSalt_ = dsq;
        this.googleIdSalt_ = dsq;
        this.encryptionIv_ = dsq;
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
                A1b[1] = "backupCipherHeader_";
                A1b[2] = "keyVersion_";
                A1b[3] = "serverSalt_";
                A1b[4] = "googleIdSalt_";
                A1b[5] = "encryptionIv_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003\u0005ည\u0004", A1b);
            case 3:
                return new C165468bC();
            case 4:
                return new C162558Rc();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165468bC.class) {
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
