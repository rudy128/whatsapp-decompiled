package X;

import android.util.SparseArray;
import java.util.List;

public class CSR {
    public final int A00;
    public final SparseArray A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public CSR(SparseArray sparseArray, String str, String str2, List list, int i) {
        this.A03 = str;
        this.A02 = str2;
        this.A00 = i;
        this.A01 = sparseArray;
        this.A04 = C25390Cer.A00(list);
    }
}
