package X;

import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Set;

/* renamed from: X.96B  reason: invalid class name */
public class AnonymousClass96B extends AnonymousClass8GH {
    public Integer A00;
    public String A01 = null;
    public final AnonymousClass1LC A02;
    public final A5Y A03;

    public AnonymousClass96B(AnonymousClass1LC r10, AnonymousClass11P r11, C18000vb r12, C32981i4 r13, C18030ve r14, AnonymousClass1QD r15, AnonymousClass1QS r16, BD4 bd4, A5Y a5y) {
        super(r11, r12, r13, r14, r15, r16, bd4);
        this.A02 = r10;
        this.A03 = a5y;
    }

    public void A0a(String str) {
        String A0w;
        String A0w2;
        String A0w3;
        String A0w4;
        String A0w5;
        this.A01 = null;
        if (!TextUtils.isEmpty(str) && this.A0B.A03.A03()) {
            try {
                C18070vi.A0d(str, 0);
                Uri parse = Uri.parse(str);
                List<String> pathSegments = parse.getPathSegments();
                if (((pathSegments.size() == 3 && (A0w3 = C17880vN.A0w(pathSegments, 0)) != null && A0w3.equalsIgnoreCase("pay") && (A0w4 = C17880vN.A0w(pathSegments, 1)) != null && A0w4.equalsIgnoreCase("br") && (A0w5 = C17880vN.A0w(pathSegments, 2)) != null && A0w5.equalsIgnoreCase("add-credential")) || (pathSegments.size() == 2 && (A0w = C17880vN.A0w(pathSegments, 0)) != null && A0w.equalsIgnoreCase("br") && (A0w2 = C17880vN.A0w(pathSegments, 1)) != null && A0w2.equalsIgnoreCase("add-credential"))) && (parse.getQueryParameterNames().contains("pushAccountData") || parse.getQueryParameterNames().contains("pushData"))) {
                    Uri parse2 = Uri.parse(str);
                    Set<String> queryParameterNames = parse2.getQueryParameterNames();
                    if (queryParameterNames.contains("pushAccountData")) {
                        if (C18020vd.A05(C18040vf.A02, this.A06, 1601)) {
                            this.A01 = parse2.getQueryParameter("pushAccountData");
                            this.A00 = AnonymousClass00R.A00;
                            Log.i("Push Prov deeplink received for MasterCard");
                            AnonymousClass3MX.A1K(this.A00, 2);
                            return;
                        }
                    }
                    if (queryParameterNames.contains("pushData")) {
                        if (C18020vd.A05(C18040vf.A02, this.A06, 2608)) {
                            this.A01 = parse2.getQueryParameter("pushData");
                            this.A00 = AnonymousClass00R.A01;
                            Log.i("Push Prov deeplink received for VISA");
                            AnonymousClass3MX.A1K(this.A00, 2);
                            return;
                        }
                    }
                }
            } catch (NullPointerException | UnsupportedOperationException unused) {
                Log.i("Unable to read query param pushAccountDataorpushData");
            }
        }
        super.A0a(str);
    }

    public int A0c(int i) {
        AnonymousClass1QS r5 = this.A08;
        boolean A0G = r5.A02("p2p_context").A0G("tos_no_wallet");
        C18030ve r3 = this.A06;
        C18040vf r2 = C18040vf.A02;
        if (C18020vd.A05(r2, r3, 12153) && A0G) {
            return 5;
        }
        if (!C18020vd.A05(r2, r3, 12152)) {
            A5Y a5y = this.A03;
            boolean A032 = a5y.A03.A03();
            C17900vP.A0n("isPaymentAccountCreated = ", AnonymousClass000.A10(), A032);
            if (i != 0 || !this.A07.A03().getBoolean("payment_brazil_nux_dismissed", false)) {
                if (A032) {
                    if (AnonymousClass8BU.A0t(r5).isEmpty()) {
                        return 2;
                    }
                } else if (a5y.A05()) {
                    return 3;
                } else {
                    return 1;
                }
            }
        }
        return 0;
    }
}
