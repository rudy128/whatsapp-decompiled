package X;

import java.util.Collection;
import java.util.Set;

/* renamed from: X.3mF  reason: invalid class name and case insensitive filesystem */
public final class C75983mF extends AnonymousClass4US {
    public final AnonymousClass11S A00;
    public final AnonymousClass1MW A01;
    public final C178119Bw A02;
    public final C18100vl A03;

    public Collection A00() {
        if (C72463Mc.A0D(this.A03) == ((Set) this.A02.getValue()).size()) {
            return C18460wS.A00;
        }
        return super.A00();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75983mF(AnonymousClass11S r2, AnonymousClass1M9 r3, C24921Me r4, AnonymousClass1MW r5, C178119Bw r6) {
        super(r4, r6.A0C);
        C18070vi.A0j(r4, r3);
        C18070vi.A0g(r2, 4, r5);
        this.A02 = r6;
        this.A00 = r2;
        this.A01 = r5;
        this.A03 = AnonymousClass1DF.A01(new AnonymousClass5PH(this, r3, r4));
    }
}
