package X;

import android.os.Build;
import android.view.View;

/* renamed from: X.0Bk  reason: invalid class name */
public final class AnonymousClass0Bk extends C25247Cbm implements Runnable, AnonymousClass1HE, View.OnAttachStateChangeListener {
    public AnonymousClass1HO A00;
    public boolean A01;
    public boolean A02;
    public final C04650Of A03;

    public void A01(C26000CqH cqH) {
        this.A01 = false;
    }

    public void A02(C25972Cpf cpf) {
        this.A01 = false;
        this.A02 = false;
        AnonymousClass1HO r6 = this.A00;
        if (!(cpf.A02() == 0 || r6 == null)) {
            C04650Of r0 = this.A03;
            r0.A04(r6);
            r0.A05(r6);
            r0.A03(r6);
        }
        this.A00 = null;
    }

    public void A03(C25972Cpf cpf) {
        this.A01 = true;
        this.A02 = true;
    }

    public void onViewDetachedFromWindow(View view) {
    }

    public AnonymousClass0Bk(C04650Of r2) {
        super(r2.A02 ^ true ? 1 : 0);
        this.A03 = r2;
    }

    public AnonymousClass1HO A00(AnonymousClass1HO r2) {
        C04650Of r0 = this.A03;
        r0.A03(r2);
        if (r0.A02) {
            return AnonymousClass1HO.A01;
        }
        return r2;
    }

    public AnonymousClass1HO BlX(View view, AnonymousClass1HO r5) {
        this.A00 = r5;
        C04650Of r2 = this.A03;
        r2.A05(r5);
        if (this.A01) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.A02) {
            r2.A04(r5);
            r2.A03(r5);
        }
        if (r2.A02) {
            return AnonymousClass1HO.A01;
        }
        return r5;
    }

    public void run() {
        if (this.A01) {
            this.A01 = false;
            this.A02 = false;
            AnonymousClass1HO r2 = this.A00;
            if (r2 != null) {
                C04650Of r1 = this.A03;
                r1.A04(r2);
                r1.A03(r2);
                this.A00 = null;
            }
        }
    }

    public void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }
}
