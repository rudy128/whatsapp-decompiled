package X;

/* renamed from: X.8aw  reason: invalid class name and case insensitive filesystem */
public final class C165318aw extends C23577Bm6 implements C22356B4k {
    public static final C165318aw DEFAULT_INSTANCE;
    public static final int FIRST_NAME_FIELD_NUMBER = 2;
    public static final int FULL_NAME_FIELD_NUMBER = 1;
    public static final int LID_JID_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER = null;
    public static final int SAVE_ON_PRIMARY_ADDRESSBOOK_FIELD_NUMBER = 4;
    public int bitField0_;
    public String firstName_ = "";
    public String fullName_ = "";
    public String lidJid_ = "";
    public boolean saveOnPrimaryAddressbook_;

    static {
        C165318aw r1 = new C165318aw();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165318aw.class);
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
                A1a[1] = "fullName_";
                A1a[2] = "firstName_";
                A1a[3] = "lidJid_";
                A1a[4] = "saveOnPrimaryAddressbook_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003", A1a);
            case 3:
                return new C165318aw();
            case 4:
                return new AnonymousClass8V0();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165318aw.class) {
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
