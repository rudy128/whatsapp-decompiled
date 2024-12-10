package com.whatsapp.mediacomposer;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass18K;
import X.AnonymousClass1A3;
import X.AnonymousClass1D6;
import X.AnonymousClass1DF;
import X.AnonymousClass1FL;
import X.AnonymousClass1KB;
import X.AnonymousClass1KW;
import X.AnonymousClass1OB;
import X.AnonymousClass1T1;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass69R;
import X.AnonymousClass70X;
import X.AnonymousClass72S;
import X.AnonymousClass73D;
import X.AnonymousClass78K;
import X.AnonymousClass7AO;
import X.AnonymousClass7AT;
import X.AnonymousClass7HT;
import X.AnonymousClass7JF;
import X.AnonymousClass7JN;
import X.AnonymousClass7JO;
import X.AnonymousClass7JP;
import X.AnonymousClass7JS;
import X.AnonymousClass7Pq;
import X.AnonymousClass7RA;
import X.AnonymousClass7x4;
import X.AnonymousClass7x5;
import X.AnonymousClass80C;
import X.AnonymousClass80D;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C108975cc;
import X.C108995ce;
import X.C111125iM;
import X.C131126kY;
import X.C134776r8;
import X.C135276rw;
import X.C136166tN;
import X.C136986uj;
import X.C137326vH;
import X.C139426yp;
import X.C1403571b;
import X.C1405471x;
import X.C1409573s;
import X.C1420377x;
import X.C144387Hc;
import X.C146077Ns;
import X.C151947n7;
import X.C151957n8;
import X.C151967n9;
import X.C151977nA;
import X.C151987nB;
import X.C151997nC;
import X.C152007nD;
import X.C152017nE;
import X.C156257u4;
import X.C156267u5;
import X.C156277u6;
import X.C160888Ai;
import X.C17880vN;
import X.C17900vP;
import X.C17960vV;
import X.C17970vW;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18090vk;
import X.C18100vl;
import X.C18600wl;
import X.C22791Df;
import X.C22851Dl;
import X.C25186Cac;
import X.C25291Nq;
import X.C26052CrM;
import X.C26431Sc;
import X.C26631Sw;
import X.C28931bI;
import X.C30391dr;
import X.C30451dy;
import X.C31131f4;
import X.C37581pm;
import X.C41561wd;
import X.C59382mD;
import X.C64052u8;
import X.C72453Mb;
import X.C72463Mc;
import X.C88584aA;
import X.C99274sY;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.mediacomposer.viewmodel.MediaJidViewModel;
import com.whatsapp.mediacomposer.viewmodel.MediaQualityViewModel;
import com.whatsapp.mediacomposer.viewmodel.VideoComposerViewModel;
import com.whatsapp.mediacomposer.viewmodel.VideoComposerViewModel$prepareData$1;
import com.whatsapp.pushtorecordmedia.MediaProgressRing;
import com.whatsapp.pushtorecordmedia.MediaTimeDisplay;
import com.whatsapp.util.Log;
import com.whatsapp.videoplayback.VideoSurfaceView;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;

public class VideoComposerFragment extends Hilt_VideoComposerFragment {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05 = -1;
    public long A06;
    public long A07;
    public View A08;
    public View A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public View A0D;
    public FrameLayout A0E;
    public FrameLayout A0F;
    public ImageView A0G;
    public ImageView A0H;
    public TextView A0I;
    public TextView A0J;
    public TextView A0K;
    public C22851Dl A0L;
    public C31131f4 A0M;
    public AnonymousClass18K A0N;
    public C1403571b A0O;
    public C26431Sc A0P;
    public VideoTimelineView A0Q;
    public C136986uj A0R;
    public AnonymousClass1A3 A0S;
    public C1405471x A0T;
    public C28931bI A0U;
    public C28931bI A0V;
    public AnonymousClass70X A0W;
    public AnonymousClass00H A0X;
    public AnonymousClass00H A0Y;
    public File A0Z;
    public C18090vk A0a;
    public C18600wl A0b;
    public C18600wl A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public AnonymousClass1OB A0k;
    public final View.OnAttachStateChangeListener A0l;
    public final View.OnClickListener A0m;
    public final View.OnClickListener A0n;
    public final View.OnClickListener A0o;
    public final Runnable A0p;
    public final Map A0q = C17880vN.A13();
    public final C18100vl A0r = AnonymousClass1DF.A01(AnonymousClass7x4.A00);
    public final C18100vl A0s = AnonymousClass1DF.A01(new C151947n7(this));
    public final C18100vl A0t = AnonymousClass1DF.A01(new C151957n8(this));
    public final C18100vl A0u = AnonymousClass1DF.A01(new C151967n9(this));
    public final C18100vl A0v;
    public final C18100vl A0w;
    public final C18100vl A0x = AnonymousClass1DF.A01(AnonymousClass7x5.A00);

    public static final long A03(VideoComposerFragment videoComposerFragment) {
        return videoComposerFragment.A02((C59382mD) videoComposerFragment.A0u.getValue(), 3, videoComposerFragment.A03, videoComposerFragment.A04);
    }

