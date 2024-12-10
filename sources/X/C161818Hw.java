package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.Calendar;
import java.util.List;

/* renamed from: X.8Hw  reason: invalid class name and case insensitive filesystem */
public class C161818Hw extends C38391rD implements AnonymousClass8AZ {
    public Context A00;
    public List A01;
    public List A02;

    public int A0Q() {
        return this.A02.size();
    }

    public int BPU(int i) {
        return ((C21601Amp) this.A01.get(i)).count;
    }

    public int BSM() {
        return this.A01.size();
    }

    public long BSN(int i) {
        return -((Calendar) this.A01.get(i)).getTimeInMillis();
    }

    public /* bridge */ /* synthetic */ void Bma(C42011xT r3, int i) {
        List list = C42011xT.A0I;
        ((AnonymousClass8IN) r3).A00.setText(this.A01.get(i).toString());
    }

    public void Bmc(C42011xT r3, int i) {
        C1765594r r32 = (C1765594r) r3;
        r32.A0B((C183409Yd) this.A02.get(i));
        if (!((C1766995f) this.A02.get(i)).A02) {
            r32.A00.setVisibility(8);
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.1xT, X.8IN] */
    public /* bridge */ /* synthetic */ C42011xT BqT(ViewGroup viewGroup) {
        Context context = this.A00;
        View inflate = LayoutInflater.from(context).inflate(2131627219, viewGroup, false);
        inflate.setClickable(false);
        AnonymousClass8BX.A0y(context, inflate);
        ? r1 = new C42011xT(inflate);
        r1.A00 = C17880vN.A0E(inflate, 2131436358);
        return r1;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.1xT, X.94r] */
    public C42011xT BqY(ViewGroup viewGroup, int i) {
        View A0G = AnonymousClass8BX.A0G(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131626441);
        ? r1 = new C42011xT(A0G);
        r1.A02 = AnonymousClass3MW.A0J(A0G, 2131429789);
        r1.A01 = AnonymousClass3MW.A0J(A0G, 2131427786);
        r1.A00 = AnonymousClass1HF.A06(A0G, 2131430073);
        return r1;
    }

    public /* bridge */ /* synthetic */ boolean C6y(MotionEvent motionEvent, C42011xT r3, int i) {
        return false;
    }
}
