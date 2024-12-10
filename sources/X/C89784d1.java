package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.whatsapp.mediaview.MediaViewFragment;

/* renamed from: X.4d1  reason: invalid class name and case insensitive filesystem */
public class C89784d1 implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C89784d1(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A01 = i;
        this.A05 = obj4;
    }

    public final void onClick(View view) {
        AnonymousClass70E r5;
        Context A14;
        C61762qD r3;
        AnonymousClass3uP r2;
        if (this.A00 != 0) {
            MediaViewFragment mediaViewFragment = (MediaViewFragment) this.A02;
            Object obj = this.A03;
            AnonymousClass21V r8 = (AnonymousClass21V) this.A04;
            int i = this.A01;
            AnonymousClass1D6 r1 = (AnonymousClass1D6) this.A05;
            if (obj != null) {
                ((C86314Rd) mediaViewFragment.A1P.get()).A01(mediaViewFragment.A1B(), new AnonymousClass7EX(13, 13), r8, i);
                return;
            }
            if (r8 instanceof C440521y) {
                r5 = (AnonymousClass70E) mediaViewFragment.A1J.get();
                A14 = mediaViewFragment.A14();
                r3 = (C61762qD) r1.first;
                r2 = new C79023uB(mediaViewFragment.A14(), mediaViewFragment.A1F(), (C108875cR) null, (C440521y) r8);
            } else if (r8 instanceof C440321w) {
                r5 = (AnonymousClass70E) mediaViewFragment.A1J.get();
                A14 = mediaViewFragment.A14();
                r3 = (C61762qD) r1.first;
                r2 = new C78803tf(mediaViewFragment.A14(), mediaViewFragment.A1F(), (C108875cR) null, (C440321w) r8);
            } else {
                return;
            }
            r5.A03(A14, r2, r3, true);
            return;
        }
        AnonymousClass00H r32 = (AnonymousClass00H) this.A03;
        Activity activity = (Activity) this.A04;
        int i2 = this.A01;
        AnonymousClass1KB r22 = (AnonymousClass1KB) this.A05;
        if (((AnonymousClass11E) this.A02).A09()) {
            ((C192539oZ) C18070vi.A0E(r32)).A01(C17880vN.A0m(), (Integer) null, 14);
            Intent A0A = C17880vN.A0A();
            A0A.setClassName(activity.getPackageName(), "com.whatsapp.calling.calllink.view.CallLinkActivity");
            activity.startActivityForResult(A0A, i2);
            return;
        }
        r22.A08(2131887665, 0);
    }
}
