package X;

import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import com.facebook.debug.tracer.Tracer;
import com.facebook.systrace.Systrace;
import java.io.File;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: X.D9v  reason: case insensitive filesystem */
public abstract class C26697D9v implements EA9 {
    public long A00 = 0;
    public Object A01 = C17880vN.A0p();
    public boolean A02;
    public int A03;
    public long A04;
    public long A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final C28652ECm A0E;
    public final ArrayList A0F;
    public final HashMap A0G;
    public final HashMap A0H;
    public final HashMap A0I;
    public final Handler A0J;
    public final File A0K;
    public final HashMap A0L;
    public final Random A0M;
    public final Set A0N;

    public void A07() {
        C22924BVm bVm = (C22924BVm) this;
        Iterator A0i = C17890vO.A0i(bVm.A0G);
        while (A0i.hasNext()) {
            Iterator it = ((AbstractCollection) C17890vO.A0P(A0i)).iterator();
            boolean z = true;
            while (it.hasNext()) {
                DSC dsc = (DSC) it.next();
                if (!dsc.A06.exists()) {
                    it.remove();
                    if (dsc.A08) {
                        bVm.A00 -= dsc.A04;
                    }
                    bVm.A09(dsc, "file_removed");
                } else {
                    z = false;
                }
            }
            if (z) {
                A0i.remove();
            }
        }
    }

    public synchronized void BBJ(String str) {
        Set set = this.A0N;
        if (set != null) {
            set.add(str);
        }
    }

    public synchronized void BFF(File file) {
        DSC A002 = C26214Cut.A00(file, 0, 0, false, false);
        C26056CrS.A03(AnonymousClass000.A1W(A002));
        C26056CrS.A03(this.A0L.containsKey(A002.A07));
        if (file.exists()) {
            if (file.length() == 0) {
                file.delete();
            } else {
                A02(A002);
                notifyAll();
            }
        }
    }

    public synchronized long BNw() {
        return this.A00;
    }

    public synchronized NavigableSet BNz(String str) {
        TreeSet treeSet;
        TreeSet treeSet2 = (TreeSet) this.A0G.get(str);
        if (treeSet2 == null) {
            treeSet = null;
        } else {
            treeSet = new TreeSet(treeSet2);
        }
        return treeSet;
    }

    public synchronized Set BTn() {
        return AnonymousClass8BR.A12(this.A0G.keySet());
    }

    public synchronized void CEG(DSC dsc) {
        C26056CrS.A03(AnonymousClass000.A1Z(dsc, this.A0L.remove(dsc.A07)));
        notifyAll();
    }

