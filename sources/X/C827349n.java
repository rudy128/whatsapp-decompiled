package X;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.49n  reason: invalid class name and case insensitive filesystem */
public final class C827349n extends AnonymousClass70X {
    public C88514a0 A00 = new C88514a0((AnonymousClass4TS) null, (AnonymousClass4OI) null, AnonymousClass00R.A00, 1, 0, 4, false, true);
    public AnonymousClass88O A01;
    public AnonymousClass88S A02;
    public final ViewGroup A03;
    public final AnonymousClass1KB A04;
    public final C86034Px A05;
    public final Runnable A06 = new C98784ri((Object) this, 17);
    public final boolean A07;
    public final View A08;
    public final Runnable A09 = new C98784ri((Object) this, 16);

    public C827349n(View view, ViewGroup viewGroup, AnonymousClass1KB r12, C18030ve r13, C86034Px r14) {
        C18070vi.A0d(r13, 1);
        C18070vi.A0k(r12, r14);
        C18070vi.A0g(viewGroup, 4, view);
        this.A04 = r12;
        this.A05 = r14;
        this.A03 = viewGroup;
        this.A08 = view;
        this.A07 = C18020vd.A05(C18040vf.A02, r13, 9772);
    }

    public void A0B() {
        A0h(false);
    }

    public void A0D() {
    }

    public void A0K() {
        A0h(true);
    }

    public boolean A0c() {
        return false;
    }

    public static final void A00(C827349n r11) {
        AnonymousClass1KB r1 = r11.A04;
        r1.A0I(r11.A09);
        r1.A0I(r11.A06);
        C88514a0 r0 = r11.A00;
        AnonymousClass4OI r12 = r0.A04;
        AnonymousClass4TS r3 = r0.A03;
        boolean z = r0.A07;
        boolean z2 = r0.A06;
        A02(r11, new C88514a0(r3, (AnonymousClass4OI) null, AnonymousClass00R.A00, 1, 0, r0.A00, z, z2));
        if (r12 != null) {
            AnonymousClass70X r02 = r12.A03;
            r02.A0T((AnonymousClass88S) null);
            r12.A01 = null;
            r02.A0L();
            r12.A00 = null;
            r02.A0S((AnonymousClass88O) null);
        }
    }

    public static void A01(C827349n r9, AnonymousClass4TS r10, C88514a0 r11, int i, boolean z) {
        boolean z2 = r11.A06;
        AnonymousClass4TS r1 = r10;
        A02(r9, new C88514a0(r1, r11.A04, r11.A05, i, r11.A01, r11.A00, z, z2));
    }

    public static final void A02(C827349n r7, C88514a0 r8) {
        AnonymousClass88S r1;
        C88514a0 r3 = r7.A00;
        r7.A00 = r8;
        if (!r8.equals(r3)) {
            View view = r7.A08;
            Integer num = r8.A05;
            Integer num2 = AnonymousClass00R.A0N;
            int i = 0;
            if (num == num2 && r8.A02() != 4) {
                i = r8.A02() == 3 ? 4 : view.getVisibility();
            }
            view.setVisibility(i);
            AnonymousClass4OI r2 = r7.A00.A04;
            if (r2 != null) {
                r2.A03.A0W(r8.A06);
                int i2 = r8.A00;
                AnonymousClass70X r12 = r2.A03;
                r12.A0O(i2);
                if (num != num2 || !r7.A00.A07) {
                    Log.i("conversation/row/ConversationRowInlineVideoPlayer/pause");
                    r12.A0B();
                } else {
                    Log.i("conversation/row/ConversationRowInlineVideoPlayer/resume");
                    r12.A0K();
                }
            }
            boolean z = r8.A07;
            if ((z != r3.A07 || r8.A02() != r3.A02()) && (r1 = r7.A02) != null) {
                r1.C0q(z, r8.A02());
            }
        }
    }

    public int A05() {
        AnonymousClass4OI r0 = this.A00.A04;
        if (r0 != null) {
            return r0.A03.A05();
        }
        return 0;
    }

    public int A06() {
        AnonymousClass4OI r0 = this.A00.A04;
        if (r0 != null) {
            return r0.A03.A06();
        }
        return 0;
    }

    public int A07() {
        AnonymousClass4OI r0 = this.A00.A04;
        if (r0 != null) {
            return r0.A03.A07();
        }
        return 0;
    }

