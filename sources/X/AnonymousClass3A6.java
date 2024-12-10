package X;

import java.util.Iterator;

/* renamed from: X.3A6  reason: invalid class name */
public final class AnonymousClass3A6 implements C72303Lk {
    public final C22461Ab A00;
    public final C19830z4 A01;

    public /* synthetic */ void Blc() {
    }

    public void Bld() {
        C22461Ab r2 = this.A00;
        Iterator it = r2.A02().iterator();
        while (it.hasNext()) {
            r2.A04(C17880vN.A0v(it));
        }
        C17880vN.A1F(C19830z4.A00(this.A01), "report_unhealthy_module", true);
    }

    public AnonymousClass3A6(C22461Ab r1, C19830z4 r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
