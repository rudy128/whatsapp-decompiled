package X;

import androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3;

/* renamed from: X.7Se  reason: invalid class name and case insensitive filesystem */
public class C147197Se implements C23421Fz {
    public final int A00;
    public final Object A01;

    public C147197Se(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public Object BFC(C30391dr r5, AnonymousClass1G2 r6) {
        Object obj;
        C23421Fz r2;
        int i;
        switch (this.A00) {
            case 0:
                C23421Fz[] r3 = (C23421Fz[]) this.A01;
                obj = AnonymousClass4I7.A00(r5, new C148047go(r3), new WorkConstraintsTracker$track$$inlined$combine$1$3((C30391dr) null), r6, r3);
                break;
            case 1:
                r2 = (C23421Fz) this.A01;
                i = 0;
                break;
            case 2:
                r2 = (C23421Fz) this.A01;
                i = 4;
                break;
            case 3:
                r2 = (C23421Fz) this.A01;
                i = 18;
                break;
            case 4:
                r2 = (C23421Fz) this.A01;
                i = 30;
                break;
            case 5:
                obj = r6.BJt(this.A01, r5);
                break;
            case 6:
                r2 = (C23421Fz) this.A01;
                i = 36;
                break;
            default:
                return null;
        }
        obj = r2.BFC(r5, new C147277Sn(r6, i));
        return AnonymousClass3MX.A13(obj);
    }
}
