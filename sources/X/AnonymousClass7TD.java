package X;

import android.util.LongSparseArray;

/* renamed from: X.7TD  reason: invalid class name */
public final class AnonymousClass7TD extends AnonymousClass3D7 {
    public int A00;
    public final /* synthetic */ LongSparseArray A01;

    public AnonymousClass7TD(LongSparseArray longSparseArray) {
        this.A01 = longSparseArray;
    }

    public long A00() {
        LongSparseArray longSparseArray = this.A01;
        int i = this.A00;
        this.A00 = i + 1;
        return longSparseArray.keyAt(i);
    }

    public boolean hasNext() {
        return AnonymousClass000.A1U(this.A00, this.A01.size());
    }
}
