package X;

import android.content.ContentValues;
import android.content.SharedPreferences;
import com.whatsapp.newsletter.iq.BaseNewslettersJob;
import com.whatsapp.newsletter.mex.BaseMetadataNewsletterGraphqlJob;
import com.whatsapp.newsletter.mex.BaseNewsletterDirectoryV2GraphqlJob;
import com.whatsapp.newsletter.mex.DeleteNewsletterGraphqlJob;
import com.whatsapp.newsletter.mex.GetNewsletterAdminMetadataJob;
import com.whatsapp.newsletter.mex.NewsletterDirectoryV2SearchGraphqlJob;
import com.whatsapp.newsletter.mex.UpdateNewsletterGraphqlJob;
import com.whatsapp.util.Log;

/* renamed from: X.1md  reason: invalid class name and case insensitive filesystem */
public final class C35681md {
    public long A00;
    public C35701mf A01;
    public C35711mg A02;
    public C35721mh A03;
    public C35731mi A04;
    public C35741mj A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final C35641mZ A09;
    public final C35651ma A0A;
    public final C35661mb A0B;
    public final C35671mc A0C;
    public final AnonymousClass11P A0D;
    public final AnonymousClass1CJ A0E;
    public final C18030ve A0F;
    public final C35631mY A0G;
    public final C33501iv A0H;
    public final AnonymousClass00H A0I;
    public final AnonymousClass00H A0J;
    public final AnonymousClass00H A0K;
    public final AnonymousClass00H A0L = C217517g.A00(32877);
    public final AnonymousClass00H A0M;
    public final AnonymousClass00H A0N;
    public final AnonymousClass00H A0O;
    public final AnonymousClass00H A0P;
    public final AnonymousClass00H A0Q;
    public final AnonymousClass00H A0R;
    public final AnonymousClass00H A0S;
    public final AnonymousClass00H A0T;
    public final AnonymousClass00H A0U;
    public final AnonymousClass00H A0V;
    public final AnonymousClass00H A0W;
    public final AnonymousClass00H A0X;
    public final AnonymousClass00H A0Y;
    public final AnonymousClass00H A0Z;
    public final AnonymousClass00H A0a;
    public final AnonymousClass00H A0b;
    public final AnonymousClass00H A0c;
    public final C19830z4 A0d;
    public final AnonymousClass121 A0e;
    public final AnonymousClass00H A0f;
    public final C18100vl A0g;

    /* JADX WARNING: type inference failed for: r1v3, types: [com.whatsapp.newsletter.iq.BaseNewslettersJob, com.whatsapp.newsletter.mex.BaseNewsletterDirectoryV2GraphqlJob] */
    public final BaseNewsletterDirectoryV2GraphqlJob A00(C179619Ir r8, BCA bca, String str, String str2) {
        NewsletterDirectoryV2SearchGraphqlJob newsletterDirectoryV2SearchGraphqlJob;
        BCA bca2 = bca;
        C18070vi.A0d(bca, 3);
        if (!((AnonymousClass1c4) this.A0P.get()).A08()) {
            ? baseNewslettersJob = new BaseNewslettersJob("NoOp");
            baseNewslettersJob.callback = bca;
            newsletterDirectoryV2SearchGraphqlJob = baseNewslettersJob;
        } else {
            newsletterDirectoryV2SearchGraphqlJob = new NewsletterDirectoryV2SearchGraphqlJob(r8, bca2, str, str2, C18020vd.A00(C18040vf.A02, this.A0F, 5853));
        }
        ((C25001Mm) this.A0Z.get()).A01(newsletterDirectoryV2SearchGraphqlJob);
        return newsletterDirectoryV2SearchGraphqlJob;
    }

