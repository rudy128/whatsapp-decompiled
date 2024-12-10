package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Base64;
import android.util.Pair;
import com.whatsapp.media.WamediaManager;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.1SB  reason: invalid class name */
public class AnonymousClass1SB {
    public AnonymousClass4VT A00;
    public byte[] A01;
    public final C218617r A02;
    public final AnonymousClass1KB A03;
    public final C25311Ns A04;
    public final AnonymousClass11P A05;
    public final AnonymousClass118 A06;
    public final C19830z4 A07;
    public final C18030ve A08;
    public final AnonymousClass18K A09;
    public final C25271No A0A;
    public final AnonymousClass1SA A0B;
    public final AnonymousClass10I A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I;
    public final AnonymousClass00H A0J;
    public final AnonymousClass00H A0K;
    public final AnonymousClass00H A0L;
    public final AnonymousClass00H A0M;
    public final AnonymousClass00H A0N;
    public final AnonymousClass00H A0O;
    public final AnonymousClass190 A0P;
    public final AnonymousClass181 A0Q;
    public final AnonymousClass11C A0R;
    public final C219317y A0S;
    public final AnonymousClass1D9 A0T;
    public final WamediaManager A0U;
    public final AnonymousClass00H A0V;
    public final AnonymousClass00H A0W;
    public final AnonymousClass00H A0X;
    public final AnonymousClass00H A0Y;
    public final AnonymousClass00H A0Z;
    public final AnonymousClass00H A0a = C221618v.A00(AnonymousClass167.class);
    public final AnonymousClass00H A0b;
    public final AnonymousClass00H A0c;
    public final AnonymousClass00H A0d;

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f9, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00fc, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ff, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0100, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0103, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b1, code lost:
        if (X.C64062u9.A0Q(r0) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01e2, code lost:
        if (r3 == false) goto L_0x01e4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0N(java.lang.String r12) {
        /*
            r11 = this;
            r4 = 0
            X.C18070vi.A0d(r12, r4)
            java.lang.String r0 = " "
            boolean r0 = X.AnonymousClass1YF.A0Y(r12, r0, r4)
            r2 = 0
            if (r0 == 0) goto L_0x0130
            android.util.Pair r7 = X.C137416vQ.A00(r12)
            if (r7 == 0) goto L_0x0223
            java.lang.Object r6 = r7.first
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r3 = r7.second
            java.lang.String r3 = (java.lang.String) r3
            X.00H r5 = r11.A0M
            java.lang.Object r1 = r5.get()
            X.6pr r1 = (X.C134006pr) r1
            X.C18070vi.A0d(r6, r4)
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            X.00H r0 = r1.A05
            java.lang.Object r0 = r0.get()
            X.702 r0 = (X.AnonymousClass702) r0
            boolean r0 = r0.A04(r6, r3)
            if (r0 == 0) goto L_0x011c
            java.lang.Object r9 = r7.first
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r3 = r7.second
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r5.get()     // Catch:{ Exception -> 0x004f }
            X.6pr r1 = (X.C134006pr) r1     // Catch:{ Exception -> 0x004f }
            boolean r0 = X.C18070vi.A15(r9, r3)     // Catch:{ Exception -> 0x004f }
            X.725 r6 = r1.A00(r9, r3, r0)     // Catch:{ Exception -> 0x004f }
            goto L_0x0056
        L_0x004f:
            r1 = move-exception
            java.lang.String r0 = "StickerRepository/uninstallThirdPartyPack/fetch pack failed"
            com.whatsapp.util.Log.e(r0, r1)
            r6 = 0
        L_0x0056:
            java.lang.Object r7 = r5.get()
            X.6pr r7 = (X.C134006pr) r7
            X.C18070vi.A0d(r9, r4)
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            X.00H r0 = r7.A04
            java.lang.Object r1 = r0.get()
            X.6ol r1 = (X.C133446ol) r1
            java.lang.String r0 = X.C137416vQ.A01(r9, r3)
            r1.A01(r0)
            X.72s r5 = r7.A01
            monitor-enter(r5)
            java.io.File r4 = X.C1407272s.A00(r5, r9, r3)     // Catch:{ all -> 0x0104 }
            boolean r0 = r4.exists()     // Catch:{ all -> 0x0104 }
            if (r0 == 0) goto L_0x0099
            java.io.File r1 = r4.getParentFile()     // Catch:{ all -> 0x0104 }
            r0 = 0
            X.C64062u9.A0K(r4, r0)     // Catch:{ all -> 0x0104 }
            if (r1 == 0) goto L_0x0099
            boolean r0 = r1.isDirectory()     // Catch:{ all -> 0x0104 }
            if (r0 == 0) goto L_0x0099
            java.io.File[] r0 = r1.listFiles()     // Catch:{ all -> 0x0104 }
            int r0 = r0.length     // Catch:{ all -> 0x0104 }
            if (r0 != 0) goto L_0x0099
            X.C64062u9.A0Q(r1)     // Catch:{ all -> 0x0104 }
        L_0x0099:
            monitor-exit(r5)
            X.00H r0 = r7.A03
            java.lang.Object r4 = r0.get()
            X.2bD r4 = (X.C52622bD) r4
            r1 = 1
            java.lang.String r8 = "authority = ? AND sticker_pack_id = ?"
            r0 = 2
            java.lang.String[] r10 = new java.lang.String[r0]
            r10[r2] = r9
            r10[r1] = r3
            X.00H r0 = r4.A00
            java.lang.Object r0 = r0.get()
            X.1Ls r0 = (X.C24801Ls) r0
            X.1au r5 = r0.A06()
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00fd }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x00fd }
            java.lang.String r1 = "third_party_sticker_emoji_mapping"
            java.lang.String r0 = "deleteMappingForWholePack/DELETE_MAPPING_FOR_WHOLE_PACK"
            r4.A04(r1, r8, r0, r10)     // Catch:{ all -> 0x00fd }
            r5.close()
            X.00H r0 = r7.A05
            java.lang.Object r0 = r0.get()
            X.702 r0 = (X.AnonymousClass702) r0
            r1 = 1
            X.00H r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.1Ls r0 = (X.C24801Ls) r0
            X.1au r7 = r0.A06()
            r0 = 2
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ all -> 0x00f6 }
            r4 = 0
            r5[r2] = r9     // Catch:{ all -> 0x00f6 }
            r5[r1] = r3     // Catch:{ all -> 0x00f6 }
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00f6 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x00f6 }
            java.lang.String r1 = "third_party_whitelist_packs"
            java.lang.String r0 = "deleteWhitelistedPack/DELETE_THIRD_PARTY_WHITELIST_PACKS"
            int r0 = r3.A04(r1, r8, r0, r5)     // Catch:{ all -> 0x00f6 }
            if (r0 <= 0) goto L_0x0108
            goto L_0x0107
        L_0x00f6:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00f8 }
        L_0x00f8:
            r0 = move-exception
            X.CDX.A00(r7, r1)
            throw r0
        L_0x00fd:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ff }
        L_0x00ff:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        L_0x0104:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0107:
            r4 = 1
        L_0x0108:
            r7.close()
            if (r4 == 0) goto L_0x011c
            X.1No r0 = r11.A0A
            r0.A00()
            if (r6 == 0) goto L_0x011c
            X.0ve r3 = r11.A08
            X.18K r1 = r11.A09
            r0 = 2
            X.C137436vS.A01(r3, r1, r6, r0)
        L_0x011c:
            X.0ve r3 = r11.A08
            r1 = 9776(0x2630, float:1.3699E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 == 0) goto L_0x012f
            r0 = 0
            X.725 r0 = r11.A06(r0, r12, r2, r2)
            if (r0 != 0) goto L_0x0130
        L_0x012f:
            return r4
        L_0x0130:
            X.1SA r0 = r11.A0B
            r0.A0A()
            r0 = 0
            X.725 r4 = r11.A06(r0, r12, r2, r2)
            if (r4 == 0) goto L_0x0223
            boolean r5 = r4.A0S
            X.00H r0 = r11.A0O
            java.lang.Object r0 = r0.get()
            X.6qY r0 = (X.C134416qY) r0
            java.lang.String r3 = r4.A0H
            r0.A01(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "StickerRepository/uninstallStickerPackSync/sticker pack id: "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r8 = r11.A0F
            java.lang.Object r0 = r8.get()
            X.72N r0 = (X.AnonymousClass72N) r0
            X.C17960vV.A01()
            X.00H r0 = r0.A07
            java.lang.Object r0 = r0.get()
            X.6uZ r0 = (X.C136886uZ) r0
            X.C18070vi.A0X(r3)
            java.util.ArrayList r0 = r0.A03(r3)
            r0.size()
            java.util.Iterator r7 = r0.iterator()
        L_0x0180:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x019c
            java.lang.Object r6 = r7.next()
            X.77d r6 = (X.C1418377d) r6
            java.lang.String r0 = r6.A0B
            java.lang.String r3 = r6.A0F
            if (r0 == 0) goto L_0x0180
            if (r3 == 0) goto L_0x0180
            X.1Ns r1 = r11.A04
            java.lang.String r0 = r6.A0E
            r1.A07(r3, r0)
            goto L_0x0180
        L_0x019c:
            java.lang.Object r0 = r8.get()
            X.72N r0 = (X.AnonymousClass72N) r0
            boolean r7 = X.AnonymousClass72N.A01(r4, r0, r2)
            java.io.File r0 = A01(r4, r11)
            if (r0 == 0) goto L_0x01b3
            boolean r0 = X.C64062u9.A0Q(r0)
            r6 = 0
            if (r0 == 0) goto L_0x01b4
        L_0x01b3:
            r6 = 1
        L_0x01b4:
            if (r5 == 0) goto L_0x01e5
            java.lang.String r0 = "meta-avatar-tab-icon"
            r3 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ".png"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            X.00H r0 = r11.A0L
            java.lang.Object r0 = r0.get()
            X.6xv r0 = (X.C138926xv) r0
            java.io.File r0 = r0.A01(r1, r2)
            if (r0 == 0) goto L_0x01de
            boolean r0 = X.C64062u9.A0Q(r0)
            if (r0 == 0) goto L_0x01df
        L_0x01de:
            r3 = 1
        L_0x01df:
            if (r6 == 0) goto L_0x01e4
            r6 = 1
            if (r3 != 0) goto L_0x01e5
        L_0x01e4:
            r6 = 0
        L_0x01e5:
            if (r7 == 0) goto L_0x0221
            X.1No r0 = r11.A0A
            r0.A00()
            if (r6 == 0) goto L_0x0221
            r3 = 1
            X.2Fd r1 = new X.2Fd
            r1.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r1.A00 = r0
            X.00H r0 = r11.A0W
            java.lang.Object r0 = r0.get()
            X.6ue r0 = (X.C136936ue) r0
            java.lang.String r0 = r0.A02
            r1.A02 = r0
            boolean r0 = r4.A0X
            if (r0 != 0) goto L_0x020e
            boolean r0 = r4.A0R
            if (r0 == 0) goto L_0x020f
        L_0x020e:
            r2 = 1
        L_0x020f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.A01 = r0
            X.18K r2 = r11.A09
            r2.CC7(r1)
            X.0ve r1 = r11.A08
            r0 = 2
            X.C137436vS.A01(r1, r2, r4, r0)
            return r3
        L_0x0221:
            r3 = 0
            return r3
        L_0x0223:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1SB.A0N(java.lang.String):boolean");
    }

    public static Bitmap A00(AnonymousClass1SB r4, File file, String str) {
        if (file == null || !file.exists()) {
            return null;
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
        boolean A052 = C18020vd.A05(C18040vf.A02, r4.A08, 575);
        if (decodeFile != null && A052) {
            ((C56992iM) r4.A0c.get()).A00(decodeFile, str);
        }
        return decodeFile;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (X.C137456vU.A00(r5.A08) == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File A01(X.AnonymousClass725 r4, X.AnonymousClass1SB r5) {
        /*
            java.lang.String r1 = r4.A05
            if (r1 == 0) goto L_0x000a
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            return r0
        L_0x000a:
            java.lang.String r3 = r4.A0H
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x0019
            X.0ve r0 = r5.A08
            boolean r0 = X.C137456vU.A00(r0)
            r2 = 1
            if (r0 != 0) goto L_0x001a
        L_0x0019:
            r2 = 0
        L_0x001a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r0 = ".png"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            X.00H r0 = r5.A0L
            java.lang.Object r0 = r0.get()
            X.6xv r0 = (X.C138926xv) r0
            java.io.File r0 = r0.A01(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1SB.A01(X.725, X.1SB):java.io.File");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A02(X.C1418377d r9) {
        /*
            r8 = this;
            java.lang.String r5 = r9.A0F
            r2 = 0
            if (r5 == 0) goto L_0x005f
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x005f }
            r7 = r8
            monitor-enter(r7)     // Catch:{ NoSuchAlgorithmException -> 0x005f }
            byte[] r0 = r8.A01     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x003c
            X.0z4 r6 = r8.A07     // Catch:{ all -> 0x005c }
            X.00H r0 = r6.A00     // Catch:{ all -> 0x005c }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x005c }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ all -> 0x005c }
            java.lang.String r3 = "sticker_hash_salt"
            java.lang.String r1 = r0.getString(r3, r2)     // Catch:{ all -> 0x005c }
            if (r1 != 0) goto L_0x003f
            r0 = 32
            byte[] r1 = X.C17970vW.A0I(r0)     // Catch:{ all -> 0x005c }
            r8.A01 = r1     // Catch:{ all -> 0x005c }
            r0 = 2
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ all -> 0x005c }
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r6)     // Catch:{ all -> 0x005c }
            android.content.SharedPreferences$Editor r0 = r0.putString(r3, r1)     // Catch:{ all -> 0x005c }
            r0.apply()     // Catch:{ all -> 0x005c }
        L_0x003c:
            byte[] r0 = r8.A01     // Catch:{ all -> 0x005c }
            goto L_0x0047
        L_0x003f:
            r0 = 0
            byte[] r0 = android.util.Base64.decode(r1, r0)     // Catch:{ all -> 0x005c }
            r8.A01 = r0     // Catch:{ all -> 0x005c }
            goto L_0x003c
        L_0x0047:
            monitor-exit(r7)     // Catch:{ NoSuchAlgorithmException -> 0x005f }
            r4.update(r0)     // Catch:{ NoSuchAlgorithmException -> 0x005f }
            byte[] r0 = r5.getBytes()     // Catch:{ NoSuchAlgorithmException -> 0x005f }
            r4.update(r0)     // Catch:{ NoSuchAlgorithmException -> 0x005f }
            byte[] r1 = r4.digest()     // Catch:{ NoSuchAlgorithmException -> 0x005f }
            r0 = 2
            java.lang.String r2 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ NoSuchAlgorithmException -> 0x005f }
            goto L_0x005f
        L_0x005c:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ NoSuchAlgorithmException -> 0x005f }
            throw r0     // Catch:{ NoSuchAlgorithmException -> 0x005f }
        L_0x005f:
            r9.A0G = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1SB.A02(X.77d):void");
    }

    public static void A03(AnonymousClass725 r1, AnonymousClass1SB r2) {
        for (C1418377d A022 : r1.A07) {
            r2.A02(A022);
        }
    }

    public Pair A04(C1418377d r6) {
        String str;
        InputStream A072;
        boolean z;
        String str2;
        C17960vV.A07(r6.A0F);
        String str3 = null;
        try {
            C219317y r2 = this.A0S;
            File A012 = r2.A00.A01(AnonymousClass1EG.A0A(Base64.encodeToString(C17970vW.A0I(32), 2)));
            if (!(r6.A01 == 3 || (str2 = r6.A0B) == null)) {
                try {
                    this.A02.A0i(new File(str2), A012);
                    if (A012.exists()) {
                        return new Pair(A012, r6.A0F);
                    }
                } catch (IOException e) {
                    e = e;
                    str = "StickerRepository/moveThirdPartyStickerToTempStorage failed to copy cached file";
                    Log.e(str, e);
                    return null;
                }
            }
            try {
                A072 = this.A0R.A0O().A07(Uri.parse(r6.A0B));
                if (A072 != null) {
                    z = C64062u9.A0T(A012, A072);
                } else {
                    z = false;
                }
                if (A072 != null) {
                    A072.close();
                }
                if (z) {
                    try {
                        WamediaManager wamediaManager = this.A0U;
                        C137446vT.A00(wamediaManager, A012, (Boolean) null, (String) null);
                        AnonymousClass73B r0 = r6.A04;
                        if (r0 == null || wamediaManager.insertWebpMetadata(A012, r0.A04())) {
                            try {
                                str3 = C1402370n.A00(A012);
                            } catch (IOException e2) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("StickerRepository/moveThirdPartyStickerToTempStorage could not get file hash; file=");
                                sb.append(A012);
                                Log.e(sb.toString(), e2);
                            }
                        } else {
                            Log.e("StickerRepository/moveThirdPartyStickerToTempStorage failed to insert metadata");
                            C64062u9.A0Q(A012);
                            return null;
                        }
                    } catch (AnonymousClass1SE e3) {
                        Log.e("StickerRepository/moveThirdPartyStickerToTempStorage sticker file failed validation", e3);
                        C64062u9.A0Q(A012);
                        return null;
                    }
                }
                return new Pair(A012, str3);
            } catch (IOException e4) {
                Log.e("StickerRepository/moveThirdPartyStickerToTempStorage failed to copy external file", e4);
                C64062u9.A0Q(A012);
                return null;
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
            }
            throw th;
        } catch (IOException e5) {
            e = e5;
            str = "StickerRepository/moveThirdPartyStickerToTempStorage failed to generate internal temp file";
            Log.e(str, e);
            return null;
        }
    }

    public C1418377d A05(String str) {
        if (str != null) {
            return ((C136886uZ) this.A0d.get()).A01(str);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004c, code lost:
        if (r3 == null) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass725 A06(X.AnonymousClass89P r7, java.lang.String r8, boolean r9, boolean r10) {
        /*
            r6 = this;
            X.00H r4 = r6.A0F
            java.lang.Object r0 = r4.get()
            X.72N r0 = (X.AnonymousClass72N) r0
            X.725 r3 = r0.A04(r8)
            if (r3 != 0) goto L_0x0018
            java.lang.Object r0 = r4.get()
            X.72N r0 = (X.AnonymousClass72N) r0
            X.725 r3 = r0.A03(r8)
        L_0x0018:
            if (r9 == 0) goto L_0x004c
            if (r3 != 0) goto L_0x00a2
            r1 = 0
            X.C18070vi.A0d(r8, r1)
            java.lang.String r0 = " "
            boolean r0 = X.AnonymousClass1YF.A0Y(r8, r0, r1)
            if (r0 != 0) goto L_0x004e
            X.00H r0 = r6.A0b
            java.lang.Object r0 = r0.get()
            X.6zC r0 = (X.C139636zC) r0
            r0.A02()
            java.lang.Object r0 = r4.get()
            X.72N r0 = (X.AnonymousClass72N) r0
            X.725 r3 = r0.A03(r8)
            if (r3 != 0) goto L_0x00a2
            X.00H r0 = r6.A0I
            java.lang.Object r0 = r0.get()
            X.734 r0 = (X.AnonymousClass734) r0
            X.725 r0 = r0.A03(r7, r8)
            return r0
        L_0x004c:
            if (r3 != 0) goto L_0x00a2
        L_0x004e:
            r1 = 0
            X.C18070vi.A0d(r8, r1)
            java.lang.String r0 = " "
            boolean r0 = X.AnonymousClass1YF.A0Y(r8, r0, r1)
            if (r0 == 0) goto L_0x00d1
            android.util.Pair r5 = X.C137416vQ.A00(r8)     // Catch:{ Exception -> 0x008b }
            if (r5 == 0) goto L_0x00d1
            X.00H r0 = r6.A0N     // Catch:{ Exception -> 0x008b }
            java.lang.Object r2 = r0.get()     // Catch:{ Exception -> 0x008b }
            X.702 r2 = (X.AnonymousClass702) r2     // Catch:{ Exception -> 0x008b }
            java.lang.Object r1 = r5.first     // Catch:{ Exception -> 0x008b }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x008b }
            java.lang.Object r0 = r5.second     // Catch:{ Exception -> 0x008b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x008b }
            boolean r0 = r2.A04(r1, r0)     // Catch:{ Exception -> 0x008b }
            if (r0 == 0) goto L_0x00d1
            X.00H r0 = r6.A0M     // Catch:{ Exception -> 0x008b }
            java.lang.Object r2 = r0.get()     // Catch:{ Exception -> 0x008b }
            X.6pr r2 = (X.C134006pr) r2     // Catch:{ Exception -> 0x008b }
            java.lang.Object r1 = r5.first     // Catch:{ Exception -> 0x008b }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x008b }
            java.lang.Object r0 = r5.second     // Catch:{ Exception -> 0x008b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x008b }
            X.725 r3 = r2.A00(r1, r0, r10)     // Catch:{ Exception -> 0x008b }
            goto L_0x00c5
        L_0x008b:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "StickerRepository/getStickerPackByIdSync/error fetching sticker pack: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
            r0 = 0
            return r0
        L_0x00a2:
            java.lang.String r0 = r3.A03
            if (r0 == 0) goto L_0x00ac
            boolean r0 = r3.A02()
            if (r0 == 0) goto L_0x00c5
        L_0x00ac:
            X.00H r0 = r6.A0I
            java.lang.Object r2 = r0.get()
            X.734 r2 = (X.AnonymousClass734) r2
            java.lang.String r1 = r3.A0H
            r0 = 0
            X.725 r1 = r2.A03(r0, r1)
            if (r1 == 0) goto L_0x00c5
            java.util.List r0 = r1.A06
            r3.A06 = r0
            java.util.List r0 = r1.A07
            r3.A07 = r0
        L_0x00c5:
            java.lang.Object r0 = r4.get()
            X.72N r0 = (X.AnonymousClass72N) r0
            int r0 = r0.A02(r8)
            r3.A00 = r0
        L_0x00d1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1SB.A06(X.89P, java.lang.String, boolean, boolean):X.725");
    }

    public AnonymousClass725 A07(String str) {
        AnonymousClass00H r5 = this.A0F;
        AnonymousClass725 A042 = ((AnonymousClass72N) r5.get()).A04(str);
        if (A042 == null) {
            C18070vi.A0d(str, 0);
            if (AnonymousClass1YF.A0Y(str, " ", false)) {
                A042 = null;
                try {
                    Pair A002 = C137416vQ.A00(str);
                    if (A002 != null) {
                        String str2 = (String) A002.first;
                        String str3 = (String) A002.second;
                        A042 = ((C134006pr) this.A0M.get()).A00(str2, str3, C18070vi.A15(str2, str3));
                    }
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("StickerRepository/getInstalledStickerPackByIdSync/error fetching sticker pack: ");
                    sb.append(str);
                    Log.e(sb.toString(), e);
                    return null;
                }
            }
            return A042;
        }
        A042.A00 = ((AnonymousClass72N) r5.get()).A02(str);
        return A042;
    }

    public AnonymousClass4VT A08() {
        AnonymousClass4VT r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        Context context = this.A06.A00;
        File file = new File(context.getCacheDir(), "stickers_preview_images");
        if (!file.exists() && !file.mkdirs()) {
            StringBuilder sb = new StringBuilder();
            sb.append("StickerRepository/getPreviewImageLoader/could not create diskcache directory:");
            sb.append(file.getAbsolutePath());
            Log.w(sb.toString());
        }
        long min = Math.min(4194304, file.getFreeSpace() / 16);
        AnonymousClass10I r8 = this.A0C;
        AnonymousClass1KB r5 = this.A03;
        C115505vA r4 = new C115505vA(r5, new C92784hu(C24261Jm.A00(context, 2131233062), C24261Jm.A00(context, 2131233062)), (AnonymousClass734) this.A0I.get(), r8, file, min);
        C86284Ra r12 = new C86284Ra(r5, this.A0Q, this.A0T, r8, file, "sticker-repository");
        r12.A04 = r4;
        r12.A00 = Integer.MAX_VALUE;
        r12.A01 = min;
        r12.A03 = C24261Jm.A00(context, 2131233062);
        r12.A02 = C24261Jm.A00(context, 2131233062);
        r12.A05 = true;
        AnonymousClass4VT A002 = r12.A00();
        this.A00 = A002;
        return A002;
    }

    public File A09(C1418377d r8) {
        Object obj;
        Object obj2;
        File file;
        String str = r8.A0F;
        C17960vV.A07(str);
        C25311Ns r6 = this.A04;
        File A032 = r6.A03(str, r8.A0E);
        if (A032 == null) {
            Pair A042 = A04(r8);
            String str2 = r8.A0E;
            if (!(A042 == null || (obj = A042.first) == null || (obj2 = A042.second) == null)) {
                try {
                    file = (File) obj;
                    File A043 = r6.A04((String) obj2, str2);
                    C17960vV.A07(A043);
                    this.A02.A0j(file, A043);
                    File file2 = A043;
                    r6.A03((String) A042.second, str2);
                    return file2;
                } catch (IOException e) {
                    Log.e("StickerRepository/moveTempStickerFileToInternalStorage failed to copy resulting file");
                    C64062u9.A0Q(file);
                    throw e;
                } catch (IOException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("StickerRepository/incrementReferenceCountOnThirdPartySticker unable to move ");
                    sb.append(((File) A042.first).getAbsolutePath());
                    sb.append(" to internal storage");
                    Log.e(sb.toString());
                }
            }
        }
        return A032;
    }

    public File A0A(C1418377d r5, File file) {
        C18070vi.A0d(file, 1);
        Object A002 = ((C131686lV) this.A0Y.get()).A00(r5, file, false);
        if (A002 instanceof AnonymousClass1IU) {
            A002 = null;
        }
        File file2 = (File) A002;
        if (file2 != null) {
            r5.A0B = file2.getAbsolutePath();
            r5.A01 = 1;
            r5.A04 = ((AnonymousClass70H) this.A0G.get()).A03(r5.A01(), file2.getAbsolutePath());
            StringBuilder sb = new StringBuilder();
            sb.append("StickerRepository/downloadSticker/downloaded sticker, file_hash:");
            sb.append(r5.A0F);
            sb.append(",media_key:");
            sb.append(r5.A0D);
            sb.append(",file:");
            sb.append(file2.getAbsolutePath());
            sb.append(", direct_path:");
            sb.append(r5.A08);
            Log.i(sb.toString());
            return file2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("StickerRepository/downloadSticker/sticker file is null for: ");
        sb2.append(r5.A0F);
        Log.e(sb2.toString());
        return file2;
    }

    public ArrayList A0B() {
        ArrayList A012 = ((AnonymousClass702) this.A0N.get()).A01();
        LinkedHashSet A002 = ((C134416qY) this.A0O.get()).A00();
        Iterator it = A012.iterator();
        while (it.hasNext()) {
            AnonymousClass725 r2 = (AnonymousClass725) it.next();
            String str = r2.A0H;
            r2.A00 = ((AnonymousClass72N) this.A0F.get()).A02(str);
            r2.A0B = A002.contains(str);
        }
        A012.size();
        return A012;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A0C() {
        /*
            r7 = this;
            X.00H r0 = r7.A0N
            java.lang.Object r0 = r0.get()
            X.702 r0 = (X.AnonymousClass702) r0
            java.util.ArrayList r5 = r0.A02()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Iterator r2 = r5.iterator()
        L_0x0015:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0041
            java.lang.Object r0 = r2.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r1 = r0.first
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = X.C137416vQ.A01(r1, r0)
            X.00H r0 = r7.A0F
            java.lang.Object r0 = r0.get()
            X.72N r0 = (X.AnonymousClass72N) r0
            int r0 = r0.A02(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.put(r1, r0)
            goto L_0x0015
        L_0x0041:
            r1 = 14
            X.7Rk r0 = new X.7Rk
            r0.<init>((java.lang.Object) r4, (int) r1)
            java.util.Collections.sort(r5, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r6 = r5.iterator()
        L_0x0054:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00b0
            java.lang.Object r1 = r6.next()
            android.util.Pair r1 = (android.util.Pair) r1
            X.00H r0 = r7.A0M     // Catch:{ 1SD -> 0x007d, Exception -> 0x0079 }
            java.lang.Object r5 = r0.get()     // Catch:{ 1SD -> 0x007d, Exception -> 0x0079 }
            X.6pr r5 = (X.C134006pr) r5     // Catch:{ 1SD -> 0x007d, Exception -> 0x0079 }
            java.lang.Object r2 = r1.first     // Catch:{ 1SD -> 0x007d, Exception -> 0x0079 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ 1SD -> 0x007d, Exception -> 0x0079 }
            java.lang.Object r1 = r1.second     // Catch:{ 1SD -> 0x007d, Exception -> 0x0079 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 1SD -> 0x007d, Exception -> 0x0079 }
            boolean r0 = X.C18070vi.A15(r2, r1)     // Catch:{ 1SD -> 0x007d, Exception -> 0x0079 }
            X.725 r2 = r5.A00(r2, r1, r0)     // Catch:{ 1SD -> 0x007d, Exception -> 0x0079 }
            goto L_0x0084
        L_0x0079:
            r1 = move-exception
            java.lang.String r0 = "StickerRepository/getInstalledThirdPartyStickerPacksSync/failed to fetch sticker pack"
            goto L_0x0080
        L_0x007d:
            r1 = move-exception
            java.lang.String r0 = "StickerRepository/getInstalledThirdPartyStickerPacksSync/fetch of sticker pack restricted"
        L_0x0080:
            com.whatsapp.util.Log.e(r0, r1)
            r2 = 0
        L_0x0084:
            if (r2 == 0) goto L_0x0054
            r3.add(r2)
            X.00H r0 = r7.A0O
            java.lang.Object r0 = r0.get()
            X.6qY r0 = (X.C134416qY) r0
            java.util.LinkedHashSet r0 = r0.A00()
            java.lang.String r1 = r2.A0H
            boolean r0 = r0.contains(r1)
            r2.A0B = r0
            A03(r2, r7)
            java.lang.Object r0 = r4.get(r1)
            X.C17960vV.A07(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r2.A00 = r0
            goto L_0x0054
        L_0x00b0:
            r3.size()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1SB.A0C():java.util.ArrayList");
    }

    public ArrayList A0D(int i) {
        C17960vV.A01();
        ArrayList A012 = ((C140046zr) this.A0E.get()).A05.A01(Integer.MAX_VALUE, i);
        ArrayList arrayList = new ArrayList();
        Iterator it = A012.iterator();
        while (it.hasNext()) {
            C136656uA r6 = (C136656uA) it.next();
            C25311Ns r0 = this.A04;
            String str = r6.A0C;
            String str2 = r6.A0E;
            File A042 = r0.A04(str, str2);
            if (A042.exists()) {
                C1418377d r4 = new C1418377d();
                r4.A0B = A042.getAbsolutePath();
                r4.A01 = 1;
                r4.A0F = str;
                r4.A0I = r6.A0F;
                r4.A0A = r6.A0B;
                r4.A08 = r6.A09;
                r4.A0Q = r6.A03;
                if (str2 != null) {
                    r4.A0E = str2;
                } else {
                    r4.A0E = "image/webp";
                }
                r4.A0D = r6.A0D;
                r4.A00 = r6.A04;
                r4.A03 = r6.A06;
                r4.A02 = r6.A05;
                AnonymousClass00H r3 = this.A0G;
                r4.A04 = ((AnonymousClass70H) r3.get()).A03(r4.A01(), A042.getAbsolutePath());
                ((AnonymousClass70H) r3.get()).A05(r4);
                r4.A0C = r6.A01;
                A02(r4);
                arrayList.add(r4);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r0v12, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A0E() {
        /*
            r14 = this;
            X.1SA r6 = r14.A0B
            r0 = 0
            monitor-enter(r6)
            java.util.Map r7 = r6.A00     // Catch:{ all -> 0x00e9 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00e9 }
            boolean r0 = r7.containsKey(r5)     // Catch:{ all -> 0x00e9 }
            if (r0 == 0) goto L_0x001e
            java.lang.Object r0 = r7.get(r5)     // Catch:{ all -> 0x00e9 }
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch:{ all -> 0x00e9 }
            java.lang.Object r4 = r0.get()     // Catch:{ all -> 0x00e9 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x00e9 }
            monitor-exit(r6)
            goto L_0x0020
        L_0x001e:
            monitor-exit(r6)
            r4 = 0
        L_0x0020:
            if (r4 != 0) goto L_0x00e8
            X.00H r8 = r14.A0F
            java.lang.Object r0 = r8.get()
            X.72N r0 = (X.AnonymousClass72N) r0
            X.C17960vV.A01()
            X.00H r0 = r0.A05
            java.lang.Object r1 = r0.get()
            X.73Q r1 = (X.AnonymousClass73Q) r1
            r0 = 0
            java.util.ArrayList r4 = X.AnonymousClass73Q.A02(r1, r0)
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            X.00H r0 = r14.A0O
            java.lang.Object r0 = r0.get()
            X.6qY r0 = (X.C134416qY) r0
            java.util.LinkedHashSet r9 = r0.A00()
            java.util.Iterator r13 = r4.iterator()
        L_0x004f:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00b4
            java.lang.Object r3 = r13.next()
            X.725 r3 = (X.AnonymousClass725) r3
            java.lang.String r11 = r3.A0H
            boolean r0 = r10.contains(r11)
            if (r0 == 0) goto L_0x0069
            java.lang.String r0 = "StickerRepository/getInstalledFirstPartyStickerPacksSync duplicate sticker pack"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x004f
        L_0x0069:
            r10.add(r11)
            java.lang.Object r0 = r8.get()
            X.72N r0 = (X.AnonymousClass72N) r0
            X.C17960vV.A01()
            X.00H r0 = r0.A07
            java.lang.Object r0 = r0.get()
            X.6uZ r0 = (X.C136886uZ) r0
            X.C18070vi.A0X(r11)
            java.util.ArrayList r2 = r0.A03(r11)
            java.util.Iterator r12 = r2.iterator()
        L_0x0088:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00a8
            java.lang.Object r1 = r12.next()
            X.77d r1 = (X.C1418377d) r1
            java.lang.String r0 = r1.A0B
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0088
            X.00H r0 = r14.A0G
            java.lang.Object r0 = r0.get()
            X.70H r0 = (X.AnonymousClass70H) r0
            r0.A05(r1)
            goto L_0x0088
        L_0x00a8:
            r3.A07 = r2
            boolean r0 = r9.contains(r11)
            r3.A0B = r0
            A03(r3, r14)
            goto L_0x004f
        L_0x00b4:
            java.util.Iterator r3 = r4.iterator()
        L_0x00b8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00d3
            java.lang.Object r2 = r3.next()
            X.725 r2 = (X.AnonymousClass725) r2
            java.lang.Object r1 = r8.get()
            X.72N r1 = (X.AnonymousClass72N) r1
            java.lang.String r0 = r2.A0H
            int r0 = r1.A02(r0)
            r2.A00 = r0
            goto L_0x00b8
        L_0x00d3:
            X.7RY r0 = new X.7RY
            r0.<init>()
            java.util.Collections.sort(r4, r0)
            r4.size()
            monitor-enter(r6)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x00e9 }
            r0.<init>(r4)     // Catch:{ all -> 0x00e9 }
            r7.put(r5, r0)     // Catch:{ all -> 0x00e9 }
            monitor-exit(r6)
        L_0x00e8:
            return r4
        L_0x00e9:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1SB.A0E():java.util.List");
    }

    public void A0F(AnonymousClass725 r5, C1607989y r6) {
        if (C18020vd.A05(C18040vf.A02, this.A08, 575)) {
            String str = r5.A0H;
            C18070vi.A0d(str, 0);
            C32071ga A072 = ((C56992iM) this.A0c.get()).A00.A07();
            C18070vi.A0X(A072);
            Bitmap bitmap = (Bitmap) A072.A0A(str);
            if (bitmap != null) {
                if (bitmap.isRecycled()) {
                    A072.A0E(str);
                } else {
                    r6.Bx3(bitmap);
                    return;
                }
            }
        }
        this.A0C.CGD(new AnonymousClass6MC(this, r6), r5);
    }

    public void A0G(AnonymousClass89P r5, String str, boolean z) {
        this.A0C.CGD(new C121726Lg((AnonymousClass167) this.A0a.get(), r5, this), new Pair(str, Boolean.valueOf(z)));
    }

    public void A0H(AnonymousClass3LI r8, String str) {
        this.A0C.CGD(new AnonymousClass2PU(this.A08, this.A09, (AnonymousClass2LK) this.A0H.get(), r8, this), str);
    }

    public void A0I(Collection collection) {
        this.A0C.CGF(new AnonymousClass7RQ(this, collection, 21));
    }

    public void A0J(Collection collection) {
        this.A0C.CGF(new AnonymousClass7RQ(this, collection, 20));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0L(X.C1418377d r6) {
        /*
            r5 = this;
            boolean r0 = r6.A0N
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = r6.A07
            if (r0 == 0) goto L_0x0053
            X.00H r0 = r5.A0E
            java.lang.Object r0 = r0.get()
            X.6zr r0 = (X.C140046zr) r0
            java.lang.String r3 = r6.A07
            r2 = 0
            X.C18070vi.A0d(r3, r2)
            X.6zY r1 = r0.A05
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]
            r4[r2] = r3
            X.00H r0 = r1.A00
            java.lang.Object r0 = r0.get()
            X.1Ls r0 = (X.C24801Ls) r0
            X.1at r3 = r0.get()
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x004c }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x004c }
            java.lang.String r1 = "SELECT plaintext_hash, hash_of_image_part, timestamp, url, enc_hash, direct_path, mimetype, media_key, file_size, width, height, emojis, is_first_party, is_avatar, avatar_template_id, is_fun_sticker, is_lottie, accessibility_text FROM starred_stickers WHERE avatar_template_id = ? ORDER BY timestamp DESC"
            java.lang.String r0 = "getStarredStickerDataFromFileHash/QUERY_STARRED_STICKER"
            android.database.Cursor r2 = r2.A0A(r1, r0, r4)     // Catch:{ all -> 0x004c }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0045 }
            r1 = 0
            if (r0 == 0) goto L_0x0041
            X.6uA r1 = X.C139856zY.A00(r2)     // Catch:{ all -> 0x0045 }
        L_0x0041:
            r2.close()     // Catch:{ all -> 0x004c }
            goto L_0x0064
        L_0x0045:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x004c }
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        L_0x0053:
            java.lang.String r1 = r6.A0F
            if (r1 == 0) goto L_0x006a
            X.00H r0 = r5.A0E
            java.lang.Object r0 = r0.get()
            X.6zr r0 = (X.C140046zr) r0
            boolean r0 = r0.A03(r1)
        L_0x0063:
            return r0
        L_0x0064:
            r3.close()
            r0 = 1
            if (r1 != 0) goto L_0x0063
        L_0x006a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1SB.A0L(X.77d):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0246, code lost:
        if (r0 != false) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01cd, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ce, code lost:
        com.whatsapp.util.Log.e("StarredStickers/starSticker/could not find sticker file corresponding to that sticker file", r1);
        r0 = false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0221  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0M(X.C1418377d r42, java.lang.Long r43, boolean r44, boolean r45) {
        /*
            r41 = this;
            r9 = r42
            boolean r0 = r9.A0N
            r20 = 0
            r8 = r41
            if (r0 == 0) goto L_0x0038
            X.00H r0 = r8.A0V
            java.lang.Object r0 = r0.get()
            X.1Uk r0 = (X.C27021Uk) r0
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0038
            boolean r0 = r9.A0M
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = r9.A07
            X.77d r0 = r8.A05(r0)
            if (r0 != 0) goto L_0x003d
            X.00H r0 = r8.A0X
            java.lang.Object r0 = r0.get()
            X.6yO r0 = (X.C139196yO) r0
            X.77d r9 = r0.A01(r9)
            if (r9 != 0) goto L_0x003e
            java.lang.String r0 = "RecentStickers/unable to find ondemand sticker matching avatar stable id"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0037:
            return r20
        L_0x0038:
            boolean r0 = r9.A0N
            if (r0 == 0) goto L_0x003e
            return r20
        L_0x003d:
            r9 = r0
        L_0x003e:
            X.0ve r15 = r8.A08
            r0 = r20
            X.C18070vi.A0d(r15, r0)
            r1 = 11628(0x2d6c, float:1.6294E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r15, r1)
            if (r0 == 0) goto L_0x005a
            X.00H r0 = r8.A0Z
            java.lang.Object r0 = r0.get()
            X.72H r0 = (X.AnonymousClass72H) r0
            r0.A05(r9)
        L_0x005a:
            java.lang.String r3 = r9.A0F
            java.lang.String r7 = r9.A0E
            if (r3 == 0) goto L_0x0037
            X.00H r10 = r8.A0E
            java.lang.Object r0 = r10.get()
            X.6zr r0 = (X.C140046zr) r0
            boolean r0 = r0.A03(r3)
            if (r0 != 0) goto L_0x0037
            X.1Ns r6 = r8.A04
            java.io.File r5 = r6.A04(r3, r7)
            X.C17960vV.A07(r5)
            boolean r0 = r5.exists()
            r4 = 1
            if (r0 != 0) goto L_0x00d3
            java.lang.String r0 = r9.A0B
            if (r0 == 0) goto L_0x00bd
            int r0 = r9.A01
            if (r0 == r4) goto L_0x00bd
            android.util.Pair r0 = r8.A04(r9)
            if (r0 == 0) goto L_0x0037
            java.lang.Object r2 = r0.first
            java.io.File r2 = (java.io.File) r2
            java.lang.Object r3 = r0.second
            java.lang.String r3 = (java.lang.String) r3
            if (r2 == 0) goto L_0x0037
            if (r3 == 0) goto L_0x0037
            java.lang.Object r0 = r10.get()
            X.6zr r0 = (X.C140046zr) r0
            boolean r0 = r0.A03(r3)
            if (r0 != 0) goto L_0x0037
            r9.A0F = r3
            java.io.File r0 = r6.A04(r3, r7)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x00d3
            java.io.File r5 = r6.A04(r3, r7)     // Catch:{ IOException -> 0x0262 }
            X.C17960vV.A07(r5)     // Catch:{ IOException -> 0x0262 }
            X.17r r0 = r8.A02     // Catch:{ IOException -> 0x0258 }
            r0.A0j(r2, r5)     // Catch:{ IOException -> 0x0258 }
            goto L_0x00d6
        L_0x00bd:
            java.io.File r5 = r6.A04(r3, r7)
            X.C17960vV.A07(r5)
            java.lang.String r2 = r9.A0B
            if (r2 == 0) goto L_0x0037
            X.17r r1 = r8.A02     // Catch:{ IOException -> 0x0268 }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0268 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x0268 }
            r1.A0i(r0, r5)     // Catch:{ IOException -> 0x0268 }
            goto L_0x00d6
        L_0x00d3:
            r19 = 0
            goto L_0x00d8
        L_0x00d6:
            r19 = 1
        L_0x00d8:
            boolean r0 = r5.exists()
            if (r0 == 0) goto L_0x0037
            X.00H r0 = r8.A0K
            java.lang.Object r2 = r0.get()
            if (r43 == 0) goto L_0x0114
            long r17 = r43.longValue()
        L_0x00ea:
            if (r2 == 0) goto L_0x010d
            if (r45 != 0) goto L_0x010d
            r16 = 1
            X.C17960vV.A07(r2)
            r11 = r2
            X.1To r11 = (X.C26811To) r11
            r0 = r17
            java.util.Set r13 = r11.A0B(r9, r0, r4)
        L_0x00fc:
            java.lang.Object r12 = r10.get()
            X.6zr r12 = (X.C140046zr) r12
            X.C17960vV.A01()
            X.C140046zr.A00(r12)
            java.lang.String r11 = r9.A0F
            if (r11 == 0) goto L_0x01cb
            goto L_0x011b
        L_0x010d:
            r16 = 0
            java.util.Set r13 = java.util.Collections.emptySet()
            goto L_0x00fc
        L_0x0114:
            X.11P r0 = r8.A05
            long r17 = X.AnonymousClass11P.A01(r0)
            goto L_0x00ea
        L_0x011b:
            X.6uI r14 = r12.A01     // Catch:{ FileNotFoundException -> 0x01cd }
            boolean r0 = r14.A03(r11)     // Catch:{ FileNotFoundException -> 0x01cd }
            if (r0 != 0) goto L_0x01cb
            X.6mC r1 = r12.A04     // Catch:{ FileNotFoundException -> 0x01cd }
            java.lang.String r0 = r9.A0E     // Catch:{ FileNotFoundException -> 0x01cd }
            java.lang.String r10 = r1.A00(r11, r0)     // Catch:{ FileNotFoundException -> 0x01cd }
            if (r10 == 0) goto L_0x0143
            monitor-enter(r14)     // Catch:{ FileNotFoundException -> 0x01cd }
            java.util.Map r0 = r14.A01     // Catch:{ all -> 0x01c8 }
            java.lang.Object r1 = r0.get(r10)     // Catch:{ all -> 0x01c8 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x01c8 }
            monitor-exit(r14)     // Catch:{ FileNotFoundException -> 0x01cd }
            if (r1 == 0) goto L_0x0143
            java.lang.String r0 = r9.A0F     // Catch:{ FileNotFoundException -> 0x01cd }
            boolean r0 = X.C18070vi.A18(r0, r1)     // Catch:{ FileNotFoundException -> 0x01cd }
            if (r0 != 0) goto L_0x0143
            goto L_0x01cb
        L_0x0143:
            r14.A01(r11, r10)     // Catch:{ FileNotFoundException -> 0x01cd }
            X.1Ns r1 = r12.A00     // Catch:{ FileNotFoundException -> 0x01cd }
            java.lang.String r0 = r9.A0E     // Catch:{ FileNotFoundException -> 0x01cd }
            java.io.File r0 = r1.A04(r11, r0)     // Catch:{ FileNotFoundException -> 0x01cd }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ FileNotFoundException -> 0x01cd }
            r9.A0B = r0     // Catch:{ FileNotFoundException -> 0x01cd }
            r9.A01 = r4     // Catch:{ FileNotFoundException -> 0x01cd }
            X.70H r0 = r12.A03     // Catch:{ FileNotFoundException -> 0x01cd }
            r0.A05(r9)     // Catch:{ FileNotFoundException -> 0x01cd }
            X.6zY r1 = r12.A05     // Catch:{ FileNotFoundException -> 0x01cd }
            java.lang.String r0 = r9.A0I     // Catch:{ FileNotFoundException -> 0x01cd }
            r24 = r0
            java.lang.String r0 = r9.A0A     // Catch:{ FileNotFoundException -> 0x01cd }
            r25 = r0
            java.lang.String r0 = r9.A08     // Catch:{ FileNotFoundException -> 0x01cd }
            r26 = r0
            java.lang.String r0 = r9.A0E     // Catch:{ FileNotFoundException -> 0x01cd }
            r27 = r0
            java.lang.String r0 = r9.A0D     // Catch:{ FileNotFoundException -> 0x01cd }
            r28 = r0
            int r0 = r9.A00     // Catch:{ FileNotFoundException -> 0x01cd }
            r32 = r0
            int r0 = r9.A03     // Catch:{ FileNotFoundException -> 0x01cd }
            r33 = r0
            int r0 = r9.A02     // Catch:{ FileNotFoundException -> 0x01cd }
            r34 = r0
            java.lang.String r0 = r9.A09     // Catch:{ FileNotFoundException -> 0x01cd }
            r29 = r0
            boolean r0 = r9.A0P     // Catch:{ FileNotFoundException -> 0x01cd }
            r37 = r0
            boolean r0 = r9.A0N     // Catch:{ FileNotFoundException -> 0x01cd }
            r38 = r0
            java.lang.String r0 = r9.A07     // Catch:{ FileNotFoundException -> 0x01cd }
            r30 = r0
            boolean r0 = r9.A0J     // Catch:{ FileNotFoundException -> 0x01cd }
            r39 = r0
            boolean r40 = r9.A02()     // Catch:{ FileNotFoundException -> 0x01cd }
            java.lang.String r0 = r9.A06     // Catch:{ FileNotFoundException -> 0x01cd }
            r14 = r0
            X.6uA r0 = new X.6uA     // Catch:{ FileNotFoundException -> 0x01cd }
            r21 = r0
            r22 = r11
            r23 = r10
            r31 = r14
            r35 = r17
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r38, r39, r40)     // Catch:{ FileNotFoundException -> 0x01cd }
            r1.A02(r0)     // Catch:{ FileNotFoundException -> 0x01cd }
            X.1No r0 = r12.A02     // Catch:{ FileNotFoundException -> 0x01cd }
            X.1Nm r1 = r0.A01     // Catch:{ FileNotFoundException -> 0x01cd }
            java.lang.Object r14 = r1.A01     // Catch:{ FileNotFoundException -> 0x01cd }
            monitor-enter(r14)     // Catch:{ FileNotFoundException -> 0x01cd }
            int r0 = r1.A01()     // Catch:{ all -> 0x01c8 }
            android.content.SharedPreferences$Editor r10 = X.C25251Nm.A00(r1)     // Catch:{ all -> 0x01c8 }
            java.lang.String r1 = "sticker_add_to_favorites_count"
            int r0 = r0 + 1
            android.content.SharedPreferences$Editor r0 = r10.putInt(r1, r0)     // Catch:{ all -> 0x01c8 }
            r0.apply()     // Catch:{ all -> 0x01c8 }
            monitor-exit(r14)     // Catch:{ FileNotFoundException -> 0x01cd }
            r0 = 1
            goto L_0x01d4
        L_0x01c8:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ FileNotFoundException -> 0x01cd }
            throw r0     // Catch:{ FileNotFoundException -> 0x01cd }
        L_0x01cb:
            r0 = 0
            goto L_0x01d4
        L_0x01cd:
            r1 = move-exception
            java.lang.String r0 = "StarredStickers/starSticker/could not find sticker file corresponding to that sticker file"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
        L_0x01d4:
            if (r16 == 0) goto L_0x0246
            X.C17960vV.A07(r2)
            X.1To r2 = (X.C26811To) r2
            if (r0 == 0) goto L_0x0249
            r2.A0R(r13)
        L_0x01e0:
            X.2Ga r2 = new X.2Ga
            r2.<init>()
            boolean r0 = r9.A0N
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A01 = r0
            java.lang.Integer r0 = r9.A05
            r2.A05 = r0
            boolean r0 = r9.A0J
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A00 = r0
            X.73B r0 = r9.A04
            if (r0 == 0) goto L_0x0244
            java.lang.String r1 = r0.A02
        L_0x01ff:
            java.lang.String r0 = "Giphy"
            boolean r0 = X.C18070vi.A18(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A03 = r0
            X.73B r0 = r9.A04
            if (r0 == 0) goto L_0x0242
            java.lang.String r1 = r0.A02
        L_0x0211:
            java.lang.String r0 = "Tenor"
            boolean r0 = X.C18070vi.A18(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A04 = r0
            X.73B r1 = r9.A04
            if (r1 == 0) goto L_0x022f
            boolean r0 = r1.A0G
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A02 = r0
            java.lang.Integer r0 = r1.A03()
            r2.A06 = r0
        L_0x022f:
            X.18K r1 = r8.A09
            r0 = 3
            X.C137436vS.A00(r15, r1, r9, r0)
            r1.CC7(r2)
            if (r44 == 0) goto L_0x0241
            java.lang.String r1 = r9.A0F
            java.lang.String r0 = r9.A0E
            r6.A03(r1, r0)
        L_0x0241:
            return r4
        L_0x0242:
            r1 = 0
            goto L_0x0211
        L_0x0244:
            r1 = 0
            goto L_0x01ff
        L_0x0246:
            if (r0 == 0) goto L_0x024c
            goto L_0x01e0
        L_0x0249:
            r2.A0Q(r13)
        L_0x024c:
            if (r19 == 0) goto L_0x0252
            X.C64062u9.A0Q(r5)
            return r20
        L_0x0252:
            if (r44 != 0) goto L_0x0037
            r6.A07(r3, r7)
            return r20
        L_0x0258:
            r1 = move-exception
            java.lang.String r0 = "StickerRepository/moveTempStickerFileToInternalStorage failed to copy resulting file"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0262 }
            X.C64062u9.A0Q(r2)     // Catch:{ IOException -> 0x0262 }
            throw r1     // Catch:{ IOException -> 0x0262 }
        L_0x0262:
            java.lang.String r0 = "StickerRepository/starStickersSync failed to copy external file to internal storage"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r20
        L_0x0268:
            java.lang.String r0 = "StickerRepository/starStickersSync failed to copy internal file"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1SB.A0M(X.77d, java.lang.Long, boolean, boolean):boolean");
    }

    public void A0K(Collection collection, boolean z) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A0M((C1418377d) it.next(), (Long) null, z, false);
        }
        this.A03.A0J(new AnonymousClass7RQ(this, collection, 19));
    }

    public AnonymousClass1SB(AnonymousClass190 r2, C218617r r3, AnonymousClass1KB r4, C25311Ns r5, AnonymousClass181 r6, AnonymousClass11C r7, AnonymousClass11P r8, AnonymousClass118 r9, C19830z4 r10, C18030ve r11, AnonymousClass18K r12, C219317y r13, AnonymousClass1D9 r14, WamediaManager wamediaManager, C25271No r16, AnonymousClass1SA r17, AnonymousClass10I r18, AnonymousClass00H r19, AnonymousClass00H r20, AnonymousClass00H r21, AnonymousClass00H r22, AnonymousClass00H r23, AnonymousClass00H r24, AnonymousClass00H r25, AnonymousClass00H r26, AnonymousClass00H r27, AnonymousClass00H r28, AnonymousClass00H r29, AnonymousClass00H r30, AnonymousClass00H r31, AnonymousClass00H r32, AnonymousClass00H r33, AnonymousClass00H r34, AnonymousClass00H r35, AnonymousClass00H r36, AnonymousClass00H r37, AnonymousClass00H r38) {
        this.A05 = r8;
        this.A08 = r11;
        this.A03 = r4;
        this.A0P = r2;
        this.A06 = r9;
        this.A0C = r18;
        this.A02 = r3;
        this.A0Q = r6;
        this.A09 = r12;
        this.A0U = wamediaManager;
        this.A0W = r19;
        this.A0T = r14;
        this.A0d = r20;
        this.A0G = r21;
        this.A0R = r7;
        this.A0E = r22;
        this.A0F = r23;
        this.A0H = r24;
        this.A0B = r17;
        this.A07 = r10;
        this.A0c = r25;
        this.A0D = r26;
        this.A0V = r27;
        this.A0K = r29;
        this.A0O = r28;
        this.A0A = r16;
        this.A0M = r30;
        this.A0I = r31;
        this.A0Y = r32;
        this.A04 = r5;
        this.A0b = r33;
        this.A0S = r13;
        this.A0J = r36;
        this.A0X = r34;
        this.A0N = r35;
        this.A0L = r37;
        this.A0Z = r38;
    }
}
