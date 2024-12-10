package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: X.AiJ  reason: case insensitive filesystem */
public final class C21334AiJ implements Closeable {
    public static final OutputStream A0E = new C179239Hc();
    public static final Charset A0F = Charset.forName("US-ASCII");
    public static final Charset A0G = Charset.forName(DefaultCrypto.UTF_8);
    public static final Pattern A0H = Pattern.compile("[a-z0-9_-]{1,120}");
    public int A00;
    public long A01;
    public long A02 = 0;
    public Writer A03;
    public long A04 = 0;
    public final int A05;
    public final File A06;
    public final File A07;
    public final File A08;
    public final LinkedHashMap A09 = new LinkedHashMap(0, 0.75f, true);
    public final Callable A0A = new C21490Akz(this, 3);
    public final ThreadPoolExecutor A0B = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public final int A0C;
    public final File A0D;

    public C21334AiJ(File file, long j) {
        this.A06 = file;
        this.A0C = 2;
        this.A07 = C17880vN.A0e(file, "journal");
        this.A08 = C17880vN.A0e(file, "journal.tmp");
        this.A0D = C17880vN.A0e(file, "journal.bkp");
        this.A05 = 1;
        this.A01 = j;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:70|71|72|73|(4:76|(2:78|108)(2:79|109)|106|74)|107|80|81) */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x013a, code lost:
        r0 = X.C17880vN.A0f(X.C17900vP.A0A("unexpected journal line: ", r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r1 = r7.A09;
        r7.A00 = r8 - r1.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        A03(r0);
        A05(r7.A08);
        r10 = X.C17890vO.A0j(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0176, code lost:
        if (r10.hasNext() != false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0178, code lost:
        r8 = (X.C192599of) r10.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0181, code lost:
        if (r8.A00 == null) goto L_0x0183;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0183, code lost:
        r7.A02 += r8.A03[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x018d, code lost:
        r8.A00 = null;
        A05(r8.A00());
        A05(r8.A01());
        r10.remove();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01a2, code lost:
        r7.A03 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r17, true), r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01b5, code lost:
        return r7;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x015d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:82:0x01b6=Splitter:B:82:0x01b6, B:70:0x015d=Splitter:B:70:0x015d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C21334AiJ A00(java.io.File r15, long r16) {
        /*
            r13 = 2
            r4 = 1
            r5 = 0
            r2 = r16
            int r0 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x020d
            java.lang.String r0 = "journal.bkp"
            r6 = r15
            java.io.File r5 = X.C17880vN.A0e(r15, r0)
            boolean r0 = r5.exists()
            if (r0 == 0) goto L_0x0026
            java.lang.String r0 = "journal"
            java.io.File r1 = X.C17880vN.A0e(r15, r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0036
            r5.delete()
        L_0x0026:
            X.AiJ r7 = new X.AiJ
            r7.<init>(r15, r2)
            java.io.File r0 = r7.A07
            r17 = r0
            boolean r0 = r17.exists()
            if (r0 == 0) goto L_0x0201
            goto L_0x0042
        L_0x0036:
            boolean r0 = r5.renameTo(r1)
            if (r0 != 0) goto L_0x0026
            java.io.IOException r0 = new java.io.IOException
            r0.<init>()
            throw r0
        L_0x0042:
            java.lang.String r11 = ", "
            java.io.FileInputStream r1 = X.C108945cZ.A18(r17)     // Catch:{ IOException -> 0x01d9 }
            java.nio.charset.Charset r5 = A0F     // Catch:{ IOException -> 0x01d9 }
            X.AiI r16 = new X.AiI     // Catch:{ IOException -> 0x01d9 }
            r0 = r16
            r0.<init>(r7, r1, r5)     // Catch:{ IOException -> 0x01d9 }
            java.lang.String r12 = r16.A00()     // Catch:{ all -> 0x01d4 }
            java.lang.String r10 = r16.A00()     // Catch:{ all -> 0x01d4 }
            java.lang.String r1 = r16.A00()     // Catch:{ all -> 0x01d4 }
            java.lang.String r9 = r16.A00()     // Catch:{ all -> 0x01d4 }
            java.lang.String r8 = r16.A00()     // Catch:{ all -> 0x01d4 }
            java.lang.String r0 = "libcore.io.DiskLruCache"
            boolean r0 = r0.equals(r12)     // Catch:{ all -> 0x01d4 }
            if (r0 == 0) goto L_0x01b6
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r10)     // Catch:{ all -> 0x01d4 }
            if (r0 == 0) goto L_0x01b6
            java.lang.String r0 = java.lang.Integer.toString(r13)     // Catch:{ all -> 0x01d4 }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x01d4 }
            if (r0 == 0) goto L_0x01b6
            java.lang.String r0 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x01d4 }
            boolean r0 = r0.equals(r9)     // Catch:{ all -> 0x01d4 }
            if (r0 == 0) goto L_0x01b6
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r8)     // Catch:{ all -> 0x01d4 }
            if (r0 == 0) goto L_0x01b6
            r8 = 0
        L_0x0092:
            java.lang.String r1 = r16.A00()     // Catch:{ EOFException -> 0x015d }
            r10 = 32
            int r13 = r1.indexOf(r10)     // Catch:{ EOFException -> 0x015d }
            java.lang.String r9 = "unexpected journal line: "
            r14 = -1
            if (r13 == r14) goto L_0x0143
            int r0 = r13 + 1
            int r12 = r1.indexOf(r10, r0)     // Catch:{ EOFException -> 0x015d }
            if (r12 != r14) goto L_0x00be
            java.lang.String r15 = r1.substring(r0)     // Catch:{ EOFException -> 0x015d }
            r0 = 6
            if (r13 != r0) goto L_0x00c2
            java.lang.String r0 = "REMOVE"
            boolean r0 = r1.startsWith(r0)     // Catch:{ EOFException -> 0x015d }
            if (r0 == 0) goto L_0x00c2
            java.util.LinkedHashMap r0 = r7.A09     // Catch:{ EOFException -> 0x015d }
            r0.remove(r15)     // Catch:{ EOFException -> 0x015d }
            goto L_0x0125
        L_0x00be:
            java.lang.String r15 = r1.substring(r0, r12)     // Catch:{ EOFException -> 0x015d }
        L_0x00c2:
            java.util.LinkedHashMap r0 = r7.A09     // Catch:{ EOFException -> 0x015d }
            java.lang.Object r11 = r0.get(r15)     // Catch:{ EOFException -> 0x015d }
            X.9of r11 = (X.C192599of) r11     // Catch:{ EOFException -> 0x015d }
            r10 = 0
            if (r11 != 0) goto L_0x00d5
            X.9of r11 = new X.9of     // Catch:{ EOFException -> 0x015d }
            r11.<init>(r7, r15)     // Catch:{ EOFException -> 0x015d }
            r0.put(r15, r11)     // Catch:{ EOFException -> 0x015d }
        L_0x00d5:
            r0 = 5
            if (r12 == r14) goto L_0x0108
            if (r13 != r0) goto L_0x013a
            java.lang.String r0 = "CLEAN"
            boolean r0 = r1.startsWith(r0)     // Catch:{ EOFException -> 0x015d }
            if (r0 == 0) goto L_0x013a
            int r0 = r12 + 1
            java.lang.String r1 = r1.substring(r0)     // Catch:{ EOFException -> 0x015d }
            java.lang.String r0 = " "
            java.lang.String[] r12 = r1.split(r0)     // Catch:{ EOFException -> 0x015d }
            r11.A01 = r4     // Catch:{ EOFException -> 0x015d }
            r11.A00 = r10     // Catch:{ EOFException -> 0x015d }
            int r14 = r12.length     // Catch:{ EOFException -> 0x015d }
            X.AiJ r0 = r11.A04     // Catch:{ EOFException -> 0x015d }
            int r0 = r0.A05     // Catch:{ EOFException -> 0x015d }
            if (r14 != r0) goto L_0x0129
            r13 = 0
        L_0x00fa:
            if (r13 >= r14) goto L_0x0125
            long[] r10 = r11.A03     // Catch:{ NumberFormatException -> 0x014c }
            r0 = r12[r13]     // Catch:{ NumberFormatException -> 0x014c }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x014c }
            r10[r13] = r0     // Catch:{ NumberFormatException -> 0x014c }
            r13 = 1
            goto L_0x00fa
        L_0x0108:
            if (r13 != r0) goto L_0x011a
            java.lang.String r0 = "DIRTY"
            boolean r0 = r1.startsWith(r0)     // Catch:{ EOFException -> 0x015d }
            if (r0 == 0) goto L_0x013a
            X.9mF r0 = new X.9mF     // Catch:{ EOFException -> 0x015d }
            r0.<init>(r11, r7)     // Catch:{ EOFException -> 0x015d }
            r11.A00 = r0     // Catch:{ EOFException -> 0x015d }
            goto L_0x0125
        L_0x011a:
            r0 = 4
            if (r13 != r0) goto L_0x013a
            java.lang.String r0 = "READ"
            boolean r0 = r1.startsWith(r0)     // Catch:{ EOFException -> 0x015d }
            if (r0 == 0) goto L_0x013a
        L_0x0125:
            int r8 = r8 + 1
            goto L_0x0092
        L_0x0129:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r9)     // Catch:{ EOFException -> 0x015d }
            java.lang.String r0 = java.util.Arrays.toString(r12)     // Catch:{ EOFException -> 0x015d }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ EOFException -> 0x015d }
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ EOFException -> 0x015d }
            goto L_0x015c
        L_0x013a:
            java.lang.String r0 = X.C17900vP.A0A(r9, r1)     // Catch:{ EOFException -> 0x015d }
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ EOFException -> 0x015d }
            goto L_0x015c
        L_0x0143:
            java.lang.String r0 = X.C17900vP.A0A(r9, r1)     // Catch:{ EOFException -> 0x015d }
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ EOFException -> 0x015d }
            goto L_0x015c
        L_0x014c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r9)     // Catch:{ EOFException -> 0x015d }
            java.lang.String r0 = java.util.Arrays.toString(r12)     // Catch:{ EOFException -> 0x015d }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ EOFException -> 0x015d }
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ EOFException -> 0x015d }
        L_0x015c:
            throw r0     // Catch:{ EOFException -> 0x015d }
        L_0x015d:
            java.util.LinkedHashMap r1 = r7.A09     // Catch:{ all -> 0x01d4 }
            int r0 = r1.size()     // Catch:{ all -> 0x01d4 }
            int r8 = r8 - r0
            r7.A00 = r8     // Catch:{ all -> 0x01d4 }
            A03(r16)     // Catch:{ IOException -> 0x01d9 }
            java.io.File r0 = r7.A08     // Catch:{ IOException -> 0x01d9 }
            A05(r0)     // Catch:{ IOException -> 0x01d9 }
            java.util.Iterator r10 = X.C17890vO.A0j(r1)     // Catch:{ IOException -> 0x01d9 }
        L_0x0172:
            boolean r0 = r10.hasNext()     // Catch:{ IOException -> 0x01d9 }
            if (r0 == 0) goto L_0x01a2
            java.lang.Object r8 = r10.next()     // Catch:{ IOException -> 0x01d9 }
            X.9of r8 = (X.C192599of) r8     // Catch:{ IOException -> 0x01d9 }
            X.9mF r0 = r8.A00     // Catch:{ IOException -> 0x01d9 }
            r9 = 0
            if (r0 != 0) goto L_0x018d
            long r0 = r7.A02     // Catch:{ IOException -> 0x01d9 }
            long[] r8 = r8.A03     // Catch:{ IOException -> 0x01d9 }
            r8 = r8[r9]     // Catch:{ IOException -> 0x01d9 }
            long r0 = r0 + r8
            r7.A02 = r0     // Catch:{ IOException -> 0x01d9 }
            goto L_0x0172
        L_0x018d:
            r0 = 0
            r8.A00 = r0     // Catch:{ IOException -> 0x01d9 }
            java.io.File r0 = r8.A00()     // Catch:{ IOException -> 0x01d9 }
            A05(r0)     // Catch:{ IOException -> 0x01d9 }
            java.io.File r0 = r8.A01()     // Catch:{ IOException -> 0x01d9 }
            A05(r0)     // Catch:{ IOException -> 0x01d9 }
            r10.remove()     // Catch:{ IOException -> 0x01d9 }
            goto L_0x0172
        L_0x01a2:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x01d9 }
            r0 = r17
            r1.<init>(r0, r4)     // Catch:{ IOException -> 0x01d9 }
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x01d9 }
            r4.<init>(r1, r5)     // Catch:{ IOException -> 0x01d9 }
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x01d9 }
            r0.<init>(r4)     // Catch:{ IOException -> 0x01d9 }
            r7.A03 = r0     // Catch:{ IOException -> 0x01d9 }
            return r7
        L_0x01b6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x01d4 }
            java.lang.String r0 = "unexpected journal header: ["
            X.C17900vP.A0c(r0, r12, r11, r10, r1)     // Catch:{ all -> 0x01d4 }
            r1.append(r11)     // Catch:{ all -> 0x01d4 }
            r1.append(r9)     // Catch:{ all -> 0x01d4 }
            r1.append(r11)     // Catch:{ all -> 0x01d4 }
            r1.append(r8)     // Catch:{ all -> 0x01d4 }
            java.lang.String r0 = X.AnonymousClass000.A0z(r1)     // Catch:{ all -> 0x01d4 }
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ all -> 0x01d4 }
            throw r0     // Catch:{ all -> 0x01d4 }
        L_0x01d4:
            r0 = move-exception
            A03(r16)     // Catch:{ IOException -> 0x01d9 }
            throw r0     // Catch:{ IOException -> 0x01d9 }
        L_0x01d9:
            r5 = move-exception
            java.io.PrintStream r4 = java.lang.System.out
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "DiskLruCache "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " is corrupt: "
            r1.append(r0)
            X.AnonymousClass8BS.A1I(r1, r5)
            java.lang.String r0 = ", removing"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r4.println(r0)
            r7.close()
            java.io.File r0 = r7.A06
            A04(r0)
        L_0x0201:
            r6.mkdirs()
            X.AiJ r7 = new X.AiJ
            r7.<init>(r6, r2)
            A02(r7)
            return r7
        L_0x020d:
            java.lang.String r0 = "maxSize <= 0"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21334AiJ.A00(java.io.File, long):X.AiJ");
    }

    public static synchronized void A01(C191239mF r9, C21334AiJ aiJ, boolean z) {
        IllegalStateException illegalStateException;
        synchronized (aiJ) {
            C192599of r1 = r9.A02;
            if (r1.A00 == r9) {
                if (z && !r1.A01) {
                    int i = 0;
                    while (true) {
                        if (i < aiJ.A05) {
                            if (!r9.A03[i]) {
                                r9.A00();
                                illegalStateException = AnonymousClass8BX.A0W("Newly created entry didn't create value for index ", AnonymousClass000.A10(), i);
                                break;
                            } else if (!r1.A01().exists()) {
                                r9.A00();
                                break;
                            } else {
                                i = 1;
                            }
                        } else {
                            break;
                        }
                    }
                }
                for (int i2 = 0; i2 < aiJ.A05; i2 = 1) {
                    File A012 = r1.A01();
                    if (!z) {
                        A05(A012);
                    } else if (A012.exists()) {
                        File A002 = r1.A00();
                        A012.renameTo(A002);
                        long[] jArr = r1.A03;
                        long j = jArr[i2];
                        long length = A002.length();
                        jArr[i2] = length;
                        aiJ.A02 = (aiJ.A02 - j) + length;
                    }
                }
                aiJ.A00++;
                r1.A00 = null;
                if (r1.A01 || z) {
                    r1.A01 = true;
                    Writer writer = aiJ.A03;
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("CLEAN ");
                    StringBuilder A0y = AnonymousClass8BT.A0y(r1.A02, A10);
                    long[] jArr2 = r1.A03;
                    int length2 = jArr2.length;
                    for (int i3 = 0; i3 < length2; i3 = 1) {
                        long j2 = jArr2[i3];
                        A0y.append(' ');
                        A0y.append(j2);
                    }
                    writer.write(AnonymousClass8BW.A0l(A0y.toString(), A10, 10));
                    if (z) {
                        aiJ.A04 = 1 + aiJ.A04;
                    }
                } else {
                    LinkedHashMap linkedHashMap = aiJ.A09;
                    String str = r1.A02;
                    linkedHashMap.remove(str);
                    Writer writer2 = aiJ.A03;
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("REMOVE ");
                    writer2.write(AnonymousClass8BW.A0l(str, A102, 10));
                }
                aiJ.A03.flush();
                if (aiJ.A02 > aiJ.A01 || A07(aiJ)) {
                    aiJ.A0B.submit(aiJ.A0A);
                }
            } else {
                illegalStateException = new IllegalStateException();
            }
            throw illegalStateException;
        }
    }

    public static synchronized void A02(C21334AiJ aiJ) {
        synchronized (aiJ) {
            Writer writer = aiJ.A03;
            if (writer != null) {
                writer.close();
            }
            File file = aiJ.A08;
            FileOutputStream A19 = C108945cZ.A19(file);
            Charset charset = A0F;
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(A19, charset));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(aiJ.A0C));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(aiJ.A05));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                Iterator A0j = C17890vO.A0j(aiJ.A09);
                while (A0j.hasNext()) {
                    C192599of r2 = (C192599of) A0j.next();
                    if (r2.A00 != null) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("DIRTY ");
                        bufferedWriter.write(AnonymousClass8BW.A0l(r2.A02, A10, 10));
                    } else {
                        StringBuilder A102 = AnonymousClass000.A10();
                        A102.append("CLEAN ");
                        StringBuilder A0y = AnonymousClass8BT.A0y(r2.A02, A102);
                        long[] jArr = r2.A03;
                        int length = jArr.length;
                        for (int i = 0; i < length; i = 1) {
                            long j = jArr[i];
                            A0y.append(' ');
                            A0y.append(j);
                        }
                        bufferedWriter.write(AnonymousClass8BW.A0l(A0y.toString(), A102, 10));
                    }
                }
                bufferedWriter.close();
                File file2 = aiJ.A07;
                if (file2.exists()) {
                    File file3 = aiJ.A0D;
                    A05(file3);
                    if (!file2.renameTo(file3)) {
                        th = new IOException();
                        throw th;
                    }
                }
                if (file.renameTo(file2)) {
                    aiJ.A0D.delete();
                    aiJ.A03 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2, true), charset));
                } else {
                    th = new IOException();
                    throw th;
                }
            } catch (Throwable th) {
                th = th;
                bufferedWriter.close();
            }
        }
    }

    public synchronized void A08(String str) {
        Throwable th;
        if (this.A03 != null) {
            A06(str);
            LinkedHashMap linkedHashMap = this.A09;
            C192599of r7 = (C192599of) linkedHashMap.get(str);
            int i = 0;
            if (r7 != null) {
                if (r7.A00 == null) {
                    while (i < this.A05) {
                        File A002 = r7.A00();
                        if (!A002.exists() || A002.delete()) {
                            long j = this.A02;
                            long[] jArr = r7.A03;
                            this.A02 = j - jArr[i];
                            jArr[i] = 0;
                            i = 1;
                        } else {
                            th = C17880vN.A0f(AnonymousClass001.A1E(A002, "failed to delete ", AnonymousClass000.A10()));
                        }
                    }
                    this.A00++;
                    Writer writer = this.A03;
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("REMOVE ");
                    A10.append(str);
                    writer.append(C17890vO.A0c(A10, 10));
                    linkedHashMap.remove(str);
                    if (A07(this)) {
                        this.A0B.submit(this.A0A);
                    }
                }
            }
        } else {
            th = AnonymousClass000.A0n("cache is closed");
        }
        throw th;
    }

    public synchronized void close() {
        if (this.A03 != null) {
            LinkedHashMap linkedHashMap = this.A09;
            Iterator A0y = AnonymousClass8BV.A0y(linkedHashMap.values());
            while (A0y.hasNext()) {
                C191239mF r0 = ((C192599of) A0y.next()).A00;
                if (r0 != null) {
                    r0.A00();
                }
            }
            while (this.A02 > this.A01) {
                A08(C17880vN.A0x(AnonymousClass000.A16(C17890vO.A0i(linkedHashMap))));
            }
            this.A03.close();
            this.A03 = null;
        }
    }

    public static void A03(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void A06(String str) {
        if (!AnonymousClass8BU.A1V(str, A0H)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("keys must match regex [a-z0-9_-]{1,120}: \"");
            A10.append(str);
            throw AnonymousClass001.A12("\"", A10);
        }
    }

    public static boolean A07(C21334AiJ aiJ) {
        int i = aiJ.A00;
        if (i < 2000 || i < aiJ.A09.size()) {
            return false;
        }
        return true;
    }

    public static void A04(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory()) {
                    A04(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    throw C17880vN.A0f(AnonymousClass001.A1E(file2, "failed to delete file: ", AnonymousClass000.A10()));
                }
            }
            return;
        }
        throw C17880vN.A0f(AnonymousClass001.A1E(file, "not a readable directory: ", AnonymousClass000.A10()));
    }

    public static void A05(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }
}
