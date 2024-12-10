package X;

import android.os.ConditionVariable;

/* renamed from: X.DGo  reason: case insensitive filesystem */
public class C26857DGo implements E53 {
    public final int A00;
    public final Object A01;

    public C26857DGo(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BJu() {
        if (this.A00 != 0) {
            BUG bug = (BUG) this.A01;
            synchronized (bug) {
                BUG.A00(bug, true, (Boolean) null);
            }
            return;
        }
        C26779DDj dDj = ((DDv) this.A01).A0K;
        if (dDj != null && !dDj.A02) {
            C26359CyL cyL = dDj.A04;
            cyL.A0G = true;
            cyL.A08.post(cyL.A09);
            if (cyL.A05) {
                ConditionVariable conditionVariable = cyL.A07;
                conditionVariable.block();
                conditionVariable.close();
            }
            DE4 de4 = dDj.A00;
            if (de4 != null) {
                DDn dDn = dDj.A01;
                dDn.A01(dDn.A01, de4);
            }
            dDj.A02 = true;
            dDj.A03 = false;
        }
    }
}
