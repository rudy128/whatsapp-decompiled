package X;

import android.content.Intent;

/* renamed from: X.4RV  reason: invalid class name */
public final class AnonymousClass4RV {
    public AnonymousClass2H8 A00;
    public boolean A01;
    public final C18030ve A02;
    public final AnonymousClass18K A03;
    public final AnonymousClass19T A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final C18100vl A07 = AnonymousClass1DF.A01(new AnonymousClass5JO(this));
    public final C18100vl A08 = AnonymousClass1DF.A01(new AnonymousClass5JP(this));
    public final AnonymousClass11P A09;

    public final void A00(Intent intent, String str, String str2) {
        C18070vi.A0d(intent, 0);
        C60442o2.A00(intent, this.A09, str);
        AnonymousClass19T r2 = this.A04;
        r2.markerStart(703934026);
        if (C72453Mb.A1a(this.A07) && str2 != null) {
            r2.Bit(new C97684ps(str2), 703934026);
        }
        AnonymousClass2H8 r22 = new AnonymousClass2H8();
        this.A00 = r22;
        boolean A002 = this.A03.BDn(r22, (C18180vt) null).A00();
        this.A01 = A002;
        if (A002 && C72453Mb.A1a(this.A08)) {
            AnonymousClass00H r1 = this.A06;
            if (((AnonymousClass1CP) r1.get()).A00.containsKey("chat_open")) {
                ((AnonymousClass1CP) r1.get()).A01("chat_open");
            }
            AnonymousClass1CP.A00((AnonymousClass1CP) r1.get(), "chat_open", false);
        }
        C85764Oq r12 = (C85764Oq) this.A05.get();
        if (C72453Mb.A1a(r12.A04)) {
            r12.A05 = true;
        }
    }

    public AnonymousClass4RV(AnonymousClass11P r2, C18030ve r3, AnonymousClass18K r4, AnonymousClass19T r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r2, r5, r4, r3, r6);
        C18070vi.A0d(r7, 6);
        this.A09 = r2;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
        this.A06 = r6;
        this.A05 = r7;
    }
}
