package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.0CE  reason: invalid class name */
public final class AnonymousClass0CE extends C172198t2 {
    public final String A00;
    public final AEQ A01;
    public final C18030ve A02;
    public final C193899qq A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0CE(X.AnonymousClass190 r13, X.C22416B6y r14, X.AEQ r15, X.C24521Kq r16, X.C18000vb r17, X.C18030ve r18, X.C22508BAp r19, X.C191659mx r20, X.C193899qq r21, X.C19989A2b r22, X.C183279Xq r23, X.AnonymousClass10I r24, java.lang.String r25) {
        /*
            r12 = this;
            r0 = 1
            r3 = r13
            X.C18070vi.A0d(r13, r0)
            r0 = 2
            r11 = r24
            X.C18070vi.A0d(r11, r0)
            r0 = 3
            r6 = r17
            X.C18070vi.A0d(r6, r0)
            r0 = 4
            r4 = r14
            X.C18070vi.A0d(r14, r0)
            r0 = 5
            r5 = r16
            X.C18070vi.A0d(r5, r0)
            r0 = 6
            r10 = r23
            X.C18070vi.A0d(r10, r0)
            r0 = 7
            r1 = r18
            X.C18070vi.A0d(r1, r0)
            r0 = 9
            r8 = r20
            X.C18070vi.A0d(r8, r0)
            r2 = r12
            r7 = r19
            r9 = r22
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.A02 = r1
            r0 = r25
            r12.A00 = r0
            r12.A01 = r15
            r0 = r21
            r12.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0CE.<init>(X.190, X.B6y, X.AEQ, X.1Kq, X.0vb, X.0ve, X.BAp, X.9mx, X.9qq, X.A2b, X.9Xq, X.10I, java.lang.String):void");
    }

    public Map A0B() {
        C18030ve r1;
        int i;
        HashMap hashMap = new HashMap();
        AEQ aeq = this.A01;
        if (aeq != null) {
            hashMap.put("category_id", aeq.A00);
        }
        C193899qq r0 = this.A03;
        if (r0 != null) {
            hashMap.put("pagination", C172198t2.A02(r0));
        }
        C192069nk r02 = new C192069nk();
        r02.A01();
        hashMap.put("fields_config", r02.A00());
        String str = this.A00;
        hashMap.put("use_case", str);
        if (C18070vi.A18(str, "search_by_category")) {
            r1 = this.A02;
            i = 2968;
        } else if (C18070vi.A18(str, "popular_biz")) {
            r1 = this.A02;
            i = 2970;
        } else {
            Log.e(AnonymousClass001.A1H("BusinessApiBusinessesListRequest/getInternalParams unknown search use case ", str, AnonymousClass000.A10()));
            return hashMap;
        }
        hashMap.put("ranking_logic_ver", r1.A0I(i));
        return hashMap;
    }

    public /* bridge */ /* synthetic */ Object A09(JSONObject jSONObject) {
        ArrayList A002 = C02790Fj.A00(jSONObject);
        String str = this.A00;
        String str2 = null;
        if ("search_by_category".equals(str)) {
            str2 = jSONObject.optString("page_id", (String) null);
        }
        return new AnonymousClass0Jv(str, str2, A002);
    }

    public String A0A() {
        return "businesses";
    }
}
