package X;

public abstract class CIP {
    public static final C23191Bcl A00;
    public static final C23191Bcl A01;
    public static final C23191Bcl A02;
    public static final C23191Bcl A03;
    public static final C23191Bcl A04;
    public static final C23191Bcl A05;
    public static final C23191Bcl A06;
    public static final C23191Bcl A07;
    public static final C23191Bcl A08;
    public static final C23191Bcl A09;
    public static final C23191Bcl A0A;
    public static final C23191Bcl A0B;
    public static final C23191Bcl A0C;
    public static final C23191Bcl A0D;
    public static final C23191Bcl A0E;
    public static final C23191Bcl A0F;
    public static final C23191Bcl[] A0G;

    static {
        C23191Bcl A072 = DJ0.A07("account_capability_api", 1);
        A00 = A072;
        C23191Bcl A073 = DJ0.A07("account_data_service", 6);
        A01 = A073;
        C23191Bcl A074 = DJ0.A07("account_data_service_legacy", 1);
        A02 = A074;
        C23191Bcl A075 = DJ0.A07("account_data_service_token", 8);
        A03 = A075;
        C23191Bcl A076 = DJ0.A07("account_data_service_visibility", 1);
        A04 = A076;
        C23191Bcl A077 = DJ0.A07("config_sync", 1);
        A05 = A077;
        C23191Bcl A078 = DJ0.A07("device_account_api", 1);
        A06 = A078;
        C23191Bcl A079 = DJ0.A07("device_account_jwt_creation", 1);
        A07 = A079;
        C23191Bcl A0710 = DJ0.A07("gaiaid_primary_email_api", 1);
        A08 = A0710;
        C23191Bcl A0711 = DJ0.A07("get_restricted_accounts_api", 1);
        A09 = A0711;
        C23191Bcl A062 = DJ0.A06("google_auth_service_accounts");
        A0A = A062;
        C23191Bcl A0712 = DJ0.A07("google_auth_service_token", 3);
        A0B = A0712;
        C23191Bcl A0713 = DJ0.A07("hub_mode_api", 1);
        A0C = A0713;
        C23191Bcl A0714 = DJ0.A07("work_account_client_is_whitelisted", 1);
        A0D = A0714;
        C23191Bcl A0715 = DJ0.A07("factory_reset_protection_api", 1);
        A0E = A0715;
        C23191Bcl A0716 = DJ0.A07("google_auth_api", 1);
        A0F = A0716;
        C23191Bcl[] bclArr = new C23191Bcl[16];
        C17900vP.A0O(A072, A073, A074, A075, bclArr);
        C17900vP.A0P(A076, A077, A078, A079, bclArr);
        C17890vO.A0x(A0710, A0711, bclArr);
        C17900vP.A0Q(A062, A0712, A0713, A0714, bclArr);
        bclArr[14] = A0715;
        bclArr[15] = A0716;
        A0G = bclArr;
    }
}
