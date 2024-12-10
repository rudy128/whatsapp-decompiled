package X;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: X.Cbm  reason: case insensitive filesystem */
public abstract class C25247Cbm {
    public WindowInsets A00;
    public final int A01;

    public AnonymousClass1HO A00(AnonymousClass1HO r2) {
        C18070vi.A0d(r2, 0);
        return r2;
    }

    public void A01(C26000CqH cqH) {
    }

    public void A02(C25972Cpf cpf) {
        View view;
        C22671BJm bJm = (C22671BJm) this;
        if (bJm.A02 && (cpf.A00.A06() & 8) != 0) {
            bJm.A02 = false;
            AnonymousClass1HO r1 = bJm.A01;
            if (r1 != null && (view = bJm.A00) != null) {
                AnonymousClass1HF.A0E(view, r1);
            }
        }
    }

    public void A03(C25972Cpf cpf) {
        if (this instanceof C22671BJm) {
            C22671BJm bJm = (C22671BJm) this;
            if ((cpf.A00.A06() & 8) != 0) {
                bJm.A02 = true;
            }
        }
    }

    public C25247Cbm(int i) {
        this.A01 = i;
    }
}
