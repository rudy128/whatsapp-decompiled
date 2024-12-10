package X;

import android.content.Context;
import com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel;
import com.whatsapp.areffects.viewmodel.session.ArEffectSession;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.5Ap  reason: invalid class name */
public final /* synthetic */ class AnonymousClass5Ap extends AnonymousClass1JJ implements AnonymousClass20G {
    public AnonymousClass5Ap(Object obj) {
        super(4, obj, BaseArEffectsViewModel.class, "retryEffect", "retryEffect(Landroid/content/Context;Lcom/whatsapp/areffects/model/effect/ArEffect;Lcom/whatsapp/areffects/model/params/EnableArEffectParams;Z)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Context context = (Context) obj;
        C107855aj r5 = (C107855aj) obj2;
        C92384hD r11 = (C92384hD) obj3;
        boolean A1Y = AnonymousClass000.A1Y(obj4);
        C18070vi.A0n(context, r5, r11);
        BaseArEffectsViewModel baseArEffectsViewModel = (BaseArEffectsViewModel) this.receiver;
        Collection A0g = C17890vO.A0g(baseArEffectsViewModel.A0G);
        if (A0g == null || !A0g.isEmpty()) {
            Iterator it = A0g.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (ArEffectSession.A03(it) instanceof C92594ha) {
                        break;
                    }
                } else {
                    break;
                }
            }
            return C27621Wu.A00;
        }
        baseArEffectsViewModel.A0d(context, r11.A00, r5, r11.A03, A1Y);
        return C27621Wu.A00;
    }
}
