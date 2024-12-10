package X;

/* renamed from: X.0jV  reason: invalid class name and case insensitive filesystem */
public final class C11110jV extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass0XJ $placeable;
    public final /* synthetic */ int $side;
    public final /* synthetic */ AnonymousClass096 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11110jV(AnonymousClass096 r2, AnonymousClass0XJ r3, int i) {
        super(1);
        this.this$0 = r2;
        this.$side = i;
        this.$placeable = r3;
    }

    public final void A00(AnonymousClass0QZ r5) {
        int i;
        int BT8 = this.this$0.A00.A03.BT8();
        int i2 = this.$side;
        int A03 = C28851b7.A03(BT8, 0, i2);
        AnonymousClass096 r1 = this.this$0;
        if (r1.A01) {
            i = A03 - i2;
        } else {
            i = -A03;
        }
        boolean z = r1.A02;
        int i3 = 0;
        if (!z) {
            i3 = i;
            i = 0;
        }
        r5.A0C(this.$placeable, AnonymousClass0O5.A01, i3, i);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00((AnonymousClass0QZ) obj);
        return C27621Wu.A00;
    }
}
