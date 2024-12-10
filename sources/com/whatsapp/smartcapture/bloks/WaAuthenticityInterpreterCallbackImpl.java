package com.whatsapp.smartcapture.bloks;

import X.AnonymousClass00H;
import X.C18070vi;
import X.C18600wl;
import X.C187019f8;
import X.C26616D6k;

public final class WaAuthenticityInterpreterCallbackImpl {
    public final C187019f8 A00;
    public final C26616D6k A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final C18600wl A07;
    public final C18600wl A08;
    public final AnonymousClass00H A09;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v24, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v90, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v4, resolved type: X.1Di} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v93, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v4, resolved type: X.1Di} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v96, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v29, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v32, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v33, resolved type: android.database.Cursor} */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0342 A[Catch:{ Exception -> 0x0359 }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0385 A[Catch:{ all -> 0x038d }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0398  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x041b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03ed A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0083  */
    public final java.lang.Object A00(java.lang.String r37, java.util.Map r38, java.util.Map r39, X.C30391dr r40, X.C22821Di r41, X.C22821Di r42, long r43) {
        /*
            r36 = this;
            r3 = r40
            r21 = r38
            r9 = r37
            r8 = r39
            r22 = r41
            r23 = r42
            r34 = r43
            boolean r0 = r3 instanceof X.C21714Aoh
            r6 = r36
            if (r0 == 0) goto L_0x041c
            r5 = r3
            X.Aoh r5 = (X.C21714Aoh) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x041c
            int r2 = r2 - r1
            r5.label = r2
        L_0x0022:
            java.lang.Object r2 = r5.result
            X.1g4 r24 = X.C31751g4.COROUTINE_SUSPENDED
            int r3 = r5.label
            r1 = 2
            r0 = 1
            if (r3 == 0) goto L_0x0072
            if (r3 == r0) goto L_0x0036
            if (r3 != r1) goto L_0x0423
            X.C30691eM.A01(r2)
        L_0x0033:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0036:
            long r0 = r5.J$0
            r34 = r0
            java.lang.Object r4 = r5.L$8
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r7 = r5.L$7
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r3 = r5.L$6
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r0 = r5.L$5
            r23 = r0
            r0 = r23
            X.1Di r0 = (X.C22821Di) r0
            r23 = r0
            java.lang.Object r0 = r5.L$4
            r22 = r0
            r0 = r22
            X.1Di r0 = (X.C22821Di) r0
            r22 = r0
            java.lang.Object r9 = r5.L$3
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r5.L$2
            java.util.Map r8 = (java.util.Map) r8
            java.lang.Object r0 = r5.L$1
            r21 = r0
            r0 = r21
            java.util.Map r0 = (java.util.Map) r0
            r21 = r0
            java.lang.Object r6 = r5.L$0
            com.whatsapp.smartcapture.bloks.WaAuthenticityInterpreterCallbackImpl r6 = (com.whatsapp.smartcapture.bloks.WaAuthenticityInterpreterCallbackImpl) r6
            goto L_0x0387
        L_0x0072:
            X.C30691eM.A01(r2)
            java.util.LinkedHashMap r3 = X.C17880vN.A13()
            java.util.Iterator r7 = X.AnonymousClass000.A15(r21)
        L_0x007d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x03ed
            java.util.Map$Entry r4 = X.AnonymousClass000.A16(r7)
            java.lang.String r1 = X.AnonymousClass8BR.A10(r4)
            X.00H r0 = r6.A02
            java.lang.Object r0 = r0.get()
            X.A4s r0 = (X.C20049A4s) r0
            java.lang.String r0 = r0.A02(r1)
            android.net.Uri r11 = android.net.Uri.parse(r0)
            java.lang.Object r0 = r4.getKey()
            java.lang.String r20 = X.C17880vN.A0s(r0, r8)
            if (r11 == 0) goto L_0x007d
            if (r20 == 0) goto L_0x007d
            X.00H r0 = r6.A09     // Catch:{ all -> 0x038d }
            java.lang.Object r2 = X.C18070vi.A0E(r0)     // Catch:{ all -> 0x038d }
            X.9gx r2 = (X.C188149gx) r2     // Catch:{ all -> 0x038d }
            java.lang.String r19 = java.lang.String.valueOf(r34)     // Catch:{ all -> 0x038d }
            r5.L$0 = r6     // Catch:{ all -> 0x038d }
            r0 = r21
            r5.L$1 = r0     // Catch:{ all -> 0x038d }
            r5.L$2 = r8     // Catch:{ all -> 0x038d }
            r5.L$3 = r9     // Catch:{ all -> 0x038d }
            r0 = r22
            r5.L$4 = r0     // Catch:{ all -> 0x038d }
            r0 = r23
            r5.L$5 = r0     // Catch:{ all -> 0x038d }
            r5.L$6 = r3     // Catch:{ all -> 0x038d }
            r5.L$7 = r7     // Catch:{ all -> 0x038d }
            r5.L$8 = r4     // Catch:{ all -> 0x038d }
            r0 = r34
            r5.J$0 = r0     // Catch:{ all -> 0x038d }
            r10 = 1
            r5.label = r10     // Catch:{ all -> 0x038d }
            r18 = 0
            X.1g7 r17 = X.C72473Md.A0m(r5)     // Catch:{ all -> 0x038d }
            java.lang.String r13 = r11.getPath()     // Catch:{ Exception -> 0x0359 }
            r1 = 0
            if (r13 != 0) goto L_0x00f0
            X.1D6 r0 = new X.1D6     // Catch:{ Exception -> 0x0359 }
            r0.<init>(r1, r1)     // Catch:{ Exception -> 0x0359 }
        L_0x00e4:
            java.lang.Object r15 = r0.first     // Catch:{ Exception -> 0x0359 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x0359 }
            java.lang.Object r0 = r0.second     // Catch:{ Exception -> 0x0359 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x0359 }
            if (r15 == 0) goto L_0x0333
            goto L_0x0194
        L_0x00f0:
            X.00H r0 = r2.A03     // Catch:{ Exception -> 0x0359 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0359 }
            X.17y r0 = (X.C219317y) r0     // Catch:{ Exception -> 0x0359 }
            X.17z r0 = r0.A00     // Catch:{ Exception -> 0x0359 }
            X.C219417z.A00(r0)     // Catch:{ Exception -> 0x0359 }
            java.io.File r0 = r0.A04     // Catch:{ Exception -> 0x0359 }
            java.lang.String r0 = r0.getCanonicalPath()     // Catch:{ Exception -> 0x0359 }
            java.io.File r14 = X.C108945cZ.A17(r0)     // Catch:{ Exception -> 0x0359 }
            java.lang.String r12 = r11.getScheme()     // Catch:{ Exception -> 0x0359 }
            java.lang.String r0 = "file"
            boolean r0 = X.C18070vi.A18(r12, r0)     // Catch:{ Exception -> 0x0359 }
            if (r0 == 0) goto L_0x0120
            java.lang.String r0 = r14.getCanonicalPath()     // Catch:{ Exception -> 0x0359 }
            X.C18070vi.A0X(r0)     // Catch:{ Exception -> 0x0359 }
            boolean r0 = r13.startsWith(r0)     // Catch:{ Exception -> 0x0359 }
            if (r0 != 0) goto L_0x0144
        L_0x0120:
            java.lang.String r0 = r11.getScheme()     // Catch:{ Exception -> 0x0359 }
            if (r0 == 0) goto L_0x012c
            int r0 = r0.length()     // Catch:{ Exception -> 0x0359 }
            if (r0 != 0) goto L_0x0161
        L_0x012c:
            java.io.File r0 = X.C108945cZ.A17(r13)     // Catch:{ Exception -> 0x0359 }
            java.lang.String r12 = r0.getCanonicalPath()     // Catch:{ Exception -> 0x0359 }
            X.C18070vi.A0X(r12)     // Catch:{ Exception -> 0x0359 }
            java.lang.String r0 = r14.getCanonicalPath()     // Catch:{ Exception -> 0x0359 }
            X.C18070vi.A0X(r0)     // Catch:{ Exception -> 0x0359 }
            boolean r0 = r12.startsWith(r0)     // Catch:{ Exception -> 0x0359 }
            if (r0 == 0) goto L_0x0161
        L_0x0144:
            java.io.File r12 = X.C108945cZ.A17(r13)     // Catch:{ Exception -> 0x0359 }
            boolean r0 = r12.exists()     // Catch:{ Exception -> 0x0359 }
            if (r0 == 0) goto L_0x015f
            java.lang.String r1 = r12.getName()     // Catch:{ Exception -> 0x0359 }
            long r12 = r12.length()     // Catch:{ Exception -> 0x0359 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x0359 }
        L_0x015a:
            X.1D6 r0 = X.AnonymousClass1D6.A01(r1, r12)     // Catch:{ Exception -> 0x0359 }
            goto L_0x00e4
        L_0x015f:
            r12 = r1
            goto L_0x015a
        L_0x0161:
            X.11C r0 = r2.A00     // Catch:{ Exception -> 0x0359 }
            X.11B r0 = r0.A0O()     // Catch:{ Exception -> 0x0359 }
            if (r0 == 0) goto L_0x018a
            android.database.Cursor r12 = r0.A02(r11, r1)     // Catch:{ Exception -> 0x0359 }
            if (r12 == 0) goto L_0x018b
            boolean r0 = r12.moveToFirst()     // Catch:{ all -> 0x0352 }
            if (r0 != r10) goto L_0x018b
            java.lang.String r0 = "_display_name"
            int r13 = r12.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0352 }
            java.lang.String r0 = "_size"
            int r1 = r12.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0352 }
            java.lang.String r0 = r12.getString(r13)     // Catch:{ all -> 0x0352 }
            java.lang.Long r1 = X.C17890vO.A0M(r12, r1)     // Catch:{ all -> 0x0352 }
            goto L_0x018e
        L_0x018a:
            r12 = r1
        L_0x018b:
            r0 = r1
            if (r12 == 0) goto L_0x0191
        L_0x018e:
            r12.close()     // Catch:{ Exception -> 0x0359 }
        L_0x0191:
            r12 = r1
            r1 = r0
            goto L_0x015a
        L_0x0194:
            if (r0 == 0) goto L_0x0333
            long r0 = r0.longValue()     // Catch:{ Exception -> 0x0359 }
            X.00H r12 = r2.A03     // Catch:{ Exception -> 0x0359 }
            java.lang.Object r14 = r12.get()     // Catch:{ Exception -> 0x0359 }
            X.17y r14 = (X.C219317y) r14     // Catch:{ Exception -> 0x0359 }
            java.lang.StringBuilder r13 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0359 }
            java.lang.String r12 = "temp_"
            java.lang.String r12 = X.AnonymousClass001.A1H(r12, r15, r13)     // Catch:{ Exception -> 0x0359 }
            java.io.File r16 = r14.A00(r12)     // Catch:{ Exception -> 0x0359 }
            java.lang.String r12 = r11.getScheme()     // Catch:{ Exception -> 0x0359 }
            if (r12 == 0) goto L_0x01bc
            int r12 = r12.length()     // Catch:{ Exception -> 0x0359 }
            if (r12 != 0) goto L_0x01d1
        L_0x01bc:
            java.lang.StringBuilder r13 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0359 }
            java.lang.String r12 = "file://"
            r13.append(r12)     // Catch:{ Exception -> 0x0359 }
            java.lang.String r11 = r11.getPath()     // Catch:{ Exception -> 0x0359 }
            java.lang.String r11 = X.AnonymousClass000.A0y(r11, r13)     // Catch:{ Exception -> 0x0359 }
            android.net.Uri r11 = android.net.Uri.parse(r11)     // Catch:{ Exception -> 0x0359 }
        L_0x01d1:
            X.11C r12 = r2.A00     // Catch:{ Exception -> 0x0359 }
            X.11B r12 = r12.A0O()     // Catch:{ Exception -> 0x0359 }
            if (r12 == 0) goto L_0x01e7
            java.io.InputStream r12 = r12.A07(r11)     // Catch:{ Exception -> 0x0359 }
            if (r12 == 0) goto L_0x01e7
            r11 = r16
            X.C64062u9.A0U(r11, r12, r0)     // Catch:{ all -> 0x0352 }
            r12.close()     // Catch:{ Exception -> 0x0359 }
        L_0x01e7:
            X.00H r0 = r2.A02     // Catch:{ Exception -> 0x0359 }
            java.lang.Object r14 = r0.get()     // Catch:{ Exception -> 0x0359 }
            X.9xZ r14 = (X.C197969xZ) r14     // Catch:{ Exception -> 0x0359 }
            java.lang.String r12 = "IdvImageUploader"
            java.lang.String r11 = "mv_idv_upload_tag"
            r1 = 946803021(0x386f114d, float:5.6998153E-5)
            X.00H r0 = r14.A00     // Catch:{ Exception -> 0x0359 }
            X.0vd r15 = X.C17880vN.A0P(r0)     // Catch:{ Exception -> 0x0359 }
            r13 = 9199(0x23ef, float:1.289E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ Exception -> 0x0359 }
            boolean r0 = X.C18020vd.A05(r0, r15, r13)     // Catch:{ Exception -> 0x0359 }
            if (r0 == 0) goto L_0x0211
            X.00H r0 = r14.A01     // Catch:{ Exception -> 0x0359 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0359 }
            X.A2u r0 = (X.C20004A2u) r0     // Catch:{ Exception -> 0x0359 }
            r0.A01(r1, r11, r12)     // Catch:{ Exception -> 0x0359 }
        L_0x0211:
            X.00H r0 = r2.A01     // Catch:{ Exception -> 0x0359 }
            java.lang.Object r14 = r0.get()     // Catch:{ Exception -> 0x0359 }
            X.1SV r14 = (X.AnonymousClass1SV) r14     // Catch:{ Exception -> 0x0359 }
            java.lang.String r13 = r2.A06     // Catch:{ Exception -> 0x0359 }
            X.AUb r12 = new X.AUb     // Catch:{ Exception -> 0x0359 }
            r1 = r17
            r0 = r16
            r12.<init>(r2, r1, r0, r10)     // Catch:{ Exception -> 0x0359 }
            r31 = 37
            r11 = 0
            r29 = r11
            r30 = r11
            r25 = r14
            r26 = r12
            r27 = r11
            r28 = r13
            r32 = r18
            X.A7N r0 = r25.A00(r26, r27, r28, r29, r30, r31, r32)     // Catch:{ Exception -> 0x0359 }
            java.lang.String r12 = "access_token"
            java.lang.String r1 = r2.A05     // Catch:{ Exception -> 0x0359 }
            r0.A06(r12, r1)     // Catch:{ Exception -> 0x0359 }
            java.lang.String r12 = "upload_medium"
            r1 = r20
            r0.A06(r12, r1)     // Catch:{ Exception -> 0x0359 }
            java.lang.String r1 = "product"
            r0.A06(r1, r9)     // Catch:{ Exception -> 0x0359 }
            java.lang.String r12 = "return_file_handles"
            java.lang.String r1 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x0359 }
            r0.A06(r12, r1)     // Catch:{ Exception -> 0x0359 }
            java.lang.String r10 = "submit_to_authenticity_platform"
            java.lang.String r1 = java.lang.String.valueOf(r18)     // Catch:{ Exception -> 0x0359 }
            r0.A06(r10, r1)     // Catch:{ Exception -> 0x0359 }
            java.lang.String r10 = "id_or_cuid"
            java.lang.String r1 = java.lang.String.valueOf(r18)     // Catch:{ Exception -> 0x0359 }
            r0.A06(r10, r1)     // Catch:{ Exception -> 0x0359 }
            java.lang.String r10 = "submission_id"
            r1 = r19
            r0.A06(r10, r1)     // Catch:{ Exception -> 0x0359 }
            java.lang.String r10 = "device_id"
            X.00H r1 = r2.A04     // Catch:{ Exception -> 0x0359 }
            X.0z4 r1 = X.C17880vN.A0K(r1)     // Catch:{ Exception -> 0x0359 }
            java.lang.String r1 = r1.A0j()     // Catch:{ Exception -> 0x0359 }
            r0.A06(r10, r1)     // Catch:{ Exception -> 0x0359 }
            java.lang.String r10 = "session_id"
            java.lang.String r1 = X.C17890vO.A0Q()     // Catch:{ Exception -> 0x0359 }
            r0.A06(r10, r1)     // Catch:{ Exception -> 0x0359 }
            java.io.FileInputStream r26 = X.C108945cZ.A18(r16)     // Catch:{ Exception -> 0x0359 }
            java.lang.String r27 = "upload1"
            java.lang.String r28 = r16.getName()     // Catch:{ Exception -> 0x0359 }
            long r32 = r16.length()     // Catch:{ Exception -> 0x0359 }
            java.lang.String r1 = X.C21721ArX.A03(r16)     // Catch:{ Exception -> 0x0359 }
            java.lang.String r10 = X.AnonymousClass8BS.A0n(r1)     // Catch:{ Exception -> 0x0359 }
            int r1 = r10.hashCode()     // Catch:{ Exception -> 0x0359 }
            switch(r1) {
                case 97669: goto L_0x02a4;
                case 102340: goto L_0x02af;
                case 105441: goto L_0x02ba;
                case 108273: goto L_0x02bd;
                case 110834: goto L_0x02c8;
                case 111145: goto L_0x02d3;
                case 120609: goto L_0x02de;
                case 3189082: goto L_0x02e9;
                case 3198679: goto L_0x02f4;
                case 3268712: goto L_0x02ff;
                case 3559925: goto L_0x030a;
                case 3645340: goto L_0x0315;
                default: goto L_0x02a3;
            }     // Catch:{ Exception -> 0x0359 }
        L_0x02a3:
            goto L_0x031f
        L_0x02a4:
            java.lang.String r1 = "bmp"
            boolean r1 = r10.equals(r1)     // Catch:{ Exception -> 0x0359 }
            r29 = 5
            if (r1 != 0) goto L_0x0321
            goto L_0x031f
        L_0x02af:
            java.lang.String r1 = "gif"
            boolean r1 = r10.equals(r1)     // Catch:{ Exception -> 0x0359 }
            r29 = 4
            if (r1 != 0) goto L_0x0321
            goto L_0x031f
        L_0x02ba:
            java.lang.String r1 = "jpg"
            goto L_0x0301
        L_0x02bd:
            java.lang.String r1 = "mp4"
            boolean r1 = r10.equals(r1)     // Catch:{ Exception -> 0x0359 }
            r29 = 11
            if (r1 != 0) goto L_0x0321
            goto L_0x031f
        L_0x02c8:
            java.lang.String r1 = "pdf"
            boolean r1 = r10.equals(r1)     // Catch:{ Exception -> 0x0359 }
            r29 = 10
            if (r1 != 0) goto L_0x0321
            goto L_0x031f
        L_0x02d3:
            java.lang.String r1 = "png"
            boolean r1 = r10.equals(r1)     // Catch:{ Exception -> 0x0359 }
            r29 = 6
            if (r1 != 0) goto L_0x0321
            goto L_0x031f
        L_0x02de:
            java.lang.String r1 = "zip"
            boolean r1 = r10.equals(r1)     // Catch:{ Exception -> 0x0359 }
            r29 = 1
            if (r1 != 0) goto L_0x0321
            goto L_0x031f
        L_0x02e9:
            java.lang.String r1 = "gzip"
            boolean r1 = r10.equals(r1)     // Catch:{ Exception -> 0x0359 }
            r29 = 0
            if (r1 != 0) goto L_0x0321
            goto L_0x031f
        L_0x02f4:
            java.lang.String r1 = "heic"
            boolean r1 = r10.equals(r1)     // Catch:{ Exception -> 0x0359 }
            r29 = 9
            if (r1 != 0) goto L_0x0321
            goto L_0x031f
        L_0x02ff:
            java.lang.String r1 = "jpeg"
        L_0x0301:
            boolean r1 = r10.equals(r1)     // Catch:{ Exception -> 0x0359 }
            r29 = 3
            if (r1 != 0) goto L_0x0321
            goto L_0x031f
        L_0x030a:
            java.lang.String r1 = "tiff"
            boolean r1 = r10.equals(r1)     // Catch:{ Exception -> 0x0359 }
            r29 = 7
            if (r1 != 0) goto L_0x0321
            goto L_0x031f
        L_0x0315:
            java.lang.String r1 = "webp"
            boolean r1 = r10.equals(r1)     // Catch:{ Exception -> 0x0359 }
            r29 = 8
            if (r1 != 0) goto L_0x0321
        L_0x031f:
            r29 = 2
        L_0x0321:
            r30 = 0
            java.util.List r10 = r0.A0E     // Catch:{ Exception -> 0x0359 }
            X.9gD r1 = new X.9gD     // Catch:{ Exception -> 0x0359 }
            r25 = r1
            r25.<init>(r26, r27, r28, r29, r30, r32)     // Catch:{ Exception -> 0x0359 }
            r10.add(r1)     // Catch:{ Exception -> 0x0359 }
            r0.A04(r11)     // Catch:{ Exception -> 0x0359 }
            goto L_0x037d
        L_0x0333:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0359 }
            java.lang.String r0 = "IdvImageUploader/idvUpload: couldn't retrieve media for "
            X.C17900vP.A0X(r11, r0, r1)     // Catch:{ Exception -> 0x0359 }
            boolean r0 = r17.Be2()     // Catch:{ Exception -> 0x0359 }
            if (r0 == 0) goto L_0x037d
            java.lang.String r0 = "couldn't retrieve file"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)     // Catch:{ Exception -> 0x0359 }
            X.1IU r1 = X.C30691eM.A00(r0)     // Catch:{ Exception -> 0x0359 }
            r0 = r17
            r0.resumeWith(r1)     // Catch:{ Exception -> 0x0359 }
            goto L_0x037d
        L_0x0352:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0354 }
        L_0x0354:
            r0 = move-exception
            X.CDX.A00(r12, r1)     // Catch:{ Exception -> 0x0359 }
            throw r0     // Catch:{ Exception -> 0x0359 }
        L_0x0359:
            r10 = move-exception
            java.lang.String r0 = "IdvImageUploader/upload"
            com.whatsapp.util.Log.e(r0, r10)     // Catch:{ all -> 0x038d }
            boolean r0 = r17.Be2()     // Catch:{ all -> 0x038d }
            if (r0 == 0) goto L_0x037d
            X.00H r0 = r2.A02     // Catch:{ all -> 0x038d }
            java.lang.Object r2 = r0.get()     // Catch:{ all -> 0x038d }
            X.9xZ r2 = (X.C197969xZ) r2     // Catch:{ all -> 0x038d }
            java.lang.String r1 = "mv_idv_upload_tag"
            r0 = r18
            X.C197969xZ.A00(r2, r1, r0)     // Catch:{ all -> 0x038d }
            X.1IU r1 = X.C108945cZ.A1J(r10)     // Catch:{ all -> 0x038d }
            r0 = r17
            r0.resumeWith(r1)     // Catch:{ all -> 0x038d }
        L_0x037d:
            java.lang.Object r2 = r17.A0C()     // Catch:{ all -> 0x038d }
            r0 = r24
            if (r2 != r0) goto L_0x038a
            goto L_0x0428
        L_0x0387:
            X.C30691eM.A01(r2)     // Catch:{ all -> 0x038d }
        L_0x038a:
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x038d }
            goto L_0x0392
        L_0x038d:
            r0 = move-exception
            X.1IU r2 = X.C108945cZ.A1J(r0)
        L_0x0392:
            boolean r0 = r2 instanceof X.AnonymousClass1IU
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x03c0
            java.lang.Object r0 = r4.getKey()
            r3.put(r0, r2)
            r4.getKey()
            X.00H r0 = r6.A06
            java.lang.Object r0 = r0.get()
            X.9Z2 r0 = (X.AnonymousClass9Z2) r0
            X.0zA r1 = r0.A00
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x03c0
            java.lang.Object r0 = r1.A03()
            X.C18070vi.A0X(r0)
            java.lang.String r0 = "logMetaVerifiedUserActionWithResult"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x03c0:
            java.lang.Throwable r2 = X.C30671eK.A00(r2)
            if (r2 == 0) goto L_0x007d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "WaAuthenticityInterpreterCallbackImpl/idvUpload failure for: "
            X.C108995ce.A1J(r4, r0, r1, r2)
            X.00H r0 = r6.A06
            java.lang.Object r0 = r0.get()
            X.9Z2 r0 = (X.AnonymousClass9Z2) r0
            X.0zA r1 = r0.A00
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x007d
            java.lang.Object r0 = r1.A03()
            X.C18070vi.A0X(r0)
            java.lang.String r0 = "logMetaVerifiedUserActionWithResult"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x03ed:
            X.0wl r2 = r6.A08
            r0 = 0
            com.whatsapp.smartcapture.bloks.WaAuthenticityInterpreterCallbackImpl$idvUploadInternal$3 r1 = new com.whatsapp.smartcapture.bloks.WaAuthenticityInterpreterCallbackImpl$idvUploadInternal$3
            r6 = r1
            r7 = r3
            r8 = r21
            r9 = r0
            r10 = r22
            r11 = r23
            r6.<init>(r7, r8, r9, r10, r11)
            r5.L$0 = r0
            r5.L$1 = r0
            r5.L$2 = r0
            r5.L$3 = r0
            r5.L$4 = r0
            r5.L$5 = r0
            r5.L$6 = r0
            r5.L$7 = r0
            r5.L$8 = r0
            r0 = 2
            r5.label = r0
            java.lang.Object r1 = X.C30451dy.A00(r5, r2, r1)
            r0 = r24
            if (r1 != r0) goto L_0x0033
            return r24
        L_0x041c:
            X.Aoh r5 = new X.Aoh
            r5.<init>(r6, r3)
            goto L_0x0022
        L_0x0423:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0428:
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.smartcapture.bloks.WaAuthenticityInterpreterCallbackImpl.A00(java.lang.String, java.util.Map, java.util.Map, X.1dr, X.1Di, X.1Di, long):java.lang.Object");
    }

    public WaAuthenticityInterpreterCallbackImpl(C187019f8 r1, C26616D6k d6k, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, C18600wl r9, C18600wl r10) {
        C18070vi.A0w(d6k, r3, r1, r4, r9);
        C18070vi.A0x(r10, r5, r6, r7, r8);
        this.A01 = d6k;
        this.A09 = r3;
        this.A00 = r1;
        this.A06 = r4;
        this.A07 = r9;
        this.A08 = r10;
        this.A02 = r5;
        this.A04 = r6;
        this.A05 = r7;
        this.A03 = r8;
    }
}
