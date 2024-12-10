package X;

import android.text.TextUtils;
import android.view.View;
import com.whatsapp.WaTextView;

/* renamed from: X.8J5  reason: invalid class name */
public class AnonymousClass8J5 extends C42011xT {
    public final WaTextView A00;
    public final WaTextView A01;
    public final WaTextView A02;
    public final WaTextView A03;
    public final WaTextView A04;
    public final WaTextView A05;
    public final WaTextView A06;
    public final WaTextView A07;
    public final WaTextView A08;
    public final View A09;

    public static void A01(AnonymousClass8J5 r1, int i) {
        r1.A09.setVisibility(i);
        WaTextView waTextView = r1.A04;
        waTextView.setVisibility(i);
        waTextView.setVisibility(i);
        r1.A06.setVisibility(i);
        r1.A07.setVisibility(i);
        r1.A00.setVisibility(i);
        r1.A01.setVisibility(i);
        r1.A02.setVisibility(i);
        r1.A03.setVisibility(i);
    }

    public AnonymousClass8J5(View view) {
        super(view);
        this.A04 = AnonymousClass3MW.A0T(view, 2131435902);
        this.A05 = AnonymousClass3MW.A0T(view, 2131435900);
        this.A06 = AnonymousClass3MW.A0T(view, 2131436026);
        this.A07 = AnonymousClass3MW.A0T(view, 2131436025);
        this.A00 = AnonymousClass3MW.A0T(view, 2131430047);
        this.A01 = AnonymousClass3MW.A0T(view, 2131430046);
        this.A02 = AnonymousClass3MW.A0T(view, 2131435429);
        this.A03 = AnonymousClass3MW.A0T(view, 2131435427);
        this.A08 = AnonymousClass3MW.A0T(view, 2131436320);
        this.A09 = AnonymousClass1HF.A06(view, 2131429772);
    }

    public static void A00(WaTextView waTextView, WaTextView waTextView2, C18000vb r7, AnonymousClass8J5 r8, String str, String str2, int i) {
        if (TextUtils.isEmpty(str2)) {
            waTextView.setVisibility(8);
            waTextView2.setVisibility(8);
            return;
        }
        String A11 = AnonymousClass3Ma.A11(r8.A0H, i);
        if (!TextUtils.isEmpty(str)) {
            boolean A1b = AnonymousClass3MY.A1b(r7);
            StringBuilder A10 = AnonymousClass000.A10();
            if (A1b) {
                C17900vP.A0c(A11, " (", str, ") ", A10);
            } else {
                C17900vP.A0c(" (", str, ") ", A11, A10);
            }
            A11 = A10.toString();
        }
        waTextView.setText(A11);
        waTextView.setVisibility(0);
        waTextView2.setText(str2);
        waTextView2.setVisibility(0);
        int i2 = 5;
        int i3 = 3;
        if (AnonymousClass3MW.A1Z(r7)) {
            i3 = 5;
        }
        waTextView.setGravity(i3);
        if (AnonymousClass3MW.A1Z(r7)) {
            i2 = 3;
        }
        waTextView2.setGravity(i2);
    }
}
