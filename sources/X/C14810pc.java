package X;

import androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2;

/* renamed from: X.0pc  reason: invalid class name and case insensitive filesystem */
public final class C14810pc extends AnonymousClass11G implements C36001nB {
    public final /* synthetic */ C17210uI $interactionSource;
    public final /* synthetic */ C22821Di $onTap;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14810pc(C17210uI r2, C22821Di r3) {
        super(3);
        this.$onTap = r3;
        this.$interactionSource = r2;
    }

    public final C17090tj A00(C17130tn r12) {
        r12.COB(-102778667);
        r12.COB(773894976);
        Object A0u = AnonymousClass000.A0u(r12, -492369756);
        Object obj = AnonymousClass0MH.A00;
        if (A0u == obj) {
            A0u = new C05710Vk(AnonymousClass0QC.A00(r12, AnonymousClass1OR.A00));
            r12.CRH(A0u);
        }
        AnonymousClass0VR r3 = (AnonymousClass0VR) r12;
        AnonymousClass0VR.A0R(r3, false);
        AnonymousClass1OX A00 = ((C05710Vk) A0u).A00();
        AnonymousClass0VR.A0R(r3, false);
        Object A0u2 = AnonymousClass000.A0u(r12, -492369756);
        if (A0u2 == obj) {
            A0u2 = AnonymousClass0Q9.A02((Object) null);
            r3.A0c(A0u2);
        }
        AnonymousClass0VR.A0R(r3, false);
        C17330uU r7 = (C17330uU) A0u2;
        C17330uU A01 = AnonymousClass0Ou.A01(r12, this.$onTap);
        C17210uI r5 = this.$interactionSource;
        boolean A1V = AnonymousClass000.A1V(r12, r7, -585649902) | r12.BEf(this.$interactionSource);
        C17210uI r1 = this.$interactionSource;
        Object CER = r12.CER();
        if (A1V || CER == obj) {
            CER = new C10290i6(r1, r7);
            r3.A0c(CER);
        }
        AnonymousClass0VR.A0R(r3, false);
        AnonymousClass0QC.A03(r12, r5, (C22821Di) CER);
        AnonymousClass0WC r0 = C17090tj.A00;
        C17210uI r6 = this.$interactionSource;
        C17090tj A012 = AnonymousClass0PB.A01(r0, r6, new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2(r6, r7, A01, (C30391dr) null, A00));
        AnonymousClass0VR.A0R(r3, false);
        return A012;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return A00(AnonymousClass000.A0b(obj2, obj3));
    }
}
