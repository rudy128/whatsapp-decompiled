package X;

/* renamed from: X.0nH  reason: invalid class name and case insensitive filesystem */
public final class C13360nH extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ AnonymousClass1OS $content;
    public final /* synthetic */ long $handlePosition;
    public final /* synthetic */ C17090tj $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13360nH(C17090tj r2, AnonymousClass1OS r3, int i, long j) {
        super(2);
        this.$handlePosition = j;
        this.$modifier = r2;
        this.$content = r3;
        this.$$changed = i;
    }

    public final void A00(C17130tn r7) {
        long j = this.$handlePosition;
        AnonymousClass0P7.A02(r7, this.$modifier, this.$content, AnonymousClass0L8.A00(this.$$changed), j);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00(AnonymousClass000.A0b(obj, obj2));
        return C27621Wu.A00;
    }
}
