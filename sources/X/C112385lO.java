package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: X.5lO  reason: invalid class name and case insensitive filesystem */
public abstract class C112385lO extends C38391rD implements AnonymousClass87G {
    public C131976ly A00;
    public final int A01;
    public final LayoutInflater A02;
    public final C18000vb A03;
    public final AnonymousClass1KW A04;
    public final AnonymousClass872 A05;
    public final C18010vc A06;

    public synchronized int A0Q() {
        C131976ly r0 = this.A00;
        if (r0 == null) {
            return 0;
        }
        return r0.A01.size();
    }

    public synchronized void A0U(C131976ly r3) {
        C131976ly r1 = this.A00;
        if (r1 != null) {
            r1.A00 = null;
        }
        this.A00 = r3;
        r3.A00(this);
        notifyDataSetChanged();
    }

    public /* bridge */ /* synthetic */ void A0N(C42011xT r1) {
        ((C113605nM) r1).A0B();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r3, int i) {
        AnonymousClass737 r0;
        C113605nM r32 = (C113605nM) r3;
        synchronized (this) {
            if (i < this.A00.A01.size()) {
                r0 = (AnonymousClass737) this.A00.A01.get(i);
            } else {
                r0 = null;
            }
            r32.A01 = r0;
            r32.A00 = i;
        }
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        return new C113605nM(this.A02, viewGroup, this.A04, this.A05, this.A06, this.A01);
    }

    public void C3x(C131976ly r2) {
        if (r2.equals(this.A00)) {
            notifyDataSetChanged();
        }
    }

    public C112385lO(Activity activity, C18000vb r3, AnonymousClass1KW r4, AnonymousClass872 r5, C18010vc r6, int i) {
        this.A02 = activity.getLayoutInflater();
        this.A04 = r4;
        this.A03 = r3;
        this.A06 = r6;
        this.A05 = r5;
        this.A01 = i;
    }
}
