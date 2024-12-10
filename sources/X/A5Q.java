package X;

import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.biz.catalog.network.graphql.directconnection.CoroutineDirectConnectionHelper;
import com.whatsapp.biz.catalog.network.graphql.service.impl.BaseCoroutineGraphQLRequestService$send$2;
import com.whatsapp.biz.catalog.network.graphql.service.impl.CoroutineGetSingleCollectionGraphQLService;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class A5Q {
    public final AnonymousClass11S A00;
    public final C19949A0g A01;
    public final AnonymousClass00H A02;

    public final void A05(BAM bam, C188519hY r39) {
        BAM bam2 = bam;
        C18070vi.A0d(bam2, 1);
        C188869i8 r0 = (C188869i8) this.A02.get();
        AnonymousClass190 r19 = r0.A00;
        C20004A2u a2u = r0.A0E;
        AnonymousClass00H r2 = r0.A0O;
        AnonymousClass1OZ A0U = C17880vN.A0U(r2);
        A6T a6t = new A6T(r0.A0L);
        AnonymousClass11E r16 = r0.A08;
        C26911Ty r1 = r0.A06;
        C26911Ty r17 = r1;
        C19949A0g a0g = r0.A0D;
        C188519hY r26 = r39;
        C167888hw r27 = new C167888hw(r19, r1, bam2, a6t, r16, r26, a0g, A0U, a2u);
        AnonymousClass00H r12 = r0.A0M;
        AnonymousClass10I r122 = r0.A0H;
        C185579co r11 = r0.A07;
        C186499eI r10 = new C186499eI(r11, (A0W) C18070vi.A0E(r12));
        C138476x9 r9 = r0.A0G;
        AnonymousClass11S r7 = r0.A05;
        C18030ve r3 = r0.A09;
        C131206ki r22 = r0.A0A;
        C196209ud r222 = (C196209ud) C18070vi.A0E(r0.A0N);
        AnonymousClass11E r25 = r16;
        AnonymousClass190 r15 = r19;
        AnonymousClass11S r162 = r7;
        C20114A7x a7x = (C20114A7x) C18070vi.A0E(r0.A0I);
        C185579co r192 = r11;
        A00(new C168528j2(r15, r162, r17, a7x, r192, (A0W) C18070vi.A0E(r12), r10, r222, bam2, r27, r25, r26, r3, r22, a0g, (AnonymousClass1OZ) C18070vi.A0E(r2), a2u, (C199279zj) AnonymousClass8BS.A0a(r0.A0S), r9, (AnonymousClass4S5) C18070vi.A0E(r0.A0R), r122), this);
    }

    public final boolean A07(BAQ baq, C195469tO r40) {
        BAQ baq2 = baq;
        C18070vi.A0d(baq2, 1);
        C188869i8 r0 = (C188869i8) this.A02.get();
        AnonymousClass00H r2 = r0.A0O;
        C20004A2u a2u = r0.A0E;
        AnonymousClass00H r3 = r0.A0I;
        C26911Ty r37 = r0.A06;
        A6T a6t = new A6T(r0.A0L);
        AnonymousClass11E r20 = r0.A08;
        C19949A0g a0g = r0.A0D;
        C195469tO r27 = r40;
        C167848hs r15 = new C167848hs(r37, (C20114A7x) C18070vi.A0E(r3), baq2, a6t, r20, r27, a0g, (AnonymousClass1OZ) C18070vi.A0E(r2), a2u);
        AnonymousClass00H r1 = r0.A0M;
        AnonymousClass10I r152 = r0.A0H;
        C185579co r12 = r0.A07;
        C186499eI r11 = new C186499eI(r12, (A0W) C18070vi.A0E(r1));
        C138476x9 r10 = r0.A0G;
        AnonymousClass11S r8 = r0.A05;
        C18030ve r32 = r0.A09;
        C131206ki r22 = r0.A0B;
        A0W a0w = (A0W) C18070vi.A0E(r1);
        C186499eI r222 = r11;
        C196209ud r23 = (C196209ud) C18070vi.A0E(r0.A0N);
        BAQ baq3 = baq2;
        AnonymousClass11E r26 = r20;
        return A00(new C168538j3(r8, r37, (C20114A7x) C18070vi.A0E(r3), (CatalogManager) C18070vi.A0E(r0.A0J), r12, a0w, r222, r23, baq3, r15, r26, r27, r32, r22, a0g, (AnonymousClass1OZ) C18070vi.A0E(r2), a2u, (C199279zj) AnonymousClass8BS.A0a(r0.A0S), r10, (AnonymousClass4S5) C18070vi.A0E(r0.A0R), r152), this);
    }

    public static final boolean A00(C172588tf r3, A5Q a5q) {
        if (AnonymousClass8BS.A1N(a5q.A01.A00)) {
            try {
                JSONObject A15 = C17880vN.A15();
                A15.put("code", 2498048);
                A15.put("description", "Commerce features are not available.");
                r3.A03(new C1404571m(A15), 451);
                return true;
            } catch (JSONException e) {
                Log.e(e.getMessage());
                r3.Bsw(e);
                return true;
            }
        } else if (r3 instanceof C168508j0) {
            C168508j0 r32 = (C168508j0) r3;
            if (!r32.A05.A09()) {
                r32.A03.Btx(-1);
                return true;
            }
            C195689tk r2 = r32.A02;
            if (r2.A05 == null) {
                r32.A08.A03("view_collection_details_tag");
            }
            r32.A05();
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("GetSingleCollectionGraphQLService/sendRequest jid=");
            A10.append(r2.A04);
            C17890vO.A1A(A10, " success");
            return true;
        } else if (r3 instanceof C168548j4) {
            C168548j4 r33 = (C168548j4) r3;
            if (!r33.A07.A09()) {
                return true;
            }
            C172588tf.A02(r33, r33.A04.A01);
            return true;
        } else if (r3 instanceof C168538j3) {
            C168538j3 r34 = (C168538j3) r3;
            if (!r34.A06.A09()) {
                r34.A04.Bu8(r34.A07, -1);
                return true;
            }
            C172588tf.A02(r34, r34.A07.A01);
            return true;
        } else if (r3 instanceof C168528j2) {
            C168528j2 r35 = (C168528j2) r3;
            if (!r35.A07.A09()) {
                Log.i("GetProductCatalogGraphQLService/sendRequest failed : no network access");
                return true;
            }
            C172588tf.A02(r35, r35.A08.A08);
            return true;
        } else if (r3 instanceof C168518j1) {
            C168518j1 r36 = (C168518j1) r3;
            if (!r36.A06.A09()) {
                r36.A02.A01(r36.A04, -1);
                return true;
            }
            C172588tf.A02(r36, r36.A04.A05);
            return true;
        } else if (r3 instanceof C168488iy) {
            C168488iy r37 = (C168488iy) r3;
            if (!r37.A04.A09()) {
                r37.A03.Btm(r37.A01, -1);
                return true;
            }
            C172588tf.A02(r37, r37.A01.A02);
            return true;
        } else {
            C168498iz r38 = (C168498iz) r3;
            if (!r38.A03.A09()) {
                C168498iz.A00(r38, -1);
                return true;
            }
            r38.A05();
            return true;
        }
    }

    public final Object A02(C195689tk r16, C30391dr r17) {
        C188869i8 r2 = (C188869i8) this.A02.get();
        C195689tk r8 = r16;
        C18070vi.A0d(r8, 0);
        AnonymousClass10E r1 = r2.A03.A00.A00;
        CoroutineDirectConnectionHelper A2j = AnonymousClass10E.A2j(r1);
        C138476x9 AHh = AnonymousClass10E.AHh(r1);
        AnonymousClass11S A17 = AnonymousClass10E.A17(r1);
        C131206ki r10 = (C131206ki) r1.A4D.get();
        C20004A2u A0W = AnonymousClass8BT.A0W(r1);
        AnonymousClass11E A0d = AnonymousClass3MZ.A0d(r1);
        CoroutineGetSingleCollectionGraphQLService coroutineGetSingleCollectionGraphQLService = new CoroutineGetSingleCollectionGraphQLService(A17, A2j, (A0W) C18070vi.A0E(r2.A0P), (C196209ud) r1.A8m.get(), r8, A0d, r10, A0W, (C199279zj) r1.A1v.get(), AHh, (AnonymousClass4S5) r1.ABW.get());
        if (AnonymousClass8BS.A1N(this.A01.A00)) {
            return new C168408io(r8, 2498048);
        }
        return C30451dy.A00(r17, C23761Hn.A01, new BaseCoroutineGraphQLRequestService$send$2(coroutineGetSingleCollectionGraphQLService, (C30391dr) null));
    }

    public final void A03(C195149ss r13, B7E b7e) {
        C188869i8 r1 = (C188869i8) this.A02.get();
        AnonymousClass10I r11 = r1.A0H;
        C185579co r2 = r1.A07;
        C186499eI r4 = new C186499eI(r2, (A0W) C18070vi.A0E(r1.A0P));
        C138476x9 r9 = r1.A0G;
        C196209ud r5 = (C196209ud) C18070vi.A0E(r1.A0N);
        AnonymousClass11E r7 = r1.A08;
        A00(new C168488iy(r13, r2, (A0W) C18070vi.A0E(r1.A0M), r4, r5, b7e, r7, (C199279zj) AnonymousClass8BS.A0a(r1.A0S), r9, (AnonymousClass4S5) C18070vi.A0E(r1.A0R), r11), this);
    }

    public final void A04(A20 a20, B7I b7i) {
        C188869i8 r0 = (C188869i8) this.A02.get();
        AnonymousClass00H r2 = r0.A0O;
        AnonymousClass1OZ A0U = C17880vN.A0U(r2);
        C26911Ty r36 = r0.A06;
        C183479Yk r19 = r0.A0F;
        A6T a6t = new A6T(r0.A0L, 1);
        AnonymousClass190 r18 = r0.A00;
        A20 a202 = a20;
        UserJid userJid = a202.A01;
        String str = a202.A03;
        String str2 = a202.A02;
        List list = a202.A04;
        C19949A0g a0g = r0.A0D;
        B7I b7i2 = b7i;
        C167868hu r24 = new C167868hu(r18, r36, b7i2, a6t, userJid, a0g, A0U, r19, str, str2, list);
        AnonymousClass00H r3 = r0.A0M;
        AnonymousClass10I r16 = r0.A0H;
        C185579co r11 = r0.A07;
        C186499eI r10 = new C186499eI(r11, (A0W) C18070vi.A0E(r3));
        C138476x9 r15 = r0.A0G;
        C20004A2u a2u = r0.A0E;
        AnonymousClass11E r5 = r0.A08;
        C18030ve r4 = r0.A09;
        AnonymousClass11S r32 = r0.A05;
        C131206ki r22 = r0.A0C;
        AnonymousClass10I r35 = r16;
        C186499eI r20 = r10;
        C196209ud r21 = (C196209ud) C18070vi.A0E(r0.A0N);
        A20 a203 = a202;
        AnonymousClass11E r25 = r5;
        C18030ve r26 = r4;
        AnonymousClass190 r152 = r18;
        AnonymousClass11S r162 = r32;
        C26911Ty r17 = r36;
        C185579co r182 = r11;
        A0W a0w = (A0W) C18070vi.A0E(r3);
        A00(new C168548j4(r152, r162, r17, r182, a0w, r20, r21, a203, b7i2, r24, r25, r26, r22, a0g, (AnonymousClass1OZ) C18070vi.A0E(r2), a2u, r19, (C199279zj) AnonymousClass8BS.A0a(r0.A0S), r15, (AnonymousClass4S5) C18070vi.A0E(r0.A0R), r35), this);
    }

    public final void A06(C195689tk r22, BAP bap) {
        C188869i8 r7 = (C188869i8) this.A02.get();
        C20004A2u a2u = r7.A0E;
        AnonymousClass11E r5 = r7.A08;
        C20027A3w a3w = new C20027A3w(new A6T(r7.A0L));
        C195689tk r9 = r22;
        BAP bap2 = bap;
        C167818hp r11 = new C167818hp(r7.A06, r9, a3w, bap2, r5, r7.A0D, (AnonymousClass1OZ) C18070vi.A0E(r7.A0O), a2u, (C195049si) C18070vi.A0E(r7.A0Q));
        C182859Vz r3 = r7.A02;
        C186499eI r72 = new C186499eI(r7.A07, (A0W) C18070vi.A0E(r7.A0M));
        AnonymousClass10E r32 = r3.A00.A00;
        AnonymousClass10I AL1 = AnonymousClass10E.AL1(r32);
        C185579co A2k = AnonymousClass10E.A2k(r32);
        C138476x9 AHh = AnonymousClass10E.AHh(r32);
        C20004A2u A0W = AnonymousClass8BT.A0W(r32);
        AnonymousClass11E A0d = AnonymousClass3MZ.A0d(r32);
        A00(new C168508j0(AnonymousClass10E.A17(r32), A2k, r72, (C196209ud) r32.A8m.get(), r9, bap2, r11, A0d, AnonymousClass10E.A8r(r32), (C131206ki) r32.A4D.get(), A0W, (C199279zj) r32.A1v.get(), AHh, (AnonymousClass4S5) r32.ABW.get(), AL1), this);
    }

    public A5Q(AnonymousClass11S r1, C19949A0g a0g, AnonymousClass00H r3) {
        C18070vi.A0o(r3, a0g, r1);
        this.A02 = r3;
        this.A01 = a0g;
        this.A00 = r1;
    }

    public static boolean A01(AnonymousClass1BI r1, C18100vl r2) {
        return ((A5Q) r2.getValue()).A00.A0O(r1);
    }
}