    private DSC A00(DSC dsc) {
        DSC dsc2 = dsc;
        String str = dsc2.A07;
        long j = dsc2.A05;
        TreeSet treeSet = (TreeSet) this.A0G.get(str);
        if (treeSet != null) {
            DSC dsc3 = (DSC) treeSet.floor(dsc2);
            if (dsc3 != null) {
                long j2 = dsc3.A05;
                if (j2 <= j && j < j2 + dsc3.A04) {
                    if (dsc3.A06.exists()) {
                        return dsc3;
                    }
                    A07();
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

    public static synchronized DSC A01(DSC dsc, C26697D9v d9v, Integer num) {
        C26697D9v d9v2 = d9v;
        synchronized (d9v2) {
            try {
                C25304Cd8.A01("exo-startReadWriteNonBlocking");
                DSC A002 = d9v2.A00(dsc);
                if (A002.A08) {
                    HashMap hashMap = d9v2.A0G;
                    String str = A002.A07;
                    TreeSet treeSet = (TreeSet) hashMap.get(str);
                    if (treeSet == null || !treeSet.remove(A002)) {
                        C28652ECm eCm = d9v2.A0E;
                        if (eCm != null) {
                            eCm.Bt8((int) A002.A05, (int) A002.A04, "startReadWriteNonBlocking", str);
                        }
                        Iterator it = d9v2.A0F.iterator();
                        while (it.hasNext()) {
                            ((C28652ECm) it.next()).Bt8((int) A002.A05, (int) A002.A04, "startReadWriteNonBlocking", str);
                        }
                    }
                    boolean z = d9v2.A0A;
                    long currentTimeMillis = System.currentTimeMillis();
                    File file = A002.A06;
                    File parentFile = file.getParentFile();
                    long j = A002.A05;
                    File A032 = C26214Cut.A03(parentFile, str, j, currentTimeMillis, z);
                    file.renameTo(A032);
                    DSC A012 = C26214Cut.A01(A032, str, j, currentTimeMillis, 0);
                    treeSet.add(A012);
                    ArrayList arrayList = (ArrayList) d9v2.A0I.get(str);
                    Integer num2 = num;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        while (true) {
                            size--;
                            if (size < 0) {
                                break;
                            }
                            ((C28571E8c) arrayList.get(size)).C63(d9v2, A002, A012, num2);
                        }
                    }
                    C28652ECm eCm2 = d9v2.A0E;
                    if (eCm2 != null) {
                        eCm2.C63(d9v2, A002, A012, num2);
                    }
                    Iterator it2 = d9v2.A0F.iterator();
                    while (it2.hasNext()) {
                        ((C28571E8c) it2.next()).C63(d9v2, A002, A012, num2);
                    }
                    C25304Cd8.A00();
                    return A012;
                }
                HashMap hashMap2 = d9v2.A0L;
                String str2 = dsc.A07;
                if (!hashMap2.containsKey(str2)) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    A002.A01 = elapsedRealtime;
                    A002.A09 = elapsedRealtime;
                    hashMap2.put(str2, A002);
                    C25304Cd8.A00();
                    return A002;
                }
                C25304Cd8.A00();
                return null;
            } catch (Throwable th) {
                C25304Cd8.A00();
                throw th;
            }
        }
    }

    private void A02(DSC dsc) {
        HashMap hashMap = this.A0G;
        String str = dsc.A07;
        AbstractCollection abstractCollection = (AbstractCollection) hashMap.get(str);
        if (abstractCollection == null) {
            abstractCollection = new TreeSet();
            hashMap.put(str, abstractCollection);
        }
        abstractCollection.add(dsc);
        this.A00 += dsc.A04;
        AbstractList abstractList = (AbstractList) this.A0I.get(str);
        if (abstractList != null) {
            int size = abstractList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((C28571E8c) abstractList.get(size)).C61(this, dsc);
            }
        }
        C28652ECm eCm = this.A0E;
        if (eCm != null) {
            eCm.C61(this, dsc);
        }
        Iterator it = this.A0F.iterator();
        while (it.hasNext()) {
            ((C28571E8c) it.next()).C61(this, dsc);
        }
    }

    public static void A03(C26697D9v d9v) {
        try {
            C25304Cd8.A01("VPS-SimpleCacheInit");
            File file = d9v.A0K;
            if (!file.exists()) {
                file.mkdirs();
            }
            if (!d9v.A0C) {
                d9v.A04(file, true);
            } else if (Build.VERSION.SDK_INT >= 26) {
                d9v.A06(file.toPath(), true);
            } else {
                d9v.A05(file, true);
            }
        } finally {
            C25304Cd8.A00();
        }
    }

    private void A05(File file, boolean z) {
        File file2 = file;
        File[] listFiles = file2.listFiles();
        if (listFiles != null) {
            if (z || listFiles.length != 0) {
                int length = listFiles.length;
                DSC dsc = null;
                for (int i = 0; i < length; i++) {
                    File file3 = listFiles[i];
                    if (file3.getName().indexOf(46) == -1) {
                        A05(file3, false);
                    } else {
                        long length2 = file3.length();
                        if (length2 == 0) {
                            C27076DTa.A00(this.A0J, this, file3, 26);
                        } else {
                            if (!this.A08) {
                                file3 = C26214Cut.A04(file3, this.A0A);
                            }
                            if (this.A09) {
                                dsc = C26214Cut.A00(file3, length2, -9223372036854775807L, this.A0A, this.A0B);
                            } else {
                                dsc = C26214Cut.A00(file3, 0, -9223372036854775807L, this.A0A, this.A0B);
                            }
                        }
                        if (dsc == null) {
                            C27076DTa.A00(this.A0J, this, file3, 26);
                        } else {
                            A02(dsc);
                        }
                    }
                }
                return;
            }
            C27076DTa.A00(this.A0J, this, file2, 26);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00b2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A06(java.nio.file.Path r19, boolean r20) {
        /*
            r18 = this;
            r5 = r19
            java.nio.file.DirectoryStream r10 = java.nio.file.Files.newDirectoryStream(r5)     // Catch:{ IOException -> 0x00bb }
            if (r10 != 0) goto L_0x0009
            return
        L_0x0009:
            java.util.Iterator r9 = r10.iterator()     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            r4 = 0
            r7 = 0
            r8 = 0
        L_0x0010:
            boolean r0 = r9.hasNext()     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            r3 = r18
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r2 = r9.next()     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            java.nio.file.Path r2 = (java.nio.file.Path) r2     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            int r8 = r8 + 1
            java.nio.file.Path r0 = r2.getFileName()     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            java.lang.String r1 = r0.toString()     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            r0 = 46
            int r1 = r1.indexOf(r0)     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            r0 = -1
            if (r1 != r0) goto L_0x0035
            r3.A06(r2, r4)     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            goto L_0x0010
        L_0x0035:
            java.io.File r0 = r2.toFile()     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            long r12 = r0.length()     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            long r0 = r3.A04     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            int r6 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r6 > 0) goto L_0x004e
            android.os.Handler r1 = r3.A0J     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            X.DT2 r0 = new X.DT2     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            r0.<init>(r3, r2)     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            r1.post(r0)     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            goto L_0x0091
        L_0x004e:
            boolean r0 = r3.A08     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            if (r0 != 0) goto L_0x0060
            java.io.File r1 = r2.toFile()     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            boolean r0 = r3.A0A     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            java.io.File r0 = X.C26214Cut.A04(r1, r0)     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            java.nio.file.Path r2 = r0.toPath()     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
        L_0x0060:
            boolean r0 = r3.A09     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            if (r0 == 0) goto L_0x007a
            java.io.File r11 = r2.toFile()     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            boolean r1 = r3.A0A     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            boolean r0 = r3.A0B     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r17 = r0
            r16 = r1
            X.DSC r7 = X.C26214Cut.A00(r11, r12, r14, r16, r17)     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            goto L_0x0091
        L_0x007a:
            java.io.File r11 = r2.toFile()     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            boolean r1 = r3.A0A     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            boolean r0 = r3.A0B     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12 = 0
            r17 = r0
            r16 = r1
            X.DSC r7 = X.C26214Cut.A00(r11, r12, r14, r16, r17)     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
        L_0x0091:
            if (r7 != 0) goto L_0x009f
            android.os.Handler r1 = r3.A0J     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            X.DT2 r0 = new X.DT2     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            r0.<init>(r3, r2)     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            r1.post(r0)     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            goto L_0x0010
        L_0x009f:
            r3.A02(r7)     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            goto L_0x0010
        L_0x00a4:
            if (r20 != 0) goto L_0x00b2
            if (r8 != 0) goto L_0x00b2
            android.os.Handler r1 = r3.A0J     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            X.DT2 r0 = new X.DT2     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            r0.<init>(r3, r5)     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            r1.post(r0)     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
        L_0x00b2:
            r10.close()     // Catch:{ IOException -> 0x00bb }
            return
        L_0x00b6:
            r0 = move-exception
            r10.close()     // Catch:{ IOException -> 0x00ba }
        L_0x00ba:
            throw r0
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26697D9v.A06(java.nio.file.Path, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BeB(java.lang.String r10, long r11, long r13) {
        /*
            r9 = this;
            boolean r0 = r9.A0D
            if (r0 == 0) goto L_0x000a
            boolean r0 = r9.A02
            if (r0 != 0) goto L_0x000a
        L_0x0008:
            r0 = 0
            return r0
        L_0x000a:
            r8 = r9
            monitor-enter(r8)
            java.util.HashMap r0 = r9.A0G     // Catch:{ all -> 0x005c }
            java.lang.Object r7 = r0.get(r10)     // Catch:{ all -> 0x005c }
            java.util.TreeSet r7 = (java.util.TreeSet) r7     // Catch:{ all -> 0x005c }
            r6 = 0
            if (r7 == 0) goto L_0x0057
            X.DSC r0 = X.C26214Cut.A02(r10, r11)     // Catch:{ all -> 0x005c }
            java.lang.Object r5 = r7.floor(r0)     // Catch:{ all -> 0x005c }
            X.DSC r5 = (X.DSC) r5     // Catch:{ all -> 0x005c }
            if (r5 == 0) goto L_0x0057
            long r1 = r5.A05     // Catch:{ all -> 0x005c }
            long r3 = r5.A04     // Catch:{ all -> 0x005c }
            long r1 = r1 + r3
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0057
            long r11 = r11 + r13
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0059
            java.util.NavigableSet r0 = r7.tailSet(r5, r6)     // Catch:{ all -> 0x005c }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x005c }
        L_0x0039:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x0057
            java.lang.Object r3 = r7.next()     // Catch:{ all -> 0x005c }
            X.DSC r3 = (X.DSC) r3     // Catch:{ all -> 0x005c }
            long r5 = r3.A05     // Catch:{ all -> 0x005c }
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0057
            long r3 = r3.A04     // Catch:{ all -> 0x005c }
            long r5 = r5 + r3
            long r1 = java.lang.Math.max(r1, r5)     // Catch:{ all -> 0x005c }
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x0039
            goto L_0x0059
        L_0x0057:
            monitor-exit(r8)
            goto L_0x0008
        L_0x0059:
            monitor-exit(r8)
            r0 = 1
            return r0
        L_0x005c:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26697D9v.BeB(java.lang.String, long, long):boolean");
    }

    public boolean BfM(String str) {
        Set set = this.A0N;
        if (set == null) {
            return false;
        }
        return set.contains(str);
    }

    public synchronized File CNo(String str, long j, long j2) {
        File file;
        synchronized (this) {
            String str2 = str;
            C26056CrS.A03(this.A0L.containsKey(str2));
            File file2 = this.A0K;
            if (!file2.exists()) {
                A07();
                file2.mkdirs();
            }
            C28652ECm eCm = this.A0E;
            long j3 = j;
            long j4 = j2;
            if (eCm != null) {
                eCm.C6K(this, str2, j3, j4);
            }
            Iterator it = this.A0F.iterator();
            while (it.hasNext()) {
                ((C28652ECm) it.next()).C6K(this, str2, j3, j4);
            }
            if (this.A06) {
                File A0e = C17880vN.A0e(file2, Integer.toString(this.A0M.nextInt(this.A03)));
                if (!A0e.exists()) {
                    A0e.mkdir();
                }
                file = C26214Cut.A03(A0e, str2, j3, System.currentTimeMillis(), this.A0A);
            } else {
                file = C26214Cut.A03(file2, str2, j3, System.currentTimeMillis(), this.A0A);
            }
        }
        return file;
    }

    public synchronized DSC CO8(Integer num, String str, long j, long j2) {
        synchronized (this) {
            Tracer.A00("SimpleCache.startReadWrite");
            try {
                DSC A022 = C26214Cut.A02(str, j);
                long elapsedRealtime = SystemClock.elapsedRealtime() + j2;
                boolean A1P = AnonymousClass000.A1P((j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)));
                while (true) {
                    Integer num2 = num;
                    DSC A012 = A01(A022, this, num2);
                    if (A012 != null) {
                        Systrace.A01();
                        return A012;
                    } else if (!this.A07 || !A1P) {
                        long elapsedRealtime2 = elapsedRealtime - SystemClock.elapsedRealtime();
                        HashMap hashMap = this.A0L;
                        String str2 = A022.A07;
                        if (hashMap.containsKey(str2)) {
                            long j3 = ((DSC) hashMap.get(str2)).A01;
                            if (j3 > 0) {
                                long elapsedRealtime3 = SystemClock.elapsedRealtime() - j3;
                                if (elapsedRealtime3 > j2) {
                                    StringBuilder A10 = AnonymousClass000.A10();
                                    A10.append("lock expired after ");
                                    A10.append(elapsedRealtime2);
                                    BEA.A1N("ms for span: ", str2, "SimpleCache", A10);
                                    break;
                                }
                                elapsedRealtime2 = j2 - elapsedRealtime3;
                            }
                        }
                        if (!A1P) {
                            if (elapsedRealtime2 <= 0) {
                                break;
                            }
                        } else {
                            elapsedRealtime2 = 0;
                        }
                        wait(elapsedRealtime2);
                    } else {
                        HashMap hashMap2 = this.A0L;
                        String str3 = A022.A07;
                        if (hashMap2.containsKey(str3)) {
                            DSC dsc = (DSC) hashMap2.get(str3);
                            long j4 = this.A05;
                            if (j4 > 0 && num2 != AnonymousClass00R.A0N && dsc.A09 > 0 && SystemClock.elapsedRealtime() - dsc.A09 > j4) {
                                Log.d("SimpleCache", AnonymousClass001.A1H("Ignore expired cache lock when retry ", str3, AnonymousClass000.A10()));
                                break;
                            }
                            dsc.A00++;
                        }
                        wait();
                        if (hashMap2.containsKey(str3)) {
                            ((DSC) hashMap2.get(str3)).A00--;
                        }
                    }
                }
                return null;
            } finally {
                Systrace.A01();
            }
        }
    }

    public C26697D9v(Handler handler, C28652ECm eCm, File file, int i, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        try {
            C25304Cd8.A01("VPS-SimpleCacheConstructor");
            this.A08 = z2;
            this.A0A = z3;
            this.A0B = z4;
            this.A09 = z5;
            this.A07 = z6;
            this.A0K = file;
            this.A0E = eCm;
            this.A0L = C17880vN.A11();
            this.A0G = C17880vN.A11();
            this.A0N = C17880vN.A12();
            this.A0H = C17880vN.A11();
            this.A0I = C17880vN.A11();
            this.A0F = AnonymousClass000.A13();
            this.A0M = new Random();
            this.A06 = z7;
            this.A03 = i;
            this.A0D = z;
            this.A05 = j;
            this.A0C = z8;
            this.A04 = j2;
            this.A0J = handler;
            new C27239DaJ(this).start();
        } finally {
            C25304Cd8.A00();
        }
    }

    private void A04(File file, boolean z) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        if (z || listFiles.length != 0) {
            DSC dsc = null;
            for (File file2 : listFiles) {
                if (file2.getName().indexOf(46) == -1) {
                    A04(file2, false);
                } else {
                    long length = file2.length();
                    if (length <= this.A04) {
                        file2.delete();
                    } else {
                        if (!this.A08) {
                            file2 = C26214Cut.A04(file2, this.A0A);
                        }
                        boolean z2 = this.A09;
                        boolean z3 = this.A0A;
                        boolean z4 = this.A0B;
                        if (!z2) {
                            length = 0;
                        }
                        dsc = C26214Cut.A00(file2, length, -9223372036854775807L, z3, z4);
                    }
                    if (dsc == null) {
                        file2.delete();
                    } else {
                        A02(dsc);
                    }
                }
            }
            return;
        }
        file.delete();
    }
}
