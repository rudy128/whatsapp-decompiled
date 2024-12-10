package X;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.mediacomposer.doodle.DoodleView;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.util.Log;
import com.whatsapp.videoplayback.ExoPlayerErrorFrame;
import java.util.List;

/* renamed from: X.6Ga  reason: invalid class name */
public class AnonymousClass6Ga extends AnonymousClass70O {
    public float A00;
    public int A01 = 3;
    public FrameLayout A02;
    public C132796nb A03;
    public AnonymousClass70X A04;
    public Integer A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B = true;
    public ViewGroup A0C;
    public boolean A0D;
    public final PointF A0E = new PointF();
    public final View A0F;
    public final FrameLayout A0G;
    public final AnonymousClass190 A0H;
    public final AnonymousClass11P A0I;
    public final AnonymousClass118 A0J;
    public final C18030ve A0K;
    public final AnonymousClass6gC A0L;
    public final DoodleView A0M;
    public final PhotoView A0N;
    public final AnonymousClass21X A0O;
    public final C32741hg A0P;
    public final C1409373q A0Q;
    public final AnonymousClass10I A0R;
    public final ExoPlayerErrorFrame A0S;
    public final C131106kW A0T;
    public final AnonymousClass00H A0U;
    public final boolean A0V;
    public final C36361nl A0W;
    public final AnonymousClass689 A0X;
    public final C36341nj A0Y;
    public final AnonymousClass89N A0Z;
    public final C32021gV A0a;

