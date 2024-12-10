package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import java.util.TreeMap;
import org.json.JSONObject;

/* renamed from: X.8td  reason: invalid class name and case insensitive filesystem */
public final class C172568td extends AnonymousClass7IA {
    public final C197859xN A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C172568td(X.AnonymousClass181 r15, X.C19830z4 r16, X.C18030ve r17, X.C197859xN r18, X.C31611fq r19, X.AnonymousClass00H r20, java.lang.String r21) {
        /*
            r14 = this;
            r0 = 3
            r3 = r15
            r4 = r16
            r5 = r17
            X.C72473Md.A1M(r5, r15, r4, r0)
            r0 = 6
            r7 = r20
            X.C18070vi.A0d(r7, r0)
            X.AlM r10 = new X.AlM
            r1 = r18
            r10.<init>(r1)
            X.AlN r11 = new X.AlN
            r11.<init>(r1)
            java.lang.Long r0 = r1.A01
            long r12 = r0.longValue()
            r9 = 0
            r2 = r14
            r6 = r19
            r8 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r14.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172568td.<init>(X.181, X.0z4, X.0ve, X.9xN, X.1fq, X.00H, java.lang.String):void");
    }

    public void A0A(JSONObject jSONObject) {
        C18070vi.A0d(jSONObject, 0);
        AnonymousClass29S r1 = ((AIj) this.A00.A00.A00).A00.A00;
        TreeMap treeMap = new TreeMap();
        GraphQlCallInput.A01(r1.A00, r1, treeMap);
        jSONObject.put("variables", new JSONObject(treeMap));
    }

    public String A04() {
        C35021lW r0 = this.A00.A00.A01;
        if (r0 == null || r0.A01) {
            return null;
        }
        return "facebook.com";
    }

    public boolean A0C() {
        return C18020vd.A05(C18040vf.A02, this.A03, 10918);
    }

    public String A05() {
        return null;
    }
}
