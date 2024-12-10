package X;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.List;
import java.util.concurrent.Executor;

public final class D64 implements E0B {
    public Rect A00;
    public C26041Cr5 A01 = C26041Cr5.A03;
    public C26224CvE A02 = new C26224CvE("", C26260Cw5.A01);
    public Runnable A03;
    public List A04 = AnonymousClass000.A13();
    public C22821Di A05 = C28117Drb.A00;
    public C22821Di A06 = C28118Drc.A00;
    public boolean A07;
    public final View A08;
    public final C06970a9 A09;
    public final C25964CpW A0A;
    public final E0A A0B;
    public final Executor A0C;
    public final C18100vl A0D = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C27459Dfo(this));

    public D64(View view, C16710ss r7) {
        D62 d62 = new D62(view);
        C27138DVz dVz = new C27138DVz(Choreographer.getInstance(), 0);
        this.A08 = view;
        this.A0B = d62;
        this.A0C = dVz;
        this.A0A = new C25964CpW(r7, d62);
        this.A09 = new C06970a9(new C24268ByR[16]);
    }

    public static final void A00(C24268ByR byR, D64 d64) {
        d64.A09.A0F(byR);
        if (d64.A03 == null) {
            C21466AkX akX = new C21466AkX((Object) d64, 0);
            d64.A0C.execute(akX);
            d64.A03 = akX;
        }
    }

    public static final void A01(D64 d64) {
        D62 d62 = (D62) d64.A0B;
        ((InputMethodManager) d62.A02.getValue()).restartInput(d62.A00);
    }

    public final D5P A02(EditorInfo editorInfo) {
        if (!this.A07) {
            return null;
        }
        C26041Cr5 cr5 = this.A01;
        C26224CvE cvE = this.A02;
        int i = cr5.A00;
        boolean A1T = AnonymousClass000.A1T(i, 1);
        int i2 = 2;
        int i3 = 6;
        if (A1T) {
            if (!cr5.A02) {
                i3 = 0;
            }
        } else if (i == 2) {
            i3 = 2;
        } else if (i == 6) {
            i3 = 5;
        } else if (i == 5) {
            i3 = 7;
        } else if (i == 3) {
            i3 = 3;
        } else if (i == 4) {
            i3 = 4;
        } else if (i != 7) {
            throw AnonymousClass000.A0n("invalid ImeAction");
        }
        editorInfo.imeOptions = i3;
        int i4 = cr5.A01;
        if (i4 == 1) {
            editorInfo.inputType = 1;
            i2 = 1;
        } else if (i4 == 2) {
            editorInfo.inputType = 1;
            i2 = 1;
            i3 |= Integer.MIN_VALUE;
            editorInfo.imeOptions = i3;
        } else {
            editorInfo.inputType = 2;
        }
        if (!cr5.A02 && (i2 & 1) == 1) {
            i2 |= A7Y.A0F;
            editorInfo.inputType = i2;
            if (A1T) {
                editorInfo.imeOptions = i3 | 1073741824;
            }
        }
        if ((i2 & 1) == 1) {
            editorInfo.inputType = i2 | 32768;
        }
        long j = cvE.A00;
        editorInfo.initialSelStart = AnonymousClass000.A0G(j);
        editorInfo.initialSelEnd = AnonymousClass000.A0H(j);
        EditorInfoCompat.setInitialSurroundingText(editorInfo, cvE.A01.A00);
        editorInfo.imeOptions |= 33554432;
        D5P d5p = new D5P(new D61(this), this.A02);
        this.A04.add(AnonymousClass3MW.A0z(d5p));
        return d5p;
    }

    public final boolean A03() {
        return this.A07;
    }
}
