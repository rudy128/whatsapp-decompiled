package X;

import java.util.concurrent.atomic.AtomicReference;

public final class A15 {
    public final AtomicReference A00 = new AtomicReference("register_as_companion_phone");
    public final AtomicReference A01 = new AtomicReference(C17890vO.A0Q());
    public final C18030ve A02;
    public final A8V A03;

    public static final void A00(A15 a15, C192119np r6, String str) {
        A8V a8v = a15.A03;
        r6.A01("rc", AnonymousClass3MW.A0y(a8v.A08));
        r6.A01("event_name", str);
        r6.A01("funnel_id", a8v.A07());
        AtomicReference atomicReference = a15.A01;
        r6.A01("companion_session_id", (String) atomicReference.get());
        StringBuilder A10 = AnonymousClass000.A10();
        C17900vP.A0d("CompanionPreRegLogger: ", str, A10);
        C17890vO.A1A(A10, (String) atomicReference.get());
        if (C72453Mb.A1a(a8v.A07)) {
            if (C18020vd.A05(C18040vf.A02, a15.A02, 9282)) {
                Object obj = a15.A00.get();
                C18070vi.A0X(obj);
                a8v.A0N((String) obj, "1", "2155550000", r6.A00);
            }
        }
    }

    public final void A01(String str) {
        A00(this, new C192119np(), str);
    }

    public final void A02(String str, String str2) {
        C192119np r1 = new C192119np();
        r1.A01("client_error_reason", str);
        if (str2 != null) {
            r1.A01("client_error_context", str2);
        }
        A00(this, r1, "cmp_cancel_reg");
    }

    public A15(C18030ve r3, A8V a8v) {
        C18070vi.A0j(r3, a8v);
        this.A02 = r3;
        this.A03 = a8v;
    }
}