    public final C175168yA A01(C29681ch r16, C22515BAy bAy, String str, boolean z, boolean z2) {
        C22515BAy bAy2 = bAy;
        C18070vi.A0d(bAy2, 4);
        if (!((AnonymousClass1c4) this.A0P.get()).A08()) {
            return null;
        }
        C35731mi r0 = this.A04;
        if (r0 != null) {
            AnonymousClass10E r1 = r0.A00.A00;
            AnonymousClass1PY r4 = (AnonymousClass1PY) r1.ABh.get();
            C35681md r9 = (C35681md) r1.A7N.get();
            C20131A8r a8r = (C20131A8r) r1.A7I.get();
            AnonymousClass5Y9 r7 = (AnonymousClass5Y9) r1.A7S.get();
            C58732lA r8 = (C58732lA) r1.A7U.get();
            C175168yA r12 = new C175168yA((AnonymousClass1CJ) r1.A2H.get(), (C32991i5) r1.A7T.get(), r4, r16, bAy2, r7, r8, r9, a8r, (AnonymousClass10I) r1.AC1.get(), str, z, z2);
            r12.A01();
            return r12;
        }
        C18070vi.A11("getNewsletterPreviewGraphqlHandler");
        throw null;
    }

    public final synchronized void A02() {
        AnonymousClass00H r4 = this.A0P;
        if (((AnonymousClass1c4) r4.get()).A08()) {
            AnonymousClass00H r3 = this.A0d.A00;
            if (!((SharedPreferences) r3.get()).getBoolean("newsletter_subscriptions_fetched", false) && !this.A08) {
                A0F(false);
            }
            if (!((SharedPreferences) r3.get()).getBoolean("newsletter_my_reactions_fetched", false) && !this.A06 && ((AnonymousClass1c4) r4.get()).A08()) {
                this.A06 = true;
                ((AW1) this.A0O.get()).A04((C29681ch) null);
            }
        }
    }

    public final void A05(C29681ch r5) {
        AnonymousClass00H r2 = this.A0P;
        if (((AnonymousClass1c4) r2.get()).A08()) {
            AnonymousClass1CJ r1 = this.A0E;
            Object obj = r2.get();
            C18070vi.A0X(obj);
            if (AnonymousClass4aS.A08(r1, r5, (AnonymousClass1c4) obj)) {
                ((C25001Mm) this.A0Z.get()).A01(AnonymousClass2UG.A00(r5, (C22515BAy) null));
            }
        }
    }

    public final void A06(C29681ch r19) {
        C29681ch r4 = r19;
        C18070vi.A0d(r4, 0);
        AnonymousClass00H r2 = this.A0P;
        if (((AnonymousClass1c4) r2.get()).A08()) {
            AnonymousClass1CJ r1 = this.A0E;
            Object obj = r2.get();
            C18070vi.A0X(obj);
            if (AnonymousClass4aS.A08(r1, r4, (AnonymousClass1c4) obj)) {
                ((C25001Mm) this.A0Z.get()).A01(new BaseMetadataNewsletterGraphqlJob(r4, (C22515BAy) null, new C198699yl(false, false, false, true, false, false, false, false, false, true, true, true)));
            }
        }
    }

    public final void A07(C29681ch r8) {
        C18070vi.A0d(r8, 0);
        ((C25001Mm) this.A0Z.get()).A01(new GetNewsletterAdminMetadataJob(r8, (AnonymousClass5YA) null, false, false, false));
    }

