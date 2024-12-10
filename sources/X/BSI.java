package X;

import android.util.SparseIntArray;

public class BSI extends DBG implements C28655ECp {
    public final int[] A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BSI(C28431E0x e0x, CRL crl, C28619EAr eAr) {
        super(e0x, crl, eAr);
        C72473Md.A1I(e0x, eAr);
        SparseIntArray sparseIntArray = crl.A03;
        this.A00 = new int[sparseIntArray.size()];
        int size = sparseIntArray.size();
        for (int i = 0; i < size; i++) {
            this.A00[i] = sparseIntArray.keyAt(i);
        }
    }
}
