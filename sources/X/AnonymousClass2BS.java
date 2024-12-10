package X;

/* renamed from: X.2BS  reason: invalid class name */
public final class AnonymousClass2BS extends C23577Bm6 implements C22356B4k {
    public static final int BUILD_HASH_FIELD_NUMBER = 7;
    public static final AnonymousClass2BS DEFAULT_INSTANCE;
    public static final int DEVICE_PROPS_FIELD_NUMBER = 8;
    public static final int E_IDENT_FIELD_NUMBER = 3;
    public static final int E_KEYTYPE_FIELD_NUMBER = 2;
    public static final int E_REGID_FIELD_NUMBER = 1;
    public static final int E_SKEY_ID_FIELD_NUMBER = 4;
    public static final int E_SKEY_SIG_FIELD_NUMBER = 6;
    public static final int E_SKEY_VAL_FIELD_NUMBER = 5;
    public static volatile C22357B4l PARSER;
    public int bitField0_;
    public DSQ buildHash_;
    public DSQ deviceProps_;
    public DSQ eIdent_;
    public DSQ eKeytype_;
    public DSQ eRegid_;
    public DSQ eSkeyId_;
    public DSQ eSkeySig_;
    public DSQ eSkeyVal_;

    static {
        AnonymousClass2BS r1 = new AnonymousClass2BS();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass2BS.class);
    }

    public AnonymousClass2BS() {
        DSQ dsq = DSQ.A00;
        this.eRegid_ = dsq;
        this.eKeytype_ = dsq;
        this.eIdent_ = dsq;
        this.eSkeyId_ = dsq;
        this.eSkeyVal_ = dsq;
        this.eSkeySig_ = dsq;
        this.buildHash_ = dsq;
        this.deviceProps_ = dsq;
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
                A1Z[1] = "eRegid_";
                A1Z[2] = "eKeytype_";
                A1Z[3] = "eIdent_";
                A1Z[4] = "eSkeyId_";
                A1Z[5] = "eSkeyVal_";
                A1Z[6] = "eSkeySig_";
                A1Z[7] = "buildHash_";
                A1Z[8] = "deviceProps_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003\u0005ည\u0004\u0006ည\u0005\u0007ည\u0006\bည\u0007", A1Z);
            case 3:
                return new AnonymousClass2BS();
            case 4:
                return new C45632Av();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass2BS.class) {
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
