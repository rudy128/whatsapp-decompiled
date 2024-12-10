package X;

/* renamed from: X.0iZ  reason: invalid class name and case insensitive filesystem */
public final class C10580iZ extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C05400Ua this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10580iZ(C05400Ua r2) {
        super(1);
        this.this$0 = r2;
    }

    public final Float A00(float f) {
        C05400Ua r1 = this.this$0;
        float BT8 = ((float) this.this$0.A03.BT8()) + f + r1.A00;
        float A02 = C28851b7.A02(BT8, 0.0f, (float) r1.A01.BT8());
        boolean z = !AnonymousClass000.A1P((BT8 > A02 ? 1 : (BT8 == A02 ? 0 : -1)));
        float BT82 = A02 - ((float) this.this$0.A03.BT8());
        int A01 = C22339B3q.A01(BT82);
        C05400Ua r2 = this.this$0;
        r2.A03.CJC(r2.A03.BT8() + A01);
        this.this$0.A00 = BT82 - ((float) A01);
        if (z) {
            f = BT82;
        }
        return Float.valueOf(f);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return A00(AnonymousClass000.A04(obj));
    }
}