    public final void A08(C29681ch r11) {
        C46162Dk r3;
        C179509Ig r0;
        C46162Dk r1;
        C29681ch r5 = r11;
        C18070vi.A0d(r11, 0);
        if (((AnonymousClass1c4) this.A0P.get()).A08()) {
            C29691ci A002 = AnonymousClass1CJ.A00(this.A0E, r11);
            if ((A002 instanceof C46162Dk) && (r1 = (C46162Dk) A002) != null && r1.A0Q()) {
                this.A0e.BEq(r11, (Long) null, false, true);
                if (((AnonymousClass1Nb) this.A0J.get()).A0e().contains(r11)) {
                    ((C22621Co) this.A0I.get()).A03(r11);
                }
            }
            C32991i5 r4 = (C32991i5) this.A0V.get();
            C29691ci A003 = AnonymousClass1CJ.A00(r4.A02, r11);
            if ((A003 instanceof C46162Dk) && (r3 = (C46162Dk) A003) != null) {
                if (r3.A0Q()) {
                    r0 = C179509Ig.GUEST;
                } else {
                    if (r3.A0O()) {
                        r0 = C179509Ig.SUBSCRIBED;
                    }
                    r3.A0A = true;
                    ContentValues contentValues = new ContentValues();
                    C50072Ta.A00(contentValues, "deleted", true);
                    contentValues.put("membership", Integer.valueOf(r3.A02.value));
                    C32991i5.A01(contentValues, r3, r4);
                }
                r3.A02 = r0;
                r3.A0A = true;
                ContentValues contentValues2 = new ContentValues();
                C50072Ta.A00(contentValues2, "deleted", true);
                contentValues2.put("membership", Integer.valueOf(r3.A02.value));
                C32991i5.A01(contentValues2, r3, r4);
            }
            C58732lA r42 = (C58732lA) this.A0W.get();
            AnonymousClass206 A032 = ((AnonymousClass1W6) r42.A02.get()).A01.A03(r42.A00.A04(r11));
            if (A032 == null || !(A032 instanceof C436420i) || ((C436420i) A032).A00 != 133) {
                r42.A01(r5, (Long) null, 133, r42.A01.A06(r11) + 1);
            }
            ((C20131A8r) this.A0T.get()).A0H(r11);
        }
    }

    public final void A09(C29681ch r4) {
        C18070vi.A0d(r4, 0);
        AnonymousClass00H r2 = this.A0P;
        if (((AnonymousClass1c4) r2.get()).A08()) {
            AnonymousClass1CJ r1 = this.A0E;
            Object obj = r2.get();
            C18070vi.A0X(obj);
            if (AnonymousClass4aS.A08(r1, r4, (AnonymousClass1c4) obj)) {
                ((AnonymousClass10I) this.A0a.get()).CGF(new C21458AkP(this, r4, 21));
            }
        }
    }

    public final void A0A(C29681ch r4) {
        C18070vi.A0d(r4, 0);
        AnonymousClass00H r2 = this.A0P;
        if (((AnonymousClass1c4) r2.get()).A08()) {
            AnonymousClass1CJ r1 = this.A0E;
            Object obj = r2.get();
            C18070vi.A0X(obj);
            if (AnonymousClass4aS.A08(r1, r4, (AnonymousClass1c4) obj)) {
                ((AnonymousClass10I) this.A0a.get()).CGF(new C21458AkP(this, r4, 20));
            }
        }
    }

    public final void A0B(C29681ch r3, C22515BAy bAy) {
        C18070vi.A0d(r3, 0);
        if (((AnonymousClass1c4) this.A0P.get()).A08()) {
            ((C25001Mm) this.A0Z.get()).A01(new DeleteNewsletterGraphqlJob(r3, bAy));
        }
    }

    public final void A0C(C29681ch r13, C22515BAy bAy, String str, String str2, byte[] bArr, boolean z, boolean z2) {
        C29681ch r3 = r13;
        C18070vi.A0d(r13, 0);
        if (((AnonymousClass1c4) this.A0P.get()).A08()) {
            ((C25001Mm) this.A0Z.get()).A01(new UpdateNewsletterGraphqlJob((C179519Ih) null, r3, bAy, str, str2, bArr, true, z, z2, false));
        }
    }

