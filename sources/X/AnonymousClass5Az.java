package X;

import com.whatsapp.areffects.util.ArEffectsGatingUtil;
import java.util.LinkedHashSet;

/* renamed from: X.5Az  reason: invalid class name */
public final class AnonymousClass5Az extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ ArEffectsGatingUtil this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5Az(ArEffectsGatingUtil arEffectsGatingUtil) {
        super(0);
        this.this$0 = arEffectsGatingUtil;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LinkedHashSet A14 = C17880vN.A14();
        ArEffectsGatingUtil arEffectsGatingUtil = this.this$0;
        C18030ve r1 = arEffectsGatingUtil.A00;
        C18040vf r3 = C18040vf.A02;
        if (C18020vd.A05(r3, r1, 9363)) {
            A14.add(AnonymousClass4DE.LOW_LIGHT);
        }
        C18030ve r12 = arEffectsGatingUtil.A00;
        if (C18020vd.A05(r3, r12, 9368)) {
            A14.add(AnonymousClass4DE.TOUCH_UP);
        }
        if (C18020vd.A05(r3, r12, 9367)) {
            A14.add(AnonymousClass4DE.FILTER);
        }
        if (C18020vd.A05(r3, r12, 9364)) {
            A14.add(AnonymousClass4DE.BACKGROUND);
        }
        if (C18020vd.A05(r3, r12, 9365)) {
            A14.add(AnonymousClass4DE.FUN_EFFECT);
        }
        return A14;
    }
}
