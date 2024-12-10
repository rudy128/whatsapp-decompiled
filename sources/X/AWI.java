package X;

import android.os.CancellationSignal;
import android.util.JsonReader;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class AWI implements C22514BAx {
    public int A00 = 0;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public boolean A06;
    public int A07;
    public final CancellationSignal A08;
    public final AnonymousClass190 A09;
    public final AnonymousClass1L7 A0A;
    public final C18030ve A0B;
    public final C195259t3 A0C;
    public final C193089pW A0D;
    public final C196129uV A0E;
    public final C198749yq A0F;
    public final A7P A0G;
    public final C175248yO A0H;
    public final AnonymousClass10I A0I;
    public final InputStream A0J;
    public final OutputStream A0K;
    public final String A0L;
    public final AnonymousClass11P A0M;
    public final C24521Kq A0N;
    public final AnonymousClass2UC A0O = ((AnonymousClass2UC) AnonymousClass12Q.A03(AnonymousClass2UC.class));

    private boolean A01(File file) {
        JsonReader jsonReader;
        if (file == null || !file.exists()) {
            return false;
        }
        FileInputStream A18 = C108945cZ.A18(file);
        try {
            jsonReader = new JsonReader(new InputStreamReader(A18, C19620yd.A0A));
            jsonReader.beginObject();
            long j = 0;
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("totalSize")) {
                    j = jsonReader.nextLong();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            jsonReader.close();
            A18.close();
            if (j == 0) {
                Log.e("p2p/fpm/ReceiverChatTransferTask/parseFpmManifestInfo/failed to parse");
                return false;
            }
            this.A04 = j;
            C17900vP.A0m("p2p/fpm/ReceiverChatTransferTask/Parsed manifest file, totalSizeExpected=", AnonymousClass000.A10(), j);
            return true;
        } catch (Throwable th) {
            try {
                A18.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    private void A00(long j) {
        JsonReader A0E2;
        AnonymousClass9HZ r1;
        File A002 = this.A0D.A00("logging.json");
        InputStream inputStream = this.A0J;
        byte[] A052 = A05();
        CancellationSignal cancellationSignal = this.A08;
        A8M a8m = A8M.A00;
        C18070vi.A0d(cancellationSignal, 4);
        Long l = null;
        A8M.A03(cancellationSignal, (AnonymousClass1TI) null, A002, inputStream, A052, j);
        FileInputStream A18 = C108945cZ.A18(A002);
        try {
            A0E2 = C108985cd.A0E(A18);
            A0E2.beginObject();
            Integer num = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            ArrayList arrayList = null;
            while (A0E2.hasNext()) {
                String nextName = A0E2.nextName();
                if ("attemptID".equals(nextName)) {
                    str = A0E2.nextString();
                } else if ("donorInfo".equals(nextName)) {
                    A0E2.beginObject();
                    while (A0E2.hasNext()) {
                        String nextName2 = A0E2.nextName();
                        if ("deviceName".equals(nextName2)) {
                            str2 = A0E2.nextString();
                        } else if ("appVersion".equals(nextName2)) {
                            str3 = A0E2.nextString();
                        } else if ("osVersion".equals(nextName2)) {
                            str4 = A0E2.nextString();
                        } else if ("buildType".equals(nextName2)) {
                            num = Integer.valueOf(A0E2.nextInt());
                        } else if ("yearClass2016".equals(nextName2)) {
                            l = Long.valueOf(A0E2.nextLong());
                        } else {
                            A0E2.skipValue();
                        }
                    }
                    A0E2.endObject();
                } else if ("loggingEvents".equals(nextName)) {
                    arrayList = AnonymousClass000.A13();
                    A0E2.beginArray();
                    while (A0E2.hasNext()) {
                        C171778sG r2 = new C171778sG();
                        A0E2.beginObject();
                        while (A0E2.hasNext()) {
                            String nextName3 = A0E2.nextName();
                            if ("eventTypeCode".equals(nextName3)) {
                                r2.A0A = Integer.valueOf(A0E2.nextInt());
                            } else if ("duration".equals(nextName3)) {
                                r2.A0C = Long.valueOf(A0E2.nextLong());
                            } else if ("progress".equals(nextName3)) {
                                r2.A0J = Long.valueOf(A0E2.nextLong());
                            } else if ("exportedDbSize".equals(nextName3)) {
                                r2.A00 = Double.valueOf(A0E2.nextDouble());
                            } else if ("waDbSize".equals(nextName3)) {
                                r2.A02 = Double.valueOf(A0E2.nextDouble());
                            } else {
                                A0E2.skipValue();
                            }
                        }
                        A0E2.endObject();
                        arrayList.add(r2);
                    }
                    A0E2.endArray();
                } else {
                    A0E2.skipValue();
                }
            }
            A0E2.endObject();
            if (str == null) {
                r1 = new AnonymousClass9HZ(201, "Invalid metadata file: attemptId is missing.");
            } else if (str2 == null) {
                r1 = new AnonymousClass9HZ(201, "Invalid metadata file: donorDeviceName is missing.");
            } else if (str3 == null) {
                r1 = new AnonymousClass9HZ(201, "Invalid metadata file: donorAppVersion is missing.");
            } else if (str4 == null) {
                r1 = new AnonymousClass9HZ(201, "Invalid metadata file: donorOsVersion is missing.");
            } else if (num == null) {
                r1 = new AnonymousClass9HZ(201, "Invalid metadata file: donorAppBuild is missing.");
            } else if (l == null) {
                r1 = new AnonymousClass9HZ(201, "Invalid metadata file: donorYearClass is missing.");
            } else if (arrayList != null) {
                int intValue = num.intValue();
                long longValue = l.longValue();
                A0E2.close();
                A18.close();
                A7P a7p = this.A0G;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C171778sG r12 = (C171778sG) it.next();
                    r12.A0Q = AnonymousClass8BR.A0q(a7p.A0C).A07();
                    r12.A0M = str;
                    r12.A04 = 0;
                    r12.A0O = str2;
                    r12.A0N = str3;
                    r12.A0P = str4;
                    r12.A06 = Integer.valueOf(intValue);
                    r12.A0B = Long.valueOf(longValue);
                    a7p.A08.CC7(r12);
                }
                return;
            } else {
                r1 = new AnonymousClass9HZ(201, "Invalid metadata file: loggingEvents are missing.");
            }
            throw r1;
        } catch (Throwable th) {
            try {
                A18.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public void A02() {
        A7P a7p = this.A0G;
        a7p.A0B.CGF(new C21371Aj0(a7p, (double) this.A05, 13, this.A02, this.A03));
        a7p.A06("import");
        ((C195509tS) this.A0F.A0B.get()).A00();
    }

    public void A03(long j, boolean z) {
        long j2 = this.A05 + j;
        this.A05 = j2;
        C175248yO r6 = this.A0H;
        C194989sc r7 = new C194989sc(this.A07, j2, this.A04, false);
        A8M a8m = A8M.A00;
        C18070vi.A0d(r6, 0);
        int i = (int) ((((double) r7.A03) * 100.0d) / ((double) r7.A02));
        if (i > r7.A01) {
            C17890vO.A0s(r6, r7, 22);
        }
        this.A07 = i;
        if (!z) {
            this.A01 += j;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0079, code lost:
        r10.beginArray();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0080, code lost:
        if (r10.hasNext() == false) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0082, code lost:
        r11 = X.C173608vM.A00(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0086, code lost:
        if (r11 == null) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0088, code lost:
        r5.A02++;
        r1 = r11.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0097, code lost:
        if (r1.contains("Media/") == false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0099, code lost:
        r1 = X.C17880vN.A0e((java.io.File) r5.A0A.A02.get(), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ab, code lost:
        if (r1.exists() == false) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ad, code lost:
        r14 = r1.length();
        r0 = r11.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b5, code lost:
        if (r14 != r0) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b8, code lost:
        r1 = r7.A01(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r11 = r11.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bf, code lost:
        if (r18 == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        A03(r0, X.AnonymousClass000.A1O(r11.contains("Media/") ? 1 : 0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(boolean r18) {
        /*
            r17 = this;
            r5 = r17
            int r0 = r5.A00
            r4 = 1
            int r0 = r0 + 1
            r5.A00 = r0
            X.9yq r3 = r5.A0F
            monitor-enter(r3)
            java.io.File r2 = r3.A00     // Catch:{ all -> 0x01c3 }
            if (r2 != 0) goto L_0x001a
            X.9pW r1 = r3.A09     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = "manifest.json"
            java.io.File r2 = r1.A00(r0)     // Catch:{ all -> 0x01c3 }
            r3.A00 = r2     // Catch:{ all -> 0x01c3 }
        L_0x001a:
            monitor-exit(r3)
            X.9pW r7 = r5.A0D
            java.lang.String r3 = "missing_paths.json"
            java.io.File r16 = r7.A01(r3)
            boolean r0 = r16.exists()
            if (r0 == 0) goto L_0x0035
            long r10 = r16.length()
            r8 = 0
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0035
            r2 = r16
        L_0x0035:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "p2p/fpm/ReceiverChatTransferTask/getMissingFiles/verification attempt #"
            r1.append(r0)
            int r0 = r5.A00
            r1.append(r0)
            java.lang.String r9 = " of "
            r1.append(r9)
            r0 = 5
            X.C17900vP.A0o(r1, r0)
            r0 = 0
            r5.A02 = r0
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.io.FileInputStream r8 = X.C108945cZ.A18(r2)
            java.lang.String r2 = X.C19620yd.A0A     // Catch:{ all -> 0x01b9 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x01b9 }
            r0.<init>(r8, r2)     // Catch:{ all -> 0x01b9 }
            android.util.JsonReader r10 = new android.util.JsonReader     // Catch:{ all -> 0x01b9 }
            r10.<init>(r0)     // Catch:{ all -> 0x01b9 }
            r10.beginObject()     // Catch:{ all -> 0x01af }
        L_0x0067:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x01af }
            if (r0 == 0) goto L_0x00e3
            java.lang.String r1 = r10.nextName()     // Catch:{ all -> 0x01af }
            java.lang.String r0 = "relativePaths"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x01af }
            if (r0 == 0) goto L_0x00df
            r10.beginArray()     // Catch:{ all -> 0x01af }
        L_0x007c:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x01af }
            if (r0 == 0) goto L_0x00e3
            X.9Nm r11 = X.C173608vM.A00(r10)     // Catch:{ all -> 0x01af }
            if (r11 == 0) goto L_0x007c
            long r0 = r5.A02     // Catch:{ all -> 0x01af }
            r12 = 1
            long r0 = r0 + r12
            r5.A02 = r0     // Catch:{ all -> 0x01af }
            java.lang.String r1 = r11.A01     // Catch:{ all -> 0x01af }
            java.lang.String r13 = "Media/"
            boolean r0 = r1.contains(r13)     // Catch:{ IOException -> 0x00cd }
            if (r0 == 0) goto L_0x00b8
            X.1L7 r0 = r5.A0A     // Catch:{ IOException -> 0x00cd }
            X.00H r0 = r0.A02     // Catch:{ IOException -> 0x00cd }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x00cd }
            java.io.File r0 = (java.io.File) r0     // Catch:{ IOException -> 0x00cd }
            java.io.File r1 = X.C17880vN.A0e(r0, r1)     // Catch:{ IOException -> 0x00cd }
        L_0x00a7:
            boolean r0 = r1.exists()     // Catch:{ IOException -> 0x00cd }
            if (r0 == 0) goto L_0x00cd
            long r14 = r1.length()     // Catch:{ IOException -> 0x00cd }
            long r0 = r11.A00     // Catch:{ IOException -> 0x00cd }
            int r12 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r12 != 0) goto L_0x00cd
            goto L_0x00bd
        L_0x00b8:
            java.io.File r1 = r7.A01(r1)     // Catch:{ IOException -> 0x00cd }
            goto L_0x00a7
        L_0x00bd:
            java.lang.String r11 = r11.A01     // Catch:{ all -> 0x01af }
            if (r18 == 0) goto L_0x007c
            boolean r11 = r11.contains(r13)     // Catch:{ all -> 0x01af }
            boolean r11 = X.AnonymousClass000.A1O(r11)
            r5.A03(r0, r11)     // Catch:{ all -> 0x01af }
            goto L_0x007c
        L_0x00cd:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x01af }
            java.lang.String r0 = "p2p/fpm/ReceiverChatTransferTask/unable to verify file, path: "
            r1.append(r0)     // Catch:{ all -> 0x01af }
            java.lang.String r0 = r11.A01     // Catch:{ all -> 0x01af }
            X.C17890vO.A1B(r1, r0)     // Catch:{ all -> 0x01af }
            r6.add(r11)     // Catch:{ all -> 0x01af }
            goto L_0x007c
        L_0x00df:
            r10.skipValue()     // Catch:{ all -> 0x01af }
            goto L_0x0067
        L_0x00e3:
            r10.close()     // Catch:{ all -> 0x01b9 }
            r8.close()
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()
            java.lang.String r0 = "p2p/fpm/ReceiverChatTransferTask/getMissingFiles/missing "
            X.C17890vO.A14(r0, r8, r6)
            r8.append(r9)
            long r0 = r5.A02
            r8.append(r0)
            java.lang.String r0 = " total files"
            X.C17890vO.A1A(r8, r0)
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0171
            int r1 = r5.A00
            r0 = 5
            if (r1 >= r0) goto L_0x0171
            X.C108985cd.A1C(r16)
            java.io.File r4 = r7.A00(r3)
            java.io.FileOutputStream r3 = X.C108945cZ.A19(r4)
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x016c }
            r0.<init>(r3, r2)     // Catch:{ all -> 0x016c }
            android.util.JsonWriter r2 = new android.util.JsonWriter     // Catch:{ all -> 0x016c }
            r2.<init>(r0)     // Catch:{ all -> 0x016c }
            r2.beginObject()     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = "relativePaths"
            r2.name(r0)     // Catch:{ all -> 0x0162 }
            r2.beginArray()     // Catch:{ all -> 0x0162 }
            java.util.Iterator r1 = r6.iterator()     // Catch:{ all -> 0x0162 }
        L_0x012e:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0162 }
            if (r0 == 0) goto L_0x013e
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0162 }
            X.9Nm r0 = (X.C180679Nm) r0     // Catch:{ all -> 0x0162 }
            r0.A00(r2)     // Catch:{ all -> 0x0162 }
            goto L_0x012e
        L_0x013e:
            r2.endArray()     // Catch:{ all -> 0x0162 }
            android.util.JsonWriter r0 = r2.endObject()     // Catch:{ all -> 0x0162 }
            r0.flush()     // Catch:{ all -> 0x0162 }
            r2.close()     // Catch:{ all -> 0x016c }
            r3.close()
            byte[] r3 = r5.A05()
            r1 = 104(0x68, float:1.46E-43)
            r0 = 0
            X.8vX r2 = new X.8vX
            r2.<init>(r0, r4, r3, r1)
            java.io.OutputStream r1 = r5.A0K
            android.os.CancellationSignal r0 = r5.A08
            X.A8M.A02(r0, r2, r1)
            return
        L_0x0162:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0167 }
            goto L_0x016b
        L_0x0167:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x016c }
        L_0x016b:
            throw r1     // Catch:{ all -> 0x016c }
        L_0x016c:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x01be }
            throw r1
        L_0x0171:
            long r2 = r5.A02
            long r0 = X.AnonymousClass8BR.A06(r6)
            long r2 = r2 - r0
            r5.A03 = r2
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x01ac
            java.lang.String r0 = "p2p/fpm/ReceiverChatTransferTask/transfer complete because all files received"
        L_0x0182:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.System.currentTimeMillis()
            byte[] r0 = X.C182319Tx.A01
            r1 = 250(0xfa, float:3.5E-43)
            X.A4Y r0 = new X.A4Y
            r0.<init>(r1)
            java.io.OutputStream r3 = r5.A0K
            android.os.CancellationSignal r2 = r5.A08
            X.A8M.A02(r2, r0, r3)
            r5.A06 = r4
            X.A7P r1 = r5.A0G
            java.lang.String r0 = "logging_metadata"
            r1.A06(r0)
            r1 = 102(0x66, float:1.43E-43)
            X.A4Y r0 = new X.A4Y
            r0.<init>(r1)
            X.A8M.A02(r2, r0, r3)
            return
        L_0x01ac:
            java.lang.String r0 = "p2p/fpm/ReceiverChatTransferTask/transfer complete because maximum retry attempts reached"
            goto L_0x0182
        L_0x01af:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x01b4 }
            goto L_0x01b8
        L_0x01b4:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x01b9 }
        L_0x01b8:
            throw r1     // Catch:{ all -> 0x01b9 }
        L_0x01b9:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x01be }
            throw r1
        L_0x01be:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x01c3:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AWI.A04(boolean):void");
    }

    public byte[] A05() {
        C24521Kq r0 = C24521Kq.$redex_init_class;
        String A002 = this.A0C.A00(A7Y.A0L);
        if (A002 != null) {
            return AnonymousClass8BT.A1a(A002);
        }
        throw new AnonymousClass9HZ(105, "Failed to initiate decryption, key is missing.");
    }

    public void cancel() {
        this.A08.cancel();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:18|19|20|21|22|111) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0091 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r23 = this;
            r0 = r23
            X.A7P r5 = r0.A0G
            r1 = 9
            r5.A04(r1)
            X.1Kq r1 = X.C24521Kq.$redex_init_class
            java.lang.String r1 = "auth_token"
            r5.A06(r1)     // Catch:{ 9La | IOException -> 0x0263 }
            java.io.InputStream r13 = r0.A0J     // Catch:{ 9La | IOException -> 0x0263 }
            java.lang.String r6 = r0.A0L     // Catch:{ 9La | IOException -> 0x0263 }
            r4 = 0
            X.A4Y r3 = X.A8M.A00(r4, r13)     // Catch:{ 9La | IOException -> 0x0263 }
            int r2 = r3.A01     // Catch:{ 9La | IOException -> 0x0263 }
            r1 = 300(0x12c, float:4.2E-43)
            if (r2 != r1) goto L_0x0259
            long r1 = r3.A02     // Catch:{ 9La | IOException -> 0x0263 }
            java.lang.String r1 = X.A8M.A01(r4, r13, r4, r1)     // Catch:{ 9La | IOException -> 0x0263 }
            boolean r1 = r6.equals(r1)     // Catch:{ 9La | IOException -> 0x0263 }
            if (r1 == 0) goto L_0x0259
            java.lang.String r1 = "p2p/fpm/ReceiverChatTransferTask/auth token verified"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 9La | IOException -> 0x0263 }
            java.lang.String r1 = "protocol_agreement"
            r5.A06(r1)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            X.0ve r3 = r0.A0B     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            byte[] r1 = X.C182319Tx.A01     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            r1 = 0
            X.C18070vi.A0d(r3, r1)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            r2 = 6448(0x1930, float:9.036E-42)
            X.0vf r1 = X.C18040vf.A02     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            int r2 = X.C18020vd.A00(r1, r3, r2)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            r1 = 4
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            r1.putInt(r2)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            byte[] r4 = r1.array()     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            X.C18070vi.A0X(r4)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            r3 = 0
            r1 = 100
            X.8vW r2 = new X.8vW     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            r2.<init>(r4, r3, r1)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            java.io.OutputStream r6 = r0.A0K     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            android.os.CancellationSignal r10 = r0.A08     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
        L_0x0060:
            X.A8M.A02(r10, r2, r6)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
        L_0x0063:
            X.A4Y r7 = X.A8M.A00(r10, r13)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            int r3 = r7.A01     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            r1 = 250(0xfa, float:3.5E-43)
            r4 = 0
            if (r3 == r1) goto L_0x021c
            r1 = 251(0xfb, float:3.52E-43)
            if (r3 == r1) goto L_0x0236
            switch(r3) {
                case 200: goto L_0x00a3;
                case 201: goto L_0x01bb;
                case 202: goto L_0x01a1;
                case 203: goto L_0x0150;
                case 204: goto L_0x00df;
                default: goto L_0x0075;
            }     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
        L_0x0075:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            java.lang.String r1 = "p2p/fpm/ReceiverChatTransferTask/Received unexpected message with type: "
            X.C17900vP.A0i(r1, r2, r3)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            long r1 = r7.A02     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            r7 = 0
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 <= 0) goto L_0x0063
            r3 = 2
            X.C18070vi.A0d(r10, r3)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            r10.throwIfCanceled()     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            r13.skip(r1)     // Catch:{ IOException -> 0x0091 }
            goto L_0x0063
        L_0x0091:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            java.lang.String r3 = "p2p/P2PDataTransferUtils/ Couldn't skip "
            r4.append(r3)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            r4.append(r1)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            java.lang.String r1 = " of bytes from the input stream"
            X.C17890vO.A19(r4, r1)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            goto L_0x0063
        L_0x00a3:
            long r1 = r7.A02     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            int r3 = (int) r1     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            byte[] r3 = new byte[r3]     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            int r2 = r13.read(r3)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            r1 = -1
            if (r2 == r1) goto L_0x0221
            r1 = 4
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r3, r4, r1)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            int r3 = r1.getInt()     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            X.9uV r1 = r0.A0E     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            X.00H r1 = r1.A01     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            android.content.SharedPreferences$Editor r2 = X.AnonymousClass8BV.A06(r1)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            java.lang.String r1 = "/export/protocolVersion"
            X.C17880vN.A1C(r2, r1, r3)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            X.9yq r3 = r0.A0F     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            monitor-enter(r3)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            java.io.File r1 = r3.A00     // Catch:{ all -> 0x022b }
            monitor-exit(r3)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            boolean r1 = r0.A01(r1)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            if (r1 == 0) goto L_0x00d6
            r1 = 1
            r0.A04(r1)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            goto L_0x0063
        L_0x00d6:
            java.lang.String r1 = "enc_metadata"
            r5.A06(r1)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            r1 = 101(0x65, float:1.42E-43)
            goto L_0x01b4
        L_0x00df:
            long r1 = r7.A02     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            byte[] r3 = r0.A05()     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            java.lang.String r2 = X.A8M.A01(r10, r13, r3, r1)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            X.A4Y r3 = X.A8M.A00(r10, r13)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            if (r2 != 0) goto L_0x0115
            long r3 = r3.A02     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            long r1 = r13.skip(r3)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x010e
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            java.lang.String r7 = "p2p/fpm/ReceiverChatTransferTask/Expected to skip "
            r8.append(r7)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            r8.append(r3)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            java.lang.String r3 = " bytes, but skipped "
            java.lang.String r1 = X.C17890vO.A0a(r3, r8, r1)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
        L_0x010e:
            java.lang.String r1 = "p2p/fpm/ReceiverChatTransferTask/file header corrupted, skipping"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            goto L_0x0063
        L_0x0115:
            java.lang.String r1 = "Media/"
            boolean r1 = r2.contains(r1)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            if (r1 == 0) goto L_0x0149
            X.1L7 r1 = r0.A0A     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            X.00H r1 = r1.A02     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            java.lang.Object r1 = r1.get()     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            java.io.File r1 = (java.io.File) r1     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            java.io.File r12 = X.C17880vN.A0e(r1, r2)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            java.io.File r1 = r12.getParentFile()     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            if (r1 == 0) goto L_0x0138
            java.io.File r1 = r12.getParentFile()     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            r1.mkdirs()     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
        L_0x0138:
            long r15 = r3.A02     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            byte[] r14 = r0.A05()     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            r1 = 2
            X.Aei r11 = new X.Aei     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            r11.<init>(r1, r2, r0)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            X.A8M.A03(r10, r11, r12, r13, r14, r15)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            goto L_0x0063
        L_0x0149:
            X.9pW r1 = r0.A0D     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            java.io.File r12 = r1.A00(r2)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            goto L_0x0138
        L_0x0150:
            long r15 = r7.A02     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            X.9yq r3 = r0.A0F     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            monitor-enter(r3)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            java.io.File r12 = r3.A00     // Catch:{ all -> 0x022b }
            if (r12 != 0) goto L_0x0163
            X.9pW r2 = r3.A09     // Catch:{ all -> 0x022b }
            java.lang.String r1 = "manifest.json"
            java.io.File r12 = r2.A00(r1)     // Catch:{ all -> 0x022b }
            r3.A00 = r12     // Catch:{ all -> 0x022b }
        L_0x0163:
            monitor-exit(r3)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            byte[] r14 = r0.A05()     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            r1 = 4
            X.C18070vi.A0d(r10, r1)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            r11 = 0
            X.A8M.A03(r10, r11, r12, r13, r14, r15)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            r0.A01(r12)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            long r1 = r0.A04     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            double r7 = (double) r1     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            long r3 = r0.A02     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            long r1 = r0.A03     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            r18 = 12
            X.10I r9 = r5.A0B     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            X.Aj0 r14 = new X.Aj0     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            r16 = r7
            r19 = r3
            r21 = r1
            r15 = r5
            r14.<init>(r15, r16, r18, r19, r21)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            r9.CGF(r14)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            java.lang.String r1 = "transfer"
            r5.A06(r1)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            r2 = 104(0x68, float:1.46E-43)
            X.A4Y r1 = new X.A4Y     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            r1.<init>(r2)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            X.A8M.A02(r10, r1, r6)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            java.lang.System.currentTimeMillis()     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            goto L_0x0063
        L_0x01a1:
            boolean r3 = r0.A06     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            long r1 = r7.A02     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            if (r3 == 0) goto L_0x01af
            r0.A00(r1)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            r0.A02()     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            goto L_0x022e
        L_0x01af:
            r0.A00(r1)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            r1 = 103(0x67, float:1.44E-43)
        L_0x01b4:
            X.A4Y r2 = new X.A4Y     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            r2.<init>(r1)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            goto L_0x0060
        L_0x01bb:
            long r1 = r7.A02     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            int r3 = (int) r1     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            byte[] r3 = new byte[r3]     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            int r2 = r13.read(r3)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            r1 = -1
            if (r2 == r1) goto L_0x022f
            java.lang.String r1 = "enc_key_retrieval"
            r5.A06(r1)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            r2 = 6
            X.Al8 r1 = new X.Al8     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            r1.<init>(r3, r0, r2)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            java.util.concurrent.FutureTask r3 = new java.util.concurrent.FutureTask     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            r3.<init>(r1)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            X.10I r1 = r0.A0I     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            r1.CGN(r3)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            r2 = 103(0x67, float:1.44E-43)
            X.A4Y r1 = new X.A4Y     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            r1.<init>(r2)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            X.A8M.A02(r10, r1, r6)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            java.lang.Object r1 = r3.get()     // Catch:{ InterruptedException -> 0x0214, ExecutionException -> 0x0204 }
            X.9gG r1 = (X.C187719gG) r1     // Catch:{ InterruptedException -> 0x0214, ExecutionException -> 0x0204 }
            X.9t3 r3 = r0.A0C     // Catch:{ InterruptedException -> 0x0214, ExecutionException -> 0x0204 }
            java.lang.String r2 = "import/metadata/key"
            java.lang.String r1 = r1.A03     // Catch:{ InterruptedException -> 0x0214, ExecutionException -> 0x0204 }
            r3.A01(r2, r1)     // Catch:{ InterruptedException -> 0x0214, ExecutionException -> 0x0204 }
            byte[] r2 = r0.A05()     // Catch:{ InterruptedException -> 0x0214, ExecutionException -> 0x0204 }
            r1 = 2
            android.util.Base64.encodeToString(r2, r1)     // Catch:{ InterruptedException -> 0x0214, ExecutionException -> 0x0204 }
            java.lang.String r1 = "manifest_file"
            r5.A06(r1)     // Catch:{ InterruptedException -> 0x0214, ExecutionException -> 0x0204 }
            goto L_0x0063
        L_0x0204:
            r2 = move-exception
            java.lang.Throwable r1 = r2.getCause()     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            boolean r1 = r1 instanceof java.io.IOException     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            if (r1 != 0) goto L_0x023e
            java.lang.String r1 = "p2p/fpm/ReceiverChatTransferTask/Unexpected exception occurred during encryption key retrieval "
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            goto L_0x0063
        L_0x0214:
            r2 = move-exception
            java.lang.String r1 = "p2p/fpm/ReceiverChatTransferTask/Exception while waiting"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            goto L_0x0063
        L_0x021c:
            r0.A04(r4)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            goto L_0x0063
        L_0x0221:
            r3 = 605(0x25d, float:8.48E-43)
            java.lang.String r2 = "No bytes to read"
            X.9HZ r1 = new X.9HZ     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            r1.<init>((int) r3, (java.lang.String) r2)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            throw r1     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
        L_0x022b:
            r2 = move-exception
            monitor-exit(r3)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            goto L_0x0242
        L_0x022e:
            return
        L_0x022f:
            java.lang.String r1 = "No bytes to read"
            java.io.IOException r2 = X.C17880vN.A0f(r1)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            goto L_0x0242
        L_0x0236:
            int r1 = r7.A00     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            X.9La r2 = new X.9La     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            r2.<init>(r1)     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
            goto L_0x0242
        L_0x023e:
            java.lang.Throwable r2 = r2.getCause()     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
        L_0x0242:
            throw r2     // Catch:{ OperationCanceledException -> 0x0243, 9La | IOException -> 0x0263 }
        L_0x0243:
            r5 = 2
            r4 = 251(0xfb, float:3.52E-43)
            r1 = 0
            X.A4Y r3 = new X.A4Y     // Catch:{ 9La | IOException -> 0x0263 }
            r3.<init>((int) r4, (long) r1, (int) r5)     // Catch:{ 9La | IOException -> 0x0263 }
            java.io.OutputStream r2 = r0.A0K     // Catch:{ 9La | IOException -> 0x0263 }
            r1 = 0
            X.A8M.A02(r1, r3, r2)     // Catch:{ 9La | IOException -> 0x0263 }
            java.lang.String r1 = "p2p/fpm/ReceiverChatTransferTask/cancel successful"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 9La | IOException -> 0x0263 }
            return
        L_0x0259:
            X.8yO r3 = r0.A0H     // Catch:{ 9La | IOException -> 0x0263 }
            r2 = 107(0x6b, float:1.5E-43)
            java.lang.String r1 = "auth token does not match"
            r3.A00(r2, r1)     // Catch:{ 9La | IOException -> 0x0263 }
            return
        L_0x0263:
            r2 = move-exception
            boolean r1 = r0.A06
            if (r1 == 0) goto L_0x0271
            java.lang.String r1 = "p2p/fpm/ReceiverChatTransferTask/Unable to finish end of transfer due to stream closing"
            com.whatsapp.util.Log.e(r1, r2)
            r0.A02()
            return
        L_0x0271:
            X.8yO r0 = r0.A0H
            X.A8M.A04(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AWI.run():void");
    }

    public AWI(AnonymousClass190 r2, AnonymousClass1L7 r3, AnonymousClass11P r4, C24521Kq r5, C18030ve r6, C195259t3 r7, C193089pW r8, C196129uV r9, C198749yq r10, A7P a7p, C175248yO r12, AnonymousClass10I r13, InputStream inputStream, OutputStream outputStream, String str) {
        this.A0M = r4;
        this.A0B = r6;
        this.A0L = str;
        this.A09 = r2;
        this.A0I = r13;
        this.A0A = r3;
        this.A0J = inputStream;
        this.A0K = outputStream;
        this.A0F = r10;
        this.A0G = a7p;
        this.A0D = r8;
        this.A0H = r12;
        this.A0C = r7;
        this.A0E = r9;
        this.A0N = r5;
        this.A08 = new CancellationSignal();
    }
}
