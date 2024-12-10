package X;

/* renamed from: X.8bY  reason: invalid class name and case insensitive filesystem */
public final class C165658bY extends C23577Bm6 implements C22356B4k {
    public static final int CALL_KEY_FIELD_NUMBER = 1;
    public static final int CONVERSION_DATA_FIELD_NUMBER = 3;
    public static final int CONVERSION_DELAY_SECONDS_FIELD_NUMBER = 4;
    public static final int CONVERSION_SOURCE_FIELD_NUMBER = 2;
    public static final int CTWA_PAYLOAD_FIELD_NUMBER = 6;
    public static final int CTWA_SIGNALS_FIELD_NUMBER = 5;
    public static final C165658bY DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER;
    public int bitField0_;
    public DSQ callKey_;
    public DSQ conversionData_;
    public int conversionDelaySeconds_;
    public String conversionSource_ = "";
    public DSQ ctwaPayload_;
    public String ctwaSignals_;

    static {
        C165658bY r1 = new C165658bY();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165658bY.class);
    }

    public C165658bY() {
        DSQ dsq = DSQ.A00;
        this.callKey_ = dsq;
        this.conversionData_ = dsq;
        this.ctwaSignals_ = "";
        this.ctwaPayload_ = dsq;
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
                A1Z[1] = "callKey_";
                A1Z[2] = "conversionSource_";
                A1Z[3] = "conversionData_";
                A1Z[4] = "conversionDelaySeconds_";
                A1Z[5] = "ctwaSignals_";
                A1Z[6] = "ctwaPayload_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ဋ\u0003\u0005ဈ\u0004\u0006ည\u0005", A1Z);
            case 3:
                return new C165658bY();
            case 4:
                return new AnonymousClass8SY();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165658bY.class) {
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
