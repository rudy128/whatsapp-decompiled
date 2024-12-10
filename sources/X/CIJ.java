package X;

public abstract class CIJ {
    public static final C23191Bcl A00;
    public static final C23191Bcl A01;
    public static final C23191Bcl A02;
    public static final C23191Bcl A03;
    public static final C23191Bcl A04;
    public static final C23191Bcl A05;
    public static final C23191Bcl A06;
    public static final C23191Bcl A07;
    public static final C23191Bcl[] A08;

    static {
        C23191Bcl A072 = DJ0.A07("auth_api_credentials_begin_sign_in", 9);
        A00 = A072;
        C23191Bcl A062 = DJ0.A06("auth_api_credentials_sign_out");
        A01 = A062;
        C23191Bcl A073 = DJ0.A07("auth_api_credentials_authorize", 1);
        A02 = A073;
        C23191Bcl A074 = DJ0.A07("auth_api_credentials_revoke_access", 1);
        A03 = A074;
        C23191Bcl A075 = DJ0.A07("auth_api_credentials_save_password", 4);
        A04 = A075;
        C23191Bcl A076 = DJ0.A07("auth_api_credentials_get_sign_in_intent", 6);
        A05 = A076;
        C23191Bcl A077 = DJ0.A07("auth_api_credentials_save_account_linking_token", 3);
        A06 = A077;
        C23191Bcl A078 = DJ0.A07("auth_api_credentials_get_phone_number_hint_intent", 3);
        A07 = A078;
        C23191Bcl[] bclArr = new C23191Bcl[8];
        C17900vP.A0O(A072, A062, A073, A074, bclArr);
        C17900vP.A0P(A075, A076, A077, A078, bclArr);
        A08 = bclArr;
    }
}
