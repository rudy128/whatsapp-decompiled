package X;

import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1t9  reason: invalid class name and case insensitive filesystem */
public final class C39481t9 {
    public Integer A00;
    public Integer A01;
    public boolean A02 = true;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Fragment A07;
    public final C35821mr A08;
    public final List A09;
    public final List A0A = new ArrayList();
    public final List A0B;

    public void A01() {
        this.A06 = false;
        if (!this.A04) {
            if (AnonymousClass1GP.A0G(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("SpecialEffectsController: ");
                sb.append(this);
                sb.append(" has called complete.");
                Log.v("FragmentManager", sb.toString());
            }
            this.A04 = true;
            for (Runnable run : this.A0A) {
                run.run();
            }
        }
        this.A07.A0m = false;
        this.A08.A03();
    }

    public final void A02(ViewGroup viewGroup) {
        this.A06 = false;
        if (!this.A03) {
            this.A03 = true;
            if (this.A09.isEmpty()) {
                A01();
                return;
            }
            for (AnonymousClass2SF r1 : C29431cG.A0t(this.A0B)) {
                if (!r1.A00) {
                    r1.A04(viewGroup);
                }
                r1.A00 = true;
            }
        }
    }

    public final void A04(Integer num, Integer num2) {
        Integer num3;
        C18070vi.A0d(num, 0);
        int intValue = num2.intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                if (AnonymousClass1GP.A0G(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: For fragment ");
                    sb.append(this.A07);
                    sb.append(" mFinalState = ");
                    sb.append(C41321wA.A00(this.A00));
                    sb.append(" -> REMOVED. mLifecycleImpact  = ");
                    sb.append(A00(this.A01));
                    sb.append(" to REMOVING.");
                    Log.v("FragmentManager", sb.toString());
                }
                this.A00 = AnonymousClass00R.A00;
                num3 = AnonymousClass00R.A0C;
            } else if (intValue == 0 && this.A00 != AnonymousClass00R.A00) {
                if (AnonymousClass1GP.A0G(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: For fragment ");
                    sb2.append(this.A07);
                    sb2.append(" mFinalState = ");
                    sb2.append(C41321wA.A00(this.A00));
                    sb2.append(" -> ");
                    sb2.append(C41321wA.A00(num));
                    sb2.append('.');
                    Log.v("FragmentManager", sb2.toString());
                }
                this.A00 = num;
                return;
            } else {
                return;
            }
        } else if (this.A00 == AnonymousClass00R.A00) {
            if (AnonymousClass1GP.A0G(2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("SpecialEffectsController: For fragment ");
                sb3.append(this.A07);
                sb3.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                sb3.append(A00(this.A01));
                sb3.append(" to ADDING.");
                Log.v("FragmentManager", sb3.toString());
            }
            num3 = AnonymousClass00R.A01;
            this.A00 = num3;
        } else {
            return;
        }
        this.A01 = num3;
        this.A02 = true;
    }

    public C39481t9(C35821mr r3, Integer num, Integer num2) {
        Fragment fragment = r3.A02;
        this.A00 = num;
        this.A01 = num2;
        this.A07 = fragment;
        ArrayList arrayList = new ArrayList();
        this.A09 = arrayList;
        this.A0B = arrayList;
        this.A08 = r3;
    }

    public final void A03(AnonymousClass2SF r3) {
        List list = this.A09;
        if (list.remove(r3) && list.isEmpty()) {
            A01();
        }
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "NONE";
            case 1:
                return "ADDING";
            default:
                return "REMOVING";
        }
    }

    public String toString() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        StringBuilder sb = new StringBuilder();
        sb.append("Operation {");
        sb.append(hexString);
        sb.append("} {finalState = ");
        sb.append(C41321wA.A00(this.A00));
        sb.append(" lifecycleImpact = ");
        sb.append(A00(this.A01));
        sb.append(" fragment = ");
        sb.append(this.A07);
        sb.append('}');
        return sb.toString();
    }
}
