package X;

import com.whatsapp.profile.viewmodel.UsernameNavigationViewModel;

public final class DXZ implements C36001nB {
    public final /* synthetic */ C16300s2 A00;
    public final /* synthetic */ UsernameNavigationViewModel A01;

    public DXZ(C16300s2 r1, UsernameNavigationViewModel usernameNavigationViewModel) {
        this.A00 = r1;
        this.A01 = usernameNavigationViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C17130tn r2 = (C17130tn) obj2;
        if ((AnonymousClass000.A0M(obj3) & 17) == 16 && r2.BZO()) {
            r2.CNR();
        } else if (((C25789Cm0) this.A00.getValue()).A02.length() > 0) {
            C04640Oe A002 = AnonymousClass0LS.A00(r2, 2131232294);
            String A003 = AnonymousClass0LT.A00(r2, 2131899418);
            UsernameNavigationViewModel usernameNavigationViewModel = this.A01;
            boolean A1V = BE7.A1V(r2, usernameNavigationViewModel, 335646975);
            Object CER = r2.CER();
            if (A1V || CER == AnonymousClass0MH.A00) {
                CER = BE8.A0s(r2, usernameNavigationViewModel, 23);
            }
            AnonymousClass0VR.A0R((AnonymousClass0VR) r2, false);
            C25890Co1.A01(r2, (C17090tj) null, A002, (C24263ByM) null, (C24264ByN) null, (C24290Byn) null, A003, (C18090vk) ((AnonymousClass1JH) CER), 0, 120);
        }
        return C27621Wu.A00;
    }
}
