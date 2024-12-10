package X;

import java.lang.ref.Reference;

/* renamed from: X.7KG  reason: invalid class name */
public class AnonymousClass7KG implements C1601087d {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public AnonymousClass7KG(Object obj, Object obj2, int i, boolean z) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = z;
    }

    public final void BzB(Integer num, boolean z) {
        if (this.A00 != 0) {
            AnonymousClass749.A05((AnonymousClass1FU) this.A02, (AnonymousClass749) this.A01, this.A03);
            return;
        }
        AnonymousClass749 r2 = (AnonymousClass749) this.A02;
        boolean z2 = this.A03;
        AnonymousClass1FU r0 = (AnonymousClass1FU) C108975cc.A0Z((Reference) this.A01);
        if (r0 != null) {
            AnonymousClass749.A05(r0, r2, z2);
        }
    }
}
