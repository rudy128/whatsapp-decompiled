package X;

import org.json.JSONObject;

/* renamed from: X.6sz  reason: invalid class name and case insensitive filesystem */
public final class C135926sz {
    public final C133786pU A00;
    public final String A01;
    public final String A02;
    public final JSONObject A03;
    public final JSONObject A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135926sz) {
                C135926sz r5 = (C135926sz) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, (((((C17880vN.A03(this.A01) + C17900vP.A00(this.A02)) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + C17880vN.A02(this.A04)) * 31);
    }

    public C135926sz(C133786pU r1, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = jSONObject;
        this.A04 = jSONObject2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AgeVerificationBloksFetcherParams(appId=");
        A10.append(this.A01);
        A10.append(", rawParams=");
        A10.append(this.A02);
        A10.append(", serverParamsJson=");
        A10.append(this.A03);
        A10.append(", clientParamsJson=");
        A10.append(this.A04);
        A10.append(", callbacks=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
