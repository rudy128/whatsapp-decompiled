package X;

/* renamed from: X.0pp  reason: invalid class name and case insensitive filesystem */
public final class C14940pp extends AnonymousClass11G implements C36001nB {
    public final /* synthetic */ boolean $editable;
    public final /* synthetic */ int $imeAction;
    public final /* synthetic */ C05120Qm $manager;
    public final /* synthetic */ EBT $offsetMapping;
    public final /* synthetic */ C22821Di $onValueChange;
    public final /* synthetic */ boolean $singleLine;
    public final /* synthetic */ C04940Pp $state;
    public final /* synthetic */ AnonymousClass0NN $undoManager;
    public final /* synthetic */ C26224CvE $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14940pp(C04940Pp r2, AnonymousClass0NN r3, C05120Qm r4, EBT ebt, C26224CvE cvE, C22821Di r7, int i, boolean z, boolean z2) {
        super(3);
        this.$state = r2;
        this.$manager = r4;
        this.$value = cvE;
        this.$editable = z;
        this.$singleLine = z2;
        this.$offsetMapping = ebt;
        this.$undoManager = r3;
        this.$onValueChange = r7;
        this.$imeAction = i;
    }

    public final C17090tj A00(C17130tn r17) {
        C17130tn r4 = r17;
        r4.COB(2057323757);
        Object A0u = AnonymousClass000.A0u(r4, -492369756);
        Object obj = AnonymousClass0MH.A00;
        if (A0u == obj) {
            A0u = new Object();
            AnonymousClass0VR.A0V(r4, A0u);
        }
        AnonymousClass0VR r2 = (AnonymousClass0VR) r4;
        AnonymousClass0VR.A0R(r2, false);
        AnonymousClass0H5 r9 = (AnonymousClass0H5) A0u;
        Object A0u2 = AnonymousClass000.A0u(r4, -492369756);
        if (A0u2 == obj) {
            A0u2 = new Object();
            r2.A0c(A0u2);
        }
        AnonymousClass0VR.A0R(r2, false);
        C04940Pp r6 = this.$state;
        C05120Qm r8 = this.$manager;
        C26224CvE cvE = this.$value;
        boolean z = this.$editable;
        boolean z2 = this.$singleLine;
        C17090tj A00 = AnonymousClass0LM.A00(C17090tj.A00, new C07670dr(new AnonymousClass0QX((AnonymousClass0H4) A0u2, r6, this.$undoManager, r8, r9, this.$offsetMapping, cvE, this.$onValueChange, this.$imeAction, z, z2)));
        AnonymousClass0VR.A0R(r2, false);
        return A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return A00(AnonymousClass000.A0b(obj2, obj3));
    }
}
