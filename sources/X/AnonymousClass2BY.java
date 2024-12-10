package X;

/* renamed from: X.2BY  reason: invalid class name */
public final class AnonymousClass2BY extends C23577Bm6 implements C22356B4k {
    public static final int CONNECT_ATTEMPT_COUNT_FIELD_NUMBER = 16;
    public static final int CONNECT_REASON_FIELD_NUMBER = 13;
    public static final int CONNECT_TYPE_FIELD_NUMBER = 12;
    public static final AnonymousClass2BY DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER = 18;
    public static final int DEVICE_PAIRING_DATA_FIELD_NUMBER = 19;
    public static final int DNS_SOURCE_FIELD_NUMBER = 15;
    public static final int FB_APP_ID_FIELD_NUMBER = 31;
    public static final int FB_CAT_FIELD_NUMBER = 21;
    public static final int FB_DEVICE_ID_FIELD_NUMBER = 32;
    public static final int FB_USER_AGENT_FIELD_NUMBER = 22;
    public static final int INTEROP_DATA_FIELD_NUMBER = 38;
    public static final int IOS_APP_EXTENSION_FIELD_NUMBER = 30;
    public static final int LC_FIELD_NUMBER = 24;
    public static final int MEM_CLASS_FIELD_NUMBER = 37;
    public static final int OC_FIELD_NUMBER = 23;
    public static final int PADDING_BYTES_FIELD_NUMBER = 34;
    public static volatile C22357B4l PARSER = null;
    public static final int PASSIVE_FIELD_NUMBER = 3;
    public static final int PRODUCT_FIELD_NUMBER = 20;
    public static final int PULL_FIELD_NUMBER = 33;
    public static final int PUSH_NAME_FIELD_NUMBER = 7;
    public static final int SESSION_ID_FIELD_NUMBER = 9;
    public static final int SHARDS_FIELD_NUMBER = 14;
    public static final int SHORT_CONNECT_FIELD_NUMBER = 10;
    public static final int TRAFFIC_ANONYMIZATION_FIELD_NUMBER = 40;
    public static final int USERNAME_FIELD_NUMBER = 1;
    public static final int USER_AGENT_FIELD_NUMBER = 5;
    public static final int WEB_INFO_FIELD_NUMBER = 6;
    public static final int YEAR_CLASS_FIELD_NUMBER = 36;
    public int bitField0_;
    public int connectAttemptCount_;
    public int connectReason_;
    public int connectType_;
    public AnonymousClass2BS devicePairingData_;
    public int device_;
    public C164538Zf dnsSource_;
    public long fbAppId_;
    public DSQ fbCat_;
    public DSQ fbDeviceId_;
    public DSQ fbUserAgent_;
    public C165048aV interopData_;
    public int iosAppExtension_;
    public int lc_;
    public int memClass_;
    public boolean oc_;
    public DSQ paddingBytes_;
    public boolean passive_;
    public int product_;
    public boolean pull_;
    public String pushName_ = "";
    public int sessionId_;
    public C28667EDj shards_ = Bm7.A02;
    public boolean shortConnect_;
    public int trafficAnonymization_;
    public AnonymousClass2BX userAgent_;
    public long username_;
    public C166338cj webInfo_;
    public int yearClass_;

    static {
        AnonymousClass2BY r1 = new AnonymousClass2BY();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass2BY.class);
    }

    public C166338cj A0R() {
        C166338cj r0 = this.webInfo_;
        if (r0 == null) {
            return C166338cj.DEFAULT_INSTANCE;
        }
        return r0;
    }

    public AnonymousClass2BY() {
        DSQ dsq = DSQ.A00;
        this.fbCat_ = dsq;
        this.fbUserAgent_ = dsq;
        this.fbDeviceId_ = dsq;
        this.paddingBytes_ = dsq;
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(34);
                A1Z[1] = "username_";
                A1Z[2] = "passive_";
                A1Z[3] = "userAgent_";
                A1Z[4] = "webInfo_";
                A1Z[5] = "pushName_";
                A1Z[6] = "sessionId_";
                A1Z[7] = "shortConnect_";
                A1Z[8] = "connectType_";
                A1Z[9] = C65722x0.A00;
                A1Z[10] = "connectReason_";
                A1Z[11] = C65712wz.A00;
                A1Z[12] = "shards_";
                A1Z[13] = "dnsSource_";
                A1Z[14] = "connectAttemptCount_";
                A1Z[15] = "device_";
                A1Z[16] = "devicePairingData_";
                A1Z[17] = "product_";
                A1Z[18] = C65742x2.A00;
                A1Z[19] = "fbCat_";
                A1Z[20] = "fbUserAgent_";
                A1Z[21] = "oc_";
                A1Z[22] = "lc_";
                A1Z[23] = "iosAppExtension_";
                A1Z[24] = C65732x1.A00;
                A1Z[25] = "fbAppId_";
                A1Z[26] = "fbDeviceId_";
                A1Z[27] = "pull_";
                A1Z[28] = "paddingBytes_";
                A1Z[29] = "yearClass_";
                A1Z[30] = "memClass_";
                A1Z[31] = "interopData_";
                A1Z[32] = "trafficAnonymization_";
                A1Z[33] = C65752x3.A00;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u001c\u0000\u0001\u0001(\u001c\u0000\u0001\u0000\u0001ဃ\u0000\u0003ဇ\u0001\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဈ\u0004\tဍ\u0005\nဇ\u0006\fဌ\u0007\rဌ\b\u000e\u0016\u000fဉ\t\u0010ဋ\n\u0012ဋ\u000b\u0013ဉ\f\u0014ဌ\r\u0015ည\u000e\u0016ည\u000f\u0017ဇ\u0010\u0018င\u0011\u001eဌ\u0012\u001fဃ\u0013 ည\u0014!ဇ\u0015\"ည\u0016$င\u0017%င\u0018&ဉ\u0019(ဌ\u001a", A1Z);
            case 3:
                return new AnonymousClass2BY();
            case 4:
                return new C45622Au();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass2BY.class) {
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
