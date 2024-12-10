package X;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Lu  reason: invalid class name and case insensitive filesystem */
public final class C121866Lu extends A34 {
    public final AnonymousClass118 A00;
    public final C18100vl A01;
    public final C18100vl A02 = AnonymousClass1DF.A01(new C150697l6(this));
    public final C18100vl A03 = AnonymousClass1DF.A01(new C150707l7(this));
    public final C22821Di A04;

    public C121866Lu(AnonymousClass1F9 r2, AnonymousClass118 r3, C22821Di r4, int i) {
        super(r2, true);
        this.A00 = r3;
        this.A04 = r4;
        this.A01 = AnonymousClass1DF.A01(new C150687l5(i));
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C18070vi.A0d(obj, 0);
        this.A04.invoke(obj);
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        C18100vl r8 = this.A02;
        C18100vl r7 = this.A01;
        List<ResolveInfo> queryIntentActivities = ((PackageManager) AnonymousClass3MX.A14(r8)).queryIntentActivities((Intent) r7.getValue(), 0);
        ArrayList<ResolveInfo> A0t = C108965cb.A0t(queryIntentActivities);
        for (ResolveInfo next : queryIntentActivities) {
            if (next.activityInfo.exported) {
                A0t.add(next);
            }
        }
        if (A0t.isEmpty()) {
            return C18460wS.A00;
        }
        Drawable A002 = C24261Jm.A00(this.A00.A00, 2131951618);
        if (A002 != null) {
            int intrinsicHeight = A002.getIntrinsicHeight();
            ArrayList<AnonymousClass1D6> A0E = C29351c6.A0E(A0t);
            for (ResolveInfo resolveInfo : A0t) {
                AnonymousClass1D6.A02(resolveInfo, resolveInfo.loadIcon((PackageManager) AnonymousClass3MX.A14(r8)), A0E);
            }
            ArrayList A0E2 = C29351c6.A0E(A0E);
            for (AnonymousClass1D6 r0 : A0E) {
                C17890vO.A1D(A0E2, ((Drawable) r0.second).getIntrinsicHeight());
            }
            Iterator it = A0E2.iterator();
            while (it.hasNext()) {
                intrinsicHeight = Math.min(intrinsicHeight, C72453Mb.A0H(it));
            }
            ArrayList A0E3 = C29351c6.A0E(A0E);
            for (AnonymousClass1D6 r9 : A0E) {
                ActivityInfo activityInfo = ((ResolveInfo) r9.first).activityInfo;
                C18070vi.A0W(activityInfo);
                Drawable A07 = AnonymousClass4aX.A07((Resources) this.A03.getValue(), (Drawable) r9.second, intrinsicHeight);
                C18070vi.A0X(A07);
                CharSequence loadLabel = ((ResolveInfo) r9.first).loadLabel((PackageManager) AnonymousClass3MX.A14(r8));
                C18070vi.A0X(loadLabel);
                A0E3.add(new AnonymousClass6g8((Intent) r7.getValue(), activityInfo, A07, loadLabel));
            }
            return A0E3;
        }
        throw AnonymousClass000.A0s("Icon is NULL");
    }
}
