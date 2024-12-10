package X;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import androidx.cardview.widget.CardView;

/* renamed from: X.0Tm  reason: invalid class name */
public class AnonymousClass0Tm implements AnonymousClass0t1 {
    public void CJO(C15610qu r5, float f) {
        AnonymousClass0Tl r0 = (AnonymousClass0Tl) r5;
        AnonymousClass04T r3 = (AnonymousClass04T) r0.A00;
        CardView cardView = r0.A01;
        boolean z = cardView.A00;
        boolean z2 = cardView.A01;
        if (!(f == r3.A00 && r3.A03 == z && r3.A04 == z2)) {
            r3.A00 = f;
            r3.A03 = z;
            r3.A04 = z2;
            AnonymousClass04T.A00((Rect) null, r3);
            r3.invalidateSelf();
        }
        CR8(r5);
    }

    public void CI1(ColorStateList colorStateList, C15610qu r6) {
        AnonymousClass04T r3 = (AnonymousClass04T) ((AnonymousClass0Tl) r6).A00;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        r3.A02 = colorStateList;
        r3.A08.setColor(colorStateList.getColorForState(r3.getState(), r3.A02.getDefaultColor()));
        r3.invalidateSelf();
    }

    public void CR8(C15610qu r12) {
        AnonymousClass0Tl r122 = (AnonymousClass0Tl) r12;
        CardView cardView = r122.A01;
        if (!cardView.A00) {
            cardView.A03.set(0, 0, 0, 0);
            Rect rect = cardView.A02;
            AnonymousClass0Tm.super.setPadding(0 + rect.left, 0 + rect.top, 0 + rect.right, 0 + rect.bottom);
            return;
        }
        AnonymousClass04T r0 = (AnonymousClass04T) r122.A00;
        float f = r0.A00;
        float f2 = r0.A01;
        boolean z = cardView.A01;
        float f3 = f;
        double d = AnonymousClass04R.A00;
        if (z) {
            f3 = (float) (((double) f) + ((1.0d - d) * ((double) f2)));
        }
        int ceil = (int) Math.ceil((double) f3);
        float f4 = f * 1.5f;
        if (z) {
            f4 = (float) (((double) f4) + ((1.0d - AnonymousClass04R.A00) * ((double) f2)));
        }
        int ceil2 = (int) Math.ceil((double) f4);
        cardView.A03.set(ceil, ceil2, ceil, ceil2);
        Rect rect2 = cardView.A02;
        AnonymousClass0Tm.super.setPadding(ceil + rect2.left, ceil2 + rect2.top, ceil + rect2.right, ceil2 + rect2.bottom);
    }
}
