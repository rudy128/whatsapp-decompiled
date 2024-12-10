package X;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.avatar.profilephoto.AvatarProfilePhotoColorView;
import com.whatsapp.avatar.profilephoto.AvatarProfilePhotoImageView;
import java.util.List;

/* renamed from: X.5kQ  reason: invalid class name and case insensitive filesystem */
public final class C111785kQ extends C41251w3 {
    public final C22821Di A00;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        int i2 = 2131625747;
        if (i == 0) {
            i2 = 2131625748;
        }
        View inflate = AnonymousClass3MZ.A0D(viewGroup).inflate(i2, viewGroup, false);
        List list = C42011xT.A0I;
        if (i == 0) {
            C18070vi.A0b(inflate);
            return new C115435u0(inflate);
        }
        C18070vi.A0b(inflate);
        return new C115425tz(inflate);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.1uf, java.lang.Object] */
    public C111785kQ(C22821Di r2) {
        super((C40411uf) new Object());
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r9, int i) {
        C122406Qd r0;
        C112785m2 r92 = (C112785m2) r9;
        C18070vi.A0d(r92, 0);
        C123036Sw r6 = (C123036Sw) A0U(i);
        C18070vi.A0b(r6);
        C157527xe r7 = new C157527xe(this);
        if (r92 instanceof C115435u0) {
            C115435u0 r93 = (C115435u0) r92;
            C18070vi.A0d(r6, 0);
            C115465u3 r62 = (C115465u3) r6;
            if (r62 instanceof C115445u1) {
                C115445u1 r63 = (C115445u1) r62;
                C115435u0.A00(r93, r63.A00, r63.A04);
                View view = r93.A0H;
                int A01 = C108955ca.A01(view.getContext());
                AvatarProfilePhotoImageView avatarProfilePhotoImageView = r93.A00;
                AnonymousClass3MW.A1Q(avatarProfilePhotoImageView);
                avatarProfilePhotoImageView.setAvatarPoseBackgroundColor(A01);
                avatarProfilePhotoImageView.setImageBitmap(r63.A01);
                AnonymousClass78Q.A00(view, r7, r63, 18);
                Context A04 = AnonymousClass3MY.A04(view);
                String str = r63.A02;
                if (str == null || str.length() <= 0) {
                    str = r63.A03;
                    if (str != null) {
                        AnonymousClass73J.A01(A04, str);
                    } else {
                        str = null;
                    }
                }
                avatarProfilePhotoImageView.setContentDescription(str);
            } else if (r62 instanceof C115455u2) {
                C115455u2 r64 = (C115455u2) r62;
                View view2 = r93.A0H;
                int A002 = C19740yt.A00(view2.getContext(), 2131103223);
                AvatarProfilePhotoImageView avatarProfilePhotoImageView2 = r93.A00;
                avatarProfilePhotoImageView2.setAvatarPoseBackgroundColor(A002);
                Integer num = r64.A00;
                if (num != null) {
                    C115435u0.A00(r93, num.intValue(), r64.A01);
                } else {
                    Paint paint = avatarProfilePhotoImageView2.A02;
                    paint.setColor(C72453Mb.A0I(avatarProfilePhotoImageView2.A04));
                    C18100vl r2 = avatarProfilePhotoImageView2.A05;
                    paint.setStrokeWidth(C72453Mb.A00(r2));
                    avatarProfilePhotoImageView2.A03.setStrokeWidth(0.0f);
                    avatarProfilePhotoImageView2.A00 = C72453Mb.A00(r2);
                    avatarProfilePhotoImageView2.invalidate();
                }
                view2.setOnClickListener((View.OnClickListener) null);
            }
        } else {
            C115425tz r94 = (C115425tz) r92;
            C18070vi.A0d(r6, 0);
            C115475u4 r5 = (C115475u4) r6;
            boolean z = r5.A03;
            if (z) {
                r0 = C122406Qd.SELECTED;
            } else {
                r0 = C122406Qd.IDLE;
            }
            AvatarProfilePhotoColorView avatarProfilePhotoColorView = r94.A00;
            int i2 = r5.A00;
            int i3 = r5.A01;
            avatarProfilePhotoColorView.A00 = r0;
            avatarProfilePhotoColorView.A01.setColor(i2);
            avatarProfilePhotoColorView.A02.setColor(i3);
            avatarProfilePhotoColorView.invalidate();
            avatarProfilePhotoColorView.setSelected(z);
            avatarProfilePhotoColorView.setContentDescription(r5.A02);
            AnonymousClass78Q.A00(r94.A0H, r7, r6, 17);
        }
    }

    public int getItemViewType(int i) {
        Object A0U = A0U(i);
        if (A0U instanceof C115465u3) {
            return 0;
        }
        if (A0U instanceof C115475u4) {
            return 1;
        }
        throw AnonymousClass3MW.A14();
    }
}
