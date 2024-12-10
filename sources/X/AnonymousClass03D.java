package X;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;

/* renamed from: X.03D  reason: invalid class name */
public class AnonymousClass03D implements C004001t {
    public C003301m A00;
    public AnonymousClass03G A01;
    public final /* synthetic */ Toolbar A02;

    public boolean BLO() {
        return false;
    }

    public void Bp9(C003301m r1, boolean z) {
    }

    public void C3a(Parcelable parcelable) {
    }

    public Parcelable C4J() {
        return null;
    }

    public boolean C7B(AnonymousClass068 r2) {
        return false;
    }

    public void CIA(C004301w r2) {
        throw AnonymousClass04E.createAndThrow();
    }

    public int getId() {
        return 0;
    }

    public AnonymousClass03D(Toolbar toolbar) {
        this.A02 = toolbar;
    }

    public boolean BFB(AnonymousClass03G r4) {
        Toolbar toolbar = this.A02;
        View view = toolbar.A06;
        if (view instanceof C16530sa) {
            ((C16530sa) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.A06);
        toolbar.removeView(toolbar.A07);
        toolbar.A06 = null;
        toolbar.A0F();
        this.A01 = null;
        toolbar.requestLayout();
        r4.A07(false);
        toolbar.A0M();
        return true;
    }

    public boolean BKu(AnonymousClass03G r5) {
        Toolbar toolbar = this.A02;
        toolbar.A0I();
        ViewParent parent = toolbar.A07.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.A07);
            }
            toolbar.addView(toolbar.A07);
        }
        View actionView = r5.getActionView();
        toolbar.A06 = actionView;
        this.A01 = r5;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.A06);
            }
            AnonymousClass03A r2 = new AnonymousClass03A();
            r2.A00 = (toolbar.A00 & 112) | 8388611;
            r2.A00 = 2;
            toolbar.A06.setLayoutParams(r2);
            toolbar.addView(toolbar.A06);
        }
        toolbar.A0K();
        toolbar.requestLayout();
        r5.A07(true);
        View view = toolbar.A06;
        if (view instanceof C16530sa) {
            ((C16530sa) view).onActionViewExpanded();
        }
        toolbar.A0M();
        return true;
    }

    public void BdO(Context context, C003301m r4) {
        AnonymousClass03G r0;
        C003301m r1 = this.A00;
        if (!(r1 == null || (r0 = this.A01) == null)) {
            r1.A0i(r0);
        }
        this.A00 = r4;
    }

    public void CQu(boolean z) {
        AnonymousClass03G r4 = this.A01;
        if (r4 != null) {
            C003301m r3 = this.A00;
            if (r3 != null) {
                int size = r3.size();
                int i = 0;
                while (i < size) {
                    if (r3.getItem(i) != r4) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
            BFB(r4);
        }
    }
}
