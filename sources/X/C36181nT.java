package X;

import com.whatsapp.stickers.WebpUtils;
import java.util.concurrent.Executor;

/* renamed from: X.1nT  reason: invalid class name and case insensitive filesystem */
public class C36181nT extends C26461Sf {
    public static final C18180vt A07 = new C18180vt(1, 60, 200, false);
    public final AnonymousClass190 A00;
    public final C32341h2 A01;
    public final C218617r A02;
    public final WebpUtils A03;
    public final AnonymousClass10I A04;
    public final Executor A05;
    public final Executor A06;

    public C36181nT(AnonymousClass190 r4, C32341h2 r5, C218617r r6, AnonymousClass1KB r7, WebpUtils webpUtils, AnonymousClass10I r9) {
        super(new C18150vq((Object) null, new C70943Dc(r9, 13)));
        this.A00 = r4;
        this.A04 = r9;
        this.A03 = webpUtils;
        this.A02 = r6;
        this.A01 = r5;
        C18070vi.A0d(r7, 0);
        this.A05 = new AnonymousClass3DL(r7, 3);
        C18070vi.A0d(r9, 0);
        this.A06 = new AnonymousClass3DL(r9, 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0123, code lost:
        if (r1 != 2) goto L_0x00aa;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(X.BC9 r53, X.C26551So r54, X.AnonymousClass1TI r55, X.AnonymousClass1TI r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, byte[] r63, int r64, int r65, int r66, int r67, long r68) {
        /*
            r52 = this;
            r3 = r58
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            r9 = 0
            r0 = r52
            r1 = r64
            r2 = r63
            if (r4 != 0) goto L_0x0126
            if (r63 == 0) goto L_0x0126
            r33 = r67
            r21 = r59
            r23 = r61
            if (r67 != 0) goto L_0x00a3
            boolean r4 = android.text.TextUtils.isEmpty(r23)
            if (r4 != 0) goto L_0x0025
            boolean r4 = android.text.TextUtils.isEmpty(r21)
            if (r4 == 0) goto L_0x00a3
        L_0x0025:
            X.0vt r2 = A07
            boolean r2 = r2.A00()
            if (r2 == 0) goto L_0x0061
            X.190 r8 = r0.A00
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = ", createMediaDownloadRequestDataForFile/direct_path is "
            r7.append(r2)
            boolean r6 = android.text.TextUtils.isEmpty(r23)
            java.lang.String r5 = "null"
            java.lang.String r4 = "not null"
            r2 = r4
            if (r6 == 0) goto L_0x0045
            r2 = r5
        L_0x0045:
            r7.append(r2)
            java.lang.String r2 = " encHash is "
            r7.append(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r21)
            if (r2 != 0) goto L_0x0054
            r5 = r4
        L_0x0054:
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r4 = 1
            java.lang.String r2 = "FileDownloadManager/createMediaDownloadForFMessage"
            r8.A0G(r2, r5, r4)
        L_0x0061:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = "FileDownloadManager/queueFileDownload auto download documentType "
            r4.append(r2)
            r11 = r66
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            if (r2 != 0) goto L_0x009e
            r2 = 0
        L_0x0074:
            r4.append(r2)
            java.lang.String r2 = ", fileDownloadRequestData is "
            r4.append(r2)
            if (r9 != 0) goto L_0x009b
            java.lang.String r2 = "null"
        L_0x0080:
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            r5 = r53
            if (r9 != 0) goto L_0x0144
            java.util.concurrent.Executor r2 = r0.A05
            r1 = 18
            X.7RA r0 = new X.7RA
            r0.<init>((java.lang.Object) r5, (int) r1)
            r2.execute(r0)
            return
        L_0x009b:
            java.lang.String r2 = "no null"
            goto L_0x0080
        L_0x009e:
            java.lang.String r2 = r2.toString()
            goto L_0x0074
        L_0x00a3:
            X.17r r5 = r0.A02
            r4 = 1
            if (r1 != r4) goto L_0x0112
            java.lang.Integer r16 = X.AnonymousClass00R.A01
        L_0x00aa:
            r40 = 0
        L_0x00ac:
            r12 = r54
            r17 = r60
            r6 = r12
            r7 = r16
            r8 = r21
            r9 = r3
            r10 = r17
            r11 = r40
            java.io.File r15 = r5.A0M(r6, r7, r8, r9, r10, r11)
            r28 = 0
            r4 = r5
            r5 = r12
            r6 = r7
            r7 = r3
            r8 = r10
            r9 = r11
            r10 = r28
            java.io.File r14 = r4.A0N(r5, r6, r7, r8, r9, r10)
            java.util.UUID r4 = java.util.UUID.randomUUID()
            java.lang.String r20 = r4.toString()
            r10 = 0
            r36 = 0
            r30 = 2
            r32 = 1
            X.6zF r9 = new X.6zF
            r13 = r10
            r24 = r10
            r25 = r10
            r26 = r10
            r38 = r28
            r39 = r28
            r41 = r28
            r42 = r28
            r43 = r28
            r44 = r28
            r45 = r28
            r46 = r28
            r47 = r28
            r48 = r28
            r49 = r28
            r50 = r28
            r51 = r28
            r31 = r65
            r34 = r68
            r19 = r57
            r22 = r62
            r11 = r10
            r18 = r3
            r27 = r2
            r29 = r28
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)
            goto L_0x0061
        L_0x0112:
            r4 = 5
            if (r1 != r4) goto L_0x0118
            java.lang.Integer r16 = X.AnonymousClass00R.A0C
            goto L_0x00aa
        L_0x0118:
            r4 = 7
            if (r1 != r4) goto L_0x011e
            java.lang.Integer r16 = X.AnonymousClass00R.A0N
            goto L_0x00aa
        L_0x011e:
            r16 = 0
            r4 = 2
            r40 = 1
            if (r1 == r4) goto L_0x00ac
            goto L_0x00aa
        L_0x0126:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r4 = "FileDownloadManager/createMediaDownloadForFMessage/unable to download due to missing media data; mediaKey="
            r5.append(r4)
            r5.append(r2)
            java.lang.String r2 = ", fileHash="
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = r5.toString()
            com.whatsapp.util.Log.e((java.lang.String) r2)
            goto L_0x0061
        L_0x0144:
            X.2ll r4 = new X.2ll
            r4.<init>(r1, r3)
            X.1h2 r7 = r0.A01
            r12 = 1
            r14 = 0
            r8 = 0
            r10 = 1
            X.5ti r3 = r7.A00(r8, r9, r10, r11, r12, r14)
            r3.BB6(r5)
            r5 = r55
            if (r55 == 0) goto L_0x0162
            java.util.concurrent.Executor r2 = r0.A06
            X.1TJ r1 = r3.A0E
            r1.A03(r5, r2)
        L_0x0162:
            r5 = r56
            if (r56 == 0) goto L_0x016d
            java.util.concurrent.Executor r2 = r0.A05
            X.1TJ r1 = r3.A0F
            r1.A03(r5, r2)
        L_0x016d:
            r0.A04(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36181nT.A0A(X.BC9, X.1So, X.1TI, X.1TI, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, byte[], int, int, int, int, long):void");
    }
}
