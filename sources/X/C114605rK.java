package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.5rK  reason: invalid class name and case insensitive filesystem */
public class C114605rK extends AnonymousClass290 {
    public HashMap A00 = C17880vN.A11();
    public AnonymousClass89I[] A01;
    public final HashMap A02 = C17880vN.A11();
    public final HashMap A03 = C17880vN.A11();
    public final HashSet A04 = C17880vN.A12();
    public final C18000vb A05;

    public C114605rK(C18000vb r2, AnonymousClass89I[] r3) {
        C18070vi.A0d(r3, 2);
        this.A05 = r2;
        this.A01 = r3;
        A01(this, r3);
    }

    public /* bridge */ /* synthetic */ Object A0J(ViewGroup viewGroup, int i) {
        int i2;
        C18070vi.A0d(viewGroup, 0);
        int A002 = A00(i);
        C17960vV.A07(this.A01[A002]);
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            C39711tW r1 = (C39711tW) it.next();
            RecyclerView recyclerView = ((C145227Kl) this.A01[A002]).A04;
            if (recyclerView != null) {
                recyclerView.A0t(r1);
            }
        }
        AnonymousClass89I r7 = this.A01[A002];
        String id = r7.getId();
        this.A00.put(id, r7);
        C145227Kl r72 = (C145227Kl) r7;
        LayoutInflater layoutInflater = r72.A0C;
        if (!(r72 instanceof C121136Hw)) {
            if (!(r72 instanceof C121146Hx)) {
                if (r72 instanceof C121156Hy) {
                    ((C121156Hy) r72).A08.A0N();
                } else if (r72 instanceof C121126Hv) {
                    i2 = 2131626673;
                }
            }
            i2 = 2131625328;
        } else if (((C121136Hw) r72) instanceof C121106Ht) {
            i2 = 2131627194;
        } else {
            i2 = 2131627104;
        }
        View A0D = AnonymousClass3MY.A0D(layoutInflater, i2);
        A0D.setBackgroundColor(r72.A09);
        r72.A04 = C108945cZ.A0U(A0D, 2131435730);
        Context context = r72.A0B;
        int i3 = r72.A00;
        if (i3 <= 0) {
            i3 = 1;
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, i3);
        r72.A03 = gridLayoutManager;
        r72.A04.setLayoutManager(gridLayoutManager);
        r72.A04.A0r(new C112555lf(r72.A0E, r72.A02));
        RecyclerView recyclerView2 = r72.A04;
        C112185l4 A003 = r72.A00();
        recyclerView2.suppressLayout(false);
        RecyclerView.A0C(A003, recyclerView2, true, false);
        recyclerView2.A0x(true);
        recyclerView2.requestLayout();
        RecyclerView recyclerView3 = r72.A04;
        recyclerView3.A0t(new C112715lv(recyclerView3.getResources(), r72.A03, r72.A0D));
        r72.A03(A0D);
        r72.A01();
        A0D.setTag(id);
        viewGroup.addView(A0D, 0);
        C17960vV.A05(A0D);
        return A0D;
    }

    private final int A00(int i) {
        int length;
        C18000vb r2 = this.A05;
        if (AnonymousClass3MY.A1b(r2)) {
            length = i;
        } else {
            length = (this.A01.length - 1) - i;
        }
        if (length < 0) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[3];
            objArr[0] = Boolean.valueOf(AnonymousClass3MY.A1b(r2));
            C17880vN.A1T(objArr, this.A01.length, 1);
            C17880vN.A1T(objArr, i, 2);
            Log.i(C108955ca.A12(locale, "ContentPagerAdapter/getAbsolutePosition/absolutePosition < 0, isLtr: %s, pages.length: %d, position: %d", Arrays.copyOf(objArr, 3)));
        }
        return length;
    }

    public static final void A01(C114605rK r5, AnonymousClass89I[] r6) {
        r5.A01 = r6;
        HashMap hashMap = r5.A03;
        hashMap.clear();
        int length = r6.length;
        for (int i = 0; i < length; i++) {
            C17890vO.A0z(r6[i].getId(), hashMap, r5.A00(i));
        }
    }

    public int A0E() {
        return this.A01.length;
    }

    public /* bridge */ /* synthetic */ int A0I(Object obj) {
        View view = (View) obj;
        C18070vi.A0d(view, 0);
        Object tag = view.getTag();
        C18070vi.A0z(tag, "null cannot be cast to non-null type kotlin.String");
        Number A1D = C108945cZ.A1D(tag, this.A03);
        if (A1D != null) {
            int intValue = A1D.intValue();
            HashMap hashMap = this.A02;
            Number A1D2 = C108945cZ.A1D(tag, hashMap);
            if (A1D2 != null && intValue == A1D2.intValue()) {
                return -1;
            }
            hashMap.put(tag, A1D);
            return intValue;
        }
        this.A02.remove(tag);
        return -2;
    }

    public /* bridge */ /* synthetic */ void A0K(ViewGroup viewGroup, Object obj, int i) {
        View view = (View) obj;
        C18070vi.A0i(viewGroup, view);
        int A002 = A00(i);
        Object tag = view.getTag();
        C18070vi.A0z(tag, "null cannot be cast to non-null type kotlin.String");
        viewGroup.removeView(view);
        AnonymousClass89I r3 = (AnonymousClass89I) this.A00.remove(tag);
        if (r3 != null) {
            Iterator it = this.A04.iterator();
            while (it.hasNext()) {
                C39711tW r1 = (C39711tW) it.next();
                RecyclerView recyclerView = ((C145227Kl) r3).A04;
                if (recyclerView != null) {
                    recyclerView.A0u(r1);
                }
            }
            r3.BrI(viewGroup, view, A002);
        }
    }

    public /* bridge */ /* synthetic */ boolean A0L(View view, Object obj) {
        C18070vi.A0h(view, obj);
        return AnonymousClass000.A1Z(view, obj);
    }
}
