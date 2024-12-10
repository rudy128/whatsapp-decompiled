package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import java.util.TreeMap;
import org.json.JSONObject;

public final class A2F {
    public final AnonymousClass5WY A00;
    public final C35021lW A01;
    public final C29621ca A02;
    public final AnonymousClass9F7 A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public A2F(AnonymousClass5WY r6, C35021lW r7, String str, String str2, boolean z) {
        C178719Ee r4 = null;
        this.A00 = r6;
        this.A04 = str;
        this.A06 = str2;
        this.A07 = z;
        this.A01 = r7;
        AIj aIj = (AIj) r6;
        AnonymousClass29S r2 = aIj.A00.A00;
        TreeMap treeMap = new TreeMap();
        GraphQlCallInput.A01(r2.A00, r2, treeMap);
        JSONObject jSONObject = new JSONObject(treeMap);
        String str3 = str2;
        JSONObject A15 = C17880vN.A15();
        A15.put("queryId", str2 == null ? "" : str3);
        AnonymousClass9F7 r0 = new AnonymousClass9F7(str2 != null ? new C178719Ee(str2, 5) : r4, str, str2, AnonymousClass8BV.A0r(jSONObject, "variables", A15));
        this.A03 = r0;
        this.A02 = (C29621ca) r0.A00;
        this.A05 = aIj.A02;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof A2F) {
                A2F a2f = (A2F) obj;
                if (!C18070vi.A18(this.A00, a2f.A00) || !C18070vi.A18(this.A04, a2f.A04) || !C18070vi.A18(this.A06, a2f.A06) || this.A07 != a2f.A07 || !C18070vi.A18(this.A01, a2f.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("\n        |---- Request Info ------------------------------\n        |IqId: ");
        A10.append(this.A04);
        A10.append("\n        |argoMode: ");
        A10.append((Object) null);
        A10.append("\n        |isWww: ");
        A10.append(this.A07);
        A10.append("\n        |operationName: ");
        A10.append(((AIj) this.A00).A02);
        A10.append("");
        return AnonymousClass1Y7.A02(AnonymousClass000.A0y("\n        |------------------------------------------------\n      ", A10));
    }

    public int hashCode() {
        return AnonymousClass0DV.A00((C17890vO.A02(this.A04, AnonymousClass000.A0L(this.A00)) + C17900vP.A00(this.A06)) * 31 * 31, this.A07) + C17880vN.A02(this.A01);
    }

    public A2F() {
        this(AnonymousClass9TR.A00, (C35021lW) null, "", (String) null, false);
    }
}
