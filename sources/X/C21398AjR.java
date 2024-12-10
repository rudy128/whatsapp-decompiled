package X;

import com.whatsapp.util.Log;

/* renamed from: X.AjR  reason: case insensitive filesystem */
public final /* synthetic */ class C21398AjR implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C19830z4 A01;
    public final /* synthetic */ A98 A02;
    public final /* synthetic */ C26145Ct9 A03;
    public final /* synthetic */ AnonymousClass10I A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public final void run() {
        String str;
        C19830z4 r8 = this.A01;
        boolean z = this.A07;
        AnonymousClass10I r6 = this.A04;
        String str2 = this.A05;
        String str3 = this.A06;
        C26145Ct9 ct9 = this.A03;
        A98 a98 = this.A02;
        int i = this.A00;
        AnonymousClass00H r14 = r8.A00;
        int i2 = C17880vN.A0B(r14).getInt("autoconf_type", -1);
        int i3 = C17880vN.A0B(r14).getInt("autoconf_cf_type", -1);
        boolean A1T = AnonymousClass000.A1T(C17880vN.A0B(r14).getInt("pref_autoconf_verification_status", -1), 1);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RegistrationUtils/shouldCreateAutoconfVerifier/autoconfType=");
        A10.append(i2);
        A10.append("/autoconfCfType=");
        A10.append(i3);
        A10.append("/isSimPresent=");
        A10.append(z);
        A10.append("/registeredWithAutoConf=");
        A10.append(A1T);
        C17900vP.A0n("/bypassSimCheck=", A10, false);
        if (i2 < 1 || A1T || (!z && i3 != 1)) {
            Log.i("AutoconfUtils/maybeCreateAutoconfVerifier/should not create autoconf verifier");
            return;
        }
        Log.i("AutoconfUtils/maybeCreateAutoconfVerifier/attempt to create autoconf verifier");
        if (AnonymousClass8BT.A01(C17880vN.A0B(r14), "autoconf_type") == 3) {
            str = "2";
        } else {
            str = "1";
        }
        r6.CGD(new AnonymousClass9BM(r8, a98, ct9, str2, str3, str, i, z), new String[0]);
    }

    public /* synthetic */ C21398AjR(C19830z4 r1, A98 a98, C26145Ct9 ct9, AnonymousClass10I r4, String str, String str2, int i, boolean z) {
        this.A01 = r1;
        this.A07 = z;
        this.A04 = r4;
        this.A05 = str;
        this.A06 = str2;
        this.A03 = ct9;
        this.A02 = a98;
        this.A00 = i;
    }
}
