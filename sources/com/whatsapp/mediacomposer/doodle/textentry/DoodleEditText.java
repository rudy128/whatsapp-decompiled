package com.whatsapp.mediacomposer.doodle.textentry;

import X.AnonymousClass10E;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass6pZ;
import X.AnonymousClass7JG;
import X.AnonymousClass7JH;
import X.AnonymousClass85K;
import X.AnonymousClass8BD;
import X.C108995ce;
import X.C123936Wk;
import X.C1419177l;
import X.C18070vi;
import X.C72463Mc;
import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.TextView;
import com.whatsapp.WaEditText;

public final class DoodleEditText extends WaEditText {
    public AnonymousClass85K A00;
    public int A01;
    public int A02;
    public C1419177l A03;
    public boolean A04;
    public final AnonymousClass6pZ A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DoodleEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A0G();
        this.A05 = new AnonymousClass6pZ();
        setLayerType(1, (Paint) null);
    }

    public static /* synthetic */ void getAlignment$annotations() {
    }

    public static /* synthetic */ void getFontStyle$annotations() {
    }

    public final void setupBackgroundSpan(String str) {
        C18070vi.A0d(str, 0);
        Context A042 = AnonymousClass3MY.A04(this);
        AnonymousClass6pZ r0 = this.A05;
        this.A03 = new C1419177l(A042, this, r0.A00, r0.A01);
        SpannableStringBuilder A09 = AnonymousClass3MW.A09(str);
        A09.setSpan(this.A03, 0, A09.length(), 18);
        setShadowLayer(getTextSize() / 2.0f, 0.0f, 0.0f, 0);
        setText(A09, TextView.BufferType.SPANNABLE);
    }

    public void A0G() {
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass10E A0X = C72463Mc.A0X(this);
            this.A00 = AnonymousClass10E.A8r(A0X);
            this.A03 = AnonymousClass10E.A6Q(A0X);
            this.A02 = AnonymousClass3Ma.A0a(A0X);
        }
    }

    public final void A0K(int i) {
        int i2;
        if (this.A01 != i) {
            this.A01 = i;
            if (i != 0) {
                i2 = 8388627;
                if (i != 1) {
                    if (i == 2) {
                        i2 = 8388629;
                    }
                    setTextAlignment(1);
                    setTextDirection(5);
                    clearFocus();
                }
            } else {
                i2 = 17;
            }
            setGravity(i2);
            setTextAlignment(1);
            setTextDirection(5);
            clearFocus();
        }
    }

    public final void A0L(int i) {
        AnonymousClass6pZ r2 = this.A05;
        r2.A03 = i;
        r2.A01(i, r2.A02);
        C1419177l r1 = this.A03;
        if (r1 != null) {
            r1.A00 = r2.A00;
            r1.A01 = r2.A01;
        }
        setTextColor(r2.A04);
    }

    public final int getBackgroundStyle() {
        return this.A05.A02;
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        AnonymousClass85K r3 = this.A00;
        if (r3 != null) {
            AnonymousClass7JG r32 = (AnonymousClass7JG) r3;
            if (i == 4 && keyEvent != null && keyEvent.getAction() == 1) {
                AnonymousClass8BD r2 = r32.A00;
                DoodleEditText doodleEditText = r32.A01.A05;
                if (doodleEditText == null) {
                    C18070vi.A11("doodleEditText");
                    throw null;
                }
                String A17 = AnonymousClass3MZ.A17(doodleEditText);
                AnonymousClass7JH r22 = (AnonymousClass7JH) r2;
                C18070vi.A0d(A17, 0);
                r22.A04.A04 = A17;
                r22.dismiss();
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public boolean onTextContextMenuItem(int i) {
        if (Build.VERSION.SDK_INT >= 23 && i == 16908322) {
            i = 16908337;
        }
        return super.onTextContextMenuItem(i);
    }

    public final void setBackgroundStyle(int i) {
        AnonymousClass6pZ r1 = this.A05;
        r1.A02 = i;
        r1.A01(r1.A03, i);
        A0L(r1.A03);
    }

    public final void setFontStyle(int i) {
        if (this.A02 != i) {
            this.A02 = i;
            setTypeface(C123936Wk.A00(AnonymousClass3MY.A04(this), i));
            setAllCaps(false);
        }
    }

    public final AnonymousClass85K getOnKeyPreImeListener() {
        return this.A00;
    }

    public final int getWidthWithoutPadding() {
        return C108995ce.A03(this);
    }

    public final void setOnKeyPreImeListener(AnonymousClass85K r1) {
        this.A00 = r1;
    }

    public DoodleEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A0G();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DoodleEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A0G();
        this.A05 = new AnonymousClass6pZ();
        setLayerType(1, (Paint) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DoodleEditText(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        A0G();
        this.A05 = new AnonymousClass6pZ();
        setLayerType(1, (Paint) null);
    }
}
