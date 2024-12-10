package X;

import com.facebook.rendercore.RenderTreeNode;

public final class BV2 extends C05140Qp {
    private final void A01() {
        DOZ doz;
        C04240Mk r0 = this.A01;
        if (r0 != null) {
            Object obj = r0.A02.A03;
            if ((obj instanceof DOZ) && (doz = (DOZ) obj) != null) {
                C26272CwJ.A01(doz);
                C26176Ctu.A02("Evaluation Context can only be gotten from the UI Thread");
            }
        }
    }

    public void A0I(C03330Hq r1, C05050Qf r2, C05050Qf r3, Object obj, Object obj2, Object obj3) {
        A01();
        super.A0I(r1, r2, r3, obj, obj2, obj3);
    }

    public void A0K(RenderTreeNode renderTreeNode) {
        A01();
        super.A0K(renderTreeNode);
    }

    public boolean A0L(C05050Qf r2, C05050Qf r3, Object obj, Object obj2) {
        A01();
        return super.A0L(r2, r3, obj, obj2);
    }
}
