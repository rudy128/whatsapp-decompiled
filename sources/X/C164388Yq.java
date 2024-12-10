package X;

/* renamed from: X.8Yq  reason: invalid class name and case insensitive filesystem */
public final class C164388Yq extends C23577Bm6 implements C22356B4k {
    public static final int CANNOT_BE_RANKED_FIELD_NUMBER = 2;
    public static final int CANNOT_BE_REACTED_TO_FIELD_NUMBER = 1;
    public static final C164388Yq DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER;
    public int bitField0_;
    public boolean cannotBeRanked_;
    public boolean cannotBeReactedTo_;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.8Yq, X.Bm6] */
    static {
        ? bm6 = new C23577Bm6();
        DEFAULT_INSTANCE = bm6;
        C23577Bm6.A0E(bm6, C164388Yq.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Y = AnonymousClass8BW.A1Y();
                A1Y[1] = "cannotBeReactedTo_";
                A1Y[2] = "cannotBeRanked_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", A1Y);
            case 3:
                return new C23577Bm6();
            case 4:
                return new AnonymousClass8S8();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164388Yq.class) {
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
