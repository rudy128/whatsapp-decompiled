package X;

import android.util.SparseIntArray;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;

public class CTW {
    public final C28431E0x A00;
    public final CRL A01;
    public final CRL A02;
    public final CRL A03;
    public final CRL A04;
    public final C28619EAr A05;
    public final C28619EAr A06;
    public final C28619EAr A07;

    /* JADX WARNING: type inference failed for: r0v31, types: [java.lang.Object, X.DBF] */
    public CTW() {
        int i;
        DBF dbf;
        int i2;
        int i3;
        if (C26212Cuq.A04()) {
            C26212Cuq.A03("PoolConfig()");
        }
        SparseIntArray sparseIntArray = C24663CEd.A00;
        int A032 = BEA.A03();
        if (A032 > 16777216) {
            i = (A032 / 4) * 3;
        } else {
            i = A032 / 2;
        }
        this.A01 = new CRL(C24663CEd.A00, 0, i, -1);
        this.A05 = C26769DCy.A00();
        int i4 = C24664CEe.A00;
        int i5 = i4 * 4194304;
        int i6 = A7Y.A0F;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        do {
            sparseIntArray2.put(i6, i4);
            i6 *= 2;
        } while (i6 <= 4194304);
        this.A02 = new CRL(sparseIntArray2, 4194304, i5, i4);
        synchronized (DBF.class) {
            DBF dbf2 = DBF.A00;
            dbf = dbf2;
            if (dbf2 == null) {
                ? obj = new Object();
                DBF.A00 = obj;
                dbf = obj;
            }
        }
        this.A00 = dbf;
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        sparseIntArray3.put(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, 5);
        sparseIntArray3.put(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH, 5);
        sparseIntArray3.put(ZipDecompressor.UNZIP_BUFFER_SIZE, 5);
        sparseIntArray3.put(DefaultCrypto.BUFFER_SIZE, 5);
        sparseIntArray3.put(16384, 5);
        sparseIntArray3.put(32768, 5);
        sparseIntArray3.put(65536, 5);
        sparseIntArray3.put(A7Y.A0F, 5);
        sparseIntArray3.put(262144, 2);
        sparseIntArray3.put(524288, 2);
        sparseIntArray3.put(1048576, 2);
        int A033 = BEA.A03();
        if (A033 < 16777216) {
            i2 = 3145728;
        } else {
            i2 = 12582912;
            if (A033 < 33554432) {
                i2 = 6291456;
            }
        }
        int A034 = BEA.A03();
        if (A034 < 16777216) {
            i3 = A034 / 2;
        } else {
            i3 = (A034 / 4) * 3;
        }
        this.A03 = new CRL(sparseIntArray3, i2, i3, -1);
        this.A06 = C26769DCy.A00();
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        sparseIntArray4.put(16384, 5);
        this.A04 = new CRL(sparseIntArray4, 81920, 1048576, -1);
        this.A07 = C26769DCy.A00();
        C26212Cuq.A00();
    }
}
