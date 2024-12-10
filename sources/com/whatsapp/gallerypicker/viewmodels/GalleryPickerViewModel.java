package com.whatsapp.gallerypicker.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass118;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1OB;
import X.AnonymousClass1Q5;
import X.AnonymousClass3MW;
import X.AnonymousClass7AT;
import X.AnonymousClass7S3;
import X.AnonymousClass7SB;
import X.AnonymousClass8B2;
import X.C108945cZ;
import X.C108965cb;
import X.C108995ce;
import X.C1188265k;
import X.C122446Qh;
import X.C129026h8;
import X.C137776w0;
import X.C139226yS;
import X.C17880vN;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C18600wl;
import X.C200610r;
import X.C22801Dg;
import X.C27621Wu;
import X.C30391dr;
import X.C31191fA;
import X.C35911n2;
import X.C35921n3;
import android.os.SystemClock;
import com.whatsapp.media.WamediaManager;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

public final class GalleryPickerViewModel extends AnonymousClass1J2 {
    public AnonymousClass1OB A00;
    public AnonymousClass1OB A01;
    public BucketsCollector A02;
    public final C22801Dg A03;
    public final C22801Dg A04;
    public final AnonymousClass1DT A05;
    public final AnonymousClass1DT A06;
    public final AnonymousClass1DT A07 = C108945cZ.A0S();
    public final AnonymousClass1DT A08;
    public final AnonymousClass1DT A09;
    public final AnonymousClass11P A0A;
    public final AnonymousClass118 A0B;
    public final C18030ve A0C;
    public final AnonymousClass00H A0D;
    public final C18100vl A0E;
    public final C18100vl A0F = AnonymousClass7S3.A00(this, 28);
    public final C18600wl A0G;
    public final C18600wl A0H;
    public final C35911n2 A0I;
    public final C31191fA A0J;
    public final AnonymousClass11C A0K;
    public final C18000vb A0L;
    public final WamediaManager A0M;
    public final AnonymousClass1Q5 A0N;
    public final C35911n2 A0O;

    public class BucketsCollector {
        public int A00;
        public long A01 = SystemClock.uptimeMillis();
        public final List A02 = AnonymousClass000.A13();
        public final int A03;
        public final long A04;
        public final C122446Qh A05;
        public final /* synthetic */ GalleryPickerViewModel A06;

