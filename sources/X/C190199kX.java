package X;

import java.util.Map;

/* renamed from: X.9kX  reason: invalid class name and case insensitive filesystem */
public final class C190199kX {
    public final C195329tA A00;
    public final C19943A0a A01;

    public C190199kX(C19943A0a a0a, C195329tA r3) {
        C18070vi.A0d(a0a, 1);
        this.A01 = a0a;
        this.A00 = r3;
    }

    public void A00(String str, String str2, Map map, int i) {
        String A0s;
        String str3 = str;
        String str4 = str2;
        AnonymousClass3Ma.A1O(str, 0, str2);
        String str5 = "";
        if (map == null) {
            A0s = str5;
        } else {
            A0s = AnonymousClass8BU.A0s(map);
            C18070vi.A0b(A0s);
        }
        C195329tA r1 = this.A00;
        String A002 = C19943A0a.A00(Integer.valueOf(i));
        if (A002 != null) {
            str5 = A002;
        }
        r1.A01((C191549mm) null, AnonymousClass000.A0i(), str3, str5, str4, A0s);
    }
}
