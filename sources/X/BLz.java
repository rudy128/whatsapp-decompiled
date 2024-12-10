package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

public final class BLz extends C40611uz {
    public final int A00;
    public final CT8 A01;
    public final DOZ A02;
    public final DFL A03;
    public final Rect[] A04;

    public BLz(DOZ doz, DFL dfl) {
        int i;
        this.A03 = dfl;
        this.A02 = doz;
        C26242Cvf cvf = C26242Cvf.A00;
        Context context = doz.A00;
        CT8 A05 = cvf.A05(context, dfl);
        this.A01 = A05;
        int i2 = A05.A01;
        this.A00 = i2;
        boolean A002 = CC8.A00(context);
        if (i2 == 1) {
            i = A05.A00;
        } else {
            i = A05.A03;
        }
        this.A04 = C24521C7p.A00(i2, i, A05.A02, A002);
    }

    public void A05(Rect rect, View view, C38021qZ r11, RecyclerView recyclerView) {
        BM8 bm8;
        int i;
        Rect rect2;
        List unmodifiableList;
        Rect rect3;
        boolean A1U = AnonymousClass8BX.A1U(rect, view, recyclerView);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof BM8) && (bm8 = (BM8) layoutParams) != null) {
            int A002 = RecyclerView.A00(view);
            DFL dfl = this.A03;
            Object obj = dfl.A0E().get(A002);
            C18070vi.A0X(obj);
            DFL A0P = BE7.A0P((DFL) obj);
            boolean z = false;
            if (A0P != null && A0P.A05 == 16482) {
                z = A0P.A0I(36, false);
            }
            bm8.A01 = z;
            List list = ((C25743ClD) BE9.A0l(this.A02, dfl)).A08;
            if (!(list == null || (unmodifiableList = Collections.unmodifiableList(list)) == null || (rect3 = (Rect) C29431cG.A0f(unmodifiableList, A002)) == null)) {
                if (this.A00 == A1U) {
                    rect.top = rect3.top;
                    rect.bottom = rect3.bottom;
                } else {
                    rect.left = rect3.left;
                    rect.right = rect3.right;
                }
            }
            Rect[] rectArr = this.A04;
            C25282Ccf ccf = bm8.A00;
            if (ccf == null) {
                i = -1;
            } else {
                i = ccf.A04;
            }
            C18070vi.A0d(rectArr, 0);
            if (i < 0 || i >= rectArr.length) {
                rect2 = null;
            } else {
                rect2 = rectArr[i];
            }
            if (!z && rect2 != null) {
                if (this.A00 == A1U) {
                    rect.left = rect2.left;
                    rect.right = rect2.right;
                    return;
                }
                rect.top = rect2.top;
                rect.bottom = rect2.bottom;
            }
        }
    }
}
