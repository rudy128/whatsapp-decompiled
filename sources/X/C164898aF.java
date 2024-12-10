package X;

/* renamed from: X.8aF  reason: invalid class name and case insensitive filesystem */
public final class C164898aF extends C23577Bm6 implements C22356B4k {
    public static final int CONTEXT_INFO_FIELD_NUMBER = 3;
    public static final C164898aF DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static volatile C22357B4l PARSER = null;
    public static final int POLL_VOTES_FIELD_NUMBER = 2;
    public int bitField0_;
    public C166278cd contextInfo_;
    public String name_ = "";
    public EE9 pollVotes_ = C23579Bm9.A02;

    static {
        C164898aF r1 = new C164898aF();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C164898aF.class);
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
                A1a[1] = "name_";
                A1a[2] = "pollVotes_";
                A1a[3] = AnonymousClass8ZF.class;
                A1a[4] = "contextInfo_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001", A1a);
            case 3:
                return new C164898aF();
            case 4:
                return new C162928Ta();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164898aF.class) {
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
