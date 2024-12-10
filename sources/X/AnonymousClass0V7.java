package X;

/* renamed from: X.0V7  reason: invalid class name */
public final class AnonymousClass0V7 implements C16180rq {
    public AnonymousClass0t7 A00;
    public boolean A01;
    public final int A02;
    public final long A03;

    public void cancel() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass0t7 r0 = this.A00;
            if (r0 != null) {
                r0.dispose();
            }
            this.A00 = null;
        }
    }

    public AnonymousClass0V7(int i, long j) {
        this.A02 = i;
        this.A03 = j;
    }
}
