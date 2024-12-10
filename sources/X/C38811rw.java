package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Comparator;

/* renamed from: X.1rw  reason: invalid class name and case insensitive filesystem */
public final class C38811rw implements Runnable {
    public static Comparator A04 = new AnonymousClass3D1(0);
    public static final ThreadLocal A05 = new ThreadLocal();
    public long A00;
    public long A01;
    public ArrayList A02 = new ArrayList();
    public ArrayList A03 = new ArrayList();

    public static C42011xT A00(RecyclerView recyclerView, int i, long j) {
        C38151qm r4 = recyclerView.A08;
        int A042 = r4.A04();
        for (int i2 = 0; i2 < A042; i2++) {
            C42011xT A022 = RecyclerView.A02(r4.A07(i2));
            if (A022.A04 == i && (A022.A00 & 4) == 0) {
                return null;
            }
        }
        C37931qQ r42 = recyclerView.A0v;
        try {
            recyclerView.A01++;
            C42011xT A032 = r42.A03(i, j);
            if (A032 != null) {
                int i3 = A032.A00;
                if ((i3 & 1) == 0 || (i3 & 4) != 0) {
                    r42.A0B(A032, false);
                } else {
                    r42.A07(A032.A0H);
                }
            }
            return A032;
        } finally {
            recyclerView.A0w(false);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: X.2fH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: X.2fH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: X.2fH} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r18 = this;
            r2 = 0
            r6 = r18
            java.lang.String r1 = "RV Prefetch"
            java.lang.reflect.Method r0 = X.AnonymousClass1CH.A03     // Catch:{ all -> 0x0166 }
            android.os.Trace.beginSection(r1)     // Catch:{ all -> 0x0166 }
            java.util.ArrayList r12 = r6.A02     // Catch:{ all -> 0x0166 }
            boolean r0 = r12.isEmpty()     // Catch:{ all -> 0x0166 }
            if (r0 != 0) goto L_0x0160
            int r8 = r12.size()     // Catch:{ all -> 0x0166 }
            r7 = 0
            r4 = 0
        L_0x001a:
            if (r7 >= r8) goto L_0x0033
            java.lang.Object r1 = r12.get(r7)     // Catch:{ all -> 0x0166 }
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1     // Catch:{ all -> 0x0166 }
            int r0 = r1.getWindowVisibility()     // Catch:{ all -> 0x0166 }
            if (r0 != 0) goto L_0x0030
            long r0 = r1.getDrawingTime()     // Catch:{ all -> 0x0166 }
            long r4 = java.lang.Math.max(r0, r4)     // Catch:{ all -> 0x0166 }
        L_0x0030:
            int r7 = r7 + 1
            goto L_0x001a
        L_0x0033:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0160
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0166 }
            long r4 = r0.toNanos(r4)     // Catch:{ all -> 0x0166 }
            long r0 = r6.A00     // Catch:{ all -> 0x0166 }
            long r4 = r4 + r0
            int r17 = r12.size()     // Catch:{ all -> 0x0166 }
            r9 = 0
            r7 = 0
            r8 = 0
        L_0x0047:
            r0 = r17
            if (r7 >= r0) goto L_0x0062
            java.lang.Object r1 = r12.get(r7)     // Catch:{ all -> 0x0166 }
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1     // Catch:{ all -> 0x0166 }
            int r0 = r1.getWindowVisibility()     // Catch:{ all -> 0x0166 }
            if (r0 != 0) goto L_0x005f
            X.1qY r0 = r1.A09     // Catch:{ all -> 0x0166 }
            r0.A00(r1, r9)     // Catch:{ all -> 0x0166 }
            int r0 = r0.A00     // Catch:{ all -> 0x0166 }
            int r8 = r8 + r0
        L_0x005f:
            int r7 = r7 + 1
            goto L_0x0047
        L_0x0062:
            java.util.ArrayList r7 = r6.A03     // Catch:{ all -> 0x0166 }
            r7.ensureCapacity(r8)     // Catch:{ all -> 0x0166 }
            r13 = 0
            r11 = 0
        L_0x0069:
            r0 = r17
            if (r13 >= r0) goto L_0x00c4
            java.lang.Object r14 = r12.get(r13)     // Catch:{ all -> 0x0166 }
            androidx.recyclerview.widget.RecyclerView r14 = (androidx.recyclerview.widget.RecyclerView) r14     // Catch:{ all -> 0x0166 }
            int r0 = r14.getWindowVisibility()     // Catch:{ all -> 0x0166 }
            if (r0 != 0) goto L_0x00c1
            X.1qY r10 = r14.A09     // Catch:{ all -> 0x0166 }
            int r0 = r10.A01     // Catch:{ all -> 0x0166 }
            int r9 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x0166 }
            int r0 = r10.A02     // Catch:{ all -> 0x0166 }
            int r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x0166 }
            int r9 = r9 + r0
            r8 = 0
        L_0x0089:
            int r0 = r10.A00     // Catch:{ all -> 0x0166 }
            int r0 = r0 * 2
            if (r8 >= r0) goto L_0x00c1
            int r0 = r7.size()     // Catch:{ all -> 0x0166 }
            if (r11 < r0) goto L_0x00ba
            X.2fH r1 = new X.2fH     // Catch:{ all -> 0x0166 }
            r1.<init>()     // Catch:{ all -> 0x0166 }
            r7.add(r1)     // Catch:{ all -> 0x0166 }
        L_0x009d:
            int[] r0 = r10.A03     // Catch:{ all -> 0x0166 }
            r16 = r0
            int r0 = r8 + 1
            r15 = r16[r0]     // Catch:{ all -> 0x0166 }
            r0 = 0
            if (r15 > r9) goto L_0x00a9
            r0 = 1
        L_0x00a9:
            r1.A04 = r0     // Catch:{ all -> 0x0166 }
            r1.A02 = r9     // Catch:{ all -> 0x0166 }
            r1.A00 = r15     // Catch:{ all -> 0x0166 }
            r1.A03 = r14     // Catch:{ all -> 0x0166 }
            r0 = r16[r8]     // Catch:{ all -> 0x0166 }
            r1.A01 = r0     // Catch:{ all -> 0x0166 }
            int r11 = r11 + 1
            int r8 = r8 + 2
            goto L_0x0089
        L_0x00ba:
            java.lang.Object r1 = r7.get(r11)     // Catch:{ all -> 0x0166 }
            X.2fH r1 = (X.C55142fH) r1     // Catch:{ all -> 0x0166 }
            goto L_0x009d
        L_0x00c1:
            int r13 = r13 + 1
            goto L_0x0069
        L_0x00c4:
            java.util.Comparator r0 = A04     // Catch:{ all -> 0x0166 }
            java.util.Collections.sort(r7, r0)     // Catch:{ all -> 0x0166 }
            r9 = 0
        L_0x00ca:
            int r0 = r7.size()     // Catch:{ all -> 0x0166 }
            if (r9 >= r0) goto L_0x0160
            java.lang.Object r8 = r7.get(r9)     // Catch:{ all -> 0x0166 }
            X.2fH r8 = (X.C55142fH) r8     // Catch:{ all -> 0x0166 }
            androidx.recyclerview.widget.RecyclerView r0 = r8.A03     // Catch:{ all -> 0x0166 }
            if (r0 == 0) goto L_0x0160
            boolean r0 = r8.A04     // Catch:{ all -> 0x0166 }
            if (r0 == 0) goto L_0x00e4
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x00e5
        L_0x00e4:
            r0 = r4
        L_0x00e5:
            androidx.recyclerview.widget.RecyclerView r11 = r8.A03     // Catch:{ all -> 0x0166 }
            int r10 = r8.A01     // Catch:{ all -> 0x0166 }
            X.1xT r0 = A00(r11, r10, r0)     // Catch:{ all -> 0x0166 }
            if (r0 == 0) goto L_0x014b
            java.lang.ref.WeakReference r10 = r0.A0C     // Catch:{ all -> 0x0166 }
            if (r10 == 0) goto L_0x014b
            int r1 = r0.A00     // Catch:{ all -> 0x0166 }
            r0 = r1 & 1
            if (r0 == 0) goto L_0x014b
            r0 = r1 & 4
            if (r0 != 0) goto L_0x014b
            java.lang.Object r11 = r10.get()     // Catch:{ all -> 0x0166 }
            androidx.recyclerview.widget.RecyclerView r11 = (androidx.recyclerview.widget.RecyclerView) r11     // Catch:{ all -> 0x0166 }
            if (r11 == 0) goto L_0x014b
            boolean r0 = r11.A0O     // Catch:{ all -> 0x0166 }
            if (r0 == 0) goto L_0x0114
            X.1qm r0 = r11.A08     // Catch:{ all -> 0x0166 }
            int r0 = r0.A04()     // Catch:{ all -> 0x0166 }
            if (r0 == 0) goto L_0x0114
            r11.A0a()     // Catch:{ all -> 0x0166 }
        L_0x0114:
            X.1qY r10 = r11.A09     // Catch:{ all -> 0x0166 }
            r0 = 1
            r10.A00(r11, r0)     // Catch:{ all -> 0x0166 }
            int r0 = r10.A00     // Catch:{ all -> 0x0166 }
            if (r0 == 0) goto L_0x014b
            java.lang.String r0 = "RV Nested Prefetch"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x015b }
            X.1qZ r12 = r11.A0w     // Catch:{ all -> 0x015b }
            X.1rD r1 = r11.A0B     // Catch:{ all -> 0x015b }
            r0 = 1
            r12.A04 = r0     // Catch:{ all -> 0x015b }
            int r0 = r1.A0Q()     // Catch:{ all -> 0x015b }
            r12.A03 = r0     // Catch:{ all -> 0x015b }
            r0 = 0
            r12.A08 = r0     // Catch:{ all -> 0x015b }
            r12.A0D = r0     // Catch:{ all -> 0x015b }
            r12.A09 = r0     // Catch:{ all -> 0x015b }
            r1 = 0
        L_0x0138:
            int r0 = r10.A00     // Catch:{ all -> 0x015b }
            int r0 = r0 * 2
            if (r1 >= r0) goto L_0x0148
            int[] r0 = r10.A03     // Catch:{ all -> 0x015b }
            r0 = r0[r1]     // Catch:{ all -> 0x015b }
            A00(r11, r0, r4)     // Catch:{ all -> 0x015b }
            int r1 = r1 + 2
            goto L_0x0138
        L_0x0148:
            android.os.Trace.endSection()     // Catch:{ all -> 0x0166 }
        L_0x014b:
            r1 = 0
            r8.A04 = r1     // Catch:{ all -> 0x0166 }
            r8.A02 = r1     // Catch:{ all -> 0x0166 }
            r8.A00 = r1     // Catch:{ all -> 0x0166 }
            r0 = 0
            r8.A03 = r0     // Catch:{ all -> 0x0166 }
            r8.A01 = r1     // Catch:{ all -> 0x0166 }
            int r9 = r9 + 1
            goto L_0x00ca
        L_0x015b:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch:{ all -> 0x0166 }
            throw r0     // Catch:{ all -> 0x0166 }
        L_0x0160:
            r6.A01 = r2
            android.os.Trace.endSection()
            return
        L_0x0166:
            r1 = move-exception
            r6.A01 = r2
            java.lang.reflect.Method r0 = X.AnonymousClass1CH.A03
            android.os.Trace.endSection()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38811rw.run():void");
    }
}
