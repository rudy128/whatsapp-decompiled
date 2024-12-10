package X;

import android.content.Context;
import com.whatsapp.WaImageButton;
import java.util.List;

/* renamed from: X.4fR  reason: invalid class name and case insensitive filesystem */
public class C91284fR implements AnonymousClass1GV {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C91284fR(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    public final void accept(Object obj) {
        if (this.A00 != 0) {
            AnonymousClass02n r4 = (AnonymousClass02n) this.A01;
            Context context = (Context) this.A02;
            AnonymousClass1BI r2 = (AnonymousClass1BI) this.A03;
            String str = (String) obj;
            C18070vi.A0d(r4, 0);
            if (str != null && str.length() != 0) {
                r4.A03(AnonymousClass4HT.A00(context, r2, AnonymousClass00R.A0N, str, (List) null));
                return;
            }
            return;
        }
        C94164k9 r3 = (C94164k9) this.A01;
        Object obj2 = this.A02;
        WaImageButton waImageButton = (WaImageButton) this.A03;
        AnonymousClass1E7 r6 = (AnonymousClass1E7) obj;
        if (r6 != null && obj2.equals(r6.A0J)) {
            C77843ra.A06(waImageButton, (C77843ra) r3.A01, r6);
        }
    }
}
