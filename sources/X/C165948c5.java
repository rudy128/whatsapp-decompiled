package X;

/* renamed from: X.8c5  reason: invalid class name and case insensitive filesystem */
public final class C165948c5 extends C23577Bm6 implements C22356B4k {
    public static final C165948c5 DEFAULT_INSTANCE;
    public static final int DETERMINISTIC_LC_FIELD_NUMBER = 8;
    public static final int DETERMINISTIC_LG_FIELD_NUMBER = 7;
    public static final int ELEMENT_NAME_FIELD_NUMBER = 2;
    public static final int FALLBACK_LC_FIELD_NUMBER = 5;
    public static final int FALLBACK_LG_FIELD_NUMBER = 4;
    public static final int HYDRATED_HSM_FIELD_NUMBER = 9;
    public static final int LOCALIZABLE_PARAMS_FIELD_NUMBER = 6;
    public static final int NAMESPACE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER;
    public int bitField0_;
    public String deterministicLc_;
    public String deterministicLg_;
    public String elementName_ = "";
    public String fallbackLc_;
    public String fallbackLg_;
    public C166348ck hydratedHsm_;
    public EE9 localizableParams_;
    public String namespace_ = "";
    public EE9 params_;

    static {
        C165948c5 r1 = new C165948c5();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165948c5.class);
    }

    public C165948c5() {
        C23579Bm9 bm9 = C23579Bm9.A02;
        this.params_ = bm9;
        this.fallbackLg_ = "";
        this.fallbackLc_ = "";
        this.localizableParams_ = bm9;
        this.deterministicLg_ = "";
        this.deterministicLc_ = "";
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
                A1Z[1] = "namespace_";
                A1Z[2] = "elementName_";
                A1Z[3] = "params_";
                A1Z[4] = "fallbackLg_";
                A1Z[5] = "fallbackLc_";
                A1Z[6] = "localizableParams_";
                A1Z[7] = C164798a5.class;
                A1Z[8] = "deterministicLg_";
                A1Z[9] = "deterministicLc_";
                A1Z[10] = "hydratedHsm_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004ဈ\u0002\u0005ဈ\u0003\u0006\u001b\u0007ဈ\u0004\bဈ\u0005\tဉ\u0006", A1Z);
            case 3:
                return new C165948c5();
            case 4:
                return new C162818Sp();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165948c5.class) {
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
