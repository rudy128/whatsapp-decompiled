package com.whatsapp.biz.profile;

import X.AEB;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4IZ;
import X.C19740yt;
import X.C24261Jm;
import X.C72463Mc;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import java.text.NumberFormat;

public class TrustSignalItem extends LinearLayout {
    public int A00;
    public WaImageView A01;
    public WaImageView A02;
    public WaTextView A03;
    public WaTextView A04;

    public TrustSignalItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setAccountInfo(String str) {
        this.A03.setText(str);
    }

    private void setAccountName(String str) {
        if (this.A00 == 1) {
            str = AnonymousClass001.A1H("@", str, AnonymousClass000.A10());
        }
        this.A04.setText(str);
    }

    private void setEditable(boolean z) {
        WaImageView waImageView;
        int i;
        WaTextView waTextView = this.A04;
        Context context = getContext();
        Context context2 = getContext();
        if (z) {
            C72463Mc.A0w(context2, context, waTextView, 2130970831, 2131102246);
            waImageView = this.A01;
            i = 0;
        } else {
            C72463Mc.A0w(context2, context, waTextView, 2130970828, 2131102239);
            waImageView = this.A01;
            i = 8;
        }
        waImageView.setVisibility(i);
    }

    private void setIcon(Drawable drawable) {
        this.A02.setImageDrawable(drawable);
    }

    public String getAccountName() {
        return AnonymousClass3MZ.A18(this.A04);
    }

    public int getAccountType() {
        return this.A00;
    }

    public void setUpFromAccount(AEB aeb) {
        String string;
        int i;
        if (aeb == null) {
            i = 8;
        } else {
            setAccountName(aeb.A01);
            int i2 = aeb.A00;
            if (i2 > 0) {
                int i3 = 2131755193;
                if (this.A00 == 0) {
                    i3 = 2131755141;
                }
                string = AnonymousClass000.A0Y(this).getQuantityString(i3, i2, AnonymousClass000.A1b(NumberFormat.getIntegerInstance().format((long) i2), 1));
            } else {
                Resources resources = getResources();
                int i4 = 2131891363;
                if (this.A00 == 0) {
                    i4 = 2131890286;
                }
                string = resources.getString(i4);
            }
            setAccountInfo(string);
            i = 0;
        }
        setVisibility(i);
    }

    public TrustSignalItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(0);
        setClickable(true);
        setFocusable(true);
        View.inflate(context, 2131627239, this);
        this.A02 = AnonymousClass3MW.A0R(this, 2131432032);
        this.A04 = AnonymousClass3MW.A0T(this, 2131432035);
        this.A03 = AnonymousClass3MW.A0T(this, 2131432034);
        this.A01 = AnonymousClass3MW.A0R(this, 2131432030);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass4IZ.A07);
        try {
            int integer = obtainStyledAttributes.getInteger(0, 0);
            this.A00 = integer;
            if (integer == 0) {
                setIcon(C24261Jm.A00(getContext(), 2131232284));
                this.A02.setColorFilter(C19740yt.A00(getContext(), 2131100198));
            } else if (integer == 1) {
                setIcon(C24261Jm.A00(getContext(), 2131231739));
            }
            setEditable(obtainStyledAttributes.getBoolean(2, false));
            int resourceId = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId != 0) {
                this.A01.setColorFilter(AnonymousClass3MY.A02(this, resourceId));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public TrustSignalItem(Context context) {
        this(context, (AttributeSet) null);
    }
}
