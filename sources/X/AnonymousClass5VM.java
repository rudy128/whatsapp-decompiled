package X;

import com.whatsapp.communitymedia.CommunityMediaViewModel$initialize$1;
import com.whatsapp.communitymedia.CommunityMediaViewModel$observePages$1;
import com.whatsapp.communitymedia.CommunityMediaViewModel$refreshName$1;

/* renamed from: X.5VM  reason: invalid class name */
public final class AnonymousClass5VM extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass5XF $assistedFactory;
    public final /* synthetic */ boolean $attachmentPickerMode;
    public final /* synthetic */ AnonymousClass1EC $parentGroup;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5VM(AnonymousClass5XF r2, AnonymousClass1EC r3, boolean z) {
        super(1);
        this.$assistedFactory = r2;
        this.$parentGroup = r3;
        this.$attachmentPickerMode = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass5XF r0 = this.$assistedFactory;
        AnonymousClass1EC r3 = this.$parentGroup;
        boolean z = this.$attachmentPickerMode;
        AnonymousClass1K2 r02 = ((C94074k0) r0).A00;
        AnonymousClass10E r5 = r02.A01;
        C18600wl A1B = AnonymousClass3MZ.A1B(r5);
        C18600wl A1C = AnonymousClass3MZ.A1C(r5);
        AnonymousClass1K1 r4 = r02.A00;
        AnonymousClass11S A17 = AnonymousClass10E.A17(r5);
        AnonymousClass1CJ A0d = AnonymousClass3Ma.A0d(r5);
        C34511kb A0b = AnonymousClass3MZ.A0b(r5);
        AnonymousClass118 A0l = AnonymousClass3MZ.A0l(r5);
        C32011gU A0d2 = AnonymousClass3MY.A0d(r5);
        AnonymousClass1M9 A4z = AnonymousClass10E.A4z(r5);
        C73373Vg r7 = new C73373Vg((C61842qN) r4.A1I.get(), (C56352hK) r4.A1Y.get(), A17, A0b, A4z, AnonymousClass3MZ.A0g(r5), A0l, A0d, (AnonymousClass1QB) r5.A4T.get(), (C36391no) r5.A8P.get(), r3, A0d2, A1B, A1C, z);
        AnonymousClass1OX A00 = C41561wd.A00(r7);
        C18600wl r6 = r7.A0U;
        AnonymousClass3MW.A1X(r6, new CommunityMediaViewModel$refreshName$1(r7, (C30391dr) null), A00);
        C73373Vg.A03(r7);
        Integer A0w = AnonymousClass3MW.A0w(r7.A0V, new CommunityMediaViewModel$observePages$1(r7, (C30391dr) null), C41561wd.A00(r7));
        C91644g1.A01(r7.A07, r7.A04, new C105235Rf(r7), 2);
        C30451dy.A02(A0w, r6, new CommunityMediaViewModel$initialize$1(r7, (C30391dr) null), C41561wd.A00(r7));
        ((AnonymousClass4Xp) r7.A0S.getValue()).A01(r7.A0C);
        return r7;
    }
}
