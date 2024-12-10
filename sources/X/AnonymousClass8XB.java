package X;

/* renamed from: X.8XB  reason: invalid class name */
public final class AnonymousClass8XB extends C23577Bm6 implements C22356B4k {
    public static final AnonymousClass8XB DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.8XB, X.Bm6] */
    static {
        ? bm6 = new C23577Bm6();
        DEFAULT_INSTANCE = bm6;
        C23577Bm6.A0E(bm6, AnonymousClass8XB.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C23577Bm6();
            case 4:
                return new C162958Td();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass8XB.class) {
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
