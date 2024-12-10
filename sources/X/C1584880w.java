package X;

/* renamed from: X.80w  reason: invalid class name and case insensitive filesystem */
public final class C1584880w extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C112235l9 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1584880w(C112235l9 r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C112235l9 r4 = this.this$0;
        C128666gU r0 = r4.A08.A01;
        int i = r0.A00;
        boolean A1Z = AnonymousClass000.A1Z(r0.A01, AnonymousClass00R.A00);
        if (i < 0) {
            r4.notifyDataSetChanged();
        } else if (A1Z) {
            r4.A0H(i);
            int A02 = C108975cc.A02(this.this$0.A08.A02);
            for (int i2 = i + 1; i2 < A02; i2++) {
                this.this$0.A0G(i2);
            }
        } else {
            r4.A0I(i);
            if (C18020vd.A05(C18040vf.A02, this.this$0.A07, 10563)) {
                for (int A022 = C108975cc.A02(this.this$0.A08.A02) - 1; -1 < A022; A022--) {
                    this.this$0.A0G(A022);
                }
            }
        }
        return C27621Wu.A00;
    }
}