    /* JADX WARNING: Removed duplicated region for block: B:49:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.AnonymousClass6Ga r45) {
        /*
            r8 = 0
            r3 = r45
            X.70X r0 = r3.A04
            if (r0 != 0) goto L_0x0025
            A05(r3)
            X.21X r4 = r3.A0O
            X.2rc r10 = r4.A02
            if (r10 == 0) goto L_0x03ad
            java.io.File r0 = r10.A0G
            if (r0 == 0) goto L_0x0032
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0032
        L_0x001a:
            com.whatsapp.mediaview.PhotoView r2 = r3.A0N
            X.11P r1 = r3.A0I
            X.6Mq r0 = new X.6Mq
            r0.<init>(r2, r1)
            r3.A04 = r0
        L_0x0025:
            android.widget.FrameLayout r0 = r3.A02
            r0.setVisibility(r8)
            android.view.ViewGroup r0 = r3.A0C
            if (r0 == 0) goto L_0x0031
            r0.setVisibility(r8)
        L_0x0031:
            return
        L_0x0032:
            X.0ve r7 = r3.A0K
            r0 = 5913(0x1719, float:8.286E-42)
            X.0vf r12 = X.C18040vf.A02
            java.lang.String r0 = X.C18020vd.A01(r12, r7, r0)
            boolean r0 = X.C39761tb.A0E(r0)
            if (r0 != 0) goto L_0x037d
            boolean r0 = X.C108985cd.A1V(r7)
            if (r0 != 0) goto L_0x037d
            com.whatsapp.videoplayback.ExoPlayerErrorFrame r2 = r3.A0S
            r2.setVisibility(r8)
            X.6kW r0 = r3.A0T
            android.widget.FrameLayout r1 = r3.A0G
            android.content.Context r15 = X.AnonymousClass3MY.A04(r1)
            boolean r14 = r3.A0V
            if (r14 == 0) goto L_0x0379
            X.6Mr r5 = r0.A00
        L_0x005b:
            r1 = 0
            if (r5 != 0) goto L_0x0290
            X.0ve r7 = r0.A07
            r5 = 6394(0x18fa, float:8.96E-42)
            boolean r17 = X.C18020vd.A05(r12, r7, r5)
            X.11P r5 = r0.A05
            r19 = r5
            X.190 r5 = r0.A02
            r40 = r5
            X.1KB r5 = r0.A03
            r39 = r5
            X.18K r5 = r0.A08
            r21 = r5
            X.00H r5 = r0.A0C
            java.lang.Object r9 = X.C18070vi.A0E(r5)
            X.168 r9 = (X.AnonymousClass168) r9
            X.11C r5 = r0.A04
            r38 = r5
            X.10I r5 = r0.A0A
            r42 = r5
            X.00H r5 = r0.A0B
            java.lang.Object r13 = X.C18070vi.A0E(r5)
            X.6gC r13 = (X.AnonymousClass6gC) r13
            X.2rc r6 = X.AnonymousClass3Ma.A0M(r4)
            X.5ti r9 = r9.A00(r6)
            java.io.File r11 = r6.A0G
            boolean r5 = r6.A0f
            if (r5 == 0) goto L_0x0201
            if (r9 == 0) goto L_0x0201
            X.6ug r5 = r9.A0r
            if (r5 == 0) goto L_0x0201
        L_0x00a2:
            X.00H r5 = r0.A0D
            java.lang.Object r6 = r5.get()
            X.2r5 r6 = (X.C62242r5) r6
            if (r9 == 0) goto L_0x01fe
            X.70W r9 = r9.A0k
        L_0x00ae:
            r24 = 3
            r25 = 7
            r23 = 2
            X.6Mm r5 = new X.6Mm
            r18 = r5
            r19 = r21
            r20 = r6
            r21 = r9
            r22 = r4
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            X.00H r6 = r0.A0E
            java.lang.Object r9 = r6.get()
            X.6oM r9 = (X.C133216oM) r9
            X.1FU r6 = X.AnonymousClass3MZ.A0P(r15)
            X.6My r9 = r9.A00(r6, r4, r5)
            android.app.Activity r19 = X.AnonymousClass1L9.A00(r15)
            X.118 r11 = r0.A06
            r6 = 12658(0x3172, float:1.7738E-41)
            boolean r29 = X.C18020vd.A05(r12, r7, r6)
            X.6Mr r6 = new X.6Mr
            r22 = r38
            r23 = r11
            r24 = r7
            r25 = r13
            r26 = r42
            r27 = r5
            r28 = r8
            r18 = r6
            r20 = r40
            r21 = r39
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r6.A0f(r9)
            X.6ph r5 = new X.6ph
            r5.<init>(r2, r1, r8)
            com.whatsapp.videoplayback.ExoPlayerErrorFrame r1 = r5.A02
            r1.setLoadingViewVisibility(r8)
            android.widget.FrameLayout r1 = r1.A02
            X.C72453Mb.A1D(r1)
            r6.A0Q(r5)
            r6.A0G()
        L_0x0110:
            r1 = 1
            r6.A0C = r1
            r6.A0L = r1
            if (r17 == 0) goto L_0x0119
            r6.A0F = r1
        L_0x0119:
            if (r14 == 0) goto L_0x01fa
            r0.A00 = r6
        L_0x011d:
            r1 = r6
        L_0x011e:
            r3.A04 = r1
        L_0x0120:
            X.70X r6 = r3.A04
            boolean r0 = r6 instanceof X.C122076Mr
            r5 = 0
            if (r0 == 0) goto L_0x0160
            X.6Mr r6 = (X.C122076Mr) r6
            if (r6 == 0) goto L_0x0160
            X.00H r0 = r3.A0U
            java.lang.Object r2 = r0.get()
            X.6jv r2 = (X.C130736jv) r2
            r7 = 1
            X.0ve r1 = r2.A02
            r0 = 10970(0x2ada, float:1.5372E-41)
            boolean r0 = X.C18020vd.A05(r12, r1, r0)
            if (r0 == 0) goto L_0x0160
            X.36j r0 = X.C63672tV.A02(r4)
            if (r0 == 0) goto L_0x0160
            boolean r0 = r0.A08
            if (r0 != r7) goto L_0x0160
            X.EAh r7 = r6.A07
            if (r7 == 0) goto L_0x01d6
            X.7BA r7 = (X.AnonymousClass7BA) r7
        L_0x014e:
            X.1OX r6 = r2.A08
            X.00H r0 = r2.A03
            java.lang.Object r1 = X.C18070vi.A0E(r0)
            X.0wh r1 = (X.C18560wh) r1
            com.whatsapp.snapl.SnaplHeroPlayerHelper$maybeAddSnaplHeroPlayerListener$1 r0 = new com.whatsapp.snapl.SnaplHeroPlayerHelper$maybeAddSnaplHeroPlayerListener$1
            r0.<init>(r4, r2, r7, r5)
            X.AnonymousClass3MW.A1X(r1, r0, r6)
        L_0x0160:
            X.70X r9 = r3.A04
            if (r9 == 0) goto L_0x001a
            X.7Nt r0 = new X.7Nt
            r0.<init>(r3)
            r9.A09 = r0
            X.7Nx r0 = new X.7Nx
            r0.<init>(r3)
            r9.A0A = r0
            X.7Nq r0 = new X.7Nq
            r0.<init>(r3)
            r9.A0S(r0)
            boolean r0 = r3.A09
            r9.A0W(r0)
            X.205 r0 = r4.A0v
            boolean r2 = r0.A02
            boolean r1 = r10.A0V
            boolean r0 = r10.A0U
            if (r2 == 0) goto L_0x01d4
            if (r1 != 0) goto L_0x01d4
            if (r0 != 0) goto L_0x01d4
            long r1 = r10.A0D
            r11 = 0
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x01d4
            long r6 = r10.A0E
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x01d4
            int r0 = (int) r1
        L_0x019c:
            r9.A0M(r0)
            r1 = 7
            boolean r0 = r9 instanceof X.C122076Mr
            if (r0 == 0) goto L_0x01a6
            r9.A01 = r1
        L_0x01a6:
            boolean r0 = r3 instanceof X.AnonymousClass6GZ
            if (r0 == 0) goto L_0x01b2
            X.70X r1 = r3.A04
            if (r1 == 0) goto L_0x01b2
            r0 = 1
            r1.A0W(r0)
        L_0x01b2:
            X.70X r0 = r3.A04
            if (r0 == 0) goto L_0x01c2
            android.view.View r5 = r0.A09()
            if (r5 == 0) goto L_0x01c2
            android.view.ViewParent r0 = r5.getParent()
            if (r0 != 0) goto L_0x0025
        L_0x01c2:
            android.widget.FrameLayout r4 = r3.A02
            r4.removeAllViews()
            r2 = 17
            r1 = -1
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r1, r1, r2)
            r4.addView(r5, r8, r0)
            goto L_0x0025
        L_0x01d4:
            r0 = 0
            goto L_0x019c
        L_0x01d6:
            X.6an r0 = r2.A01
            X.10H r0 = r0.A00
            X.10E r0 = r0.A00
            X.11P r1 = X.AnonymousClass10E.A6O(r0)
            X.10G r0 = r0.A00
            X.6cf r0 = X.AnonymousClass10G.ADV(r0)
            X.7BA r7 = new X.7BA
            r7.<init>(r1, r0, r6)
            r6.A07 = r7
            X.Cye r0 = r6.A06
            if (r0 == 0) goto L_0x014e
            X.DGH r0 = r0.A0E
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A00
            r0.add(r7)
            goto L_0x014e
        L_0x01fa:
            r0.A01 = r6
            goto L_0x011d
        L_0x01fe:
            r9 = r1
            goto L_0x00ae
        L_0x0201:
            boolean r5 = X.AnonymousClass72Z.A02(r7, r4)
            if (r5 != 0) goto L_0x00a2
            if (r11 == 0) goto L_0x011e
            android.net.Uri r16 = android.net.Uri.fromFile(r11)
            X.1hs r1 = r0.A09
            X.6gi r5 = new X.6gi
            r2 = r39
            r5.<init>(r2, r1, r4)
            android.app.Activity r35 = X.AnonymousClass1L9.A00(r15)
            X.118 r15 = r0.A06
            X.6Mz r9 = new X.6Mz
            r9.<init>(r15, r1, r4, r5)
            int r1 = r4.A0D
            long r1 = (long) r1
            r29 = r1
            X.205 r1 = r4.A0v
            boolean r1 = r1.A02
            r23 = 1
            if (r1 == 0) goto L_0x0230
            r23 = 3
        L_0x0230:
            java.io.File r1 = r6.A0G
            if (r1 == 0) goto L_0x028d
            long r27 = r1.lastModified()
        L_0x0238:
            java.lang.Integer r22 = X.C108955ca.A0e()
            long r1 = r4.A01
            r31 = r1
            int r1 = r6.A08
            long r1 = (long) r1
            r33 = r1
            int r1 = r6.A06
            long r1 = (long) r1
            r24 = 3
            X.6Ml r18 = new X.6Ml
            r20 = r7
            r25 = r29
            r29 = r31
            r31 = r33
            r33 = r1
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r27, r29, r31, r33)
            r1 = 12658(0x3172, float:1.7738E-41)
            boolean r45 = X.C18020vd.A05(r12, r7, r1)
            X.6Mr r6 = new X.6Mr
            r34 = r6
            r36 = r40
            r37 = r39
            r39 = r15
            r40 = r7
            r41 = r13
            r43 = r18
            r44 = r8
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            r1 = r16
            r6.A04 = r1
            r6.A0f(r9)
            X.6ra r7 = r6.A09
            java.lang.String r1 = "null cannot be cast to non-null type com.whatsapp.videoplayback.VideoLocalStat"
            X.C18070vi.A0z(r7, r1)
            r2 = 28
            r1 = r42
            X.AnonymousClass7RO.A02(r1, r7, r0, r11, r2)
            r5.A01 = r6
            goto L_0x0110
        L_0x028d:
            r27 = 0
            goto L_0x0238
        L_0x0290:
            X.2rc r6 = X.AnonymousClass3Ma.A0M(r4)
            X.00H r7 = r0.A0C
            java.lang.Object r7 = r7.get()
            X.168 r7 = (X.AnonymousClass168) r7
            X.5ti r14 = r7.A00(r6)
            boolean r7 = r6.A0f
            if (r7 == 0) goto L_0x02f7
            if (r14 == 0) goto L_0x02f7
            X.6ug r7 = r14.A0r
            if (r7 == 0) goto L_0x02f7
        L_0x02aa:
            X.18K r11 = r0.A08
            X.00H r6 = r0.A0D
            java.lang.Object r9 = r6.get()
            X.2r5 r9 = (X.C62242r5) r9
            if (r14 == 0) goto L_0x02f5
            X.70W r7 = r14.A0k
        L_0x02b8:
            r22 = 3
            r23 = 7
            r21 = 2
            X.6Mm r6 = new X.6Mm
            r18 = r9
            r19 = r7
            r20 = r4
            r16 = r6
            r17 = r11
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            X.6ph r7 = new X.6ph
            r7.<init>(r2, r1, r8)
            r5.A0Q(r7)
            com.whatsapp.videoplayback.ExoPlayerErrorFrame r1 = r7.A02
            r1.setLoadingViewVisibility(r8)
            android.widget.FrameLayout r1 = r1.A02
            X.C72453Mb.A1D(r1)
            X.00H r0 = r0.A0E
            java.lang.Object r1 = r0.get()
            X.6oM r1 = (X.C133216oM) r1
            X.1FU r0 = X.C108985cd.A0L(r15)
            X.6My r0 = r1.A00(r0, r4, r6)
            r5.A0R(r6, r0)
        L_0x02f2:
            r1 = r5
            goto L_0x011e
        L_0x02f5:
            r7 = 0
            goto L_0x02b8
        L_0x02f7:
            X.0ve r13 = r0.A07
            boolean r7 = X.AnonymousClass72Z.A02(r13, r4)
            if (r7 != 0) goto L_0x02aa
            java.io.File r11 = r6.A0G
            if (r11 == 0) goto L_0x011e
            X.1KB r1 = r0.A03
            X.1hs r9 = r0.A09
            X.6gi r7 = new X.6gi
            r7.<init>(r1, r9, r4)
            X.11P r1 = r0.A05
            r32 = r1
            X.18K r1 = r0.A08
            r31 = r1
            int r1 = r4.A0D
            long r1 = (long) r1
            r25 = r1
            X.205 r1 = r4.A0v
            boolean r1 = r1.A02
            r19 = 1
            if (r1 == 0) goto L_0x0323
            r19 = 3
        L_0x0323:
            java.io.File r1 = r6.A0G
            if (r1 == 0) goto L_0x0376
            long r23 = r1.lastModified()
        L_0x032b:
            java.lang.Integer r18 = X.C108955ca.A0e()
            long r1 = r4.A01
            r27 = r1
            int r1 = r6.A08
            long r1 = (long) r1
            r16 = r1
            int r1 = r6.A06
            long r14 = (long) r1
            r20 = 3
            X.6Ml r1 = new X.6Ml
            r21 = r25
            r25 = r27
            r27 = r16
            r29 = r14
            r14 = r1
            r15 = r32
            r16 = r13
            r17 = r31
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r23, r25, r27, r29)
            r5.A09 = r1
            X.10I r13 = r0.A0A
            r2 = 28
            X.AnonymousClass7RO.A02(r13, r1, r0, r11, r2)
            java.io.File r1 = r6.A0G
            if (r1 == 0) goto L_0x0361
            r5.A0V(r1)
        L_0x0361:
            X.118 r1 = r0.A06
            X.6Mz r0 = new X.6Mz
            r0.<init>(r1, r9, r4, r7)
            r5.A0f(r0)
            r7.A01 = r5
            r0 = 0
            r5.A0Q(r0)
            r5.A0J()
            goto L_0x02f2
        L_0x0376:
            r23 = 0
            goto L_0x032b
        L_0x0379:
            X.6Mr r5 = r0.A01
            goto L_0x005b
        L_0x037d:
            java.io.File r6 = r10.A0G
            if (r6 == 0) goto L_0x0120
            X.190 r14 = r3.A0H
            X.1KB r15 = r3.A01
            X.11C r5 = r3.A02
            android.widget.FrameLayout r0 = r3.A0G
            android.content.Context r13 = r0.getContext()
            X.118 r2 = r3.A0J
            X.10I r1 = r3.A0R
            X.6gC r0 = r3.A0L
            r21 = 0
            r24 = 1
            r25 = r8
            r20 = r1
            r22 = r6
            r23 = r8
            r17 = r2
            r18 = r7
            r19 = r0
            r16 = r5
            X.70X r1 = X.AnonymousClass70X.A04(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x011e
        L_0x03ad:
            java.lang.IllegalArgumentException r0 = X.C17890vO.A0K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Ga.A04(X.6Ga):void");
    }

    public static final int A01(AnonymousClass6Ga r9) {
        int i = 0;
        if (r9.A04 == null) {
            return 0;
        }
        AnonymousClass21X r0 = r9.A0O;
        C62572rc A0M2 = AnonymousClass3Ma.A0M(r0);
        boolean z = r0.A0v.A02;
        boolean z2 = A0M2.A0V;
        boolean z3 = A0M2.A0U;
        AnonymousClass70X r02 = r9.A04;
        if (r02 != null) {
            i = r02.A05();
        }
        if (!z || z2 || z3) {
            return i;
        }
        long j = A0M2.A0D;
        if (j < 0 || A0M2.A0E <= 0) {
            return i;
        }
        return i - ((int) j);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.210} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.210} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.210} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: X.206} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: X.210} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(android.content.Context r10, com.whatsapp.InteractiveAnnotation r11, X.AnonymousClass6Ga r12) {
        /*
            java.lang.Object r4 = r11.data
            X.C18070vi.A0W(r4)
            boolean r0 = r4 instanceof com.whatsapp.SerializableLocation
            r3 = r10
            if (r0 == 0) goto L_0x0019
            X.689 r2 = r12.A0X
            com.whatsapp.SerializableLocation r4 = (com.whatsapp.SerializableLocation) r4
            double r6 = r4.latitude
            double r8 = r4.longitude
            java.lang.String r4 = r4.name
            r5 = 0
            r2.A09(r3, r4, r5, r6, r8)
        L_0x0018:
            return
        L_0x0019:
            boolean r0 = r4 instanceof X.C20947Ac1
            if (r0 == 0) goto L_0x004c
            X.Ac1 r4 = (X.C20947Ac1) r4
            X.9Id r0 = r4.A02
            boolean r2 = r11.skipConfirmation
            if (r0 == 0) goto L_0x0018
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0049
            r0 = 1
            if (r1 == r0) goto L_0x0046
            r0 = 2
            if (r1 != r0) goto L_0x0018
            if (r2 == 0) goto L_0x0043
            java.lang.Integer r8 = X.AnonymousClass00R.A15
        L_0x0036:
            X.1nj r5 = r12.A0Y
            X.1ch r7 = r4.A01
            int r0 = r4.A00
            long r10 = (long) r0
            r9 = 3
            r6 = r3
            r5.A04(r6, r7, r8, r9, r10)
            return
        L_0x0043:
            java.lang.Integer r8 = X.AnonymousClass00R.A0u
            goto L_0x0036
        L_0x0046:
            java.lang.Integer r8 = X.AnonymousClass00R.A18
            goto L_0x0036
        L_0x0049:
            java.lang.Integer r8 = X.AnonymousClass00R.A0C
            goto L_0x0036
        L_0x004c:
            boolean r0 = r4 instanceof X.AnonymousClass97M
            if (r0 == 0) goto L_0x0018
            boolean r0 = X.C1406872o.A01(r11)
            if (r0 == 0) goto L_0x0018
            X.21X r10 = r12.A0O
            r0 = 0
            X.C18070vi.A0d(r10, r0)
            java.lang.Class<X.7LD> r0 = X.AnonymousClass7LD.class
            X.25F r0 = X.C18070vi.A09(r10, r0)
            X.229 r0 = r0.A02
            X.7LD r0 = (X.AnonymousClass7LD) r0
            r3 = 0
            if (r0 == 0) goto L_0x0090
            java.util.ArrayList r0 = r0.A00
            java.util.Iterator r9 = r0.iterator()
        L_0x006f:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x008e
            java.lang.Object r8 = r9.next()
            r0 = r8
            X.206 r0 = (X.AnonymousClass206) r0
            long r1 = r0.A0x
            r0 = r4
            X.97M r0 = (X.AnonymousClass97M) r0
            java.lang.Long r0 = r0.A02
            if (r0 == 0) goto L_0x006f
            long r6 = r0.longValue()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x006f
            r3 = r8
        L_0x008e:
            X.210 r3 = (X.AnonymousClass210) r3
        L_0x0090:
            r1 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r12.A05 = r0
            X.1hg r11 = r12.A0P
            r0 = 2
            r11.A0B(r10, r0)
            r11.A0C(r10, r1)
            X.0ve r9 = r12.A0K
            X.1nl r8 = r12.A0W
            android.content.Context r6 = X.AnonymousClass70K.A0B(r12)
            X.1KB r7 = r12.A01
            if (r3 == 0) goto L_0x00b4
            java.lang.String r12 = r3.A0P()
        L_0x00b0:
            X.C137396vO.A00(r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x00b4:
            r12 = 0
            goto L_0x00b0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Ga.A02(android.content.Context, com.whatsapp.InteractiveAnnotation, X.6Ga):void");
    }

    public static final void A03(AnonymousClass6Ga r6) {
        PhotoView photoView = r6.A0N;
        if (photoView.getVisibility() == 0) {
            View A0F2 = AnonymousClass3MZ.A0F(AnonymousClass1L9.A00(AnonymousClass70K.A0B(r6)));
            C18070vi.A0X(A0F2);
            r6.A0a.A0D(photoView, r6.A0O, new AnonymousClass7NC(r6, Math.max(A0F2.getWidth(), A0F2.getHeight()), 4));
        }
    }

    public static final void A07(AnonymousClass6Ga r1) {
        if (!r1.A09 && !r1.A06 && r1.A05.A00.A07) {
            r1.A06 = true;
            r1.A0Q.A07(r1);
        }
    }

    public static final void A08(AnonymousClass6Ga r2) {
        PhotoView photoView = r2.A0N;
        if (photoView.getVisibility() != 0) {
            A05(r2);
            photoView.setVisibility(0);
            r2.A02.setVisibility(8);
            ViewGroup viewGroup = r2.A0C;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
        }
    }

    public long A0A() {
        int i;
        long j;
        AnonymousClass21X r0 = this.A0O;
        C62572rc A0M2 = AnonymousClass3Ma.A0M(r0);
        if (r0.A0v.A02 && !A0M2.A0V && !A0M2.A0U) {
            long j2 = A0M2.A0D;
            if (j2 >= 0) {
                long j3 = A0M2.A0E;
                if (j3 > 0) {
                    j = j3 - j2;
                    return Math.min(C17890vO.A03(C18020vd.A00(C18040vf.A02, this.A0K, 7902)), j);
                }
            }
        }
        AnonymousClass70X r02 = this.A04;
        if (r02 != null) {
            i = r02.A06();
        } else {
            i = 0;
        }
        j = (long) i;
        return Math.min(C17890vO.A03(C18020vd.A00(C18040vf.A02, this.A0K, 7902)), j);
    }

    public void A0F() {
        AnonymousClass89N r2 = this.A0Z;
        if (r2 != null) {
            C1409373q r1 = this.A0Q;
            List list = r1.A02;
            if (list == null) {
                list = AnonymousClass000.A13();
                r1.A02 = list;
            }
            list.add(r2);
        }
        A0J(this.A0Q.A04);
        int i = 0;
        if (this.A0A) {
            this.A0A = false;
            A03(this);
        }
        if (!this.A07) {
            A04(this);
            AnonymousClass70X r11 = this.A04;
            if (r11 != null) {
                AnonymousClass21X r0 = this.A0O;
                C62572rc r10 = r0.A02;
                if (r10 != null) {
                    boolean z = r10.A0V;
                    boolean z2 = r10.A0U;
                    boolean z3 = r0.A0v.A02;
                    if (z3 && !z2) {
                        long j = r10.A0D;
                        if (j >= 0 && r10.A0E > 0) {
                            i = (int) j;
                        }
                    }
                    r11.A0M(i);
                    if (z3 && !z && !z2 && r10.A0T) {
                        A0J(true);
                    }
                    AnonymousClass70X r02 = this.A04;
                    if (r02 != null) {
                        r02.A0E();
                    }
                    DoodleView doodleView = this.A0M;
                    if (doodleView != null) {
                        C1410073x.A02(doodleView);
                    }
                    A07(this);
                    return;
                }
                throw C17890vO.A0K();
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("video player is null for ");
            A10.append(this.A0O.A0v);
            throw AnonymousClass000.A0m(A10);
        }
    }

    public void A0J(boolean z) {
        if (!(this instanceof AnonymousClass6GZ)) {
            this.A09 = z;
            AnonymousClass70X r0 = this.A04;
            if (r0 != null) {
                r0.A0W(z);
            }
            A07(this);
        }
    }

    public static final void A05(AnonymousClass6Ga r3) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("videoContainer=");
        boolean z = true;
        A10.append(AnonymousClass000.A1P(r3.A02.getVisibility()));
        A10.append("videoPlaybackContainerOverlay=");
        A10.append(C108995ce.A1U(r3.A0F));
        A10.append("photoView=");
        A10.append(C108995ce.A1U(r3.A0N));
        A10.append("mainView=");
        if (r3.A0G.getVisibility() != 0) {
            z = false;
        }
        A10.append(z);
        A10.append(" isPlaybackStarted=");
        A10.append(r3.A05.A00.A07);
        A10.toString();
    }

    public static final void A06(AnonymousClass6Ga r4) {
        C122076Mr r0;
        A05(r4);
        r4.A0S.setVisibility(8);
        AnonymousClass70X r3 = r4.A04;
        if (r3 != null) {
            r3.A08 = null;
            r3.A0A = null;
            r3.A09 = null;
            r3.A0S((AnonymousClass88O) null);
            if (r3.A0c()) {
                C131106kW r1 = r4.A0T;
                if (r4.A0V) {
                    r0 = r1.A00;
                } else {
                    r0 = r1.A01;
                }
                if (r0 != null) {
                    r0.A0L();
                }
            } else {
                r3.A0F();
            }
            try {
                r3.A0C();
            } catch (Exception unused) {
                Log.w("Failed to post field stats from status player release");
            }
        }
        r4.A04 = null;
    }

    public void A0E() {
        A05(this);
        AnonymousClass70X r0 = this.A04;
        if (r0 != null) {
            r0.A0B();
        }
        DoodleView doodleView = this.A0M;
        if (doodleView != null) {
            doodleView.A0J.A0A = false;
            doodleView.invalidate();
        }
        this.A0Q.A06(this);
        this.A06 = false;
        C132796nb r02 = this.A03;
        if (r02 != null) {
            r02.A03.dismiss();
        }
    }

    public void A0G() {
        List list;
        A05(this);
        AnonymousClass70X r1 = this.A04;
        if (r1 != null && !r1.A0c()) {
            r1.A0F();
        }
        DoodleView doodleView = this.A0M;
        if (doodleView != null) {
            doodleView.A0J.A0A = false;
            doodleView.invalidate();
        }
        C1409373q r2 = this.A0Q;
        r2.A06(this);
        this.A06 = false;
        A06(this);
        this.A0F.setVisibility(0);
        A08(this);
        this.A00 = 0.0f;
        this.A0B = true;
        AnonymousClass89N r12 = this.A0Z;
        if (r12 != null && (list = r2.A02) != null) {
            list.remove(r12);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x01b1, code lost:
        if (r7.A0T != false) goto L_0x00be;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x019c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6Ga(X.AnonymousClass1L9 r22, X.AnonymousClass190 r23, X.AnonymousClass1T1 r24, X.C218617r r25, X.AnonymousClass1KB r26, X.C36361nl r27, X.AnonymousClass11C r28, X.AnonymousClass11P r29, X.AnonymousClass118 r30, X.C18000vb r31, X.AnonymousClass1KW r32, X.C18030ve r33, X.AnonymousClass6gC r34, X.AnonymousClass689 r35, X.C25291Nq r36, X.AnonymousClass168 r37, X.C36341nj r38, X.AnonymousClass206 r39, X.C32741hg r40, X.C133426oj r41, X.C1409373q r42, X.C26631Sw r43, X.C32021gV r44, X.AnonymousClass10I r45, X.C131106kW r46, X.AnonymousClass00H r47) {
        /*
            r21 = this;
            r3 = r39
            r6 = 1
            r1 = 3
            r0 = 13
            r8 = r37
            X.C18070vi.A0d(r8, r0)
            r0 = 15
            r4 = r46
            X.C18070vi.A0d(r4, r0)
            r5 = 17
            r0 = 18
            r7 = r42
            X.C18070vi.A0d(r7, r0)
            r0 = 21
            r9 = r34
            X.C18070vi.A0d(r9, r0)
            r2 = r21
            r13 = r31
            r17 = r28
            r16 = r26
            r15 = r22
            r20 = r41
            r14 = r2
            r18 = r13
            r19 = r8
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r0 = r29
            r2.A0I = r0
            r15 = r33
            r2.A0K = r15
            r0 = r23
            r2.A0H = r0
            r0 = r30
            r2.A0J = r0
            r0 = r45
            r2.A0R = r0
            r0 = r35
            r2.A0X = r0
            r0 = r44
            r2.A0a = r0
            r2.A0T = r4
            r0 = r38
            r2.A0Y = r0
            r2.A0Q = r7
            r2.A0L = r9
            r0 = r27
            r2.A0W = r0
            r0 = r40
            r2.A0P = r0
            r0 = r47
            r2.A0U = r0
            r2.A0B = r6
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r2.A0E = r0
            r2.A01 = r1
            X.C17960vV.A07(r3)
            X.21X r3 = (X.AnonymousClass21X) r3
            r2.A0O = r3
            X.0vf r1 = X.C18040vf.A01
            r0 = 9228(0x240c, float:1.2931E-41)
            boolean r0 = X.C18020vd.A05(r1, r15, r0)
            r2.A0D = r0
            X.6oj r0 = r2.A05
            X.6Gp r4 = r0.A00
            android.content.Context r0 = r4.A0J()
            android.app.Activity r7 = X.AnonymousClass1L9.A00(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.status.playback.StatusPlaybackActivity"
            X.C18070vi.A0z(r7, r0)
            com.whatsapp.status.playback.StatusPlaybackActivity r7 = (com.whatsapp.status.playback.StatusPlaybackActivity) r7
            boolean r0 = r2.A0D
            if (r0 == 0) goto L_0x01af
            boolean r0 = r7.A0X
            if (r0 != 0) goto L_0x00be
            r0 = 2131436757(0x7f0b24d5, float:1.8495393E38)
            X.1bI r0 = X.AnonymousClass3Ma.A0x(r7, r0)
            android.view.View r1 = X.C72463Mc.A0N(r0)
            X.C18070vi.A0V(r1)
            r0 = 2131436759(0x7f0b24d7, float:1.8495397E38)
            android.view.ViewGroup r0 = X.AnonymousClass3MW.A0D(r1, r0)
            r0.setClipToOutline(r6)
            r7.A04 = r0
            com.whatsapp.status.playback.StatusPlaybackActivity.A0d(r7)
            r7.A0X = r6
        L_0x00be:
            r0 = 2131436757(0x7f0b24d5, float:1.8495393E38)
            android.view.View r0 = r7.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r2.A0C = r0
        L_0x00c9:
            r0 = 2131436759(0x7f0b24d7, float:1.8495397E38)
            android.view.View r0 = X.AnonymousClass3MY.A0H(r7, r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r2.A02 = r0
            r0 = 2131436760(0x7f0b24d8, float:1.84954E38)
            android.view.View r0 = X.AnonymousClass3MY.A0H(r7, r0)
            r2.A0F = r0
            android.content.Context r0 = r4.A0J()
            X.5fN r9 = new X.5fN
            r9.<init>(r0, r2)
            r2.A0G = r9
            android.content.Context r0 = r4.A0J()
            com.whatsapp.mediaview.PhotoView r11 = new com.whatsapp.mediaview.PhotoView
            r11.<init>(r0)
            r2.A0N = r11
            r0 = 0
            r11.A01 = r0
            r8 = 0
            r11.A0C(r8)
            r11.A0O = r8
            r11.setEnabled(r8)
            boolean r0 = r2.A0D
            if (r0 != 0) goto L_0x0118
            android.content.Context r0 = r4.A0J()
            android.content.res.Resources r10 = r0.getResources()
            android.content.Context r7 = r4.A0J()
            r1 = 2130968798(0x7f0400de, float:1.754626E38)
            r0 = 2131099872(0x7f0600e0, float:1.781211E38)
            X.C72463Mc.A0x(r7, r10, r11, r1, r0)
        L_0x0118:
            android.content.Context r7 = r4.A0J()
            r1 = 0
            com.whatsapp.videoplayback.ExoPlayerErrorFrame r0 = new com.whatsapp.videoplayback.ExoPlayerErrorFrame
            r0.<init>(r7, r1, r8)
            r2.A0S = r0
            r9.addView(r11)
            r9.addView(r0)
            r0 = 2131435668(0x7f0b2094, float:1.8493185E38)
            r9.setId(r0)
            A08(r2)
            X.2rc r10 = r3.A02
            if (r10 == 0) goto L_0x01b5
            X.205 r0 = r3.A0v
            boolean r0 = r0.A02
            java.lang.String r7 = r10.A0K
            r3 = 0
            if (r0 == 0) goto L_0x01ad
            boolean r0 = r10.A0V
            if (r0 != 0) goto L_0x01ad
            boolean r0 = r10.A0U
            if (r0 != 0) goto L_0x01ad
            if (r7 == 0) goto L_0x01ad
            r0 = r25
            java.io.File r18 = X.C26511Sk.A0H(r0, r7)
            boolean r0 = r18.exists()
            if (r0 == 0) goto L_0x01ad
            android.content.Context r0 = r4.A0J()
            com.whatsapp.mediacomposer.doodle.DoodleView r7 = new com.whatsapp.mediacomposer.doodle.DoodleView
            r7.<init>(r0)
            X.6yp r10 = X.C1409573s.A06
            android.content.Context r11 = r4.A0J()
            r14 = r32
            r12 = r24
            r17 = r43
            r16 = r36
            X.73s r0 = r10.A01(r11, r12, r13, r14, r15, r16, r17, r18)
            if (r0 == 0) goto L_0x0185
            r7.setLayerType(r6, r1)
            r7.setEnabled(r8)
            r7.setDoodle(r0)
            r1 = -1
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r1, r1, r5)
            r9.addView(r7, r0)
        L_0x0185:
            r2.A0M = r7
            X.7ME r0 = new X.7ME
            r0.<init>(r2, r8)
            r2.A0Z = r0
            android.content.Context r0 = r4.A0J()
            android.app.Activity r0 = X.AnonymousClass1L9.A00(r0)
            android.content.ComponentName r0 = r0.getCallingActivity()
            if (r0 == 0) goto L_0x01a0
            java.lang.String r3 = r0.getClassName()
        L_0x01a0:
            java.lang.Class<com.whatsapp.status.playback.StatusPlaybackActivity> r0 = com.whatsapp.status.playback.StatusPlaybackActivity.class
            java.lang.String r0 = r0.getName()
            boolean r0 = X.C18070vi.A18(r3, r0)
            r2.A0V = r0
            return
        L_0x01ad:
            r7 = r1
            goto L_0x0185
        L_0x01af:
            boolean r0 = r7.A0T
            if (r0 == 0) goto L_0x00c9
            goto L_0x00be
        L_0x01b5:
            java.lang.IllegalArgumentException r0 = X.C17890vO.A0K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Ga.<init>(X.1L9, X.190, X.1T1, X.17r, X.1KB, X.1nl, X.11C, X.11P, X.118, X.0vb, X.1KW, X.0ve, X.6gC, X.689, X.1Nq, X.168, X.1nj, X.206, X.1hg, X.6oj, X.73q, X.1Sw, X.1gV, X.10I, X.6kW, X.00H):void");
    }
}
