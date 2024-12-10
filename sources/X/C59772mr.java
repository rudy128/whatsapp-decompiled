package X;

import java.util.Map;

/* renamed from: X.2mr  reason: invalid class name and case insensitive filesystem */
public final class C59772mr {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Map A06;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C59772mr) && C18070vi.A18(this.A06, ((C59772mr) obj).A06));
    }

    public int hashCode() {
        return this.A06.hashCode();
    }

    public C59772mr(Map map) {
        this.A06 = map;
        this.A05 = C17880vN.A0s("title", map);
        this.A00 = C17880vN.A0s("body", map);
        Object obj = map.get("btn_primary_text");
        C17960vV.A07(obj);
        C18070vi.A0X(obj);
        this.A02 = (String) obj;
        Object obj2 = map.get("btn_primary_url");
        C17960vV.A07(obj2);
        C18070vi.A0X(obj2);
        this.A01 = (String) obj2;
        this.A04 = C17880vN.A0s("btn_secondary_text", map);
        this.A03 = C17880vN.A0s("btn_secondary_url", map);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CustomBlockScreenData(customBlockScreenData=");
        return AnonymousClass001.A1F(this.A06, A10);
    }
}
