package X;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.whatsapp.HomeActivity;
import com.whatsapp.conversationslist.ConversationsFragment;

@Deprecated
/* renamed from: X.1b9  reason: invalid class name and case insensitive filesystem */
public abstract class C28861b9 extends AnonymousClass1b8 {
    public C34001jj A00 = null;
    public Fragment A01 = null;
    public boolean A02;
    public final int A03;
    public final AnonymousClass1GP A04;

    public Fragment A0I(int i) {
        C18140vp r0;
        AnonymousClass1bB r3 = (AnonymousClass1bB) this;
        HomeActivity homeActivity = r3.A01;
        int A4l = homeActivity.A4l(i);
        if (A4l == 200) {
            return new ConversationsFragment();
        }
        if (!(A4l == 300 || A4l == 400)) {
            if (A4l == 600) {
                r0 = (C18140vp) homeActivity.A25.get(Integer.valueOf(A4l));
                if (r0 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("No HomeFragment mapping for community tab id: ");
                    sb.append(A4l);
                    throw new IllegalStateException(sb.toString());
                }
                return (Fragment) r0.get();
            } else if (!(A4l == 700 || A4l == 800)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("The item position should be less or equal to:");
                sb2.append(r3.A00);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        r0 = (C18140vp) homeActivity.A25.get(Integer.valueOf(A4l));
        if (r0 == null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("No HomeFragment mapping for tab id: ");
            sb3.append(A4l);
            throw new IllegalStateException(sb3.toString());
        }
        return (Fragment) r0.get();
    }

    public void A09(ViewGroup viewGroup, Object obj, int i) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.A01;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.A1a(false);
                if (this.A03 == 1) {
                    C34001jj r2 = this.A00;
                    if (r2 == null) {
                        r2 = new C34001jj(this.A04);
                        this.A00 = r2;
                    }
                    r2.A0A(this.A01, C23401Fx.STARTED);
                } else {
                    this.A01.A23(false);
                }
            }
            fragment.A1a(true);
            if (this.A03 == 1) {
                C34001jj r1 = this.A00;
                if (r1 == null) {
                    r1 = new C34001jj(this.A04);
                    this.A00 = r1;
                }
                r1.A0A(fragment, C23401Fx.RESUMED);
            } else {
                fragment.A23(true);
            }
            this.A01 = fragment;
        }
    }

    /* JADX INFO: finally extract failed */
    public void A0D(ViewGroup viewGroup) {
        C34001jj r2 = this.A00;
        if (r2 != null) {
            if (!this.A02) {
                try {
                    this.A02 = true;
                    r2.A04();
                    this.A02 = false;
                } catch (Throwable th) {
                    this.A02 = false;
                    throw th;
                }
            }
            this.A00 = null;
        }
    }

    public Object A0F(ViewGroup viewGroup, int i) {
        long j;
        if (this.A00 == null) {
            this.A00 = new C34001jj(this.A04);
        }
        if (this instanceof AnonymousClass1bB) {
            j = (long) ((AnonymousClass1bB) this).A01.A4l(i);
        } else {
            j = (long) i;
        }
        int id = viewGroup.getId();
        StringBuilder sb = new StringBuilder();
        sb.append("android:switcher:");
        sb.append(id);
        sb.append(":");
        sb.append(j);
        Fragment A0Q = this.A04.A0Q(sb.toString());
        if (A0Q != null) {
            this.A00.A0F(new C34271kD(A0Q, 7));
        } else {
            A0Q = A0I(i);
            C34001jj r5 = this.A00;
            int id2 = viewGroup.getId();
            int id3 = viewGroup.getId();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("android:switcher:");
            sb2.append(id3);
            sb2.append(":");
            sb2.append(j);
            r5.A0C(A0Q, sb2.toString(), id2);
        }
        if (A0Q != this.A01) {
            A0Q.A1a(false);
            if (this.A03 == 1) {
                this.A00.A0A(A0Q, C23401Fx.STARTED);
            } else {
                A0Q.A23(false);
                return A0Q;
            }
        }
        return A0Q;
    }

    public void A0G(ViewGroup viewGroup, Object obj, int i) {
        Fragment fragment = (Fragment) obj;
        C34001jj r2 = this.A00;
        if (r2 == null) {
            r2 = new C34001jj(this.A04);
            this.A00 = r2;
        }
        AnonymousClass1GP r1 = fragment.A0I;
        if (r1 == null || r1 == r2.A0K) {
            r2.A0F(new C34271kD(fragment, 6));
            if (fragment.equals(this.A01)) {
                this.A01 = null;
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
        sb.append(fragment.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }

    public C28861b9(AnonymousClass1GP r2, int i) {
        this.A04 = r2;
        this.A03 = i;
    }
}
