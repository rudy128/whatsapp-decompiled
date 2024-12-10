package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass033;
import X.AnonymousClass1b8;
import X.AnonymousClass1bA;
import X.AnonymousClass293;
import X.AnonymousClass3MY;
import X.C113805nm;
import X.C115055tK;
import X.C18000vb;
import X.C72473Md;
import android.content.Context;
import android.util.AttributeSet;

@Deprecated
public class WaViewPager extends C113805nm {
    public C18000vb A00;

    public void A0P(int i) {
        super.A0J(A0O(i), true);
    }

    public static int A00(C18000vb r1, int i, int i2) {
        if (i < 0 || i >= i2) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Item index ");
            A10.append(i);
            A10.append(" is out of range [0, ");
            A10.append(i2);
            throw new IndexOutOfBoundsException(AnonymousClass000.A0y(")", A10));
        } else if (!AnonymousClass3MY.A1b(r1)) {
            return (i2 - i) - 1;
        } else {
            return i;
        }
    }

    private int getItemCount() {
        AnonymousClass1b8 r0 = this.A0B;
        if (r0 == null) {
            return 0;
        }
        return r0.A0E();
    }

    public int A0O(int i) {
        return A00(this.A00, i, getItemCount());
    }

    public AnonymousClass1b8 getRealAdapter() {
        AnonymousClass1b8 r1 = this.A0B;
        if (r1 instanceof AnonymousClass293) {
            return ((AnonymousClass293) r1).A00;
        }
        return null;
    }

    public void setAdapter(AnonymousClass1b8 r4) {
        AnonymousClass1b8 r2;
        if (r4 == null) {
            r2 = null;
        } else {
            boolean z = r4 instanceof AnonymousClass1bA;
            C18000vb r1 = this.A00;
            if (z) {
                r2 = new C115055tK(r4, (AnonymousClass1bA) r4, r1);
            } else {
                r2 = new AnonymousClass293(r4, r1);
            }
        }
        super.setAdapter(r2);
        if (r4 != null && r4.A0E() > 0) {
            setCurrentLogicalItem(0);
        }
    }

    public WaViewPager(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            this.A00 = C72473Md.A0S((AnonymousClass033) generatedComponent());
        }
    }

    public AnonymousClass1b8 getAdapter() {
        return this.A0B;
    }

    @Deprecated
    public int getCurrentItem() {
        return this.A02;
    }

    public int getCurrentLogicalItem() {
        if (getItemCount() == 0) {
            return -1;
        }
        return A0O(this.A02);
    }

    public void setCurrentLogicalItem(int i) {
        super.setCurrentItem(A0O(i));
    }

    @Deprecated
    public void setCurrentItem(int i) {
        super.setCurrentItem(i);
    }

    public WaViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
