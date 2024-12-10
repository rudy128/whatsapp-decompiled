package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.status.tiles.StatusGridPageFragment;

/* renamed from: X.5lh  reason: invalid class name and case insensitive filesystem */
public final class C112575lh extends C40611uz {
    public final int A00;
    public final /* synthetic */ StatusGridPageFragment A01;

    public C112575lh(StatusGridPageFragment statusGridPageFragment, int i) {
        this.A01 = statusGridPageFragment;
        this.A00 = i;
    }

    public void A05(Rect rect, View view, C38021qZ r12, RecyclerView recyclerView) {
        int i;
        int i2;
        int A0I;
        int i3;
        int i4;
        C18070vi.A0n(rect, view, recyclerView);
        int A002 = RecyclerView.A00(view);
        StatusGridPageFragment statusGridPageFragment = this.A01;
        C140066zt r0 = statusGridPageFragment.A04;
        if (r0 != null) {
            i = r0.A00;
        } else {
            i = 4;
        }
        int i5 = A002 % i;
        C18000vb r02 = statusGridPageFragment.A02;
        if (r02 != null) {
            boolean A1b = AnonymousClass3MY.A1b(r02);
            int i6 = this.A00;
            int i7 = i6 / 2;
            C140066zt r03 = statusGridPageFragment.A04;
            if (r03 != null) {
                i2 = r03.A00;
            } else {
                i2 = 4;
            }
            int i8 = 0;
            if (A002 / i2 == 0) {
                A0I = 0;
            } else {
                A0I = C72453Mb.A0I(statusGridPageFragment.A0F);
            }
            if (i5 != 0) {
                C140066zt r04 = statusGridPageFragment.A04;
                if (r04 != null) {
                    i4 = r04.A00;
                } else {
                    i4 = 4;
                }
                A0I = i7 / i4;
            }
            int i9 = i5 + 1;
            C140066zt r05 = statusGridPageFragment.A04;
            if (r05 != null) {
                i3 = r05.A00;
            } else {
                i3 = 4;
            }
            if (i9 % i3 != 0) {
                i8 = i7 / i3;
            }
            int i10 = A0I;
            if (A1b) {
                i10 = i8;
            }
            rect.left = i10;
            if (!A1b) {
                A0I = i8;
            }
            rect.right = A0I;
            if (A002 >= 4) {
                rect.top = i6;
                return;
            }
            return;
        }
        C18070vi.A11("waLocale");
        throw null;
    }
}
