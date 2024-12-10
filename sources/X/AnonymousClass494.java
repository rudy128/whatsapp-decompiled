package X;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.privacy.usernotice.UserNoticeModalIconView;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.494  reason: invalid class name */
public final class AnonymousClass494 extends A34 {
    public final int A00;
    public final C57882jn A01;
    public final WeakReference A02;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        View view;
        File[] fileArr = (File[]) objArr;
        C18070vi.A0d(fileArr, 0);
        if (fileArr.length == 0 || (view = (View) this.A02.get()) == null) {
            return null;
        }
        File file = fileArr[0];
        int i = this.A00;
        return new BitmapDrawable(view.getResources(), AnonymousClass204.A0A(new AnonymousClass25O(i, i), file).A02);
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Drawable drawable = (Drawable) obj;
        AnonymousClass44y r4 = (AnonymousClass44y) this.A02.get();
        if (r4 == null) {
            return;
        }
        if (drawable == null) {
            r4.A06(this.A01);
            return;
        }
        Context A04 = AnonymousClass3MY.A04(r4);
        C57882jn r0 = this.A01;
        C88284Zb A002 = AnonymousClass4HI.A00(A04, r0.A02, r0.A03);
        if (A002 != null) {
            Context A042 = AnonymousClass3MY.A04(r4);
            int A003 = C19740yt.A00(A042, A002.A00);
            Drawable A08 = AnonymousClass4aX.A08(drawable, C19740yt.A00(A042, A002.A01));
            C18070vi.A0X(A08);
            drawable = new C109505dY(A08, A003);
        }
        if (r4 instanceof UserNoticeModalIconView) {
            UserNoticeModalIconView userNoticeModalIconView = (UserNoticeModalIconView) r4;
            userNoticeModalIconView.setBackground((Drawable) null);
            userNoticeModalIconView.setImageDrawable(drawable);
            C72453Mb.A1D(userNoticeModalIconView.A00);
            return;
        }
        r4.clearColorFilter();
        r4.setImageDrawable(drawable);
    }

    public AnonymousClass494(C57882jn r2, AnonymousClass44y r3) {
        this.A01 = r2;
        this.A00 = r3.getTargetIconSize();
        this.A02 = AnonymousClass3MW.A0z(r3);
    }
}
