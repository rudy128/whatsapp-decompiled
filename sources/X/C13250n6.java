package X;

import androidx.compose.foundation.layout.UnspecifiedConstraintsElement;

/* renamed from: X.0n6  reason: invalid class name and case insensitive filesystem */
public final class C13250n6 extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C36001nB $content;
    public final /* synthetic */ AnonymousClass0tB $contentPadding;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13250n6(AnonymousClass0tB r2, C36001nB r3, int i) {
        super(2);
        this.$contentPadding = r2;
        this.$content = r3;
        this.$$dirty = i;
    }

    public final void A00(C17130tn r12, int i) {
        if ((i & 11) != 2 || !r12.BZO()) {
            C17090tj A02 = AnonymousClass0Q7.A02(this.$contentPadding, new UnspecifiedConstraintsElement(58.0f, 40.0f));
            C17220uJ r2 = AnonymousClass0OB.A02;
            C16340s6 r1 = AnonymousClass0MX.A03;
            C36001nB r3 = this.$content;
            int i2 = ((this.$$dirty >> 18) & 7168) | 432;
            r12.COB(693286680);
            C16870tM A00 = C03930Le.A00(r2, r12, r1);
            Object A1B = AnonymousClass001.A1B(r12);
            Object A0t = AnonymousClass000.A0t(r12);
            Object BFh = r12.BFh(AnonymousClass0OD.A0B);
            C18090vk A002 = C05030Qc.A00();
            AnonymousClass04D A003 = AnonymousClass0LO.A00(A02);
            int A0O = AnonymousClass001.A0O(r12, (i2 << 3) & 112);
            AnonymousClass0VR r22 = (AnonymousClass0VR) r12;
            if (r22.A0K) {
                r12.BHe(A002);
            } else {
                r12.CRc();
            }
            r22.A0O = false;
            AnonymousClass0EM.A00(r12, A00, C05030Qc.A04());
            AnonymousClass0EM.A00(r12, A1B, C05030Qc.A02());
            AnonymousClass0EM.A00(r12, A0t, C05030Qc.A03());
            AnonymousClass0EM.A00(r12, BFh, C05030Qc.A07());
            A003.invoke(AnonymousClass0OT.A00(r12), r12, AnonymousClass000.A0q(A0O));
            r12.COB(2058660585);
            r3.invoke(C03940Lf.A00, r12, Integer.valueOf(((i2 >> 6) & 112) | 6));
            AnonymousClass0VR.A0K(r22);
            return;
        }
        r12.CNR();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00((C17130tn) obj, AnonymousClass000.A0M(obj2));
        return C27621Wu.A00;
    }
}
