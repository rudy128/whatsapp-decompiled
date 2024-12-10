package X;

import android.content.res.TypedArray;
import android.util.SparseArray;

/* renamed from: X.CRb  reason: case insensitive filesystem */
public class C24951CRb {
    public final int A00;
    public final int A01;
    public final SparseArray A02 = BE6.A0Q();
    public final BIm A03;

    public C24951CRb(C002401c r4, BIm bIm) {
        this.A03 = bIm;
        TypedArray typedArray = r4.A02;
        this.A00 = typedArray.getResourceId(26, 0);
        this.A01 = typedArray.getResourceId(50, 0);
    }
}
