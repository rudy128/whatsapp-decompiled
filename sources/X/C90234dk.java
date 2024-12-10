package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.widget.Toast;
import java.util.List;

/* renamed from: X.4dk  reason: invalid class name and case insensitive filesystem */
public class C90234dk implements View.OnLongClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C90234dk(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public final boolean onLongClick(View view) {
        AnonymousClass725 r0;
        if (this.A00 != 0) {
            C112345lK r3 = (C112345lK) this.A02;
            int i = this.A01;
            List list = r3.A03;
            if (list == null) {
                list = AnonymousClass000.A13();
            }
            if (i < 0 || i >= list.size() || !((C135906sx) list.get(i)).A01 || (r0 = r3.A01) == null || r0.A07.isEmpty()) {
                return false;
            }
            return C112345lK.A06(r3, i);
        }
        C75423hT r7 = (C75423hT) this.A02;
        Toast A03 = r7.A04.A03(AnonymousClass3Ma.A11(view, this.A01));
        int[] iArr = new int[2];
        Rect A07 = AnonymousClass3MW.A07();
        view.getLocationOnScreen(iArr);
        view.getWindowVisibleDisplayFrame(A07);
        int A022 = AnonymousClass3MW.A02(view, iArr[1]) - A07.top;
        int i2 = iArr[0];
        if (AnonymousClass3MY.A1b(r7.A0C)) {
            Point point = new Point();
            C72463Mc.A0u(r7.A01, point);
            if (A03.getView() != null) {
                A03.getView().measure(point.x, point.y);
                i2 -= A03.getView().getMeasuredWidth();
            }
        } else {
            i2 += view.getWidth();
        }
        A03.setGravity(51, i2, A022);
        A03.show();
        return true;
    }
}
