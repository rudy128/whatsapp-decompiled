package X;

/* renamed from: X.8ci  reason: invalid class name and case insensitive filesystem */
public final class C166328ci extends C23577Bm6 implements C22356B4k {
    public static final C166328ci DEFAULT_INSTANCE;
    public static final int INITIATED_BY_ME_FIELD_NUMBER = 4;
    public static final int INITIATOR_DEVICE_JID_FIELD_NUMBER = 3;
    public static final int INITIATOR_FIELD_NUMBER = 1;
    public static volatile C22357B4l PARSER = null;
    public static final int TRIGGER_FIELD_NUMBER = 2;
    public int bitField0_;
    public boolean initiatedByMe_;
    public String initiatorDeviceJid_ = "";
    public int initiator_;
    public int trigger_;

    static {
        C166328ci r1 = new C166328ci();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166328ci.class);
    }

    @Deprecated
    public AnonymousClass9K8 A0R() {
        int i = this.initiator_;
        if (i != 0) {
            if (i == 1) {
                return AnonymousClass9K8.INITIATED_BY_ME;
            }
            if (i == 2) {
                return AnonymousClass9K8.INITIATED_BY_OTHER;
            }
            if (i == 3) {
                return AnonymousClass9K8.BIZ_UPGRADE_FB_HOSTING;
            }
        }
        return AnonymousClass9K8.CHANGED_IN_CHAT;
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(7);
                A1Z[1] = "initiator_";
                A1Z[2] = C20409AJy.A00;
                A1Z[3] = "trigger_";
                A1Z[4] = C20410AJz.A00;
                A1Z[5] = "initiatorDeviceJid_";
                A1Z[6] = "initiatedByMe_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဇ\u0003", A1Z);
            case 3:
                return new C166328ci();
            case 4:
                return new C163958Wz();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166328ci.class) {
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
