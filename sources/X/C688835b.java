package X;

import com.whatsapp.passkeys.PasskeyAndroidApiImpl;
import com.whatsapp.passkeys.PasskeyExistsCache;
import com.whatsapp.passkeys.PasskeyFacade;
import com.whatsapp.passkeys.PasskeyServerApiImpl;

/* renamed from: X.35b  reason: invalid class name and case insensitive filesystem */
public class C688835b implements B8U {
    public final int A00;
    public final Object A01;

    public C688835b(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public PasskeyFacade BGb(C191519mj r13) {
        AnonymousClass10E r1;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            r1 = ((C37391pS) obj).A00;
        } else {
            r1 = ((AnonymousClass1K2) obj).A01;
        }
        AnonymousClass10G r2 = r1.A00;
        PasskeyAndroidApiImpl A86 = AnonymousClass10G.A86(AnonymousClass10G.A84(r2));
        C192679on r7 = (C192679on) r2.A3h.get();
        PasskeyExistsCache passkeyExistsCache = (PasskeyExistsCache) r2.A3i.get();
        C19830z4 r3 = (C19830z4) r1.ABl.get();
        AnonymousClass118 r22 = (AnonymousClass118) r1.ABY.get();
        return new PasskeyFacade(AnonymousClass10E.A6O(r1), r22, r3, AnonymousClass10E.A8r(r1), (AnonymousClass1PY) r1.ABh.get(), A86, r7, passkeyExistsCache, r13, (PasskeyServerApiImpl) r2.A0N.get(), (C18600wl) r1.A9E.get());
    }
}
