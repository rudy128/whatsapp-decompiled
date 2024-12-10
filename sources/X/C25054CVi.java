package X;

import java.util.List;

/* renamed from: X.CVi  reason: case insensitive filesystem */
public final /* synthetic */ class C25054CVi {
    public final /* synthetic */ C22890BUb A00;
    public final /* synthetic */ CPX A01;

    public final void A00(EDK edk) {
        CPX cpx = this.A01;
        C22890BUb bUb = this.A00;
        cpx.A01.put(edk.BTg(), edk);
        List list = bUb.A00;
        if (!list.contains(edk)) {
            list.add(edk);
        }
    }

    public /* synthetic */ C25054CVi(C22890BUb bUb, CPX cpx) {
        this.A01 = cpx;
        this.A00 = bUb;
    }
}
