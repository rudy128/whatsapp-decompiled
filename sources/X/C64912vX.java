package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.2vX  reason: invalid class name and case insensitive filesystem */
public class C64912vX implements AnonymousClass1HE {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;

    public C64912vX(ViewPager viewPager) {
        this.A02 = viewPager;
        this.A01 = new Rect();
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Object, X.1bj] */
    public AnonymousClass1HO BlX(View view, AnonymousClass1HO r9) {
        if (this.A00 != 0) {
            C29171bj r2 = (C29171bj) this.A01;
            ? obj = new Object();
            obj.A02 = r2.A02;
            obj.A03 = r2.A03;
            obj.A01 = r2.A01;
            obj.A00 = r2.A00;
            ((C29151bh) this.A02).BlY(view, r9, obj);
        } else {
            r9 = AnonymousClass1HF.A0F(view, r9);
            if (!r9.A00.A0C()) {
                Rect rect = (Rect) this.A01;
                rect.left = r9.A03();
                rect.top = r9.A05();
                rect.right = r9.A04();
                rect.bottom = r9.A02();
                ViewGroup viewGroup = (ViewGroup) this.A02;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    AnonymousClass1HO A0E = AnonymousClass1HF.A0E(viewGroup.getChildAt(i), r9);
                    rect.left = Math.min(A0E.A03(), rect.left);
                    rect.top = Math.min(A0E.A05(), rect.top);
                    rect.right = Math.min(A0E.A04(), rect.right);
                    rect.bottom = Math.min(A0E.A02(), rect.bottom);
                }
                return r9.A0E(rect.left, rect.top, rect.right, rect.bottom);
            }
        }
        return r9;
    }

    public C64912vX(C29151bh r2, C29171bj r3) {
        this.A02 = r2;
        this.A01 = r3;
    }
}
