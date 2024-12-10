package com.whatsapp.settings;

import X.AnonymousClass1EG;
import X.AnonymousClass1HF;
import X.AnonymousClass1YL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3SB;
import X.AnonymousClass4IR;
import X.AnonymousClass4aX;
import X.C18000vb;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import java.util.Locale;

public class SettingsRowBanner extends AnonymousClass3SB {
    public C18000vb A00;
    public final WaImageView A01;
    public final View A02;
    public final WaTextView A03;
    public final WaTextView A04;

    public void setDescription(Context context, String str) {
        if (str == null) {
            this.A03.setVisibility(8);
            return;
        }
        WaTextView waTextView = this.A03;
        waTextView.setVisibility(0);
        Object[] A1a = AnonymousClass3MW.A1a();
        A1a[0] = AnonymousClass1EG.A03(context, AnonymousClass1YL.A00(waTextView.getContext(), 2130971356, 2131102597));
        AnonymousClass3MY.A1X(String.format(Locale.US, str, AnonymousClass1EG.A0K(A1a)), waTextView);
    }

    public void setIcon(int i) {
        this.A01.setImageResource(i);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        AnonymousClass1HF.A06(this.A02, 2131428062).setOnClickListener(onClickListener);
    }

    public void setOnCloseClickListener(View.OnClickListener onClickListener) {
        AnonymousClass1HF.A06(this.A02, 2131429132).setOnClickListener(onClickListener);
    }

    public void setTitle(String str) {
        WaTextView waTextView = this.A04;
        if (str == null) {
            waTextView.setVisibility(8);
            return;
        }
        waTextView.setVisibility(0);
        waTextView.setText(str);
    }

    public SettingsRowBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = View.inflate(context, 2131626916, this);
        this.A02 = inflate;
        this.A01 = AnonymousClass3MW.A0R(inflate, 2131428069);
        this.A04 = AnonymousClass3MW.A0T(inflate, 2131428078);
        this.A03 = AnonymousClass3MW.A0T(inflate, 2131428063);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass4IR.A00);
        try {
            if (obtainStyledAttributes.hasValue(1)) {
                setIcon(obtainStyledAttributes.getResourceId(1, -1));
            }
            int color = obtainStyledAttributes.getColor(2, -1);
            if (color != -1) {
                AnonymousClass4aX.A0D(this.A01, color);
            }
            setTitle(this.A00.A0E(obtainStyledAttributes, 3));
            setDescription(context, this.A00.A0E(obtainStyledAttributes, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public SettingsRowBanner(Context context) {
        this(context, (AttributeSet) null);
    }
}
