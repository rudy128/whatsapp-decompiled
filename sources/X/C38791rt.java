package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1rt  reason: invalid class name and case insensitive filesystem */
public final class C38791rt {
    public final C18030ve A00;
    public final ConcurrentHashMap A01 = new ConcurrentHashMap();
    public final C18000vb A02;

    public C38791rt(C18000vb r2, C18030ve r3) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r2, 2);
        this.A00 = r3;
        this.A02 = r2;
    }

    public final boolean A00(C38801ru r5) {
        C18040vf r0;
        Set A12;
        if (r5.firstAccessValue) {
            ConcurrentHashMap concurrentHashMap = this.A01;
            if (concurrentHashMap.contains(Integer.valueOf(r5.id))) {
                A12 = (Set) concurrentHashMap.get(Integer.valueOf(r5.id));
                if (A12 == null) {
                    A12 = C25511Om.A00;
                }
                return A12.contains(this.A02.A05());
            }
        }
        boolean z = r5.firstAccessValue;
        C18030ve r2 = this.A00;
        int i = r5.id;
        if (z) {
            r0 = C18040vf.A01;
        } else {
            r0 = C18040vf.A02;
        }
        String A012 = C18020vd.A01(r0, r2, i);
        C18070vi.A0b(A012);
        List<String> A0R = AnonymousClass1YF.A0R(A012, new char[]{','});
        ArrayList arrayList = new ArrayList(C29351c6.A0C(A0R, 10));
        for (String A0G : A0R) {
            arrayList.add(AnonymousClass1YF.A0G(A0G).toString());
        }
        A12 = C29431cG.A12(arrayList);
        this.A01.put(Integer.valueOf(r5.id), A12);
        return A12.contains(this.A02.A05());
    }
}
