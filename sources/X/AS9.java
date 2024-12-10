package X;

import java.util.Collection;
import java.util.List;

public final /* synthetic */ class AS9 implements B82 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ A5U A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ AnonymousClass1OS A03;

    public final void Bju(C185899dK r7, Short sh, String str, boolean z) {
        A5U a5u = this.A01;
        String str2 = this.A02;
        int i = this.A00;
        AnonymousClass1OS r2 = this.A03;
        if (z) {
            C20081A6h.A01(AnonymousClass8BR.A0V(a5u.A03), str2.hashCode());
        } else {
            C20081A6h.A03(a5u.A04, sh, i);
        }
        if (r7 != null) {
            List<C195709tm> list = r7.A02;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (C195709tm r0 : list) {
                    if (C18070vi.A18(r0.A04, str2)) {
                        r2.invoke(true, (Object) null);
                        return;
                    }
                }
            }
            str = "extensions-integrity-check-failed";
        }
        r2.invoke(false, str);
    }

    public /* synthetic */ AS9(A5U a5u, String str, AnonymousClass1OS r3, int i) {
        this.A01 = a5u;
        this.A02 = str;
        this.A00 = i;
        this.A03 = r3;
    }
}
