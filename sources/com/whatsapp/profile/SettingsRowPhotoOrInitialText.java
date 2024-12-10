package com.whatsapp.profile;

import X.C18070vi;
import X.C72453Mb;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import com.whatsapp.WaTextView;
import com.whatsapp.settings.SettingsRowIconText;

public final class SettingsRowPhotoOrInitialText extends SettingsRowIconText {
    public boolean A00;
    public final WaTextView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsRowPhotoOrInitialText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A00();
        WaTextView A0g = C72453Mb.A0g(this, 2131435313);
        this.A01 = A0g;
        Drawable background = A0g.getBackground();
        C18070vi.A0z(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) background).setColor(getResources().getColor(2131101247));
    }

    public final void setName(String str) {
        String substring;
        setText((CharSequence) str);
        if (str != null) {
            this.A01.setVisibility(8);
            WaTextView waTextView = this.A01;
            if (str.length() == 0) {
                substring = "?";
            } else {
                substring = str.substring(0, 1);
                C18070vi.A0X(substring);
            }
            waTextView.setText(substring);
            waTextView.setVisibility(0);
        }
    }

    public int getLayout() {
        return 2131626921;
    }

    public SettingsRowPhotoOrInitialText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A00();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsRowPhotoOrInitialText(Context context) {
        super(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
        A00();
        WaTextView A0g = C72453Mb.A0g(this, 2131435313);
        this.A01 = A0g;
        Drawable background = A0g.getBackground();
        C18070vi.A0z(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) background).setColor(getResources().getColor(2131101247));
    }
}
