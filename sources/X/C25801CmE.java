package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.CmE  reason: case insensitive filesystem */
public final class C25801CmE {
    public static final C25801CmE A06 = new C25801CmE(1033, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
    public static final C25801CmE A07 = new C25801CmE(4201, ZipDecompressor.UNZIP_BUFFER_SIZE);
    public static final C25801CmE A08;
    public static final C25801CmE A09;
    public static final C25801CmE A0A = new C25801CmE(19, 16);
    public static final C25801CmE A0B;
    public static final C25801CmE A0C;
    public static final C25801CmE A0D = new C25801CmE(285, 256);
    public final C25270CcG A00;
    public final C25270CcG A01;
    public final int[] A02;
    public final int[] A03;
    public final int A04;
    public final int A05;

    static {
        C25801CmE cmE = new C25801CmE(67, 64);
        A08 = cmE;
        C25801CmE cmE2 = new C25801CmE(301, 256);
        A0B = cmE2;
        A09 = cmE2;
        A0C = cmE;
    }

    public int A00(int i) {
        if (i != 0) {
            return this.A02[(this.A05 - this.A03[i]) - 1];
        }
        throw new ArithmeticException();
    }

    public int A01(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.A02;
        int[] iArr2 = this.A03;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.A05 - 1)];
    }

    public String toString() {
        StringBuilder A0u = BE6.A0u("GF(0x");
        BE7.A10(this.A04, A0u);
        A0u.append(',');
        return AnonymousClass001.A1L(A0u, this.A05);
    }

    public C25801CmE(int i, int i2) {
        this.A04 = i;
        this.A05 = i2;
        int[] iArr = new int[i2];
        this.A02 = iArr;
        int[] iArr2 = new int[i2];
        this.A03 = iArr2;
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            iArr[i4] = i3;
            i3 <<= 1;
            if (i3 >= i2) {
                i3 = (i3 ^ i) & (i2 - 1);
            }
        }
        for (int i5 = 0; i5 < i2 - 1; i5++) {
            iArr2[iArr[i5]] = i5;
        }
        this.A01 = new C25270CcG(this, new int[]{0});
        this.A00 = new C25270CcG(this, new int[]{1});
    }
}
