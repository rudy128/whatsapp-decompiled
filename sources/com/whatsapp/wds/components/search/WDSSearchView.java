package com.whatsapp.wds.components.search;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass11C;
import X.AnonymousClass1Y0;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4CB;
import X.AnonymousClass4CC;
import X.AnonymousClass4CD;
import X.AnonymousClass4CM;
import X.AnonymousClass4M5;
import X.AnonymousClass4S0;
import X.C107795ab;
import X.C18070vi;
import X.C19740yt;
import X.C22821Di;
import X.C24261Jm;
import X.C29261bv;
import X.C89554ce;
import X.C90134da;
import X.C90944et;
import X.C99204sR;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.whatsapp.WaImageButton;
import com.whatsapp.wds.components.edittext.WDSEditText;

public final class WDSSearchView extends FrameLayout implements AnonymousClass009 {
    public AnonymousClass11C A00;
    public AnonymousClass4M5 A01;
    public AnonymousClass4S0 A02;
    public AnonymousClass031 A03;
    public String A04;
    public boolean A05;
    public AnonymousClass4CM A06;
    public final ImageButton A07;
    public final WaImageButton A08;
    public final WDSEditText A09;
    public final LinearLayout A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        if (!this.A05) {
            this.A05 = true;
            this.A00 = AnonymousClass3Ma.A0a(AnonymousClass3MW.A0O(generatedComponent()));
        }
        this.A04 = "";
        AnonymousClass4CM r5 = AnonymousClass4CM.NORMAL;
        this.A06 = r5;
        View.inflate(context, 2131627591, this);
        this.A08 = (WaImageButton) findViewById(2131436337);
        this.A09 = (WDSEditText) findViewById(2131434969);
        ImageButton imageButton = (ImageButton) findViewById(2131428012);
        this.A07 = imageButton;
        this.A0A = (LinearLayout) findViewById(2131428019);
        if (attributeSet != null) {
            int[] iArr = AnonymousClass1Y0.A0F;
            C18070vi.A0Z(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            int resourceId = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId != 0) {
                setHint((CharSequence) obtainStyledAttributes.getResources().getString(resourceId));
            }
            if (obtainStyledAttributes.getResourceId(0, 0) != 0) {
                setText((CharSequence) obtainStyledAttributes.getString(1));
            }
            int i = obtainStyledAttributes.getInt(3, 0);
            AnonymousClass4CM[] values = AnonymousClass4CM.values();
            if (i >= 0 && i < values.length) {
                r5 = values[i];
            }
            setVariant(r5);
            A00();
            setTrailingButtonIconWithEnumIndex$app_ui_wds_wds(obtainStyledAttributes.getInt(2, -1));
            obtainStyledAttributes.recycle();
        }
        WDSEditText wDSEditText = this.A09;
        if (this.A02 != null) {
            C29261bv.A08(wDSEditText, 2132084412);
            C89554ce.A00(wDSEditText, this, 8);
            wDSEditText.setOnFocusChangeListener(new C90134da(this, 7));
            wDSEditText.setHintTextColor(C19740yt.A00(getContext(), 2131102506));
            AnonymousClass4S0 r1 = this.A02;
            if (r1 != null) {
                imageButton.setImageDrawable(r1.A00(C24261Jm.A00(context, 2131231675)));
                AnonymousClass3MX.A1D(getResources(), this.A07, 2131898718);
                return;
            }
        }
        AnonymousClass3MW.A19();
        throw null;
    }

    public static final void setUpTrailingButtonIcon$lambda$4$lambda$3(WDSSearchView wDSSearchView, View view) {
        C18070vi.A0d(wDSSearchView, 0);
        AnonymousClass4M5 r1 = wDSSearchView.A01;
        if (C18070vi.A18(r1, AnonymousClass4CB.A00)) {
            AnonymousClass3MW.A1S(wDSSearchView.A09);
            return;
        }
        AnonymousClass4M5 r2 = AnonymousClass4CD.A00;
        boolean A18 = C18070vi.A18(r1, r2);
        WDSEditText wDSEditText = wDSSearchView.A09;
        if (A18) {
            wDSEditText.setInputType(1);
            r2 = AnonymousClass4CC.A00;
        } else {
            wDSEditText.setInputType(3);
        }
        wDSSearchView.setTrailingButtonIcon(r2);
    }

    public final void setOnQueryTextSubmitListener(C22821Di r4) {
        C18070vi.A0d(r4, 0);
        WDSEditText wDSEditText = this.A09;
        wDSEditText.setImeOptions(3);
        wDSEditText.setOnEditorActionListener(new C90944et(r4, 6));
    }

    public final void setTrailingButtonIconWithEnumIndex$app_ui_wds_wds(int i) {
        AnonymousClass4M5 r0;
        if (i != -1) {
            if (i == 0) {
                r0 = AnonymousClass4CB.A00;
            } else if (i == 1) {
                r0 = AnonymousClass4CC.A00;
            } else if (i == 2) {
                r0 = AnonymousClass4CD.A00;
            }
            setTrailingButtonIcon(r0);
        }
        r0 = null;
        setTrailingButtonIcon(r0);
    }

    public final void setVariant(AnonymousClass4CM r2) {
        C18070vi.A0d(r2, 0);
        boolean A1Z = AnonymousClass3Ma.A1Z(this.A06, r2);
        this.A06 = r2;
        if (A1Z) {
            A00();
        }
    }

    public final void A01() {
        InputMethodManager A0N;
        AnonymousClass11C r0 = this.A00;
        if (r0 != null && (A0N = r0.A0N()) != null && !A0N.isFullscreenMode()) {
            WDSEditText wDSEditText = this.A09;
            if (A0N.isActive(wDSEditText)) {
                A0N.showSoftInput(wDSEditText, 0);
            } else {
                wDSEditText.requestFocus();
            }
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A03;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public final ImageButton getBackButton() {
        return this.A07;
    }

    public final AnonymousClass11C getSystemServices() {
        return this.A00;
    }

    public final Editable getText() {
        return this.A09.getText();
    }

    public final AnonymousClass4M5 getTrailingButtonIcon() {
        return this.A01;
    }

    public final AnonymousClass4CM getVariant() {
        return this.A06;
    }

    public final void setBackImageDrawableRes(int i) {
        ImageButton imageButton = this.A07;
        AnonymousClass4S0 r1 = this.A02;
        if (r1 == null) {
            AnonymousClass3MW.A19();
            throw null;
        } else {
            imageButton.setImageDrawable(r1.A00(AnonymousClass3MZ.A0B(this, i)));
        }
    }

    public final void setHint(int i) {
        this.A09.setHint(i);
    }

    public final void setOnQueryTextChangeListener(C107795ab r4) {
        C89554ce.A00(this.A09, new C99204sR(r4, this, 8), 7);
    }

    public final void setText(int i) {
        this.A09.setText(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setTrailingButtonIcon(X.AnonymousClass4M5 r5) {
        /*
            r4 = this;
            r4.A01 = r5
            if (r5 == 0) goto L_0x006e
            X.4CB r0 = X.AnonymousClass4CB.A00
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0053
            com.whatsapp.wds.components.edittext.WDSEditText r0 = r4.A09
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x001a
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0053
        L_0x001a:
            com.whatsapp.WaImageButton r3 = r4.A08
            r0 = 4
        L_0x001d:
            r3.setVisibility(r0)
            X.4M5 r1 = r4.A01
            X.4CD r0 = X.AnonymousClass4CD.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x003f
            com.whatsapp.wds.components.edittext.WDSEditText r1 = r4.A09
            r0 = 3
            r1.setInputType(r0)
            r0 = 2131886199(0x7f120077, float:1.940697E38)
        L_0x0033:
            X.AnonymousClass1Y5.A03(r3, r0)
        L_0x0036:
            X.4S0 r2 = r4.A02
            if (r2 != 0) goto L_0x0057
            X.AnonymousClass3MW.A19()
            r0 = 0
            throw r0
        L_0x003f:
            X.4M5 r1 = r4.A01
            X.4CC r0 = X.AnonymousClass4CC.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0036
            com.whatsapp.wds.components.edittext.WDSEditText r1 = r4.A09
            r0 = 1
            r1.setInputType(r0)
            r0 = 2131886198(0x7f120076, float:1.9406968E38)
            goto L_0x0033
        L_0x0053:
            com.whatsapp.WaImageButton r3 = r4.A08
            r0 = 0
            goto L_0x001d
        L_0x0057:
            android.content.Context r1 = r4.getContext()
            int r0 = r5.A00
            android.graphics.drawable.Drawable r0 = X.AnonymousClass03S.A01(r1, r0)
            android.graphics.drawable.Drawable r0 = r2.A00(r0)
            r3.setImageDrawable(r0)
            r0 = 15
            X.AnonymousClass3MZ.A1M(r3, r4, r0)
            return
        L_0x006e:
            com.whatsapp.WaImageButton r1 = r4.A08
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.search.WDSSearchView.setTrailingButtonIcon(X.4M5):void");
    }

    private final void A00() {
        AnonymousClass4S0 r0 = new AnonymousClass4S0(AnonymousClass3MY.A04(this), this.A06);
        this.A02 = r0;
        AnonymousClass3MY.A0v(r0.A02, this, r0.A00);
        LinearLayout linearLayout = this.A0A;
        AnonymousClass4S0 r02 = this.A02;
        if (r02 == null) {
            AnonymousClass3MW.A19();
            throw null;
        } else {
            linearLayout.setBackground(r02.A01());
        }
    }

    public final void setSystemServices(AnonymousClass11C r1) {
        this.A00 = r1;
    }

    public WDSSearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A05) {
            this.A05 = true;
            this.A00 = AnonymousClass3Ma.A0a(AnonymousClass3MW.A0O(generatedComponent()));
        }
    }

    public final void setHint(CharSequence charSequence) {
        this.A09.setHint(charSequence);
    }

    public final void setText(CharSequence charSequence) {
        this.A09.setText(charSequence);
    }
}
