package X;

import android.content.SharedPreferences;
import com.whatsapp.productinfra.datasharingdisclosure.data.ConsumerCtwaDisclosureRepository$ackConsumerDisclosure$1;

/* renamed from: X.9ox  reason: invalid class name and case insensitive filesystem */
public final class C192769ox {
    public final AnonymousClass11P A00;
    public final AnonymousClass121 A01;
    public final AnonymousClass1PQ A02;
    public final AnonymousClass00H A03;
    public final C18100vl A04 = C21528Alb.A00(this, 31);
    public final C88504Zz A05;
    public final AnonymousClass10I A06;

    public final void A00(AnonymousClass1BI r6, Boolean bool) {
        C191439mb r4 = (C191439mb) this.A04.getValue();
        C17880vN.A1D(C108995ce.A0E(((C185119c3) r4.A02.get()).A01), "consumer_disclosure", AnonymousClass11P.A01(r4.A00));
        AnonymousClass3MX.A1Q(new ConsumerCtwaDisclosureRepository$ackConsumerDisclosure$1(r4, (C30391dr) null), r4.A04);
        if (r6 != null && bool != null) {
            A01(r6, bool.booleanValue());
        }
    }

    public final void A01(AnonymousClass1BI r6, boolean z) {
        C88504Zz r1 = this.A05;
        if (r1.A05(C22941Dw.A00(r6), z)) {
            StringBuilder A10 = AnonymousClass000.A10();
            if (!((SharedPreferences) AnonymousClass3MX.A14(((C185119c3) ((C191439mb) r1.A09.getValue()).A02.get()).A01)).getBoolean(AnonymousClass000.A0y(AnonymousClass8BS.A0g(r6, "pref_consumer_disclosure_message_shown_", A10), A10), false)) {
                C17880vN.A1F(C108995ce.A0E(((C185119c3) ((C191439mb) this.A04.getValue()).A02.get()).A01), AnonymousClass000.A0y(r6.getRawString(), AnonymousClass000.A11("pref_consumer_disclosure_message_shown_")), true);
                this.A06.CGF(new C70733Ch(this, r6, 29));
            }
        }
    }

    public C192769ox(AnonymousClass11P r2, C88504Zz r3, AnonymousClass121 r4, AnonymousClass1PQ r5, AnonymousClass10I r6, AnonymousClass00H r7) {
        C18070vi.A0w(r2, r6, r5, r4, r3);
        C18070vi.A0d(r7, 6);
        this.A00 = r2;
        this.A06 = r6;
        this.A02 = r5;
        this.A01 = r4;
        this.A05 = r3;
        this.A03 = r7;
    }
}
