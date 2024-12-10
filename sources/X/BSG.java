package X;

import android.util.SparseIntArray;

public abstract class BSG extends DBG {
    public final int[] A00;

    public BSG(C28431E0x e0x, CRL crl, C28619EAr eAr) {
        super(e0x, crl, eAr);
        SparseIntArray sparseIntArray = crl.A03;
        C26208Cuj.A01(sparseIntArray);
        this.A00 = new int[sparseIntArray.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.A00;
            if (i < iArr.length) {
                iArr[i] = sparseIntArray.keyAt(i);
                i++;
            } else {
                return;
            }
        }
    }
}
