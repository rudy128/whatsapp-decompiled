package com.whatsapp.insights;

import X.AnonymousClass000;
import X.AnonymousClass1DF;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3QV;
import X.AnonymousClass4CY;
import X.AnonymousClass4ZS;
import X.AnonymousClass5I6;
import X.AnonymousClass5I7;
import X.AnonymousClass5I8;
import X.C18000vb;
import X.C18070vi;
import X.C18100vl;
import X.C28931bI;
import X.C72463Mc;
import X.C84144If;
import X.C86044Py;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.WaTextView;

public final class InsightsTileView extends AnonymousClass3QV {
    public C18000vb A00;
    public AnonymousClass4ZS A01;
    public C86044Py A02;
    public final C18100vl A03;
    public final C18100vl A04;
    public final C18100vl A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InsightsTileView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes;
        C18070vi.A0d(context, 1);
        this.A05 = AnonymousClass1DF.A01(new AnonymousClass5I8(this));
        this.A03 = AnonymousClass1DF.A01(new AnonymousClass5I6(this));
        this.A04 = AnonymousClass1DF.A01(new AnonymousClass5I7(this));
        View.inflate(context, 2131625709, this);
        setOrientation(1);
        AnonymousClass3MY.A14(getResources(), this, 2131169545);
        Resources.Theme theme = context.getTheme();
        if (!(theme == null || (obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C84144If.A0C, 0, 0)) == null)) {
            try {
                getNumberView().setText(getWhatsAppLocale().A0E(obtainStyledAttributes, 0));
                getTitleView().setText(getWhatsAppLocale().A0E(obtainStyledAttributes, 1));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        C86044Py r0 = new C86044Py(AnonymousClass3MY.A04(this));
        this.A02 = r0;
        AnonymousClass3MY.A0v(r0.A00, this, 2131233607);
        A00((Integer) null, true);
    }

    public final void setLargeNumberFormatterUtil(AnonymousClass4ZS r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    private final C28931bI getIconView() {
        return AnonymousClass3MX.A0v(this.A03);
    }

    private final WaTextView getNumberView() {
        return (WaTextView) AnonymousClass3MX.A14(this.A04);
    }

    public static /* synthetic */ void setNumber$default(InsightsTileView insightsTileView, Integer num, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        insightsTileView.A00(num, z);
    }

    public final void A00(Integer num, boolean z) {
        WaTextView waTextView;
        String str;
        if (num == null || (z && num.intValue() < 0)) {
            waTextView = getNumberView();
            str = "— —";
        } else {
            waTextView = getNumberView();
            AnonymousClass4ZS largeNumberFormatterUtil = getLargeNumberFormatterUtil();
            Resources A0Y = AnonymousClass000.A0Y(this);
            C18070vi.A0X(A0Y);
            str = largeNumberFormatterUtil.A02(A0Y, num, false);
        }
        waTextView.setText(str);
    }

    public final AnonymousClass4ZS getLargeNumberFormatterUtil() {
        AnonymousClass4ZS r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("largeNumberFormatterUtil");
        throw null;
    }

    public final WaTextView getTitleView() {
        return (WaTextView) AnonymousClass3MX.A14(this.A05);
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public final void setArrow(AnonymousClass4CY r5) {
        int ordinal;
        WaTextView waTextView;
        int i;
        if (r5 == null) {
            ordinal = -1;
        } else {
            ordinal = r5.ordinal();
        }
        if (ordinal != 0) {
            waTextView = getNumberView();
            if (ordinal != 1) {
                waTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
                return;
            }
            i = 2131231019;
        } else {
            waTextView = getNumberView();
            i = 2131231020;
        }
        waTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, i, 0);
    }

    public final void setIcon(Integer num) {
        if (num == null) {
            C18100vl r1 = this.A03;
            if (AnonymousClass3MX.A0v(r1).A00 != null) {
                C72463Mc.A1G(AnonymousClass3MX.A0v(r1));
                return;
            }
            return;
        }
        C18100vl r2 = this.A03;
        ((ImageView) AnonymousClass3MX.A0v(r2).A02()).setImageResource(num.intValue());
        AnonymousClass3MX.A0v(r2).A04(0);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        getNumberView().setEnabled(z);
        getTitleView().setEnabled(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r3 == null) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setOnClickListener(android.view.View.OnClickListener r3) {
        /*
            r2 = this;
            super.setOnClickListener(r3)
            X.4Py r1 = r2.A02
            if (r1 != 0) goto L_0x000c
            X.AnonymousClass3MW.A19()
            r0 = 0
            throw r0
        L_0x000c:
            boolean r0 = r2.isEnabled()
            if (r0 == 0) goto L_0x0015
            r0 = 1
            if (r3 != 0) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            android.graphics.drawable.Drawable r0 = r1.A00(r0)
            r2.setBackground(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.insights.InsightsTileView.setOnClickListener(android.view.View$OnClickListener):void");
    }

    public final void setTitle(int i) {
        getTitleView().setText(i);
    }

    public /* synthetic */ InsightsTileView(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InsightsTileView(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }
}
