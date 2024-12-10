package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* renamed from: X.022  reason: invalid class name */
public class AnonymousClass022 extends C003401n {
    public boolean A00;
    public boolean A01;
    public ArrayList A02 = new ArrayList();
    public boolean A03;
    public final Window.Callback A04;
    public final AnonymousClass02G A05;
    public final AnonymousClass03J A06;
    public final AnonymousClass03O A07;
    public final Runnable A08 = new AnonymousClass03Z(this);

    public void A0H() {
        AnonymousClass03K r0 = (AnonymousClass03K) this.A06;
        r0.A04 = null;
        AnonymousClass03K.A00(r0);
    }

    public void A0P(View view) {
        A0Q(view, new AnonymousClass039(-2, -2));
    }

    public void A0V(boolean z) {
    }

    public void A0W(boolean z) {
        int i = 0;
        if (z) {
            i = 4;
        }
        A0d(i, 4);
    }

    public void A0X(boolean z) {
        int i = 0;
        if (z) {
            i = 2;
        }
        A0d(i, 2);
    }

    public void A0Z(boolean z) {
    }

    public void A02() {
        this.A06.BbY().removeCallbacks(this.A08);
    }

    public boolean A03() {
        return this.A06.Bcz();
    }

    public boolean A04() {
        Toolbar BbY = this.A06.BbY();
        Runnable runnable = this.A08;
        BbY.removeCallbacks(runnable);
        BbY.postOnAnimation(runnable);
        return true;
    }

    public boolean A05() {
        return this.A06.CN0();
    }

    public float A07() {
        return AnonymousClass1HF.A00(this.A06.BbY());
    }

    public int A08() {
        return ((AnonymousClass03K) this.A06).A01;
    }

    public int A09() {
        return this.A06.getHeight();
    }

    public Context A0A() {
        return this.A06.getContext();
    }

    public View A0B() {
        return ((AnonymousClass03K) this.A06).A06;
    }

    public void A0E() {
        this.A06.setVisibility(8);
    }

    public void A0F() {
        A0d(16, -1);
    }

    public void A0G() {
        A0d(16, 16);
    }

    public void A0I() {
        this.A06.setVisibility(0);
    }

    public void A0J(float f) {
        AnonymousClass1HF.A0W(this.A06.BbY(), f);
    }

    public void A0K(int i) {
        this.A06.CJZ(i);
    }

    public void A0L(int i) {
        AnonymousClass03J r1 = this.A06;
        r1.CKz(r1.getContext().getText(i));
    }

    public void A0M(int i) {
        CharSequence charSequence;
        AnonymousClass03J r2 = this.A06;
        if (i != 0) {
            charSequence = r2.getContext().getText(i);
        } else {
            charSequence = null;
        }
        AnonymousClass03K r22 = (AnonymousClass03K) r2;
        r22.A0D = true;
        AnonymousClass03K.A01(r22, charSequence);
    }

    public void A0N(Drawable drawable) {
        this.A06.CI3(drawable);
    }

    public void A0O(Drawable drawable) {
        this.A06.CJa(drawable);
    }

    public void A0Q(View view, AnonymousClass039 r3) {
        if (view != null) {
            view.setLayoutParams(r3);
        }
        this.A06.CIc(view);
    }

    public void A0R(CharSequence charSequence) {
        this.A06.CKz(charSequence);
    }

    public void A0S(CharSequence charSequence) {
        AnonymousClass03K r1 = (AnonymousClass03K) this.A06;
        r1.A0D = true;
        AnonymousClass03K.A01(r1, charSequence);
    }

    public void A0T(CharSequence charSequence) {
        AnonymousClass03K r1 = (AnonymousClass03K) this.A06;
        if (!r1.A0D) {
            AnonymousClass03K.A01(r1, charSequence);
        }
    }

    public void A0U(boolean z) {
        if (z != this.A03) {
            this.A03 = z;
            ArrayList arrayList = this.A02;
            if (0 < arrayList.size()) {
                arrayList.get(0);
                throw new NullPointerException("onMenuVisibilityChanged");
            }
        }
    }

    public void A0Y(boolean z) {
        int i = 0;
        if (z) {
            i = 8;
        }
        A0d(i, 8);
    }

    public boolean A0a() {
        AnonymousClass03J r1 = this.A06;
        if (!r1.Bcb()) {
            return false;
        }
        r1.BFA();
        return true;
    }

    public boolean A0b(int i, KeyEvent keyEvent) {
        if (!this.A00) {
            this.A06.CJR(new AnonymousClass0SC(this), new AnonymousClass0S7(this));
            this.A00 = true;
        }
        Menu BUe = this.A06.BUe();
        if (BUe == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() == 1) {
            z = false;
        }
        BUe.setQwertyMode(z);
        return BUe.performShortcut(i, keyEvent, 0);
    }

    public void A0c() {
        C003301m r3;
        if (!this.A00) {
            this.A06.CJR(new AnonymousClass0SC(this), new AnonymousClass0S7(this));
            this.A00 = true;
        }
        Menu BUe = this.A06.BUe();
        if (BUe instanceof C003301m) {
            r3 = (C003301m) BUe;
            if (r3 != null) {
                r3.A0K();
            }
        } else {
            r3 = null;
        }
        try {
            BUe.clear();
            Window.Callback callback = this.A04;
            if (!callback.onCreatePanelMenu(0, BUe) || !callback.onPreparePanel(0, (View) null, BUe)) {
                BUe.clear();
            }
        } finally {
            if (r3 != null) {
                r3.A0J();
            }
        }
    }

    public void A0d(int i, int i2) {
        AnonymousClass03J r2 = this.A06;
        r2.CIk((i & i2) | ((i2 ^ -1) & ((AnonymousClass03K) r2).A01));
    }

    public AnonymousClass022(Window.Callback callback, Toolbar toolbar, CharSequence charSequence) {
        C006903a r2 = new C006903a(this);
        this.A07 = r2;
        AnonymousClass03K r1 = new AnonymousClass03K(toolbar, false);
        this.A06 = r1;
        C28111Yx.A02(callback);
        this.A04 = callback;
        r1.A07 = callback;
        toolbar.setOnMenuItemClickListener(r2);
        if (!r1.A0D) {
            AnonymousClass03K.A01(r1, charSequence);
        }
        this.A05 = new AnonymousClass03m(this);
    }

    public boolean A06(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            A05();
        }
        return true;
    }
}
