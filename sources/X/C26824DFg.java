package X;

import android.content.Context;

/* renamed from: X.DFg  reason: case insensitive filesystem */
public final class C26824DFg implements C16890tO {
    public final /* synthetic */ EAQ A00;

    public /* bridge */ /* synthetic */ Object BD3(Context context, Object obj, Object obj2, Object obj3) {
        if (obj3 != null) {
            C01920By BSP = this.A00.BSP();
            C18070vi.A0z(BSP, "null cannot be cast to non-null type com.facebook.rendercore.RenderTreeHostView");
            BSP.setRenderTree(((C04220Mi) obj3).A01);
        }
        return null;
    }

    public C26824DFg(EAQ eaq) {
        this.A00 = eaq;
    }

    public /* bridge */ /* synthetic */ boolean CMV(Object obj, Object obj2, Object obj3, Object obj4) {
        DFL dfl = (DFL) obj;
        DFL dfl2 = (DFL) obj2;
        C18070vi.A0h(dfl, dfl2);
        C24724CHl.A01.get();
        if (dfl.A09(40) == dfl2.A09(40)) {
            return false;
        }
        return true;
    }

    public /* synthetic */ String BQX() {
        return C25321CdS.A01(this);
    }

    public /* synthetic */ Class Bar() {
        return getClass();
    }

    public /* bridge */ /* synthetic */ void CQ4(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
    }
}
