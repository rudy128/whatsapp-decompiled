package X;

/* renamed from: X.0pk  reason: invalid class name and case insensitive filesystem */
public final class C14890pk extends AnonymousClass11G implements C36001nB {
    public final /* synthetic */ boolean $enabled = true;
    public final /* synthetic */ C18090vk $onClick;
    public final /* synthetic */ AnonymousClass0JM $role = null;
    public final /* synthetic */ boolean $selected;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14890pk(C18090vk r3, boolean z) {
        super(3);
        this.$selected = z;
        this.$onClick = r3;
    }

    public final C17090tj A00(C17130tn r11) {
        r11.COB(-2124609672);
        AnonymousClass0WC r5 = C17090tj.A00;
        Object A1A = AnonymousClass001.A1A(r11);
        if (A1A == AnonymousClass0MH.A00) {
            A1A = new C05500Um();
            AnonymousClass0VR.A0V(r11, A1A);
        }
        AnonymousClass0VR r2 = (AnonymousClass0VR) r11;
        AnonymousClass0VR.A0R(r2, false);
        C17090tj A00 = C02390Dv.A00((C16040rc) r11.BFh(C03900Lb.A00), (C17210uI) A1A, r5, this.$role, this.$onClick, this.$selected, this.$enabled);
        AnonymousClass0VR.A0R(r2, false);
        return A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return A00(AnonymousClass000.A0b(obj2, obj3));
    }
}
