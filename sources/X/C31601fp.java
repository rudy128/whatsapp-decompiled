package X;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;

/* renamed from: X.1fp  reason: invalid class name and case insensitive filesystem */
public class C31601fp {
    public final C31561fl A00;
    public final C220418j A01;
    public final Random A02;

    public static InputStream A00(C62662rl r1, C61692q6 r2) {
        boolean z = r2.A02;
        InputStream inputStream = r1.A00.getInputStream();
        if (z) {
            return new C24177Bwn(inputStream);
        }
        return inputStream;
    }

    public static OutputStream A01(C62662rl r1, C61692q6 r2) {
        boolean z = r2.A02;
        OutputStream outputStream = r1.A00.getOutputStream();
        if (z) {
            return new C24181Bwr(outputStream);
        }
        return outputStream;
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [X.An0, X.9A7] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C62662rl A02(X.C61692q6 r11) {
        /*
            r10 = this;
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.net.InetAddress[] r2 = r11.A05
            int r8 = r2.length
            r4 = 0
        L_0x000e:
            if (r4 >= r8) goto L_0x0024
            r3 = r2[r4]
            byte[] r0 = r3.getAddress()
            int r1 = r0.length
            r0 = 4
            if (r1 <= r0) goto L_0x0020
            r6.add(r3)
        L_0x001d:
            int r4 = r4 + 1
            goto L_0x000e
        L_0x0020:
            r7.add(r3)
            goto L_0x001d
        L_0x0024:
            boolean r5 = r11.A04
            r4 = 0
            if (r5 == 0) goto L_0x0047
            X.18j r9 = r10.A01
            monitor-enter(r9)
            X.9A7 r3 = r9.A00     // Catch:{ all -> 0x0044 }
            if (r3 != 0) goto L_0x0049
            X.118 r0 = r9.A06     // Catch:{ all -> 0x0044 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x0044 }
            X.00H r0 = r9.A0G     // Catch:{ all -> 0x0044 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0044 }
            X.9mA r0 = (X.C191189mA) r0     // Catch:{ all -> 0x0044 }
            X.9A7 r3 = new X.9A7     // Catch:{ all -> 0x0044 }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x0044 }
            r9.A00 = r3     // Catch:{ all -> 0x0044 }
            goto L_0x0049
        L_0x0044:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x0047:
            r3 = r4
            goto L_0x004a
        L_0x0049:
            monitor-exit(r9)
        L_0x004a:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0092
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0092
            java.util.Random r2 = r10.A02
            int r0 = r7.size()
            int r0 = r2.nextInt(r0)
            java.lang.Object r1 = r7.get(r0)
            java.net.InetAddress r1 = (java.net.InetAddress) r1
            int r0 = r11.A01
            java.net.InetSocketAddress r4 = new java.net.InetSocketAddress
            r4.<init>(r1, r0)
            int r0 = r6.size()
            int r0 = r2.nextInt(r0)
            java.lang.Object r1 = r6.get(r0)
            java.net.InetAddress r1 = (java.net.InetAddress) r1
            int r0 = r11.A01
            java.net.InetSocketAddress r2 = new java.net.InetSocketAddress
            r2.<init>(r1, r0)
            java.lang.String r0 = "ConnectionSocketFactory/try_connect/using-happyEyeball"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1fl r0 = r10.A00
            int r1 = r11.A00
            X.1fm r0 = r0.A00
            X.2rl r0 = r0.CPv(r4, r2, r3, r1)
            return r0
        L_0x0092:
            r7.isEmpty()
            r6.isEmpty()
            X.C17960vV.A07(r2)
            java.util.Random r0 = r10.A02
            int r0 = r0.nextInt(r8)
            r1 = r2[r0]
            int r0 = r11.A01
            java.net.InetSocketAddress r2 = new java.net.InetSocketAddress
            r2.<init>(r1, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ConnectionSocketFactory/try_connect "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " (secureSocket? "
            r1.append(r0)
            r1.append(r5)
            r0 = 41
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r0 = r11.A00
            X.2rl r0 = X.C31561fl.A00(r4, r2, r3, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31601fp.A02(X.2q6):X.2rl");
    }

    public C31601fp(C31561fl r1, C220418j r2, Random random) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = random;
    }
}
