package X;

import com.whatsapp.areffects.ArEffectsTrayCollectionFragment;
import com.whatsapp.areffects.tab.ArEffectsTabLayout;

/* renamed from: X.4qK  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C97954qK implements AnonymousClass88D {
    public final /* synthetic */ C106525We A00;
    public final /* synthetic */ ArEffectsTabLayout A01;

    public final void C8M(int i, Integer num) {
        AnonymousClass4DE r3;
        C106525We r4 = this.A00;
        ArEffectsTabLayout arEffectsTabLayout = this.A01;
        if (num != null) {
            r3 = (AnonymousClass4DE) C29431cG.A0f(arEffectsTabLayout.A01, num.intValue());
        } else {
            r3 = null;
        }
        AnonymousClass4DE r2 = (AnonymousClass4DE) arEffectsTabLayout.A01.get(i);
        ArEffectsTrayCollectionFragment arEffectsTrayCollectionFragment = ((C92414hG) r4).A00;
        C18070vi.A0d(r2, 2);
        ArEffectsTrayCollectionFragment.A01(arEffectsTrayCollectionFragment, r3, r2, true);
    }

    public /* synthetic */ C97954qK(C106525We r1, ArEffectsTabLayout arEffectsTabLayout) {
        this.A00 = r1;
        this.A01 = arEffectsTabLayout;
    }
}
