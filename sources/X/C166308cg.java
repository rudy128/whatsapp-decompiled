package X;

/* renamed from: X.8cg  reason: invalid class name and case insensitive filesystem */
public final class C166308cg extends C23577Bm6 implements C22356B4k {
    public static final C166308cg DEFAULT_INSTANCE;
    public static final int EXTRA_GUEST_COUNT_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER = null;
    public static final int RESPONSE_FIELD_NUMBER = 1;
    public static final int TIMESTAMP_MS_FIELD_NUMBER = 2;
    public int bitField0_;
    public int extraGuestCount_;
    public int response_;
    public long timestampMs_;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Bm6, X.8cg] */
    static {
        ? bm6 = new C23577Bm6();
        DEFAULT_INSTANCE = bm6;
        C23577Bm6.A0E(bm6, C166308cg.class);
    }

    public AnonymousClass9K9 A0R() {
        int i = this.response_;
        if (i != 0) {
            if (i == 1) {
                return AnonymousClass9K9.GOING;
            }
            if (i == 2) {
                return AnonymousClass9K9.NOT_GOING;
            }
            if (i == 3) {
                return AnonymousClass9K9.MAYBE;
            }
        }
        return AnonymousClass9K9.UNKNOWN;
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1a = AnonymousClass8BW.A1a();
                A1a[1] = "response_";
                A1a[2] = AKB.A00;
                A1a[3] = "timestampMs_";
                A1a[4] = "extraGuestCount_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003င\u0002", A1a);
            case 3:
                return new C23577Bm6();
            case 4:
                return new C163868Wq();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166308cg.class) {
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
