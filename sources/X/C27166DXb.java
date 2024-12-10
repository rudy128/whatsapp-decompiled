package X;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import com.whatsapp.profile.viewmodel.UsernamePinSetViewModel;

/* renamed from: X.DXb  reason: case insensitive filesystem */
public final class C27166DXb implements C36001nB {
    public final /* synthetic */ C05400Ua A00;
    public final /* synthetic */ C17330uU A01;
    public final /* synthetic */ C17330uU A02;
    public final /* synthetic */ C16300s2 A03;
    public final /* synthetic */ C17090tj A04;
    public final /* synthetic */ UsernamePinSetViewModel A05;

    public C27166DXb(C05400Ua r1, C17330uU r2, C17330uU r3, C16300s2 r4, C17090tj r5, UsernamePinSetViewModel usernamePinSetViewModel) {
        this.A04 = r5;
        this.A00 = r1;
        this.A03 = r4;
        this.A05 = usernamePinSetViewModel;
        this.A01 = r2;
        this.A02 = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        AnonymousClass0tB r3 = (AnonymousClass0tB) obj;
        C17130tn r13 = (C17130tn) obj2;
        int A0M = AnonymousClass000.A0M(obj3);
        C18070vi.A0d(r3, 0);
        if ((A0M & 6) == 0) {
            A0M |= AnonymousClass001.A0Q(r13, r3);
        }
        if ((A0M & 19) != 18 || !r13.BZO()) {
            C17090tj A012 = C03880Kz.A01(this.A00, AnonymousClass0Q7.A02(r3, this.A04).CP5(C05130Qo.A00));
            C16330s5 r0 = AnonymousClass0MX.A00;
            C16300s2 r12 = this.A03;
            UsernamePinSetViewModel usernamePinSetViewModel = this.A05;
            C17330uU r32 = this.A01;
            C17330uU r5 = this.A02;
            C16870tM A0R = BEA.A0R(r13, r0);
            AnonymousClass0VR r02 = (AnonymousClass0VR) r13;
            int i = r02.A01;
            C17350uW BPs = r13.BPs();
            C18090vk r1 = C05030Qc.A00;
            AnonymousClass04D A013 = AnonymousClass0LO.A01(A012);
            BEA.A19(r13, r02, r1);
            BE9.A18(r13, A0R, BPs);
            AnonymousClass1OS r6 = C05030Qc.A01;
            if (r02.A0K || !BE9.A1R(r13, i)) {
                BE9.A19(r13, r6, i);
            }
            BEB.A0r(r13, A013);
            AnonymousClass0WC r7 = C17090tj.A00;
            AnonymousClass07W r14 = CG8.A00;
            r13.BFh(r14);
            C17090tj A052 = AnonymousClass0Q7.A05(r7, 24.0f, 0.0f);
            r13.BFh(r14);
            r13.BFh(r14);
            C17090tj A06 = AnonymousClass0Q7.A06(A052, 0.0f, 8.0f, 0.0f, 16.0f);
            long A002 = C26257Cw2.A00(r13);
            boolean z = false;
            C26231CvN.A01(r13, A06, new C26018CqZ(3), AnonymousClass0LT.A00(r13, 2131895790), 0, 0, 0, 48, A002);
            FillElement fillElement = C05130Qo.A01;
            r13.BFh(r14);
            r13.BFh(r14);
            C17090tj A053 = AnonymousClass0Q7.A05(fillElement, 24.0f, 20.0f);
            String str = ((C25788Clz) r12.getValue()).A02;
            String str2 = ((C25788Clz) r12.getValue()).A01;
            Object A0u = AnonymousClass000.A0u(r13, -1705615415);
            Object obj4 = AnonymousClass0MH.A00;
            if (A0u == obj4) {
                A0u = new C27141DWc(r32, r5, 5);
                r13.CRH(A0u);
            }
            AnonymousClass0VR.A0R(r02, false);
            CDJ.A00(r13, A053, str, (String) null, str2, (C22821Di) A0u, 24576, 4);
            C02280Dk.A00(r13, new LayoutWeightElement());
            String A003 = AnonymousClass0LT.A00(r13, 2131897715);
            if (((C25788Clz) r12.getValue()).A00 == AnonymousClass9I3.LOADING) {
                z = true;
            }
            boolean z2 = true;
            r13.BFh(r14);
            r13.BFh(r14);
            C17090tj A054 = AnonymousClass0Q7.A05(fillElement, 24.0f, 16.0f);
            if (((C25788Clz) r12.getValue()).A00 != AnonymousClass9I3.ENABLED || !AnonymousClass001.A1b(r5)) {
                z2 = false;
            }
            boolean A1V = BE7.A1V(r13, usernamePinSetViewModel, -1705592338);
            Object CER = r13.CER();
            if (A1V || CER == obj4) {
                CER = new C99134sK(r32, usernamePinSetViewModel, 15);
                r13.CRH(CER);
            }
            AnonymousClass0VR.A0R(r02, false);
            C24619CCf.A00(r13, A054, A003, (C18090vk) CER, 0, 0, z, z2);
            BEA.A18(r13, r02);
        } else {
            r13.CNR();
        }
        return C27621Wu.A00;
    }
}
