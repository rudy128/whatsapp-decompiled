package X;

import android.widget.ImageView;

/* renamed from: X.6si  reason: invalid class name and case insensitive filesystem */
public final class C135756si {
    public final ImageView A00;
    public final C134326qP A01;
    public final C1409773u A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135756si) {
                C135756si r5 = (C135756si) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0N(this.A01, AnonymousClass000.A0N(this.A00, AnonymousClass000.A0L(this.A02))), this.A03);
    }

    public C135756si(ImageView imageView, C134326qP r2, C1409773u r3, boolean z) {
        this.A02 = r3;
        this.A00 = imageView;
        this.A01 = r2;
        this.A03 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ShapeLoadingTask(shape=");
        A10.append(this.A02);
        A10.append(", imageView=");
        A10.append(this.A00);
        A10.append(", tag=");
        A10.append(this.A01);
        A10.append(", shouldBeScaledUp=");
        return C17900vP.A0F(A10, this.A03);
    }
}
