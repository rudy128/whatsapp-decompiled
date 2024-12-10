package X;

/* renamed from: X.8cs  reason: invalid class name and case insensitive filesystem */
public final class C166428cs extends C23577Bm6 implements C22569BDk {
    public static final int CALL_OUTCOME_FIELD_NUMBER = 2;
    public static final C166428cs DEFAULT_INSTANCE;
    public static final int JID_FIELD_NUMBER = 1;
    public static volatile C22357B4l PARSER;
    public int bitField0_;
    public int callOutcome_;
    public String jid_ = "";

    static {
        C166428cs r1 = new C166428cs();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166428cs.class);
    }

    public AnonymousClass9KW BO4() {
        AnonymousClass9KW A00 = AnonymousClass9KW.A00(this.callOutcome_);
        return A00 == null ? AnonymousClass9KW.CONNECTED : A00;
    }

    public String BTd() {
        return this.jid_;
    }

    public boolean BcW() {
        return AnonymousClass000.A1O(this.bitField0_ & 2);
    }

    public boolean Bcd() {
        return AnonymousClass8BW.A1Q(this.bitField0_);
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
                A1Z[1] = "jid_";
                A1Z[2] = "callOutcome_";
                A1Z[3] = AK8.A00;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", A1Z);
            case 3:
                return new C166428cs();
            case 4:
                return new AnonymousClass8X9();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166428cs.class) {
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
