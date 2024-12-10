package X;

/* renamed from: X.AyW  reason: case insensitive filesystem */
public final class C22154AyW extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C20135A8w this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22154AyW(C20135A8w a8w) {
        super(1);
        this.this$0 = a8w;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Number number = (Number) obj;
        C20135A8w a8w = this.this$0;
        if (number != null) {
            a8w.A01 = number.intValue();
        }
        if (C20135A8w.A06(a8w)) {
            Object A06 = a8w.A07.A06();
            if (C20135A8w.A0R.A03(a8w.A0E)) {
                a8w.A0G.execute(new C21434Ak1(a8w, A06, number, 17));
            }
        }
        Number A1C = C108945cZ.A1C(a8w.A06);
        if (A1C != null && A1C.intValue() == 98) {
            a8w.A0G.execute(new C21434Ak1(a8w, number, a8w.A07.A06(), 16));
        }
        return C27621Wu.A00;
    }
}
