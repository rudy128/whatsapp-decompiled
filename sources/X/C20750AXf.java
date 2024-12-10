package X;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: X.AXf  reason: case insensitive filesystem */
public class C20750AXf implements BDQ {
    public final AZ6 A00;
    public final C18030ve A01;

    public static C20112A7u A00(Uri uri, C20112A7u a7u) {
        C20112A7u a7u2;
        if (uri != null) {
            try {
                String queryParameter = uri.getQueryParameter("campaignID");
                if (!TextUtils.isEmpty(queryParameter)) {
                    if (a7u != null) {
                        a7u2 = a7u;
                    } else {
                        a7u2 = C20112A7u.A03(new C20112A7u[0]);
                    }
                    a7u2.A07("campaign_id", queryParameter);
                    return a7u2;
                }
            } catch (Exception unused) {
            }
        }
        return a7u;
    }

    public boolean BJA(String str) {
        return "upi".equals(str);
    }

    public String BNS() {
        return this.A01.A0I(796);
    }

    public C20750AXf(C18030ve r1, AZ6 az6) {
        this.A01 = r1;
        this.A00 = az6;
    }

    public String BOC() {
        return "campaignID";
    }
}
