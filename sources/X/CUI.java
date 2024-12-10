package X;

import android.net.Uri;
import java.util.List;

public class CUI {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final Uri A05;
    public final C25049CVd A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public CUI(Uri uri, C25049CVd cVd, String str, String str2, List list, long j, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A01 = j;
        this.A0A = z;
        this.A06 = cVd;
        this.A05 = uri;
        this.A09 = list;
        this.A02 = j2;
        this.A00 = j3;
        this.A03 = j4;
        this.A04 = j5;
        this.A0B = z2;
        this.A0D = z3;
        this.A0E = z4;
        this.A07 = str;
        this.A08 = str2;
        this.A0C = z5;
    }
}
