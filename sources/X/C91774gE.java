package X;

import com.whatsapp.community.CommunityMembersViewModel;
import com.whatsapp.community.CommunityMembersViewModel$init$2;
import com.whatsapp.community.CommunityMembersViewModel$refreshCommunityMembers$1;
import com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel;
import java.util.Collection;

/* renamed from: X.4gE  reason: invalid class name and case insensitive filesystem */
public class C91774gE implements C24051Ir {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C91774gE(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public static C24071It A00(AnonymousClass1FD r2, Object obj, Object obj2, int i) {
        return new C24071It(new C91774gE(obj, obj2, i), r2);
    }

    public AnonymousClass1J2 BG9(Class cls) {
        switch (this.A00) {
            case 0:
                AnonymousClass1K2 r2 = ((C84654Ki) this.A02).A00.A00;
                AnonymousClass10E r1 = r2.A01;
                AnonymousClass00H A002 = C000200d.A00(r1.A14);
                C33251iW A0U = AnonymousClass3MZ.A0U(r1);
                C25811Ps r9 = (C25811Ps) r1.A12.get();
                AnonymousClass00H A003 = C000200d.A00(r1.A11);
                AnonymousClass00H A004 = C000200d.A00(r2.A00.A4k);
                return new AnonymousClass3US(C19890zB.A00, (C446324e) this.A01, A0U, r9, (AnonymousClass1PW) r1.A13.get(), (C25721Pj) r1.A10.get(), (AnonymousClass72A) r1.ABo.get(), A002, A003, A004, C000200d.A00(r1.A3W));
            case 2:
                return new AnonymousClass3TJ((AnonymousClass1EC) this.A02, (C28401aA) ((AnonymousClass4K3) this.A01).A00.A02.A7b.get());
            case 3:
                AnonymousClass10E r22 = ((C93894ji) ((AnonymousClass5X7) this.A01)).A00.A01;
                AnonymousClass11S A17 = AnonymousClass10E.A17(r22);
                C24921Me A0g = AnonymousClass3MZ.A0g(r22);
                AnonymousClass1M9 A4z = AnonymousClass10E.A4z(r22);
                C24671Lf A0S = AnonymousClass3Ma.A0S(r22);
                AnonymousClass1MZ A0V = AnonymousClass3MY.A0V(r22);
                C18600wl A1B = AnonymousClass3MZ.A1B(r22);
                AnonymousClass11E A0d = AnonymousClass3MZ.A0d(r22);
                C25191Ng A0Y = AnonymousClass3MY.A0Y(r22);
                CommunityMembersViewModel communityMembersViewModel = new CommunityMembersViewModel((C59932n7) r22.A05.get(), A17, AnonymousClass10E.A46(r22), AnonymousClass10G.A3L(r22.A00), A0d, A4z, A0S, A0g, A0V, (C27141Uw) r22.A4m.get(), A0Y, (AnonymousClass1EC) this.A02, A1B);
                AnonymousClass1G4 r4 = communityMembersViewModel.A0L;
                do {
                } while (!r4.BFK(r4.getValue(), new AnonymousClass4TF(communityMembersViewModel.A0D.A0K(communityMembersViewModel.A0I) ^ true ? 1 : 0, (Integer) null)));
                C59932n7 r23 = communityMembersViewModel.A06;
                C91914gS r12 = communityMembersViewModel.A09;
                C18070vi.A0d(r12, 0);
                C72453Mb.A1Q(r23.A06, r12);
                communityMembersViewModel.A0C.registerObserver(communityMembersViewModel.A04);
                communityMembersViewModel.A0H.registerObserver(communityMembersViewModel.A05);
                communityMembersViewModel.A0F.A00(communityMembersViewModel.A0E);
                AnonymousClass1OX A005 = C41561wd.A00(communityMembersViewModel);
                C18600wl r24 = communityMembersViewModel.A0J;
                AnonymousClass3MW.A1X(r24, new CommunityMembersViewModel$refreshCommunityMembers$1(communityMembersViewModel, (C30391dr) null), A005);
                AnonymousClass3MW.A1X(r24, new CommunityMembersViewModel$init$2(communityMembersViewModel, (C30391dr) null), C41561wd.A00(communityMembersViewModel));
                return communityMembersViewModel;
            case 4:
                AnonymousClass10E r0 = ((AnonymousClass4J0) this.A01).A00.A01;
                C18030ve A8r = AnonymousClass10E.A8r(r0);
                AnonymousClass10I AL1 = AnonymousClass10E.AL1(r0);
                C24901Mc A0u = AnonymousClass3Ma.A0u(r0);
                AnonymousClass126 A0X = AnonymousClass3MY.A0X(r0);
                C42211xo A0i = AnonymousClass3Ma.A0i(r0);
                C19830z4 A0c = AnonymousClass3Ma.A0c(r0);
                AnonymousClass3Vh r5 = new AnonymousClass3Vh(AnonymousClass3MZ.A0b(r0), A0c, AnonymousClass3MY.A0V(r0), A8r, A0X, A0i, (AnonymousClass1EC) this.A02, A0u, AL1, C000200d.A00(r0.A2q));
                if (C18020vd.A05(C18040vf.A02, r5.A05, 12097)) {
                    C98754rf.A01(r5.A0B, r5, 14);
                    return r5;
                }
                r5.A00.A0E(C77023p0.A00);
                return r5;
            case 7:
                AnonymousClass10E r13 = ((C84314Ja) this.A01).A00.A01;
                AnonymousClass10G r25 = r13.A00;
                C108605by r8 = (C108605by) r25.A3z.get();
                AnonymousClass1LU A0Z = AnonymousClass3MY.A0Z(r13);
                AnonymousClass11C A0a = AnonymousClass3Ma.A0a(r13);
                AnonymousClass11Z r10 = (AnonymousClass11Z) r13.AAV.get();
                C87864Xj r14 = (C87864Xj) r25.A1a.get();
                AnonymousClass10I AL12 = AnonymousClass10E.AL1(r13);
                C18030ve A8r2 = AnonymousClass10E.A8r(r13);
                C218617r r7 = (C218617r) r13.A8v.get();
                return new ChatThemeViewModel((C24781Lq) r13.A46.get(), r7, r8, A0a, r10, A8r2, A0Z, (AnonymousClass1BI) this.A02, r14, (AnonymousClass4aW) r25.A5C.get(), AL12, C000200d.A00(r25.A50), AnonymousClass3MZ.A1B(r13));
            case 8:
                AnonymousClass10E r02 = ((C84274Iv) this.A02).A00.A01;
                C24671Lf A0S2 = AnonymousClass3Ma.A0S(r02);
                C42211xo A0i2 = AnonymousClass3Ma.A0i(r02);
                C73323Un r52 = new C73323Un(A0S2, AnonymousClass3MZ.A0m(r02), (AnonymousClass1E7) this.A01, A0i2);
                C25181Nf r26 = r52.A01;
                AnonymousClass1BI r15 = r52.A00.A0J;
                C22931Dv r03 = AnonymousClass1BI.A00;
                r52.A00 = r26.A01(C22931Dv.A00(r15));
                C73323Un.A00(r52);
                return r52;
            case 9:
                return new AnonymousClass3UG((AnonymousClass1BI) this.A02, (C27131Uv) ((AnonymousClass2XU) this.A01).A00.A01.A5p.get());
            case 10:
                AnonymousClass10E r04 = ((AnonymousClass2XV) this.A01).A00.A01;
                AnonymousClass11P A6O = AnonymousClass10E.A6O(r04);
                C19830z4 A0c2 = AnonymousClass3Ma.A0c(r04);
                return new AnonymousClass3V0(AnonymousClass10E.A12(r04), (AnonymousClass4VJ) this.A02, A6O, A0c2);
            case 12:
                AnonymousClass1J2 r53 = (AnonymousClass1J2) cls.cast(new AnonymousClass3TL(((int[]) this.A02)[0]));
                r53.getClass();
                return r53;
            case 15:
                AnonymousClass10E r27 = ((AnonymousClass4JP) this.A01).A00.A01;
                AnonymousClass10G r16 = r27.A00;
                C175308yV r92 = (C175308yV) r27.A78.get();
                return new AnonymousClass440(AnonymousClass10E.A4z(r27), AnonymousClass3Ma.A0d(r27), (C29681ch) this.A02, r92, (C95424mD) r16.A3T.get(), (C35681md) r27.A7N.get(), (C1601287f) r16.A1p.get());
            default:
                C60282nh.A01();
                throw null;
        }
    }

    public /* synthetic */ AnonymousClass1J2 BGl(C24091Iv r14, Class cls) {
        switch (this.A00) {
            case 1:
                AnonymousClass1K2 r2 = ((C84254It) this.A01).A00;
                AnonymousClass10E r1 = r2.A01;
                AnonymousClass1MZ A0V = AnonymousClass3MY.A0V(r1);
                AnonymousClass11S A17 = AnonymousClass10E.A17(r1);
                AnonymousClass1M9 A4z = AnonymousClass10E.A4z(r1);
                AnonymousClass00H A002 = C000200d.A00(r1.A1D);
                C84204Io r5 = (C84204Io) r2.A00.A1L.get();
                AnonymousClass10I AL1 = AnonymousClass10E.AL1(r1);
                return new C76793oR(C19890zB.A00, r5, A17, A4z, A0V, (AnonymousClass1BI) this.A02, (AnonymousClass4RU) r1.AB0.get(), AL1, A002);
            case 5:
                AnonymousClass1K2 r12 = ((AnonymousClass4J4) this.A01).A00;
                AnonymousClass10E r0 = r12.A01;
                AnonymousClass1M9 A4z2 = AnonymousClass10E.A4z(r0);
                C18600wl A1B = AnonymousClass3MZ.A1B(r0);
                AnonymousClass11E A0d = AnonymousClass3MZ.A0d(r0);
                return new AnonymousClass3To(AnonymousClass1K1.A0o(r12.A00), A0d, A4z2, (AnonymousClass1EC) this.A02, A1B);
            case 6:
                AnonymousClass10E r02 = ((C84324Jb) this.A02).A00.A01;
                AnonymousClass1W6 A0s = AnonymousClass3Ma.A0s(r02);
                return new AnonymousClass3U8(AnonymousClass3MZ.A0o(r02), (AnonymousClass205) this.A01, A0s);
            case 11:
                AnonymousClass10E r13 = ((C84334Jc) this.A01).A00.A01;
                AnonymousClass118 A0l = AnonymousClass3MZ.A0l(r13);
                AnonymousClass1CJ A0d2 = AnonymousClass3Ma.A0d(r13);
                C24681Lg A0o = AnonymousClass3MZ.A0o(r13);
                C88194Yr r8 = (C88194Yr) r13.A3m.get();
                return new C73333Ur(AnonymousClass3MZ.A0b(r13), A0l, A0d2, A0o, r8, (AnonymousClass1BI) this.A02, AnonymousClass3MZ.A1B(r13));
            case 13:
                AnonymousClass1K2 r22 = ((C96404nn) ((C106955Xv) this.A01)).A00;
                AnonymousClass10E r15 = r22.A01;
                C34511kb A0b = AnonymousClass3MZ.A0b(r15);
                C39501tB r9 = (C39501tB) r15.A7s.get();
                AnonymousClass1NN A0e = AnonymousClass3Ma.A0e(r15);
                AnonymousClass1MU r82 = (AnonymousClass1MU) r15.A7v.get();
                AnonymousClass1MZ A0V2 = AnonymousClass3MY.A0V(r15);
                C76803oS r3 = new C76803oS((C84204Io) r22.A00.A1L.get(), A0b, A0e, A0V2, r82, r9, (AnonymousClass1BI) this.A02, (AnonymousClass4RU) r15.AB0.get(), AnonymousClass10E.AL1(r15));
                r3.A0A.registerObserver(r3.A09);
                r3.A06.registerObserver(r3.A05);
                AnonymousClass3MY.A1U(r3.A0H, r3, 43);
                return r3;
            case 14:
                AnonymousClass10E r03 = ((C84394Ji) this.A01).A00.A01;
                AnonymousClass11P A6O = AnonymousClass10E.A6O(r03);
                C18030ve A8r = AnonymousClass10E.A8r(r03);
                return new AnonymousClass3VG(A6O, AnonymousClass3Ma.A0d(r03), A8r, (C29681ch) this.A02, (C35681md) r03.A7N.get());
            case 16:
                AnonymousClass10E r04 = ((AnonymousClass4KD) this.A01).A00.A02;
                return new AnonymousClass3TZ(AnonymousClass3Ma.A0s(r04), (Collection) this.A02, AnonymousClass3MZ.A1B(r04));
            default:
                return C72453Mb.A0a(this, cls);
        }
    }
}
