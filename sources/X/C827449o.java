package X;

import android.view.ViewGroup;

/* renamed from: X.49o  reason: invalid class name and case insensitive filesystem */
public class C827449o extends C123486Uq {
    public final /* synthetic */ AnonymousClass4aY A00;

    public C827449o(AnonymousClass4aY r1) {
        this.A00 = r1;
    }

    public void A00() {
        AnonymousClass4aY r1 = this.A00;
        if (r1.A0e != null) {
            AnonymousClass3MZ.A1S(r1);
        }
    }

    public void A01() {
        AnonymousClass4aY r2 = this.A00;
        AnonymousClass206 r1 = r2.A2b.A0G;
        if (r1 != null) {
            r2.A39(r1, false);
        }
    }

    public void A02() {
        AnonymousClass4aY r1 = this.A00;
        if (r1.A0e != null) {
            AnonymousClass3MZ.A1S(r1);
        }
        ViewGroup viewGroup = r1.A0T;
        if (viewGroup != null && viewGroup.getVisibility() == 0) {
            C72453Mb.A1B(r1.A0T);
        }
    }

    public void A03() {
        AnonymousClass4aY r1 = this.A00;
        r1.A2Q.invalidateOptionsMenu();
        C72473Md.A1E(r1);
        AnonymousClass3s0 r0 = (AnonymousClass3s0) r1.A2G.A00.A00(AnonymousClass3s0.class);
        if (r0 != null) {
            r0.A0B = true;
        }
    }

    public void A04() {
        AnonymousClass4aY r1 = this.A00;
        r1.A2Q.invalidateOptionsMenu();
        AnonymousClass3s0 r0 = (AnonymousClass3s0) r1.A2G.A00.A00(AnonymousClass3s0.class);
        if (r0 != null) {
            r0.A0B = false;
        }
    }
}
