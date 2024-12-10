package com.whatsapp.expressionstray.expression.gifs;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass11C;
import X.AnonymousClass18K;
import X.AnonymousClass1DF;
import X.AnonymousClass1OB;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass736;
import X.AnonymousClass874;
import X.AnonymousClass876;
import X.C108955ca;
import X.C112375lN;
import X.C117555zz;
import X.C127256e3;
import X.C129036h9;
import X.C133816pX;
import X.C150197kI;
import X.C150207kJ;
import X.C150217kK;
import X.C155717tC;
import X.C155727tD;
import X.C18010vc;
import X.C18070vi;
import X.C18100vl;
import X.C19830z4;
import X.C30391dr;
import X.C34081jt;
import X.C41561wd;
import X.C88604aC;
import X.C99274sY;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.expressionstray.search.ExpressionsSearchViewModel;
import com.whatsapp.infra.gifsearch.controls.AdaptiveRecyclerView;
import java.util.concurrent.CancellationException;

public final class GifExpressionsFragment extends Hilt_GifExpressionsFragment implements AnonymousClass874, AnonymousClass876 {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public AnonymousClass11C A04;
    public C19830z4 A05;
    public ExpressionsSearchViewModel A06;
    public AnonymousClass18K A07;
    public AnonymousClass736 A08;
    public C112375lN A09;
    public C129036h9 A0A;
    public AdaptiveRecyclerView A0B;
    public C18010vc A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass00H A0E;
    public boolean A0F;
    public final C18100vl A0G;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131625454, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0062, code lost:
        if (r1 == false) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r14, android.view.View r15) {
        /*
            r13 = this;
            r0 = 0
            X.C18070vi.A0d(r15, r0)
            r0 = 2131431148(0x7f0b0eec, float:1.8484017E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r15, r0)
            r13.A00 = r0
            r0 = 2131434679(0x7f0b1cb7, float:1.8491179E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r15, r0)
            r13.A02 = r0
            r0 = 2131434675(0x7f0b1cb3, float:1.849117E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r15, r0)
            r13.A01 = r0
            r0 = 2131434955(0x7f0b1dcb, float:1.8491739E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r15, r0)
            com.whatsapp.infra.gifsearch.controls.AdaptiveRecyclerView r0 = (com.whatsapp.infra.gifsearch.controls.AdaptiveRecyclerView) r0
            r13.A0B = r0
            r0 = 2131434188(0x7f0b1acc, float:1.8490183E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r15, r0)
            r13.A03 = r0
            android.os.Bundle r1 = r13.A06
            r2 = 0
            if (r1 == 0) goto L_0x0137
            java.lang.String r0 = "isConversationOrigin"
            boolean r1 = r1.getBoolean(r0)
        L_0x003e:
            r13.A0F = r1
            X.7Hr r8 = new X.7Hr
            r8.<init>(r13, r2)
            X.10I r11 = r13.A04
            X.0ve r5 = r13.A02
            X.736 r7 = r13.A08
            if (r7 == 0) goto L_0x0146
            X.18K r6 = r13.A07
            if (r6 == 0) goto L_0x0143
            X.11C r4 = r13.A04
            if (r4 == 0) goto L_0x0140
            X.6h9 r9 = r13.A0A
            if (r9 == 0) goto L_0x013d
            X.0vc r10 = r13.A0C
            if (r10 == 0) goto L_0x013a
            com.whatsapp.expressionstray.search.ExpressionsSearchViewModel r0 = r13.A06
            if (r0 != 0) goto L_0x0064
            r12 = 1
            if (r1 != 0) goto L_0x0065
        L_0x0064:
            r12 = 0
        L_0x0065:
            X.66N r3 = new X.66N
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.A09 = r3
            com.whatsapp.infra.gifsearch.controls.AdaptiveRecyclerView r6 = r13.A0B
            if (r6 == 0) goto L_0x00ba
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131168605(0x7f070d5d, float:1.7951517E38)
            int r1 = r1.getDimensionPixelSize(r0)
            r5 = 3
            X.5lq r0 = new X.5lq
            r0.<init>(r1, r5)
            r6.A0r(r0)
            X.5lN r0 = r13.A09
            r6.setAdapter(r0)
            X.0ve r3 = r13.A02
            r1 = 12647(0x3167, float:1.7722E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 == 0) goto L_0x00b2
            X.00H r0 = r13.A0D
            if (r0 == 0) goto L_0x0149
            java.lang.Object r0 = r0.get()
            X.6yw r0 = (X.C139496yw) r0
            X.1FL r4 = r13.A1D()
            r3 = 76
            X.1oL r1 = r0.A00
            r1.A02(r4)
            X.28O r0 = new X.28O
            r0.<init>(r4, r1, r3)
            r6.A0t(r0)
        L_0x00b2:
            X.5lx r0 = new X.5lx
            r0.<init>(r13, r5)
            r6.A0t(r0)
        L_0x00ba:
            android.view.View r1 = r13.A01
            if (r1 == 0) goto L_0x00c3
            r0 = 28
            X.AnonymousClass78O.A00(r1, r13, r0)
        L_0x00c3:
            X.0vl r5 = r13.A0G
            java.lang.Object r0 = r5.getValue()
            com.whatsapp.expressionstray.expression.gifs.GifExpressionsSearchViewModel r0 = (com.whatsapp.expressionstray.expression.gifs.GifExpressionsSearchViewModel) r0
            X.1DT r3 = r0.A03
            X.1q9 r1 = r13.A1G()
            X.7z4 r0 = new X.7z4
            r0.<init>(r13)
            r4 = 25
            java.lang.Object r0 = X.AnonymousClass7AT.A00(r1, r3, r5, r0, r4)
            com.whatsapp.expressionstray.expression.gifs.GifExpressionsSearchViewModel r0 = (com.whatsapp.expressionstray.expression.gifs.GifExpressionsSearchViewModel) r0
            X.1DT r3 = r0.A02
            X.1q9 r1 = r13.A1G()
            X.7z5 r0 = new X.7z5
            r0.<init>(r13)
            X.AnonymousClass7AT.A01(r1, r3, r0, r4)
            android.os.Bundle r1 = r13.A06
            if (r1 == 0) goto L_0x0129
            java.lang.String r0 = "isExpressionsSearch"
            boolean r0 = r1.getBoolean(r0)
            if (r0 == 0) goto L_0x0129
            X.7kH r3 = new X.7kH
            r3.<init>(r13)
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            X.7kF r0 = new X.7kF
            r0.<init>(r3)
            X.0vl r5 = X.AnonymousClass1DF.A00(r1, r0)
            java.lang.Class<com.whatsapp.expressionstray.search.ExpressionsSearchViewModel> r0 = com.whatsapp.expressionstray.search.ExpressionsSearchViewModel.class
            X.20F r4 = X.AnonymousClass3MW.A15(r0)
            X.7kG r3 = new X.7kG
            r3.<init>(r5)
            X.7tA r1 = new X.7tA
            r1.<init>(r5)
            X.7tB r0 = new X.7tB
            r0.<init>(r13, r5)
            X.4sY r0 = X.C99274sY.A00(r3, r0, r1, r4)
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.expressionstray.search.ExpressionsSearchViewModel r0 = (com.whatsapp.expressionstray.search.ExpressionsSearchViewModel) r0
            r13.A06 = r0
        L_0x0129:
            android.os.Bundle r1 = r13.A06
            if (r1 == 0) goto L_0x0133
            java.lang.String r0 = "isSelected"
            boolean r2 = r1.getBoolean(r0)
        L_0x0133:
            r13.CJE(r2)
            return
        L_0x0137:
            r1 = 0
            goto L_0x003e
        L_0x013a:
            java.lang.String r0 = "sharedPreferencesFactory"
            goto L_0x014b
        L_0x013d:
            java.lang.String r0 = "gifTooltipUtils"
            goto L_0x014b
        L_0x0140:
            java.lang.String r0 = "systemServices"
            goto L_0x014b
        L_0x0143:
            java.lang.String r0 = "wamRuntime"
            goto L_0x014b
        L_0x0146:
            java.lang.String r0 = "gifCache"
            goto L_0x014b
        L_0x0149:
            java.lang.String r0 = "expressionsTrayPerformanceLogger"
        L_0x014b:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.expression.gifs.GifExpressionsFragment.A21(android.os.Bundle, android.view.View):void");
    }

    public void BpD() {
    }

    public void CJE(boolean z) {
        if (z) {
            C18100vl r1 = this.A0G;
            if (!(((GifExpressionsSearchViewModel) r1.getValue()).A02.A06() instanceof C117555zz)) {
                GifExpressionsSearchViewModel gifExpressionsSearchViewModel = (GifExpressionsSearchViewModel) r1.getValue();
                AnonymousClass1OB r0 = gifExpressionsSearchViewModel.A00;
                if (r0 != null) {
                    r0.BEM((CancellationException) null);
                }
                gifExpressionsSearchViewModel.A00 = C88604aC.A03(C41561wd.A00(gifExpressionsSearchViewModel), C108955ca.A0I(new GifExpressionsSearchViewModel$startDataLoad$1(gifExpressionsSearchViewModel, (C30391dr) null), new C34081jt((AnonymousClass1OB) null, ((C127256e3) gifExpressionsSearchViewModel.A0B.get()).A01)));
            }
        }
    }

    public GifExpressionsFragment() {
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C150197kI(new C150217kK(this)));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(GifExpressionsSearchViewModel.class);
        this.A0G = C99274sY.A00(new C150207kJ(A002), new C155727tD(this, A002), new C155717tC(A002), A15);
    }

    public void A1s() {
        super.A1s();
        this.A00 = null;
        this.A02 = null;
        this.A01 = null;
        this.A03 = null;
        this.A0B = null;
        C112375lN r0 = this.A09;
        if (r0 != null) {
            r0.A00 = null;
            r0.A0U((C133816pX) null);
        }
        C112375lN r1 = this.A09;
        if (r1 != null && r1.A0V()) {
            r1.A03.A00.A1q("pref_gif_tap_to_send_notice_seen_timestamp", System.currentTimeMillis());
        }
        this.A09 = null;
    }
}
