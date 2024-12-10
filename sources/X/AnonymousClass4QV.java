package X;

import com.whatsapp.datasharingdisclosure.ui.ConsumerDisclosureFragment;

/* renamed from: X.4QV  reason: invalid class name */
public final class AnonymousClass4QV {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    public final void A00(AnonymousClass1GP r11, AnonymousClass4DN r12, AnonymousClass1E7 r13, C107305Ze r14, C107305Ze r15, Integer num, Integer num2, boolean z) {
        AnonymousClass1E7 r1 = r13;
        C18070vi.A0i(r11, r13);
        C107305Ze r3 = r15;
        if (AnonymousClass3Ma.A1Z(r12, AnonymousClass4DN.DEFAULT)) {
            Integer num3 = AnonymousClass00R.A0C;
            Integer num4 = num;
            Integer num5 = num2;
            ConsumerDisclosureFragment A002 = AnonymousClass4GY.A00(r13.A0J, Boolean.valueOf(r13.A0C()), num3, num4, num5, z);
            A002.A08 = new C95624mX(r1, r14, r3, this, A002, num3, num4, num5);
            C20098A7b.A01(A002, r11);
            return;
        }
        r15.Bkp();
    }

    public AnonymousClass4QV(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }
}
