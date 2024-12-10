package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ProgressBar;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoActivity;
import com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoActivity$observeViewModel$1$1;
import com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoErrorDialog;
import com.whatsapp.productinfra.avatar.coinflip.AvatarCoinFlipProfilePhotoImageView;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.7xl  reason: invalid class name and case insensitive filesystem */
public final class C157597xl extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AvatarCoinFlipProfilePhotoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C157597xl(AvatarCoinFlipProfilePhotoActivity avatarCoinFlipProfilePhotoActivity) {
        super(1);
        this.this$0 = avatarCoinFlipProfilePhotoActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String A1H;
        C140106zx r8 = (C140106zx) obj;
        this.this$0.A0A.A0W(r8.A05);
        this.this$0.A0B.A0W(r8.A06);
        if (r8.A00 == null || r8.A01 == null) {
            Bitmap bitmap = r8.A01;
            ((AnonymousClass17O) this.this$0.A0C.get()).A01 = bitmap;
            AvatarCoinFlipProfilePhotoImageView avatarCoinFlipProfilePhotoImageView = this.this$0.A04;
            if (avatarCoinFlipProfilePhotoImageView == null) {
                C18070vi.A11("avatarPose");
                throw null;
            }
            avatarCoinFlipProfilePhotoImageView.setImageBitmap(bitmap);
        } else {
            AnonymousClass3MX.A1Q(new AvatarCoinFlipProfilePhotoActivity$observeViewModel$1$1(this.this$0, r8, (C30391dr) null), AnonymousClass2SS.A00(this.this$0));
        }
        C136236tU r1 = r8.A03;
        if (r1 != null) {
            AvatarCoinFlipProfilePhotoImageView avatarCoinFlipProfilePhotoImageView2 = this.this$0.A04;
            if (avatarCoinFlipProfilePhotoImageView2 == null) {
                C18070vi.A11("avatarPose");
                throw null;
            }
            Context context = avatarCoinFlipProfilePhotoImageView2.getContext();
            String str = r1.A03;
            String str2 = r1.A04;
            if (context == null) {
                A1H = null;
            } else {
                if (str == null || str.length() <= 0) {
                    str = AnonymousClass73J.A01(context, str2);
                }
                A1H = AnonymousClass001.A1H(" - ", str, AnonymousClass000.A11(C18070vi.A0F(context, 2131886862)));
            }
            avatarCoinFlipProfilePhotoImageView2.setContentDescription(A1H);
        }
        WDSButton wDSButton = this.this$0.A05;
        if (wDSButton == null) {
            C18070vi.A11("avatarSavePhotoBtn");
            throw null;
        }
        boolean z = r8.A09;
        wDSButton.setEnabled(!z);
        AnonymousClass1KB r12 = this.this$0.A05;
        if (z) {
            r12.A07(0, 2131886866);
        } else {
            r12.A04();
        }
        boolean z2 = r8.A08;
        ProgressBar progressBar = this.this$0.A01;
        if (z2) {
            if (progressBar == null) {
                C18070vi.A11("profileImageProgressBar");
                throw null;
            }
            progressBar.setVisibility(0);
            ShimmerFrameLayout shimmerFrameLayout = this.this$0.A03;
            if (shimmerFrameLayout == null) {
                C18070vi.A11("poseShimmer");
                throw null;
            }
            shimmerFrameLayout.A03();
        } else if (progressBar == null) {
            C18070vi.A11("profileImageProgressBar");
            throw null;
        } else {
            progressBar.setVisibility(8);
            ShimmerFrameLayout shimmerFrameLayout2 = this.this$0.A03;
            if (shimmerFrameLayout2 == null) {
                C18070vi.A11("poseShimmer");
                throw null;
            }
            shimmerFrameLayout2.A01();
        }
        if (r8.A07) {
            C20098A7b.A03(new AvatarCoinFlipProfilePhotoErrorDialog(), this.this$0.getSupportFragmentManager(), (String) null);
        }
        return C27621Wu.A00;
    }
}
