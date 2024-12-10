package X;

import com.whatsapp.jid.PhoneUserJid;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1kK  reason: invalid class name and case insensitive filesystem */
public final class C34341kK {
    public final AnonymousClass11S A00;
    public final C26811To A01;
    public final C34331kJ A02;
    public final AnonymousClass12E A03;
    public final C26931Ua A04;
    public final AnonymousClass11P A05;
    public final C19830z4 A06;
    public final AnonymousClass1UN A07;
    public final AnonymousClass1PY A08;
    public final AtomicInteger A09 = new AtomicInteger(0);
    public final AnonymousClass1OX A0A;

    public C34341kK(AnonymousClass11S r3, C26811To r4, C34331kJ r5, AnonymousClass12E r6, C26931Ua r7, AnonymousClass11P r8, C19830z4 r9, AnonymousClass1UN r10, AnonymousClass1PY r11, AnonymousClass1OX r12) {
        C18070vi.A0d(r12, 1);
        C18070vi.A0d(r9, 2);
        C18070vi.A0d(r11, 3);
        C18070vi.A0d(r6, 5);
        C18070vi.A0d(r3, 6);
        C18070vi.A0d(r8, 7);
        C18070vi.A0d(r10, 8);
        C18070vi.A0d(r7, 9);
        C18070vi.A0d(r4, 10);
        this.A0A = r12;
        this.A06 = r9;
        this.A08 = r11;
        this.A02 = r5;
        this.A03 = r6;
        this.A00 = r3;
        this.A05 = r8;
        this.A07 = r10;
        this.A04 = r7;
        this.A01 = r4;
    }

    public final void A00() {
        AnonymousClass11S r0 = this.A00;
        r0.A0I();
        PhoneUserJid phoneUserJid = r0.A0E;
        if (phoneUserJid != null) {
            AnonymousClass1OX r11 = this.A0A;
            C19830z4 r6 = this.A06;
            AnonymousClass1PY r8 = this.A08;
            C34331kJ r2 = this.A02;
            AnonymousClass12E r3 = this.A03;
            r2.execute(new C21444AkB(this.A01, r2, r3, this.A04, this.A05, r6, this.A07, r8, phoneUserJid, this.A09, r11));
        }
    }
}
