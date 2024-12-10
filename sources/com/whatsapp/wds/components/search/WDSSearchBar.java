package com.whatsapp.wds.components.search;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass112;
import X.AnonymousClass11C;
import X.AnonymousClass1Y0;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3Mo;
import X.AnonymousClass4CM;
import X.AnonymousClass4S0;
import X.C17880vN;
import X.C18000vb;
import X.C18070vi;
import X.C19740yt;
import X.C28271Zs;
import X.C28281Zt;
import X.C72473Md;
import X.C99314sc;
import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.wds.components.edittext.WDSEditText;

public final class WDSSearchBar extends FrameLayout implements AnonymousClass009 {
    public int A00;
    public C18000vb A01;
    public AnonymousClass4S0 A02;
    public AnonymousClass4CM A03;
    public AnonymousClass031 A04;
    public boolean A05;
    public boolean A06;
    public final Toolbar A07;
    public final WDSSearchView A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSSearchBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        if (!this.A06) {
            this.A06 = true;
            this.A01 = C72473Md.A0S((AnonymousClass033) generatedComponent());
        }
        AnonymousClass4CM r5 = AnonymousClass4CM.NORMAL;
        this.A03 = r5;
        this.A05 = true;
        View.inflate(context, 2131627590, this);
        WDSSearchView wDSSearchView = (WDSSearchView) findViewById(2131437030);
        this.A08 = wDSSearchView;
        this.A07 = (Toolbar) findViewById(2131436270);
        if (attributeSet != null) {
            int[] iArr = AnonymousClass1Y0.A0E;
            C18070vi.A0Z(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (obtainStyledAttributes.getResourceId(0, 0) != 0) {
                wDSSearchView.setHint((CharSequence) obtainStyledAttributes.getString(1));
            }
            int i = obtainStyledAttributes.getInt(4, 0);
            AnonymousClass4CM[] values = AnonymousClass4CM.values();
            if (i >= 0 && i < values.length) {
                r5 = values[i];
            }
            setVariant(r5);
            this.A02 = new AnonymousClass4S0(AnonymousClass3MY.A04(this), this.A03);
            this.A08.setVariant(this.A03);
            wDSSearchView.setTrailingButtonIconWithEnumIndex$app_ui_wds_wds(obtainStyledAttributes.getInt(3, -1));
            obtainStyledAttributes.recycle();
        }
        AnonymousClass3MZ.A1M(wDSSearchView.A07, this, 14);
        if (!AnonymousClass000.A1P(this.A08.getVisibility())) {
            A00();
        }
    }

