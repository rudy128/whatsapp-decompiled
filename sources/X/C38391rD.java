package X;

import android.database.Observable;
import android.os.Trace;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.1rD  reason: invalid class name and case insensitive filesystem */
public abstract class C38391rD {
    public boolean A00 = false;
    public final C38411rF A01 = new Observable();

    public void A0L(C42011xT r1) {
    }

    public void A0N(C42011xT r1) {
    }

    public boolean A0O() {
        return false;
    }

    public abstract int A0Q();

    public void A0R(C42011xT r1) {
    }

    public abstract void Bmc(C42011xT r1, int i);

    public abstract C42011xT BqY(ViewGroup viewGroup, int i);

    public final C42011xT A0F(ViewGroup viewGroup, int i) {
        try {
            Method method = AnonymousClass1CH.A03;
            Trace.beginSection("RV CreateView");
            C42011xT BqY = BqY(viewGroup, i);
            if (BqY.A0H.getParent() == null) {
                BqY.A01 = i;
                Trace.endSection();
                return BqY;
            }
            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
        } catch (Throwable th) {
            Method method2 = AnonymousClass1CH.A03;
            Trace.endSection();
            throw th;
        }
    }

    public final void A0G(int i) {
        this.A01.A04((Object) null, i, 1);
    }

    public final void A0H(int i) {
        this.A01.A02(i, 1);
    }

    public final void A0I(int i) {
        this.A01.A03(i, 1);
    }

    public final void A0J(int i, int i2) {
        this.A01.A04((Object) null, i, i2);
    }

    public void A0K(boolean z) {
        if (!this.A01.A05()) {
            this.A00 = z;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public long A0M(int i) {
        if (!(this instanceof C40401ue)) {
            return -1;
        }
        C58482kl r6 = (C58482kl) ((C40401ue) this).A00.A02.get(i);
        Object obj = r6.A02;
        boolean z = obj instanceof C39611tM;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(r6.A00);
        if (z) {
            C39611tM r5 = (C39611tM) obj;
            objArr[1] = Integer.valueOf(Arrays.hashCode(new Object[]{r5.A01, Integer.valueOf(r5.A00)}));
        } else {
            objArr[1] = obj;
        }
        return (long) Arrays.hashCode(objArr);
    }

    public void A0S(RecyclerView recyclerView) {
        if (this instanceof C40401ue) {
            ((C40401ue) this).A01 = recyclerView;
        }
    }

    public void A0T(RecyclerView recyclerView) {
        if (this instanceof C40401ue) {
            ((C40401ue) this).A01 = null;
        }
    }

    public void CDq(C37911qO r2) {
        this.A01.registerObserver(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r2 == -2) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getItemViewType(int r6) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.C38421rG
            if (r0 == 0) goto L_0x0035
            r1 = r5
            X.1rG r1 = (X.C38421rG) r1
            java.util.List r4 = r1.A02
            int r0 = r4.size()
            r3 = -1
            if (r6 < r0) goto L_0x001e
            int r2 = r4.size()
            X.1rD r1 = r1.A00
            int r0 = r1.A0Q()
            int r2 = r2 + r0
            if (r6 < r2) goto L_0x001f
            r3 = -2
        L_0x001e:
            return r3
        L_0x001f:
            int r0 = r4.size()
            int r6 = r6 - r0
            int r2 = r1.getItemViewType(r6)
            if (r2 == r3) goto L_0x002e
            r0 = -2
            r1 = 1
            if (r2 != r0) goto L_0x002f
        L_0x002e:
            r1 = 0
        L_0x002f:
            java.lang.String r0 = "Can't use header or footer type in inner adapter"
            X.C17960vV.A0H(r1, r0)
            return r2
        L_0x0035:
            boolean r0 = r5 instanceof X.C38401rE
            if (r0 == 0) goto L_0x0043
            r0 = r5
            X.1rE r0 = (X.C38401rE) r0
            X.1rB r0 = r0.A05
            int r0 = r0.getItemViewType(r6)
            return r0
        L_0x0043:
            boolean r0 = r5 instanceof X.AnonymousClass28H
            if (r0 == 0) goto L_0x0084
            r2 = r5
            X.28H r2 = (X.AnonymousClass28H) r2
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x006b
            X.0vl r0 = r2.A08
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            X.0vl r0 = r2.A07
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r1 = r1 + r0
            if (r6 != r1) goto L_0x006b
            r1 = 1
        L_0x006a:
            return r1
        L_0x006b:
            X.00H r0 = r2.A04
            java.lang.Object r0 = r0.get()
            X.1rO r0 = (X.C38501rO) r0
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0082
            java.util.concurrent.CopyOnWriteArrayList r0 = r2.A05
            int r0 = r0.size()
            r1 = 2
            if (r6 == r0) goto L_0x006a
        L_0x0082:
            r1 = 0
            return r1
        L_0x0084:
            boolean r0 = r5 instanceof X.C40401ue
            if (r0 == 0) goto L_0x00a2
            r0 = r5
            X.1ue r0 = (X.C40401ue) r0
            X.1uh r0 = r0.A00
            java.util.List r1 = r0.A02
            if (r6 < 0) goto L_0x00a0
            int r0 = r1.size()
            if (r6 >= r0) goto L_0x00a0
            java.lang.Object r0 = r1.get(r6)
            X.2kl r0 = (X.C58482kl) r0
            int r0 = r0.A00
            return r0
        L_0x00a0:
            r0 = -1
            return r0
        L_0x00a2:
            boolean r0 = r5 instanceof X.C41261w4
            if (r0 == 0) goto L_0x00b4
            r0 = r5
            X.1w3 r0 = (X.C41251w3) r0
            java.lang.Object r0 = r0.A0U(r6)
            X.1vq r0 = (X.C41121vq) r0
            int r0 = r0.BTW()
            return r0
        L_0x00b4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38391rD.getItemViewType(int):int");
    }

    public final void notifyDataSetChanged() {
        this.A01.A00();
    }

    public void A0P(C42011xT r1, List list, int i) {
        Bmc(r1, i);
    }
}
