package X;

/* renamed from: X.8ac  reason: invalid class name and case insensitive filesystem */
public final class C165118ac extends C23577Bm6 implements C22356B4k {
    public static final C165118ac DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER = null;
    public static final int SENDERCHAINKEYS_FIELD_NUMBER = 2;
    public static final int SENDERKEYID_FIELD_NUMBER = 1;
    public static final int SENDERSIGNINGKEY_FIELD_NUMBER = 3;
    public int bitField0_;
    public EE9 senderChainKeys_ = C23579Bm9.A02;
    public int senderKeyId_;
    public C164628Zo senderSigningKey_;

    static {
        C165118ac r1 = new C165118ac();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165118ac.class);
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
                A1a[1] = "senderKeyId_";
                A1a[2] = "senderChainKeys_";
                A1a[3] = C164608Zm.class;
                A1a[4] = "senderSigningKey_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဋ\u0000\u0002\u001b\u0003ဉ\u0001", A1a);
            case 3:
                return new C165118ac();
            case 4:
                return new C163828Wm();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165118ac.class) {
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
