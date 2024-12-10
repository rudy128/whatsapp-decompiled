package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: X.6uX  reason: invalid class name and case insensitive filesystem */
public abstract class C136866uX {
    public int A00;
    public int A01;
    public int A02;
    public C114605rK A03;
    public C1607789w A04;
    public final Context A05;
    public final C39711tW A06;
    public final ViewPager A07;
    public final C18000vb A08;
    public final LayoutInflater A09;
    public final C39711tW A0A = new C112735lx(this, 10);
    public final C39711tW A0B = new C112735lx(this, 11);

    public C136866uX(Context context, ViewGroup viewGroup, C39711tW r6, C18000vb r7, int i) {
        C18070vi.A0g(context, 1, r6);
        this.A05 = context;
        this.A08 = r7;
        this.A06 = r6;
        LayoutInflater from = LayoutInflater.from(context);
        C18070vi.A0X(from);
        this.A09 = from;
        this.A01 = AnonymousClass3Ma.A00(context, 2130969438, 2131100423);
        this.A02 = AnonymousClass3Ma.A00(context, 2130970659, 2131102034);
        ViewPager viewPager = (ViewPager) viewGroup.findViewById(i);
        viewPager.A0K(new C142707Am(this, 1));
        this.A07 = viewPager;
    }

    public final int A03() {
        int i;
        ViewPager viewPager;
        int currentItem;
        Integer num;
        C18000vb r7 = this.A08;
        if (AnonymousClass3MY.A1b(r7)) {
            viewPager = this.A07;
            currentItem = viewPager.getCurrentItem();
        } else {
            C114605rK r0 = this.A03;
            if (r0 != null) {
                i = r0.A01.length;
            } else {
                i = 0;
            }
            viewPager = this.A07;
            currentItem = (i - 1) - viewPager.getCurrentItem();
        }
        if (currentItem < 0) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[3];
            objArr[0] = Boolean.valueOf(AnonymousClass3MY.A1b(r7));
            C114605rK r02 = this.A03;
            if (r02 != null) {
                num = Integer.valueOf(r02.A01.length);
            } else {
                num = null;
            }
            objArr[1] = num;
            AnonymousClass3Ma.A1S(objArr, viewPager.getCurrentItem());
            Log.i(C108955ca.A12(locale, "ContentPicker/getCurrentPageIndex < 0, isLtr: %s, pagerAdapter.getCount(): %d, viewPager.getCurrentItem(): %d", Arrays.copyOf(objArr, 3)));
        }
        return currentItem;
    }

    public void A04(int i) {
        C121146Hx r1;
        C121156Hy r12;
        if (this instanceof AnonymousClass6CG) {
            AnonymousClass6CG r13 = (AnonymousClass6CG) this;
            try {
                r13.A07(((AnonymousClass89I) r13.A05.get(i)).getId());
            } catch (Exception e) {
                Log.e("AvatarStickerPicker/onPageSelected/Error changing selected page", e);
            }
        } else {
            AnonymousClass6CF r4 = (AnonymousClass6CF) this;
            C145227Kl r5 = (C145227Kl) r4.A0E.get(i);
            r5.A04(r4.A05, true);
            C145227Kl r2 = r4.A0C;
            if (!(r2 == null || r2 == r5)) {
                r2.A04((AnonymousClass1BI) null, false);
            }
            r4.A0C = r5;
            if (r5 instanceof C121136Hw) {
                AnonymousClass725 r3 = ((C121136Hw) r5).A04;
                r3.A0B = false;
                AnonymousClass1SB r22 = r4.A0Y;
                AnonymousClass7RQ.A02(r22.A0C, r22, r3, 23);
            }
            if (!(r5.getId().equals("recents") || (r12 = r4.A0A) == null || r12.A04 == null)) {
                r12.A01();
            }
            if (!r5.getId().equals("starred") && (r1 = r4.A0B) != null && r1.A04 != null) {
                r1.A01();
            }
        }
    }

    public final void A05(int i, boolean z) {
        int i2;
        int i3;
        int i4;
        Integer num;
        boolean z2 = true;
        if (AnonymousClass3MY.A1b(this.A08)) {
            i3 = i;
        } else {
            C114605rK r0 = this.A03;
            if (r0 != null) {
                i2 = r0.A01.length;
            } else {
                i2 = 0;
            }
            i3 = (i2 - 1) - i;
        }
        if (i3 < 0) {
            Locale locale = Locale.US;
            Object[] A1b = AnonymousClass3MW.A1b();
            C114605rK r1 = this.A03;
            if (r1 != null) {
                num = Integer.valueOf(r1.A01.length);
            } else {
                num = null;
            }
            A1b[0] = num;
            C17880vN.A1T(A1b, i, 1);
            Log.i(C108955ca.A12(locale, "ContentPicker/selectPageByIndex/absoluteIndex < 0, pagerAdapter.getCount(): %d, index: %d", Arrays.copyOf(A1b, 2)));
        }
        C114605rK r12 = this.A03;
        if (r12 != null) {
            i4 = r12.A01.length;
        } else {
            i4 = 0;
        }
        if (i >= 0 && i < i4 && this.A00 != i3) {
            ViewPager viewPager = this.A07;
            if (z) {
                Boolean bool = C17970vW.A03;
            } else {
                z2 = false;
            }
            viewPager.A0J(i3, z2);
        }
    }

    public final void A06(C114605rK r4) {
        this.A03 = r4;
        C39711tW r0 = this.A0A;
        C18070vi.A0d(r0, 0);
        HashSet hashSet = r4.A04;
        hashSet.add(r0);
        C39711tW r02 = this.A0B;
        C18070vi.A0d(r02, 0);
        hashSet.add(r02);
        this.A07.setAdapter(r4);
    }
}
