package X;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;

/* renamed from: X.7Qt  reason: invalid class name and case insensitive filesystem */
public class C146827Qt implements Runnable {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C146827Qt(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public final void run() {
        int i;
        int i2;
        AnonymousClass1KB r0;
        switch (this.A00) {
            case 0:
                C112365lM r4 = (C112365lM) this.A02;
                r4.A0J(this.A01, C18020vd.A00(C18040vf.A02, AnonymousClass3MY.A0W(r4.A0h), 8167) - 1);
                return;
            case 1:
                AnonymousClass7B2 r7 = (AnonymousClass7B2) this.A02;
                int i3 = this.A01;
                C131776le r6 = r7.A0C;
                if (r6 != null) {
                    AnonymousClass21W r5 = r7.A0A;
                    String str = "";
                    if (i3 == 4) {
                        Context context = r7.A07.A00;
                        C24921Me r2 = r7.A06;
                        C25181Nf r02 = r7.A09;
                        C136956ug r1 = r7.A0B;
                        String A002 = AnonymousClass6Y0.A00(context, r2, r02, r5, r1);
                        if (A002 != null) {
                            str = A002;
                        }
                        r6.A00(str, r1.A0G, 1);
                        return;
                    }
                    r6.A00(str, false, 0);
                    return;
                }
                return;
            case 2:
                AnonymousClass4Yv.A01(((AnonymousClass74M) this.A02).A0a, this.A01);
                return;
            case 3:
                VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = (VoipCallControlBottomSheetV2) this.A02;
                C42011xT A0O = voipCallControlBottomSheetV2.A0E.A0O(this.A01);
                if (A0O != null) {
                    int dimensionPixelOffset = voipCallControlBottomSheetV2.A1n().getResources().getDimensionPixelOffset(2131165628);
                    View view = A0O.A0H;
                    voipCallControlBottomSheetV2.A0D.requestChildRectangleOnScreen(view, new Rect(0, 0, view.getWidth(), view.getHeight() + dimensionPixelOffset), false);
                    view.setBackground(new ColorDrawable(voipCallControlBottomSheetV2.A06));
                    Drawable background = view.getBackground();
                    int[] A1W = C108945cZ.A1W();
                    A1W[0] = 255;
                    A1W[1] = 0;
                    ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(background, new PropertyValuesHolder[]{PropertyValuesHolder.ofInt("alpha", A1W)});
                    ofPropertyValuesHolder.setTarget(view.getBackground());
                    ofPropertyValuesHolder.setDuration(3000);
                    ofPropertyValuesHolder.start();
                    C1407973c r12 = voipCallControlBottomSheetV2.A0K;
                    if (r12 != null && !r12.A07()) {
                        C1407973c.A01(r12, 3);
                        r12.A05 = true;
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((AnonymousClass10T) this.A02).notifyAllObservers(new AnonymousClass7KO(this.A01, 3));
                return;
            case 5:
                C133616p4 r13 = (C133616p4) this.A02;
                i = this.A01;
                i2 = 0;
                C18070vi.A0d(r13, 0);
                if (!r13.A00.get()) {
                    r0 = r13.A01;
                    break;
                } else {
                    return;
                }
            default:
                C128166fY r14 = (C128166fY) this.A02;
                i = 2131891018;
                i2 = 0;
                if (!r14.A00.get()) {
                    r0 = r14.A01;
                    break;
                } else {
                    return;
                }
        }
        r0.A07(i2, i);
    }

    public C146827Qt(C128166fY r2) {
        this.A00 = 6;
        this.A02 = r2;
        this.A01 = 2131891018;
    }
}
