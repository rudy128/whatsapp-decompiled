package X;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.02A  reason: invalid class name */
public class AnonymousClass02A extends AnonymousClass029 implements AnonymousClass01D {
    public AnonymousClass013 A00;
    public final AnonymousClass1FA A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass02A(android.content.Context r6, int r7) {
        /*
            r5 = this;
            r0 = r7
            if (r7 != 0) goto L_0x0015
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r2 = r6.getTheme()
            r1 = 2130969362(0x7f040312, float:1.7547404E38)
            r0 = 1
            r2.resolveAttribute(r1, r3, r0)
            int r0 = r3.resourceId
        L_0x0015:
            r5.<init>(r6, r0)
            X.0Xz r0 = new X.0Xz
            r0.<init>(r5)
            r5.A01 = r0
            X.013 r4 = r5.A04()
            if (r7 != 0) goto L_0x0037
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r2 = r6.getTheme()
            r1 = 2130969362(0x7f040312, float:1.7547404E38)
            r0 = 1
            r2.resolveAttribute(r1, r3, r0)
            int r7 = r3.resourceId
        L_0x0037:
            r0 = r4
            X.01V r0 = (X.AnonymousClass01V) r0
            r0.A03 = r7
            r4.A0b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02A.<init>(android.content.Context, int):void");
    }

    public void A05() {
        A04().A0d(1);
    }

    public void C81(AnonymousClass02B r1) {
    }

    public void C82(AnonymousClass02B r1) {
    }

    public AnonymousClass013 A04() {
        AnonymousClass013 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        boolean z = AnonymousClass013.A02;
        boolean z2 = AnonymousClass01V.A0p;
        AnonymousClass01V r02 = new AnonymousClass01V(getContext(), getWindow(), this, this);
        this.A00 = r02;
        return r02;
    }

    public boolean A06(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A04().A0g(view, layoutParams);
    }

    public void dismiss() {
        super.dismiss();
        A04().A0c();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AnonymousClass1HJ.A00(keyEvent, getWindow().getDecorView(), this, this.A01);
    }

    public View findViewById(int i) {
        AnonymousClass01V r0 = (AnonymousClass01V) A04();
        AnonymousClass01V.A0O(r0);
        return r0.A06.findViewById(i);
    }

    public void invalidateOptionsMenu() {
        A04().A0Z();
    }

    public void onCreate(Bundle bundle) {
        A04().A0Y();
        super.onCreate(bundle);
        A04().A0b();
    }

    public void onStop() {
        super.onStop();
        AnonymousClass01V r0 = (AnonymousClass01V) A04();
        AnonymousClass01V.A0P(r0);
        C003401n r1 = r0.A09;
        if (r1 != null) {
            r1.A0Z(false);
        }
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A04().A0h(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        A04().A0j(getContext().getString(i));
    }

    public void setContentView(int i) {
        A04().A0e(i);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        A04().A0j(charSequence);
    }

    public void setContentView(View view) {
        A04().A0f(view);
    }
}
