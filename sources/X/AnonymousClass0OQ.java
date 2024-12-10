package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0OQ  reason: invalid class name */
public final class AnonymousClass0OQ {
    public C04250Ml A00;
    public boolean A01;
    public final ArrayList A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final int A07;
    public final long A08;
    public final boolean A09;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.0Ml, java.lang.Object] */
    public AnonymousClass0OQ(float f, float f2, float f3, float f4, int i, long j, boolean z) {
        this.A04 = f;
        this.A03 = f2;
        this.A06 = f3;
        this.A05 = f4;
        this.A08 = j;
        this.A07 = i;
        this.A09 = z;
        ArrayList A13 = AnonymousClass000.A13();
        this.A02 = A13;
        List list = AnonymousClass0GD.A00;
        ArrayList A132 = AnonymousClass000.A13();
        ? obj = new Object();
        obj.A07 = "";
        C04250Ml.A00(obj, list, A132);
        this.A00 = obj;
        A13.add(obj);
    }

    public static final AnonymousClass0AC A00(C04250Ml r11) {
        return new AnonymousClass0AC(r11.A07, r11.A09, r11.A08, r11.A02, r11.A00, r11.A01, r11.A03, r11.A04, r11.A05, r11.A06);
    }

    public static final void A01(AnonymousClass0OQ r0) {
        if (!(!r0.A01)) {
            throw AnonymousClass000.A0n("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
    }

    public final AnonymousClass0NK A02() {
        A01(this);
        while (this.A02.size() > 1) {
            A03();
        }
        float f = this.A04;
        float f2 = this.A03;
        float f3 = this.A06;
        float f4 = this.A05;
        AnonymousClass0NK r2 = new AnonymousClass0NK(A00(this.A00), f, f2, f3, f4, this.A07, this.A08, this.A09);
        this.A01 = true;
        return r2;
    }

    public final void A03() {
        A01(this);
        ArrayList arrayList = this.A02;
        ((C04250Ml) arrayList.get(AnonymousClass000.A0Q(arrayList))).A08.add(A00((C04250Ml) arrayList.remove(AnonymousClass000.A0Q(arrayList))));
    }
}
