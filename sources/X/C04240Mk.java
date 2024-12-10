package X;

import com.facebook.rendercore.RenderTreeNode;

/* renamed from: X.0Mk  reason: invalid class name and case insensitive filesystem */
public final class C04240Mk {
    public static final C04510Nr A06 = new Object();
    public final long A00;
    public final C001100p A01;
    public final AnonymousClass0IV A02;
    public final RenderTreeNode A03;
    public final RenderTreeNode[] A04;
    public final Object A05;

    public C04240Mk(AnonymousClass0IV r7, RenderTreeNode renderTreeNode, Object obj, RenderTreeNode[] renderTreeNodeArr, long j) {
        C18070vi.A0d(renderTreeNodeArr, 2);
        this.A03 = renderTreeNode;
        this.A04 = renderTreeNodeArr;
        this.A00 = j;
        this.A02 = r7;
        this.A05 = obj;
        int length = renderTreeNodeArr.length;
        this.A01 = new C001100p(length);
        for (int i = 0; i < length; i++) {
            C04510Nr.A01(this.A01, this, i);
            this.A01.A0A(this.A04[i].A07.A0C(), Integer.valueOf(i));
        }
    }
}
