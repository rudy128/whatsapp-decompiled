package X;

import android.content.SharedPreferences;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.2jv  reason: invalid class name and case insensitive filesystem */
public class C57962jv {
    public final AnonymousClass190 A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass19F A02;
    public final C53442cX A03;
    public final AnonymousClass18E A04;
    public final AnonymousClass00H A05;

    public void A00(boolean z) {
        SharedPreferences sharedPreferences;
        String string;
        String str;
        AnonymousClass00H r4 = this.A05;
        String A0T = C17890vO.A0T(r4);
        AnonymousClass19F r5 = this.A02;
        synchronized (r5) {
            sharedPreferences = r5.A00;
            string = sharedPreferences.getString("ab_props:sys:config_hash", (String) null);
        }
        if (string == null || z) {
            str = "";
        } else {
            synchronized (r5) {
                str = sharedPreferences.getString("ab_props:sys:config_hash", (String) null);
            }
        }
        AnonymousClass1MD[] r2 = new AnonymousClass1MD[2];
        r2[0] = new AnonymousClass1MD("protocol", 1);
        C17880vN.A1Q("hash", str, r2, 1);
        C29621ca r3 = new C29621ca("props", r2);
        AnonymousClass1MD[] r22 = new AnonymousClass1MD[4];
        C17880vN.A1I(C173438v4.A00, "to", r22, 0);
        C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r22, 1);
        C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0T, r22, 2);
        C17880vN.A0U(r4).A0N(new C693736y(this, 3), C29621ca.A01(r3, "xmlns", "abt", r22), A0T, 220, 32000);
    }

    public C57962jv(AnonymousClass190 r1, AnonymousClass11P r2, AnonymousClass19F r3, C53442cX r4, AnonymousClass18E r5, AnonymousClass00H r6) {
        this.A01 = r2;
        this.A00 = r1;
        this.A05 = r6;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
    }
}
