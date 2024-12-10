package X;

import com.whatsapp.community.iq.GetGroupProfilePicturesProtocolHelper;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager;
import com.whatsapp.group.GetSubgroupsManager;
import com.whatsapp.group.iq.GetGroupInfoProtocolHelper;

/* renamed from: X.4g5  reason: invalid class name and case insensitive filesystem */
public class C91684g5 implements C24051Ir {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C84284Iw A01;
    public final /* synthetic */ C88114Yj A02;
    public final /* synthetic */ AnonymousClass1EC A03;

    public C91684g5(C84284Iw r1, C88114Yj r2, AnonymousClass1EC r3, int i) {
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A00 = i;
    }

    public AnonymousClass1J2 BG9(Class cls) {
        long j;
        C84284Iw r2 = this.A01;
        C88114Yj r0 = this.A02;
        C88114Yj r59 = r0;
        C93914jk r1 = new C93914jk(r0);
        AnonymousClass1EC r21 = this.A03;
        int i = this.A00;
        AnonymousClass1K2 r12 = r2.A00;
        AnonymousClass10E r02 = r12.A01;
        AnonymousClass11P A6O = AnonymousClass10E.A6O(r02);
        C18030ve A8r = AnonymousClass10E.A8r(r02);
        AnonymousClass190 A0N = AnonymousClass3MY.A0N(r02);
        AnonymousClass10I AL1 = AnonymousClass10E.AL1(r02);
        AnonymousClass1CJ A0d = AnonymousClass3Ma.A0d(r02);
        C28401aA r17 = (C28401aA) r02.A7b.get();
        C25011Mn A0y = AnonymousClass3MZ.A0y(r02);
        AnonymousClass1MG r16 = (AnonymousClass1MG) r02.AAY.get();
        AnonymousClass1M9 A4z = AnonymousClass10E.A4z(r02);
        C24921Me A0g = AnonymousClass3MZ.A0g(r02);
        AnonymousClass122 A0n = AnonymousClass3MZ.A0n(r02);
        AnonymousClass1W6 A0s = AnonymousClass3Ma.A0s(r02);
        AnonymousClass126 A0X = AnonymousClass3MY.A0X(r02);
        AnonymousClass12M A0h = AnonymousClass3Ma.A0h(r02);
        C24681Lg A0o = AnonymousClass3MZ.A0o(r02);
        C42211xo A0i = AnonymousClass3Ma.A0i(r02);
        C34511kb A0b = AnonymousClass3MZ.A0b(r02);
        AnonymousClass1NN A0e = AnonymousClass3Ma.A0e(r02);
        AnonymousClass1MZ A0V = AnonymousClass3MY.A0V(r02);
        AnonymousClass10G r22 = r02.A00;
        AnonymousClass1K1 r13 = r12.A00;
        C187239fU A0n2 = AnonymousClass1K1.A0n(r13);
        GetGroupInfoProtocolHelper ACz = AnonymousClass10E.ACz(r02);
        C77033p1 r19 = new C77033p1(A0N, (AnonymousClass4Ix) r13.A1X.get(), (C56352hK) r13.A1Y.get(), A0b, A0n2, r1, (C87834Xg) r22.A2x.get(), (GetGroupProfilePicturesProtocolHelper) r02.A4X.get(), (MemberSuggestedGroupsManager) r02.A6F.get(), (C57792je) r22.A0v.get(), (C58672l4) r02.A2O.get(), A4z, A0g, A6O, A0d, A0e, A0n, (AnonymousClass1QB) r02.A4T.get(), A0V, (AnonymousClass1R3) r02.A5f.get(), A0o, (AnonymousClass4XG) r02.AAX.get(), (C88194Yr) r02.A3m.get(), A8r, (GetSubgroupsManager) r02.A4a.get(), A0X, A0h, r16, (C26211Rg) r02.AAZ.get(), ACz, A0i, r21, A0y, r17, (C27001Ui) r02.A8p.get(), A0s, AL1, (AnonymousClass1OX) r02.A9C.get(), i);
        int i2 = r59.A00;
        r19.A00 = i2;
        AnonymousClass4Ix r23 = r19.A0K;
        r19.A00 = new C93924jl(new C91264fP(r19, 0), AnonymousClass10E.A6Q(r23.A00.A01), new C98754rf(r19, 20), i2);
        r19.A0T();
        C29691ci A0A = r19.A0Z.A0A(r19.A0q);
        r19.A03 = A0A;
        if (A0A != null) {
            synchronized (A0A) {
                j = A0A.A0L;
            }
            r19.A01 = j;
        }
        C200710s r5 = r19.A10;
        C98754rf.A00(r5, r19, 21);
        if (r19.A0P.A00.A0H) {
            C17900vP.A0Y(r19, "CommunitySubgroupsViewModel/updateActivitySeen: ", AnonymousClass000.A10());
            C98754rf.A00(r5, r19, 19);
        }
        AnonymousClass10I r4 = r19.A15;
        C98754rf.A01(r4, r19, 22);
        C98754rf.A00(r5, r19, 18);
        if (C18020vd.A05(C18040vf.A02, r19.A0i, 5563)) {
            C98754rf.A00(r5, r19, 17);
        }
        C98754rf.A01(r4, r19, 23);
        return r19;
    }

    public /* synthetic */ AnonymousClass1J2 BGl(C24091Iv r2, Class cls) {
        return C72453Mb.A0a(this, cls);
    }
}
