package X;

import java.util.Collection;
import java.util.Set;

/* renamed from: X.3mE  reason: invalid class name and case insensitive filesystem */
public final class C75973mE extends AnonymousClass4US {
    public final AnonymousClass11S A00;
    public final AnonymousClass1MW A01;
    public final C18100vl A02;

    public Collection A00() {
        if (C72463Mc.A0D(this.A02) == ((Set) this.A02.getValue()).size()) {
            return C18460wS.A00;
        }
        return super.A00();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75973mE(AnonymousClass11S r2, AnonymousClass1M9 r3, C24921Me r4, AnonymousClass1MW r5, AnonymousClass1EC r6) {
        super(r4, r6);
        C18070vi.A0j(r4, r3);
        C18070vi.A0g(r2, 4, r5);
        this.A00 = r2;
        this.A01 = r5;
        this.A02 = AnonymousClass1DF.A01(new AnonymousClass5PZ(this, r3, r4, r6));
    }
}
