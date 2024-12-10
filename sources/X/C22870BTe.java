package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.BTe  reason: case insensitive filesystem */
public final class C22870BTe extends C3J {
    public static final C22870BTe A02;
    public static final C22870BTe A03;
    public static final C22870BTe A04;
    public static final List A05;
    public static final C22870BTe A06;
    public static final C22870BTe A07;
    public final int A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C22870BTe) {
                C22870BTe bTe = (C22870BTe) obj;
                if (this.A00 != bTe.A00 || !C18070vi.A18(this.A01, bTe.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    static {
        C22870BTe bTe = new C22870BTe(ZipDecompressor.UNZIP_BUFFER_SIZE, "Success");
        A04 = bTe;
        C22870BTe bTe2 = new C22870BTe(4097, "Failure");
        A06 = bTe2;
        C22870BTe bTe3 = new C22870BTe(4098, "NotSupported");
        A07 = bTe3;
        C22870BTe bTe4 = new C22870BTe(4160, "InvalidIdentifier");
        A02 = bTe4;
        C22870BTe bTe5 = new C22870BTe(4161, "InvalidSignature");
        A03 = bTe5;
        C22870BTe[] bTeArr = new C22870BTe[5];
        C17900vP.A0O(bTe, bTe2, bTe3, bTe5, bTeArr);
        A05 = C18070vi.A0O(bTe4, bTeArr, 4);
    }

    public int hashCode() {
        return C108945cZ.A09(this.A01, this.A00 * 31);
    }

    public C22870BTe(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Error(0x");
        Object[] A1a = AnonymousClass3MW.A1a();
        AnonymousClass000.A1L(A1a, this.A00);
        String format = String.format("%04x", Arrays.copyOf(A1a, 1));
        C18070vi.A0X(format);
        BE7.A1N(A10, format);
        return C17900vP.A0B(this.A01, A10);
    }
}
