package com.google.android.material.datepicker;

import X.A8Y;
import X.ADU;
import X.AJN;
import X.AnonymousClass000;
import X.AnonymousClass03S;
import X.AnonymousClass1HF;
import X.AnonymousClass1XU;
import X.AnonymousClass1Xr;
import X.AnonymousClass1Z9;
import X.AnonymousClass3MZ;
import X.AnonymousClass8BV;
import X.AnonymousClass8EJ;
import X.AnonymousClass8RF;
import X.BDX;
import X.BDY;
import X.C17880vN;
import X.C196429v2;
import X.C197469wk;
import X.C21349Aie;
import X.C27801Xq;
import X.C34001jj;
import X.C72453Mb;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;

public final class MaterialDatePicker extends DialogFragment {
    public static final Object A0P = "CANCEL_BUTTON_TAG";
    public static final Object A0Q = "CONFIRM_BUTTON_TAG";
    public static final Object A0R = "TOGGLE_BUTTON_TAG";
    public int A00;
    public int A01;
    public Button A02;
    public TextView A03;
    public CheckableImageButton A04;
    public CharSequence A05;
    public CharSequence A06;
    public boolean A07;
    public int A08;
    public int A09;
    public int A0A;
    public TextView A0B;
    public ADU A0C;
    public BDX A0D;
    public MaterialCalendar A0E;
    public PickerFragment A0F;
    public C27801Xq A0G;
    public CharSequence A0H;
    public CharSequence A0I;
    public CharSequence A0J;
    public boolean A0K;
    public final LinkedHashSet A0L = C17880vN.A14();
    public final LinkedHashSet A0M = C17880vN.A14();
    public final LinkedHashSet A0N = C17880vN.A14();
    public final LinkedHashSet A0O = C17880vN.A14();

    public static BDX A01(MaterialDatePicker materialDatePicker) {
        BDX bdx = materialDatePicker.A0D;
        if (bdx != null) {
            return bdx;
        }
        BDX bdx2 = (BDX) materialDatePicker.A06.getParcelable("DATE_SELECTOR_KEY");
        materialDatePicker.A0D = bdx2;
        return bdx2;
    }

