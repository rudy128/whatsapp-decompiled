package X;

import com.whatsapp.HomeActivity;

/* renamed from: X.Alk  reason: case insensitive filesystem */
public class C21537Alk implements C18080vj, C36001nB {
    public final int A00;
    public final Object A01;

    public C21537Alk(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.A00) {
            case 0:
                return ((HomeActivity) this.A01).A4n((String) obj, AnonymousClass000.A0M(obj2), AnonymousClass000.A1Y(obj3));
            case 1:
                AP5 ap5 = (AP5) this.A01;
                int intValue = ((Number) obj).intValue();
                int intValue2 = ((Number) obj2).intValue();
                float floatValue = ((Number) obj3).floatValue();
                C188769hx r1 = ap5.A09;
                C187639g8 r0 = r1.A06;
                if (r0 == null) {
                    return null;
                }
                r0.A02 = intValue2;
                r0.A04 = intValue;
                r0.A00 = floatValue;
                r1.A03 = 14;
                ap5.A0B();
                return null;
            default:
                return ((AnonymousClass4aY) this.A01).A2J((String) obj, AnonymousClass000.A0M(obj2), AnonymousClass000.A1Y(obj3));
        }
    }
}
