package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.Cbr  reason: case insensitive filesystem */
public final class C25252Cbr {
    public Map A00;
    public final CTT A01;
    public final String A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25252Cbr) {
                C25252Cbr cbr = (C25252Cbr) obj;
                if (!C18070vi.A18(this.A02, cbr.A02) || !C18070vi.A18(this.A03, cbr.A03) || !C18070vi.A18(this.A01, cbr.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Map A00() {
        LinkedHashMap linkedHashMap;
        Map map = this.A00;
        if (map != null) {
            return map;
        }
        String str = this.A03;
        if (!AnonymousClass1YF.A0Y(str, "root", false)) {
            linkedHashMap = new LinkedHashMap(AnonymousClass8BX.A00(r4));
            for (Object obj : AnonymousClass1YF.A0S(str, new String[]{","}, 0).toArray(new String[0])) {
                List A0S = AnonymousClass1YF.A0S((String) obj, new String[]{":"}, 0);
                linkedHashMap.put(AnonymousClass1YF.A0I(C17880vN.A0w(A0S, 0)), AnonymousClass1YF.A0I(C17880vN.A0w(A0S, 1)));
            }
        } else {
            String[] A1Y = C17880vN.A1Y();
            A1Y[0] = ",";
            linkedHashMap = new LinkedHashMap(AnonymousClass8BX.A00(r4));
            for (Object obj2 : AnonymousClass1YF.A0S(str, A1Y, 0).toArray(new String[0])) {
                String str2 = (String) obj2;
                int A0F = AnonymousClass1YF.A0F(str2, ":", 0, false);
                linkedHashMap.put(AnonymousClass1YF.A0I(C108955ca.A0q(0, A0F, str2)), AnonymousClass1YF.A0I(C108955ca.A0q(A0F + 1, str2.length(), str2)));
            }
        }
        TreeMap treeMap = new TreeMap(linkedHashMap);
        this.A00 = treeMap;
        return treeMap;
    }

    public int hashCode() {
        return C17890vO.A02(this.A03, C17880vN.A03(this.A02)) + AnonymousClass001.A0k(this.A01);
    }

    public C25252Cbr(CTT ctt, String str, String str2) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = ctt;
        if (AnonymousClass1YF.A0T(str2)) {
            throw AnonymousClass000.A0k("invalid config");
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LiveEditingPlayerRequest(requestId=");
        A10.append(this.A02);
        A10.append(", serializedConfig=");
        A10.append(this.A03);
        A10.append(", paramatricConfigDataModel=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
