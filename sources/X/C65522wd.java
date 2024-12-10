package X;

import android.content.Context;
import com.google.firebase.components.Qualified$Unqualified;
import java.util.concurrent.Executor;

/* renamed from: X.2wd  reason: invalid class name and case insensitive filesystem */
public class C65522wd implements C18360wH {
    public final int A00;
    public final Object A01;

    public C65522wd(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final Object BGj(C18400wL r10) {
        int i = this.A00;
        Object obj = this.A01;
        if (2 - i != 0) {
            return obj;
        }
        return new C18500wX((Context) r10.BMD(Context.class), r10.BXj(C18660ww.class), ((C18220vy) r10.BMD(C18220vy.class)).A04(), r10.CJd(new C18350wG(Qualified$Unqualified.class, C18510wa.class)), (Executor) r10.BMC((C18350wG) obj));
    }
}
