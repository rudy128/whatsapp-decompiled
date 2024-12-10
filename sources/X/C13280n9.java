package X;

/* renamed from: X.0n9  reason: invalid class name and case insensitive filesystem */
public final class C13280n9 extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ C26251Cvq $bodySmall;
    public final /* synthetic */ AnonymousClass1OS $it;
    public final /* synthetic */ long $supportingTextColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13280n9(C26251Cvq cvq, AnonymousClass1OS r3, long j) {
        super(2);
        this.$supportingTextColor = j;
        this.$bodySmall = cvq;
        this.$it = r3;
    }

    public final void A00(C17130tn r10, int i) {
        C17130tn r2 = r10;
        if ((i & 11) != 2 || !r10.BZO()) {
            AnonymousClass0PE.A02(r2, this.$bodySmall, this.$it, 0, 0, this.$supportingTextColor);
            return;
        }
        r10.CNR();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00((C17130tn) obj, AnonymousClass000.A0M(obj2));
        return C27621Wu.A00;
    }
}
