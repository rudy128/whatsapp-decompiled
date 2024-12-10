package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.9yK  reason: invalid class name and case insensitive filesystem */
public final class C198429yK {
    public Rect A00;
    public View A01;
    public boolean A02;
    public final ViewGroup A03;
    public final CTS A04;

    public static final void A00(ViewGroup viewGroup, C198429yK r8) {
        int childCount;
        Object obj;
        int i = 0;
        while (r8.A01 == null) {
            boolean z = viewGroup instanceof AnonymousClass05E;
            if (z) {
                childCount = ((AnonymousClass05E) viewGroup).getMountItemCount();
            } else {
                childCount = viewGroup.getChildCount();
            }
            if (i < childCount) {
                int i2 = i + 1;
                if (z) {
                    obj = ((C01930Bz) ((AnonymousClass05E) viewGroup)).A03[i];
                    if (obj == null) {
                        throw AnonymousClass001.A13("No MountItem exists at position ", AnonymousClass000.A10(), i);
                    }
                } else {
                    obj = viewGroup.getChildAt(i);
                }
                if (obj instanceof C03330Hq) {
                    C03330Hq r1 = (C03330Hq) obj;
                    Object obj2 = r1.A04;
                    if (r1.A01.A07.A0C() == ((long) r8.A04.A06) && (obj2 instanceof View)) {
                        r8.A01 = (View) obj2;
                        return;
                    } else if (obj2 instanceof ViewGroup) {
                        A00((ViewGroup) obj2, r8);
                    }
                } else if (obj instanceof ViewGroup) {
                    A00((ViewGroup) obj, r8);
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    public C198429yK(ViewGroup viewGroup, CTS cts) {
        C18070vi.A0j(viewGroup, cts);
        this.A03 = viewGroup;
        this.A04 = cts;
    }
}
