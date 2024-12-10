package X;

import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

public final class A19 {
    public final AnonymousClass18K A00;
    public final C199189za A01;
    public final C18030ve A02;
    public final AnonymousClass10I A03;
    public final AnonymousClass00H A04;

    public final void A01(AnonymousClass1BI r10, String str, String str2, int i, int i2) {
        C18070vi.A0d(str, 0);
        if (!A00(str)) {
            JSONObject A15 = C17880vN.A15();
            try {
                A15.put("cta", str);
            } catch (JSONException e) {
                Log.w(C17900vP.A0C("MessageWithLinkLogging/logInteraction/", AnonymousClass000.A10(), e));
            }
            AnonymousClass1BI r1 = r10;
            ((C190579lB) this.A04.get()).A00(r1, C17880vN.A0j(), A15.toString(), str2, i, i2, 1, true);
        }
    }

    public final void A02(AnonymousClass206 r8, String str, int i) {
        String str2 = str;
        if (!A00(str)) {
            this.A03.CGF(new C70783Cm(this, r8, str2, i, 16));
        }
    }

    public A19(C18030ve r1, AnonymousClass18K r2, C199189za r3, AnonymousClass10I r4, AnonymousClass00H r5) {
        C18070vi.A0w(r1, r4, r2, r3, r5);
        this.A02 = r1;
        this.A03 = r4;
        this.A00 = r2;
        this.A01 = r3;
        this.A04 = r5;
    }

    private final boolean A00(String str) {
        C18030ve r2;
        int i;
        int hashCode = str.hashCode();
        if (hashCode != -1890748409) {
            if (hashCode != 1120508066) {
                if (hashCode != 1366428570 || !str.equals("link_to_webview")) {
                    return false;
                }
                r2 = this.A02;
                i = 3577;
            } else if (!str.equals("marketing_msg_webview")) {
                return false;
            } else {
                r2 = this.A02;
                i = 3904;
            }
        } else if (!str.equals("checkout_lite")) {
            return false;
        } else {
            r2 = this.A02;
            i = 4295;
        }
        if (!C18020vd.A05(C18040vf.A02, r2, i)) {
            return true;
        }
        return false;
    }
}
