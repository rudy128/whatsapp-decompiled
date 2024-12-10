package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass8BR;
import X.BE6;
import X.BE9;
import X.BEA;
import X.C17880vN;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

public final class zzkh implements zzkr {
    public static final int[] zza = new int[0];
    public static final Unsafe zzb = zzlv.zzg();
    public final int[] zzc;
    public final Object[] zzd;
    public final int zze;
    public final int zzf;
    public final zzke zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final int[] zzj;
    public final int zzk;
    public final int zzl;
    public final zzjs zzm;
    public final zzll zzn;
    public final zzif zzo;
    public final zzkk zzp;
    public final zzjz zzq;

    public static int zzt(int i) {
        return (i >>> 20) & 255;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006f, code lost:
        r2 = java.lang.Double.doubleToLongBits(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c0, code lost:
        r0 = com.google.android.recaptcha.internal.zzjc.zza;
        r0 = 1237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c4, code lost:
        if (r1 == false) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c6, code lost:
        r0 = 1231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cf, code lost:
        r5 = r5 * 53;
        r0 = ((java.lang.String) com.google.android.recaptcha.internal.zzlv.zzf(r9, r1)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x010c, code lost:
        r5 = r5 * 53;
        r0 = X.AnonymousClass000.A0M(com.google.android.recaptcha.internal.zzlv.zzf(r9, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x011d, code lost:
        r5 = r5 * 53;
        r2 = X.C17880vN.A05(com.google.android.recaptcha.internal.zzlv.zzf(r9, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0127, code lost:
        r0 = com.google.android.recaptcha.internal.zzjc.zza;
        r0 = (int) (r2 ^ (r2 >>> 32));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0134, code lost:
        r5 = r5 * 53;
        r0 = com.google.android.recaptcha.internal.zzlv.zzf(r9, r1).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x013e, code lost:
        r5 = r5 + r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(java.lang.Object r9) {
        /*
            r8 = this;
            r4 = 0
            r5 = 0
        L_0x0002:
            int[] r2 = r8.zzc
            int r0 = r2.length
            if (r4 >= r0) goto L_0x0141
            int r0 = r4 + 1
            r0 = r2[r0]
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            int r0 = r0 >>> 20
            r7 = r0 & 255(0xff, float:3.57E-43)
            r0 = r2[r4]
            long r1 = (long) r1
            r3 = 37
            r6 = 32
            switch(r7) {
                case 0: goto L_0x0020;
                case 1: goto L_0x0029;
                case 2: goto L_0x0049;
                case 3: goto L_0x0049;
                case 4: goto L_0x0041;
                case 5: goto L_0x0049;
                case 6: goto L_0x0041;
                case 7: goto L_0x0037;
                case 8: goto L_0x00cf;
                case 9: goto L_0x0051;
                case 10: goto L_0x0134;
                case 11: goto L_0x0041;
                case 12: goto L_0x0041;
                case 13: goto L_0x0041;
                case 14: goto L_0x0049;
                case 15: goto L_0x0041;
                case 16: goto L_0x0049;
                case 17: goto L_0x0051;
                case 18: goto L_0x0134;
                case 19: goto L_0x0134;
                case 20: goto L_0x0134;
                case 21: goto L_0x0134;
                case 22: goto L_0x0134;
                case 23: goto L_0x0134;
                case 24: goto L_0x0134;
                case 25: goto L_0x0134;
                case 26: goto L_0x0134;
                case 27: goto L_0x0134;
                case 28: goto L_0x0134;
                case 29: goto L_0x0134;
                case 30: goto L_0x0134;
                case 31: goto L_0x0134;
                case 32: goto L_0x0134;
                case 33: goto L_0x0134;
                case 34: goto L_0x0134;
                case 35: goto L_0x0134;
                case 36: goto L_0x0134;
                case 37: goto L_0x0134;
                case 38: goto L_0x0134;
                case 39: goto L_0x0134;
                case 40: goto L_0x0134;
                case 41: goto L_0x0134;
                case 42: goto L_0x0134;
                case 43: goto L_0x0134;
                case 44: goto L_0x0134;
                case 45: goto L_0x0134;
                case 46: goto L_0x0134;
                case 47: goto L_0x0134;
                case 48: goto L_0x0134;
                case 49: goto L_0x0134;
                case 50: goto L_0x0134;
                case 51: goto L_0x005f;
                case 52: goto L_0x0075;
                case 53: goto L_0x008b;
                case 54: goto L_0x0093;
                case 55: goto L_0x009b;
                case 56: goto L_0x00a2;
                case 57: goto L_0x00a9;
                case 58: goto L_0x00b0;
                case 59: goto L_0x00c9;
                case 60: goto L_0x00dc;
                case 61: goto L_0x00e3;
                case 62: goto L_0x00ea;
                case 63: goto L_0x00f1;
                case 64: goto L_0x00f8;
                case 65: goto L_0x00ff;
                case 66: goto L_0x0106;
                case 67: goto L_0x0117;
                case 68: goto L_0x012e;
                default: goto L_0x001d;
            }
        L_0x001d:
            int r4 = r4 + 3
            goto L_0x0002
        L_0x0020:
            int r5 = r5 * 53
            com.google.android.recaptcha.internal.zzlu r0 = com.google.android.recaptcha.internal.zzlv.zzf
            double r0 = r0.zza(r9, r1)
            goto L_0x006f
        L_0x0029:
            int r5 = r5 * 53
            com.google.android.recaptcha.internal.zzlu r0 = com.google.android.recaptcha.internal.zzlv.zzf
            float r0 = r0.zzb(r9, r1)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x013e
        L_0x0037:
            int r5 = r5 * 53
            com.google.android.recaptcha.internal.zzlu r0 = com.google.android.recaptcha.internal.zzlv.zzf
            boolean r1 = r0.zzg(r9, r1)
            goto L_0x00c0
        L_0x0041:
            int r5 = r5 * 53
            int r0 = com.google.android.recaptcha.internal.zzlv.zzc(r9, r1)
            goto L_0x013e
        L_0x0049:
            int r5 = r5 * 53
            long r2 = com.google.android.recaptcha.internal.zzlv.zzd(r9, r1)
            goto L_0x0127
        L_0x0051:
            int r5 = r5 * 53
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r9, r1)
            if (r0 == 0) goto L_0x005d
            int r3 = r0.hashCode()
        L_0x005d:
            int r5 = r5 + r3
            goto L_0x001d
        L_0x005f:
            boolean r0 = r8.zzR(r9, r0, r4)
            if (r0 == 0) goto L_0x001d
            int r5 = r5 * 53
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r9, r1)
            double r0 = X.AnonymousClass8BR.A00(r0)
        L_0x006f:
            long r2 = java.lang.Double.doubleToLongBits(r0)
            goto L_0x0127
        L_0x0075:
            boolean r0 = r8.zzR(r9, r0, r4)
            if (r0 == 0) goto L_0x001d
            int r5 = r5 * 53
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r9, r1)
            float r0 = X.AnonymousClass000.A04(r0)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x013e
        L_0x008b:
            boolean r0 = r8.zzR(r9, r0, r4)
            if (r0 == 0) goto L_0x001d
            goto L_0x011d
        L_0x0093:
            boolean r0 = r8.zzR(r9, r0, r4)
            if (r0 == 0) goto L_0x001d
            goto L_0x011d
        L_0x009b:
            boolean r0 = r8.zzR(r9, r0, r4)
            if (r0 == 0) goto L_0x001d
            goto L_0x010c
        L_0x00a2:
            boolean r0 = r8.zzR(r9, r0, r4)
            if (r0 == 0) goto L_0x001d
            goto L_0x011d
        L_0x00a9:
            boolean r0 = r8.zzR(r9, r0, r4)
            if (r0 == 0) goto L_0x001d
            goto L_0x010c
        L_0x00b0:
            boolean r0 = r8.zzR(r9, r0, r4)
            if (r0 == 0) goto L_0x001d
            int r5 = r5 * 53
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r9, r1)
            boolean r1 = X.AnonymousClass000.A1Y(r0)
        L_0x00c0:
            java.nio.charset.Charset r0 = com.google.android.recaptcha.internal.zzjc.zza
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L_0x013e
            r0 = 1231(0x4cf, float:1.725E-42)
            goto L_0x013e
        L_0x00c9:
            boolean r0 = r8.zzR(r9, r0, r4)
            if (r0 == 0) goto L_0x001d
        L_0x00cf:
            int r5 = r5 * 53
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r9, r1)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.hashCode()
            goto L_0x013e
        L_0x00dc:
            boolean r0 = r8.zzR(r9, r0, r4)
            if (r0 == 0) goto L_0x001d
            goto L_0x0134
        L_0x00e3:
            boolean r0 = r8.zzR(r9, r0, r4)
            if (r0 == 0) goto L_0x001d
            goto L_0x0134
        L_0x00ea:
            boolean r0 = r8.zzR(r9, r0, r4)
            if (r0 == 0) goto L_0x001d
            goto L_0x010c
        L_0x00f1:
            boolean r0 = r8.zzR(r9, r0, r4)
            if (r0 == 0) goto L_0x001d
            goto L_0x010c
        L_0x00f8:
            boolean r0 = r8.zzR(r9, r0, r4)
            if (r0 == 0) goto L_0x001d
            goto L_0x010c
        L_0x00ff:
            boolean r0 = r8.zzR(r9, r0, r4)
            if (r0 == 0) goto L_0x001d
            goto L_0x011d
        L_0x0106:
            boolean r0 = r8.zzR(r9, r0, r4)
            if (r0 == 0) goto L_0x001d
        L_0x010c:
            int r5 = r5 * 53
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r9, r1)
            int r0 = X.AnonymousClass000.A0M(r0)
            goto L_0x013e
        L_0x0117:
            boolean r0 = r8.zzR(r9, r0, r4)
            if (r0 == 0) goto L_0x001d
        L_0x011d:
            int r5 = r5 * 53
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r9, r1)
            long r2 = X.C17880vN.A05(r0)
        L_0x0127:
            java.nio.charset.Charset r0 = com.google.android.recaptcha.internal.zzjc.zza
            long r0 = r2 >>> r6
            long r2 = r2 ^ r0
            int r0 = (int) r2
            goto L_0x013e
        L_0x012e:
            boolean r0 = r8.zzR(r9, r0, r4)
            if (r0 == 0) goto L_0x001d
        L_0x0134:
            int r5 = r5 * 53
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r9, r1)
            int r0 = r0.hashCode()
        L_0x013e:
            int r5 = r5 + r0
            goto L_0x001d
        L_0x0141:
            int r1 = r5 * 53
            r0 = r9
            com.google.android.recaptcha.internal.zzit r0 = (com.google.android.recaptcha.internal.zzit) r0
            com.google.android.recaptcha.internal.zzlm r0 = r0.zzc
            int r1 = X.AnonymousClass000.A0O(r0, r1)
            boolean r0 = r8.zzh
            if (r0 == 0) goto L_0x015c
            int r1 = r1 * 53
            com.google.android.recaptcha.internal.zzip r9 = (com.google.android.recaptcha.internal.zzip) r9
            com.google.android.recaptcha.internal.zzij r0 = r9.zzb
            com.google.android.recaptcha.internal.zzle r0 = r0.zza
            int r1 = X.AnonymousClass000.A0O(r0, r1)
        L_0x015c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zzb(java.lang.Object):int");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void zzh(java.lang.Object r23, com.google.android.recaptcha.internal.zzkq r24, com.google.android.recaptcha.internal.zzie r25) {
        /*
            r22 = this;
            r6 = 0
            r11 = r25
            if (r25 == 0) goto L_0x04dd
            r8 = r23
            zzD(r8)
            r15 = r22
            com.google.android.recaptcha.internal.zzll r14 = r15.zzn
            com.google.android.recaptcha.internal.zzif r7 = r15.zzo
            r12 = r6
            r13 = r6
        L_0x0012:
            r9 = r24
            int r3 = r9.zzc()     // Catch:{ all -> 0x04c2 }
            int r2 = r15.zzq(r3)     // Catch:{ all -> 0x04c2 }
            if (r2 >= 0) goto L_0x0062
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r3 != r0) goto L_0x003b
            int r1 = r15.zzk
        L_0x0025:
            int r0 = r15.zzl
            if (r1 >= r0) goto L_0x04bc
            int[] r0 = r15.zzj
            r17 = r0[r1]
            r20 = r8
            r16 = r8
            r18 = r13
            r19 = r14
            r15.zzy(r16, r17, r18, r19, r20)
            int r1 = r1 + 1
            goto L_0x0025
        L_0x003b:
            boolean r0 = r15.zzh     // Catch:{ all -> 0x04c2 }
            if (r0 == 0) goto L_0x0054
            com.google.android.recaptcha.internal.zzke r0 = r15.zzg     // Catch:{ all -> 0x04c2 }
            com.google.android.recaptcha.internal.zzir r10 = r11.zza(r0, r3)     // Catch:{ all -> 0x04c2 }
            if (r10 == 0) goto L_0x0054
            if (r12 != 0) goto L_0x0050
            r0 = r8
            com.google.android.recaptcha.internal.zzip r0 = (com.google.android.recaptcha.internal.zzip) r0     // Catch:{ all -> 0x04c2 }
            com.google.android.recaptcha.internal.zzij r12 = r0.zzi()     // Catch:{ all -> 0x04c2 }
        L_0x0050:
            r7.zze(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x04c2 }
            goto L_0x0012
        L_0x0054:
            if (r13 != 0) goto L_0x005a
            java.lang.Object r13 = r14.zzc(r8)     // Catch:{ all -> 0x04c2 }
        L_0x005a:
            boolean r0 = r14.zzr(r13, r9)     // Catch:{ all -> 0x04c2 }
            if (r0 != 0) goto L_0x0012
            goto L_0x0474
        L_0x0062:
            int[] r1 = r15.zzc     // Catch:{ all -> 0x04c2 }
            int r0 = r2 + 1
            r0 = r1[r0]     // Catch:{ all -> 0x04c2 }
            int r1 = r0 >>> 20
            r1 = r1 & 255(0xff, float:3.57E-43)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            switch(r1) {
                case 0: goto L_0x0091;
                case 1: goto L_0x009f;
                case 2: goto L_0x00ad;
                case 3: goto L_0x00bb;
                case 4: goto L_0x00c9;
                case 5: goto L_0x00d7;
                case 6: goto L_0x00e5;
                case 7: goto L_0x00f3;
                case 8: goto L_0x0101;
                case 9: goto L_0x0109;
                case 10: goto L_0x011b;
                case 11: goto L_0x0129;
                case 12: goto L_0x0137;
                case 13: goto L_0x0157;
                case 14: goto L_0x0165;
                case 15: goto L_0x0173;
                case 16: goto L_0x0181;
                case 17: goto L_0x018f;
                case 18: goto L_0x01a1;
                case 19: goto L_0x01aa;
                case 20: goto L_0x01b3;
                case 21: goto L_0x01bc;
                case 22: goto L_0x01c5;
                case 23: goto L_0x01ce;
                case 24: goto L_0x01d7;
                case 25: goto L_0x01e0;
                case 26: goto L_0x01e9;
                case 27: goto L_0x0209;
                case 28: goto L_0x021a;
                case 29: goto L_0x0223;
                case 30: goto L_0x022c;
                case 31: goto L_0x0247;
                case 32: goto L_0x0250;
                case 33: goto L_0x0259;
                case 34: goto L_0x0262;
                case 35: goto L_0x026b;
                case 36: goto L_0x0274;
                case 37: goto L_0x027d;
                case 38: goto L_0x0286;
                case 39: goto L_0x028f;
                case 40: goto L_0x0298;
                case 41: goto L_0x02a1;
                case 42: goto L_0x02aa;
                case 43: goto L_0x02b3;
                case 44: goto L_0x02bc;
                case 45: goto L_0x02d7;
                case 46: goto L_0x02e0;
                case 47: goto L_0x02e9;
                case 48: goto L_0x02f2;
                case 49: goto L_0x02fb;
                case 50: goto L_0x0442;
                case 51: goto L_0x030c;
                case 52: goto L_0x031e;
                case 53: goto L_0x0330;
                case 54: goto L_0x0342;
                case 55: goto L_0x0354;
                case 56: goto L_0x0366;
                case 57: goto L_0x0378;
                case 58: goto L_0x038a;
                case 59: goto L_0x039c;
                case 60: goto L_0x03a4;
                case 61: goto L_0x03b6;
                case 62: goto L_0x03c4;
                case 63: goto L_0x03d6;
                case 64: goto L_0x03fa;
                case 65: goto L_0x040c;
                case 66: goto L_0x041e;
                case 67: goto L_0x0430;
                case 68: goto L_0x0080;
                default: goto L_0x0072;
            }     // Catch:{ all -> 0x04c2 }
        L_0x0072:
            if (r13 != 0) goto L_0x0078
            java.lang.Object r13 = r14.zzc(r8)     // Catch:{ zzjd -> 0x0467 }
        L_0x0078:
            boolean r0 = r14.zzr(r13, r9)     // Catch:{ zzjd -> 0x0467 }
            if (r0 != 0) goto L_0x0012
            goto L_0x048c
        L_0x0080:
            java.lang.Object r1 = r15.zzB(r8, r3, r2)     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzke r1 = (com.google.android.recaptcha.internal.zzke) r1     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzkr r0 = r15.zzx(r2)     // Catch:{ zzjd -> 0x0467 }
            r9.zzt(r1, r0, r11)     // Catch:{ zzjd -> 0x0467 }
            r15.zzK(r8, r3, r2, r1)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x0091:
            r0 = r0 & r5
            double r3 = r9.zza()     // Catch:{ zzjd -> 0x0467 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzlv.zzo(r8, r0, r3)     // Catch:{ zzjd -> 0x0467 }
            r15.zzH(r8, r2)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x009f:
            r0 = r0 & r5
            float r3 = r9.zzb()     // Catch:{ zzjd -> 0x0467 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzlv.zzp(r8, r0, r3)     // Catch:{ zzjd -> 0x0467 }
            r15.zzH(r8, r2)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x00ad:
            r0 = r0 & r5
            long r3 = r9.zzl()     // Catch:{ zzjd -> 0x0467 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzlv.zzr(r8, r0, r3)     // Catch:{ zzjd -> 0x0467 }
            r15.zzH(r8, r2)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x00bb:
            r0 = r0 & r5
            long r3 = r9.zzo()     // Catch:{ zzjd -> 0x0467 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzlv.zzr(r8, r0, r3)     // Catch:{ zzjd -> 0x0467 }
            r15.zzH(r8, r2)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x00c9:
            r0 = r0 & r5
            int r3 = r9.zzg()     // Catch:{ zzjd -> 0x0467 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzlv.zzq(r8, r0, r3)     // Catch:{ zzjd -> 0x0467 }
            r15.zzH(r8, r2)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x00d7:
            r0 = r0 & r5
            long r3 = r9.zzk()     // Catch:{ zzjd -> 0x0467 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzlv.zzr(r8, r0, r3)     // Catch:{ zzjd -> 0x0467 }
            r15.zzH(r8, r2)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x00e5:
            r0 = r0 & r5
            int r3 = r9.zzf()     // Catch:{ zzjd -> 0x0467 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzlv.zzq(r8, r0, r3)     // Catch:{ zzjd -> 0x0467 }
            r15.zzH(r8, r2)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x00f3:
            r0 = r0 & r5
            boolean r3 = r9.zzN()     // Catch:{ zzjd -> 0x0467 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzlv.zzm(r8, r0, r3)     // Catch:{ zzjd -> 0x0467 }
            r15.zzH(r8, r2)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x0101:
            r15.zzG(r8, r0, r9)     // Catch:{ zzjd -> 0x0467 }
            r15.zzH(r8, r2)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x0109:
            java.lang.Object r1 = r15.zzA(r8, r2)     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzke r1 = (com.google.android.recaptcha.internal.zzke) r1     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzkr r0 = r15.zzx(r2)     // Catch:{ zzjd -> 0x0467 }
            r9.zzu(r1, r0, r11)     // Catch:{ zzjd -> 0x0467 }
            r15.zzJ(r8, r2, r1)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x011b:
            r0 = r0 & r5
            com.google.android.recaptcha.internal.zzgw r3 = r9.zzp()     // Catch:{ zzjd -> 0x0467 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzlv.zzs(r8, r0, r3)     // Catch:{ zzjd -> 0x0467 }
            r15.zzH(r8, r2)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x0129:
            r0 = r0 & r5
            int r3 = r9.zzj()     // Catch:{ zzjd -> 0x0467 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzlv.zzq(r8, r0, r3)     // Catch:{ zzjd -> 0x0467 }
            r15.zzH(r8, r2)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x0137:
            int r4 = r9.zze()     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzix r1 = r15.zzw(r2)     // Catch:{ zzjd -> 0x0467 }
            if (r1 == 0) goto L_0x014d
            boolean r1 = r1.zza(r4)     // Catch:{ zzjd -> 0x0467 }
            if (r1 != 0) goto L_0x014d
            java.lang.Object r13 = com.google.android.recaptcha.internal.zzkt.zzp(r8, r3, r4, r13, r14)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x014d:
            r0 = r0 & r5
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzlv.zzq(r8, r0, r4)     // Catch:{ zzjd -> 0x0467 }
            r15.zzH(r8, r2)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x0157:
            r0 = r0 & r5
            int r3 = r9.zzh()     // Catch:{ zzjd -> 0x0467 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzlv.zzq(r8, r0, r3)     // Catch:{ zzjd -> 0x0467 }
            r15.zzH(r8, r2)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x0165:
            r0 = r0 & r5
            long r3 = r9.zzm()     // Catch:{ zzjd -> 0x0467 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzlv.zzr(r8, r0, r3)     // Catch:{ zzjd -> 0x0467 }
            r15.zzH(r8, r2)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x0173:
            r0 = r0 & r5
            int r3 = r9.zzi()     // Catch:{ zzjd -> 0x0467 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzlv.zzq(r8, r0, r3)     // Catch:{ zzjd -> 0x0467 }
            r15.zzH(r8, r2)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x0181:
            r0 = r0 & r5
            long r3 = r9.zzn()     // Catch:{ zzjd -> 0x0467 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzlv.zzr(r8, r0, r3)     // Catch:{ zzjd -> 0x0467 }
            r15.zzH(r8, r2)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x018f:
            java.lang.Object r1 = r15.zzA(r8, r2)     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzke r1 = (com.google.android.recaptcha.internal.zzke) r1     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzkr r0 = r15.zzx(r2)     // Catch:{ zzjd -> 0x0467 }
            r9.zzt(r1, r0, r11)     // Catch:{ zzjd -> 0x0467 }
            r15.zzJ(r8, r2, r1)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x01a1:
            java.util.List r0 = X.BE8.A0o(r15, r8, r0)     // Catch:{ zzjd -> 0x0467 }
            r9.zzx(r0)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x01aa:
            java.util.List r0 = X.BE8.A0o(r15, r8, r0)     // Catch:{ zzjd -> 0x0467 }
            r9.zzB(r0)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x01b3:
            java.util.List r0 = X.BE8.A0o(r15, r8, r0)     // Catch:{ zzjd -> 0x0467 }
            r9.zzE(r0)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x01bc:
            java.util.List r0 = X.BE8.A0o(r15, r8, r0)     // Catch:{ zzjd -> 0x0467 }
            r9.zzM(r0)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x01c5:
            java.util.List r0 = X.BE8.A0o(r15, r8, r0)     // Catch:{ zzjd -> 0x0467 }
            r9.zzD(r0)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x01ce:
            java.util.List r0 = X.BE8.A0o(r15, r8, r0)     // Catch:{ zzjd -> 0x0467 }
            r9.zzA(r0)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x01d7:
            java.util.List r0 = X.BE8.A0o(r15, r8, r0)     // Catch:{ zzjd -> 0x0467 }
            r9.zzz(r0)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x01e0:
            java.util.List r0 = X.BE8.A0o(r15, r8, r0)     // Catch:{ zzjd -> 0x0467 }
            r9.zzv(r0)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x01e9:
            boolean r1 = zzM(r0)     // Catch:{ zzjd -> 0x0467 }
            if (r1 == 0) goto L_0x01fc
            java.util.List r2 = X.BE8.A0o(r15, r8, r0)     // Catch:{ zzjd -> 0x0467 }
            r1 = r9
            com.google.android.recaptcha.internal.zzhd r1 = (com.google.android.recaptcha.internal.zzhd) r1     // Catch:{ zzjd -> 0x0467 }
            r0 = 1
            r1.zzK(r2, r0)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x01fc:
            java.util.List r2 = X.BE8.A0o(r15, r8, r0)     // Catch:{ zzjd -> 0x0467 }
            r1 = r9
            com.google.android.recaptcha.internal.zzhd r1 = (com.google.android.recaptcha.internal.zzhd) r1     // Catch:{ zzjd -> 0x0467 }
            r0 = 0
            r1.zzK(r2, r0)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x0209:
            com.google.android.recaptcha.internal.zzkr r3 = r15.zzx(r2)     // Catch:{ zzjd -> 0x0467 }
            r0 = r0 & r5
            com.google.android.recaptcha.internal.zzjs r2 = r15.zzm     // Catch:{ zzjd -> 0x0467 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0467 }
            java.util.List r0 = r2.zza(r8, r0)     // Catch:{ zzjd -> 0x0467 }
            r9.zzF(r0, r3, r11)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x021a:
            java.util.List r0 = X.BE8.A0o(r15, r8, r0)     // Catch:{ zzjd -> 0x0467 }
            r9.zzw(r0)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x0223:
            java.util.List r0 = X.BE8.A0o(r15, r8, r0)     // Catch:{ zzjd -> 0x0467 }
            r9.zzL(r0)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x022c:
            java.util.List r0 = X.BE8.A0o(r15, r8, r0)     // Catch:{ zzjd -> 0x0467 }
            r9.zzy(r0)     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzix r19 = r15.zzw(r2)     // Catch:{ zzjd -> 0x0467 }
            r16 = r8
            r17 = r3
            r18 = r0
            r20 = r13
            r21 = r14
            java.lang.Object r13 = com.google.android.recaptcha.internal.zzkt.zzo(r16, r17, r18, r19, r20, r21)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x0247:
            java.util.List r0 = X.BE8.A0o(r15, r8, r0)     // Catch:{ zzjd -> 0x0467 }
            r9.zzG(r0)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x0250:
            java.util.List r0 = X.BE8.A0o(r15, r8, r0)     // Catch:{ zzjd -> 0x0467 }
            r9.zzH(r0)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x0259:
            java.util.List r0 = X.BE8.A0o(r15, r8, r0)     // Catch:{ zzjd -> 0x0467 }
            r9.zzI(r0)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x0262:
            java.util.List r0 = X.BE8.A0o(r15, r8, r0)     // Catch:{ zzjd -> 0x0467 }
            r9.zzJ(r0)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x026b:
            java.util.List r0 = X.BE8.A0o(r15, r8, r0)     // Catch:{ zzjd -> 0x0467 }
            r9.zzx(r0)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x0274:
            java.util.List r0 = X.BE8.A0o(r15, r8, r0)     // Catch:{ zzjd -> 0x0467 }
            r9.zzB(r0)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x027d:
            java.util.List r0 = X.BE8.A0o(r15, r8, r0)     // Catch:{ zzjd -> 0x0467 }
            r9.zzE(r0)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x0286:
            java.util.List r0 = X.BE8.A0o(r15, r8, r0)     // Catch:{ zzjd -> 0x0467 }
            r9.zzM(r0)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x028f:
            java.util.List r0 = X.BE8.A0o(r15, r8, r0)     // Catch:{ zzjd -> 0x0467 }
            r9.zzD(r0)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x0298:
            java.util.List r0 = X.BE8.A0o(r15, r8, r0)     // Catch:{ zzjd -> 0x0467 }
            r9.zzA(r0)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x02a1:
            java.util.List r0 = X.BE8.A0o(r15, r8, r0)     // Catch:{ zzjd -> 0x0467 }
            r9.zzz(r0)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x02aa:
            java.util.List r0 = X.BE8.A0o(r15, r8, r0)     // Catch:{ zzjd -> 0x0467 }
            r9.zzv(r0)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x02b3:
            java.util.List r0 = X.BE8.A0o(r15, r8, r0)     // Catch:{ zzjd -> 0x0467 }
            r9.zzL(r0)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x02bc:
            java.util.List r0 = X.BE8.A0o(r15, r8, r0)     // Catch:{ zzjd -> 0x0467 }
            r9.zzy(r0)     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzix r19 = r15.zzw(r2)     // Catch:{ zzjd -> 0x0467 }
            r16 = r8
            r17 = r3
            r18 = r0
            r20 = r13
            r21 = r14
            java.lang.Object r13 = com.google.android.recaptcha.internal.zzkt.zzo(r16, r17, r18, r19, r20, r21)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x02d7:
            java.util.List r0 = X.BE8.A0o(r15, r8, r0)     // Catch:{ zzjd -> 0x0467 }
            r9.zzG(r0)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x02e0:
            java.util.List r0 = X.BE8.A0o(r15, r8, r0)     // Catch:{ zzjd -> 0x0467 }
            r9.zzH(r0)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x02e9:
            java.util.List r0 = X.BE8.A0o(r15, r8, r0)     // Catch:{ zzjd -> 0x0467 }
            r9.zzI(r0)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x02f2:
            java.util.List r0 = X.BE8.A0o(r15, r8, r0)     // Catch:{ zzjd -> 0x0467 }
            r9.zzJ(r0)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x02fb:
            r0 = r0 & r5
            com.google.android.recaptcha.internal.zzkr r3 = r15.zzx(r2)     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzjs r2 = r15.zzm     // Catch:{ zzjd -> 0x0467 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0467 }
            java.util.List r0 = r2.zza(r8, r0)     // Catch:{ zzjd -> 0x0467 }
            r9.zzC(r0, r3, r11)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x030c:
            r0 = r0 & r5
            double r4 = r9.zza()     // Catch:{ zzjd -> 0x0467 }
            java.lang.Double r4 = java.lang.Double.valueOf(r4)     // Catch:{ zzjd -> 0x0467 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzlv.zzs(r8, r0, r4)     // Catch:{ zzjd -> 0x0467 }
            r15.zzI(r8, r3, r2)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x031e:
            r0 = r0 & r5
            float r1 = r9.zzb()     // Catch:{ zzjd -> 0x0467 }
            java.lang.Float r4 = java.lang.Float.valueOf(r1)     // Catch:{ zzjd -> 0x0467 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzlv.zzs(r8, r0, r4)     // Catch:{ zzjd -> 0x0467 }
            r15.zzI(r8, r3, r2)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x0330:
            r0 = r0 & r5
            long r4 = r9.zzl()     // Catch:{ zzjd -> 0x0467 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ zzjd -> 0x0467 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzlv.zzs(r8, r0, r4)     // Catch:{ zzjd -> 0x0467 }
            r15.zzI(r8, r3, r2)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x0342:
            r0 = r0 & r5
            long r4 = r9.zzo()     // Catch:{ zzjd -> 0x0467 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ zzjd -> 0x0467 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzlv.zzs(r8, r0, r4)     // Catch:{ zzjd -> 0x0467 }
            r15.zzI(r8, r3, r2)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x0354:
            r0 = r0 & r5
            int r1 = r9.zzg()     // Catch:{ zzjd -> 0x0467 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch:{ zzjd -> 0x0467 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzlv.zzs(r8, r0, r4)     // Catch:{ zzjd -> 0x0467 }
            r15.zzI(r8, r3, r2)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x0366:
            r0 = r0 & r5
            long r4 = r9.zzk()     // Catch:{ zzjd -> 0x0467 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ zzjd -> 0x0467 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzlv.zzs(r8, r0, r4)     // Catch:{ zzjd -> 0x0467 }
            r15.zzI(r8, r3, r2)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x0378:
            r0 = r0 & r5
            int r1 = r9.zzf()     // Catch:{ zzjd -> 0x0467 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch:{ zzjd -> 0x0467 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzlv.zzs(r8, r0, r4)     // Catch:{ zzjd -> 0x0467 }
            r15.zzI(r8, r3, r2)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x038a:
            r0 = r0 & r5
            boolean r1 = r9.zzN()     // Catch:{ zzjd -> 0x0467 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)     // Catch:{ zzjd -> 0x0467 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzlv.zzs(r8, r0, r4)     // Catch:{ zzjd -> 0x0467 }
            r15.zzI(r8, r3, r2)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x039c:
            r15.zzG(r8, r0, r9)     // Catch:{ zzjd -> 0x0467 }
            r15.zzI(r8, r3, r2)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x03a4:
            java.lang.Object r1 = r15.zzB(r8, r3, r2)     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzke r1 = (com.google.android.recaptcha.internal.zzke) r1     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzkr r0 = r15.zzx(r2)     // Catch:{ zzjd -> 0x0467 }
            r9.zzu(r1, r0, r11)     // Catch:{ zzjd -> 0x0467 }
            r15.zzK(r8, r3, r2, r1)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x03b6:
            r0 = r0 & r5
            com.google.android.recaptcha.internal.zzgw r4 = r9.zzp()     // Catch:{ zzjd -> 0x0467 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzlv.zzs(r8, r0, r4)     // Catch:{ zzjd -> 0x0467 }
            r15.zzI(r8, r3, r2)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x03c4:
            r0 = r0 & r5
            int r1 = r9.zzj()     // Catch:{ zzjd -> 0x0467 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch:{ zzjd -> 0x0467 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzlv.zzs(r8, r0, r4)     // Catch:{ zzjd -> 0x0467 }
            r15.zzI(r8, r3, r2)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x03d6:
            int r4 = r9.zze()     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzix r1 = r15.zzw(r2)     // Catch:{ zzjd -> 0x0467 }
            if (r1 == 0) goto L_0x03ec
            boolean r1 = r1.zza(r4)     // Catch:{ zzjd -> 0x0467 }
            if (r1 != 0) goto L_0x03ec
            java.lang.Object r13 = com.google.android.recaptcha.internal.zzkt.zzp(r8, r3, r4, r13, r14)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x03ec:
            r0 = r0 & r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ zzjd -> 0x0467 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzlv.zzs(r8, r0, r4)     // Catch:{ zzjd -> 0x0467 }
            r15.zzI(r8, r3, r2)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x03fa:
            r0 = r0 & r5
            int r1 = r9.zzh()     // Catch:{ zzjd -> 0x0467 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch:{ zzjd -> 0x0467 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzlv.zzs(r8, r0, r4)     // Catch:{ zzjd -> 0x0467 }
            r15.zzI(r8, r3, r2)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x040c:
            r0 = r0 & r5
            long r4 = r9.zzm()     // Catch:{ zzjd -> 0x0467 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ zzjd -> 0x0467 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzlv.zzs(r8, r0, r4)     // Catch:{ zzjd -> 0x0467 }
            r15.zzI(r8, r3, r2)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x041e:
            r0 = r0 & r5
            int r1 = r9.zzi()     // Catch:{ zzjd -> 0x0467 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch:{ zzjd -> 0x0467 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzlv.zzs(r8, r0, r4)     // Catch:{ zzjd -> 0x0467 }
            r15.zzI(r8, r3, r2)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x0430:
            r0 = r0 & r5
            long r4 = r9.zzn()     // Catch:{ zzjd -> 0x0467 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ zzjd -> 0x0467 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzlv.zzs(r8, r0, r4)     // Catch:{ zzjd -> 0x0467 }
            r15.zzI(r8, r3, r2)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x0012
        L_0x0442:
            r0 = r0 & r5
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0467 }
            java.lang.Object r3 = com.google.android.recaptcha.internal.zzlv.zzf(r8, r0)     // Catch:{ zzjd -> 0x0467 }
            if (r3 == 0) goto L_0x045d
            boolean r2 = com.google.android.recaptcha.internal.zzjz.zza(r3)     // Catch:{ zzjd -> 0x0467 }
            if (r2 == 0) goto L_0x045c
            com.google.android.recaptcha.internal.zzjy r2 = com.google.android.recaptcha.internal.zzjy.zza     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzjy r2 = r2.zzb()     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzjz.zzb(r2, r3)     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzlv.zzs(r8, r0, r2)     // Catch:{ zzjd -> 0x0467 }
        L_0x045c:
            throw r6     // Catch:{ zzjd -> 0x0467 }
        L_0x045d:
            com.google.android.recaptcha.internal.zzjy r2 = com.google.android.recaptcha.internal.zzjy.zza     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzjy r2 = r2.zzb()     // Catch:{ zzjd -> 0x0467 }
            com.google.android.recaptcha.internal.zzlv.zzs(r8, r0, r2)     // Catch:{ zzjd -> 0x0467 }
            goto L_0x045c
        L_0x0467:
            if (r13 != 0) goto L_0x046d
            java.lang.Object r13 = r14.zzc(r8)     // Catch:{ all -> 0x04c2 }
        L_0x046d:
            boolean r0 = r14.zzr(r13, r9)     // Catch:{ all -> 0x04c2 }
            if (r0 != 0) goto L_0x0012
            goto L_0x04a4
        L_0x0474:
            int r1 = r15.zzk
        L_0x0476:
            int r0 = r15.zzl
            if (r1 >= r0) goto L_0x04bc
            int[] r0 = r15.zzj
            r17 = r0[r1]
            r20 = r8
            r16 = r8
            r18 = r13
            r19 = r14
            r15.zzy(r16, r17, r18, r19, r20)
            int r1 = r1 + 1
            goto L_0x0476
        L_0x048c:
            int r1 = r15.zzk
        L_0x048e:
            int r0 = r15.zzl
            if (r1 >= r0) goto L_0x04bc
            int[] r0 = r15.zzj
            r17 = r0[r1]
            r20 = r8
            r16 = r8
            r18 = r13
            r19 = r14
            r15.zzy(r16, r17, r18, r19, r20)
            int r1 = r1 + 1
            goto L_0x048e
        L_0x04a4:
            int r1 = r15.zzk
        L_0x04a6:
            int r0 = r15.zzl
            if (r1 >= r0) goto L_0x04bc
            int[] r0 = r15.zzj
            r17 = r0[r1]
            r20 = r8
            r16 = r8
            r18 = r13
            r19 = r14
            r15.zzy(r16, r17, r18, r19, r20)
            int r1 = r1 + 1
            goto L_0x04a6
        L_0x04bc:
            if (r13 == 0) goto L_0x04c1
            r14.zzn(r8, r13)
        L_0x04c1:
            return
        L_0x04c2:
            r2 = move-exception
            int r1 = r15.zzk
        L_0x04c5:
            int r0 = r15.zzl
            if (r1 >= r0) goto L_0x04d7
            int[] r0 = r15.zzj
            r5 = r0[r1]
            r4 = r8
            r3 = r15
            r6 = r13
            r7 = r14
            r3.zzy(r4, r5, r6, r7, r8)
            int r1 = r1 + 1
            goto L_0x04c5
        L_0x04d7:
            if (r13 == 0) goto L_0x04dc
            r14.zzn(r8, r13)
        L_0x04dc:
            throw r2
        L_0x04dd:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zzh(java.lang.Object, com.google.android.recaptcha.internal.zzkq, com.google.android.recaptcha.internal.zzie):void");
    }

    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzgj zzgj) {
        zzc(obj, bArr, i, i2, 0, zzgj);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r4 != r0) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007f, code lost:
        if (r6 != r1) goto L_0x00d6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzk(java.lang.Object r10, java.lang.Object r11) {
        /*
            r9 = this;
            r8 = 0
            r5 = 0
        L_0x0002:
            int[] r6 = r9.zzc
            int r0 = r6.length
            if (r5 >= r0) goto L_0x0097
            int r0 = r5 + 1
            r0 = r6[r0]
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r0 & r4
            int r0 = r0 >>> 20
            r0 = r0 & 255(0xff, float:3.57E-43)
            long r2 = (long) r1
            switch(r0) {
                case 0: goto L_0x001b;
                case 1: goto L_0x0034;
                case 2: goto L_0x006f;
                case 3: goto L_0x006f;
                case 4: goto L_0x005e;
                case 5: goto L_0x006f;
                case 6: goto L_0x005e;
                case 7: goto L_0x004d;
                case 8: goto L_0x0082;
                case 9: goto L_0x0082;
                case 10: goto L_0x0082;
                case 11: goto L_0x005e;
                case 12: goto L_0x005e;
                case 13: goto L_0x005e;
                case 14: goto L_0x006f;
                case 15: goto L_0x005e;
                case 16: goto L_0x006f;
                case 17: goto L_0x0082;
                case 18: goto L_0x00c8;
                case 19: goto L_0x00c8;
                case 20: goto L_0x00c8;
                case 21: goto L_0x00c8;
                case 22: goto L_0x00c8;
                case 23: goto L_0x00c8;
                case 24: goto L_0x00c8;
                case 25: goto L_0x00c8;
                case 26: goto L_0x00c8;
                case 27: goto L_0x00c8;
                case 28: goto L_0x00c8;
                case 29: goto L_0x00c8;
                case 30: goto L_0x00c8;
                case 31: goto L_0x00c8;
                case 32: goto L_0x00c8;
                case 33: goto L_0x00c8;
                case 34: goto L_0x00c8;
                case 35: goto L_0x00c8;
                case 36: goto L_0x00c8;
                case 37: goto L_0x00c8;
                case 38: goto L_0x00c8;
                case 39: goto L_0x00c8;
                case 40: goto L_0x00c8;
                case 41: goto L_0x00c8;
                case 42: goto L_0x00c8;
                case 43: goto L_0x00c8;
                case 44: goto L_0x00c8;
                case 45: goto L_0x00c8;
                case 46: goto L_0x00c8;
                case 47: goto L_0x00c8;
                case 48: goto L_0x00c8;
                case 49: goto L_0x00c8;
                case 50: goto L_0x00c8;
                case 51: goto L_0x00b8;
                case 52: goto L_0x00b8;
                case 53: goto L_0x00b8;
                case 54: goto L_0x00b8;
                case 55: goto L_0x00b8;
                case 56: goto L_0x00b8;
                case 57: goto L_0x00b8;
                case 58: goto L_0x00b8;
                case 59: goto L_0x00b8;
                case 60: goto L_0x00b8;
                case 61: goto L_0x00b8;
                case 62: goto L_0x00b8;
                case 63: goto L_0x00b8;
                case 64: goto L_0x00b8;
                case 65: goto L_0x00b8;
                case 66: goto L_0x00b8;
                case 67: goto L_0x00b8;
                case 68: goto L_0x00b8;
                default: goto L_0x0018;
            }
        L_0x0018:
            int r5 = r5 + 3
            goto L_0x0002
        L_0x001b:
            boolean r0 = r9.zzL(r10, r11, r5)
            if (r0 == 0) goto L_0x00d6
            com.google.android.recaptcha.internal.zzlu r4 = com.google.android.recaptcha.internal.zzlv.zzf
            double r0 = r4.zza(r10, r2)
            long r6 = java.lang.Double.doubleToLongBits(r0)
            double r0 = r4.zza(r11, r2)
            long r1 = java.lang.Double.doubleToLongBits(r0)
            goto L_0x007d
        L_0x0034:
            boolean r0 = r9.zzL(r10, r11, r5)
            if (r0 == 0) goto L_0x00d6
            com.google.android.recaptcha.internal.zzlu r1 = com.google.android.recaptcha.internal.zzlv.zzf
            float r0 = r1.zzb(r10, r2)
            int r4 = java.lang.Float.floatToIntBits(r0)
            float r0 = r1.zzb(r11, r2)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x006c
        L_0x004d:
            boolean r0 = r9.zzL(r10, r11, r5)
            if (r0 == 0) goto L_0x00d6
            com.google.android.recaptcha.internal.zzlu r0 = com.google.android.recaptcha.internal.zzlv.zzf
            boolean r4 = r0.zzg(r10, r2)
            boolean r0 = r0.zzg(r11, r2)
            goto L_0x006c
        L_0x005e:
            boolean r0 = r9.zzL(r10, r11, r5)
            if (r0 == 0) goto L_0x00d6
            int r4 = com.google.android.recaptcha.internal.zzlv.zzc(r10, r2)
            int r0 = com.google.android.recaptcha.internal.zzlv.zzc(r11, r2)
        L_0x006c:
            if (r4 != r0) goto L_0x00d6
            goto L_0x0018
        L_0x006f:
            boolean r0 = r9.zzL(r10, r11, r5)
            if (r0 == 0) goto L_0x00d6
            long r6 = com.google.android.recaptcha.internal.zzlv.zzd(r10, r2)
            long r1 = com.google.android.recaptcha.internal.zzlv.zzd(r11, r2)
        L_0x007d:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00d6
            goto L_0x0018
        L_0x0082:
            boolean r0 = r9.zzL(r10, r11, r5)
            if (r0 == 0) goto L_0x00d6
            java.lang.Object r1 = com.google.android.recaptcha.internal.zzlv.zzf(r10, r2)
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r11, r2)
            boolean r0 = com.google.android.recaptcha.internal.zzkt.zzH(r1, r0)
            if (r0 == 0) goto L_0x00d6
            goto L_0x0018
        L_0x0097:
            r0 = r10
            com.google.android.recaptcha.internal.zzit r0 = (com.google.android.recaptcha.internal.zzit) r0
            com.google.android.recaptcha.internal.zzlm r1 = r0.zzc
            r0 = r11
            com.google.android.recaptcha.internal.zzit r0 = (com.google.android.recaptcha.internal.zzit) r0
            com.google.android.recaptcha.internal.zzlm r0 = r0.zzc
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00d6
            boolean r0 = r9.zzh
            if (r0 == 0) goto L_0x00d7
            com.google.android.recaptcha.internal.zzip r10 = (com.google.android.recaptcha.internal.zzip) r10
            com.google.android.recaptcha.internal.zzij r1 = r10.zzb
            com.google.android.recaptcha.internal.zzip r11 = (com.google.android.recaptcha.internal.zzip) r11
            com.google.android.recaptcha.internal.zzij r0 = r11.zzb
            boolean r0 = r1.equals(r0)
            return r0
        L_0x00b8:
            int r0 = r5 + 2
            r0 = r6[r0]
            r0 = r0 & r4
            long r0 = (long) r0
            int r4 = com.google.android.recaptcha.internal.zzlv.zzc(r10, r0)
            int r0 = com.google.android.recaptcha.internal.zzlv.zzc(r11, r0)
            if (r4 != r0) goto L_0x00d6
        L_0x00c8:
            java.lang.Object r1 = com.google.android.recaptcha.internal.zzlv.zzf(r10, r2)
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r11, r2)
            boolean r0 = com.google.android.recaptcha.internal.zzkt.zzH(r1, r0)
            if (r0 != 0) goto L_0x0018
        L_0x00d6:
            return r8
        L_0x00d7:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zzk(java.lang.Object, java.lang.Object):boolean");
    }

    public final boolean zzl(Object obj) {
        boolean z;
        Object obj2 = obj;
        int i = 1048575;
        int i2 = 0;
        int i3 = 0;
        loop0:
        while (true) {
            if (i3 < this.zzk) {
                int[] iArr = this.zzj;
                int[] iArr2 = this.zzc;
                int i4 = iArr[i3];
                int i5 = iArr2[i4];
                int i6 = iArr2[i4 + 1];
                int i7 = iArr2[i4 + 2];
                int i8 = i7 & 1048575;
                int i9 = 1 << (i7 >>> 20);
                if (i8 == i) {
                    i8 = i;
                } else if (i8 != 1048575) {
                    i2 = zzb.getInt(obj, (long) i8);
                }
                if ((268435456 & i6) != 0 && !zzO(obj2, i4, i8, i2, i9)) {
                    break;
                }
                int i10 = (i6 >>> 20) & 255;
                if (i10 == 9 || i10 == 17) {
                    z = zzO(obj2, i4, i8, i2, i9);
                } else {
                    if (i10 != 27) {
                        if (i10 == 60 || i10 == 68) {
                            z = zzR(obj, i5, i4);
                        } else if (i10 != 49) {
                            if (i10 == 50 && !((zzjy) zzlv.zzf(obj, (long) (i6 & 1048575))).isEmpty()) {
                                throw null;
                            }
                            i3++;
                            i = i8;
                        }
                    }
                    List list = (List) zzlv.zzf(obj, (long) (i6 & 1048575));
                    if (!list.isEmpty()) {
                        zzkr zzx = zzx(i4);
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            if (!zzx.zzl(list.get(i11))) {
                                break loop0;
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                    i3++;
                    i = i8;
                }
                if (z && !zzP(obj, i6, zzx(i4))) {
                    break;
                }
                i3++;
                i = i8;
            } else if (!this.zzh || ((zzip) obj2).zzb.zzk()) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    private final void zzF(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzR(obj2, i2, i)) {
            Unsafe unsafe = zzb;
            long j = (long) (this.zzc[i + 1] & 1048575);
            Object object = unsafe.getObject(obj2, j);
            if (object != null) {
                zzkr zzx = zzx(i);
                if (!zzR(obj, i2, i)) {
                    if (!zzQ(object)) {
                        unsafe.putObject(obj, j, object);
                    } else {
                        Object zze2 = zzx.zze();
                        zzx.zzg(zze2, object);
                        unsafe.putObject(obj, j, zze2);
                    }
                    zzI(obj, i2, i);
                    return;
                }
                Object object2 = unsafe.getObject(obj, j);
                if (!zzQ(object2)) {
                    Object zze3 = zzx.zze();
                    zzx.zzg(zze3, object2);
                    unsafe.putObject(obj, j, zze3);
                    object2 = zze3;
                }
                zzx.zzg(object2, object);
                return;
            }
            throw AnonymousClass000.A0o(obj2.toString(), BEA.A0q(this.zzc[i]));
        }
    }

    private final void zzH(Object obj, int i) {
        int i2 = this.zzc[i + 2];
        long j = (long) (1048575 & i2);
        if (j != 1048575) {
            zzlv.zzq(obj, j, (1 << (i2 >>> 20)) | zzlv.zzc(obj, j));
        }
    }

    private final void zzI(Object obj, int i, int i2) {
        zzlv.zzq(obj, BE9.A0O(this.zzc, i2), i);
    }

    private final void zzJ(Object obj, int i, Object obj2) {
        zzb.putObject(obj, BE9.A0N(this.zzc, i), obj2);
        zzH(obj, i);
    }

    private final void zzK(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, BE9.A0N(this.zzc, i2), obj2);
        zzI(obj, i, i2);
    }

    public static boolean zzM(int i) {
        return AnonymousClass000.A1O(i & 536870912);
    }

    private final boolean zzN(Object obj, int i) {
        int[] iArr = this.zzc;
        int i2 = iArr[i + 2];
        long j = (long) (i2 & 1048575);
        if (j == 1048575) {
            int i3 = iArr[i + 1];
            long j2 = (long) (1048575 & i3);
            switch ((i3 >>> 20) & 255) {
                case 0:
                    if (Double.doubleToRawLongBits(zzlv.zzf.zza(obj, j2)) != 0) {
                        return true;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(zzlv.zzf.zzb(obj, j2)) != 0) {
                        return true;
                    }
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    if (zzlv.zzd(obj, j2) != 0) {
                        return true;
                    }
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    if (zzlv.zzc(obj, j2) != 0) {
                        return true;
                    }
                    break;
                case 7:
                    return zzlv.zzf.zzg(obj, j2);
                case 8:
                    Object zzf2 = zzlv.zzf(obj, j2);
                    if (zzf2 instanceof String) {
                        if (!((String) zzf2).isEmpty()) {
                            return true;
                        }
                    } else if (!(zzf2 instanceof zzgw)) {
                        throw BE6.A0j();
                    } else if (!zzgw.zzb.equals(zzf2)) {
                        return true;
                    }
                    break;
                case 9:
                case 17:
                    if (zzlv.zzf(obj, j2) != null) {
                        return true;
                    }
                    break;
                case 10:
                    if (!zzgw.zzb.equals(zzlv.zzf(obj, j2))) {
                        return true;
                    }
                    break;
                default:
                    throw BE6.A0j();
            }
        } else {
            if ((zzlv.zzc(obj, j) & (1 << (i2 >>> 20))) != 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzit) {
            return ((zzit) obj).zzG();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i, int i2) {
        return AnonymousClass000.A1T(zzlv.zzc(obj, BE9.A0O(this.zzc, i2)), i);
    }

    public static final void zzT(int i, Object obj, zzmd zzmd) {
        if (obj instanceof String) {
            zzmd.zzG(i, (String) obj);
        } else {
            zzmd.zzd(i, (zzgw) obj);
        }
    }

    public static zzlm zzd(Object obj) {
        zzit zzit = (zzit) obj;
        zzlm zzlm = zzit.zzc;
        if (zzlm != zzlm.zza) {
            return zzlm;
        }
        zzlm zzf2 = zzlm.zzf();
        zzit.zzc = zzf2;
        return zzf2;
    }

    private final int zzq(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzs(i, 0);
    }

    private final int zzr(int i) {
        return this.zzc[i + 2];
    }

    private final int zzs(int i, int i2) {
        int[] iArr = this.zzc;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private final int zzu(int i) {
        return this.zzc[i + 1];
    }

    private final zzix zzw(int i) {
        int i2 = i / 3;
        return (zzix) this.zzd[i2 + i2 + 1];
    }

    private final zzkr zzx(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzkr zzkr = (zzkr) objArr[i3];
        if (zzkr != null) {
            return zzkr;
        }
        zzkr zzb2 = zzkn.zzb.zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzy(Object obj, int i, Object obj2, zzll zzll, Object obj3) {
        if (zzlv.zzf(obj, BE9.A0N(this.zzc, i)) == null || zzw(i) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0309, code lost:
        r0 = (r0 + r2) + r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0381, code lost:
        r13 = r13 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0459, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x045a, code lost:
        r13 = r13 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x04af, code lost:
        r0 = com.google.android.recaptcha.internal.zzhh.zzb;
        r2 = r2 * X.BEB.A02(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x04ff, code lost:
        r0 = com.google.android.recaptcha.internal.zzhh.zzb;
        r12 = X.BEB.A02(r8);
        r2 = com.google.android.recaptcha.internal.zzhh.zzz((r10 >> 63) ^ (r10 + r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0520, code lost:
        r2 = r0 + r0;
        r1 = r0 >> 31;
        r0 = com.google.android.recaptcha.internal.zzhh.zzb;
        r12 = X.BEB.A02(r8);
        r2 = X.BEB.A02(r1 ^ r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x05af, code lost:
        if ((r1 instanceof com.google.android.recaptcha.internal.zzgw) != false) goto L_0x05ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x05b1, code lost:
        r2 = com.google.android.recaptcha.internal.zzhh.zzx((java.lang.String) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x05ca, code lost:
        r0 = com.google.android.recaptcha.internal.zzhh.zzb;
        r1 = ((com.google.android.recaptcha.internal.zzgw) r1).zzd();
        r12 = X.BEB.A02(r8) + (X.BEB.A02(r1) + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x05ed, code lost:
        r12 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0652, code lost:
        r12 = X.BEB.A02(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0656, code lost:
        r12 = r12 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0667, code lost:
        r12 = r0 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0679, code lost:
        r12 = r0 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x010e, code lost:
        r8 = r8 << 3;
        r2 = com.google.android.recaptcha.internal.zzhh.zzu(X.AnonymousClass000.A0M(com.google.android.recaptcha.internal.zzlv.zzf(r3, r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x012b, code lost:
        r8 = r8 << 3;
        r2 = com.google.android.recaptcha.internal.zzhh.zzz(X.C17880vN.A05(com.google.android.recaptcha.internal.zzlv.zzf(r3, r0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(java.lang.Object r21) {
        /*
            r20 = this;
            r3 = r21
            sun.misc.Unsafe r7 = zzb
            r4 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r18 = 0
            r5 = 0
            r13 = 0
        L_0x000f:
            r14 = r20
            int[] r1 = r14.zzc
            int r0 = r1.length
            if (r5 >= r0) goto L_0x0689
            int r0 = r5 + 1
            r10 = r1[r0]
            int r0 = r10 >>> 20
            r2 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r5 + 2
            r8 = r1[r5]
            r12 = r1[r0]
            r11 = r12 & r6
            r0 = 17
            r19 = 1
            if (r2 > r0) goto L_0x0685
            if (r11 == r9) goto L_0x0033
            if (r11 != r6) goto L_0x067e
            r18 = 0
        L_0x0032:
            r9 = r11
        L_0x0033:
            int r0 = r12 >>> 20
            int r19 = r19 << r0
        L_0x0037:
            r10 = r10 & r6
            com.google.android.recaptcha.internal.zzik r0 = com.google.android.recaptcha.internal.zzik.zzA
            long r0 = (long) r10
            r12 = 63
            switch(r2) {
                case 0: goto L_0x066a;
                case 1: goto L_0x0658;
                case 2: goto L_0x063d;
                case 3: goto L_0x0627;
                case 4: goto L_0x0611;
                case 5: goto L_0x0601;
                case 6: goto L_0x05f1;
                case 7: goto L_0x05de;
                case 8: goto L_0x059c;
                case 9: goto L_0x0583;
                case 10: goto L_0x05b9;
                case 11: goto L_0x056a;
                case 12: goto L_0x0553;
                case 13: goto L_0x0542;
                case 14: goto L_0x0531;
                case 15: goto L_0x050f;
                case 16: goto L_0x04ee;
                case 17: goto L_0x04d3;
                case 18: goto L_0x04c7;
                case 19: goto L_0x04bb;
                case 20: goto L_0x03dd;
                case 21: goto L_0x049d;
                case 22: goto L_0x048a;
                case 23: goto L_0x047e;
                case 24: goto L_0x0472;
                case 25: goto L_0x045d;
                case 26: goto L_0x03fc;
                case 27: goto L_0x03a5;
                case 28: goto L_0x0374;
                case 29: goto L_0x0360;
                case 30: goto L_0x034c;
                case 31: goto L_0x0340;
                case 32: goto L_0x0334;
                case 33: goto L_0x0320;
                case 34: goto L_0x030c;
                case 35: goto L_0x02ef;
                case 36: goto L_0x02d4;
                case 37: goto L_0x02bb;
                case 38: goto L_0x02a2;
                case 39: goto L_0x0289;
                case 40: goto L_0x026d;
                case 41: goto L_0x0251;
                case 42: goto L_0x0237;
                case 43: goto L_0x021d;
                case 44: goto L_0x0203;
                case 45: goto L_0x01e7;
                case 46: goto L_0x01cb;
                case 47: goto L_0x01b1;
                case 48: goto L_0x0197;
                case 49: goto L_0x0175;
                case 50: goto L_0x0153;
                case 51: goto L_0x0147;
                case 52: goto L_0x013b;
                case 53: goto L_0x0125;
                case 54: goto L_0x011e;
                case 55: goto L_0x0108;
                case 56: goto L_0x00fc;
                case 57: goto L_0x00f0;
                case 58: goto L_0x00e4;
                case 59: goto L_0x00d6;
                case 60: goto L_0x00c2;
                case 61: goto L_0x00b4;
                case 62: goto L_0x009c;
                case 63: goto L_0x0095;
                case 64: goto L_0x0089;
                case 65: goto L_0x007d;
                case 66: goto L_0x006b;
                case 67: goto L_0x0059;
                case 68: goto L_0x0043;
                default: goto L_0x0040;
            }
        L_0x0040:
            int r5 = r5 + 3
            goto L_0x000f
        L_0x0043:
            boolean r2 = r14.zzR(r3, r8, r5)
            if (r2 == 0) goto L_0x0040
            java.lang.Object r1 = r7.getObject(r3, r0)
            com.google.android.recaptcha.internal.zzke r1 = (com.google.android.recaptcha.internal.zzke) r1
            com.google.android.recaptcha.internal.zzkr r0 = r14.zzx(r5)
            int r12 = com.google.android.recaptcha.internal.zzhh.zzt(r8, r1, r0)
            goto L_0x067b
        L_0x0059:
            boolean r2 = r14.zzR(r3, r8, r5)
            if (r2 == 0) goto L_0x0040
            int r8 = r8 << 3
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r3, r0)
            long r10 = X.C17880vN.A05(r0)
            goto L_0x04ff
        L_0x006b:
            boolean r2 = r14.zzR(r3, r8, r5)
            if (r2 == 0) goto L_0x0040
            int r8 = r8 << 3
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r3, r0)
            int r0 = X.AnonymousClass000.A0M(r0)
            goto L_0x0520
        L_0x007d:
            boolean r0 = r14.zzR(r3, r8, r5)
            if (r0 == 0) goto L_0x0040
            int r0 = X.BE6.A05(r8)
            goto L_0x0679
        L_0x0089:
            boolean r0 = r14.zzR(r3, r8, r5)
            if (r0 == 0) goto L_0x0040
            int r0 = X.BE6.A05(r8)
            goto L_0x0667
        L_0x0095:
            boolean r2 = r14.zzR(r3, r8, r5)
            if (r2 == 0) goto L_0x0040
            goto L_0x010e
        L_0x009c:
            boolean r2 = r14.zzR(r3, r8, r5)
            if (r2 == 0) goto L_0x0040
            int r8 = r8 << 3
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r3, r0)
            int r1 = X.AnonymousClass000.A0M(r0)
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r2 = X.BEB.A02(r1)
            goto L_0x0652
        L_0x00b4:
            boolean r2 = r14.zzR(r3, r8, r5)
            if (r2 == 0) goto L_0x0040
            int r8 = r8 << 3
            java.lang.Object r1 = r7.getObject(r3, r0)
            goto L_0x05ca
        L_0x00c2:
            boolean r2 = r14.zzR(r3, r8, r5)
            if (r2 == 0) goto L_0x0040
            java.lang.Object r1 = r7.getObject(r3, r0)
            com.google.android.recaptcha.internal.zzkr r0 = r14.zzx(r5)
            int r12 = com.google.android.recaptcha.internal.zzkt.zzh(r8, r1, r0)
            goto L_0x067b
        L_0x00d6:
            boolean r2 = r14.zzR(r3, r8, r5)
            if (r2 == 0) goto L_0x0040
            int r8 = r8 << 3
            java.lang.Object r1 = r7.getObject(r3, r0)
            goto L_0x05ad
        L_0x00e4:
            boolean r0 = r14.zzR(r3, r8, r5)
            if (r0 == 0) goto L_0x0040
            int r0 = X.BE6.A05(r8)
            goto L_0x05ed
        L_0x00f0:
            boolean r0 = r14.zzR(r3, r8, r5)
            if (r0 == 0) goto L_0x0040
            int r0 = X.BE6.A05(r8)
            goto L_0x0667
        L_0x00fc:
            boolean r0 = r14.zzR(r3, r8, r5)
            if (r0 == 0) goto L_0x0040
            int r0 = X.BE6.A05(r8)
            goto L_0x0679
        L_0x0108:
            boolean r2 = r14.zzR(r3, r8, r5)
            if (r2 == 0) goto L_0x0040
        L_0x010e:
            int r8 = r8 << 3
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r3, r0)
            int r0 = X.AnonymousClass000.A0M(r0)
            int r2 = com.google.android.recaptcha.internal.zzhh.zzu(r0)
            goto L_0x0652
        L_0x011e:
            boolean r2 = r14.zzR(r3, r8, r5)
            if (r2 == 0) goto L_0x0040
            goto L_0x012b
        L_0x0125:
            boolean r2 = r14.zzR(r3, r8, r5)
            if (r2 == 0) goto L_0x0040
        L_0x012b:
            int r8 = r8 << 3
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r3, r0)
            long r0 = X.C17880vN.A05(r0)
            int r2 = com.google.android.recaptcha.internal.zzhh.zzz(r0)
            goto L_0x0652
        L_0x013b:
            boolean r0 = r14.zzR(r3, r8, r5)
            if (r0 == 0) goto L_0x0040
            int r0 = X.BE6.A05(r8)
            goto L_0x0667
        L_0x0147:
            boolean r0 = r14.zzR(r3, r8, r5)
            if (r0 == 0) goto L_0x0040
            int r0 = X.BE6.A05(r8)
            goto L_0x0679
        L_0x0153:
            java.lang.Object r1 = r7.getObject(r3, r0)
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0040
            java.util.Iterator r1 = X.C17890vO.A0i(r1)
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0040
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r1)
            r0.getKey()
            r0.getValue()
            r0 = 0
            throw r0
        L_0x0175:
            java.lang.Object r11 = r7.getObject(r3, r0)
            java.util.List r11 = (java.util.List) r11
            com.google.android.recaptcha.internal.zzkr r10 = r14.zzx(r5)
            int r2 = X.BE6.A0H(r11)
            if (r2 == 0) goto L_0x04b8
            r1 = 0
            r12 = 0
        L_0x0187:
            if (r1 >= r2) goto L_0x067b
            java.lang.Object r0 = r11.get(r1)
            com.google.android.recaptcha.internal.zzke r0 = (com.google.android.recaptcha.internal.zzke) r0
            int r0 = com.google.android.recaptcha.internal.zzhh.zzt(r8, r0, r10)
            int r12 = r12 + r0
            int r1 = r1 + 1
            goto L_0x0187
        L_0x0197:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r10 = com.google.android.recaptcha.internal.zzkt.zzj(r0)
            if (r10 <= 0) goto L_0x0040
            int r1 = r8 << 3
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r2 = X.BEB.A02(r10)
            int r0 = X.BEB.A02(r1)
            goto L_0x0309
        L_0x01b1:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r10 = com.google.android.recaptcha.internal.zzkt.zzi(r0)
            if (r10 <= 0) goto L_0x0040
            int r1 = r8 << 3
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r2 = X.BEB.A02(r10)
            int r0 = X.BEB.A02(r1)
            goto L_0x0309
        L_0x01cb:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r0 = X.BE6.A0H(r0)
            int r10 = r0 * 8
            if (r10 <= 0) goto L_0x0040
            int r1 = r8 << 3
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r2 = X.BEB.A02(r10)
            int r0 = X.BEB.A02(r1)
            goto L_0x0309
        L_0x01e7:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r0 = X.BE6.A0H(r0)
            int r10 = r0 * 4
            if (r10 <= 0) goto L_0x0040
            int r1 = r8 << 3
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r2 = X.BEB.A02(r10)
            int r0 = X.BEB.A02(r1)
            goto L_0x0309
        L_0x0203:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r10 = com.google.android.recaptcha.internal.zzkt.zza(r0)
            if (r10 <= 0) goto L_0x0040
            int r1 = r8 << 3
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r2 = X.BEB.A02(r10)
            int r0 = X.BEB.A02(r1)
            goto L_0x0309
        L_0x021d:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r10 = com.google.android.recaptcha.internal.zzkt.zzk(r0)
            if (r10 <= 0) goto L_0x0040
            int r1 = r8 << 3
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r2 = X.BEB.A02(r10)
            int r0 = X.BEB.A02(r1)
            goto L_0x0309
        L_0x0237:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r10 = X.BE6.A0H(r0)
            if (r10 <= 0) goto L_0x0040
            int r1 = r8 << 3
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r2 = X.BEB.A02(r10)
            int r0 = X.BEB.A02(r1)
            goto L_0x0309
        L_0x0251:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r0 = X.BE6.A0H(r0)
            int r10 = r0 * 4
            if (r10 <= 0) goto L_0x0040
            int r1 = r8 << 3
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r2 = X.BEB.A02(r10)
            int r0 = X.BEB.A02(r1)
            goto L_0x0309
        L_0x026d:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r0 = X.BE6.A0H(r0)
            int r10 = r0 * 8
            if (r10 <= 0) goto L_0x0040
            int r1 = r8 << 3
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r2 = X.BEB.A02(r10)
            int r0 = X.BEB.A02(r1)
            goto L_0x0309
        L_0x0289:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r10 = com.google.android.recaptcha.internal.zzkt.zzf(r0)
            if (r10 <= 0) goto L_0x0040
            int r1 = r8 << 3
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r2 = X.BEB.A02(r10)
            int r0 = X.BEB.A02(r1)
            goto L_0x0309
        L_0x02a2:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r10 = com.google.android.recaptcha.internal.zzkt.zzl(r0)
            if (r10 <= 0) goto L_0x0040
            int r1 = r8 << 3
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r2 = X.BEB.A02(r10)
            int r0 = X.BEB.A02(r1)
            goto L_0x0309
        L_0x02bb:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r10 = com.google.android.recaptcha.internal.zzkt.zzg(r0)
            if (r10 <= 0) goto L_0x0040
            int r1 = r8 << 3
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r2 = X.BEB.A02(r10)
            int r0 = X.BEB.A02(r1)
            goto L_0x0309
        L_0x02d4:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r0 = X.BE6.A0H(r0)
            int r10 = r0 * 4
            if (r10 <= 0) goto L_0x0040
            int r1 = r8 << 3
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r2 = X.BEB.A02(r10)
            int r0 = X.BEB.A02(r1)
            goto L_0x0309
        L_0x02ef:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r0 = X.BE6.A0H(r0)
            int r10 = r0 * 8
            if (r10 <= 0) goto L_0x0040
            int r1 = r8 << 3
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r2 = X.BEB.A02(r10)
            int r0 = X.BEB.A02(r1)
        L_0x0309:
            int r0 = r0 + r2
            int r0 = r0 + r10
            goto L_0x0381
        L_0x030c:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.BE6.A0H(r0)
            if (r2 == 0) goto L_0x04b8
            int r1 = r8 << 3
            int r12 = com.google.android.recaptcha.internal.zzkt.zzj(r0)
            goto L_0x04af
        L_0x0320:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.BE6.A0H(r0)
            if (r2 == 0) goto L_0x04b8
            int r1 = r8 << 3
            int r12 = com.google.android.recaptcha.internal.zzkt.zzi(r0)
            goto L_0x04af
        L_0x0334:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r12 = com.google.android.recaptcha.internal.zzkt.zzd(r8, r0, r4)
            goto L_0x067b
        L_0x0340:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r12 = com.google.android.recaptcha.internal.zzkt.zzb(r8, r0, r4)
            goto L_0x067b
        L_0x034c:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.BE6.A0H(r0)
            if (r2 == 0) goto L_0x04b8
            int r1 = r8 << 3
            int r12 = com.google.android.recaptcha.internal.zzkt.zza(r0)
            goto L_0x04af
        L_0x0360:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.BE6.A0H(r0)
            if (r2 == 0) goto L_0x04b8
            int r1 = r8 << 3
            int r12 = com.google.android.recaptcha.internal.zzkt.zzk(r0)
            goto L_0x04af
        L_0x0374:
            java.lang.Object r10 = r7.getObject(r3, r0)
            java.util.List r10 = (java.util.List) r10
            int r0 = X.BE6.A0H(r10)
            if (r0 != 0) goto L_0x0384
            r0 = 0
        L_0x0381:
            int r13 = r13 + r0
            goto L_0x0040
        L_0x0384:
            int r1 = X.BE6.A05(r8)
            int r0 = r0 * r1
            r8 = 0
        L_0x038a:
            int r1 = r10.size()
            if (r8 >= r1) goto L_0x0381
            java.lang.Object r1 = r10.get(r8)
            com.google.android.recaptcha.internal.zzgw r1 = (com.google.android.recaptcha.internal.zzgw) r1
            int r2 = r1.zzd()
            int r1 = com.google.android.recaptcha.internal.zzhh.zzb
            int r1 = X.BEB.A02(r2)
            int r1 = r1 + r2
            int r0 = r0 + r1
            int r8 = r8 + 1
            goto L_0x038a
        L_0x03a5:
            java.lang.Object r10 = r7.getObject(r3, r0)
            java.util.List r10 = (java.util.List) r10
            com.google.android.recaptcha.internal.zzkr r11 = r14.zzx(r5)
            int r2 = X.BE6.A0H(r10)
            if (r2 == 0) goto L_0x04b8
            int r12 = X.BE6.A05(r8)
            int r12 = r12 * r2
            r8 = 0
        L_0x03bb:
            if (r8 >= r2) goto L_0x067b
            java.lang.Object r1 = r10.get(r8)
            boolean r0 = r1 instanceof com.google.android.recaptcha.internal.zzjk
            if (r0 == 0) goto L_0x03d6
            com.google.android.recaptcha.internal.zzjk r1 = (com.google.android.recaptcha.internal.zzjk) r1
            int r1 = r1.zza()
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r0 = X.BEB.A02(r1)
            int r0 = r0 + r1
        L_0x03d2:
            int r12 = r12 + r0
            int r8 = r8 + 1
            goto L_0x03bb
        L_0x03d6:
            com.google.android.recaptcha.internal.zzke r1 = (com.google.android.recaptcha.internal.zzke) r1
            int r0 = com.google.android.recaptcha.internal.zzhh.zzw(r1, r11)
            goto L_0x03d2
        L_0x03dd:
            java.lang.Object r1 = r7.getObject(r3, r0)
            java.util.List r1 = (java.util.List) r1
            int r0 = X.BE6.A0H(r1)
            if (r0 == 0) goto L_0x0459
            int r2 = r8 << 3
            int r8 = com.google.android.recaptcha.internal.zzkt.zzg(r1)
            int r1 = r1.size()
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r0 = X.BEB.A02(r2)
            int r1 = r1 * r0
            int r8 = r8 + r1
            goto L_0x045a
        L_0x03fc:
            java.lang.Object r11 = r7.getObject(r3, r0)
            java.util.List r11 = (java.util.List) r11
            int r10 = X.BE6.A0H(r11)
            if (r10 == 0) goto L_0x0459
            int r2 = r8 << 3
            boolean r1 = r11 instanceof com.google.android.recaptcha.internal.zzjm
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r8 = X.BEB.A02(r2)
            int r8 = r8 * r10
            if (r1 == 0) goto L_0x0438
            com.google.android.recaptcha.internal.zzjm r11 = (com.google.android.recaptcha.internal.zzjm) r11
            r2 = 0
        L_0x0418:
            if (r2 >= r10) goto L_0x045a
            java.lang.Object r1 = r11.zzf(r2)
            boolean r0 = r1 instanceof com.google.android.recaptcha.internal.zzgw
            if (r0 == 0) goto L_0x0431
            com.google.android.recaptcha.internal.zzgw r1 = (com.google.android.recaptcha.internal.zzgw) r1
            int r1 = r1.zzd()
            int r0 = X.BEB.A02(r1)
            int r0 = r0 + r1
        L_0x042d:
            int r8 = r8 + r0
            int r2 = r2 + 1
            goto L_0x0418
        L_0x0431:
            java.lang.String r1 = (java.lang.String) r1
            int r0 = com.google.android.recaptcha.internal.zzhh.zzx(r1)
            goto L_0x042d
        L_0x0438:
            r2 = 0
        L_0x0439:
            if (r2 >= r10) goto L_0x045a
            java.lang.Object r1 = r11.get(r2)
            boolean r0 = r1 instanceof com.google.android.recaptcha.internal.zzgw
            if (r0 == 0) goto L_0x0452
            com.google.android.recaptcha.internal.zzgw r1 = (com.google.android.recaptcha.internal.zzgw) r1
            int r1 = r1.zzd()
            int r0 = X.BEB.A02(r1)
            int r0 = r0 + r1
        L_0x044e:
            int r8 = r8 + r0
            int r2 = r2 + 1
            goto L_0x0439
        L_0x0452:
            java.lang.String r1 = (java.lang.String) r1
            int r0 = com.google.android.recaptcha.internal.zzhh.zzx(r1)
            goto L_0x044e
        L_0x0459:
            r8 = 0
        L_0x045a:
            int r13 = r13 + r8
            goto L_0x0040
        L_0x045d:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r12 = X.BE6.A0H(r0)
            if (r12 == 0) goto L_0x04b8
            int r0 = X.BE6.A05(r8)
            int r0 = r0 + 1
            int r12 = r12 * r0
            goto L_0x067b
        L_0x0472:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r12 = com.google.android.recaptcha.internal.zzkt.zzb(r8, r0, r4)
            goto L_0x067b
        L_0x047e:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r12 = com.google.android.recaptcha.internal.zzkt.zzd(r8, r0, r4)
            goto L_0x067b
        L_0x048a:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.BE6.A0H(r0)
            if (r2 == 0) goto L_0x04b8
            int r1 = r8 << 3
            int r12 = com.google.android.recaptcha.internal.zzkt.zzf(r0)
            goto L_0x04af
        L_0x049d:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.BE6.A0H(r0)
            if (r2 == 0) goto L_0x04b8
            int r1 = r8 << 3
            int r12 = com.google.android.recaptcha.internal.zzkt.zzl(r0)
        L_0x04af:
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r0 = X.BEB.A02(r1)
            int r2 = r2 * r0
            goto L_0x0656
        L_0x04b8:
            r12 = 0
            goto L_0x067b
        L_0x04bb:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r12 = com.google.android.recaptcha.internal.zzkt.zzb(r8, r0, r4)
            goto L_0x067b
        L_0x04c7:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r12 = com.google.android.recaptcha.internal.zzkt.zzd(r8, r0, r4)
            goto L_0x067b
        L_0x04d3:
            r17 = r9
            r16 = r5
            r15 = r3
            boolean r2 = r14.zzO(r15, r16, r17, r18, r19)
            if (r2 == 0) goto L_0x0040
            java.lang.Object r1 = r7.getObject(r3, r0)
            com.google.android.recaptcha.internal.zzke r1 = (com.google.android.recaptcha.internal.zzke) r1
            com.google.android.recaptcha.internal.zzkr r0 = r14.zzx(r5)
            int r12 = com.google.android.recaptcha.internal.zzhh.zzt(r8, r1, r0)
            goto L_0x067b
        L_0x04ee:
            r17 = r9
            r16 = r5
            r15 = r3
            boolean r2 = r14.zzO(r15, r16, r17, r18, r19)
            if (r2 == 0) goto L_0x0040
            int r8 = r8 << 3
            long r10 = r7.getLong(r3, r0)
        L_0x04ff:
            long r1 = r10 + r10
            long r10 = r10 >> r12
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r12 = X.BEB.A02(r8)
            long r10 = r10 ^ r1
            int r2 = com.google.android.recaptcha.internal.zzhh.zzz(r10)
            goto L_0x0656
        L_0x050f:
            r17 = r9
            r16 = r5
            r15 = r3
            boolean r2 = r14.zzO(r15, r16, r17, r18, r19)
            if (r2 == 0) goto L_0x0040
            int r8 = r8 << 3
            int r0 = r7.getInt(r3, r0)
        L_0x0520:
            int r2 = r0 + r0
            int r1 = r0 >> 31
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r12 = X.BEB.A02(r8)
            r1 = r1 ^ r2
            int r2 = X.BEB.A02(r1)
            goto L_0x0656
        L_0x0531:
            r17 = r9
            r16 = r5
            r15 = r3
            boolean r0 = r14.zzO(r15, r16, r17, r18, r19)
            if (r0 == 0) goto L_0x0040
            int r0 = X.BE6.A05(r8)
            goto L_0x0679
        L_0x0542:
            r17 = r9
            r16 = r5
            r15 = r3
            boolean r0 = r14.zzO(r15, r16, r17, r18, r19)
            if (r0 == 0) goto L_0x0040
            int r0 = X.BE6.A05(r8)
            goto L_0x0667
        L_0x0553:
            r17 = r9
            r16 = r5
            r15 = r3
            boolean r2 = r14.zzO(r15, r16, r17, r18, r19)
            if (r2 == 0) goto L_0x0040
            int r8 = r8 << 3
            int r0 = r7.getInt(r3, r0)
            int r2 = com.google.android.recaptcha.internal.zzhh.zzu(r0)
            goto L_0x0652
        L_0x056a:
            r17 = r9
            r16 = r5
            r15 = r3
            boolean r2 = r14.zzO(r15, r16, r17, r18, r19)
            if (r2 == 0) goto L_0x0040
            int r8 = r8 << 3
            int r1 = r7.getInt(r3, r0)
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r2 = X.BEB.A02(r1)
            goto L_0x0652
        L_0x0583:
            r17 = r9
            r16 = r5
            r15 = r3
            boolean r2 = r14.zzO(r15, r16, r17, r18, r19)
            if (r2 == 0) goto L_0x0040
            java.lang.Object r1 = r7.getObject(r3, r0)
            com.google.android.recaptcha.internal.zzkr r0 = r14.zzx(r5)
            int r12 = com.google.android.recaptcha.internal.zzkt.zzh(r8, r1, r0)
            goto L_0x067b
        L_0x059c:
            r17 = r9
            r16 = r5
            r15 = r3
            boolean r2 = r14.zzO(r15, r16, r17, r18, r19)
            if (r2 == 0) goto L_0x0040
            int r8 = r8 << 3
            java.lang.Object r1 = r7.getObject(r3, r0)
        L_0x05ad:
            boolean r0 = r1 instanceof com.google.android.recaptcha.internal.zzgw
            if (r0 != 0) goto L_0x05ca
            java.lang.String r1 = (java.lang.String) r1
            int r2 = com.google.android.recaptcha.internal.zzhh.zzx(r1)
            goto L_0x0652
        L_0x05b9:
            r17 = r9
            r16 = r5
            r15 = r3
            boolean r2 = r14.zzO(r15, r16, r17, r18, r19)
            if (r2 == 0) goto L_0x0040
            int r8 = r8 << 3
            java.lang.Object r1 = r7.getObject(r3, r0)
        L_0x05ca:
            com.google.android.recaptcha.internal.zzgw r1 = (com.google.android.recaptcha.internal.zzgw) r1
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r1 = r1.zzd()
            int r0 = X.BEB.A02(r1)
            int r0 = r0 + r1
            int r12 = X.BEB.A02(r8)
            int r12 = r12 + r0
            goto L_0x067b
        L_0x05de:
            r17 = r9
            r16 = r5
            r15 = r3
            boolean r0 = r14.zzO(r15, r16, r17, r18, r19)
            if (r0 == 0) goto L_0x0040
            int r0 = X.BE6.A05(r8)
        L_0x05ed:
            int r12 = r0 + 1
            goto L_0x067b
        L_0x05f1:
            r17 = r9
            r16 = r5
            r15 = r3
            boolean r0 = r14.zzO(r15, r16, r17, r18, r19)
            if (r0 == 0) goto L_0x0040
            int r0 = X.BE6.A05(r8)
            goto L_0x0667
        L_0x0601:
            r17 = r9
            r16 = r5
            r15 = r3
            boolean r0 = r14.zzO(r15, r16, r17, r18, r19)
            if (r0 == 0) goto L_0x0040
            int r0 = X.BE6.A05(r8)
            goto L_0x0679
        L_0x0611:
            r17 = r9
            r16 = r5
            r15 = r3
            boolean r2 = r14.zzO(r15, r16, r17, r18, r19)
            if (r2 == 0) goto L_0x0040
            int r8 = r8 << 3
            int r0 = r7.getInt(r3, r0)
            int r2 = com.google.android.recaptcha.internal.zzhh.zzu(r0)
            goto L_0x0652
        L_0x0627:
            r17 = r9
            r16 = r5
            r15 = r3
            boolean r2 = r14.zzO(r15, r16, r17, r18, r19)
            if (r2 == 0) goto L_0x0040
            int r8 = r8 << 3
            long r0 = r7.getLong(r3, r0)
            int r2 = com.google.android.recaptcha.internal.zzhh.zzz(r0)
            goto L_0x0652
        L_0x063d:
            r17 = r9
            r16 = r5
            r15 = r3
            boolean r2 = r14.zzO(r15, r16, r17, r18, r19)
            if (r2 == 0) goto L_0x0040
            int r8 = r8 << 3
            long r0 = r7.getLong(r3, r0)
            int r2 = com.google.android.recaptcha.internal.zzhh.zzz(r0)
        L_0x0652:
            int r12 = X.BEB.A02(r8)
        L_0x0656:
            int r12 = r12 + r2
            goto L_0x067b
        L_0x0658:
            r17 = r9
            r16 = r5
            r15 = r3
            boolean r0 = r14.zzO(r15, r16, r17, r18, r19)
            if (r0 == 0) goto L_0x0040
            int r0 = X.BE6.A05(r8)
        L_0x0667:
            int r12 = r0 + 4
            goto L_0x067b
        L_0x066a:
            r17 = r9
            r16 = r5
            r15 = r3
            boolean r0 = r14.zzO(r15, r16, r17, r18, r19)
            if (r0 == 0) goto L_0x0040
            int r0 = X.BE6.A05(r8)
        L_0x0679:
            int r12 = r0 + 8
        L_0x067b:
            int r13 = r13 + r12
            goto L_0x0040
        L_0x067e:
            long r0 = (long) r11
            int r18 = r7.getInt(r3, r0)
            goto L_0x0032
        L_0x0685:
            r19 = 0
            goto L_0x0037
        L_0x0689:
            r0 = r3
            com.google.android.recaptcha.internal.zzit r0 = (com.google.android.recaptcha.internal.zzit) r0
            com.google.android.recaptcha.internal.zzlm r0 = r0.zzc
            int r0 = r0.zza()
            int r13 = r13 + r0
            boolean r0 = r14.zzh
            if (r0 == 0) goto L_0x06e1
            com.google.android.recaptcha.internal.zzip r3 = (com.google.android.recaptcha.internal.zzip) r3
            com.google.android.recaptcha.internal.zzij r2 = r3.zzb
            r3 = 0
        L_0x069c:
            com.google.android.recaptcha.internal.zzle r0 = r2.zza
            java.util.List r0 = r0.zzb
            int r1 = r0.size()
            com.google.android.recaptcha.internal.zzle r0 = r2.zza
            if (r4 >= r1) goto L_0x06be
            java.util.Map$Entry r0 = r0.zzg(r4)
            java.lang.Object r1 = r0.getKey()
            com.google.android.recaptcha.internal.zzii r1 = (com.google.android.recaptcha.internal.zzii) r1
            java.lang.Object r0 = r0.getValue()
            int r0 = com.google.android.recaptcha.internal.zzij.zza(r1, r0)
            int r3 = r3 + r0
            int r4 = r4 + 1
            goto L_0x069c
        L_0x06be:
            java.lang.Iterable r0 = r0.zzc()
            java.util.Iterator r2 = r0.iterator()
        L_0x06c6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x06e0
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r2)
            java.lang.Object r1 = r0.getKey()
            com.google.android.recaptcha.internal.zzii r1 = (com.google.android.recaptcha.internal.zzii) r1
            java.lang.Object r0 = r0.getValue()
            int r0 = com.google.android.recaptcha.internal.zzij.zza(r1, r0)
            int r3 = r3 + r0
            goto L_0x06c6
        L_0x06e0:
            int r13 = r13 + r3
        L_0x06e1:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zza(java.lang.Object):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v29, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v33, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v35, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v36, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v37, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v38, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v39, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v41, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v42, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v43, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v44, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v45, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v47, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v48, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v50, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v51, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v52, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v54, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v55, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v56, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v57, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v58, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v59, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v60, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v61, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v62, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v63, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v64, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v65, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v67, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v68, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v69, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v70, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v71, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v73, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v75, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v76, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v77, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v79, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v81, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v82, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v83, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v85, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v86, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v87, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v88, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v89, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v91, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v93, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v94, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v95, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v97, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v99, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v100, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v59, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v101, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v102, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v103, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v104, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v105, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v106, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v107, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v108, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v109, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v110, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v111, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v112, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v113, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v114, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v116, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v118, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v122, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v144, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v123, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v125, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: byte} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x026c, code lost:
        r5 = r18;
        r8 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x027b, code lost:
        r15.putObject(r9, r5, r3.zzc);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02bb, code lost:
        r15.putInt(r9, r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        r0 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        if (r0 == 1048575) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        r15.putInt(r9, (long) r0, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        r3 = r10.zzk;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        if (r3 >= r10.zzl) goto L_0x07e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005e, code lost:
        r1 = r10.zzj;
        r5 = r9;
        r4 = r10;
        zzy(r5, r1[r3], (java.lang.Object) null, r10.zzn, r9);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0601, code lost:
        if (r7 != r1) goto L_0x0811;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0603, code lost:
        r5 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0620, code lost:
        if (r7 != r5) goto L_0x07d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0622, code lost:
        r2 = r7;
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0669, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x066a, code lost:
        r7 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x066b, code lost:
        if (r7 != r2) goto L_0x07d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x066d, code lost:
        r2 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x06be, code lost:
        r15.putObject(r9, r5, r0);
        r15.putInt(r9, r22, r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x06e9, code lost:
        r15.putObject(r9, r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0770, code lost:
        r0 = java.lang.Integer.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0785, code lost:
        r15.putObject(r9, r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0788, code lost:
        r15.putInt(r9, r22, r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x07af, code lost:
        zzK(r9, r18, r12, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x07b4, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0099, code lost:
        r10.zzi(r7.zzb, r14);
        r7 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x07da, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x07e6, code lost:
        r0 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x07e8, code lost:
        if (r35 != 0) goto L_0x07ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x07ea, code lost:
        if (r2 != r0) goto L_0x07f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x07ec, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x07ed, code lost:
        if (r2 > r0) goto L_0x07f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x07f1, code lost:
        if (r13 != r21) goto L_0x07f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x07f3, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x07fa, code lost:
        throw X.BE6.A0Y("Failed to parse the message.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0810, code lost:
        throw X.BE7.A0K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0815, code lost:
        throw X.BE7.A0L();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ea, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0105, code lost:
        r14 = r3.zzc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01f7, code lost:
        r15.putLong(r9, r5, r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzc(java.lang.Object r31, byte[] r32, int r33, int r34, int r35, com.google.android.recaptcha.internal.zzgj r36) {
        /*
            r30 = this;
            r9 = r31
            r7 = r33
            zzD(r9)
            sun.misc.Unsafe r15 = zzb
            r1 = -1
            r5 = -1
            r12 = 0
            r13 = 0
            r8 = 0
            r19 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0011:
            r2 = r7
            r10 = r30
            r29 = r34
            r0 = r29
            r21 = r35
            if (r7 >= r0) goto L_0x004d
            int r2 = r7 + 1
            r4 = r32
            byte r13 = r32[r7]
            r3 = r36
            if (r13 >= 0) goto L_0x002c
            int r2 = com.google.android.recaptcha.internal.zzgk.zzj(r13, r4, r2, r3)
            int r13 = r3.zza
        L_0x002c:
            int r18 = r13 >>> 3
            r6 = 3
            r0 = r18
            if (r0 <= r5) goto L_0x07e0
            int r12 = r12 / r6
            int r5 = r10.zze
            if (r0 < r5) goto L_0x07dd
            int r5 = r10.zzf
            if (r0 > r5) goto L_0x07dd
            int r12 = r10.zzs(r0, r12)
        L_0x0040:
            r14 = 0
            r16 = 0
            if (r12 != r1) goto L_0x013f
            r11 = 1
            r12 = 0
        L_0x0047:
            r0 = r21
            if (r13 != r0) goto L_0x006e
            if (r35 == 0) goto L_0x006e
        L_0x004d:
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r19
            if (r0 == r1) goto L_0x0058
            long r0 = (long) r0
            r15.putInt(r9, r0, r8)
        L_0x0058:
            int r3 = r10.zzk
        L_0x005a:
            int r0 = r10.zzl
            if (r3 >= r0) goto L_0x07e6
            int[] r1 = r10.zzj
            com.google.android.recaptcha.internal.zzll r0 = r10.zzn
            r6 = r1[r3]
            r7 = 0
            r5 = r9
            r4 = r10
            r8 = r0
            r4.zzy(r5, r6, r7, r8, r9)
            int r3 = r3 + 1
            goto L_0x005a
        L_0x006e:
            boolean r0 = r10.zzh
            if (r0 == 0) goto L_0x012b
            com.google.android.recaptcha.internal.zzie r5 = r3.zzd
            com.google.android.recaptcha.internal.zzie r0 = com.google.android.recaptcha.internal.zzie.zza
            if (r5 == r0) goto L_0x012b
            com.google.android.recaptcha.internal.zzke r1 = r10.zzg
            r0 = r18
            com.google.android.recaptcha.internal.zzir r7 = r5.zza(r1, r0)
            if (r7 == 0) goto L_0x012b
            r0 = r9
            com.google.android.recaptcha.internal.zzip r0 = (com.google.android.recaptcha.internal.zzip) r0
            r0.zzi()
            com.google.android.recaptcha.internal.zzij r10 = r0.zzb
            com.google.android.recaptcha.internal.zziq r0 = r7.zzb
            com.google.android.recaptcha.internal.zzmb r1 = r0.zzb
            com.google.android.recaptcha.internal.zzmb r0 = com.google.android.recaptcha.internal.zzmb.ENUM
            if (r1 == r0) goto L_0x0808
            int r0 = r1.ordinal()
            switch(r0) {
                case 0: goto L_0x00a1;
                case 1: goto L_0x00b0;
                case 2: goto L_0x00bf;
                case 3: goto L_0x00bf;
                case 4: goto L_0x00ca;
                case 5: goto L_0x00d5;
                case 6: goto L_0x00e0;
                case 7: goto L_0x00ec;
                case 8: goto L_0x00fc;
                case 9: goto L_0x07fb;
                case 10: goto L_0x07fe;
                case 11: goto L_0x0101;
                case 12: goto L_0x00ca;
                case 13: goto L_0x0801;
                case 14: goto L_0x00e0;
                case 15: goto L_0x00d5;
                case 16: goto L_0x0108;
                case 17: goto L_0x0119;
                default: goto L_0x0099;
            }
        L_0x0099:
            com.google.android.recaptcha.internal.zziq r0 = r7.zzb
            r10.zzi(r0, r14)
            r7 = r2
            goto L_0x07d3
        L_0x00a1:
            int r3 = r2 + 8
            long r0 = X.BEB.A0E(r4, r2)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            java.lang.Double r14 = java.lang.Double.valueOf(r0)
            goto L_0x00ea
        L_0x00b0:
            int r3 = r2 + 4
            int r0 = X.BEB.A09(r4, r2)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.Float r14 = java.lang.Float.valueOf(r0)
            goto L_0x00ea
        L_0x00bf:
            int r2 = com.google.android.recaptcha.internal.zzgk.zzl(r4, r2, r3)
            long r0 = r3.zzb
            java.lang.Long r14 = java.lang.Long.valueOf(r0)
            goto L_0x0099
        L_0x00ca:
            int r2 = com.google.android.recaptcha.internal.zzgk.zzi(r4, r2, r3)
            int r0 = r3.zza
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
            goto L_0x0099
        L_0x00d5:
            int r3 = r2 + 8
            long r0 = X.BEB.A0E(r4, r2)
            java.lang.Long r14 = java.lang.Long.valueOf(r0)
            goto L_0x00ea
        L_0x00e0:
            int r3 = r2 + 4
            int r0 = X.BEB.A09(r4, r2)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
        L_0x00ea:
            r2 = r3
            goto L_0x0099
        L_0x00ec:
            int r2 = com.google.android.recaptcha.internal.zzgk.zzl(r4, r2, r3)
            long r0 = r3.zzb
            int r3 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r3 != 0) goto L_0x00f7
            r11 = 0
        L_0x00f7:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r11)
            goto L_0x0099
        L_0x00fc:
            int r2 = com.google.android.recaptcha.internal.zzgk.zzg(r4, r2, r3)
            goto L_0x0105
        L_0x0101:
            int r2 = com.google.android.recaptcha.internal.zzgk.zza(r4, r2, r3)
        L_0x0105:
            java.lang.Object r14 = r3.zzc
            goto L_0x0099
        L_0x0108:
            int r2 = com.google.android.recaptcha.internal.zzgk.zzi(r4, r2, r3)
            int r1 = r3.zza
            r0 = r1 & 1
            int r1 = r1 >>> 1
            int r0 = -r0
            r1 = r1 ^ r0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r1)
            goto L_0x0099
        L_0x0119:
            int r2 = com.google.android.recaptcha.internal.zzgk.zzl(r4, r2, r3)
            long r3 = r3.zzb
            r0 = 1
            long r0 = r0 & r3
            long r3 = r3 >>> r11
            long r5 = -r0
            long r3 = r3 ^ r5
            java.lang.Long r14 = java.lang.Long.valueOf(r3)
            goto L_0x0099
        L_0x012b:
            com.google.android.recaptcha.internal.zzlm r24 = zzd(r9)
            r21 = r4
            r23 = r29
            r25 = r3
            r20 = r13
            r22 = r2
            int r7 = com.google.android.recaptcha.internal.zzgk.zzh(r20, r21, r22, r23, r24, r25)
            goto L_0x07d3
        L_0x013f:
            r7 = r13 & 7
            int[] r0 = r10.zzc
            r20 = r0
            int r0 = r12 + 1
            r11 = r20[r0]
            int r0 = r11 >>> 20
            r0 = r0 & 255(0xff, float:3.57E-43)
            r26 = r0
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r11 & r25
            long r5 = (long) r0
            java.lang.String r24 = ""
            r0 = 17
            r1 = r0
            r0 = r26
            if (r0 > r1) goto L_0x02c7
            int r0 = r12 + 2
            r23 = r20[r0]
            int r0 = r23 >>> 20
            r22 = 1
            int r20 = r22 << r0
            r23 = r23 & r25
            r1 = r19
            r0 = r23
            if (r0 == r1) goto L_0x0181
            r0 = r25
            if (r1 == r0) goto L_0x0178
            long r0 = (long) r1
            r15.putInt(r9, r0, r8)
        L_0x0178:
            r1 = r25
            r0 = r23
            if (r0 != r1) goto L_0x02c0
            r8 = 0
        L_0x017f:
            r19 = r23
        L_0x0181:
            switch(r26) {
                case 0: goto L_0x01ab;
                case 1: goto L_0x01c0;
                case 2: goto L_0x01d4;
                case 3: goto L_0x01d4;
                case 4: goto L_0x01df;
                case 5: goto L_0x01eb;
                case 6: goto L_0x0203;
                case 7: goto L_0x0210;
                case 8: goto L_0x0225;
                case 9: goto L_0x024e;
                case 10: goto L_0x0272;
                case 11: goto L_0x01df;
                case 12: goto L_0x0282;
                case 13: goto L_0x0203;
                case 14: goto L_0x01eb;
                case 15: goto L_0x02ab;
                case 16: goto L_0x07b7;
                default: goto L_0x0184;
            }
        L_0x0184:
            r0 = 3
            if (r7 != r0) goto L_0x07da
            r8 = r8 | r20
            java.lang.Object r0 = r10.zzA(r9, r12)
            int r1 = r18 << 3
            r25 = r1 | 4
            com.google.android.recaptcha.internal.zzkr r21 = r10.zzx(r12)
            r5 = r18
            r22 = r4
            r24 = r29
            r26 = r3
            r23 = r2
            r20 = r0
            int r7 = com.google.android.recaptcha.internal.zzgk.zzm(r20, r21, r22, r23, r24, r25, r26)
            r10.zzJ(r9, r12, r0)
        L_0x01a8:
            r1 = -1
            goto L_0x0011
        L_0x01ab:
            r0 = r22
            if (r7 != r0) goto L_0x07da
            int r7 = r2 + 8
            r8 = r8 | r20
            long r0 = X.BEB.A0E(r4, r2)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.recaptcha.internal.zzlv.zzo(r9, r5, r0)
            goto L_0x07d3
        L_0x01c0:
            r0 = 5
            if (r7 != r0) goto L_0x07da
            int r7 = r2 + 4
            r8 = r8 | r20
            int r0 = X.BEB.A09(r4, r2)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.recaptcha.internal.zzlv.zzp(r9, r5, r0)
            goto L_0x07d3
        L_0x01d4:
            if (r7 != 0) goto L_0x07da
            r20 = r20 | r8
            int r7 = com.google.android.recaptcha.internal.zzgk.zzl(r4, r2, r3)
            long r0 = r3.zzb
            goto L_0x01f7
        L_0x01df:
            if (r7 != 0) goto L_0x07da
            r8 = r8 | r20
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r4, r2, r3)
            int r2 = r3.zza
            goto L_0x02bb
        L_0x01eb:
            r0 = r22
            if (r7 != r0) goto L_0x07da
            int r7 = r2 + 8
            r20 = r20 | r8
            long r0 = X.BEB.A0E(r4, r2)
        L_0x01f7:
            r21 = r15
            r22 = r9
            r23 = r5
            r25 = r0
            r21.putLong(r22, r23, r25)
            goto L_0x026c
        L_0x0203:
            r0 = 5
            if (r7 != r0) goto L_0x07da
            int r7 = r2 + 4
            r8 = r8 | r20
            int r2 = X.BEB.A09(r4, r2)
            goto L_0x02bb
        L_0x0210:
            if (r7 != 0) goto L_0x07da
            r8 = r8 | r20
            int r7 = com.google.android.recaptcha.internal.zzgk.zzl(r4, r2, r3)
            long r0 = r3.zzb
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1O(r2)
            com.google.android.recaptcha.internal.zzlv.zzm(r9, r5, r0)
            goto L_0x07d3
        L_0x0225:
            r0 = 2
            if (r7 != r0) goto L_0x07da
            boolean r0 = zzM(r11)
            if (r0 == 0) goto L_0x0247
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r4, r2, r3)
            int r1 = r3.zza
            if (r1 < 0) goto L_0x080c
            r8 = r8 | r20
            if (r1 != 0) goto L_0x023f
            r0 = r24
            r3.zzc = r0
            goto L_0x027b
        L_0x023f:
            java.lang.String r0 = com.google.android.recaptcha.internal.zzma.zzd(r4, r7, r1)
            r3.zzc = r0
            int r7 = r7 + r1
            goto L_0x027b
        L_0x0247:
            r8 = r8 | r20
            int r7 = com.google.android.recaptcha.internal.zzgk.zzg(r4, r2, r3)
            goto L_0x027b
        L_0x024e:
            r0 = 2
            if (r7 != r0) goto L_0x07da
            r20 = r20 | r8
            java.lang.Object r0 = r10.zzA(r9, r12)
            com.google.android.recaptcha.internal.zzkr r22 = r10.zzx(r12)
            r23 = r4
            r25 = r29
            r26 = r3
            r21 = r0
            r24 = r2
            int r7 = com.google.android.recaptcha.internal.zzgk.zzn(r21, r22, r23, r24, r25, r26)
            r10.zzJ(r9, r12, r0)
        L_0x026c:
            r5 = r18
            r8 = r20
            goto L_0x01a8
        L_0x0272:
            r0 = 2
            if (r7 != r0) goto L_0x07da
            r8 = r8 | r20
            int r7 = com.google.android.recaptcha.internal.zzgk.zza(r4, r2, r3)
        L_0x027b:
            java.lang.Object r0 = r3.zzc
            r15.putObject(r9, r5, r0)
            goto L_0x07d3
        L_0x0282:
            if (r7 != 0) goto L_0x07da
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r4, r2, r3)
            int r2 = r3.zza
            com.google.android.recaptcha.internal.zzix r1 = r10.zzw(r12)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = r11 & r0
            if (r11 == 0) goto L_0x02a8
            if (r1 == 0) goto L_0x02a8
            boolean r0 = r1.zza(r2)
            if (r0 != 0) goto L_0x02a8
            com.google.android.recaptcha.internal.zzlm r1 = zzd(r9)
            java.lang.Long r0 = X.C17880vN.A0n(r2)
            r1.zzj(r13, r0)
            goto L_0x07d3
        L_0x02a8:
            r8 = r8 | r20
            goto L_0x02bb
        L_0x02ab:
            if (r7 != 0) goto L_0x07da
            r8 = r8 | r20
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r4, r2, r3)
            int r1 = r3.zza
            r0 = r1 & 1
            int r2 = r1 >>> 1
            int r0 = -r0
            r2 = r2 ^ r0
        L_0x02bb:
            r15.putInt(r9, r5, r2)
            goto L_0x07d3
        L_0x02c0:
            long r0 = (long) r0
            int r8 = r15.getInt(r9, r0)
            goto L_0x017f
        L_0x02c7:
            r0 = 27
            r1 = r0
            r0 = r26
            if (r0 != r1) goto L_0x0300
            r0 = 2
            if (r7 != r0) goto L_0x07d7
            java.lang.Object r0 = r15.getObject(r9, r5)
            com.google.android.recaptcha.internal.zzjb r0 = (com.google.android.recaptcha.internal.zzjb) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x02e8
            int r1 = X.BEA.A0B(r0)
            com.google.android.recaptcha.internal.zzjb r0 = r0.zzd(r1)
            r15.putObject(r9, r5, r0)
        L_0x02e8:
            com.google.android.recaptcha.internal.zzkr r20 = r10.zzx(r12)
            r5 = r18
            r22 = r4
            r24 = r29
            r26 = r3
            r21 = r13
            r23 = r2
            r25 = r0
            int r7 = com.google.android.recaptcha.internal.zzgk.zze(r20, r21, r22, r23, r24, r25, r26)
            goto L_0x01a8
        L_0x0300:
            r0 = 49
            r1 = r0
            r0 = r26
            if (r0 > r1) goto L_0x063c
            long r0 = (long) r11
            r22 = r0
            java.lang.Object r0 = r15.getObject(r9, r5)
            com.google.android.recaptcha.internal.zzjb r0 = (com.google.android.recaptcha.internal.zzjb) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x0321
            int r1 = X.BEA.A0B(r0)
            com.google.android.recaptcha.internal.zzjb r0 = r0.zzd(r1)
            r15.putObject(r9, r5, r0)
        L_0x0321:
            switch(r26) {
                case 18: goto L_0x036b;
                case 19: goto L_0x03b3;
                case 20: goto L_0x03fb;
                case 21: goto L_0x03fb;
                case 22: goto L_0x034e;
                case 23: goto L_0x0431;
                case 24: goto L_0x046d;
                case 25: goto L_0x04a9;
                case 26: goto L_0x04eb;
                case 27: goto L_0x0324;
                case 28: goto L_0x0549;
                case 29: goto L_0x034e;
                case 30: goto L_0x0605;
                case 31: goto L_0x046d;
                case 32: goto L_0x0431;
                case 33: goto L_0x0581;
                case 34: goto L_0x05c3;
                case 35: goto L_0x036b;
                case 36: goto L_0x03b3;
                case 37: goto L_0x03fb;
                case 38: goto L_0x03fb;
                case 39: goto L_0x034e;
                case 40: goto L_0x0431;
                case 41: goto L_0x046d;
                case 42: goto L_0x04a9;
                case 43: goto L_0x034e;
                case 44: goto L_0x0605;
                case 45: goto L_0x046d;
                case 46: goto L_0x0431;
                case 47: goto L_0x0581;
                case 48: goto L_0x05c3;
                default: goto L_0x0324;
            }
        L_0x0324:
            r1 = 3
            if (r7 != r1) goto L_0x0639
            r1 = r13 & -8
            r26 = r1 | 4
            com.google.android.recaptcha.internal.zzkr r22 = r10.zzx(r12)
            r5 = r2
        L_0x0330:
            r23 = r4
            r25 = r29
            r27 = r3
            r24 = r2
            int r7 = com.google.android.recaptcha.internal.zzgk.zzc(r22, r23, r24, r25, r26, r27)
            java.lang.Object r1 = r3.zzc
            r0.add(r1)
            r1 = r29
            if (r7 >= r1) goto L_0x0620
            int r2 = com.google.android.recaptcha.internal.zzgk.zzi(r4, r7, r3)
            int r1 = r3.zza
            if (r13 != r1) goto L_0x0620
            goto L_0x0330
        L_0x034e:
            r1 = 2
            if (r7 != r1) goto L_0x0357
            int r7 = com.google.android.recaptcha.internal.zzgk.zzf(r4, r2, r0, r3)
            goto L_0x0603
        L_0x0357:
            if (r7 != 0) goto L_0x0639
            r23 = r4
            r25 = r29
            r27 = r3
            r22 = r13
            r24 = r2
            r26 = r0
            int r7 = com.google.android.recaptcha.internal.zzgk.zzk(r22, r23, r24, r25, r26, r27)
            goto L_0x0603
        L_0x036b:
            r5 = 2
            r1 = 1
            if (r7 != r5) goto L_0x0388
            com.google.android.recaptcha.internal.zzhy r0 = (com.google.android.recaptcha.internal.zzhy) r0
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r4, r2, r3)
            int r1 = r3.zza
            int r1 = r1 + r7
        L_0x0378:
            if (r7 >= r1) goto L_0x0601
            long r5 = X.BEB.A0E(r4, r7)
            double r5 = java.lang.Double.longBitsToDouble(r5)
            r0.zze(r5)
            int r7 = r7 + 8
            goto L_0x0378
        L_0x0388:
            if (r7 != r1) goto L_0x0639
            int r7 = r2 + 8
            com.google.android.recaptcha.internal.zzhy r0 = (com.google.android.recaptcha.internal.zzhy) r0
            long r5 = X.BEB.A0E(r4, r2)
            double r5 = java.lang.Double.longBitsToDouble(r5)
            r0.zze(r5)
        L_0x0399:
            r1 = r29
            if (r7 >= r1) goto L_0x0603
            int r1 = com.google.android.recaptcha.internal.zzgk.zzi(r4, r7, r3)
            int r5 = r3.zza
            if (r13 != r5) goto L_0x0603
            long r5 = X.BEB.A0E(r4, r1)
            double r5 = java.lang.Double.longBitsToDouble(r5)
            r0.zze(r5)
            int r7 = r1 + 8
            goto L_0x0399
        L_0x03b3:
            r1 = 2
            if (r7 != r1) goto L_0x03cf
            com.google.android.recaptcha.internal.zzil r0 = (com.google.android.recaptcha.internal.zzil) r0
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r4, r2, r3)
            int r1 = r3.zza
            int r1 = r1 + r7
        L_0x03bf:
            if (r7 >= r1) goto L_0x0601
            int r5 = X.BEB.A09(r4, r7)
            float r5 = java.lang.Float.intBitsToFloat(r5)
            r0.zze(r5)
            int r7 = r7 + 4
            goto L_0x03bf
        L_0x03cf:
            r1 = 5
            if (r7 != r1) goto L_0x0639
            int r7 = r2 + 4
            com.google.android.recaptcha.internal.zzil r0 = (com.google.android.recaptcha.internal.zzil) r0
            int r1 = X.BEB.A09(r4, r2)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r0.zze(r1)
        L_0x03e1:
            r1 = r29
            if (r7 >= r1) goto L_0x0603
            int r5 = com.google.android.recaptcha.internal.zzgk.zzi(r4, r7, r3)
            int r1 = r3.zza
            if (r13 != r1) goto L_0x0603
            int r1 = X.BEB.A09(r4, r5)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r0.zze(r1)
            int r7 = r5 + 4
            goto L_0x03e1
        L_0x03fb:
            r1 = 2
            if (r7 != r1) goto L_0x0413
            com.google.android.recaptcha.internal.zzjt r0 = (com.google.android.recaptcha.internal.zzjt) r0
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r4, r2, r3)
            int r1 = r3.zza
            int r1 = r1 + r7
        L_0x0407:
            if (r7 >= r1) goto L_0x0601
            int r7 = com.google.android.recaptcha.internal.zzgk.zzl(r4, r7, r3)
            long r5 = r3.zzb
            r0.zzg(r5)
            goto L_0x0407
        L_0x0413:
            if (r7 != 0) goto L_0x0639
            com.google.android.recaptcha.internal.zzjt r0 = (com.google.android.recaptcha.internal.zzjt) r0
            int r7 = com.google.android.recaptcha.internal.zzgk.zzl(r4, r2, r3)
        L_0x041b:
            long r5 = r3.zzb
            r0.zzg(r5)
            r1 = r29
            if (r7 >= r1) goto L_0x0603
            int r5 = com.google.android.recaptcha.internal.zzgk.zzi(r4, r7, r3)
            int r1 = r3.zza
            if (r13 != r1) goto L_0x0603
            int r7 = com.google.android.recaptcha.internal.zzgk.zzl(r4, r5, r3)
            goto L_0x041b
        L_0x0431:
            r5 = 1
            r1 = 2
            if (r7 != r1) goto L_0x044a
            com.google.android.recaptcha.internal.zzjt r0 = (com.google.android.recaptcha.internal.zzjt) r0
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r4, r2, r3)
            int r1 = r3.zza
            int r1 = r1 + r7
        L_0x043e:
            if (r7 >= r1) goto L_0x0601
            long r5 = X.BEB.A0E(r4, r7)
            r0.zzg(r5)
            int r7 = r7 + 8
            goto L_0x043e
        L_0x044a:
            if (r7 != r5) goto L_0x0639
            int r7 = r2 + 8
            com.google.android.recaptcha.internal.zzjt r0 = (com.google.android.recaptcha.internal.zzjt) r0
            long r5 = X.BEB.A0E(r4, r2)
            r0.zzg(r5)
        L_0x0457:
            r1 = r29
            if (r7 >= r1) goto L_0x0603
            int r1 = com.google.android.recaptcha.internal.zzgk.zzi(r4, r7, r3)
            int r5 = r3.zza
            if (r13 != r5) goto L_0x0603
            long r5 = X.BEB.A0E(r4, r1)
            r0.zzg(r5)
            int r7 = r1 + 8
            goto L_0x0457
        L_0x046d:
            r1 = 2
            if (r7 != r1) goto L_0x0485
            com.google.android.recaptcha.internal.zziu r0 = (com.google.android.recaptcha.internal.zziu) r0
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r4, r2, r3)
            int r1 = r3.zza
            int r1 = r1 + r7
        L_0x0479:
            if (r7 >= r1) goto L_0x0601
            int r5 = X.BEB.A09(r4, r7)
            r0.zzg(r5)
            int r7 = r7 + 4
            goto L_0x0479
        L_0x0485:
            r1 = 5
            if (r7 != r1) goto L_0x0639
            int r7 = r2 + 4
            com.google.android.recaptcha.internal.zziu r0 = (com.google.android.recaptcha.internal.zziu) r0
            int r1 = X.BEB.A09(r4, r2)
            r0.zzg(r1)
        L_0x0493:
            r1 = r29
            if (r7 >= r1) goto L_0x0603
            int r5 = com.google.android.recaptcha.internal.zzgk.zzi(r4, r7, r3)
            int r1 = r3.zza
            if (r13 != r1) goto L_0x0603
            int r1 = X.BEB.A09(r4, r5)
            r0.zzg(r1)
            int r7 = r5 + 4
            goto L_0x0493
        L_0x04a9:
            r1 = 2
            if (r7 != r1) goto L_0x04c7
            com.google.android.recaptcha.internal.zzgl r0 = (com.google.android.recaptcha.internal.zzgl) r0
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r4, r2, r3)
            int r1 = r3.zza
            int r1 = r1 + r7
        L_0x04b5:
            if (r7 >= r1) goto L_0x0601
            int r7 = com.google.android.recaptcha.internal.zzgk.zzl(r4, r7, r3)
            long r5 = r3.zzb
            int r11 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            boolean r5 = X.AnonymousClass000.A1O(r11)
            r0.zze(r5)
            goto L_0x04b5
        L_0x04c7:
            if (r7 != 0) goto L_0x0639
            com.google.android.recaptcha.internal.zzgl r0 = (com.google.android.recaptcha.internal.zzgl) r0
            int r7 = com.google.android.recaptcha.internal.zzgk.zzl(r4, r2, r3)
        L_0x04cf:
            long r5 = r3.zzb
            int r1 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r1)
            r0.zze(r1)
            r1 = r29
            if (r7 >= r1) goto L_0x0603
            int r5 = com.google.android.recaptcha.internal.zzgk.zzi(r4, r7, r3)
            int r1 = r3.zza
            if (r13 != r1) goto L_0x0603
            int r7 = com.google.android.recaptcha.internal.zzgk.zzl(r4, r5, r3)
            goto L_0x04cf
        L_0x04eb:
            r1 = 2
            if (r7 != r1) goto L_0x0639
            r5 = 536870912(0x20000000, double:2.652494739E-315)
            long r22 = r22 & r5
            int r1 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r4, r2, r3)
            if (r1 != 0) goto L_0x0535
        L_0x04fb:
            int r5 = r3.zza
            if (r5 < 0) goto L_0x080c
            if (r5 != 0) goto L_0x0517
            r1 = r24
            r0.add(r1)
        L_0x0506:
            r1 = r29
            if (r7 >= r1) goto L_0x0603
            int r5 = com.google.android.recaptcha.internal.zzgk.zzi(r4, r7, r3)
            int r1 = r3.zza
            if (r13 != r1) goto L_0x0603
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r4, r5, r3)
            goto L_0x04fb
        L_0x0517:
            java.nio.charset.Charset r1 = com.google.android.recaptcha.internal.zzjc.zzb
            X.BE8.A1H(r1, r0, r4, r7, r5)
            int r7 = r7 + r5
            goto L_0x0506
        L_0x051e:
            if (r6 != 0) goto L_0x053a
            r1 = r24
            r0.add(r1)
        L_0x0525:
            r1 = r29
            if (r7 >= r1) goto L_0x0603
            int r5 = com.google.android.recaptcha.internal.zzgk.zzi(r4, r7, r3)
            int r1 = r3.zza
            if (r13 != r1) goto L_0x0603
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r4, r5, r3)
        L_0x0535:
            int r6 = r3.zza
            if (r6 < 0) goto L_0x080c
            goto L_0x051e
        L_0x053a:
            int r5 = r7 + r6
            boolean r1 = com.google.android.recaptcha.internal.zzma.zzf(r4, r7, r5)
            if (r1 == 0) goto L_0x0816
            java.nio.charset.Charset r1 = com.google.android.recaptcha.internal.zzjc.zzb
            X.BE8.A1H(r1, r0, r4, r7, r6)
            r7 = r5
            goto L_0x0525
        L_0x0549:
            r1 = 2
            if (r7 != r1) goto L_0x0639
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r4, r2, r3)
            int r5 = r3.zza
            if (r5 < 0) goto L_0x080c
            int r6 = r4.length
        L_0x0555:
            int r1 = r6 - r7
            if (r5 > r1) goto L_0x0811
            if (r5 != 0) goto L_0x0575
            com.google.android.recaptcha.internal.zzgw r1 = com.google.android.recaptcha.internal.zzgw.zzb
            r0.add(r1)
        L_0x0560:
            r1 = r29
            if (r7 >= r1) goto L_0x057e
            int r5 = com.google.android.recaptcha.internal.zzgk.zzi(r4, r7, r3)
            int r1 = r3.zza
            if (r13 != r1) goto L_0x057e
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r4, r5, r3)
            int r5 = r3.zza
            if (r5 < 0) goto L_0x080c
            goto L_0x0555
        L_0x0575:
            com.google.android.recaptcha.internal.zzgw r1 = com.google.android.recaptcha.internal.zzgw.zzm(r4, r7, r5)
            r0.add(r1)
            int r7 = r7 + r5
            goto L_0x0560
        L_0x057e:
            r5 = r2
            goto L_0x0620
        L_0x0581:
            r1 = 2
            if (r7 != r1) goto L_0x059f
            com.google.android.recaptcha.internal.zziu r0 = (com.google.android.recaptcha.internal.zziu) r0
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r4, r2, r3)
            int r1 = r3.zza
            int r1 = r1 + r7
        L_0x058d:
            if (r7 >= r1) goto L_0x0601
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r4, r7, r3)
            int r6 = r3.zza
            r5 = r6 & 1
            int r6 = r6 >>> 1
            int r5 = -r5
            r6 = r6 ^ r5
            r0.zzg(r6)
            goto L_0x058d
        L_0x059f:
            if (r7 != 0) goto L_0x0639
            com.google.android.recaptcha.internal.zziu r0 = (com.google.android.recaptcha.internal.zziu) r0
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r4, r2, r3)
        L_0x05a7:
            int r5 = r3.zza
            r1 = r5 & 1
            int r5 = r5 >>> 1
            int r1 = -r1
            r5 = r5 ^ r1
            r0.zzg(r5)
            r1 = r29
            if (r7 >= r1) goto L_0x0603
            int r5 = com.google.android.recaptcha.internal.zzgk.zzi(r4, r7, r3)
            int r1 = r3.zza
            if (r13 != r1) goto L_0x0603
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r4, r5, r3)
            goto L_0x05a7
        L_0x05c3:
            r1 = 2
            if (r7 != r1) goto L_0x05df
            com.google.android.recaptcha.internal.zzjt r0 = (com.google.android.recaptcha.internal.zzjt) r0
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r4, r2, r3)
            int r1 = r3.zza
            int r1 = r1 + r7
        L_0x05cf:
            if (r7 >= r1) goto L_0x0601
            int r7 = com.google.android.recaptcha.internal.zzgk.zzl(r4, r7, r3)
            long r5 = r3.zzb
            long r5 = X.BEA.A0H(r5)
            r0.zzg(r5)
            goto L_0x05cf
        L_0x05df:
            if (r7 != 0) goto L_0x0639
            com.google.android.recaptcha.internal.zzjt r0 = (com.google.android.recaptcha.internal.zzjt) r0
            int r7 = com.google.android.recaptcha.internal.zzgk.zzl(r4, r2, r3)
        L_0x05e7:
            long r5 = r3.zzb
            long r5 = X.BEA.A0H(r5)
            r0.zzg(r5)
            r1 = r29
            if (r7 >= r1) goto L_0x0603
            int r5 = com.google.android.recaptcha.internal.zzgk.zzi(r4, r7, r3)
            int r1 = r3.zza
            if (r13 != r1) goto L_0x0603
            int r7 = com.google.android.recaptcha.internal.zzgk.zzl(r4, r5, r3)
            goto L_0x05e7
        L_0x0601:
            if (r7 != r1) goto L_0x0811
        L_0x0603:
            r5 = r2
            goto L_0x0620
        L_0x0605:
            r1 = 2
            if (r7 != r1) goto L_0x0626
            int r7 = com.google.android.recaptcha.internal.zzgk.zzf(r4, r2, r0, r3)
        L_0x060c:
            com.google.android.recaptcha.internal.zzix r25 = r10.zzw(r12)
            com.google.android.recaptcha.internal.zzll r1 = r10.zzn
            r22 = r9
            r23 = r18
            r24 = r0
            r26 = r14
            r27 = r1
            com.google.android.recaptcha.internal.zzkt.zzo(r22, r23, r24, r25, r26, r27)
            r5 = r2
        L_0x0620:
            if (r7 != r5) goto L_0x07d3
            r2 = r7
            r11 = 1
            goto L_0x0047
        L_0x0626:
            if (r7 != 0) goto L_0x0639
            r23 = r4
            r25 = r29
            r27 = r3
            r22 = r13
            r24 = r2
            r26 = r0
            int r7 = com.google.android.recaptcha.internal.zzgk.zzk(r22, r23, r24, r25, r26, r27)
            goto L_0x060c
        L_0x0639:
            r5 = r2
            r7 = r2
            goto L_0x0620
        L_0x063c:
            r0 = 50
            r1 = r0
            r0 = r26
            if (r0 != r1) goto L_0x065d
            r0 = 2
            if (r7 != r0) goto L_0x07d7
            java.lang.Object r1 = r15.getObject(r9, r5)
            boolean r0 = com.google.android.recaptcha.internal.zzjz.zza(r1)
            if (r0 == 0) goto L_0x065c
            com.google.android.recaptcha.internal.zzjy r0 = com.google.android.recaptcha.internal.zzjy.zza
            com.google.android.recaptcha.internal.zzjy r0 = r0.zzb()
            com.google.android.recaptcha.internal.zzjz.zzb(r0, r1)
            r15.putObject(r9, r5, r0)
        L_0x065c:
            throw r14
        L_0x065d:
            int r0 = r12 + 2
            r0 = r20[r0]
            r0 = r0 & r25
            long r0 = (long) r0
            r22 = r0
            switch(r26) {
                case 51: goto L_0x0670;
                case 52: goto L_0x0682;
                case 53: goto L_0x0695;
                case 54: goto L_0x0695;
                case 55: goto L_0x06a3;
                case 56: goto L_0x06b1;
                case 57: goto L_0x06c9;
                case 58: goto L_0x06d7;
                case 59: goto L_0x06ee;
                case 60: goto L_0x0719;
                case 61: goto L_0x0735;
                case 62: goto L_0x06a3;
                case 63: goto L_0x0742;
                case 64: goto L_0x06c9;
                case 65: goto L_0x06b1;
                case 66: goto L_0x0762;
                case 67: goto L_0x0775;
                case 68: goto L_0x0790;
                default: goto L_0x0669;
            }
        L_0x0669:
            r11 = 1
        L_0x066a:
            r7 = r2
        L_0x066b:
            if (r7 != r2) goto L_0x07d3
            r2 = r7
            goto L_0x0047
        L_0x0670:
            r11 = 1
            if (r7 != r11) goto L_0x066a
            int r7 = r2 + 8
            long r0 = X.BEB.A0E(r4, r2)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            goto L_0x06be
        L_0x0682:
            r11 = 1
            r0 = 5
            if (r7 != r0) goto L_0x066a
            int r7 = r2 + 4
            int r0 = X.BEB.A09(r4, r2)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L_0x06be
        L_0x0695:
            r11 = 1
            if (r7 != 0) goto L_0x066a
            int r7 = com.google.android.recaptcha.internal.zzgk.zzl(r4, r2, r3)
            long r0 = r3.zzb
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x06be
        L_0x06a3:
            r11 = 1
            if (r7 != 0) goto L_0x066a
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r4, r2, r3)
            int r0 = r3.zza
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x06be
        L_0x06b1:
            r11 = 1
            if (r7 != r11) goto L_0x066a
            int r7 = r2 + 8
            long r0 = X.BEB.A0E(r4, r2)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x06be:
            r15.putObject(r9, r5, r0)
            r0 = r22
            r5 = r18
            r15.putInt(r9, r0, r5)
            goto L_0x066b
        L_0x06c9:
            r0 = 5
            if (r7 != r0) goto L_0x0669
            int r7 = r2 + 4
            int r0 = X.BEB.A09(r4, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x06e9
        L_0x06d7:
            if (r7 != 0) goto L_0x0669
            int r7 = com.google.android.recaptcha.internal.zzgk.zzl(r4, r2, r3)
            long r0 = r3.zzb
            int r11 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1O(r11)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x06e9:
            r15.putObject(r9, r5, r0)
            goto L_0x0788
        L_0x06ee:
            r0 = 2
            if (r7 != r0) goto L_0x0669
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r4, r2, r3)
            int r1 = r3.zza
            if (r1 != 0) goto L_0x0700
            r0 = r24
            r15.putObject(r9, r5, r0)
            goto L_0x0788
        L_0x0700:
            int r0 = r7 + r1
            r20 = 536870912(0x20000000, float:1.0842022E-19)
            r11 = r11 & r20
            if (r11 == 0) goto L_0x070e
            boolean r11 = com.google.android.recaptcha.internal.zzma.zzf(r4, r7, r0)
            if (r11 == 0) goto L_0x0816
        L_0x070e:
            java.nio.charset.Charset r11 = com.google.android.recaptcha.internal.zzjc.zzb
            java.lang.String r1 = X.BE6.A0r(r11, r4, r7, r1)
            r15.putObject(r9, r5, r1)
            r7 = r0
            goto L_0x0788
        L_0x0719:
            r0 = 2
            if (r7 != r0) goto L_0x0669
            r0 = r18
            java.lang.Object r0 = r10.zzB(r9, r0, r12)
            com.google.android.recaptcha.internal.zzkr r23 = r10.zzx(r12)
            r24 = r4
            r26 = r29
            r27 = r3
            r25 = r2
            r22 = r0
            int r7 = com.google.android.recaptcha.internal.zzgk.zzn(r22, r23, r24, r25, r26, r27)
            goto L_0x07af
        L_0x0735:
            r0 = 2
            if (r7 != r0) goto L_0x0669
            int r7 = com.google.android.recaptcha.internal.zzgk.zza(r4, r2, r3)
            java.lang.Object r0 = r3.zzc
            r15.putObject(r9, r5, r0)
            goto L_0x0788
        L_0x0742:
            if (r7 != 0) goto L_0x0669
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r4, r2, r3)
            int r1 = r3.zza
            com.google.android.recaptcha.internal.zzix r0 = r10.zzw(r12)
            if (r0 == 0) goto L_0x0770
            boolean r0 = r0.zza(r1)
            if (r0 != 0) goto L_0x0770
            com.google.android.recaptcha.internal.zzlm r5 = zzd(r9)
            java.lang.Long r0 = X.C17880vN.A0n(r1)
            r5.zzj(r13, r0)
            goto L_0x07b4
        L_0x0762:
            if (r7 != 0) goto L_0x0669
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r4, r2, r3)
            int r1 = r3.zza
            r0 = r1 & 1
            int r1 = r1 >>> 1
            int r0 = -r0
            r1 = r1 ^ r0
        L_0x0770:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x0785
        L_0x0775:
            if (r7 != 0) goto L_0x0669
            int r7 = com.google.android.recaptcha.internal.zzgk.zzl(r4, r2, r3)
            long r0 = r3.zzb
            long r0 = X.BEA.A0H(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x0785:
            r15.putObject(r9, r5, r0)
        L_0x0788:
            r0 = r22
            r5 = r18
            r15.putInt(r9, r0, r5)
            goto L_0x07b4
        L_0x0790:
            r0 = 3
            if (r7 != r0) goto L_0x0669
            r0 = r13 & -8
            r27 = r0 | 4
            r0 = r18
            java.lang.Object r0 = r10.zzB(r9, r0, r12)
            com.google.android.recaptcha.internal.zzkr r23 = r10.zzx(r12)
            r24 = r4
            r26 = r29
            r28 = r3
            r25 = r2
            r22 = r0
            int r7 = com.google.android.recaptcha.internal.zzgk.zzm(r22, r23, r24, r25, r26, r27, r28)
        L_0x07af:
            r1 = r18
            r10.zzK(r9, r1, r12, r0)
        L_0x07b4:
            r11 = 1
            goto L_0x066b
        L_0x07b7:
            if (r7 != 0) goto L_0x07da
            r8 = r8 | r20
            int r7 = com.google.android.recaptcha.internal.zzgk.zzl(r4, r2, r3)
            long r2 = r3.zzb
            r0 = 1
            long r0 = r0 & r2
            long r2 = r2 >>> r22
            long r10 = -r0
            long r2 = r2 ^ r10
            r20 = r15
            r21 = r9
            r22 = r5
            r24 = r2
            r20.putLong(r21, r22, r24)
        L_0x07d3:
            r5 = r18
            goto L_0x01a8
        L_0x07d7:
            r11 = 1
            goto L_0x0047
        L_0x07da:
            r11 = 1
            goto L_0x0047
        L_0x07dd:
            r12 = -1
            goto L_0x0040
        L_0x07e0:
            int r12 = r10.zzq(r0)
            goto L_0x0040
        L_0x07e6:
            r0 = r29
            if (r35 != 0) goto L_0x07ed
            if (r2 != r0) goto L_0x07f4
            return r2
        L_0x07ed:
            if (r2 > r0) goto L_0x07f4
            r0 = r21
            if (r13 != r0) goto L_0x07f4
            return r2
        L_0x07f4:
            java.lang.String r0 = "Failed to parse the message."
            com.google.android.recaptcha.internal.zzje r0 = X.BE6.A0Y(r0)
            throw r0
        L_0x07fb:
            int r0 = com.google.android.recaptcha.internal.zzkn.zza
            throw r14
        L_0x07fe:
            int r0 = com.google.android.recaptcha.internal.zzkn.zza
            throw r14
        L_0x0801:
            java.lang.String r0 = "Shouldn't reach here."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0808:
            com.google.android.recaptcha.internal.zzgk.zzi(r4, r2, r3)
            throw r14
        L_0x080c:
            com.google.android.recaptcha.internal.zzje r0 = X.BE7.A0K()
            throw r0
        L_0x0811:
            com.google.android.recaptcha.internal.zzje r0 = X.BE7.A0L()
            throw r0
        L_0x0816:
            java.lang.String r0 = "Protocol message had invalid UTF-8."
            com.google.android.recaptcha.internal.zzje r0 = X.BE6.A0Y(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zzc(java.lang.Object, byte[], int, int, int, com.google.android.recaptcha.internal.zzgj):int");
    }

    public final Object zze() {
        return ((zzit) this.zzg).zzs();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0246, code lost:
        com.google.android.recaptcha.internal.zzkt.zzD(r12.zzc[r14], (java.util.List) r3.getObject(r13, r0), r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0256, code lost:
        com.google.android.recaptcha.internal.zzkt.zzC(r12.zzc[r14], (java.util.List) r3.getObject(r13, r0), r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0266, code lost:
        com.google.android.recaptcha.internal.zzkt.zzB(r12.zzc[r14], (java.util.List) r3.getObject(r13, r0), r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0276, code lost:
        com.google.android.recaptcha.internal.zzkt.zzv(r12.zzc[r14], (java.util.List) r3.getObject(r13, r0), r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0286, code lost:
        com.google.android.recaptcha.internal.zzkt.zzF(r12.zzc[r14], (java.util.List) r3.getObject(r13, r0), r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0304, code lost:
        com.google.android.recaptcha.internal.zzkt.zzw(r12.zzc[r14], (java.util.List) r3.getObject(r13, r0), r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0314, code lost:
        com.google.android.recaptcha.internal.zzkt.zzx(r12.zzc[r14], (java.util.List) r3.getObject(r13, r0), r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0324, code lost:
        com.google.android.recaptcha.internal.zzkt.zzz(r12.zzc[r14], (java.util.List) r3.getObject(r13, r0), r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0334, code lost:
        com.google.android.recaptcha.internal.zzkt.zzG(r12.zzc[r14], (java.util.List) r3.getObject(r13, r0), r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0344, code lost:
        com.google.android.recaptcha.internal.zzkt.zzA(r12.zzc[r14], (java.util.List) r3.getObject(r13, r0), r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0354, code lost:
        com.google.android.recaptcha.internal.zzkt.zzy(r12.zzc[r14], (java.util.List) r3.getObject(r13, r0), r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0364, code lost:
        com.google.android.recaptcha.internal.zzkt.zzu(r12.zzc[r14], (java.util.List) r3.getObject(r13, r0), r5, r7);
     */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04a0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzj(java.lang.Object r19, com.google.android.recaptcha.internal.zzmd r20) {
        /*
            r18 = this;
            r13 = r19
            r12 = r18
            boolean r0 = r12.zzh
            if (r0 == 0) goto L_0x049c
            r0 = r13
            com.google.android.recaptcha.internal.zzip r0 = (com.google.android.recaptcha.internal.zzip) r0
            com.google.android.recaptcha.internal.zzij r1 = r0.zzb
            com.google.android.recaptcha.internal.zzle r0 = r1.zza
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x049c
            java.util.Iterator r11 = r1.zzf()
            java.util.Map$Entry r4 = X.AnonymousClass000.A16(r11)
        L_0x001d:
            int[] r6 = r12.zzc
            sun.misc.Unsafe r3 = zzb
            r15 = 1048575(0xfffff, float:1.469367E-39)
            r16 = 0
            r14 = 0
        L_0x0027:
            int r0 = r6.length
            r5 = r20
            if (r14 >= r0) goto L_0x04a0
            int[] r1 = r12.zzc
            int r0 = r14 + 1
            r10 = r1[r0]
            int r0 = r10 >>> 20
            r7 = r0 & 255(0xff, float:3.57E-43)
            r2 = r1[r14]
            r0 = 17
            if (r7 > r0) goto L_0x0498
            int r0 = r14 + 2
            r9 = r1[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r9 & r0
            if (r8 == r15) goto L_0x004c
            if (r8 != r0) goto L_0x0491
            r16 = 0
        L_0x004b:
            r15 = r8
        L_0x004c:
            int r0 = r9 >>> 20
            r17 = 1
            int r17 = r17 << r0
        L_0x0052:
            if (r4 == 0) goto L_0x006f
            java.lang.Object r0 = r4.getKey()
            com.google.android.recaptcha.internal.zziq r0 = (com.google.android.recaptcha.internal.zziq) r0
            int r0 = r0.zza
            if (r0 > r2) goto L_0x006f
            com.google.android.recaptcha.internal.zzif r0 = r12.zzo
            r0.zzi(r5, r4)
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x006e
            java.util.Map$Entry r4 = X.AnonymousClass000.A16(r11)
            goto L_0x0052
        L_0x006e:
            r4 = 0
        L_0x006f:
            long r0 = X.BE6.A0M(r10)
            switch(r7) {
                case 0: goto L_0x0480;
                case 1: goto L_0x046f;
                case 2: goto L_0x0460;
                case 3: goto L_0x0451;
                case 4: goto L_0x0442;
                case 5: goto L_0x0433;
                case 6: goto L_0x0424;
                case 7: goto L_0x0413;
                case 8: goto L_0x0404;
                case 9: goto L_0x03f1;
                case 10: goto L_0x03e0;
                case 11: goto L_0x03d1;
                case 12: goto L_0x03c2;
                case 13: goto L_0x03b3;
                case 14: goto L_0x03a4;
                case 15: goto L_0x0395;
                case 16: goto L_0x0386;
                case 17: goto L_0x0373;
                case 18: goto L_0x0363;
                case 19: goto L_0x0353;
                case 20: goto L_0x0343;
                case 21: goto L_0x0333;
                case 22: goto L_0x0323;
                case 23: goto L_0x0313;
                case 24: goto L_0x0303;
                case 25: goto L_0x02f3;
                case 26: goto L_0x02da;
                case 27: goto L_0x02ae;
                case 28: goto L_0x0295;
                case 29: goto L_0x0285;
                case 30: goto L_0x0275;
                case 31: goto L_0x0265;
                case 32: goto L_0x0255;
                case 33: goto L_0x0245;
                case 34: goto L_0x0235;
                case 35: goto L_0x0232;
                case 36: goto L_0x022f;
                case 37: goto L_0x022c;
                case 38: goto L_0x0229;
                case 39: goto L_0x0226;
                case 40: goto L_0x0223;
                case 41: goto L_0x0220;
                case 42: goto L_0x0210;
                case 43: goto L_0x020e;
                case 44: goto L_0x020c;
                case 45: goto L_0x020a;
                case 46: goto L_0x0208;
                case 47: goto L_0x0206;
                case 48: goto L_0x01ca;
                case 49: goto L_0x01da;
                case 50: goto L_0x01c2;
                case 51: goto L_0x01af;
                case 52: goto L_0x019c;
                case 53: goto L_0x0189;
                case 54: goto L_0x0176;
                case 55: goto L_0x0163;
                case 56: goto L_0x0150;
                case 57: goto L_0x013d;
                case 58: goto L_0x012a;
                case 59: goto L_0x011b;
                case 60: goto L_0x0108;
                case 61: goto L_0x00f7;
                case 62: goto L_0x00e5;
                case 63: goto L_0x00d3;
                case 64: goto L_0x00c1;
                case 65: goto L_0x00af;
                case 66: goto L_0x009d;
                case 67: goto L_0x008b;
                case 68: goto L_0x0079;
                default: goto L_0x0076;
            }
        L_0x0076:
            int r14 = r14 + 3
            goto L_0x0027
        L_0x0079:
            boolean r7 = r12.zzR(r13, r2, r14)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r1 = r3.getObject(r13, r0)
            com.google.android.recaptcha.internal.zzkr r0 = r12.zzx(r14)
            r5.zzq(r2, r1, r0)
            goto L_0x0076
        L_0x008b:
            boolean r7 = r12.zzR(r13, r2, r14)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r13, r0)
            long r0 = X.C17880vN.A05(r0)
            r5.zzD(r2, r0)
            goto L_0x0076
        L_0x009d:
            boolean r7 = r12.zzR(r13, r2, r14)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r13, r0)
            int r0 = X.AnonymousClass000.A0M(r0)
            r5.zzB(r2, r0)
            goto L_0x0076
        L_0x00af:
            boolean r7 = r12.zzR(r13, r2, r14)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r13, r0)
            long r0 = X.C17880vN.A05(r0)
            r5.zzz(r2, r0)
            goto L_0x0076
        L_0x00c1:
            boolean r7 = r12.zzR(r13, r2, r14)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r13, r0)
            int r0 = X.AnonymousClass000.A0M(r0)
            r5.zzx(r2, r0)
            goto L_0x0076
        L_0x00d3:
            boolean r7 = r12.zzR(r13, r2, r14)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r13, r0)
            int r0 = X.AnonymousClass000.A0M(r0)
            r5.zzi(r2, r0)
            goto L_0x0076
        L_0x00e5:
            boolean r7 = r12.zzR(r13, r2, r14)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r13, r0)
            int r0 = X.AnonymousClass000.A0M(r0)
            r5.zzI(r2, r0)
            goto L_0x0076
        L_0x00f7:
            boolean r7 = r12.zzR(r13, r2, r14)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r0 = r3.getObject(r13, r0)
            com.google.android.recaptcha.internal.zzgw r0 = (com.google.android.recaptcha.internal.zzgw) r0
            r5.zzd(r2, r0)
            goto L_0x0076
        L_0x0108:
            boolean r7 = r12.zzR(r13, r2, r14)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r1 = r3.getObject(r13, r0)
            com.google.android.recaptcha.internal.zzkr r0 = r12.zzx(r14)
            r5.zzv(r2, r1, r0)
            goto L_0x0076
        L_0x011b:
            boolean r7 = r12.zzR(r13, r2, r14)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r0 = r3.getObject(r13, r0)
            zzT(r2, r0, r5)
            goto L_0x0076
        L_0x012a:
            boolean r7 = r12.zzR(r13, r2, r14)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r13, r0)
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            r5.zzb(r2, r0)
            goto L_0x0076
        L_0x013d:
            boolean r7 = r12.zzR(r13, r2, r14)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r13, r0)
            int r0 = X.AnonymousClass000.A0M(r0)
            r5.zzk(r2, r0)
            goto L_0x0076
        L_0x0150:
            boolean r7 = r12.zzR(r13, r2, r14)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r13, r0)
            long r0 = X.C17880vN.A05(r0)
            r5.zzm(r2, r0)
            goto L_0x0076
        L_0x0163:
            boolean r7 = r12.zzR(r13, r2, r14)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r13, r0)
            int r0 = X.AnonymousClass000.A0M(r0)
            r5.zzr(r2, r0)
            goto L_0x0076
        L_0x0176:
            boolean r7 = r12.zzR(r13, r2, r14)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r13, r0)
            long r0 = X.C17880vN.A05(r0)
            r5.zzK(r2, r0)
            goto L_0x0076
        L_0x0189:
            boolean r7 = r12.zzR(r13, r2, r14)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r13, r0)
            long r0 = X.C17880vN.A05(r0)
            r5.zzt(r2, r0)
            goto L_0x0076
        L_0x019c:
            boolean r7 = r12.zzR(r13, r2, r14)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r13, r0)
            float r0 = X.AnonymousClass000.A04(r0)
            r5.zzo(r2, r0)
            goto L_0x0076
        L_0x01af:
            boolean r7 = r12.zzR(r13, r2, r14)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r13, r0)
            double r0 = X.AnonymousClass8BR.A00(r0)
            r5.zzf(r2, r0)
            goto L_0x0076
        L_0x01c2:
            java.lang.Object r0 = r3.getObject(r13, r0)
            if (r0 == 0) goto L_0x0076
            r0 = 0
            throw r0
        L_0x01ca:
            int[] r2 = r12.zzc
            r2 = r2[r14]
            java.lang.Object r1 = r3.getObject(r13, r0)
            java.util.List r1 = (java.util.List) r1
            r0 = 1
            com.google.android.recaptcha.internal.zzkt.zzE(r2, r1, r5, r0)
            goto L_0x0076
        L_0x01da:
            int[] r2 = r12.zzc
            r7 = r2[r14]
            java.lang.Object r9 = r3.getObject(r13, r0)
            java.util.List r9 = (java.util.List) r9
            com.google.android.recaptcha.internal.zzkr r8 = r12.zzx(r14)
            int r0 = com.google.android.recaptcha.internal.zzkt.zza
            if (r9 == 0) goto L_0x0076
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0076
            r2 = 0
        L_0x01f3:
            int r0 = r9.size()
            if (r2 >= r0) goto L_0x0076
            java.lang.Object r1 = r9.get(r2)
            r0 = r5
            com.google.android.recaptcha.internal.zzhi r0 = (com.google.android.recaptcha.internal.zzhi) r0
            r0.zzq(r7, r1, r8)
            int r2 = r2 + 1
            goto L_0x01f3
        L_0x0206:
            r7 = 1
            goto L_0x0246
        L_0x0208:
            r7 = 1
            goto L_0x0256
        L_0x020a:
            r7 = 1
            goto L_0x0266
        L_0x020c:
            r7 = 1
            goto L_0x0276
        L_0x020e:
            r7 = 1
            goto L_0x0286
        L_0x0210:
            r7 = 1
            int[] r2 = r12.zzc
            r2 = r2[r14]
            java.lang.Object r0 = r3.getObject(r13, r0)
            java.util.List r0 = (java.util.List) r0
            com.google.android.recaptcha.internal.zzkt.zzt(r2, r0, r5, r7)
            goto L_0x0076
        L_0x0220:
            r7 = 1
            goto L_0x0304
        L_0x0223:
            r7 = 1
            goto L_0x0314
        L_0x0226:
            r7 = 1
            goto L_0x0324
        L_0x0229:
            r7 = 1
            goto L_0x0334
        L_0x022c:
            r7 = 1
            goto L_0x0344
        L_0x022f:
            r7 = 1
            goto L_0x0354
        L_0x0232:
            r7 = 1
            goto L_0x0364
        L_0x0235:
            int[] r2 = r12.zzc
            r2 = r2[r14]
            java.lang.Object r1 = r3.getObject(r13, r0)
            java.util.List r1 = (java.util.List) r1
            r0 = 0
            com.google.android.recaptcha.internal.zzkt.zzE(r2, r1, r5, r0)
            goto L_0x0076
        L_0x0245:
            r7 = 0
        L_0x0246:
            int[] r2 = r12.zzc
            r2 = r2[r14]
            java.lang.Object r0 = r3.getObject(r13, r0)
            java.util.List r0 = (java.util.List) r0
            com.google.android.recaptcha.internal.zzkt.zzD(r2, r0, r5, r7)
            goto L_0x0076
        L_0x0255:
            r7 = 0
        L_0x0256:
            int[] r2 = r12.zzc
            r2 = r2[r14]
            java.lang.Object r0 = r3.getObject(r13, r0)
            java.util.List r0 = (java.util.List) r0
            com.google.android.recaptcha.internal.zzkt.zzC(r2, r0, r5, r7)
            goto L_0x0076
        L_0x0265:
            r7 = 0
        L_0x0266:
            int[] r2 = r12.zzc
            r2 = r2[r14]
            java.lang.Object r0 = r3.getObject(r13, r0)
            java.util.List r0 = (java.util.List) r0
            com.google.android.recaptcha.internal.zzkt.zzB(r2, r0, r5, r7)
            goto L_0x0076
        L_0x0275:
            r7 = 0
        L_0x0276:
            int[] r2 = r12.zzc
            r2 = r2[r14]
            java.lang.Object r0 = r3.getObject(r13, r0)
            java.util.List r0 = (java.util.List) r0
            com.google.android.recaptcha.internal.zzkt.zzv(r2, r0, r5, r7)
            goto L_0x0076
        L_0x0285:
            r7 = 0
        L_0x0286:
            int[] r2 = r12.zzc
            r2 = r2[r14]
            java.lang.Object r0 = r3.getObject(r13, r0)
            java.util.List r0 = (java.util.List) r0
            com.google.android.recaptcha.internal.zzkt.zzF(r2, r0, r5, r7)
            goto L_0x0076
        L_0x0295:
            int[] r2 = r12.zzc
            r2 = r2[r14]
            java.lang.Object r1 = r3.getObject(r13, r0)
            java.util.List r1 = (java.util.List) r1
            int r0 = com.google.android.recaptcha.internal.zzkt.zza
            if (r1 == 0) goto L_0x0076
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0076
            r5.zze(r2, r1)
            goto L_0x0076
        L_0x02ae:
            int[] r2 = r12.zzc
            r7 = r2[r14]
            java.lang.Object r9 = r3.getObject(r13, r0)
            java.util.List r9 = (java.util.List) r9
            com.google.android.recaptcha.internal.zzkr r8 = r12.zzx(r14)
            int r0 = com.google.android.recaptcha.internal.zzkt.zza
            if (r9 == 0) goto L_0x0076
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0076
            r2 = 0
        L_0x02c7:
            int r0 = r9.size()
            if (r2 >= r0) goto L_0x0076
            java.lang.Object r1 = r9.get(r2)
            r0 = r5
            com.google.android.recaptcha.internal.zzhi r0 = (com.google.android.recaptcha.internal.zzhi) r0
            r0.zzv(r7, r1, r8)
            int r2 = r2 + 1
            goto L_0x02c7
        L_0x02da:
            int[] r2 = r12.zzc
            r2 = r2[r14]
            java.lang.Object r1 = r3.getObject(r13, r0)
            java.util.List r1 = (java.util.List) r1
            int r0 = com.google.android.recaptcha.internal.zzkt.zza
            if (r1 == 0) goto L_0x0076
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0076
            r5.zzH(r2, r1)
            goto L_0x0076
        L_0x02f3:
            int[] r2 = r12.zzc
            r2 = r2[r14]
            java.lang.Object r1 = r3.getObject(r13, r0)
            java.util.List r1 = (java.util.List) r1
            r0 = 0
            com.google.android.recaptcha.internal.zzkt.zzt(r2, r1, r5, r0)
            goto L_0x0076
        L_0x0303:
            r7 = 0
        L_0x0304:
            int[] r2 = r12.zzc
            r2 = r2[r14]
            java.lang.Object r0 = r3.getObject(r13, r0)
            java.util.List r0 = (java.util.List) r0
            com.google.android.recaptcha.internal.zzkt.zzw(r2, r0, r5, r7)
            goto L_0x0076
        L_0x0313:
            r7 = 0
        L_0x0314:
            int[] r2 = r12.zzc
            r2 = r2[r14]
            java.lang.Object r0 = r3.getObject(r13, r0)
            java.util.List r0 = (java.util.List) r0
            com.google.android.recaptcha.internal.zzkt.zzx(r2, r0, r5, r7)
            goto L_0x0076
        L_0x0323:
            r7 = 0
        L_0x0324:
            int[] r2 = r12.zzc
            r2 = r2[r14]
            java.lang.Object r0 = r3.getObject(r13, r0)
            java.util.List r0 = (java.util.List) r0
            com.google.android.recaptcha.internal.zzkt.zzz(r2, r0, r5, r7)
            goto L_0x0076
        L_0x0333:
            r7 = 0
        L_0x0334:
            int[] r2 = r12.zzc
            r2 = r2[r14]
            java.lang.Object r0 = r3.getObject(r13, r0)
            java.util.List r0 = (java.util.List) r0
            com.google.android.recaptcha.internal.zzkt.zzG(r2, r0, r5, r7)
            goto L_0x0076
        L_0x0343:
            r7 = 0
        L_0x0344:
            int[] r2 = r12.zzc
            r2 = r2[r14]
            java.lang.Object r0 = r3.getObject(r13, r0)
            java.util.List r0 = (java.util.List) r0
            com.google.android.recaptcha.internal.zzkt.zzA(r2, r0, r5, r7)
            goto L_0x0076
        L_0x0353:
            r7 = 0
        L_0x0354:
            int[] r2 = r12.zzc
            r2 = r2[r14]
            java.lang.Object r0 = r3.getObject(r13, r0)
            java.util.List r0 = (java.util.List) r0
            com.google.android.recaptcha.internal.zzkt.zzy(r2, r0, r5, r7)
            goto L_0x0076
        L_0x0363:
            r7 = 0
        L_0x0364:
            int[] r2 = r12.zzc
            r2 = r2[r14]
            java.lang.Object r0 = r3.getObject(r13, r0)
            java.util.List r0 = (java.util.List) r0
            com.google.android.recaptcha.internal.zzkt.zzu(r2, r0, r5, r7)
            goto L_0x0076
        L_0x0373:
            boolean r7 = r12.zzO(r13, r14, r15, r16, r17)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r1 = r3.getObject(r13, r0)
            com.google.android.recaptcha.internal.zzkr r0 = r12.zzx(r14)
            r5.zzq(r2, r1, r0)
            goto L_0x0076
        L_0x0386:
            boolean r7 = r12.zzO(r13, r14, r15, r16, r17)
            if (r7 == 0) goto L_0x0076
            long r0 = r3.getLong(r13, r0)
            r5.zzD(r2, r0)
            goto L_0x0076
        L_0x0395:
            boolean r7 = r12.zzO(r13, r14, r15, r16, r17)
            if (r7 == 0) goto L_0x0076
            int r0 = r3.getInt(r13, r0)
            r5.zzB(r2, r0)
            goto L_0x0076
        L_0x03a4:
            boolean r7 = r12.zzO(r13, r14, r15, r16, r17)
            if (r7 == 0) goto L_0x0076
            long r0 = r3.getLong(r13, r0)
            r5.zzz(r2, r0)
            goto L_0x0076
        L_0x03b3:
            boolean r7 = r12.zzO(r13, r14, r15, r16, r17)
            if (r7 == 0) goto L_0x0076
            int r0 = r3.getInt(r13, r0)
            r5.zzx(r2, r0)
            goto L_0x0076
        L_0x03c2:
            boolean r7 = r12.zzO(r13, r14, r15, r16, r17)
            if (r7 == 0) goto L_0x0076
            int r0 = r3.getInt(r13, r0)
            r5.zzi(r2, r0)
            goto L_0x0076
        L_0x03d1:
            boolean r7 = r12.zzO(r13, r14, r15, r16, r17)
            if (r7 == 0) goto L_0x0076
            int r0 = r3.getInt(r13, r0)
            r5.zzI(r2, r0)
            goto L_0x0076
        L_0x03e0:
            boolean r7 = r12.zzO(r13, r14, r15, r16, r17)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r0 = r3.getObject(r13, r0)
            com.google.android.recaptcha.internal.zzgw r0 = (com.google.android.recaptcha.internal.zzgw) r0
            r5.zzd(r2, r0)
            goto L_0x0076
        L_0x03f1:
            boolean r7 = r12.zzO(r13, r14, r15, r16, r17)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r1 = r3.getObject(r13, r0)
            com.google.android.recaptcha.internal.zzkr r0 = r12.zzx(r14)
            r5.zzv(r2, r1, r0)
            goto L_0x0076
        L_0x0404:
            boolean r7 = r12.zzO(r13, r14, r15, r16, r17)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r0 = r3.getObject(r13, r0)
            zzT(r2, r0, r5)
            goto L_0x0076
        L_0x0413:
            boolean r7 = r12.zzO(r13, r14, r15, r16, r17)
            if (r7 == 0) goto L_0x0076
            com.google.android.recaptcha.internal.zzlu r7 = com.google.android.recaptcha.internal.zzlv.zzf
            boolean r0 = r7.zzg(r13, r0)
            r5.zzb(r2, r0)
            goto L_0x0076
        L_0x0424:
            boolean r7 = r12.zzO(r13, r14, r15, r16, r17)
            if (r7 == 0) goto L_0x0076
            int r0 = r3.getInt(r13, r0)
            r5.zzk(r2, r0)
            goto L_0x0076
        L_0x0433:
            boolean r7 = r12.zzO(r13, r14, r15, r16, r17)
            if (r7 == 0) goto L_0x0076
            long r0 = r3.getLong(r13, r0)
            r5.zzm(r2, r0)
            goto L_0x0076
        L_0x0442:
            boolean r7 = r12.zzO(r13, r14, r15, r16, r17)
            if (r7 == 0) goto L_0x0076
            int r0 = r3.getInt(r13, r0)
            r5.zzr(r2, r0)
            goto L_0x0076
        L_0x0451:
            boolean r7 = r12.zzO(r13, r14, r15, r16, r17)
            if (r7 == 0) goto L_0x0076
            long r0 = r3.getLong(r13, r0)
            r5.zzK(r2, r0)
            goto L_0x0076
        L_0x0460:
            boolean r7 = r12.zzO(r13, r14, r15, r16, r17)
            if (r7 == 0) goto L_0x0076
            long r0 = r3.getLong(r13, r0)
            r5.zzt(r2, r0)
            goto L_0x0076
        L_0x046f:
            boolean r7 = r12.zzO(r13, r14, r15, r16, r17)
            if (r7 == 0) goto L_0x0076
            com.google.android.recaptcha.internal.zzlu r7 = com.google.android.recaptcha.internal.zzlv.zzf
            float r0 = r7.zzb(r13, r0)
            r5.zzo(r2, r0)
            goto L_0x0076
        L_0x0480:
            boolean r7 = r12.zzO(r13, r14, r15, r16, r17)
            if (r7 == 0) goto L_0x0076
            com.google.android.recaptcha.internal.zzlu r7 = com.google.android.recaptcha.internal.zzlv.zzf
            double r0 = r7.zza(r13, r0)
            r5.zzf(r2, r0)
            goto L_0x0076
        L_0x0491:
            long r0 = (long) r8
            int r16 = r3.getInt(r13, r0)
            goto L_0x004b
        L_0x0498:
            r17 = 0
            goto L_0x0052
        L_0x049c:
            r4 = 0
            r11 = 0
            goto L_0x001d
        L_0x04a0:
            if (r4 == 0) goto L_0x04b2
            com.google.android.recaptcha.internal.zzif r0 = r12.zzo
            r0.zzi(r5, r4)
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x04b2
            java.util.Map$Entry r4 = X.AnonymousClass000.A16(r11)
            goto L_0x04a0
        L_0x04b2:
            com.google.android.recaptcha.internal.zzit r13 = (com.google.android.recaptcha.internal.zzit) r13
            com.google.android.recaptcha.internal.zzlm r0 = r13.zzc
            r0.zzl(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zzj(java.lang.Object, com.google.android.recaptcha.internal.zzmd):void");
    }

    public zzkh(int[] iArr, Object[] objArr, int i, int i2, zzke zzke, int i3, boolean z, int[] iArr2, int i4, int i5, zzkk zzkk, zzjs zzjs, zzll zzll, zzif zzif, zzjz zzjz) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzke instanceof zzit;
        boolean z2 = false;
        zzif zzif2 = zzif;
        if (zzif != null && (zzke instanceof zzip)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i4;
        this.zzl = i5;
        this.zzp = zzkk;
        this.zzm = zzjs;
        this.zzn = zzll;
        this.zzo = zzif2;
        this.zzg = zzke;
        this.zzq = zzjz;
    }

    private final Object zzA(Object obj, int i) {
        zzkr zzx = zzx(i);
        int i2 = this.zzc[i + 1] & 1048575;
        if (!zzN(obj, i)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, (long) i2);
        if (zzQ(object)) {
            return object;
        }
        Object zze2 = zzx.zze();
        if (object != null) {
            zzx.zzg(zze2, object);
        }
        return zze2;
    }

    private final Object zzB(Object obj, int i, int i2) {
        zzkr zzx = zzx(i2);
        if (!zzR(obj, i, i2)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, BE9.A0N(this.zzc, i2));
        if (zzQ(object)) {
            return object;
        }
        Object zze2 = zzx.zze();
        if (object != null) {
            zzx.zzg(zze2, object);
        }
        return zze2;
    }

    public static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder A10 = AnonymousClass000.A10();
            BEA.A1S(A10, str);
            A10.append(name);
            throw BEA.A0g(" not found. Known fields are ", arrays, A10);
        }
    }

    public static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw AnonymousClass000.A0k("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void zzE(Object obj, Object obj2, int i) {
        if (zzN(obj2, i)) {
            Unsafe unsafe = zzb;
            long j = (long) (this.zzc[i + 1] & 1048575);
            Object object = unsafe.getObject(obj2, j);
            if (object != null) {
                zzkr zzx = zzx(i);
                if (!zzN(obj, i)) {
                    if (!zzQ(object)) {
                        unsafe.putObject(obj, j, object);
                    } else {
                        Object zze2 = zzx.zze();
                        zzx.zzg(zze2, object);
                        unsafe.putObject(obj, j, zze2);
                    }
                    zzH(obj, i);
                    return;
                }
                Object object2 = unsafe.getObject(obj, j);
                if (!zzQ(object2)) {
                    Object zze3 = zzx.zze();
                    zzx.zzg(zze3, object2);
                    unsafe.putObject(obj, j, zze3);
                    object2 = zze3;
                }
                zzx.zzg(object2, object);
                return;
            }
            throw AnonymousClass000.A0o(obj2.toString(), BEA.A0q(this.zzc[i]));
        }
    }

    private final void zzG(Object obj, int i, zzkq zzkq) {
        Object zzp2;
        boolean zzM = zzM(i);
        long A0M = BE6.A0M(i);
        if (zzM) {
            zzp2 = zzkq.zzs();
        } else if (this.zzi) {
            zzp2 = zzkq.zzr();
        } else {
            zzp2 = zzkq.zzp();
        }
        zzlv.zzs(obj, A0M, zzp2);
    }

    private final boolean zzL(Object obj, Object obj2, int i) {
        return AnonymousClass000.A1T(zzN(obj, i) ? 1 : 0, zzN(obj2, i) ? 1 : 0);
    }

    private final boolean zzO(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzN(obj, i);
        }
        return AnonymousClass000.A1O(i3 & i4);
    }

    public static boolean zzP(Object obj, int i, zzkr zzkr) {
        return zzkr.zzl(zzlv.zzf(obj, BE6.A0M(i)));
    }

    public static boolean zzS(Object obj, long j) {
        return AnonymousClass000.A1Y(zzlv.zzf(obj, j));
    }

    public static double zzn(Object obj, long j) {
        return AnonymousClass8BR.A00(zzlv.zzf(obj, j));
    }

    public static float zzo(Object obj, long j) {
        return AnonymousClass000.A04(zzlv.zzf(obj, j));
    }

    public static int zzp(Object obj, long j) {
        return AnonymousClass000.A0M(zzlv.zzf(obj, j));
    }

    public static long zzv(Object obj, long j) {
        return C17880vN.A05(zzlv.zzf(obj, j));
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x003c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzf(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = zzQ(r9)
            if (r0 == 0) goto L_0x0080
            boolean r0 = r9 instanceof com.google.android.recaptcha.internal.zzit
            r7 = 0
            if (r0 == 0) goto L_0x0019
            r1 = r9
            com.google.android.recaptcha.internal.zzit r1 = (com.google.android.recaptcha.internal.zzit) r1
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.zzE(r0)
            r1.zza = r7
            r1.zzC()
        L_0x0019:
            int[] r6 = r8.zzc
        L_0x001b:
            int r0 = r6.length
            if (r7 >= r0) goto L_0x0072
            int[] r4 = r8.zzc
            int r0 = r7 + 1
            r0 = r4[r0]
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r0
            int r0 = r0 >>> 20
            r1 = r0 & 255(0xff, float:3.57E-43)
            long r2 = (long) r2
            r0 = 9
            if (r1 == r0) goto L_0x0057
            r0 = 60
            if (r1 == r0) goto L_0x005c
            r0 = 68
            if (r1 == r0) goto L_0x005c
            switch(r1) {
                case 17: goto L_0x0057;
                case 18: goto L_0x003f;
                case 19: goto L_0x003f;
                case 20: goto L_0x003f;
                case 21: goto L_0x003f;
                case 22: goto L_0x003f;
                case 23: goto L_0x003f;
                case 24: goto L_0x003f;
                case 25: goto L_0x003f;
                case 26: goto L_0x003f;
                case 27: goto L_0x003f;
                case 28: goto L_0x003f;
                case 29: goto L_0x003f;
                case 30: goto L_0x003f;
                case 31: goto L_0x003f;
                case 32: goto L_0x003f;
                case 33: goto L_0x003f;
                case 34: goto L_0x003f;
                case 35: goto L_0x003f;
                case 36: goto L_0x003f;
                case 37: goto L_0x003f;
                case 38: goto L_0x003f;
                case 39: goto L_0x003f;
                case 40: goto L_0x003f;
                case 41: goto L_0x003f;
                case 42: goto L_0x003f;
                case 43: goto L_0x003f;
                case 44: goto L_0x003f;
                case 45: goto L_0x003f;
                case 46: goto L_0x003f;
                case 47: goto L_0x003f;
                case 48: goto L_0x003f;
                case 49: goto L_0x003f;
                case 50: goto L_0x0045;
                default: goto L_0x003c;
            }
        L_0x003c:
            int r7 = r7 + 3
            goto L_0x001b
        L_0x003f:
            com.google.android.recaptcha.internal.zzjs r0 = r8.zzm
            r0.zzb(r9, r2)
            goto L_0x003c
        L_0x0045:
            sun.misc.Unsafe r5 = zzb
            java.lang.Object r4 = r5.getObject(r9, r2)
            if (r4 == 0) goto L_0x003c
            r1 = r4
            com.google.android.recaptcha.internal.zzjy r1 = (com.google.android.recaptcha.internal.zzjy) r1
            r0 = 0
            r1.zzb = r0
            r5.putObject(r9, r2, r4)
            goto L_0x003c
        L_0x0057:
            boolean r0 = r8.zzN(r9, r7)
            goto L_0x0062
        L_0x005c:
            r0 = r4[r7]
            boolean r0 = r8.zzR(r9, r0, r7)
        L_0x0062:
            if (r0 == 0) goto L_0x003c
            com.google.android.recaptcha.internal.zzkr r1 = r8.zzx(r7)
            sun.misc.Unsafe r0 = zzb
            java.lang.Object r0 = r0.getObject(r9, r2)
            r1.zzf(r0)
            goto L_0x003c
        L_0x0072:
            com.google.android.recaptcha.internal.zzll r0 = r8.zzn
            r0.zzm(r9)
            boolean r0 = r8.zzh
            if (r0 == 0) goto L_0x0080
            com.google.android.recaptcha.internal.zzif r0 = r8.zzo
            r0.zzf(r9)
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zzf(java.lang.Object):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0079, code lost:
        zzH(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a6, code lost:
        com.google.android.recaptcha.internal.zzlv.zzs(r6, r2, com.google.android.recaptcha.internal.zzlv.zzf(r7, r2));
        zzI(r6, r1, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzg(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            zzD(r6)
            if (r7 == 0) goto L_0x00c6
            r4 = 0
        L_0x0006:
            int[] r1 = r5.zzc
            int r0 = r1.length
            if (r4 >= r0) goto L_0x00b7
            int r0 = r4 + 1
            r0 = r1[r0]
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r0
            int r0 = r0 >>> 20
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1[r4]
            long r2 = (long) r2
            switch(r0) {
                case 0: goto L_0x0020;
                case 1: goto L_0x0030;
                case 2: goto L_0x006c;
                case 3: goto L_0x006c;
                case 4: goto L_0x005e;
                case 5: goto L_0x006c;
                case 6: goto L_0x005e;
                case 7: goto L_0x0040;
                case 8: goto L_0x0050;
                case 9: goto L_0x007d;
                case 10: goto L_0x0050;
                case 11: goto L_0x005e;
                case 12: goto L_0x005e;
                case 13: goto L_0x005e;
                case 14: goto L_0x006c;
                case 15: goto L_0x005e;
                case 16: goto L_0x006c;
                case 17: goto L_0x007d;
                case 18: goto L_0x0081;
                case 19: goto L_0x0081;
                case 20: goto L_0x0081;
                case 21: goto L_0x0081;
                case 22: goto L_0x0081;
                case 23: goto L_0x0081;
                case 24: goto L_0x0081;
                case 25: goto L_0x0081;
                case 26: goto L_0x0081;
                case 27: goto L_0x0081;
                case 28: goto L_0x0081;
                case 29: goto L_0x0081;
                case 30: goto L_0x0081;
                case 31: goto L_0x0081;
                case 32: goto L_0x0081;
                case 33: goto L_0x0081;
                case 34: goto L_0x0081;
                case 35: goto L_0x0081;
                case 36: goto L_0x0081;
                case 37: goto L_0x0081;
                case 38: goto L_0x0081;
                case 39: goto L_0x0081;
                case 40: goto L_0x0081;
                case 41: goto L_0x0081;
                case 42: goto L_0x0081;
                case 43: goto L_0x0081;
                case 44: goto L_0x0081;
                case 45: goto L_0x0081;
                case 46: goto L_0x0081;
                case 47: goto L_0x0081;
                case 48: goto L_0x0081;
                case 49: goto L_0x0081;
                case 50: goto L_0x0087;
                case 51: goto L_0x0099;
                case 52: goto L_0x0099;
                case 53: goto L_0x0099;
                case 54: goto L_0x0099;
                case 55: goto L_0x0099;
                case 56: goto L_0x0099;
                case 57: goto L_0x0099;
                case 58: goto L_0x0099;
                case 59: goto L_0x0099;
                case 60: goto L_0x00b2;
                case 61: goto L_0x00a0;
                case 62: goto L_0x00a0;
                case 63: goto L_0x00a0;
                case 64: goto L_0x00a0;
                case 65: goto L_0x00a0;
                case 66: goto L_0x00a0;
                case 67: goto L_0x00a0;
                case 68: goto L_0x00b2;
                default: goto L_0x001d;
            }
        L_0x001d:
            int r4 = r4 + 3
            goto L_0x0006
        L_0x0020:
            boolean r0 = r5.zzN(r7, r4)
            if (r0 == 0) goto L_0x001d
            com.google.android.recaptcha.internal.zzlu r0 = com.google.android.recaptcha.internal.zzlv.zzf
            double r0 = r0.zza(r7, r2)
            com.google.android.recaptcha.internal.zzlv.zzo(r6, r2, r0)
            goto L_0x0079
        L_0x0030:
            boolean r0 = r5.zzN(r7, r4)
            if (r0 == 0) goto L_0x001d
            com.google.android.recaptcha.internal.zzlu r0 = com.google.android.recaptcha.internal.zzlv.zzf
            float r0 = r0.zzb(r7, r2)
            com.google.android.recaptcha.internal.zzlv.zzp(r6, r2, r0)
            goto L_0x0079
        L_0x0040:
            boolean r0 = r5.zzN(r7, r4)
            if (r0 == 0) goto L_0x001d
            com.google.android.recaptcha.internal.zzlu r0 = com.google.android.recaptcha.internal.zzlv.zzf
            boolean r0 = r0.zzg(r7, r2)
            com.google.android.recaptcha.internal.zzlv.zzm(r6, r2, r0)
            goto L_0x0079
        L_0x0050:
            boolean r0 = r5.zzN(r7, r4)
            if (r0 == 0) goto L_0x001d
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r7, r2)
            com.google.android.recaptcha.internal.zzlv.zzs(r6, r2, r0)
            goto L_0x0079
        L_0x005e:
            boolean r0 = r5.zzN(r7, r4)
            if (r0 == 0) goto L_0x001d
            int r0 = com.google.android.recaptcha.internal.zzlv.zzc(r7, r2)
            com.google.android.recaptcha.internal.zzlv.zzq(r6, r2, r0)
            goto L_0x0079
        L_0x006c:
            boolean r0 = r5.zzN(r7, r4)
            if (r0 == 0) goto L_0x001d
            long r0 = com.google.android.recaptcha.internal.zzlv.zzd(r7, r2)
            com.google.android.recaptcha.internal.zzlv.zzr(r6, r2, r0)
        L_0x0079:
            r5.zzH(r6, r4)
            goto L_0x001d
        L_0x007d:
            r5.zzE(r6, r7, r4)
            goto L_0x001d
        L_0x0081:
            com.google.android.recaptcha.internal.zzjs r0 = r5.zzm
            r0.zzc(r6, r7, r2)
            goto L_0x001d
        L_0x0087:
            int r0 = com.google.android.recaptcha.internal.zzkt.zza
            java.lang.Object r1 = com.google.android.recaptcha.internal.zzlv.zzf(r6, r2)
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r7, r2)
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzjz.zzb(r1, r0)
            com.google.android.recaptcha.internal.zzlv.zzs(r6, r2, r0)
            goto L_0x001d
        L_0x0099:
            boolean r0 = r5.zzR(r7, r1, r4)
            if (r0 == 0) goto L_0x001d
            goto L_0x00a6
        L_0x00a0:
            boolean r0 = r5.zzR(r7, r1, r4)
            if (r0 == 0) goto L_0x001d
        L_0x00a6:
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r7, r2)
            com.google.android.recaptcha.internal.zzlv.zzs(r6, r2, r0)
            r5.zzI(r6, r1, r4)
            goto L_0x001d
        L_0x00b2:
            r5.zzF(r6, r7, r4)
            goto L_0x001d
        L_0x00b7:
            com.google.android.recaptcha.internal.zzll r0 = r5.zzn
            com.google.android.recaptcha.internal.zzkt.zzr(r0, r6, r7)
            boolean r0 = r5.zzh
            if (r0 == 0) goto L_0x00c5
            com.google.android.recaptcha.internal.zzif r0 = r5.zzo
            com.google.android.recaptcha.internal.zzkt.zzq(r0, r6, r7)
        L_0x00c5:
            return
        L_0x00c6:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zzg(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x016b, code lost:
        if (r8 == 0) goto L_0x017f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x023b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.recaptcha.internal.zzkh zzm(java.lang.Class r30, com.google.android.recaptcha.internal.zzkb r31, com.google.android.recaptcha.internal.zzkk r32, com.google.android.recaptcha.internal.zzjs r33, com.google.android.recaptcha.internal.zzll r34, com.google.android.recaptcha.internal.zzif r35, com.google.android.recaptcha.internal.zzjz r36) {
        /*
            r29 = r31
            r0 = r29
            boolean r0 = r0 instanceof com.google.android.recaptcha.internal.zzkp
            if (r0 == 0) goto L_0x0375
            r0 = r29
            com.google.android.recaptcha.internal.zzkp r0 = (com.google.android.recaptcha.internal.zzkp) r0
            r29 = r0
            java.lang.String r14 = r0.zzb
            int r28 = r14.length()
            char r0 = X.BE7.A00(r14)
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r0 < r1) goto L_0x0028
            r0 = 1
        L_0x001e:
            int r2 = r0 + 1
            char r0 = r14.charAt(r0)
            if (r0 < r1) goto L_0x0029
            r0 = r2
            goto L_0x001e
        L_0x0028:
            r2 = 1
        L_0x0029:
            int r13 = r2 + 1
            char r4 = r14.charAt(r2)
            if (r4 < r1) goto L_0x0048
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r3 = 13
        L_0x0035:
            int r2 = r13 + 1
            char r0 = r14.charAt(r13)
            if (r0 < r1) goto L_0x0045
            int r4 = X.BE6.A08(r0, r3, r4)
            int r3 = r3 + 13
            r13 = r2
            goto L_0x0035
        L_0x0045:
            int r0 = r0 << r3
            r4 = r4 | r0
            r13 = r2
        L_0x0048:
            if (r4 != 0) goto L_0x0254
            int[] r16 = zza
            r5 = 0
            r6 = 0
            r7 = 0
            r4 = 0
            r3 = 0
            r17 = 0
            r2 = 0
        L_0x0054:
            sun.misc.Unsafe r27 = zzb
            r0 = r29
            java.lang.Object[] r12 = r0.zzc
            com.google.android.recaptcha.internal.zzke r0 = r29.zza()
            java.lang.Class r26 = r0.getClass()
            int r31 = r2 + r7
            int r7 = r6 + r6
            int r0 = r6 * 3
            int[] r0 = new int[r0]
            r25 = r0
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r24 = r0
            r23 = r2
            r22 = r31
            r21 = 0
            r20 = 0
        L_0x0078:
            r0 = r28
            if (r13 >= r0) goto L_0x0359
            int r0 = r13 + 1
            char r11 = r14.charAt(r13)
            if (r11 < r1) goto L_0x0098
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r7 = 13
        L_0x0088:
            int r6 = r0 + 1
            char r0 = r14.charAt(r0)
            if (r0 < r1) goto L_0x009a
            int r11 = X.BE6.A08(r0, r7, r11)
            int r7 = r7 + 13
            r0 = r6
            goto L_0x0088
        L_0x0098:
            r6 = r0
            goto L_0x009c
        L_0x009a:
            int r0 = r0 << r7
            r11 = r11 | r0
        L_0x009c:
            int r0 = r6 + 1
            char r10 = r14.charAt(r6)
            if (r10 < r1) goto L_0x00b8
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r6 = 13
        L_0x00a8:
            int r13 = r0 + 1
            char r0 = r14.charAt(r0)
            if (r0 < r1) goto L_0x00ba
            int r10 = X.BE6.A08(r0, r6, r10)
            int r6 = r6 + 13
            r0 = r13
            goto L_0x00a8
        L_0x00b8:
            r13 = r0
            goto L_0x00bc
        L_0x00ba:
            int r0 = r0 << r6
            r10 = r10 | r0
        L_0x00bc:
            r0 = r10 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x00c6
            int r0 = r21 + 1
            r16[r21] = r20
            r21 = r0
        L_0x00c6:
            r9 = r10 & 255(0xff, float:3.57E-43)
            r8 = r10 & 2048(0x800, float:2.87E-42)
            r0 = 51
            if (r9 < r0) goto L_0x00ed
            int r0 = r13 + 1
            char r6 = r14.charAt(r13)
            if (r6 < r1) goto L_0x00ea
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r7 = 13
        L_0x00da:
            int r13 = r0 + 1
            char r0 = r14.charAt(r0)
            if (r0 < r1) goto L_0x01c7
            int r6 = X.BE6.A08(r0, r7, r6)
            int r7 = r7 + 13
            r0 = r13
            goto L_0x00da
        L_0x00ea:
            r13 = r0
            goto L_0x01c9
        L_0x00ed:
            int r19 = r17 + 1
            r1 = r12[r17]
            java.lang.String r1 = (java.lang.String) r1
            r0 = r26
            java.lang.reflect.Field r6 = zzC(r0, r1)
            r0 = 9
            if (r9 == r0) goto L_0x0181
            r0 = 17
            if (r9 == r0) goto L_0x0181
            r0 = 27
            if (r9 == r0) goto L_0x016d
            r0 = 49
            if (r9 == r0) goto L_0x016d
            r0 = 12
            if (r9 == r0) goto L_0x0164
            r0 = 30
            if (r9 == r0) goto L_0x0164
            r0 = 44
            if (r9 == r0) goto L_0x0164
            r0 = 50
            if (r9 != r0) goto L_0x0130
            int r7 = r19 + 1
            int r15 = r23 + 1
            r16[r23] = r20
            int r1 = r20 / 3
            r0 = r12[r19]
            int r1 = r1 + r1
            r24[r1] = r0
            if (r8 == 0) goto L_0x017b
            r0 = r24
            int r19 = X.BE7.A0B(r12, r0, r1, r7)
            r23 = r15
        L_0x0130:
            r0 = r27
            long r0 = r0.objectFieldOffset(r6)
            int r7 = (int) r0
            r0 = r10 & 4096(0x1000, float:5.74E-42)
            r15 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 == 0) goto L_0x018f
            r0 = 17
            if (r9 > r0) goto L_0x018f
            int r0 = r13 + 1
            char r6 = r14.charAt(r13)
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r1) goto L_0x018d
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0151:
            int r13 = r0 + 1
            char r1 = r14.charAt(r0)
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r0) goto L_0x019f
            int r6 = X.BE6.A08(r1, r15, r6)
            int r15 = r15 + 13
            r0 = r13
            goto L_0x0151
        L_0x0164:
            int r1 = r29.zzc()
            r0 = 1
            if (r1 == r0) goto L_0x016d
            if (r8 == 0) goto L_0x017f
        L_0x016d:
            int r7 = r19 + 1
            int r0 = r20 / 3
            int r0 = r0 + r0
            int r1 = r0 + 1
            r0 = r12[r19]
            r24[r1] = r0
            r19 = r7
            goto L_0x0130
        L_0x017b:
            r19 = r7
            r23 = r15
        L_0x017f:
            r8 = 0
            goto L_0x0130
        L_0x0181:
            int r0 = r20 / 3
            int r0 = r0 + r0
            int r1 = r0 + 1
            java.lang.Class r0 = r6.getType()
            r24[r1] = r0
            goto L_0x0130
        L_0x018d:
            r13 = r0
            goto L_0x01a1
        L_0x018f:
            r1 = 0
            r0 = 18
            if (r9 < r0) goto L_0x01b9
            r0 = 49
            if (r9 > r0) goto L_0x01b9
            int r0 = r22 + 1
            r16[r22] = r7
            r22 = r0
            goto L_0x01b9
        L_0x019f:
            int r1 = r1 << r15
            r6 = r6 | r1
        L_0x01a1:
            int r15 = r5 + r5
            int r0 = r6 / 32
            int r15 = r15 + r0
            r1 = r12[r15]
            boolean r0 = r1 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x01bc
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
        L_0x01ae:
            r0 = r27
            long r17 = r0.objectFieldOffset(r1)
            r0 = r17
            int r15 = (int) r0
            int r1 = r6 % 32
        L_0x01b9:
            r17 = r19
            goto L_0x0203
        L_0x01bc:
            java.lang.String r1 = (java.lang.String) r1
            r0 = r26
            java.lang.reflect.Field r1 = zzC(r0, r1)
            r12[r15] = r1
            goto L_0x01ae
        L_0x01c7:
            int r0 = r0 << r7
            r6 = r6 | r0
        L_0x01c9:
            int r1 = r9 + -51
            r0 = 9
            if (r1 == r0) goto L_0x0246
            r0 = 17
            if (r1 == r0) goto L_0x0246
            r0 = 12
            if (r1 != r0) goto L_0x01e1
            int r1 = r29.zzc()
            r0 = 1
            if (r1 == r0) goto L_0x0246
            if (r8 != 0) goto L_0x0246
            r8 = 0
        L_0x01e1:
            int r6 = r6 + r6
            r1 = r12[r6]
            boolean r0 = r1 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x023b
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
        L_0x01ea:
            r0 = r27
            long r0 = r0.objectFieldOffset(r1)
            int r7 = (int) r0
            int r6 = r6 + 1
            r1 = r12[r6]
            boolean r0 = r1 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0230
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
        L_0x01fb:
            r0 = r27
            long r0 = r0.objectFieldOffset(r1)
            int r15 = (int) r0
            r1 = 0
        L_0x0203:
            int r19 = r20 + 1
            r25[r20] = r11
            int r18 = r19 + 1
            r0 = r10 & 512(0x200, float:7.175E-43)
            r11 = 0
            if (r0 == 0) goto L_0x0210
            r11 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x0210:
            r0 = r10 & 256(0x100, float:3.59E-43)
            r10 = 0
            if (r0 == 0) goto L_0x0217
            r10 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0217:
            r6 = 0
            if (r8 == 0) goto L_0x021c
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x021c:
            int r0 = r9 << 20
            r10 = r10 | r11
            r10 = r10 | r6
            r10 = r10 | r0
            r7 = r7 | r10
            r25[r19] = r7
            int r20 = r18 + 1
            int r0 = r1 << 20
            r0 = r0 | r15
            r25[r18] = r0
            r1 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0078
        L_0x0230:
            java.lang.String r1 = (java.lang.String) r1
            r0 = r26
            java.lang.reflect.Field r1 = zzC(r0, r1)
            r12[r6] = r1
            goto L_0x01fb
        L_0x023b:
            java.lang.String r1 = (java.lang.String) r1
            r0 = r26
            java.lang.reflect.Field r1 = zzC(r0, r1)
            r12[r6] = r1
            goto L_0x01ea
        L_0x0246:
            int r7 = r17 + 1
            int r0 = r20 / 3
            int r0 = r0 + r0
            int r1 = r0 + 1
            r0 = r12[r17]
            r24[r1] = r0
            r17 = r7
            goto L_0x01e1
        L_0x0254:
            int r0 = r13 + 1
            char r5 = r14.charAt(r13)
            if (r5 < r1) goto L_0x0273
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r3 = 13
        L_0x0260:
            int r2 = r0 + 1
            char r0 = r14.charAt(r0)
            if (r0 < r1) goto L_0x0270
            int r5 = X.BE6.A08(r0, r3, r5)
            int r3 = r3 + 13
            r0 = r2
            goto L_0x0260
        L_0x0270:
            int r0 = r0 << r3
            r5 = r5 | r0
            r0 = r2
        L_0x0273:
            int r4 = r0 + 1
            char r10 = r14.charAt(r0)
            if (r10 < r1) goto L_0x0292
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r3 = 13
        L_0x027f:
            int r2 = r4 + 1
            char r0 = r14.charAt(r4)
            if (r0 < r1) goto L_0x028f
            int r10 = X.BE6.A08(r0, r3, r10)
            int r3 = r3 + 13
            r4 = r2
            goto L_0x027f
        L_0x028f:
            int r0 = r0 << r3
            r10 = r10 | r0
            r4 = r2
        L_0x0292:
            int r0 = r4 + 1
            char r4 = r14.charAt(r4)
            if (r4 < r1) goto L_0x02b1
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r3 = 13
        L_0x029e:
            int r2 = r0 + 1
            char r0 = r14.charAt(r0)
            if (r0 < r1) goto L_0x02ae
            int r4 = X.BE6.A08(r0, r3, r4)
            int r3 = r3 + 13
            r0 = r2
            goto L_0x029e
        L_0x02ae:
            int r0 = r0 << r3
            r4 = r4 | r0
            r0 = r2
        L_0x02b1:
            int r7 = r0 + 1
            char r3 = r14.charAt(r0)
            if (r3 < r1) goto L_0x02d0
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r6 = 13
        L_0x02bd:
            int r2 = r7 + 1
            char r0 = r14.charAt(r7)
            if (r0 < r1) goto L_0x02cd
            int r3 = X.BE6.A08(r0, r6, r3)
            int r6 = r6 + 13
            r7 = r2
            goto L_0x02bd
        L_0x02cd:
            int r0 = r0 << r6
            r3 = r3 | r0
            r7 = r2
        L_0x02d0:
            int r0 = r7 + 1
            char r6 = r14.charAt(r7)
            if (r6 < r1) goto L_0x02ef
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r7 = 13
        L_0x02dc:
            int r2 = r0 + 1
            char r0 = r14.charAt(r0)
            if (r0 < r1) goto L_0x02ec
            int r6 = X.BE6.A08(r0, r7, r6)
            int r7 = r7 + 13
            r0 = r2
            goto L_0x02dc
        L_0x02ec:
            int r0 = r0 << r7
            r6 = r6 | r0
            r0 = r2
        L_0x02ef:
            int r9 = r0 + 1
            char r7 = r14.charAt(r0)
            if (r7 < r1) goto L_0x030e
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x02fb:
            int r2 = r9 + 1
            char r0 = r14.charAt(r9)
            if (r0 < r1) goto L_0x030b
            int r7 = X.BE6.A08(r0, r8, r7)
            int r8 = r8 + 13
            r9 = r2
            goto L_0x02fb
        L_0x030b:
            int r0 = r0 << r8
            r7 = r7 | r0
            r9 = r2
        L_0x030e:
            int r0 = r9 + 1
            char r11 = r14.charAt(r9)
            if (r11 < r1) goto L_0x032d
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x031a:
            int r2 = r0 + 1
            char r0 = r14.charAt(r0)
            if (r0 < r1) goto L_0x032a
            int r11 = X.BE6.A08(r0, r8, r11)
            int r8 = r8 + 13
            r0 = r2
            goto L_0x031a
        L_0x032a:
            int r0 = r0 << r8
            r11 = r11 | r0
            r0 = r2
        L_0x032d:
            int r13 = r0 + 1
            char r2 = r14.charAt(r0)
            if (r2 < r1) goto L_0x034c
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0339:
            int r8 = r13 + 1
            char r0 = r14.charAt(r13)
            if (r0 < r1) goto L_0x0349
            int r2 = X.BE6.A08(r0, r9, r2)
            int r9 = r9 + 13
            r13 = r8
            goto L_0x0339
        L_0x0349:
            int r0 = r0 << r9
            r2 = r2 | r0
            r13 = r8
        L_0x034c:
            int r0 = r2 + r7
            int r0 = r0 + r11
            int r17 = r5 + r5
            int r17 = r17 + r10
            int[] r0 = new int[r0]
            r16 = r0
            goto L_0x0054
        L_0x0359:
            com.google.android.recaptcha.internal.zzke r26 = r29.zza()
            int r27 = r29.zzc()
            r28 = 0
            com.google.android.recaptcha.internal.zzkh r21 = new com.google.android.recaptcha.internal.zzkh
            r22 = r25
            r23 = r24
            r24 = r4
            r25 = r3
            r29 = r16
            r30 = r2
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            return r21
        L_0x0375:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zzm(java.lang.Class, com.google.android.recaptcha.internal.zzkb, com.google.android.recaptcha.internal.zzkk, com.google.android.recaptcha.internal.zzjs, com.google.android.recaptcha.internal.zzll, com.google.android.recaptcha.internal.zzif, com.google.android.recaptcha.internal.zzjz):com.google.android.recaptcha.internal.zzkh");
    }
}
