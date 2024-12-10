package X;

import java.util.Set;

/* renamed from: X.2zE  reason: invalid class name and case insensitive filesystem */
public final class C67092zE implements C1605388w {
    public final AnonymousClass1CJ A00;

    public C67092zE(AnonymousClass1CJ r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean BLC(AnonymousClass1BI r4) {
        boolean z;
        Boolean valueOf;
        C18070vi.A0d(r4, 0);
        Boolean A0i = AnonymousClass000.A0i();
        C29691ci r1 = (C29691ci) AnonymousClass1CJ.A01(this.A00).get(r4);
        if (r1 == null) {
            valueOf = null;
        } else {
            synchronized (r1) {
                z = r1.A0p;
            }
            valueOf = Boolean.valueOf(z);
        }
        return A0i.equals(valueOf);
    }

    public /* synthetic */ Set BYj() {
        return C25511Om.A00;
    }
}
