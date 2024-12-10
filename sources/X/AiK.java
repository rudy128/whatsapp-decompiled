package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

public final class AiK implements Closeable {
    public static final Charset A0E = C19620yd.A0C;
    public int A00;
    public long A01 = 0;
    public Writer A02;
    public long A03 = 0;
    public final int A04;
    public final long A05;
    public final File A06;
    public final File A07;
    public final File A08;
    public final LinkedHashMap A09 = new LinkedHashMap(0, 0.75f, true);
    public final Callable A0A = new C21490Akz(this, 6);
    public final ExecutorService A0B = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public final int A0C;
    public final C183489Yl A0D;

    public AiK(C183489Yl r11, File file, long j) {
        this.A06 = file;
        this.A0C = 1;
        this.A07 = C17880vN.A0e(file, "journal");
        this.A08 = C17880vN.A0e(file, "journal.tmp");
        this.A04 = 1;
        this.A05 = j;
        this.A0D = r11;
    }

    public static synchronized C192399oK A00(AiK aiK, String str) {
        synchronized (aiK) {
            if (aiK.A02 != null) {
                A09(str);
                LinkedHashMap linkedHashMap = aiK.A09;
                C192709oq r2 = (C192709oq) linkedHashMap.get(str);
                if (r2 == null) {
                    r2 = new C192709oq(aiK, str);
                    linkedHashMap.put(str, r2);
                } else if (r2.A01 != null) {
                    return null;
                }
                C192399oK r3 = new C192399oK(r2, aiK);
                r2.A01 = r3;
                Writer writer = aiK.A02;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("DIRTY ");
                A10.append(str);
                writer.write(C17890vO.A0c(A10, 10));
                aiK.A02.flush();
                return r3;
            }
            throw AnonymousClass000.A0n("cache is closed");
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:48|49|50|51) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:52|53|(4:56|(2:58|86)(2:59|87)|84|54)|85|60|61) */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        A06(r4);
        A08(r5.A08);
        r10 = X.C17890vO.A0j(r5.A09);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x013c, code lost:
        if (r10.hasNext() != false) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013e, code lost:
        r4 = (X.C192709oq) r10.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0147, code lost:
        if (r4.A01 == null) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0149, code lost:
        r5.A01 += r4.A04[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0153, code lost:
        r4.A01 = null;
        A08(r4.A00());
        A08(r4.A01());
        r10.remove();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0168, code lost:
        r5.A02 = new java.io.BufferedWriter(new java.io.FileWriter(r9, true), com.facebook.msys.mci.DefaultCrypto.BUFFER_SIZE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0176, code lost:
        return r5;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x0119 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x012a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AiK A01(X.C183489Yl r14, java.io.File r15, long r16) {
        /*
            r8 = 1
            r4 = 0
            r2 = r16
            int r0 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x01b2
            X.AiK r5 = new X.AiK
            r17 = r14
            r16 = r15
            r5.<init>(r14, r15, r2)
            java.io.File r9 = r5.A07
            boolean r0 = r9.exists()
            if (r0 == 0) goto L_0x01a2
            java.lang.String r12 = ", "
            java.io.FileInputStream r1 = X.C108945cZ.A18(r9)     // Catch:{ IOException -> 0x019a }
            r0 = 8192(0x2000, float:1.14794E-41)
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x019a }
            r4.<init>(r1, r0)     // Catch:{ IOException -> 0x019a }
            java.lang.String r11 = A02(r4)     // Catch:{ all -> 0x0195 }
            java.lang.String r10 = A02(r4)     // Catch:{ all -> 0x0195 }
            java.lang.String r13 = A02(r4)     // Catch:{ all -> 0x0195 }
            java.lang.String r7 = A02(r4)     // Catch:{ all -> 0x0195 }
            java.lang.String r6 = A02(r4)     // Catch:{ all -> 0x0195 }
            java.lang.String r0 = "libcore.io.DiskLruCache"
            boolean r0 = r0.equals(r11)     // Catch:{ all -> 0x0195 }
            if (r0 == 0) goto L_0x0177
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r10)     // Catch:{ all -> 0x0195 }
            if (r0 == 0) goto L_0x0177
            java.lang.String r1 = java.lang.Integer.toString(r8)     // Catch:{ all -> 0x0195 }
            boolean r0 = r1.equals(r13)     // Catch:{ all -> 0x0195 }
            if (r0 == 0) goto L_0x0177
            boolean r0 = r1.equals(r7)     // Catch:{ all -> 0x0195 }
            if (r0 == 0) goto L_0x0177
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x0195 }
            if (r0 == 0) goto L_0x0177
        L_0x0063:
            java.lang.String r11 = A02(r4)     // Catch:{ EOFException -> 0x012a }
            java.lang.String r0 = " "
            java.lang.String[] r14 = r11.split(r0)     // Catch:{ EOFException -> 0x012a }
            int r6 = r14.length     // Catch:{ EOFException -> 0x012a }
            java.lang.String r7 = "unexpected journal line: "
            r1 = 2
            if (r6 < r1) goto L_0x00cf
            r12 = r14[r8]     // Catch:{ EOFException -> 0x012a }
            r13 = 0
            r10 = r14[r13]     // Catch:{ EOFException -> 0x012a }
            java.lang.String r0 = "REMOVE"
            boolean r0 = r10.equals(r0)     // Catch:{ EOFException -> 0x012a }
            if (r0 == 0) goto L_0x0088
            if (r6 != r1) goto L_0x0088
            java.util.LinkedHashMap r0 = r5.A09     // Catch:{ EOFException -> 0x012a }
            r0.remove(r12)     // Catch:{ EOFException -> 0x012a }
            goto L_0x0063
        L_0x0088:
            java.util.LinkedHashMap r0 = r5.A09     // Catch:{ EOFException -> 0x012a }
            java.lang.Object r10 = r0.get(r12)     // Catch:{ EOFException -> 0x012a }
            X.9oq r10 = (X.C192709oq) r10     // Catch:{ EOFException -> 0x012a }
            r15 = 0
            if (r10 != 0) goto L_0x009b
            X.9oq r10 = new X.9oq     // Catch:{ EOFException -> 0x012a }
            r10.<init>(r5, r12)     // Catch:{ EOFException -> 0x012a }
            r0.put(r12, r10)     // Catch:{ EOFException -> 0x012a }
        L_0x009b:
            r12 = r14[r13]     // Catch:{ EOFException -> 0x012a }
            java.lang.String r0 = "CLEAN"
            boolean r0 = r12.equals(r0)     // Catch:{ EOFException -> 0x012a }
            if (r0 == 0) goto L_0x00a9
            r0 = 3
            if (r6 != r0) goto L_0x00a9
            goto L_0x00d8
        L_0x00a9:
            java.lang.String r0 = "DIRTY"
            boolean r0 = r12.equals(r0)     // Catch:{ EOFException -> 0x012a }
            if (r0 == 0) goto L_0x00bb
            if (r6 != r1) goto L_0x00bb
            X.9oK r0 = new X.9oK     // Catch:{ EOFException -> 0x012a }
            r0.<init>(r10, r5)     // Catch:{ EOFException -> 0x012a }
            r10.A01 = r0     // Catch:{ EOFException -> 0x012a }
            goto L_0x0063
        L_0x00bb:
            java.lang.String r0 = "READ"
            boolean r0 = r12.equals(r0)     // Catch:{ EOFException -> 0x012a }
            if (r0 == 0) goto L_0x00c6
            if (r6 != r1) goto L_0x00c6
            goto L_0x0063
        L_0x00c6:
            java.lang.String r0 = X.C17900vP.A0A(r7, r11)     // Catch:{ EOFException -> 0x012a }
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ EOFException -> 0x012a }
            goto L_0x010a
        L_0x00cf:
            java.lang.String r0 = X.C17900vP.A0A(r7, r11)     // Catch:{ EOFException -> 0x012a }
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ EOFException -> 0x012a }
            goto L_0x010a
        L_0x00d8:
            r10.A02 = r8     // Catch:{ EOFException -> 0x012a }
            r10.A01 = r15     // Catch:{ EOFException -> 0x012a }
            int r6 = java.lang.Math.min(r8, r8)     // Catch:{ EOFException -> 0x012a }
            java.lang.Class r0 = r14.getClass()     // Catch:{ EOFException -> 0x012a }
            java.lang.Class r0 = r0.getComponentType()     // Catch:{ EOFException -> 0x012a }
            java.lang.Object r11 = java.lang.reflect.Array.newInstance(r0, r8)     // Catch:{ EOFException -> 0x012a }
            java.lang.Object[] r11 = (java.lang.Object[]) r11     // Catch:{ EOFException -> 0x012a }
            java.lang.System.arraycopy(r14, r1, r11, r13, r6)     // Catch:{ EOFException -> 0x012a }
            java.lang.String[] r11 = (java.lang.String[]) r11     // Catch:{ EOFException -> 0x012a }
            int r12 = r11.length     // Catch:{ EOFException -> 0x012a }
            X.AiK r0 = r10.A05     // Catch:{ EOFException -> 0x012a }
            int r0 = r0.A04     // Catch:{ EOFException -> 0x012a }
            if (r12 == r0) goto L_0x010b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r7)     // Catch:{ EOFException -> 0x012a }
            java.lang.String r0 = java.util.Arrays.toString(r11)     // Catch:{ EOFException -> 0x012a }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ EOFException -> 0x012a }
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ EOFException -> 0x012a }
        L_0x010a:
            throw r0     // Catch:{ EOFException -> 0x012a }
        L_0x010b:
            if (r13 >= r12) goto L_0x0063
            long[] r6 = r10.A04     // Catch:{ NumberFormatException -> 0x0119 }
            r0 = r11[r13]     // Catch:{ NumberFormatException -> 0x0119 }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0119 }
            r6[r13] = r0     // Catch:{ NumberFormatException -> 0x0119 }
            r13 = 1
            goto L_0x010b
        L_0x0119:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r7)     // Catch:{ EOFException -> 0x012a }
            java.lang.String r0 = java.util.Arrays.toString(r11)     // Catch:{ EOFException -> 0x012a }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ EOFException -> 0x012a }
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ EOFException -> 0x012a }
            goto L_0x010a
        L_0x012a:
            A06(r4)     // Catch:{ IOException -> 0x019a }
            java.io.File r0 = r5.A08     // Catch:{ IOException -> 0x019a }
            A08(r0)     // Catch:{ IOException -> 0x019a }
            java.util.LinkedHashMap r0 = r5.A09     // Catch:{ IOException -> 0x019a }
            java.util.Iterator r10 = X.C17890vO.A0j(r0)     // Catch:{ IOException -> 0x019a }
        L_0x0138:
            boolean r0 = r10.hasNext()     // Catch:{ IOException -> 0x019a }
            if (r0 == 0) goto L_0x0168
            java.lang.Object r4 = r10.next()     // Catch:{ IOException -> 0x019a }
            X.9oq r4 = (X.C192709oq) r4     // Catch:{ IOException -> 0x019a }
            X.9oK r0 = r4.A01     // Catch:{ IOException -> 0x019a }
            r1 = 0
            if (r0 != 0) goto L_0x0153
            long r6 = r5.A01     // Catch:{ IOException -> 0x019a }
            long[] r0 = r4.A04     // Catch:{ IOException -> 0x019a }
            r0 = r0[r1]     // Catch:{ IOException -> 0x019a }
            long r6 = r6 + r0
            r5.A01 = r6     // Catch:{ IOException -> 0x019a }
            goto L_0x0138
        L_0x0153:
            r0 = 0
            r4.A01 = r0     // Catch:{ IOException -> 0x019a }
            java.io.File r0 = r4.A00()     // Catch:{ IOException -> 0x019a }
            A08(r0)     // Catch:{ IOException -> 0x019a }
            java.io.File r0 = r4.A01()     // Catch:{ IOException -> 0x019a }
            A08(r0)     // Catch:{ IOException -> 0x019a }
            r10.remove()     // Catch:{ IOException -> 0x019a }
            goto L_0x0138
        L_0x0168:
            java.io.FileWriter r4 = new java.io.FileWriter     // Catch:{ IOException -> 0x019a }
            r4.<init>(r9, r8)     // Catch:{ IOException -> 0x019a }
            r1 = 8192(0x2000, float:1.14794E-41)
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x019a }
            r0.<init>(r4, r1)     // Catch:{ IOException -> 0x019a }
            r5.A02 = r0     // Catch:{ IOException -> 0x019a }
            return r5
        L_0x0177:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0195 }
            java.lang.String r0 = "unexpected journal header: ["
            X.C17900vP.A0c(r0, r11, r12, r10, r1)     // Catch:{ all -> 0x0195 }
            r1.append(r12)     // Catch:{ all -> 0x0195 }
            r1.append(r7)     // Catch:{ all -> 0x0195 }
            r1.append(r12)     // Catch:{ all -> 0x0195 }
            r1.append(r6)     // Catch:{ all -> 0x0195 }
            java.lang.String r0 = X.AnonymousClass000.A0z(r1)     // Catch:{ all -> 0x0195 }
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ all -> 0x0195 }
            throw r0     // Catch:{ all -> 0x0195 }
        L_0x0195:
            r0 = move-exception
            A06(r4)     // Catch:{ IOException -> 0x019a }
            throw r0     // Catch:{ IOException -> 0x019a }
        L_0x019a:
            r5.close()
            java.io.File r0 = r5.A06
            A07(r0)
        L_0x01a2:
            r16.mkdirs()
            X.AiK r5 = new X.AiK
            r1 = r17
            r0 = r16
            r5.<init>(r1, r0, r2)
            A05(r5)
            return r5
        L_0x01b2:
            java.lang.String r0 = "maxSize <= 0"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AiK.A01(X.9Yl, java.io.File, long):X.AiK");
    }

    public static synchronized void A03(C192399oK r9, AiK aiK, boolean z) {
        IllegalStateException illegalStateException;
        synchronized (aiK) {
            C192709oq r4 = r9.A01;
            if (r4.A01 == r9) {
                if (z && !r4.A02) {
                    int i = 0;
                    while (i < aiK.A04) {
                        if (r4.A01().exists()) {
                            i = 1;
                        } else {
                            A03(r9, r9.A02, false);
                            illegalStateException = AnonymousClass8BX.A0W("edit didn't create file ", AnonymousClass000.A10(), i);
                        }
                    }
                }
                for (int i2 = 0; i2 < aiK.A04; i2 = 1) {
                    File A012 = r4.A01();
                    if (!z) {
                        A08(A012);
                    } else if (A012.exists()) {
                        File A002 = r4.A00();
                        A012.renameTo(A002);
                        long[] jArr = r4.A04;
                        long j = jArr[i2];
                        long length = A002.length();
                        jArr[i2] = length;
                        aiK.A01 = (aiK.A01 - j) + length;
                    }
                }
                aiK.A00++;
                r4.A01 = null;
                if (r4.A02 || z) {
                    r4.A02 = true;
                    Writer writer = aiK.A02;
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("CLEAN ");
                    StringBuilder A0y = AnonymousClass8BT.A0y(r4.A03, A10);
                    long[] jArr2 = r4.A04;
                    int length2 = jArr2.length;
                    for (int i3 = 0; i3 < length2; i3 = 1) {
                        long j2 = jArr2[i3];
                        A0y.append(' ');
                        A0y.append(j2);
                    }
                    writer.write(AnonymousClass8BW.A0l(A0y.toString(), A10, 10));
                    if (z) {
                        long j3 = aiK.A03;
                        aiK.A03 = 1 + j3;
                        r4.A00 = j3;
                    }
                } else {
                    LinkedHashMap linkedHashMap = aiK.A09;
                    String str = r4.A03;
                    linkedHashMap.remove(str);
                    Writer writer2 = aiK.A02;
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("REMOVE ");
                    writer2.write(AnonymousClass8BW.A0l(str, A102, 10));
                }
                Writer writer3 = aiK.A02;
                if (writer3 != null) {
                    writer3.flush();
                }
                if (aiK.A01 > aiK.A05 || A0A(aiK)) {
                    aiK.A0B.submit(aiK.A0A);
                }
            } else {
                illegalStateException = new IllegalStateException();
            }
            throw illegalStateException;
        }
    }

    public static synchronized void A05(AiK aiK) {
        synchronized (aiK) {
            Writer writer = aiK.A02;
            if (writer != null) {
                writer.close();
            }
            File file = aiK.A08;
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file), DefaultCrypto.BUFFER_SIZE);
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(aiK.A0C));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(aiK.A04));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                Iterator A0j = C17890vO.A0j(aiK.A09);
                while (A0j.hasNext()) {
                    C192709oq r2 = (C192709oq) A0j.next();
                    if (r2.A01 != null) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("DIRTY ");
                        bufferedWriter.write(AnonymousClass8BW.A0l(r2.A03, A10, 10));
                    } else {
                        StringBuilder A102 = AnonymousClass000.A10();
                        A102.append("CLEAN ");
                        StringBuilder A0y = AnonymousClass8BT.A0y(r2.A03, A102);
                        long[] jArr = r2.A04;
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
                File file2 = aiK.A07;
                file.renameTo(file2);
                aiK.A02 = new BufferedWriter(new FileWriter(file2, true), DefaultCrypto.BUFFER_SIZE);
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
            }
        }
        return;
        throw th;
    }

    public synchronized C21326AiB A0B(String str) {
        C21326AiB aiB;
        synchronized (this) {
            if (this.A02 != null) {
                A09(str);
                C192709oq r5 = (C192709oq) this.A09.get(str);
                aiB = null;
                if (r5 != null && r5.A02) {
                    int i = this.A04;
                    InputStream[] inputStreamArr = new InputStream[i];
                    int i2 = 0;
                    while (i2 < i) {
                        try {
                            inputStreamArr[i2] = C108945cZ.A18(r5.A00());
                            i2 = 1;
                        } catch (FileNotFoundException unused) {
                            return null;
                        }
                    }
                    this.A00++;
                    this.A02.append("READ").append(' ').append(str).append(10);
                    if (A0A(this)) {
                        this.A0B.submit(this.A0A);
                    }
                    aiB = new C21326AiB(this, inputStreamArr);
                }
            } else {
                throw AnonymousClass000.A0n("cache is closed");
            }
        }
        return aiB;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0C(java.lang.String r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.io.Writer r0 = r8.A02     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x0074
            A09(r9)     // Catch:{ all -> 0x007b }
            java.util.LinkedHashMap r3 = r8.A09     // Catch:{ all -> 0x007b }
            java.lang.Object r7 = r3.get(r9)     // Catch:{ all -> 0x007b }
            X.9oq r7 = (X.C192709oq) r7     // Catch:{ all -> 0x007b }
            r2 = 0
            if (r7 == 0) goto L_0x0072
            X.9oK r0 = r7.A01     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x0018
            goto L_0x0072
        L_0x0018:
            int r0 = r8.A04     // Catch:{ all -> 0x007b }
            if (r2 >= r0) goto L_0x0044
            java.io.File r4 = r7.A00()     // Catch:{ all -> 0x007b }
            boolean r0 = r4.delete()     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x0035
            long r4 = r8.A01     // Catch:{ all -> 0x007b }
            long[] r6 = r7.A04     // Catch:{ all -> 0x007b }
            r0 = r6[r2]     // Catch:{ all -> 0x007b }
            long r4 = r4 - r0
            r8.A01 = r4     // Catch:{ all -> 0x007b }
            r0 = 0
            r6[r2] = r0     // Catch:{ all -> 0x007b }
            r2 = 1
            goto L_0x0018
        L_0x0035:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x007b }
            java.lang.String r0 = "failed to delete "
            java.lang.String r0 = X.AnonymousClass001.A1E(r4, r0, r1)     // Catch:{ all -> 0x007b }
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ all -> 0x007b }
            goto L_0x007a
        L_0x0044:
            int r0 = r8.A00     // Catch:{ all -> 0x007b }
            r2 = 1
            int r0 = r0 + 1
            r8.A00 = r0     // Catch:{ all -> 0x007b }
            java.io.Writer r1 = r8.A02     // Catch:{ all -> 0x007b }
            java.lang.String r0 = "REMOVE"
            java.io.Writer r1 = r1.append(r0)     // Catch:{ all -> 0x007b }
            r0 = 32
            java.io.Writer r0 = r1.append(r0)     // Catch:{ all -> 0x007b }
            java.io.Writer r1 = r0.append(r9)     // Catch:{ all -> 0x007b }
            r0 = 10
            r1.append(r0)     // Catch:{ all -> 0x007b }
            r3.remove(r9)     // Catch:{ all -> 0x007b }
            boolean r0 = A0A(r8)     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x0072
            java.util.concurrent.ExecutorService r1 = r8.A0B     // Catch:{ all -> 0x007b }
            java.util.concurrent.Callable r0 = r8.A0A     // Catch:{ all -> 0x007b }
            r1.submit(r0)     // Catch:{ all -> 0x007b }
        L_0x0072:
            monitor-exit(r8)
            return r2
        L_0x0074:
            java.lang.String r0 = "cache is closed"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x007b }
        L_0x007a:
            throw r0     // Catch:{ all -> 0x007b }
        L_0x007b:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AiK.A0C(java.lang.String):boolean");
    }

    public synchronized void close() {
        if (this.A02 != null) {
            Iterator A0y = AnonymousClass8BV.A0y(this.A09.values());
            while (A0y.hasNext()) {
                C192399oK r2 = ((C192709oq) A0y.next()).A01;
                if (r2 != null) {
                    A03(r2, r2.A02, false);
                }
            }
            A04(this);
            this.A02.close();
            this.A02 = null;
        }
    }

    public static String A02(InputStream inputStream) {
        StringBuilder sb = new StringBuilder(80);
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                throw new EOFException();
            } else if (read == 10) {
                int length = sb.length();
                if (length > 0) {
                    int i = length - 1;
                    if (sb.charAt(i) == 13) {
                        sb.setLength(i);
                    }
                }
                return sb.toString();
            } else {
                sb.append((char) read);
            }
        }
    }

    public static void A06(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void A09(String str) {
        if (str.contains(" ") || str.contains("\n") || str.contains("\r")) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("keys must not contain spaces or newlines: \"");
            A10.append(str);
            throw AnonymousClass001.A12("\"", A10);
        }
    }

    public static boolean A0A(AiK aiK) {
        int i = aiK.A00;
        if (i < 2000 || i < aiK.A09.size()) {
            return false;
        }
        return true;
    }

    public static void A04(AiK aiK) {
        HashSet A12 = C17880vN.A12();
        while (aiK.A01 > aiK.A05) {
            String A0x = C17880vN.A0x(AnonymousClass000.A16(C17890vO.A0i(aiK.A09)));
            if (aiK.A0C(A0x)) {
                A12.add(A0x);
            }
        }
        C183489Yl r0 = aiK.A0D;
        if (r0 != null) {
            C191149m6 r2 = r0.A00;
            Set set = r2.A03;
            synchronized (set) {
                Iterator it = A12.iterator();
                while (it.hasNext()) {
                    set.remove(C17880vN.A0v(it));
                }
                C17880vN.A1E(AnonymousClass8BU.A08(r2.A02, "phoenix"), "fcs_config_cache_key_set", new JSONArray(set).toString());
            }
        }
    }

    public static void A07(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory()) {
                    A07(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    throw C17880vN.A0f(AnonymousClass001.A1E(file2, "failed to delete file: ", AnonymousClass000.A10()));
                }
            }
            return;
        }
        throw AnonymousClass8BX.A0V(file, "not a directory: ", AnonymousClass000.A10());
    }

    public static void A08(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }
}
