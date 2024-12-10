package X;

import android.graphics.LinearGradient;
import android.graphics.Shader;

/* renamed from: X.BTm  reason: case insensitive filesystem */
public final class C22875BTm extends C3J implements C28504E4m {
    public final long A00;
    public final long A01;
    public final Shader.TileMode A02;
    public final BTK A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C22875BTm) {
                C22875BTm bTm = (C22875BTm) obj;
                if (C18070vi.A18(this.A03, bTm.A03)) {
                    long j = this.A01;
                    long j2 = bTm.A01;
                    C24563C9j c9j = C24563C9j.$redex_init_class;
                    if (!(j == j2 && this.A00 == bTm.A00)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public Shader CPS() {
        long j = this.A01;
        C24563C9j c9j = C24563C9j.$redex_init_class;
        float A032 = AnonymousClass000.A03(j);
        float A012 = AnonymousClass001.A01(j);
        long j2 = this.A00;
        float A033 = AnonymousClass000.A03(j2);
        float A013 = AnonymousClass001.A01(j2);
        BTK btk = this.A03;
        return new LinearGradient(A032, A012, A033, A013, btk.A01, btk.A00, this.A02);
    }

    public int hashCode() {
        int A0L = AnonymousClass000.A0L(this.A03);
        long j = this.A01;
        C24563C9j c9j = C24563C9j.$redex_init_class;
        return AnonymousClass000.A0O(this.A02, AnonymousClass001.A0K(this.A00, AnonymousClass001.A0K(j, A0L)));
    }

    public C22875BTm(Shader.TileMode tileMode, BTK btk, long j, long j2) {
        this.A03 = btk;
        this.A01 = j;
        this.A00 = j2;
        this.A02 = tileMode;
    }
}