    public final void A0D(C29681ch r4, Integer num) {
        C18070vi.A0d(r4, 0);
        AnonymousClass00H r2 = this.A0P;
        if (((AnonymousClass1c4) r2.get()).A08()) {
            AnonymousClass1CJ r1 = this.A0E;
            Object obj = r2.get();
            C18070vi.A0X(obj);
            if (AnonymousClass4aS.A08(r1, r4, (AnonymousClass1c4) obj)) {
                ((AnonymousClass10I) this.A0a.get()).CGF(new C21435Ak2(this, r4, num, 6));
                return;
            }
        }
        A6Q.A02((A6Q) this.A0f.get(), num, 105);
    }

    public final void A0E(C29681ch r4, Integer num) {
        C18070vi.A0d(r4, 0);
        if (!((AnonymousClass1c4) this.A0P.get()).A08()) {
            A6Q.A02((A6Q) this.A0f.get(), num, 105);
        } else {
            ((AnonymousClass10I) this.A0a.get()).CGF(new C21435Ak2(this, r4, num, 8));
        }
    }

    public final void A0F(boolean z) {
        if (((AnonymousClass1c4) this.A0P.get()).A08()) {
            A0G(true);
            this.A08 = true;
            C35721mh r0 = this.A03;
            if (r0 != null) {
                AnonymousClass10E r1 = r0.A00.A00;
                AnonymousClass1PY r4 = (AnonymousClass1PY) r1.ABh.get();
                AnonymousClass5Y9 r6 = (AnonymousClass5Y9) r1.A7S.get();
                C32991i5 r3 = (C32991i5) r1.A7T.get();
                C25011Mn r5 = (C25011Mn) r1.A9o.get();
                new C175078y1((C19830z4) r1.ABl.get(), r3, r4, r5, r6, (C20131A8r) r1.A7I.get(), (AnonymousClass10I) r1.AC1.get(), z).A01();
                return;
            }
            C18070vi.A11("getAllFollowedNewslettersGraphqlHandler");
            throw null;
        }
    }

    public final void A03(C46162Dk r4, C18090vk r5) {
        if (((AnonymousClass1c4) this.A0P.get()).A08()) {
            ((AnonymousClass10I) this.A0a.get()).CGF(new C21435Ak2(this, r4, r5, 7));
        }
    }

    public final void A04(C179459Ia r6, C29681ch r7) {
        C46162Dk r3;
        C32991i5 r4 = (C32991i5) this.A0V.get();
        C29691ci A0A2 = r4.A02.A0A(r7);
        if (!(A0A2 instanceof C46162Dk) || (r3 = (C46162Dk) A0A2) == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("NewsletterStore/failed to find newsletter in chatsCache for ");
            sb.append(r7);
            Log.e(sb.toString());
        } else {
            r3.A04 = r6;
            ContentValues contentValues = new ContentValues();
            contentValues.put("suspended", Integer.valueOf(r3.A04.value));
            C32991i5.A01(contentValues, r3, r4);
        }
        ((C20131A8r) this.A0T.get()).A0H(r7);
    }

    public final void A0G(boolean z) {
        if (!this.A07) {
            this.A07 = true;
            ((AnonymousClass10I) this.A0a.get()).CGF(new C70813Cp(16, (Object) this, z));
        }
    }

