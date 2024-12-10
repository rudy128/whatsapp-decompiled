package X;

import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.list.header.WDSSectionHeader;

/* renamed from: X.3Xy  reason: invalid class name and case insensitive filesystem */
public abstract class C73953Xy extends C42011xT {
    public void A0B(Object obj) {
        if (this instanceof C76013mK) {
            C76013mK r4 = (C76013mK) this;
            C93364ir r9 = (C93364ir) obj;
            C18070vi.A0d(r9, 0);
            C72453Mb.A0X(r4.A03).setText(r9.A01);
            C42971z2 r6 = r4.A00;
            AnonymousClass1E7 r5 = r9.A00;
            r6.CIg(r5.A0J);
            C37451pZ r3 = r4.A01;
            C18100vl r2 = r4.A02;
            r3.A05((ImageView) AnonymousClass3MX.A14(r2), r6, r5, true);
            C89994dM.A00(C72453Mb.A0T(r4.A05), r4, r9, 20);
            C18100vl r1 = r4.A04;
            C72453Mb.A0T(r1).setVisibility(0);
            C89994dM.A00(C72453Mb.A0T(r1), r4, r9, 21);
            C84084Hu.A00(C72453Mb.A0T(r2), new C105995Ud(r9, r4));
        } else if (this instanceof C76003mJ) {
            C76003mJ r32 = (C76003mJ) this;
            C93354iq r92 = (C93354iq) obj;
            C18070vi.A0d(r92, 0);
            C18100vl r12 = r32.A00;
            boolean z = AnonymousClass3MX.A14(r12) instanceof WDSSectionHeader;
            View A0T = C72453Mb.A0T(r12);
            if (z) {
                C18070vi.A0z(A0T, "null cannot be cast to non-null type com.whatsapp.wds.components.list.header.WDSSectionHeader");
                ((WDSSectionHeader) A0T).setHeaderText(AnonymousClass4ZN.A00(r32.A0H, r92.A00).toString());
            } else if (A0T instanceof WaTextView) {
                View A0T2 = C72453Mb.A0T(r12);
                C18070vi.A0z(A0T2, "null cannot be cast to non-null type com.whatsapp.WaTextView");
                ((TextView) A0T2).setText(AnonymousClass4ZN.A00(r32.A0H, r92.A00).toString());
            }
        } else {
            C75993mI r13 = (C75993mI) this;
            C93384it r93 = (C93384it) obj;
            C18070vi.A0d(r93, 0);
            View view = r13.A0H;
            ((ViewGroup.LayoutParams) AnonymousClass3MX.A14(r13.A00)).height = view.getResources().getDimensionPixelSize(r93.A01);
            Integer num = r93.A02;
            if (num != null) {
                int dimensionPixelSize = view.getResources().getDimensionPixelSize(num.intValue());
                if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    C72463Mc.A0P(view).setMargins(0, dimensionPixelSize, 0, 0);
                    view.requestLayout();
                }
            }
            int i = r93.A00;
            TypedValue typedValue = new TypedValue();
            AnonymousClass3Ma.A06(view).resolveAttribute(i, typedValue, true);
            view.setBackgroundResource(typedValue.resourceId);
        }
    }
}
