package X;

import com.whatsapp.datasharingdisclosure.ui.ConsumerDisclosureFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4mX  reason: invalid class name and case insensitive filesystem */
public final class C95624mX implements C108045b2 {
    public final /* synthetic */ AnonymousClass1E7 A00;
    public final /* synthetic */ C107305Ze A01;
    public final /* synthetic */ C107305Ze A02;
    public final /* synthetic */ AnonymousClass4QV A03;
    public final /* synthetic */ ConsumerDisclosureFragment A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ Integer A07;

    public C95624mX(AnonymousClass1E7 r1, C107305Ze r2, C107305Ze r3, AnonymousClass4QV r4, ConsumerDisclosureFragment consumerDisclosureFragment, Integer num, Integer num2, Integer num3) {
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = consumerDisclosureFragment;
        this.A06 = num;
        this.A07 = num2;
        this.A05 = num3;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void Bkq() {
        AnonymousClass4QV r6 = this.A03;
        AnonymousClass1E7 r7 = this.A00;
        ((C192769ox) r6.A00.get()).A00(r7.A0J, Boolean.valueOf(r7.A0C()));
        this.A04.A28();
        AnonymousClass4QI r5 = (AnonymousClass4QI) r6.A02.get();
        Integer num = this.A06;
        Integer num2 = this.A07;
        Integer num3 = this.A05;
        C18070vi.A0d(num, 0);
        r5.A00.CC7(r5.A00(num, num2, num3, 1));
        C22941Dw r0 = UserJid.Companion;
        UserJid A0w = AnonymousClass3MZ.A0w(r7);
        AnonymousClass00H r1 = r6.A01;
        AnonymousClass3MW.A0b(r1).A04(A0w);
        C88654aI.A03(AnonymousClass3MW.A0b(r1), A0w, (String) null, 1, true);
        this.A01.Bkp();
        this.A02.Bkp();
    }

    public void Bnl() {
        AnonymousClass4QV r6 = this.A03;
        AnonymousClass4QI r5 = (AnonymousClass4QI) r6.A02.get();
        Integer num = this.A06;
        Integer num2 = this.A07;
        Integer num3 = this.A05;
        C18070vi.A0d(num, 0);
        r5.A00.CC7(r5.A00(num, num2, num3, 2));
        C88654aI A0b = AnonymousClass3MW.A0b(r6.A01);
        C22941Dw r0 = UserJid.Companion;
        A0b.A05(AnonymousClass3MZ.A0w(this.A00));
        this.A04.A28();
    }
}
