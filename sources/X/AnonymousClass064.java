package X;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: X.064  reason: invalid class name */
public class AnonymousClass064 extends AnonymousClass02B implements AnonymousClass01U {
    public AnonymousClass02H A00;
    public WeakReference A01;
    public final Context A02;
    public final C003301m A03;
    public final /* synthetic */ C003901s A04;

    public AnonymousClass064(Context context, C003901s r3, AnonymousClass02H r4) {
        this.A04 = r3;
        this.A02 = context;
        this.A00 = r4;
        C003301m r0 = new C003301m(context);
        r0.A0I();
        this.A03 = r0;
        r0.A0U(this);
    }

    public View A00() {
        WeakReference weakReference = this.A01;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public AnonymousClass02C A01() {
        return new AnonymousClass02C(this.A02);
    }

    public CharSequence A03() {
        return this.A04.A08.A03;
    }

    public CharSequence A04() {
        return this.A04.A08.A04;
    }

    public void A05() {
        C003901s r3 = this.A04;
        if (r3.A03 == this) {
            boolean z = r3.A0C;
            boolean z2 = r3.A0D;
            if (z || z2) {
                r3.A05 = this;
                r3.A04 = this.A00;
            } else {
                this.A00.BrJ(this);
            }
            this.A00 = null;
            r3.A0d(false);
            ActionBarContextView actionBarContextView = r3.A08;
            if (actionBarContextView.A01 == null) {
                actionBarContextView.A05();
            }
            r3.A09.setHideOnContentScrollEnabled(r3.A0E);
            r3.A03 = null;
        }
    }

    public void A06() {
        if (this.A04.A03 == this) {
            C003301m r1 = this.A03;
            r1.A0K();
            try {
                this.A00.C1U(r1, this);
            } finally {
                r1.A0J();
            }
        }
    }

    public void A07(int i) {
        A0A(this.A04.A01.getResources().getString(i));
    }

    public void A08(int i) {
        A0B(this.A04.A01.getResources().getString(i));
    }

    public void A09(View view) {
        this.A04.A08.setCustomView(view);
        this.A01 = new WeakReference(view);
    }

    public void A0A(CharSequence charSequence) {
        this.A04.A08.setSubtitle(charSequence);
    }

    public void A0B(CharSequence charSequence) {
        this.A04.A08.setTitle(charSequence);
    }

    public void A0C(boolean z) {
        this.A01 = z;
        this.A04.A08.setTitleOptional(z);
    }

    public boolean A0D() {
        return this.A04.A08.A05;
    }

    public boolean A0E() {
        C003301m r1 = this.A03;
        r1.A0K();
        try {
            return this.A00.BqR(r1, this);
        } finally {
            r1.A0J();
        }
    }

    public boolean ByE(MenuItem menuItem, C003301m r3) {
        AnonymousClass02H r0 = this.A00;
        if (r0 != null) {
            return r0.Bks(menuItem, this);
        }
        return false;
    }

    public void ByF(C003301m r2) {
        if (this.A00 != null) {
            A06();
            this.A04.A08.A06();
        }
    }

    public C003301m A02() {
        return this.A03;
    }
}
