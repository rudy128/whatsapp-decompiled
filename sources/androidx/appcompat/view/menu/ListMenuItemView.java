package androidx.appcompat.view.menu;

import X.AnonymousClass03G;
import X.C002401c;
import X.C002501d;
import X.C008003p;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class ListMenuItemView extends LinearLayout implements C008003p, AbsListView.SelectionBoundsAdjuster {
    public ImageView A00;
    public LinearLayout A01;
    public TextView A02;
    public AnonymousClass03G A03;
    public int A04;
    public Context A05;
    public Drawable A06;
    public Drawable A07;
    public LayoutInflater A08;
    public CheckBox A09;
    public ImageView A0A;
    public ImageView A0B;
    public RadioButton A0C;
    public TextView A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;

    public boolean CCE() {
        return false;
    }

    private LayoutInflater getInflater() {
        LayoutInflater layoutInflater = this.A08;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater from = LayoutInflater.from(getContext());
        this.A08 = from;
        return from;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.A0B;
        if (imageView != null) {
            int i = 8;
            if (z) {
                i = 0;
            }
            imageView.setVisibility(i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BdW(X.AnonymousClass03G r5) {
        /*
            r4 = this;
            r4.A03 = r5
            boolean r1 = r5.isVisible()
            r0 = 8
            if (r1 == 0) goto L_0x000b
            r0 = 0
        L_0x000b:
            r4.setVisibility(r0)
            java.lang.CharSequence r0 = r5.A02(r4)
            r4.setTitle(r0)
            boolean r0 = r5.isCheckable()
            r4.setCheckable(r0)
            boolean r0 = r5.A0I()
            if (r0 == 0) goto L_0x005e
            X.03G r3 = r4.A03
            boolean r0 = r3.A0I()
            if (r0 == 0) goto L_0x005e
            r2 = 0
            android.widget.TextView r1 = r4.A02
            java.lang.String r0 = r3.A03()
            r1.setText(r0)
        L_0x0034:
            android.widget.TextView r0 = r4.A02
            int r0 = r0.getVisibility()
            if (r0 == r2) goto L_0x0041
            android.widget.TextView r0 = r4.A02
            r0.setVisibility(r2)
        L_0x0041:
            android.graphics.drawable.Drawable r0 = r5.getIcon()
            r4.setIcon(r0)
            boolean r0 = r5.isEnabled()
            r4.setEnabled(r0)
            boolean r0 = r5.hasSubMenu()
            r4.setSubMenuArrowVisible(r0)
            java.lang.CharSequence r0 = r5.getContentDescription()
            r4.setContentDescription(r0)
            return
        L_0x005e:
            r2 = 8
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.BdW(X.03G):void");
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.A0A;
        if (imageView != null && imageView.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A0A.getLayoutParams();
            rect.top += this.A0A.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
    }

    public void onMeasure(int i, int i2) {
        if (this.A00 != null && this.A0G) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = this.A00.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        CompoundButton compoundButton3;
        if (z || this.A0C != null || this.A09 != null) {
            if (this.A03.A0E()) {
                if (this.A0C == null) {
                    A01();
                }
                compoundButton = this.A0C;
                compoundButton3 = this.A09;
                compoundButton2 = compoundButton3;
            } else {
                if (this.A09 == null) {
                    A00();
                }
                compoundButton = this.A09;
                compoundButton2 = compoundButton;
                compoundButton3 = this.A0C;
            }
            if (z) {
                compoundButton.setChecked(this.A03.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (compoundButton3 != null && compoundButton3.getVisibility() != 8) {
                    compoundButton3.setVisibility(8);
                    return;
                }
                return;
            }
            if (compoundButton2 != null) {
                compoundButton2.setVisibility(8);
            }
            RadioButton radioButton = this.A0C;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.A03.A0E()) {
            if (this.A0C == null) {
                A01();
            }
            compoundButton = this.A0C;
        } else {
            if (this.A09 == null) {
                A00();
            }
            compoundButton = this.A09;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.A0E = z;
        this.A0G = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        if (r3 == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setGroupDividerEnabled(boolean r3) {
        /*
            r2 = this;
            android.widget.ImageView r1 = r2.A0A
            if (r1 == 0) goto L_0x0010
            boolean r0 = r2.A0F
            if (r0 != 0) goto L_0x000b
            r0 = 0
            if (r3 != 0) goto L_0x000d
        L_0x000b:
            r0 = 8
        L_0x000d:
            r1.setVisibility(r0)
        L_0x0010:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.setGroupDividerEnabled(boolean):void");
    }

    public void setIcon(Drawable drawable) {
        boolean z;
        if (this.A03.A0H() || this.A0E) {
            z = true;
        } else {
            z = false;
            if (!this.A0G) {
                return;
            }
        }
        if (this.A00 == null) {
            if (drawable != null || this.A0G) {
                ImageView imageView = (ImageView) getInflater().inflate(2131623951, this, false);
                this.A00 = imageView;
                LinearLayout linearLayout = this.A01;
                if (linearLayout != null) {
                    linearLayout.addView(imageView, 0);
                } else {
                    addView(imageView, 0);
                }
            } else {
                return;
            }
        }
        if (drawable != null || this.A0G) {
            ImageView imageView2 = this.A00;
            if (!z) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.A00.getVisibility() != 0) {
                this.A00.setVisibility(0);
                return;
            }
            return;
        }
        this.A00.setVisibility(8);
    }

    public void setTitle(CharSequence charSequence) {
        int i;
        TextView textView;
        TextView textView2 = this.A0D;
        if (charSequence != null) {
            textView2.setText(charSequence);
            if (this.A0D.getVisibility() != 0) {
                textView = this.A0D;
                i = 0;
            } else {
                return;
            }
        } else {
            i = 8;
            if (textView2.getVisibility() != 8) {
                textView = this.A0D;
            } else {
                return;
            }
        }
        textView.setVisibility(i);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C002401c A002 = C002401c.A00(getContext(), attributeSet, C002501d.A0H, i, 0);
        this.A06 = A002.A03(5);
        TypedArray typedArray = A002.A02;
        this.A04 = typedArray.getResourceId(1, -1);
        this.A0G = typedArray.getBoolean(7, false);
        this.A05 = context;
        this.A07 = A002.A03(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, 2130969408, 0);
        this.A0F = obtainStyledAttributes.hasValue(0);
        typedArray.recycle();
        obtainStyledAttributes.recycle();
    }

    private void A00() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(2131623950, this, false);
        this.A09 = checkBox;
        LinearLayout linearLayout = this.A01;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }

    private void A01() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(2131623953, this, false);
        this.A0C = radioButton;
        LinearLayout linearLayout = this.A01;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    public AnonymousClass03G getItemData() {
        return this.A03;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.A06);
        TextView textView = (TextView) findViewById(2131436208);
        this.A0D = textView;
        int i = this.A04;
        if (i != -1) {
            textView.setTextAppearance(this.A05, i);
        }
        this.A02 = (TextView) findViewById(2131435433);
        ImageView imageView = (ImageView) findViewById(2131435878);
        this.A0B = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.A07);
        }
        this.A0A = (ImageView) findViewById(2131431255);
        this.A01 = (LinearLayout) findViewById(2131429510);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130970324);
    }
}
