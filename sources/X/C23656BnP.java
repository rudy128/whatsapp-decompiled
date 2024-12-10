package X;

/* renamed from: X.BnP  reason: case insensitive filesystem */
public final class C23656BnP extends C23577Bm6 implements C22356B4k {
    public static final int ADDRESSES_FIELD_NUMBER = 3;
    public static final int BUILDFLAVOR_FIELD_NUMBER = 8;
    public static final C23656BnP DEFAULT_INSTANCE;
    public static final int DEVICEIMAGEASSETURI_FIELD_NUMBER = 6;
    public static final int DEVICEMODELNAME_FIELD_NUMBER = 7;
    public static final int DEVICENAME_FIELD_NUMBER = 9;
    public static final int DEVICESERIAL_FIELD_NUMBER = 5;
    public static final int ERROR_FIELD_NUMBER = 2;
    public static final int FIRMWAREVERSION_FIELD_NUMBER = 4;
    public static final int HARDWARETYPE_FIELD_NUMBER = 10;
    public static final int MACADDRESS_FIELD_NUMBER = 11;
    public static final int NONCE_FIELD_NUMBER = 1;
    public static volatile C22357B4l PARSER;
    public EE9 addresses_ = C23579Bm9.A02;
    public DSQ buildFlavor_;
    public DSQ deviceImageAssetURI_;
    public DSQ deviceModelName_;
    public DSQ deviceName_;
    public DSQ deviceSerial_;
    public int error_;
    public DSQ firmwareVersion_;
    public DSQ hardwareType_;
    public DSQ macAddress_;
    public int nonce_;

    static {
        C23656BnP bnP = new C23656BnP();
        DEFAULT_INSTANCE = bnP;
        C23577Bm6.A0E(bnP, C23656BnP.class);
    }

    public C23656BnP() {
        DSQ dsq = DSQ.A00;
        this.firmwareVersion_ = dsq;
        this.deviceSerial_ = dsq;
        this.deviceImageAssetURI_ = dsq;
        this.deviceModelName_ = dsq;
        this.buildFlavor_ = dsq;
        this.deviceName_ = dsq;
        this.hardwareType_ = dsq;
        this.macAddress_ = dsq;
    }
}
