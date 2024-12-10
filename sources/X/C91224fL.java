package X;

import com.whatsapp.dialogs.ProgressDialogFragment;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.4fL  reason: invalid class name and case insensitive filesystem */
public class C91224fL implements C15950rT {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C91224fL(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj;
    }

    public final Object apply(Object obj) {
        Set set;
        AnonymousClass1GP r1;
        C86844Th r10;
        if (this.A00 != 0) {
            Object obj2 = this.A02;
            r1 = (AnonymousClass1GP) this.A03;
            r10 = (C86844Th) obj;
            ((ProgressDialogFragment) this.A01).A2H();
            set = Collections.singleton(obj2);
        } else {
            set = (Set) this.A02;
            r1 = (AnonymousClass1GP) this.A03;
            r10 = (C86844Th) obj;
            ((ProgressDialogFragment) this.A01).A2H();
        }
        C83754Gn.A00(r10.A01, (String) null, set, r10.A00, 1, false, true).A2F(r1, (String) null);
        return null;
    }
}
