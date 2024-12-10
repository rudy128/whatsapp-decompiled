package X;

import com.whatsapp.companionmode.registration.CompanionBootstrapActivity;

/* renamed from: X.7KO  reason: invalid class name */
public class AnonymousClass7KO implements C23691Hg {
    public final int A00;
    public final int A01;

    public AnonymousClass7KO(int i, int i2) {
        this.A00 = i2;
        this.A01 = i;
    }

    public final void CGE(Object obj) {
        switch (this.A00) {
            case 0:
                for (AnonymousClass8A4 BsT : ((AnonymousClass6h1) obj).A03) {
                    BsT.BsT();
                }
                return;
            case 1:
                int i = this.A01;
                CompanionBootstrapActivity companionBootstrapActivity = ((C125746bc) obj).A00;
                companionBootstrapActivity.runOnUiThread(new AnonymousClass7RP(companionBootstrapActivity, i, 39));
                return;
            case 2:
                C108965cb.A0R(obj).Bs1(this.A01);
                return;
            default:
                int i2 = this.A01;
                C34921lI r5 = (C34921lI) obj;
                C18070vi.A0d(r5, 1);
                if (r5.A00.A0N()) {
                    if (!C18020vd.A05(C18040vf.A02, r5.A03.A00, 9171)) {
                        return;
                    }
                    if (i2 == 2) {
                        r5.A03();
                        return;
                    } else if (i2 != 3) {
                        r5.A02();
                        return;
                    } else {
                        r5.A01();
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
