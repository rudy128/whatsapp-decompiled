package X;

import java.util.List;

/* renamed from: X.Ald  reason: case insensitive filesystem */
public class C21530Ald implements C18080vj, C22821Di {
    public final int A00;
    public final Object A01;
    public final String A02;

    public final Object invoke(Object obj) {
        Object obj2 = obj;
        if (this.A00 != 0) {
            String str = this.A02;
            C22821Di r3 = (C22821Di) this.A01;
            AnonymousClass9XA r4 = (AnonymousClass9XA) obj2;
            C18070vi.A0d(r4, 2);
            if (r4.A00) {
                AnonymousClass8lT r42 = (AnonymousClass8lT) r4;
                r3.invoke(new AnonymousClass8lS((List) AnonymousClass8BV.A0m(str, r42.A01), r42.A00));
            } else {
                r3.invoke(r4);
            }
        } else {
            C168648jP r32 = (C168648jP) this.A01;
            String str2 = this.A02;
            C194359rb r43 = (C194359rb) obj2;
            if (r43 == null) {
                AnonymousClass00H r0 = r32.A0u;
                if (r0 != null) {
                    C199419zy r2 = (C199419zy) r0.get();
                    C199419zy.A00(r2, new B0X(r2, AnonymousClass000.A1W(r32.A0K)));
                } else {
                    C18070vi.A11("openVariantsPageLogger");
                    throw null;
                }
            }
            AnonymousClass8BW.A0F(r32).A0G(new C195469tO(r43, r32.A4e(), Integer.valueOf(r32.A03), Integer.valueOf(r32.A00), str2, r32.A4c().A03, false));
        }
        return C27621Wu.A00;
    }

    public C21530Ald(int i, String str, Object obj) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }
}
