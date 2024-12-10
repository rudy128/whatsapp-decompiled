package X;

/* renamed from: X.AXv  reason: case insensitive filesystem */
public class C20766AXv implements BB7 {
    public final C22461B8t A00;
    public final C198959zC A01;
    public final /* synthetic */ A4K A02;

    public C20766AXv(C22461B8t b8t, A4K a4k, C198959zC r3) {
        this.A02 = a4k;
        this.A01 = r3;
        this.A00 = b8t;
    }

    public void Bss(A7B a7b) {
        this.A00.C3f(a7b);
    }

    public void C7R(String str) {
        A4K a4k = this.A02;
        C198959zC r6 = this.A01;
        C22461B8t b8t = this.A00;
        a4k.A08.A07("[Set PIN] called");
        C198169xt r5 = a4k.A00;
        AnonymousClass90T r15 = new AnonymousClass90T(b8t, a4k, r6);
        String str2 = str;
        byte[] A002 = C198169xt.A00((Boolean) null, (Object) null, "CREATE", str2, (byte[]) null, new Object[0], AnonymousClass11P.A00(r5.A01));
        AnonymousClass1MD[] r3 = new AnonymousClass1MD[1];
        C17880vN.A1Q("action", "create-payment-pin", r3, 0);
        r5.A02.A0I(r15, new C29621ca(r6.A01(A002), "account", r3), "set", C20113A7w.A0L);
    }
}
