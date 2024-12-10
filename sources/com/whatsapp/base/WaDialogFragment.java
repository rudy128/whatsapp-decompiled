package com.whatsapp.base;

import X.AnonymousClass0QH;
import X.AnonymousClass10I;
import X.AnonymousClass1FS;
import X.AnonymousClass1GP;
import X.AnonymousClass1XH;
import X.AnonymousClass4DG;
import X.AnonymousClass9P2;
import X.C010105w;
import X.C18000vb;
import X.C18030ve;
import X.C19740yt;
import X.C34691kv;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.whatsapp.wds.components.button.WDSButton;

public abstract class WaDialogFragment extends Hilt_WaDialogFragment implements AnonymousClass1FS {
    public int A00 = 0;
    public C18000vb A01;
    public C18030ve A02;
    public C34691kv A03;
    public AnonymousClass10I A04;
    public AnonymousClass4DG A05;
    public AnonymousClass4DG A06;
    public AnonymousClass4DG A07;

    public boolean A2G() {
        return false;
    }

    public /* synthetic */ void Bjo(String str) {
    }

    public /* synthetic */ void BkF(String str) {
    }

    public /* synthetic */ void CBt(String str) {
    }

    public /* synthetic */ void CMx(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, Object[] objArr) {
        int i;
        AnonymousClass1GP A1E = A1E();
        if (num3 != null) {
            i = num3.intValue();
        } else {
            i = 2131899286;
        }
        AnonymousClass9P2.A00(A1E, num, num2, num4, (Integer) null, str, str2, objArr, i);
    }

    public void A23(boolean z) {
        C34691kv r1 = this.A03;
        if (r1 != null) {
            r1.A00(this, this.A0n, z);
        }
        super.A23(z);
    }

    public void A1v() {
        CharSequence text;
        CharSequence text2;
        CharSequence text3;
        super.A1v();
        Dialog dialog = this.A03;
        if (dialog instanceof C010105w) {
            C010105w r2 = (C010105w) dialog;
            Button button = r2.A00.A0H;
            if (!(button == null || button.getText() == null)) {
                button.setText(button.getText());
            }
            AnonymousClass0QH r4 = r2.A00;
            Button button2 = r4.A0F;
            if (!(button2 == null || button2.getText() == null)) {
                button2.setText(button2.getText());
            }
            Button button3 = r4.A0G;
            if (!(button3 == null || button3.getText() == null)) {
                button3.setText(button3.getText());
            }
            Button button4 = r4.A0H;
            if (!(button4 == null || (text3 = button4.getText()) == null)) {
                button4.setContentDescription(text3);
            }
            Button button5 = r4.A0F;
            if (!(button5 == null || (text2 = button5.getText()) == null)) {
                button5.setContentDescription(text2);
            }
            Button button6 = r4.A0G;
            if (!(button6 == null || (text = button6.getText()) == null)) {
                button6.setContentDescription(text);
            }
            View findViewById = r2.findViewById(16908299);
            if (findViewById != null) {
                int i = 5;
                if (A2G()) {
                    i = 3;
                }
                findViewById.setTextDirection(i);
                findViewById.setFocusable(true);
            }
            Button button7 = r4.A0F;
            int i2 = this.A00;
            AnonymousClass4DG r1 = this.A05;
            if (button7 instanceof WDSButton) {
                if (r1 != null) {
                    ((WDSButton) button7).setAction(r1);
                }
            } else if (i2 != 0) {
                button7.setTextColor(C19740yt.A00(A14(), i2));
            }
            Button button8 = r4.A0H;
            AnonymousClass4DG r12 = this.A07;
            if ((button8 instanceof WDSButton) && r12 != null) {
                ((WDSButton) button8).setAction(r12);
            }
            Button button9 = r4.A0G;
            AnonymousClass4DG r13 = this.A06;
            if ((button9 instanceof WDSButton) && r13 != null) {
                ((WDSButton) button9).setAction(r13);
            }
        }
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        AnonymousClass1XH.A00(this);
    }

    public void A2F(AnonymousClass1GP r2, String str) {
        if (!r2.A0z()) {
            A2C(r2, str);
        }
    }

    public AnonymousClass1GP BZu() {
        return A1E();
    }
}