    public Bitmap A08() {
        AnonymousClass4OI r0 = this.A00.A04;
        if (r0 != null) {
            return r0.A03.A08();
        }
        return null;
    }

    public View A09() {
        return this.A03;
    }

    public void A0E() {
        if (this.A00.A02() == 4) {
            A0M(0);
        }
        A0f();
        A0h(true);
    }

    public void A0F() {
        AnonymousClass4OI r2 = this.A00.A04;
        A00(this);
        if (r2 != null) {
            AnonymousClass4ZL r1 = this.A05.A00;
            C17960vV.A02();
            if (r1.A0D.remove(r2)) {
                List list = r1.A0C;
                list.add(r2);
                r2.hashCode();
                list.size();
                return;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("VideoPlayerPoolManager/releaseVideoPlayerInstance/playerNotProvidedByPool videoPlayerId=");
            A10.append(r2.hashCode());
            C17890vO.A0w(A10);
        }
    }

    public void A0M(int i) {
        C88514a0 r0 = this.A00;
        AnonymousClass4OI r2 = r0.A04;
        int i2 = i;
        if (r2 != null) {
            r2.A03.A0M(i);
            return;
        }
        AnonymousClass4TS r1 = r0.A03;
        boolean z = r0.A07;
        A02(this, new C88514a0(r1, r2, r0.A05, r0.A02, i2, r0.A00, z, r0.A06));
    }

    public void A0O(int i) {
        C88514a0 r0 = this.A00;
        AnonymousClass4TS r1 = r0.A03;
        boolean z = r0.A07;
        int i2 = r0.A02;
        boolean z2 = r0.A06;
        A02(this, new C88514a0(r1, r0.A04, r0.A05, i2, r0.A01, i, z, z2));
    }

    public void A0T(AnonymousClass88S r1) {
        this.A0B = r1;
        this.A02 = r1;
    }

    public void A0W(boolean z) {
        C88514a0 r0 = this.A00;
        AnonymousClass4TS r1 = r0.A03;
        boolean z2 = r0.A07;
        int i = r0.A02;
        A02(this, new C88514a0(r1, r0.A04, r0.A05, i, r0.A01, r0.A00, z2, z));
    }

    public boolean A0X() {
        AnonymousClass4OI r0 = this.A00.A04;
        if (r0 != null) {
            return r0.A03.A0X();
        }
        return false;
    }

    public boolean A0Y() {
        AnonymousClass4OI r0 = this.A00.A04;
        if (r0 != null) {
            return r0.A03.A0Y();
        }
        return false;
    }

    public boolean A0Z() {
        AnonymousClass4OI r0 = this.A00.A04;
        if (r0 != null) {
            return r0.A03.A0Z();
        }
        return false;
    }

    public boolean A0a() {
        C88514a0 r1 = this.A00;
        if (!r1.A07 || r1.A02() != 3) {
            return false;
        }
        return true;
    }

    public boolean A0b() {
        AnonymousClass4OI r0 = this.A00.A04;
        if (r0 != null) {
            return r0.A03.A0b();
        }
        return false;
    }

    public boolean A0e() {
        AnonymousClass4OI r0 = this.A00.A04;
        if (r0 != null) {
            return r0.A03.A0e();
        }
        return false;
    }

    public final void A0f() {
        C88514a0 r2 = this.A00;
        Integer num = r2.A05;
        if (num == AnonymousClass00R.A00 || num == AnonymousClass00R.A0Y) {
            A02(this, C88514a0.A00(r2, AnonymousClass00R.A01));
            this.A04.A0J(this.A09);
        }
    }

    public final void A0g(AnonymousClass21X r5, int i) {
        AnonymousClass21X r0;
        AnonymousClass4TS r3;
        AnonymousClass4TS r1 = this.A00.A03;
        if (r1 != null) {
            r0 = r1.A01;
        } else {
            r0 = null;
        }
        if (!C18070vi.A18(r5, r0) || r1 == null || i != r1.A00) {
            A0F();
            if (r5 == null) {
                r3 = null;
            } else {
                r3 = new AnonymousClass4TS(r5, i);
            }
            C88514a0 r2 = this.A00;
            A01(this, r3, r2, r2.A02, r2.A07);
        }
    }

    public final void A0h(boolean z) {
        C88514a0 r2 = this.A00;
        A01(this, r2.A03, r2, r2.A02, z);
    }

    public void A0S(AnonymousClass88O r1) {
        this.A01 = r1;
    }
}
