package X;

import android.os.Parcel;
import android.util.SparseIntArray;

/* renamed from: X.BMe  reason: case insensitive filesystem */
public class C22717BMe extends C25849Cn7 {
    public int A00;
    public int A01;
    public int A02;
    public final int A03;
    public final int A04;
    public final Parcel A05;
    public final SparseIntArray A06;
    public final String A07;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.00O, X.00P] */
    /* JADX WARNING: type inference failed for: r3v0, types: [X.00O, X.00P] */
    /* JADX WARNING: type inference failed for: r4v0, types: [X.00O, X.00P] */
    public C22717BMe(Parcel parcel) {
        this(parcel, new AnonymousClass00O(0), new AnonymousClass00O(0), new AnonymousClass00O(0), "", parcel.dataPosition(), parcel.dataSize());
    }

    public C22717BMe(Parcel parcel, AnonymousClass00P r3, AnonymousClass00P r4, AnonymousClass00P r5, String str, int i, int i2) {
        super(r3, r4, r5);
        this.A06 = new SparseIntArray();
        this.A00 = -1;
        this.A01 = -1;
        this.A05 = parcel;
        this.A04 = i;
        this.A03 = i2;
        this.A02 = i;
        this.A07 = str;
    }
}
