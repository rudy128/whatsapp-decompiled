package X;

import android.graphics.Bitmap;

/* renamed from: X.7HW  reason: invalid class name */
public final class AnonymousClass7HW implements AnonymousClass891 {
    public final /* synthetic */ AnonymousClass8B2 A00;
    public final /* synthetic */ AnonymousClass65B A01;
    public final /* synthetic */ C113295mr A02;
    public final /* synthetic */ C112325lI A03;

    public AnonymousClass7HW(AnonymousClass8B2 r1, AnonymousClass65B r2, C113295mr r3, C112325lI r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
    }

    public String Ba8() {
        return AnonymousClass000.A0y("-gallery_thumb", C17890vO.A0f(this.A00.BLl()));
    }

    public Bitmap BhZ() {
        if (this.A01.getTag() != this) {
            return null;
        }
        C113295mr r2 = this.A02;
        int i = r2.A05;
        if (i == -1) {
            i = r2.A04;
        }
        if (i == -1) {
            return null;
        }
        Bitmap CP6 = this.A00.CP6(this.A03.A03.A04);
        if (CP6 == null) {
            return AnonymousClass6YZ.A00;
        }
        return CP6;
    }
}
