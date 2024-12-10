package X;

/* renamed from: X.0Ds  reason: invalid class name and case insensitive filesystem */
public abstract class C02360Ds {
    public static final C17090tj A00(AnonymousClass0CI r11, C16620sj r12, C17130tn r13, C17090tj r14, C18090vk r15, boolean z, boolean z2) {
        C11190jd r9;
        AnonymousClass0HW r6;
        r13.COB(1070136913);
        Object A1C = AnonymousClass001.A1C(r13, 773894976);
        Object obj = AnonymousClass0MH.A00;
        if (A1C == obj) {
            A1C = new C05710Vk(AnonymousClass0QC.A00(r13, AnonymousClass1OR.A00));
            r13.CRH(A1C);
        }
        AnonymousClass0VR r2 = (AnonymousClass0VR) r13;
        AnonymousClass0VR.A0R(r2, false);
        AnonymousClass1OX A00 = ((C05710Vk) A1C).A00();
        AnonymousClass0VR.A0R(r2, false);
        Object[] objArr = {r15, r12, r11, Boolean.valueOf(z)};
        r13.COB(-568225417);
        int i = 0;
        boolean z3 = false;
        do {
            z3 |= r13.BEf(objArr[i]);
            i++;
        } while (i < 4);
        Object CER = r13.CER();
        if (z3 || CER == obj) {
            boolean A1Z = AnonymousClass000.A1Z(r11, AnonymousClass0CI.Vertical);
            C10620id r8 = new C10620id(r15);
            AnonymousClass0Js r7 = new AnonymousClass0Js(new C07880eC(r12), new C07890eD(r12), z2);
            C13220n3 r10 = null;
            if (z) {
                r10 = new C13220n3(r12, A00, A1Z);
                r9 = new C11190jd(r12, r15, A00);
            } else {
                r9 = null;
            }
            if (!((AnonymousClass0V9) r12).A01) {
                r6 = new AnonymousClass0HW(1, -1);
            }
            CER = AnonymousClass0PD.A02(C17090tj.A00, new C12640m5(r6, r7, r8, r9, r10, A1Z), false);
            r13.CRH(CER);
        }
        AnonymousClass0VR.A0R(r2, false);
        C17090tj CP5 = r14.CP5((C17090tj) CER);
        AnonymousClass0VR.A0R(r2, false);
        return CP5;
    }
}
