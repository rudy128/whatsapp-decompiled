package com.whatsapp.voicetranscription.scheduler;

import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass1DF;
import X.AnonymousClass1KB;
import X.AnonymousClass1Nb;
import X.AnonymousClass205;
import X.AnonymousClass2YS;
import X.AnonymousClass7LG;
import X.C134096q0;
import X.C1407873b;
import X.C17890vO;
import X.C18070vi;
import X.C18100vl;
import X.C217517g;
import X.C24027BuE;
import X.C24100BvS;
import X.C24119Bvl;
import X.C24120Bvm;
import X.C24121Bvn;
import X.C24489C6h;
import X.C25931Qe;
import X.C27785Dl5;
import X.C27786Dl6;
import X.C37181p6;
import X.C441822l;
import X.C88534a3;
import X.CM2;
import X.E8F;
import java.util.List;

public final class TranscriptionMLProcessor implements E8F {
    public final AnonymousClass1KB A00;
    public final AnonymousClass118 A01;
    public final C25931Qe A02;
    public final C1407873b A03;
    public final AnonymousClass1Nb A04;
    public final AnonymousClass10I A05;
    public final C134096q0 A06;
    public final C88534a3 A07;
    public final AnonymousClass00H A08 = C217517g.A00(16386);
    public final C18100vl A09 = AnonymousClass1DF.A01(new C27785Dl5(this));
    public final C18100vl A0A = AnonymousClass1DF.A01(new C27786Dl6(this));
    public final AnonymousClass2YS A0B;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: X.BvR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: X.BvR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: X.BvR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: X.BvR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: X.BvR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: X.BvR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: X.BvR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: X.BvR} */
    /* JADX WARNING: type inference failed for: r13v4, types: [X.DRA] */
    /* JADX WARNING: type inference failed for: r13v5, types: [X.DR8] */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
        if (r0 != false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0136, code lost:
        if (r5 == null) goto L_0x0138;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x026d A[Catch:{ UnsatisfiedLinkError -> 0x028e, all -> 0x02bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0286 A[Catch:{ UnsatisfiedLinkError -> 0x028e, all -> 0x02bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C24027BuE r25, X.CXW r26, com.whatsapp.voicetranscription.scheduler.TranscriptionMLProcessor r27, X.C30391dr r28) {
        /*
            r3 = r28
            r9 = r26
            boolean r0 = r3 instanceof X.C27431Ddm
            r8 = r27
            if (r0 == 0) goto L_0x0031
            r7 = r3
            X.Ddm r7 = (X.C27431Ddm) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0031
            int r2 = r2 - r1
            r7.label = r2
        L_0x0018:
            java.lang.Object r4 = r7.result
            X.1g4 r18 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r6 = 1
            if (r0 == 0) goto L_0x0037
            if (r0 != r6) goto L_0x02c2
            double r0 = r7.D$0
            java.lang.Object r5 = r7.L$2
            java.lang.Object r12 = r7.L$1
            java.io.File r12 = (java.io.File) r12
            java.lang.Object r9 = r7.L$0
            X.CXW r9 = (X.CXW) r9
            goto L_0x0262
        L_0x0031:
            X.Ddm r7 = new X.Ddm
            r7.<init>(r8, r3)
            goto L_0x0018
        L_0x0037:
            X.C30691eM.A01(r4)
            r0 = r25
            X.22l r4 = r0.A00     // Catch:{ all -> 0x02dd }
            X.4a3 r14 = r8.A07     // Catch:{ all -> 0x02dd }
            X.0ve r3 = r14.A01     // Catch:{ all -> 0x02dd }
            r0 = 9215(0x23ff, float:1.2913E-41)
            X.0vf r13 = X.C18040vf.A02     // Catch:{ all -> 0x02dd }
            boolean r0 = X.C18020vd.A05(r13, r3, r0)     // Catch:{ all -> 0x02dd }
            if (r0 == 0) goto L_0x0116
            X.205 r0 = r4.A0v     // Catch:{ all -> 0x02dd }
            X.1BI r1 = r0.A00     // Catch:{ all -> 0x02dd }
            if (r1 == 0) goto L_0x00f6
            X.1Nb r0 = r8.A04     // Catch:{ all -> 0x02dd }
            X.1yM r0 = r0.A0a(r1)     // Catch:{ all -> 0x02dd }
            X.Cho r5 = r0.A0B     // Catch:{ all -> 0x02dd }
            if (r5 != 0) goto L_0x005e
            X.BvS r5 = X.C24100BvS.A00     // Catch:{ all -> 0x02dd }
        L_0x005e:
            X.0vl r0 = r8.A09     // Catch:{ all -> 0x02dd }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x02dd }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ all -> 0x02dd }
            boolean r0 = r0.contains(r5)     // Catch:{ all -> 0x02dd }
            if (r0 == 0) goto L_0x00f6
        L_0x006c:
            X.Br5 r0 = r9.A06     // Catch:{ all -> 0x02dd }
            r28 = r0
            java.lang.String r2 = r5.A01     // Catch:{ all -> 0x02dd }
            r0.A0G = r2     // Catch:{ all -> 0x02dd }
            X.25F r0 = r4.A00     // Catch:{ all -> 0x02dd }
            X.229 r0 = r0.A02     // Catch:{ all -> 0x02dd }
            X.7LG r0 = (X.AnonymousClass7LG) r0     // Catch:{ all -> 0x02dd }
            if (r0 == 0) goto L_0x00f4
            java.lang.String r1 = r0.A05     // Catch:{ all -> 0x02dd }
        L_0x007e:
            X.6q0 r0 = r8.A06     // Catch:{ all -> 0x02dd }
            X.Bvr r22 = X.C24125Bvr.A00     // Catch:{ all -> 0x02dd }
            r25 = 0
            X.BvS r21 = X.C24100BvS.A00     // Catch:{ all -> 0x02dd }
            r15 = 0
            r23 = r4
            r24 = r1
            r26 = r25
            r27 = r15
            r19 = r0
            r20 = r5
            r19.A00(r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x02dd }
            X.0vl r0 = r8.A0A     // Catch:{ all -> 0x02dd }
            r17 = r0
            java.lang.Object r0 = r17.getValue()     // Catch:{ all -> 0x02dd }
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x02dd }
            boolean r0 = X.C21721ArX.A05(r0)     // Catch:{ all -> 0x02dd }
            if (r0 == 0) goto L_0x02ce
            java.lang.Object r0 = r17.getValue()     // Catch:{ all -> 0x02dd }
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x02dd }
            boolean r0 = r0.mkdir()     // Catch:{ all -> 0x02dd }
            if (r0 == 0) goto L_0x02c7
            X.2rc r0 = r4.A02     // Catch:{ all -> 0x02dd }
            if (r0 == 0) goto L_0x02d5
            java.io.File r0 = r0.A0G     // Catch:{ all -> 0x02dd }
            r16 = r0
            if (r0 == 0) goto L_0x02d5
            long r0 = r4.A0x     // Catch:{ all -> 0x02dd }
            java.lang.String r12 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x02dd }
            r11 = 3
            r10 = 48
            int r0 = r12.length()     // Catch:{ all -> 0x02dd }
            if (r11 > r0) goto L_0x00e0
            java.lang.CharSequence r1 = r12.subSequence(r15, r0)     // Catch:{ all -> 0x02dd }
        L_0x00cf:
            java.lang.String r10 = r1.toString()     // Catch:{ all -> 0x02dd }
            java.lang.String r1 = ".pcm"
            java.lang.Object r0 = r17.getValue()     // Catch:{ all -> 0x02dd }
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x02dd }
            java.io.File r12 = java.io.File.createTempFile(r10, r1, r0)     // Catch:{ all -> 0x02dd }
            goto L_0x0147
        L_0x00e0:
            java.lang.StringBuilder r1 = X.BE6.A0t(r11)     // Catch:{ all -> 0x02dd }
            int r11 = r11 - r0
            r0 = 1
            if (r6 > r11) goto L_0x00f0
        L_0x00e8:
            r1.append(r10)     // Catch:{ all -> 0x02dd }
            if (r0 == r11) goto L_0x00f0
            int r0 = r0 + 1
            goto L_0x00e8
        L_0x00f0:
            r1.append(r12)     // Catch:{ all -> 0x02dd }
            goto L_0x00cf
        L_0x00f4:
            r1 = 0
            goto L_0x007e
        L_0x00f6:
            X.1G4 r0 = r14.A05     // Catch:{ all -> 0x02dd }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x02dd }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x02dd }
            if (r1 == 0) goto L_0x013e
            X.CXq r0 = X.C25550Cho.A02     // Catch:{ all -> 0x02dd }
            X.Cho r5 = r0.A01(r1)     // Catch:{ all -> 0x02dd }
            X.0vl r0 = r8.A09     // Catch:{ all -> 0x02dd }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x02dd }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ all -> 0x02dd }
            boolean r0 = r0.contains(r5)     // Catch:{ all -> 0x02dd }
            if (r0 == 0) goto L_0x013e
            goto L_0x006c
        L_0x0116:
            r0 = 9425(0x24d1, float:1.3207E-41)
            java.lang.String r11 = X.C108955ca.A0v(r3, r0)     // Catch:{ all -> 0x02dd }
            X.Bzn[] r10 = X.C24352Bzn.values()     // Catch:{ all -> 0x02dd }
            int r5 = r10.length     // Catch:{ all -> 0x02dd }
            r2 = 0
        L_0x0122:
            if (r2 >= r5) goto L_0x0138
            r1 = r10[r2]     // Catch:{ all -> 0x02dd }
            java.lang.String r0 = r1.value     // Catch:{ all -> 0x02dd }
            boolean r0 = X.C18070vi.A18(r0, r11)     // Catch:{ all -> 0x02dd }
            if (r0 == 0) goto L_0x013b
            X.0vl r0 = X.C24352Bzn.A00     // Catch:{ all -> 0x02dd }
            java.lang.Object r5 = X.AnonymousClass8BV.A0n(r1, r0)     // Catch:{ all -> 0x02dd }
            X.Cho r5 = (X.C25550Cho) r5     // Catch:{ all -> 0x02dd }
            if (r5 != 0) goto L_0x006c
        L_0x0138:
            java.lang.String r0 = "voicetranscription/TranscriptionMLProcessor/process unityDefaultLanguage not set"
            goto L_0x0140
        L_0x013b:
            int r2 = r2 + 1
            goto L_0x0122
        L_0x013e:
            java.lang.String r0 = "voicetranscription/TranscriptionMLProcessor/process no language set"
        L_0x0140:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x02dd }
            X.BvR r5 = X.C24099BvR.A00     // Catch:{ all -> 0x02dd }
            goto L_0x006c
        L_0x0147:
            r0 = 7880(0x1ec8, float:1.1042E-41)
            int r0 = X.C18020vd.A00(r13, r3, r0)     // Catch:{ all -> 0x02bb }
            if (r0 > 0) goto L_0x0152
            r0 = -1
            goto L_0x0156
        L_0x0152:
            long r0 = (long) r0     // Catch:{ all -> 0x02bb }
            r10 = 16000(0x3e80, double:7.905E-320)
            long r0 = r0 * r10
        L_0x0156:
            X.C18070vi.A0d(r12, r6)     // Catch:{ UnsatisfiedLinkError -> 0x02a0 }
            java.lang.String r10 = "voicetranscription/opuslib: before loadLibrary()"
            com.whatsapp.util.Log.i((java.lang.String) r10)     // Catch:{ UnsatisfiedLinkError -> 0x02a0 }
            X.4XD r10 = com.whatsapp.unity.UnityLib.A00     // Catch:{ UnsatisfiedLinkError -> 0x02a0 }
            r10.A01()     // Catch:{ UnsatisfiedLinkError -> 0x02a0 }
            java.lang.String r10 = "voicetranscription/opuslib: after loadLibrary()"
            com.whatsapp.util.Log.i((java.lang.String) r10)     // Catch:{ UnsatisfiedLinkError -> 0x02a0 }
            java.lang.String r11 = r16.getCanonicalPath()     // Catch:{ UnsatisfiedLinkError -> 0x02a0 }
            X.C18070vi.A0X(r11)     // Catch:{ UnsatisfiedLinkError -> 0x02a0 }
            java.lang.String r10 = r12.getCanonicalPath()     // Catch:{ UnsatisfiedLinkError -> 0x02a0 }
            X.C18070vi.A0X(r10)     // Catch:{ UnsatisfiedLinkError -> 0x02a0 }
            long r10 = com.whatsapp.voicetranscription.opus.OpusLib.decodeOpusFile(r11, r10, r0)     // Catch:{ UnsatisfiedLinkError -> 0x02a0 }
            r16 = 0
            int r0 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x0298
            double r0 = (double) r10     // Catch:{ UnsatisfiedLinkError -> 0x02a0 }
            r10 = 4670021707350671360(0x40cf400000000000, double:16000.0)
            double r0 = r0 / r10
            r10 = 7027(0x1b73, float:9.847E-42)
            int r10 = X.C18020vd.A00(r13, r3, r10)     // Catch:{ all -> 0x02bb }
            if (r10 == 0) goto L_0x01a4
            if (r10 == r6) goto L_0x01a1
            r11 = 2
            if (r10 != r11) goto L_0x0195
            goto L_0x01a7
        L_0x0195:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02bb }
            java.lang.String r0 = "Invalid PTT_TRANSCRIPTION_ENGINE value: "
            java.lang.IllegalStateException r1 = X.AnonymousClass8BX.A0W(r0, r1, r10)     // Catch:{ all -> 0x02bb }
            goto L_0x02ba
        L_0x01a1:
            java.lang.Integer r10 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x02bb }
            goto L_0x01a9
        L_0x01a4:
            java.lang.Integer r10 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x02bb }
            goto L_0x01a9
        L_0x01a7:
            java.lang.Integer r10 = X.AnonymousClass00R.A0C     // Catch:{ all -> 0x02bb }
        L_0x01a9:
            int r10 = r10.intValue()     // Catch:{ all -> 0x02bb }
            r13 = 0
            r11 = 33
            if (r10 == r15) goto L_0x01bf
            if (r10 == r6) goto L_0x01b5
            goto L_0x01cf
        L_0x01b5:
            X.73b r10 = r8.A03     // Catch:{ all -> 0x02bb }
            X.118 r8 = r8.A01     // Catch:{ all -> 0x02bb }
            X.DR8 r13 = new X.DR8     // Catch:{ all -> 0x02bb }
            r13.<init>(r8, r10, r14)     // Catch:{ all -> 0x02bb }
            goto L_0x01ec
        L_0x01bf:
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x02bb }
            if (r10 < r11) goto L_0x01ec
            X.118 r11 = r8.A01     // Catch:{ all -> 0x02bb }
            X.1KB r10 = r8.A00     // Catch:{ all -> 0x02bb }
            X.10I r8 = r8.A05     // Catch:{ all -> 0x02bb }
            X.DRA r13 = new X.DRA     // Catch:{ all -> 0x02bb }
            r13.<init>(r10, r11, r8)     // Catch:{ all -> 0x02bb }
            goto L_0x01ec
        L_0x01cf:
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x02bb }
            if (r10 < r11) goto L_0x01ec
            X.118 r15 = r8.A01     // Catch:{ all -> 0x02bb }
            X.1KB r11 = r8.A00     // Catch:{ all -> 0x02bb }
            X.10I r10 = r8.A05     // Catch:{ all -> 0x02bb }
            X.73b r8 = r8.A03     // Catch:{ all -> 0x02bb }
            X.DR9 r13 = new X.DR9     // Catch:{ all -> 0x02bb }
            r19 = r13
            r20 = r11
            r21 = r15
            r22 = r8
            r23 = r10
            r24 = r14
            r19.<init>(r20, r21, r22, r23, r24)     // Catch:{ all -> 0x02bb }
        L_0x01ec:
            X.E6r r13 = (X.C28543E6r) r13     // Catch:{ all -> 0x02bb }
            if (r13 == 0) goto L_0x0290
            long r14 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02bb }
            long r10 = r9.A03     // Catch:{ all -> 0x02bb }
            java.lang.Long r10 = X.C108945cZ.A1B(r14, r10)     // Catch:{ all -> 0x02bb }
            r8 = r28
            r8.A0B = r10     // Catch:{ all -> 0x02bb }
            X.6kM r8 = r9.A08     // Catch:{ all -> 0x02bb }
            X.6mJ r8 = r8.A05     // Catch:{ all -> 0x02bb }
            r10 = 1
            r8.A00(r10)     // Catch:{ all -> 0x02bb }
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02bb }
            java.lang.Long r8 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x02bb }
            r9.A02 = r8     // Catch:{ all -> 0x02bb }
            r8 = 10531(0x2923, float:1.4757E-41)
            org.json.JSONObject r8 = r3.A0J(r8)     // Catch:{ UnsatisfiedLinkError -> 0x028e }
            if (r2 == 0) goto L_0x025e
            boolean r3 = r8.has(r2)     // Catch:{ UnsatisfiedLinkError -> 0x028e }
            if (r3 == 0) goto L_0x025e
        L_0x021f:
            java.lang.String r3 = X.A6n.A02(r2, r8)     // Catch:{ UnsatisfiedLinkError -> 0x028e }
            if (r3 == 0) goto L_0x025c
            X.CXq r2 = X.C25550Cho.A02     // Catch:{ UnsatisfiedLinkError -> 0x028e }
            X.Cho r10 = r2.A01(r3)     // Catch:{ UnsatisfiedLinkError -> 0x028e }
        L_0x022b:
            r3 = 5
            X.DfY r2 = new X.DfY     // Catch:{ UnsatisfiedLinkError -> 0x028e }
            r2.<init>(r9, r3)     // Catch:{ UnsatisfiedLinkError -> 0x028e }
            X.Cb3 r8 = new X.Cb3     // Catch:{ UnsatisfiedLinkError -> 0x028e }
            r8.<init>(r10, r4, r12, r2)     // Catch:{ UnsatisfiedLinkError -> 0x028e }
            r7.L$0 = r9     // Catch:{ UnsatisfiedLinkError -> 0x028e }
            r7.L$1 = r12     // Catch:{ UnsatisfiedLinkError -> 0x028e }
            r7.L$2 = r5     // Catch:{ UnsatisfiedLinkError -> 0x028e }
            r7.D$0 = r0     // Catch:{ UnsatisfiedLinkError -> 0x028e }
            r7.label = r6     // Catch:{ UnsatisfiedLinkError -> 0x028e }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = X.C71053Dp.A01     // Catch:{ UnsatisfiedLinkError -> 0x028e }
            X.1dr r2 = X.C30581eB.A02(r7)     // Catch:{ UnsatisfiedLinkError -> 0x028e }
            X.3Dp r3 = new X.3Dp     // Catch:{ UnsatisfiedLinkError -> 0x028e }
            r3.<init>(r2)     // Catch:{ UnsatisfiedLinkError -> 0x028e }
            X.DR6 r2 = new X.DR6     // Catch:{ UnsatisfiedLinkError -> 0x028e }
            r2.<init>(r3)     // Catch:{ UnsatisfiedLinkError -> 0x028e }
            r13.CPe(r8, r2)     // Catch:{ UnsatisfiedLinkError -> 0x028e }
            java.lang.Object r4 = r3.A00()     // Catch:{ UnsatisfiedLinkError -> 0x028e }
            r2 = r18
            if (r4 != r2) goto L_0x0265
            goto L_0x0261
        L_0x025c:
            r10 = r5
            goto L_0x022b
        L_0x025e:
            java.lang.String r2 = "*"
            goto L_0x021f
        L_0x0261:
            return r18
        L_0x0262:
            X.C30691eM.A01(r4)     // Catch:{ UnsatisfiedLinkError -> 0x028e }
        L_0x0265:
            X.Cb5 r4 = (X.C25211Cb5) r4     // Catch:{ UnsatisfiedLinkError -> 0x028e }
            X.Br5 r8 = r9.A06     // Catch:{ all -> 0x02bb }
            java.lang.Long r2 = r9.A02     // Catch:{ all -> 0x02bb }
            if (r2 == 0) goto L_0x0286
            long r6 = r2.longValue()     // Catch:{ all -> 0x02bb }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02bb }
            java.lang.Long r2 = X.C108945cZ.A1B(r2, r6)     // Catch:{ all -> 0x02bb }
        L_0x0279:
            r8.A0E = r2     // Catch:{ all -> 0x02bb }
            java.lang.Double r2 = new java.lang.Double     // Catch:{ all -> 0x02bb }
            r2.<init>(r0)     // Catch:{ all -> 0x02bb }
            X.7PS r0 = new X.7PS     // Catch:{ all -> 0x02bb }
            r0.<init>(r4, r2, r5)     // Catch:{ all -> 0x02bb }
            goto L_0x0288
        L_0x0286:
            r2 = 0
            goto L_0x0279
        L_0x0288:
            if (r12 == 0) goto L_0x028d
            r12.delete()
        L_0x028d:
            return r0
        L_0x028e:
            r1 = move-exception
            goto L_0x02ae
        L_0x0290:
            X.Bvf r0 = X.C24113Bvf.A00     // Catch:{ all -> 0x02bb }
            X.C1r r1 = new X.C1r     // Catch:{ all -> 0x02bb }
            r1.<init>(r0)     // Catch:{ all -> 0x02bb }
            goto L_0x02ba
        L_0x0298:
            X.Bvk r0 = X.C24118Bvk.A00     // Catch:{ all -> 0x02bb }
            X.C1r r1 = new X.C1r     // Catch:{ all -> 0x02bb }
            r1.<init>(r0)     // Catch:{ all -> 0x02bb }
            goto L_0x02ba
        L_0x02a0:
            r1 = move-exception
            java.lang.String r0 = "voicetranscription/TranscriptionMLProcessor/process opus link error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x02bb }
            X.Bve r0 = X.C24112Bve.A00     // Catch:{ all -> 0x02bb }
            X.C1r r1 = new X.C1r     // Catch:{ all -> 0x02bb }
            r1.<init>(r0)     // Catch:{ all -> 0x02bb }
            goto L_0x02ba
        L_0x02ae:
            java.lang.String r0 = "voicetranscription/TranscriptionMLProcessor/process unity link error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x02bb }
            X.Bve r0 = X.C24112Bve.A00     // Catch:{ all -> 0x02bb }
            X.C1r r1 = new X.C1r     // Catch:{ all -> 0x02bb }
            r1.<init>(r0)     // Catch:{ all -> 0x02bb }
        L_0x02ba:
            throw r1     // Catch:{ all -> 0x02bb }
        L_0x02bb:
            r0 = move-exception
            if (r12 == 0) goto L_0x02c6
            r12.delete()
            throw r0
        L_0x02c2:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
        L_0x02c6:
            throw r0
        L_0x02c7:
            java.lang.String r0 = "Failed to create tmp dir"
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ all -> 0x02dd }
            goto L_0x02dc
        L_0x02ce:
            java.lang.String r0 = "Failed to delete tmp dir"
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ all -> 0x02dd }
            goto L_0x02dc
        L_0x02d5:
            X.Bva r1 = X.C24108Bva.A00     // Catch:{ all -> 0x02dd }
            X.C1r r0 = new X.C1r     // Catch:{ all -> 0x02dd }
            r0.<init>(r1)     // Catch:{ all -> 0x02dd }
        L_0x02dc:
            throw r0     // Catch:{ all -> 0x02dd }
        L_0x02dd:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voicetranscription.scheduler.TranscriptionMLProcessor.A00(X.BuE, X.CXW, com.whatsapp.voicetranscription.scheduler.TranscriptionMLProcessor, X.1dr):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r19v0, types: [java.util.List] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x03be: MOVE  (r1v8 X.C1r) = (r1v1 'th' X.C1r)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0261 A[Catch:{ all -> 0x03b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x03c2 A[Catch:{ all -> 0x0414 }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x03c8 A[Catch:{ all -> 0x0414 }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x03f7 A[Catch:{ all -> 0x0414 }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x03fa A[Catch:{ all -> 0x0414 }] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x03fe A[Catch:{ all -> 0x0414 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0140 A[Catch:{ all -> 0x03b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0159 A[Catch:{ all -> 0x03b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0165 A[Catch:{ all -> 0x03b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x016d A[Catch:{ all -> 0x03b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0236 A[Catch:{ all -> 0x03b1 }] */
    /* renamed from: A01 */
    public java.lang.Object CCX(X.C24027BuE r32, X.C30391dr r33) {
        /*
            r31 = this;
            r3 = r33
            boolean r0 = r3 instanceof X.C27432Ddn
            r7 = r31
            if (r0 == 0) goto L_0x0033
            r9 = r3
            X.Ddn r9 = (X.C27432Ddn) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0033
            int r2 = r2 - r1
            r9.label = r2
        L_0x0016:
            java.lang.Object r2 = r9.result
            X.1g4 r8 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r9.label
            r6 = 1
            if (r0 == 0) goto L_0x003e
            if (r0 != r6) goto L_0x0039
            java.lang.Object r5 = r9.L$3
            X.CXW r5 = (X.CXW) r5
            java.lang.Object r11 = r9.L$2
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r4 = r9.L$1
            X.22l r4 = (X.C441822l) r4
            java.lang.Object r7 = r9.L$0
            com.whatsapp.voicetranscription.scheduler.TranscriptionMLProcessor r7 = (com.whatsapp.voicetranscription.scheduler.TranscriptionMLProcessor) r7
            goto L_0x0101
        L_0x0033:
            X.Ddn r9 = new X.Ddn
            r9.<init>(r7, r3)
            goto L_0x0016
        L_0x0039:
            java.lang.IllegalStateException r2 = X.AnonymousClass000.A0l()
            throw r2
        L_0x003e:
            X.C30691eM.A01(r2)
            r10 = r32
            X.22l r4 = r10.A00
            X.25F r12 = r4.A00
            X.229 r0 = r12.A02
            X.7LG r0 = (X.AnonymousClass7LG) r0
            if (r0 == 0) goto L_0x0050
            java.lang.String r11 = r0.A05
            goto L_0x0051
        L_0x0050:
            r11 = 0
        L_0x0051:
            boolean r0 = r10.A02     // Catch:{ all -> 0x03b3 }
            if (r0 == 0) goto L_0x00c0
            X.2rc r5 = r4.A02     // Catch:{ all -> 0x00b2 }
            if (r5 == 0) goto L_0x00a4
            X.1Qe r3 = r7.A02     // Catch:{ all -> 0x00b2 }
            X.25F[] r0 = new X.AnonymousClass25F[r6]     // Catch:{ all -> 0x00b2 }
            r2 = 0
            r0[r2] = r12     // Catch:{ all -> 0x00b2 }
            r3.A0A(r0)     // Catch:{ all -> 0x00b2 }
            X.25F[] r1 = new X.AnonymousClass25F[r6]     // Catch:{ all -> 0x00b2 }
            X.25F r0 = r4.A01     // Catch:{ all -> 0x00b2 }
            X.C18070vi.A0W(r0)     // Catch:{ all -> 0x00b2 }
            r1[r2] = r0     // Catch:{ all -> 0x00b2 }
            r3.A0A(r1)     // Catch:{ all -> 0x00b2 }
            X.229 r8 = r12.A02     // Catch:{ all -> 0x00b2 }
            X.7LG r8 = (X.AnonymousClass7LG) r8     // Catch:{ all -> 0x00b2 }
            if (r8 == 0) goto L_0x009d
            java.util.List r2 = r4.A1G()     // Catch:{ all -> 0x00b2 }
            if (r2 == 0) goto L_0x00ab
            java.lang.String r1 = r5.A0P     // Catch:{ all -> 0x00b2 }
            if (r1 == 0) goto L_0x0096
            X.Cho r0 = r8.A03     // Catch:{ all -> 0x00b2 }
            X.Cb5 r5 = new X.Cb5     // Catch:{ all -> 0x00b2 }
            r5.<init>(r0, r4, r1, r2)     // Catch:{ all -> 0x00b2 }
            int r0 = r4.A0D     // Catch:{ all -> 0x00b2 }
            double r2 = (double) r0     // Catch:{ all -> 0x00b2 }
            X.Cho r1 = r8.A02     // Catch:{ all -> 0x00b2 }
            java.lang.Double r0 = java.lang.Double.valueOf(r2)     // Catch:{ all -> 0x00b2 }
            X.7PS r2 = new X.7PS     // Catch:{ all -> 0x00b2 }
            r2.<init>(r5, r0, r1)     // Catch:{ all -> 0x00b2 }
            r5 = 0
            goto L_0x0106
        L_0x0096:
            java.lang.String r0 = "Failed to load raw text"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x00b2 }
            goto L_0x00b1
        L_0x009d:
            java.lang.String r0 = "Failed to load audio data"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x00b2 }
            goto L_0x00b1
        L_0x00a4:
            java.lang.String r0 = "Failed to load media data"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x00b2 }
            goto L_0x00b1
        L_0x00ab:
            java.lang.String r0 = "Failed to load transcription segments"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x00b2 }
        L_0x00b1:
            throw r0     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r1 = move-exception
            java.lang.String r0 = "voicetranscription/TranscriptionMLProcessor/migrateToBurntInRedactions failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x03b3 }
            X.BvZ r1 = X.C24107BvZ.A00     // Catch:{ all -> 0x03b3 }
            X.C1r r0 = new X.C1r     // Catch:{ all -> 0x03b3 }
            r0.<init>(r1)     // Catch:{ all -> 0x03b3 }
            throw r0     // Catch:{ all -> 0x03b3 }
        L_0x00c0:
            X.2YS r0 = r7.A0B     // Catch:{ all -> 0x03b3 }
            X.10F r0 = r0.A00     // Catch:{ all -> 0x03b3 }
            X.10E r3 = r0.A00     // Catch:{ all -> 0x03b3 }
            X.00S r0 = r3.AAv     // Catch:{ all -> 0x03b3 }
            java.lang.Object r2 = r0.get()     // Catch:{ all -> 0x03b3 }
            X.11P r2 = (X.AnonymousClass11P) r2     // Catch:{ all -> 0x03b3 }
            X.18K r15 = X.AnonymousClass3Ma.A0g(r3)     // Catch:{ all -> 0x03b3 }
            X.00S r0 = r3.A0L     // Catch:{ all -> 0x03b3 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x03b3 }
            X.195 r1 = (X.AnonymousClass195) r1     // Catch:{ all -> 0x03b3 }
            X.00S r0 = r3.AAz     // Catch:{ all -> 0x03b3 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x03b3 }
            X.6kM r0 = (X.C131006kM) r0     // Catch:{ all -> 0x03b3 }
            X.CXW r5 = new X.CXW     // Catch:{ all -> 0x03b3 }
            r12 = r5
            r13 = r1
            r14 = r2
            r16 = r10
            r17 = r0
            r18 = r11
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x03b3 }
            r9.L$0 = r7     // Catch:{ all -> 0x03b1 }
            r9.L$1 = r4     // Catch:{ all -> 0x03b1 }
            r9.L$2 = r11     // Catch:{ all -> 0x03b1 }
            r9.L$3 = r5     // Catch:{ all -> 0x03b1 }
            r9.label = r6     // Catch:{ all -> 0x03b1 }
            java.lang.Object r2 = A00(r10, r5, r7, r9)     // Catch:{ all -> 0x03b1 }
            if (r2 != r8) goto L_0x0104
            return r8
        L_0x0101:
            X.C30691eM.A01(r2)     // Catch:{ all -> 0x03b1 }
        L_0x0104:
            X.7PS r2 = (X.AnonymousClass7PS) r2     // Catch:{ all -> 0x03b1 }
        L_0x0106:
            java.lang.Object r9 = r2.first     // Catch:{ all -> 0x03b1 }
            X.Cb5 r9 = (X.C25211Cb5) r9     // Catch:{ all -> 0x03b1 }
            java.lang.Object r0 = r2.second     // Catch:{ all -> 0x03b1 }
            double r18 = X.AnonymousClass8BR.A00(r0)     // Catch:{ all -> 0x03b1 }
            java.lang.Object r8 = r2.third     // Catch:{ all -> 0x03b1 }
            X.Cho r8 = (X.C25550Cho) r8     // Catch:{ all -> 0x03b1 }
            java.lang.String r0 = r9.A01     // Catch:{ all -> 0x03b1 }
            java.lang.StringBuilder r26 = X.BE6.A0u(r0)     // Catch:{ all -> 0x03b1 }
            java.util.List r0 = r9.A02     // Catch:{ all -> 0x03b1 }
            r30 = r0
            X.4a3 r15 = r7.A07     // Catch:{ all -> 0x03b1 }
            int r3 = r15.A03(r8)     // Catch:{ all -> 0x03b1 }
            r0 = 0
            X.C18070vi.A0d(r8, r0)     // Catch:{ all -> 0x03b1 }
            X.0ve r1 = r15.A01     // Catch:{ all -> 0x03b1 }
            r0 = 10561(0x2941, float:1.4799E-41)
            org.json.JSONObject r10 = r1.A0J(r0)     // Catch:{ all -> 0x03b1 }
            java.lang.String r2 = r8.A01     // Catch:{ all -> 0x03b1 }
            if (r2 == 0) goto L_0x020c
            boolean r0 = r10.has(r2)     // Catch:{ all -> 0x03b1 }
            if (r0 == 0) goto L_0x020c
        L_0x013a:
            boolean r0 = r10.isNull(r2)     // Catch:{ all -> 0x03b1 }
            if (r0 != 0) goto L_0x0202
            int r12 = r10.optInt(r2)     // Catch:{ all -> 0x03b1 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x03b1 }
            if (r0 == 0) goto L_0x0202
        L_0x014a:
            r2 = 6810(0x1a9a, float:9.543E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x03b1 }
            int r2 = X.C18020vd.A00(r0, r1, r2)     // Catch:{ all -> 0x03b1 }
            r10 = 0
            boolean r0 = r30.isEmpty()     // Catch:{ all -> 0x03b1 }
            if (r0 == 0) goto L_0x016d
            r2 = 0
            r0 = 1120403456(0x42c80000, float:100.0)
            X.Cb4 r12 = new X.Cb4     // Catch:{ all -> 0x03b1 }
            r12.<init>(r2, r0, r6, r10)     // Catch:{ all -> 0x03b1 }
        L_0x0161:
            boolean r0 = r12.A01     // Catch:{ all -> 0x03b1 }
            if (r0 != 0) goto L_0x0210
            boolean r0 = r12.A02     // Catch:{ all -> 0x03b1 }
            r25 = 0
            if (r0 != 0) goto L_0x0212
            goto L_0x0210
        L_0x016d:
            java.util.Iterator r16 = r30.iterator()     // Catch:{ all -> 0x03b1 }
            r14 = 0
            r13 = 0
        L_0x0173:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x03b1 }
            if (r0 == 0) goto L_0x0187
            java.lang.Object r0 = r16.next()     // Catch:{ all -> 0x03b1 }
            X.6t3 r0 = (X.C135966t3) r0     // Catch:{ all -> 0x03b1 }
            int r0 = r0.A00     // Catch:{ all -> 0x03b1 }
            int r14 = r14 + r0
            if (r0 >= r3) goto L_0x0173
            int r13 = r13 + 1
            goto L_0x0173
        L_0x0187:
            float r14 = (float) r14     // Catch:{ all -> 0x03b1 }
            int r0 = r30.size()     // Catch:{ all -> 0x03b1 }
            float r0 = (float) r0     // Catch:{ all -> 0x03b1 }
            float r14 = r14 / r0
            float r13 = (float) r13     // Catch:{ all -> 0x03b1 }
            int r0 = r30.size()     // Catch:{ all -> 0x03b1 }
            float r0 = (float) r0     // Catch:{ all -> 0x03b1 }
            float r13 = r13 / r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r13 = r13 * r0
            float r0 = (float) r12     // Catch:{ all -> 0x03b1 }
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x01fb
            float r0 = (float) r2     // Catch:{ all -> 0x03b1 }
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x01fb
            java.util.ArrayList r12 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x03b1 }
            java.util.Iterator r16 = r30.iterator()     // Catch:{ all -> 0x03b1 }
        L_0x01aa:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x03b1 }
            if (r0 == 0) goto L_0x01be
            java.lang.Object r2 = r16.next()     // Catch:{ all -> 0x03b1 }
            X.6t3 r2 = (X.C135966t3) r2     // Catch:{ all -> 0x03b1 }
            int r0 = r2.A00     // Catch:{ all -> 0x03b1 }
            if (r0 >= r3) goto L_0x01aa
            r12.add(r2)     // Catch:{ all -> 0x03b1 }
            goto L_0x01aa
        L_0x01be:
            java.util.Iterator r16 = r12.iterator()     // Catch:{ all -> 0x03b1 }
        L_0x01c2:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x03b1 }
            if (r0 == 0) goto L_0x01f4
            java.lang.Object r2 = r16.next()     // Catch:{ all -> 0x03b1 }
            X.6t3 r2 = (X.C135966t3) r2     // Catch:{ all -> 0x03b1 }
            int r12 = r2.A03     // Catch:{ all -> 0x03b1 }
            int r0 = r26.length()     // Catch:{ all -> 0x03b1 }
            if (r12 >= r0) goto L_0x01c2
            int r2 = r2.A02     // Catch:{ all -> 0x03b1 }
            int r0 = r26.length()     // Catch:{ all -> 0x03b1 }
            int r2 = X.BE6.A09(r0, r12, r2)     // Catch:{ all -> 0x03b1 }
            if (r2 == 0) goto L_0x01c2
            int r3 = r12 + r2
            java.lang.String r0 = "_"
            java.lang.String r2 = X.AnonymousClass1YE.A05(r0, r2)     // Catch:{ all -> 0x03b1 }
            r0 = 2
            X.C18070vi.A0d(r2, r0)     // Catch:{ all -> 0x03b1 }
            r0 = r26
            r0.replace(r12, r3, r2)     // Catch:{ all -> 0x03b1 }
            goto L_0x01c2
        L_0x01f4:
            X.Cb4 r12 = new X.Cb4     // Catch:{ all -> 0x03b1 }
            r12.<init>(r13, r14, r6, r10)     // Catch:{ all -> 0x03b1 }
            goto L_0x0161
        L_0x01fb:
            X.Cb4 r12 = new X.Cb4     // Catch:{ all -> 0x03b1 }
            r12.<init>(r13, r14, r10, r6)     // Catch:{ all -> 0x03b1 }
            goto L_0x0161
        L_0x0202:
            r2 = 9401(0x24b9, float:1.3174E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x03b1 }
            int r12 = X.C18020vd.A00(r0, r1, r2)     // Catch:{ all -> 0x03b1 }
            goto L_0x014a
        L_0x020c:
            java.lang.String r2 = "*"
            goto L_0x013a
        L_0x0210:
            r25 = 1
        L_0x0212:
            int r0 = r30.size()     // Catch:{ all -> 0x03b1 }
            double r2 = (double) r0     // Catch:{ all -> 0x03b1 }
            double r2 = r2 / r18
            X.Cho r0 = r9.A00     // Catch:{ all -> 0x03b1 }
            r29 = r0
            r0 = 10460(0x28dc, float:1.4658E-41)
            org.json.JSONObject r13 = r1.A0J(r0)     // Catch:{ all -> 0x03b1 }
            r0 = r29
            java.lang.String r14 = r0.A01     // Catch:{ all -> 0x03b1 }
            r9 = r14
            if (r14 == 0) goto L_0x0241
            boolean r0 = r13.has(r14)     // Catch:{ all -> 0x03b1 }
            if (r0 == 0) goto L_0x0241
        L_0x0230:
            boolean r0 = r13.isNull(r14)     // Catch:{ all -> 0x03b1 }
            if (r0 != 0) goto L_0x024a
            double r13 = r13.optDouble(r14)     // Catch:{ all -> 0x03b1 }
            java.lang.Double r0 = java.lang.Double.valueOf(r13)     // Catch:{ all -> 0x03b1 }
            if (r0 == 0) goto L_0x024a
            goto L_0x0244
        L_0x0241:
            java.lang.String r14 = "*"
            goto L_0x0230
        L_0x0244:
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            r24 = 1
            if (r0 < 0) goto L_0x024c
        L_0x024a:
            r24 = 0
        L_0x024c:
            r0 = 10459(0x28db, float:1.4656E-41)
            org.json.JSONObject r13 = r1.A0J(r0)     // Catch:{ all -> 0x03b1 }
            r1 = r9
            if (r9 == 0) goto L_0x027c
            boolean r0 = r13.has(r9)     // Catch:{ all -> 0x03b1 }
            if (r0 == 0) goto L_0x027c
        L_0x025b:
            boolean r0 = r13.isNull(r1)     // Catch:{ all -> 0x03b1 }
            if (r0 != 0) goto L_0x02ae
            double r16 = r13.optDouble(r1)     // Catch:{ all -> 0x03b1 }
            java.lang.Double r0 = java.lang.Double.valueOf(r16)     // Catch:{ all -> 0x03b1 }
            if (r0 == 0) goto L_0x02ae
            java.lang.Object r0 = X.C29431cG.A0c(r30)     // Catch:{ all -> 0x03b1 }
            X.6t3 r0 = (X.C135966t3) r0     // Catch:{ all -> 0x03b1 }
            if (r0 == 0) goto L_0x02ae
            int r14 = r0.A04     // Catch:{ all -> 0x03b1 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x03b1 }
            if (r14 < 0) goto L_0x02ae
            goto L_0x027f
        L_0x027c:
            java.lang.String r1 = "*"
            goto L_0x025b
        L_0x027f:
            if (r0 == 0) goto L_0x02ae
            java.lang.Object r1 = X.C29431cG.A0e(r30)     // Catch:{ all -> 0x03b1 }
            X.6t3 r1 = (X.C135966t3) r1     // Catch:{ all -> 0x03b1 }
            if (r1 == 0) goto L_0x02ae
            int r13 = r1.A04     // Catch:{ all -> 0x03b1 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x03b1 }
            if (r13 < 0) goto L_0x02ae
            if (r0 == 0) goto L_0x02ae
            int r1 = r1.A01     // Catch:{ all -> 0x03b1 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x03b1 }
            if (r1 < 0) goto L_0x02bb
            if (r0 == 0) goto L_0x02bb
        L_0x029d:
            int r13 = r13 + r1
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r18 = r18 * r0
            int r13 = r13 - r14
            double r0 = (double) r13     // Catch:{ all -> 0x03b1 }
            double r0 = r0 / r18
            int r13 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r13 >= 0) goto L_0x02ae
            r10 = 1
        L_0x02ae:
            if (r25 != 0) goto L_0x02b6
            if (r24 != 0) goto L_0x02b6
            r23 = 0
            if (r10 == 0) goto L_0x02b8
        L_0x02b6:
            r23 = 1
        L_0x02b8:
            if (r5 == 0) goto L_0x0373
            goto L_0x02be
        L_0x02bb:
            r1 = 400(0x190, float:5.6E-43)
            goto L_0x029d
        L_0x02be:
            float r0 = r12.A00     // Catch:{ all -> 0x03b1 }
            double r0 = (double) r0     // Catch:{ all -> 0x03b1 }
            r27 = r0
            java.util.ArrayList r12 = X.C29351c6.A0D(r30)     // Catch:{ all -> 0x03b1 }
            java.util.Iterator r1 = r30.iterator()     // Catch:{ all -> 0x03b1 }
        L_0x02cb:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x03b1 }
            if (r0 == 0) goto L_0x02dd
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x03b1 }
            X.6t3 r0 = (X.C135966t3) r0     // Catch:{ all -> 0x03b1 }
            int r0 = r0.A00     // Catch:{ all -> 0x03b1 }
            X.C17890vO.A1D(r12, r0)     // Catch:{ all -> 0x03b1 }
            goto L_0x02cb
        L_0x02dd:
            double r21 = X.C29431cG.A0T(r12)     // Catch:{ all -> 0x03b1 }
            X.6kM r12 = r5.A08     // Catch:{ all -> 0x03b1 }
            X.6mJ r0 = r12.A00     // Catch:{ all -> 0x03b1 }
            r16 = r0
            r0 = r21
            long r13 = (long) r0     // Catch:{ all -> 0x03b1 }
            r0 = r16
            r0.A00(r13)     // Catch:{ all -> 0x03b1 }
            if (r9 == 0) goto L_0x0332
            X.0vl r14 = r12.A0B     // Catch:{ all -> 0x03b1 }
            java.util.Map r20 = X.AnonymousClass3MW.A12(r14)     // Catch:{ all -> 0x03b1 }
            monitor-enter(r20)     // Catch:{ all -> 0x03b1 }
            java.lang.Object r0 = X.AnonymousClass8BV.A0n(r9, r14)     // Catch:{ all -> 0x032f }
            if (r0 != 0) goto L_0x0302
            java.lang.Long r0 = X.C17890vO.A0L()     // Catch:{ all -> 0x032f }
        L_0x0302:
            long r18 = X.C17880vN.A05(r0)     // Catch:{ all -> 0x032f }
            java.util.Map r1 = X.AnonymousClass3MW.A12(r14)     // Catch:{ all -> 0x032f }
            r16 = 1
            long r18 = r18 + r16
            java.lang.Long r0 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x032f }
            r1.put(r9, r0)     // Catch:{ all -> 0x032f }
            X.0vl r0 = r12.A0C     // Catch:{ all -> 0x032f }
            android.content.SharedPreferences$Editor r13 = X.C17890vO.A0A(r0)     // Catch:{ all -> 0x032f }
            java.lang.String r1 = "locale_counts"
            java.util.Map r14 = X.AnonymousClass3MW.A12(r14)     // Catch:{ all -> 0x032f }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x032f }
            r0.<init>(r14)     // Catch:{ all -> 0x032f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x032f }
            X.C17880vN.A1E(r13, r1, r0)     // Catch:{ all -> 0x032f }
            monitor-exit(r20)     // Catch:{ all -> 0x03b1 }
            goto L_0x0332
        L_0x032f:
            r0 = move-exception
            monitor-exit(r20)     // Catch:{ all -> 0x03b1 }
            throw r0     // Catch:{ all -> 0x03b1 }
        L_0x0332:
            if (r23 == 0) goto L_0x033b
            X.6mJ r13 = r12.A0A     // Catch:{ all -> 0x03b1 }
            r0 = 1
            r13.A00(r0)     // Catch:{ all -> 0x03b1 }
        L_0x033b:
            X.6mJ r12 = r12.A03     // Catch:{ all -> 0x03b1 }
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x03b1 }
            X.BuE r0 = r5.A07     // Catch:{ all -> 0x03b1 }
            X.22l r0 = r0.A00     // Catch:{ all -> 0x03b1 }
            int r0 = r0.A0D     // Catch:{ all -> 0x03b1 }
            long r0 = (long) r0     // Catch:{ all -> 0x03b1 }
            long r0 = r13.toMillis(r0)     // Catch:{ all -> 0x03b1 }
            r12.A00(r0)     // Catch:{ all -> 0x03b1 }
            X.Br5 r1 = r5.A06     // Catch:{ all -> 0x03b1 }
            java.lang.Double r0 = java.lang.Double.valueOf(r21)     // Catch:{ all -> 0x03b1 }
            r1.A04 = r0     // Catch:{ all -> 0x03b1 }
            r1.A0I = r9     // Catch:{ all -> 0x03b1 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r23)     // Catch:{ all -> 0x03b1 }
            r1.A03 = r0     // Catch:{ all -> 0x03b1 }
            X.195 r0 = r5.A04     // Catch:{ all -> 0x03b1 }
            boolean r0 = r0.A00     // Catch:{ all -> 0x03b1 }
            java.lang.Boolean r0 = X.C108945cZ.A1A(r0)     // Catch:{ all -> 0x03b1 }
            r1.A00 = r0     // Catch:{ all -> 0x03b1 }
            java.lang.Double r0 = java.lang.Double.valueOf(r2)     // Catch:{ all -> 0x03b1 }
            r1.A06 = r0     // Catch:{ all -> 0x03b1 }
            java.lang.Double r0 = java.lang.Double.valueOf(r27)     // Catch:{ all -> 0x03b1 }
            r1.A05 = r0     // Catch:{ all -> 0x03b1 }
        L_0x0373:
            if (r25 != 0) goto L_0x03a1
            if (r24 != 0) goto L_0x03a9
            if (r10 != 0) goto L_0x0399
            X.6q0 r0 = r7.A06     // Catch:{ all -> 0x03b1 }
            java.lang.String r19 = r26.toString()     // Catch:{ all -> 0x03b1 }
            X.Bvs r16 = X.C24126Bvs.A00     // Catch:{ all -> 0x03b1 }
            int r21 = r15.A03(r8)     // Catch:{ all -> 0x03b1 }
            r13 = r0
            r14 = r8
            r15 = r29
            r17 = r4
            r18 = r11
            r20 = r30
            r13.A00(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x03b1 }
            if (r5 == 0) goto L_0x0411
            r0 = 0
            r5.A00(r0, r6)     // Catch:{ all -> 0x03b1 }
            goto L_0x040a
        L_0x0399:
            X.Bvg r0 = X.C24114Bvg.A00     // Catch:{ all -> 0x03b1 }
            X.C1r r1 = new X.C1r     // Catch:{ all -> 0x03b1 }
            r1.<init>(r0)     // Catch:{ all -> 0x03b1 }
            goto L_0x03b0
        L_0x03a1:
            X.BvY r0 = X.C24106BvY.A00     // Catch:{ all -> 0x03b1 }
            X.C1r r1 = new X.C1r     // Catch:{ all -> 0x03b1 }
            r1.<init>(r0)     // Catch:{ all -> 0x03b1 }
            goto L_0x03b0
        L_0x03a9:
            X.Bvj r0 = X.C24117Bvj.A00     // Catch:{ all -> 0x03b1 }
            X.C1r r1 = new X.C1r     // Catch:{ all -> 0x03b1 }
            r1.<init>(r0)     // Catch:{ all -> 0x03b1 }
        L_0x03b0:
            throw r1     // Catch:{ all -> 0x03b1 }
        L_0x03b1:
            r1 = move-exception
            goto L_0x03b5
        L_0x03b3:
            r1 = move-exception
            r5 = 0
        L_0x03b5:
            java.lang.String r0 = "voicetranscription/TranscriptionMLProcessor/process transcription failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0414 }
            boolean r0 = r1 instanceof X.C24396C1r     // Catch:{ all -> 0x0414 }
            if (r0 == 0) goto L_0x03fa
            X.C1r r1 = (X.C24396C1r) r1     // Catch:{ all -> 0x0414 }
            if (r1 == 0) goto L_0x03fa
            X.Bvo r3 = r1.reason     // Catch:{ all -> 0x0414 }
        L_0x03c4:
            X.6q0 r2 = r7.A06     // Catch:{ all -> 0x0414 }
            if (r3 != 0) goto L_0x03f7
            r1 = 0
            X.BvT r0 = new X.BvT     // Catch:{ all -> 0x0414 }
            r0.<init>(r6)     // Catch:{ all -> 0x0414 }
        L_0x03ce:
            X.BvS r13 = X.C24100BvS.A00     // Catch:{ all -> 0x0414 }
            r20 = 0
            r19 = r1
            r12 = r2
            r14 = r13
            r15 = r0
            r16 = r4
            r17 = r11
            r18 = r1
            r12.A00(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0414 }
            X.BvY r0 = X.C24106BvY.A00     // Catch:{ all -> 0x0414 }
            boolean r0 = X.C18070vi.A18(r3, r0)     // Catch:{ all -> 0x0414 }
            if (r0 != 0) goto L_0x03fc
            X.Bvj r0 = X.C24117Bvj.A00     // Catch:{ all -> 0x0414 }
            boolean r0 = X.C18070vi.A18(r3, r0)     // Catch:{ all -> 0x0414 }
            if (r0 != 0) goto L_0x03fc
            X.Bvg r0 = X.C24114Bvg.A00     // Catch:{ all -> 0x0414 }
            boolean r6 = X.C18070vi.A18(r3, r0)     // Catch:{ all -> 0x0414 }
            goto L_0x03fc
        L_0x03f7:
            r1 = 0
            r0 = r3
            goto L_0x03ce
        L_0x03fa:
            r3 = 0
            goto L_0x03c4
        L_0x03fc:
            if (r5 == 0) goto L_0x0411
            if (r3 == 0) goto L_0x0407
            int r0 = r3.A00     // Catch:{ all -> 0x0414 }
            java.lang.Integer r1 = new java.lang.Integer     // Catch:{ all -> 0x0414 }
            r1.<init>(r0)     // Catch:{ all -> 0x0414 }
        L_0x0407:
            r5.A00(r1, r6)     // Catch:{ all -> 0x0414 }
        L_0x040a:
            X.18K r1 = r5.A05
            X.Br5 r0 = r5.A06
            r1.CC4(r0)
        L_0x0411:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0414:
            r2 = move-exception
            if (r5 == 0) goto L_0x041e
            X.18K r1 = r5.A05
            X.Br5 r0 = r5.A06
            r1.CC4(r0)
        L_0x041e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voicetranscription.scheduler.TranscriptionMLProcessor.CCX(X.BuE, X.1dr):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void C4P(C24489C6h c6h) {
        CM2 cm2;
        C24027BuE buE = (C24027BuE) c6h;
        C18070vi.A0d(buE, 0);
        C441822l r4 = buE.A00;
        AnonymousClass7LG r0 = (AnonymousClass7LG) r4.A00.A02;
        if (r0 != null) {
            cm2 = r0.A04;
        } else {
            cm2 = null;
        }
        boolean z = buE.A01;
        CM2 cm22 = C24120Bvm.A00;
        CM2 cm23 = cm22;
        if (!z && !C18070vi.A18(cm2, cm22)) {
            cm22 = buE.A02 ? C24121Bvn.A00 : C24119Bvl.A00;
        }
        if (C18070vi.A18(cm22, cm23)) {
            AnonymousClass00H r02 = this.A08;
            C18070vi.A0d(r02, 0);
            AnonymousClass205 r1 = r4.A0v;
            C18070vi.A0W(r1);
            ((C37181p6) r02.get()).A00.add(r1);
        } else if (C18070vi.A18(cm22, C24119Bvl.A00)) {
            AnonymousClass00H r03 = this.A08;
            C18070vi.A0d(r03, 0);
            ((C37181p6) r03.get()).remove(r4.A0v);
        }
        if (!C18070vi.A18(cm22, cm2)) {
            C134096q0 r04 = this.A06;
            String A0Q = C17890vO.A0Q();
            C24100BvS bvS = C24100BvS.A00;
            r04.A00(bvS, bvS, cm22, r4, A0Q, (String) null, (List) null, 0);
        }
    }

    public TranscriptionMLProcessor(AnonymousClass2YS r2, AnonymousClass1KB r3, AnonymousClass118 r4, C25931Qe r5, C1407873b r6, AnonymousClass1Nb r7, AnonymousClass10I r8, C134096q0 r9, C88534a3 r10) {
        C18070vi.A0w(r3, r4, r8, r6, r5);
        C18070vi.A0q(r2, r9, r10);
        C18070vi.A0d(r7, 9);
        this.A00 = r3;
        this.A01 = r4;
        this.A05 = r8;
        this.A03 = r6;
        this.A02 = r5;
        this.A0B = r2;
        this.A06 = r9;
        this.A07 = r10;
        this.A04 = r7;
    }
}
