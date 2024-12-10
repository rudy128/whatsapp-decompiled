package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

/* renamed from: X.4Xb  reason: invalid class name and case insensitive filesystem */
public final class C87804Xb {
    public ImageView A00;
    public ImageView A01;
    public ImageView A02;
    public final int A03;
    public final Context A04;
    public final View A05;
    public final ViewGroup A06;
    public final ImageView A07;
    public final ImageView A08;
    public final TextView A09;
    public final AnonymousClass4MP A0A;
    public final AnonymousClass11P A0B;
    public final C18000vb A0C;
    public final C18030ve A0D;
    public final C136906ub A0E;
    public final C139506yx A0F;
    public final AnonymousClass3M2 A0G;
    public final C32021gV A0H;
    public final C28931bI A0I;
    public final boolean A0J;

    public C87804Xb(View.OnLongClickListener onLongClickListener, View view, AnonymousClass4MP r6, AnonymousClass11P r7, C18000vb r8, C18030ve r9, C136906ub r10, C139506yx r11, C32021gV r12, int i, boolean z) {
        C28931bI A0p;
        C18070vi.A0d(r11, 3);
        this.A0B = r7;
        this.A0D = r9;
        this.A0F = r11;
        this.A0E = r10;
        this.A0C = r8;
        this.A0H = r12;
        this.A05 = view;
        this.A03 = i;
        this.A0A = r6;
        this.A0J = z;
        this.A04 = view.getContext();
        this.A09 = AnonymousClass3Ma.A0E(view, 2131427741);
        ImageView A0C2 = AnonymousClass3Ma.A0C(view, 2131436123);
        this.A07 = A0C2;
        this.A08 = AnonymousClass3MW.A0H(view, 2131427744);
        this.A06 = (ViewGroup) C18070vi.A05(view, 2131427742);
        AnonymousClass3MY.A0w(view.getContext(), A0C2, 2131886435);
        View findViewById = view.findViewById(2131427743);
        if (findViewById == null) {
            A0p = null;
        } else {
            A0p = AnonymousClass3MW.A0p(findViewById);
        }
        this.A0I = A0p;
        AnonymousClass4WJ.A00(new C89904dD(this, 18), A0C2);
        A0C2.setOnLongClickListener(onLongClickListener);
        this.A0G = new C98114qb(this, 0);
    }

    public final void A01(AnonymousClass21V r3, ArrayList arrayList) {
        AnonymousClass3Ma.A1P(this.A07, AnonymousClass4W0.A01(r3), arrayList);
        if (!this.A0J) {
            TextView textView = this.A09;
            if (textView.getVisibility() == 0) {
                AnonymousClass3Ma.A1P(textView, AnonymousClass4W0.A00(r3), arrayList);
            }
            ImageView imageView = this.A08;
            if (imageView != null) {
                AnonymousClass3Ma.A1P(imageView, AnonymousClass3uL.A0O(r3), arrayList);
            }
        }
    }

    public static final void A00(ImageView imageView, C87804Xb r3, int i, int i2) {
        LinearLayout.LayoutParams A0D2 = AnonymousClass3Ma.A0D();
        A0D2.gravity = 16;
        imageView.setLayoutParams(A0D2);
        AnonymousClass3MY.A0w(imageView.getContext(), imageView, i);
        C27641Ww.A05(imageView, r3.A0C, 0, i2);
    }
}
