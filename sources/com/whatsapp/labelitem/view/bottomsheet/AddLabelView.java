package com.whatsapp.labelitem.view.bottomsheet;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass11C;
import X.AnonymousClass1KW;
import X.AnonymousClass1NA;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NL;
import X.AnonymousClass3O0;
import X.C18000vb;
import X.C18010vc;
import X.C18070vi;
import X.C19740yt;
import X.C72453Mb;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

public final class AddLabelView extends FrameLayout implements AnonymousClass009 {
    public AnonymousClass11C A00;
    public C18000vb A01;
    public AnonymousClass1NA A02;
    public AnonymousClass1KW A03;
    public C18010vc A04;
    public AnonymousClass00H A05;
    public AnonymousClass031 A06;
    public boolean A07;
    public final WaImageView A08;
    public final WaTextView A09;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AddLabelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public final void setCoreLabelStore(AnonymousClass1NA r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setEmojiLoader(AnonymousClass1KW r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setListsUtil(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setSharedPreferencesFactory(C18010vc r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setSystemServices(AnonymousClass11C r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A06;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A06 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1NA getCoreLabelStore() {
        AnonymousClass1NA r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("coreLabelStore");
        throw null;
    }

    public final AnonymousClass1KW getEmojiLoader() {
        AnonymousClass1KW r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("emojiLoader");
        throw null;
    }

    public final AnonymousClass00H getListsUtil() {
        AnonymousClass00H r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("listsUtil");
        throw null;
    }

    public final C18010vc getSharedPreferencesFactory() {
        C18010vc r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("sharedPreferencesFactory");
        throw null;
    }

    public final AnonymousClass11C getSystemServices() {
        AnonymousClass11C r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1N();
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        AnonymousClass3O0 r0;
        Parcelable parcelable2;
        if (!(!(parcelable instanceof AnonymousClass3O0) || (r0 = (AnonymousClass3O0) parcelable) == null || (parcelable2 = r0.A00) == null)) {
            parcelable = parcelable2;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final void A00() {
        if (getVisibility() != 0) {
            setVisibility(0);
            WaTextView waTextView = this.A09;
            getListsUtil().get();
            waTextView.setText(2131892482);
            if (C72453Mb.A1W(getListsUtil())) {
                waTextView.setTextColor(AnonymousClass3Ma.A01(getContext(), AnonymousClass000.A0Y(this), 2130968627, 2131103280));
            }
            if (C72453Mb.A1W(getListsUtil())) {
                WaImageView waImageView = this.A08;
                AnonymousClass3NL.A01(getContext(), waImageView, getWhatsAppLocale(), 2131231657);
                waImageView.setColorFilter(AnonymousClass3Ma.A01(getContext(), AnonymousClass000.A0Y(this), 2130968627, 2131103280));
                return;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(C19740yt.A00(getContext(), 2131099692));
            WaImageView waImageView2 = this.A08;
            waImageView2.setBackground(gradientDrawable);
            AnonymousClass3NL.A01(getContext(), waImageView2, getWhatsAppLocale(), 2131232826);
        }
    }

    public Parcelable onSaveInstanceState() {
        return new AnonymousClass3O0(super.onSaveInstanceState());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AddLabelView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        C18070vi.A0d(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddLabelView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C18070vi.A0d(context, 1);
        if (!this.A07) {
            this.A07 = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A02 = (AnonymousClass1NA) A0O.A2x.get();
            this.A03 = AnonymousClass3Ma.A0f(A0O);
            this.A05 = AnonymousClass3MX.A0z(A0O);
            this.A04 = AnonymousClass3Ma.A0r(A0O);
            this.A00 = AnonymousClass3Ma.A0a(A0O);
            this.A01 = AnonymousClass10E.A6Q(A0O);
        }
        if (C72453Mb.A1W(getListsUtil())) {
            View inflate = View.inflate(context, 2131626957, this);
            this.A08 = AnonymousClass3MW.A0S(inflate, 2131432104);
            this.A09 = AnonymousClass3MW.A0U(inflate, 2131432105);
            AnonymousClass3MY.A1B(inflate, 2131432103, 8);
        } else {
            View inflate2 = View.inflate(context, 2131626955, this);
            this.A08 = AnonymousClass3MW.A0S(inflate2, 2131431923);
            this.A09 = AnonymousClass3MW.A0U(inflate2, 2131431925);
        }
        setVisibility(8);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AddLabelView(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }
}
