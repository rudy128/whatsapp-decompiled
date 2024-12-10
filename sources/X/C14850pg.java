package X;

import java.util.Map;

/* renamed from: X.0pg  reason: invalid class name and case insensitive filesystem */
public final class C14850pg extends AnonymousClass11G implements C36001nB {
    public final /* synthetic */ AnonymousClass20G $content;
    public final /* synthetic */ C06820Zu $currentlyVisible;
    public final /* synthetic */ AnonymousClass0U5 $rootScope;
    public final /* synthetic */ Object $stateForContent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14850pg(AnonymousClass0U5 r2, C06820Zu r3, Object obj, AnonymousClass20G r5) {
        super(3);
        this.$rootScope = r2;
        this.$stateForContent = obj;
        this.$currentlyVisible = r3;
        this.$content = r5;
    }

    public final void A00(C15620qv r5, C17130tn r6, int i) {
        if ((i & 14) == 0) {
            i |= AnonymousClass001.A0Q(r6, r5);
        }
        if ((i & 91) != 18 || !r6.BZO()) {
            AnonymousClass0QC.A03(r6, r5, new C10380iF(this.$rootScope, this.$currentlyVisible, this.$stateForContent));
            Map map = this.$rootScope.A02;
            Object obj = this.$stateForContent;
            C18070vi.A0z(r5, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
            map.put(obj, ((AnonymousClass0To) r5).A01);
            Object A1A = AnonymousClass001.A1A(r6);
            if (A1A == AnonymousClass0MH.A00) {
                A1A = new AnonymousClass0Tn(r5);
                AnonymousClass0VR.A0V(r6, A1A);
            }
            AnonymousClass0VR.A0R((AnonymousClass0VR) r6, false);
            this.$content.invoke(A1A, this.$stateForContent, r6, 0);
            return;
        }
        r6.CNR();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        A00((C15620qv) obj, (C17130tn) obj2, AnonymousClass000.A0M(obj3));
        return C27621Wu.A00;
    }
}
