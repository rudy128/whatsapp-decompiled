package X;

/* renamed from: X.0pe  reason: invalid class name and case insensitive filesystem */
public final class C14830pe extends AnonymousClass11G implements C36001nB {
    public final /* synthetic */ C18090vk $magnifierCenter;
    public final /* synthetic */ C22821Di $platformMagnifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14830pe(C18090vk r2, C22821Di r3) {
        super(3);
        this.$magnifierCenter = r2;
        this.$platformMagnifier = r3;
    }

    public final C17090tj A00(C17130tn r5) {
        r5.COB(759876635);
        C05780Vr A01 = AnonymousClass0PI.A00(r5, this.$magnifierCenter);
        C22821Di r3 = this.$platformMagnifier;
        boolean A1V = AnonymousClass000.A1V(r5, A01, 1714568984);
        Object CER = r5.CER();
        if (A1V || CER == AnonymousClass0MH.A00) {
            CER = new C08070eV(A01);
            AnonymousClass0VR.A0V(r5, CER);
        }
        AnonymousClass0VR r52 = (AnonymousClass0VR) r5;
        AnonymousClass0VR.A0R(r52, false);
        C17090tj r0 = (C17090tj) r3.invoke(CER);
        AnonymousClass0VR.A0R(r52, false);
        return r0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return A00(AnonymousClass000.A0b(obj2, obj3));
    }
}
