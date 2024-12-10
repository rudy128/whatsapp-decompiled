package X;

import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.4gc  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C92014gc implements AnonymousClass5YU {
    public final /* synthetic */ C94604kt A00;

    public final void Br4(Set set) {
        C94604kt r2 = this.A00;
        AnonymousClass1BI A06 = AnonymousClass25A.A06(set);
        int size = set.size();
        Object[] A1a = AnonymousClass3MW.A1a();
        C17880vN.A1T(A1a, size, 0);
        String A0K = r2.A0J.getWhatsAppLocale().A0K(A1a, 2131755234, (long) size);
        String string = r2.A0J.getString(2131897303);
        C90084dV r3 = new C90084dV((Object) r2, (Object) A06, (Object) set, 49);
        if (((C23391Fw) r2.A0J.getLifecycle()).A02 != C23401Fx.DESTROYED) {
            C23520Bik A02 = C23520Bik.A02(r2.A0J.findViewById(16908298), A0K, 4000);
            A02.A0G(string, r3);
            A02.A0E(AnonymousClass3MZ.A02(C94604kt.A00(r2), C94604kt.A00(r2), 2130971311, 2131102579));
            ArrayList A13 = AnonymousClass000.A13();
            A13.add(r2.A0J.findViewById(2131433122));
            A13.add(r2.A0J.findViewById(2131434835));
            AnonymousClass11C systemServices = r2.A0J.getSystemServices();
            AnonymousClass1FY A002 = C94604kt.A00(r2);
            C18070vi.A0p(A13, systemServices, A002);
            C90594eK r32 = new C90594eK(A002, A02, systemServices, A13, false);
            r2.A0q = r32;
            r32.A07(new C98784ri((Object) r2, 37));
            r2.A0q.A02();
            r2.A0q.A03();
        }
    }

    public /* synthetic */ C92014gc(C94604kt r1) {
        this.A00 = r1;
    }
}
