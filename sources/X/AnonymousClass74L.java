package X;

import android.app.Notification;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.media.WamediaManager;
import com.whatsapp.util.Log;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.FutureTask;

/* renamed from: X.74L  reason: invalid class name */
public class AnonymousClass74L {
    public static HashSet A00;

    public static int A00(C128516gE r4, C139666zF r5, File file, String str, URL url) {
        String str2 = r5.A0G;
        if (str2 == null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("MediaDownload/checkMediaHash/message-supplied media hash is null mediaHash=");
            C17890vO.A1B(A10, r5.A0H);
            str2 = r4.A01;
        }
        if (str == null) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("MediaDownload/MMS download failed to calculate hash; mediaHash=");
            A102.append(r5.A0H);
            A102.append("; url=");
            A102.append(url);
            A102.append("; downloadFile=");
            A102.append(file.getAbsolutePath());
            A102.append("; downloadFile.exists?=");
            Log.w(AnonymousClass3MY.A0r(A102, file.exists()));
            return 27;
        } else if (str.equals(str2)) {
            return 0;
        } else {
            StringBuilder A103 = AnonymousClass000.A10();
            A103.append("MediaDownload/MMS download failed due to hash mismatch; mediaHash=");
            A103.append(r5.A0H);
            A103.append("; url=");
            A103.append(url);
            A103.append("; receivedHash=");
            A103.append(str2);
            C17900vP.A0g("; localHash=", str, A103);
            return 32;
        }
    }

    public static int A01(C139666zF r7, String str, URL url) {
        if (str == null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("MediaDownload/MMS download failed during media decryption due to plaintext hash not calculated properly; mediaHash=");
            String str2 = r7.A0H;
            A10.append(str2);
            A10.append("; url=");
            A10.append(url);
            C17900vP.A0c("; mediaHash=", str2, "; calculatedHash=", str, A10);
            A10.append("; mediaSize=");
            Log.w(C17880vN.A0u(A10, r7.A07));
            return 1;
        }
        String str3 = r7.A0H;
        if (str.equals(str3)) {
            return 0;
        }
        StringBuilder A102 = AnonymousClass000.A10();
        C17890vO.A10("MediaDownload/MMS download failed during media decryption due to plaintext hash mismatch; mediaHash=", str3, "; url=", A102);
        A102.append(url);
        C17900vP.A0c("; mediaHash=", str3, "; calculatedHash=", str, A102);
        A102.append("; mediaSize=");
        Log.w(C17880vN.A0u(A102, r7.A07));
        return 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = (X.AnonymousClass21V) r14;
        r4 = r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long A02(X.C218617r r11, X.AnonymousClass11Z r12, X.C18030ve r13, X.AnonymousClass206 r14) {
        /*
            boolean r0 = r14 instanceof X.AnonymousClass21V
            r2 = 0
            if (r0 == 0) goto L_0x0027
            r0 = r14
            X.21V r0 = (X.AnonymousClass21V) r0
            boolean r10 = r14 instanceof X.AnonymousClass215
            X.1So r5 = X.C63972u0.A02(r14)
            java.lang.String r7 = r0.A05
            java.lang.String r8 = r0.A07
            r9 = 0
            r6 = 0
            r4 = r11
            java.io.File r1 = r4.A0N(r5, r6, r7, r8, r9, r10)
            if (r1 == 0) goto L_0x0027
            X.7Iw r0 = new X.7Iw
            r0.<init>(r12, r13, r1)
            r0.CR5()
            long r0 = r0.A00
            return r0
        L_0x0027:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74L.A02(X.17r, X.11Z, X.0ve, X.206):long");
    }

    public static String A07(String str) {
        if (str != null) {
            String A03 = C25291Nq.A03(str);
            if (!TextUtils.isEmpty(A03)) {
                return A03;
            }
        }
        return "enc";
    }

    public static String A08(String str) {
        HashSet hashSet;
        synchronized (AnonymousClass74L.class) {
            hashSet = A00;
            if (hashSet == null) {
                String[] strArr = new String[3];
                strArr[0] = "bundle";
                strArr[1] = "class";
                hashSet = C17900vP.A0I("dylib", strArr, 2);
                A00 = hashSet;
            }
        }
        if (str == null) {
            return null;
        }
        if (str.length() <= 4 || hashSet.contains(str)) {
            return str;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008d, code lost:
        if (r2 == 4) goto L_0x008f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A09(X.AnonymousClass190 r18, X.C218617r r19, X.C185849dF r20, X.C32381h6 r21, com.whatsapp.media.WamediaManager r22, X.C115295ti r23, X.C136996uk r24, X.C139666zF r25, X.C138906xt r26, X.C62272r8 r27, X.C1408873l r28, java.io.File r29, int r30, int r31) {
        /*
            r2 = r25
            byte[] r13 = r2.A0d
            java.lang.String r11 = r2.A0H
            java.lang.String r12 = r2.A0L
            int r15 = r2.A00
            long r0 = r2.A07
            X.1So r9 = r2.A0A
            r14 = r31
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r10 = r29
            r16 = r0
            boolean r4 = X.C26521Sl.A0c(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r3 = r24
            if (r4 == 0) goto L_0x0086
            boolean r0 = X.C25291Nq.A06(r9)
            if (r0 != 0) goto L_0x006f
            boolean r0 = X.C63972u0.A07(r9)
            if (r0 != 0) goto L_0x006f
            boolean r1 = r2.A0Z
            boolean r0 = X.C63972u0.A04(r9)
            if (r0 == 0) goto L_0x0083
            if (r1 == 0) goto L_0x0083
            boolean r0 = r2.A0P
            if (r0 != 0) goto L_0x0083
            byte[] r0 = r3.A0G()
            if (r0 != 0) goto L_0x0083
            java.io.File r0 = r5.A0f(r11, r12)
            if (r0 == 0) goto L_0x0083
            java.io.FileInputStream r0 = X.C108945cZ.A18(r0)     // Catch:{ IOException -> 0x0068 }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0068 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0068 }
            byte[] r0 = X.C181039Ox.A00(r2)     // Catch:{ all -> 0x005e }
            r3.A0F(r0)     // Catch:{ all -> 0x005e }
            r2.close()     // Catch:{ IOException -> 0x0068 }
            goto L_0x0083
        L_0x005e:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0063 }
            goto L_0x0067
        L_0x0063:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x0068 }
        L_0x0067:
            throw r1     // Catch:{ IOException -> 0x0068 }
        L_0x0068:
            r1 = move-exception
            java.lang.String r0 = "MediaDownload/createProgressiveThumbnail/created progressive/thumbnail could not be read"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0083
        L_0x006f:
            java.io.File r17 = r5.A0g(r11, r12)
            if (r17 == 0) goto L_0x0083
            r10 = r18
            r14 = r26
            r15 = r27
            r16 = r28
            r11 = r8
            r12 = r3
            r13 = r2
            A0A(r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x0083:
            r23.A0G()
        L_0x0086:
            r0 = 3
            r2 = r30
            if (r2 == r0) goto L_0x008f
            r0 = 4
            r1 = 0
            if (r2 != r0) goto L_0x0090
        L_0x008f:
            r1 = 1
        L_0x0090:
            if (r4 == 0) goto L_0x009d
            boolean r0 = X.C63972u0.A07(r9)
            if (r0 == 0) goto L_0x009d
            if (r1 == 0) goto L_0x009d
            r3.A06()
        L_0x009d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74L.A09(X.190, X.17r, X.9dF, X.1h6, com.whatsapp.media.WamediaManager, X.5ti, X.6uk, X.6zF, X.6xt, X.2r8, X.73l, java.io.File, int, int):void");
    }

    public static boolean A0D(Context context, int i) {
        return AnonymousClass000.A1W(((JobScheduler) context.getSystemService("jobscheduler")).getPendingJob(i));
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.1LU, java.lang.Object] */
    public static Notification A03(Context context, String str, String str2, ArrayList arrayList) {
        AnonymousClass21V r3;
        AnonymousClass1BI r1;
        C1409673t A03 = C217217d.A03(context);
        A03.A0M = "sending_media@1";
        A03.A0L = "progress";
        A03.A09(System.currentTimeMillis());
        A03.A0F(str);
        A03.A0E(str);
        A03.A0D(str2);
        boolean z = false;
        if (!(arrayList == null || (r3 = (AnonymousClass21V) arrayList.get(0)) == null || (r1 = r3.A0v.A00) == null)) {
            Intent A1w = new Object().A1w(context, r1, 0);
            C60442o2.A01(A1w, "MediaDownloadService");
            A03.A0A = C1408573i.A00(context, 5, A1w, 134217728);
            int i = (int) AnonymousClass206.A00(r3).A0C;
            if (i >= 0) {
                if (arrayList.size() > 1) {
                    z = true;
                }
                A03.A07(100, i, z);
            }
        }
        A03.A08.icon = 17301633;
        return A03.A05();
    }

    public static C1409173o A04(C115295ti r7, C128516gE r8, C139666zF r9, File file, File file2, String str, String str2, URL url) {
        String A07;
        int A002 = A00(r8, r9, file2, str, url);
        FutureTask futureTask = r7.A02;
        if (!futureTask.isCancelled()) {
            if (A002 != 0) {
                return new C1409173o(A002, (String) null, true);
            }
            if (file.equals(file2)) {
                A07 = r8.A02;
            } else {
                int A01 = A01(r9, str2, url);
                if (!futureTask.isCancelled()) {
                    if (A01 != 0) {
                        int i = 31;
                        if (A01 != 1) {
                            i = 7;
                        }
                        return new C1409173o(i, (String) null, true);
                    }
                    A07 = A07(r9.A0J);
                }
            }
            return new C1409173o((File) null, A07, 0, true, false);
        }
        return new C1409173o(13, (String) null, false);
    }

    public static String A05(Context context, AnonymousClass1M9 r8, C24921Me r9, ArrayList arrayList) {
        Resources resources;
        int i;
        int i2;
        Object[] objArr;
        if (!arrayList.isEmpty()) {
            AnonymousClass21V r1 = (AnonymousClass21V) arrayList.get(0);
            if (!(r1 instanceof C438921i)) {
                AnonymousClass1BI r0 = r1.A0v.A00;
                if (r0 != null) {
                    String A02 = C63462t7.A02(AnonymousClass3MY.A0p(r8, r9, r0));
                    if (arrayList.size() == 1) {
                        return C17890vO.A0R(context, A02, 1, 0, 2131893013);
                    }
                    resources = context.getResources();
                    i = 2131755284;
                    i2 = arrayList.size() - 1;
                    objArr = new Object[2];
                    objArr[0] = A02;
                }
            } else if (arrayList.size() == 1) {
                return r1.A19();
            } else {
                resources = context.getResources();
                i = 2131755283;
                i2 = arrayList.size() - 1;
                objArr = new Object[2];
                objArr[0] = r1.A19();
            }
            C17880vN.A1T(objArr, arrayList.size() - 1, 1);
            return resources.getQuantityString(i, i2, objArr);
        }
        return null;
    }

    public static String A06(Context context, ArrayList arrayList) {
        boolean z;
        Resources resources;
        int i;
        if (arrayList.isEmpty()) {
            return null;
        }
        Object obj = arrayList.get(0);
        if (!arrayList.isEmpty()) {
            int i2 = ((AnonymousClass206) arrayList.get(0)).A0u;
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C17880vN.A0Y(it).A0u != i2) {
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        if (z) {
            if (obj instanceof C438921i) {
                resources = context.getResources();
                i = 2131755095;
            } else if (obj instanceof AnonymousClass21Y) {
                resources = context.getResources();
                i = 2131755097;
            }
            int size = arrayList.size();
            Object[] objArr = new Object[1];
            C17880vN.A1T(objArr, arrayList.size(), 0);
            return resources.getQuantityString(i, size, objArr);
        }
        resources = context.getResources();
        i = 2131755096;
        int size2 = arrayList.size();
        Object[] objArr2 = new Object[1];
        C17880vN.A1T(objArr2, arrayList.size(), 0);
        return resources.getQuantityString(i, size2, objArr2);
    }

    public static void A0A(AnonymousClass190 r5, WamediaManager wamediaManager, C136996uk r7, C139666zF r8, C138906xt r9, C62272r8 r10, C1408873l r11, File file) {
        C26551So r3;
        C54912eu A002;
        if ((r7.A00() != 1 || !C63972u0.A0A(r8.A0A)) && (r3 = r8.A0A) != C26551So.A0f && (A002 = new C57852jk(r5, wamediaManager, r9, r10, r11).A00(new C54902et(r3, file, r8.A0J, r8.A0P))) != null) {
            byte[] bArr = A002.A02;
            if (bArr != null) {
                r7.A0F(bArr);
            }
            Pair pair = A002.A01;
            if (pair != null) {
                int A01 = C108965cb.A01(pair);
                synchronized (r7) {
                    r7.A0A = Integer.valueOf(A01);
                }
                int A003 = C108965cb.A00(pair);
                synchronized (r7) {
                    r7.A09 = Integer.valueOf(A003);
                }
            }
            Pair pair2 = A002.A00;
            if (pair2 != null) {
                int A012 = C108965cb.A01(pair2);
                synchronized (r7) {
                    r7.A07 = Integer.valueOf(A012);
                }
                int A004 = C108965cb.A00(pair2);
                synchronized (r7) {
                    r7.A08 = Integer.valueOf(A004);
                }
            }
            byte[] bArr2 = A002.A03;
            synchronized (r7) {
                r7.A0I = bArr2;
            }
        }
    }

    public static void A0C(C218617r r2, C1409173o r3, File file, File file2) {
        if (r3.A03() && !file.equals(file2)) {
            file.delete();
        } else if (r3.A01 == 1) {
            file.delete();
            C115295ti.A08(r2, file2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02d0, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02d1, code lost:
        r0 = "MediaDownload/Classify caught exception: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02d3, code lost:
        com.whatsapp.util.Log.e(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0110, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0111, code lost:
        r0 = "MediaDownload/Classify caught Kaleidoscope exception: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0115, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0116, code lost:
        r0 = "MediaDownload/Classify caught IO exception: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01cb, code lost:
        if (r11 != false) goto L_0x02d6;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x020c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0B(X.C218617r r19, X.C18030ve r20, X.AnonymousClass18K r21, com.whatsapp.media.WamediaManager r22, com.whatsapp.media.attachment.Kaleidoscope r23, X.C115295ti r24, X.C136996uk r25, X.C139666zF r26, X.C26431Sc r27, X.C1185864a r28, X.C138906xt r29, java.io.File r30) {
        /*
            r1 = 8082(0x1f92, float:1.1325E-41)
            X.0vf r0 = X.C18040vf.A02
            r2 = r20
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r10 = r22
            r18 = r24
            r9 = r25
            r8 = r26
            r7 = r30
            if (r0 == 0) goto L_0x011a
            r10.ensureWamediaManagerStarted()
            java.lang.String r3 = r7.getAbsolutePath()
            java.lang.String r0 = r8.A0K
            if (r0 == 0) goto L_0x0059
            java.lang.String r1 = X.C64062u9.A09(r0)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r1.toLowerCase(r0)
        L_0x002b:
            java.lang.String r14 = A08(r2)
            java.lang.String r12 = r8.A0J
            X.647 r6 = new X.647
            r6.<init>()
            long r4 = java.lang.System.nanoTime()
            java.lang.Long r0 = X.C17890vO.A0L()
            r6.A03 = r0
            java.lang.Long r0 = r9.A05()
            r6.A00 = r0
            long r0 = r7.length()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A01 = r0
            r6.A07 = r14
            r6.A09 = r12
            java.lang.String r0 = "2"
            r6.A0A = r0
            goto L_0x005b
        L_0x0059:
            r2 = 0
            goto L_0x002b
        L_0x005b:
            r0 = r23
            com.whatsapp.media.attachment.Kaleidoscope$KaleidoscopeCheckResult r11 = r0.classify((java.lang.String) r3, (java.lang.String) r2, (java.lang.String) r12)     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            int r13 = r11.score     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            long r2 = r11.reason     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            java.lang.Long r0 = X.C17880vN.A0n(r13)     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            r6.A03 = r0     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            r6.A02 = r0     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            java.lang.String r1 = "/"
            java.util.List r0 = r11.extensions     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            java.lang.String r0 = X.AnonymousClass2SU.A00(r1, r0)     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            r6.A06 = r0     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            java.lang.String r0 = r11.mimetype     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            r6.A08 = r0     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            monitor-enter(r9)     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            r9.A0C = r0     // Catch:{ all -> 0x010d }
            monitor-exit(r9)     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            java.lang.String r0 = "MediaDownload/Classify returned: "
            r1.append(r0)     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            r1.append(r13)     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            java.lang.String r0 = ", extension (hint): "
            r1.append(r0)     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            r1.append(r14)     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            java.lang.String r0 = ", mimetype: "
            X.C17900vP.A0f(r0, r12, r1)     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            long r0 = java.lang.System.nanoTime()     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            java.lang.Long r0 = X.C108945cZ.A1B(r0, r4)     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            r6.A05 = r0     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            r0 = 90
            if (r13 < r0) goto L_0x00f1
            java.lang.String r1 = r6.A06     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            java.lang.String r0 = "mp4"
            if (r1 == r0) goto L_0x00ba
            java.lang.String r0 = "mov"
            if (r1 == r0) goto L_0x00ba
            java.lang.String r1 = r6.A08     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            java.lang.String r0 = "video/mp4"
            if (r1 != r0) goto L_0x02d6
        L_0x00ba:
            r0 = r18
            java.util.concurrent.FutureTask r0 = r0.A02     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            boolean r0 = r0.isCancelled()     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            if (r0 != 0) goto L_0x02d6
            java.lang.String r5 = "check on download"
            X.1So r0 = r8.A0A     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            boolean r0 = X.C25291Nq.A06(r0)     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            if (r0 == 0) goto L_0x00d6
            boolean r0 = X.C26521Sl.A0f(r12)     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            if (r0 == 0) goto L_0x00d6
            java.lang.String r5 = "check on download for documents"
        L_0x00d6:
            int r4 = (int) r2     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            java.lang.String r0 = "integrity check error: "
            r1.append(r0)     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            java.lang.String r0 = r11.errorMsg     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            X.2RS r1 = new X.2RS     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            r1.<init>(r4, r0)     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            r0 = 0
            r10.uploadMp4FailureLogs(r7, r1, r5, r0)     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            r0 = 1
            goto L_0x00f6
        L_0x00f1:
            r0 = 80
            if (r13 < r0) goto L_0x00fb
            r0 = 3
        L_0x00f6:
            r9.A09(r0)     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            goto L_0x02d6
        L_0x00fb:
            if (r13 >= 0) goto L_0x02d6
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            java.lang.String r0 = "MediaDownload/Classify failed: "
            r1.append(r0)     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            java.lang.String r0 = r11.errorMsg     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            X.C17890vO.A19(r1, r0)     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            goto L_0x02d6
        L_0x010d:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
            throw r0     // Catch:{ IOException -> 0x0115, 2RN -> 0x0110, Exception -> 0x02d0 }
        L_0x0110:
            r1 = move-exception
            java.lang.String r0 = "MediaDownload/Classify caught Kaleidoscope exception: "
            goto L_0x02d3
        L_0x0115:
            r1 = move-exception
            java.lang.String r0 = "MediaDownload/Classify caught IO exception: "
            goto L_0x02d3
        L_0x011a:
            java.lang.String r4 = "MediaDownload/Failed to parse document"
            X.647 r6 = new X.647
            r6.<init>()
            long r16 = java.lang.System.nanoTime()
            X.1So r5 = r8.A0A
            boolean r0 = X.C25291Nq.A06(r5)
            r11 = 0
            if (r0 == 0) goto L_0x01f6
            java.lang.String r14 = r7.getAbsolutePath()
            java.lang.String r0 = r8.A0K
            r12 = 0
            if (r0 == 0) goto L_0x0141
            java.lang.String r1 = X.C64062u9.A09(r0)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r12 = r1.toLowerCase(r0)
        L_0x0141:
            java.lang.String r15 = A08(r12)
            java.lang.String r13 = r8.A0J
            java.lang.Long r0 = X.C17890vO.A0L()
            r6.A03 = r0
            java.lang.Long r0 = r9.A05()
            r6.A00 = r0
            long r0 = r7.length()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A01 = r0
            r6.A07 = r15
            r6.A09 = r13
            long r2 = java.lang.System.nanoTime()     // Catch:{ IOException -> 0x01ec, 6S9 -> 0x01f0, Exception -> 0x01e8 }
            long r0 = com.whatsapp.media.magi.Magi.getNativeObjectInstance()     // Catch:{ IOException -> 0x01ec, 6S9 -> 0x01f0, Exception -> 0x01e8 }
            com.whatsapp.media.magi.Magi$MagiClassifyResult r12 = com.whatsapp.media.magi.Magi.classify(r0, r14, r12, r13)     // Catch:{ IOException -> 0x01ec, 6S9 -> 0x01f0, Exception -> 0x01e8 }
            if (r12 == 0) goto L_0x01d8
            int r14 = r12.returnValue     // Catch:{ IOException -> 0x01ec, 6S9 -> 0x01f0, Exception -> 0x01e8 }
            r0 = -1
            if (r14 == r0) goto L_0x01de
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x01ec, 6S9 -> 0x01f0, Exception -> 0x01e8 }
            java.lang.String r0 = "MediaDownload/Classify returned: "
            r1.append(r0)     // Catch:{ IOException -> 0x01ec, 6S9 -> 0x01f0, Exception -> 0x01e8 }
            r1.append(r14)     // Catch:{ IOException -> 0x01ec, 6S9 -> 0x01f0, Exception -> 0x01e8 }
            java.lang.String r0 = ", extension (hint): "
            r1.append(r0)     // Catch:{ IOException -> 0x01ec, 6S9 -> 0x01f0, Exception -> 0x01e8 }
            r1.append(r15)     // Catch:{ IOException -> 0x01ec, 6S9 -> 0x01f0, Exception -> 0x01e8 }
            java.lang.String r0 = ", mimetype: "
            X.C17900vP.A0f(r0, r13, r1)     // Catch:{ IOException -> 0x01ec, 6S9 -> 0x01f0, Exception -> 0x01e8 }
            java.lang.Long r0 = X.C17880vN.A0n(r14)     // Catch:{ IOException -> 0x01ec, 6S9 -> 0x01f0, Exception -> 0x01e8 }
            r6.A03 = r0     // Catch:{ IOException -> 0x01ec, 6S9 -> 0x01f0, Exception -> 0x01e8 }
            long r0 = java.lang.System.nanoTime()     // Catch:{ IOException -> 0x01ec, 6S9 -> 0x01f0, Exception -> 0x01e8 }
            java.lang.Long r0 = X.C108945cZ.A1B(r0, r2)     // Catch:{ IOException -> 0x01ec, 6S9 -> 0x01f0, Exception -> 0x01e8 }
            r6.A05 = r0     // Catch:{ IOException -> 0x01ec, 6S9 -> 0x01f0, Exception -> 0x01e8 }
            com.whatsapp.media.magi.Magi$MagiCheckResult r0 = r12.checkResult     // Catch:{ IOException -> 0x01ec, 6S9 -> 0x01f0, Exception -> 0x01e8 }
            java.lang.String r0 = r0.mimetype     // Catch:{ IOException -> 0x01ec, 6S9 -> 0x01f0, Exception -> 0x01e8 }
            monitor-enter(r9)     // Catch:{ IOException -> 0x01ec, 6S9 -> 0x01f0, Exception -> 0x01e8 }
            r9.A0C = r0     // Catch:{ all -> 0x01d5 }
            monitor-exit(r9)     // Catch:{ IOException -> 0x01ec, 6S9 -> 0x01f0, Exception -> 0x01e8 }
            if (r14 != 0) goto L_0x01ab
            r9.A09(r11)     // Catch:{ IOException -> 0x01ec, 6S9 -> 0x01f0, Exception -> 0x01e8 }
            goto L_0x01f6
        L_0x01ab:
            r0 = 1
            if (r14 != r0) goto L_0x01b1
            com.whatsapp.media.magi.Magi$MagiCheckResult r2 = r12.checkResult     // Catch:{ IOException -> 0x01ec, 6S9 -> 0x01f0, Exception -> 0x01e8 }
            goto L_0x01bb
        L_0x01b1:
            r0 = 2
            if (r14 != r0) goto L_0x01cf
            r0 = 3
            r9.A09(r0)     // Catch:{ IOException -> 0x01ec, 6S9 -> 0x01f0, Exception -> 0x01e8 }
            com.whatsapp.media.magi.Magi$MagiCheckResult r2 = r12.checkResult     // Catch:{ IOException -> 0x01ec, 6S9 -> 0x01f0, Exception -> 0x01e8 }
            r11 = 1
        L_0x01bb:
            if (r2 == 0) goto L_0x01cb
            java.lang.String r1 = "/"
            java.util.List r0 = r2.extensions
            java.lang.String r0 = X.AnonymousClass2SU.A00(r1, r0)
            r6.A06 = r0
            java.lang.String r0 = r2.mimetype
            r6.A08 = r0
        L_0x01cb:
            if (r11 == 0) goto L_0x01f6
            goto L_0x02d6
        L_0x01cf:
            java.lang.String r0 = "MediaDownload/Classify failed."
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x01ec, 6S9 -> 0x01f0, Exception -> 0x01e8 }
            goto L_0x01f6
        L_0x01d5:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ IOException -> 0x01ec, 6S9 -> 0x01f0, Exception -> 0x01e8 }
            goto L_0x01e7
        L_0x01d8:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ IOException -> 0x01ec, 6S9 -> 0x01f0, Exception -> 0x01e8 }
            r0.<init>(r14)     // Catch:{ IOException -> 0x01ec, 6S9 -> 0x01f0, Exception -> 0x01e8 }
            goto L_0x01e7
        L_0x01de:
            com.whatsapp.media.magi.Magi$MagiCheckResult r0 = r12.checkResult     // Catch:{ IOException -> 0x01ec, 6S9 -> 0x01f0, Exception -> 0x01e8 }
            java.lang.String r1 = r0.errorMsg     // Catch:{ IOException -> 0x01ec, 6S9 -> 0x01f0, Exception -> 0x01e8 }
            X.6S9 r0 = new X.6S9     // Catch:{ IOException -> 0x01ec, 6S9 -> 0x01f0, Exception -> 0x01e8 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x01ec, 6S9 -> 0x01f0, Exception -> 0x01e8 }
        L_0x01e7:
            throw r0     // Catch:{ IOException -> 0x01ec, 6S9 -> 0x01f0, Exception -> 0x01e8 }
        L_0x01e8:
            r1 = move-exception
            java.lang.String r0 = "MediaDownload/Classify caught exception: "
            goto L_0x01f3
        L_0x01ec:
            r1 = move-exception
            java.lang.String r0 = "MediaDownload/Classify caught IO exception: "
            goto L_0x01f3
        L_0x01f0:
            r1 = move-exception
            java.lang.String r0 = "MediaDownload/Classify caught Magi exception: "
        L_0x01f3:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x01f6:
            java.lang.String r0 = "1"
            r6.A0A = r0
            boolean r0 = X.C25291Nq.A06(r5)
            r13 = 2
            if (r0 == 0) goto L_0x0234
            java.lang.String r1 = "application/pdf"
            java.lang.String r0 = r8.A0J
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0234
            X.74C r0 = new X.74C
            r0.<init>(r7)
            r0.A08()     // Catch:{ 6SQ -> 0x021f, IOException -> 0x02bf }
            boolean r1 = r0.A01     // Catch:{ 6SQ -> 0x021f, IOException -> 0x02bf }
            r0 = 0
            if (r1 == 0) goto L_0x021a
            r0 = 3
        L_0x021a:
            r9.A09(r0)     // Catch:{ 6SQ -> 0x021f, IOException -> 0x02bf }
            goto L_0x02c3
        L_0x021f:
            r2 = move-exception
            r0 = 3
            r9.A09(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            r6.A03 = r0
            r0 = 80
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A04 = r0
            goto L_0x02c0
        L_0x0234:
            boolean r0 = X.C63972u0.A0A(r5)
            r11 = 90
            if (r0 != 0) goto L_0x0299
            boolean r0 = X.C63972u0.A03(r5)
            if (r0 != 0) goto L_0x0299
            boolean r0 = X.C63972u0.A07(r5)
            if (r0 == 0) goto L_0x0275
            java.lang.String r0 = r8.A0J
            r1 = r29
            X.6uF r1 = r1.A01(r7, r0)
            if (r1 == 0) goto L_0x025a
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            boolean r0 = r1.A02(r0)
            if (r0 != 0) goto L_0x02c3
        L_0x025a:
            java.lang.String r0 = "MediaDownload/suspicious sticker found, file deleted"
        L_0x025c:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 1
            r9.A09(r0)
            r0 = r19
            X.C115295ti.A08(r0, r7)
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            r6.A03 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            r6.A04 = r0
            goto L_0x02c3
        L_0x0275:
            boolean r0 = X.C25291Nq.A06(r5)
            if (r0 == 0) goto L_0x0286
            java.lang.String r0 = r8.A0J
            boolean r0 = X.C26521Sl.A0f(r0)
            if (r0 == 0) goto L_0x0286
            java.lang.String r3 = "check on download for documents"
            goto L_0x02a3
        L_0x0286:
            X.1So r0 = X.C26551So.A0k
            if (r5 == r0) goto L_0x028e
            X.1So r0 = X.C26551So.A0Y
            if (r5 != r0) goto L_0x02c3
        L_0x028e:
            r0 = r28
            java.io.File r0 = r0.A00(r7)
            if (r0 != 0) goto L_0x02c3
            java.lang.String r0 = "MediaDownload/suspicious sticker pack file found, file deleted"
            goto L_0x025c
        L_0x0299:
            r0 = r27
            boolean r0 = r0.A0E(r5, r7)
            if (r0 == 0) goto L_0x02c3
            java.lang.String r3 = "check on download"
        L_0x02a3:
            r2 = 0
            r10.check(r7, r2)     // Catch:{ 2RS -> 0x02a8 }
            goto L_0x02c3
        L_0x02a8:
            r1 = move-exception
            r0 = r18
            java.util.concurrent.FutureTask r0 = r0.A02
            boolean r0 = r0.isCancelled()
            if (r0 != 0) goto L_0x02c3
            r10.uploadMp4FailureLogs(r7, r1, r3, r2)
            int r1 = r1.errorCode
            r0 = 300(0x12c, float:4.2E-43)
            if (r1 >= r0) goto L_0x02c3
            java.lang.String r0 = "MediaDownload/suspicious video/audio found, file deleted"
            goto L_0x025c
        L_0x02bf:
            r2 = move-exception
        L_0x02c0:
            com.whatsapp.util.Log.e(r4, r2)
        L_0x02c3:
            long r2 = java.lang.System.nanoTime()
            r0 = r16
            java.lang.Long r0 = X.C108945cZ.A1B(r2, r0)
            r6.A05 = r0
            goto L_0x02d6
        L_0x02d0:
            r1 = move-exception
            java.lang.String r0 = "MediaDownload/Classify caught exception: "
        L_0x02d3:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x02d6:
            r0 = r21
            r0.CC7(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74L.A0B(X.17r, X.0ve, X.18K, com.whatsapp.media.WamediaManager, com.whatsapp.media.attachment.Kaleidoscope, X.5ti, X.6uk, X.6zF, X.1Sc, X.64a, X.6xt, java.io.File):void");
    }
}
