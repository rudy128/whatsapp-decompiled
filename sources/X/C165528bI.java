package X;

/* renamed from: X.8bI  reason: invalid class name and case insensitive filesystem */
public final class C165528bI extends C23577Bm6 implements C22356B4k {
    public static final int CALL_OUTCOME_FIELD_NUMBER = 2;
    public static final int CALL_TYPE_FIELD_NUMBER = 4;
    public static final C165528bI DEFAULT_INSTANCE;
    public static final int DURATION_SECS_FIELD_NUMBER = 3;
    public static final int IS_VIDEO_FIELD_NUMBER = 1;
    public static volatile C22357B4l PARSER = null;
    public static final int PARTICIPANTS_FIELD_NUMBER = 5;
    public int bitField0_;
    public int callOutcome_;
    public int callType_;
    public long durationSecs_;
    public boolean isVideo_;
    public EE9 participants_ = C23579Bm9.A02;

    static {
        C165528bI r1 = new C165528bI();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165528bI.class);
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
                A1Z[1] = "isVideo_";
                A1Z[2] = "callOutcome_";
                A1Z[3] = AK8.A00;
                A1Z[4] = "durationSecs_";
                A1Z[5] = "callType_";
                A1Z[6] = AK9.A00;
                A1Z[7] = "participants_";
                A1Z[8] = C166428cs.class;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဌ\u0003\u0005\u001b", A1Z);
            case 3:
                return new C165528bI();
            case 4:
                return new AnonymousClass8SZ();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165528bI.class) {
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
