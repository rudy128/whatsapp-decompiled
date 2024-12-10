package X;

/* renamed from: X.0pd  reason: invalid class name and case insensitive filesystem */
public final class C14820pd extends AnonymousClass11G implements C36001nB {
    public final /* synthetic */ C18090vk $iconVisible;
    public final /* synthetic */ boolean $isLeft;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14820pd(C18090vk r2, boolean z) {
        super(3);
        this.$iconVisible = r2;
        this.$isLeft = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return A00(AnonymousClass000.A0b(obj2, obj3), (C17090tj) obj);
    }

    public final C17090tj A00(C17130tn r8, C17090tj r9) {
        r8.COB(-196777734);
        long j = ((C03630Jc) r8.BFh(AnonymousClass0GS.A01)).A01;
        r8.COB(442417347);
        boolean BEe = r8.BEe(j) | r8.BEh(this.$iconVisible) | r8.BEg(this.$isLeft);
        C18090vk r5 = this.$iconVisible;
        boolean z = this.$isLeft;
        Object CER = r8.CER();
        if (BEe || CER == AnonymousClass0MH.A00) {
            CER = new C11230jh(r5, j, z);
            AnonymousClass0VR.A0V(r8, CER);
        }
        AnonymousClass0VR r82 = (AnonymousClass0VR) r8;
        AnonymousClass0VR.A0R(r82, false);
        C17090tj A01 = C04490Np.A01(r9, (C22821Di) CER);
        AnonymousClass0VR.A0R(r82, false);
        return A01;
    }
}
