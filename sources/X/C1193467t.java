package X;

import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.67t  reason: invalid class name and case insensitive filesystem */
public final class C1193467t extends C136976ui {
    public final C218617r A00;
    public final AnonymousClass1KB A01;
    public final C133056o6 A02;
    public final C136726uI A03 = new C136726uI();
    public final AnonymousClass70H A04;
    public final AnonymousClass2LK A05;
    public final C139516yy A06;
    public final C200710s A07;
    public final Map A08 = C17880vN.A11();
    public final boolean A09;
    public final C25311Ns A0A;
    public final C18030ve A0B;
    public final AnonymousClass18K A0C;
    public final C27021Uk A0D;
    public final AnonymousClass1SB A0E;
    public final C139196yO A0F;
    public final C138906xt A0G;
    public final C136886uZ A0H;

    public final Pair A0D(String str) {
        Object A0L;
        C18070vi.A0d(str, 0);
        Iterator it = A0G().iterator();
        while (it.hasNext()) {
            C1418377d A0x = C108945cZ.A0x(it);
            if (str.equals(A0x.A0F)) {
                Map map = this.A08;
                if (map.containsKey(str)) {
                    A0L = map.get(str);
                } else {
                    A0L = C17890vO.A0L();
                }
                return C108945cZ.A0N(A0x, A0L);
            }
        }
        return null;
    }

    public final C1418377d A0E(String str) {
        C18070vi.A0d(str, 0);
        Iterator it = A0G().iterator();
        while (it.hasNext()) {
            C1418377d A0x = C108945cZ.A0x(it);
            if (str.equals(A0x.A0F)) {
                return A0x;
            }
        }
        return null;
    }

    public final void A0J(AnonymousClass887 r4, C1418377d r5) {
        C18070vi.A0d(r5, 0);
        this.A07.execute(new AnonymousClass7RO(this, r5, r4, 5));
    }

    public final void A0K(AnonymousClass887 r10, C1418377d r11) {
        C1418377d r3 = r11;
        C18070vi.A0d(r11, 0);
        String str = r11.A0F;
        if (str != null) {
            A09(new C133896pg(r3, str, this.A03.A00(str), r11.A07, 0));
            if (r10 != null) {
                r10.Bqt(str);
            }
            C137436vS.A00(this.A0B, this.A0C, r11, 5);
            this.A01.A0J(AnonymousClass7RI.A00(this, 14));
        }
    }

    public final void A0M(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, int i3, boolean z, boolean z2) {
        String str9 = str;
        C18070vi.A0d(str9, 0);
        C1418377d r4 = new C1418377d((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String[]) null, 0, 0, 0, false, false, false, false, false, false, false, false);
        r4.A0F = str9;
        String str10 = str2;
        if (str2 != null) {
            r4.A0I = str10;
        }
        String str11 = str3;
        if (str3 != null) {
            r4.A0A = str11;
        }
        String str12 = str4;
        if (str4 != null) {
            r4.A08 = str12;
        }
        String str13 = str5;
        if (str5 != null) {
            r4.A0E = str13;
        }
        String str14 = str6;
        if (str6 != null) {
            r4.A0D = str14;
        }
        r4.A00 = i;
        r4.A03 = i2;
        r4.A02 = i3;
        r4.A09 = str7;
        r4.A0P = z;
        r4.A0Q = z2;
        r4.A06 = str8;
        this.A06.A02(r4);
        Iterator it = super.A05().iterator();
        while (it.hasNext()) {
            C133896pg r1 = (C133896pg) it.next();
            if (str9.equals(r1.A02)) {
                r1.A00(r4);
            }
        }
    }

