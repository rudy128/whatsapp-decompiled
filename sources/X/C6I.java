package X;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

public abstract class C6I {
    public void A00(int i) {
        if (this instanceof C23515Bie) {
            ((C23515Bie) this).A03.A00(i);
        } else if (this instanceof C23513Bic) {
            C23513Bic bic = (C23513Bic) this;
            if (bic.A00 != 0) {
                CZD czd = (CZD) bic.A01;
                czd.A02 = true;
                C29331c2 r0 = (C29331c2) czd.A01.get();
                if (r0 != null) {
                    r0.C8W();
                }
            }
        } else {
            C23514Bid bid = (C23514Bid) this;
            Typeface typeface = bid.A01;
            if (!bid.A00) {
                bid.A02.BCI(typeface);
            }
        }
    }

    public void A01(Typeface typeface, boolean z) {
        CharSequence text;
        if (this instanceof C23515Bie) {
            C23515Bie bie = (C23515Bie) this;
            bie.A02.A03(bie.A00, typeface, bie.A01);
            bie.A03.A01(typeface, z);
        } else if (this instanceof C23513Bic) {
            C23513Bic bic = (C23513Bic) this;
            if (bic.A00 == 0) {
                Chip chip = (Chip) bic.A01;
                C23518Bih bih = chip.A04;
                if (bih.A0g) {
                    text = bih.A0Z;
                } else {
                    text = chip.getText();
                }
                chip.setText(text);
                chip.requestLayout();
                chip.invalidate();
            } else if (!z) {
                CZD czd = (CZD) bic.A01;
                czd.A02 = true;
                C29331c2 r0 = (C29331c2) czd.A01.get();
                if (r0 != null) {
                    r0.C8W();
                }
            }
        } else {
            C23514Bid bid = (C23514Bid) this;
            if (!bid.A00) {
                bid.A02.BCI(typeface);
            }
        }
    }
}
