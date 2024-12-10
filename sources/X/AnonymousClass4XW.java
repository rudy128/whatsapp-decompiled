package X;

import android.widget.Toast;
import com.whatsapp.mediacomposer.helper.MediaQualityToastHelper$showMediaQualityToast$1;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4XW  reason: invalid class name */
public final class AnonymousClass4XW {
    public Toast A00;
    public boolean A01;
    public final AnonymousClass1KB A02;
    public final C18000vb A03;
    public final C34501ka A04;
    public final Map A05;
    public final C18600wl A06;
    public final C18600wl A07;
    public final AnonymousClass1OX A08 = AnonymousClass1OW.A01();

    public AnonymousClass4XW(AnonymousClass1KB r13, C18000vb r14, C34501ka r15, C18600wl r16, C18600wl r17) {
        int A0G = C72453Mb.A0G(r13, r14, 1);
        C18070vi.A0d(r15, 3);
        C18600wl r2 = r16;
        C18600wl r0 = r17;
        C18070vi.A0g(r2, 4, r0);
        this.A02 = r13;
        this.A03 = r14;
        this.A04 = r15;
        this.A06 = r2;
        this.A07 = r0;
        AnonymousClass1D6[] r8 = new AnonymousClass1D6[A0G];
        AnonymousClass1D6[] r22 = new AnonymousClass1D6[4];
        r22[0] = AnonymousClass1D6.A00(1, 2131755225);
        C72463Mc.A1N(r22, 2131755486, 1, 3);
        C72463Mc.A1N(r22, 2131755158, A0G, 13);
        C72463Mc.A1N(r22, 2131755240, 3, -1);
        AnonymousClass1D6.A03(3, AnonymousClass1D7.A0B(r22), r8, 0);
        AnonymousClass1D6[] r1 = new AnonymousClass1D6[4];
        C72463Mc.A1N(r1, 2131755224, 0, 1);
        C72463Mc.A1N(r1, 2131755485, 1, 3);
        C72463Mc.A1N(r1, 2131755157, A0G, 13);
        C72463Mc.A1N(r1, 2131755239, 3, -1);
        AnonymousClass1D6.A03(0, AnonymousClass1D7.A0B(r1), r8, 1);
        this.A05 = AnonymousClass1D7.A0B(r8);
    }

    public final void A01(AnonymousClass73D r8, Set set, int i) {
        AnonymousClass73D r2 = r8;
        C18070vi.A0d(r8, 0);
        if (!this.A01) {
            this.A01 = true;
            return;
        }
        Toast toast = this.A00;
        if (toast != null) {
            toast.cancel();
        }
        this.A00 = null;
        AnonymousClass3MX.A1Q(new MediaQualityToastHelper$showMediaQualityToast$1(r2, this, set, (C30391dr) null, i), this.A08);
    }

    public static final Map A00(AnonymousClass4XW r5, Collection collection) {
        int A012;
        LinkedHashMap A13 = C17880vN.A13();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass72S r1 = (AnonymousClass72S) it.next();
            if (r1.A0W()) {
                A012 = 13;
            } else {
                A012 = r5.A04.A01(r1);
            }
            Integer valueOf = Integer.valueOf(A012);
            Object obj = A13.get(valueOf);
            if (obj == null && !A13.containsKey(valueOf)) {
                obj = new Object();
            }
            C98474rD r12 = (C98474rD) obj;
            r12.element++;
            A13.put(valueOf, r12);
        }
        Iterator A15 = AnonymousClass000.A15(A13);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            C18070vi.A0z(A16, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>");
            C41681wt.A02(A16).setValue(Integer.valueOf(((C98474rD) A16.getValue()).element));
        }
        return C41681wt.A03(A13);
    }
}
