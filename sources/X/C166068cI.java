package X;

/* renamed from: X.8cI  reason: invalid class name and case insensitive filesystem */
public final class C166068cI extends C23577Bm6 implements C22356B4k {
    public static final int ALICEBASEKEY_FIELD_NUMBER = 13;
    public static final C166068cI DEFAULT_INSTANCE;
    public static final int LOCALIDENTITYPUBLIC_FIELD_NUMBER = 2;
    public static final int LOCALREGISTRATIONID_FIELD_NUMBER = 11;
    public static final int NEEDSREFRESH_FIELD_NUMBER = 12;
    public static volatile C22357B4l PARSER = null;
    public static final int PENDINGPREKEY_FIELD_NUMBER = 9;
    public static final int PREVIOUSCOUNTER_FIELD_NUMBER = 5;
    public static final int RECEIVERCHAINS_FIELD_NUMBER = 7;
    public static final int REMOTEIDENTITYPUBLIC_FIELD_NUMBER = 3;
    public static final int REMOTEREGISTRATIONID_FIELD_NUMBER = 10;
    public static final int ROOTKEY_FIELD_NUMBER = 4;
    public static final int SENDERCHAIN_FIELD_NUMBER = 6;
    public static final int SESSIONVERSION_FIELD_NUMBER = 1;
    public DSQ aliceBaseKey_;
    public int bitField0_;
    public DSQ localIdentityPublic_;
    public int localRegistrationId_;
    public boolean needsRefresh_;
    public C165128ad pendingPreKey_;
    public int previousCounter_;
    public EE9 receiverChains_ = C23579Bm9.A02;
    public DSQ remoteIdentityPublic_;
    public int remoteRegistrationId_;
    public DSQ rootKey_;
    public C165398b5 senderChain_;
    public int sessionVersion_;

    static {
        C166068cI r1 = new C166068cI();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166068cI.class);
    }

    public C166068cI() {
        DSQ dsq = DSQ.A00;
        this.localIdentityPublic_ = dsq;
        this.remoteIdentityPublic_ = dsq;
        this.rootKey_ = dsq;
        this.aliceBaseKey_ = dsq;
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(14);
                A1Z[1] = "sessionVersion_";
                A1Z[2] = "localIdentityPublic_";
                A1Z[3] = "remoteIdentityPublic_";
                A1Z[4] = "rootKey_";
                A1Z[5] = "previousCounter_";
                A1Z[6] = "senderChain_";
                A1Z[7] = "receiverChains_";
                A1Z[8] = C165398b5.class;
                A1Z[9] = "pendingPreKey_";
                A1Z[10] = "remoteRegistrationId_";
                A1Z[11] = "localRegistrationId_";
                A1Z[12] = "needsRefresh_";
                A1Z[13] = "aliceBaseKey_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0001\u0000\u0001ဋ\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003\u0005ဋ\u0004\u0006ဉ\u0005\u0007\u001b\tဉ\u0006\nဋ\u0007\u000bဋ\b\fဇ\t\rည\n", A1Z);
            case 3:
                return new C166068cI();
            case 4:
                return new C163838Wn();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166068cI.class) {
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
