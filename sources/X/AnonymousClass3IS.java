package X;

import com.whatsapp.updates.ui.UpdatesFragment;
import java.util.List;

/* renamed from: X.3IS  reason: invalid class name */
public final class AnonymousClass3IS extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ UpdatesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3IS(UpdatesFragment updatesFragment) {
        super(1);
        this.this$0 = updatesFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C23311Fn r1;
        C139186yN r9 = (C139186yN) obj;
        C18070vi.A0d(r9, 0);
        UpdatesFragment updatesFragment = this.this$0;
        List<C63372sx> list = r9.A02;
        int size = list.size();
        long j = 0;
        for (C63372sx A03 : list) {
            long A032 = A03.A03();
            if (A032 < j) {
                A032 = j;
            }
            j = A032;
        }
        AnonymousClass1FL A1B = updatesFragment.A1B();
        if ((A1B instanceof C23311Fn) && (r1 = (C23311Fn) A1B) != null) {
            r1.CRN(j, size);
        }
        AnonymousClass7AE r0 = updatesFragment.A0H;
        if (r0 != null) {
            r0.A00();
        }
        return C27621Wu.A00;
    }
}
