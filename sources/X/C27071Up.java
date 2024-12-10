package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: X.1Up  reason: invalid class name and case insensitive filesystem */
public final class C27071Up extends C27061Uo {
    public final C19880zA A00;
    public final AnonymousClass1M9 A01;
    public final C24671Lf A02;
    public final C24791Lr A03;
    public final C26881Tv A04;
    public final AnonymousClass1MG A05;
    public final C27001Ui A06;
    public final C27051Un A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass11E A0C;
    public final AnonymousClass11P A0D;
    public final C19830z4 A0E;
    public final AnonymousClass121 A0F;
    public final AnonymousClass1MZ A0G;
    public final AnonymousClass1R3 A0H;
    public final C18030ve A0I;
    public final AnonymousClass18K A0J;
    public final C27031Ul A0K;
    public final AnonymousClass1PQ A0L;

    public final AnonymousClass73O A0B(AnonymousClass1BI r37, byte[] bArr, byte[] bArr2, boolean z) {
        AnonymousClass1BI r15 = r37;
        C18070vi.A0d(r15, 0);
        AnonymousClass11P r14 = this.A0D;
        AnonymousClass1KB r13 = this.A02;
        AnonymousClass11S r12 = this.A03;
        AnonymousClass18K r11 = this.A0J;
        AnonymousClass1M9 r10 = this.A01;
        C24671Lf r9 = this.A02;
        AnonymousClass1R3 r8 = this.A0H;
        C24791Lr r7 = this.A03;
        C26881Tv r6 = this.A04;
        C27001Ui r5 = this.A06;
        AnonymousClass1PQ r4 = this.A0L;
        AnonymousClass121 r3 = this.A0F;
        C27031Ul r2 = this.A0K;
        AnonymousClass1PQ r32 = r4;
        C27001Ui r31 = r5;
        C27031Ul r30 = r2;
        AnonymousClass1BI r29 = r15;
        AnonymousClass18K r28 = r11;
        AnonymousClass1R3 r27 = r8;
        AnonymousClass1MZ r26 = this.A0G;
        AnonymousClass121 r25 = r3;
        AnonymousClass11P r24 = r14;
        C26881Tv r23 = r6;
        C24791Lr r22 = r7;
        C24671Lf r21 = r9;
        AnonymousClass1M9 r20 = r10;
        AnonymousClass11S r19 = r12;
        AnonymousClass1KB r18 = r13;
        return new AnonymousClass73O(this.A00, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, bArr, bArr2, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0073, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0077, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a5, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a8, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C53772d4 A0C(byte[] r14) {
        /*
            r13 = this;
            r6 = 0
            android.graphics.BitmapFactory$Options r8 = new android.graphics.BitmapFactory$Options
            r8.<init>()
            r8.inScaled = r6
            r12 = 1
            r8.inDither = r12
            r8.inPreferQualityOverSpeed = r12
            r9 = 0
            r10 = 96
            X.25O r7 = new X.25O
            r11 = r10
            r7.<init>(r8, r9, r10, r11, r12)
            X.25P r0 = X.AnonymousClass204.A0C(r7, r14)
            android.graphics.Bitmap r7 = r0.A02
            if (r7 == 0) goto L_0x00a9
            android.graphics.Bitmap$Config r0 = r7.getConfig()
            if (r0 != 0) goto L_0x0026
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
        L_0x0026:
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r10, r10, r0)
            X.C18070vi.A0X(r3)
            android.graphics.Canvas r5 = new android.graphics.Canvas
            r5.<init>(r3)
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r4.setAntiAlias(r12)
            r4.setFilterBitmap(r12)
            r4.setDither(r12)
            int r2 = r7.getWidth()
            int r0 = r7.getHeight()
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r6, r6, r2, r0)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r6, r6, r10, r10)
            r5.drawBitmap(r7, r1, r0, r4)
            r7.recycle()
            X.17r r1 = r13.A01     // Catch:{ IOException -> 0x0078 }
            java.lang.String r0 = "tmpt"
            java.io.File r0 = r1.A0b(r0)     // Catch:{ IOException -> 0x0078 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0078 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0078 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0071 }
            r0 = 75
            r3.compress(r1, r0, r2)     // Catch:{ all -> 0x0071 }
            r2.close()     // Catch:{ IOException -> 0x0078 }
            goto L_0x007e
        L_0x0071:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ IOException -> 0x0078 }
            throw r0     // Catch:{ IOException -> 0x0078 }
        L_0x0078:
            r1 = move-exception
            java.lang.String r0 = "profileInfo/sendPhoto/cannot save thumb"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x007e:
            r3.recycle()
            X.17r r1 = r13.A01
            java.lang.String r0 = "tmpt"
            java.io.File r3 = r1.A0b(r0)
            long r1 = r3.length()
            int r0 = (int) r1
            byte[] r1 = new byte[r0]
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r3)
            r2.read(r1)     // Catch:{ all -> 0x00a2 }
            r2.close()
            X.2d4 r0 = new X.2d4
            r0.<init>(r14, r1)
            return r0
        L_0x00a2:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        L_0x00a9:
            java.lang.String r0 = "profileInfo/sendPhoto/cannot decode thumb"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27071Up.A0C(byte[]):X.2d4");
    }

    public final void A0D(AnonymousClass1E7 r8) {
        C18070vi.A0d(r8, 0);
        if (!this.A0C.A09()) {
            this.A02.A08(2131888361, 0);
            return;
        }
        C27001Ui r2 = this.A06;
        Jid A062 = r8.A06(AnonymousClass1BI.class);
        C17960vV.A07(A062);
        C18070vi.A0X(A062);
        r2.A05(A0B((AnonymousClass1BI) A062, (byte[]) null, (byte[]) null, false));
        C19830z4 r6 = this.A0E;
        if (r6.A0N("privacy_profile_photo") == 0 && r6.A0W("privacy_tip_remove_profile_photo_timestamp") == -1) {
            if (C18020vd.A05(C18040vf.A02, this.A0I, 3998)) {
                r6.A1i("privacy_tip_remove_profile_photo_timestamp");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0071, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0075, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0078, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E(X.AnonymousClass1E7 r10) {
        /*
            r9 = this;
            r7 = 0
            X.1Lr r0 = r9.A03
            java.io.File r4 = r0.A00(r10)
            java.io.File r1 = r0.A01(r10)
            if (r4 == 0) goto L_0x0099
            boolean r0 = r4.exists()
            if (r0 == 0) goto L_0x0099
            if (r1 == 0) goto L_0x0099
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0099
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x007d }
            r3.<init>(r1)     // Catch:{ IOException -> 0x007d }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ all -> 0x0076 }
            r5.<init>(r4)     // Catch:{ all -> 0x0076 }
            long r0 = r1.length()     // Catch:{ all -> 0x006f }
            int r2 = (int) r0     // Catch:{ all -> 0x006f }
            byte[] r6 = new byte[r2]     // Catch:{ all -> 0x006f }
            r1 = 0
        L_0x002d:
            r8 = -1
            if (r1 >= r2) goto L_0x003a
            int r0 = r2 - r1
            int r0 = r3.read(r6, r1, r0)     // Catch:{ all -> 0x006f }
            if (r0 == r8) goto L_0x003a
            int r1 = r1 + r0
            goto L_0x002d
        L_0x003a:
            long r0 = r4.length()     // Catch:{ all -> 0x006f }
            int r4 = (int) r0     // Catch:{ all -> 0x006f }
            byte[] r2 = new byte[r4]     // Catch:{ all -> 0x006f }
            r1 = 0
        L_0x0042:
            if (r1 >= r4) goto L_0x004e
            int r0 = r4 - r1
            int r0 = r5.read(r2, r1, r0)     // Catch:{ all -> 0x006f }
            if (r0 == r8) goto L_0x004e
            int r1 = r1 + r0
            goto L_0x0042
        L_0x004e:
            java.lang.Class<X.1BI> r0 = X.AnonymousClass1BI.class
            com.whatsapp.jid.Jid r0 = r10.A06(r0)     // Catch:{ all -> 0x006f }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x006f }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x006f }
            X.1BI r0 = (X.AnonymousClass1BI) r0     // Catch:{ all -> 0x006f }
            X.73O r1 = r9.A0B(r0, r2, r6, r7)     // Catch:{ all -> 0x006f }
            r0 = 1
            r1.A01 = r0     // Catch:{ all -> 0x006f }
            X.1Ui r0 = r9.A06     // Catch:{ all -> 0x006f }
            r0.A05(r1)     // Catch:{ all -> 0x006f }
            r5.close()     // Catch:{ all -> 0x0076 }
            r3.close()     // Catch:{ IOException -> 0x007d }
            return
        L_0x006f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x0076 }
            throw r0     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ IOException -> 0x007d }
            throw r0     // Catch:{ IOException -> 0x007d }
        L_0x007d:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "profileInfo/resend/jid "
            r1.append(r0)
            X.1BI r0 = r10.A0J
            r1.append(r0)
            java.lang.String r0 = "/failed"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
        L_0x0099:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27071Up.A0E(X.1E7):void");
    }

    public final boolean A0F(AnonymousClass1E7 r4) {
        C18070vi.A0d(r4, 0);
        return A01(r4, this, this.A03.A00.A0b("tmpp"), (byte[]) null, false);
    }

    public static final boolean A01(AnonymousClass1E7 r7, C27071Up r8, File file, byte[] bArr, boolean z) {
        C53772d4 r5;
        AnonymousClass1KB r2;
        int i;
        if (!r8.A0C.A09()) {
            r8.A02.A0J(new C146757Qm((Object) r8, 38));
            return false;
        }
        if (file != null) {
            try {
                r5 = r8.A0C(C64062u9.A0W(file));
            } catch (FileNotFoundException e) {
                e = e;
                r2 = r8.A02;
                i = 39;
                r2.A0J(new C146757Qm((Object) r8, i));
                Log.e("profileInfo/sendPhoto", e);
                return false;
            } catch (IOException e2) {
                e = e2;
                r2 = r8.A02;
                i = 40;
                r2.A0J(new C146757Qm((Object) r8, i));
                Log.e("profileInfo/sendPhoto", e);
                return false;
            }
        } else {
            C17960vV.A07(bArr);
            C18070vi.A0X(bArr);
            r5 = r8.A0C(bArr);
        }
        C27001Ui r3 = r8.A06;
        Jid A062 = r7.A06(AnonymousClass1BI.class);
        C17960vV.A07(A062);
        C18070vi.A0X(A062);
        r3.A05(r8.A0B((AnonymousClass1BI) A062, r5.A00, r5.A01, z));
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C27071Up(X.C19880zA r36, X.C19880zA r37, X.C218617r r38, X.AnonymousClass1KB r39, X.AnonymousClass11S r40, X.AnonymousClass1UD r41, X.AnonymousClass11E r42, X.AnonymousClass1M9 r43, X.C24671Lf r44, X.C24791Lr r45, X.C26881Tv r46, X.AnonymousClass11C r47, X.AnonymousClass11P r48, X.C19830z4 r49, X.C18000vb r50, X.AnonymousClass121 r51, X.AnonymousClass1MZ r52, X.AnonymousClass1R3 r53, X.C18030ve r54, X.AnonymousClass18K r55, X.AnonymousClass1MG r56, X.C27021Uk r57, X.C27031Ul r58, X.C27001Ui r59, X.AnonymousClass1PQ r60, X.C27051Un r61, X.AnonymousClass1DC r62, X.AnonymousClass10I r63, X.AnonymousClass00H r64, X.AnonymousClass00H r65, X.AnonymousClass00H r66, X.AnonymousClass00H r67) {
        /*
            r35 = this;
            r1 = 1
            r19 = r39
            r0 = r19
            X.C18070vi.A0d(r0, r1)
            r1 = 2
            r20 = r40
            r0 = r20
            X.C18070vi.A0d(r0, r1)
            r1 = 3
            r28 = r63
            r0 = r28
            X.C18070vi.A0d(r0, r1)
            r1 = 4
            r18 = r38
            r0 = r18
            X.C18070vi.A0d(r0, r1)
            r1 = 5
            r29 = r48
            r0 = r29
            X.C18070vi.A0d(r0, r1)
            r0 = 6
            r14 = r54
            X.C18070vi.A0d(r14, r0)
            r1 = 7
            r21 = r41
            r0 = r21
            X.C18070vi.A0d(r0, r1)
            r1 = 8
            r27 = r62
            r0 = r27
            X.C18070vi.A0d(r0, r1)
            r1 = 9
            r23 = r47
            r0 = r23
            X.C18070vi.A0d(r0, r1)
            r1 = 10
            r24 = r50
            r0 = r24
            X.C18070vi.A0d(r0, r1)
            r1 = 11
            r17 = r36
            r0 = r17
            X.C18070vi.A0d(r0, r1)
            r0 = 12
            r10 = r55
            X.C18070vi.A0d(r10, r0)
            r0 = 13
            r9 = r56
            X.C18070vi.A0d(r9, r0)
            r1 = 14
            r32 = r43
            r0 = r32
            X.C18070vi.A0d(r0, r1)
            r1 = 15
            r26 = r57
            r0 = r26
            X.C18070vi.A0d(r0, r1)
            r0 = 16
            r15 = r53
            X.C18070vi.A0d(r15, r0)
            r1 = 17
            r31 = r44
            r0 = r31
            X.C18070vi.A0d(r0, r1)
            r0 = 18
            r5 = r64
            X.C18070vi.A0d(r5, r0)
            r1 = 19
            r22 = r45
            r0 = r22
            X.C18070vi.A0d(r0, r1)
            r1 = 20
            r30 = r46
            r0 = r30
            X.C18070vi.A0d(r0, r1)
            r0 = 21
            r7 = r59
            X.C18070vi.A0d(r7, r0)
            r0 = 22
            r13 = r49
            X.C18070vi.A0d(r13, r0)
            r0 = 23
            r4 = r65
            X.C18070vi.A0d(r4, r0)
            r0 = 24
            r12 = r51
            X.C18070vi.A0d(r12, r0)
            r0 = 25
            r6 = r60
            X.C18070vi.A0d(r6, r0)
            r0 = 26
            r3 = r66
            X.C18070vi.A0d(r3, r0)
            r0 = 27
            r8 = r58
            X.C18070vi.A0d(r8, r0)
            r0 = 28
            r11 = r52
            X.C18070vi.A0d(r11, r0)
            r1 = 30
            r33 = r42
            r0 = r33
            X.C18070vi.A0d(r0, r1)
            r1 = 31
            r34 = r37
            r0 = r34
            X.C18070vi.A0d(r0, r1)
            r0 = 32
            r2 = r67
            X.C18070vi.A0d(r2, r0)
            r1 = r35
            r16 = r1
            r25 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r0 = r29
            r1.A0D = r0
            r1.A0I = r14
            r1.A0J = r10
            r1.A05 = r9
            r0 = r32
            r1.A01 = r0
            r1.A0H = r15
            r0 = r31
            r1.A02 = r0
            r1.A09 = r5
            r0 = r22
            r1.A03 = r0
            r0 = r30
            r1.A04 = r0
            r1.A06 = r7
            r1.A0E = r13
            r1.A0A = r4
            r1.A0F = r12
            r1.A0L = r6
            r1.A08 = r3
            r1.A0K = r8
            r1.A0G = r11
            r0 = r61
            r1.A07 = r0
            r0 = r33
            r1.A0C = r0
            r0 = r34
            r1.A00 = r0
            r1.A0B = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27071Up.<init>(X.0zA, X.0zA, X.17r, X.1KB, X.11S, X.1UD, X.11E, X.1M9, X.1Lf, X.1Lr, X.1Tv, X.11C, X.11P, X.0z4, X.0vb, X.121, X.1MZ, X.1R3, X.0ve, X.18K, X.1MG, X.1Uk, X.1Ul, X.1Ui, X.1PQ, X.1Un, X.1DC, X.10I, X.00H, X.00H, X.00H, X.00H):void");
    }
}
