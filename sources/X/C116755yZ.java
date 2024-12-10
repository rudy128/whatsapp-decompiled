package X;

import android.content.SharedPreferences;

/* renamed from: X.5yZ  reason: invalid class name and case insensitive filesystem */
public class C116755yZ extends AnonymousClass1H7 {
    public final int A00;
    public final Object A01;

    public C116755yZ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public /* bridge */ /* synthetic */ Object A00() {
        SharedPreferences A002;
        String str;
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                if (C17880vN.A1W(C38771rr.A00((C38771rr) ((C38761rq) obj).A00.get()), "meta_ai_imagine_me_nux_accepted")) {
                    return C38781rs.A02;
                }
                return C38781rs.A03;
            case 1:
                A002 = C138616xO.A00(obj);
                str = "consent_status";
                break;
            default:
                A002 = C138616xO.A00(obj);
                str = "consent_status_meta_ai_biz";
                break;
        }
        String string = A002.getString(str, "unset");
        if (string != null) {
            return string;
        }
        return "unset";
    }

    public /* bridge */ /* synthetic */ void A03(Object obj) {
        String str;
        switch (this.A00) {
            case 0:
                C38781rs r7 = (C38781rs) obj;
                C18070vi.A0d(r7, 0);
                C17880vN.A1F(C38771rr.A00((C38771rr) ((C38761rq) this.A01).A00.get()).edit(), "meta_ai_imagine_me_nux_accepted", r7.value);
                return;
            case 1:
                String str2 = (String) obj;
                C18070vi.A0d(str2, 0);
                boolean equals = str2.equals("no");
                long currentTimeMillis = System.currentTimeMillis();
                SharedPreferences.Editor edit = C138936xw.A00((C138936xw) ((C138616xO) this.A01).A03.get()).edit();
                if (equals) {
                    edit.putString("consent_status", "no");
                    str = "consent_last_dismissed_timestamp";
                } else {
                    edit.putString("consent_status", str2);
                    str = "consent_last_fetch_timestamp";
                }
                edit.putLong(str, currentTimeMillis);
                edit.apply();
                return;
            default:
                String str3 = (String) obj;
                C18070vi.A0d(str3, 0);
                SharedPreferences.Editor edit2 = C138616xO.A00(this.A01).edit();
                edit2.putString("consent_status_meta_ai_biz", str3);
                edit2.apply();
                return;
        }
    }
}
