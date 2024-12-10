package X;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: X.02L  reason: invalid class name */
public class AnonymousClass02L extends AnonymousClass02B implements AnonymousClass01U {
    public Context A00;
    public AnonymousClass02H A01;
    public C003301m A02;
    public ActionBarContextView A03;
    public WeakReference A04;
    public boolean A05;

    public View A00() {
        WeakReference weakReference = this.A04;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public AnonymousClass02C A01() {
        return new AnonymousClass02C(this.A03.getContext());
    }

    public CharSequence A03() {
        return this.A03.A03;
    }

    public CharSequence A04() {
        return this.A03.A04;
    }

    public void A05() {
        if (!this.A05) {
            this.A05 = true;
            this.A01.BrJ(this);
        }
    }

    public void A06() {
        this.A01.C1U(this.A02, this);
    }

    public void A07(int i) {
        A0A(this.A00.getString(i));
    }

    public void A08(int i) {
        A0B(this.A00.getString(i));
    }

    public void A09(View view) {
        WeakReference weakReference;
        this.A03.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.A04 = weakReference;
    }

    public void A0A(CharSequence charSequence) {
        this.A03.setSubtitle(charSequence);
    }

    public void A0B(CharSequence charSequence) {
        this.A03.setTitle(charSequence);
    }

    public void A0C(boolean z) {
        this.A01 = z;
        this.A03.setTitleOptional(z);
    }

    public boolean A0D() {
        return this.A03.A05;
    }

    public boolean ByE(MenuItem menuItem, C003301m r3) {
        return this.A01.Bks(menuItem, this);
    }

    public AnonymousClass02L(Context context, AnonymousClass02H r4, ActionBarContextView actionBarContextView) {
        this.A00 = context;
        this.A03 = actionBarContextView;
        this.A01 = r4;
        C003301m r0 = new C003301m(actionBarContextView.getContext());
        r0.A0I();
        this.A02 = r0;
        r0.A0U(this);
    }

    public C003301m A02() {
        return this.A02;
    }

    public void ByF(C003301m r2) {
        A06();
        this.A03.A06();
    }
}
