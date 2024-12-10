package X;

import java.util.Iterator;

/* renamed from: X.BfR  reason: case insensitive filesystem */
public final class C23339BfR extends C23341BfT {
    public final transient Object A00;

    public final int size() {
        return 1;
    }

    public final boolean contains(Object obj) {
        return this.A00.equals(obj);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Bff, java.util.Iterator, java.lang.Object] */
    public final /* synthetic */ Iterator iterator() {
        Object obj = this.A00;
        ? obj2 = new Object();
        obj2.A00 = obj;
        return obj2;
    }

    public final String toString() {
        return BEA.A0m(this.A00.toString(), BE9.A0q());
    }

    public C23339BfR(Object obj) {
        this.A00 = obj;
    }
}
