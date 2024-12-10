package X;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;
import com.whatsapp.privacy.usernotice.UserNoticeModalIconView;

/* renamed from: X.44y  reason: invalid class name */
public abstract class AnonymousClass44y extends C75303gr {
    public AnonymousClass10I A00;
    public AnonymousClass494 A01;

    public final void A07(C57882jn r6) {
        setContentDescription(r6.A04);
        AnonymousClass494 r0 = this.A01;
        if (r0 != null) {
            r0.A0B(true);
        }
        if (r6.A00(AnonymousClass3MY.A04(this)) == null) {
            A06(r6);
            return;
        }
        AnonymousClass494 r3 = new AnonymousClass494(r6, this);
        getWaWorkers().CGD(r3, r6.A00(AnonymousClass3MY.A04(this)));
        this.A01 = r3;
    }

    public abstract int getTargetIconSize();

    public final void setWaWorkers(AnonymousClass10I r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public void A06(C57882jn r7) {
        int i;
        Context context;
        if (this instanceof UserNoticeModalIconView) {
            UserNoticeModalIconView userNoticeModalIconView = (UserNoticeModalIconView) this;
            AnonymousClass3MY.A0v(userNoticeModalIconView.getContext(), userNoticeModalIconView, 2131233116);
            ImageView imageView = userNoticeModalIconView.A00;
            if (imageView != null) {
                imageView.setImageResource(2131231850);
            }
            ImageView imageView2 = userNoticeModalIconView.A00;
            if (imageView2 != null) {
                Resources resources = userNoticeModalIconView.getResources();
                ImageView imageView3 = userNoticeModalIconView.A00;
                if (imageView3 != null) {
                    context = imageView3.getContext();
                } else {
                    context = null;
                }
                imageView2.setColorFilter(AnonymousClass3Ma.A01(context, resources, 2130971702, 2131102817));
            }
            C72453Mb.A1C(userNoticeModalIconView.A00);
            return;
        }
        C18070vi.A0d(r7, 0);
        if (!(r7 instanceof C48242Ls)) {
            setColorFilter(AnonymousClass3Ma.A01(getContext(), getResources(), 2130971702, 2131102817));
            i = 2131231850;
        } else {
            i = 2131231522;
        }
        setImageResource(i);
    }

    public final AnonymousClass10I getWaWorkers() {
        AnonymousClass10I r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1G();
        throw null;
    }
}
