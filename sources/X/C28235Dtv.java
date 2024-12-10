package X;

import java.util.List;

/* renamed from: X.Dtv  reason: case insensitive filesystem */
public final class C28235Dtv extends AnonymousClass11G implements AnonymousClass20G {
    public final /* synthetic */ List $items;
    public final /* synthetic */ C22821Di $onContactClick$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28235Dtv(List list, C22821Di r3) {
        super(4);
        this.$items = list;
        this.$onContactClick$inlined = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int A0M = AnonymousClass000.A0M(obj2);
        C17130tn r4 = (C17130tn) obj3;
        int A0M2 = AnonymousClass000.A0M(obj4);
        if ((A0M2 & 14) == 0) {
            i = AnonymousClass001.A0Z(r4, obj) | A0M2;
        } else {
            i = A0M2;
        }
        if ((A0M2 & 112) == 0) {
            i |= AnonymousClass000.A0A(r4.BEd(A0M) ? 1 : 0);
        }
        if ((i & 731) != 146 || !r4.BZO()) {
            r4.COB(-1694634931);
            C25891Co2.A01(r4, (C17090tj) null, (AnonymousClass7EH) this.$items.get(A0M), this.$onContactClick$inlined, ((i & 14) >> 3) & 14, 4);
            AnonymousClass0VR.A0T(r4);
        } else {
            r4.CNR();
        }
        return C27621Wu.A00;
    }
}
