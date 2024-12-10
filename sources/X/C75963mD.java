package X;

import java.util.Collection;
import java.util.Set;

/* renamed from: X.3mD  reason: invalid class name and case insensitive filesystem */
public final class C75963mD extends AnonymousClass4US {
    public final AnonymousClass11S A00;
    public final C178119Bw A01;
    public final C18100vl A02;

    public Collection A00() {
        if (((Set) this.A02.getValue()).isEmpty()) {
            return (Collection) this.A02.getValue();
        }
        return super.A00();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75963mD(AnonymousClass11S r2, AnonymousClass1M9 r3, C24921Me r4, C178119Bw r5) {
        super(r4, r5.A0C);
        C18070vi.A0j(r4, r3);
        C18070vi.A0d(r2, 4);
        this.A01 = r5;
        this.A00 = r2;
        this.A02 = AnonymousClass1DF.A01(new AnonymousClass5PG(this, r3, r4));
    }
}
