package X;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.productinfra.avatar.coinflip.AvatarCoinFlipProfilePhotoImageView;

/* renamed from: X.5kN  reason: invalid class name and case insensitive filesystem */
public final class C111755kN extends C41251w3 {
    public int A00;
    public final int A01;
    public final C22821Di A02;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        return new C113205mi(AnonymousClass3MY.A0E(C72463Mc.A0K(viewGroup, 0), viewGroup, this.A01));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.1uf, java.lang.Object] */
    public C111755kN(C22821Di r2, int i) {
        super((C40411uf) new Object());
        this.A01 = i;
        this.A02 = r2;
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r8, int i) {
        AnonymousClass6Qk r1;
        C113205mi r82 = (C113205mi) r8;
        C18070vi.A0d(r82, 0);
        C115485u5 r0 = (C115485u5) A0U(i);
        C115495u6 r4 = r0.A00;
        if (r4 == null) {
            boolean z = r0.A01;
            int i2 = this.A00;
            AvatarCoinFlipProfilePhotoImageView avatarCoinFlipProfilePhotoImageView = r82.A02;
            avatarCoinFlipProfilePhotoImageView.setAvatarPoseBackgroundColor(r82.A01);
            if (z) {
                AnonymousClass6Qk r12 = AnonymousClass6Qk.SELECTED;
                avatarCoinFlipProfilePhotoImageView.setSelected(true);
                avatarCoinFlipProfilePhotoImageView.A06(r12, r82.A00, i2);
            } else {
                Paint paint = avatarCoinFlipProfilePhotoImageView.A02;
                paint.setColor(C72453Mb.A0I(avatarCoinFlipProfilePhotoImageView.A04));
                C18100vl r2 = avatarCoinFlipProfilePhotoImageView.A05;
                paint.setStrokeWidth(C72453Mb.A00(r2));
                avatarCoinFlipProfilePhotoImageView.A03.setStrokeWidth(0.0f);
                avatarCoinFlipProfilePhotoImageView.A00 = C72453Mb.A00(r2);
                avatarCoinFlipProfilePhotoImageView.invalidate();
            }
            r82.A0H.setOnClickListener((View.OnClickListener) null);
            return;
        }
        boolean z2 = r0.A01;
        int i3 = this.A00;
        C22821Di r22 = this.A02;
        C18070vi.A0d(r22, 3);
        if (z2) {
            r1 = AnonymousClass6Qk.SELECTED;
        } else if (!z2) {
            r1 = AnonymousClass6Qk.IDLE;
        } else {
            throw AnonymousClass3MW.A14();
        }
        AvatarCoinFlipProfilePhotoImageView avatarCoinFlipProfilePhotoImageView2 = r82.A02;
        avatarCoinFlipProfilePhotoImageView2.setSelected(z2);
        avatarCoinFlipProfilePhotoImageView2.A06(r1, r82.A00, i3);
        View view = r82.A0H;
        int A012 = C108955ca.A01(view.getContext());
        AnonymousClass3MW.A1Q(avatarCoinFlipProfilePhotoImageView2);
        avatarCoinFlipProfilePhotoImageView2.setAvatarPoseBackgroundColor(A012);
        avatarCoinFlipProfilePhotoImageView2.setImageBitmap(r4.A00);
        AnonymousClass78Q.A00(view, r22, r4, 19);
        Context A04 = AnonymousClass3MY.A04(view);
        String str = r4.A01;
        if (str == null || str.length() <= 0) {
            str = r4.A02;
            if (str != null) {
                AnonymousClass73J.A01(A04, str);
            } else {
                str = null;
            }
        }
        avatarCoinFlipProfilePhotoImageView2.setContentDescription(str);
    }
}
