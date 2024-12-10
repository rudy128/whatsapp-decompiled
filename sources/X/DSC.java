package X;

import java.io.File;

public class DSC implements Comparable {
    public int A00;
    public long A01 = -1;
    public boolean A02 = false;
    public final long A03;
    public final long A04;
    public final long A05;
    public final File A06;
    public final String A07;
    public final boolean A08;
    public volatile long A09 = -1;

    public DSC(File file, String str, long j, long j2, long j3, boolean z) {
        this.A07 = str;
        this.A05 = j;
        this.A04 = j2;
        this.A08 = z;
        this.A06 = file;
        this.A03 = j3;
    }

    /* renamed from: A00 */
    public int compareTo(DSC dsc) {
        String str = this.A07;
        String str2 = dsc.A07;
        if (!str.equals(str2)) {
            return str.compareTo(str2);
        }
        long j = this.A05 - dsc.A05;
        if (j == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        return 1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CacheSpan{");
        A10.append(this.A07);
        A10.append(" lat:");
        A10.append(this.A03);
        A10.append(" pos: ");
        A10.append(this.A05);
        A10.append(" size: ");
        A10.append(this.A04);
        return C17890vO.A0b(A10);
    }
}
