package X;

import android.graphics.Bitmap;
import java.util.Arrays;

/* renamed from: X.25N  reason: invalid class name */
public class AnonymousClass25N {
    public Bitmap A00;
    public AnonymousClass1E7 A01;
    public String A02;
    public boolean A03;
    public final long A04;
    public final String A05;
    public final String A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof AnonymousClass25N) && this.A04 == ((AnonymousClass25N) obj).A04;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A04)});
    }

    public AnonymousClass25N(String str, long j, String str2) {
        this.A06 = str;
        this.A04 = j;
        this.A05 = str2;
    }
}
