package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.5lg  reason: invalid class name and case insensitive filesystem */
public final class C112565lg extends C40611uz {
    public final int A00;
    public final /* synthetic */ AnonymousClass6KR A01;

    public void A05(Rect rect, View view, C38021qZ r14, RecyclerView recyclerView) {
        int i;
        int valueOf;
        int i2;
        int valueOf2;
        int i3;
        C18070vi.A0d(rect, 0);
        boolean z = true;
        C18070vi.A0e(view, 1, recyclerView);
        C38251qy layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof GridLayoutManager)) {
            layoutManager = null;
        }
        int i4 = 0;
        if (layoutManager != null) {
            i = layoutManager.A0K();
        } else {
            i = 0;
        }
        AnonymousClass6KR r7 = this.A01;
        List list = C42011xT.A0I;
        AnonymousClass8AU r6 = r7.A0A;
        int i5 = r6.BTV().A00;
        int A002 = RecyclerView.A00(view);
        if (i <= i5) {
            int i6 = this.A00 / 2;
            int i7 = 0;
            if (A002 == 0) {
                valueOf2 = 0;
            } else {
                valueOf2 = Float.valueOf(C72453Mb.A00(r7.A0I));
            }
            boolean z2 = true;
            if (!AnonymousClass3MW.A1Z((C18000vb) r7.A0F.get()) && recyclerView.getLayoutDirection() != 1) {
                z2 = false;
            }
            if (A002 == 0) {
                i3 = AnonymousClass000.A0M(valueOf2);
            } else {
                i3 = i6 / r6.BTV().A00;
                i7 = i3;
            }
            int i8 = i3;
            if (z2) {
                i8 = i7;
            }
            rect.left = i8;
            if (!z2) {
                i3 = i7;
            }
            rect.right = i3;
            return;
        }
        int i9 = r6.BTV().A00;
        int i10 = A002 % ((i9 * 2) + 1);
        if (i10 != 0) {
            int i11 = i10 + 1;
            int i12 = i11 / 2;
            int i13 = i11 % 2;
            int i14 = this.A00 / 2;
            if (A002 / (i9 + 1) == 0) {
                valueOf = 0;
            } else {
                valueOf = Float.valueOf(C72453Mb.A00(r7.A0I));
            }
            if (!AnonymousClass3MW.A1Z((C18000vb) r7.A0F.get()) && recyclerView.getLayoutDirection() != 1) {
                z = false;
            }
            if (i12 == 0) {
                i2 = AnonymousClass000.A0M(valueOf);
            } else {
                i2 = i14 / (r6.BTV().A00 + 1);
            }
            int i15 = r6.BTV().A00 + 1;
            if ((i12 + 1) % i15 != 0) {
                i4 = i14 / i15;
            }
            int i16 = i2;
            if (z) {
                i16 = i4;
            }
            rect.left = i16;
            if (!z) {
                i2 = i4;
            }
            rect.right = i2;
            rect.top = i13 * i14;
        }
    }

    public C112565lg(AnonymousClass6KR r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }
}
