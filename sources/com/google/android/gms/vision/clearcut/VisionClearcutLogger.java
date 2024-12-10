package com.google.android.gms.vision.clearcut;

import X.C25607Cin;
import android.content.Context;

public class VisionClearcutLogger {
    public final C25607Cin zza;
    public boolean zzb = true;

    /* JADX WARNING: Can't wrap try/catch for region: R(7:164|165|(4:168|169|170|166)|269|178|(1:180)(2:184|(3:186|187|188))|181) */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0238, code lost:
        if (r1 != false) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:?, code lost:
        r11 = java.util.ServiceLoader.load(r10, r9).iterator();
        r10 = X.AnonymousClass000.A13();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x035c, code lost:
        if (r11.hasNext() != false) goto L_0x035e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:?, code lost:
        r11.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0365, code lost:
        throw X.BE7.A0a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0393, code lost:
        if (r10.size() == 1) goto L_0x0395;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0395, code lost:
        r9 = (X.C25943Cp9) r10.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x039b, code lost:
        X.C25943Cp9.A03 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x039f, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03a4, code lost:
        if (r10.size() != 0) goto L_0x03a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:?, code lost:
        r9 = (X.C25943Cp9) X.BE6.A0x(r2, java.util.Collection.class, "combine", new java.lang.Class[1], 0).invoke((java.lang.Object) null, new java.lang.Object[]{r10});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03bb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:?, code lost:
        r1 = new java.lang.IllegalStateException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03c2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x03c3, code lost:
        r1 = new java.lang.IllegalStateException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03c9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03ca, code lost:
        r1 = new java.lang.IllegalStateException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ba, code lost:
        if (r3 != null) goto L_0x00bc;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:164:0x034c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(int r21, X.C23478Bhi r22) {
        /*
            r20 = this;
            r5 = r22
            int r7 = r5.zzc     // Catch:{ IOException -> 0x04c0 }
            r0 = -1
            if (r7 != r0) goto L_0x0017
            X.Cjq r1 = X.C25660Cjq.A02     // Catch:{ IOException -> 0x04c0 }
            java.lang.Class r0 = r5.getClass()     // Catch:{ IOException -> 0x04c0 }
            X.EAD r0 = r1.A00(r0)     // Catch:{ IOException -> 0x04c0 }
            int r7 = r0.zzb(r5)     // Catch:{ IOException -> 0x04c0 }
            r5.zzc = r7     // Catch:{ IOException -> 0x04c0 }
        L_0x0017:
            byte[] r3 = new byte[r7]     // Catch:{ IOException -> 0x04c0 }
            X.BhF r2 = new X.BhF     // Catch:{ IOException -> 0x04c0 }
            r2.<init>(r3, r7)     // Catch:{ IOException -> 0x04c0 }
            X.Cjq r8 = X.C25660Cjq.A02     // Catch:{ IOException -> 0x04c0 }
            java.lang.Class r0 = r5.getClass()     // Catch:{ IOException -> 0x04c0 }
            X.EAD r1 = r8.A00(r0)     // Catch:{ IOException -> 0x04c0 }
            X.DKF r0 = r2.A01     // Catch:{ IOException -> 0x04c0 }
            if (r0 != 0) goto L_0x0031
            X.DKF r0 = new X.DKF     // Catch:{ IOException -> 0x04c0 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x04c0 }
        L_0x0031:
            r1.CT7(r0, r5)     // Catch:{ IOException -> 0x04c0 }
            int r1 = r2.A02     // Catch:{ IOException -> 0x04c0 }
            int r0 = r2.A00     // Catch:{ IOException -> 0x04c0 }
            int r1 = r1 - r0
            if (r1 != 0) goto L_0x04b9
            r6 = 1
            r5 = 0
            r2 = r21
            if (r21 < 0) goto L_0x04a1
            r0 = 3
            if (r2 > r0) goto L_0x04a1
            r1 = r20
            boolean r0 = r1.zzb     // Catch:{ Exception -> 0x0446 }
            if (r0 == 0) goto L_0x02cf
            X.Cin r6 = r1.zza     // Catch:{ Exception -> 0x0446 }
            r7 = 0
            X.C0l r4 = r6.A00     // Catch:{ Exception -> 0x0446 }
            X.BfA r10 = new X.BfA     // Catch:{ Exception -> 0x0446 }
            r10.<init>()     // Catch:{ Exception -> 0x0446 }
            android.content.Context r0 = r6.A02     // Catch:{ Exception -> 0x0446 }
            boolean r0 = X.C26088Cs6.A00(r0)     // Catch:{ Exception -> 0x0446 }
            r10.A06 = r0     // Catch:{ Exception -> 0x0446 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0446 }
            r10.A01 = r0     // Catch:{ Exception -> 0x0446 }
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0446 }
            r10.A02 = r8     // Catch:{ Exception -> 0x0446 }
            java.util.TimeZone r8 = java.util.TimeZone.getDefault()     // Catch:{ Exception -> 0x0446 }
            int r0 = r8.getOffset(r0)     // Catch:{ Exception -> 0x0446 }
            int r0 = r0 / 1000
            long r0 = (long) r0     // Catch:{ Exception -> 0x0446 }
            r10.A03 = r0     // Catch:{ Exception -> 0x0446 }
            r10.A08 = r3     // Catch:{ Exception -> 0x0446 }
            r10.A00 = r2     // Catch:{ Exception -> 0x0446 }
            java.lang.String r2 = r6.A06     // Catch:{ Exception -> 0x0446 }
            int r1 = r6.A01     // Catch:{ Exception -> 0x0446 }
            X.Bcn r0 = new X.Bcn     // Catch:{ Exception -> 0x0446 }
            r0.<init>(r4, r2, r1)     // Catch:{ Exception -> 0x0446 }
            r8 = 1
            X.Bcm r4 = new X.Bcm     // Catch:{ Exception -> 0x0446 }
            r4.<init>(r10, r0)     // Catch:{ Exception -> 0x0446 }
            X.E1g r2 = r6.A03     // Catch:{ Exception -> 0x0446 }
            X.DHu r2 = (X.C26887DHu) r2     // Catch:{ Exception -> 0x0446 }
            X.Bcn r0 = r4.A00     // Catch:{ Exception -> 0x0446 }
            java.lang.String r3 = r0.A01     // Catch:{ Exception -> 0x0446 }
            int r1 = r0.A00     // Catch:{ Exception -> 0x0446 }
            X.BfA r0 = r4.A08     // Catch:{ Exception -> 0x0446 }
            if (r0 == 0) goto L_0x00a3
            int r10 = r0.A00     // Catch:{ Exception -> 0x0446 }
        L_0x0098:
            X.Cvd r0 = X.C26887DHu.A03     // Catch:{ Exception -> 0x0446 }
            java.lang.Object r0 = r0.A05()     // Catch:{ Exception -> 0x0446 }
            boolean r0 = X.AnonymousClass000.A1Y(r0)     // Catch:{ Exception -> 0x0446 }
            goto L_0x00a5
        L_0x00a3:
            r10 = 0
            goto L_0x0098
        L_0x00a5:
            if (r0 != 0) goto L_0x00ab
            if (r3 == 0) goto L_0x02a9
            goto L_0x013d
        L_0x00ab:
            if (r3 == 0) goto L_0x00b4
            boolean r0 = r3.isEmpty()     // Catch:{ Exception -> 0x0446 }
            if (r0 != 0) goto L_0x00b4
            goto L_0x00bc
        L_0x00b4:
            if (r1 < 0) goto L_0x01af
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0446 }
            if (r3 == 0) goto L_0x01af
        L_0x00bc:
            android.content.Context r9 = r2.A00     // Catch:{ Exception -> 0x0446 }
            if (r9 != 0) goto L_0x0116
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ Exception -> 0x0446 }
        L_0x00c4:
            java.util.Iterator r19 = r0.iterator()     // Catch:{ Exception -> 0x0446 }
        L_0x00c8:
            boolean r0 = r19.hasNext()     // Catch:{ Exception -> 0x0446 }
            if (r0 == 0) goto L_0x01af
            java.lang.Object r11 = r19.next()     // Catch:{ Exception -> 0x0446 }
            X.Bf0 r11 = (X.C23312Bf0) r11     // Catch:{ Exception -> 0x0446 }
            int r0 = r11.zzbb     // Catch:{ Exception -> 0x0446 }
            r0 = r0 & 1
            if (r0 != r8) goto L_0x00e0
            int r0 = r11.zzya     // Catch:{ Exception -> 0x0446 }
            if (r0 == 0) goto L_0x00e0
            if (r0 != r10) goto L_0x00c8
        L_0x00e0:
            java.lang.String r2 = r11.zzbis     // Catch:{ Exception -> 0x0446 }
            long r0 = X.C26887DHu.A00(r9)     // Catch:{ Exception -> 0x0446 }
            long r17 = X.C26887DHu.A01(r2, r0)     // Catch:{ Exception -> 0x0446 }
            long r2 = r11.zzbit     // Catch:{ Exception -> 0x0446 }
            long r0 = r11.zzbiu     // Catch:{ Exception -> 0x0446 }
            r12 = 0
            int r11 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r11 < 0) goto L_0x00c8
            int r11 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x00c8
            int r11 = (r17 > r12 ? 1 : (r17 == r12 ? 0 : -1))
            if (r11 < 0) goto L_0x00ff
            long r17 = r17 % r0
            goto L_0x0111
        L_0x00ff:
            r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r13 = r15 % r0
            r11 = 1
            long r13 = r13 + r11
            long r17 = r17 & r15
            long r17 = r17 % r0
            long r13 = r13 + r17
            long r17 = r13 % r0
        L_0x0111:
            int r0 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x02b4
            goto L_0x00c8
        L_0x0116:
            java.util.concurrent.ConcurrentHashMap r12 = X.C26887DHu.A07     // Catch:{ Exception -> 0x0446 }
            java.lang.Object r11 = r12.get(r3)     // Catch:{ Exception -> 0x0446 }
            X.Cvd r11 = (X.C26240Cvd) r11     // Catch:{ Exception -> 0x0446 }
            if (r11 != 0) goto L_0x0134
            X.CQ7 r2 = X.C26887DHu.A04     // Catch:{ Exception -> 0x0446 }
            X.Bex r1 = X.C23309Bex.zzbir     // Catch:{ Exception -> 0x0446 }
            X.E1w r0 = X.DJR.A00     // Catch:{ Exception -> 0x0446 }
            X.Beg r11 = new X.Beg     // Catch:{ Exception -> 0x0446 }
            r11.<init>(r0, r2, r1, r3)     // Catch:{ Exception -> 0x0446 }
            java.lang.Object r0 = r12.putIfAbsent(r3, r11)     // Catch:{ Exception -> 0x0446 }
            X.Cvd r0 = (X.C26240Cvd) r0     // Catch:{ Exception -> 0x0446 }
            if (r0 == 0) goto L_0x0134
            r11 = r0
        L_0x0134:
            java.lang.Object r0 = r11.A05()     // Catch:{ Exception -> 0x0446 }
            X.Bex r0 = (X.C23309Bex) r0     // Catch:{ Exception -> 0x0446 }
            X.EE7 r0 = r0.zzbiq     // Catch:{ Exception -> 0x0446 }
            goto L_0x00c4
        L_0x013d:
            boolean r0 = r3.isEmpty()     // Catch:{ Exception -> 0x0446 }
            if (r0 != 0) goto L_0x02a9
        L_0x0143:
            android.content.Context r9 = r2.A00     // Catch:{ Exception -> 0x0446 }
            if (r9 == 0) goto L_0x01af
            java.lang.Boolean r0 = X.C26887DHu.A01     // Catch:{ Exception -> 0x0446 }
            if (r0 != 0) goto L_0x0161
            X.1wL r0 = X.C41401wK.A00(r9)     // Catch:{ Exception -> 0x0446 }
            java.lang.String r1 = "com.google.android.providers.gsf.permission.READ_GSERVICES"
            android.content.Context r0 = r0.A00     // Catch:{ Exception -> 0x0446 }
            int r0 = r0.checkCallingOrSelfPermission(r1)     // Catch:{ Exception -> 0x0446 }
            boolean r0 = X.AnonymousClass000.A1P(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0446 }
            X.C26887DHu.A01 = r0     // Catch:{ Exception -> 0x0446 }
        L_0x0161:
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0446 }
            if (r0 == 0) goto L_0x01af
            java.util.HashMap r2 = X.C26887DHu.A06     // Catch:{ Exception -> 0x0446 }
            java.lang.Object r1 = r2.get(r3)     // Catch:{ Exception -> 0x0446 }
            X.Cvd r1 = (X.C26240Cvd) r1     // Catch:{ Exception -> 0x0446 }
            if (r1 != 0) goto L_0x017b
            X.CQ7 r0 = X.C26887DHu.A05     // Catch:{ Exception -> 0x0446 }
            X.Bef r1 = new X.Bef     // Catch:{ Exception -> 0x0446 }
            r1.<init>(r0, r7, r3)     // Catch:{ Exception -> 0x0446 }
            r2.put(r3, r1)     // Catch:{ Exception -> 0x0446 }
        L_0x017b:
            java.lang.Object r11 = r1.A05()     // Catch:{ Exception -> 0x0446 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x0446 }
            if (r11 == 0) goto L_0x01af
            r0 = 44
            int r0 = r11.indexOf(r0)     // Catch:{ Exception -> 0x0446 }
            r2 = 0
            if (r0 < 0) goto L_0x02a5
            java.lang.String r13 = r11.substring(r5, r0)     // Catch:{ Exception -> 0x0446 }
            int r2 = r0 + 1
        L_0x0192:
            r0 = 47
            int r1 = r11.indexOf(r0, r2)     // Catch:{ Exception -> 0x0446 }
            java.lang.String r10 = "LogSamplerImpl"
            if (r1 > 0) goto L_0x01c6
            java.lang.String r2 = java.lang.String.valueOf(r11)     // Catch:{ Exception -> 0x0446 }
            int r0 = r2.length()     // Catch:{ Exception -> 0x0446 }
            java.lang.String r1 = "Failed to parse the rule: "
            if (r0 == 0) goto L_0x01c0
            java.lang.String r0 = r1.concat(r2)     // Catch:{ Exception -> 0x0446 }
        L_0x01ac:
            android.util.Log.e(r10, r0)     // Catch:{ Exception -> 0x0446 }
        L_0x01af:
            X.E1h r2 = r6.A04     // Catch:{ Exception -> 0x0446 }
            X.BZ7 r2 = (X.BZ7) r2     // Catch:{ Exception -> 0x0446 }
            X.Cbz r0 = r2.A05     // Catch:{ Exception -> 0x0446 }
            X.BZI r1 = new X.BZI     // Catch:{ Exception -> 0x0446 }
            r1.<init>(r4, r0)     // Catch:{ Exception -> 0x0446 }
            r0 = 2
            X.C26126Cso.A03(r2, r1, r0)     // Catch:{ Exception -> 0x0446 }
            goto L_0x02b3
        L_0x01c0:
            java.lang.String r0 = new java.lang.String     // Catch:{ Exception -> 0x0446 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0446 }
            goto L_0x01ac
        L_0x01c6:
            java.lang.String r0 = r11.substring(r2, r1)     // Catch:{ NumberFormatException -> 0x0289 }
            long r2 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0289 }
            java.lang.String r0 = X.BE6.A0p(r1, r11)     // Catch:{ NumberFormatException -> 0x0289 }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0289 }
            r14 = 0
            int r11 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r11 < 0) goto L_0x0273
            int r11 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r11 < 0) goto L_0x0273
            X.Bf0 r11 = X.C23312Bf0.zzbiv     // Catch:{ Exception -> 0x0446 }
            r10 = 5
            java.lang.Object r11 = r11.A04(r10)     // Catch:{ Exception -> 0x0446 }
            X.Bei r11 = (X.C23294Bei) r11     // Catch:{ Exception -> 0x0446 }
            X.Bew r11 = (X.C23308Bew) r11     // Catch:{ Exception -> 0x0446 }
            r11.A01()     // Catch:{ Exception -> 0x0446 }
            X.Beh r12 = r11.A00     // Catch:{ Exception -> 0x0446 }
            X.Bf0 r12 = (X.C23312Bf0) r12     // Catch:{ Exception -> 0x0446 }
            if (r13 == 0) goto L_0x02c4
            int r10 = r12.zzbb     // Catch:{ Exception -> 0x0446 }
            r10 = r10 | 2
            r12.zzbb = r10     // Catch:{ Exception -> 0x0446 }
            r12.zzbis = r13     // Catch:{ Exception -> 0x0446 }
            r11.A01()     // Catch:{ Exception -> 0x0446 }
            X.Beh r12 = r11.A00     // Catch:{ Exception -> 0x0446 }
            X.Bf0 r12 = (X.C23312Bf0) r12     // Catch:{ Exception -> 0x0446 }
            int r10 = r12.zzbb     // Catch:{ Exception -> 0x0446 }
            r10 = r10 | 4
            r12.zzbb = r10     // Catch:{ Exception -> 0x0446 }
            r12.zzbit = r2     // Catch:{ Exception -> 0x0446 }
            r11.A01()     // Catch:{ Exception -> 0x0446 }
            X.Beh r3 = r11.A00     // Catch:{ Exception -> 0x0446 }
            X.Bf0 r3 = (X.C23312Bf0) r3     // Catch:{ Exception -> 0x0446 }
            int r2 = r3.zzbb     // Catch:{ Exception -> 0x0446 }
            r2 = r2 | 8
            r3.zzbb = r2     // Catch:{ Exception -> 0x0446 }
            r3.zzbiu = r0     // Catch:{ Exception -> 0x0446 }
            X.Beh r3 = r11.A00()     // Catch:{ Exception -> 0x0446 }
            java.lang.Object r0 = r3.A04(r8)     // Catch:{ Exception -> 0x0446 }
            java.lang.Byte r0 = (java.lang.Byte) r0     // Catch:{ Exception -> 0x0446 }
            byte r0 = r0.byteValue()     // Catch:{ Exception -> 0x0446 }
            if (r0 == r8) goto L_0x023a
            if (r0 == 0) goto L_0x02c9
            X.EAC r0 = X.BE9.A0R(r3)     // Catch:{ Exception -> 0x0446 }
            boolean r1 = r0.CTk(r3)     // Catch:{ Exception -> 0x0446 }
            r0 = 2
            r3.A04(r0)     // Catch:{ Exception -> 0x0446 }
            if (r1 == 0) goto L_0x02c9
        L_0x023a:
            X.Bf0 r3 = (X.C23312Bf0) r3     // Catch:{ Exception -> 0x0446 }
            if (r3 == 0) goto L_0x01af
            java.lang.String r2 = r3.zzbis     // Catch:{ Exception -> 0x0446 }
            long r0 = X.C26887DHu.A00(r9)     // Catch:{ Exception -> 0x0446 }
            long r16 = X.C26887DHu.A01(r2, r0)     // Catch:{ Exception -> 0x0446 }
            long r1 = r3.zzbit     // Catch:{ Exception -> 0x0446 }
            long r8 = r3.zzbiu     // Catch:{ Exception -> 0x0446 }
            int r0 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x01af
            int r0 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x01af
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x025b
            long r16 = r16 % r8
            goto L_0x026d
        L_0x025b:
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r12 = r14 % r8
            r10 = 1
            long r12 = r12 + r10
            long r16 = r16 & r14
            long r16 = r16 % r8
            long r12 = r12 + r16
            long r16 = r12 % r8
        L_0x026d:
            int r0 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x02b4
            goto L_0x01af
        L_0x0273:
            r7 = 72
            java.lang.StringBuilder r8 = X.BE6.A0t(r7)     // Catch:{ Exception -> 0x0446 }
            java.lang.String r7 = "negative values not supported: "
            r8.append(r7)     // Catch:{ Exception -> 0x0446 }
            r8.append(r2)     // Catch:{ Exception -> 0x0446 }
            java.lang.String r2 = "/"
            java.lang.String r0 = X.C17890vO.A0a(r2, r8, r0)     // Catch:{ Exception -> 0x0446 }
            goto L_0x01ac
        L_0x0289:
            r3 = move-exception
            java.lang.String r2 = java.lang.String.valueOf(r11)     // Catch:{ Exception -> 0x0446 }
            int r0 = r2.length()     // Catch:{ Exception -> 0x0446 }
            java.lang.String r1 = "parseLong() failed while parsing: "
            if (r0 == 0) goto L_0x029f
            java.lang.String r0 = r1.concat(r2)     // Catch:{ Exception -> 0x0446 }
        L_0x029a:
            android.util.Log.e(r10, r0, r3)     // Catch:{ Exception -> 0x0446 }
            goto L_0x01af
        L_0x029f:
            java.lang.String r0 = new java.lang.String     // Catch:{ Exception -> 0x0446 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0446 }
            goto L_0x029a
        L_0x02a5:
            java.lang.String r13 = ""
            goto L_0x0192
        L_0x02a9:
            if (r1 < 0) goto L_0x01af
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0446 }
            if (r3 == 0) goto L_0x01af
            goto L_0x0143
        L_0x02b3:
            return
        L_0x02b4:
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.A08     // Catch:{ Exception -> 0x0446 }
            java.lang.String r0 = "Result must not be null"
            X.C18210vx.A02(r1, r0)     // Catch:{ Exception -> 0x0446 }
            X.BZJ r0 = new X.BZJ     // Catch:{ Exception -> 0x0446 }
            r0.<init>(r7)     // Catch:{ Exception -> 0x0446 }
            r0.A06(r1)     // Catch:{ Exception -> 0x0446 }
            return
        L_0x02c4:
            java.lang.NullPointerException r0 = X.BE6.A0m()     // Catch:{ Exception -> 0x0446 }
            goto L_0x02ce
        L_0x02c9:
            X.DZv r0 = new X.DZv     // Catch:{ Exception -> 0x0446 }
            r0.<init>()     // Catch:{ Exception -> 0x0446 }
        L_0x02ce:
            throw r0     // Catch:{ Exception -> 0x0446 }
        L_0x02cf:
            X.Bhi r1 = X.C23478Bhi.zzi     // Catch:{ Exception -> 0x0446 }
            r0 = 5
            java.lang.Object r4 = r1.A06(r0)     // Catch:{ Exception -> 0x0446 }
            X.BhY r4 = (X.C23469BhY) r4     // Catch:{ Exception -> 0x0446 }
            X.BhX r4 = (X.C23468BhX) r4     // Catch:{ Exception -> 0x0446 }
            X.Cp9 r9 = X.C25943Cp9.A03     // Catch:{ Exception -> 0x043d }
            if (r9 != 0) goto L_0x03dc
            java.lang.Class<X.Cp9> r2 = X.C25943Cp9.class
            monitor-enter(r2)     // Catch:{ Exception -> 0x043d }
            X.Cp9 r9 = X.C25943Cp9.A03     // Catch:{ all -> 0x03d9 }
            if (r9 != 0) goto L_0x039d
            java.lang.Class<X.Cf6> r10 = X.C25404Cf6.class
            java.lang.ClassLoader r9 = r10.getClassLoader()     // Catch:{ all -> 0x03d9 }
            boolean r0 = r2.equals(r2)     // Catch:{ all -> 0x03d9 }
            if (r0 == 0) goto L_0x02f4
            java.lang.String r0 = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader"
            goto L_0x031c
        L_0x02f4:
            java.lang.Package r1 = r2.getPackage()     // Catch:{ all -> 0x03d9 }
            java.lang.Package r0 = r10.getPackage()     // Catch:{ all -> 0x03d9 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x03d9 }
            if (r0 == 0) goto L_0x03d0
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1b()     // Catch:{ all -> 0x03d9 }
            java.lang.Package r0 = r2.getPackage()     // Catch:{ all -> 0x03d9 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x03d9 }
            r1[r5] = r0     // Catch:{ all -> 0x03d9 }
            java.lang.String r0 = r2.getSimpleName()     // Catch:{ all -> 0x03d9 }
            r1[r6] = r0     // Catch:{ all -> 0x03d9 }
            java.lang.String r0 = "%s.BlazeGenerated%sLoader"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ all -> 0x03d9 }
        L_0x031c:
            java.lang.Class r1 = java.lang.Class.forName(r0, r6, r9)     // Catch:{ ClassNotFoundException -> 0x034c }
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch:{ NoSuchMethodException -> 0x033e, InstantiationException -> 0x0337, IllegalAccessException -> 0x0345, InvocationTargetException -> 0x0330 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x033e, InstantiationException -> 0x0337, IllegalAccessException -> 0x0345, InvocationTargetException -> 0x0330 }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ NoSuchMethodException -> 0x033e, InstantiationException -> 0x0337, IllegalAccessException -> 0x0345, InvocationTargetException -> 0x0330 }
            r1.newInstance(r0)     // Catch:{ NoSuchMethodException -> 0x033e, InstantiationException -> 0x0337, IllegalAccessException -> 0x0345, InvocationTargetException -> 0x0330 }
            java.lang.NullPointerException r0 = X.BE7.A0a()     // Catch:{ ClassNotFoundException -> 0x034c }
            throw r0     // Catch:{ ClassNotFoundException -> 0x034c }
        L_0x0330:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ ClassNotFoundException -> 0x034c }
            r1.<init>(r0)     // Catch:{ ClassNotFoundException -> 0x034c }
            goto L_0x034b
        L_0x0337:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ ClassNotFoundException -> 0x034c }
            r1.<init>(r0)     // Catch:{ ClassNotFoundException -> 0x034c }
            goto L_0x034b
        L_0x033e:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ ClassNotFoundException -> 0x034c }
            r1.<init>(r0)     // Catch:{ ClassNotFoundException -> 0x034c }
            goto L_0x034b
        L_0x0345:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ ClassNotFoundException -> 0x034c }
            r1.<init>(r0)     // Catch:{ ClassNotFoundException -> 0x034c }
        L_0x034b:
            throw r1     // Catch:{ ClassNotFoundException -> 0x034c }
        L_0x034c:
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r10, r9)     // Catch:{ all -> 0x03d9 }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x03d9 }
            java.util.ArrayList r10 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x03d9 }
        L_0x0358:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x03d9 }
            if (r0 == 0) goto L_0x038f
            r11.next()     // Catch:{ ServiceConfigurationError -> 0x0366 }
            java.lang.NullPointerException r0 = X.BE7.A0a()     // Catch:{ ServiceConfigurationError -> 0x0366 }
            throw r0     // Catch:{ ServiceConfigurationError -> 0x0366 }
        L_0x0366:
            r17 = move-exception
            java.util.logging.Logger r12 = X.C25404Cf6.A00     // Catch:{ all -> 0x03d9 }
            java.util.logging.Level r13 = java.util.logging.Level.SEVERE     // Catch:{ all -> 0x03d9 }
            java.lang.String r0 = r2.getSimpleName()     // Catch:{ all -> 0x03d9 }
            java.lang.String r9 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x03d9 }
            int r0 = r9.length()     // Catch:{ all -> 0x03d9 }
            java.lang.String r1 = "Unable to load "
            if (r0 == 0) goto L_0x0389
            java.lang.String r0 = r1.concat(r9)     // Catch:{ all -> 0x03d9 }
        L_0x037f:
            java.lang.String r14 = "com.google.protobuf.GeneratedExtensionRegistryLoader"
            java.lang.String r15 = "load"
            r16 = r0
            r12.logp(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x03d9 }
            goto L_0x0358
        L_0x0389:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x03d9 }
            r0.<init>(r1)     // Catch:{ all -> 0x03d9 }
            goto L_0x037f
        L_0x038f:
            int r0 = r10.size()     // Catch:{ all -> 0x03d9 }
            if (r0 != r6) goto L_0x039f
            java.lang.Object r9 = r10.get(r5)     // Catch:{ all -> 0x03d9 }
            X.Cp9 r9 = (X.C25943Cp9) r9     // Catch:{ all -> 0x03d9 }
        L_0x039b:
            X.C25943Cp9.A03 = r9     // Catch:{ all -> 0x03d9 }
        L_0x039d:
            monitor-exit(r2)     // Catch:{ all -> 0x03d9 }
            goto L_0x03dc
        L_0x039f:
            int r0 = r10.size()     // Catch:{ all -> 0x03d9 }
            r9 = 0
            if (r0 == 0) goto L_0x039b
            java.lang.String r11 = "combine"
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ NoSuchMethodException -> 0x03c9, IllegalAccessException -> 0x03c2, InvocationTargetException -> 0x03bb }
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            java.lang.reflect.Method r1 = X.BE6.A0x(r2, r0, r11, r1, r5)     // Catch:{ NoSuchMethodException -> 0x03c9, IllegalAccessException -> 0x03c2, InvocationTargetException -> 0x03bb }
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ NoSuchMethodException -> 0x03c9, IllegalAccessException -> 0x03c2, InvocationTargetException -> 0x03bb }
            r0[r5] = r10     // Catch:{ NoSuchMethodException -> 0x03c9, IllegalAccessException -> 0x03c2, InvocationTargetException -> 0x03bb }
            java.lang.Object r9 = r1.invoke(r9, r0)     // Catch:{ NoSuchMethodException -> 0x03c9, IllegalAccessException -> 0x03c2, InvocationTargetException -> 0x03bb }
            X.Cp9 r9 = (X.C25943Cp9) r9     // Catch:{ NoSuchMethodException -> 0x03c9, IllegalAccessException -> 0x03c2, InvocationTargetException -> 0x03bb }
            goto L_0x039b
        L_0x03bb:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x03d9 }
            r1.<init>(r0)     // Catch:{ all -> 0x03d9 }
            goto L_0x03d8
        L_0x03c2:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x03d9 }
            r1.<init>(r0)     // Catch:{ all -> 0x03d9 }
            goto L_0x03d8
        L_0x03c9:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x03d9 }
            r1.<init>(r0)     // Catch:{ all -> 0x03d9 }
            goto L_0x03d8
        L_0x03d0:
            java.lang.String r0 = r2.getName()     // Catch:{ all -> 0x03d9 }
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0k(r0)     // Catch:{ all -> 0x03d9 }
        L_0x03d8:
            throw r1     // Catch:{ all -> 0x03d9 }
        L_0x03d9:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x03d9 }
            goto L_0x0432
        L_0x03dc:
            boolean r0 = r4.A01     // Catch:{ Exception -> 0x043d }
            if (r0 == 0) goto L_0x03fa
            X.Bho r1 = r4.A00     // Catch:{ Exception -> 0x043d }
            r0 = 4
            java.lang.Object r2 = r1.A06(r0)     // Catch:{ Exception -> 0x043d }
            X.Bho r2 = (X.C23484Bho) r2     // Catch:{ Exception -> 0x043d }
            X.Bho r1 = r4.A00     // Catch:{ Exception -> 0x043d }
            java.lang.Class r0 = r2.getClass()     // Catch:{ Exception -> 0x043d }
            X.EAD r0 = r8.A00(r0)     // Catch:{ Exception -> 0x043d }
            r0.CTK(r2, r1)     // Catch:{ Exception -> 0x043d }
            r4.A00 = r2     // Catch:{ Exception -> 0x043d }
            r4.A01 = r5     // Catch:{ Exception -> 0x043d }
        L_0x03fa:
            X.Bho r0 = r4.A00     // Catch:{ BxG -> 0x0433, IndexOutOfBoundsException -> 0x0435, IOException -> 0x042b }
            java.lang.Class r0 = r0.getClass()     // Catch:{ BxG -> 0x0433, IndexOutOfBoundsException -> 0x0435, IOException -> 0x042b }
            X.EAD r8 = r8.A00(r0)     // Catch:{ BxG -> 0x0433, IndexOutOfBoundsException -> 0x0435, IOException -> 0x042b }
            X.Bho r1 = r4.A00     // Catch:{ BxG -> 0x0433, IndexOutOfBoundsException -> 0x0435, IOException -> 0x042b }
            X.CiB r0 = new X.CiB     // Catch:{ BxG -> 0x0433, IndexOutOfBoundsException -> 0x0435, IOException -> 0x042b }
            r0.<init>(r9)     // Catch:{ BxG -> 0x0433, IndexOutOfBoundsException -> 0x0435, IOException -> 0x042b }
            r9 = r0
            r10 = r1
            r11 = r3
            r12 = r5
            r13 = r7
            r8.CT8(r9, r10, r11, r12, r13)     // Catch:{ BxG -> 0x0433, IndexOutOfBoundsException -> 0x0435, IOException -> 0x042b }
            java.lang.String r3 = "Would have logged:\n%s"
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x043d }
            X.BE6.A1H(r4, r2, r5)     // Catch:{ Exception -> 0x043d }
            r0 = 6
            java.lang.String r1 = "Vision"
            boolean r0 = android.util.Log.isLoggable(r1, r0)     // Catch:{ Exception -> 0x043d }
            if (r0 == 0) goto L_0x04b8
            java.lang.String r0 = java.lang.String.format(r3, r2)     // Catch:{ Exception -> 0x043d }
            android.util.Log.e(r1, r0)     // Catch:{ Exception -> 0x043d }
            return
        L_0x042b:
            r1 = move-exception
            java.lang.String r0 = "Reading from byte array should not throw IOException."
            java.lang.RuntimeException r0 = X.BE6.A0o(r0, r1)     // Catch:{ Exception -> 0x043d }
        L_0x0432:
            throw r0     // Catch:{ Exception -> 0x043d }
        L_0x0433:
            r1 = move-exception
            goto L_0x043c
        L_0x0435:
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.BxG r1 = new X.BxG     // Catch:{ Exception -> 0x043d }
            r1.<init>(r0)     // Catch:{ Exception -> 0x043d }
        L_0x043c:
            throw r1     // Catch:{ Exception -> 0x043d }
        L_0x043d:
            r2 = move-exception
            java.lang.String r1 = "Parsing error"
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0446 }
            X.CBL.A00(r1, r2, r0)     // Catch:{ Exception -> 0x0446 }
            return
        L_0x0446:
            r6 = move-exception
            X.C3o r1 = X.CFC.A00
            boolean r0 = r1 instanceof X.C23445BhA
            if (r0 != 0) goto L_0x0496
            boolean r0 = r1 instanceof X.C23446BhB
            if (r0 == 0) goto L_0x0496
            X.BhB r1 = (X.C23446BhB) r1
            r6.printStackTrace()
            X.CNu r3 = r1.A00
            java.lang.ref.ReferenceQueue r2 = r3.A00
        L_0x045a:
            java.lang.ref.Reference r1 = r2.poll()
            if (r1 == 0) goto L_0x0466
            java.util.concurrent.ConcurrentHashMap r0 = r3.A01
            r0.remove(r1)
            goto L_0x045a
        L_0x0466:
            X.Dan r1 = new X.Dan
            r1.<init>(r6)
            java.util.concurrent.ConcurrentHashMap r0 = r3.A01
            java.lang.Object r4 = r0.get(r1)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x0499
            monitor-enter(r4)
            java.util.Iterator r3 = r4.iterator()     // Catch:{ all -> 0x0493 }
        L_0x047a:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0493 }
            if (r0 == 0) goto L_0x0491
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0493 }
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch:{ all -> 0x0493 }
            java.io.PrintStream r1 = java.lang.System.err     // Catch:{ all -> 0x0493 }
            java.lang.String r0 = "Suppressed: "
            r1.print(r0)     // Catch:{ all -> 0x0493 }
            r2.printStackTrace()     // Catch:{ all -> 0x0493 }
            goto L_0x047a
        L_0x0491:
            monitor-exit(r4)     // Catch:{ all -> 0x0493 }
            goto L_0x0499
        L_0x0493:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0493 }
            throw r0
        L_0x0496:
            r6.printStackTrace()
        L_0x0499:
            java.lang.String r1 = "Failed to log"
            java.lang.Object[] r0 = new java.lang.Object[r5]
            X.CBL.A00(r1, r6, r0)
            return
        L_0x04a1:
            java.lang.Object[] r3 = new java.lang.Object[r6]
            X.C17880vN.A1T(r3, r2, r5)
            java.lang.String r2 = "Illegal event code: %d"
            r0 = 4
            java.lang.String r1 = "Vision"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L_0x04b8
            java.lang.String r0 = java.lang.String.format(r2, r3)
            android.util.Log.i(r1, r0)
        L_0x04b8:
            return
        L_0x04b9:
            java.lang.String r0 = "Did not write as much data as expected."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ IOException -> 0x04c0 }
            throw r0     // Catch:{ IOException -> 0x04c0 }
        L_0x04c0:
            r4 = move-exception
            java.lang.String r3 = X.C17890vO.A0U(r5)
            int r0 = X.BE8.A0C(r3)
            int r1 = r0 + 62
            java.lang.String r2 = "byte array"
            int r0 = r2.length()
            java.lang.StringBuilder r1 = X.BE7.A0q(r1, r0)
            java.lang.String r0 = "Serializing "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " to a "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " threw an IOException (should never happen)."
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.RuntimeException r0 = X.BE6.A0o(r0, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.vision.clearcut.VisionClearcutLogger.zza(int, X.Bhi):void");
    }

    public VisionClearcutLogger(Context context) {
        this.zza = new C25607Cin(context);
    }
}
