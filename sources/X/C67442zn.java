package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.2zn  reason: invalid class name and case insensitive filesystem */
public final class C67442zn implements AnonymousClass1L0 {
    public final AnonymousClass11S A00;
    public final AnonymousClass11E A01;
    public final C23641Hb A02;
    public final AnonymousClass18K A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;

    public /* synthetic */ void Bqg() {
    }

    public /* synthetic */ void Bqi() {
    }

    public void Bqh() {
        AnonymousClass016 r2;
        AnonymousClass11S r0 = this.A00;
        r0.A0I();
        if (r0.A00 != null) {
            this.A02.A01(this.A01.A04());
            C171888sR r22 = new C171888sR();
            Iterator A0h = C17890vO.A0h(this.A05);
            while (A0h.hasNext()) {
                ((C72143Ku) A0h.next()).C0w(r22);
            }
            this.A03.CC4(r22);
            C18020vd A0P = C17880vN.A0P(this.A04);
            Set<String> stringSet = A0P.A03.getStringSet("ab_props:sys:last_exposure_keys", (Set) null);
            if (stringSet == null) {
                r2 = new AnonymousClass016(0);
            } else {
                r2 = new AnonymousClass016((Collection) stringSet);
            }
            if (C18020vd.A05(C18040vf.A02, A0P, 10230)) {
                C61542pr.A00((C61542pr) A0P.A06.get(), r2, true);
            }
        }
    }

    public C67442zn(AnonymousClass11S r2, AnonymousClass11E r3, C23641Hb r4, AnonymousClass18K r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r2, r5, r3, r4, r6);
        C18070vi.A0d(r7, 6);
        this.A00 = r2;
        this.A03 = r5;
        this.A01 = r3;
        this.A02 = r4;
        this.A05 = r6;
        this.A04 = r7;
    }
}
