package X;

import com.facebook.android.exoplayer2.Timeline;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class D9Q implements E9e {
    public C26206Cue A00;
    public Timeline A01;
    public Object A02;
    public final C26154CtM A03 = new C26154CtM();
    public final ArrayList A04 = AnonymousClass8BT.A0z();

    public abstract void A05();

    public abstract void A06(C26206Cue cue, boolean z);

    public final void A04(Timeline timeline, Object obj) {
        this.A01 = timeline;
        this.A02 = obj;
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            ((C28493E3y) it.next()).C5z(timeline, this, obj);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r1 == r3) goto L_0x0007;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CCT(X.C26206Cue r3, X.C28493E3y r4, boolean r5) {
        /*
            r2 = this;
            X.Cue r1 = r2.A00
            if (r1 == 0) goto L_0x0007
            r0 = 0
            if (r1 != r3) goto L_0x0008
        L_0x0007:
            r0 = 1
        L_0x0008:
            X.C26056CrS.A02(r0)
            java.util.ArrayList r0 = r2.A04
            r0.add(r4)
            X.Cue r0 = r2.A00
            if (r0 != 0) goto L_0x001a
            r2.A00 = r3
            r2.A06(r3, r5)
        L_0x0019:
            return
        L_0x001a:
            com.facebook.android.exoplayer2.Timeline r1 = r2.A01
            if (r1 == 0) goto L_0x0019
            java.lang.Object r0 = r2.A02
            r4.C5z(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D9Q.CCT(X.Cue, X.E3y, boolean):void");
    }

    public final void CEM(C28493E3y e3y) {
        ArrayList arrayList = this.A04;
        arrayList.remove(e3y);
        if (arrayList.isEmpty()) {
            this.A00 = null;
            this.A01 = null;
            this.A02 = null;
            A05();
        }
    }

    public final void CEj(C22563BCy bCy) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A03.A02;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C24844CMn cMn = (C24844CMn) it.next();
            if (cMn.A01 == bCy) {
                copyOnWriteArrayList.remove(cMn);
            }
        }
    }
}
