package X;

import android.view.View;
import java.util.ArrayList;

/* renamed from: X.1qU  reason: invalid class name and case insensitive filesystem */
public abstract class C37971qU extends C37961qT {
    public boolean A00 = true;

    public boolean A0I(C42011xT r2) {
        C37981qV r0 = (C37981qV) this;
        C37981qV.A00(r0, r2);
        r0.A09.add(r2);
        return true;
    }

    public abstract boolean A0K(C42011xT r1);

    public abstract boolean A0L(C42011xT r1, int i, int i2, int i3, int i4);

    /* JADX WARNING: type inference failed for: r0v11, types: [X.6UZ, java.lang.Object] */
    public boolean A0M(C42011xT r14, C42011xT r15, int i, int i2, int i3, int i4) {
        C37981qV r7 = (C37981qV) this;
        C42011xT r8 = r14;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        if (r14 == r15) {
            return r7.A0L(r8, i5, i6, i7, i8);
        }
        View view = r14.A0H;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        C37981qV.A00(r7, r14);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        C37981qV.A00(r7, r15);
        View view2 = r15.A0H;
        view2.setTranslationX((float) (-((int) (((float) (i3 - i)) - translationX))));
        view2.setTranslationY((float) (-((int) (((float) (i4 - i2)) - translationY))));
        view2.setAlpha(0.0f);
        ArrayList arrayList = r7.A07;
        ? obj = new Object();
        obj.A05 = r14;
        obj.A04 = r15;
        obj.A00 = i5;
        obj.A01 = i6;
        obj.A02 = i7;
        obj.A03 = i8;
        arrayList.add(obj);
        return true;
    }

    public boolean A0J(C42011xT r3) {
        if (!this.A00 || (r3.A00 & 4) != 0) {
            return true;
        }
        return false;
    }
}
