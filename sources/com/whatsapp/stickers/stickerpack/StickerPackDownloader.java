package com.whatsapp.stickers.stickerpack;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10I;
import X.AnonymousClass167;
import X.AnonymousClass19T;
import X.AnonymousClass1SA;
import X.AnonymousClass2LK;
import X.AnonymousClass3Ma;
import X.AnonymousClass6MZ;
import X.AnonymousClass725;
import X.AnonymousClass7KY;
import X.AnonymousClass88A;
import X.C125066aR;
import X.C130616jj;
import X.C136816uS;
import X.C136936ue;
import X.C17880vN;
import X.C18030ve;
import X.C18070vi;
import X.C18600wl;
import X.C217517g;
import X.C25311Ns;
import X.C72483Me;
import com.whatsapp.util.Log;

public final class StickerPackDownloader {
    public final C25311Ns A00;
    public final C18030ve A01;
    public final AnonymousClass19T A02;
    public final C136816uS A03;
    public final C130616jj A04;
    public final AnonymousClass1SA A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final C18600wl A0E;
    public final C125066aR A0F;
    public final AnonymousClass10I A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I = C217517g.A00(32801);

    public final void A02(AnonymousClass725 r20, AnonymousClass88A r21, Integer num, Integer num2, Integer num3, Integer num4, boolean z) {
        AnonymousClass725 r11 = r20;
        String A002 = AnonymousClass725.A00(r11);
        AnonymousClass00H r5 = this.A0I;
        if (((AnonymousClass167) r5.get()).A01.containsKey(A002)) {
            Log.e("StickerPackDownloader/downloadStickersOfAStickerPackAsync attempting to download same pack twice");
            return;
        }
        AnonymousClass10E r1 = this.A0F.A00.A00;
        AnonymousClass6MZ r6 = new AnonymousClass6MZ(AnonymousClass10E.A8r(r1), AnonymousClass3Ma.A0g(r1), (C136936ue) r1.A0V.get(), (AnonymousClass2LK) r1.AAP.get(), r11, r21, (StickerPackDownloader) r1.AAQ.get(), num, num2, num3, num4, z);
        AnonymousClass167 r12 = (AnonymousClass167) r5.get();
        C17880vN.A1P(A002, r12.A01, 0);
        r12.A00.put(A002, r6);
        AnonymousClass7KY.A00(C17880vN.A0V(this.A0H), r11, 21);
        this.A0G.CGD(r6, r20);
    }

    public final void A03(String str, String str2) {
        AnonymousClass6MZ r1;
        C18070vi.A0d(str, 0);
        AnonymousClass00H r12 = this.A0I;
        if (((AnonymousClass167) r12.get()).A01.containsKey(str) && (r1 = (AnonymousClass6MZ) ((AnonymousClass167) r12.get()).A00.get(str)) != null) {
            if (str2 != null) {
                r1.A00 = str2;
            }
            r1.A0B(true);
        }
    }

