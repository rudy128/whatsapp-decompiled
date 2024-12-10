package X;

import android.text.style.LeadingMarginSpan;
import android.text.style.UpdateLayout;

public final class BGY extends LeadingMarginSpan.Standard implements UpdateLayout {
    public final int A00;
    public final int A01;

    public BGY(int i, int i2) {
        super(0);
        this.A00 = i;
        this.A01 = i2;
    }

    public int getLeadingMargin(boolean z) {
        if (z) {
            return this.A00;
        }
        return this.A01;
    }

    public BGY() {
        this(2, 2);
    }
}
