package X;

import com.whatsapp.calling.callgrid.view.CallGrid;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7AC  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7AC implements AnonymousClass1GC {
    public final /* synthetic */ CallGrid A00;

    public final void C6U(C27581Wq r8, AnonymousClass1F9 r9) {
        CallGrid callGrid = this.A00;
        if (r8 == C27581Wq.ON_START) {
            int i = AnonymousClass3Ma.A09(callGrid).widthPixels;
            AnonymousClass6bT r5 = callGrid.A0m;
            C27201Vd r6 = callGrid.A0L;
            C37451pZ A08 = r6.A08("call-grid", 0.0f, i / 2);
            Map map = r5.A00;
            C17880vN.A1O(A08, map, 0);
            C17880vN.A1O(r6.A06(callGrid.getContext(), "voip-call-control-bottom-sheet"), map, 1);
            if (C72463Mc.A1Z(callGrid.A0R)) {
                C17880vN.A1O(r6.A08("call-grid-new-call-controls-1-to-1", 0.0f, callGrid.getResources().getDimensionPixelSize(2131165708)), map, 3);
            }
            C112285lE r3 = callGrid.A06;
            r3.A02 = r5;
            C116095wO r2 = callGrid.A08;
            r2.A02 = r5;
            C108525bq r0 = callGrid.A0p;
            r3.A03 = r0;
            r2.A03 = r0;
            C24671Lf r1 = callGrid.A0J;
            r1.registerObserver(r3.A07);
            r1.registerObserver(r2.A07);
            r1.registerObserver(callGrid.A0q);
            callGrid.A0l.A0t(callGrid.A0j);
            callGrid.A0k.A0t(callGrid.A0i);
        } else if (r8 == C27581Wq.ON_STOP) {
            if (callGrid.A0W) {
                CallGrid.A0A(callGrid, AnonymousClass000.A13(), false);
                CallGrid.A0A(callGrid, AnonymousClass000.A13(), true);
            }
            AnonymousClass6bT r02 = callGrid.A0m;
            if (r02 != null) {
                Map map2 = r02.A00;
                Iterator A0l = C17890vO.A0l(map2);
                while (A0l.hasNext()) {
                    ((C37451pZ) A0l.next()).A02();
                }
                map2.clear();
            }
            C24771Lp r12 = callGrid.A03;
            synchronized (r12.A01) {
                if (r12.A0A != null) {
                    r12.A0A.A0C(0);
                }
            }
            C24671Lf r13 = callGrid.A0J;
            C112285lE r32 = callGrid.A06;
            r13.unregisterObserver(r32.A07);
            C116095wO r22 = callGrid.A08;
            r13.unregisterObserver(r22.A07);
            r13.unregisterObserver(callGrid.A0q);
            callGrid.A0l.A0u(callGrid.A0j);
            callGrid.A0k.A0u(callGrid.A0i);
            r32.A03 = null;
            r22.A03 = null;
            callGrid.A0H.A04();
            C37451pZ r03 = callGrid.A0K;
            if (r03 != null) {
                r03.A02();
            }
        }
    }

    public /* synthetic */ AnonymousClass7AC(CallGrid callGrid) {
        this.A00 = callGrid;
    }
}
