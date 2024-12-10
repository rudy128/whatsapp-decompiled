package com.whatsapp.reels;

import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass1OW;
import X.AnonymousClass1Y1;
import X.AnonymousClass210;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4VT;
import X.AnonymousClass4aO;
import X.AnonymousClass7NC;
import X.AnonymousClass7S4;
import X.C000200d;
import X.C108945cZ;
import X.C145857Mw;
import X.C145877My;
import X.C18070vi;
import X.C18090vk;
import X.C18100vl;
import X.C18600wl;
import X.C23761Hn;
import X.C30391dr;
import X.C32021gV;
import X.C72453Mb;
import X.CUR;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.WaTextView;
import com.whatsapp.components.button.ThumbnailButton;

public final class ReelsPreviewView extends FrameLayout implements AnonymousClass009 {
    public AnonymousClass00H A00;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;
    public AnonymousClass00H A06;
    public AnonymousClass031 A07;
    public C18600wl A08;
    public boolean A09;
    public final C18100vl A0A;
    public final C18100vl A0B;
    public final C18100vl A0C;
    public final C18100vl A0D;
    public final C18100vl A0E;
    public final C18100vl A0F;
    public final C18100vl A0G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReelsPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        if (!this.A09) {
            this.A09 = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A00 = C000200d.A00(A0O.A8v);
            this.A01 = C000200d.A00(A0O.A4b);
            this.A08 = (C18600wl) A0O.A9F.get();
            this.A02 = C000200d.A00(A0O.A6k);
            this.A03 = C000200d.A00(A0O.AA9);
            this.A04 = C000200d.A00(A0O.ABY);
            this.A05 = C108945cZ.A14(A0O);
            this.A06 = C000200d.A00(A0O.AC1);
        }
        this.A0A = AnonymousClass7S4.A02(context, 9);
        this.A0E = AnonymousClass7S4.A02(this, 10);
        this.A0D = AnonymousClass7S4.A02(this, 11);
        this.A0B = AnonymousClass7S4.A02(this, 12);
        this.A0G = AnonymousClass7S4.A02(this, 13);
        this.A0C = AnonymousClass7S4.A02(this, 14);
        this.A0F = AnonymousClass7S4.A02(this, 15);
        View.inflate(context, 2131626695, this);
        AnonymousClass4aO.A02(getProfilePhotoView());
    }

    public static /* synthetic */ void getMainDispatcher$annotations() {
    }

    public final void A04(CUR cur) {
        C18070vi.A0d(cur, 0);
        getContent().setVisibility(8);
        getImageThumbView().setVisibility(8);
        getShimmerLayout().setVisibility(0);
        getShimmerLayout().A05(cur);
        getShimmerLayout().A03();
    }

    public final void A05(AnonymousClass210 r10, int i) {
        AnonymousClass210 r2 = r10;
        if (r10.A1A() == null) {
            A02();
            return;
        }
        ((C32021gV) getMessageThumbCache().get()).A0F(getImageThumbView(), r2, new AnonymousClass7NC(this, i, 2), r10.A0v, 2000, false, false, false);
    }

    public final void A06(String str, C18090vk r5, C18090vk r6) {
        getSimpleThumbLoader().A02(getImageThumbView(), new C145877My(this, r5, r6, 1), str);
    }

    public final void A07(String str, boolean z) {
        if (str == null) {
            A01((Bitmap) null, this);
        } else if (z) {
            AnonymousClass3MX.A1Q(new ReelsPreviewView$showProfilePictureFrom$1(this, str, (C30391dr) null), AnonymousClass1OW.A02(C23761Hn.A01));
        } else {
            getSimpleThumbLoader().A02(getProfilePhotoView(), new C145857Mw(this, 1), str);
        }
    }

    public final void setFMessageIO(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setGlobalUI(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setMainDispatcher(C18600wl r2) {
        C18070vi.A0d(r2, 0);
        this.A08 = r2;
    }

    public final void setMessageThumbCache(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setStatistics(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setWaContext(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setWaHttpClient(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setWaWorkers(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public static final void A01(Bitmap bitmap, ReelsPreviewView reelsPreviewView) {
        ThumbnailButton profilePhotoView;
        int i;
        if (bitmap == null) {
            profilePhotoView = reelsPreviewView.getProfilePhotoView();
            i = 8;
        } else {
            reelsPreviewView.getProfilePhotoView().setImageBitmap(bitmap);
            profilePhotoView = reelsPreviewView.getProfilePhotoView();
            i = 0;
        }
        profilePhotoView.setVisibility(i);
    }

    private final RelativeLayout getContent() {
        return (RelativeLayout) this.A0B.getValue();
    }

    /* access modifiers changed from: private */
    public final ThumbnailButton getImageThumbView() {
        return (ThumbnailButton) this.A0C.getValue();
    }

    private final ThumbnailButton getProfilePhotoView() {
        return (ThumbnailButton) this.A0D.getValue();
    }

    private final int getProfilePictureSize() {
        return C72453Mb.A0I(this.A0A);
    }

    private final ShimmerFrameLayout getShimmerLayout() {
        return (ShimmerFrameLayout) this.A0E.getValue();
    }

    private final AnonymousClass4VT getSimpleThumbLoader() {
        return (AnonymousClass4VT) AnonymousClass3MX.A14(this.A0F);
    }

    private final WaTextView getTitleView() {
        return (WaTextView) this.A0G.getValue();
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A07;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A07 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass00H getFMessageIO() {
        AnonymousClass00H r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("fMessageIO");
        throw null;
    }

    public final AnonymousClass00H getGlobalUI() {
        AnonymousClass00H r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1C();
        throw null;
    }

    public final C18600wl getMainDispatcher() {
        C18600wl r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("mainDispatcher");
        throw null;
    }

    public final AnonymousClass00H getMessageThumbCache() {
        AnonymousClass00H r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("messageThumbCache");
        throw null;
    }

    public final AnonymousClass00H getStatistics() {
        AnonymousClass00H r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("statistics");
        throw null;
    }

    public final AnonymousClass00H getWaContext() {
        AnonymousClass00H r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waContext");
        throw null;
    }

    public final AnonymousClass00H getWaHttpClient() {
        AnonymousClass00H r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waHttpClient");
        throw null;
    }

    public final AnonymousClass00H getWaWorkers() {
        AnonymousClass00H r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1G();
        throw null;
    }

    public final void setTitle(String str) {
        if (str == null || str.length() == 0) {
            getTitleView().setVisibility(8);
            return;
        }
        getTitleView().setVisibility(0);
        getTitleView().setText(str);
    }

    public final void A02() {
        getImageThumbView().setVisibility(8);
    }

    public final void A03() {
        getShimmerLayout().A04();
        getShimmerLayout().setVisibility(8);
        getContent().setVisibility(0);
        getImageThumbView().setVisibility(0);
    }

    public final void setShimmerBackground(int i) {
        getShimmerLayout().setBackgroundResource(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ReelsPreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public /* synthetic */ ReelsPreviewView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ReelsPreviewView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
