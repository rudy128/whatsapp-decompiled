package X;

import android.content.Context;

/* renamed from: X.7JD  reason: invalid class name */
public class AnonymousClass7JD implements AnonymousClass8B0 {
    public final AnonymousClass737 A00;
    public final AnonymousClass1KW A01;

    public boolean BE6() {
        return true;
    }

    public AnonymousClass737[] BRD() {
        return new AnonymousClass737[]{this.A00};
    }

    public int BZ7() {
        return 0;
    }

    public boolean CFb() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass7JD) {
            return this.A00.equals(((AnonymousClass7JD) obj).A00);
        }
        return false;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass7JD(AnonymousClass737 r1, AnonymousClass1KW r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public C1409773u BHq(Context context, C18000vb r5, boolean z) {
        C17960vV.A00();
        return new AnonymousClass69M(context, this.A00, this.A01, z);
    }

    public String Ba8() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EmojiShapeCreator:");
        return C17890vO.A0V(this.A00, A10);
    }
}
