package X;

import com.whatsapp.profile.viewmodel.UsernameNavigationViewModel;

/* renamed from: X.DWg  reason: case insensitive filesystem */
public class C27145DWg implements C18080vj, AnonymousClass1OS {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C17130tn r3 = (C17130tn) obj;
        int A07 = BE7.A07(obj2);
        if (i != 0) {
            if (A07 != 2 || !r3.BZO()) {
                String A002 = AnonymousClass0LT.A00(r3, 2131897687);
                C04640Oe A003 = AnonymousClass0LS.A00(r3, 2131233200);
                String A004 = AnonymousClass0LT.A00(r3, 2131898718);
                UsernameNavigationViewModel usernameNavigationViewModel = (UsernameNavigationViewModel) this.A01;
                boolean A1V = BE7.A1V(r3, usernameNavigationViewModel, -697687458);
                Object CER = r3.CER();
                if (A1V || CER == AnonymousClass0MH.A00) {
                    CER = BE8.A0s(r3, usernameNavigationViewModel, 22);
                }
                AnonymousClass0VR.A0T(r3);
                C25358CeI.A00(r3, (C17090tj) null, A003, A002, A004, (C18090vk) ((AnonymousClass1JH) CER), AnonymousClass0LC.A00(r3, new DXZ((C16300s2) this.A02, usernameNavigationViewModel), 742914036), 196608, 1);
            }
            r3.CNR();
        } else {
            if (A07 != 2 || !r3.BZO()) {
                AnonymousClass0PA.A02(r3, ((C25618Ciy) this.A02).A00, (AnonymousClass1OS) this.A01, 6);
            }
            r3.CNR();
        }
        return C27621Wu.A00;
    }

    public C27145DWg(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }
}
