package X;

/* renamed from: X.8Zv  reason: invalid class name and case insensitive filesystem */
public final class C164698Zv extends C23577Bm6 implements C22356B4k {
    public static final int ADDED_FACTS_FIELD_NUMBER = 1;
    public static final C164698Zv DEFAULT_INSTANCE;
    public static final int DISCLAIMER_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER = null;
    public static final int REMOVED_FACTS_FIELD_NUMBER = 2;
    public EE9 addedFacts_;
    public int bitField0_;
    public String disclaimer_ = "";
    public EE9 removedFacts_;

    static {
        C164698Zv r1 = new C164698Zv();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C164698Zv.class);
    }

    public C164698Zv() {
        C23579Bm9 bm9 = C23579Bm9.A02;
        this.addedFacts_ = bm9;
        this.removedFacts_ = bm9;
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
                A1b[1] = "addedFacts_";
                Class<C164328Yk> cls = C164328Yk.class;
                A1b[2] = cls;
                A1b[3] = "removedFacts_";
                A1b[4] = cls;
                A1b[5] = "disclaimer_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဈ\u0000", A1b);
            case 3:
                return new C164698Zv();
            case 4:
                return new AnonymousClass8Rp();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164698Zv.class) {
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