    public static boolean A03(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AnonymousClass1Z9.A02(context, MaterialCalendar.class.getCanonicalName(), 2130970434).data, new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    public void A1j() {
        this.A0F.A00.clear();
        super.A1j();
    }

    public final View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View findViewById;
        int A002;
        int i;
        int i2 = 2131626095;
        if (this.A0K) {
            i2 = 2131626096;
        }
        View inflate = layoutInflater.inflate(i2, viewGroup);
        Context context = inflate.getContext();
        if (this.A0K) {
            findViewById = inflate.findViewById(2131432815);
            A002 = A00(context);
            i = -2;
        } else {
            findViewById = inflate.findViewById(2131432816);
            A002 = A00(context);
            i = -1;
        }
        findViewById.setLayoutParams(new LinearLayout.LayoutParams(A002, i));
        TextView A0E2 = C17880vN.A0E(inflate, 2131432827);
        this.A0B = A0E2;
        A0E2.setAccessibilityLiveRegion(1);
        this.A04 = (CheckableImageButton) inflate.findViewById(2131432829);
        this.A03 = C17880vN.A0E(inflate, 2131432833);
        this.A04.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.A04;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, AnonymousClass03S.A01(context, 2131232598));
        stateListDrawable.addState(new int[0], AnonymousClass03S.A01(context, 2131232600));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.A04.setChecked(AnonymousClass000.A1O(this.A00));
        AnonymousClass1HF.A0f(this.A04, (AnonymousClass1XU) null);
        CheckableImageButton checkableImageButton2 = this.A04;
        boolean isChecked = checkableImageButton2.isChecked();
        Context context2 = checkableImageButton2.getContext();
        int i3 = 2131899238;
        if (isChecked) {
            i3 = 2131899236;
        }
        this.A04.setContentDescription(context2.getString(i3));
        AnonymousClass3MZ.A1N(this.A04, this, 14);
        this.A02 = (Button) inflate.findViewById(2131429338);
        boolean A1W = AnonymousClass000.A1W(((AJN) A01(this)).A01);
        Button button = this.A02;
        if (A1W) {
            button.setEnabled(true);
        } else {
            button.setEnabled(false);
        }
        this.A02.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.A0I;
        if (charSequence != null) {
            this.A02.setText(charSequence);
        } else {
            int i4 = this.A09;
            if (i4 != 0) {
                this.A02.setText(i4);
            }
        }
        AnonymousClass3MZ.A1N(this.A02, this, 12);
        AnonymousClass1HF.A0f(this.A02, new AnonymousClass8EJ(this, 5));
        TextView A0E3 = C17880vN.A0E(inflate, 2131428815);
        A0E3.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence2 = this.A0H;
        if (charSequence2 != null) {
            A0E3.setText(charSequence2);
        } else {
            int i5 = this.A08;
            if (i5 != 0) {
                A0E3.setText(i5);
            }
        }
        AnonymousClass3MZ.A1N(A0E3, this, 13);
        return inflate;
    }

    public void A2F(String str) {
        String A012;
        TextView textView = this.A0B;
        BDX A013 = A01(this);
        Resources resources = A14().getResources();
        Long l = ((AJN) A013).A01;
        if (l == null) {
            A012 = resources.getString(2131899207);
        } else {
            A012 = C196429v2.A01(Locale.getDefault(), l.longValue());
        }
        textView.setContentDescription(resources.getString(2131899206, AnonymousClass8BV.A1b(A012)));
        this.A0B.setText(str);
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.A0L.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.A0M.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.A0B;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public static int A00(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(2131167803);
        int i = new C21349Aie(A8Y.A05()).A02;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(2131167809) * i) + ((i - 1) * resources.getDimensionPixelOffset(2131167823));
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [androidx.fragment.app.Fragment, com.google.android.material.datepicker.MaterialCalendar, com.google.android.material.datepicker.PickerFragment] */
    public static void A02(MaterialDatePicker materialDatePicker) {
        CharSequence charSequence;
        Context A14 = materialDatePicker.A14();
        int i = materialDatePicker.A01;
        if (i == 0) {
            A01(materialDatePicker);
            i = AnonymousClass1Z9.A02(A14, MaterialDatePicker.class.getCanonicalName(), 2130970435).data;
        }
        BDX A012 = A01(materialDatePicker);
        ADU adu = materialDatePicker.A0C;
        ? pickerFragment = new PickerFragment();
        Bundle A0D2 = C17880vN.A0D();
        A0D2.putInt("THEME_RES_ID_KEY", i);
        A0D2.putParcelable("GRID_SELECTOR_KEY", A012);
        A0D2.putParcelable("CALENDAR_CONSTRAINTS_KEY", adu);
        A0D2.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable) null);
        A0D2.putParcelable("CURRENT_MONTH_KEY", adu.A00);
        pickerFragment.A1R(A0D2);
        materialDatePicker.A0E = pickerFragment;
        boolean isChecked = materialDatePicker.A04.isChecked();
        PickerFragment pickerFragment2 = pickerFragment;
        if (isChecked) {
            BDX A013 = A01(materialDatePicker);
            ADU adu2 = materialDatePicker.A0C;
            PickerFragment pickerFragment3 = new PickerFragment();
            Bundle A0D3 = C17880vN.A0D();
            A0D3.putInt("THEME_RES_ID_KEY", i);
            A0D3.putParcelable("DATE_SELECTOR_KEY", A013);
            A0D3.putParcelable("CALENDAR_CONSTRAINTS_KEY", adu2);
            pickerFragment3.A1R(A0D3);
            pickerFragment2 = pickerFragment3;
        }
        materialDatePicker.A0F = pickerFragment2;
        TextView textView = materialDatePicker.A03;
        if (!isChecked || C72453Mb.A08(materialDatePicker.A14()) != 2) {
            charSequence = materialDatePicker.A05;
        } else {
            charSequence = materialDatePicker.A06;
        }
        textView.setText(charSequence);
        materialDatePicker.A2F(materialDatePicker.A2E());
        C34001jj A0Y = C72453Mb.A0Y(materialDatePicker);
        A0Y.A09(materialDatePicker.A0F, 2131432815);
        A0Y.A03();
        PickerFragment pickerFragment4 = materialDatePicker.A0F;
        pickerFragment4.A00.add(new AnonymousClass8RF(materialDatePicker, 0));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0045, code lost:
        if (r10.intValue() == 0) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1v() {
        /*
            r11 = this;
            super.A1v()
            android.app.Dialog r0 = r11.A26()
            android.view.Window r4 = r0.getWindow()
            boolean r0 = r11.A0K
            if (r0 == 0) goto L_0x00e9
            r0 = -1
            r4.setLayout(r0, r0)
            X.1Xq r0 = r11.A0G
            r4.setBackgroundDrawable(r0)
            boolean r0 = r11.A07
            if (r0 != 0) goto L_0x00da
            android.view.View r1 = r11.A17()
            r0 = 2131431034(0x7f0b0e7a, float:1.8483786E38)
            android.view.View r5 = r1.findViewById(r0)
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L_0x00e6
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            android.graphics.drawable.ColorDrawable r0 = (android.graphics.drawable.ColorDrawable) r0
            int r0 = r0.getColor()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
        L_0x003d:
            r3 = 1
            if (r10 == 0) goto L_0x0047
            int r0 = r10.intValue()
            r6 = 0
            if (r0 != 0) goto L_0x0048
        L_0x0047:
            r6 = 1
        L_0x0048:
            android.content.Context r2 = r4.getContext()
            r1 = 16842801(0x1010031, float:2.3693695E-38)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r9 = X.AnonymousClass1ZA.A01(r2, r1, r0)
            if (r6 == 0) goto L_0x005b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
        L_0x005b:
            r0 = 0
            X.AnonymousClass6VM.A00(r4, r0)
            android.content.Context r2 = r4.getContext()
            r8 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = 16843857(0x1010451, float:2.3696655E-38)
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r7 >= r0) goto L_0x00e4
            int r1 = X.AnonymousClass1ZA.A01(r2, r1, r8)
            r0 = 128(0x80, float:1.794E-43)
            int r6 = X.AnonymousClass1Z2.A06(r1, r0)
        L_0x0078:
            android.content.Context r2 = r4.getContext()
            r1 = 16843858(0x1010452, float:2.3696658E-38)
            r0 = 27
            if (r7 >= r0) goto L_0x00e2
            int r1 = X.AnonymousClass1ZA.A01(r2, r1, r8)
            r0 = 128(0x80, float:1.794E-43)
            int r2 = X.AnonymousClass1Z2.A06(r1, r0)
        L_0x008d:
            r4.setStatusBarColor(r6)
            r4.setNavigationBarColor(r2)
            int r0 = r10.intValue()
            boolean r1 = X.AnonymousClass1ZA.A04(r0)
            boolean r0 = X.AnonymousClass1ZA.A04(r6)
            if (r0 != 0) goto L_0x00a5
            if (r6 != 0) goto L_0x00e0
            if (r1 == 0) goto L_0x00e0
        L_0x00a5:
            r0 = 1
        L_0x00a6:
            X.C123586Va.A00(r4, r0)
            boolean r1 = X.AnonymousClass1ZA.A04(r9)
            boolean r0 = X.AnonymousClass1ZA.A04(r2)
            if (r0 != 0) goto L_0x00b7
            if (r2 != 0) goto L_0x00de
            if (r1 == 0) goto L_0x00de
        L_0x00b7:
            r2 = 1
        L_0x00b8:
            android.view.View r1 = r4.getDecorView()
            X.Cow r0 = new X.Cow
            r0.<init>(r1, r4)
            X.6Ur r0 = r0.A00
            r0.A03(r2)
            int r2 = r5.getPaddingTop()
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            int r1 = r0.height
            X.AGY r0 = new X.AGY
            r0.<init>(r5, r11, r1, r2)
            X.AnonymousClass1HF.A0g(r5, r0)
            r11.A07 = r3
        L_0x00da:
            A02(r11)
            return
        L_0x00de:
            r2 = 0
            goto L_0x00b8
        L_0x00e0:
            r0 = 0
            goto L_0x00a6
        L_0x00e2:
            r2 = 0
            goto L_0x008d
        L_0x00e4:
            r6 = 0
            goto L_0x0078
        L_0x00e6:
            r10 = 0
            goto L_0x003d
        L_0x00e9:
            r0 = -2
            r4.setLayout(r0, r0)
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r11)
            r0 = 2131167811(0x7f070a43, float:1.7949906E38)
            int r7 = r1.getDimensionPixelOffset(r0)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r7, r7, r7, r7)
            X.1Xq r6 = r11.A0G
            android.graphics.drawable.InsetDrawable r5 = new android.graphics.drawable.InsetDrawable
            r9 = r7
            r10 = r7
            r8 = r7
            r5.<init>(r6, r7, r8, r9, r10)
            r4.setBackgroundDrawable(r5)
            android.view.View r2 = r4.getDecorView()
            android.app.Dialog r1 = r11.A26()
            X.AFb r0 = new X.AFb
            r0.<init>(r1, r3)
            r2.setOnTouchListener(r0)
            goto L_0x00da
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.MaterialDatePicker.A1v():void");
    }

    public final void A1z(Bundle bundle) {
        super.A1z(bundle);
        if (bundle == null) {
            bundle = this.A06;
        }
        this.A01 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.A0D = (BDX) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.A0C = (ADU) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.A0A = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.A0J = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.A00 = bundle.getInt("INPUT_MODE_KEY");
        this.A09 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.A0I = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.A08 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.A0H = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        CharSequence charSequence = this.A0J;
        if (charSequence == null) {
            charSequence = AnonymousClass3MZ.A09(this).getText(this.A0A);
        }
        this.A05 = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.A06 = charSequence;
    }

    public final void A20(Bundle bundle) {
        super.A20(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.A01);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.A0D);
        ADU adu = this.A0C;
        long j = C197469wk.A01;
        long j2 = adu.A06.A05;
        long j3 = adu.A05.A05;
        Long valueOf = Long.valueOf(adu.A00.A05);
        int i = adu.A01;
        BDY bdy = adu.A04;
        C21349Aie aie = this.A0E.A09;
        if (aie != null) {
            valueOf = Long.valueOf(aie.A05);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", C197469wk.A00(bdy, valueOf, i, j3, j2));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable) null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.A0A);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.A0J);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.A09);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.A0I);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.A08);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.A0H);
    }

    public final Dialog A27(Bundle bundle) {
        Context A14 = A14();
        Context A142 = A14();
        int i = this.A01;
        if (i == 0) {
            A01(this);
            i = AnonymousClass1Z9.A02(A142, MaterialDatePicker.class.getCanonicalName(), 2130970435).data;
        }
        Dialog dialog = new Dialog(A14, i);
        Context context = dialog.getContext();
        this.A0K = A03(context, 16843277);
        int i2 = AnonymousClass1Z9.A02(context, MaterialDatePicker.class.getCanonicalName(), 2130969148).data;
        C27801Xq r0 = new C27801Xq(context, (AttributeSet) null, 2130970434, 2132084765);
        this.A0G = r0;
        r0.A0E(context);
        this.A0G.A0F(ColorStateList.valueOf(i2));
        this.A0G.A0C(AnonymousClass1Xr.A00(dialog.getWindow().getDecorView()));
        return dialog;
    }

    public String A2E() {
        BDX A012 = A01(this);
        Resources resources = A1n().getResources();
        Long l = ((AJN) A012).A01;
        if (l == null) {
            return resources.getString(2131899212);
        }
        return resources.getString(2131899210, AnonymousClass8BV.A1b(C196429v2.A01(Locale.getDefault(), l.longValue())));
    }
}
