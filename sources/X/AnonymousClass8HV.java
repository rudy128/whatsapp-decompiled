package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

/* renamed from: X.8HV  reason: invalid class name */
public class AnonymousClass8HV extends C41251w3 {
    public static final C40411uf A02 = new AnonymousClass8HK(2);
    public C37451pZ A00;
    public final AnonymousClass2Y6 A01;

    public AnonymousClass8HV(AnonymousClass2Y6 r2) {
        super(A02);
        this.A01 = r2;
    }

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        Context context = viewGroup2.getContext();
        C17960vV.A07(context);
        int i2 = i;
        if (i == 0) {
            View inflate = LayoutInflater.from(context).inflate(2131627255, viewGroup2, false);
            inflate.setEnabled(false);
            return new C42011xT(inflate);
        } else if (i2 == 1) {
            View inflate2 = LayoutInflater.from(context).inflate(2131627254, viewGroup2, false);
            AnonymousClass2Y6 r1 = this.A01;
            C37451pZ r8 = this.A00;
            C17960vV.A08(r8, "UpcomingScheduledCallsAdapter/onCreateViewHolder single contact photo loader null");
            List list = C42011xT.A0I;
            AnonymousClass10E r0 = r1.A00.A01;
            AnonymousClass11P A6O = AnonymousClass10E.A6O(r0);
            C18030ve A8r = AnonymousClass10E.A8r(r0);
            AnonymousClass1KB A12 = AnonymousClass10E.A12(r0);
            AnonymousClass11S A17 = AnonymousClass10E.A17(r0);
            AnonymousClass10I AL1 = AnonymousClass10E.AL1(r0);
            AnonymousClass1VP A0W = AnonymousClass3MZ.A0W(r0);
            r0.ABX.get();
            r0.ABz.get();
            AnonymousClass1W6 A0s = AnonymousClass3Ma.A0s(r0);
            AnonymousClass1TD r10 = (AnonymousClass1TD) r0.A1m.get();
            AnonymousClass1TA r13 = (AnonymousClass1TA) r0.A5X.get();
            AnonymousClass121 r11 = (AnonymousClass121) r0.A2y.get();
            AnonymousClass00H A002 = C000200d.A00(r0.A3J);
            return new AnonymousClass8J6(inflate2, A12, A17, AnonymousClass3MZ.A0T(r0.A00), A0W, r8, A6O, r10, r11, (C32481hG) r0.A3Z.get(), r13, (C27081Uq) r0.A9g.get(), (C33231iU) r0.A6K.get(), A8r, (AnonymousClass1PP) r0.A3y.get(), A0s, AL1, A002);
        } else {
            C17900vP.A0i("UpcomingScheduledCallsAdapter/onCreateViewHolder failed to match type to view: ", AnonymousClass000.A10(), i2);
            throw AnonymousClass000.A0k("UpcomingScheduledCallsAdapter/onCreateViewHolder type mismatch");
        }
    }

    public void Bmc(C42011xT r8, int i) {
        StringBuilder A10;
        String str;
        if (i >= A0Q()) {
            A10 = AnonymousClass000.A10();
            str = "UpcomingScheduledCallsAdapter/onBindViewHolder no item exists at position ";
        } else {
            C22497BAe bAe = (C22497BAe) A0U(i);
            if (bAe == null) {
                A10 = AnonymousClass000.A10();
                str = "UpcomingScheduledCallsAdapter/onBindViewHolder null item at position ";
            } else if (bAe.BTW() != 0) {
                ((AnonymousClass8J6) r8).A0B((C20556APq) bAe);
                return;
            } else {
                C20555APp aPp = (C20555APp) bAe;
                C18070vi.A0d(aPp, 0);
                C193709qX r6 = aPp.A00;
                View view = r8.A0H;
                Context context = view.getContext();
                Object[] A1b = AnonymousClass3MW.A1b();
                A1b[0] = r6.A01;
                String A102 = AnonymousClass3Ma.A10(context, r6.A00, A1b, 1, 2131897367);
                View A06 = AnonymousClass1HF.A06(view, 2131436208);
                C18070vi.A0z(A06, "null cannot be cast to non-null type com.whatsapp.WaTextView");
                ((TextView) A06).setText(A102);
                return;
            }
        }
        C17900vP.A0k(str, A10, i);
    }

    public int getItemViewType(int i) {
        return ((C22497BAe) A0U(i)).BTW();
    }
}
