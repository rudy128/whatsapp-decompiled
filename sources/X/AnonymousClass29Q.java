package X;

import android.os.Process;
import java.nio.CharBuffer;

/* renamed from: X.29Q  reason: invalid class name */
public class AnonymousClass29Q extends C191989nW {
    public static final long A02 = ((long) Process.myUid());
    public static final CharBuffer A03 = CharBuffer.wrap("dummy0");
    public static final CharBuffer A04 = CharBuffer.wrap("lo");
    public static final CharBuffer A05 = CharBuffer.wrap("wlan0");
    public AnonymousClass1A1 A00;
    public final CharBuffer A01 = CharBuffer.allocate(128);

    public boolean A02() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a7, code lost:
        if (A04.compareTo(r3) != 0) goto L_0x00a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0098 A[Catch:{ 19l -> 0x010f }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00af A[Catch:{ 19l -> 0x010f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03(long[] r12) {
        /*
            r11 = this;
            r10 = 0
            X.1A1 r1 = r11.A00     // Catch:{ 19l -> 0x010f }
            if (r1 != 0) goto L_0x000e
            java.lang.String r0 = "/proc/net/xt_qtaguid/stats"
            X.1A1 r1 = new X.1A1     // Catch:{ 19l -> 0x010f }
            r1.<init>(r0)     // Catch:{ 19l -> 0x010f }
            r11.A00 = r1     // Catch:{ 19l -> 0x010f }
        L_0x000e:
            r1.A04()     // Catch:{ 19l -> 0x010f }
            X.1A1 r1 = r11.A00     // Catch:{ 19l -> 0x010f }
            boolean r0 = r1.A02     // Catch:{ 19l -> 0x010f }
            if (r0 == 0) goto L_0x010e
            boolean r0 = r1.A07()     // Catch:{ 19l -> 0x010f }
            if (r0 == 0) goto L_0x010e
            r1 = 0
            java.util.Arrays.fill(r12, r1)     // Catch:{ 19l -> 0x010f }
            X.1A1 r0 = r11.A00     // Catch:{ 19l -> 0x010f }
            r0.A05()     // Catch:{ 19l -> 0x010f }
        L_0x0027:
            X.1A1 r0 = r11.A00     // Catch:{ 19l -> 0x010f }
            boolean r0 = r0.A07()     // Catch:{ 19l -> 0x010f }
            r9 = 1
            if (r0 == 0) goto L_0x010d
            X.1A1 r0 = r11.A00     // Catch:{ 19l -> 0x010f }
            r0.A06()     // Catch:{ 19l -> 0x010f }
            X.1A1 r6 = r11.A00     // Catch:{ 19l -> 0x010f }
            java.nio.CharBuffer r3 = r11.A01     // Catch:{ 19l -> 0x010f }
            r5 = r3
            r3.clear()     // Catch:{ 19l -> 0x010f }
            r4 = 1
        L_0x003e:
            boolean r0 = r6.A07()     // Catch:{ 19l -> 0x010f }
            if (r0 == 0) goto L_0x0070
            X.AnonymousClass1A1.A00(r6)     // Catch:{ 19l -> 0x010f }
            char r0 = r6.A00     // Catch:{ 19l -> 0x010f }
            boolean r0 = java.lang.Character.isWhitespace(r0)     // Catch:{ 19l -> 0x010f }
            if (r0 != 0) goto L_0x006d
            boolean r0 = r5.hasRemaining()     // Catch:{ 19l -> 0x010f }
            if (r0 != 0) goto L_0x0066
            int r0 = r5.capacity()     // Catch:{ 19l -> 0x010f }
            int r0 = r0 * 2
            java.nio.CharBuffer r0 = java.nio.CharBuffer.allocate(r0)     // Catch:{ 19l -> 0x010f }
            r5.flip()     // Catch:{ 19l -> 0x010f }
            r0.put(r5)     // Catch:{ 19l -> 0x010f }
            r5 = r0
        L_0x0066:
            char r0 = r6.A00     // Catch:{ 19l -> 0x010f }
            r5.put(r0)     // Catch:{ 19l -> 0x010f }
            r4 = 0
            goto L_0x003e
        L_0x006d:
            if (r4 != 0) goto L_0x00fd
            goto L_0x0074
        L_0x0070:
            if (r4 == 0) goto L_0x0077
            goto L_0x0105
        L_0x0074:
            X.AnonymousClass1A1.A01(r6)     // Catch:{ 19l -> 0x010f }
        L_0x0077:
            r5.flip()     // Catch:{ 19l -> 0x010f }
            X.1A1 r0 = r11.A00     // Catch:{ 19l -> 0x010f }
            r0.A06()     // Catch:{ 19l -> 0x010f }
            X.1A1 r0 = r11.A00     // Catch:{ 19l -> 0x010f }
            r0.A06()     // Catch:{ 19l -> 0x010f }
            X.1A1 r0 = r11.A00     // Catch:{ 19l -> 0x010f }
            long r7 = r0.A02()     // Catch:{ 19l -> 0x010f }
            X.1A1 r0 = r11.A00     // Catch:{ 19l -> 0x010f }
            r0.A06()     // Catch:{ 19l -> 0x010f }
            java.nio.CharBuffer r0 = A05     // Catch:{ 19l -> 0x010f }
            int r0 = r0.compareTo(r3)     // Catch:{ 19l -> 0x010f }
            r6 = 1
            if (r0 == 0) goto L_0x00b0
            r6 = 0
            java.nio.CharBuffer r0 = A03     // Catch:{ 19l -> 0x010f }
            int r0 = r0.compareTo(r3)     // Catch:{ 19l -> 0x010f }
            if (r0 == 0) goto L_0x00b0
            java.nio.CharBuffer r0 = A04     // Catch:{ 19l -> 0x010f }
            int r0 = r0.compareTo(r3)     // Catch:{ 19l -> 0x010f }
            if (r0 == 0) goto L_0x00b0
        L_0x00a9:
            long r3 = A02     // Catch:{ 19l -> 0x010f }
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00f6
            goto L_0x00b2
        L_0x00b0:
            r9 = 0
            goto L_0x00a9
        L_0x00b2:
            if (r6 != 0) goto L_0x00b7
            if (r9 != 0) goto L_0x00b7
            goto L_0x00f6
        L_0x00b7:
            X.1A1 r0 = r11.A00     // Catch:{ 19l -> 0x010f }
            long r4 = r0.A02()     // Catch:{ 19l -> 0x010f }
            X.1A1 r0 = r11.A00     // Catch:{ 19l -> 0x010f }
            r0.A06()     // Catch:{ 19l -> 0x010f }
            r7 = 2
            if (r6 == 0) goto L_0x00c6
            r7 = 0
        L_0x00c6:
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            r0 = 0
            if (r3 != 0) goto L_0x00cc
            r0 = 4
        L_0x00cc:
            r7 = r7 | r0
            r5 = r12[r7]     // Catch:{ 19l -> 0x010f }
            X.1A1 r0 = r11.A00     // Catch:{ 19l -> 0x010f }
            long r3 = r0.A02()     // Catch:{ 19l -> 0x010f }
            long r5 = r5 + r3
            r12[r7] = r5     // Catch:{ 19l -> 0x010f }
            X.1A1 r0 = r11.A00     // Catch:{ 19l -> 0x010f }
            r0.A06()     // Catch:{ 19l -> 0x010f }
            X.1A1 r0 = r11.A00     // Catch:{ 19l -> 0x010f }
            r0.A06()     // Catch:{ 19l -> 0x010f }
            r7 = r7 | 1
            r5 = r12[r7]     // Catch:{ 19l -> 0x010f }
            X.1A1 r0 = r11.A00     // Catch:{ 19l -> 0x010f }
            long r3 = r0.A02()     // Catch:{ 19l -> 0x010f }
            long r5 = r5 + r3
            r12[r7] = r5     // Catch:{ 19l -> 0x010f }
            X.1A1 r0 = r11.A00     // Catch:{ 19l -> 0x010f }
            r0.A05()     // Catch:{ 19l -> 0x010f }
            goto L_0x0027
        L_0x00f6:
            X.1A1 r0 = r11.A00     // Catch:{ 19l -> 0x010f }
            r0.A05()     // Catch:{ 19l -> 0x010f }
            goto L_0x0027
        L_0x00fd:
            java.lang.String r0 = "Couldn't read string!"
            X.19l r1 = new X.19l     // Catch:{ 19l -> 0x010f }
            r1.<init>(r0)     // Catch:{ 19l -> 0x010f }
            goto L_0x010c
        L_0x0105:
            java.lang.String r0 = "Couldn't read string because file ended!"
            X.19l r1 = new X.19l     // Catch:{ 19l -> 0x010f }
            r1.<init>(r0)     // Catch:{ 19l -> 0x010f }
        L_0x010c:
            throw r1     // Catch:{ 19l -> 0x010f }
        L_0x010d:
            return r9
        L_0x010e:
            return r10
        L_0x010f:
            r2 = move-exception
            java.lang.String r1 = "QTagUidNetworkBytesCollector"
            java.lang.String r0 = "Unable to parse file"
            android.util.Log.e(r1, r0, r2)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass29Q.A03(long[]):boolean");
    }
}
