package X;

import android.util.SparseIntArray;
import com.whatsapp.communitymedia.CommunityMediaViewModel$itemListFlow$1;
import com.whatsapp.communitymedia.CommunityMediaViewModel$itemListFlow$2;
import com.whatsapp.communitymedia.CommunityMediaViewModel$onInputBackClick$1;
import com.whatsapp.communitymedia.CommunityMediaViewModel$refreshSubgroups$1;
import com.whatsapp.jid.GroupJid;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3Vg  reason: invalid class name and case insensitive filesystem */
public final class C73373Vg extends AnonymousClass1J2 implements C108625c1 {
    public Integer A00;
    public final AnonymousClass1DS A01;
    public final AnonymousClass1DS A02;
    public final C22801Dg A03;
    public final C22801Dg A04;
    public final C22801Dg A05;
    public final C22801Dg A06;
    public final AnonymousClass1DT A07;
    public final AnonymousClass1DT A08;
    public final C61842qN A09;
    public final C56352hK A0A;
    public final AnonymousClass11S A0B;
    public final C107955at A0C;
    public final C34511kb A0D;
    public final C77353pv A0E;
    public final C77413q1 A0F;
    public final C77413q1 A0G;
    public final C77443q4 A0H;
    public final C77383py A0I;
    public final C77473q7 A0J;
    public final AnonymousClass1M9 A0K;
    public final C24921Me A0L;
    public final AnonymousClass118 A0M;
    public final AnonymousClass1CJ A0N;
    public final AnonymousClass1QB A0O;
    public final C36391no A0P;
    public final AnonymousClass1EC A0Q;
    public final C32011gU A0R;
    public final C18100vl A0S;
    public final C18100vl A0T = AnonymousClass1DF.A01(new AnonymousClass5FX(this));
    public final C18600wl A0U;
    public final C18600wl A0V;
    public final C108485bm A0W;
    public final C108485bm A0X;
    public final C108485bm A0Y;
    public final C108485bm A0Z;
    public final C108485bm A0a;
    public final C108485bm A0b;
    public final C108485bm A0c;
    public final C108485bm A0d;
    public final C23421Fz A0e;
    public final C23421Fz A0f;
    public final C23421Fz A0g;
    public final C23421Fz A0h;
    public final C23421Fz A0i;
    public final C23421Fz A0j;
    public final C23421Fz A0k;
    public final C23421Fz A0l;
    public final AnonymousClass1G4 A0m;
    public final AnonymousClass1G4 A0n;
    public final AnonymousClass1G4 A0o;
    public final AnonymousClass1G4 A0p;
    public final AnonymousClass1G4 A0q;
    public final AnonymousClass1G4 A0r;
    public final AnonymousClass1G1 A0s;
    public final AnonymousClass1G1 A0t;
    public final AnonymousClass1G1 A0u;
    public final AnonymousClass1G1 A0v;
    public final boolean A0w;
    public final C23421Fz A0x;
    public final C23421Fz A0y;

    public final AnonymousClass4ZN A0U(AnonymousClass206 r4) {
        GroupJid groupJid;
        C18070vi.A0d(r4, 0);
        AnonymousClass1BI r2 = r4.A0v.A00;
        if (!(r2 instanceof GroupJid) || (groupJid = (GroupJid) r2) == null) {
            return null;
        }
        return A00(this, groupJid);
    }

    public final boolean A0W(AnonymousClass206 r5) {
        Object value;
        LinkedHashMap A082;
        Object value2;
        LinkedHashMap A083;
        if (this.A0w) {
            return false;
        }
        AnonymousClass1G4 r3 = this.A0q;
        AnonymousClass205 r2 = r5.A0v;
        C18070vi.A0W(r2);
        if (((Map) r3.getValue()).containsKey(r2)) {
            do {
                value2 = r3.getValue();
                A083 = AnonymousClass1D7.A08((Map) value2);
                A083.remove(r2);
            } while (!r3.BFK(value2, A083));
            return true;
        }
        do {
            value = r3.getValue();
            A082 = AnonymousClass1D7.A08((Map) value);
            A082.put(r2, r5);
        } while (!r3.BFK(value, A082));
        return true;
    }

    public /* synthetic */ void BlK() {
    }

    public /* synthetic */ void C2N(boolean z) {
    }

    public /* synthetic */ void C30(boolean z) {
    }

    public /* synthetic */ void C4j() {
    }

    public /* synthetic */ void C4k() {
    }

    public /* synthetic */ void C54() {
    }

    public /* synthetic */ void C5p() {
    }

    public /* synthetic */ void CPX() {
    }

