package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.AWa  reason: case insensitive filesystem */
public final class C20720AWa implements BB1 {
    public final /* synthetic */ AnonymousClass96o A00;

    public C20720AWa(AnonymousClass96o r1) {
        this.A00 = r1;
    }

    public void BtD(String str, Throwable th) {
        int i = 9;
        if (th instanceof C175048xu) {
            i = 8;
        }
        C20877Aat aat = new C20877Aat(i);
        AnonymousClass96o r3 = this.A00;
        if (C18070vi.A18(r3.A01, "all_options")) {
            List<A18> list = r3.A01().A07;
            C18070vi.A0X(list);
            LinkedHashMap linkedHashMap = new LinkedHashMap(C200510q.A00(list));
            for (A18 a18 : list) {
                String str2 = a18.A02;
                if (str2 == null) {
                    str2 = "";
                }
                linkedHashMap.put(str2, C18460wS.A00);
            }
            r3.A02.CGF(new C21456AkN(r3, aat, linkedHashMap, str, 39));
            return;
        }
        C21433Ak0.A00(r3.A02, r3, aat, 22);
    }

    public void C7h(String str, Map map) {
        AnonymousClass96o r4 = this.A00;
        String str2 = str;
        if (C18070vi.A18(str, r4.A01)) {
            List<A18> list = r4.A01().A07;
            C18070vi.A0X(list);
            LinkedHashMap A08 = AnonymousClass1D7.A08(map);
            if (C18070vi.A18(str, "all_options")) {
                ArrayList A13 = AnonymousClass000.A13();
                for (A18 a18 : list) {
                    String str3 = a18.A02;
                    if (str3 != null) {
                        A13.add(str3);
                    }
                }
                ArrayList<Object> A132 = AnonymousClass000.A13();
                for (Object next : A13) {
                    AnonymousClass3MZ.A1V(next, A132, A08.containsKey(next) ? 1 : 0);
                }
                for (Object put : A132) {
                    A08.put(put, C18460wS.A00);
                }
            }
            r4.A02.CGF(new C21456AkN(r4, (Object) null, A08, str2, 39));
        }
    }
}
