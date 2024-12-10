package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Environment;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.productinfra.avatar.coinflip.ContactAvatarCoinFlipRepository;
import com.whatsapp.productinfra.avatar.coinflip.MyAvatarCoinFlipRepository;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* renamed from: X.1Vc  reason: invalid class name and case insensitive filesystem */
public class C27191Vc implements C27181Vb {
    public final AnonymousClass11S A00;
    public final C24791Lr A01;
    public final C26881Tv A02;
    public final C18030ve A03;
    public final C27001Ui A04;
    public final AnonymousClass10I A05;
    public final AnonymousClass00H A06;
    public final C219217x A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (r2 != null) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap A03(android.content.Context r13, X.AnonymousClass1E7 r14, java.lang.String r15, float r16, int r17, long r18, boolean r20, boolean r21) {
        /*
            r12 = this;
            r3 = r12
            r5 = r14
            r7 = r16
            r8 = r17
            if (r20 == 0) goto L_0x001d
            X.1Lr r0 = r12.A01
            java.lang.String r1 = r14.A08(r7, r8)
            X.1Lp r0 = r0.A02
            X.1ga r0 = r0.A04()
            java.lang.Object r2 = r0.A0A(r1)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto L_0x001d
        L_0x001c:
            return r2
        L_0x001d:
            r4 = r13
            r6 = r15
            r9 = r18
            r11 = r21
            android.graphics.Bitmap r2 = r3.A00(r4, r5, r6, r7, r8, r9, r11)
            if (r20 == 0) goto L_0x001c
            if (r2 == 0) goto L_0x001c
            X.1Lr r0 = r12.A01
            java.lang.String r1 = r14.A08(r7, r8)
            X.1Lp r0 = r0.A02
            X.1ga r0 = r0.A04()
            r0.A0F(r1, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27191Vc.A03(android.content.Context, X.1E7, java.lang.String, float, int, long, boolean, boolean):android.graphics.Bitmap");
    }

    public Bitmap A04(Context context, AnonymousClass1E7 r12, String str, float f, int i, boolean z) {
        return A03(context, r12, str, f, i, 604800000, z, true);
    }

    public Bitmap BX4(Context context, AnonymousClass1E7 r11, String str, float f, int i) {
        return A00(context, r11, str, f, i, 604800000, true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: X.2d6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: X.1EC} */
    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r6v10 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        if (X.C29681ch.A00(r10) != false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0063, code lost:
        if (r4.A10 == false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00f3, code lost:
        if (r7 == 6) goto L_0x00f5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap A00(android.content.Context r21, X.AnonymousClass1E7 r22, java.lang.String r23, float r24, int r25, long r26, boolean r28) {
        /*
            r20 = this;
            java.lang.Class<X.1BI> r0 = X.AnonymousClass1BI.class
            r4 = r22
            com.whatsapp.jid.Jid r10 = r4.A06(r0)
            X.1BI r10 = (X.AnonymousClass1BI) r10
            r3 = r25
            float r2 = (float) r3
            r16 = 0
            android.content.res.Resources r0 = r21.getResources()     // Catch:{ OutOfMemoryError -> 0x01c7 }
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch:{ OutOfMemoryError -> 0x01c7 }
            float r1 = r0.density     // Catch:{ OutOfMemoryError -> 0x01c7 }
            r0 = 1119879168(0x42c00000, float:96.0)
            float r1 = r1 * r0
            r5 = 0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            r2 = 0
            if (r0 < 0) goto L_0x0023
            r2 = 1
        L_0x0023:
            r9 = r20
            if (r28 == 0) goto L_0x0106
            if (r10 == 0) goto L_0x0106
            boolean r0 = r4.A0F()     // Catch:{ OutOfMemoryError -> 0x01c7 }
            if (r0 == 0) goto L_0x0037
            X.1BI r0 = r4.A0J     // Catch:{ OutOfMemoryError -> 0x01c7 }
            boolean r0 = X.C22971Dz.A0c(r0)     // Catch:{ OutOfMemoryError -> 0x01c7 }
            if (r0 == 0) goto L_0x0065
        L_0x0037:
            boolean r0 = X.C22971Dz.A0V(r10)     // Catch:{ OutOfMemoryError -> 0x01c7 }
            if (r0 == 0) goto L_0x0044
            boolean r1 = X.C29681ch.A00(r10)     // Catch:{ OutOfMemoryError -> 0x01c7 }
            r0 = 1
            if (r1 == 0) goto L_0x0045
        L_0x0044:
            r0 = 0
        L_0x0045:
            if (r0 != 0) goto L_0x0065
            boolean r0 = r4.A0F()     // Catch:{ OutOfMemoryError -> 0x01c7 }
            if (r0 != 0) goto L_0x0106
            boolean r0 = X.C22971Dz.A0V(r10)     // Catch:{ OutOfMemoryError -> 0x01c7 }
            if (r0 != 0) goto L_0x0106
            X.1BI r0 = r4.A0J     // Catch:{ OutOfMemoryError -> 0x01c7 }
            boolean r0 = X.C22971Dz.A0N(r0)     // Catch:{ OutOfMemoryError -> 0x01c7 }
            if (r0 != 0) goto L_0x0106
            boolean r0 = X.C22971Dz.A0Z(r10)     // Catch:{ OutOfMemoryError -> 0x01c7 }
            if (r0 != 0) goto L_0x0106
            boolean r0 = r4.A10     // Catch:{ OutOfMemoryError -> 0x01c7 }
            if (r0 == 0) goto L_0x0106
        L_0x0065:
            if (r2 == 0) goto L_0x0068
            goto L_0x006b
        L_0x0068:
            int r13 = r4.A08     // Catch:{ OutOfMemoryError -> 0x01c7 }
            goto L_0x006d
        L_0x006b:
            int r13 = r4.A07     // Catch:{ OutOfMemoryError -> 0x01c7 }
        L_0x006d:
            X.11S r1 = r9.A00     // Catch:{ OutOfMemoryError -> 0x01c7 }
            X.1BI r0 = r4.A0J     // Catch:{ OutOfMemoryError -> 0x01c7 }
            boolean r0 = r1.A0O(r0)     // Catch:{ OutOfMemoryError -> 0x01c7 }
            r14 = r26
            if (r0 != 0) goto L_0x00bd
            boolean r0 = r4 instanceof X.AnonymousClass25I     // Catch:{ OutOfMemoryError -> 0x01c7 }
            if (r0 != 0) goto L_0x00bd
            X.1BI r0 = r4.A0J     // Catch:{ OutOfMemoryError -> 0x01c7 }
            boolean r0 = X.C22971Dz.A0V(r0)     // Catch:{ OutOfMemoryError -> 0x01c7 }
            if (r0 != 0) goto L_0x00bd
            long r0 = r4.A0E     // Catch:{ OutOfMemoryError -> 0x01c7 }
            long r0 = r0 + r26
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ OutOfMemoryError -> 0x01c7 }
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x00bd
        L_0x0091:
            X.00H r0 = r9.A06     // Catch:{ OutOfMemoryError -> 0x01c7 }
            java.lang.Object r8 = r0.get()     // Catch:{ OutOfMemoryError -> 0x01c7 }
            X.1kb r8 = (X.C34511kb) r8     // Catch:{ OutOfMemoryError -> 0x01c7 }
            X.1BI r7 = r4.A0J     // Catch:{ OutOfMemoryError -> 0x01c7 }
            boolean r0 = r7 instanceof X.AnonymousClass1EC     // Catch:{ OutOfMemoryError -> 0x01c7 }
            r6 = 0
            if (r0 == 0) goto L_0x00c1
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.PermanentGroupJid"
            X.C18070vi.A0z(r7, r0)     // Catch:{ OutOfMemoryError -> 0x01c7 }
            X.1EC r7 = (X.AnonymousClass1EC) r7     // Catch:{ OutOfMemoryError -> 0x01c7 }
            X.1CJ r0 = r8.A02     // Catch:{ OutOfMemoryError -> 0x01c7 }
            int r1 = r0.A06(r7)     // Catch:{ OutOfMemoryError -> 0x01c7 }
            boolean r0 = X.AnonymousClass2TI.A00(r1)     // Catch:{ OutOfMemoryError -> 0x01c7 }
            if (r0 == 0) goto L_0x00b7
            X.1EC r6 = r8.A05(r7)     // Catch:{ OutOfMemoryError -> 0x01c7 }
        L_0x00b7:
            X.2d6 r0 = new X.2d6     // Catch:{ OutOfMemoryError -> 0x01c7 }
            r0.<init>(r6, r1)     // Catch:{ OutOfMemoryError -> 0x01c7 }
            goto L_0x00c0
        L_0x00bd:
            if (r13 == 0) goto L_0x0091
            goto L_0x0106
        L_0x00c0:
            r6 = r0
        L_0x00c1:
            r8 = 1
            r12 = 2
            if (r2 == 0) goto L_0x00c6
            r12 = 1
        L_0x00c6:
            if (r6 != 0) goto L_0x00ca
            r7 = 0
            goto L_0x00cc
        L_0x00ca:
            int r7 = r6.A00     // Catch:{ OutOfMemoryError -> 0x01c7 }
        L_0x00cc:
            boolean r0 = r4.A0F()     // Catch:{ OutOfMemoryError -> 0x01c7 }
            if (r0 == 0) goto L_0x00ee
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x01c7 }
            r1.<init>()     // Catch:{ OutOfMemoryError -> 0x01c7 }
            java.lang.String r0 = "ContactPhotosBitmapManager/getGroupProfilePictureFromServerIfNeeded/fetching group image from server/groupType = "
            r1.append(r0)     // Catch:{ OutOfMemoryError -> 0x01c7 }
            r1.append(r7)     // Catch:{ OutOfMemoryError -> 0x01c7 }
            java.lang.String r0 = " group jid = "
            r1.append(r0)     // Catch:{ OutOfMemoryError -> 0x01c7 }
            r1.append(r10)     // Catch:{ OutOfMemoryError -> 0x01c7 }
            java.lang.String r0 = r1.toString()     // Catch:{ OutOfMemoryError -> 0x01c7 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ OutOfMemoryError -> 0x01c7 }
        L_0x00ee:
            r0 = 2
            if (r7 == r0) goto L_0x00f5
            r1 = 6
            r0 = 0
            if (r7 != r1) goto L_0x00f6
        L_0x00f5:
            r0 = 1
        L_0x00f6:
            if (r0 == 0) goto L_0x010d
            if (r6 == 0) goto L_0x010d
            X.1EC r6 = r6.A01     // Catch:{ OutOfMemoryError -> 0x01c7 }
            if (r6 == 0) goto L_0x010d
            X.1Ui r1 = r9.A04     // Catch:{ OutOfMemoryError -> 0x01c7 }
            r0 = r10
            X.1EC r0 = (X.AnonymousClass1EC) r0     // Catch:{ OutOfMemoryError -> 0x01c7 }
        L_0x0103:
            r1.A02(r6, r0, r13, r12)     // Catch:{ OutOfMemoryError -> 0x01c7 }
        L_0x0106:
            boolean r0 = r4.A0g     // Catch:{ OutOfMemoryError -> 0x01c7 }
            r7 = r24
            if (r0 == 0) goto L_0x01af
            goto L_0x0121
        L_0x010d:
            if (r7 != r8) goto L_0x0114
            X.1Ui r1 = r9.A04     // Catch:{ OutOfMemoryError -> 0x01c7 }
            r0 = 0
            r6 = r10
            goto L_0x0103
        L_0x0114:
            X.10I r0 = r9.A05     // Catch:{ OutOfMemoryError -> 0x01c7 }
            X.3CH r8 = new X.3CH     // Catch:{ OutOfMemoryError -> 0x01c7 }
            r11 = r23
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ OutOfMemoryError -> 0x01c7 }
            r0.CGF(r8)     // Catch:{ OutOfMemoryError -> 0x01c7 }
            goto L_0x0106
        L_0x0121:
            java.io.FileInputStream r6 = r9.A05(r4, r2)     // Catch:{ IOException -> 0x01c6 }
            if (r6 != 0) goto L_0x0140
            r4.A0g = r5     // Catch:{ all -> 0x01a3 }
            X.0ve r2 = r9.A03     // Catch:{ all -> 0x01a3 }
            r1 = 9156(0x23c4, float:1.283E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x01a3 }
            boolean r0 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ all -> 0x01a3 }
            if (r0 == 0) goto L_0x01cd
            android.graphics.Bitmap r0 = r9.A01(r4)     // Catch:{ all -> 0x01a3 }
            if (r0 == 0) goto L_0x01cd
            android.graphics.Bitmap r0 = X.C27201Vd.A00(r0, r7, r3, r5)     // Catch:{ all -> 0x01a3 }
            return r0
        L_0x0140:
            android.graphics.BitmapFactory$Options r15 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x01a3 }
            r15.<init>()     // Catch:{ all -> 0x01a3 }
            r1 = 1
            r15.inDither = r1     // Catch:{ all -> 0x01a3 }
            r15.inScaled = r5     // Catch:{ all -> 0x01a3 }
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x01a3 }
            r15.inPreferredConfig = r0     // Catch:{ all -> 0x01a3 }
            X.25O r14 = new X.25O     // Catch:{ all -> 0x01a3 }
            r17 = r3
            r18 = r3
            r19 = r1
            r14.<init>(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x01a3 }
            X.25P r0 = X.AnonymousClass204.A0B(r14, r6)     // Catch:{ all -> 0x01a3 }
            android.graphics.Bitmap r0 = r0.A02     // Catch:{ all -> 0x01a3 }
            if (r0 != 0) goto L_0x0162
            goto L_0x0167
        L_0x0162:
            android.graphics.Bitmap r3 = X.C27201Vd.A00(r0, r7, r3, r1)     // Catch:{ all -> 0x01a3 }
            goto L_0x0169
        L_0x0167:
            r3 = r16
        L_0x0169:
            if (r3 != 0) goto L_0x019f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a3 }
            r1.<init>()     // Catch:{ all -> 0x01a3 }
            java.lang.String r0 = "contactPhotosBitmapManager/getphotofast/"
            r1.append(r0)     // Catch:{ all -> 0x01a3 }
            r1.append(r10)     // Catch:{ all -> 0x01a3 }
            java.lang.String r0 = " decodeStream returns null"
            r1.append(r0)     // Catch:{ all -> 0x01a3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01a3 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01a3 }
            X.1BI r0 = r4.A0J     // Catch:{ all -> 0x01a3 }
            boolean r0 = X.C22971Dz.A0V(r0)     // Catch:{ all -> 0x01a3 }
            if (r0 == 0) goto L_0x019f
            r0 = -1
            if (r2 == 0) goto L_0x0190
            goto L_0x0193
        L_0x0190:
            r4.A08 = r0     // Catch:{ all -> 0x01a3 }
            goto L_0x0195
        L_0x0193:
            r4.A07 = r0     // Catch:{ all -> 0x01a3 }
        L_0x0195:
            X.1Tv r0 = r9.A02     // Catch:{ all -> 0x01a3 }
            r0.A00(r4)     // Catch:{ all -> 0x01a3 }
            X.1Lr r0 = r0.A03     // Catch:{ all -> 0x01a3 }
            r0.A03(r4)     // Catch:{ all -> 0x01a3 }
        L_0x019f:
            r6.close()     // Catch:{ IOException -> 0x01c6 }
            return r3
        L_0x01a3:
            r1 = move-exception
            if (r6 == 0) goto L_0x01ae
            r6.close()     // Catch:{ all -> 0x01aa }
            goto L_0x01ae
        L_0x01aa:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x01c6 }
        L_0x01ae:
            throw r1     // Catch:{ IOException -> 0x01c6 }
        L_0x01af:
            X.0ve r2 = r9.A03     // Catch:{ OutOfMemoryError -> 0x01c7 }
            r1 = 9156(0x23c4, float:1.283E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ OutOfMemoryError -> 0x01c7 }
            boolean r0 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ OutOfMemoryError -> 0x01c7 }
            if (r0 == 0) goto L_0x01c6
            android.graphics.Bitmap r0 = r9.A01(r4)     // Catch:{ OutOfMemoryError -> 0x01c7 }
            if (r0 == 0) goto L_0x01c6
            android.graphics.Bitmap r0 = X.C27201Vd.A00(r0, r7, r3, r5)     // Catch:{ OutOfMemoryError -> 0x01c7 }
            return r0
        L_0x01c6:
            return r16
        L_0x01c7:
            r1 = move-exception
            java.lang.String r0 = "contactPhotosBitmapManager/getphotofast/out-of-memory "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x01cd:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27191Vc.A00(android.content.Context, X.1E7, java.lang.String, float, int, long, boolean):android.graphics.Bitmap");
    }

    private Bitmap A01(AnonymousClass1E7 r4) {
        if (this.A00.A0O(r4.A0J)) {
            AnonymousClass00H r1 = this.A09;
            if (((MyAvatarCoinFlipRepository) r1.get()).A06()) {
                return ((MyAvatarCoinFlipRepository) r1.get()).A01();
            }
        } else {
            UserJid userJid = (UserJid) r4.A06(UserJid.class);
            if (userJid != null) {
                return ((ContactAvatarCoinFlipRepository) this.A08.get()).A03(userJid);
            }
        }
        return null;
    }

    public static void A02(AnonymousClass1GV r5, C27191Vc r6, AnonymousClass1E7 r7, String str, String str2) {
        GroupJid groupJid;
        C85654Of r2 = (C85654Of) r6.A0A.get();
        if (r7 != null) {
            groupJid = (GroupJid) r7.A06(GroupJid.class);
        } else {
            groupJid = null;
        }
        C64902vW r4 = new C64902vW(r5, r6, r7, str, str2);
        C51812Zs r1 = new C51812Zs(r5);
        C18070vi.A0d(str2, 2);
        new C58422kf(new C683833d(r4, r1), (AnonymousClass1OZ) r2.A02.A00.A00.A6N.get()).A01(groupJid, str2, str);
    }

    public FileInputStream A05(AnonymousClass1E7 r6, boolean z) {
        File A012;
        if (!r6.A0g) {
            return null;
        }
        C24791Lr r1 = this.A01;
        if (z) {
            A012 = r1.A00(r6);
            if (A012 == null || !A012.exists()) {
                A012 = r1.A01(r6);
                if (r6.A07 > 0 && this.A07.A0K(Environment.getExternalStorageState())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("contactPhotosBitmapManager/getphotostream/");
                    sb.append(r6.A0J);
                    sb.append(" full file missing id:");
                    sb.append(r6.A07);
                    Log.e(sb.toString());
                    r6.A07 = 0;
                }
            }
        } else {
            A012 = r1.A01(r6);
            if (A012 == null || !A012.exists()) {
                A012 = r1.A00(r6);
                if (r6.A08 > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("contactPhotosBitmapManager/getphotostream/");
                    sb2.append(r6.A0J);
                    sb2.append(" thumb file missing id:");
                    sb2.append(r6.A08);
                    Log.e(sb2.toString());
                    r6.A08 = 0;
                }
            }
        }
        if (A012 == null || !A012.exists()) {
            return null;
        }
        try {
            return new FileInputStream(A012);
        } catch (FileNotFoundException e) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("contactPhotosBitmapManager/getphotostream/");
            sb3.append(r6.A0J);
            sb3.append(" photo file not found");
            Log.e(sb3.toString(), e);
            return null;
        }
    }

    public C27191Vc(AnonymousClass11S r1, C24791Lr r2, C26881Tv r3, C219217x r4, C18030ve r5, C27001Ui r6, AnonymousClass10I r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11) {
        this.A03 = r5;
        this.A00 = r1;
        this.A05 = r7;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r6;
        this.A07 = r4;
        this.A06 = r8;
        this.A0A = r9;
        this.A09 = r10;
        this.A08 = r11;
    }
}
