package X;

/* renamed from: X.BfV  reason: case insensitive filesystem */
public final class C23343BfV extends C23345BfX {
    public final transient C23345BfX A00;

    public final boolean contains(Object obj) {
        return this.A00.contains(obj);
    }

    public final Object get(int i) {
        C23345BfX bfX = this.A00;
        C25874Cni.A01(i, bfX.size());
        return bfX.get(AnonymousClass000.A0Q(bfX) - i);
    }

    public final int size() {
        return this.A00.size();
    }

    public C23343BfV(C23345BfX bfX) {
        this.A00 = bfX;
    }
}
