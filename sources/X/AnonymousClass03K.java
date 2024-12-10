package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* renamed from: X.03K  reason: invalid class name */
public class AnonymousClass03K implements AnonymousClass03J {
    public int A00 = 0;
    public int A01;
    public Drawable A02;
    public Drawable A03;
    public Drawable A04;
    public Drawable A05;
    public View A06;
    public Window.Callback A07;
    public Toolbar A08;
    public CharSequence A09;
    public CharSequence A0A;
    public CharSequence A0B;
    public boolean A0C;
    public boolean A0D;
    public AnonymousClass03I A0E;

    public void CIN() {
        this.A08.setCollapsible(false);
    }

    public static void A00(AnonymousClass03K r2) {
        Drawable drawable;
        int i = r2.A01;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = r2.A04) == null) {
            drawable = r2.A03;
        }
        r2.A08.setLogo(drawable);
    }

    public static void A01(AnonymousClass03K r2, CharSequence charSequence) {
        r2.A0B = charSequence;
        if ((r2.A01 & 8) != 0) {
            Toolbar toolbar = r2.A08;
            toolbar.setTitle(charSequence);
            if (r2.A0D) {
                AnonymousClass1HF.A0n(toolbar.getRootView(), charSequence);
            }
        }
    }

    public boolean BEF() {
        return this.A08.A0R();
    }

    public void BFA() {
        this.A08.A0G();
    }

    public void BIt() {
        this.A08.A0H();
    }

    public Menu BUe() {
        return this.A08.getMenu();
    }

    public boolean Bcb() {
        return this.A08.A0S();
    }

    public boolean Bcz() {
        return this.A08.A0T();
    }

    public boolean Bfi() {
        return this.A08.A0U();
    }

    public boolean Bfj() {
        return this.A08.A0V();
    }

    public void CI3(Drawable drawable) {
        this.A08.setBackground(drawable);
    }

    public void CIc(View view) {
        View view2 = this.A06;
        if (!(view2 == null || (this.A01 & 16) == 0)) {
            this.A08.removeView(view2);
        }
        this.A06 = view;
        if (view != null && (this.A01 & 16) != 0) {
            this.A08.addView(view);
        }
    }

    public void CIk(int i) {
        View view;
        CharSequence charSequence;
        Drawable drawable;
        int i2 = this.A01 ^ i;
        this.A01 = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    CharSequence charSequence2 = this.A09;
                    boolean isEmpty = TextUtils.isEmpty(charSequence2);
                    Toolbar toolbar = this.A08;
                    if (isEmpty) {
                        toolbar.setNavigationContentDescription(this.A00);
                    } else {
                        toolbar.setNavigationContentDescription(charSequence2);
                    }
                }
                int i3 = this.A01 & 4;
                Toolbar toolbar2 = this.A08;
                if (i3 != 0) {
                    drawable = this.A05;
                    if (drawable == null) {
                        drawable = this.A02;
                    }
                } else {
                    drawable = null;
                }
                toolbar2.setNavigationIcon(drawable);
            }
            if ((i2 & 3) != 0) {
                A00(this);
            }
            if ((i2 & 8) != 0) {
                int i4 = i & 8;
                Toolbar toolbar3 = this.A08;
                if (i4 != 0) {
                    toolbar3.setTitle(this.A0B);
                    charSequence = this.A0A;
                } else {
                    charSequence = null;
                    toolbar3.setTitle((CharSequence) null);
                }
                toolbar3.setSubtitle(charSequence);
            }
            if ((i2 & 16) != 0 && (view = this.A06) != null) {
                int i5 = i & 16;
                Toolbar toolbar4 = this.A08;
                if (i5 != 0) {
                    toolbar4.addView(view);
                } else {
                    toolbar4.removeView(view);
                }
            }
        }
    }

    public void CJM(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = AnonymousClass02D.A03().A09(this.A08.getContext(), i);
        } else {
            drawable = null;
        }
        this.A04 = drawable;
        A00(this);
    }

    public void CJR(C004301w r2, AnonymousClass01U r3) {
        this.A08.setMenuCallbacks(r2, r3);
    }

    public void CJZ(int i) {
        CJa(AnonymousClass02D.A03().A09(this.A08.getContext(), i));
    }

    public void CJa(Drawable drawable) {
        this.A05 = drawable;
        int i = this.A01 & 4;
        Toolbar toolbar = this.A08;
        Drawable drawable2 = null;
        if (i != 0) {
            drawable2 = drawable;
            if (drawable == null) {
                drawable2 = this.A02;
            }
        }
        toolbar.setNavigationIcon(drawable2);
    }

    public void CKz(CharSequence charSequence) {
        this.A0A = charSequence;
        if ((this.A01 & 8) != 0) {
            this.A08.setSubtitle(charSequence);
        }
    }

    public AnonymousClass1HC CLZ(int i, long j) {
        AnonymousClass1HC A0B2 = AnonymousClass1HF.A0B(this.A08);
        float f = 0.0f;
        if (i == 0) {
            f = 1.0f;
        }
        A0B2.A03(f);
        A0B2.A08(j);
        A0B2.A0B(new AnonymousClass0Bj(this, i));
        return A0B2;
    }

    public boolean CN0() {
        return this.A08.A0W();
    }

    public Context getContext() {
        return this.A08.getContext();
    }

    public int getHeight() {
        return this.A08.getHeight();
    }

    public CharSequence getTitle() {
        return this.A08.getTitle();
    }

    public void setIcon(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = AnonymousClass02D.A03().A09(this.A08.getContext(), i);
        } else {
            drawable = null;
        }
        this.A03 = drawable;
        A00(this);
    }

    public void setMenu(Menu menu, C004301w r4) {
        AnonymousClass03I r1 = this.A0E;
        if (r1 == null) {
            r1 = new AnonymousClass03I(this.A08.getContext());
            this.A0E = r1;
            r1.A0D();
        }
        r1.CIA(r4);
        this.A08.setMenu((C003301m) menu, r1);
    }

    public void setVisibility(int i) {
        this.A08.setVisibility(i);
    }

    public AnonymousClass03K(Toolbar toolbar, boolean z) {
        String string;
        Drawable drawable;
        this.A08 = toolbar;
        CharSequence title = toolbar.getTitle();
        this.A0B = title;
        this.A0A = toolbar.getSubtitle();
        this.A0D = title != null;
        this.A05 = toolbar.getNavigationIcon();
        C002401c A002 = C002401c.A00(toolbar.getContext(), (AttributeSet) null, C002501d.A00, 2130968594, 0);
        this.A02 = A002.A03(15);
        if (z) {
            TypedArray typedArray = A002.A02;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.A0D = true;
                A01(this, text);
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                CKz(text2);
            }
            Drawable A032 = A002.A03(20);
            if (A032 != null) {
                this.A04 = A032;
                A00(this);
            }
            Drawable A033 = A002.A03(17);
            if (A033 != null) {
                this.A03 = A033;
                A00(this);
            }
            if (this.A05 == null && (drawable = this.A02) != null) {
                CJa(drawable);
            }
            CIk(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                CIc(LayoutInflater.from(this.A08.getContext()).inflate(resourceId, this.A08, false));
                CIk(this.A01 | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = this.A08.getLayoutParams();
                layoutParams.height = layoutDimension;
                this.A08.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                this.A08.A0O(Math.max(dimensionPixelOffset, 0), Math.max(dimensionPixelOffset2, 0));
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Toolbar toolbar2 = this.A08;
                toolbar2.A0Q(toolbar2.getContext(), resourceId2);
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Toolbar toolbar3 = this.A08;
                toolbar3.A0P(toolbar3.getContext(), resourceId3);
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                this.A08.setPopupTheme(resourceId4);
            }
        } else {
            Toolbar toolbar4 = this.A08;
            int i = 11;
            if (toolbar4.getNavigationIcon() != null) {
                i = 15;
                this.A02 = toolbar4.getNavigationIcon();
            }
            this.A01 = i;
        }
        A002.A02.recycle();
        if (2131898643 != this.A00) {
            this.A00 = 2131898643;
            if (TextUtils.isEmpty(this.A08.getNavigationContentDescription())) {
                int i2 = this.A00;
                if (i2 == 0) {
                    string = null;
                } else {
                    string = this.A08.getContext().getString(i2);
                }
                this.A09 = string;
                if ((this.A01 & 4) != 0) {
                    boolean isEmpty = TextUtils.isEmpty(string);
                    Toolbar toolbar5 = this.A08;
                    if (isEmpty) {
                        toolbar5.setNavigationContentDescription(this.A00);
                    } else {
                        toolbar5.setNavigationContentDescription(this.A09);
                    }
                }
            }
        }
        this.A09 = this.A08.getNavigationContentDescription();
        this.A08.setNavigationOnClickListener(new AnonymousClass03b(this));
    }

    public Toolbar BbY() {
        return this.A08;
    }
}
