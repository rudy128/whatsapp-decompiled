package com.whatsapp.biz.catalog.view;

import X.A8Q;
import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass10I;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass8BU;
import X.AnonymousClass9a2;
import X.C161658Hf;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C182919Wf;
import X.C183889Zz;
import X.C20005A2v;
import X.C20287AEv;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.UserJid;

public final class CatalogCarouselDetailImageView extends FrameLayout implements AnonymousClass009 {
    public RecyclerView A00;
    public C20287AEv A01;
    public A8Q A02;
    public C20005A2v A03;
    public CarouselScrollbarView A04;
    public C161658Hf A05;
    public C18000vb A06;
    public C18030ve A07;
    public UserJid A08;
    public AnonymousClass10I A09;
    public AnonymousClass00H A0A;
    public AnonymousClass031 A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CatalogCarouselDetailImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        if (!this.A0C) {
            this.A0C = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A07 = AnonymousClass10E.A8r(A0O);
            this.A02 = AnonymousClass8BU.A0D(A0O);
            this.A0A = AnonymousClass3MW.A0s(A0O);
            this.A06 = AnonymousClass10E.A6Q(A0O);
            this.A09 = AnonymousClass10E.AL1(A0O);
        }
    }

    /* access modifiers changed from: private */
    public final void setImageAndGradient(AnonymousClass9a2 r4, boolean z, ThumbnailButton thumbnailButton, Bitmap bitmap, View view) {
        GradientDrawable.Orientation orientation;
        int[] iArr = {r4.A01, r4.A00};
        if (z) {
            orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        } else {
            orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        }
        view.setBackground(new GradientDrawable(orientation, iArr));
        thumbnailButton.setImageBitmap(bitmap);
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public final void setCatalogAnalyticManager(A8Q a8q) {
        C18070vi.A0d(a8q, 0);
        this.A02 = a8q;
    }

    public final void setWaIntents(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0A = r2;
    }

    public final void setWaLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setWaWorkers(AnonymousClass10I r2) {
        C18070vi.A0d(r2, 0);
        this.A09 = r2;
    }

    /* access modifiers changed from: private */
    public final C183889Zz getImageLoadContext() {
        UserJid userJid = this.A08;
        if (userJid != null) {
            return new C183889Zz(new C182919Wf(897460107), userJid);
        }
        return null;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0B;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0B = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("abProps");
        throw null;
    }

    public final A8Q getCatalogAnalyticManager() {
        A8Q a8q = this.A02;
        if (a8q != null) {
            return a8q;
        }
        C18070vi.A11("catalogAnalyticManager");
        throw null;
    }

    public final AnonymousClass00H getWaIntents() {
        AnonymousClass00H r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1F();
        throw null;
    }

    public final C18000vb getWaLocale() {
        C18000vb r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waLocale");
        throw null;
    }

    public final AnonymousClass10I getWaWorkers() {
        AnonymousClass10I r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waWorkers");
        throw null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CatalogCarouselDetailImageView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatalogCarouselDetailImageView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CatalogCarouselDetailImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }
}