        public BucketsCollector(C122446Qh r3, GalleryPickerViewModel galleryPickerViewModel, int i, long j) {
            this.A06 = galleryPickerViewModel;
            this.A03 = i;
            this.A05 = r3;
            this.A04 = j;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ java.lang.Object A00(X.C139226yS r10, com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector r11, X.C30391dr r12) {
            /*
                boolean r0 = r12 instanceof X.AnonymousClass7U1
                if (r0 == 0) goto L_0x00a0
                r7 = r12
                X.7U1 r7 = (X.AnonymousClass7U1) r7
                int r2 = r7.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L_0x00a0
                int r2 = r2 - r1
                r7.label = r2
            L_0x0012:
                java.lang.Object r1 = r7.result
                X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
                int r0 = r7.label
                r9 = 2
                r8 = 1
                if (r0 == 0) goto L_0x003e
                if (r0 == r8) goto L_0x0036
                if (r0 != r9) goto L_0x00a7
                java.lang.Object r11 = r7.L$0
                com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector r11 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector) r11
                X.C30691eM.A01(r1)
            L_0x0027:
                long r0 = android.os.SystemClock.uptimeMillis()
                r11.A01 = r0
            L_0x002d:
                int r0 = r11.A00
                int r0 = r0 + 1
                r11.A00 = r0
                X.1Wu r0 = X.C27621Wu.A00
                return r0
            L_0x0036:
                java.lang.Object r11 = r7.L$0
                com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector r11 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector) r11
                X.C30691eM.A01(r1)
                goto L_0x002d
            L_0x003e:
                X.C30691eM.A01(r1)
                int r1 = r11.A00
                int r0 = r11.A03
                if (r1 < r0) goto L_0x0081
                long r0 = r11.A04
                r3 = 0
                int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r2 == 0) goto L_0x0081
                java.util.List r8 = r11.A02
                r8.add(r10)
                long r3 = r11.A01
                long r3 = r3 + r0
                com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r5 = r11.A06
                long r1 = android.os.SystemClock.uptimeMillis()
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 >= 0) goto L_0x002d
                java.util.ArrayList r4 = X.C17880vN.A10(r8)
                r8.clear()
                X.6Qh r3 = r11.A05
                r7.L$0 = r11
                r7.label = r9
                X.0wl r2 = r5.A0H
                r1 = 0
                com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$notifyFolderAdded$2 r0 = new com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$notifyFolderAdded$2
                r0.<init>(r3, r5, r4, r1)
                java.lang.Object r0 = X.C30451dy.A00(r7, r2, r0)
                java.lang.Object r0 = X.AnonymousClass3MX.A13(r0)
                if (r0 != r6) goto L_0x0027
                return r6
            L_0x0081:
                com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r5 = r11.A06
                java.util.List r4 = X.C18070vi.A0M(r10)
                X.6Qh r3 = r11.A05
                r7.L$0 = r11
                r7.label = r8
                X.0wl r2 = r5.A0H
                r1 = 0
                com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$notifyFolderAdded$2 r0 = new com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$notifyFolderAdded$2
                r0.<init>(r3, r5, r4, r1)
                java.lang.Object r0 = X.C30451dy.A00(r7, r2, r0)
                java.lang.Object r0 = X.AnonymousClass3MX.A13(r0)
                if (r0 != r6) goto L_0x002d
                return r6
            L_0x00a0:
                X.7U1 r7 = new X.7U1
                r7.<init>(r11, r12)
                goto L_0x0012
            L_0x00a7:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector.A00(X.6yS, com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector, X.1dr):java.lang.Object");
        }

        public Object A01(C139226yS r2, C30391dr r3) {
            if (!(this instanceof C1188265k)) {
                return A00(r2, this, r3);
            }
            this.A02.add(r2);
            return C27621Wu.A00;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A0A(com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector r12, com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r13, X.C30391dr r14, int r15, boolean r16, boolean r17) {
        /*
            r4 = r14
            r11 = r13
            r10 = r12
            r14 = r15
            r15 = r16
            boolean r0 = r4 instanceof X.AnonymousClass7VB
            if (r0 == 0) goto L_0x003f
            r2 = r4
            X.7VB r2 = (X.AnonymousClass7VB) r2
            int r3 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x003f
            int r3 = r3 - r1
            r2.label = r3
        L_0x0018:
            java.lang.Object r7 = r2.result
            X.1g4 r1 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r2.label
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L_0x004e
            if (r0 == r5) goto L_0x00b3
            if (r0 != r6) goto L_0x0049
            int r5 = r2.I$2
            int r4 = r2.I$1
            boolean r15 = r2.Z$0
            int r14 = r2.I$0
            java.lang.Object r3 = r2.L$3
            X.6h8[] r3 = (X.C129026h8[]) r3
            java.lang.Object r12 = r2.L$2
            java.util.Map r12 = (java.util.Map) r12
            java.lang.Object r10 = r2.L$1
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector r10 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector) r10
            java.lang.Object r11 = r2.L$0
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r11 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel) r11
            goto L_0x0045
        L_0x003f:
            X.7VB r2 = new X.7VB
            r2.<init>(r13, r4)
            goto L_0x0018
        L_0x0045:
            X.C30691eM.A01(r7)     // Catch:{ all -> 0x00ab }
            goto L_0x00af
        L_0x0049:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x004e:
            X.C30691eM.A01(r7)
            if (r16 == 0) goto L_0x0079
            X.6h8[] r3 = X.C137776w0.A05
        L_0x0055:
            java.util.HashMap r12 = X.C17880vN.A11()
            if (r17 == 0) goto L_0x008b
            int r7 = r3.length
            java.util.ArrayList r6 = X.C17880vN.A0z(r7)
            r4 = 0
        L_0x0061:
            if (r4 >= r7) goto L_0x0082
            r9 = r3[r4]
            X.0vl r0 = r11.A0F
            java.lang.Object r0 = r0.getValue()
            X.1OX r0 = (X.AnonymousClass1OX) r0
            r13 = 0
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$checkDefaultMediaBuckets$2$1 r8 = new com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$checkDefaultMediaBuckets$2$1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            X.C108985cd.A1P(r6, r8, r0)
            int r4 = r4 + 1
            goto L_0x0061
        L_0x0079:
            r0 = 7
            if (r14 != r0) goto L_0x007f
            X.6h8[] r3 = X.C137776w0.A04
            goto L_0x0055
        L_0x007f:
            X.6h8[] r3 = X.C137776w0.A03
            goto L_0x0055
        L_0x0082:
            r2.label = r5
            java.lang.Object r0 = X.C197009w0.A00(r6, r2)
            if (r0 != r1) goto L_0x00b6
            return r1
        L_0x008b:
            int r5 = r3.length
            r4 = 0
        L_0x008d:
            if (r4 >= r5) goto L_0x00b6
            r9 = r3[r4]
            r2.L$0 = r11     // Catch:{ all -> 0x00ab }
            r2.L$1 = r10     // Catch:{ all -> 0x00ab }
            r2.L$2 = r12     // Catch:{ all -> 0x00ab }
            r2.L$3 = r3     // Catch:{ all -> 0x00ab }
            r2.I$0 = r14     // Catch:{ all -> 0x00ab }
            r2.Z$0 = r15     // Catch:{ all -> 0x00ab }
            r2.I$1 = r4     // Catch:{ all -> 0x00ab }
            r2.I$2 = r5     // Catch:{ all -> 0x00ab }
            r2.label = r6     // Catch:{ all -> 0x00ab }
            r13 = r2
            java.lang.Object r0 = A05(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x00ab }
            if (r0 != r1) goto L_0x00af
            goto L_0x00b2
        L_0x00ab:
            r0 = move-exception
            X.C30691eM.A00(r0)
        L_0x00af:
            int r4 = r4 + 1
            goto L_0x008d
        L_0x00b2:
            return r1
        L_0x00b3:
            X.C30691eM.A01(r7)
        L_0x00b6:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.A0A(com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector, com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel, X.1dr, int, boolean, boolean):java.lang.Object");
    }

    public GalleryPickerViewModel(C31191fA r16, AnonymousClass11C r17, AnonymousClass11P r18, AnonymousClass118 r19, C18000vb r20, C18030ve r21, WamediaManager wamediaManager, AnonymousClass1Q5 r23, AnonymousClass00H r24, C18600wl r25, C18600wl r26) {
        AnonymousClass11P r11 = r18;
        C18030ve r8 = r21;
        C18070vi.A0j(r11, r8);
        AnonymousClass118 r10 = r19;
        AnonymousClass00H r3 = r24;
        C18070vi.A0f(r10, 3, r3);
        WamediaManager wamediaManager2 = wamediaManager;
        C18070vi.A0d(wamediaManager2, 5);
        C31191fA r13 = r16;
        AnonymousClass11C r12 = r17;
        C18000vb r9 = r20;
        AnonymousClass1Q5 r5 = r23;
        C18600wl r2 = r25;
        C18070vi.A0x(r9, r12, r13, r5, r2);
        C18600wl r1 = r26;
        C18070vi.A0d(r1, 11);
        this.A0A = r11;
        this.A0C = r8;
        this.A0B = r10;
        this.A0D = r3;
        this.A0M = wamediaManager2;
        this.A0L = r9;
        this.A0K = r12;
        this.A0J = r13;
        this.A0N = r5;
        this.A0G = r2;
        this.A0H = r1;
        C129026h8[] r32 = C137776w0.A05;
        int A032 = C200610r.A03(5);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A032 < 16 ? 16 : A032);
        int i = 0;
        do {
            C129026h8 r14 = r32[i];
            C17880vN.A1O(r14, linkedHashMap, r14.A02);
            i++;
        } while (i < 5);
        LinkedHashMap A0b = C108995ce.A0b(linkedHashMap);
        Iterator A15 = AnonymousClass000.A15(linkedHashMap);
        while (true) {
            C139226yS r7 = null;
            if (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                Object key = A16.getKey();
                if (((C129026h8) A16.getValue()).A02 == 3) {
                    r7 = new C139226yS((AnonymousClass8B2) null, ((C129026h8) A16.getValue()).A03, C18070vi.A0F(this.A0B.A00, ((C129026h8) A16.getValue()).A01), ((C129026h8) A16.getValue()).A02, ((C129026h8) A16.getValue()).A00, -1, false);
                }
                A0b.put(key, r7);
            } else {
                AnonymousClass1DT A0M2 = AnonymousClass3MW.A0M(A0b);
                this.A06 = A0M2;
                C22801Dg A0R = C108945cZ.A0R();
                this.A03 = A0R;
                this.A05 = C108945cZ.A0S();
                this.A08 = C108945cZ.A0S();
                C22801Dg A0R2 = C108945cZ.A0R();
                this.A04 = A0R2;
                this.A0E = AnonymousClass7S3.A00(this, 29);
                this.A0O = new C35921n3();
                this.A0I = new C35921n3();
                this.A09 = C108965cb.A0D(-1);
                AnonymousClass7AT.A02(this.A08, A0R2, AnonymousClass7SB.A00(this, 15), 36);
                AnonymousClass7AT.A02(A0M2, A0R, AnonymousClass7SB.A00(this, 16), 36);
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003b, code lost:
        if (X.AnonymousClass000.A1Y(r5) != false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        return X.C27621Wu.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        if (r15 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        if (r4.moveToNext() == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        r7 = com.whatsapp.jid.Jid.Companion.A02(r4.getString(0));
        r16 = r4.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
        if ((r7 instanceof X.AnonymousClass1BI) == false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005f, code lost:
        r6 = r14.A0J;
        r5 = (X.AnonymousClass1BI) r7;
        X.C18070vi.A0d(r5, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006e, code lost:
        if (r6.A05.A0S(r5) != false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        r10 = X.C22971Dz.A06(r7);
        r5 = new X.AnonymousClass65c(r14.A0K, r14.A0C, r14.A0M, r14.A0N, r10, r11);
        r3.L$0 = r14;
        r3.L$1 = r4;
        r3.L$2 = r13;
        r3.I$0 = r11;
        r3.label = 1;
        r5 = A04(r5, r13, r14, r10, r16, r3, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0095, code lost:
        if (r5 != r2) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0097, code lost:
        return r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(android.database.Cursor r15, com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector r16, com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r17, X.C30391dr r18, int r19) {
        /*
            r5 = r18
            r14 = r17
            r4 = r15
            r13 = r16
            r11 = r19
            boolean r0 = r5 instanceof X.AnonymousClass7V0
            if (r0 == 0) goto L_0x0098
            r3 = r5
            X.7V0 r3 = (X.AnonymousClass7V0) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0098
            int r2 = r2 - r1
            r3.label = r2
        L_0x001b:
            java.lang.Object r5 = r3.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L_0x0040
            if (r0 != r1) goto L_0x009f
            int r11 = r3.I$0
            java.lang.Object r13 = r3.L$2
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector r13 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector) r13
            java.lang.Object r4 = r3.L$1
            android.database.Cursor r4 = (android.database.Cursor) r4
            java.lang.Object r14 = r3.L$0
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r14 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel) r14
            X.C30691eM.A01(r5)
        L_0x0037:
            boolean r0 = X.AnonymousClass000.A1Y(r5)
            if (r0 != 0) goto L_0x0046
        L_0x003d:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0040:
            X.C30691eM.A01(r5)
            if (r15 != 0) goto L_0x0046
            goto L_0x003d
        L_0x0046:
            boolean r0 = r4.moveToNext()
            if (r0 == 0) goto L_0x003d
            X.1Dt r5 = com.whatsapp.jid.Jid.Companion
            r0 = 0
            java.lang.String r0 = r4.getString(r0)
            com.whatsapp.jid.Jid r7 = r5.A02(r0)
            java.lang.String r16 = r4.getString(r1)
            boolean r0 = r7 instanceof X.AnonymousClass1BI
            if (r0 == 0) goto L_0x0070
            X.1fA r6 = r14.A0J
            r5 = r7
            X.1BI r5 = (X.AnonymousClass1BI) r5
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            X.1CJ r0 = r6.A05
            boolean r0 = r0.A0S(r5)
            if (r0 != 0) goto L_0x0046
        L_0x0070:
            java.lang.String r10 = X.C22971Dz.A06(r7)
            X.0ve r7 = r14.A0C
            X.11C r6 = r14.A0K
            com.whatsapp.media.WamediaManager r8 = r14.A0M
            X.1Q5 r9 = r14.A0N
            X.65c r5 = new X.65c
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r3.L$0 = r14
            r3.L$1 = r4
            r3.L$2 = r13
            r3.I$0 = r11
            r3.label = r1
            r12 = r5
            r15 = r10
            r18 = r11
            r17 = r3
            java.lang.Object r5 = A04(r12, r13, r14, r15, r16, r17, r18)
            if (r5 != r2) goto L_0x0037
            return r2
        L_0x0098:
            X.7V0 r3 = new X.7V0
            r3.<init>(r14, r5)
            goto L_0x001b
        L_0x009f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.A03(android.database.Cursor, com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector, com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel, X.1dr, int):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A04(X.AnonymousClass7H8 r13, com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector r14, com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r15, java.lang.String r16, java.lang.String r17, X.C30391dr r18, int r19) {
        /*
            r3 = r18
            r8 = r17
            boolean r0 = r3 instanceof X.AnonymousClass7U3
            if (r0 == 0) goto L_0x0027
            r4 = r3
            X.7U3 r4 = (X.AnonymousClass7U3) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0027
            int r2 = r2 - r1
            r4.label = r2
        L_0x0016:
            java.lang.Object r3 = r4.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r12 = 0
            r1 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 != r1) goto L_0x002d
            java.lang.Object r13 = r4.L$0
            X.7H8 r13 = (X.AnonymousClass7H8) r13
            goto L_0x0061
        L_0x0027:
            X.7U3 r4 = new X.7U3
            r4.<init>(r15, r3)
            goto L_0x0016
        L_0x002d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0032:
            X.C30691eM.A01(r3)
            int r0 = r13.getCount()     // Catch:{ CancellationException -> 0x0069 }
            boolean r0 = X.AnonymousClass000.A1P(r0)     // Catch:{ CancellationException -> 0x0069 }
            if (r0 != 0) goto L_0x0064
            if (r17 != 0) goto L_0x0043
            java.lang.String r8 = ""
        L_0x0043:
            X.8B2 r6 = r13.BUY(r12)     // Catch:{ CancellationException -> 0x0069 }
            int r11 = r13.getCount()     // Catch:{ CancellationException -> 0x0069 }
            r9 = 9
            X.6yS r5 = new X.6yS     // Catch:{ CancellationException -> 0x0069 }
            r7 = r16
            r10 = r19
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ CancellationException -> 0x0069 }
            r4.L$0 = r13     // Catch:{ CancellationException -> 0x0069 }
            r4.label = r1     // Catch:{ CancellationException -> 0x0069 }
            java.lang.Object r0 = r14.A01(r5, r4)     // Catch:{ CancellationException -> 0x0069 }
            if (r0 != r2) goto L_0x0064
            return r2
        L_0x0061:
            X.C30691eM.A01(r3)     // Catch:{ CancellationException -> 0x0069 }
        L_0x0064:
            r13.close()     // Catch:{ CancellationException -> 0x0069 }
            r12 = 1
            goto L_0x0072
        L_0x0069:
            r1 = move-exception
            java.lang.String r0 = "GalleryPickerViewModel/processWhatsappCursorBucket/error"
            com.whatsapp.util.Log.e(r0, r1)
            r13.close()
        L_0x0072:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.A04(X.7H8, com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector, com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel, java.lang.String, java.lang.String, X.1dr, int):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A05(X.C129026h8 r13, com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector r14, com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r15, java.util.Map r16, X.C30391dr r17, int r18, boolean r19) {
        /*
            r4 = r17
            r11 = r18
            boolean r0 = r4 instanceof X.AnonymousClass7U4
            if (r0 == 0) goto L_0x0026
            r3 = r4
            X.7U4 r3 = (X.AnonymousClass7U4) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0026
            int r2 = r2 - r1
            r3.label = r2
        L_0x0016:
            java.lang.Object r4 = r3.result
            X.1g4 r1 = X.C31751g4.COROUTINE_SUSPENDED
            int r2 = r3.label
            r0 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r0) goto L_0x0031
            java.lang.Object r2 = r3.L$0
            X.8Ah r2 = (X.C160878Ah) r2
            goto L_0x002c
        L_0x0026:
            X.7U4 r3 = new X.7U4
            r3.<init>(r15, r4)
            goto L_0x0016
        L_0x002c:
            X.C30691eM.A01(r4)     // Catch:{ CancellationException -> 0x00bf }
            goto L_0x00c8
        L_0x0031:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0036:
            X.C30691eM.A01(r4)
            int r5 = r13.A00
            r6 = r5 & r18
            if (r6 == 0) goto L_0x00c8
            java.lang.String r8 = r13.A03
            X.00H r2 = r15.A0D
            java.lang.Object r7 = r2.get()
            X.6yM r7 = (X.C139176yM) r7
            X.0vl r2 = r15.A0E
            boolean r4 = X.C72453Mb.A1a(r2)
            r2 = 0
            X.77I r2 = X.C139176yM.A00(r8, r6, r2)
            X.8Ah r2 = r7.A01(r2, r4)
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L_0x00c5
            java.lang.String r4 = X.C137776w0.A00     // Catch:{ CancellationException -> 0x00bb }
            java.lang.String r4 = X.C137776w0.A00(r4)     // Catch:{ CancellationException -> 0x00bb }
            boolean r4 = X.C18070vi.A18(r4, r8)     // Catch:{ CancellationException -> 0x00bb }
            r7 = r16
            if (r4 == 0) goto L_0x0078
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ CancellationException -> 0x00bb }
            int r4 = r2.getCount()     // Catch:{ CancellationException -> 0x00bb }
            X.C17880vN.A1P(r5, r7, r4)     // Catch:{ CancellationException -> 0x00bb }
            goto L_0x0090
        L_0x0078:
            if (r8 != 0) goto L_0x0090
            java.lang.Object r4 = X.AnonymousClass000.A0w(r7, r5)     // Catch:{ CancellationException -> 0x00bb }
            java.lang.Number r4 = (java.lang.Number) r4     // Catch:{ CancellationException -> 0x00bb }
            int r5 = r2.getCount()     // Catch:{ CancellationException -> 0x00bb }
            if (r4 == 0) goto L_0x0090
            int r4 = r4.intValue()     // Catch:{ CancellationException -> 0x00bb }
            if (r4 != r5) goto L_0x0090
            r2.close()     // Catch:{ CancellationException -> 0x00bb }
            goto L_0x00c8
        L_0x0090:
            int r10 = r13.A02     // Catch:{ CancellationException -> 0x00bf }
            if (r19 == 0) goto L_0x0095
            r11 = r6
        L_0x0095:
            X.118 r4 = r15.A0B     // Catch:{ CancellationException -> 0x00bf }
            android.content.Context r5 = r4.A00     // Catch:{ CancellationException -> 0x00bf }
            int r4 = r13.A01     // Catch:{ CancellationException -> 0x00bf }
            java.lang.String r9 = X.C18070vi.A0F(r5, r4)     // Catch:{ CancellationException -> 0x00bf }
            r13 = 0
            X.8B2 r7 = r2.BUY(r13)     // Catch:{ CancellationException -> 0x00bf }
            int r12 = r2.getCount()     // Catch:{ CancellationException -> 0x00bf }
            X.6yS r6 = new X.6yS     // Catch:{ CancellationException -> 0x00bf }
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ CancellationException -> 0x00bf }
            r2.close()     // Catch:{ CancellationException -> 0x00bf }
            r3.L$0 = r2     // Catch:{ CancellationException -> 0x00bf }
            r3.label = r0     // Catch:{ CancellationException -> 0x00bf }
            java.lang.Object r0 = r14.A01(r6, r3)     // Catch:{ CancellationException -> 0x00bf }
            if (r0 != r1) goto L_0x00c8
            return r1
        L_0x00bb:
            r1 = move-exception
            java.lang.String r0 = "GalleryPickerViewModel/obtainValidMediaList/error"
            goto L_0x00c2
        L_0x00bf:
            r1 = move-exception
            java.lang.String r0 = "GalleryPickerViewModel/checkDefaultMediaBuckets/error"
        L_0x00c2:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00c5:
            r2.close()
        L_0x00c8:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.A05(X.6h8, com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector, com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel, java.util.Map, X.1dr, int, boolean):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A06(com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector r13, com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r14, X.C30391dr r15) {
        /*
            boolean r0 = r15 instanceof X.AnonymousClass7U2
            if (r0 == 0) goto L_0x0022
            r4 = r15
            X.7U2 r4 = (X.AnonymousClass7U2) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0022
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r1 = r4.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r12 = 1
            if (r0 == 0) goto L_0x002d
            if (r0 != r12) goto L_0x0028
            java.lang.Object r2 = r4.L$0
            X.8Ah r2 = (X.C160878Ah) r2
            goto L_0x0079
        L_0x0022:
            X.7U2 r4 = new X.7U2
            r4.<init>(r14, r15)
            goto L_0x0012
        L_0x0028:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x002d:
            X.C30691eM.A01(r1)
            boolean r0 = X.AnonymousClass112.A07()
            if (r0 == 0) goto L_0x0089
            X.00H r0 = r14.A0D
            java.lang.Object r1 = r0.get()
            X.6yM r1 = (X.C139176yM) r1
            r7 = 0
            r10 = 7
            r5 = 0
            X.77I r0 = X.C139176yM.A00(r7, r10, r12)
            X.8Ah r2 = r1.A01(r0, r5)
            boolean r0 = r2.isEmpty()     // Catch:{ CancellationException -> 0x0080 }
            if (r0 == 0) goto L_0x0055
            r2.close()     // Catch:{ CancellationException -> 0x0080 }
            X.1Wu r0 = X.C27621Wu.A00     // Catch:{ CancellationException -> 0x0080 }
            return r0
        L_0x0055:
            X.118 r0 = r14.A0B     // Catch:{ CancellationException -> 0x0080 }
            android.content.Context r1 = r0.A00     // Catch:{ CancellationException -> 0x0080 }
            r0 = 2131886641(0x7f120231, float:1.9407867E38)
            java.lang.String r8 = X.C18070vi.A0F(r1, r0)     // Catch:{ CancellationException -> 0x0080 }
            X.8B2 r6 = r2.BUY(r5)     // Catch:{ CancellationException -> 0x0080 }
            int r11 = r2.getCount()     // Catch:{ CancellationException -> 0x0080 }
            r9 = 3
            X.6yS r5 = new X.6yS     // Catch:{ CancellationException -> 0x0080 }
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ CancellationException -> 0x0080 }
            r4.L$0 = r2     // Catch:{ CancellationException -> 0x0080 }
            r4.label = r12     // Catch:{ CancellationException -> 0x0080 }
            java.lang.Object r0 = r13.A01(r5, r4)     // Catch:{ CancellationException -> 0x0080 }
            if (r0 != r3) goto L_0x007c
            return r3
        L_0x0079:
            X.C30691eM.A01(r1)     // Catch:{ CancellationException -> 0x0080 }
        L_0x007c:
            r2.close()     // Catch:{ CancellationException -> 0x0080 }
            goto L_0x0089
        L_0x0080:
            r1 = move-exception
            java.lang.String r0 = "GalleryPickerViewModel/checkFavoriteFolderBuckets/error"
            com.whatsapp.util.Log.e(r0, r1)
            r2.close()
        L_0x0089:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.A06(com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector, com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel, X.1dr):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f9 A[EDGE_INSN: B:37:0x00f9->B:34:0x00f9 ?: BREAK  , SYNTHETIC] */
    public static final java.lang.Object A07(com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector r14, com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r15, X.C30391dr r16, int r17) {
        /*
            r3 = r16
            r11 = r17
            boolean r0 = r3 instanceof X.AnonymousClass7V7
            if (r0 == 0) goto L_0x0037
            r5 = r3
            X.7V7 r5 = (X.AnonymousClass7V7) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0037
            int r2 = r2 - r1
            r5.label = r2
        L_0x0016:
            java.lang.Object r6 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            java.lang.String r3 = "GalleryPickerViewModel/checkFolderBuckets/error"
            r2 = 1
            if (r0 == 0) goto L_0x0042
            if (r0 != r2) goto L_0x003d
            int r11 = r5.I$0
            java.lang.Object r2 = r5.L$3
            X.8Ah r2 = (X.C160878Ah) r2
            java.lang.Object r1 = r5.L$2
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r14 = r5.L$1
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector r14 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector) r14
            java.lang.Object r15 = r5.L$0
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r15 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel) r15
            goto L_0x00e2
        L_0x0037:
            X.7V7 r5 = new X.7V7
            r5.<init>(r15, r3)
            goto L_0x0016
        L_0x003d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0042:
            X.C30691eM.A01(r6)
            X.00H r0 = r15.A0D
            java.lang.Object r6 = r0.get()
            X.6yM r6 = (X.C139176yM) r6
            r0 = 0
            r1 = 0
            X.77I r0 = X.C139176yM.A00(r0, r11, r1)
            X.8Ah r7 = r6.A01(r0, r1)
            java.util.HashMap r0 = r7.BNm()     // Catch:{ CancellationException -> 0x00f2 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ CancellationException -> 0x00f2 }
            java.util.ArrayList r6 = X.C17880vN.A10(r0)     // Catch:{ CancellationException -> 0x00f2 }
            X.0vb r0 = r15.A0L     // Catch:{ CancellationException -> 0x00f2 }
            java.text.Collator r1 = X.C108965cb.A0r(r0)     // Catch:{ CancellationException -> 0x00f2 }
            r1.setDecomposition(r2)     // Catch:{ CancellationException -> 0x00f2 }
            r0 = 0
            X.7SC r2 = new X.7SC     // Catch:{ CancellationException -> 0x00f2 }
            r2.<init>(r1, r0)     // Catch:{ CancellationException -> 0x00f2 }
            r1 = 7
            X.7Rk r0 = new X.7Rk     // Catch:{ CancellationException -> 0x00f2 }
            r0.<init>((java.lang.Object) r2, (int) r1)     // Catch:{ CancellationException -> 0x00f2 }
            X.C29391cC.A0H(r6, r0)     // Catch:{ CancellationException -> 0x00f2 }
            r7.close()     // Catch:{ CancellationException -> 0x00f2 }
            java.util.Iterator r1 = r6.iterator()
        L_0x0082:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00f9
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r1)
            java.lang.String r8 = X.C17880vN.A0x(r0)
            java.lang.Object r9 = r0.getValue()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r0 = X.C137776w0.A00
            java.lang.String r0 = X.C137776w0.A00(r0)
            boolean r0 = X.C18070vi.A18(r8, r0)
            if (r0 != 0) goto L_0x0082
            X.00H r0 = r15.A0D
            java.lang.Object r6 = r0.get()
            X.6yM r6 = (X.C139176yM) r6
            X.0vl r0 = r15.A0E
            boolean r2 = X.C72453Mb.A1a(r0)
            r13 = 0
            X.77I r0 = X.C139176yM.A00(r8, r11, r13)
            X.8Ah r2 = r6.A01(r0, r2)
            boolean r0 = r2.isEmpty()     // Catch:{ CancellationException -> 0x00e9 }
            if (r0 != 0) goto L_0x00e5
            X.8B2 r7 = r2.BUY(r13)     // Catch:{ CancellationException -> 0x00e9 }
            int r12 = r2.getCount()     // Catch:{ CancellationException -> 0x00e9 }
            r10 = 8
            X.6yS r6 = new X.6yS     // Catch:{ CancellationException -> 0x00e9 }
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ CancellationException -> 0x00e9 }
            r5.L$0 = r15     // Catch:{ CancellationException -> 0x00e9 }
            r5.L$1 = r14     // Catch:{ CancellationException -> 0x00e9 }
            r5.L$2 = r1     // Catch:{ CancellationException -> 0x00e9 }
            r5.L$3 = r2     // Catch:{ CancellationException -> 0x00e9 }
            r5.I$0 = r11     // Catch:{ CancellationException -> 0x00e9 }
            r0 = 1
            r5.label = r0     // Catch:{ CancellationException -> 0x00e9 }
            java.lang.Object r0 = r14.A01(r6, r5)     // Catch:{ CancellationException -> 0x00e9 }
            if (r0 != r4) goto L_0x00e5
            goto L_0x00f1
        L_0x00e2:
            X.C30691eM.A01(r6)     // Catch:{ CancellationException -> 0x00e9 }
        L_0x00e5:
            r2.close()     // Catch:{ CancellationException -> 0x00e9 }
            goto L_0x0082
        L_0x00e9:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
            r2.close()
            goto L_0x0082
        L_0x00f1:
            return r4
        L_0x00f2:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
            r7.close()
        L_0x00f9:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.A07(com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector, com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel, X.1dr, int):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A08(com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector r13, com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r14, X.C30391dr r15, int r16) {
        /*
            r10 = r16
            boolean r0 = r15 instanceof X.C147777Ul
            if (r0 == 0) goto L_0x008f
            r2 = r15
            X.7Ul r2 = (X.C147777Ul) r2
            int r3 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x008f
            int r3 = r3 - r1
            r2.label = r3
        L_0x0014:
            java.lang.Object r5 = r2.result
            X.1g4 r1 = X.C31751g4.COROUTINE_SUSPENDED
            int r4 = r2.label
            r3 = 2
            r0 = 1
            if (r4 == 0) goto L_0x0028
            if (r4 == r0) goto L_0x003a
            if (r4 != r3) goto L_0x0095
            X.C30691eM.A01(r5)
        L_0x0025:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0028:
            X.C30691eM.A01(r5)
            r2.L$0 = r14
            r2.L$1 = r13
            r2.I$0 = r10
            r2.label = r0
            java.lang.Object r5 = A0B(r14, r2, r10)
            if (r5 != r1) goto L_0x0047
            return r1
        L_0x003a:
            int r10 = r2.I$0
            java.lang.Object r13 = r2.L$1
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector r13 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector) r13
            java.lang.Object r14 = r2.L$0
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r14 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel) r14
            X.C30691eM.A01(r5)
        L_0x0047:
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector r5 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector) r5
            java.util.List r5 = r5.A02
            boolean r0 = X.AnonymousClass000.A1a(r5)
            if (r0 == 0) goto L_0x0025
            X.118 r0 = r14.A0B
            android.content.Context r4 = r0.A00
            r0 = 2131898566(0x7f1230c6, float:1.9432053E38)
            java.lang.String r8 = X.C18070vi.A0F(r4, r0)
            java.lang.Object r0 = X.C29431cG.A0b(r5)
            X.6yS r0 = (X.C139226yS) r0
            X.8B2 r6 = r0.A03
            java.util.Iterator r4 = r5.iterator()
            r11 = 0
        L_0x0069:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r4.next()
            X.6yS r0 = (X.C139226yS) r0
            int r0 = r0.A00
            int r11 = r11 + r0
            goto L_0x0069
        L_0x0079:
            r7 = 0
            r9 = 9
            r12 = 0
            X.6yS r5 = new X.6yS
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r2.L$0 = r7
            r2.L$1 = r7
            r2.label = r3
            java.lang.Object r0 = r13.A01(r5, r2)
            if (r0 != r1) goto L_0x0025
            return r1
        L_0x008f:
            X.7Ul r2 = new X.7Ul
            r2.<init>(r14, r15)
            goto L_0x0014
        L_0x0095:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.A08(com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector, com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel, X.1dr, int):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A09(com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector r6, com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r7, X.C30391dr r8, int r9) {
        /*
            boolean r0 = r8 instanceof X.AnonymousClass7UP
            if (r0 == 0) goto L_0x0062
            r5 = r8
            X.7UP r5 = (X.AnonymousClass7UP) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0062
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r4 = r5.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0044
            if (r1 == r0) goto L_0x0052
            if (r1 != r2) goto L_0x006b
            java.lang.Object r1 = r5.L$1
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r6 = r5.L$0
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector r6 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector) r6
            X.C30691eM.A01(r4)
        L_0x002b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0068
            java.lang.Object r0 = r1.next()
            X.6yS r0 = (X.C139226yS) r0
            r5.L$0 = r6
            r5.L$1 = r1
            r5.label = r2
            java.lang.Object r0 = r6.A01(r0, r5)
            if (r0 != r3) goto L_0x002b
            return r3
        L_0x0044:
            X.C30691eM.A01(r4)
            r5.L$0 = r6
            r5.label = r0
            java.lang.Object r4 = A0B(r7, r5, r9)
            if (r4 != r3) goto L_0x0059
            return r3
        L_0x0052:
            java.lang.Object r6 = r5.L$0
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector r6 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector) r6
            X.C30691eM.A01(r4)
        L_0x0059:
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector r4 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector) r4
            java.util.List r0 = r4.A02
            java.util.Iterator r1 = r0.iterator()
            goto L_0x002b
        L_0x0062:
            X.7UP r5 = new X.7UP
            r5.<init>(r7, r8)
            goto L_0x0012
        L_0x0068:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x006b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.A09(com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector, com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel, X.1dr, int):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b5, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b6, code lost:
        r0 = th;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:32:0x00a9, B:36:0x00b0] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063 A[Catch:{ all -> 0x00bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a9 A[SYNTHETIC, Splitter:B:32:0x00a9] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A0B(com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r13, X.C30391dr r14, int r15) {
        /*
            boolean r0 = r14 instanceof X.AnonymousClass7V8
            if (r0 == 0) goto L_0x0032
            r5 = r14
            X.7V8 r5 = (X.AnonymousClass7V8) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0032
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r8 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r5.label
            r6 = 2
            r0 = 1
            r9 = 0
            if (r1 == 0) goto L_0x004b
            if (r1 == r0) goto L_0x003d
            if (r1 != r6) goto L_0x0038
            java.lang.Object r7 = r5.L$3
            java.io.Closeable r7 = (java.io.Closeable) r7
            java.lang.Object r3 = r5.L$2
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector r3 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector) r3
            java.lang.Object r13 = r5.L$1
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r13 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel) r13
            java.lang.Object r2 = r5.L$0
            X.1n2 r2 = (X.C35911n2) r2
            goto L_0x00a2
        L_0x0032:
            X.7V8 r5 = new X.7V8
            r5.<init>(r13, r14)
            goto L_0x0012
        L_0x0038:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x003d:
            int r15 = r5.I$0
            java.lang.Object r2 = r5.L$1
            X.1n2 r2 = (X.C35911n2) r2
            java.lang.Object r13 = r5.L$0
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r13 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel) r13
            X.C30691eM.A01(r8)
            goto L_0x005f
        L_0x004b:
            X.C30691eM.A01(r8)
            X.1n2 r2 = r13.A0O
            r5.L$0 = r13
            r5.L$1 = r2
            r5.I$0 = r15
            r5.label = r0
            java.lang.Object r0 = r2.Bhx(r5)
            if (r0 != r4) goto L_0x005f
            return r4
        L_0x005f:
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector r3 = r13.A02     // Catch:{ all -> 0x00bc }
            if (r3 != 0) goto L_0x00b8
            X.65k r3 = new X.65k     // Catch:{ all -> 0x00bc }
            r3.<init>(r13)     // Catch:{ all -> 0x00bc }
            X.11C r0 = r13.A0K     // Catch:{ all -> 0x00bc }
            X.11B r7 = r0.A0O()     // Catch:{ all -> 0x00bc }
            if (r7 == 0) goto L_0x0090
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "content://"
            r1.append(r0)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "com.whatsapp"
            r1.append(r0)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = ".provider.media/buckets"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x00bc }
            android.net.Uri r8 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x00bc }
            r11 = r9
            r12 = r9
            r10 = r9
            android.database.Cursor r7 = r7.A03(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00bc }
            goto L_0x0091
        L_0x0090:
            r7 = r9
        L_0x0091:
            r5.L$0 = r2     // Catch:{ all -> 0x00af }
            r5.L$1 = r13     // Catch:{ all -> 0x00af }
            r5.L$2 = r3     // Catch:{ all -> 0x00af }
            r5.L$3 = r7     // Catch:{ all -> 0x00af }
            r5.label = r6     // Catch:{ all -> 0x00af }
            java.lang.Object r0 = A03(r7, r3, r13, r5, r15)     // Catch:{ all -> 0x00af }
            if (r0 != r4) goto L_0x00a5
            return r4
        L_0x00a2:
            X.C30691eM.A01(r8)     // Catch:{ all -> 0x00ad }
        L_0x00a5:
            r13.A02 = r3     // Catch:{ all -> 0x00ad }
            if (r7 == 0) goto L_0x00b8
            r7.close()     // Catch:{ all -> 0x00b6 }
            goto L_0x00b8
        L_0x00ad:
            r1 = move-exception
            goto L_0x00b0
        L_0x00af:
            r1 = move-exception
        L_0x00b0:
            throw r1     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ all -> 0x00b6 }
            throw r0     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            r0 = move-exception
            goto L_0x00bd
        L_0x00b8:
            r2.CQ9(r9)
            return r3
        L_0x00bc:
            r0 = move-exception
        L_0x00bd:
            r2.CQ9(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.A0B(com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel, X.1dr, int):java.lang.Object");
    }

    public void A0S() {
        AnonymousClass1OB r0 = this.A01;
        if (r0 != null) {
            r0.BEM((CancellationException) null);
        }
        AnonymousClass1OB r02 = this.A00;
        if (r02 != null) {
            r02.BEM((CancellationException) null);
        }
    }

    public final Integer A0T() {
        int i;
        Number A1C = C108945cZ.A1C(this.A09);
        if (A1C != null && A1C.intValue() == 0) {
            i = 16;
        } else if (A1C == null || A1C.intValue() != 1) {
            C139226yS r4 = (C139226yS) this.A04.A06();
            if (r4 == null) {
                return null;
            }
            int i2 = r4.A02;
            if (Integer.valueOf(i2) == null) {
                return null;
            }
            int i3 = 20;
            if (i2 != 3) {
                if (i2 == 7) {
                    i3 = 21;
                } else {
                    i3 = 22;
                    if (i2 != 1) {
                        i3 = 23;
                        if (i2 != 10) {
                            i3 = 24;
                            if (i2 != 11) {
                                if (i2 != 9) {
                                    return null;
                                }
                                i3 = 26;
                                if (r4.A04 == null) {
                                    i3 = 25;
                                }
                            }
                        }
                    }
                }
            }
            return Integer.valueOf(i3);
        } else {
            i = 15;
        }
        return Integer.valueOf(i);
    }

    public static Integer A00(C18100vl r0) {
        return ((GalleryPickerViewModel) r0.getValue()).A0T();
    }

    public static Object A0C(C18100vl r0) {
        return ((GalleryPickerViewModel) r0.getValue()).A04.A06();
    }
}
