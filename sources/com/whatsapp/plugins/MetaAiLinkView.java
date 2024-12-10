package com.whatsapp.plugins;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass1DF;
import X.AnonymousClass1EG;
import X.AnonymousClass1Y1;
import X.AnonymousClass210;
import X.AnonymousClass2VB;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass7NC;
import X.BCQ;
import X.C000200d;
import X.C115525vC;
import X.C17890vO;
import X.C18070vi;
import X.C18100vl;
import X.C19740yt;
import X.C26987DOj;
import X.C27759Dkf;
import X.C27760Dkg;
import X.C27761Dkh;
import X.C27762Dki;
import X.C27763Dkj;
import X.C27764Dkk;
import X.C27765Dkl;
import X.C27766Dkm;
import X.C27767Dkn;
import X.C27831DmS;
import X.C32011gU;
import X.C32021gV;
import X.C42491yG;
import X.C72453Mb;
import X.CUR;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.WaTextView;
import com.whatsapp.components.button.ThumbnailButton;

public final class MetaAiLinkView extends FrameLayout implements AnonymousClass009 {
    public AnonymousClass00H A00;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public AnonymousClass00H A0A;
    public AnonymousClass031 A0B;
    public boolean A0C;
    public final C18100vl A0D;
    public final C18100vl A0E;
    public final C18100vl A0F;
    public final C18100vl A0G;
    public final C18100vl A0H;
    public final C18100vl A0I;
    public final C18100vl A0J;
    public final C18100vl A0K;
    public final C18100vl A0L;
    public final C18100vl A0M;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MetaAiLinkView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        if (!this.A0C) {
            this.A0C = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A00 = C000200d.A00(A0O.A04);
            this.A01 = C000200d.A00(A0O.A4b);
            this.A02 = C000200d.A00(A0O.A8z);
            this.A03 = C000200d.A00(A0O.A5k);
            this.A04 = C000200d.A00(A0O.A6A);
            this.A05 = C000200d.A00(A0O.A6k);
            this.A06 = C000200d.A00(A0O.A9a);
            this.A07 = C000200d.A00(A0O.AA9);
            this.A08 = C000200d.A00(A0O.AAv);
            this.A09 = C000200d.A00(A0O.AC1);
            this.A0A = C000200d.A00(A0O.A9B);
        }
        this.A0G = AnonymousClass1DF.A01(new C27760Dkg(this));
        this.A0L = AnonymousClass1DF.A01(new C27767Dkn(this));
        this.A0K = AnonymousClass1DF.A01(new C27766Dkm(this));
        this.A0I = AnonymousClass1DF.A01(new C27764Dkk(this));
        this.A0H = AnonymousClass1DF.A01(new C27761Dkh(this));
        this.A0E = AnonymousClass1DF.A01(new C27763Dkj(context));
        this.A0D = AnonymousClass1DF.A01(new C27762Dki(context));
        this.A0J = AnonymousClass1DF.A01(new C27765Dkl(this));
        this.A0F = AnonymousClass1DF.A01(new C27759Dkf(this));
        this.A0M = AnonymousClass1DF.A01(new C27831DmS(context, this));
        View.inflate(context, 2131626054, this);
        C42491yG.A05(getImageThumbView(), (float) AnonymousClass000.A0Y(this).getDimensionPixelSize(2131167728));
    }

    public final void A05(CUR cur) {
        C18070vi.A0d(cur, 0);
        getShimmerLayout().A05(cur);
        getShimmerLayout().setBackgroundColor(C19740yt.A00(getContext(), 2131101879));
        A03();
    }

    public final void A06(AnonymousClass210 r10, int i) {
        AnonymousClass210 r2 = r10;
        if (r10.A1A() == null) {
            A02();
            return;
        }
        ((C32021gV) getMessageThumbCache().get()).A0F(getImageThumbView(), r2, new AnonymousClass7NC(this, i, 1), r10.A0v, 2000, false, false, false);
    }

    public final void setAbProps(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setGlobalUI(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setIJniBridge(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setLinkifyWeb(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setMediaHttpClientFactory(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setMessageThumbCache(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setRouteSelector(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setStatistics(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public final void setTime(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A08 = r2;
    }

    public final void setUrl(String str) {
        String A002;
        String str2 = null;
        if (!(str == null || (A002 = AnonymousClass2VB.A00((C32011gU) C18070vi.A0E(getLinkifyWeb()), str)) == null)) {
            str2 = AnonymousClass1EG.A0C(A002, 150);
        }
        WaTextView urlView = getUrlView();
        int i = 0;
        if (str2 == null) {
            i = 8;
        }
        urlView.setVisibility(i);
        getUrlView().setText(str2);
    }

    public final void setWaWorkers(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A09 = r2;
    }

    public final void setWamRuntime(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0A = r2;
    }

    /* access modifiers changed from: private */
    public final BCQ getBitmapLoaderAdapter() {
        return (BCQ) this.A0F.getValue();
    }

    private final RelativeLayout getContentLayout() {
        return (RelativeLayout) this.A0G.getValue();
    }

    /* access modifiers changed from: private */
    public final ThumbnailButton getImageThumbView() {
        return (ThumbnailButton) this.A0H.getValue();
    }

    private final int getImageThumbViewHeight() {
        return C72453Mb.A0I(this.A0D);
    }

    private final int getImageThumbViewWidth() {
        return C72453Mb.A0I(this.A0E);
    }

    private final WaTextView getReferenceIndexView() {
        return (WaTextView) this.A0I.getValue();
    }

    private final ShimmerFrameLayout getShimmerLayout() {
        return (ShimmerFrameLayout) this.A0J.getValue();
    }

    private final WaTextView getTitleView() {
        return (WaTextView) this.A0K.getValue();
    }

    private final WaTextView getUrlView() {
        return (WaTextView) this.A0L.getValue();
    }

    private final C115525vC getWaImageLoader() {
        return (C115525vC) this.A0M.getValue();
    }

    public final void A07(String str) {
        getWaImageLoader().A03(new C26987DOj(getImageThumbView(), str, C72453Mb.A0I(this.A0E), C72453Mb.A0I(this.A0D)), true);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0B;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0B = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass00H getAbProps() {
        AnonymousClass00H r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("abProps");
        throw null;
    }

    public final AnonymousClass00H getGlobalUI() {
        AnonymousClass00H r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("globalUI");
        throw null;
    }

    public final AnonymousClass00H getIJniBridge() {
        AnonymousClass00H r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("iJniBridge");
        throw null;
    }

    public final AnonymousClass00H getLinkifyWeb() {
        AnonymousClass00H r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("linkifyWeb");
        throw null;
    }

    public final AnonymousClass00H getMediaHttpClientFactory() {
        AnonymousClass00H r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("mediaHttpClientFactory");
        throw null;
    }

    public final AnonymousClass00H getMessageThumbCache() {
        AnonymousClass00H r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("messageThumbCache");
        throw null;
    }

    public final AnonymousClass00H getRouteSelector() {
        AnonymousClass00H r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("routeSelector");
        throw null;
    }

    public final AnonymousClass00H getStatistics() {
        AnonymousClass00H r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("statistics");
        throw null;
    }

    public final AnonymousClass00H getTime() {
        AnonymousClass00H r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("time");
        throw null;
    }

    public final AnonymousClass00H getWaWorkers() {
        AnonymousClass00H r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waWorkers");
        throw null;
    }

    public final AnonymousClass00H getWamRuntime() {
        AnonymousClass00H r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("wamRuntime");
        throw null;
    }

    public final void setReferenceIndex(Integer num) {
        if (num == null || num.intValue() <= 0) {
            getReferenceIndexView().setVisibility(8);
            return;
        }
        getReferenceIndexView().setVisibility(0);
        getReferenceIndexView().setText(C17890vO.A0c(C17890vO.A0f(num), '.'));
        getReferenceIndexView().setTextDirection(3);
    }

    public final void A02() {
        getImageThumbView().setVisibility(8);
    }

    public final void A03() {
        getContentLayout().setVisibility(8);
        getShimmerLayout().setVisibility(0);
        getShimmerLayout().A03();
    }

    public final void A04() {
        getContentLayout().setVisibility(0);
        getShimmerLayout().setVisibility(8);
        getShimmerLayout().A04();
    }

    public final void setShimmerBackground(int i) {
        getShimmerLayout().setBackgroundResource(i);
    }

    public final void setTitle(String str) {
        getTitleView().setText(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MetaAiLinkView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MetaAiLinkView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MetaAiLinkView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
