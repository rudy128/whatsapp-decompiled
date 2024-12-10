package X;

/* renamed from: X.0pj  reason: invalid class name and case insensitive filesystem */
public final class C14880pj extends AnonymousClass11G implements C36001nB {
    public final /* synthetic */ C16300s2 $currentItemProvider;
    public final /* synthetic */ AnonymousClass1OS $measurePolicy;
    public final /* synthetic */ C17090tj $modifier;
    public final /* synthetic */ AnonymousClass0H3 $prefetchState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14880pj(AnonymousClass0H3 r2, C16300s2 r3, C17090tj r4, AnonymousClass1OS r5) {
        super(3);
        this.$prefetchState = r2;
        this.$modifier = r4;
        this.$measurePolicy = r5;
        this.$currentItemProvider = r3;
    }

    public final void A00(C17130tn r12, C16670so r13) {
        C16300s2 r4 = this.$currentItemProvider;
        C17130tn r5 = r12;
        Object A0u = AnonymousClass000.A0u(r12, -492369756);
        Object obj = AnonymousClass0MH.A00;
        if (A0u == obj) {
            A0u = new AnonymousClass0Jo(r13, new C08500fC(r4));
            AnonymousClass0VR.A0V(r12, A0u);
        }
        AnonymousClass0VR r42 = (AnonymousClass0VR) r5;
        AnonymousClass0VR.A0R(r42, false);
        AnonymousClass0Jo r3 = (AnonymousClass0Jo) A0u;
        Object A0u2 = AnonymousClass000.A0u(r12, -492369756);
        if (A0u2 == obj) {
            A0u2 = new AnonymousClass0NO(new AnonymousClass0XR(r3));
            r42.A0c(A0u2);
        }
        AnonymousClass0VR.A0R(r42, false);
        AnonymousClass0NO r7 = (AnonymousClass0NO) A0u2;
        AnonymousClass0H3 r1 = this.$prefetchState;
        r12.COB(-1523807258);
        if (r1 != null) {
            C02350Dr.A00(r3, this.$prefetchState, r12, r7, 576);
        }
        AnonymousClass0VR.A0R(r42, false);
        C17090tj r6 = this.$modifier;
        AnonymousClass1OS r14 = this.$measurePolicy;
        boolean A1Y = AnonymousClass001.A1Y(r12, r3, r14);
        Object CER = r12.CER();
        if (A1Y || CER == obj) {
            CER = new C13100mp(r3, r14);
            r42.A0c(CER);
        }
        AnonymousClass0VR.A0R(r42, false);
        C04590Nz.A00(r5, r6, r7, (AnonymousClass1OS) CER, 8, 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        A00(AnonymousClass000.A0b(obj2, obj3), (C16670so) obj);
        return C27621Wu.A00;
    }
}
