package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.1mn  reason: invalid class name and case insensitive filesystem */
public final class C35781mn {
    public final AnonymousClass11P A00;
    public final C18030ve A01;
    public final C18010vc A02;

    public C35781mn(AnonymousClass11P r2, C18030ve r3, C18010vc r4) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r3, 3);
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
    }

    public static final synchronized SharedPreferences A00(C35781mn r2) {
        SharedPreferences A05;
        synchronized (r2) {
            A05 = r2.A02.A05("biz_opt_out");
            C18070vi.A0X(A05);
        }
        return A05;
    }

    public static final String A01(AnonymousClass9NC r3) {
        String str;
        JSONObject putOpt = new JSONObject().putOpt("key_brand_id", r3.A01);
        UserJid userJid = r3.A00;
        if (userJid != null) {
            str = userJid.getRawString();
        } else {
            str = null;
        }
        String obj = putOpt.putOpt("key_jid", str).toString();
        C18070vi.A0X(obj);
        return obj;
    }

    public final String A02() {
        boolean z = false;
        if (AnonymousClass11P.A01(this.A00) - A00(this).getLong("biz_opt_out_ts", 0) > ((long) C18020vd.A00(C18040vf.A02, this.A01, 12322)) * 1000) {
            z = true;
        }
        if (!z) {
            return A00(this).getString("biz_opt_out_dhash", (String) null);
        }
        return null;
    }
}
