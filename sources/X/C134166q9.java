package X;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;

/* renamed from: X.6q9  reason: invalid class name and case insensitive filesystem */
public class C134166q9 {
    public ObjectAnimator A00;
    public AnonymousClass870 A01;
    public C129626i6 A02;
    public AnonymousClass7MX A03;
    public AnonymousClass88B A04;
    public AnonymousClass6CF A05;
    public final C131146ka A06;
    public final C18030ve A07;
    public final C133886pf A08;
    public final C25271No A09;
    public final C26631Sw A0A;
    public final AnonymousClass2LK A0B;
    public final AnonymousClass1SB A0C;
    public final AnonymousClass88B A0D = new AnonymousClass7MW(this, 1);
    public final AnonymousClass6pA A0E;
    public final C111185ii A0F;
    public final C136766uM A0G;
    public final AnonymousClass722 A0H;
    public final C38471rL A0I = new C825048f(this, 43);
    public final AnonymousClass00H A0J;

    public void A00(boolean z) {
        int i;
        C18100vl r0;
        if (!z) {
            i = 8;
            r0 = this.A02.A02;
        } else {
            C72453Mb.A1U(this.A02.A02, 0);
            boolean z2 = C17890vO.A0B(this.A06.A04).getBoolean("sticker_store_onboarding_badge_shown", false);
            C129626i6 r02 = this.A02;
            if (!z2) {
                C72453Mb.A1U(r02.A01, 0);
                ObjectAnimator objectAnimator = this.A00;
                if (objectAnimator == null) {
                    Object value = this.A02.A01.getValue();
                    PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[3];
                    C109005cf.A0r(new float[1], propertyValuesHolderArr, 1.4f);
                    C108945cZ.A1R("alpha", new float[]{0.4f, 0.0f}, propertyValuesHolderArr, 2);
                    objectAnimator = ObjectAnimator.ofPropertyValuesHolder(value, propertyValuesHolderArr);
                    this.A00 = objectAnimator;
                }
                objectAnimator.setDuration(1500);
                this.A00.setRepeatCount(-1);
                this.A00.setRepeatMode(1);
                this.A00.start();
                return;
            }
            i = 8;
            r0 = r02.A01;
        }
        C72453Mb.A1U(r0, i);
    }

    public boolean A01() {
        C111185ii r0;
        if (this.A0E.A01() && (r0 = this.A0F) != null) {
            AnonymousClass1DT r1 = r0.A02;
            if (r1.A06() == null || AnonymousClass3MW.A10(r1).isEmpty()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C134166q9(C131146ka r3, C18030ve r4, C133886pf r5, C25271No r6, C26631Sw r7, AnonymousClass2LK r8, AnonymousClass1SB r9, AnonymousClass6pA r10, C111185ii r11, C136766uM r12, AnonymousClass722 r13, AnonymousClass00H r14) {
        this.A07 = r4;
        this.A0H = r13;
        this.A0B = r8;
        this.A0C = r9;
        this.A0J = r14;
        this.A06 = r3;
        this.A0A = r7;
        this.A09 = r6;
        this.A0G = r12;
        this.A0F = r11;
        this.A08 = r5;
        this.A0E = r10;
    }
}
