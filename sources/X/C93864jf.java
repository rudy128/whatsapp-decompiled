package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.areffects.tray.ArEffectsTrayFragment;
import com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel;
import com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel$onItemSelected$1;
import com.whatsapp.areffects.viewmodel.session.ArEffectSession;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.4jf  reason: invalid class name and case insensitive filesystem */
public final class C93864jf implements E8D {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass3WK A01;
    public final /* synthetic */ ArEffectsTrayFragment A02;

    public C93864jf(View view, AnonymousClass3WK r2, ArEffectsTrayFragment arEffectsTrayFragment) {
        this.A01 = r2;
        this.A02 = arEffectsTrayFragment;
        this.A00 = view;
    }

    public void Bo5(int i, boolean z, boolean z2) {
        C106535Wf r0;
        AnonymousClass4S8 A0P;
        C86764Sy r02;
        if (!z) {
            C106535Wf r3 = (C106535Wf) this.A01.A00.A02.get(i);
            if (r3 instanceof C108805cK) {
                ArEffectsTrayFragment arEffectsTrayFragment = this.A02;
                BaseArEffectsViewModel A0Y = AnonymousClass3MX.A0Y(arEffectsTrayFragment.A05);
                Object value = arEffectsTrayFragment.A04.getValue();
                C18070vi.A0h(value, r3);
                C18100vl r1 = A0Y.A0J;
                AnonymousClass4S8 A0P2 = C72473Md.A0P(value, r1);
                if (A0P2 == null || (r02 = (C86764Sy) A0P2.A01.getValue()) == null) {
                    r0 = null;
                } else {
                    r0 = r02.A00;
                }
                if ((!C18070vi.A18(r0, r3) || (r3 instanceof C92434hI)) && (A0P = C72473Md.A0P(value, r1)) != null) {
                    A0P.A01.setValue(new C86764Sy(r3, false));
                }
            } else {
                return;
            }
        }
        if (z2) {
            View view = this.A00;
            AnonymousClass11C r03 = this.A02.A01;
            if (r03 != null) {
                AnonymousClass4a5.A01(view, r03);
            } else {
                AnonymousClass3MW.A1N();
                throw null;
            }
        }
    }

    public void C4x(int i) {
        Object obj;
        Object value;
        ArrayList A0m;
        C106535Wf r5 = (C106535Wf) this.A01.A00.A02.get(i);
        if (r5 instanceof C108805cK) {
            ArEffectsTrayFragment arEffectsTrayFragment = this.A02;
            BaseArEffectsViewModel A0Y = AnonymousClass3MX.A0Y(arEffectsTrayFragment.A05);
            Context A14 = arEffectsTrayFragment.A14();
            AnonymousClass4DE r9 = (AnonymousClass4DE) arEffectsTrayFragment.A04.getValue();
            C108805cK r52 = (C108805cK) r5;
            C18070vi.A0j(r9, r52);
            C18100vl r6 = A0Y.A0J;
            AnonymousClass4S8 A0P = C72473Md.A0P(r9, r6);
            if (A0P != null) {
                obj = A0P.A04.getValue();
            } else {
                obj = null;
            }
            if (!C18070vi.A18(obj, r52)) {
                boolean z = r52 instanceof C92434hI;
                AnonymousClass1G4 r2 = ((C85624Oc) A0Y.A0I.getValue()).A05;
                do {
                    value = r2.getValue();
                    A0m = C29431cG.A0m((Collection) value);
                    A0m.remove(r9);
                    if (!z) {
                        A0m.add(r9);
                    }
                } while (!r2.BFK(value, A0m));
                AnonymousClass4S8 A0P2 = C72473Md.A0P(r9, r6);
                if (A0P2 != null) {
                    A0P2.A04.setValue(r52);
                }
                if (r52 instanceof C92424hH) {
                    C107855aj r10 = ((C92424hH) r52).A00;
                    ArEffectSession A0V = A0Y.A0V(r9);
                    if (A0V != null) {
                        C106575Wj A012 = ArEffectSession.A01(A0V);
                        if ((A012 instanceof C108335bX) && C83524Fl.A00(r9, r10, (C108335bX) A012)) {
                            return;
                        }
                    }
                    A0Y.A0d(A14, r9, r10, r10.BUq().BUT(), false);
                    return;
                }
                AnonymousClass3MX.A1Q(new BaseArEffectsViewModel$onItemSelected$1(r9, A0Y, (C30391dr) null), A0Y.A0N);
            }
        }
    }
}
