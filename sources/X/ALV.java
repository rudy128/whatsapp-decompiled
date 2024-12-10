package X;

import android.content.Context;
import android.view.View;

public final class ALV implements EAQ, C22566BDb, E7K {
    public final C23391Fw A00 = new C23391Fw(this);
    public final C20320AGc A01;
    public final C01920By A02;
    public final Context A03;
    public final AHz A04;
    public final /* synthetic */ D8G A05 = D8G.A00;

    public ALV(Context context, AHz aHz, CXY cxy) {
        C18070vi.A0d(aHz, 2);
        this.A03 = context;
        this.A04 = aHz;
        this.A02 = new C01920By(context);
        this.A01 = C198829yy.A00(context, aHz, this, cxy, AnonymousClass00R.A00);
        this.A00.A08(C23401Fx.CREATED);
    }

    public C16930tS BhM(AnonymousClass0IV r8, C05050Qf r9, DFL dfl, DFL dfl2, int i, int i2) {
        C18070vi.A0d(dfl2, 5);
        return this.A05.BhM(r8, r9, dfl, dfl2, i, i2);
    }

    public void Bo4() {
    }

    public void CDn() {
    }

    public boolean CMU(DFL dfl, DFL dfl2, Object obj, Object obj2) {
        return this.A05.CMU(dfl, dfl2, obj, obj2);
    }

    public String BNW() {
        return this.A04.A06;
    }

    public View BPL(Context context) {
        return this.A01.A00();
    }

    public View Bbb(Context context) {
        return this.A01.A00();
    }

    public /* bridge */ /* synthetic */ void BpW(C22403B6g b6g) {
        AI1 ai1 = (AI1) b6g;
        C18070vi.A0d(ai1, 0);
        C04240Mk r1 = (C04240Mk) ai1.A00;
        if (r1 != null) {
            this.A02.setRenderTree(r1);
        }
    }

    public void CA6() {
        this.A00.A08(C23401Fx.RESUMED);
    }

    public void CJb(C186379e6 r2) {
        C20320AGc aGc = this.A01;
        if (aGc != null) {
            aGc.A00 = r2;
            if (r2 != null) {
                aGc.A01();
            }
        }
    }

    public void destroy() {
        this.A00.A08(C23401Fx.DESTROYED);
    }

    public void stop() {
        this.A00.A08(C23401Fx.CREATED);
    }

    public void BIW() {
        stop();
        this.A01.A03.A02();
    }

    public C01920By BSP() {
        return this.A02;
    }

    public Context getContext() {
        return this.A03;
    }

    public /* bridge */ /* synthetic */ C23381Fv getLifecycle() {
        return this.A00;
    }
}
