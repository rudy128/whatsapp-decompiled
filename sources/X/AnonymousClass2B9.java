package X;

/* renamed from: X.2B9  reason: invalid class name */
public final class AnonymousClass2B9 extends C23577Bm6 implements C22356B4k {
    public static final int BOTINFO_FIELD_NUMBER = 1;
    public static final AnonymousClass2B9 DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER = null;
    public static final int STANZAINFO_FIELD_NUMBER = 2;
    public int bitField0_;
    public AnonymousClass2BL botInfo_;
    public byte memoizedIsInitialized = 2;
    public AnonymousClass8XC stanzaInfo_;

    static {
        AnonymousClass2B9 r1 = new AnonymousClass2B9();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass2B9.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        int i = 1;
        switch (num.intValue()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                if (obj == null) {
                    i = 0;
                }
                this.memoizedIsInitialized = (byte) i;
                return null;
            case 2:
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "botInfo_", "stanzaInfo_"});
            case 3:
                return new AnonymousClass2B9();
            case 4:
                return new C45512Aj();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass2B9.class) {
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