    public static final AnonymousClass4ZN A00(C73373Vg r1, GroupJid groupJid) {
        String A0K2;
        if (r1.A0N.A0R(groupJid)) {
            return C72453Mb.A0q(2131888506);
        }
        AnonymousClass1E7 A0E2 = r1.A0K.A0E(groupJid);
        if (A0E2 == null || (A0K2 = A0E2.A0K()) == null) {
            return null;
        }
        return new AnonymousClass482(A0K2);
    }

    public static final void A03(C73373Vg r4) {
        if (!r4.A0w) {
            AnonymousClass3MW.A1X(r4.A0U, new CommunityMediaViewModel$refreshSubgroups$1(r4, (C30391dr) null), C41561wd.A00(r4));
        }
    }

    public static final boolean A04(C73373Vg r4, AnonymousClass206 r5) {
        Object value;
        LinkedHashMap A082;
        Object value2;
        LinkedHashMap A083;
        AnonymousClass1G4 r42 = r4.A0q;
        AnonymousClass205 r3 = r5.A0v;
        C18070vi.A0W(r3);
        if (((Map) r42.getValue()).containsKey(r3)) {
            do {
                value = r42.getValue();
                A082 = AnonymousClass1D7.A08((Map) value);
                A082.remove(r3);
            } while (!r42.BFK(value, A082));
            return true;
        } else if (!(!((Map) r42.getValue()).isEmpty())) {
            return false;
        } else {
            do {
                value2 = r42.getValue();
                A083 = AnonymousClass1D7.A08((Map) value2);
                A083.put(r3, r5);
            } while (!r42.BFK(value2, A083));
            return true;
        }
    }

    public void A0S() {
        ((AnonymousClass4Xp) this.A0S.getValue()).A02(this.A0C);
    }

    public final C27183DXs A0T() {
        C23421Fz r8 = this.A0y;
        C23421Fz r7 = this.A0x;
        AnonymousClass1G4 r6 = this.A0n;
        AnonymousClass1G4 r4 = this.A0q;
        AnonymousClass1G4 r3 = this.A0p;
        CommunityMediaViewModel$itemListFlow$1 communityMediaViewModel$itemListFlow$1 = new CommunityMediaViewModel$itemListFlow$1(this, (C30391dr) null);
        C23421Fz[] r1 = new C23421Fz[5];
        C17900vP.A0O(r8, r7, r6, r4, r1);
        r1[4] = r3;
        return new C27183DXs((AnonymousClass1OS) new CommunityMediaViewModel$itemListFlow$2(this, (C30391dr) null), C26092CsA.A02(AnonymousClass4I5.A00(this.A0U, AnonymousClass4I6.A00(new AnonymousClass5UU(150), new C99464sr(communityMediaViewModel$itemListFlow$1, r1, 10)))), 10);
    }

    public final void A0V() {
        this.A03.A0F("");
        this.A0p.setValue(C82914Cq.IDLE);
        AnonymousClass3MX.A1J(this.A07, 109);
        AnonymousClass3MX.A1Q(new CommunityMediaViewModel$onInputBackClick$1(this, (C30391dr) null), C41561wd.A00(this));
    }

    public void Bok() {
        this.A03.A0F("");
        AnonymousClass3MX.A1J(this.A07, 109);
    }

    public void C4n() {
        AnonymousClass3MX.A1J(this.A07, 109);
    }

    public void CKI(String str) {
        C22801Dg r1 = this.A03;
        if (!C18070vi.A18(str, r1.A06())) {
            r1.A0F(str);
        }
    }

