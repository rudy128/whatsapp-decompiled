package X;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6zC  reason: invalid class name and case insensitive filesystem */
public final class C139636zC {
    public final C19830z4 A00;
    public final C18030ve A01;
    public final AnonymousClass10I A02;
    public final AnonymousClass19K A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass11P A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;

    public static final C162248Jv A00(Class cls, int i) {
        int nextInt = new Random().nextInt(i);
        A1B a1b = new A1B();
        a1b.A00 = AnonymousClass00R.A01;
        C20078A6e A012 = a1b.A01();
        C196269uj r3 = new C196269uj(cls);
        r3.A02((long) nextInt, TimeUnit.MINUTES);
        r3.A03(A012);
        return (C162248Jv) r3.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03a7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
        X.CDX.A00(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03ab, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03ae, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:?, code lost:
        X.CDX.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03b2, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A01() {
        /*
            r15 = this;
            X.00H r3 = r15.A0E
            java.lang.Object r0 = r3.get()
            X.6sw r0 = (X.C135896sw) r0
            boolean r0 = r0.A02()
            r2 = 0
            if (r0 != 0) goto L_0x0010
            return r2
        L_0x0010:
            X.0z4 r10 = r15.A00
            X.00H r8 = r10.A00
            android.content.SharedPreferences r0 = X.C17880vN.A0B(r8)
            java.lang.String r7 = "clean_up_discovery_stickers_from_internal_storage"
            boolean r0 = X.C17880vN.A1W(r0, r7)
            if (r0 != 0) goto L_0x0086
            X.0ve r0 = r15.A01
            boolean r0 = X.C137456vU.A00(r0)
            if (r0 == 0) goto L_0x0086
            X.00H r0 = r15.A0C
            X.72N r0 = X.C108945cZ.A0z(r0)
            java.util.List r0 = r0.A05()
            if (r0 == 0) goto L_0x007e
            java.util.Iterator r11 = r0.iterator()
        L_0x0038:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x007e
            X.725 r1 = X.C108945cZ.A0y(r11)
            X.00H r0 = r15.A0A
            java.lang.Object r9 = r0.get()
            X.6hZ r9 = (X.C129296hZ) r9
            java.lang.String r1 = X.AnonymousClass725.A00(r1)
            X.00H r0 = r9.A02
            X.72N r0 = X.C108945cZ.A0z(r0)
            X.00H r0 = r0.A07
            java.lang.Object r0 = r0.get()
            X.6uZ r0 = (X.C136886uZ) r0
            java.util.ArrayList r0 = r0.A03(r1)
            java.util.Iterator r6 = r0.iterator()
        L_0x0064:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0038
            X.77d r5 = X.C108945cZ.A0x(r6)
            java.lang.String r0 = r5.A0B
            java.lang.String r4 = r5.A0F
            if (r0 == 0) goto L_0x0064
            if (r4 == 0) goto L_0x0064
            X.1Ns r1 = r9.A00
            java.lang.String r0 = r5.A0E
            r1.A07(r4, r0)
            goto L_0x0064
        L_0x007e:
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r10)
            r0 = 1
            X.C17880vN.A1F(r1, r7, r0)
        L_0x0086:
            X.00H r6 = r15.A0C
            X.72N r0 = X.C108945cZ.A0z(r6)
            X.00H r0 = r0.A04
            java.lang.Object r0 = r0.get()
            X.6fB r0 = (X.C127936fB) r0
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r0 = X.C17880vN.A0C(r0)
            java.lang.String r4 = "pref_key_preview_ids"
            r1 = 0
            java.lang.String r0 = r0.getString(r4, r2)
            if (r0 == 0) goto L_0x00a7
            java.util.List r1 = X.C108995ce.A0c(r0)
        L_0x00a7:
            if (r1 == 0) goto L_0x0142
            java.util.Set r7 = X.C29431cG.A11(r1)
        L_0x00ad:
            X.72N r0 = X.C108945cZ.A0z(r6)
            r5 = 1
            X.73Q r0 = X.AnonymousClass72N.A00(r0)
            java.util.ArrayList r0 = X.AnonymousClass73Q.A01(r0, r5)
            java.util.ArrayList r9 = X.C29431cG.A0m(r0)
            android.content.SharedPreferences r0 = X.C17880vN.A0B(r8)
            java.lang.String r8 = "pref_cuppy_sticker_pack_has_been_removed"
            boolean r0 = X.C17880vN.A1W(r0, r8)
            if (r0 != 0) goto L_0x0128
            X.00H r0 = r15.A05
            X.67t r0 = X.C108945cZ.A0w(r0)
            java.util.ArrayList r0 = r0.A0G()
            boolean r0 = X.C17880vN.A1X(r0)
            if (r0 != 0) goto L_0x0128
            X.0ve r1 = r15.A01
            r0 = 9754(0x261a, float:1.3668E-41)
            boolean r0 = X.C25291Nq.A04(r1, r0)
            if (r0 == 0) goto L_0x0128
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r10)
            X.C17880vN.A1F(r0, r8, r5)
            java.util.Iterator r10 = r9.iterator()
        L_0x00ef:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0140
            java.lang.Object r8 = r10.next()
            r0 = r8
            X.725 r0 = (X.AnonymousClass725) r0
            java.lang.String r1 = r0.A0H
            java.lang.String r0 = "whatsappcuppy"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x00ef
        L_0x0106:
            X.725 r8 = (X.AnonymousClass725) r8
            if (r8 == 0) goto L_0x0128
            X.00H r0 = r15.A08
            java.lang.Object r1 = r0.get()
            X.1SB r1 = (X.AnonymousClass1SB) r1
            java.lang.String r0 = r8.A0H
            boolean r0 = r1.A0N(r0)
            r9.remove(r8)
            if (r0 == 0) goto L_0x0128
            X.00H r0 = r15.A04
            X.1KB r1 = X.C108945cZ.A0a(r0)
            r0 = 39
            X.AnonymousClass7RQ.A00(r1, r15, r8, r0)
        L_0x0128:
            java.util.ArrayList r8 = X.C29351c6.A0D(r9)
            java.util.Iterator r1 = r9.iterator()
        L_0x0130:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0145
            X.725 r0 = X.C108945cZ.A0y(r1)
            java.lang.String r0 = r0.A0H
            r8.add(r0)
            goto L_0x0130
        L_0x0140:
            r8 = 0
            goto L_0x0106
        L_0x0142:
            r7 = r2
            goto L_0x00ad
        L_0x0145:
            java.util.Set r10 = X.C29431cG.A12(r8)
            X.00H r0 = r15.A0D     // Catch:{ 1SC -> 0x03b4 }
            java.lang.Object r8 = r0.get()     // Catch:{ 1SC -> 0x03b4 }
            X.734 r8 = (X.AnonymousClass734) r8     // Catch:{ 1SC -> 0x03b4 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 1SC -> 0x03b4 }
            java.lang.String r0 = "https://static.whatsapp.net/sticker?cat=suggest_sticker_packs&lg="
            r1.append(r0)     // Catch:{ 1SC -> 0x03b4 }
            X.0vb r0 = r8.A07     // Catch:{ 1SC -> 0x03b4 }
            java.util.Locale r9 = r0.A0N()     // Catch:{ 1SC -> 0x03b4 }
            java.lang.String[] r0 = X.AnonymousClass1X0.A04     // Catch:{ 1SC -> 0x03b4 }
            java.lang.String r0 = r9.toLanguageTag()     // Catch:{ 1SC -> 0x03b4 }
            r1.append(r0)     // Catch:{ 1SC -> 0x03b4 }
            X.0ve r11 = r8.A08     // Catch:{ 1SC -> 0x03b4 }
            r0 = 8198(0x2006, float:1.1488E-41)
            X.0vf r9 = X.C18040vf.A02     // Catch:{ 1SC -> 0x03b4 }
            int r14 = X.C18020vd.A00(r9, r11, r0)     // Catch:{ 1SC -> 0x03b4 }
            r0 = 11836(0x2e3c, float:1.6586E-41)
            int r13 = X.C18020vd.A00(r9, r11, r0)     // Catch:{ 1SC -> 0x03b4 }
            java.lang.StringBuilder r12 = X.AnonymousClass000.A10()     // Catch:{ 1SC -> 0x03b4 }
            java.lang.String r0 = "&pack_num_limit="
            r12.append(r0)     // Catch:{ 1SC -> 0x03b4 }
            r12.append(r14)     // Catch:{ 1SC -> 0x03b4 }
            java.lang.String r0 = "&num_in_pack="
            r12.append(r0)     // Catch:{ 1SC -> 0x03b4 }
            r12.append(r13)     // Catch:{ 1SC -> 0x03b4 }
            java.lang.String r0 = "&pin_list_id=cuppy_pinned"
            X.C108985cd.A1L(r0, r12, r1)     // Catch:{ 1SC -> 0x03b4 }
            java.lang.String r1 = r1.toString()     // Catch:{ 1SC -> 0x03b4 }
            r0 = 5693(0x163d, float:7.978E-42)
            boolean r0 = X.C18020vd.A05(r9, r11, r0)     // Catch:{ 1SC -> 0x03b4 }
            if (r0 == 0) goto L_0x01aa
            r0 = 6785(0x1a81, float:9.508E-42)
            java.lang.String r0 = X.C18020vd.A01(r9, r11, r0)     // Catch:{ 1SC -> 0x03b4 }
            if (r0 == 0) goto L_0x01aa
            java.lang.String r1 = X.C17900vP.A0A(r1, r0)     // Catch:{ 1SC -> 0x03b4 }
        L_0x01aa:
            X.1Km r0 = r8.A09     // Catch:{ 1SC -> 0x03b4 }
            java.lang.String r12 = r0.A01(r1)     // Catch:{ 1SC -> 0x03b4 }
            X.C18070vi.A0X(r12)     // Catch:{ 1SC -> 0x03b4 }
            X.00H r11 = r8.A0B     // Catch:{ 1SC -> 0x03b4 }
            java.lang.Object r0 = r11.get()     // Catch:{ 1SC -> 0x03b4 }
            X.6fB r0 = (X.C127936fB) r0     // Catch:{ 1SC -> 0x03b4 }
            X.0vl r0 = r0.A01     // Catch:{ 1SC -> 0x03b4 }
            android.content.SharedPreferences r0 = X.C17880vN.A0C(r0)     // Catch:{ 1SC -> 0x03b4 }
            java.lang.String r9 = "pref_key_etag"
            java.lang.String r0 = r0.getString(r9, r2)     // Catch:{ 1SC -> 0x03b4 }
            r1 = 0
            X.6f8 r8 = X.AnonymousClass734.A00(r2, r8, r12, r0)     // Catch:{ 1SC -> 0x03b4 }
            if (r8 == 0) goto L_0x01e4
            java.lang.Object r0 = r11.get()     // Catch:{ 1SC -> 0x03b4 }
            X.6fB r0 = (X.C127936fB) r0     // Catch:{ 1SC -> 0x03b4 }
            java.lang.String r1 = r8.A00     // Catch:{ 1SC -> 0x03b4 }
            if (r1 == 0) goto L_0x01e1
            X.0vl r0 = r0.A01     // Catch:{ 1SC -> 0x03b4 }
            android.content.SharedPreferences$Editor r0 = X.C17890vO.A0A(r0)     // Catch:{ 1SC -> 0x03b4 }
            X.C17880vN.A1E(r0, r9, r1)     // Catch:{ 1SC -> 0x03b4 }
        L_0x01e1:
            java.util.List r1 = r8.A01     // Catch:{ 1SC -> 0x03b4 }
            goto L_0x01e9
        L_0x01e4:
            java.lang.String r0 = "StickerPackNetworkProvider/getPreviewStickerPacksFromStore unable to get preview packs"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ 1SC -> 0x03b4 }
        L_0x01e9:
            if (r1 == 0) goto L_0x0211
            java.util.ArrayList r9 = X.AnonymousClass000.A13()     // Catch:{ 1SC -> 0x03b4 }
            java.util.Iterator r8 = r1.iterator()     // Catch:{ 1SC -> 0x03b4 }
        L_0x01f3:
            boolean r0 = r8.hasNext()     // Catch:{ 1SC -> 0x03b4 }
            if (r0 == 0) goto L_0x020c
            java.lang.Object r1 = r8.next()     // Catch:{ 1SC -> 0x03b4 }
            r0 = r1
            X.725 r0 = (X.AnonymousClass725) r0     // Catch:{ 1SC -> 0x03b4 }
            java.lang.String r0 = r0.A0H     // Catch:{ 1SC -> 0x03b4 }
            boolean r0 = r10.contains(r0)     // Catch:{ 1SC -> 0x03b4 }
            if (r0 != 0) goto L_0x01f3
            r9.add(r1)     // Catch:{ 1SC -> 0x03b4 }
            goto L_0x01f3
        L_0x020c:
            java.util.ArrayList r13 = X.C29431cG.A0m(r9)     // Catch:{ 1SC -> 0x03b4 }
            goto L_0x0212
        L_0x0211:
            r13 = r2
        L_0x0212:
            if (r13 == 0) goto L_0x022a
            java.util.Iterator r1 = r13.iterator()     // Catch:{ 1SC -> 0x03b4 }
        L_0x0218:
            boolean r0 = r1.hasNext()     // Catch:{ 1SC -> 0x03b4 }
            if (r0 == 0) goto L_0x022a
            X.725 r0 = X.C108945cZ.A0y(r1)     // Catch:{ 1SC -> 0x03b4 }
            if (r7 == 0) goto L_0x0218
            java.lang.String r0 = r0.A0H     // Catch:{ 1SC -> 0x03b4 }
            r7.remove(r0)     // Catch:{ 1SC -> 0x03b4 }
            goto L_0x0218
        L_0x022a:
            if (r13 == 0) goto L_0x022f
            r13.size()     // Catch:{ 1SC -> 0x03b4 }
        L_0x022f:
            if (r13 == 0) goto L_0x03b3
            X.72N r9 = X.C108945cZ.A0z(r6)     // Catch:{ 1SC -> 0x03b4 }
            X.C17960vV.A00()     // Catch:{ 1SC -> 0x03b4 }
            X.00H r0 = r9.A04     // Catch:{ 1SC -> 0x03b4 }
            java.lang.Object r8 = r0.get()     // Catch:{ 1SC -> 0x03b4 }
            X.6fB r8 = (X.C127936fB) r8     // Catch:{ 1SC -> 0x03b4 }
            java.util.ArrayList r6 = X.C29351c6.A0D(r13)     // Catch:{ 1SC -> 0x03b4 }
            java.util.Iterator r1 = r13.iterator()     // Catch:{ 1SC -> 0x03b4 }
        L_0x0248:
            boolean r0 = r1.hasNext()     // Catch:{ 1SC -> 0x03b4 }
            if (r0 == 0) goto L_0x025a
            X.725 r0 = X.C108945cZ.A0y(r1)     // Catch:{ 1SC -> 0x03b4 }
            java.lang.String r0 = X.AnonymousClass725.A00(r0)     // Catch:{ 1SC -> 0x03b4 }
            r6.add(r0)     // Catch:{ 1SC -> 0x03b4 }
            goto L_0x0248
        L_0x025a:
            X.0vl r0 = r8.A01     // Catch:{ 1SC -> 0x03b4 }
            android.content.SharedPreferences$Editor r1 = X.C17890vO.A0A(r0)     // Catch:{ 1SC -> 0x03b4 }
            java.lang.String r0 = ","
            java.lang.String r0 = X.C108995ce.A0X(r0, r6)     // Catch:{ 1SC -> 0x03b4 }
            X.C17880vN.A1E(r1, r4, r0)     // Catch:{ 1SC -> 0x03b4 }
            X.00H r0 = r9.A05     // Catch:{ 1SC -> 0x03b4 }
            java.lang.Object r0 = r0.get()     // Catch:{ 1SC -> 0x03b4 }
            X.73Q r0 = (X.AnonymousClass73Q) r0     // Catch:{ 1SC -> 0x03b4 }
            X.00H r0 = r0.A00     // Catch:{ 1SC -> 0x03b4 }
            X.1au r10 = X.C108985cd.A0S(r0)     // Catch:{ 1SC -> 0x03b4 }
            X.1xA r11 = r10.BD0()     // Catch:{ all -> 0x03ac }
            java.util.Iterator r12 = r13.iterator()     // Catch:{ all -> 0x03a5 }
        L_0x027f:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x03a5 }
            if (r0 == 0) goto L_0x029e
            X.725 r1 = X.C108945cZ.A0y(r12)     // Catch:{ all -> 0x03a5 }
            r0 = r10
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x03a5 }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x03a5 }
            X.C18070vi.A0X(r8)     // Catch:{ all -> 0x03a5 }
            android.content.ContentValues r6 = X.AnonymousClass73Q.A00(r1)     // Catch:{ all -> 0x03a5 }
            r4 = 4
            java.lang.String r1 = "insertStickerPackToDownloadableTableIgnoreConflict/INSERT_DOWNLOADABLE_STICKER_PACK"
            java.lang.String r0 = "downloadable_sticker_packs"
            r8.A09(r0, r1, r6, r4)     // Catch:{ all -> 0x03a5 }
            goto L_0x027f
        L_0x029e:
            r11.A00()     // Catch:{ all -> 0x03a5 }
            r11.close()     // Catch:{ all -> 0x03ac }
            r10.close()     // Catch:{ 1SC -> 0x03b4 }
            java.util.Iterator r8 = r13.iterator()     // Catch:{ 1SC -> 0x03b4 }
        L_0x02ab:
            boolean r0 = r8.hasNext()     // Catch:{ 1SC -> 0x03b4 }
            if (r0 == 0) goto L_0x02de
            X.725 r6 = X.C108945cZ.A0y(r8)     // Catch:{ 1SC -> 0x03b4 }
            X.00H r4 = r9.A07     // Catch:{ 1SC -> 0x03b4 }
            java.lang.Object r1 = r4.get()     // Catch:{ 1SC -> 0x03b4 }
            X.6uZ r1 = (X.C136886uZ) r1     // Catch:{ 1SC -> 0x03b4 }
            java.lang.String r0 = X.AnonymousClass725.A00(r6)     // Catch:{ 1SC -> 0x03b4 }
            r1.A00(r0)     // Catch:{ 1SC -> 0x03b4 }
            java.util.List r0 = r6.A07     // Catch:{ 1SC -> 0x03b4 }
            X.C18070vi.A0X(r0)     // Catch:{ 1SC -> 0x03b4 }
            boolean r0 = X.AnonymousClass000.A1a(r0)     // Catch:{ 1SC -> 0x03b4 }
            if (r0 == 0) goto L_0x02ab
            java.lang.Object r1 = r4.get()     // Catch:{ 1SC -> 0x03b4 }
            X.6uZ r1 = (X.C136886uZ) r1     // Catch:{ 1SC -> 0x03b4 }
            java.util.List r0 = r6.A07     // Catch:{ 1SC -> 0x03b4 }
            X.C18070vi.A0X(r0)     // Catch:{ 1SC -> 0x03b4 }
            r1.A04(r0)     // Catch:{ 1SC -> 0x03b4 }
            goto L_0x02ab
        L_0x02de:
            if (r7 == 0) goto L_0x039b
            java.util.ArrayList r6 = X.AnonymousClass000.A13()     // Catch:{ 1SC -> 0x03b4 }
            java.util.Iterator r4 = r7.iterator()     // Catch:{ 1SC -> 0x03b4 }
        L_0x02e8:
            boolean r0 = r4.hasNext()     // Catch:{ 1SC -> 0x03b4 }
            if (r0 == 0) goto L_0x0301
            java.lang.Object r1 = r4.next()     // Catch:{ 1SC -> 0x03b4 }
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ 1SC -> 0x03b4 }
            boolean r0 = X.AnonymousClass1YF.A0T(r0)     // Catch:{ 1SC -> 0x03b4 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x02e8
            r6.add(r1)     // Catch:{ 1SC -> 0x03b4 }
            goto L_0x02e8
        L_0x0301:
            java.util.Iterator r11 = r6.iterator()     // Catch:{ 1SC -> 0x03b4 }
        L_0x0305:
            boolean r0 = r11.hasNext()     // Catch:{ 1SC -> 0x03b4 }
            if (r0 == 0) goto L_0x039b
            java.lang.String r6 = X.C17880vN.A0v(r11)     // Catch:{ 1SC -> 0x03b4 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 1SC -> 0x03b4 }
            java.lang.String r0 = "StickerStoreInventoryManager/fetchDiscoveryStickerPacks removing assets for "
            X.C17900vP.A0f(r0, r6, r1)     // Catch:{ 1SC -> 0x03b4 }
            X.00H r0 = r15.A0A     // Catch:{ 1SC -> 0x03b4 }
            java.lang.Object r8 = r0.get()     // Catch:{ 1SC -> 0x03b4 }
            X.6hZ r8 = (X.C129296hZ) r8     // Catch:{ 1SC -> 0x03b4 }
            java.lang.StringBuilder r1 = X.C18070vi.A0K(r6)     // Catch:{ 1SC -> 0x03b4 }
            java.lang.String r0 = "DiscoveryPackRemover/deleteDiscoveryPack deleting file and stickers for "
            X.C17900vP.A0f(r0, r6, r1)     // Catch:{ 1SC -> 0x03b4 }
            X.00H r7 = r8.A02     // Catch:{ 1SC -> 0x03b4 }
            X.72N r0 = X.C108945cZ.A0z(r7)     // Catch:{ 1SC -> 0x03b4 }
            X.00H r0 = r0.A07     // Catch:{ 1SC -> 0x03b4 }
            java.lang.Object r0 = r0.get()     // Catch:{ 1SC -> 0x03b4 }
            X.6uZ r0 = (X.C136886uZ) r0     // Catch:{ 1SC -> 0x03b4 }
            java.util.ArrayList r0 = r0.A03(r6)     // Catch:{ 1SC -> 0x03b4 }
            r0.size()     // Catch:{ 1SC -> 0x03b4 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ 1SC -> 0x03b4 }
        L_0x0342:
            boolean r0 = r10.hasNext()     // Catch:{ 1SC -> 0x03b4 }
            if (r0 == 0) goto L_0x036f
            X.77d r9 = X.C108945cZ.A0x(r10)     // Catch:{ 1SC -> 0x03b4 }
            java.lang.String r0 = r9.A0B     // Catch:{ 1SC -> 0x03b4 }
            java.lang.String r4 = r9.A0F     // Catch:{ 1SC -> 0x03b4 }
            if (r0 == 0) goto L_0x035b
            if (r4 == 0) goto L_0x035b
            X.1Ns r1 = r8.A00     // Catch:{ 1SC -> 0x03b4 }
            java.lang.String r0 = r9.A0E     // Catch:{ 1SC -> 0x03b4 }
            r1.A07(r4, r0)     // Catch:{ 1SC -> 0x03b4 }
        L_0x035b:
            java.lang.String r1 = r9.A0B     // Catch:{ 1SC -> 0x03b4 }
            if (r1 == 0) goto L_0x0342
            X.0ve r0 = r8.A01     // Catch:{ 1SC -> 0x03b4 }
            boolean r0 = X.C137456vU.A00(r0)     // Catch:{ 1SC -> 0x03b4 }
            if (r0 == 0) goto L_0x0342
            java.io.File r0 = X.C108945cZ.A17(r1)     // Catch:{ 1SC -> 0x03b4 }
            X.C108985cd.A1C(r0)     // Catch:{ 1SC -> 0x03b4 }
            goto L_0x0342
        L_0x036f:
            X.00H r0 = r8.A03     // Catch:{ 1SC -> 0x03b4 }
            java.lang.Object r4 = r0.get()     // Catch:{ 1SC -> 0x03b4 }
            X.6xv r4 = (X.C138926xv) r4     // Catch:{ 1SC -> 0x03b4 }
            java.lang.String r1 = X.C108995ce.A0Z(r6)     // Catch:{ 1SC -> 0x03b4 }
            X.0ve r0 = r8.A01     // Catch:{ 1SC -> 0x03b4 }
            boolean r0 = X.C137456vU.A00(r0)     // Catch:{ 1SC -> 0x03b4 }
            java.io.File r0 = r4.A01(r1, r0)     // Catch:{ 1SC -> 0x03b4 }
            if (r0 == 0) goto L_0x038a
            X.C64062u9.A0Q(r0)     // Catch:{ 1SC -> 0x03b4 }
        L_0x038a:
            X.72N r0 = X.C108945cZ.A0z(r7)     // Catch:{ 1SC -> 0x03b4 }
            X.00H r0 = r0.A07     // Catch:{ 1SC -> 0x03b4 }
            java.lang.Object r0 = r0.get()     // Catch:{ 1SC -> 0x03b4 }
            X.6uZ r0 = (X.C136886uZ) r0     // Catch:{ 1SC -> 0x03b4 }
            r0.A00(r6)     // Catch:{ 1SC -> 0x03b4 }
            goto L_0x0305
        L_0x039b:
            java.lang.Object r0 = r3.get()     // Catch:{ 1SC -> 0x03b4 }
            X.6sw r0 = (X.C135896sw) r0     // Catch:{ 1SC -> 0x03b4 }
            r0.A01(r5)     // Catch:{ 1SC -> 0x03b4 }
            return r13
        L_0x03a5:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x03a7 }
        L_0x03a7:
            r0 = move-exception
            X.CDX.A00(r11, r1)     // Catch:{ all -> 0x03ac }
            throw r0     // Catch:{ all -> 0x03ac }
        L_0x03ac:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x03ae }
        L_0x03ae:
            r0 = move-exception
            X.CDX.A00(r10, r1)     // Catch:{ 1SC -> 0x03b4 }
            throw r0     // Catch:{ 1SC -> 0x03b4 }
        L_0x03b3:
            return r13
        L_0x03b4:
            r1 = move-exception
            java.lang.String r0 = "StickerStoreInventoryManager/fetchDiscoveryStickerPacksWithoutAssets failed"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.Object r0 = r3.get()
            X.6sw r0 = (X.C135896sw) r0
            r0.A00()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139636zC.A01():java.util.ArrayList");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.util.List} */
    /* JADX WARNING: type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0228, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x023e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0242, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0245, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0246, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0249, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01bb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        X.CDX.A00(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01bf, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x021d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        X.CDX.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0221, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0224, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A02() {
        /*
            r16 = this;
            r3 = r16
            X.00H r6 = r3.A0C
            X.72N r0 = X.C108945cZ.A0z(r6)
            X.73Q r4 = X.AnonymousClass72N.A00(r0)
            r2 = 0
            java.lang.String r1 = "getDownloadableStickerPacks/QUERY"
            java.lang.String r0 = "SELECT installed_id, installed_name, installed_size, installed_image_data_hash, installed_publisher, installed_description, installed_tray_image_id, installed_tray_image_preview_id, installed_animated_pack, installed_is_avatar_pack, installed_lottie_pack, installed_pack_type, is_created_by_me, installed_empty_favorites_avatar_template_id, installed_empty_recents_avatar_template_id, id, name, publisher, description, size, tray_image_id, preview_image_id_array, image_data_hash, tray_image_preview_id, animated_pack, lottie_pack FROM downloadable_sticker_packs LEFT JOIN installed_sticker_packs ON (id = installed_id)"
            java.util.ArrayList r15 = X.AnonymousClass73Q.A03(r4, r0, r1, r2)
            X.00H r10 = r3.A0B
            java.lang.Object r0 = r10.get()
            X.6cz r0 = (X.C126596cz) r0
            java.util.LinkedHashSet r4 = X.C17880vN.A14()
            X.00H r0 = r0.A00
            X.1at r5 = X.C108975cc.A0F(r0)
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0243 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0243 }
            java.lang.String r1 = "SELECT pack_id FROM new_sticker_packs"
            java.lang.String r0 = "getNewStickerPackIds/QUERY_NEW_STICKER_PACK"
            android.database.Cursor r2 = X.C23141Ev.A00(r2, r1, r0)     // Catch:{ all -> 0x0243 }
            java.lang.String r9 = "pack_id"
            int r1 = r2.getColumnIndexOrThrow(r9)     // Catch:{ all -> 0x023c }
        L_0x003a:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x023c }
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = r2.getString(r1)     // Catch:{ all -> 0x023c }
            X.C18070vi.A0b(r0)     // Catch:{ all -> 0x023c }
            r4.add(r0)     // Catch:{ all -> 0x023c }
            goto L_0x003a
        L_0x004b:
            r2.close()     // Catch:{ all -> 0x0243 }
            r5.close()
            java.util.Iterator r2 = r15.iterator()
        L_0x0055:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0068
            X.725 r1 = X.C108945cZ.A0y(r2)
            java.lang.String r0 = r1.A0H
            boolean r0 = r4.contains(r0)
            r1.A0A = r0
            goto L_0x0055
        L_0x0068:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "StickerStoreInventoryManager/fetchDownloadableStickerPacks/size of sticker packs from db:"
            r1.append(r0)
            int r0 = r15.size()
            X.C17900vP.A0o(r1, r0)
            X.00H r4 = r3.A0E
            java.lang.Object r0 = r4.get()
            X.6sw r0 = (X.C135896sw) r0
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x023b
            java.util.HashMap r7 = X.C17880vN.A11()     // Catch:{ 1SC -> 0x022c }
            java.util.Iterator r2 = r15.iterator()     // Catch:{ 1SC -> 0x022c }
        L_0x008e:
            boolean r0 = r2.hasNext()     // Catch:{ 1SC -> 0x022c }
            if (r0 == 0) goto L_0x00a0
            X.725 r1 = X.C108945cZ.A0y(r2)     // Catch:{ 1SC -> 0x022c }
            java.lang.String r0 = X.AnonymousClass725.A00(r1)     // Catch:{ 1SC -> 0x022c }
            r7.put(r0, r1)     // Catch:{ 1SC -> 0x022c }
            goto L_0x008e
        L_0x00a0:
            boolean r0 = r15.isEmpty()     // Catch:{ 1SC -> 0x022c }
            r8 = 0
            r13 = r0 ^ 1
            X.00H r0 = r3.A0D     // Catch:{ 1SC -> 0x022c }
            java.lang.Object r5 = r0.get()     // Catch:{ 1SC -> 0x022c }
            X.734 r5 = (X.AnonymousClass734) r5     // Catch:{ 1SC -> 0x022c }
            r3 = 0
            X.11S r0 = r5.A02     // Catch:{ 1SC -> 0x022c }
            r0.A0I()     // Catch:{ 1SC -> 0x022c }
            com.whatsapp.Me r2 = r0.A00     // Catch:{ 1SC -> 0x022c }
            java.lang.StringBuilder r11 = X.AnonymousClass000.A10()     // Catch:{ 1SC -> 0x022c }
            java.lang.String r0 = "https://static.whatsapp.net/sticker?cat=all&lg="
            r11.append(r0)     // Catch:{ 1SC -> 0x022c }
            X.0vb r0 = r5.A07     // Catch:{ 1SC -> 0x022c }
            java.util.Locale r1 = r0.A0N()     // Catch:{ 1SC -> 0x022c }
            java.lang.String[] r0 = X.AnonymousClass1X0.A04     // Catch:{ 1SC -> 0x022c }
            java.lang.String r0 = r1.toLanguageTag()     // Catch:{ 1SC -> 0x022c }
            java.lang.String r12 = X.AnonymousClass000.A0y(r0, r11)     // Catch:{ 1SC -> 0x022c }
            X.0ve r11 = r5.A08     // Catch:{ 1SC -> 0x022c }
            r0 = 5693(0x163d, float:7.978E-42)
            X.0vf r1 = X.C18040vf.A02     // Catch:{ 1SC -> 0x022c }
            boolean r0 = X.C18020vd.A05(r1, r11, r0)     // Catch:{ 1SC -> 0x022c }
            if (r0 == 0) goto L_0x00e8
            r0 = 6785(0x1a81, float:9.508E-42)
            java.lang.String r0 = X.C18020vd.A01(r1, r11, r0)     // Catch:{ 1SC -> 0x022c }
            if (r0 == 0) goto L_0x00e8
            java.lang.String r12 = X.C17900vP.A0A(r12, r0)     // Catch:{ 1SC -> 0x022c }
        L_0x00e8:
            if (r2 == 0) goto L_0x00fb
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r12)     // Catch:{ 1SC -> 0x022c }
            java.lang.String r0 = "&country="
            r1.append(r0)     // Catch:{ 1SC -> 0x022c }
            java.lang.String r0 = X.C108965cb.A0p(r2)     // Catch:{ 1SC -> 0x022c }
            java.lang.String r12 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ 1SC -> 0x022c }
        L_0x00fb:
            X.1Km r0 = r5.A09     // Catch:{ 1SC -> 0x022c }
            java.lang.String r2 = r0.A01(r12)     // Catch:{ 1SC -> 0x022c }
            X.C18070vi.A0X(r2)     // Catch:{ 1SC -> 0x022c }
            if (r13 == 0) goto L_0x0107
            goto L_0x0109
        L_0x0107:
            r0 = r3
            goto L_0x0115
        L_0x0109:
            X.0z4 r0 = r5.A06     // Catch:{ 1SC -> 0x022c }
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)     // Catch:{ 1SC -> 0x022c }
            java.lang.String r0 = "sticker_store_etag"
            java.lang.String r0 = r1.getString(r0, r3)     // Catch:{ 1SC -> 0x022c }
        L_0x0115:
            X.6f8 r3 = X.AnonymousClass734.A00(r3, r5, r2, r0)     // Catch:{ 1SC -> 0x022c }
            if (r3 != 0) goto L_0x011e
            java.lang.Boolean r0 = X.C17970vW.A03     // Catch:{ 1SC -> 0x022c }
            goto L_0x015e
        L_0x011e:
            X.0z4 r0 = r5.A06     // Catch:{ 1SC -> 0x022c }
            java.lang.String r2 = r3.A00     // Catch:{ 1SC -> 0x022c }
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)     // Catch:{ 1SC -> 0x022c }
            java.lang.String r0 = "sticker_store_etag"
            X.C17880vN.A1E(r1, r0, r2)     // Catch:{ 1SC -> 0x022c }
            java.util.List r5 = r3.A01     // Catch:{ 1SC -> 0x022c }
            java.lang.String r3 = "maybeInjectTestStickerPack/failedInjection"
            r0 = 6784(0x1a80, float:9.506E-42)
            org.json.JSONObject r11 = r11.A0J(r0)     // Catch:{ 1SC -> 0x022c }
            java.lang.String r1 = "packs"
            boolean r0 = r11.has(r1)     // Catch:{ 1SC -> 0x022c }
            r2 = 0
            if (r0 == 0) goto L_0x0158
            org.json.JSONArray r0 = r11.getJSONArray(r1)     // Catch:{ IOException | JSONException -> 0x0154 }
            java.lang.String r0 = X.C18070vi.A0H(r0)     // Catch:{ IOException | JSONException -> 0x0154 }
            byte[] r1 = X.C108975cc.A1O(r0)     // Catch:{ IOException | JSONException -> 0x0154 }
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ IOException | JSONException -> 0x0154 }
            r0.<init>(r1)     // Catch:{ IOException | JSONException -> 0x0154 }
            java.util.ArrayList r2 = X.AnonymousClass734.A01(r0)     // Catch:{ IOException | JSONException -> 0x0154 }
            goto L_0x0158
        L_0x0154:
            r0 = move-exception
            com.whatsapp.util.Log.w(r3, r0)     // Catch:{ 1SC -> 0x022c }
        L_0x0158:
            if (r2 == 0) goto L_0x015f
            r5.addAll(r8, r2)     // Catch:{ 1SC -> 0x022c }
            goto L_0x015f
        L_0x015e:
            r5 = 0
        L_0x015f:
            if (r5 == 0) goto L_0x023b
            java.util.Iterator r14 = r5.iterator()     // Catch:{ 1SC -> 0x022c }
        L_0x0165:
            boolean r0 = r14.hasNext()     // Catch:{ 1SC -> 0x022c }
            if (r0 == 0) goto L_0x01c0
            X.725 r12 = X.C108945cZ.A0y(r14)     // Catch:{ 1SC -> 0x022c }
            java.lang.String r1 = X.AnonymousClass725.A00(r12)     // Catch:{ 1SC -> 0x022c }
            boolean r0 = r7.containsKey(r1)     // Catch:{ 1SC -> 0x022c }
            if (r0 == 0) goto L_0x018e
            java.lang.Object r3 = r7.get(r1)     // Catch:{ 1SC -> 0x022c }
            X.725 r3 = (X.AnonymousClass725) r3     // Catch:{ 1SC -> 0x022c }
            if (r3 == 0) goto L_0x0165
            java.lang.String r2 = r3.A03     // Catch:{ 1SC -> 0x022c }
            long r0 = r3.A01     // Catch:{ 1SC -> 0x022c }
            r12.A01 = r0     // Catch:{ 1SC -> 0x022c }
            r12.A03 = r2     // Catch:{ 1SC -> 0x022c }
            boolean r0 = r3.A0A     // Catch:{ 1SC -> 0x022c }
        L_0x018b:
            r12.A0A = r0     // Catch:{ 1SC -> 0x022c }
            goto L_0x0165
        L_0x018e:
            int r0 = r7.size()     // Catch:{ 1SC -> 0x022c }
            if (r0 <= 0) goto L_0x0165
            java.lang.Object r0 = r10.get()     // Catch:{ 1SC -> 0x022c }
            X.6cz r0 = (X.C126596cz) r0     // Catch:{ 1SC -> 0x022c }
            X.00H r0 = r0.A00     // Catch:{ 1SC -> 0x022c }
            X.1au r11 = X.C108985cd.A0S(r0)     // Catch:{ 1SC -> 0x022c }
            android.content.ContentValues r13 = X.C17880vN.A08()     // Catch:{ all -> 0x01b9 }
            r13.put(r9, r1)     // Catch:{ all -> 0x01b9 }
            r0 = r11
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x01b9 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x01b9 }
            java.lang.String r2 = "new_sticker_packs"
            java.lang.String r1 = "markPackAsNew/INSERT_NEW_STICKER_PACK"
            r0 = 5
            r3.A09(r2, r1, r13, r0)     // Catch:{ all -> 0x01b9 }
            r11.close()     // Catch:{ 1SC -> 0x022c }
            r0 = 1
            goto L_0x018b
        L_0x01b9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01bb }
        L_0x01bb:
            r0 = move-exception
            X.CDX.A00(r11, r1)     // Catch:{ 1SC -> 0x022c }
            throw r0     // Catch:{ 1SC -> 0x022c }
        L_0x01c0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 1SC -> 0x0229 }
            java.lang.String r0 = "StickerStoreInventoryManager/fetchDownloadableStickerPacks/size of sticker packs from web:"
            r1.append(r0)     // Catch:{ 1SC -> 0x0229 }
            int r0 = r5.size()     // Catch:{ 1SC -> 0x0229 }
            X.C17900vP.A0o(r1, r0)     // Catch:{ 1SC -> 0x0229 }
            X.72N r0 = X.C108945cZ.A0z(r6)     // Catch:{ 1SC -> 0x0229 }
            X.73Q r0 = X.AnonymousClass72N.A00(r0)     // Catch:{ 1SC -> 0x0229 }
            X.00H r0 = r0.A00     // Catch:{ 1SC -> 0x0229 }
            X.1au r7 = X.C108985cd.A0S(r0)     // Catch:{ 1SC -> 0x0229 }
            X.1xA r9 = r7.BD0()     // Catch:{ all -> 0x0222 }
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x021b }
            X.1Ev r10 = r0.A02     // Catch:{ all -> 0x021b }
            java.lang.String r6 = "downloadable_sticker_packs"
            java.lang.String r1 = "addAllToDownloadable/DELETE_DOWNLOADABLE_STICKER_PACK"
            r0 = 0
            r10.A04(r6, r0, r1, r0)     // Catch:{ all -> 0x021b }
            java.util.Iterator r3 = r5.iterator()     // Catch:{ all -> 0x021b }
        L_0x01f3:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x021b }
            if (r0 == 0) goto L_0x0208
            X.725 r0 = X.C108945cZ.A0y(r3)     // Catch:{ all -> 0x021b }
            android.content.ContentValues r2 = X.AnonymousClass73Q.A00(r0)     // Catch:{ all -> 0x021b }
            r1 = 5
            java.lang.String r0 = "insertStickerPackToDownloadableTable/INSERT_DOWNLOADABLE_STICKER_PACK"
            r10.A09(r6, r0, r2, r1)     // Catch:{ all -> 0x021b }
            goto L_0x01f3
        L_0x0208:
            r9.A00()     // Catch:{ all -> 0x021b }
            r9.close()     // Catch:{ all -> 0x0222 }
            r7.close()     // Catch:{ 1SC -> 0x0229 }
            java.lang.Object r0 = r4.get()     // Catch:{ 1SC -> 0x0229 }
            X.6sw r0 = (X.C135896sw) r0     // Catch:{ 1SC -> 0x0229 }
            r0.A01(r8)     // Catch:{ 1SC -> 0x0229 }
            return r5
        L_0x021b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x021d }
        L_0x021d:
            r0 = move-exception
            X.CDX.A00(r9, r1)     // Catch:{ all -> 0x0222 }
            throw r0     // Catch:{ all -> 0x0222 }
        L_0x0222:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0224 }
        L_0x0224:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ 1SC -> 0x0229 }
            throw r0     // Catch:{ 1SC -> 0x0229 }
        L_0x0229:
            r1 = move-exception
            r15 = r5
            goto L_0x022d
        L_0x022c:
            r1 = move-exception
        L_0x022d:
            java.lang.String r0 = "StickerStoreInventoryManager/fetchDownloadableStickerPacks/getStickerPacksInStoreIfUpdated failed"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.Object r0 = r4.get()
            X.6sw r0 = (X.C135896sw) r0
            r0.A00()
        L_0x023b:
            return r15
        L_0x023c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x023e }
        L_0x023e:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0243 }
            throw r0     // Catch:{ all -> 0x0243 }
        L_0x0243:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0245 }
        L_0x0245:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139636zC.A02():java.util.List");
    }

    public C139636zC(AnonymousClass11P r1, C19830z4 r2, C18030ve r3, AnonymousClass10I r4, AnonymousClass19K r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14, AnonymousClass00H r15) {
        C18070vi.A0w(r1, r3, r4, r6, r5);
        C18070vi.A0x(r7, r2, r8, r9, r10);
        C18070vi.A0y(r11, r12, r13, r14, r15);
        this.A09 = r1;
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = r6;
        this.A03 = r5;
        this.A0C = r7;
        this.A00 = r2;
        this.A06 = r8;
        this.A08 = r9;
        this.A0A = r10;
        this.A0B = r11;
        this.A0D = r12;
        this.A0E = r13;
        this.A07 = r14;
        this.A05 = r15;
    }
}
