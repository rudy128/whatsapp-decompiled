package X;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;

public class BVF extends C22707BLr {
    public DFL A00;
    public final Handler A01 = new C22618BFz(Looper.getMainLooper(), this, 0);
    public final DOZ A02;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BVF(X.DOZ r4, X.DFL r5, int r6) {
        /*
            r3 = this;
            X.CIq r2 = new X.CIq
            r2.<init>(r6)
            r1 = 2131428179(0x7f0b0353, float:1.8477995E38)
            android.util.SparseArray r0 = r4.A01
            r0.get(r1)
            r3.<init>(r2)
            r3.A02 = r4
            r3.A00 = r5
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1 = 0
            X.BFz r0 = new X.BFz
            r0.<init>(r2, r3, r1)
            r3.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BVF.<init>(X.DOZ, X.DFL, int):void");
    }

    public /* bridge */ /* synthetic */ void A0L(C42011xT r4) {
        E8A A0A;
        DFL A0P = BE7.A0P(((DFE) ((BMJ) r4).A00).A01);
        if (A0P != null && A0P.A05 == 13366 && (A0A = A0P.A0A(40)) != null) {
            C25995CqB.A00();
            C108955ca.A1F(this.A01, A0A, 0);
        }
    }

    public /* bridge */ /* synthetic */ void A0N(C42011xT r4) {
        E8A A0A;
        DFL A0P = BE7.A0P(((DFE) ((BMJ) r4).A00).A01);
        if (A0P != null && A0P.A05 == 13366 && (A0A = A0P.A0A(38)) != null) {
            C25995CqB.A00();
            C108955ca.A1F(this.A01, A0A, 0);
        }
    }

    public /* bridge */ /* synthetic */ void A0R(C42011xT r3) {
        BMJ bmj = (BMJ) r3;
        ((C17790vE) bmj.A0H).setRenderTree((C04240Mk) null);
        bmj.A00 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01a9, code lost:
        if (r4 != null) goto L_0x01ab;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void Bmc(X.C42011xT r18, int r19) {
        /*
            r17 = this;
            r7 = r18
            X.BMJ r7 = (X.BMJ) r7
            r5 = r17
            androidx.recyclerview.widget.RecyclerView r0 = r5.A02
            r6 = r19
            if (r0 == 0) goto L_0x00cc
            X.1qy r16 = r0.getLayoutManager()
            r4 = 0
            if (r16 == 0) goto L_0x00cc
            X.CIq r2 = r5.A04
            int r1 = r5.A01
            r0 = -1
            if (r1 == r0) goto L_0x00bb
            java.util.List r0 = r5.A03
            java.lang.Object r0 = r0.get(r6)
            X.DFE r0 = (X.DFE) r0
            X.DFL r3 = r0.A01
            int r8 = r5.A01
            int r9 = r5.A00
            int r11 = r2.A00
            r1 = -1
            r0 = -2
            r10 = 1
            r2 = 0
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            if (r11 != r10) goto L_0x0056
            r4.<init>(r1, r0)
        L_0x0035:
            X.DFL r0 = X.BE7.A0P(r3)
            if (r0 == 0) goto L_0x00b6
            X.DFL r0 = X.BE7.A0P(r3)
            int r1 = r0.A05
            r0 = 13366(0x3436, float:1.873E-41)
            if (r1 != r0) goto L_0x00b6
            X.DFL r15 = X.BE7.A0P(r3)
            java.lang.String r12 = X.BE7.A0h(r15)
            r13 = 4636737291354636288(0x4059000000000000, double:100.0)
            java.lang.String r3 = "CollectionBinderUtils"
            if (r11 != 0) goto L_0x0084
            if (r12 == 0) goto L_0x0084
            goto L_0x005a
        L_0x0056:
            r4.<init>(r0, r1)
            goto L_0x0035
        L_0x005a:
            X.Cjs r1 = X.A90.A0A(r12)     // Catch:{ 9HX -> 0x0077 }
            java.lang.Integer r0 = r1.A01     // Catch:{ 9HX -> 0x0077 }
            int r0 = r0.intValue()     // Catch:{ 9HX -> 0x0077 }
            if (r0 == r2) goto L_0x0069
            if (r0 != r10) goto L_0x0084
            goto L_0x006d
        L_0x0069:
            float r0 = r1.A00     // Catch:{ 9HX -> 0x0077 }
            int r8 = (int) r0     // Catch:{ 9HX -> 0x0077 }
            goto L_0x0074
        L_0x006d:
            float r1 = r1.A00     // Catch:{ 9HX -> 0x0077 }
            float r0 = (float) r8     // Catch:{ 9HX -> 0x0077 }
            float r1 = r1 * r0
            double r0 = (double) r1     // Catch:{ 9HX -> 0x0077 }
            double r0 = r0 / r13
            int r8 = (int) r0     // Catch:{ 9HX -> 0x0077 }
        L_0x0074:
            r4.width = r8     // Catch:{ 9HX -> 0x0077 }
            goto L_0x0084
        L_0x0077:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Error parsing style width: "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r12, r1)
            X.C25913CoX.A01(r3, r0)
        L_0x0084:
            java.lang.String r8 = X.BE7.A0d(r15)
            if (r11 != r10) goto L_0x00b6
            if (r8 == 0) goto L_0x00b6
            X.Cjs r1 = X.A90.A0A(r8)     // Catch:{ 9HX -> 0x00a9 }
            java.lang.Integer r0 = r1.A01     // Catch:{ 9HX -> 0x00a9 }
            int r0 = r0.intValue()     // Catch:{ 9HX -> 0x00a9 }
            if (r0 == r2) goto L_0x009b
            if (r0 != r10) goto L_0x00b6
            goto L_0x009f
        L_0x009b:
            float r0 = r1.A00     // Catch:{ 9HX -> 0x00a9 }
            int r0 = (int) r0     // Catch:{ 9HX -> 0x00a9 }
            goto L_0x00a6
        L_0x009f:
            float r1 = r1.A00     // Catch:{ 9HX -> 0x00a9 }
            float r0 = (float) r9     // Catch:{ 9HX -> 0x00a9 }
            float r1 = r1 * r0
            double r1 = (double) r1     // Catch:{ 9HX -> 0x00a9 }
            double r1 = r1 / r13
            int r0 = (int) r1     // Catch:{ 9HX -> 0x00a9 }
        L_0x00a6:
            r4.height = r0     // Catch:{ 9HX -> 0x00a9 }
            goto L_0x00b6
        L_0x00a9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Error parsing style height: "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r8, r1)
            X.C25913CoX.A01(r3, r0)
        L_0x00b6:
            android.view.View r0 = r7.A0H
            r0.setLayoutParams(r4)
        L_0x00bb:
            java.util.List r0 = X.C42011xT.A0I
            boolean r0 = r7.A01
            if (r0 == 0) goto L_0x01a9
            if (r4 != 0) goto L_0x01ab
            android.view.View r1 = r7.A0H
            X.1rN r0 = r16.A0w()
            r1.setLayoutParams(r0)
        L_0x00cc:
            r1 = 0
        L_0x00cd:
            java.util.List r0 = X.C42011xT.A0I
            r7.A01 = r1
            java.util.List r0 = r5.A03
            java.lang.Object r0 = r0.get(r6)
            X.0sP r0 = (X.AnonymousClass0sP) r0
            X.DFE r0 = (X.DFE) r0
            X.0CC r0 = r0.A00
            android.view.View r1 = r7.A0H
            X.0vE r1 = (X.C17790vE) r1
            java.lang.Object r0 = r0.A00()
            X.0Mi r0 = (X.C04220Mi) r0
            X.0Mk r0 = r0.A01
            r1.setRenderTree(r0)
            java.util.List r0 = r5.A03
            java.lang.Object r0 = r0.get(r6)
            r7.A00 = r0
            boolean r0 = X.AnonymousClass0GL.A00
            if (r0 != 0) goto L_0x013d
            java.util.List r0 = r5.A03
            java.lang.Object r0 = r0.get(r6)
            X.0sP r0 = (X.AnonymousClass0sP) r0
            X.DFE r0 = (X.DFE) r0
            X.0CC r0 = r0.A00
            X.0Mi r0 = r0.A02()
            r4 = 0
            java.lang.String r3 = "BloksCollection"
            if (r0 != 0) goto L_0x013e
            java.lang.String r7 = "RenderResult is null after Binding item in the collection"
        L_0x010f:
            X.DOZ r6 = r5.A02
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            java.lang.String r5 = "["
            r0.append(r5)
            r0.append(r3)
            java.lang.String r2 = "] "
            java.lang.String r0 = X.AnonymousClass000.A0y(r2, r0)
            java.lang.String r1 = "Whatsapp"
            android.util.Log.e(r1, r0, r4)
            java.lang.StringBuilder r0 = X.C17900vP.A0H(r5, r3, r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r1, r0, r4)
            X.DFF r0 = X.C25913CoX.A00
            if (r0 == 0) goto L_0x013d
            X.DFF r1 = X.C25913CoX.A00
            r0 = 1
            X.DFF.A00(r6, r1, r7, r4, r0)
        L_0x013d:
            return
        L_0x013e:
            X.0Mk r7 = r0.A01
            X.DFL r6 = r5.A00
            int r0 = X.C24518C7m.A00(r6)
            if (r0 != 0) goto L_0x0177
            com.facebook.rendercore.RenderTreeNode r0 = r7.A03
            android.graphics.Rect r2 = r0.A03
            int r1 = r2.width()
            int r0 = r5.A01
            int r0 = r0 * 3
            if (r1 <= r0) goto L_0x0177
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Item in the collection is too wide item width: "
            r1.append(r0)
            int r0 = r2.width()
            r1.append(r0)
            java.lang.String r0 = " collection width: "
            r1.append(r0)
            int r0 = r5.A01
            r1.append(r0)
            java.lang.String r0 = " This will lead to OOMs and poor performance. Use Flipper's UI Debugger to debug.See https://www.internalfb.com/intern/staticdocs/bloks/docs/bloks_standard_library/components/collection_v2#performance-considerations"
        L_0x0172:
            java.lang.String r7 = X.AnonymousClass000.A0y(r0, r1)
            goto L_0x010f
        L_0x0177:
            int r1 = X.C24518C7m.A00(r6)
            r0 = 1
            if (r1 != r0) goto L_0x013d
            com.facebook.rendercore.RenderTreeNode r0 = r7.A03
            android.graphics.Rect r2 = r0.A03
            int r1 = r2.height()
            int r0 = r5.A00
            int r0 = r0 * 3
            if (r1 <= r0) goto L_0x013d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Item in the collection is too high item height: "
            r1.append(r0)
            int r0 = r2.height()
            r1.append(r0)
            java.lang.String r0 = " collection height: "
            r1.append(r0)
            int r0 = r5.A00
            r1.append(r0)
            java.lang.String r0 = " This will lead to OOMs and poor performance. Use Flipper's UI Debugger to debug.See https://www.internalfb.com/intern/staticdocs/bloks/docs/bloks_standard_library/components/collection_v2#performance-considerations."
            goto L_0x0172
        L_0x01a9:
            if (r4 == 0) goto L_0x00cc
        L_0x01ab:
            r1 = 1
            goto L_0x00cd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BVF.Bmc(X.1xT, int):void");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.BMJ, X.1xT] */
    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        ? r1 = new C42011xT(new BV3(viewGroup.getContext()));
        r1.A01 = false;
        return r1;
    }
}
