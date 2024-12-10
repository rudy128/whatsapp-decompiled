package X;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager;

public class DFW implements C16890tO {
    /* JADX WARNING: type inference failed for: r3v5, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager, com.bloks.stdlib.components.bkcomponentscollection.BloksStaggeredGridLayoutManager] */
    public /* bridge */ /* synthetic */ Object BD3(Context context, Object obj, Object obj2, Object obj3) {
        LinearLayoutManager linearLayoutManager;
        LinearLayoutManager linearLayoutManager2;
        RecyclerView recyclerView = (RecyclerView) obj;
        C24781CKa cKa = ((BV5) obj2).A0C;
        if (cKa instanceof BVC) {
            BVC bvc = (BVC) cKa;
            ? staggeredGridLayoutManager = new StaggeredGridLayoutManager(bvc.A00, bvc.A00);
            staggeredGridLayoutManager.A00 = true;
            linearLayoutManager2 = staggeredGridLayoutManager;
        } else if (cKa instanceof BVE) {
            BVE bve = (BVE) cKa;
            C18070vi.A0d(context, 0);
            boolean z = bve.A00;
            int i = bve.A00;
            if (z) {
                linearLayoutManager = new StickyHeadersLinearLayoutManager(context, i);
            } else {
                linearLayoutManager = new LinearLayoutManager(context, i, false);
            }
            linearLayoutManager.A1e(bve.A01);
            linearLayoutManager2 = linearLayoutManager;
        } else {
            BVD bvd = (BVD) cKa;
            C18070vi.A0d(context, 0);
            linearLayoutManager2 = new GridLayoutManager(context, bvd.A00, bvd.A00, false);
        }
        recyclerView.setLayoutManager(linearLayoutManager2);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r2 != r1) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ boolean CMV(java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            r4 = this;
            X.BV5 r5 = (X.BV5) r5
            X.BV5 r6 = (X.BV5) r6
            X.CKa r2 = r5.A0C
            X.CKa r3 = r6.A0C
            boolean r0 = r2 instanceof X.BVC
            if (r0 == 0) goto L_0x0029
            X.BVC r2 = (X.BVC) r2
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            boolean r0 = r3 instanceof X.BVC
            if (r0 == 0) goto L_0x0025
            int r1 = r2.A00
            X.BVC r3 = (X.BVC) r3
            int r0 = r3.A00
            if (r1 != r0) goto L_0x0025
            int r2 = r2.A00
            int r1 = r3.A00
        L_0x0022:
            r0 = 1
            if (r2 == r1) goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            r0 = r0 ^ 1
            return r0
        L_0x0029:
            boolean r0 = r2 instanceof X.BVE
            if (r0 == 0) goto L_0x004a
            X.BVE r2 = (X.BVE) r2
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            boolean r0 = r3 instanceof X.BVE
            if (r0 == 0) goto L_0x0025
            int r1 = r2.A00
            X.BVE r3 = (X.BVE) r3
            int r0 = r3.A00
            if (r1 != r0) goto L_0x0025
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            if (r1 != r0) goto L_0x0025
            boolean r2 = r2.A00
            boolean r1 = r3.A00
            goto L_0x0022
        L_0x004a:
            X.BVD r2 = (X.BVD) r2
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            boolean r0 = r3 instanceof X.BVD
            if (r0 == 0) goto L_0x0025
            int r1 = r2.A00
            X.BVD r3 = (X.BVD) r3
            int r0 = r3.A00
            if (r1 != r0) goto L_0x0025
            int r2 = r2.A00
            int r1 = r3.A00
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DFW.CMV(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):boolean");
    }

    public /* bridge */ /* synthetic */ void CQ4(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ((RecyclerView) obj).setLayoutManager((C38251qy) null);
    }

    public /* synthetic */ String BQX() {
        return C25321CdS.A01(this);
    }

    public /* synthetic */ Class Bar() {
        return getClass();
    }
}
