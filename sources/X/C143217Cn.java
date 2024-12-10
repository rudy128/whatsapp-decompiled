package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;

/* renamed from: X.7Cn  reason: invalid class name and case insensitive filesystem */
public class C143217Cn implements C1598386b {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C143217Cn(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj;
        this.A03 = obj2;
    }

    public final void BzV(boolean z) {
        if (this.A00 != 0) {
            Context context = (Context) this.A02;
            AnonymousClass1BI r2 = (AnonymousClass1BI) this.A03;
            if (!z) {
                context.startActivity(AnonymousClass1LU.A1D(context, (UserJid) r2, 14, true, true));
                return;
            }
            return;
        }
        AnonymousClass73Z r22 = (AnonymousClass73Z) this.A01;
        AnonymousClass73Z.A02((C1416576l) this.A02, r22, z);
        r22.A02.A04((Integer) this.A03, z);
    }
}
