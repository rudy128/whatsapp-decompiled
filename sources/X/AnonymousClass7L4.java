package X;

import com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel;
import com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoViewModel;
import com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellView;
import com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellViewController;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.7L4  reason: invalid class name */
public class AnonymousClass7L4 implements AnonymousClass8B1 {
    public final int A00;
    public final Object A01;

    public AnonymousClass7L4(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Bla(String str) {
        boolean z;
        switch (this.A00) {
            case 0:
                AvatarProfilePhotoViewModel avatarProfilePhotoViewModel = (AvatarProfilePhotoViewModel) this.A01;
                C140026zp r0 = (C140026zp) avatarProfilePhotoViewModel.A00.A06();
                int i = 0;
                if (r0 != null) {
                    Iterator it = r0.A03.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            C115465u3 r1 = (C115465u3) it.next();
                            if (r1 instanceof C115455u2) {
                                z = ((C115455u2) r1).A01;
                            } else {
                                z = ((C115445u1) r1).A04;
                            }
                            if (!z) {
                                i++;
                            }
                        } else {
                            i = -1;
                        }
                    }
                }
                AvatarProfilePhotoViewModel.A00(avatarProfilePhotoViewModel);
                AvatarProfilePhotoViewModel.A03(avatarProfilePhotoViewModel, "avatar_art_update", i, true);
                return;
            case 1:
                AvatarCoinFlipProfilePhotoViewModel avatarCoinFlipProfilePhotoViewModel = (AvatarCoinFlipProfilePhotoViewModel) this.A01;
                C140106zx r02 = (C140106zx) C108975cc.A0a(avatarCoinFlipProfilePhotoViewModel.A0E);
                int i2 = 0;
                if (r02 != null) {
                    Iterator it2 = r02.A06.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            i2 = -1;
                        } else if (!((C115485u5) it2.next()).A01) {
                            i2++;
                        }
                    }
                }
                AvatarCoinFlipProfilePhotoViewModel.A04(avatarCoinFlipProfilePhotoViewModel);
                AvatarCoinFlipProfilePhotoViewModel.A05(avatarCoinFlipProfilePhotoViewModel, "avatar_art_update", i2, true);
                return;
            case 2:
                C18070vi.A0d(str, 0);
                ((C108495bn) this.A01).CQ0(new AnonymousClass6E2(str));
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void Bly(String str) {
        switch (this.A00) {
            case 2:
                C18070vi.A0d(str, 0);
                ((C108495bn) this.A01).CQ0(AnonymousClass6E6.A00);
                return;
            case 4:
                ((StickerStorePackPreviewActivity) this.A01).A0V = true;
                return;
            default:
                return;
        }
    }

    public void Blz() {
        C41731wy r1;
        Object obj;
        String str;
        switch (this.A00) {
            case 0:
                AvatarProfilePhotoViewModel avatarProfilePhotoViewModel = (AvatarProfilePhotoViewModel) this.A01;
                if (!C108975cc.A1I(avatarProfilePhotoViewModel.A06)) {
                    r1 = avatarProfilePhotoViewModel.A04;
                    obj = C122416Qe.CLOSE_SCREEN;
                    break;
                } else {
                    return;
                }
            case 1:
                AvatarCoinFlipProfilePhotoViewModel avatarCoinFlipProfilePhotoViewModel = (AvatarCoinFlipProfilePhotoViewModel) this.A01;
                if (!C108975cc.A1I(avatarCoinFlipProfilePhotoViewModel.A05)) {
                    r1 = avatarCoinFlipProfilePhotoViewModel.A04;
                    obj = C122486Qo.CLOSE_SCREEN;
                    break;
                } else {
                    return;
                }
            case 2:
                ((C108495bn) this.A01).CQ0(AnonymousClass6E7.A00);
                return;
            case 3:
                return;
            default:
                StickerStorePackPreviewActivity stickerStorePackPreviewActivity = (StickerStorePackPreviewActivity) this.A01;
                if (stickerStorePackPreviewActivity.A0V) {
                    AnonymousClass6RG r12 = stickerStorePackPreviewActivity.A03;
                    if (r12 == null) {
                        str = "stickerPackPreviewSource";
                    } else {
                        if (r12 == AnonymousClass6RG.DEEPLINK) {
                            AnonymousClass00H r0 = stickerStorePackPreviewActivity.A0G;
                            if (r0 != null) {
                                C108945cZ.A0p(r0).A00(8);
                            } else {
                                str = "avatarLogger";
                            }
                        }
                        stickerStorePackPreviewActivity.finish();
                        return;
                    }
                    C18070vi.A11(str);
                    throw null;
                }
                return;
        }
        r1.A0F(obj);
    }

    public /* synthetic */ void Bm0(String str) {
        if (2 - this.A00 == 0) {
            ((C108495bn) this.A01).CQ0(new AnonymousClass6E3(str));
        }
    }

    public /* synthetic */ void Bm2(String str, Map map) {
        if (2 - this.A00 == 0) {
            ((C108495bn) this.A01).CQ0(new AnonymousClass6E4(str, map));
        }
    }

    public void Bm4(boolean z, boolean z2) {
        boolean z3;
        switch (this.A00) {
            case 0:
                AvatarProfilePhotoViewModel avatarProfilePhotoViewModel = (AvatarProfilePhotoViewModel) this.A01;
                AnonymousClass1DT r4 = avatarProfilePhotoViewModel.A00;
                C140026zp A0D = C108975cc.A0D(r4);
                int i = 0;
                boolean z4 = A0D.A06;
                List list = A0D.A03;
                List list2 = A0D.A02;
                C115475u4 r7 = A0D.A00;
                C115445u1 r8 = A0D.A01;
                boolean z5 = A0D.A04;
                C18070vi.A0e(list, 1, list2);
                C140026zp r6 = new C140026zp(r7, r8, list, list2, z4, true, z5);
                Iterator it = r6.A03.iterator();
                while (true) {
                    if (it.hasNext()) {
                        C115465u3 r1 = (C115465u3) it.next();
                        if (r1 instanceof C115455u2) {
                            z3 = ((C115455u2) r1).A01;
                        } else {
                            z3 = ((C115445u1) r1).A04;
                        }
                        if (!z3) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                r4.A0E(r6);
                AvatarProfilePhotoViewModel.A03(avatarProfilePhotoViewModel, "avatar_update", i, true);
                return;
            case 1:
                AvatarCoinFlipProfilePhotoViewModel avatarCoinFlipProfilePhotoViewModel = (AvatarCoinFlipProfilePhotoViewModel) this.A01;
                C140106zx A03 = AvatarCoinFlipProfilePhotoViewModel.A03(avatarCoinFlipProfilePhotoViewModel);
                boolean z6 = A03.A09;
                List list3 = A03.A06;
                List list4 = A03.A05;
                C135456sE r72 = A03.A02;
                C136236tU r82 = A03.A03;
                C140106zx r42 = new C140106zx(A03.A01, A03.A00, r72, r82, A03.A04, list3, list4, z6, true, A03.A07);
                Iterator it2 = r42.A06.iterator();
                int i2 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i2 = -1;
                    } else if (!((C115485u5) it2.next()).A01) {
                        i2++;
                    }
                }
                avatarCoinFlipProfilePhotoViewModel.A00.A0E(r42);
                AvatarCoinFlipProfilePhotoViewModel.A05(avatarCoinFlipProfilePhotoViewModel, "avatar_update", i2, true);
                return;
            case 2:
                ((C108495bn) this.A01).CQ0(new AnonymousClass6E5(z, z2));
                return;
            case 3:
                AvatarStickerUpsellViewController A002 = ((AvatarStickerUpsellView) this.A01).getViewController();
                C17880vN.A1F(C17890vO.A0A(A002.A02.A01), "pref_has_dismissed_sticker_upsell", true);
                A002.A01.setVisibility(8);
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void BpC() {
        if (2 - this.A00 == 0) {
            ((C108495bn) this.A01).CQ0(AnonymousClass6E8.A00);
        }
    }
}
