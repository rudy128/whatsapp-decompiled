package X;

import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.profile.coinflip.edit.CoinFlipEditAvatarTabFragment;

/* renamed from: X.5Tx  reason: invalid class name and case insensitive filesystem */
public final class C105935Tx extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CoinFlipEditAvatarTabFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105935Tx(CoinFlipEditAvatarTabFragment coinFlipEditAvatarTabFragment) {
        super(1);
        this.this$0 = coinFlipEditAvatarTabFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        View view;
        int i;
        DialogFragment dialogFragment;
        C18070vi.A0d(obj, 0);
        if (obj.equals(C823445r.A00)) {
            CoinFlipEditAvatarTabFragment coinFlipEditAvatarTabFragment = this.this$0;
            if (coinFlipEditAvatarTabFragment.A01 != null) {
                coinFlipEditAvatarTabFragment.A1k(C72473Md.A0B(coinFlipEditAvatarTabFragment.A1D(), "com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoActivity"));
                dialogFragment = coinFlipEditAvatarTabFragment.A00;
            } else {
                str = "waIntents";
                C18070vi.A11(str);
                throw null;
            }
        } else if (obj.equals(AnonymousClass45p.A00)) {
            CoinFlipEditAvatarTabFragment coinFlipEditAvatarTabFragment2 = this.this$0;
            AnonymousClass00H r0 = coinFlipEditAvatarTabFragment2.A02;
            if (r0 != null) {
                ((AnonymousClass73V) C18070vi.A0E(r0)).A04((AnonymousClass1FU) C72453Mb.A0Z(coinFlipEditAvatarTabFragment2), "avatar_profile_photo_tool", (String) null);
                dialogFragment = coinFlipEditAvatarTabFragment2.A00;
            } else {
                str = "avatarEditorLauncher";
                C18070vi.A11(str);
                throw null;
            }
        } else if (obj.equals(C823345m.A00)) {
            AnonymousClass4HO.A00(this.this$0);
            dialogFragment = this.this$0.A00;
        } else {
            if (obj.equals(AnonymousClass45q.A00)) {
                ((AnonymousClass1FU) C72453Mb.A0Z(this.this$0)).CNA(2131889286);
            } else {
                if (obj.equals(AnonymousClass45o.A00)) {
                    AnonymousClass1FL A1D = this.this$0.A1D();
                    C18070vi.A0z(A1D, "null cannot be cast to non-null type com.whatsapp.DialogActivity");
                    ((AnonymousClass1FU) A1D).CEx();
                    AnonymousClass1FL A1D2 = this.this$0.A1D();
                    C18070vi.A0z(A1D2, "null cannot be cast to non-null type com.whatsapp.DialogActivity");
                    view = ((AnonymousClass1FU) A1D2).A00;
                    i = 2131889285;
                } else if (obj.equals(AnonymousClass45n.A00)) {
                    AnonymousClass1FL A1D3 = this.this$0.A1D();
                    C18070vi.A0z(A1D3, "null cannot be cast to non-null type com.whatsapp.DialogActivity");
                    ((AnonymousClass1FU) A1D3).CEx();
                    AnonymousClass1FL A1D4 = this.this$0.A1D();
                    C18070vi.A0z(A1D4, "null cannot be cast to non-null type com.whatsapp.DialogActivity");
                    view = ((AnonymousClass1FU) A1D4).A00;
                    i = 2131889287;
                }
                C23520Bik.A01(view, i, 0).A08();
            }
            return C27621Wu.A00;
        }
        if (dialogFragment != null) {
            dialogFragment.A28();
        }
        return C27621Wu.A00;
    }
}
