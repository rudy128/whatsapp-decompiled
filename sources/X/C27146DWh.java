package X;

import com.whatsapp.profile.viewmodel.UsernameNavigationViewModel;

/* renamed from: X.DWh  reason: case insensitive filesystem */
public class C27146DWh implements C18080vj, AnonymousClass1OS {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C27146DWh(UsernameNavigationViewModel usernameNavigationViewModel, String str, int i) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = usernameNavigationViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C17130tn r7 = (C17130tn) obj;
        int A07 = BE7.A07(obj2);
        if (i != 0) {
            if (A07 != 2 || !r7.BZO()) {
                String str = this.A02;
                C04640Oe A002 = AnonymousClass0LS.A00(r7, 2131233200);
                String A003 = AnonymousClass0LT.A00(r7, 2131898718);
                Object obj3 = this.A01;
                boolean A1V = BE7.A1V(r7, obj3, -1588773391);
                Object CER = r7.CER();
                if (A1V || CER == AnonymousClass0MH.A00) {
                    CER = BE8.A0s(r7, obj3, 37);
                }
                C25358CeI.A01(r7, A002, CER, str, A003);
            }
            r7.CNR();
        } else {
            if (A07 != 2 || !r7.BZO()) {
                String str2 = this.A02;
                C04640Oe A004 = AnonymousClass0LS.A00(r7, 2131233200);
                String A005 = AnonymousClass0LT.A00(r7, 2131898718);
                Object obj4 = this.A01;
                boolean A1V2 = BE7.A1V(r7, obj4, 362715752);
                Object CER2 = r7.CER();
                if (A1V2 || CER2 == AnonymousClass0MH.A00) {
                    CER2 = BE8.A0s(r7, obj4, 36);
                }
                C25358CeI.A01(r7, A004, CER2, str2, A005);
            }
            r7.CNR();
        }
        return C27621Wu.A00;
    }
}
