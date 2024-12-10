package X;

/* renamed from: X.4Fa  reason: invalid class name and case insensitive filesystem */
public abstract class C83414Fa {
    public static C010105w A00(AnonymousClass1FU r10, C107005Ya r11, C36531o3 r12, AnonymousClass1BI r13, boolean z) {
        AnonymousClass1FU r8 = r10;
        C73203Rj A00 = AnonymousClass4a6.A00(r10);
        boolean A0V = C22971Dz.A0V(r13);
        AnonymousClass4aq r3 = new AnonymousClass4aq(r11, 5);
        C88884az r5 = new C88884az(r12, r11, r8, 0, A0V);
        C88794an r2 = new C88794an(r11, 2);
        int i = 2131895349;
        if (z) {
            i = 2131895350;
        }
        if (A0V) {
            i = 2131888112;
            if (z) {
                i = 2131888113;
            }
        }
        A00.A0S(r8.getResources().getString(i));
        A00.setPositiveButton(2131899286, r3);
        A00.setNegativeButton(2131899101, r5);
        A00.A0T(true);
        A00.A0G(r2);
        return A00.create();
    }
}
