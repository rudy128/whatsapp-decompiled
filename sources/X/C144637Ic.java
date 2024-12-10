package X;

/* renamed from: X.7Ic  reason: invalid class name and case insensitive filesystem */
public class C144637Ic implements AnonymousClass8AP {
    public float A00;
    public final C133896pg A01;

    public /* bridge */ /* synthetic */ boolean BFJ(Object obj) {
        String str = ((C133896pg) obj).A02;
        C17960vV.A07(str);
        return str.equals(this.A01.A02);
    }

    public long BMZ() {
        return this.A01.A00;
    }

    public C144637Ic(C133896pg r1, float f) {
        this.A00 = f;
        this.A01 = r1;
    }

    public /* bridge */ /* synthetic */ Object BSD() {
        return this.A01;
    }

    public float Bbo() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WeightedRecentStickerIdentifier{stickerIdentifier=");
        A10.append(this.A01);
        A10.append(", weight=");
        A10.append(this.A00);
        return C17890vO.A0b(A10);
    }

    public void CLT(float f) {
        this.A00 = f;
    }
}
