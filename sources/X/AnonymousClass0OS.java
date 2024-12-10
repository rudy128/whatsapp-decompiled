package X;

import android.content.Context;
import android.graphics.Rect;
import com.facebook.rendercore.RenderTreeNode;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.0OS  reason: invalid class name */
public final class AnonymousClass0OS {
    public static final C04220Mi A00(AnonymousClass0IV r14, C16930tS r15, AnonymousClass0sU r16, Object obj, long j) {
        C16930tS r5 = r15;
        C18070vi.A0d(r15, 2);
        C05050Qf r0 = AnonymousClass0O3.A00;
        AnonymousClass0O7.A01("Reducer.reduceTree");
        ArrayList A13 = AnonymousClass000.A13();
        RenderTreeNode A00 = AnonymousClass0O3.A00(new Rect(0, 0, r15.getWidth(), r15.getHeight()), r15, (RenderTreeNode) null, AnonymousClass0O3.A00);
        A13.add(A00);
        AnonymousClass0IV r10 = r14;
        AnonymousClass0O3.A01(r14.A02, r5, A00, A13, 0, 0);
        RenderTreeNode[] renderTreeNodeArr = (RenderTreeNode[]) A13.toArray(new RenderTreeNode[0]);
        AnonymousClass0O7.A00();
        if (!AnonymousClass0GK.A00) {
            r5 = null;
        }
        return new C04220Mi(r16, new C04240Mk(r10, A00, r5, renderTreeNodeArr, j), obj, r10.A00().A01);
    }

    public static final boolean A01(AnonymousClass0sU r7, C04220Mi r8, long j) {
        C18070vi.A0d(r7, 0);
        C04240Mk r1 = r8.A01;
        if (r7 != r8.A00) {
            return false;
        }
        long j2 = r1.A00;
        Rect rect = r1.A03.A03;
        if (C04520Ns.A02(j, j2, C02760Fg.A00(rect.width(), rect.height()))) {
            return true;
        }
        return false;
    }

    public final C04220Mi A03(Context context, C04220Mi r9, AnonymousClass0Jt r10, Object obj, int i, long j) {
        C04220Mi A04;
        C18070vi.A0d(r10, 1);
        AnonymousClass0O7.A01("RC Create Tree");
        long j2 = j;
        if (r9 != null) {
            AnonymousClass0sU r4 = r10.A00;
            if (A01(r4, r9, j)) {
                A04 = new C04220Mi(r4, r9.A01, r10.A01, r9.A03);
                AnonymousClass0O7.A00();
                return A04;
            }
        }
        A04 = A04(A02(context, r9, obj, i), r10.A00, r10.A01, j2);
        AnonymousClass0O7.A00();
        return A04;
    }

    public final C04220Mi A04(AnonymousClass0IV r9, AnonymousClass0sU r10, Object obj, long j) {
        C18070vi.A0d(r10, 1);
        AnonymousClass0O7.A01("RC Layout");
        C16930tS BDo = r10.BDo(r9, C04520Ns.A01(j), C04520Ns.A00(j));
        AnonymousClass0O7.A00();
        AnonymousClass0O7.A01("RC Reduce");
        C04220Mi A00 = A00(r9, BDo, r10, obj, j);
        AnonymousClass0O7.A00();
        r9.A00 = null;
        return A00;
    }

    public final AnonymousClass0IV A02(Context context, C04220Mi r4, Object obj, int i) {
        Map map;
        if (r4 == null || (map = r4.A03) == null) {
            map = null;
        }
        return new AnonymousClass0IV(context, new C04170Mc(map), obj, i);
    }
}
