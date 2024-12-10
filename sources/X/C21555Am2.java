package X;

/* renamed from: X.Am2  reason: case insensitive filesystem */
public final class C21555Am2 implements AnonymousClass3MV {
    public final C22343B3u[] A00;
    public final /* synthetic */ C199209zc A01;

    public C21555Am2(C199209zc r1, C22343B3u[] b3uArr) {
        this.A01 = r1;
        this.A00 = b3uArr;
    }

    public final void A00() {
        C22343B3u[] b3uArr = this.A00;
        int length = b3uArr.length;
        int i = 0;
        while (i < length) {
            AnonymousClass1OI r0 = b3uArr[i].A00;
            if (r0 != null) {
                r0.dispose();
                i++;
            } else {
                C18070vi.A11("handle");
                throw null;
            }
        }
    }

    public void Bdq(Throwable th) {
        A00();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DisposeHandlersOnCancel[");
        A10.append(this.A00);
        return C17890vO.A0c(A10, ']');
    }
}
