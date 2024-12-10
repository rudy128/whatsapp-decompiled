package X;

import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.calling.callgrid.view.CallGrid;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import java.util.List;

/* renamed from: X.5ly  reason: invalid class name and case insensitive filesystem */
public class C112745ly extends C39711tW {
    public int A00;
    public final int A01 = 1;
    public final Object A02;

    public C112745ly(CallGrid callGrid) {
        this.A02 = callGrid;
        this.A00 = 0;
    }

    public void A03(RecyclerView recyclerView, int i) {
        if (this.A01 != 0) {
            super.A03(recyclerView, i);
            return;
        }
        CallGrid callGrid = (CallGrid) this.A02;
        CallGridViewModel callGridViewModel = callGrid.A0A;
        if (callGridViewModel != null && i == 0) {
            if (callGrid.A0W) {
                callGridViewModel.A0Z(callGrid.getVisibleParticipantJids());
            }
            if (Math.abs(this.A00) > callGrid.A08.A02 / 2) {
                C175258yP r2 = callGrid.A0A.A0W;
                C188749hv A0Q = r2.A03.A0Q(r2.A07().A0C);
                A0Q.A0D = C108995ce.A0T(A0Q.A0D);
            }
            this.A00 = 0;
        } else if (i == 1) {
            callGrid.A0S = true;
        }
    }

    public void A04(RecyclerView recyclerView, int i, int i2) {
        if (this.A01 != 0) {
            AnonymousClass6KP r1 = (AnonymousClass6KP) this.A02;
            List list = C42011xT.A0I;
            int A1N = r1.A00.A1N();
            int i3 = this.A00;
            if (A1N != i3) {
                if (i3 == 0 || A1N == 0) {
                    C17880vN.A0V(r1.A07).notifyAllObservers(new AnonymousClass7KP(AnonymousClass000.A1P(A1N), 3));
                }
                this.A00 = A1N;
                return;
            }
            return;
        }
        CallGrid.A04((CallGrid) this.A02);
        this.A00 += i;
    }

    public C112745ly(AnonymousClass6KP r2) {
        this.A02 = r2;
    }
}
