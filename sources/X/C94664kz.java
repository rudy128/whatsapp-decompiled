package X;

import android.view.View;

/* renamed from: X.4kz  reason: invalid class name and case insensitive filesystem */
public class C94664kz implements C108005ay {
    public final int A00;
    public final Object A01;

    public C94664kz(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public boolean Bs8() {
        AnonymousClass206 r1;
        AnonymousClass3uL r2;
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 2:
                AnonymousClass3uL r22 = (AnonymousClass3uL) obj;
                if (r22.A2Z()) {
                    r1 = r22.getFMessage();
                    r2 = r22;
                    break;
                } else {
                    return false;
                }
            case 3:
                AnonymousClass3uP r23 = (AnonymousClass3uP) obj;
                if (r23.A2Z()) {
                    r1 = (AnonymousClass21V) r23.A0I;
                    r2 = r23;
                    break;
                } else {
                    return false;
                }
            default:
                AnonymousClass3uP r24 = (AnonymousClass3uP) obj;
                if (r24.A2Z()) {
                    r1 = r24.getFMessage();
                    r2 = r24;
                    break;
                } else {
                    return false;
                }
        }
        r2.A2T(r1, 2);
        return true;
    }

    public void C5l(View view) {
        AnonymousClass00H r0;
        C38471rL r02;
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                r0 = ((C78443so) obj).A0Z;
                break;
            case 1:
                r0 = ((C78393sj) obj).A07;
                break;
            case 2:
                r02 = ((AnonymousClass3uL) obj).A0F;
                break;
            default:
                r0 = ((C23812BqN) obj).A0D;
                break;
        }
        r02 = (C38471rL) r0.get();
        r02.onClick(view);
    }
}
