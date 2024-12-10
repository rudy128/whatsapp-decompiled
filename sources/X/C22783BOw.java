package X;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.BOw  reason: case insensitive filesystem */
public abstract class C22783BOw extends D9Q {
    public Handler A00;
    public C26206Cue A01;
    public final HashMap A02 = C17880vN.A11();

    public void A05() {
        HashMap hashMap = this.A02;
        Iterator A0j = C17890vO.A0j(hashMap);
        while (A0j.hasNext()) {
            CPB cpb = (CPB) A0j.next();
            E9e e9e = cpb.A01;
            e9e.CEM(cpb.A00);
            e9e.CEj(cpb.A02);
        }
        hashMap.clear();
        this.A01 = null;
    }

    public void A06(C26206Cue cue, boolean z) {
        this.A01 = cue;
        this.A00 = new Handler();
    }

    public final void A07(E9e e9e, Object obj) {
        HashMap hashMap = this.A02;
        C26056CrS.A02(!hashMap.containsKey(obj));
        D9P d9p = new D9P(this, obj);
        D9S d9s = new D9S(this, obj);
        hashMap.put(obj, new CPB(d9p, e9e, d9s));
        Handler handler = this.A00;
        C26154CtM ctM = ((D9Q) e9e).A03;
        C26056CrS.A02(AnonymousClass000.A1W(handler));
        ctM.A02.add(new C24844CMn(handler, d9s));
        e9e.CCT(this.A01, d9p, false);
    }

    public void BjW() {
        Iterator A0j = C17890vO.A0j(this.A02);
        while (A0j.hasNext()) {
            ((CPB) A0j.next()).A01.BjW();
        }
    }
}
