package X;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

public final class D86 implements C28483E3n {
    public final /* synthetic */ float A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ D3E A02;

    public D86(Context context, D3E d3e, float f) {
        this.A02 = d3e;
        this.A00 = f;
        this.A01 = context;
    }

    public final int BXI(View view, int i) {
        D3E d3e = this.A02;
        if (d3e != null) {
            if (d3e instanceof C23776BpL) {
                C23776BpL bpL = (C23776BpL) d3e;
                Context context = this.A01;
                C18070vi.A0d(bpL, 0);
                i -= (int) TypedValue.applyDimension(1, (float) bpL.A00, C108965cb.A08(context));
            } else if (d3e instanceof C23777BpM) {
                return (int) ((this.A00 - (((C23777BpM) d3e).A00 / 100.0f)) * ((float) i));
            } else {
                throw AnonymousClass3MW.A14();
            }
        }
        return (int) (this.A00 * ((float) i));
    }
}
