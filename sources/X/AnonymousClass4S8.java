package X;

import com.whatsapp.areffects.viewmodel.session.ArEffectSession;
import com.whatsapp.areffects.viewmodel.viewstate.ArEffectsTrayViewState$1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.4S8  reason: invalid class name */
public final class AnonymousClass4S8 {
    public final C18100vl A00;
    public final AnonymousClass1G4 A01;
    public final AnonymousClass1G4 A02;
    public final AnonymousClass1G4 A03 = AnonymousClass3MW.A18(AnonymousClass4D3.HAVE_NOT_LOADED);
    public final AnonymousClass1G4 A04;

    public AnonymousClass4S8(AnonymousClass4DE r17, ArEffectSession arEffectSession, Integer num, AnonymousClass1OX r20, AnonymousClass1G1 r21, long j) {
        AnonymousClass4DE r5 = r17;
        AnonymousClass1G1 r13 = r21;
        AnonymousClass3Ma.A1O(r5, 1, r13);
        Integer num2 = num;
        C18070vi.A0d(num2, 5);
        AnonymousClass1OX r6 = r20;
        C18070vi.A0d(r6, 6);
        C25411Oc r0 = new C25411Oc(1, 5);
        ArrayList A0D = C29351c6.A0D(r0);
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            ((AnonymousClass20T) it).A00();
            A0D.add(C92444hJ.A00);
        }
        this.A02 = AnonymousClass3MW.A18(A0D);
        C92444hJ r2 = C92444hJ.A00;
        this.A01 = AnonymousClass3MW.A18(new C86764Sy(r2, false));
        this.A04 = C34071js.A00(r2);
        ArEffectSession arEffectSession2 = arEffectSession;
        this.A00 = AnonymousClass1DF.A00(num2, new C99114sI(r5, r6, arEffectSession2, this, 2));
        AnonymousClass3MX.A1Q(new ArEffectsTrayViewState$1(arEffectSession2, this, (C30391dr) null, r13, j), r6);
    }

    public final void A00(boolean z) {
        AnonymousClass1G4 r3 = this.A01;
        if (!(((C86764Sy) r3.getValue()).A00 instanceof C92434hI) || !(this.A04.getValue() instanceof C92434hI)) {
            for (C106535Wf r1 : (Iterable) this.A02.getValue()) {
                if (r1 instanceof C92434hI) {
                    r3.setValue(new C86764Sy(r1, z));
                    this.A04.setValue(r1);
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    public final boolean A01() {
        Iterable<C106535Wf> iterable = (Iterable) this.A02.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (C106535Wf r1 : iterable) {
                if ((r1 instanceof C92424hH) && ((C92424hH) r1).A00.BUq().BYG()) {
                    return true;
                }
            }
        }
        return false;
    }
}
