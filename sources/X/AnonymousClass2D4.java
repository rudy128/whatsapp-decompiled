package X;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import org.json.JSONObject;

/* renamed from: X.2D4  reason: invalid class name */
public final class AnonymousClass2D4 extends C196289ul {
    public final AnonymousClass1M9 A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    public String A08(Context context, C20285AEt aEt, C20271AEe aEe) {
        String optString;
        String str;
        C18070vi.A0d(context, 0);
        JSONObject jSONObject = null;
        if (!(aEe == null || (str = aEe.A00) == null || AnonymousClass1YF.A0T(str))) {
            jSONObject = C17880vN.A16(str);
        }
        String A0F = C18070vi.A0F(context, 2131887804);
        if (jSONObject == null || (optString = jSONObject.optString("display_text", A0F)) == null) {
            return A0F;
        }
        return optString;
    }

    public void A0A(Activity activity, AnonymousClass5XY r15, AnonymousClass206 r16, C20271AEe aEe, int i) {
        String str;
        C18070vi.A0d(activity, 0);
        AnonymousClass206 r1 = r16;
        C20271AEe aEe2 = aEe;
        C18070vi.A0k(r1, aEe2);
        ((C195199sx) this.A04.get()).A01();
        AnonymousClass1BI r6 = r1.A0v.A00;
        if (r6 != null) {
            AnonymousClass1E7 A0D = this.A00.A0D(r6);
            String str2 = aEe2.A00;
            if (str2 == null || str2.length() == 0) {
                str = null;
            } else {
                str = C17880vN.A16(str2).optString("message_origin");
            }
            String str3 = aEe2.A00;
            long j = 0;
            if (!(str3 == null || str3.length() == 0)) {
                j = C17880vN.A16(str3).optLong("expire_time", 0);
            }
            long A002 = AnonymousClass11P.A00(this.A01);
            if (1 > j || j >= A002) {
                if (C18070vi.A18(str, "ctwa_auto_reply")) {
                    ((C131526lF) this.A03.get()).A00(C22941Dw.A00(r6), "whatsapp_call");
                }
                ((AnonymousClass1VP) this.A02.get()).CNw(activity, A0D, 36, false);
                return;
            }
            C73203Rj A003 = AnonymousClass4a6.A00(activity);
            A003.A0R(LayoutInflater.from(activity).inflate(2131624445, (ViewGroup) null));
            A003.A0D(2131892061);
            A003.A0L(new C1411974r(16), activity.getString(2131899286));
            A003.A0C();
        }
    }

    public void A0B(Activity activity, AnonymousClass5XY r2, AnonymousClass206 r3, C20271AEe aEe, Class cls) {
        C18070vi.A0d(activity, 0);
        C18070vi.A0j(aEe, r3);
        A0A(activity, r2, r3, aEe, 0);
    }

    public boolean A0F(C18030ve r3, C166418cr r4) {
        C18070vi.A0d(r3, 1);
        return !C18020vd.A05(C18040vf.A02, r3, 4037);
    }

    public AnonymousClass2D4(AnonymousClass1M9 r1, AnonymousClass11P r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0w(r3, r1, r4, r5, r2);
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r2;
    }

    public int A04() {
        return 2131231742;
    }

    public String A07() {
        return "voice_call";
    }
}
