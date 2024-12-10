package com.whatsapp.pininchat.banner;

import X.AnonymousClass000;
import X.AnonymousClass1YL;
import X.AnonymousClass3MW;
import X.C17970vW;
import X.C18070vi;
import X.C19740yt;
import X.C72453Mb;
import X.C86974Tu;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.whatsapp.WaImageView;
import java.util.ArrayList;

public final class PinInChatBannerMultiplePinsIndicator extends LinearLayout {
    public final ArrayList A00 = AnonymousClass000.A13();

    public final void setupIndicator(C86974Tu r8) {
        Object obj;
        int i;
        int i2;
        C18070vi.A0d(r8, 0);
        removeAllViews();
        int i3 = r8.A01;
        if (i3 > 1) {
            int i4 = 0;
            do {
                ArrayList arrayList = this.A00;
                if (i4 < 0 || i4 >= arrayList.size()) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AnonymousClass3MW.A01(AnonymousClass000.A0Y(this), 2131168262), 0, 1.0f);
                    if (i4 > 0) {
                        layoutParams.setMargins(0, AnonymousClass3MW.A01(AnonymousClass000.A0Y(this), 2131168261), 0, 0);
                    }
                    WaImageView A0f = C72453Mb.A0f(this);
                    A0f.setLayoutParams(layoutParams);
                    A0f.setImageResource(2131233477);
                    A0f.setScaleType(ImageView.ScaleType.FIT_XY);
                    Boolean bool = C17970vW.A03;
                    arrayList.add(A0f);
                    obj = A0f;
                } else {
                    obj = arrayList.get(i4);
                }
                ImageView imageView = (ImageView) obj;
                int i5 = r8.A00;
                Context context = getContext();
                if (i4 == i5) {
                    C18070vi.A0X(context);
                    i = 2130971952;
                    i2 = 2131103088;
                } else {
                    C18070vi.A0X(context);
                    i = 2130971980;
                    i2 = 2131103156;
                }
                imageView.setImageTintList(ColorStateList.valueOf(C19740yt.A00(context, AnonymousClass1YL.A01(context, i, i2, false))));
                addView(imageView);
                i4++;
            } while (i4 < i3);
        }
    }

    public PinInChatBannerMultiplePinsIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PinInChatBannerMultiplePinsIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PinInChatBannerMultiplePinsIndicator(Context context) {
        super(context, (AttributeSet) null);
    }
}
