package com.whatsapp.wds.components.search;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass03O;
import X.AnonymousClass03S;
import X.AnonymousClass10E;
import X.AnonymousClass11C;
import X.AnonymousClass1Y0;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4CM;
import X.AnonymousClass4S0;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C29261bv;
import X.C89554ce;
import X.C90134da;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.WaImageButton;

public final class WDSConversationSearchView extends FrameLayout implements AnonymousClass009 {
    public Drawable A00;
    public EditText A01;
    public ImageButton A02;
    public Toolbar A03;
    public WaImageButton A04;
    public AnonymousClass11C A05;
    public C18030ve A06;
    public AnonymousClass4S0 A07;
    public AnonymousClass4CM A08;
    public AnonymousClass031 A09;
    public CharSequence A0A;
    public CharSequence A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public View.OnClickListener A0G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSConversationSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130971947);
        C18070vi.A0d(context, 1);
        if (!this.A0F) {
            this.A0F = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A06 = AnonymousClass10E.A8r(A0O);
            this.A05 = AnonymousClass3Ma.A0a(A0O);
        }
        AnonymousClass4CM r3 = AnonymousClass4CM.NORMAL;
        this.A08 = r3;
        if (attributeSet != null) {
            int[] iArr = AnonymousClass1Y0.A06;
            C18070vi.A0Z(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (obtainStyledAttributes.getResourceId(1, 0) != 0) {
                this.A0A = obtainStyledAttributes.getString(1);
            }
            if (obtainStyledAttributes.getResourceId(0, 0) != 0) {
                this.A0B = obtainStyledAttributes.getString(1);
            }
            this.A00 = obtainStyledAttributes.getDrawable(2);
            this.A0D = obtainStyledAttributes.getBoolean(4, false);
            this.A0E = obtainStyledAttributes.getBoolean(5, false);
            this.A0C = obtainStyledAttributes.getBoolean(3, false);
            int i = obtainStyledAttributes.getInt(6, 0);
            AnonymousClass4CM[] values = AnonymousClass4CM.values();
            if (i >= 0 && i < values.length) {
                r3 = values[i];
            }
            setVariant(r3);
            obtainStyledAttributes.recycle();
        }
        LayoutInflater.from(context).inflate(2131627559, this);
        this.A03 = (Toolbar) findViewById(2131434988);
        this.A02 = (ImageButton) findViewById(2131434978);
        this.A01 = (EditText) findViewById(2131434982);
        this.A04 = (WaImageButton) findViewById(2131434861);
        AnonymousClass4S0 r0 = new AnonymousClass4S0(AnonymousClass3MY.A04(this), this.A08);
        this.A07 = r0;
        this.A03.setBackground(r0.A01());
        if (this.A00 == null && !this.A0D) {
            this.A00 = AnonymousClass03S.A01(getContext(), 2131233425);
        }
        this.A03.setNavigationContentDescription(2131898718);
        setNavigationIcon(this.A00);
        Toolbar toolbar = this.A03;
        if (this.A07 != null) {
            toolbar.setPopupTheme(2132084381);
            EditText editText = this.A01;
            if (this.A07 == null) {
                AnonymousClass3MW.A19();
                throw null;
            }
            C29261bv.A08(editText, 2132084412);
            setHint(this.A0A);
            setText(this.A0B);
            if (this.A0C) {
                editText.setClickable(false);
                editText.setFocusable(false);
                editText.setKeyListener((KeyListener) null);
                editText.setCursorVisible(false);
            } else {
                C89554ce.A00(editText, this, 6);
                editText.setOnFocusChangeListener(new C90134da(this, 6));
            }
            if (!this.A0E && !this.A0C) {
                ImageButton imageButton = this.A02;
                AnonymousClass4S0 r1 = this.A07;
                if (r1 != null) {
                    imageButton.setImageDrawable(r1.A00(imageButton.getDrawable()));
                    AnonymousClass3MZ.A1M(imageButton, this, 13);
                    return;
                }
            } else {
                return;
            }
        }
        AnonymousClass3MW.A19();
        throw null;
    }

    public static final void setUpClearButton$lambda$5(WDSConversationSearchView wDSConversationSearchView, View view) {
        C18070vi.A0d(wDSConversationSearchView, 0);
        AnonymousClass3MW.A1S(wDSConversationSearchView.A01);
        wDSConversationSearchView.A02();
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        C18070vi.A0d(onClickListener, 0);
        this.A03.setNavigationOnClickListener(onClickListener);
    }

    public final void setOnSearchByDateListener(View.OnClickListener onClickListener) {
        C18070vi.A0d(onClickListener, 0);
        this.A04.setOnClickListener(onClickListener);
    }

    public final void setSearchByDate(WaImageButton waImageButton) {
        C18070vi.A0d(waImageButton, 0);
        this.A04 = waImageButton;
    }

    public final void setSystemServices(AnonymousClass11C r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setVariant(AnonymousClass4CM r4) {
        C18070vi.A0d(r4, 0);
        boolean A1Z = AnonymousClass3Ma.A1Z(this.A08, r4);
        this.A08 = r4;
        if (A1Z) {
            AnonymousClass4S0 r0 = new AnonymousClass4S0(AnonymousClass3MY.A04(this), this.A08);
            this.A07 = r0;
            this.A03.setBackground(r0.A01());
        }
    }

    public final void A00() {
        EditText editText = this.A01;
        InputMethodManager A0N = getSystemServices().A0N();
        if (A0N != null) {
            A0N.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View.OnClickListener onClickListener;
        if (this.A0C && motionEvent != null && motionEvent.getAction() == 1 && (onClickListener = this.A0G) != null) {
            onClickListener.onClick(this);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A09;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final EditText getEditText() {
        return this.A01;
    }

    public final CharSequence getHint() {
        return this.A01.getHint();
    }

    public final WaImageButton getSearchByDate() {
        return this.A04;
    }

    public final AnonymousClass11C getSystemServices() {
        AnonymousClass11C r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1N();
        throw null;
    }

    public final Editable getText() {
        return this.A01.getText();
    }

    public final Toolbar getToolbar() {
        return this.A03;
    }

    public final AnonymousClass4CM getVariant() {
        return this.A08;
    }

    public final void setHint(int i) {
        this.A01.setHint(i);
    }

    public final void setNavigationIcon(Drawable drawable) {
        Toolbar toolbar = this.A03;
        AnonymousClass4S0 r0 = this.A07;
        if (r0 == null) {
            AnonymousClass3MW.A19();
            throw null;
        } else {
            toolbar.setNavigationIcon(r0.A00(drawable));
        }
    }

    public final void setOnMenuItemClickListener(AnonymousClass03O r2) {
        this.A03.A0C = r2;
    }

    public final void setText(int i) {
        this.A01.setText(i);
    }

    public final void A01() {
        if (C18020vd.A05(C18040vf.A02, getAbProps(), 6478)) {
            this.A04.setVisibility(0);
            WaImageButton waImageButton = this.A04;
            AnonymousClass4S0 r1 = this.A07;
            if (r1 == null) {
                AnonymousClass3MW.A19();
                throw null;
            }
            waImageButton.setImageDrawable(r1.A00(waImageButton.getDrawable()));
            AnonymousClass3MX.A1D(super.getResources(), this.A04, 2131899371);
        }
    }

    public final void A02() {
        InputMethodManager A0N = getSystemServices().A0N();
        if (A0N != null && !A0N.isFullscreenMode()) {
            EditText editText = this.A01;
            if (A0N.isActive(editText)) {
                A0N.showSoftInput(editText, 0);
            } else {
                editText.requestFocus();
            }
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A0G = onClickListener;
    }

    public final void setHint(CharSequence charSequence) {
        this.A01.setHint(charSequence);
    }

    public final void setNavigationIcon(int i) {
        setNavigationIcon(AnonymousClass03S.A01(getContext(), i));
    }

    public final void setText(CharSequence charSequence) {
        this.A01.setText(charSequence);
    }
}
