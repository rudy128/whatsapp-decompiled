package com.whatsapp.avatar.profilephoto;

import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass11S;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1KB;
import X.AnonymousClass1OX;
import X.AnonymousClass3MW;
import X.AnonymousClass6EH;
import X.AnonymousClass70I;
import X.AnonymousClass7L4;
import X.AnonymousClass822;
import X.C108945cZ;
import X.C108975cc;
import X.C115445u1;
import X.C115455u2;
import X.C115475u4;
import X.C122416Qe;
import X.C137816w4;
import X.C138596xL;
import X.C140026zp;
import X.C1588682i;
import X.C17880vN;
import X.C18070vi;
import X.C18460wS;
import X.C18600wl;
import X.C19740yt;
import X.C201811d;
import X.C27071Up;
import X.C30391dr;
import X.C41731wy;
import X.C70843Cs;
import X.C72453Mb;
import X.C72473Md;
import java.util.List;
import java.util.NoSuchElementException;

public final class AvatarProfilePhotoViewModel extends AnonymousClass1J2 {
    public final AnonymousClass1DT A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass11S A02;
    public final C27071Up A03;
    public final C41731wy A04;
    public final AnonymousClass10I A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A = C201811d.A00(65542);
    public final AnonymousClass00H A0B;
    public final AnonymousClass7L4 A0C;
    public final AnonymousClass00H A0D;
    public final List A0E;
    public final C18600wl A0F;
    public final AnonymousClass1OX A0G;

    public static final void A00(AvatarProfilePhotoViewModel avatarProfilePhotoViewModel) {
        C115455u2[] r4 = new C115455u2[5];
        r4[0] = new C115455u2(Integer.valueOf(C19740yt.A00(((C137816w4) avatarProfilePhotoViewModel.A09.get()).A00.A00.getApplicationContext(), 2131101133)), true);
        r4[1] = new C115455u2((Integer) null, false);
        r4[2] = new C115455u2((Integer) null, false);
        r4[3] = new C115455u2((Integer) null, false);
        List A0O = C18070vi.A0O(new C115455u2((Integer) null, false), r4, 4);
        List<C115475u4> list = avatarProfilePhotoViewModel.A0E;
        for (C115475u4 r42 : list) {
            if (r42.A03) {
                avatarProfilePhotoViewModel.A00.A0F(new C140026zp(r42, (C115445u1) null, A0O, list, false, true, false));
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public AvatarProfilePhotoViewModel(AnonymousClass1KB r13, AnonymousClass11S r14, C27071Up r15, AnonymousClass10I r16, AnonymousClass00H r17, AnonymousClass00H r18, AnonymousClass00H r19, AnonymousClass00H r20, AnonymousClass00H r21, AnonymousClass00H r22, C18600wl r23, AnonymousClass1OX r24) {
        AnonymousClass10I r8 = r16;
        AnonymousClass00H r7 = r17;
        C18070vi.A0w(r13, r14, r8, r7, r15);
        C18600wl r4 = r23;
        AnonymousClass1OX r0 = r24;
        AnonymousClass00H r3 = r18;
        AnonymousClass00H r2 = r19;
        AnonymousClass00H r6 = r20;
        C18070vi.A0x(r3, r2, r4, r6, r0);
        AnonymousClass00H r1 = r21;
        AnonymousClass00H r5 = r22;
        C72473Md.A1L(r1, r5);
        this.A01 = r13;
        this.A02 = r14;
        this.A05 = r8;
        this.A07 = r7;
        this.A03 = r15;
        this.A0D = r3;
        this.A06 = r2;
        this.A0F = r4;
        this.A08 = r6;
        this.A0G = r0;
        this.A09 = r1;
        this.A0B = r5;
        C18460wS r72 = C18460wS.A00;
        this.A00 = AnonymousClass3MW.A0M(new C140026zp((C115475u4) null, (C115445u1) null, r72, r72, false, false, false));
        this.A04 = AnonymousClass3MW.A0o();
        C137816w4 r62 = (C137816w4) r1.get();
        C115475u4[] r52 = new C115475u4[7];
        r52[0] = C137816w4.A00(r62, 2131101122, 2131101133, 2131886858, true);
        r52[1] = C137816w4.A00(r62, 2131101125, 2131101136, 2131886853, false);
        r52[2] = C137816w4.A00(r62, 2131101126, 2131101137, 2131886854, false);
        r52[3] = C137816w4.A00(r62, 2131101127, 2131101138, 2131886859, false);
        r52[4] = C137816w4.A00(r62, 2131101128, 2131101139, 2131886856, false);
        r52[5] = C137816w4.A00(r62, 2131101129, 2131101140, 2131886857, false);
        this.A0E = C18070vi.A0O(C137816w4.A00(r62, 2131101130, 2131101141, 2131886855, false), r52, 6);
        AnonymousClass7L4 r02 = new AnonymousClass7L4(this, 0);
        this.A0C = r02;
        C72453Mb.A1Q(r3, r02);
        A00(this);
        if (C108975cc.A1I(r2)) {
            A03(this, "profile_photo_tool", 0, false);
        } else {
            this.A04.A0F(C122416Qe.AVATAR_EDITOR);
        }
    }

    public static final void A03(AvatarProfilePhotoViewModel avatarProfilePhotoViewModel, String str, int i, boolean z) {
        AnonymousClass00H r2 = avatarProfilePhotoViewModel.A08;
        int A012 = C108945cZ.A0q(r2).A01();
        AnonymousClass70I.A00(C108945cZ.A0q(r2), r2, "fetch_poses", A012).A06(AnonymousClass6EH.A00, str, A012);
        C138596xL r22 = (C138596xL) avatarProfilePhotoViewModel.A0B.get();
        r22.A01.CGN(new C70843Cs((Object) r22, (Object) new C1588682i(avatarProfilePhotoViewModel, i, A012), (Object) new AnonymousClass822(avatarProfilePhotoViewModel, A012), A012, 7, z));
    }

    public static final void A04(AvatarProfilePhotoViewModel avatarProfilePhotoViewModel, boolean z) {
        AnonymousClass1DT r1 = avatarProfilePhotoViewModel.A00;
        C140026zp A0D2 = C108975cc.A0D(r1);
        List list = A0D2.A03;
        List list2 = A0D2.A02;
        C115475u4 r3 = A0D2.A00;
        C115445u1 r4 = A0D2.A01;
        boolean z2 = A0D2.A05;
        if (z) {
            boolean z3 = A0D2.A04;
            C18070vi.A0j(list, list2);
            r1.A0E(new C140026zp(r3, r4, list, list2, false, z2, z3));
            avatarProfilePhotoViewModel.A04.A0E(C122416Qe.CLOSE_SCREEN);
            return;
        }
        C18070vi.A0e(list, 1, list2);
        r1.A0E(new C140026zp(r3, r4, list, list2, false, z2, true));
    }

    public void A0S() {
        C17880vN.A0V(this.A0D).unregisterObserver(this.A0C);
        AnonymousClass3MW.A1X(this.A0F, new AvatarProfilePhotoViewModel$onCleared$1(this, (C30391dr) null), this.A0G);
    }
}
