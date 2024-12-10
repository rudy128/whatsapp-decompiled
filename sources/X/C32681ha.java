package X;

import com.whatsapp.util.Log;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1ha  reason: invalid class name and case insensitive filesystem */
public class C32681ha {
    public final AnonymousClass11P A00;
    public final C32641hW A01;
    public final C26421Sb A02;
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    public final C19830z4 A04;
    public final AnonymousClass1Q8 A05;
    public final C18030ve A06;
    public final C32661hY A07;
    public final AnonymousClass10I A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;

    public static void A00(C32681ha r1, AnonymousClass206 r2) {
        if (C22971Dz.A0a(r2.A0v.A00)) {
            ((C134116q4) r1.A0B.get()).A00(r2);
        } else {
            r1.A07.A01(r2, 1);
        }
    }

    public static void A01(C32681ha r11, LinkedList linkedList, Random random) {
        int size;
        C56202h4 A032;
        StringBuilder sb = new StringBuilder();
        sb.append("ThumbnailAutoDownload/enqueueThumbnailAutodownloadsToRetry num remaining:");
        sb.append(linkedList.size());
        Log.i(sb.toString());
        int i = 0;
        while (!linkedList.isEmpty()) {
            C26461Sf r2 = (C26461Sf) r11.A07.A0F.get();
            synchronized (r2) {
                size = r2.A01.size();
            }
            if (i >= 20 || size - i > 5) {
                linkedList.size();
                r11.A08.CGv(new AnonymousClass7R0(r11, linkedList, random, 24), (long) (random.nextInt(5000) + 5000));
                return;
            }
            AnonymousClass206 A033 = ((AnonymousClass1W6) r11.A09.get()).A01.A03(((Number) linkedList.pop()).longValue());
            if (A033 != null && !A033.A0v.A02 && A02(r11, A033)) {
                if (A033 instanceof AnonymousClass21V) {
                    C62572rc r0 = ((AnonymousClass21V) A033).A02;
                    C17960vV.A07(r0);
                    String str = r0.A0L;
                    if (!(str == null || (A032 = r11.A02.A0I.A03(str, 3)) == null)) {
                        long A012 = AnonymousClass11P.A01(r11.A00);
                        long j = A032.A06;
                        long j2 = A012 - j;
                        if (j2 < 86400000 && j2 < (j - A032.A0C) * 2) {
                        }
                    }
                }
                A00(r11, A033);
                i++;
            }
        }
        r11.A03.set(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (r1.A17().A05() != false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        if ((r7 instanceof X.AnonymousClass21Y) != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0085, code lost:
        if (X.C18020vd.A05(r2, r1, r0) != false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00da, code lost:
        if (X.C50372Ue.A00(r1, r7) == null) goto L_0x00de;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A02(X.C32681ha r6, X.AnonymousClass206 r7) {
        /*
            X.205 r0 = r7.A0v
            X.1BI r0 = r0.A00
            boolean r0 = X.C22971Dz.A0a(r0)
            r5 = 1
            r2 = 0
            if (r0 == 0) goto L_0x00b7
            X.36w r0 = X.C60502o8.A00(r7)
            if (r0 != 0) goto L_0x002f
            boolean r0 = X.C22971Dz.A0g(r7)
            if (r0 == 0) goto L_0x00de
            boolean r0 = r7 instanceof X.C438421d
            if (r0 == 0) goto L_0x00de
            r1 = r7
            X.21V r1 = (X.AnonymousClass21V) r1
            X.36v r0 = r1.A17()
            if (r0 == 0) goto L_0x00de
            X.36v r0 = r1.A17()
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x00de
        L_0x002f:
            X.0ve r3 = r6.A06
            r0 = 250(0xfa, float:3.5E-43)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r3, r0)
            if (r0 == 0) goto L_0x003f
            boolean r0 = r7 instanceof X.C438921i
            if (r0 != 0) goto L_0x0087
        L_0x003f:
            X.11P r1 = r6.A00
            X.0z4 r0 = r6.A04
            boolean r0 = X.C50282Tv.A00(r1, r0, r3, r7)
            if (r0 != 0) goto L_0x0087
            X.1hY r3 = r6.A07
            boolean r4 = r7 instanceof X.C438421d
            if (r4 != 0) goto L_0x0054
            boolean r0 = r7 instanceof X.AnonymousClass21Y
            r1 = 0
            if (r0 == 0) goto L_0x0055
        L_0x0054:
            r1 = 1
        L_0x0055:
            boolean r0 = r7.A0w()
            if (r0 == 0) goto L_0x00a9
            X.36w r0 = X.C60502o8.A00(r7)
            if (r0 == 0) goto L_0x00a9
            if (r1 == 0) goto L_0x00a9
            if (r4 == 0) goto L_0x0088
            X.00H r0 = r3.A0C
            java.lang.Object r0 = r0.get()
            X.CYy r0 = (X.C25125CYy) r0
            int r0 = r0.A00()
            r0 = r0 & 1
            if (r0 != 0) goto L_0x00a9
            X.00H r0 = r3.A0D
            java.lang.Object r0 = r0.get()
            X.1c4 r0 = (X.AnonymousClass1c4) r0
            X.0ve r1 = r0.A02
            r0 = 11693(0x2dad, float:1.6385E-41)
        L_0x0081:
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x00a9
        L_0x0087:
            return r5
        L_0x0088:
            boolean r0 = r7 instanceof X.AnonymousClass21Y
            if (r0 == 0) goto L_0x00a9
            X.00H r0 = r3.A0C
            java.lang.Object r0 = r0.get()
            X.CYy r0 = (X.C25125CYy) r0
            int r0 = r0.A00()
            r0 = r0 & 1
            if (r0 != 0) goto L_0x00a9
            X.00H r0 = r3.A0D
            java.lang.Object r0 = r0.get()
            X.1c4 r0 = (X.AnonymousClass1c4) r0
            X.0ve r1 = r0.A02
            r0 = 11694(0x2dae, float:1.6387E-41)
            goto L_0x0081
        L_0x00a9:
            boolean r0 = r7 instanceof X.AnonymousClass210
            if (r0 == 0) goto L_0x00b1
            boolean r0 = r7 instanceof X.AnonymousClass216
            if (r0 == 0) goto L_0x0087
        L_0x00b1:
            boolean r0 = r7 instanceof X.C441522i
            if (r0 != 0) goto L_0x0087
            r5 = 0
            return r5
        L_0x00b7:
            X.00H r0 = r6.A0A
            java.lang.Object r1 = r0.get()
            X.2tH r1 = (X.C63542tH) r1
            boolean r0 = X.C63542tH.A00(r1, r7)
            if (r0 == 0) goto L_0x00cb
            boolean r0 = X.C63542tH.A01(r1, r7, r2)
            if (r0 != 0) goto L_0x0087
        L_0x00cb:
            X.0ve r1 = r6.A06
            X.C18070vi.A0d(r1, r2)
            X.36w r0 = X.C60502o8.A00(r7)
            if (r0 != 0) goto L_0x002f
            X.36w r0 = X.C50372Ue.A00(r1, r7)
            if (r0 == 0) goto L_0x00de
            goto L_0x002f
        L_0x00de:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32681ha.A02(X.1ha, X.206):boolean");
    }

    public C32681ha(AnonymousClass11P r3, C19830z4 r4, C32641hW r5, AnonymousClass1Q8 r6, C18030ve r7, C26421Sb r8, C32661hY r9, AnonymousClass10I r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13) {
        this.A00 = r3;
        this.A06 = r7;
        this.A08 = r10;
        this.A02 = r8;
        this.A09 = r11;
        this.A05 = r6;
        this.A04 = r4;
        this.A07 = r9;
        this.A0B = r12;
        this.A01 = r5;
        this.A0A = r13;
    }
}
