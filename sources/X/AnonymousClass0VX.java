package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.0VX  reason: invalid class name */
public class AnonymousClass0VX implements C16280s0 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass0VX(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public void dispose() {
        AnonymousClass0Q5 r1;
        C05830Vw r0;
        switch (this.A00) {
            case 0:
                ((AnonymousClass0IQ) this.A01).A03.A0H(this.A02);
                return;
            case 1:
                ((AnonymousClass0Q5) this.A01).A09((AnonymousClass0Q5) this.A02);
                return;
            case 2:
                r1 = (AnonymousClass0Q5) this.A02;
                C05800Vt r02 = (C05800Vt) ((C03520Io) this.A01).A00.getValue();
                if (r02 != null) {
                    r0 = r02.A02;
                    break;
                } else {
                    return;
                }
            case 3:
                r1 = (AnonymousClass0Q5) this.A01;
                r0 = (C05830Vw) this.A02;
                break;
            case 4:
                ((C04650Of) this.A01).A01((View) this.A02);
                return;
            case 5:
                ((AnonymousClass0W2) this.A02).A02.add(this.A01);
                return;
            case 6:
                C17330uU r2 = (C17330uU) this.A02;
                AnonymousClass0Uk r03 = (AnonymousClass0Uk) r2.getValue();
                if (r03 != null) {
                    C05480Uj r12 = new C05480Uj(r03);
                    C17210uI r04 = (C17210uI) this.A01;
                    if (r04 != null) {
                        r04.CPx(r12);
                    }
                    r2.setValue((Object) null);
                    return;
                }
                return;
            default:
                ((Context) this.A02).getApplicationContext().unregisterComponentCallbacks((AnonymousClass0R0) this.A01);
                return;
        }
        r1.A07(r0);
    }
}
