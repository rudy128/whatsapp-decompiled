package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: X.4fU  reason: invalid class name and case insensitive filesystem */
public class C91314fU implements AnonymousClass1HE {
    public final int A00;

    public C91314fU(int i) {
        this.A00 = i;
    }

    public final AnonymousClass1HO BlX(View view, AnonymousClass1HO r6) {
        C33321id A07;
        int paddingLeft;
        int i;
        int paddingRight;
        switch (this.A00) {
            case 0:
                C33321id A072 = r6.A07(135);
                if (view instanceof FrameLayout) {
                    ViewGroup.MarginLayoutParams A0B = AnonymousClass3MW.A0B(view);
                    A0B.bottomMargin = A072.A00;
                    A0B.topMargin = A072.A03;
                    break;
                }
                break;
            case 3:
                C18070vi.A0h(view, r6);
                A07 = r6.A07(135);
                C18070vi.A0X(A07);
                paddingLeft = view.getPaddingLeft();
                i = A07.A03;
                paddingRight = view.getPaddingRight();
                break;
            case 4:
                boolean A15 = C18070vi.A15(view, r6);
                C33321id A073 = r6.A07(135);
                C18070vi.A0X(A073);
                view.setPadding(view.getPaddingLeft(), A15 ? 1 : 0, view.getPaddingRight(), A073.A00);
                break;
            default:
                C18070vi.A0h(view, r6);
                A07 = r6.A07(135);
                C18070vi.A0X(A07);
                paddingLeft = A07.A01;
                i = A07.A03;
                paddingRight = A07.A02;
                break;
        }
        view.setPadding(paddingLeft, i, paddingRight, A07.A00);
        return AnonymousClass1HO.A01;
    }
}
