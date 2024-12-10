package X;

import com.facebook.android.exoplayer2.util.Util;
import java.util.Arrays;

/* renamed from: X.Cm9  reason: case insensitive filesystem */
public final class C25797Cm9 {
    public static final C25797Cm9 A04 = new C25797Cm9(-1, -1, -1);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25797Cm9)) {
            return false;
        }
        C25797Cm9 cm9 = (C25797Cm9) obj;
        return this.A03 == cm9.A03 && this.A01 == cm9.A01 && this.A02 == cm9.A02;
    }

    public C25797Cm9(int i, int i2, int i3) {
        int i4;
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        if (Util.A0C(i3)) {
            i4 = Util.A02(i3, i2);
        } else {
            i4 = -1;
        }
        this.A00 = i4;
    }

    public int hashCode() {
        Object[] A1a = AnonymousClass8BR.A1a();
        AnonymousClass000.A1L(A1a, this.A03);
        AnonymousClass000.A1M(A1a, this.A01);
        AnonymousClass3Ma.A1S(A1a, this.A02);
        return Arrays.hashCode(A1a);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AudioFormat[sampleRate=");
        A10.append(this.A03);
        A10.append(", channelCount=");
        A10.append(this.A01);
        A10.append(", encoding=");
        A10.append(this.A02);
        return C17890vO.A0c(A10, ']');
    }
}
