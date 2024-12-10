package X;

import java.util.Map;

/* renamed from: X.9tK  reason: invalid class name and case insensitive filesystem */
public final class C195429tK {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final Map A05;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C195429tK) && C18070vi.A18(this.A05, ((C195429tK) obj).A05));
    }

    public int hashCode() {
        return this.A05.hashCode();
    }

    public C195429tK(Map map) {
        boolean z;
        this.A05 = map;
        this.A03 = C17880vN.A0s("title", map);
        this.A00 = C17880vN.A0s("body", map);
        if (map.get("hide_date") != null) {
            z = AnonymousClass8BX.A1X(map, "hide_date");
        } else {
            z = true;
        }
        this.A04 = z;
        Object obj = map.get("btn_primary_text");
        C17960vV.A07(obj);
        C18070vi.A0z(obj, "null cannot be cast to non-null type kotlin.String");
        this.A02 = (String) obj;
        Object obj2 = map.get("btn_primary_url");
        C17960vV.A07(obj2);
        C18070vi.A0z(obj2, "null cannot be cast to non-null type kotlin.String");
        this.A01 = (String) obj2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CustomForceUpgradeData(customForceUpgradeData=");
        return AnonymousClass001.A1F(this.A05, A10);
    }
}
