package X;

import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0LE  reason: invalid class name */
public abstract class AnonymousClass0LE {
    public static final void A01(ViewStructure viewStructure, AnonymousClass0WG r6) {
        Map map = r6.A01.A00;
        int A00 = C04480No.A00(viewStructure, map.size());
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            int A0M = AnonymousClass000.A0M(A16.getKey());
            A16.getValue();
            ViewStructure A01 = C04480No.A01(viewStructure, A00);
            if (A01 != null) {
                AutofillId A002 = AnonymousClass0QJ.A00(viewStructure);
                C18070vi.A0b(A002);
                AnonymousClass0QJ.A03(A01, A002, A0M);
                C04480No.A02(A01, r6.A00.getContext().getPackageName(), A0M);
                AnonymousClass0QJ.A02(A01);
                throw AnonymousClass000.A0s("getAutofillTypes");
            }
            A00++;
        }
    }

    public static final void A00(SparseArray sparseArray, AnonymousClass0WG r7) {
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            AutofillValue autofillValue = (AutofillValue) sparseArray.get(keyAt);
            if (AnonymousClass0QJ.A06(autofillValue)) {
                AnonymousClass0HA r1 = r7.A01;
                AnonymousClass0QJ.A01(autofillValue).toString();
                r1.A00.get(Integer.valueOf(keyAt));
            } else if (AnonymousClass0QJ.A04(autofillValue)) {
                throw new C122776Rw(AnonymousClass000.A0y("b/138604541: Add onFill() callback for date", AnonymousClass000.A11("An operation is not implemented: ")));
            } else if (AnonymousClass0QJ.A05(autofillValue)) {
                throw new C122776Rw(AnonymousClass000.A0y("b/138604541: Add onFill() callback for list", AnonymousClass000.A11("An operation is not implemented: ")));
            } else if (AnonymousClass0QJ.A07(autofillValue)) {
                throw new C122776Rw(AnonymousClass000.A0y("b/138604541:  Add onFill() callback for toggle", AnonymousClass000.A11("An operation is not implemented: ")));
            }
        }
    }
}
