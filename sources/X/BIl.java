package X;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

public class BIl extends LinearLayout {
    public int A00;
    public ColorStateList A01;
    public PorterDuff.Mode A02;
    public View.OnLongClickListener A03;
    public ImageView.ScaleType A04;
    public CharSequence A05;
    public boolean A06;
    public final TextView A07;
    public final CheckableImageButton A08;
    public final TextInputLayout A09;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r3.A06 != false) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.BIl r3) {
        /*
            java.lang.CharSequence r0 = r3.A05
            r2 = 0
            if (r0 == 0) goto L_0x000a
            boolean r0 = r3.A06
            r1 = 0
            if (r0 == 0) goto L_0x000c
        L_0x000a:
            r1 = 8
        L_0x000c:
            com.google.android.material.internal.CheckableImageButton r0 = r3.A08
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0018
            if (r1 == 0) goto L_0x0018
            r2 = 8
        L_0x0018:
            r3.setVisibility(r2)
            android.widget.TextView r0 = r3.A07
            r0.setVisibility(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r3.A09
            r0.A0J()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BIl.A00(X.BIl):void");
    }

    public void A01() {
        int paddingStart;
        EditText editText = this.A09.A0B;
        if (editText != null) {
            if (this.A08.getVisibility() == 0) {
                paddingStart = 0;
            } else {
                paddingStart = editText.getPaddingStart();
            }
            this.A07.setPaddingRelative(paddingStart, editText.getCompoundPaddingTop(), AnonymousClass000.A0Y(this).getDimensionPixelSize(2131167667), editText.getCompoundPaddingBottom());
        }
    }

    public void A02(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.A08;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            TextInputLayout textInputLayout = this.A09;
            C26165Cte.A01(this.A01, this.A02, checkableImageButton, textInputLayout);
            A03(true);
            C26165Cte.A02(this.A01, checkableImageButton, textInputLayout);
            return;
        }
        A03(false);
        View.OnLongClickListener onLongClickListener = this.A03;
        checkableImageButton.setOnClickListener((View.OnClickListener) null);
        C26165Cte.A03(onLongClickListener, checkableImageButton);
        this.A03 = null;
        checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
        C26165Cte.A03((View.OnLongClickListener) null, checkableImageButton);
        BE9.A16(checkableImageButton, (CharSequence) null);
    }

    public void A03(boolean z) {
        CheckableImageButton checkableImageButton = this.A08;
        if (AnonymousClass000.A1P(checkableImageButton.getVisibility()) != z) {
            checkableImageButton.setVisibility(C72453Mb.A07(z ? 1 : 0));
            A01();
            A00(this);
        }
    }

    public BIl(C002401c r10, TextInputLayout textInputLayout) {
        super(textInputLayout.getContext());
        this.A09 = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) AnonymousClass3MZ.A0D(this).inflate(2131625084, this, false);
        this.A08 = checkableImageButton;
        C26165Cte.A04(checkableImageButton);
        AnonymousClass03P r4 = new AnonymousClass03P(getContext());
        this.A07 = r4;
        if (AnonymousClass1YT.A04(getContext())) {
            AnonymousClass3MW.A0B(this.A08).setMarginEnd(0);
        }
        CheckableImageButton checkableImageButton2 = this.A08;
        View.OnLongClickListener onLongClickListener = this.A03;
        checkableImageButton2.setOnClickListener((View.OnClickListener) null);
        C26165Cte.A03(onLongClickListener, checkableImageButton2);
        this.A03 = null;
        checkableImageButton2.setOnLongClickListener((View.OnLongClickListener) null);
        C26165Cte.A03((View.OnLongClickListener) null, checkableImageButton2);
        TypedArray typedArray = r10.A02;
        if (typedArray.hasValue(67)) {
            this.A01 = AnonymousClass1YT.A02(getContext(), r10, 67);
        }
        if (typedArray.hasValue(68)) {
            this.A02 = AnonymousClass1YU.A01((PorterDuff.Mode) null, typedArray.getInt(68, -1));
        }
        if (typedArray.hasValue(64)) {
            A02(r10.A03(64));
            if (typedArray.hasValue(63)) {
                BE9.A16(checkableImageButton2, typedArray.getText(63));
            }
            checkableImageButton2.setCheckable(typedArray.getBoolean(62, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(65, getResources().getDimensionPixelSize(2131167880));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.A00) {
                this.A00 = dimensionPixelSize;
                checkableImageButton2.setMinimumWidth(dimensionPixelSize);
                checkableImageButton2.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray.hasValue(66)) {
                ImageView.ScaleType A002 = C26165Cte.A00(typedArray.getInt(66, -1));
                this.A04 = A002;
                checkableImageButton2.setScaleType(A002);
            }
            TextView textView = this.A07;
            textView.setVisibility(8);
            textView.setId(2131436099);
            textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            textView.setAccessibilityLiveRegion(1);
            C29261bv.A08(textView, typedArray.getResourceId(58, 0));
            if (typedArray.hasValue(59)) {
                textView.setTextColor(r10.A01(59));
            }
            CharSequence text = typedArray.getText(57);
            this.A05 = TextUtils.isEmpty(text) ? null : text;
            textView.setText(text);
            A00(this);
            addView(checkableImageButton);
            addView(r4);
            return;
        }
        throw AnonymousClass000.A0k("startIconSize cannot be less than 0");
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        A01();
    }
}
