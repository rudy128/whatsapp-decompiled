package X;

import com.whatsapp.newsletter.iq.BaseNewslettersJob;
import com.whatsapp.newsletter.mex.NewsletterDirectoryV2ListGraphqlJob;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5jR  reason: invalid class name and case insensitive filesystem */
public final class C111285jR extends AnonymousClass1J2 implements B8T, C1595885c {
    public BaseNewslettersJob A00;
    public AnonymousClass6RR A01;
    public AnonymousClass7KE A02;
    public AWX A03;
    public List A04;
    public boolean A05;
    public boolean A06;
    public final AnonymousClass1DS A07;
    public final AnonymousClass1DS A08;
    public final C22801Dg A09;
    public final AnonymousClass1DT A0A;
    public final AnonymousClass1DT A0B = C108945cZ.A0S();
    public final AnonymousClass1DT A0C;
    public final AnonymousClass1DT A0D;
    public final AnonymousClass1M9 A0E;
    public final C35681md A0F;
    public final C132876nm A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I;
    public final AnonymousClass00H A0J;
    public final AnonymousClass00H A0K;
    public final C18600wl A0L;
    public final AnonymousClass1OX A0M;
    public final C19880zA A0N;
    public final C19880zA A0O;

    /* JADX WARNING: type inference failed for: r4v2, types: [com.whatsapp.newsletter.iq.BaseNewslettersJob, com.whatsapp.newsletter.mex.BaseNewsletterDirectoryV2GraphqlJob] */
    public final void A0U(C179619Ir r13, AnonymousClass6RR r14, String str, boolean z) {
        NewsletterDirectoryV2ListGraphqlJob newsletterDirectoryV2ListGraphqlJob;
        C129166hM r0;
        String str2 = str;
        C179619Ir r6 = r13;
        AnonymousClass6RR r7 = r14;
        this.A01 = r14;
        this.A05 = false;
        boolean z2 = z;
        if (!z || this.A00 == null) {
            BaseNewslettersJob baseNewslettersJob = this.A00;
            if (baseNewslettersJob != null) {
                baseNewslettersJob.cancel();
            }
            this.A06 = z2;
            C35681md r3 = this.A0F;
            String str3 = null;
            if (r13 == C179619Ir.EXPLORE) {
                r6 = null;
            }
            if (z && (r0 = (C129166hM) this.A08.A06()) != null) {
                str3 = r0.A02;
            }
            BCA bca = (BCA) C18070vi.A0E(this.A0I);
            C18070vi.A0d(bca, 4);
            if (!C72453Mb.A1X(r3.A0P)) {
                ? baseNewslettersJob2 = new BaseNewslettersJob("NoOp");
                baseNewslettersJob2.callback = bca;
                newsletterDirectoryV2ListGraphqlJob = baseNewslettersJob2;
            } else {
                if (C18070vi.A18(str, "Global")) {
                    str2 = null;
                }
                newsletterDirectoryV2ListGraphqlJob = new NewsletterDirectoryV2ListGraphqlJob((C198139xq) r3.A0R.get(), r6, r7, bca, str2, str3, C18020vd.A00(C18040vf.A02, r3.A0F, 5853));
            }
            ((C25001Mm) r3.A0Z.get()).A01(newsletterDirectoryV2ListGraphqlJob);
            this.A00 = newsletterDirectoryV2ListGraphqlJob;
        }
    }

    public C111285jR(C19880zA r10, C19880zA r11, AnonymousClass2XW r12, AnonymousClass1M9 r13, C35681md r14, C1601187e r15, C1601287f r16, AnonymousClass00H r17, AnonymousClass00H r18, AnonymousClass00H r19, C18600wl r20) {
        AnonymousClass00H r5 = r17;
        C18070vi.A0w(r14, r5, r13, r10, r11);
        C1601287f r0 = r16;
        AnonymousClass00H r4 = r18;
        AnonymousClass00H r2 = r19;
        C18070vi.A0x(r4, r2, r15, r12, r0);
        C18600wl r3 = r20;
        C18070vi.A0d(r3, 11);
        this.A0F = r14;
        this.A0K = r5;
        this.A0E = r13;
        this.A0N = r10;
        this.A0O = r11;
        this.A0H = r4;
        this.A0J = r2;
        this.A0L = r3;
        C202111g A002 = C201811d.A00(16507);
        this.A0I = A002;
        this.A0M = AnonymousClass1OW.A02(r3);
        this.A08 = C22791Df.A01(((AnonymousClass7KD) A002.get()).A00, new AnonymousClass80T(this));
        AnonymousClass1DT A0S = C108945cZ.A0S();
        this.A0D = A0S;
        AnonymousClass1DT A0S2 = C108945cZ.A0S();
        this.A0C = A0S2;
        C22801Dg A0R = C108945cZ.A0R();
        this.A09 = A0R;
        this.A03 = r15.BGZ(this);
        AnonymousClass1OX A003 = C41561wd.A00(this);
        AnonymousClass10E r52 = r12.A00.A01;
        this.A02 = new AnonymousClass7KE(C108965cb.A0T(r52), (C133836pa) r52.A7D.get(), (C35681md) r52.A7N.get(), this, AnonymousClass3MZ.A1B(r52), A003);
        this.A0G = r0.BGa(C41561wd.A00(this));
        AnonymousClass1DT A0S3 = C108945cZ.A0S();
        this.A0A = A0S3;
        this.A07 = A0S3;
        AnonymousClass7AS.A01(A0S, A0R, new AnonymousClass80R(this), 0);
        AnonymousClass7AS.A01(A0S2, A0R, new AnonymousClass80S(this), 0);
    }

    public final void A0T(C29681ch r7, boolean z, boolean z2) {
        C179509Ig r4;
        C179509Ig r42;
        if (z2) {
            if (z) {
                r42 = C179509Ig.GUEST;
            } else {
                r42 = C179509Ig.SUBSCRIBED;
            }
            List<C135346s3> A10 = AnonymousClass3MW.A10(this.A0C);
            if (A10 != null) {
                ArrayList<List> A0D2 = C29351c6.A0D(A10);
                for (C135346s3 r0 : A10) {
                    A0D2.add(r0.A02);
                }
                for (List it : A0D2) {
                    ArrayList<AnonymousClass6B5> A13 = AnonymousClass000.A13();
                    for (Object next : it) {
                        C108975cc.A13(((AnonymousClass6B5) next).A06.A08(), r7, next, A13);
                    }
                    for (AnonymousClass6B5 r02 : A13) {
                        r02.A06.A02 = r42;
                    }
                }
                return;
            }
            return;
        }
        AnonymousClass7KD r03 = (AnonymousClass7KD) this.A0I.get();
        if (z) {
            r4 = C179509Ig.GUEST;
        } else {
            r4 = C179509Ig.SUBSCRIBED;
        }
        C129156hL r04 = (C129156hL) r03.A00.A06();
        if (r04 != null) {
            List list = r04.A03;
            ArrayList<C46162Dk> A132 = AnonymousClass000.A13();
            for (Object next2 : list) {
                C108975cc.A13(((C29691ci) next2).A08(), r7, next2, A132);
            }
            for (C46162Dk r05 : A132) {
                r05.A02 = r4;
            }
        }
    }

    public void Bwl(List list) {
        this.A0D.A0E(new AnonymousClass6B2(list));
    }

    public static String A00(AnonymousClass6BJ r0) {
        return (String) r0.A4b().A07.A06();
    }
}