    public static final long A04(VideoComposerFragment videoComposerFragment) {
        return videoComposerFragment.A02((C59382mD) videoComposerFragment.A0t.getValue(), 0, videoComposerFragment.A04, videoComposerFragment.A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (A2V() != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A1q(android.os.Bundle r4, android.view.LayoutInflater r5, android.view.ViewGroup r6) {
        /*
            r3 = this;
            r2 = 0
            X.C18070vi.A0d(r5, r2)
            java.lang.String r0 = "VideoComposerFragment/onCreateView"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r3.A2U()
            if (r0 != 0) goto L_0x0018
            boolean r1 = r3.A2V()
            r0 = 2131627347(0x7f0e0d53, float:1.8881956E38)
            if (r1 == 0) goto L_0x001b
        L_0x0018:
            r0 = 2131627348(0x7f0e0d54, float:1.8881958E38)
        L_0x001b:
            android.view.View r0 = X.C108955ca.A0G(r5, r6, r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.VideoComposerFragment.A1q(android.os.Bundle, android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    public void A20(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        bundle.putBoolean("key_video_is_muted", this.A0e);
    }

    public void A21(Bundle bundle, View view) {
        File file;
        Integer A032;
        Uri uri;
        View view2 = view;
        C18070vi.A0d(view2, 0);
        Bundle bundle2 = bundle;
        super.A21(bundle, view2);
        Log.i("VideoComposerFragment/onViewCreated");
        Uri uri2 = this.A01;
        if (uri2 != null) {
            int i = 0;
            C17960vV.A0D(AnonymousClass000.A1X(this.A0W));
            this.A0C = view2.findViewById(2131436756);
            this.A0J = C17880vN.A0E(view2, 2131435469);
            this.A0I = C17880vN.A0E(view2, 2131430189);
            this.A0K = C17880vN.A0E(view2, 2131436445);
            this.A0A = view2.findViewById(2131436446);
            this.A0H = AnonymousClass3MW.A0H(view2, 2131436752);
            this.A08 = view2.findViewById(2131432887);
            this.A0G = AnonymousClass3MW.A0H(view2, 2131432886);
            View findViewById = view2.findViewById(2131436747);
            this.A0B = findViewById;
            int A0D2 = C72453Mb.A0D(findViewById);
            this.A0D = view2.findViewById(2131436770);
            View findViewById2 = view2.findViewById(2131433882);
            if (A0F(this)) {
                findViewById2.setVisibility(A0D2);
            }
            AnonymousClass78K.A00(findViewById2, this, 21);
            this.A09 = findViewById2;
            this.A0E = (FrameLayout) view2.findViewById(2131436762);
            this.A0F = (FrameLayout) view2.findViewById(2131436765);
            this.A0U = C28931bI.A00(view2, 2131436444);
            this.A0V = C28931bI.A00(view2, 2131436753);
            Uri uri3 = this.A01;
            if (uri3 != null) {
                C160888Ai A29 = A29();
                if (A29 != null) {
                    uri = A29.BN2();
                } else {
                    uri = null;
                }
                if (uri3.equals(uri)) {
                    A17().findViewById(2131429510).setVisibility(4);
                    AnonymousClass1FL A1B = A1B();
                    if (A1B != null) {
                        A1B.A2Z();
                    }
                }
            }
            C18100vl r3 = this.A0w;
            AnonymousClass7AT.A01(A1G(), ((VideoComposerViewModel) r3.getValue()).A00, new AnonymousClass80C(this), 42);
            C18100vl r5 = this.A0v;
            if (((C111125iM) AnonymousClass7AT.A00(A1G(), C108945cZ.A0n(r5).A03, r5, new AnonymousClass80D(this), 42)).A01.A00 <= 0) {
                C108945cZ.A0n(r5).A01.A0A(A1G(), this.A0L);
            }
            C160888Ai A292 = A29();
            if (A292 != null) {
                file = AnonymousClass73D.A00(uri2, A292).A0C();
            } else {
                file = null;
            }
            this.A0Z = file;
            C160888Ai A293 = A29();
            if (!(A293 == null || (A032 = MediaQualityViewModel.A03((MediaComposerActivity) A293)) == null)) {
                i = A032.intValue();
            }
            this.A00 = i;
            VideoComposerViewModel videoComposerViewModel = (VideoComposerViewModel) r3.getValue();
            File file2 = this.A0Z;
            AnonymousClass1FL A1D = A1D();
            C160888Ai A294 = A29();
            C131126kY A0T2 = ((MediaJidViewModel) this.A0o.getValue()).A0T();
            C18070vi.A0b(A1D);
            C18070vi.A0d(A0T2, 5);
            AnonymousClass3MX.A1Q(new VideoComposerViewModel$prepareData$1(A1D, uri2, bundle2, A294, videoComposerViewModel, A0T2, file2, (C30391dr) null), C41561wd.A00(videoComposerViewModel));
        }
    }

    public void A2I() {
        C18090vk r0 = this.A0a;
        if (r0 != null) {
            r0.invoke();
        }
        this.A0a = null;
        super.A2I();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: X.70X} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: X.BwG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v38, resolved type: X.BwG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: X.BwG} */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x013d, code lost:
        if (r4 == true) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0190, code lost:
        if (r4 != true) goto L_0x0192;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0352  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03af  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x03d4  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x03f1  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x040a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2Y(android.net.Uri r33, X.AnonymousClass7JT r34, long r35) {
        /*
            r32 = this;
            r3 = 0
            r2 = r32
            X.8Ai r0 = r2.A29()
            if (r0 == 0) goto L_0x04d6
            com.whatsapp.mediacomposer.MediaComposerActivity r0 = (com.whatsapp.mediacomposer.MediaComposerActivity) r0
            X.6uj r0 = X.C108955ca.A0U(r0)
            if (r0 == 0) goto L_0x04d6
            r2.A0R = r0
            r14 = r34
            X.1D6 r11 = r14.A04
            r1 = 0
            r0 = 1
            r8 = 2
            X.11P r7 = r2.A0A
            if (r7 == 0) goto L_0x04d0
            X.0ve r17 = r2.A28()
            X.18K r6 = r2.A0N
            if (r6 == 0) goto L_0x04ca
            X.71x r10 = r2.A0T
            if (r10 == 0) goto L_0x01c8
            long r4 = r10.A03
        L_0x002c:
            long r22 = X.C17880vN.A04(r4)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r8)
            if (r10 == 0) goto L_0x01c5
            int r4 = r10.A02
        L_0x0038:
            long r8 = (long) r4
            if (r10 == 0) goto L_0x01c2
            int r4 = r10.A00
        L_0x003d:
            long r4 = (long) r4
            r24 = -1
            r13 = 2
            X.6Ml r12 = new X.6Ml
            r26 = r35
            r15 = r12
            r16 = r7
            r18 = r6
            r20 = r0
            r21 = r13
            r28 = r8
            r30 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r24, r26, r28, r30)
            java.io.File r8 = r2.A0Z
            r5 = r33
            if (r8 == 0) goto L_0x0113
            X.1pm r7 = X.AnonymousClass3MZ.A0G(r2)
            X.0wl r6 = r2.A0b
            if (r6 == 0) goto L_0x04c4
            com.whatsapp.mediacomposer.VideoComposerFragment$setBitrateInVideoStat$1 r4 = new com.whatsapp.mediacomposer.VideoComposerFragment$setBitrateInVideoStat$1
            r4.<init>(r2, r12, r8, r1)
            X.AnonymousClass3MW.A1X(r6, r4, r7)
            X.0ve r4 = r2.A28()
            boolean r4 = X.C1402270m.A02(r4)
            if (r4 == 0) goto L_0x0168
            int r4 = X.C108955ca.A09(r11)
            int r6 = X.AnonymousClass3MZ.A04(r11)
            X.0ve r20 = r2.A28()
            X.190 r11 = r2.A04
            if (r11 == 0) goto L_0x049d
            X.1FL r16 = r2.A1D()
            X.11C r10 = r2.A09
            if (r10 == 0) goto L_0x0499
            X.Cm1 r9 = new X.Cm1
            r9.<init>(r4, r6, r3)
            android.content.Context r4 = r2.A14()
            X.CrM r17 = X.CDC.A00(r4, r8)
            X.C18070vi.A0b(r16)
            X.847 r7 = new X.847
            r7.<init>(r2)
            X.82O r6 = new X.82O
            r6.<init>(r5, r2)
            X.BwG r4 = new X.BwG
            r15 = r4
            r18 = r11
            r19 = r10
            r21 = r12
            r22 = r9
            r23 = r8
            r24 = r6
            r25 = r7
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r4.A0G()
        L_0x00be:
            r2.A0W = r4
            android.view.View r4 = r4.A09()
            if (r4 == 0) goto L_0x00c9
            r2.A2O(r4)
        L_0x00c9:
            boolean r4 = r2.A2V()
            if (r4 == 0) goto L_0x0113
            X.71x r6 = r2.A0T
            r9 = 0
            if (r6 == 0) goto L_0x00e8
            boolean r4 = r6.A02()
            if (r4 != r0) goto L_0x0164
            int r1 = r6.A00
        L_0x00dc:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            if (r4 != r0) goto L_0x0161
            int r4 = r6.A02
        L_0x00e4:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
        L_0x00e8:
            X.70X r4 = r2.A0W
            if (r4 == 0) goto L_0x0113
            android.view.View r8 = r4.A09()
            if (r8 == 0) goto L_0x0113
            r7 = 0
            int r6 = X.C72463Mc.A0B(r1)
            if (r9 == 0) goto L_0x00fd
            int r7 = r9.intValue()
        L_0x00fd:
            android.content.res.Resources r4 = X.AnonymousClass3MZ.A09(r2)
            r1 = 2131168804(0x7f070e24, float:1.795192E38)
            int r4 = r4.getDimensionPixelSize(r1)
            boolean r1 = r2.A2V()
            if (r1 == 0) goto L_0x0113
            android.graphics.Matrix$ScaleToFit r1 = android.graphics.Matrix.ScaleToFit.CENTER
            X.AnonymousClass4aO.A01(r1, r8, r6, r7, r4)
        L_0x0113:
            X.70X r6 = r2.A0W
            if (r6 == 0) goto L_0x012d
            boolean r1 = r6 instanceof X.C122076Mr
            if (r1 == 0) goto L_0x011d
            r6.A01 = r13
        L_0x011d:
            android.view.View r4 = r6.A09()
            android.view.View$OnAttachStateChangeListener r1 = r2.A0l
            r4.addOnAttachStateChangeListener(r1)
            X.7No r1 = new X.7No
            r1.<init>(r2)
            r6.A06 = r1
        L_0x012d:
            X.8Ai r1 = r2.A29()
            r8 = 0
            if (r1 == 0) goto L_0x015f
            X.72S r1 = X.AnonymousClass73D.A00(r5, r1)
            boolean r4 = r1.A0W()
            r1 = 1
            if (r4 != r0) goto L_0x015f
        L_0x013f:
            r2.A0g = r1
            r6 = 0
            r2.A06 = r6
            X.71x r1 = r2.A0T
            if (r1 == 0) goto L_0x014b
            long r6 = r1.A03
        L_0x014b:
            r2.A02 = r6
            r2.A07 = r6
            r2.A04 = r6
            r2.A03 = r6
            X.8Ai r1 = r2.A29()
            if (r1 == 0) goto L_0x01d3
            X.72S r1 = X.AnonymousClass73D.A00(r5, r1)
            monitor-enter(r1)
            goto L_0x01cc
        L_0x015f:
            r1 = 0
            goto L_0x013f
        L_0x0161:
            int r4 = r6.A00
            goto L_0x00e4
        L_0x0164:
            int r1 = r6.A02
            goto L_0x00dc
        L_0x0168:
            X.190 r11 = r2.A04
            if (r11 == 0) goto L_0x04be
            X.0ve r20 = r2.A28()
            X.1KB r10 = r2.A07
            if (r10 == 0) goto L_0x04ba
            X.11C r9 = r2.A09
            if (r9 == 0) goto L_0x04b6
            android.content.Context r15 = r2.A14()
            X.118 r7 = r2.A0B
            if (r7 == 0) goto L_0x04b0
            X.8Ai r4 = r2.A29()
            if (r4 == 0) goto L_0x0192
            X.72S r6 = X.AnonymousClass73D.A00(r5, r4)
            monitor-enter(r6)
            boolean r4 = r6.A0K     // Catch:{ all -> 0x04a3 }
            monitor-exit(r6)
            r26 = 1
            if (r4 == r0) goto L_0x0194
        L_0x0192:
            r26 = 0
        L_0x0194:
            boolean r4 = X.C39761tb.A01()
            boolean r27 = X.AnonymousClass000.A1O(r4)
            X.10I r6 = r2.A0V
            if (r6 == 0) goto L_0x04ac
            X.00H r4 = r2.A0Y
            if (r4 == 0) goto L_0x04a6
            java.lang.Object r4 = r4.get()
            X.6gC r4 = (X.AnonymousClass6gC) r4
            r19 = r7
            r21 = r4
            r22 = r6
            r23 = r12
            r24 = r8
            r25 = r3
            r16 = r11
            r17 = r10
            r18 = r9
            X.70X r4 = X.AnonymousClass70X.A04(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x00be
        L_0x01c2:
            r4 = 0
            goto L_0x003d
        L_0x01c5:
            r4 = 0
            goto L_0x0038
        L_0x01c8:
            r4 = 0
            goto L_0x002c
        L_0x01cc:
            r1.A02 = r6     // Catch:{ all -> 0x01cf }
            goto L_0x01d2
        L_0x01cf:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x01d2:
            monitor-exit(r1)
        L_0x01d3:
            X.8Ai r1 = r2.A29()
            if (r1 == 0) goto L_0x0489
            com.whatsapp.mediacomposer.MediaComposerActivity r1 = (com.whatsapp.mediacomposer.MediaComposerActivity) r1
            java.util.List r6 = com.whatsapp.mediacomposer.viewmodel.MediaJidViewModel.A04(r1)
            int r4 = r6.size()
            r1 = 0
            if (r4 != r0) goto L_0x01f0
            java.lang.Object r0 = r6.get(r3)
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            boolean r1 = X.C22971Dz.A0a(r0)
        L_0x01f0:
            r2.A0i = r1
            X.8Ai r0 = r2.A29()
            if (r0 == 0) goto L_0x0202
            com.whatsapp.mediacomposer.MediaComposerActivity r0 = (com.whatsapp.mediacomposer.MediaComposerActivity) r0
            java.util.List r0 = com.whatsapp.mediacomposer.viewmodel.MediaJidViewModel.A04(r0)
            boolean r8 = X.C22971Dz.A0h(r0)
        L_0x0202:
            r2.A0h = r8
            X.8Ai r1 = r2.A29()
            r0 = 0
            if (r1 == 0) goto L_0x020f
            android.net.Uri r0 = r1.BN2()
        L_0x020f:
            boolean r0 = X.C18070vi.A18(r5, r0)
            if (r0 == 0) goto L_0x0223
            X.70X r0 = r2.A0W
            if (r0 == 0) goto L_0x0223
            android.view.View r1 = r0.A09()
            if (r1 == 0) goto L_0x0223
            r0 = 0
            r1.setAlpha(r0)
        L_0x0223:
            X.0ve r1 = r2.A28()
            r0 = 11620(0x2d64, float:1.6283E-41)
            boolean r1 = X.C25291Nq.A04(r1, r0)
            boolean r0 = r2.A0E()
            if (r1 == 0) goto L_0x043d
            if (r0 == 0) goto L_0x0426
            boolean r0 = A0F(r2)
            if (r0 != 0) goto L_0x0426
            X.8Ai r0 = r2.A29()
            if (r0 == 0) goto L_0x0422
            X.72S r0 = X.AnonymousClass73D.A00(r5, r0)
            boolean r0 = r0.A0U()
        L_0x0249:
            r2.A0e = r0
            A0D(r2)
            X.8Ai r0 = r2.A29()
            if (r0 == 0) goto L_0x0261
            com.whatsapp.mediacomposer.MediaComposerActivity r0 = (com.whatsapp.mediacomposer.MediaComposerActivity) r0
            X.7JN r0 = r0.A0a
            if (r0 == 0) goto L_0x0261
            com.whatsapp.mediacomposer.bottombar.BottomBarView r0 = r0.A07
            X.1bI r0 = r0.A05
            r0.A04(r3)
        L_0x0261:
            X.8Ai r0 = r2.A29()
            if (r0 == 0) goto L_0x0274
            com.whatsapp.mediacomposer.MediaComposerActivity r0 = (com.whatsapp.mediacomposer.MediaComposerActivity) r0
            X.7JN r0 = r0.A0a
            if (r0 == 0) goto L_0x0274
            android.view.View$OnClickListener r1 = r2.A0m
            com.whatsapp.mediacomposer.bottombar.BottomBarView r0 = r0.A07
            r0.setMuteButtonClickListener(r1)
        L_0x0274:
            X.8Ai r0 = r2.A29()
            if (r0 == 0) goto L_0x0287
            com.whatsapp.mediacomposer.MediaComposerActivity r0 = (com.whatsapp.mediacomposer.MediaComposerActivity) r0
            X.7JN r0 = r0.A0a
            if (r0 == 0) goto L_0x0287
            android.view.View$OnClickListener r1 = r2.A0n
            com.whatsapp.mediacomposer.bottombar.BottomBarView r0 = r0.A07
            r0.setTrimButtonClickLister(r1)
        L_0x0287:
            A0C(r2)
        L_0x028a:
            android.view.View r0 = r2.A0B
            if (r0 == 0) goto L_0x0291
            r0.setVisibility(r3)
        L_0x0291:
            android.os.Bundle r10 = r14.A02
            long r3 = A04(r2)
            boolean r0 = r2.A0d
            if (r0 == 0) goto L_0x041f
            long r0 = A03(r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x02a3:
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            X.1D6 r1 = X.AnonymousClass1D6.A01(r0, r1)
            X.8Ai r9 = r2.A29()
            java.lang.Object r0 = r1.first
            long r15 = X.C17880vN.A05(r0)
            java.lang.Object r8 = r1.second
            java.lang.Number r8 = (java.lang.Number) r8
            X.8Ai r0 = r2.A29()
            if (r0 == 0) goto L_0x041c
            com.whatsapp.mediacomposer.MediaComposerActivity r0 = (com.whatsapp.mediacomposer.MediaComposerActivity) r0
            java.util.List r1 = com.whatsapp.mediacomposer.viewmodel.MediaJidViewModel.A04(r0)
            java.util.List r0 = com.whatsapp.mediacomposer.viewmodel.MediaJidViewModel.A04(r0)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x041c
            X.1cg r0 = X.C29671cg.A00
            boolean r14 = r1.contains(r0)
        L_0x02d5:
            if (r9 == 0) goto L_0x0350
            X.0vl r0 = r2.A0t
            java.lang.Object r0 = r0.getValue()
            X.2mD r0 = (X.C59382mD) r0
            int r3 = r0.A00
            int r1 = r9.BUd()
            r0 = 54
            if (r1 != r0) goto L_0x02f5
            X.0ve r3 = r2.A28()
            r1 = 8606(0x219e, float:1.206E-41)
            X.0vf r0 = X.C18040vf.A02
            int r3 = X.C18020vd.A00(r0, r3, r1)
        L_0x02f5:
            long r3 = (long) r3
            r11 = 1048576(0x100000, double:5.180654E-318)
            long r6 = r3 * r11
            int r0 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0308
            long r0 = X.C108995ce.A09(r2)
            long r0 = r0 * r3
            long r0 = r0 * r11
            long r0 = r0 / r15
            r2.A04 = r0
        L_0x0308:
            long r0 = r2.A04
            int r11 = r9.BUU(r0)
            if (r11 <= 0) goto L_0x0350
            long r6 = r2.A04
            long r3 = (long) r11
            r12 = 1000(0x3e8, double:4.94E-321)
            long r0 = r3 * r12
            int r12 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r12 <= 0) goto L_0x0350
            r2.A04 = r0
            X.0ve r6 = r2.A28()
            r1 = 4361(0x1109, float:6.111E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r6, r1)
            if (r0 == 0) goto L_0x0350
            boolean r0 = r2.A0i
            if (r0 != 0) goto L_0x040d
            if (r14 != 0) goto L_0x040d
            X.00H r0 = r2.A0X
            if (r0 == 0) goto L_0x0492
            java.lang.Object r0 = r0.get()
            X.6zi r0 = (X.C139956zi) r0
            X.1KB r13 = r0.A00
            X.0vb r12 = r0.A01
            r7 = 2131755488(0x7f1001e0, float:1.9141857E38)
            r6 = 1
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r0 = 0
            X.C17880vN.A1T(r1, r11, r0)
            java.lang.String r0 = r12.A0K(r1, r7, r3)
            r13.A0G(r0, r6)
        L_0x0350:
            if (r8 == 0) goto L_0x039d
            long r13 = r8.longValue()
            if (r9 == 0) goto L_0x039d
            X.0vl r0 = r2.A0t
            java.lang.Object r0 = r0.getValue()
            X.2mD r0 = (X.C59382mD) r0
            int r3 = r0.A00
            int r1 = r9.BUd()
            r0 = 54
            if (r1 != r0) goto L_0x0376
            X.0ve r3 = r2.A28()
            r1 = 8606(0x219e, float:1.206E-41)
            X.0vf r0 = X.C18040vf.A02
            int r3 = X.C18020vd.A00(r0, r3, r1)
        L_0x0376:
            long r3 = (long) r3
            r11 = 1048576(0x100000, double:5.180654E-318)
            long r6 = r3 * r11
            int r0 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0389
            long r0 = X.C108995ce.A09(r2)
            long r0 = r0 * r3
            long r0 = r0 * r11
            long r0 = r0 / r13
            r2.A03 = r0
        L_0x0389:
            long r0 = r2.A03
            int r0 = r9.BUU(r0)
            if (r0 <= 0) goto L_0x039d
            long r6 = r2.A03
            long r3 = X.C17890vO.A03(r0)
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x039d
            r2.A03 = r3
        L_0x039d:
            int r1 = r2.A00
            r0 = 3
            if (r1 != r0) goto L_0x040a
            long r6 = r2.A03
        L_0x03a4:
            r2.A02 = r6
            long r8 = X.C108995ce.A09(r2)
            r4 = 0
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x03c0
            X.00H r0 = r2.A0Z
            if (r0 == 0) goto L_0x048c
            java.lang.Object r3 = r0.get()
            X.A4v r3 = (X.C20050A4v) r3
            r1 = 8
            r0 = 11
            r3.A02(r4, r1, r0)
        L_0x03c0:
            long r0 = r2.A02
            r2.A07 = r0
            X.8Ai r0 = r2.A29()
            if (r0 == 0) goto L_0x03f1
            X.72S r0 = X.AnonymousClass73D.A00(r5, r0)
            android.graphics.Point r3 = r0.A04()
            if (r3 == 0) goto L_0x03f1
            int r0 = r3.x
            long r0 = (long) r0
            r2.A06 = r0
            int r0 = r3.y
            long r0 = (long) r0
            r2.A07 = r0
        L_0x03de:
            X.7w0 r1 = new X.7w0
            r1.<init>(r5, r10, r2)
            A04(r2)
            boolean r0 = r2.A0d
            if (r0 == 0) goto L_0x03ed
            A03(r2)
        L_0x03ed:
            r1.invoke()
            return
        L_0x03f1:
            X.8Ai r3 = r2.A29()
            if (r3 == 0) goto L_0x03de
            long r0 = r2.A06
            long r6 = r2.A07
            X.72S r4 = X.AnonymousClass73D.A00(r5, r3)
            int r3 = (int) r0
            int r1 = (int) r6
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r3, r1)
            r4.A0L(r0)
            goto L_0x03de
        L_0x040a:
            long r6 = r2.A04
            goto L_0x03a4
        L_0x040d:
            X.00H r0 = r2.A0X
            if (r0 == 0) goto L_0x0492
            java.lang.Object r0 = r0.get()
            X.6zi r0 = (X.C139956zi) r0
            r0.A02(r11)
            goto L_0x0350
        L_0x041c:
            r14 = 0
            goto L_0x02d5
        L_0x041f:
            r1 = 0
            goto L_0x02a3
        L_0x0422:
            boolean r0 = r2.A0e
            goto L_0x0249
        L_0x0426:
            X.8Ai r0 = r2.A29()
            if (r0 == 0) goto L_0x028a
            com.whatsapp.mediacomposer.MediaComposerActivity r0 = (com.whatsapp.mediacomposer.MediaComposerActivity) r0
            X.7JN r0 = r0.A0a
            if (r0 == 0) goto L_0x028a
            com.whatsapp.mediacomposer.bottombar.BottomBarView r0 = r0.A07
            X.1bI r1 = r0.A05
            r0 = 8
            r1.A04(r0)
            goto L_0x028a
        L_0x043d:
            if (r0 == 0) goto L_0x046c
            boolean r0 = A0F(r2)
            if (r0 != 0) goto L_0x046c
            X.8Ai r0 = r2.A29()
            if (r0 == 0) goto L_0x0469
            X.72S r0 = X.AnonymousClass73D.A00(r5, r0)
            boolean r0 = r0.A0U()
        L_0x0453:
            r2.A0e = r0
            A0D(r2)
            A0C(r2)
            android.view.View r1 = r2.A08
            if (r1 == 0) goto L_0x028a
            r1.setVisibility(r3)
            android.view.View$OnClickListener r0 = r2.A0m
            r1.setOnClickListener(r0)
            goto L_0x028a
        L_0x0469:
            boolean r0 = r2.A0e
            goto L_0x0453
        L_0x046c:
            com.whatsapp.mediacomposer.VideoTimelineView r0 = r2.A0Q
            int r1 = X.C72453Mb.A0D(r0)
            android.widget.ImageView r0 = r2.A0H
            if (r0 == 0) goto L_0x0479
            r0.setVisibility(r1)
        L_0x0479:
            android.view.View r0 = r2.A08
            if (r0 == 0) goto L_0x0480
            r0.setVisibility(r1)
        L_0x0480:
            android.view.View r0 = r2.A0C
            if (r0 == 0) goto L_0x028a
            r0.setVisibility(r1)
            goto L_0x028a
        L_0x0489:
            r1 = 0
            goto L_0x01f0
        L_0x048c:
            java.lang.String r0 = "mediaSharingUserJourneyLogger"
            X.C18070vi.A11(r0)
            throw r4
        L_0x0492:
            java.lang.String r0 = "mediaUI"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0499:
            X.AnonymousClass3MW.A1N()
            throw r1
        L_0x049d:
            java.lang.String r0 = "crashLogs"
            X.C18070vi.A11(r0)
            throw r1
        L_0x04a3:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x04a6:
            java.lang.String r0 = "heroSettingProvider"
            X.C18070vi.A11(r0)
            throw r1
        L_0x04ac:
            X.AnonymousClass3MW.A1G()
            throw r1
        L_0x04b0:
            java.lang.String r0 = "waContext"
            X.C18070vi.A11(r0)
            throw r1
        L_0x04b6:
            X.AnonymousClass3MW.A1N()
            throw r1
        L_0x04ba:
            X.AnonymousClass3MW.A1C()
            throw r1
        L_0x04be:
            java.lang.String r0 = "crashLogs"
            X.C18070vi.A11(r0)
            throw r1
        L_0x04c4:
            java.lang.String r0 = "latencySensitiveDispatcher"
            X.C18070vi.A11(r0)
            throw r1
        L_0x04ca:
            java.lang.String r0 = "wamRuntime"
            X.C18070vi.A11(r0)
            throw r1
        L_0x04d0:
            java.lang.String r0 = "time"
            X.C18070vi.A11(r0)
            throw r1
        L_0x04d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.VideoComposerFragment.A2Y(android.net.Uri, X.7JT, long):void");
    }

    private final long A02(C59382mD r34, int i, long j, long j2) {
        Integer num;
        Integer num2;
        File file;
        Integer num3;
        Integer num4;
        long j3 = this.A07;
        long j4 = this.A06;
        long j5 = j3 - j4;
        long j6 = 0;
        int i2 = i;
        if (this.A00 != i2 && (j5 > j || (j5 == j2 && j > j2))) {
            if (j < 1000) {
                j = 1000;
            }
            j3 = j4 + j;
            long A092 = C108995ce.A09(this);
            if (j3 > A092) {
                j3 = A092;
            }
        }
        C1405471x r13 = this.A0T;
        C59382mD r19 = r34;
        if (!(r13 == null || (file = this.A0Z) == null)) {
            C26431Sc r11 = this.A0P;
            if (r11 != null) {
                boolean z = this.A0g;
                boolean z2 = this.A0e;
                boolean z3 = this.A0j;
                AnonymousClass1D6 A052 = A05();
                if (A052 != null) {
                    num3 = (Integer) A052.first;
                } else {
                    num3 = null;
                }
                AnonymousClass1D6 A053 = A05();
                if (A053 != null) {
                    num4 = (Integer) A053.second;
                } else {
                    num4 = null;
                }
                C111125iM A0n2 = C108945cZ.A0n(this.A0v);
                long j7 = j4;
                boolean z4 = z;
                boolean z5 = z2;
                boolean z6 = z3;
                File file2 = file;
                Integer num5 = num3;
                Integer num6 = num4;
                long j8 = j3;
                C26431Sc r18 = r11;
                C1405471x r20 = r13;
                long A093 = r18.A09(r19, r20, file2, num5, num6, j8, j7, z4, z5, z6, AnonymousClass3MW.A12(A0n2.A0B).containsKey(this.A01));
                if (Long.valueOf(A093) != null) {
                    j6 = A093;
                }
            }
            C18070vi.A11("transcodeUtils");
            throw null;
        }
        long j9 = this.A07 - this.A06;
        if (j9 < 1000) {
            j9 = 1000;
        }
        C18000vb r0 = this.A0E;
        if (r0 != null) {
            String A0D2 = C64052u8.A0D(r0, (String) null, j9 / 1000);
            C18070vi.A0X(A0D2);
            C18000vb r02 = this.A0E;
            if (r02 != null) {
                String A022 = C88584aA.A02(r02, j6);
                C18070vi.A0X(A022);
                AnonymousClass1KB r2 = this.A07;
                if (r2 != null) {
                    r2.CGP(new AnonymousClass7Pq(this, A0D2, A022, 12));
                    C26431Sc r7 = this.A0P;
                    if (r7 != null) {
                        Uri fromFile = Uri.fromFile(this.A0Z);
                        Context A1n = A1n();
                        int i3 = r19.A02;
                        C1405471x r10 = this.A0T;
                        AnonymousClass1D6 A054 = A05();
                        if (A054 != null) {
                            num = (Integer) A054.first;
                        } else {
                            num = null;
                        }
                        AnonymousClass1D6 A055 = A05();
                        if (A055 != null) {
                            num2 = (Integer) A055.second;
                        } else {
                            num2 = null;
                        }
                        AnonymousClass1D6 A0D3 = r7.A0D(A1n, fromFile, r10, num, num2, i3);
                        this.A0q.put(Integer.valueOf(i2), new C134776r8(A0D3, j6));
                        return j6;
                    }
                    C18070vi.A11("transcodeUtils");
                } else {
                    AnonymousClass3MW.A1C();
                }
            } else {
                AnonymousClass3MW.A1M();
                throw null;
            }
        } else {
            AnonymousClass3MW.A1M();
        }
        throw null;
    }

    public static final void A06(Uri uri, Bundle bundle, VideoComposerFragment videoComposerFragment) {
        VideoTimelineView videoTimelineView;
        View view;
        String str;
        String str2;
        float A042;
        float A092;
        View view2;
        C136166tN r3;
        VideoSurfaceView videoSurfaceView;
        View view3 = videoComposerFragment.A0B;
        if (view3 != null) {
            if (!videoComposerFragment.A0E() || A0F(videoComposerFragment)) {
                videoTimelineView = null;
            } else {
                videoTimelineView = (VideoTimelineView) view3.findViewById(2131436195);
                videoTimelineView.A06(videoComposerFragment.A0Z, C108995ce.A09(videoComposerFragment));
                long j = videoComposerFragment.A06;
                long j2 = videoComposerFragment.A07;
                videoTimelineView.A0A = j;
                videoTimelineView.A0B = j2;
                videoTimelineView.invalidate();
                boolean z = videoComposerFragment.A0g;
                long j3 = videoComposerFragment.A02;
                if (z && j3 > 7000) {
                    j3 = 7000;
                }
                videoTimelineView.A09 = j3;
                videoTimelineView.A0F = new AnonymousClass7JO(videoComposerFragment);
                videoTimelineView.A0G = new AnonymousClass7JP(videoComposerFragment);
                videoTimelineView.setImportantForAccessibility(1);
                videoTimelineView.requestLayout();
            }
            videoComposerFragment.A0Q = videoTimelineView;
            AnonymousClass70X r32 = videoComposerFragment.A0W;
            if (r32 != null) {
                r32.A08 = new C146077Ns(videoComposerFragment, 1);
            }
            String str3 = null;
            if (r32 != null) {
                view = r32.A09();
            } else {
                view = null;
            }
            if ((view instanceof VideoSurfaceView) || videoComposerFragment.A2U() || videoComposerFragment.A2V()) {
                AnonymousClass70X r2 = videoComposerFragment.A0W;
                if (r2 != null) {
                    view2 = r2.A09();
                } else {
                    view2 = null;
                }
                if ((view2 instanceof VideoSurfaceView) && (videoSurfaceView = (VideoSurfaceView) view2) != null) {
                    AnonymousClass1D6 A2W = videoComposerFragment.A2W();
                    int A043 = AnonymousClass3MZ.A04(A2W);
                    int A093 = C108955ca.A09(A2W);
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("VideoView/setVideoDimensions: ");
                    A10.append(A043);
                    C17900vP.A0j("x", A10, A093);
                    videoSurfaceView.A07 = A043;
                    videoSurfaceView.A06 = A093;
                }
                AnonymousClass7HT r4 = new AnonymousClass7HT(videoComposerFragment, 2);
                C160888Ai A29 = videoComposerFragment.A29();
                if (!(A29 == null || (r3 = ((MediaComposerActivity) A29).A0R) == null)) {
                    r3.A02(r4, new C144387Hc(videoComposerFragment, 2));
                }
            }
            if (bundle == null) {
                C160888Ai A292 = videoComposerFragment.A29();
                if (A292 != null) {
                    str = AnonymousClass73D.A00(uri, A292).A0F();
                } else {
                    str = null;
                }
                C160888Ai A293 = videoComposerFragment.A29();
                if (A293 != null) {
                    str3 = A293.BR5(uri);
                }
                if (str != null) {
                    C139426yp r33 = C1409573s.A06;
                    Context A14 = videoComposerFragment.A14();
                    AnonymousClass1KW r7 = videoComposerFragment.A0F;
                    if (r7 != null) {
                        C18000vb r6 = videoComposerFragment.A0E;
                        if (r6 != null) {
                            C26631Sw r10 = videoComposerFragment.A0Q;
                            if (r10 != null) {
                                C18030ve A28 = videoComposerFragment.A28();
                                AnonymousClass00H r22 = videoComposerFragment.A0a;
                                if (r22 != null) {
                                    C25291Nq r9 = (C25291Nq) C18070vi.A0E(r22);
                                    AnonymousClass1T1 r5 = videoComposerFragment.A06;
                                    if (r5 != null) {
                                        C1409573s A022 = r33.A02(A14, r5, r6, r7, A28, r9, r10, str);
                                        if (A022 != null) {
                                            C108995ce.A1D(videoComposerFragment, A022, str3);
                                        }
                                    }
                                } else {
                                    str2 = "mediaUtils";
                                }
                            } else {
                                str2 = "stickerImageFileLoader";
                            }
                        } else {
                            AnonymousClass3MW.A1M();
                            throw null;
                        }
                    } else {
                        str2 = "emojiLoader";
                    }
                    C18070vi.A11(str2);
                    throw null;
                } else if (videoComposerFragment instanceof PtvComposerFragment) {
                    AnonymousClass1D6 A2W2 = videoComposerFragment.A2W();
                    int A044 = AnonymousClass3MZ.A04(A2W2);
                    int A094 = C108955ca.A09(A2W2);
                    AnonymousClass1T1 r42 = videoComposerFragment.A06;
                    if (r42 != null) {
                        float f = (float) A044;
                        float f2 = (float) A094;
                        RectF A045 = C108965cb.A04(f, f2);
                        ArrayList A13 = AnonymousClass000.A13();
                        AnonymousClass69R r52 = new AnonymousClass69R();
                        r52.A0O(A045, 0.0f, 0.0f, f, f2);
                        A13.add(r52);
                        C108995ce.A1D(videoComposerFragment, r42.A00(A045, A045, A13, 0), str3);
                    }
                } else {
                    if (A0G(videoComposerFragment)) {
                        A042 = 720.0f;
                        A092 = 1280.0f;
                    } else {
                        AnonymousClass1D6 A2W3 = videoComposerFragment.A2W();
                        A042 = (float) AnonymousClass3MZ.A04(A2W3);
                        A092 = (float) C108955ca.A09(A2W3);
                    }
                    RectF A046 = C108965cb.A04(A042, A092);
                    AnonymousClass7JF r34 = videoComposerFragment.A0J;
                    if (r34 != null) {
                        r34.A0Q.A07 = A046;
                        r34.A0P.A00 = 0.0f;
                        r34.A0C(A046);
                    }
                }
                str2 = "doodleFactory";
                C18070vi.A11(str2);
                throw null;
            }
            videoComposerFragment.A0e = bundle.getBoolean("key_video_is_muted", false);
            A0D(videoComposerFragment);
            A0D(videoComposerFragment);
            FrameLayout frameLayout = videoComposerFragment.A0E;
            if (frameLayout != null) {
                frameLayout.setImportantForAccessibility(2);
            }
            AnonymousClass70X r43 = videoComposerFragment.A0W;
            if (r43 != null) {
                FrameLayout frameLayout2 = videoComposerFragment.A0E;
                if (frameLayout2 != null) {
                    frameLayout2.removeAllViews();
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
                if (videoComposerFragment.A2V()) {
                    int dimensionPixelSize = AnonymousClass3MZ.A09(videoComposerFragment).getDimensionPixelSize(2131168805);
                    layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                }
                FrameLayout frameLayout3 = videoComposerFragment.A0E;
                if (frameLayout3 != null) {
                    frameLayout3.addView(r43.A09(), layoutParams);
                }
                r43.A0M(((int) videoComposerFragment.A06) + 1);
            }
            View findViewById = view3.findViewById(2131429191);
            C72463Mc.A14(findViewById, findViewById.getPaddingLeft(), findViewById.getPaddingTop() * 2);
            FrameLayout frameLayout4 = videoComposerFragment.A0E;
            if (frameLayout4 != null) {
                AnonymousClass78K.A00(frameLayout4, videoComposerFragment, 20);
            }
            videoComposerFragment.A2I();
            C22791Df.A00(((MediaQualityViewModel) videoComposerFragment.A0p.getValue()).A01).A0A(videoComposerFragment.A1G(), new AnonymousClass7AO(videoComposerFragment, 44));
        }
    }

    public static final void A08(VideoComposerFragment videoComposerFragment) {
        AnonymousClass1OB r0 = videoComposerFragment.A0k;
        if (r0 == null || !r0.Be2()) {
            C37581pm A0G2 = AnonymousClass3MZ.A0G(videoComposerFragment);
            C18600wl r2 = videoComposerFragment.A0b;
            if (r2 != null) {
                videoComposerFragment.A0k = C30451dy.A02(AnonymousClass00R.A00, r2, new VideoComposerFragment$estimateCurrentOutputThreadWrapper$1(videoComposerFragment, (C30391dr) null), A0G2);
                return;
            }
            C18070vi.A11("latencySensitiveDispatcher");
            throw null;
        }
    }

    public static final void A0A(VideoComposerFragment videoComposerFragment) {
        C18000vb r2 = videoComposerFragment.A0E;
        if (r2 != null) {
            StringBuilder sb = new StringBuilder(C64052u8.A0D(r2, (String) null, videoComposerFragment.A06 / 1000));
            sb.append(" - ");
            C18000vb r22 = videoComposerFragment.A0E;
            if (r22 != null) {
                sb.append(C64052u8.A0D(r22, (String) null, videoComposerFragment.A07 / 1000));
                TextView textView = videoComposerFragment.A0K;
                if (textView != null) {
                    textView.setText(sb.toString());
                    return;
                }
                return;
            }
            AnonymousClass3MW.A1M();
            throw null;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public static final void A0B(VideoComposerFragment videoComposerFragment) {
        Boolean bool = C17970vW.A03;
        AnonymousClass70X r0 = videoComposerFragment.A0W;
        if (r0 != null) {
            if (r0.A0a()) {
                videoComposerFragment.A2T();
            }
            AnonymousClass70X r3 = videoComposerFragment.A0W;
            if (r3 != null) {
                r3.A0M((int) videoComposerFragment.A06);
            }
            videoComposerFragment.A2K();
        }
    }

    public static final void A0D(VideoComposerFragment videoComposerFragment) {
        C160888Ai A29;
        C26052CrM crM;
        C160888Ai A292;
        if (!videoComposerFragment.A0g) {
            Uri uri = videoComposerFragment.A01;
            if (!(uri == null || (A292 = videoComposerFragment.A29()) == null)) {
                boolean z = videoComposerFragment.A0e;
                AnonymousClass72S A002 = AnonymousClass73D.A00(uri, A292);
                synchronized (A002) {
                    A002.A0N = z;
                }
            }
            A0C(videoComposerFragment);
            if (C18020vd.A05(C18040vf.A02, videoComposerFragment.A28(), 10024)) {
                Uri uri2 = videoComposerFragment.A01;
                if (!(uri2 == null || (A29 = videoComposerFragment.A29()) == null)) {
                    AnonymousClass72S A003 = AnonymousClass73D.A00(uri2, A29);
                    synchronized (A003) {
                        crM = A003.A05;
                    }
                    if (crM != null) {
                        C25186Cac A022 = crM.A02();
                        C18070vi.A0b(A022);
                        C137326vH.A01(videoComposerFragment.A14(), A022, videoComposerFragment.A0Z, videoComposerFragment.A0e);
                        C160888Ai A293 = videoComposerFragment.A29();
                        if (A293 != null) {
                            A293.CQs(uri2, new C26052CrM(A022));
                        }
                    }
                }
            } else {
                AnonymousClass70X r1 = videoComposerFragment.A0W;
                if (r1 != null) {
                    r1.A0W(videoComposerFragment.A0e);
                }
            }
            A08(videoComposerFragment);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r4.A0e != false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2K() {
        /*
            r4 = this;
            X.1f4 r0 = r4.A0M
            if (r0 == 0) goto L_0x005f
            r0.A06()
            X.7JF r0 = r4.A0J
            if (r0 == 0) goto L_0x0010
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r0.A0P
            X.C1410073x.A02(r0)
        L_0x0010:
            X.70X r3 = r4.A0W
            if (r3 == 0) goto L_0x0044
            X.0ve r2 = r4.A28()
            r1 = 10024(0x2728, float:1.4047E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r2 = 1
            if (r0 != 0) goto L_0x0030
            boolean r0 = r4.A0g
            if (r0 != 0) goto L_0x002c
            boolean r1 = r4.A0e
            r0 = 0
            if (r1 == 0) goto L_0x002d
        L_0x002c:
            r0 = 1
        L_0x002d:
            r3.A0W(r0)
        L_0x0030:
            r3.A0E()
            android.view.View r3 = r3.A09()
            r3.setKeepScreenOn(r2)
            java.lang.Runnable r2 = r4.A0p
            r3.removeCallbacks(r2)
            r0 = 50
            r3.postDelayed(r2, r0)
        L_0x0044:
            boolean r0 = A0F(r4)
            if (r0 != 0) goto L_0x005e
            android.view.View r3 = r4.A09
            r1 = 200(0xc8, double:9.9E-322)
            android.view.animation.AlphaAnimation r0 = X.C108985cd.A0H()
            r0.setDuration(r1)
            if (r3 == 0) goto L_0x005e
            r3.startAnimation(r0)
            r0 = 4
            r3.setVisibility(r0)
        L_0x005e:
            return
        L_0x005f:
            java.lang.String r0 = "messageAudioPlayerProvider"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.VideoComposerFragment.A2K():void");
    }

    public final AnonymousClass1D6 A2W() {
        Integer valueOf;
        int i;
        C1405471x r2 = this.A0T;
        if (r2 == null) {
            Integer A0f2 = AnonymousClass3MY.A0f();
            return new AnonymousClass1D6(A0f2, A0f2);
        }
        if (r2.A02()) {
            valueOf = Integer.valueOf(r2.A00);
            i = r2.A02;
        } else {
            valueOf = Integer.valueOf(r2.A02);
            i = r2.A00;
        }
        return AnonymousClass1D6.A00(valueOf, i);
    }

    public void A2X() {
        View A092;
        if (this instanceof PtvComposerFragment) {
            AnonymousClass70X r0 = this.A0W;
            if (r0 == null || !r0.A0a()) {
                AnonymousClass70X r02 = this.A0W;
                if (!(r02 == null || (A092 = r02.A09()) == null)) {
                    A092.setBackground((Drawable) null);
                }
                A2K();
                return;
            }
        } else if (!A0F(this)) {
            AnonymousClass70X r03 = this.A0W;
            if (r03 == null || !r03.A0a()) {
                AnonymousClass70X r6 = this.A0W;
                if (r6 != null) {
                    r6.A09().setBackground((Drawable) null);
                    if (((long) r6.A05()) > this.A07 - 2000) {
                        r6.A0M((int) this.A06);
                    }
                }
                A2K();
                return;
            }
        } else {
            return;
        }
        A2T();
    }

    public VideoComposerFragment() {
        AnonymousClass1A3 r0 = AnonymousClass1A3.A01;
        C18070vi.A0X(r0);
        this.A0S = r0;
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C152007nD(new C151997nC(this)));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(VideoComposerViewModel.class);
        this.A0w = C99274sY.A00(new C152017nE(A002), new C156277u6(this, A002), new C156267u5(A002), A15);
        AnonymousClass20F A152 = AnonymousClass3MW.A15(C111125iM.class);
        this.A0v = C99274sY.A00(new C151977nA(this), new C151987nB(this), new C156257u4(this), A152);
        this.A0L = new AnonymousClass7AO(this, 43);
        this.A0p = new AnonymousClass7RA((Object) this, 48);
        this.A0l = new C1420377x(this, 1);
        this.A0o = new AnonymousClass78K(this, 17);
        this.A0m = new AnonymousClass78K(this, 18);
        this.A0n = new AnonymousClass78K(this, 19);
    }

    private final AnonymousClass1D6 A05() {
        int i;
        if (!A0G(this)) {
            return null;
        }
        C1403571b r3 = this.A0O;
        if (r3 != null) {
            C1405471x r2 = this.A0T;
            int i2 = 0;
            if (r2 != null) {
                i = r2.A02;
                i2 = r2.A00;
            } else {
                i = 0;
            }
            C135276rw A022 = r3.A02(i, i2);
            return AnonymousClass1D6.A00(Integer.valueOf(A022.A01), A022.A00);
        }
        C18070vi.A11("fixedCanvasTranscodingUtils");
        throw null;
    }

    public static final void A07(View view, long j) {
        AlphaAnimation A0Q2 = C72463Mc.A0Q();
        A0Q2.setDuration(j);
        if (view != null) {
            view.startAnimation(A0Q2);
            view.setVisibility(0);
            view.requestFocus();
        }
    }

    public static final void A09(VideoComposerFragment videoComposerFragment) {
        View A092;
        A07(videoComposerFragment.A17().findViewById(2131429510), 300);
        AnonymousClass70X r0 = videoComposerFragment.A0W;
        if (r0 != null && (A092 = r0.A09()) != null) {
            A092.setAlpha(1.0f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r4.A0e != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0C(com.whatsapp.mediacomposer.VideoComposerFragment r4) {
        /*
            X.0ve r1 = r4.A28()
            r0 = 11620(0x2d64, float:1.6283E-41)
            boolean r0 = X.C25291Nq.A04(r1, r0)
            if (r0 == 0) goto L_0x0056
            X.8Ai r0 = r4.A29()
            if (r0 == 0) goto L_0x004a
            com.whatsapp.mediacomposer.MediaComposerActivity r0 = (com.whatsapp.mediacomposer.MediaComposerActivity) r0
            X.7JN r2 = r0.A0a
            if (r2 == 0) goto L_0x004a
            boolean r0 = r4.A0g
            if (r0 != 0) goto L_0x0021
            boolean r1 = r4.A0e
            r0 = 0
            if (r1 == 0) goto L_0x0022
        L_0x0021:
            r0 = 1
        L_0x0022:
            com.whatsapp.mediacomposer.bottombar.BottomBarView r4 = r2.A07
            if (r0 == 0) goto L_0x004b
            r3 = 2131232423(0x7f0806a7, float:1.8080955E38)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131897332(0x7f122bf4, float:1.942955E38)
        L_0x0030:
            java.lang.String r2 = r1.getString(r0)
            X.C18070vi.A0b(r2)
            X.1bI r0 = r4.A05
            android.view.View r1 = r0.A02()
            r0 = 2131432886(0x7f0b15b6, float:1.8487542E38)
            android.widget.ImageView r0 = X.AnonymousClass3MW.A0H(r1, r0)
            r0.setImageResource(r3)
            r0.setContentDescription(r2)
        L_0x004a:
            return
        L_0x004b:
            r3 = 2131232424(0x7f0806a8, float:1.8080957E38)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131892376(0x7f121898, float:1.9419499E38)
            goto L_0x0030
        L_0x0056:
            android.content.Context r3 = r4.A14()
            android.widget.ImageView r2 = r4.A0G
            if (r2 == 0) goto L_0x004a
            boolean r0 = r4.A0g
            if (r0 == 0) goto L_0x007e
            r0 = 2131232423(0x7f0806a7, float:1.8080955E38)
            r2.setImageResource(r0)
            r1 = 2130972028(0x7f040d7c, float:1.7552811E38)
            r0 = 2131103434(0x7f060eca, float:1.7819334E38)
            int r0 = X.AnonymousClass3Ma.A00(r3, r1, r0)
            X.AnonymousClass4aX.A0D(r2, r0)
            android.view.View r1 = r4.A08
            if (r1 == 0) goto L_0x004a
            r0 = 0
        L_0x007a:
            r1.setOnClickListener(r0)
            return
        L_0x007e:
            boolean r0 = r4.A0e
            if (r0 == 0) goto L_0x00a2
            r0 = 2131232423(0x7f0806a7, float:1.8080955E38)
            r2.setImageResource(r0)
            r0 = 2131897332(0x7f122bf4, float:1.942955E38)
        L_0x008b:
            X.C108955ca.A1J(r2, r4, r0)
            r1 = 2130972013(0x7f040d6d, float:1.755278E38)
            r0 = 2131103416(0x7f060eb8, float:1.7819298E38)
            int r0 = X.AnonymousClass3Ma.A00(r3, r1, r0)
            X.AnonymousClass4aX.A0D(r2, r0)
            android.view.View r1 = r4.A08
            if (r1 == 0) goto L_0x004a
            android.view.View$OnClickListener r0 = r4.A0m
            goto L_0x007a
        L_0x00a2:
            r0 = 2131232424(0x7f0806a8, float:1.8080957E38)
            r2.setImageResource(r0)
            r0 = 2131892376(0x7f121898, float:1.9419499E38)
            goto L_0x008b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.VideoComposerFragment.A0C(com.whatsapp.mediacomposer.VideoComposerFragment):void");
    }

    private final boolean A0E() {
        AnonymousClass7JS r0;
        C160888Ai A29 = A29();
        if (A29 == null || (r0 = ((MediaComposerActivity) A29).A0X) == null) {
            return false;
        }
        return C108975cc.A1B(r0.A0J ? 1 : 0);
    }

    public static final boolean A0F(VideoComposerFragment videoComposerFragment) {
        AnonymousClass7JS r0;
        C160888Ai A29 = videoComposerFragment.A29();
        if (A29 == null || (r0 = ((MediaComposerActivity) A29).A0X) == null) {
            return false;
        }
        return C108975cc.A1B(r0.A0H ? 1 : 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, X.C108955ca.A0R(r3.A2B()), 11003) == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0G(com.whatsapp.mediacomposer.VideoComposerFragment r3) {
        /*
            boolean r0 = r3.A2U()
            if (r0 == 0) goto L_0x0018
            X.00H r0 = r3.A2B()
            X.0ve r2 = X.C108955ca.A0R(r0)
            r1 = 11003(0x2afb, float:1.5418E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x001f
        L_0x0018:
            boolean r1 = r3.A2V()
            r0 = 0
            if (r1 == 0) goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.VideoComposerFragment.A0G(com.whatsapp.mediacomposer.VideoComposerFragment):boolean");
    }

    public void A1r() {
        super.A1r();
        Log.i("VideoComposerFragment/onDestroy");
        AnonymousClass70X r0 = this.A0W;
        if (r0 != null) {
            r0.A0F();
            r0.A0C();
        }
        this.A0W = null;
        ((MediaProgressRing) this.A0s.getValue()).A01();
        C136986uj r02 = this.A0R;
        if (r02 != null) {
            MediaTimeDisplay mediaTimeDisplay = r02.A0I.A0V;
            if (mediaTimeDisplay == null) {
                C18070vi.A11("playbackTimeDisplay");
                throw null;
            }
            Runnable runnable = mediaTimeDisplay.A04;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void A1s() {
        super.A1s();
        Log.i("VideoComposerFragment/onDestroyView");
        VideoTimelineView videoTimelineView = this.A0Q;
        if (videoTimelineView != null) {
            videoTimelineView.A0F = null;
        }
        this.A0Q = null;
        this.A0C = null;
        C108945cZ.A0n(this.A0v).A01.A0D(this.A0L);
        AnonymousClass70X r0 = this.A0W;
        if (r0 != null) {
            r0.A0F();
            r0.A0C();
        }
        this.A0W = null;
        ((MediaProgressRing) this.A0s.getValue()).A01();
        C136986uj r02 = this.A0R;
        if (r02 != null) {
            MediaTimeDisplay mediaTimeDisplay = r02.A0I.A0V;
            if (mediaTimeDisplay == null) {
                C18070vi.A11("playbackTimeDisplay");
                throw null;
            }
            Runnable runnable = mediaTimeDisplay.A04;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void A1t() {
        super.A1t();
        Log.i("VideoComposerFragment/onPause");
        A2T();
    }

    public void A1u() {
        int i;
        super.A1u();
        AnonymousClass70X r0 = this.A0W;
        if (r0 != null) {
            i = r0.A05();
        } else {
            i = 0;
        }
        AnonymousClass70X r1 = this.A0W;
        if (r1 != null) {
            int i2 = i + 1;
            if (i > 0) {
                i2 = i - 1;
            }
            r1.A0M(i2);
            r1.A0M(i);
        }
    }

    public void A2C() {
        super.A2C();
        A2T();
    }

    public void A2F() {
        super.A2F();
        C72453Mb.A1C(this.A0B);
    }

    public void A2G() {
        super.A2G();
        C72453Mb.A1D(this.A0B);
    }

    public void A2N(Rect rect) {
        super.A2N(rect);
        if (this.A0B != null) {
            if (rect == null) {
                rect = new Rect(0, 0, 0, 0);
            }
            View view = this.A0B;
            if (view != null) {
                view.setPadding(rect.left, AnonymousClass3MX.A00(AnonymousClass3MZ.A09(this), 2131165285, rect.top), rect.right, AnonymousClass3MX.A00(AnonymousClass3MZ.A09(this), 2131165285, rect.bottom));
            }
            View view2 = this.A0A;
            if (view2 != null) {
                view2.setPadding(rect.left, rect.top, rect.right, 0);
            }
            this.A01 = rect.top;
        }
    }

    public void A2P(AnonymousClass7JS r4, AnonymousClass7JN r5, C136986uj r6) {
        C18070vi.A0n(r6, r5, r4);
        super.A2P(r4, r5, r6);
        if (A0F(this) || this.A0g) {
            Boolean bool = C17970vW.A03;
            A2K();
        }
        if (A0E() && !A0F(this)) {
            if (C25291Nq.A04(A28(), 11620)) {
                C72453Mb.A1D(this.A0D);
            }
            A2H();
            r6.A0I.setCropToolVisibility(8);
            r5.A05();
            C18030ve r1 = r5.A05;
            C18070vi.A0d(r1, 0);
            if (C25291Nq.A04(r1, 11620)) {
                r5.A07.A05.A04(0);
            }
        }
    }

    public void A2Q(boolean z) {
        super.A2Q(z);
        this.A0f = z;
    }

    public void A2Z(AnonymousClass70X r4) {
        this.A05 = C108995ce.A09(this);
        VideoTimelineView videoTimelineView = this.A0Q;
        if (videoTimelineView != null) {
            videoTimelineView.invalidate();
        }
        if (!A0F(this)) {
            A07(this.A09, 200);
        }
        if (this.A0g || A0F(this)) {
            A0B(this);
        }
    }
}
