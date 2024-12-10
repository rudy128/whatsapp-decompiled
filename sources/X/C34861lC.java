package X;

/* renamed from: X.1lC  reason: invalid class name and case insensitive filesystem */
public final class C34861lC extends C24741Lm {
    public C002100z A00;

    public synchronized String BZc() {
        StringBuilder sb;
        sb = new StringBuilder("sc=");
        C002100z r0 = this.A00;
        if (r0 == null) {
            sb.append("null");
        } else {
            sb.append(r0.A02());
            sb.append("/");
            sb.append(this.A00.A01());
        }
        return sb.toString();
    }

    public void C9L(C122516Qr r4, boolean z) {
        synchronized (this) {
            C002100z r1 = this.A00;
            if (r1 != null) {
                r1.A07(-1);
            }
        }
    }

    public C34861lC(C24571Kv r1) {
        super(r1);
        A09();
    }
}
