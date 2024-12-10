package com.whatsapp.crash.upload;

import X.A4V;
import X.A6B;
import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass8EC;
import X.C000200d;
import X.C008203r;
import X.C008503u;
import X.C17880vN;
import X.C186699ec;
import X.C188429hP;
import X.C198319y9;
import X.C223819r;
import X.C23641Hb;
import X.C31221fD;

public class ExceptionsUploadService extends AnonymousClass8EC implements AnonymousClass009 {
    public A6B A00;
    public C223819r A01;
    public A4V A02;
    public C188429hP A03;
    public C186699ec A04;
    public C198319y9 A05;
    public C23641Hb A06;
    public AnonymousClass00H A07;
    public boolean A08;
    public final Object A09;
    public volatile C008203r A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0296, code lost:
        if (r0 != false) goto L_0x0298;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(android.content.Intent r20) {
        /*
            r19 = this;
            java.lang.String r0 = "app_version_changed"
            r6 = 0
            r1 = r20
            boolean r5 = r1.getBooleanExtra(r0, r6)
            r2 = r19
            X.A4V r0 = r2.A02
            X.0vS r0 = r0.A01
            java.io.File r1 = r0.A00()
            java.lang.String r0 = "crash_upload"
            java.io.File r1 = X.C17880vN.A0e(r1, r0)
            boolean r0 = r1.exists()     // Catch:{ SecurityException -> 0x002c }
            if (r0 == 0) goto L_0x0026
            boolean r0 = r1.isDirectory()     // Catch:{ SecurityException -> 0x002c }
            if (r0 == 0) goto L_0x0026
            goto L_0x002c
        L_0x0026:
            r1.delete()     // Catch:{ SecurityException -> 0x002c }
            r1.mkdirs()     // Catch:{ SecurityException -> 0x002c }
        L_0x002c:
            X.9hP r9 = r2.A03
            r3 = 0
            X.0vS r8 = r9.A06
            java.util.ArrayList r11 = X.AnonymousClass000.A13()
            java.io.File r1 = r8.A01()
            java.lang.String r0 = "crash_sentinel"
            java.io.File r0 = X.C17880vN.A0e(r1, r0)
            X.C108965cb.A1Q(r0, r3, r11)
            java.lang.String[] r12 = X.C17880vN.A1Z()
            java.lang.String r0 = "account_switching"
            r12[r6] = r0
            r1 = 1
            java.lang.String r0 = "unknown_process_name"
            r12[r1] = r0
            r10 = 2
            r7 = 0
        L_0x0051:
            r4 = r12[r7]
            java.io.File r3 = r8.A01()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "crash_sentinel_"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r4, r1)
            java.io.File r0 = X.C17880vN.A0e(r3, r0)
            X.C108965cb.A1Q(r0, r4, r11)
            int r7 = r7 + 1
            if (r7 < r10) goto L_0x0051
            java.util.Iterator r17 = r11.iterator()
            r7 = 0
        L_0x0071:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x01d7
            java.lang.Object r10 = r17.next()
            android.util.Pair r10 = (android.util.Pair) r10
            java.lang.Object r0 = r10.first
            java.io.File r0 = (java.io.File) r0
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0071
            java.lang.Object r0 = r10.first
            java.io.File r0 = (java.io.File) r0
            java.lang.Object r12 = r10.second
            java.lang.String r12 = (java.lang.String) r12
            byte[] r1 = X.AnonymousClass1EW.A00(r0)     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r0 = new java.lang.String     // Catch:{ Exception -> 0x01c8 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x01c8 }
            org.json.JSONObject r1 = X.C17880vN.A16(r0)     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r0 = "isOom"
            boolean r16 = r1.getBoolean(r0)     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r0 = "deepestThrowable"
            java.lang.String r11 = r1.getString(r0)     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r0 = "versionName"
            java.lang.String r14 = r1.getString(r0)     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r0 = "mobileBuildId"
            long r3 = r1.getLong(r0)     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r0 = "stacktrace"
            java.lang.String r13 = r1.getString(r0)     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r0 = "sessionId"
            java.lang.String r7 = r1.getString(r0)     // Catch:{ Exception -> 0x01c8 }
            X.19r r0 = r9.A03
            r18 = r0
            java.util.Map r15 = r18.A00()
            X.8s0 r1 = new X.8s0
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            r1.A02 = r0
            java.lang.Long r0 = X.C108975cc.A0X()
            r1.A03 = r0
            r1.A09 = r11
            r1.A08 = r13
            r1.A0C = r12
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x010e
            X.00H r0 = r9.A07
            java.lang.Object r0 = r0.get()
            X.9kG r0 = (X.C190029kG) r0
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r11 = X.C17880vN.A0C(r0)
            java.lang.StringBuilder r12 = X.AnonymousClass000.A10()
            java.lang.String r0 = "running_tasks_"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r7, r12)
            java.lang.String r0 = X.C17880vN.A0r(r11, r0)
            r1.A0B = r0
            java.lang.Object r0 = r15.get(r7)
            java.io.File r0 = (java.io.File) r0
            if (r0 == 0) goto L_0x010e
            X.C198069xj.A00(r1, r0)
        L_0x010e:
            r1.A06 = r14
            X.18K r0 = r9.A05
            r0.CC4(r1)
            r12 = 1
            java.io.File r1 = r8.A00()
            java.lang.String r0 = "java_stack_trace"
            java.io.File r11 = X.C17880vN.A0e(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.StringBuilder r15 = X.AnonymousClass000.A10()
            X.C18070vi.A0d(r14, r6)
            java.lang.StringBuilder r14 = X.AnonymousClass000.A11(r14)
            r0 = 40
            r14.append(r0)
            java.lang.String r4 = X.C17900vP.A0E(r14, r3)
            int r0 = com.whatsapp.util.Log.level
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "### begin stack trace "
            r3.append(r0)
            r3.append(r4)
            java.lang.String r0 = "\n"
            X.C108985cd.A1L(r0, r3, r15)
            X.C108985cd.A1L(r13, r15, r1)
            java.lang.String r0 = "### end stack trace"
            r1.append(r0)
            java.io.FileWriter r0 = new java.io.FileWriter     // Catch:{ IOException -> 0x0172 }
            r0.<init>(r11)     // Catch:{ IOException -> 0x0172 }
            java.io.BufferedWriter r3 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x0172 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x0172 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0168 }
            r3.write(r0)     // Catch:{ all -> 0x0168 }
            r3.close()     // Catch:{ IOException -> 0x0172 }
            goto L_0x017c
        L_0x0168:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x016d }
            goto L_0x0171
        L_0x016d:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x0172 }
        L_0x0171:
            throw r1     // Catch:{ IOException -> 0x0172 }
        L_0x0172:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "JavaExceptionsUploadHelper/file write failed: "
            X.C17900vP.A0X(r3, r0, r1)
        L_0x017c:
            java.util.HashMap r3 = X.C17880vN.A11()
            java.lang.String r0 = "attachment"
            java.lang.String r1 = "JavaExceptionsUpload"
            boolean r0 = X.A4V.A01(r8, r11, r0, r1, r3)
            if (r0 == 0) goto L_0x01a0
            java.util.Map r0 = r18.A00()
            X.A4V.A00(r8, r7, r1, r0, r3)
            X.A4V r1 = r9.A04
            java.lang.String r0 = "java"
            java.util.List r0 = java.util.Collections.singletonList(r0)
            java.util.HashSet r0 = X.AnonymousClass8BR.A12(r0)
            r1.A02(r0, r3, r12)
        L_0x01a0:
            java.lang.Object r0 = r10.first
            java.io.File r0 = (java.io.File) r0
            r0.delete()
            r11.delete()
            X.00H r0 = r9.A07
            java.lang.Object r0 = r0.get()
            X.9kG r0 = (X.C190029kG) r0
            X.0vl r0 = r0.A01
            android.content.SharedPreferences$Editor r3 = X.C17890vO.A0A(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "running_tasks_"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r7, r1)
            X.C17880vN.A1B(r3, r0)
            r7 = 1
            goto L_0x0071
        L_0x01c8:
            r1 = move-exception
            java.lang.String r0 = "javacrash/deserializeCrashData: could not deserialize stored crash data"
            com.whatsapp.util.Log.w(r0, r1)
            java.lang.Object r0 = r10.first
            java.io.File r0 = (java.io.File) r0
            r0.delete()
            goto L_0x0071
        L_0x01d7:
            X.19r r0 = r2.A01
            r0.A00()
            X.9hP r3 = r2.A03
            X.0vS r0 = r3.A06
            java.io.File r1 = r0.A01()
            java.lang.String r0 = "crash_in_video_sentinel"
            java.io.File r8 = X.C17880vN.A0e(r1, r0)
            boolean r0 = r8.exists()
            if (r0 == 0) goto L_0x0235
            if (r7 != 0) goto L_0x0232
            if (r5 != 0) goto L_0x0232
            java.io.BufferedReader r0 = X.AnonymousClass8BW.A0V(r8)     // Catch:{ IOException -> 0x020a }
            java.lang.String r4 = r0.readLine()     // Catch:{ all -> 0x0200 }
            r0.close()     // Catch:{ IOException -> 0x020a }
            goto L_0x020f
        L_0x0200:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0205 }
            goto L_0x0209
        L_0x0205:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x020a }
        L_0x0209:
            throw r1     // Catch:{ IOException -> 0x020a }
        L_0x020a:
            r0 = move-exception
            java.lang.String r4 = r0.toString()
        L_0x020f:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x0217
            java.lang.String r4 = "process killed"
        L_0x0217:
            X.A4V r3 = r3.A04
            r0 = 5
            X.8s0 r1 = new X.8s0
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A02 = r0
            r1.A09 = r4
            java.lang.Long r0 = X.C108975cc.A0X()
            r1.A03 = r0
            X.18K r0 = r3.A00
            r0.CC4(r1)
        L_0x0232:
            r8.delete()
        L_0x0235:
            X.9y9 r8 = r2.A05
            X.0vS r0 = r8.A02
            r17 = r0
            java.io.File r3 = X.C22491Af.A00(r17)
            r1 = 5
            X.AiL r0 = new X.AiL
            r0.<init>(r1)
            java.io.File[] r11 = r3.listFiles(r0)
            r9 = 0
            if (r11 == 0) goto L_0x02af
            int r10 = r11.length
            if (r10 == 0) goto L_0x02af
            r1 = 12
            X.7Rn r0 = new X.7Rn
            r0.<init>(r1)
            java.util.Arrays.sort(r11, r0)
            X.19r r0 = r8.A00
            java.util.Map r4 = r0.A00()
            r0 = 10
            r3 = 1
            boolean r14 = X.C108975cc.A1C(r10, r0)
            r1 = 1
            r12 = 0
        L_0x0268:
            if (r1 >= r10) goto L_0x028a
            r13 = r11[r1]
            boolean r0 = r13.delete()
            if (r0 != 0) goto L_0x0278
            boolean r0 = r13.exists()
            if (r0 != 0) goto L_0x0282
        L_0x0278:
            int r12 = r12 + 1
            if (r14 != 0) goto L_0x0282
            r0 = r11[r1]
            X.C198319y9.A00(r8, r0, r4)
            r6 = 1
        L_0x0282:
            r0 = r11[r1]
            r0.getPath()
            int r1 = r1 + 1
            goto L_0x0268
        L_0x028a:
            java.lang.String r16 = "native"
            if (r14 == 0) goto L_0x0299
            X.A4V r10 = r8.A01
            if (r12 >= r3) goto L_0x037f
            r0 = 0
        L_0x0293:
            if (r6 != 0) goto L_0x0298
            r6 = 0
            if (r0 == 0) goto L_0x0299
        L_0x0298:
            r6 = 1
        L_0x0299:
            r10 = r11[r9]
            if (r5 == 0) goto L_0x032a
            boolean r0 = r10.delete()
            if (r0 != 0) goto L_0x02a9
            boolean r0 = r10.exists()
            if (r0 != 0) goto L_0x037c
        L_0x02a9:
            r0 = r11[r9]
            X.C198319y9.A00(r8, r0, r4)
        L_0x02ae:
            r6 = r3
        L_0x02af:
            X.A6B r0 = r2.A00
            boolean r1 = r0.A02(r5)
            X.00H r0 = r2.A07
            java.lang.Object r0 = r0.get()
            X.A0G r0 = (X.A0G) r0
            r0.A01(r5, r7, r6, r1)
            X.9ec r11 = r2.A04
            java.lang.String r1 = "android_hprof"
            X.9xC r0 = r11.A03
            X.0vS r8 = r0.A00
            java.io.File r0 = r8.A00()
            java.lang.String r0 = r0.getPath()
            java.io.File r4 = X.C108945cZ.A17(r0)
            r3 = 6
            X.AiL r0 = new X.AiL
            r0.<init>(r3)
            java.io.File[] r4 = r4.listFiles(r0)
            if (r4 == 0) goto L_0x0555
            int r3 = r4.length
            if (r3 == 0) goto L_0x0555
            X.11E r6 = r11.A01
            r7 = 1
            int r0 = r6.A03(r7)
            r5 = 1
            if (r0 == r7) goto L_0x039c
            r5 = 0
        L_0x02ee:
            r0 = r4[r5]
            r0.delete()
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.io.File r0 = r8.A00()
            java.lang.String r0 = r0.getPath()
            r1[r9] = r0
            java.lang.String r0 = "%s/dump.gz"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.io.File r0 = X.C108945cZ.A17(r0)
            X.C108985cd.A1C(r0)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.io.File r0 = r8.A00()
            java.lang.String r0 = r0.getPath()
            r1[r9] = r0
            java.lang.String r0 = "%s/dump.clean"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.io.File r0 = X.C108945cZ.A17(r0)
            X.C108985cd.A1C(r0)
            int r5 = r5 + 1
            if (r5 >= r3) goto L_0x0555
            goto L_0x02ee
        L_0x032a:
            java.util.HashMap r11 = X.C17880vN.A11()
            java.lang.String r13 = "upload_file_minidump"
            java.lang.String r12 = "NativeExceptionUploadHelper"
            r0 = r17
            boolean r0 = X.A4V.A01(r0, r10, r13, r12, r11)
            if (r0 == 0) goto L_0x0358
            java.lang.String r15 = r10.getName()
            java.lang.String r0 = "_"
            int r1 = r15.indexOf(r0)
            int r14 = r1 + 1
            r1 = 0
            if (r14 <= r3) goto L_0x0353
            int r0 = r15.indexOf(r0, r14)
            if (r0 < 0) goto L_0x0353
            java.lang.String r1 = r15.substring(r14, r0)
        L_0x0353:
            r0 = r17
            X.A4V.A00(r0, r1, r12, r4, r11)
        L_0x0358:
            boolean r0 = r11.containsKey(r13)
            if (r0 == 0) goto L_0x02af
            X.A4V r1 = r8.A01
            java.util.List r0 = java.util.Collections.singletonList(r16)
            java.util.HashSet r0 = X.AnonymousClass8BR.A12(r0)
            r1.A02(r0, r11, r9)
            boolean r0 = r10.delete()
            if (r0 != 0) goto L_0x0377
            boolean r0 = r10.exists()
            if (r0 != 0) goto L_0x037c
        L_0x0377:
            X.C198319y9.A00(r8, r10, r4)
            goto L_0x02ae
        L_0x037c:
            r3 = r6
            goto L_0x02ae
        L_0x037f:
            X.8s0 r1 = new X.8s0
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r1.A02 = r0
            r0 = r16
            r1.A09 = r0
            java.lang.Long r0 = X.C17880vN.A0n(r12)
            r1.A03 = r0
            X.18K r0 = r10.A00
            r0.CC4(r1)
            r0 = 1
            goto L_0x0293
        L_0x039c:
            if (r5 >= r3) goto L_0x03ab
            r0 = r4[r5]
            r0.delete()
            r0 = r4[r5]
            r0.getPath()
            int r5 = r5 + 1
            goto L_0x039c
        L_0x03ab:
            r4 = r4[r9]
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.io.File r0 = r8.A00()
            java.lang.String r0 = r0.getPath()
            r3[r9] = r0
            java.lang.String r0 = "%s/dump.clean"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            java.io.File r5 = X.C108945cZ.A17(r0)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "HprofPersonalInfoCleaner/run/file "
            r3.append(r0)
            java.lang.String r0 = r4.getPath()
            X.C17890vO.A1A(r3, r0)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
            java.lang.String r0 = "HprofPersonalInfoCleaner/pass1/starting on file "
            r3.append(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
            java.lang.String r0 = r4.getPath()     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
            X.C17890vO.A1A(r3, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
            X.DPY r0 = new X.DPY     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
            r0.<init>(r4)     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
            X.BuB r9 = new X.BuB     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
            r9.<init>(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
            r9.A02()     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
            r0.close()     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
            java.lang.String r0 = "HprofPersonalInfoCleaner/pass1/finished on file "
            r3.append(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
            java.lang.String r0 = r4.getPath()     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
            X.C17890vO.A1A(r3, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
            X.CLv r10 = r9.A00     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
            java.lang.String r0 = "HprofPersonalInfoCleaner/pass2/starting on file "
            r3.append(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
            java.lang.String r0 = r4.getPath()     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
            X.C17890vO.A1A(r3, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
            X.DPY r9 = new X.DPY     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
            r9.<init>(r4)     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
            java.io.FileOutputStream r0 = X.C108945cZ.A19(r5)     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
            r3.<init>(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
            java.io.DataOutputStream r0 = new java.io.DataOutputStream     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
            r0.<init>(r3)     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
            X.DPX r3 = new X.DPX     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
            r3.<init>(r9, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
            X.BuC r0 = new X.BuC     // Catch:{ all -> 0x0544 }
            r0.<init>(r10, r3)     // Catch:{ all -> 0x0544 }
            r0.A02()     // Catch:{ all -> 0x0544 }
            r3.close()     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
            java.lang.String r0 = "HprofPersonalInfoCleaner/pass2/finished on file "
            r3.append(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
            java.lang.String r0 = r4.getPath()     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
            X.C17890vO.A1A(r3, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
            java.lang.String r0 = "HprofPersonalInfoCleaner/pass2/Written clean copy to "
            r3.append(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
            java.lang.String r0 = r5.getPath()     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
            X.C17890vO.A1A(r3, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
            java.lang.String r0 = "HprofPersonalInfoCleaner/run/Successfully cleaned"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r0 = r6.A03(r7)
            if (r0 != r7) goto L_0x054f
            java.lang.Object[] r6 = new java.lang.Object[r7]
            java.io.File r0 = r8.A00()
            java.lang.String r3 = r0.getPath()
            r0 = 0
            r6[r0] = r3
            java.lang.String r0 = "%s/dump.gz"
            java.lang.String r0 = java.lang.String.format(r0, r6)
            java.io.File r3 = X.C108945cZ.A17(r0)
            X.190 r6 = r11.A00     // Catch:{ Exception | OutOfMemoryError -> 0x0534 }
            java.lang.String r0 = r6.A0A()     // Catch:{ Exception | OutOfMemoryError -> 0x0534 }
            java.lang.String r7 = r6.A0C(r0, r1, r7)     // Catch:{ Exception | OutOfMemoryError -> 0x0534 }
            java.lang.String r0 = "no_upload"
            boolean r0 = r0.equals(r7)     // Catch:{ Exception | OutOfMemoryError -> 0x0534 }
            if (r0 == 0) goto L_0x0497
            r4.delete()     // Catch:{ Exception | OutOfMemoryError -> 0x0534 }
            r3.delete()     // Catch:{ Exception | OutOfMemoryError -> 0x0534 }
            r5.delete()     // Catch:{ Exception | OutOfMemoryError -> 0x0534 }
            goto L_0x0555
        L_0x0497:
            java.io.FileInputStream r9 = X.C108945cZ.A18(r5)     // Catch:{ Exception | OutOfMemoryError -> 0x0534 }
            java.io.FileOutputStream r10 = X.C108945cZ.A19(r3)     // Catch:{ all -> 0x052a }
            java.util.zip.GZIPOutputStream r12 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0520 }
            r12.<init>(r10)     // Catch:{ all -> 0x0520 }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r8 = new byte[r0]     // Catch:{ all -> 0x0516 }
        L_0x04a8:
            int r7 = r9.read(r8)     // Catch:{ all -> 0x0516 }
            r0 = -1
            if (r7 == r0) goto L_0x04b4
            r0 = 0
            r12.write(r8, r0, r7)     // Catch:{ all -> 0x0516 }
            goto L_0x04a8
        L_0x04b4:
            r12.flush()     // Catch:{ all -> 0x0516 }
            r12.close()     // Catch:{ all -> 0x0520 }
            r10.close()     // Catch:{ all -> 0x052a }
            r9.close()     // Catch:{ Exception | OutOfMemoryError -> 0x0534 }
            X.AUc r10 = new X.AUc     // Catch:{ Exception | OutOfMemoryError -> 0x0534 }
            r10.<init>(r11, r4, r3, r5)     // Catch:{ Exception | OutOfMemoryError -> 0x0534 }
            X.1SV r9 = r11.A02     // Catch:{ Exception | OutOfMemoryError -> 0x0534 }
            java.lang.String r12 = "https://crashlogs.whatsapp.net/wa_clb_data"
            r15 = 11
            r11 = 0
            r16 = 0
            r14 = r11
            r13 = r11
            X.A7N r7 = r9.A00(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception | OutOfMemoryError -> 0x0534 }
            java.lang.String r8 = "access_token"
            java.lang.String r0 = "1063127757113399|745146ffa34413f9dbb5469f5370b7af"
            r7.A07(r8, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0534 }
            java.io.FileInputStream r0 = X.C108945cZ.A18(r3)     // Catch:{ Exception | OutOfMemoryError -> 0x0534 }
            X.A7N.A03(r7, r3, r0, r1)     // Catch:{ Exception | OutOfMemoryError -> 0x0534 }
            java.lang.String r10 = "agent"
            r0 = r6
            X.192 r0 = (X.AnonymousClass192) r0     // Catch:{ Exception | OutOfMemoryError -> 0x0534 }
            X.11W r9 = r0.A0B     // Catch:{ Exception | OutOfMemoryError -> 0x0534 }
            X.118 r8 = r0.A07     // Catch:{ Exception | OutOfMemoryError -> 0x0534 }
            java.lang.String r0 = X.C18170vs.A02()     // Catch:{ Exception | OutOfMemoryError -> 0x0534 }
            java.lang.String r0 = X.AnonymousClass11W.A00(r8, r9, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0534 }
            r7.A07(r10, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0534 }
            java.lang.String r0 = "type"
            r7.A07(r0, r1)     // Catch:{ Exception | OutOfMemoryError -> 0x0534 }
            java.lang.String r1 = "android_hprof_extras"
            java.lang.String r0 = "java.lang.OutOfMemoryError"
            java.lang.String r0 = r6.A0B(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0534 }
            r7.A07(r1, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0534 }
            java.lang.String r6 = "build_id"
            r0 = 670735092(0x27fa9af4, double:3.313871664E-315)
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0534 }
            r7.A07(r6, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0534 }
            r7.A04(r11)     // Catch:{ Exception | OutOfMemoryError -> 0x0534 }
            goto L_0x0555
        L_0x0516:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x051b }
            goto L_0x051f
        L_0x051b:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0520 }
        L_0x051f:
            throw r1     // Catch:{ all -> 0x0520 }
        L_0x0520:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x0525 }
            goto L_0x0529
        L_0x0525:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x052a }
        L_0x0529:
            throw r1     // Catch:{ all -> 0x052a }
        L_0x052a:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x052f }
            goto L_0x0533
        L_0x052f:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0534 }
        L_0x0533:
            throw r1     // Catch:{ Exception | OutOfMemoryError -> 0x0534 }
        L_0x0534:
            r1 = move-exception
            java.lang.String r0 = "MemoryExceptionsUploadHelper/Error Uploading file"
            com.whatsapp.util.Log.w(r0, r1)
            r4.delete()
            r5.delete()
            r3.delete()
            goto L_0x0555
        L_0x0544:
            r0 = move-exception
            r3.close()     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
            throw r0     // Catch:{ Exception | OutOfMemoryError -> 0x0549 }
        L_0x0549:
            r1 = move-exception
            java.lang.String r0 = "HprofPersonalInfoCleaner/run/error"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x054f:
            r4.delete()
            r5.delete()
        L_0x0555:
            X.19r r4 = r2.A01
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x057d
            r3 = 0
        L_0x055c:
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = r4.A05
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0575
            java.io.File r1 = r4.A04
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.io.File r0 = X.C17880vN.A0e(r1, r0)
            r0.delete()
        L_0x0575:
            int r3 = r3 + 1
            r0 = 5
            if (r3 < r0) goto L_0x055c
            r0 = 0
            r4.A02 = r0
        L_0x057d:
            X.9hP r1 = r2.A03
            X.0z4 r0 = r1.A02
            X.00H r6 = r0.A00
            android.content.SharedPreferences r0 = X.C17880vN.A0B(r6)
            java.lang.String r5 = "crash_state_manager:system_exit"
            java.lang.String r4 = X.C17880vN.A0r(r0, r5)
            if (r4 == 0) goto L_0x05a1
            X.190 r3 = r1.A00
            java.lang.String r1 = "system_exit"
            r0 = 0
            r3.A0G(r1, r4, r0)
            android.content.SharedPreferences$Editor r0 = X.AnonymousClass8BV.A06(r6)
            r0.remove(r5)
            r0.apply()
        L_0x05a1:
            X.1Hb r2 = r2.A06
            r0 = 0
            r2.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.crash.upload.ExceptionsUploadService.A08(android.content.Intent):void");
    }

    public final Object generatedComponent() {
        if (this.A0A == null) {
            synchronized (this.A09) {
                if (this.A0A == null) {
                    this.A0A = new C008203r(this);
                }
            }
        }
        return this.A0A.generatedComponent();
    }

    public void onCreate() {
        if (!this.A08) {
            this.A08 = true;
            AnonymousClass10E r2 = ((C31221fD) ((C008503u) generatedComponent())).A07;
            AnonymousClass10G r1 = r2.A00;
            this.A02 = (A4V) r1.A9h.get();
            this.A03 = (C188429hP) r1.ACZ.get();
            this.A00 = (A6B) r1.A5M.get();
            this.A05 = (C198319y9) r1.ADp.get();
            this.A04 = (C186699ec) r1.ADF.get();
            this.A01 = (C223819r) r2.AB3.get();
            this.A06 = (C23641Hb) r2.A4P.get();
            this.A07 = C000200d.A00(r1.AIL);
        }
        super.onCreate();
    }

    public ExceptionsUploadService(int i) {
        this.A09 = C17880vN.A0p();
        this.A08 = false;
    }

    public ExceptionsUploadService() {
        this(0);
    }
}
