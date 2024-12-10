package X;

import android.graphics.Bitmap;
import android.util.SparseIntArray;

/* renamed from: X.CTi  reason: case insensitive filesystem */
public class C25008CTi {
    public int A00;
    public int A01;
    public int A02 = 3553;
    public int A03;
    public Bitmap A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public final SparseIntArray A08;

    public C25008CTi(String str) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        this.A08 = sparseIntArray;
        BEB.A0p(sparseIntArray);
        this.A00 = -1;
        this.A07 = false;
        this.A06 = false;
        this.A05 = str;
    }
}