    public C35681md(C35641mZ r34, C35651ma r35, C35661mb r36, C35671mc r37, AnonymousClass11P r38, C19830z4 r39, AnonymousClass1CJ r40, AnonymousClass121 r41, C18030ve r42, C35631mY r43, C33501iv r44, AnonymousClass00H r45, AnonymousClass00H r46, AnonymousClass00H r47, AnonymousClass00H r48, AnonymousClass00H r49, AnonymousClass00H r50, AnonymousClass00H r51, AnonymousClass00H r52, AnonymousClass00H r53, AnonymousClass00H r54, AnonymousClass00H r55, AnonymousClass00H r56, AnonymousClass00H r57, AnonymousClass00H r58, AnonymousClass00H r59, AnonymousClass00H r60, AnonymousClass00H r61, AnonymousClass00H r62, AnonymousClass00H r63, AnonymousClass00H r64, AnonymousClass00H r65) {
        AnonymousClass11P r28 = r38;
        C18070vi.A0d(r28, 1);
        C18030ve r24 = r42;
        C18070vi.A0d(r24, 2);
        AnonymousClass00H r15 = r45;
        C18070vi.A0d(r15, 3);
        AnonymousClass00H r22 = r46;
        C18070vi.A0d(r22, 4);
        AnonymousClass1CJ r26 = r40;
        C18070vi.A0d(r26, 5);
        AnonymousClass00H r21 = r47;
        C18070vi.A0d(r21, 6);
        AnonymousClass00H r20 = r48;
        C18070vi.A0d(r20, 7);
        C19830z4 r27 = r39;
        C18070vi.A0d(r27, 8);
        AnonymousClass00H r19 = r49;
        C18070vi.A0d(r19, 9);
        AnonymousClass00H r18 = r50;
        C18070vi.A0d(r18, 10);
        AnonymousClass00H r17 = r51;
        C18070vi.A0d(r17, 11);
        AnonymousClass00H r14 = r52;
        C18070vi.A0d(r14, 12);
        AnonymousClass00H r13 = r53;
        C18070vi.A0d(r13, 13);
        AnonymousClass00H r12 = r54;
        C18070vi.A0d(r12, 14);
        AnonymousClass00H r16 = r55;
        C18070vi.A0d(r16, 16);
        AnonymousClass00H r11 = r56;
        C18070vi.A0d(r11, 17);
        AnonymousClass121 r25 = r41;
        C18070vi.A0d(r25, 18);
        AnonymousClass00H r10 = r57;
        C18070vi.A0d(r10, 19);
        AnonymousClass00H r9 = r58;
        C18070vi.A0d(r9, 20);
        AnonymousClass00H r8 = r59;
        C18070vi.A0d(r8, 21);
        AnonymousClass00H r7 = r60;
        C18070vi.A0d(r7, 22);
        AnonymousClass00H r6 = r61;
        C18070vi.A0d(r6, 23);
        C33501iv r23 = r44;
        C18070vi.A0d(r23, 24);
        C35641mZ r32 = r34;
        C18070vi.A0d(r32, 25);
        C35651ma r31 = r35;
        C18070vi.A0d(r31, 26);
        AnonymousClass00H r5 = r62;
        C18070vi.A0d(r5, 27);
        C35661mb r30 = r36;
        C18070vi.A0d(r30, 28);
        C35671mc r29 = r37;
        C18070vi.A0d(r29, 29);
        AnonymousClass00H r4 = r63;
        C18070vi.A0d(r4, 30);
        AnonymousClass00H r3 = r64;
        C18070vi.A0d(r3, 31);
        AnonymousClass00H r2 = r65;
        C18070vi.A0d(r2, 32);
        this.A0D = r28;
        this.A0F = r24;
        this.A0M = r15;
        this.A0a = r22;
        this.A0E = r26;
        this.A0Z = r21;
        this.A0N = r20;
        this.A0d = r27;
        this.A0V = r19;
        this.A0I = r18;
        this.A0J = r17;
        this.A0P = r14;
        this.A0c = r13;
        this.A0b = r12;
        this.A0G = r43;
        this.A0f = r16;
        this.A0T = r11;
        this.A0e = r25;
        this.A0X = r10;
        this.A0R = r9;
        this.A0Q = r8;
        this.A0Y = r7;
        this.A0U = r6;
        this.A0H = r23;
        this.A09 = r32;
        this.A0A = r31;
        this.A0W = r5;
        this.A0B = r30;
        this.A0C = r29;
        this.A0O = r4;
        this.A0S = r3;
        this.A0K = r2;
        Boolean bool = C17960vV.A01;
        this.A0g = new C18110vm(C35691me.A00);
    }
}
