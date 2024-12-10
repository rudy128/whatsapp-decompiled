package X;

import com.whatsapp.infra.graphql.BaseMexCallback;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterJoinResponseImpl;

/* renamed from: X.8tx  reason: invalid class name and case insensitive filesystem */
public class C172748tx extends BaseMexCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C172748tx(C29681ch r1, C192449oP r2, C188279hA r3, Integer num, int i) {
        this.A00 = i;
        this.A04 = r3;
        if (i != 0) {
            this.A01 = num;
            this.A03 = r1;
        } else {
            this.A03 = r1;
            this.A01 = num;
        }
        this.A02 = r2;
    }

    public static void A00(C172748tx r1, C188279hA r2) {
        A6Q.A02((A6Q) r2.A06.get(), (Integer) r1.A01, 3);
    }

    public /* bridge */ /* synthetic */ void A02(C20125A8k a8k) {
        if (this.A00 != 0) {
            C18070vi.A0d(a8k, 0);
            C188279hA r5 = (C188279hA) this.A04;
            A6Q.A02((A6Q) r5.A06.get(), (Integer) this.A01, 2);
            C32991i5 A0M = AnonymousClass8BR.A0M(r5.A07);
            C29681ch r3 = (C29681ch) this.A03;
            A0M.A07(C179509Ig.GUEST, r3);
            C170828qj r1 = new C170828qj();
            r1.A01 = r3.user;
            r1.A00 = 2;
            ((AnonymousClass74D) r5.A05.get()).A05.CC7(r1);
            ((C20131A8r) r5.A04.get()).A0H(r3);
            ((C175308yV) r5.A02.get()).A00(r3, AnonymousClass00R.A0N);
            return;
        }
        C18070vi.A0d(a8k, 0);
        C188279hA r52 = (C188279hA) this.A04;
        AnonymousClass00H r6 = r52.A04;
        r6.get();
        if (!C20131A8r.A09(C20125A8k.A04(a8k, NewsletterJoinResponseImpl.Xwa2NewsletterJoinV2.class, "xwa2_newsletter_join_v2"))) {
            ((C175308yV) r52.A02.get()).A01((C29681ch) this.A03, AnonymousClass00R.A0C, new C175068xw((String) null, 0));
            A00(this, r52);
            return;
        }
        A6Q.A02((A6Q) r52.A06.get(), (Integer) this.A01, 2);
        C32991i5 A0M2 = AnonymousClass8BR.A0M(r52.A07);
        C29681ch r4 = (C29681ch) this.A03;
        A0M2.A07(C179509Ig.SUBSCRIBED, r4);
        C170828qj r12 = new C170828qj();
        r12.A01 = r4.user;
        r12.A00 = 1;
        ((AnonymousClass74D) r52.A05.get()).A05.CC7(r12);
        ((C20131A8r) r6.get()).A0H(r4);
        AW1 aw1 = (AW1) r52.A03.get();
        C29691ci A002 = AnonymousClass1CJ.A00((AnonymousClass1CJ) aw1.A02.get(), r4);
        if ((A002 instanceof C46162Dk) && A002 != null) {
            AW1.A02(aw1, new C21435Ak2(aw1, r4, A002, 12));
        }
        ((C175308yV) r52.A02.get()).A00(r4, AnonymousClass00R.A0C);
    }

    public boolean A05(A6Z a6z) {
        Integer num;
        int i = this.A00;
        C18070vi.A0d(a6z, 0);
        C188279hA r2 = (C188279hA) this.A04;
        A00(this, r2);
        ((C192449oP) this.A02).A00(A6Z.A00(a6z));
        C175308yV r3 = (C175308yV) r2.A02.get();
        if (i != 0) {
            num = AnonymousClass00R.A0N;
        } else {
            num = AnonymousClass00R.A0C;
        }
        r3.A01((C29681ch) this.A03, num, C181499Qs.A00(a6z));
        return false;
    }
}
