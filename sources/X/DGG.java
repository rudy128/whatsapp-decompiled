package X;

import android.util.LruCache;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.File;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

public final class DGG implements C28653ECn {
    public final LruCache A00;
    public final HashMap A01 = C17880vN.A11();
    public final HashMap A02 = C17880vN.A11();
    public final List A03 = new CopyOnWriteArrayList();

    public void BBJ(String str) {
    }

    public synchronized void BFF(File file) {
    }

    public synchronized void BFG(DSC dsc, byte[] bArr) {
        HashMap hashMap = this.A01;
        String str = dsc.A07;
        TreeSet treeSet = (TreeSet) hashMap.get(str);
        if (treeSet == null) {
            treeSet = new TreeSet();
            hashMap.put(str, treeSet);
        }
        treeSet.add(dsc);
        this.A00.put(A01(dsc), bArr);
    }

    public synchronized long BNw() {
        return (long) this.A00.size();
    }

    public synchronized NavigableSet BNz(String str) {
        TreeSet treeSet;
        TreeSet treeSet2 = (TreeSet) this.A01.get(str);
        if (treeSet2 == null) {
            treeSet = null;
        } else {
            treeSet = new TreeSet(treeSet2);
        }
        return treeSet;
    }

    public synchronized Set BTn() {
        return AnonymousClass8BR.A12(this.A01.keySet());
    }

    public synchronized long Bad(String str) {
        long j;
        Long l = (Long) this.A02.get(str);
        if (l == null) {
            j = -1;
        } else {
            j = l.longValue();
        }
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0058, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BeB(java.lang.String r11, long r12, long r14) {
        /*
            r10 = this;
            r9 = r10
            monitor-enter(r9)
            java.util.HashMap r0 = r10.A01     // Catch:{ all -> 0x005a }
            java.lang.Object r7 = r0.get(r11)     // Catch:{ all -> 0x005a }
            java.util.TreeSet r7 = (java.util.TreeSet) r7     // Catch:{ all -> 0x005a }
            r6 = 0
            if (r7 == 0) goto L_0x0057
            X.DSC r0 = X.C26214Cut.A02(r11, r12)     // Catch:{ all -> 0x005a }
            java.lang.Object r5 = r7.floor(r0)     // Catch:{ all -> 0x005a }
            X.DSC r5 = (X.DSC) r5     // Catch:{ all -> 0x005a }
            if (r5 == 0) goto L_0x0057
            long r1 = r5.A05     // Catch:{ all -> 0x005a }
            long r3 = r5.A04     // Catch:{ all -> 0x005a }
            long r1 = r1 + r3
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0057
            long r12 = r12 + r14
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x002c
            boolean r0 = r10.A02(r5)     // Catch:{ all -> 0x005a }
            goto L_0x0055
        L_0x002c:
            java.util.NavigableSet r0 = r7.tailSet(r5, r6)     // Catch:{ all -> 0x005a }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x005a }
        L_0x0034:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x0057
            java.lang.Object r7 = r8.next()     // Catch:{ all -> 0x005a }
            X.DSC r7 = (X.DSC) r7     // Catch:{ all -> 0x005a }
            long r5 = r7.A05     // Catch:{ all -> 0x005a }
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0057
            long r3 = r7.A04     // Catch:{ all -> 0x005a }
            long r5 = r5 + r3
            long r1 = java.lang.Math.max(r1, r5)     // Catch:{ all -> 0x005a }
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x0034
            boolean r0 = r10.A02(r7)     // Catch:{ all -> 0x005a }
        L_0x0055:
            monitor-exit(r9)
            return r0
        L_0x0057:
            monitor-exit(r9)
            r0 = 0
            return r0
        L_0x005a:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DGG.BeB(java.lang.String, long, long):boolean");
    }

    public boolean BfM(String str) {
        return true;
    }

    public synchronized byte[] CDR(DSC dsc) {
        return (byte[]) this.A00.get(A01(dsc));
    }

    public synchronized void CEG(DSC dsc) {
    }

    public synchronized void CF0(DSC dsc) {
        CF1(dsc, "not_provided");
    }

    public synchronized void CF1(DSC dsc, String str) {
        HashMap hashMap = this.A01;
        String str2 = dsc.A07;
        TreeSet treeSet = (TreeSet) hashMap.get(str2);
        if (treeSet != null) {
            treeSet.remove(dsc);
            if (treeSet.isEmpty()) {
                hashMap.remove(str2);
                this.A02.remove(str2);
            }
        }
        this.A00.remove(A01(dsc));
    }

    public synchronized void CLA(String str, long j) {
        this.A02.put(str, Long.valueOf(j));
    }

    public synchronized File CNo(String str, long j, long j2) {
        return null;
    }

    public synchronized DSC CO7(Integer num, String str, long j) {
        return A00(C26214Cut.A02(str, j));
    }

    public synchronized DSC CO8(Integer num, String str, long j, long j2) {
        return A00(C26214Cut.A02(str, j));
    }

    public synchronized DSC CO9(Integer num, String str, long j) {
        return A00(C26214Cut.A02(str, j));
    }

    private DSC A00(DSC dsc) {
        DSC dsc2 = dsc;
        String str = dsc2.A07;
        long j = dsc2.A05;
        TreeSet treeSet = (TreeSet) this.A01.get(str);
        if (treeSet != null) {
            DSC dsc3 = (DSC) treeSet.floor(dsc2);
            if (dsc3 != null) {
                long j2 = dsc3.A05;
                if (j2 <= j && j < j2 + dsc3.A04) {
                    if (A02(dsc3)) {
                        return dsc3;
                    }
                    return A00(dsc2);
                }
            }
            DSC dsc4 = (DSC) treeSet.ceiling(dsc2);
            if (dsc4 != null) {
                return new DSC((File) null, str, j, dsc4.A05 - j, -1, false);
            }
        }
        return new DSC((File) null, str, j, -1, -1, false);
    }

    public DGG(int i) {
        int i2 = i * EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
        C22635BGv bGv = new C22635BGv(this, i2, 0);
        this.A00 = bGv;
        bGv.maxSize();
    }

    public static String A01(DSC dsc) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(dsc.A07);
        A10.append(".");
        return C17880vN.A0u(A10, dsc.A05);
    }

    private boolean A02(DSC dsc) {
        if (this.A00.get(A01(dsc)) != null) {
            return true;
        }
        ((AbstractCollection) this.A01.get(dsc.A07)).remove(dsc);
        return false;
    }
}
