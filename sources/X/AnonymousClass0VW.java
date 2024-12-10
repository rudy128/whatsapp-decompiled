package X;

/* renamed from: X.0VW  reason: invalid class name */
public class AnonymousClass0VW implements C16280s0 {
    public final int A00;
    public final Object A01;

    public AnonymousClass0VW(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void dispose() {
        switch (this.A00) {
            case 0:
                ((AnonymousClass0Q5) this.A01).A04();
                return;
            case 1:
                ((C04360Mw) this.A01).A01 = null;
                return;
            case 2:
                AnonymousClass0XM r2 = (AnonymousClass0XM) this.A01;
                int BT8 = r2.A01.BT8();
                for (int i = 0; i < BT8; i++) {
                    r2.release();
                }
                return;
            case 3:
                ((C05120Qm) this.A01).A0H();
                return;
            default:
                ((AnonymousClass0W1) this.A01).A00();
                return;
        }
    }
}
