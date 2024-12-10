package X;

import android.util.SparseArray;

/* renamed from: X.1VV  reason: invalid class name */
public final class AnonymousClass1VV extends C24741Lm {
    public boolean A00;
    public final SparseArray A01 = new SparseArray();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1VV(C24571Kv r2) {
        super(r2);
        C18070vi.A0d(r2, 1);
        A09();
    }

    public synchronized void C9L(C122516Qr r2, boolean z) {
        this.A01.clear();
    }

    public String BZc() {
        int size;
        StringBuilder sb = new StringBuilder();
        sb.append("state a=");
        synchronized (this) {
            size = this.A01.size();
        }
        sb.append(size);
        return sb.toString();
    }
}
