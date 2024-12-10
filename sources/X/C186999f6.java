package X;

import android.content.Context;
import android.net.Uri;
import android.telephony.TelephonyManager;
import java.util.List;

/* renamed from: X.9f6  reason: invalid class name and case insensitive filesystem */
public final class C186999f6 {
    public final C18030ve A00;
    public final C185149c6 A01;
    public final List A02;
    public final Context A03;

    /* JADX WARNING: type inference failed for: r2v1, types: [X.9pF, java.lang.Object] */
    public C186999f6(Context context, C18030ve r11, C185149c6 r12) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String simCountryIso;
        String simCountryIso2;
        int A0G = C72453Mb.A0G(context, r11, 1);
        this.A03 = context;
        this.A00 = r11;
        this.A01 = r12;
        String A0F = C18070vi.A0F(context, 2131899592);
        AnonymousClass1D6[] r4 = new AnonymousClass1D6[A0G];
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("https://www.whatsapp.com/legal/privacy-policy?cc=");
        AnonymousClass11C r8 = r12.A01;
        TelephonyManager A0K = r8.A0K();
        if (A0K == null || (simCountryIso2 = A0K.getSimCountryIso()) == null) {
            str = null;
        } else {
            str = C108975cc.A0d(simCountryIso2);
        }
        A10.append(str);
        A10.append("&cr=true&lg=");
        C18000vb r6 = r12.A00;
        if (r6 != null) {
            str2 = C108975cc.A0d(r6.A05());
        } else {
            str2 = null;
        }
        A10.append(str2);
        A10.append("&lc=");
        if (r6 != null) {
            str3 = C108975cc.A0d(r6.A04());
        } else {
            str3 = null;
        }
        C72463Mc.A1H("pp", Uri.parse(AnonymousClass000.A0y(str3, A10)), r4);
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("https://www.whatsapp.com/legal/terms-of-service?cc=");
        TelephonyManager A0K2 = r8.A0K();
        if (A0K2 == null || (simCountryIso = A0K2.getSimCountryIso()) == null) {
            str4 = null;
        } else {
            str4 = C108975cc.A0d(simCountryIso);
        }
        A102.append(str4);
        A102.append("&cr=true&lg=");
        if (r6 != null) {
            str5 = C108975cc.A0d(r6.A05());
        } else {
            str5 = null;
        }
        A102.append(str5);
        A102.append("&lc=");
        if (r6 != null) {
            str6 = C108975cc.A0d(r6.A04());
        } else {
            str6 = null;
        }
        AnonymousClass1D6.A03("tos", Uri.parse(AnonymousClass000.A0y(str6, A102)), r4, 1);
        this.A02 = C18070vi.A0M(new C194639s3(new Object(), new C193219pj(new C194089r9(A0F, AnonymousClass1D7.A0B(r4))), C21535Ali.A00(this, 37)));
    }
}
