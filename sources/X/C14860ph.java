package X;

/* renamed from: X.0ph  reason: invalid class name and case insensitive filesystem */
public final class C14860ph extends AnonymousClass11G implements C36001nB {
    public final /* synthetic */ boolean $enabled = true;
    public final /* synthetic */ C18090vk $onClick;
    public final /* synthetic */ String $onClickLabel = null;
    public final /* synthetic */ AnonymousClass0JM $role = null;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14860ph(C18090vk r3) {
        super(3);
        this.$onClick = r3;
    }

    public final C17090tj A00(C17130tn r10) {
        r10.COB(-756081143);
        AnonymousClass0WC r4 = C17090tj.A00;
        C16040rc r2 = (C16040rc) r10.BFh(C03900Lb.A00);
        Object A1A = AnonymousClass001.A1A(r10);
        if (A1A == AnonymousClass0MH.A00) {
            A1A = new C05500Um();
            AnonymousClass0VR.A0V(r10, A1A);
        }
        AnonymousClass0VR r102 = (AnonymousClass0VR) r10;
        AnonymousClass0VR.A0R(r102, false);
        boolean z = this.$enabled;
        C17090tj A00 = C03870Ky.A00(r2, (C17210uI) A1A, r4, this.$role, this.$onClickLabel, this.$onClick, z);
        AnonymousClass0VR.A0R(r102, false);
        return A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return A00(AnonymousClass000.A0b(obj2, obj3));
    }
}
