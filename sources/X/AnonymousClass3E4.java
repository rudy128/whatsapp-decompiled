package X;

/* renamed from: X.3E4  reason: invalid class name */
public final class AnonymousClass3E4 implements AnonymousClass1OI {
    public long A00;
    public final Object A01;
    public final C30391dr A02;
    public final C25701Ph A03;

    public void dispose() {
        C25701Ph r6 = this.A03;
        synchronized (r6) {
            long j = this.A00;
            if (j >= Math.min(r6.A02, r6.A03)) {
                Object[] objArr = r6.A04;
                C18070vi.A0b(objArr);
                int length = (objArr.length - 1) & ((int) j);
                if (objArr[length] == this) {
                    objArr[length] = C62922sD.A00;
                    C25701Ph.A05(r6);
                }
            }
        }
    }

    public AnonymousClass3E4(Object obj, C30391dr r2, C25701Ph r3, long j) {
        this.A03 = r3;
        this.A00 = j;
        this.A01 = obj;
        this.A02 = r2;
    }
}
