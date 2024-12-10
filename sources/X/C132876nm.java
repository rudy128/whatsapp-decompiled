package X;

import com.whatsapp.newsletter.viewmodel.InvertNewsletterMembershipUseCase$invoke$1;

/* renamed from: X.6nm  reason: invalid class name and case insensitive filesystem */
public final class C132876nm {
    public final C175308yV A00;
    public final C35681md A01;
    public final AnonymousClass1OX A02;
    public final AnonymousClass74D A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;

    public final void A00(C46162Dk r20, Integer num, Long l, C22821Di r23) {
        Integer A052;
        C30391dr r9;
        Integer num2;
        C46162Dk r14 = r20;
        boolean A1Z = AnonymousClass000.A1Z(r14.A02, C179509Ig.GUEST);
        A6Q a6q = (A6Q) this.A05.get();
        Integer num3 = num;
        int A002 = C1402570p.A00(num3);
        Integer A012 = C1402570p.A01(num3);
        Long l2 = l;
        if (A1Z) {
            A052 = a6q.A04(A012, A002);
            r9 = null;
            this.A03.A0H(r14.A0M(), num3, num3, l2, (String) null, (String) null, (String) null, -1, -1);
        } else {
            A052 = a6q.A05(A012, A002);
            r9 = null;
            this.A03.A0I(r14.A0M(), num3, num3, l2, (String) null, (String) null, (String) null, -1, -1);
        }
        C22821Di r4 = r23;
        if (!C17880vN.A0U(this.A04).A0L()) {
            if (A1Z) {
                num2 = AnonymousClass00R.A0C;
            } else {
                num2 = AnonymousClass00R.A0N;
            }
            r4.invoke(new AnonymousClass6Bg(num2, new C175048xu()));
            return;
        }
        AnonymousClass3MX.A1Q(new InvertNewsletterMembershipUseCase$invoke$1(r14, this, A052, r9, r4), this.A02);
    }

    public C132876nm(C175308yV r2, C35681md r3, AnonymousClass74D r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass1OX r7) {
        C18070vi.A0w(r3, r4, r5, r2, r6);
        C18070vi.A0d(r7, 6);
        this.A01 = r3;
        this.A03 = r4;
        this.A05 = r5;
        this.A00 = r2;
        this.A04 = r6;
        this.A02 = r7;
    }
}
