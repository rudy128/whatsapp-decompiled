package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.WaImageView;

/* renamed from: X.2fQ  reason: invalid class name and case insensitive filesystem */
public final class C55222fQ {
    public final View A00;
    public final WaImageView A01;
    public final WaImageView A02;
    public final C25801Pr A03;
    public final C28931bI A04;

    public C55222fQ(View view, C25801Pr r7, AnonymousClass00H r8, boolean z) {
        this.A00 = view;
        this.A03 = r7;
        this.A02 = (WaImageView) view.findViewById(2131430830);
        this.A01 = (WaImageView) view.findViewById(2131430829);
        C28931bI A002 = C28931bI.A00(view, 2131434664);
        this.A04 = A002;
        if (z) {
            r7.A04((AnonymousClass1BI) null, 30, r7.A02(), true);
            C28931bI A003 = C28931bI.A00(A002.A02(), 2131436044);
            if (C17880vN.A1W(C17880vN.A0C(((C38731rn) r8.get()).A01), "imagine_me_retake_onboarding_seen")) {
                A003.A04(8);
                return;
            }
            View findViewById = A003.A02().findViewById(2131436069);
            TextView A0E = C17880vN.A0E(A003.A02(), 2131436091);
            A0E.setText(2131887321);
            A0E.getViewTreeObserver().addOnGlobalLayoutListener(new C90574eI(new C21455AkM(A0E, findViewById, r8, 48), A0E, 9));
        }
    }
}
