package X;

import com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4Pe  reason: invalid class name and case insensitive filesystem */
public final class C85904Pe {
    public final /* synthetic */ BaseArEffectsViewModel A00;

    public C85904Pe(BaseArEffectsViewModel baseArEffectsViewModel) {
        this.A00 = baseArEffectsViewModel;
    }

    public void A00(AnonymousClass4DE r9, AnonymousClass4ZN r10) {
        Object value;
        int A01;
        ArrayList A13;
        C86214Qt r6 = (C86214Qt) this.A00.A0B.getValue();
        AnonymousClass1G4 A17 = AnonymousClass3MW.A17(r6.A01);
        do {
            value = A17.getValue();
            A01 = AnonymousClass4ZO.A00.A01(r9, r6.A00);
            A13 = AnonymousClass000.A13();
            for (Object next : (List) value) {
                if (((C86744Sw) next).A00 != A01) {
                    A13.add(next);
                }
            }
        } while (!A17.BFK(value, C29431cG.A0k(A13, C18070vi.A0M(new C86744Sw(r10, A01)))));
    }
}
