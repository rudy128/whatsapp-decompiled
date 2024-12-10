package X;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: X.2S8  reason: invalid class name */
public final class AnonymousClass2S8 {
    public int A00;
    public long A01;
    public String A02;
    public String A03;
    public byte[] A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18070vi.A14(this, obj)) {
                return false;
            }
            AnonymousClass2S8 r4 = (AnonymousClass2S8) obj;
            if (this.A00 != r4.A00 || !TextUtils.equals(this.A03, r4.A03) || !Arrays.equals(this.A04, r4.A04) || !TextUtils.equals(this.A02, r4.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0P(this.A03, new Object[1], 0);
    }
}
