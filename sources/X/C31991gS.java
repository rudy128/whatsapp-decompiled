package X;

import android.os.Message;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.1gS  reason: invalid class name and case insensitive filesystem */
public final class C31991gS implements AnonymousClass1RJ {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    public C31991gS(AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public int[] BSG() {
        return new int[]{254};
    }

    public boolean BcT(Message message, int i) {
        C18070vi.A0d(message, 1);
        if (i != 254) {
            return false;
        }
        Object obj = message.obj;
        C18070vi.A0z(obj, "null cannot be cast to non-null type kotlin.String");
        C54352e0 r2 = (C54352e0) this.A01.get();
        C18070vi.A0d(obj, 0);
        ((C192579od) r2.A02.get()).A00("GPIA_DURATION");
        JniBridge.jvidispatchIOOOO(2, obj, r2.A00.A00, new C65282w9(r2, this), r2.A01.wajContext.get());
        return true;
    }
}
