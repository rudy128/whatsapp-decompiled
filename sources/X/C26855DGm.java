package X;

/* renamed from: X.DGm  reason: case insensitive filesystem */
public class C26855DGm implements C28561E7n {
    public final /* synthetic */ BUG A00;

    public void CKM(C26856DGn dGn) {
    }

    public C26855DGm(BUG bug) {
        this.A00 = bug;
    }

    public void C3B(C28560E7m e7m) {
        if (e7m.Bap() == C0O.A06) {
            C26849DGg dGg = (C26849DGg) e7m;
            BUG bug = this.A00;
            synchronized (bug) {
                if (bug.A05) {
                    bug.A01 = dGg.A00;
                }
            }
        }
    }
}
