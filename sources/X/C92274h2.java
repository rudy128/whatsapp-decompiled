package X;

import android.view.View;

/* renamed from: X.4h2  reason: invalid class name and case insensitive filesystem */
public final class C92274h2 implements C108745cE, E8B {
    public final AnonymousClass4ZN A00;
    public final boolean A01;
    public final int A02;
    public final View.OnClickListener A03;
    public final AnonymousClass4ZN A04;
    public final AnonymousClass4ZN A05;

    public C92274h2(View.OnClickListener onClickListener, AnonymousClass4ZN r3, AnonymousClass4ZN r4, boolean z) {
        C18070vi.A0d(r3, 1);
        this.A00 = r3;
        this.A05 = r4;
        this.A03 = onClickListener;
        this.A01 = z;
        this.A04 = r3;
        this.A02 = z ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C92274h2) {
                C92274h2 r5 = (C92274h2) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A03, r5.A03) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass4ZN BMJ() {
        return this.A04;
    }

    public AnonymousClass4ZN BMQ() {
        return this.A05;
    }

    public View.OnClickListener BO5() {
        return this.A03;
    }

    public /* bridge */ /* synthetic */ Long BQw() {
        return null;
    }

    public /* bridge */ /* synthetic */ C107345Zi BSd() {
        return null;
    }

    public int BXa() {
        return this.A02;
    }

    public AnonymousClass4ZN BaT() {
        return this.A00;
    }

    public int hashCode() {
        return C17880vN.A01((((AnonymousClass000.A0L(this.A00) + AnonymousClass001.A0k(this.A05)) * 31) + C17880vN.A02(this.A03)) * 31, this.A01);
    }

    public boolean isPersistent() {
        return this.A01;
    }

    public Integer BUN() {
        return 2131165443;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CameraArEffectsBannerViewState(title=");
        A10.append(this.A00);
        A10.append(", action=");
        A10.append(this.A05);
        A10.append(", callback=");
        A10.append(this.A03);
        A10.append(", isPersistent=");
        return C17900vP.A0F(A10, this.A01);
    }
}
