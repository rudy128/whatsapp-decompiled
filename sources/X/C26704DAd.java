package X;

/* renamed from: X.DAd  reason: case insensitive filesystem */
public class C26704DAd implements C28574E8g {
    public final int A00;
    public final Object A01;

    public C26704DAd(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public CCU BS8() {
        C18100vl r0;
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                r0 = ((CX1) obj).A02;
                break;
            case 1:
                r0 = ((AnonymousClass4RN) obj).A07;
                break;
            default:
                r0 = ((CX2) obj).A03;
                break;
        }
        return (CCU) r0.getValue();
    }

    public C28656ECq BV5() {
        C18100vl r0;
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                r0 = ((CX1) obj).A03;
                break;
            case 1:
                r0 = ((AnonymousClass4RN) obj).A08;
                break;
            default:
                r0 = ((CX2) obj).A04;
                break;
        }
        return (C28656ECq) r0.getValue();
    }

    public CQP Bbi() {
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                return ((CX1) obj).A00;
            case 1:
                return (CQP) C18070vi.A0E(((AnonymousClass4RN) obj).A04);
            default:
                return ((CX2) obj).A00;
        }
    }
}
