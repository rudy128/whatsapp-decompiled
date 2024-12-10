package X;

import android.os.SystemClock;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: X.1T6  reason: invalid class name */
public class AnonymousClass1T6 {
    public final C218617r A00;
    public final AnonymousClass1KB A01;
    public final C18030ve A02;
    public final AnonymousClass18K A03;
    public final C26421Sb A04;
    public final AnonymousClass1SS A05;
    public final C26501Sj A06;
    public final AnonymousClass1RO A07;
    public final AnonymousClass1SU A08;
    public final AnonymousClass1T5 A09;
    public final C26411Sa A0A;
    public final C26471Sg A0B;
    public final AnonymousClass1NL A0C;
    public final AnonymousClass10I A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;
    public final Executor A0G;
    public final Executor A0H;
    public final AnonymousClass190 A0I;
    public final C25311Ns A0J;
    public final AnonymousClass11E A0K;
    public final AnonymousClass11C A0L;
    public final C24361Ka A0M;
    public final C219317y A0N;
    public final C26431Sc A0O;
    public final AnonymousClass00H A0P;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        if ((!X.AnonymousClass1YF.A0T(r10)) != true) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File A02(X.AnonymousClass1T6 r7, java.io.File r8, java.lang.String r9, java.lang.String r10) {
        /*
            r5 = 1
            if (r9 == 0) goto L_0x000f
            boolean r0 = X.AnonymousClass1YF.A0T(r9)
            r0 = r0 ^ 1
            if (r0 != r5) goto L_0x000f
        L_0x000b:
            r6 = 0
            if (r9 != 0) goto L_0x001c
            return r6
        L_0x000f:
            if (r10 == 0) goto L_0x001a
            boolean r0 = X.AnonymousClass1YF.A0T(r10)
            r0 = r0 ^ 1
            r9 = r10
            if (r0 == r5) goto L_0x000b
        L_0x001a:
            r9 = 0
            goto L_0x000b
        L_0x001c:
            X.17r r0 = r7.A00
            java.io.File r4 = r0.A0d(r9)
            X.1NL r3 = r7.A0C     // Catch:{ IOException -> 0x0032 }
            X.0ve r2 = r7.A02     // Catch:{ IOException -> 0x0032 }
            r1 = 11097(0x2b59, float:1.555E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ IOException -> 0x0032 }
            boolean r0 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ IOException -> 0x0032 }
            X.C64062u9.A0F(r3, r8, r4, r0)     // Catch:{ IOException -> 0x0032 }
            return r4
        L_0x0032:
            r2 = move-exception
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = 0
            r1[r0] = r8
            r1[r5] = r4
            java.lang.String r0 = "MediaJobManager/renameThumbnailFileToMmsDirectPath Fail to rename from %s to %s."
            java.lang.String r0 = java.lang.String.format(r0, r1)
            com.whatsapp.util.Log.w(r0, r2)
            X.C64062u9.A0Q(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1T6.A02(X.1T6, java.io.File, java.lang.String, java.lang.String):java.io.File");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c8, code lost:
        r6 = X.AnonymousClass204.A0A(new X.AnonymousClass25O((android.graphics.BitmapFactory.Options) null, (java.lang.Long) null, 96, 96, true), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x010e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x010f, code lost:
        com.whatsapp.util.Log.e("MediaJobManager/enqueueThumbnailUpload, exception when creating thumbnail file", r1);
        r2.A06 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0116, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A06(X.AnonymousClass1T6 r14, X.AnonymousClass34B r15, X.C184589bC r16) {
        /*
            r2 = r15
            boolean r0 = r14.A0L(r15)
            r12 = 0
            if (r0 != 0) goto L_0x000b
            r15.A06 = r12
        L_0x000a:
            return
        L_0x000b:
            byte[] r5 = r15.A06
            if (r5 == 0) goto L_0x000a
            X.17r r0 = r14.A00     // Catch:{ IOException -> 0x010e }
            X.2hC r0 = r0.A08()     // Catch:{ IOException -> 0x010e }
            java.io.File r4 = r0.A0B     // Catch:{ IOException -> 0x010e }
            r3 = 0
            X.C218617r.A07(r4, r3)     // Catch:{ IOException -> 0x010e }
            java.lang.String r0 = "thumbnails"
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x010e }
            r1.<init>(r4, r0)     // Catch:{ IOException -> 0x010e }
            X.C218617r.A07(r1, r3)     // Catch:{ IOException -> 0x010e }
            java.lang.String r0 = ""
            java.lang.String r0 = X.C218617r.A04(r1, r0)     // Catch:{ IOException -> 0x010e }
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x010e }
            r3.<init>(r1, r0)     // Catch:{ IOException -> 0x010e }
            X.C64062u9.A0L(r3, r5)     // Catch:{ IOException -> 0x010e }
            r3.getAbsolutePath()     // Catch:{ IOException -> 0x010e }
            X.2kI r0 = r15.A02()     // Catch:{ IOException -> 0x010e }
            X.1So r0 = r0.A06     // Catch:{ IOException -> 0x010e }
            int r1 = r0.A00     // Catch:{ IOException -> 0x010e }
            X.2kI r0 = r15.A02()     // Catch:{ IOException -> 0x010e }
            X.1So r0 = r0.A06     // Catch:{ IOException -> 0x010e }
            boolean r0 = X.C63972u0.A06(r0)     // Catch:{ IOException -> 0x010e }
            X.1So r1 = X.C63972u0.A00(r1, r0)     // Catch:{ IOException -> 0x010e }
            int r0 = r15.A01     // Catch:{ IOException -> 0x010e }
            r5 = r16
            X.2h8 r9 = X.C60422o0.A01(r5, r1, r3, r0)     // Catch:{ IOException -> 0x010e }
            X.1Sb r8 = r14.A04     // Catch:{ IOException -> 0x010e }
            X.2kI r0 = r15.A02()     // Catch:{ IOException -> 0x010e }
            X.1So r0 = r0.A06     // Catch:{ IOException -> 0x010e }
            int r7 = r0.A00     // Catch:{ IOException -> 0x010e }
            X.2kI r0 = r15.A02()     // Catch:{ IOException -> 0x010e }
            int r6 = r0.A01     // Catch:{ IOException -> 0x010e }
            X.73e r4 = r15.A0O     // Catch:{ IOException -> 0x010e }
            monitor-enter(r4)     // Catch:{ IOException -> 0x010e }
            boolean r1 = r4.A0N     // Catch:{ all -> 0x010b }
            monitor-exit(r4)     // Catch:{ IOException -> 0x010e }
            X.2h4 r0 = r15.A0N     // Catch:{ IOException -> 0x010e }
            java.lang.String r0 = r0.A0D     // Catch:{ IOException -> 0x010e }
            X.34A r4 = r8.A02(r0, r7, r6, r1)     // Catch:{ IOException -> 0x010e }
            java.lang.String r11 = r15.A04()     // Catch:{ IOException -> 0x010e }
            X.2h4 r8 = r4.A00     // Catch:{ IOException -> 0x010e }
            X.2ta r0 = r15.A0P     // Catch:{ IOException -> 0x010e }
            X.2qf r10 = r0.A03     // Catch:{ IOException -> 0x010e }
            X.BAf r7 = A00(r9)     // Catch:{ IOException -> 0x010e }
            X.2rU r6 = new X.2rU     // Catch:{ IOException -> 0x010e }
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ IOException -> 0x010e }
            X.73e r1 = r4.A01     // Catch:{ IOException -> 0x010e }
            X.9i7 r0 = r6.A04     // Catch:{ IOException -> 0x010e }
            r1.A0D(r0)     // Catch:{ IOException -> 0x010e }
            r15.A02 = r4     // Catch:{ IOException -> 0x010e }
            r15.A03 = r5     // Catch:{ IOException -> 0x010e }
            X.1Sg r0 = r14.A0B     // Catch:{ IOException -> 0x010e }
            X.8ff r5 = r0.A0A(r4, r6)     // Catch:{ IOException -> 0x010e }
            r0 = 12
            X.7Nc r4 = new X.7Nc     // Catch:{ IOException -> 0x010e }
            r4.<init>(r15, r0)     // Catch:{ IOException -> 0x010e }
            java.util.concurrent.Executor r1 = r14.A0G     // Catch:{ IOException -> 0x010e }
            X.1TJ r0 = r5.A0H     // Catch:{ IOException -> 0x010e }
            r0.A03(r4, r1)     // Catch:{ IOException -> 0x010e }
            X.2kI r0 = r15.A02()     // Catch:{ IOException -> 0x010e }
            X.1So r1 = r0.A06     // Catch:{ IOException -> 0x010e }
            X.1So r0 = X.C26551So.A0B     // Catch:{ IOException -> 0x010e }
            if (r1 != r0) goto L_0x000a
            X.0ve r4 = r14.A02     // Catch:{ IOException -> 0x010e }
            r1 = 247(0xf7, float:3.46E-43)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ IOException -> 0x010e }
            boolean r0 = X.C18020vd.A05(r0, r4, r1)     // Catch:{ IOException -> 0x010e }
            if (r0 == 0) goto L_0x000a
            X.1So r1 = r9.A06     // Catch:{ IOException -> 0x010e }
            r16 = 1
            X.00H r0 = r14.A0P     // Catch:{ IOException -> 0x010e }
            r0.get()     // Catch:{ IOException -> 0x010e }
            X.1So r0 = X.C26551So.A0C     // Catch:{ IOException -> 0x010e }
            if (r1 != r0) goto L_0x000a
            r14 = 96
            X.25O r11 = new X.25O     // Catch:{ IOException -> 0x010e }
            r13 = r12
            r15 = r14
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ IOException -> 0x010e }
            X.25P r6 = X.AnonymousClass204.A0A(r11, r3)     // Catch:{ IOException -> 0x010e }
            android.graphics.Bitmap r0 = r6.A02     // Catch:{ IOException -> 0x010e }
            if (r0 == 0) goto L_0x000a
            android.graphics.Bitmap r5 = X.C26511Sk.A07(r0, r12, r14, r14)     // Catch:{ IOException -> 0x010e }
            X.C18070vi.A0X(r5)     // Catch:{ IOException -> 0x010e }
            r1 = 48
            r0 = 0
            byte[] r4 = X.C60892om.A00(r5, r1, r0, r0)     // Catch:{ IOException -> 0x010e }
            if (r4 == 0) goto L_0x000a
            int r0 = r6.A01     // Catch:{ IOException -> 0x010e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x010e }
            int r0 = r6.A00     // Catch:{ IOException -> 0x010e }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x010e }
            android.util.Pair r0 = new android.util.Pair     // Catch:{ IOException -> 0x010e }
            r0.<init>(r3, r1)     // Catch:{ IOException -> 0x010e }
            r5.getWidth()     // Catch:{ IOException -> 0x010e }
            r5.getHeight()     // Catch:{ IOException -> 0x010e }
            X.2eu r1 = new X.2eu     // Catch:{ IOException -> 0x010e }
            r1.<init>(r0, r12, r4, r12)     // Catch:{ IOException -> 0x010e }
            X.1TJ r0 = r2.A07     // Catch:{ IOException -> 0x010e }
            r0.A04(r1)     // Catch:{ IOException -> 0x010e }
            return
        L_0x010b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ IOException -> 0x010e }
            throw r0     // Catch:{ IOException -> 0x010e }
        L_0x010e:
            r1 = move-exception
            java.lang.String r0 = "MediaJobManager/enqueueThumbnailUpload, exception when creating thumbnail file"
            com.whatsapp.util.Log.e(r0, r1)
            r2.A06 = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1T6.A06(X.1T6, X.34B, X.9bC):void");
    }

    public void A0G(C143887Fe r21, AnonymousClass3M0 r22, C49572Qz r23, int i) {
        byte[] bArr;
        C26551So r0;
        C143887Fe r1 = r21;
        if (r21 != null) {
            String str = r1.A0S;
            int i2 = i;
            if (i2 == 2) {
                bArr = r1.A0I;
            } else {
                bArr = r1.A0K;
            }
            if (bArr != null) {
                File A0c = this.A00.A0c(UUID.randomUUID().toString());
                try {
                    C64062u9.A0L(A0c, bArr);
                    Pair A0B2 = C26511Sk.A0B(A0c);
                    C49572Qz r10 = r23;
                    C693536w r3 = new C693536w(r10, -1);
                    r3.A01 = ((Number) A0B2.second).intValue();
                    r3.A00 = ((Number) A0B2.first).intValue();
                    r3.A08 = A0c.getName();
                    AnonymousClass3M0 r6 = r22;
                    r6.CJV(r3, str, i2);
                    if (i2 == 1) {
                        r0 = C26551So.A0a;
                    } else {
                        r0 = C26551So.A0L;
                    }
                    C56232h8 A012 = C60422o0.A01((C184589bC) null, r0, A0c, 1);
                    AnonymousClass34A A022 = this.A04.A02(UUID.randomUUID().toString(), 0, 0, false);
                    String A002 = A022.A00();
                    C62492rU r14 = new C62492rU(A00(A012), A022.A00, A012, new C62022qf(false, false, true), A002);
                    C1408173e r12 = A022.A01;
                    r12.A0B(-1, 0, true);
                    r12.A0D(r14.A04);
                    long currentTimeMillis = System.currentTimeMillis();
                    r6.CJX(A022, str, i2);
                    C167228ff A0A2 = this.A0B.A0A(A022, r14);
                    A0A2.A0H.A03(new C70223Af(A0B2, r6, this, A022, r14, r10, A0c, str, i2, currentTimeMillis), this.A0G);
                } catch (IOException e) {
                    Log.w(String.format("MediaJobManager/writeLinkThumbnailFileAsLocalResource create thumbnail fail at %s.", new Object[]{A0c}), e);
                    C64062u9.A0Q(A0c);
                }
            }
        }
    }

    public static C22498BAf A00(C56232h8 r2) {
        boolean z;
        C26551So r1 = r2.A06;
        if (C63972u0.A06(r1)) {
            z = r2.A0E;
        } else {
            z = r2.A0D;
        }
        if (z) {
            return new AnonymousClass7FC(r1);
        }
        return new C20586AQw(r1);
    }

    public static C693536w A01(Pair pair, C55612g5 r6, C49572Qz r7, long j) {
        C196299un r3 = r6.A02;
        C61382pa A002 = r3.A00();
        C693536w r2 = new C693536w(r7, -1);
        r2.A05 = r3.A03();
        if (A002 != null) {
            r2.A0B = A002.A01;
            r2.A02 = A002.A00;
        }
        r2.A06 = r3.A05();
        r2.A09 = r3.A06();
        r2.A01 = ((Number) pair.second).intValue();
        r2.A00 = ((Number) pair.first).intValue();
        r2.A03 = System.currentTimeMillis() - j;
        r2.A07 = r3.A04();
        return r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054 A[Catch:{ IOException -> 0x006d, Exception -> 0x0062 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A03(android.net.Uri r6, X.AnonymousClass11B r7, java.lang.String r8) {
        /*
            r5 = this;
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r8)
            java.lang.String r0 = "/.Shared"
            boolean r0 = r8.contains(r0)
            java.lang.String r1 = " | allowListed:"
            if (r0 == 0) goto L_0x003a
            r4.append(r1)
            X.17r r2 = r5.A00
            X.2hC r0 = r2.A08()
            java.io.File r1 = r0.A0B
            r0 = 0
            X.C218617r.A07(r1, r0)
            r4.append(r1)
            java.lang.String r0 = " , "
            r4.append(r0)
            java.io.File r0 = r2.A0G()
        L_0x002a:
            r4.append(r0)
        L_0x002d:
            java.lang.String r0 = "file:/"
            boolean r0 = r8.startsWith(r0)
            if (r0 == 0) goto L_0x0072
            if (r6 == 0) goto L_0x0072
            if (r7 == 0) goto L_0x0072
            goto L_0x004c
        L_0x003a:
            java.lang.String r0 = "/Stickers"
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x002d
            r4.append(r1)
            X.17r r0 = r5.A00
            java.io.File r0 = r0.A0I()
            goto L_0x002a
        L_0x004c:
            java.io.InputStream r2 = r7.A07(r6)     // Catch:{ IOException -> 0x006d, Exception -> 0x0062 }
            boolean r0 = r2 instanceof java.io.FileInputStream     // Catch:{ IOException -> 0x006d, Exception -> 0x0062 }
            if (r0 == 0) goto L_0x005c
            X.1NL r1 = r5.A0C     // Catch:{ IOException -> 0x006d, Exception -> 0x0062 }
            java.io.FileInputStream r2 = (java.io.FileInputStream) r2     // Catch:{ IOException -> 0x006d, Exception -> 0x0062 }
            r0 = 0
            r1.A08(r2, r0, r0)     // Catch:{ IOException -> 0x006d, Exception -> 0x0062 }
        L_0x005c:
            java.lang.String r0 = " | ensureFileInputStreamIsExternal:pass"
            r4.append(r0)     // Catch:{ IOException -> 0x006d, Exception -> 0x0062 }
            goto L_0x0072
        L_0x0062:
            r1 = move-exception
            java.lang.String r0 = " | ensureFileInputStreamIsExternal:"
            r4.append(r0)
            java.lang.String r0 = r1.getMessage()
            goto L_0x006f
        L_0x006d:
            java.lang.String r0 = " | ensureFileInputStreamIsExternal:fail"
        L_0x006f:
            r4.append(r0)
        L_0x0072:
            X.190 r3 = r5.A0I
            java.lang.String r2 = r4.toString()
            r1 = 1
            java.lang.String r0 = "EXTERNAL_FILE_ENQUEUE_MEDIA_UPLOAD_CRITICAL_EVENT"
            r3.A0G(r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1T6.A03(android.net.Uri, X.11B, java.lang.String):void");
    }

    public static void A04(AnonymousClass1T6 r3, AnonymousClass34B r4, C55982gh r5) {
        r5.A02.A03(r4.A0R, (Executor) null);
        r5.A04.A03(r4.A0S, (Executor) null);
        r5.A03.A03(new C145937Ne(r4, r3, 9), (Executor) null);
        r5.A05.A03(new AnonymousClass3AW(r5, r3, r4, 2), (Executor) null);
        r5.A01.A03(new C145937Ne(r4, r3, 5), (Executor) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (r2 != null) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A05(X.AnonymousClass1T6 r3, X.AnonymousClass34B r4, X.C55362fe r5) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r2 = r4.A0W
            r1 = 0
            r0 = 1
            boolean r0 = r2.compareAndSet(r1, r0)
            if (r0 == 0) goto L_0x001a
            boolean r0 = r4.A05
            if (r0 == 0) goto L_0x001b
            boolean r1 = r4.A0A()
            r0 = 1
            if (r1 == 0) goto L_0x0017
            r0 = 32
        L_0x0017:
            r3.A08(r4, r0)
        L_0x001a:
            return
        L_0x001b:
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x004a
            byte[] r2 = r5.A04
            boolean r1 = r4.A09()
            X.2h8 r0 = r4.A01()
            if (r1 == 0) goto L_0x0044
            X.2KJ r1 = new X.2KJ
            r1.<init>(r4, r0)
        L_0x0030:
            boolean r0 = r3.A0L(r4)
            if (r0 == 0) goto L_0x0042
            if (r2 == 0) goto L_0x003a
        L_0x0038:
            r4.A06 = r2
        L_0x003a:
            boolean r0 = r4.A05
            if (r0 != 0) goto L_0x004d
            r3.A0I(r4, r1)
            return
        L_0x0042:
            r2 = 0
            goto L_0x0038
        L_0x0044:
            X.2rU r1 = new X.2rU
            r1.<init>(r4, r0)
            goto L_0x0030
        L_0x004a:
            r0 = 20
            goto L_0x0017
        L_0x004d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "mediatranscodequeue/success/all-cancelled "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1T6.A05(X.1T6, X.34B, X.2fe):void");
    }

    public static void A07(AnonymousClass1T6 r1, AnonymousClass34B r2, C55612g5 r3) {
        r2.A0L.A04(r3);
        if (!r2.A0A() || r3.A00 != 0) {
            r1.A09(r2, r3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r4.A03() != null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A08(X.AnonymousClass34B r4, int r5) {
        /*
            r3 = this;
            r4.A00 = r5
            X.1TJ r0 = r4.A0H
            java.lang.Object r0 = r0.A00()
            r2 = 1
            if (r0 != 0) goto L_0x0012
            X.2g5 r1 = r4.A03()
            r0 = 0
            if (r1 == 0) goto L_0x0013
        L_0x0012:
            r0 = 1
        L_0x0013:
            X.C17960vV.A0D(r0)
            if (r5 == r2) goto L_0x001c
            r0 = 32
            if (r5 != r0) goto L_0x0039
        L_0x001c:
            X.1TJ r0 = r4.A0B
            java.lang.Object r0 = r0.A00()
            X.2ex r0 = (X.C54942ex) r0
            if (r0 == 0) goto L_0x0039
            java.io.File r1 = r0.A01
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A02
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0039
            boolean r0 = X.C64062u9.A0Q(r1)
            if (r0 == 0) goto L_0x0039
            r1.getAbsolutePath()
        L_0x0039:
            r4.A06(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1T6.A08(X.34B, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0063, code lost:
        if (r3 == 0) goto L_0x0065;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0127 A[Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x00fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0128 A[Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x00fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0139 A[Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x00fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0159 A[Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x00fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0178  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A09(X.AnonymousClass34B r14, X.C55612g5 r15) {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicBoolean r2 = r14.A0Y
            r1 = 0
            r0 = 1
            boolean r0 = r2.compareAndSet(r1, r0)
            if (r0 == 0) goto L_0x0017
            boolean r0 = r14.A0A()
            if (r0 == 0) goto L_0x0018
            int r0 = r15.A00
            if (r0 == 0) goto L_0x0018
            r13.A08(r14, r0)
        L_0x0017:
            return
        L_0x0018:
            int r3 = r15.A00
            r0 = 12
            r7 = 0
            if (r3 != r0) goto L_0x004c
            X.2rU r0 = r15.A01
            X.2h8 r0 = r0.A02
            X.1So r4 = r0.A06
            java.io.File r2 = r0.A07
            X.C17960vV.A07(r2)
            X.9un r1 = r15.A02
            monitor-enter(r1)
            java.lang.String r0 = r1.A0C     // Catch:{ all -> 0x0030 }
            goto L_0x0033
        L_0x0030:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0033:
            monitor-exit(r1)
            X.2et r1 = new X.2et
            r1.<init>(r4, r2, r0, r7)
            X.00H r0 = r13.A0P
            java.lang.Object r0 = r0.get()
            X.2jk r0 = (X.C57852jk) r0
            X.2eu r1 = r0.A00(r1)
            if (r1 == 0) goto L_0x004c
            X.1TJ r0 = r14.A08
            r0.A04(r1)
        L_0x004c:
            java.lang.Object r6 = r14.A0V
            monitor-enter(r6)
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger     // Catch:{ all -> 0x021b }
            r1.<init>()     // Catch:{ all -> 0x021b }
            X.1TJ r0 = r14.A0A     // Catch:{ all -> 0x021b }
            r0.A04(r1)     // Catch:{ all -> 0x021b }
            int r5 = r1.get()     // Catch:{ all -> 0x021b }
            boolean r0 = r15.A05     // Catch:{ all -> 0x021b }
            r2 = 1
            if (r0 == 0) goto L_0x0065
            r0 = 1
            if (r3 != 0) goto L_0x0066
        L_0x0065:
            r0 = 0
        L_0x0066:
            if (r5 <= 0) goto L_0x0175
            if (r0 != 0) goto L_0x0175
            X.2rU r0 = r15.A01     // Catch:{ all -> 0x021b }
            X.2h8 r1 = r0.A02     // Catch:{ all -> 0x021b }
            java.io.File r10 = r1.A07     // Catch:{ all -> 0x021b }
            X.C17960vV.A07(r10)     // Catch:{ all -> 0x021b }
            A0A(r10)     // Catch:{ all -> 0x021b }
            java.io.File r4 = r15.A03     // Catch:{ all -> 0x021b }
            A0A(r4)     // Catch:{ all -> 0x021b }
            if (r4 == 0) goto L_0x0091
            long r11 = r4.length()     // Catch:{ all -> 0x021b }
            X.C17960vV.A07(r10)     // Catch:{ all -> 0x021b }
            long r8 = r10.length()     // Catch:{ all -> 0x021b }
            int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0091
            java.lang.String r0 = "mediajobmanager/handleMediaUploadResponse/upload dedup with wrong size"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x021b }
        L_0x0091:
            X.1Ns r11 = r13.A0J     // Catch:{ all -> 0x021b }
            X.C17960vV.A07(r10)     // Catch:{ all -> 0x021b }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x021b }
            if (r4 == 0) goto L_0x00b0
            boolean r0 = r4.exists()     // Catch:{ all -> 0x021b }
            if (r0 == 0) goto L_0x00b0
            X.2ex r0 = new X.2ex     // Catch:{ all -> 0x021b }
            r0.<init>(r4, r2)     // Catch:{ all -> 0x021b }
        L_0x00a7:
            android.util.Pair r4 = android.util.Pair.create(r8, r0)     // Catch:{ all -> 0x021b }
        L_0x00ab:
            java.lang.Object r8 = r4.second     // Catch:{ all -> 0x021b }
            X.2ex r8 = (X.C54942ex) r8     // Catch:{ all -> 0x021b }
            goto L_0x0125
        L_0x00b0:
            r4 = 0
            X.17r r9 = r11.A00     // Catch:{ IOException -> 0x0115 }
            boolean r0 = r9.A0l(r10)     // Catch:{ IOException -> 0x0115 }
            if (r0 != 0) goto L_0x010f
            java.lang.String r12 = r10.getCanonicalPath()     // Catch:{ IOException -> 0x0115 }
            X.2hC r0 = r9.A08()     // Catch:{ IOException -> 0x0115 }
            java.io.File r0 = r0.A0A     // Catch:{ IOException -> 0x0115 }
            java.lang.String r0 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x0115 }
            boolean r0 = r12.startsWith(r0)     // Catch:{ IOException -> 0x0115 }
            if (r0 != 0) goto L_0x010f
            X.1So r12 = r1.A06     // Catch:{ all -> 0x021b }
            int r1 = r1.A01     // Catch:{ all -> 0x021b }
            X.0vc r0 = r11.A04     // Catch:{ all -> 0x021b }
            java.io.File r1 = X.C26511Sk.A0E(r9, r0, r12, r10, r1)     // Catch:{ all -> 0x021b }
            boolean r0 = r9.A0m(r10)     // Catch:{ IOException -> 0x00ef }
            if (r0 == 0) goto L_0x00ef
            X.1Nr r11 = r11.A02     // Catch:{ IOException -> 0x00ef }
            java.lang.String r0 = r10.getAbsolutePath()     // Catch:{ IOException -> 0x00ef }
            int r0 = r11.A00(r0)     // Catch:{ IOException -> 0x00ef }
            int r0 = r0 + 1
            if (r0 != r5) goto L_0x00ef
            r9.A0j(r10, r1)     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x00fc }
            goto L_0x00f2
        L_0x00ef:
            r9.A0i(r10, r1)     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x00fc }
        L_0x00f2:
            X.2ex r0 = new X.2ex     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x00fc }
            r0.<init>(r1, r7)     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x00fc }
            android.util.Pair r4 = android.util.Pair.create(r8, r0)     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x00fc }
            goto L_0x00ab
        L_0x00fc:
            r1 = move-exception
            java.lang.String r0 = "ReferenceCountedFileManager/moveFile/copy-failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x021b }
            android.util.Pair r4 = android.util.Pair.create(r8, r4)     // Catch:{ all -> 0x021b }
            goto L_0x00ab
        L_0x0107:
            r1 = move-exception
            java.lang.String r0 = "ReferenceCountedFileManager/moveFile/file-not-found"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x021b }
            r0 = 7
            goto L_0x011c
        L_0x010f:
            X.2ex r0 = new X.2ex     // Catch:{ all -> 0x021b }
            r0.<init>(r10, r7)     // Catch:{ all -> 0x021b }
            goto L_0x00a7
        L_0x0115:
            r1 = move-exception
            java.lang.String r0 = "ReferenceCountedFileManager/moveFile/inmediafolder/ "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x021b }
            r0 = 3
        L_0x011c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x021b }
            android.util.Pair r4 = android.util.Pair.create(r0, r4)     // Catch:{ all -> 0x021b }
            goto L_0x00ab
        L_0x0125:
            if (r8 == 0) goto L_0x0128
            goto L_0x012a
        L_0x0128:
            r0 = 0
            goto L_0x012c
        L_0x012a:
            java.io.File r0 = r8.A01     // Catch:{ all -> 0x021b }
        L_0x012c:
            A0A(r0)     // Catch:{ all -> 0x021b }
            java.lang.Object r0 = r4.first     // Catch:{ all -> 0x021b }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x021b }
            int r0 = r0.intValue()     // Catch:{ all -> 0x021b }
            if (r0 == 0) goto L_0x0157
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x021b }
            r1.<init>()     // Catch:{ all -> 0x021b }
            java.lang.String r0 = "app/mediajobmanager/handleMediaUploadResponse/failed to move file; mediaJob="
            r1.append(r0)     // Catch:{ all -> 0x021b }
            r1.append(r14)     // Catch:{ all -> 0x021b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x021b }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x021b }
            if (r3 != 0) goto L_0x0157
            java.lang.Object r0 = r4.first     // Catch:{ all -> 0x021b }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x021b }
            int r3 = r0.intValue()     // Catch:{ all -> 0x021b }
        L_0x0157:
            if (r8 == 0) goto L_0x0175
            java.util.concurrent.atomic.AtomicInteger r4 = r8.A03     // Catch:{ all -> 0x021b }
            int r1 = r4.get()     // Catch:{ all -> 0x021b }
            r0 = 0
            if (r1 != 0) goto L_0x0163
            r0 = 1
        L_0x0163:
            X.C17960vV.A0D(r0)     // Catch:{ all -> 0x021b }
            X.1TJ r0 = r14.A0B     // Catch:{ all -> 0x021b }
            r0.A04(r8)     // Catch:{ all -> 0x021b }
            int r0 = r4.get()     // Catch:{ all -> 0x021b }
            if (r0 != r5) goto L_0x0172
            r7 = 1
        L_0x0172:
            X.C17960vV.A0D(r7)     // Catch:{ all -> 0x021b }
        L_0x0175:
            monitor-exit(r6)     // Catch:{ all -> 0x021b }
            if (r3 != 0) goto L_0x01ea
            X.2rU r0 = r15.A01
            X.2h8 r1 = r0.A02
            boolean r0 = r1.A0F
            if (r0 == 0) goto L_0x01ea
            X.1So r0 = r1.A06
            boolean r0 = X.C63972u0.A06(r0)
            if (r0 != 0) goto L_0x01d1
            X.9un r4 = r15.A02
            java.lang.String r0 = r4.A07()
            java.net.URL r1 = new java.net.URL     // Catch:{ MalformedURLException -> 0x01a9 }
            r1.<init>(r0)     // Catch:{ MalformedURLException -> 0x01a9 }
            java.lang.String r0 = r1.getHost()     // Catch:{ MalformedURLException -> 0x01a9 }
            if (r0 == 0) goto L_0x01a3
            java.lang.String r0 = r1.getHost()     // Catch:{ MalformedURLException -> 0x01a9 }
            int r0 = r0.length()     // Catch:{ MalformedURLException -> 0x01a9 }
            if (r0 != 0) goto L_0x01d1
        L_0x01a3:
            java.lang.String r0 = "mediaupload/url/no-host"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ MalformedURLException -> 0x01a9 }
            goto L_0x01af
        L_0x01a9:
            r1 = move-exception
            java.lang.String r0 = "mediaupload/url/error "
            com.whatsapp.util.Log.w(r0, r1)
        L_0x01af:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "app/mediajobmanager/handleMediaUploadResponse/url/error; url="
            r1.append(r0)
            java.lang.String r0 = r4.A07()
            r1.append(r0)
            java.lang.String r0 = "; mediaJob="
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r3 = 19
        L_0x01d1:
            boolean r0 = r15.A04
            if (r0 != 0) goto L_0x01ea
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "app/mediajobmanager/handleMediaUploadResponse/results not received; mediaJob="
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r3 = 3
        L_0x01ea:
            boolean r0 = r14.A05
            if (r0 == 0) goto L_0x01f7
            boolean r0 = r14.A0A()
            if (r0 == 0) goto L_0x01f6
            r2 = 32
        L_0x01f6:
            r3 = r2
        L_0x01f7:
            r0 = 28
            if (r3 != r0) goto L_0x0201
            X.1Ka r1 = r13.A0M
            r0 = 0
            r1.A01(r0)
        L_0x0201:
            r14.A00 = r3
            if (r3 != 0) goto L_0x0217
            byte[] r0 = r14.A06
            if (r0 == 0) goto L_0x0217
            r0 = 6
            X.7Ne r2 = new X.7Ne
            r2.<init>(r14, r13, r0)
            java.util.concurrent.Executor r1 = r13.A0G
            X.1TJ r0 = r14.A0I
            r0.A03(r2, r1)
            return
        L_0x0217:
            r14.A06(r3)
            return
        L_0x021b:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x021b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1T6.A09(X.34B, X.2g5):void");
    }

    public static void A0A(File file) {
        if (file != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("size=");
            sb.append(file.length());
            sb.append(" exists=");
            sb.append(file.exists());
            sb.toString();
        }
    }

    public AnonymousClass34B A0B(C22498BAf bAf, C63722ta r14, boolean z) {
        C26421Sb r2 = this.A04;
        AnonymousClass1SS r6 = r2.A0I;
        C63722ta r11 = r14;
        String str = r14.A04;
        if (str == null) {
            str = UUID.randomUUID().toString();
        }
        C56202h4 A022 = r6.A02(str, 0);
        C22498BAf bAf2 = bAf;
        AnonymousClass34B r62 = new AnonymousClass34B(bAf2, r2.A0A, A022, new C1408173e(r2.A06, A022, r6, r2.A0Q, z), r11);
        String str2 = r62.A0N.A0D;
        C18070vi.A0d(str2, 0);
        r62.A0C.A04(str2);
        r62.A0O.A09();
        return r62;
    }

    public AnonymousClass34B A0C(C63722ta r2, boolean z) {
        return A0B(A00(r2.A01), r2, z);
    }

    public AnonymousClass34B A0D(C63722ta r4, boolean z) {
        AnonymousClass34B A012 = this.A04.A01(r4, z);
        if (A012 == null) {
            return A0C(r4, z);
        }
        if (z) {
            A012.A0N.A03++;
        }
        AnonymousClass1SS r1 = this.A05;
        C56202h4 r0 = A012.A0N;
        r1.A04(r0);
        String str = r0.A0D;
        C18070vi.A0d(str, 0);
        A012.A0C.A04(str);
        A012.A0O.A09();
        return A012;
    }

    public C59122ln A0E(C56202h4 r17, C1408173e r18, C55612g5 r19, int i, int i2, int i3) {
        C55612g5 r3;
        List list;
        int i4 = i;
        int i5 = i3;
        C1408173e r8 = r18;
        if (i5 == 4) {
            r8.A0A(i5);
        }
        synchronized (r8) {
            r3 = r19;
            if (i == 0) {
                r8.A03 = SystemClock.uptimeMillis();
                C1408173e.A03(r8);
                if (i5 != 3) {
                    this.A0D.CGF(new C146807Qr(this, r17, 8));
                }
            } else {
                r8.A03 = SystemClock.uptimeMillis();
                C1408173e.A03(r8);
                if (!this.A0K.A09() && ((r19 != null && r3.A01.A04.A0B == null && (i4 == 17 || i4 == 22 || i4 == 13 || i4 == 33)) || i4 == 14)) {
                    i4 = 25;
                }
            }
        }
        int i6 = i2;
        AnonymousClass64X A052 = r8.A05(this.A02, i4, i6);
        if (r19 == null) {
            list = Collections.emptyList();
        } else {
            AnonymousClass1SU r5 = this.A08;
            List<String> A002 = r5.A00(r3.A01.A02.A0C);
            ArrayList arrayList = new ArrayList(C29351c6.A0C(A002, 10));
            for (String str : A002) {
                C18030ve r11 = r5.A01;
                AnonymousClass11E r13 = r5.A00;
                AnonymousClass2HE r4 = new AnonymousClass2HE();
                C56202h4 r10 = r8.A0K;
                r4.A09 = Long.valueOf(UUID.fromString(r10.A0D).getLeastSignificantBits() & Long.MAX_VALUE);
                r4.A0E = str;
                C188859i7 r9 = r8.A07;
                if (r9 != null) {
                    r4.A00 = r9.A02;
                    r4.A01 = r9.A03;
                    r4.A02 = Double.valueOf((double) C1409973w.A04(r9.A0D));
                    r4.A03 = Double.valueOf((double) C1409973w.A04(r9.A09));
                    r4.A0B = r9.A0H;
                    r4.A0C = C1409973w.A06(r9.A0L, r8.A0G);
                }
                int i7 = r8.A02;
                boolean z = false;
                if (r10.A0B == 2) {
                    z = true;
                }
                r4.A04 = Integer.valueOf(C1408173e.A00(i7, z));
                r4.A05 = AnonymousClass1LS.A00(r13.A04());
                r4.A06 = r8.A09;
                r4.A07 = C1408173e.A01(r8.A06(i4), r8.A07(r11, i4));
                r4.A08 = Integer.valueOf(i6);
                r4.A0A = Long.valueOf(C1409973w.A04(Long.valueOf(r10.A07)));
                r4.A0D = C1409973w.A06(Long.valueOf(r8.A05), r8.A0G);
                arrayList.add(r4);
            }
            list = arrayList;
        }
        return new C59122ln(A052, list);
    }

    public C59122ln A0F(AnonymousClass34B r8, int i, int i2) {
        int A042;
        C56202h4 r1 = r8.A0N;
        C1408173e r2 = r8.A0O;
        C55612g5 A032 = r8.A03();
        if (r8.A09()) {
            A042 = 4;
        } else {
            A042 = r2.A04();
        }
        return A0E(r1, r2, A032, i, i2, A042);
    }

    public void A0I(AnonymousClass34B r12, C62492rU r13) {
        AnonymousClass34B r7 = r12;
        this.A0A.A02(r12.A04(), AnonymousClass00R.A0Y);
        C62492rU r6 = r13;
        C167228ff A0A2 = this.A0B.A0A(r12, r13);
        r12.A0O.A0D(A0A2.A0G().A04);
        boolean z = true;
        if (r13.A00() != 3) {
            z = false;
            A0A2.A0C.A03(r12.A0T, this.A0G);
        }
        C145977Ni r5 = new C145977Ni(r6, r7, A0A2, this, 1);
        Executor executor = this.A0G;
        A0A2.A0H.A03(r5, executor);
        A0A2.A0E.A03(new C145937Ne(r12, this, 8), (Executor) null);
        A0A2.A0F.A03(new C145917Nc(r12, 13), (Executor) null);
        if (!z) {
            A0A2.A0G.A03(r12.A0U, executor);
        }
        A0A2.A0D.A03(r12.A0Q, executor);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013f, code lost:
        if (r6 != null) goto L_0x0161;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x007f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0J(X.AnonymousClass34B r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "app/mediajobmanager/enqueuemediaupload "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2kI r9 = r12.A02()
            X.1So r7 = r9.A06
            boolean r10 = r9.A0L
            boolean r8 = r9.A0D
            java.io.File r6 = r9.A08
            java.lang.String r5 = r9.A0C
            if (r10 == 0) goto L_0x0046
            boolean r0 = X.C26431Sc.A08(r7, r6)
            if (r0 != 0) goto L_0x0046
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "app/mediajobmanager/enqueuemediaupload we cannot transcode media that needs transcoding "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 34
        L_0x0040:
            r12.A00 = r0
            r12.A06(r0)
            return
        L_0x0046:
            X.1So r1 = X.C26551So.A0B
            if (r7 != r1) goto L_0x006a
            java.lang.String r0 = r9.A0B
            int r2 = X.C26511Sk.A04(r0)
            r0 = -1
            if (r2 != r0) goto L_0x006a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "app/mediajobmanager/enqueuemediaupload we are unable to determine the mimetype of this document "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 35
            goto L_0x0040
        L_0x006a:
            X.0ve r3 = r11.A02
            r2 = 11097(0x2b59, float:1.555E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r2)
            r4 = 0
            if (r0 == 0) goto L_0x00ba
            if (r6 == 0) goto L_0x0091
            X.1NL r0 = r11.A0C     // Catch:{ IOException -> 0x007f }
            r0.A06(r6)     // Catch:{ IOException -> 0x007f }
            goto L_0x00ba
        L_0x007f:
            java.lang.String r0 = r6.getCanonicalPath()     // Catch:{ Exception -> 0x0084 }
            goto L_0x0088
        L_0x0084:
            java.lang.String r0 = r6.getAbsolutePath()
        L_0x0088:
            java.lang.String r2 = X.AnonymousClass1NL.A00(r0)
            r0 = 0
            r11.A03(r0, r0, r2)
            goto L_0x00ba
        L_0x0091:
            if (r5 == 0) goto L_0x00ba
            java.lang.String r0 = "file:/"
            boolean r0 = r5.startsWith(r0)
            if (r0 == 0) goto L_0x00ba
            android.net.Uri r3 = android.net.Uri.parse(r5)
            X.11C r0 = r11.A0L
            X.11B r2 = r0.A0O()
            if (r2 == 0) goto L_0x00ba
            if (r3 == 0) goto L_0x00ba
            X.1NL r0 = r11.A0C     // Catch:{ Exception -> 0x00af }
            r0.A04(r3, r2, r4)     // Catch:{ Exception -> 0x00af }
            goto L_0x00ba
        L_0x00af:
            java.lang.String r0 = r3.toString()
            java.lang.String r0 = X.AnonymousClass1NL.A00(r0)
            r11.A03(r3, r2, r0)
        L_0x00ba:
            X.1TJ r0 = r12.A0H
            java.lang.Object r0 = r0.A00()
            java.lang.String r3 = " "
            if (r0 == 0) goto L_0x00c8
            r11.A0H(r12)
            return
        L_0x00c8:
            if (r6 == 0) goto L_0x00f0
            if (r5 != 0) goto L_0x00f0
            boolean r0 = X.C63972u0.A05(r7)
            if (r0 == 0) goto L_0x00f0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "app/mediajobmanager queuing media into upload queue with null media name, "
            r2.append(r0)
            r2.append(r13)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.net.URI r0 = r6.toURI()
            java.lang.String r0 = r0.toString()
            r12.A04 = r0
        L_0x00f0:
            r2 = 7
            if (r10 != 0) goto L_0x012d
            boolean r0 = X.C63972u0.A0A(r7)
            if (r0 != 0) goto L_0x012d
            X.1Sc r0 = r11.A0O
            boolean r0 = r0.A0E(r7, r6)
            if (r0 != 0) goto L_0x012d
            if (r8 == 0) goto L_0x013f
            if (r6 != 0) goto L_0x0161
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "app/mediajobmanager queuing media into upload queue with null file, media_type="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "; media_name="
            r1.append(r0)
            r1.append(r5)
            r1.append(r3)
            r1.append(r13)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0127:
            r12.A00 = r2
            r12.A06(r2)
            return
        L_0x012d:
            if (r8 == 0) goto L_0x013f
            if (r5 != 0) goto L_0x0141
            boolean r0 = X.C63972u0.A05(r7)
            if (r0 == 0) goto L_0x0141
            X.190 r1 = r11.A0I
            java.lang.String r0 = "app/mediajobmanager/enqueuemediaupload media file and image name is null"
            r1.A0G(r0, r13, r4)
            goto L_0x0127
        L_0x013f:
            if (r6 != 0) goto L_0x0161
        L_0x0141:
            java.lang.Integer r2 = X.AnonymousClass00R.A00
            X.1Sa r1 = r11.A0A
            java.lang.String r0 = r12.A04()
            r1.A02(r0, r2)
            X.2kI r1 = r12.A02()
            X.1T5 r0 = r11.A09
            X.2gh r2 = r0.A01(r12, r1)
            X.73e r1 = r12.A0O
            X.70S r0 = r2.A00
            r1.A0C(r0)
            A04(r11, r12, r2)
            return
        L_0x0161:
            if (r7 != r1) goto L_0x0184
            java.lang.String r0 = r9.A0B
            boolean r0 = X.C26521Sl.A0f(r0)
            if (r0 == 0) goto L_0x0184
            java.lang.Integer r2 = X.AnonymousClass00R.A00
            X.1Sa r1 = r11.A0A
            java.lang.String r0 = r12.A04()
            r1.A02(r0, r2)
            X.2kI r1 = r12.A02()
            X.1T5 r0 = r11.A09
            X.2gh r0 = r0.A01(r12, r1)
            A04(r11, r12, r0)
            return
        L_0x0184:
            boolean r0 = r12.A09()
            X.2h8 r1 = r12.A01()
            if (r0 == 0) goto L_0x0197
            X.2KJ r0 = new X.2KJ
            r0.<init>(r12, r1)
        L_0x0193:
            r11.A0I(r12, r0)
            return
        L_0x0197:
            X.2rU r0 = new X.2rU
            r0.<init>(r12, r1)
            goto L_0x0193
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1T6.A0J(X.34B, java.lang.String):void");
    }

    public void A0K(AnonymousClass85B r2) {
        this.A0B.A08(r2);
    }

    public AnonymousClass1T6(AnonymousClass190 r5, C218617r r6, AnonymousClass1KB r7, C25311Ns r8, AnonymousClass11E r9, AnonymousClass11C r10, C24361Ka r11, C18030ve r12, AnonymousClass18K r13, C219317y r14, C26421Sb r15, AnonymousClass1SS r16, C26501Sj r17, AnonymousClass1RO r18, AnonymousClass1SU r19, AnonymousClass1T5 r20, C26411Sa r21, C26431Sc r22, C26471Sg r23, AnonymousClass1NL r24, AnonymousClass10I r25, AnonymousClass00H r26, AnonymousClass00H r27, AnonymousClass00H r28) {
        this.A0F = r26;
        this.A02 = r12;
        this.A01 = r7;
        AnonymousClass10I r2 = r25;
        this.A0D = r2;
        this.A0I = r5;
        this.A00 = r6;
        this.A03 = r13;
        this.A0E = r27;
        this.A04 = r15;
        this.A0M = r11;
        this.A0L = r10;
        this.A0O = r22;
        this.A07 = r18;
        this.A0B = r23;
        this.A05 = r16;
        this.A06 = r17;
        this.A09 = r20;
        this.A08 = r19;
        this.A0C = r24;
        this.A0K = r9;
        this.A0J = r8;
        this.A0A = r21;
        this.A0N = r14;
        C18070vi.A0d(r7, 0);
        this.A0G = new AnonymousClass3DL(r7, 3);
        C18070vi.A0d(r2, 0);
        this.A0H = new AnonymousClass3DL(r2, 2);
        this.A0P = r28;
    }

    public void A0H(AnonymousClass34B r2) {
        C55612g5 A032 = r2.A03();
        if (A032 != null) {
            A09(r2, A032);
            return;
        }
        C55362fe r0 = (C55362fe) r2.A0H.A00();
        if (r0 != null) {
            A05(this, r2, r0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r6.A02, 7835) == false) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0L(X.AnonymousClass34B r7) {
        /*
            r6 = this;
            X.2kI r0 = r7.A02()
            X.1So r3 = r0.A06
            X.2ta r0 = r7.A0P
            X.2qf r0 = r0.A03
            boolean r5 = r0.A03
            X.2h8 r0 = r7.A01()
            int[] r4 = r0.A0J
            X.1So r0 = X.C26551So.A0k
            if (r3 == r0) goto L_0x0052
            X.1So r0 = X.C26551So.A0B
            if (r3 != r0) goto L_0x0026
            X.0ve r2 = r6.A02
            r1 = 247(0xf7, float:3.46E-43)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x0052
        L_0x0026:
            if (r5 == 0) goto L_0x0054
            X.1So r0 = X.C26551So.A0E
            if (r3 != r0) goto L_0x003e
            if (r4 == 0) goto L_0x0046
            int r1 = r4.length
            r0 = 2
            if (r1 < r0) goto L_0x0046
            X.0ve r2 = r6.A02
            r1 = 7835(0x1e9b, float:1.0979E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x0046
        L_0x003e:
            X.1So r0 = X.C26551So.A0q
            if (r3 == r0) goto L_0x0046
            X.1So r0 = X.C26551So.A04
            if (r3 != r0) goto L_0x0054
        L_0x0046:
            X.0ve r2 = r6.A02
            r1 = 246(0xf6, float:3.45E-43)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0054
        L_0x0052:
            r0 = 1
            return r0
        L_0x0054:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1T6.A0L(X.34B):boolean");
    }
}