    public final void setVariant(AnonymousClass4CM r4) {
        C18070vi.A0d(r4, 0);
        boolean A1Z = AnonymousClass3Ma.A1Z(this.A03, r4);
        this.A03 = r4;
        if (A1Z) {
            this.A02 = new AnonymousClass4S0(AnonymousClass3MY.A04(this), this.A03);
            this.A08.setVariant(this.A03);
        }
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final boolean A02(boolean z) {
        int i;
        InputMethodManager A0N;
        if (!this.A05) {
            return false;
        }
        this.A07.setVisibility(0);
        WDSSearchView wDSSearchView = this.A08;
        wDSSearchView.setText((CharSequence) "");
        WDSEditText wDSEditText = wDSSearchView.A09;
        AnonymousClass11C r0 = wDSSearchView.A00;
        if (!(r0 == null || (A0N = r0.A0N()) == null)) {
            A0N.hideSoftInputFromWindow(wDSEditText.getWindowToken(), 0);
        }
        if (!z || !isAttachedToWindow()) {
            wDSSearchView.setVisibility(4);
        } else {
            int i2 = this.A00;
            int width = wDSSearchView.getWidth();
            int i3 = this.A00;
            int max = Math.max(i2, width - i3);
            if (i3 == 0) {
                this.A00 = wDSSearchView.getWidth() / 2;
            }
            if (AnonymousClass3MY.A1b(getWhatsAppLocale())) {
                i = wDSSearchView.getWidth() - this.A00;
            } else {
                i = this.A00;
            }
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(wDSSearchView, i, getHeight() / 2, (float) max, 0.0f);
            createCircularReveal.setDuration(250);
            AnonymousClass3Mo.A00(createCircularReveal, this, 26);
            createCircularReveal.start();
        }
        A00();
        return true;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A04;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public final boolean getCollapsible() {
        return this.A05;
    }

    public final WDSSearchView getSearchView() {
        return this.A08;
    }

    public final AnonymousClass4S0 getStyle() {
        AnonymousClass4S0 r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A19();
        throw null;
    }

    public final Toolbar getToolbar() {
        return this.A07;
    }

    public final AnonymousClass4CM getVariant() {
        return this.A03;
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
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            CharSequence charSequence = bundle.getCharSequence("search_text");
            if (!(charSequence == null || charSequence.length() == 0)) {
                A01(this, true, true);
                this.A00 = bundle.getInt("search_button_x_pos");
                this.A08.setText(charSequence);
            }
            parcelable = bundle.getParcelable("superState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00() {
        /*
            r6 = this;
            android.app.Activity r0 = r6.getActivity()
            if (r0 == 0) goto L_0x005e
            android.view.Window r4 = r0.getWindow()
            android.content.Context r5 = r4.getContext()
            X.C18070vi.A0b(r5)
            r3 = 2130971614(0x7f040bde, float:1.7551971E38)
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            android.util.TypedValue r2 = new android.util.TypedValue     // Catch:{ Exception -> 0x0030 }
            r2.<init>()     // Catch:{ Exception -> 0x0030 }
            android.content.res.Resources$Theme r1 = r5.getTheme()     // Catch:{ Exception -> 0x0030 }
            if (r1 == 0) goto L_0x0027
            r0 = 1
            r1.resolveAttribute(r3, r2, r0)     // Catch:{ Exception -> 0x0030 }
        L_0x0027:
            int r3 = r2.resourceId     // Catch:{ Exception -> 0x0030 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0030 }
            if (r0 == 0) goto L_0x0030
            goto L_0x003a
        L_0x0030:
            r1 = 2130971943(0x7f040d27, float:1.7552639E38)
            r0 = 2131103044(0x7f060d44, float:1.7818543E38)
            int r3 = X.AnonymousClass1YL.A00(r5, r1, r0)
        L_0x003a:
            androidx.appcompat.widget.Toolbar r1 = r6.A07
            boolean r0 = r1 instanceof com.whatsapp.wds.components.topbar.WDSToolbar
            r2 = 0
            if (r0 == 0) goto L_0x005a
            com.whatsapp.wds.components.topbar.WDSToolbar r1 = (com.whatsapp.wds.components.topbar.WDSToolbar) r1
            X.1Xw r0 = r1.A08
            X.1Y3 r1 = r0.A00
            if (r1 == 0) goto L_0x005a
            X.1YM r0 = X.AnonymousClass1YM.A00
            boolean r0 = r1.equals(r0)
            X.C28281Zt.A0A(r4, r0)
        L_0x0052:
            int r0 = X.C19740yt.A00(r5, r3)
            X.C28271Zs.A00(r4, r0, r2)
            return
        L_0x005a:
            X.C28281Zt.A0A(r4, r2)
            goto L_0x0052
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.search.WDSSearchBar.A00():void");
    }

    public static final void A01(WDSSearchBar wDSSearchBar, boolean z, boolean z2) {
        int width;
        int i;
        if (wDSSearchBar.isAttachedToWindow()) {
            WDSSearchView wDSSearchView = wDSSearchBar.A08;
            wDSSearchView.setVisibility(0);
            if (z) {
                wDSSearchView.A01();
            }
            View findViewById = wDSSearchBar.A07.findViewById(2131432620);
            if (findViewById != null) {
                int[] iArr = new int[2];
                findViewById.getLocationInWindow(iArr);
                if (AnonymousClass3MY.A1b(wDSSearchBar.getWhatsAppLocale())) {
                    width = (wDSSearchBar.getWidth() - iArr[0]) - (findViewById.getWidth() / 2);
                } else {
                    width = iArr[0] + (findViewById.getWidth() / 2);
                }
            } else {
                width = wDSSearchBar.getWidth() / 2;
            }
            wDSSearchBar.A00 = width;
            C99314sc r5 = new C99314sc(wDSSearchBar, z);
            if (!z2) {
                r5.invoke();
            } else {
                int max = Math.max(width, wDSSearchView.getWidth() - wDSSearchBar.A00);
                if (AnonymousClass3MY.A1b(wDSSearchBar.getWhatsAppLocale())) {
                    i = wDSSearchView.getWidth() - wDSSearchBar.A00;
                } else {
                    i = wDSSearchBar.A00;
                }
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(wDSSearchView, i, wDSSearchBar.getHeight() / 2, 0.0f, (float) max);
                createCircularReveal.setDuration(250);
                AnonymousClass3Mo.A00(createCircularReveal, r5, 27);
                createCircularReveal.start();
            }
            Activity activity = wDSSearchBar.getActivity();
            if (activity != null) {
                Window window = activity.getWindow();
                Context context = window.getContext();
                int i2 = wDSSearchBar.getStyle().A00;
                if (AnonymousClass112.A01()) {
                    C28281Zt.A08(context, window, i2);
                } else {
                    C28271Zs.A00(window, C19740yt.A00(context, i2), false);
                }
            }
        }
    }

    private final Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public Parcelable onSaveInstanceState() {
        Bundle A0D = C17880vN.A0D();
        A0D.putCharSequence("search_text", this.A08.A09.getText());
        A0D.putInt("search_button_x_pos", this.A00);
        A0D.putParcelable("superState", super.onSaveInstanceState());
        return A0D;
    }

    public final void setCollapsible(boolean z) {
        this.A05 = z;
    }

    public WDSSearchBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A06) {
            this.A06 = true;
            this.A01 = C72473Md.A0S((AnonymousClass033) generatedComponent());
        }
    }
}
