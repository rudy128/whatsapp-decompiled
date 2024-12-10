package X;

/* renamed from: X.AXu  reason: case insensitive filesystem */
public class C20765AXu implements BB7 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C20765AXu(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public void Bss(A7B a7b) {
        if (this.A00 != 0) {
            ((C190769lU) this.A02).A00(a7b);
            return;
        }
        C191069ly r1 = (C191069ly) this.A02;
        if (AnonymousClass8BV.A1Z(r1.A01)) {
            r1.A02.decrementAndGet();
            r1.A00.Bss(a7b);
        }
    }

    public void C7R(String str) {
        if (this.A00 != 0) {
            C198739yp r5 = (C198739yp) this.A01;
            C31061ex r7 = r5.A03;
            AnonymousClass1MD[] r2 = new AnonymousClass1MD[4];
            AnonymousClass8BV.A1M("action", "pin-credential-check", r2);
            AnonymousClass8BV.A1N("token", str, r2);
            C17890vO.A12("credential-id", r5.A0A, r2);
            AnonymousClass8BV.A1O("device-id", r5.A09.A01(), r2);
            C29621ca A0k = AnonymousClass8BR.A0k("account", r2);
            Object obj = this.A02;
            r7.A0I(new C175428yh(r5.A00, r5.A02, r5.A01, obj, r5, 21), A0k, "get", C20113A7w.A0L);
            return;
        }
        ((C191069ly) this.A02).A00(0, str);
    }
}
