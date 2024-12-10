package X;

import java.io.File;

public class A6B {
    public static final Long A0C = 5L;
    public final AnonymousClass11E A00;
    public final AnonymousClass118 A01;
    public final C19830z4 A02;
    public final C223819r A03;
    public final A4V A04;
    public final C18030ve A05;
    public final AnonymousClass18K A06;
    public final C17930vS A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass190 A0A;
    public final AnonymousClass00H A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00fb, code lost:
        r17 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0145, code lost:
        if (r1.exists() != false) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x014e, code lost:
        if (r1 != null) goto L_0x0150;
     */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(boolean r25) {
        /*
            r24 = this;
            r5 = 0
            r3 = r24
            X.118 r4 = r3.A01
            if (r25 == 0) goto L_0x0058
            java.io.File[] r6 = X.A1V.A00(r4)
            int r4 = r6.length
            r2 = 0
        L_0x000d:
            if (r2 >= r4) goto L_0x001f
            r1 = r6[r2]
            X.00H r0 = r3.A08
            java.lang.Object r0 = r0.get()
            X.A1V r0 = (X.A1V) r0
            r0.A03(r1)
            int r2 = r2 + 1
            goto L_0x000d
        L_0x001f:
            r3.A01()
            X.00H r0 = r3.A09
            java.lang.Object r0 = r0.get()
            X.9kG r0 = (X.C190029kG) r0
            X.0vl r3 = r0.A01
            android.content.SharedPreferences r0 = X.C17880vN.A0C(r3)
            java.lang.String r2 = "appexitinfo_stack_top_hashcode"
            r1 = -1
            int r0 = r0.getInt(r2, r1)
            if (r0 != r1) goto L_0x0053
            r1 = 0
        L_0x003a:
            android.content.SharedPreferences$Editor r0 = X.C17890vO.A0A(r3)
            android.content.SharedPreferences$Editor r0 = r0.clear()
            r0.apply()
            if (r1 == 0) goto L_0x0052
            int r1 = r1.intValue()
            android.content.SharedPreferences$Editor r0 = X.C17890vO.A0A(r3)
            X.C17880vN.A1C(r0, r2, r1)
        L_0x0052:
            return r5
        L_0x0053:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            goto L_0x003a
        L_0x0058:
            java.io.File[] r22 = X.A1V.A00(r4)
            r0 = r22
            int r0 = r0.length
            r23 = r0
            r6 = 0
            r21 = 0
        L_0x0064:
            java.lang.String r7 = "os_stacktrace_"
            r0 = r23
            if (r6 >= r0) goto L_0x02d4
            r8 = r22[r6]
            java.lang.String r0 = r8.getName()
            boolean r0 = r0.contains(r7)
            if (r0 != 0) goto L_0x02c4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ANRExceptionUploadHelper/file/name="
            X.AnonymousClass8BV.A1J(r8, r0, r1)
            java.lang.String r0 = "; canRead="
            r1.append(r0)
            boolean r0 = r8.canRead()
            X.C17900vP.A0r(r1, r0)
            boolean r0 = r8.canRead()
            r9 = 0
            if (r0 == 0) goto L_0x02bc
            java.lang.String r1 = r8.getName()
            java.lang.String r0 = ".stacktrace"
            boolean r20 = r1.endsWith(r0)
            r17 = 0
            java.lang.String r7 = "anr_file_timestamp"
            if (r20 != 0) goto L_0x00fd
            long r0 = r8.lastModified()
            X.0z4 r10 = r3.A02
            long r11 = r10.A0W(r7)
            int r2 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r2 == 0) goto L_0x02bc
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 == 0) goto L_0x02bc
            java.io.BufferedReader r14 = X.AnonymousClass8BW.A0V(r8)     // Catch:{ IOException -> 0x00f0 }
            java.lang.String r2 = "Cmd line: (\\S+)"
            java.util.regex.Pattern r12 = java.util.regex.Pattern.compile(r2)     // Catch:{ all -> 0x00e6 }
        L_0x00be:
            java.lang.String r2 = r14.readLine()     // Catch:{ all -> 0x00e6 }
            if (r2 == 0) goto L_0x00e2
            java.util.regex.Matcher r13 = r12.matcher(r2)     // Catch:{ all -> 0x00e6 }
            boolean r2 = r13.find()     // Catch:{ all -> 0x00e6 }
            if (r2 == 0) goto L_0x00be
            r2 = 1
            r13.group(r2)     // Catch:{ all -> 0x00e6 }
            java.lang.String r11 = "com.whatsapp"
            java.lang.String r2 = r13.group(r2)     // Catch:{ all -> 0x00e6 }
            boolean r2 = r11.equals(r2)     // Catch:{ all -> 0x00e6 }
            if (r2 == 0) goto L_0x00be
            r14.close()     // Catch:{ IOException -> 0x00f0 }
            goto L_0x00fb
        L_0x00e2:
            r14.close()     // Catch:{ IOException -> 0x00f0 }
            goto L_0x00f6
        L_0x00e6:
            r8 = move-exception
            r14.close()     // Catch:{ all -> 0x00eb }
            goto L_0x00ef
        L_0x00eb:
            r2 = move-exception
            X.AnonymousClass0DT.A00(r8, r2)     // Catch:{ IOException -> 0x00f0 }
        L_0x00ef:
            throw r8     // Catch:{ IOException -> 0x00f0 }
        L_0x00f0:
            r8 = move-exception
            java.lang.String r2 = "ANRExceptionUploadHelper/failed to parse system anr file "
            com.whatsapp.util.Log.e(r2, r8)
        L_0x00f6:
            r10.A1q(r7, r0)
            goto L_0x02bc
        L_0x00fb:
            r17 = r0
        L_0x00fd:
            X.11E r0 = r3.A00
            X.1LR r0 = r0.A04()
            if (r0 == 0) goto L_0x0166
            boolean r0 = r0.A05
            if (r0 != 0) goto L_0x0166
            X.19r r0 = r3.A03
            java.util.Map r11 = r0.A00()
            r10 = 0
            if (r20 == 0) goto L_0x0148
            java.lang.String r9 = r8.getName()
        L_0x0116:
            java.lang.String r0 = r8.getName()
            java.lang.String r2 = X.AnonymousClass9P5.A00(r0)
            if (r2 == 0) goto L_0x0173
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r1 >= r0) goto L_0x014a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "sigquit_exitinfo_"
            java.lang.String r12 = X.AnonymousClass001.A1H(r0, r2, r1)
            X.C18070vi.A0d(r4, r5)
            java.io.File r1 = X.C108945cZ.A16(r4)
            java.lang.String r0 = "traces"
            java.io.File r0 = X.C17880vN.A0e(r1, r0)
            java.io.File r1 = X.C17880vN.A0e(r0, r12)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0173
            goto L_0x0150
        L_0x0148:
            r9 = r10
            goto L_0x0116
        L_0x014a:
            java.io.File r1 = r3.A00(r2)
            if (r1 == 0) goto L_0x0173
        L_0x0150:
            java.io.BufferedReader r0 = X.AnonymousClass8BW.A0V(r1)     // Catch:{ Exception -> 0x016d }
            java.lang.String r10 = r0.readLine()     // Catch:{ all -> 0x015c }
            r0.close()     // Catch:{ Exception -> 0x016d }
            goto L_0x0173
        L_0x015c:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0161 }
            goto L_0x0165
        L_0x0161:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x016d }
        L_0x0165:
            throw r1     // Catch:{ Exception -> 0x016d }
        L_0x0166:
            java.lang.String r0 = "ANRExceptionUploadHelper/roamingorunknown/skip"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x02bc
        L_0x016d:
            r1 = move-exception
            java.lang.String r0 = "ANRExceptionUploadHelper/os-exit-info-not-read"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0173:
            X.8s0 r12 = new X.8s0
            r12.<init>()
            java.lang.Integer r0 = X.C17880vN.A0m()
            r12.A02 = r0
            java.lang.Long r0 = X.C108975cc.A0X()
            r12.A03 = r0
            java.lang.String r19 = "anr"
            r0 = r19
            r12.A09 = r0
            boolean r0 = X.AnonymousClass1EG.A0H(r10)
            if (r0 != 0) goto L_0x01ae
            int r13 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            java.lang.String r1 = ""
            if (r13 >= r0) goto L_0x02d0
            java.lang.String r0 = "\\([^()]*\\)"
        L_0x019a:
            java.lang.String r10 = r10.replaceAll(r0, r1)
            int r1 = r10.length()
            r0 = 1000(0x3e8, float:1.401E-42)
            int r0 = java.lang.Math.min(r1, r0)
            java.lang.String r0 = r10.substring(r5, r0)
            r12.A07 = r0
        L_0x01ae:
            if (r9 == 0) goto L_0x020f
            java.lang.String r1 = "_"
            int r10 = r9.indexOf(r1)
            if (r10 <= 0) goto L_0x01c0
            java.lang.String r0 = r9.substring(r5, r10)
            if (r0 == 0) goto L_0x01c0
            r12.A06 = r0
        L_0x01c0:
            java.lang.String r15 = X.AnonymousClass9P5.A00(r9)
            if (r15 == 0) goto L_0x01f3
            java.lang.Object r0 = r11.get(r15)
            java.io.File r0 = (java.io.File) r0
            if (r0 == 0) goto L_0x01f3
            X.C198069xj.A00(r12, r0)
            java.lang.Long r0 = A0C
            r12.A04 = r0
            X.00H r0 = r3.A09
            java.lang.Object r0 = r0.get()
            X.9kG r0 = (X.C190029kG) r0
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r14 = X.C17880vN.A0C(r0)
            java.lang.StringBuilder r13 = X.AnonymousClass000.A10()
            java.lang.String r0 = "running_tasks_"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r15, r13)
            java.lang.String r0 = X.C17880vN.A0r(r14, r0)
            r12.A0B = r0
        L_0x01f3:
            r13 = 1
            int r0 = r10 + 1
            r10 = 0
            if (r0 < r13) goto L_0x020d
            int r0 = r9.indexOf(r1, r0)
            int r1 = r0 + 1
            if (r1 < r13) goto L_0x020d
            java.lang.String r0 = "."
            int r0 = r9.indexOf(r0, r1)
            if (r0 < 0) goto L_0x020d
            java.lang.String r10 = r9.substring(r1, r0)
        L_0x020d:
            r12.A0C = r10
        L_0x020f:
            X.18K r0 = r3.A06
            r0.CC4(r12)
            java.util.HashMap r14 = X.C17880vN.A11()
            r9 = 1
            java.lang.String r13 = "secondary_log_files[os_stacktrace]"
            java.lang.String r0 = "android_anr"
            X.0vS r12 = r3.A07
            java.lang.String r10 = "ANRExceptionUploadHelper"
            boolean r0 = X.A4V.A01(r12, r8, r0, r10, r14)
            if (r0 == 0) goto L_0x02a2
            X.A4V.A00(r12, r2, r10, r11, r14)
            java.io.File r0 = r3.A00(r2)
            if (r0 == 0) goto L_0x0233
            X.A4V.A01(r12, r0, r13, r10, r14)
        L_0x0233:
            X.0ve r11 = r3.A05
            r0 = 7998(0x1f3e, float:1.1208E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r11, r0)
            if (r0 == 0) goto L_0x0267
            java.lang.StringBuilder r15 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ui_diagnostics_"
            java.lang.String r16 = X.AnonymousClass001.A1H(r0, r2, r15)
            X.C18070vi.A0d(r4, r5)
            java.io.File r15 = X.C108945cZ.A16(r4)
            java.lang.String r0 = "traces"
            java.io.File r15 = X.C17880vN.A0e(r15, r0)
            r0 = r16
            java.io.File r15 = X.C17880vN.A0e(r15, r0)
            boolean r0 = r15.exists()
            if (r0 == 0) goto L_0x0267
            java.lang.String r0 = "secondary_log_files[ui_diagnostics]"
            X.A4V.A01(r12, r15, r0, r10, r14)
        L_0x0267:
            r0 = 12361(0x3049, float:1.7321E-41)
            boolean r0 = X.C18020vd.A05(r1, r11, r0)
            if (r0 == 0) goto L_0x0295
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "object_count_diagnostics_"
            java.lang.String r2 = X.AnonymousClass001.A1H(r0, r2, r1)
            X.C18070vi.A0d(r4, r5)
            java.io.File r1 = X.C108945cZ.A16(r4)
            java.lang.String r0 = "traces"
            java.io.File r0 = X.C17880vN.A0e(r1, r0)
            java.io.File r1 = X.C17880vN.A0e(r0, r2)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0295
            java.lang.String r0 = "secondary_log_files[object_count_diagnostics]"
            X.A4V.A01(r12, r1, r0, r10, r14)
        L_0x0295:
            X.A4V r1 = r3.A04
            java.util.List r0 = java.util.Collections.singletonList(r19)
            java.util.HashSet r0 = X.AnonymousClass8BR.A12(r0)
            r1.A02(r0, r14, r9)
        L_0x02a2:
            if (r20 == 0) goto L_0x02c8
            X.00H r0 = r3.A08
            java.lang.Object r0 = r0.get()
            X.A1V r0 = (X.A1V) r0
            r0.A03(r8)
            java.lang.String r0 = X.C108945cZ.A1G(r13, r14)
            if (r0 == 0) goto L_0x02bc
            java.io.File r0 = X.C108945cZ.A17(r0)
            r0.delete()
        L_0x02bc:
            if (r21 != 0) goto L_0x02c2
            r21 = 0
            if (r9 == 0) goto L_0x02c4
        L_0x02c2:
            r21 = 1
        L_0x02c4:
            int r6 = r6 + 1
            goto L_0x0064
        L_0x02c8:
            X.0z4 r2 = r3.A02
            r0 = r17
            r2.A1q(r7, r0)
            goto L_0x02bc
        L_0x02d0:
            java.lang.String r0 = "\\d"
            goto L_0x019a
        L_0x02d4:
            java.io.File[] r6 = X.A1V.A00(r4)
            int r4 = r6.length
            r2 = 0
        L_0x02da:
            if (r5 >= r4) goto L_0x02f3
            r1 = r6[r5]
            java.lang.String r0 = r1.getName()
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto L_0x02f0
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x02f0
            int r2 = r2 + 1
        L_0x02f0:
            int r5 = r5 + 1
            goto L_0x02da
        L_0x02f3:
            if (r2 == 0) goto L_0x02fe
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ANRExceptionUploadHelper/no sigquit trace matched/"
            X.C17900vP.A0j(r0, r1, r2)
        L_0x02fe:
            if (r21 == 0) goto L_0x0303
            r3.A01()
        L_0x0303:
            return r21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A6B.A02(boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r2, 7771) == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.io.File A00(java.lang.String r7) {
        /*
            r6 = this;
            X.0ve r2 = r6.A05
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r1 < r0) goto L_0x0013
            r1 = 7771(0x1e5b, float:1.089E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            r0 = 1
            if (r1 != 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            r5 = 0
            if (r0 == 0) goto L_0x003f
            if (r7 == 0) goto L_0x003f
            X.00H r0 = r6.A0B
            java.lang.Object r0 = r0.get()
            X.A1H r0 = (X.A1H) r0
            java.io.File r4 = r0.A01(r7)
            r3 = 0
            java.lang.String r2 = "ANRExceptionUploadHelper/"
            if (r4 == 0) goto L_0x0038
            boolean r0 = r4.exists()
            if (r0 == 0) goto L_0x0038
            X.190 r1 = r6.A0A
            java.lang.String r0 = "found"
            r1.A0G(r2, r0, r3)
            return r4
        L_0x0038:
            X.190 r1 = r6.A0A
            java.lang.String r0 = "not-found"
            r1.A0G(r2, r0, r3)
        L_0x003f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A6B.A00(java.lang.String):java.io.File");
    }

    private void A01() {
        File[] fileArr;
        AnonymousClass118 r0 = this.A01;
        C18070vi.A0d(r0, 0);
        File A0e = C17880vN.A0e(C108945cZ.A16(r0), "traces");
        if (!A0e.exists() || (fileArr = A0e.listFiles(new C21335AiL(0))) == null) {
            fileArr = new File[0];
        }
        for (File delete : fileArr) {
            delete.delete();
        }
    }

    public A6B(AnonymousClass190 r1, AnonymousClass11E r2, AnonymousClass118 r3, C19830z4 r4, C223819r r5, A4V a4v, C18030ve r7, AnonymousClass18K r8, C17930vS r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12) {
        this.A01 = r3;
        this.A05 = r7;
        this.A08 = r10;
        this.A06 = r8;
        this.A0A = r1;
        this.A02 = r4;
        this.A09 = r11;
        this.A00 = r2;
        this.A07 = r9;
        this.A0B = r12;
        this.A03 = r5;
        this.A04 = a4v;
    }
}