    public StickerPackDownloader(C125066aR r20, C25311Ns r21, C18030ve r22, AnonymousClass19T r23, C136816uS r24, C130616jj r25, AnonymousClass1SA r26, AnonymousClass10I r27, AnonymousClass00H r28, AnonymousClass00H r29, AnonymousClass00H r30, AnonymousClass00H r31, AnonymousClass00H r32, AnonymousClass00H r33, AnonymousClass00H r34, AnonymousClass00H r35, AnonymousClass00H r36, C18600wl r37) {
        AnonymousClass00H r10 = r29;
        AnonymousClass00H r9 = r30;
        AnonymousClass10I r12 = r27;
        AnonymousClass00H r11 = r28;
        C18030ve r16 = r22;
        C18070vi.A0w(r16, r12, r11, r10, r9);
        AnonymousClass00H r6 = r33;
        AnonymousClass00H r8 = r31;
        AnonymousClass00H r7 = r32;
        C130616jj r13 = r25;
        AnonymousClass19T r15 = r23;
        C18070vi.A0x(r8, r13, r15, r7, r6);
        AnonymousClass00H r5 = r34;
        AnonymousClass00H r4 = r35;
        AnonymousClass00H r3 = r36;
        C25311Ns r17 = r21;
        C72483Me.A17(r5, r17, r4, r3, 11);
        C18600wl r2 = r37;
        C136816uS r14 = r24;
        C18070vi.A0m(r14, r2);
        C125066aR r18 = r20;
        C18070vi.A0d(r18, 18);
        this.A01 = r16;
        this.A0G = r12;
        this.A0H = r11;
        this.A08 = r10;
        this.A09 = r9;
        this.A0C = r8;
        this.A04 = r13;
        this.A02 = r15;
        this.A0D = r7;
        this.A07 = r6;
        this.A0A = r5;
        this.A05 = r26;
        this.A00 = r17;
        this.A0B = r4;
        this.A06 = r3;
        this.A03 = r14;
        this.A0E = r2;
        this.A0F = r18;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        if (X.C25291Nq.A04(r2, 12817) == false) goto L_0x004d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009a A[Catch:{ all -> 0x00f7 }, LOOP:1: B:30:0x0094->B:32:0x009a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b5 A[Catch:{ all -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x008c A[EDGE_INSN: B:59:0x008c->B:29:0x008c ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.AnonymousClass725 r14, X.C1597785v r15, com.whatsapp.stickers.stickerpack.StickerPackDownloader r16, X.C30391dr r17, X.C18090vk r18, X.AnonymousClass1OX r19) {
        /*
            r3 = r17
            boolean r0 = r3 instanceof X.AnonymousClass7TY
            r9 = r16
            if (r0 == 0) goto L_0x0022
            r5 = r3
            X.7TY r5 = (X.AnonymousClass7TY) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0022
            int r2 = r2 - r1
            r5.label = r2
        L_0x0016:
            java.lang.Object r6 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x002d
            if (r0 != r3) goto L_0x0028
            goto L_0x007d
        L_0x0022:
            X.7TY r5 = new X.7TY
            r5.<init>(r9, r3)
            goto L_0x0016
        L_0x0028:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x002d:
            X.C30691eM.A01(r6)
            java.lang.String r6 = X.AnonymousClass725.A00(r14)
            X.0ve r2 = r9.A01
            r1 = 12188(0x2f9c, float:1.7079E-41)
            X.0vf r0 = X.C18040vf.A02
            java.lang.String r0 = X.C18020vd.A01(r0, r2, r1)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x004d
            r0 = 12817(0x3211, float:1.796E-41)
            boolean r0 = X.C25291Nq.A04(r2, r0)
            r13 = 1
            if (r0 != 0) goto L_0x004e
        L_0x004d:
            r13 = 0
        L_0x004e:
            java.util.List r0 = r14.A07
            X.C18070vi.A0X(r0)
            java.util.ArrayList r2 = X.C29351c6.A0E(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x005b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0074
            X.77d r7 = X.C108945cZ.A0x(r1)
            r10 = 0
            com.whatsapp.stickers.stickerpack.StickerPackDownloader$executeStickerDownloadInParallel$deferredDownloads$1$1 r6 = new com.whatsapp.stickers.stickerpack.StickerPackDownloader$executeStickerDownloadInParallel$deferredDownloads$1$1
            r8 = r15
            r11 = r18
            r12 = r19
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            X.C108985cd.A1P(r2, r6, r12)
            goto L_0x005b
        L_0x0074:
            r5.label = r3     // Catch:{ all -> 0x00f7 }
            java.lang.Object r6 = X.C197009w0.A00(r2, r5)     // Catch:{ all -> 0x00f7 }
            if (r6 != r4) goto L_0x0080
            return r4
        L_0x007d:
            X.C30691eM.A01(r6)     // Catch:{ all -> 0x00f7 }
        L_0x0080:
            java.util.List r6 = (java.util.List) r6     // Catch:{ all -> 0x00f7 }
            boolean r0 = r6 instanceof java.util.Collection     // Catch:{ all -> 0x00f7 }
            if (r0 == 0) goto L_0x00ab
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x00f7 }
            if (r0 == 0) goto L_0x00ab
        L_0x008c:
            java.util.ArrayList r2 = X.C29351c6.A0E(r6)     // Catch:{ all -> 0x00f7 }
            java.util.Iterator r1 = r6.iterator()     // Catch:{ all -> 0x00f7 }
        L_0x0094:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00f7 }
            if (r0 == 0) goto L_0x00e9
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00f7 }
            X.1eK r0 = (X.C30671eK) r0     // Catch:{ all -> 0x00f7 }
            java.lang.Object r0 = r0.value     // Catch:{ all -> 0x00f7 }
            X.C30691eM.A01(r0)     // Catch:{ all -> 0x00f7 }
            X.77d r0 = (X.C1418377d) r0     // Catch:{ all -> 0x00f7 }
            r2.add(r0)     // Catch:{ all -> 0x00f7 }
            goto L_0x0094
        L_0x00ab:
            java.util.Iterator r1 = r6.iterator()     // Catch:{ all -> 0x00f7 }
        L_0x00af:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00f7 }
            if (r0 == 0) goto L_0x008c
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00f7 }
            X.1eK r0 = (X.C30671eK) r0     // Catch:{ all -> 0x00f7 }
            java.lang.Object r0 = r0.value     // Catch:{ all -> 0x00f7 }
            boolean r0 = r0 instanceof X.AnonymousClass1IU     // Catch:{ all -> 0x00f7 }
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x00af
            java.util.Iterator r2 = r6.iterator()     // Catch:{ all -> 0x00f7 }
        L_0x00c7:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00f7 }
            if (r0 == 0) goto L_0x00ef
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x00f7 }
            X.1eK r0 = (X.C30671eK) r0     // Catch:{ all -> 0x00f7 }
            java.lang.Object r1 = r0.value     // Catch:{ all -> 0x00f7 }
            boolean r0 = r1 instanceof X.AnonymousClass1IU     // Catch:{ all -> 0x00f7 }
            if (r0 == 0) goto L_0x00c7
            java.lang.Throwable r0 = X.C30671eK.A00(r1)     // Catch:{ all -> 0x00f7 }
            if (r0 != 0) goto L_0x00e5
            java.lang.String r0 = "Unknown error"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x00f7 }
        L_0x00e5:
            X.1IU r2 = X.C108945cZ.A1J(r0)     // Catch:{ all -> 0x00f7 }
        L_0x00e9:
            X.1eK r1 = new X.1eK     // Catch:{ all -> 0x00f7 }
            r1.<init>(r2)     // Catch:{ all -> 0x00f7 }
            goto L_0x00fc
        L_0x00ef:
            java.lang.String r1 = "Collection contains no element matching the predicate."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x00f7 }
            r0.<init>(r1)     // Catch:{ all -> 0x00f7 }
            throw r0     // Catch:{ all -> 0x00f7 }
        L_0x00f7:
            r0 = move-exception
            X.1IU r1 = X.C108945cZ.A1J(r0)
        L_0x00fc:
            java.lang.Throwable r0 = X.C30671eK.A00(r1)
            if (r0 == 0) goto L_0x010b
            X.1IU r0 = X.C108945cZ.A1J(r0)
            X.1eK r1 = new X.1eK
            r1.<init>(r0)
        L_0x010b:
            X.1eK r1 = (X.C30671eK) r1
            java.lang.Object r0 = r1.value
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.stickerpack.StickerPackDownloader.A00(X.725, X.85v, com.whatsapp.stickers.stickerpack.StickerPackDownloader, X.1dr, X.0vk, X.1OX):java.lang.Object");
    }

    public static final void A01(StickerPackDownloader stickerPackDownloader, Integer num, Integer num2, String str) {
        if (num != null && num2 != null) {
            stickerPackDownloader.A02.markerPoint(num.intValue(), num2.intValue(), str);
        }
    }
}
