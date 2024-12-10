package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

@Deprecated
/* renamed from: X.292  reason: invalid class name */
public abstract class AnonymousClass292 extends AnonymousClass1b8 {
    public ArrayList A00 = AnonymousClass000.A13();
    public ArrayList A01 = AnonymousClass000.A13();
    public C34001jj A02 = null;
    public Fragment A03 = null;
    public boolean A04;
    public final AnonymousClass1GP A05;
    public final int A06;

    public abstract Fragment A0I(int i);

    public void A09(ViewGroup viewGroup, Object obj, int i) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.A03;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.A1a(false);
                if (this.A06 == 1) {
                    C34001jj r2 = this.A02;
                    if (r2 == null) {
                        r2 = new C34001jj(this.A05);
                        this.A02 = r2;
                    }
                    r2.A0A(this.A03, C23401Fx.STARTED);
                } else {
                    this.A03.A23(false);
                }
            }
            fragment.A1a(true);
            if (this.A06 == 1) {
                C34001jj r1 = this.A02;
                if (r1 == null) {
                    r1 = new C34001jj(this.A05);
                    this.A02 = r1;
                }
                r1.A0A(fragment, C23401Fx.RESUMED);
            } else {
                fragment.A23(true);
            }
            this.A03 = fragment;
        }
    }

    public Parcelable A0B() {
        Bundle bundle;
        ArrayList arrayList = this.A01;
        if (arrayList.size() > 0) {
            bundle = C17880vN.A0D();
            C26550D3n[] d3nArr = new C26550D3n[arrayList.size()];
            arrayList.toArray(d3nArr);
            bundle.putParcelableArray("states", d3nArr);
        } else {
            bundle = null;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.A00;
            if (i >= arrayList2.size()) {
                return bundle;
            }
            Fragment fragment = (Fragment) arrayList2.get(i);
            if (fragment != null && fragment.A1b()) {
                if (bundle == null) {
                    bundle = C17880vN.A0D();
                }
                this.A05.A0e(bundle, fragment, AnonymousClass001.A1I("f", AnonymousClass000.A10(), i));
            }
            i++;
        }
    }

    /* JADX INFO: finally extract failed */
    public void A0D(ViewGroup viewGroup) {
        C34001jj r2 = this.A02;
        if (r2 != null) {
            if (!this.A04) {
                try {
                    this.A04 = true;
                    r2.A04();
                    this.A04 = false;
                } catch (Throwable th) {
                    this.A04 = false;
                    throw th;
                }
            }
            this.A02 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r3 != null) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A0F(android.view.ViewGroup r6, int r7) {
        /*
            r5 = this;
            java.util.ArrayList r4 = r5.A00
            int r0 = r4.size()
            if (r0 <= r7) goto L_0x000f
            java.lang.Object r3 = r4.get(r7)
            if (r3 == 0) goto L_0x000f
        L_0x000e:
            return r3
        L_0x000f:
            X.1jj r0 = r5.A02
            if (r0 != 0) goto L_0x001c
            X.1GP r1 = r5.A05
            X.1jj r0 = new X.1jj
            r0.<init>(r1)
            r5.A02 = r0
        L_0x001c:
            androidx.fragment.app.Fragment r3 = r5.A0I(r7)
            java.util.ArrayList r1 = r5.A01
            int r0 = r1.size()
            if (r0 <= r7) goto L_0x0033
            java.lang.Object r0 = r1.get(r7)
            X.D3n r0 = (X.C26550D3n) r0
            if (r0 == 0) goto L_0x0033
            r3.A1U(r0)
        L_0x0033:
            int r0 = r4.size()
            if (r0 > r7) goto L_0x003e
            r0 = 0
            r4.add(r0)
            goto L_0x0033
        L_0x003e:
            r0 = 0
            r3.A1a(r0)
            int r2 = r5.A06
            if (r2 != 0) goto L_0x0049
            r3.A23(r0)
        L_0x0049:
            r4.set(r7, r3)
            X.1jj r1 = r5.A02
            int r0 = r6.getId()
            r1.A08(r3, r0)
            r0 = 1
            if (r2 != r0) goto L_0x000e
            X.1jj r1 = r5.A02
            X.1Fx r0 = X.C23401Fx.STARTED
            r1.A0A(r3, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass292.A0F(android.view.ViewGroup, int):java.lang.Object");
    }

    public void A0G(ViewGroup viewGroup, Object obj, int i) {
        ArrayList arrayList;
        C26550D3n d3n;
        Fragment fragment = (Fragment) obj;
        if (this.A02 == null) {
            this.A02 = new C34001jj(this.A05);
        }
        while (true) {
            arrayList = this.A01;
            if (arrayList.size() > i) {
                break;
            }
            arrayList.add((Object) null);
        }
        if (fragment.A1b()) {
            d3n = this.A05.A0N(fragment);
        } else {
            d3n = null;
        }
        arrayList.set(i, d3n);
        this.A00.set(i, (Object) null);
        this.A02.A07(fragment);
        if (fragment.equals(this.A03)) {
            this.A03 = null;
        }
    }

    public AnonymousClass292(AnonymousClass1GP r3, int i) {
        this.A05 = r3;
        this.A06 = i;
    }
}
