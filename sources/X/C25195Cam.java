package X;

import android.os.IBinder;

/* renamed from: X.Cam  reason: case insensitive filesystem */
public final class C25195Cam {
    public final C25149Ca0 A00;
    public final C25149Ca0 A01;
    public final C25773Clk A02;
    public final IBinder A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25195Cam) {
                C25195Cam cam = (C25195Cam) obj;
                if (!C18070vi.A18(this.A00, cam.A00) || !C18070vi.A18(this.A01, cam.A01) || !C18070vi.A18(this.A02, cam.A02) || !C18070vi.A18(this.A03, cam.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A03, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0N(this.A01, AnonymousClass000.A0L(this.A00))));
    }

    public C25195Cam(IBinder iBinder, C25149Ca0 ca0, C25149Ca0 ca02, C25773Clk clk) {
        this.A00 = ca0;
        this.A01 = ca02;
        this.A02 = clk;
        this.A03 = iBinder;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        StringBuilder A0y = AnonymousClass8BT.A0y("SplitInfo:{", A10);
        A0y.append("primaryActivityStack=");
        A0y.append(this.A00);
        C108985cd.A1L(", ", A0y, A10);
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("secondaryActivityStack=");
        A102.append(this.A01);
        C108985cd.A1L(", ", A102, A10);
        StringBuilder A103 = AnonymousClass000.A10();
        A103.append("splitAttributes=");
        A103.append(this.A02);
        C108985cd.A1L(", ", A103, A10);
        StringBuilder A104 = AnonymousClass000.A10();
        A104.append("token=");
        String A0n = BEA.A0n(C17890vO.A0V(this.A03, A104), A10);
        C18070vi.A0X(A0n);
        return A0n;
    }
}
