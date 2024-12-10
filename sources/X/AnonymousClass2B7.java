package X;

/* renamed from: X.2B7  reason: invalid class name */
public final class AnonymousClass2B7 extends C23577Bm6 implements C22356B4k {
    public static final int ATTEMPT_METRICS_FIELD_NUMBER = 1;
    public static final AnonymousClass2B7 DEFAULT_INSTANCE;
    public static final int LAST_PERSISTED_AT_UPTIME_MILLIS_FIELD_NUMBER = 2;
    public static volatile C22357B4l PARSER;
    public EE9 attemptMetrics_ = C23579Bm9.A02;
    public int bitField0_;
    public long lastPersistedAtUptimeMillis_;

    static {
        AnonymousClass2B7 r1 = new AnonymousClass2B7();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass2B7.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(4);
                A1Z[1] = "attemptMetrics_";
                A1Z[2] = AnonymousClass2BZ.class;
                A1Z[3] = "lastPersistedAtUptimeMillis_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဃ\u0000", A1Z);
            case 3:
                return new AnonymousClass2B7();
            case 4:
                return new C45552An();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass2B7.class) {
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
