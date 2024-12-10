package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.whatsapp.util.Log;

/* renamed from: X.5qy  reason: invalid class name and case insensitive filesystem */
public class C114525qy extends C90704eV {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C114525qy(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public void onAnimationEnd(Animation animation) {
        switch (this.A00) {
            case 0:
                C28931bI r2 = (C28931bI) this.A02;
                ViewGroup.LayoutParams A03 = r2.A03();
                A03.width = -2;
                r2.A06(A03);
                r2.A04(8);
                return;
            case 1:
                C72453Mb.A1B(((C136676uC) this.A02).A0G);
                Runnable runnable = (Runnable) this.A01;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                C132406mj r1 = (C132406mj) this.A01;
                r1.A00(C108945cZ.A04(r1.A01));
                ((C90704eV) this.A02).onAnimationEnd(animation);
                return;
            case 3:
                ((View) this.A02).clearAnimation();
                AnonymousClass74M r12 = (AnonymousClass74M) this.A01;
                View view = r12.A0V;
                view.setFocusable(true);
                view.setFocusableInTouchMode(true);
                view.requestFocus();
                AnonymousClass2LC r13 = r12.A18;
                Log.i("voicenote/voicenotepreviewcancelled");
                AnonymousClass7KX.A00(r13, 39);
                view.requestFocus();
                return;
            default:
                AnonymousClass74M r22 = ((C114515qx) this.A01).A04;
                if (r22.A0J == null) {
                    ((View) this.A02).setVisibility(0);
                    AnonymousClass2LC r14 = r22.A18;
                    Log.e("voicenote/voicenotecancelled");
                    AnonymousClass7KX.A00(r14, 40);
                    return;
                }
                return;
        }
    }

    public void onAnimationStart(Animation animation) {
        switch (this.A00) {
            case 2:
                ((C90704eV) this.A02).onAnimationStart(animation);
                return;
            case 3:
                ((View) this.A02).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animation);
                return;
        }
    }
}
