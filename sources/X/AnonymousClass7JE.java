package X;

import android.content.Context;

/* renamed from: X.7JE  reason: invalid class name */
public class AnonymousClass7JE implements AnonymousClass8B0 {
    public final C1418377d A00;
    public final C26631Sw A01;

    public boolean BE6() {
        return true;
    }

    public boolean CFb() {
        return true;
    }

    public AnonymousClass737[] BRD() {
        AnonymousClass737[] r0;
        AnonymousClass73B r02 = this.A00.A04;
        if (r02 == null || (r0 = r02.A0H) == null) {
            return AnonymousClass8B0.A00;
        }
        return r0;
    }

    public int BZ7() {
        return C72453Mb.A03(this.A00.A0N ? 1 : 0);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass7JE)) {
            return false;
        }
        String str = ((AnonymousClass7JE) obj).A00.A0F;
        C17960vV.A07(str);
        return str.equals(this.A00.A0F);
    }

    public int hashCode() {
        String str = this.A00.A0F;
        C17960vV.A07(str);
        return str.hashCode();
    }

    public AnonymousClass7JE(C1418377d r1, C26631Sw r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public C1409773u BHq(Context context, C18000vb r6, boolean z) {
        int i = 2131166577;
        if (z) {
            i = 2131166576;
        }
        C17960vV.A00();
        return new AnonymousClass69N(context, this.A00, this.A01, AnonymousClass3MZ.A01(context, i));
    }

    public String Ba8() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StickerShapeCreator:");
        String str = this.A00.A0F;
        C17960vV.A07(str);
        return AnonymousClass000.A0y(str, A10);
    }
}
