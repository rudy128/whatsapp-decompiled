package X;

import com.google.android.gms.common.internal.IAccountAccessor;

/* renamed from: X.DIu  reason: case insensitive filesystem */
public class C26913DIu implements E5F {
    public final /* synthetic */ C26157CtR A00;

    public C26913DIu(C26157CtR ctR) {
        this.A00 = ctR;
    }

    public final void C3H(C23203Bcx bcx) {
        if (bcx.A01 == 0) {
            C26157CtR ctR = this.A00;
            ctR.BY1((IAccountAccessor) null, ((C23023BZz) ctR).A01);
            return;
        }
        C28446E1m e1m = this.A00.A0I;
        if (e1m != null) {
            ((C26912DIt) e1m).A00.onConnectionFailed(bcx);
        }
    }
}
