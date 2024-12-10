package X;

/* renamed from: X.0nY  reason: invalid class name and case insensitive filesystem */
public final class C13530nY extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass20G $content;
    public final /* synthetic */ C06820Zu $currentlyVisible;
    public final /* synthetic */ AnonymousClass0U5 $rootScope;
    public final /* synthetic */ Object $stateForContent;
    public final /* synthetic */ AnonymousClass0Q5 $this_AnimatedContent;
    public final /* synthetic */ C22821Di $transitionSpec;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13530nY(AnonymousClass0U5 r2, AnonymousClass0Q5 r3, C06820Zu r4, Object obj, C22821Di r6, AnonymousClass20G r7) {
        super(2);
        this.$this_AnimatedContent = r3;
        this.$stateForContent = obj;
        this.$transitionSpec = r6;
        this.$rootScope = r2;
        this.$currentlyVisible = r4;
        this.$content = r7;
    }

    /* JADX WARNING: type inference failed for: r6v4, types: [X.0XL, java.lang.Object] */
    public final void A00(C17130tn r20, int i) {
        C17130tn r12 = r20;
        if ((i & 11) != 2 || !r12.BZO()) {
            C22821Di r2 = this.$transitionSpec;
            AnonymousClass0U5 r0 = this.$rootScope;
            Object A0u = AnonymousClass000.A0u(r12, -492369756);
            Object obj = AnonymousClass0MH.A00;
            if (A0u == obj) {
                A0u = (AnonymousClass0PL) r2.invoke(r0);
                r12.CRH(A0u);
            }
            AnonymousClass0VR r22 = (AnonymousClass0VR) r12;
            AnonymousClass0VR.A0R(r22, false);
            AnonymousClass0PL r5 = (AnonymousClass0PL) A0u;
            Boolean valueOf = Boolean.valueOf(C18070vi.A18(((C16580sf) this.$this_AnimatedContent.A05.getValue()).BaC(), this.$stateForContent));
            AnonymousClass0Q5 r9 = this.$this_AnimatedContent;
            Object obj2 = this.$stateForContent;
            C22821Di r7 = this.$transitionSpec;
            AnonymousClass0U5 r4 = this.$rootScope;
            boolean A1X = AnonymousClass001.A1X(r12, valueOf);
            Object CER = r12.CER();
            if (A1X || CER == obj) {
                if (C18070vi.A18(((C16580sf) r9.A05.getValue()).BaC(), obj2)) {
                    CER = AnonymousClass0KL.A00;
                } else {
                    CER = ((AnonymousClass0PL) r7.invoke(r4)).A02;
                }
                r12.CRH(CER);
            }
            AnonymousClass0VR.A0R(r22, false);
            AnonymousClass0KL r10 = (AnonymousClass0KL) CER;
            Object obj3 = this.$stateForContent;
            AnonymousClass0Q5 r02 = this.$this_AnimatedContent;
            Object A0u2 = AnonymousClass000.A0u(r12, -492369756);
            Object obj4 = A0u2;
            if (A0u2 == obj) {
                boolean A18 = C18070vi.A18(obj3, r02.A06.getValue());
                ? obj5 = new Object();
                obj5.A00 = A18;
                r22.A0c(obj5);
                obj4 = obj5;
            }
            AnonymousClass0VR.A0R(r22, false);
            AnonymousClass0XL r6 = (AnonymousClass0XL) obj4;
            AnonymousClass0KK r92 = r5.A01;
            C17090tj A00 = C02620Es.A00(C17090tj.A00, new C14760pX(r5));
            r6.A00 = C18070vi.A18(this.$stateForContent, this.$this_AnimatedContent.A06.getValue());
            C17090tj CP5 = A00.CP5(r6);
            AnonymousClass0Q5 r11 = this.$this_AnimatedContent;
            C10510iS r14 = new C10510iS(this.$stateForContent);
            boolean A1V = AnonymousClass000.A1V(r12, r10, 841088387);
            Object CER2 = r12.CER();
            if (A1V || CER2 == obj) {
                CER2 = new C12680m9(r10);
                r22.A0c(CER2);
            }
            AnonymousClass0VR.A0R(r22, false);
            C03850Kw.A01(r92, r10, r11, r12, CP5, r14, (AnonymousClass1OS) CER2, AnonymousClass0LC.A00(r12, new C14850pg(this.$rootScope, this.$currentlyVisible, this.$stateForContent, this.$content), -616195562), 12582912, 64);
            return;
        }
        r12.CNR();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00((C17130tn) obj, AnonymousClass000.A0M(obj2));
        return C27621Wu.A00;
    }
}
