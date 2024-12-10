package X;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.Csd  reason: case insensitive filesystem */
public final class C26115Csd {
    public static final C26115Csd A09 = new C26115Csd(Uri.parse("www.facebook.com"), new C25701CkW(), (String) null, (byte[]) null, 0, 0, 0, -1);
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final Uri A04;
    public final C25701CkW A05;
    public final String A06;
    public final Map A07;
    public final byte[] A08;

    public C26115Csd(Uri uri, long j, long j2) {
        this(uri, new C25701CkW(), (String) null, (byte[]) null, 0, j, j, j2);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DataSpec[");
        AnonymousClass8BS.A1D(this.A04, A10);
        A10.append(", ");
        A10.append(Arrays.toString(this.A08));
        A10.append(", ");
        A10.append(this.A01);
        A10.append(", ");
        A10.append(this.A03);
        A10.append(", ");
        A10.append(this.A02);
        A10.append(", ");
        A10.append(this.A06);
        A10.append(", ");
        A10.append(this.A00);
        A10.append(", ");
        C25701CkW ckW = this.A05;
        AnonymousClass8BS.A1D(ckW, A10);
        A10.append(", ");
        return BEA.A0m(ckW.A0N.toString(), A10);
    }

    public C26115Csd(Uri uri, C25701CkW ckW, String str, byte[] bArr, int i, long j, long j2, long j3) {
        Map emptyMap = Collections.emptyMap();
        C26056CrS.A01(ckW);
        this.A04 = uri;
        this.A08 = bArr;
        this.A07 = Collections.unmodifiableMap(BE6.A10(emptyMap));
        this.A03 = j2;
        this.A01 = (j - j2) + j2;
        this.A02 = j3;
        this.A06 = str;
        this.A00 = i;
        this.A05 = ckW;
    }

    public C26115Csd(Uri uri) {
        this(uri, new C25701CkW(), (String) null, (byte[]) null, 0, 0, 0, -1);
    }
}
