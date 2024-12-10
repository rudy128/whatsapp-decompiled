package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.9ko  reason: invalid class name and case insensitive filesystem */
public final class C190359ko {
    public final C19880zA A00;
    public final C19880zA A01;

    public void A00(AnonymousClass86X r16, Object obj, String str, String str2, String str3, String str4, List list, List list2, Map map) {
        Object obj2 = obj;
        List list3 = list;
        boolean A17 = C18070vi.A17(obj2, list3);
        String str5 = str;
        C18070vi.A0d(str5, 2);
        String str6 = str2;
        String str7 = str3;
        List list4 = list2;
        C72473Md.A1M(list4, str6, str7, 3);
        String str8 = str4;
        Map map2 = map;
        C18070vi.A0l(map2, str8);
        AnonymousClass86X r6 = r16;
        if (str5.equals("MV4B")) {
            C19880zA r1 = this.A00;
            if (r1.A07()) {
                ((C190359ko) r1.A03()).A00(r6, obj2, str5, str6, str7, str8, list3, list4, map2);
            }
        }
        String[] strArr = new String[2];
        strArr[0] = "WAMOSUB";
        if (C18070vi.A0O("GEN_AI_SUBS", strArr, A17 ? 1 : 0).contains(str5)) {
            C19880zA r12 = this.A01;
            if (r12.A07()) {
                ((C190359ko) r12.A03()).A00(r6, obj2, str5, str6, str7, str8, list3, list4, map2);
            }
        }
    }

    public C190359ko(C19880zA r1, C19880zA r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
