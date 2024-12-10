package com.whatsapp.biz.catalog.view;

import X.AFU;
import X.ANP;
import X.ANZ;
import X.AnonymousClass033;
import X.AnonymousClass10E;
import X.AnonymousClass1Xr;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass9a3;
import X.C161438Dp;
import X.C168818jj;
import X.C18000vb;
import X.C18070vi;
import X.C194819sL;
import X.C195139sr;
import X.C27641Ww;
import X.C27691Xc;
import X.C42011xT;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.whatsapp.InfoCard;
import com.whatsapp.components.button.ThumbnailButton;
import java.util.Iterator;
import java.util.List;

public final class CategoryMediaCard extends InfoCard {
    public HorizontalScrollView A00;
    public C18000vb A01;
    public LinearLayout A02;
    public boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CategoryMediaCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A01();
        LayoutInflater.from(context).inflate(2131624508, this, true);
        this.A02 = (LinearLayout) C18070vi.A05(this, 2131432378);
        this.A00 = (HorizontalScrollView) C18070vi.A05(this, 2131432375);
    }

    public final void setMediaScroller(HorizontalScrollView horizontalScrollView) {
        C18070vi.A0d(horizontalScrollView, 0);
        this.A00 = horizontalScrollView;
    }

    public final void setMediaThumbs(LinearLayout linearLayout) {
        C18070vi.A0d(linearLayout, 0);
        this.A02 = linearLayout;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setup(List list, C194819sL r6) {
        C18070vi.A0d(list, 0);
        if (list.isEmpty()) {
            this.A00.setVisibility(8);
            return;
        }
        this.A02.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.A02.addView(A00((C194819sL) it.next()));
        }
        if (r6 != null) {
            C161438Dp A002 = A00(r6);
            C18070vi.A05(A002, 2131428934).setVisibility(8);
            this.A02.addView(A002);
        }
        C27641Ww.A0A(this.A00, getWhatsAppLocale());
        this.A00.setVisibility(0);
    }

    public void A01() {
        if (!this.A03) {
            this.A03 = true;
            this.A01 = AnonymousClass10E.A6Q(((C27691Xc) ((AnonymousClass033) generatedComponent())).A10);
        }
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.8Dp, android.widget.RelativeLayout, android.view.View, android.view.ViewGroup] */
    private final C161438Dp A00(C194819sL r11) {
        Context A04 = AnonymousClass3MY.A04(this);
        ? relativeLayout = new RelativeLayout(A04);
        LayoutInflater.from(A04).inflate(2131624509, relativeLayout, true);
        relativeLayout.A00 = AnonymousClass3Ma.A0N(relativeLayout, 2131428933);
        ThumbnailButton thumbnailButton = (ThumbnailButton) C18070vi.A05(relativeLayout, 2131428932);
        thumbnailButton.setScaleType(ImageView.ScaleType.CENTER_CROP);
        thumbnailButton.A01 = getResources().getDimension(2131165780);
        AnonymousClass1Xr.A04(thumbnailButton, (String) null);
        relativeLayout.setText(r11.A03);
        Drawable drawable = r11.A00;
        if (drawable != null) {
            thumbnailButton.setImageDrawable(drawable);
        }
        AFU.A00(relativeLayout, r11, 44);
        AnonymousClass9a3 r1 = r11.A02;
        if (r1 != null) {
            C195139sr r2 = r1.A00;
            thumbnailButton.setTag(r2.A01);
            C168818jj r12 = r1.A01;
            List list = C42011xT.A0I;
            r12.A00.A04(thumbnailButton, r2.A00, new ANP(thumbnailButton, 1), new ANZ(thumbnailButton, 1), 2);
        }
        return relativeLayout;
    }

    public final HorizontalScrollView getMediaScroller() {
        return this.A00;
    }

    public final LinearLayout getMediaThumbs() {
        return this.A02;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CategoryMediaCard(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CategoryMediaCard(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CategoryMediaCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }
}
