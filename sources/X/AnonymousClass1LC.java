package X;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1LC  reason: invalid class name */
public class AnonymousClass1LC {
    public static final Map A05;
    public final AnonymousClass1L9 A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass11C A02;
    public final C18000vb A03;
    public final AnonymousClass1K3 A04;

    static {
        HashMap hashMap = new HashMap();
        A05 = hashMap;
        hashMap.put("terms-of-service", "https://www.whatsapp.com/legal/#terms-of-service");
        hashMap.put("privacy-policy", "https://www.whatsapp.com/legal/#privacy-policy");
        hashMap.put("end-to-end-encryption", "https://faq.whatsapp.com/general/28030015/");
        hashMap.put("facebook-companies", "https://www.facebook.com/help/111814505650678");
        hashMap.put("how-whatsapp-works-with-the-meta-companies", "https://www.whatsapp.com/legal/privacy-policy-eea#privacy-policy-how-we-work-with-other-meta-companies");
        hashMap.put("privacy-policy-managing-and-deleting-your-information", "https://www.whatsapp.com/legal/#privacy-policy-managing-and-deleting-your-information");
        hashMap.put("privacy-policy-our-global-operations", "https://www.whatsapp.com/legal/#privacy-policy-our-global-operations");
        hashMap.put("terms-of-service-age", "https://www.whatsapp.com/legal/terms-of-service");
        hashMap.put("cookies", "https://www.whatsapp.com/legal/#cookies");
    }

    public Uri A01(String str, boolean z, boolean z2, boolean z3) {
        StringBuilder sb;
        String str2;
        if (z) {
            sb = new StringBuilder();
            if (z3) {
                sb.append(str);
                str2 = "-uk/preview";
            } else {
                sb.append(str);
                str2 = "-uk";
            }
        } else {
            if (z2) {
                sb = new StringBuilder();
                if (z3) {
                    sb.append(str);
                    str2 = "-eea/preview";
                } else {
                    sb.append(str);
                    str2 = "-eea";
                }
            }
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            C18000vb r2 = this.A03;
            buildUpon.appendQueryParameter("lg", r2.A05());
            buildUpon.appendQueryParameter("lc", r2.A04());
            buildUpon.build().toString();
            return buildUpon.build();
        }
        sb.append(str2);
        str = sb.toString();
        Uri.Builder buildUpon2 = Uri.parse(str).buildUpon();
        C18000vb r22 = this.A03;
        buildUpon2.appendQueryParameter("lg", r22.A05());
        buildUpon2.appendQueryParameter("lc", r22.A04());
        buildUpon2.build().toString();
        return buildUpon2.build();
    }

    public AnonymousClass1LC(AnonymousClass1L9 r1, AnonymousClass1KB r2, AnonymousClass11C r3, C18000vb r4, AnonymousClass1K3 r5) {
        this.A01 = r2;
        this.A04 = r5;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
    }

    public Uri A00(String str) {
        String str2;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        C18000vb r2 = this.A03;
        buildUpon.appendQueryParameter("lg", r2.A05());
        buildUpon.appendQueryParameter("lc", r2.A04());
        if (this.A04.A04()) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        buildUpon.appendQueryParameter("eea", str2);
        return buildUpon.build();
    }
}