    public final boolean A0N(String str) {
        int size;
        C18070vi.A0d(str, 0);
        C136726uI r1 = this.A03;
        synchronized (r1) {
            size = r1.A00.size();
        }
        if (size > 0) {
            return r1.A03(str);
        }
        return AnonymousClass000.A1W(A0E(str));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1193467t(X.C56572hg r20, X.C51442Yh r21, X.C218617r r22, X.AnonymousClass1KB r23, X.C25311Ns r24, X.C133056o6 r25, X.C18030ve r26, X.AnonymousClass18K r27, X.C27021Uk r28, X.AnonymousClass70H r29, X.AnonymousClass2LK r30, X.AnonymousClass1SB r31, X.C139196yO r32, X.C138906xt r33, X.C136886uZ r34, X.AnonymousClass10I r35, boolean r36) {
        /*
            r19 = this;
            r16 = r35
            r9 = r27
            r17 = r22
            r12 = r23
            r10 = r26
            r1 = r16
            r0 = r17
            X.C18070vi.A0w(r10, r12, r1, r0, r9)
            r3 = r34
            r7 = r29
            r6 = r30
            r5 = r31
            r11 = r25
            X.C18070vi.A0x(r3, r7, r6, r5, r11)
            r4 = r32
            r8 = r28
            r13 = r24
            r18 = r20
            r1 = r21
            r0 = r18
            X.C18070vi.A0y(r8, r0, r4, r1, r13)
            r0 = 16
            r14 = r33
            X.C18070vi.A0d(r14, r0)
            X.10F r0 = r1.A00
            X.10E r0 = r0.A00
            X.00S r0 = r0.A48
            java.lang.Object r0 = r0.get()
            X.2hg r0 = (X.C56572hg) r0
            X.7IV r15 = new X.7IV
            r2 = r36
            r15.<init>(r0, r2)
            r0 = 32
            r1 = r19
            r1.<init>(r15, r0)
            r1.A0B = r10
            r1.A01 = r12
            r0 = r17
            r1.A00 = r0
            r1.A0C = r9
            r1.A0H = r3
            r1.A04 = r7
            r1.A05 = r6
            r1.A0E = r5
            r1.A02 = r11
            r1.A0D = r8
            r1.A0F = r4
            r1.A0A = r13
            r1.A0G = r14
            r1.A09 = r2
            r0 = r18
            X.6yy r0 = r0.A00(r2)
            r1.A06 = r0
            X.10s r0 = X.C200710s.A00(r16)
            r1.A07 = r0
            X.6uI r0 = new X.6uI
            r0.<init>()
            r1.A03 = r0
            java.util.HashMap r0 = X.C17880vN.A11()
            r1.A08 = r0
            java.lang.Boolean r0 = X.C17960vV.A01
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1193467t.<init>(X.2hg, X.2Yh, X.17r, X.1KB, X.1Ns, X.6o6, X.0ve, X.18K, X.1Uk, X.70H, X.2LK, X.1SB, X.6yO, X.6xt, X.6uZ, X.10I, boolean):void");
    }

    private final C133896pg A00(C1418377d r19, long j) {
        String A0s;
        String str;
        C136706uF A012;
        C1418377d r7 = r19;
        String str2 = r7.A0F;
        if (str2 != null) {
            C136726uI r5 = this.A03;
            String A002 = r5.A00(str2);
            String str3 = r7.A0B;
            if (A002 == null) {
                if (!(str3 == null || (A012 = this.A0G.A01(C108945cZ.A17(str3), r7.A0E)) == null)) {
                    File A17 = C108945cZ.A17(str3);
                    if (!A17.exists()) {
                        C17900vP.A0e("StickerHandler/getFileHashExcludingMetadata/file does not exist, ", str3, AnonymousClass000.A10());
                    } else {
                        A002 = A012.A01(A17);
                        if (A002 == null) {
                            return null;
                        }
                    }
                }
            }
            synchronized (r5) {
                A0s = C17880vN.A0s(A002, r5.A01);
            }
            if (A0s != null && !C18070vi.A18(r7.A0F, A0s)) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("RecentStickers/dedupeStickerFilesBasedOnImageHash/Removing old sticker from recents:");
                A10.append(A0s);
                A10.append(", with the same image hash:");
                A10.append(A002);
                A10.append(", with the new sticker:");
                C17890vO.A1A(A10, r7.A0F);
                A09(new C133896pg(r7, A0s, A002, r7.A07, 0));
            }
            if (r7.A0E == null) {
                if (r7.A02()) {
                    str = "application/was";
                } else {
                    str = "image/webp";
                }
                r7.A0E = str;
            }
            return new C133896pg(r7, str2, A002, r7.A07, j);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0057, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0058, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String A01(X.C1418377d r6) {
        /*
            r5 = this;
            java.lang.String r2 = r6.A0F
            r1 = 0
            if (r2 != 0) goto L_0x000b
            java.lang.String r0 = "RecentStickers/setRecentStickerFilePath/sticker param has null file hash"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r1
        L_0x000b:
            X.1Ns r1 = r5.A0A
            java.lang.String r0 = r6.A0E
            java.io.File r4 = r1.A04(r2, r0)
            java.lang.String r0 = r6.A0B
            if (r0 == 0) goto L_0x005f
            java.io.File r2 = X.C108945cZ.A17(r0)
            r0 = 1
            X.C18070vi.A0d(r4, r0)
            java.lang.String r1 = r2.getAbsolutePath()
            java.lang.String r0 = r4.getAbsolutePath()
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x005f
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x005f
            boolean r0 = r4.exists()
            if (r0 != 0) goto L_0x005f
            r4.delete()
            r4.createNewFile()
            java.io.FileInputStream r3 = X.C108945cZ.A18(r2)
            java.io.FileOutputStream r2 = X.C108945cZ.A19(r4)     // Catch:{ all -> 0x0055 }
            X.C64062u9.A00(r3, r2)     // Catch:{ all -> 0x004e }
            r2.close()     // Catch:{ all -> 0x0055 }
            goto L_0x005c
        L_0x004e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0055 }
            throw r0     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        L_0x005c:
            r3.close()
        L_0x005f:
            X.C108985cd.A1B(r6, r4)
            java.lang.String r0 = r4.getAbsolutePath()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1193467t.A01(X.77d):java.lang.String");
    }

    private final boolean A02(C133896pg r9, boolean z) {
        float f;
        if (!z) {
            return super.A0A(r9);
        }
        A08();
        boolean z2 = false;
        if (this.A03.size() > 0) {
            f = ((AnonymousClass8AP) this.A03.get(0)).Bbo();
        } else {
            f = 0.0f;
        }
        synchronized (this) {
            for (AnonymousClass8AP r4 : this.A03) {
                float Bbo = r4.Bbo();
                if (!r4.BFJ(r9)) {
                    r4.CLT(((float) Math.round((Bbo * 0.9f) * 100.0f)) / 100.0f);
                } else {
                    r4.CLT(Math.max(Bbo, f) + 1.0f);
                    z2 = true;
                }
            }
            if (!z2) {
                A0C(this.A01.BHM(r9, f + 1.0f));
            }
            Collections.sort(this.A03, this.A02);
            C17960vV.A07(this.A03);
            int size = this.A03.size();
            while (true) {
                size--;
                if (size >= this.A00) {
                    A0B(size);
                } else {
                    this.A01.CBh(this.A03);
                }
            }
        }
        return z2;
    }

    public /* bridge */ /* synthetic */ void A0C(AnonymousClass8AP r5) {
        C144637Ic r52 = (C144637Ic) r5;
        C17960vV.A00();
        C17900vP.A0Y(r52, "RecentStickers/addEntry/adding entry: ", AnonymousClass000.A10());
        C136726uI r2 = this.A03;
        C133896pg r1 = r52.A01;
        String str = r1.A02;
        r2.A01(str, r1.A03);
        this.A08.put(str, Long.valueOf(r1.A00));
        super.A0C(r52);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00fd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00fe, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0101, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0L(X.C1418377d r12, long r13, boolean r15) {
        /*
            r11 = this;
            boolean r0 = r12.A0N
            if (r0 == 0) goto L_0x0020
            X.1Uk r0 = r11.A0D
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r12.A0M
            if (r0 != 0) goto L_0x0020
            java.lang.String r1 = r12.A07
            if (r1 != 0) goto L_0x0034
            java.lang.String r0 = "RecentStickers/ sent sticker avatar sticker stable id is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.String r1 = "Avatar Sticker with NULL stable ID found"
            r0 = 0
            X.C17960vV.A0F(r0, r1)
        L_0x001f:
            return
        L_0x0020:
            boolean r0 = r12.A0N
            if (r0 == 0) goto L_0x0026
            return
        L_0x0025:
            r12 = r0
        L_0x0026:
            java.lang.String r0 = r12.A0B
            if (r0 != 0) goto L_0x002d
            java.lang.String r0 = "RecentStickers/add file path is null"
            goto L_0x0046
        L_0x002d:
            java.lang.String r1 = r12.A0F
            if (r1 != 0) goto L_0x004a
            java.lang.String r0 = "RecentStickers/add file hash is null"
            goto L_0x0046
        L_0x0034:
            X.6uZ r0 = r11.A0H
            X.77d r0 = r0.A01(r1)
            if (r0 != 0) goto L_0x0025
            X.6yO r0 = r11.A0F
            X.77d r12 = r0.A01(r12)
            if (r12 != 0) goto L_0x0026
            java.lang.String r0 = "RecentStickers/unable to find ondemand sticker matching avatar stable id"
        L_0x0046:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x004a:
            boolean r0 = r11.A0N(r1)
            if (r0 == 0) goto L_0x00d3
            java.util.Map r4 = r11.A08
            java.lang.Number r0 = X.C108945cZ.A1E(r1, r4)
            long r0 = X.C17900vP.A01(r0)
            long r2 = java.lang.Math.max(r13, r0)
            X.6pg r2 = r11.A00(r12, r2)
            if (r2 == 0) goto L_0x00d1
            boolean r3 = r11.A02(r2, r15)
        L_0x0068:
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x001f
            if (r3 == 0) goto L_0x001f
            java.lang.String r1 = r12.A0F
            X.C17960vV.A07(r1)
            X.C18070vi.A0X(r1)
            X.6yy r2 = r11.A06
            r3 = 0
            java.lang.String r0 = r12.A0F
            if (r0 != 0) goto L_0x00a8
            java.lang.String r0 = "RecentStickerDBStorage/updateLastStickerSentTs/sticker filehash is null, could not be updated"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0082:
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            r4.put(r1, r0)
            java.util.ArrayList r0 = super.A05()
            java.util.Iterator r3 = r0.iterator()
        L_0x0091:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x001f
            java.lang.Object r2 = r3.next()
            X.6pg r2 = (X.C133896pg) r2
            java.lang.String r0 = r2.A02
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0091
            r2.A00 = r13
            return
        L_0x00a8:
            X.00H r0 = r2.A01
            X.1au r2 = X.C108985cd.A0S(r0)
            java.lang.String r8 = "plaintext_hash = ?"
            java.lang.String[] r10 = X.C17880vN.A1Y()     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = r12.A0F     // Catch:{ all -> 0x00fb }
            r10[r3] = r0     // Catch:{ all -> 0x00fb }
            android.content.ContentValues r6 = X.C17880vN.A08()     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = "last_sticker_sent_ts"
            X.C17880vN.A19(r6, r0, r13)     // Catch:{ all -> 0x00fb }
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00fb }
            X.1Ev r5 = r0.A02     // Catch:{ all -> 0x00fb }
            java.lang.String r7 = "recent_stickers"
            java.lang.String r9 = "updateSticker/UPDATE_RECENT_STICKERS_LAST_SENT_TS"
            r5.A02(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00fb }
            r2.close()
            goto L_0x0082
        L_0x00d1:
            r3 = 0
            goto L_0x0068
        L_0x00d3:
            java.lang.String r0 = r12.A0B
            if (r0 == 0) goto L_0x00f6
            int r1 = r12.A01
            r0 = 1
            if (r1 == r0) goto L_0x00f6
            X.1SB r0 = r11.A0E
            java.io.File r0 = r0.A09(r12)
        L_0x00e2:
            if (r0 == 0) goto L_0x001f
            X.C108985cd.A1B(r12, r0)
            X.70H r0 = r11.A04
            r0.A05(r12)
            X.6pg r0 = r11.A00(r12, r13)
            if (r0 == 0) goto L_0x001f
            r11.A02(r0, r15)
            return
        L_0x00f6:
            java.io.File r0 = r11.A0F(r12)
            goto L_0x00e2
        L_0x00fb:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00fd }
        L_0x00fd:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1193467t.A0L(X.77d, long, boolean):void");
    }

    public void A0B(int i) {
        C17960vV.A00();
        C133896pg r3 = (C133896pg) A04(i);
        if (r3 != null) {
            C17900vP.A0Y(r3, "RecentStickers/removeEntry/removing entry: ", AnonymousClass000.A10());
            String str = r3.A04.A0E;
            C25311Ns r0 = this.A0A;
            String str2 = r3.A02;
            r0.A07(str2, str);
            this.A03.A02(str2, r3.A03);
            this.A08.remove(str2);
            super.A0B(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
        if (r0 == false) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File A0F(X.C1418377d r7) {
        /*
            r6 = this;
            X.C17960vV.A00()
            java.lang.String r3 = r7.A0F
            r5 = 0
            if (r3 == 0) goto L_0x0061
            X.1Ns r2 = r6.A0A
            java.lang.String r0 = r7.A0E
            java.io.File r4 = r2.A04(r3, r0)
            boolean r0 = r4.exists()
            if (r0 == 0) goto L_0x0020
            r4.getAbsolutePath()
        L_0x0019:
            java.lang.String r0 = r7.A0E
            java.io.File r0 = r2.A03(r3, r0)
            return r0
        L_0x0020:
            boolean r0 = r4.exists()
            if (r0 != 0) goto L_0x0061
            java.lang.String r1 = r4.getAbsolutePath()
            java.lang.String r0 = r7.A0B
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x0061
            java.lang.String r0 = r7.A0B
            if (r0 == 0) goto L_0x0061
            X.C17960vV.A00()
            java.lang.String r0 = r7.A0B
            if (r0 == 0) goto L_0x005d
            r4.getAbsolutePath()     // Catch:{ IOException -> 0x004b }
            X.17r r1 = r6.A00     // Catch:{ IOException -> 0x004b }
            java.io.File r0 = X.C108945cZ.A17(r0)     // Catch:{ IOException -> 0x004b }
            r1.A0i(r0, r4)     // Catch:{ IOException -> 0x004b }
            r0 = 1
            goto L_0x005e
        L_0x004b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "RecentStickers/copyFile/error copying file sticker"
            r1.append(r0)
            java.lang.String r0 = r7.A0G
            if (r0 != 0) goto L_0x005a
            java.lang.String r0 = ""
        L_0x005a:
            X.C17890vO.A19(r1, r0)
        L_0x005d:
            r0 = 0
        L_0x005e:
            if (r0 == 0) goto L_0x0061
            goto L_0x0019
        L_0x0061:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1193467t.A0F(X.77d):java.io.File");
    }

    public final ArrayList A0G() {
        String str;
        ArrayList A052 = super.A05();
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = A052.iterator();
        while (it.hasNext()) {
            C133896pg r5 = (C133896pg) it.next();
            C136726uI r1 = this.A03;
            String str2 = r5.A02;
            r1.A01(str2, r5.A03);
            this.A08.put(str2, Long.valueOf(r5.A00));
            C1418377d r12 = r5.A04;
            if (r12.A0F == null) {
                r12.A0F = str2;
            }
            if (r12.A02()) {
                str = "application/was";
            } else {
                str = "image/webp";
            }
            r12.A0E = str;
            if (A01(r12) != null) {
                this.A04.A05(r12);
            }
            A13.add(r12.A00());
        }
        return A13;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00aa, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ab, code lost:
        X.CDX.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ae, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A0H() {
        /*
            r12 = this;
            java.util.ArrayList r11 = super.A05()
            java.util.LinkedHashSet r4 = X.C17880vN.A14()
            java.util.Iterator r10 = r11.iterator()
        L_0x000c:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00af
            java.lang.Object r7 = r10.next()
            X.6pg r7 = (X.C133896pg) r7
            X.77d r3 = r7.A04
            java.lang.String r0 = r3.A0F
            if (r0 == 0) goto L_0x000c
            boolean r0 = r4.add(r0)
            if (r0 == 0) goto L_0x000c
            X.6yy r6 = r12.A06
            java.lang.String r5 = r7.A02
            r0 = 0
            java.lang.String[] r9 = X.C17880vN.A1a(r5, r0)
            X.00H r0 = r6.A01
            X.1at r8 = X.C108975cc.A0F(r0)
            r0 = r8
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00a8 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x00a8 }
            java.lang.String r1 = "SELECT plaintext_hash, entry_weight, hash_of_image_part, url, enc_hash, direct_path, mimetype, media_key, file_size, width, height, emojis, is_first_party, is_avocado, last_sticker_sent_ts, avatar_template_id, is_fun_sticker, is_lottie, accessibility_text FROM recent_stickers WHERE plaintext_hash = ?"
            java.lang.String r0 = "getStickerFromFileHash/QUERY_RECENT_STICKER"
            android.database.Cursor r2 = r2.A0A(r1, r0, r9)     // Catch:{ all -> 0x00a8 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x00a1 }
            if (r0 == 0) goto L_0x0056
            X.00H r0 = r6.A00     // Catch:{ all -> 0x00a1 }
            java.lang.Object r0 = X.C18070vi.A0E(r0)     // Catch:{ all -> 0x00a1 }
            X.70H r0 = (X.AnonymousClass70H) r0     // Catch:{ all -> 0x00a1 }
            X.77d r1 = X.C139516yy.A00(r2, r0)     // Catch:{ all -> 0x00a1 }
            r2.close()     // Catch:{ all -> 0x00a8 }
            goto L_0x006b
        L_0x0056:
            r2.close()     // Catch:{ all -> 0x00a8 }
            r8.close()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "RecentStickerDBStorage/getStickerFromFileHash/sticker unable to be retrieved from recent stickers db: filehash = "
            X.C17900vP.A0e(r0, r5, r1)
            java.lang.String r0 = "RecentStickers/getStickerListAndWeights/recent sticker not found in db"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x008e
        L_0x006b:
            r8.close()
            java.lang.String r0 = r1.A08
            if (r0 != 0) goto L_0x008b
            X.6o6 r2 = r12.A02
            X.00H r0 = r2.A04
            java.lang.Object r1 = r0.get()
            X.1ST r1 = (X.AnonymousClass1ST) r1
            r0 = 20
            X.6io r0 = r1.A09(r5, r0)
            if (r0 == 0) goto L_0x008e
            X.77d r1 = r2.A00(r0, r5)
            r6.A02(r1)
        L_0x008b:
            r7.A00(r1)
        L_0x008e:
            java.lang.String r0 = r3.A0E
            if (r0 != 0) goto L_0x000c
            boolean r0 = r3.A02()
            if (r0 == 0) goto L_0x009e
            java.lang.String r0 = "application/was"
        L_0x009a:
            r3.A0E = r0
            goto L_0x000c
        L_0x009e:
            java.lang.String r0 = "image/webp"
            goto L_0x009a
        L_0x00a1:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x00a8 }
            throw r0     // Catch:{ all -> 0x00a8 }
        L_0x00a8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00aa }
        L_0x00aa:
            r0 = move-exception
            X.CDX.A00(r8, r1)
            throw r0
        L_0x00af:
            java.util.HashMap r5 = super.A07()
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r11.iterator()
        L_0x00bb:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00d8
            java.lang.Object r2 = r3.next()
            X.6pg r2 = (X.C133896pg) r2
            X.77d r0 = r2.A04
            X.77d r1 = r0.A00()
            r12.A01(r1)
            java.lang.Object r0 = r5.get(r2)
            X.C108965cb.A1Q(r1, r0, r4)
            goto L_0x00bb
        L_0x00d8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1193467t.A0H():java.util.ArrayList");
    }

    public final HashMap A0I() {
        ArrayList A052 = super.A05();
        HashMap A11 = C17880vN.A11();
        Iterator it = A052.iterator();
        while (it.hasNext()) {
            C133896pg r0 = (C133896pg) it.next();
            C17880vN.A1N(r0.A02, A11, r0.A00);
        }
        return A11;
    }
}
