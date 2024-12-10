package X;

import java.util.Map;

public final class AM3 implements BAC {
    public final /* synthetic */ A45 A00;
    public final /* synthetic */ C21148AfJ A01;

    public AM3(A45 a45, C21148AfJ afJ) {
        this.A01 = afJ;
        this.A00 = a45;
    }

    public void Bts(Map map) {
        C21148AfJ afJ = this.A01;
        afJ.A00.A0J(new C21456AkN(afJ, this.A00, map, "error", 48));
    }

    public void onSuccess() {
        C21148AfJ afJ = this.A01;
        afJ.A00.A0J(new C21456AkN(afJ, this.A00, AnonymousClass1D7.A0I(), "success", 48));
    }
}
