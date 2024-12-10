package X;

import android.content.Context;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.5h7  reason: invalid class name and case insensitive filesystem */
public final class C110795h7 extends C03610Iy {
    public final C41821x7 A00;
    public final C30141dS A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110795h7(Context context, View view, AnonymousClass206 r14, C38471rL r15, C38471rL r16, C38471rL r17, C41821x7 r18, C30141dS r19) {
        super(context, view, 0, 2130970787, 0);
        C18070vi.A0d(r14, 3);
        C41821x7 r2 = r18;
        C30141dS r1 = r19;
        C108965cb.A1P(r1, 7, r2);
        this.A01 = r1;
        this.A00 = r2;
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(2131432582, C18070vi.A0F(context, 2131892010));
        A13.put(2131432588, C18070vi.A0F(context, 2131892011));
        C30141dS r12 = this.A01;
        if (r12.A00() && !r12.A02()) {
            C41821x7 r0 = this.A00;
            if (((C133776pT) r0.A0C.get()).A01(13, C18070vi.A0M(r14))) {
                A13.put(2131432627, C18070vi.A0F(context, 2131892013));
            }
        }
        Iterator A15 = AnonymousClass000.A15(A13);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            this.A03.add(0, AnonymousClass000.A0M(A16.getKey()), 0, (CharSequence) A16.getValue());
        }
        this.A01 = new C1424579n(r16, r17, r15);
    }
}
