package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterSimilarResponseImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.43g  reason: invalid class name and case insensitive filesystem */
public final class C821543g extends AMB {
    public AnonymousClass4WW A00;
    public final AnonymousClass1CJ A01;
    public final C20131A8r A02;
    public final int A03;
    public final C29681ch A04;
    public final C133836pa A05;

    /* JADX WARNING: type inference failed for: r2v5, types: [X.A8k, com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields] */
    public /* bridge */ /* synthetic */ void A02(C20125A8k a8k) {
        C20125A8k A09;
        AnonymousClass1IX A0A;
        C18070vi.A0d(a8k, 0);
        if (!this.A01 && (A09 = a8k.A09(NewsletterSimilarResponseImpl.Xwa2NewslettersSimilar.class, "xwa2_newsletters_similar")) != null && (A0A = A09.A0A(NewsletterSimilarResponseImpl.Xwa2NewslettersSimilar.Result.class, "result")) != null) {
            ArrayList A13 = AnonymousClass000.A13();
            Iterator it = A0A.iterator();
            while (it.hasNext()) {
                ? a8k2 = new C20125A8k(((C20125A8k) it.next()).A00);
                AnonymousClass25J r0 = C29681ch.A03;
                A13.add(this.A02.A0D(a8k2, AnonymousClass25J.A00(a8k2.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_ID)), false));
            }
            Iterator it2 = A13.iterator();
            while (it2.hasNext()) {
                C46162Dk r2 = (C46162Dk) it2.next();
                this.A01.A0K(r2, r2.A0M());
            }
            AnonymousClass4WW r6 = this.A00;
            if (r6 != null) {
                AnonymousClass440 r5 = r6.A00;
                ArrayList A0D = C29351c6.A0D(A13);
                Iterator it3 = A13.iterator();
                while (it3.hasNext()) {
                    C46162Dk r22 = (C46162Dk) it3.next();
                    AnonymousClass1E7 A0E = r5.A04.A0E(r22.A08());
                    if (A0E != null) {
                        AnonymousClass1E7 A052 = A0E.A05();
                        if (A052 != null) {
                            A0E = A052;
                        }
                    } else {
                        A0E = new AnonymousClass1E7(r22.A08());
                    }
                    A0D.add(new C135386s7(r22, A0E, false));
                }
                AnonymousClass4WW.A00(r6, A0D);
            }
        }
    }

    public boolean A04(A6Z a6z) {
        AnonymousClass4WW r1;
        C18070vi.A0d(a6z, 0);
        if (!this.A01 && (r1 = this.A00) != null) {
            C181499Qs.A00(a6z);
            AnonymousClass4WW.A00(r1, C18460wS.A00);
        }
        return false;
    }

    public AnonymousClass5WY A00() {
        List A0M = C18070vi.A0M(this.A05.A00());
        GraphQlCallInput graphQlCallInput = new GraphQlCallInput();
        graphQlCallInput.A05("newsletter_id", this.A04.getRawString());
        C162478Kx.A01(graphQlCallInput.A02(), Integer.valueOf(this.A03), "limit");
        graphQlCallInput.A06("country_codes", A0M);
        A7K a7k = new A7K();
        a7k.A04(graphQlCallInput, "input");
        return new AIj(a7k, NewsletterSimilarResponseImpl.class, "NewsletterSimilar");
    }

    public boolean A03() {
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C821543g(AnonymousClass1CJ r2, AnonymousClass1PY r3, C29681ch r4, AnonymousClass5Y9 r5, C133836pa r6, C20131A8r a8r, AnonymousClass4WW r8, AnonymousClass10I r9, int i) {
        super(r3, r5, r9);
        C18070vi.A0w(r9, r3, r5, r2, a8r);
        C18070vi.A0d(r6, 6);
        this.A01 = r2;
        this.A02 = a8r;
        this.A05 = r6;
        this.A04 = r4;
        this.A03 = i;
        this.A00 = r8;
    }

    public void cancel() {
        super.cancel();
        this.A00 = null;
    }
}
