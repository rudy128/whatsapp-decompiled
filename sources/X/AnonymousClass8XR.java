package X;

/* renamed from: X.8XR  reason: invalid class name */
public final class AnonymousClass8XR extends C23577Bm6 implements C22356B4k {
    public static final int CAPABILITIES_FIELD_NUMBER = 1;
    public static final AnonymousClass8XR DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER;
    public static final C28459E2a capabilities_converter_ = new ALH();
    public C28667EDj capabilities_ = Bm7.A02;

    static {
        AnonymousClass8XR r1 = new AnonymousClass8XR();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass8XR.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1b = AnonymousClass3MW.A1b();
                A1b[0] = "capabilities_";
                A1b[1] = C20399AJm.A00;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", A1b);
            case 3:
                return new AnonymousClass8XR();
            case 4:
                return new AnonymousClass8Rl();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass8XR.class) {
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
