package X;

/* renamed from: X.8aQ  reason: invalid class name and case insensitive filesystem */
public final class C164998aQ extends C23577Bm6 implements C22356B4k {
    public static final int AUTO_MUTED_FIELD_NUMBER = 3;
    public static final C164998aQ DEFAULT_INSTANCE;
    public static final int MUTED_FIELD_NUMBER = 1;
    public static final int MUTE_END_TIMESTAMP_FIELD_NUMBER = 2;
    public static volatile C22357B4l PARSER;
    public boolean autoMuted_;
    public int bitField0_;
    public long muteEndTimestamp_;
    public boolean muted_;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Bm6, X.8aQ] */
    static {
        ? bm6 = new C23577Bm6();
        DEFAULT_INSTANCE = bm6;
        C23577Bm6.A0E(bm6, C164998aQ.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = AnonymousClass8BW.A1Z();
                A1Z[1] = "muted_";
                A1Z[2] = "muteEndTimestamp_";
                A1Z[3] = "autoMuted_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001\u0003ဇ\u0002", A1Z);
            case 3:
                return new C23577Bm6();
            case 4:
                return new AnonymousClass8VK();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164998aQ.class) {
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
