package X;

import android.content.Context;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.DFk  reason: case insensitive filesystem */
public class C26828DFk implements C16890tO {
    public final CU5 A00;
    public final C24752CIp A01;

    /* JADX WARNING: type inference failed for: r1v2, types: [X.BLm, X.BMI, X.CcK] */
    public /* bridge */ /* synthetic */ Object BD3(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        CU5 cu5 = this.A00;
        cu5.A07 = recyclerView;
        recyclerView.A0t(cu5.A06);
        int i = cu5.A00;
        if (i != -1) {
            if (!cu5.A09) {
                recyclerView.A0f(i);
            } else if (!cu5.A08.equals("")) {
                ? bmi = new BMI(context);
                bmi.A00 = 0;
                bmi.A03 = true;
                bmi.A01 = 0;
                bmi.A0D(cu5.A08);
                bmi.A00 = cu5.A03;
                bmi.A03 = cu5.A0B;
                bmi.A00 = cu5.A00;
                C38251qy layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.A0e(bmi);
                }
            } else {
                recyclerView.A0g(i);
            }
            cu5.A00 = -1;
            cu5.A09 = false;
            cu5.A08 = "";
            cu5.A03 = 0;
            cu5.A0B = true;
        }
        int i2 = cu5.A01;
        if (i2 == -1 && cu5.A02 == -1) {
            return null;
        }
        boolean z = cu5.A0A;
        int i3 = cu5.A02;
        if (z) {
            recyclerView.A0l(i2, i3);
        } else {
            recyclerView.scrollBy(i2, i3);
        }
        cu5.A01 = -1;
        cu5.A02 = -1;
        cu5.A0A = false;
        return null;
    }

    public /* bridge */ /* synthetic */ void CQ4(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2 = (RecyclerView) obj;
        if (Build.VERSION.SDK_INT >= 26 && (recyclerView = this.A00.A07) != null) {
            recyclerView.setImportantForAutofill(0);
        }
        CU5 cu5 = this.A00;
        cu5.A07 = null;
        recyclerView2.A0u(cu5.A06);
    }

    public C26828DFk(C24752CIp cIp, CU5 cu5) {
        this.A00 = cu5;
        this.A01 = cIp;
    }

    public /* synthetic */ String BQX() {
        return C25321CdS.A01(this);
    }

    public /* synthetic */ Class Bar() {
        return getClass();
    }

    public /* bridge */ /* synthetic */ boolean CMV(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
