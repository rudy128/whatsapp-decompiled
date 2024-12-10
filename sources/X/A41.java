package X;

import com.whatsapp.jid.UserJid;
import java.util.Map;
import org.json.JSONArray;

public final class A41 {
    public static final C196509vB A01 = new Object();
    public final A8Q A00;

    public A41(A8Q a8q) {
        C18070vi.A0d(a8q, 1);
        this.A00 = a8q;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.A7D, java.lang.Object] */
    public static final void A00(C193529qF r6, A41 a41, UserJid userJid, Boolean bool, Boolean bool2, Integer num, String str, String str2, String str3, String str4, String str5, Map map, int i) {
        A8Q a8q = a41.A00;
        ? obj = new Object();
        obj.A00 = userJid;
        A7D.A01(obj, i);
        obj.A04 = num;
        obj.A04(bool);
        obj.A01 = bool2;
        obj.A0D = str;
        obj.A0I = str2;
        obj.A0C = str3;
        String str6 = null;
        String str7 = null;
        if (r6 != null) {
            AnonymousClass1D6[] r4 = new AnonymousClass1D6[2];
            C72463Mc.A1H("shown_variants", new JSONArray(r6.A01), r4);
            C108985cd.A1G("dropped_variants", new JSONArray(r6.A00), r4);
            str7 = AnonymousClass8BW.A0m(AnonymousClass1D7.A0B(r4));
        }
        obj.A0J = str7;
        if (map != null) {
            str6 = AnonymousClass8BU.A0s(map);
        }
        obj.A0K = str6;
        obj.A0A = str4;
        obj.A0H = str5;
        obj.A0B = a8q.A03;
        A8Q.A04(obj, a8q);
        A8Q.A02(obj, a8q);
        A8Q.A03(obj, a8q);
        obj.A04(AnonymousClass000.A0i());
        a8q.A09(obj);
    }
}
