package X;

import android.graphics.RadialGradient;
import android.graphics.Shader;

/* renamed from: X.BTn  reason: case insensitive filesystem */
public final class C22876BTn extends C3J implements C28504E4m {
    public final float A00;
    public final long A01;
    public final Shader.TileMode A02;
    public final BTK A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C22876BTn) {
                C22876BTn bTn = (C22876BTn) obj;
                if (C18070vi.A18(this.A03, bTn.A03)) {
                    long j = this.A01;
                    long j2 = bTn.A01;
                    C24563C9j c9j = C24563C9j.$redex_init_class;
                    if (!(j == j2 && Float.compare(this.A00, bTn.A00) == 0)) {
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
        float A022 = AnonymousClass001.A02(j);
        float A012 = AnonymousClass001.A01(j);
        float f = this.A00;
        BTK btk = this.A03;
        return new RadialGradient(A022, A012, f, btk.A01, btk.A00, this.A02);
    }

    public int hashCode() {
        int A0L = AnonymousClass000.A0L(this.A03);
        long j = this.A01;
        C24563C9j c9j = C24563C9j.$redex_init_class;
        return AnonymousClass000.A0O(this.A02, AnonymousClass000.A0B(AnonymousClass001.A0K(j, A0L), this.A00));
    }

    public C22876BTn(Shader.TileMode tileMode, BTK btk, float f, long j) {
        this.A03 = btk;
        this.A01 = j;
        this.A00 = f;
        this.A02 = tileMode;
    }
}
