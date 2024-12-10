package X;

/* renamed from: X.5WT  reason: invalid class name */
public final class AnonymousClass5WT extends C41581wh implements Runnable {
    public final long A00;

    public void run() {
        long j = this.A00;
        C62882s9.A02(getContext());
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Timed out waiting for ");
        A10.append(j);
        A0o(new C99814tV(AnonymousClass000.A0y(" ms", A10), this));
    }

    public AnonymousClass5WT(C30391dr r2, long j) {
        super(r2, r2.getContext());
        this.A00 = j;
    }

    public String A0c() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(super.A0c());
        A10.append("(timeMillis=");
        return C17900vP.A0E(A10, this.A00);
    }
}
