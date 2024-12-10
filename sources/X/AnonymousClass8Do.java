package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText;

/* renamed from: X.8Do  reason: invalid class name */
public class AnonymousClass8Do extends LinearLayout implements BDB {
    public int A00;
    public int A01;
    public int A02 = 0;
    public Context A03;
    public Button A04;
    public ImageView A05;
    public LinearLayout A06;
    public ProgressBar A07;
    public RelativeLayout A08;
    public TextView A09;
    public TextView A0A;
    public TextView A0B;
    public Object A0C;
    public String A0D;
    public String A0E = "";
    public String A0F;
    public FormItemEditText A0G;
    public B6S A0H;
    public boolean A0I = false;
    public boolean A0J = false;
    public boolean A0K = false;
    public boolean A0L = false;
    public boolean A0M;
    public boolean A0N = true;
    public boolean A0O;

    public AnonymousClass1HC A00(View view, boolean z) {
        AnonymousClass1HC A0B2 = AnonymousClass1HF.A0B(view);
        float f = 0.0f;
        float f2 = 1.0f;
        float f3 = 0.0f;
        if (z) {
            f3 = 1.0f;
        }
        A0B2.A05(f3);
        if (z) {
            f = 1.0f;
        }
        A0B2.A04(f);
        A0B2.A0A(new AccelerateInterpolator());
        A0B2.A0B(new AnonymousClass8EK(this, z));
        if (!z) {
            f2 = 0.5f;
        }
        A0B2.A03(f2);
        return A0B2;
    }

    public void A01() {
        AnonymousClass1HC A002 = A00(this.A07, false);
        A002.A0A(new AccelerateDecelerateInterpolator());
        A002.A02();
    }

    public void A02(String str, boolean z) {
        Button button = this.A04;
        AnonymousClass8BS.A14(getResources(), button, 2131101983);
        if (!TextUtils.isEmpty(str)) {
            button.setText(str);
        }
        A00(button, z);
        button.setEnabled(false);
        button.setOnClickListener((View.OnClickListener) null);
    }

    public void BAH(String str) {
    }

    public boolean BAI() {
        this.A0G.requestFocus();
        return true;
    }

    public void BCs() {
    }

    public boolean BDg() {
        if (!this.A0J) {
            this.A0J = true;
            setText(this.A0E);
        } else {
            this.A0J = false;
            this.A0G.setText(this.A0E.replaceAll(".", "●"));
        }
        return this.A0J;
    }

    public int BJm() {
        return this.A02;
    }

    public Object getFormDataTag() {
        return this.A0C;
    }

    public FormItemEditText getFormInputView() {
        return this.A0G;
    }

    public B6S getFormItemListener() {
        return this.A0H;
    }

    public int getInputLength() {
        return this.A00;
    }

    public String getSubType() {
        return this.A0F;
    }

    public String getSubtype() {
        return this.A0F;
    }

    public boolean getTextEntered() {
        return this.A0L;
    }

    public boolean getToggleCheckBox() {
        return this.A0K;
    }

    public boolean getToggleCheckbox() {
        return this.A0K;
    }

    public void setActionBarPositionTop(boolean z) {
        this.A0O = z;
        LinearLayout linearLayout = this.A06;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
        if (this.A0O) {
            layoutParams.addRule(10);
            layoutParams.addRule(8, 0);
        } else {
            layoutParams.addRule(10, 0);
            layoutParams.addRule(8, 2131430979);
        }
        linearLayout.setLayoutParams(layoutParams);
    }

    public void setFormDataTag(Object obj) {
        this.A0C = obj;
    }

    public void setFormItemListener(B6S b6s) {
        this.A0H = b6s;
    }

    public void setFormItemTag(int i) {
        this.A01 = i;
    }

    public void setInputLength(int i) {
        this.A0G.setMaxLength(i);
        this.A00 = i;
    }

    public void setIsStateUnmasked(boolean z) {
        this.A0J = z;
    }

    public void setSubtype(String str) {
        this.A0F = str;
    }

    public void setText(String str) {
        FormItemEditText formItemEditText = this.A0G;
        formItemEditText.setText(str);
        formItemEditText.setSelection(str.length());
    }

    public void setTextEntered(boolean z) {
        this.A0L = z;
    }

    public void setTitle(String str) {
        this.A09.setText(str);
        this.A0D = str;
    }

    public void setToggleCheckBox(boolean z) {
        this.A0K = z;
    }

    public void setToggleCheckbox(Boolean bool) {
        this.A0K = bool.booleanValue();
    }

    public boolean BI1() {
        boolean A1P = AnonymousClass000.A1P(this.A0K ? 1 : 0);
        this.A0K = A1P;
        return A1P;
    }

    public String getInputValue() {
        if (this.A0I || this.A0J) {
            return AnonymousClass3Ma.A12(this.A0G);
        }
        return this.A0E;
    }

    public AnonymousClass8Do(Context context, Context context2) {
        super(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, AnonymousClass6Z3.A01);
        if (obtainStyledAttributes != null) {
            this.A0D = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.getString(3);
            this.A00 = obtainStyledAttributes.getInteger(1, 6);
            this.A0M = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
        }
        View.inflate(context, 2131625786, this);
        this.A08 = (RelativeLayout) findViewById(2131430981);
        this.A06 = AnonymousClass8BR.A0A(this, 2131430976);
        this.A09 = C17880vN.A0E(this, 2131430982);
        this.A0G = (FormItemEditText) findViewById(2131430979);
        this.A04 = (Button) findViewById(2131430977);
        this.A07 = (ProgressBar) findViewById(2131430980);
        this.A05 = AnonymousClass3MW.A0H(this, 2131430978);
        this.A0G.setInputType(0);
        this.A0A = C17880vN.A0E(this, 2131430275);
        this.A0B = C17880vN.A0E(this, 2131430974);
        AnonymousClass8BS.A14(getResources(), this.A04, 2131101984);
        setTitle(this.A0D);
        setInputLength(this.A00);
        this.A0G.addTextChangedListener(new AF3(this, 6));
        this.A0G.setOnTouchListener(new C20292AFa(this, 4));
        setActionBarPositionTop(this.A0M);
        AnonymousClass3MZ.A1M(this.A0B, this, 35);
        this.A03 = context2;
    }

    public void BAJ(Drawable drawable, View.OnClickListener onClickListener, String str, boolean z, boolean z2) {
        if (!TextUtils.isEmpty(str)) {
            this.A04.setText(str);
        }
        if (str.equals(getResources().getString(2131898680)) || str.equals(getContext().getString(2131899122)) || str.equals(getResources().getString(2131898931))) {
            AnonymousClass8BS.A14(getResources(), this.A04, 2131101983);
            this.A0N = false;
        }
        Button button = this.A04;
        button.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        button.setOnClickListener(onClickListener);
        button.setEnabled(z2);
        A00(button, z);
    }

    public void setEducationalText(String str) {
        boolean contains = str.contains(AnonymousClass3MW.A0x(getResources(), "", AnonymousClass3MW.A1a(), 0, 2131898941));
        TextView textView = this.A0A;
        if (contains) {
            textView.setCompoundDrawablesWithIntrinsicBounds(2131232009, 0, 0, 0);
            textView.setText(str);
            AnonymousClass8BS.A14(getResources(), textView, 2131101996);
            textView.setBackgroundResource(2131232895);
            return;
        }
        textView.setText(str);
    }

    public void setForgotUpi(Boolean bool) {
        this.A0B.setVisibility(C72453Mb.A07(bool.booleanValue() ? 1 : 0));
    }
}