    public C73373Vg(C61842qN r20, C56352hK r21, AnonymousClass11S r22, C34511kb r23, AnonymousClass1M9 r24, C24921Me r25, AnonymousClass118 r26, AnonymousClass1CJ r27, AnonymousClass1QB r28, C36391no r29, AnonymousClass1EC r30, C32011gU r31, C18600wl r32, C18600wl r33, boolean z) {
        C82914Cq r7;
        C18600wl r15 = r32;
        C18600wl r0 = r33;
        int A0G2 = C72453Mb.A0G(r15, r0, 1);
        C56352hK r17 = r21;
        C18070vi.A0d(r17, 3);
        AnonymousClass1CJ r10 = r27;
        AnonymousClass11S r16 = r22;
        C18070vi.A0g(r16, 4, r10);
        AnonymousClass118 r11 = r26;
        C36391no r8 = r29;
        C32011gU r6 = r31;
        C34511kb r14 = r23;
        AnonymousClass1M9 r13 = r24;
        C18070vi.A0x(r14, r11, r6, r8, r13);
        AnonymousClass1QB r9 = r28;
        C24921Me r12 = r25;
        C61842qN r18 = r20;
        C18070vi.A0r(r9, r18, r12);
        AnonymousClass1EC r72 = r30;
        C18070vi.A0d(r72, 14);
        this.A0U = r15;
        this.A0V = r0;
        this.A0A = r17;
        this.A0B = r16;
        this.A0N = r10;
        this.A0D = r14;
        this.A0M = r11;
        this.A0R = r6;
        this.A0P = r8;
        this.A0K = r13;
        this.A0O = r9;
        this.A09 = r18;
        this.A0L = r12;
        this.A0Q = r72;
        this.A0w = z;
        C22801Dg r02 = new C22801Dg();
        this.A03 = r02;
        this.A01 = r02;
        this.A07 = AnonymousClass3MW.A0M(109);
        C22801Dg r03 = new C22801Dg();
        this.A04 = r03;
        this.A02 = r03;
        this.A05 = new C22801Dg();
        this.A06 = new C22801Dg();
        this.A08 = AnonymousClass3MW.A0L();
        C22801Dg r04 = ((C134156q8) this.A0T.getValue()).A01;
        C18070vi.A0X(r04);
        this.A0y = C87324Vd.A01(r04);
        AnonymousClass1DT r05 = ((C134156q8) this.A0T.getValue()).A04;
        C18070vi.A0X(r05);
        this.A0x = C87324Vd.A01(r05);
        this.A0n = C34071js.A00(C18460wS.A00);
        AnonymousClass1G7 A18 = AnonymousClass3MW.A18(C17880vN.A13());
        this.A0q = A18;
        this.A0u = A18;
        AnonymousClass1G7 A182 = AnonymousClass3MW.A18(AnonymousClass4IV.A01);
        this.A0m = A182;
        this.A0s = A182;
        AnonymousClass1G7 A183 = AnonymousClass3MW.A18(false);
        this.A0o = A183;
        this.A0t = A183;
        C82914Cq r82 = C82914Cq.IDLE;
        this.A0p = AnonymousClass3MW.A18(r82);
        if (!((Map) this.A0q.getValue()).isEmpty()) {
            r7 = C82914Cq.SEARCH_WITH_ACTIONS;
        } else {
            Object value = this.A0p.getValue();
            r7 = C82914Cq.SEARCH;
            if (value != r7) {
                r7 = r82;
            }
        }
        AnonymousClass1G7 r06 = new AnonymousClass1G7(r7);
        this.A0r = r06;
        this.A0v = r06;
        C27178DXn dXn = new C27178DXn(0);
        this.A0d = dXn;
        this.A0l = AnonymousClass4WB.A01(dXn);
        C27178DXn dXn2 = new C27178DXn(0);
        this.A0b = dXn2;
        this.A0j = AnonymousClass4WB.A01(dXn2);
        C27178DXn dXn3 = new C27178DXn(0);
        this.A0a = dXn3;
        this.A0i = AnonymousClass4WB.A01(dXn3);
        C27178DXn dXn4 = new C27178DXn(0);
        this.A0Z = dXn4;
        this.A0h = AnonymousClass4WB.A01(dXn4);
        C27178DXn dXn5 = new C27178DXn(0);
        this.A0c = dXn5;
        this.A0k = AnonymousClass4WB.A01(dXn5);
        C27178DXn dXn6 = new C27178DXn(0);
        this.A0X = dXn6;
        this.A0f = AnonymousClass4WB.A01(dXn6);
        C27178DXn dXn7 = new C27178DXn(0);
        this.A0Y = dXn7;
        this.A0g = AnonymousClass4WB.A01(dXn7);
        C27178DXn dXn8 = new C27178DXn(0);
        this.A0W = dXn8;
        this.A0e = AnonymousClass4WB.A01(dXn8);
        this.A0S = AnonymousClass1DF.A01(new AnonymousClass5FW(this));
        this.A0C = new C93884jh(this, 1);
        this.A0F = new C77413q1(new C94014ju(2131888619));
        this.A0G = new C77413q1(new C94014ju(2131888621));
        this.A0E = new C77353pv();
        this.A0I = new C77383py();
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(105, 4);
        sparseIntArray.put(118, 3);
        sparseIntArray.put(AnonymousClass74N.A03, A0G2);
        sparseIntArray.put(100, 1);
        this.A0H = new C77443q4(new C94044jx(sparseIntArray, AnonymousClass3MW.A16(this, 35)));
        this.A0J = new C77473q7(new C94034jw(new C135676sa(new C105245Rg(this), 2131895529, 0, 0)));
    }
}
