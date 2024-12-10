package X;

import android.os.Bundle;
import android.text.TextUtils;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class A36 {
    public List A00;
    public Set A01 = C17880vN.A12();
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04 = false;
    public final C18000vb A05;
    public final C22432B7o A06;
    public final C184229ac A07;
    public final AnonymousClass1XN A08;

    public void A07() {
        this.A03 = false;
        this.A04 = false;
        this.A01 = C17880vN.A12();
        this.A02 = false;
    }

    public static C174078wC A00(A36 a36, C22553BCk bCk, int i) {
        Integer num;
        if (a36.A04) {
            num = C17880vN.A0h();
        } else {
            num = null;
        }
        C184229ac r0 = a36.A07;
        Set set = a36.A01;
        List list = a36.A00;
        boolean z = a36.A03;
        boolean z2 = a36.A02;
        ArrayList A13 = AnonymousClass000.A13();
        if (r0.A00.Bem()) {
            A13.add(new C169308kp(z2));
        }
        boolean z3 = true;
        if (list != null && !list.isEmpty()) {
            A13.add(new C169298ko(set, C108945cZ.A1U(set)));
        }
        if (num == null) {
            z3 = false;
        }
        A13.add(new C169328kr(z3));
        A13.add(new C169318kq(z));
        if (!set.isEmpty() || num != null || z || z2) {
            A13.add(new Object());
        }
        if (!A13.isEmpty()) {
            return new C174078wC(bCk, A13, i);
        }
        return null;
    }

    public C197799xH A04() {
        List list = this.A00;
        if (list == null) {
            return null;
        }
        ArrayList A10 = C17880vN.A10(list);
        Collections.sort(A10, new C21479Akk(Collator.getInstance(this.A05.A0N()), 4));
        return new C197799xH(A10, C17880vN.A10(this.A01));
    }

    public Boolean A05() {
        if (this.A06.Bem()) {
            return Boolean.valueOf(this.A02);
        }
        return null;
    }

    public String A06() {
        if (this.A01.isEmpty()) {
            return null;
        }
        ArrayList A13 = AnonymousClass000.A13();
        for (AEQ aeq : this.A01) {
            A13.add(aeq.A00);
        }
        return TextUtils.join(",", A13);
    }

    public void A08(Bundle bundle) {
        HashSet A12;
        boolean z = bundle.getBoolean("saved_open_now");
        boolean z2 = false;
        if (Boolean.valueOf(z) == null) {
            z = false;
        }
        this.A04 = z;
        boolean z3 = bundle.getBoolean("saved_has_catalog");
        if (Boolean.valueOf(z3) == null) {
            z3 = false;
        }
        this.A03 = z3;
        boolean z4 = bundle.getBoolean("saved_distance");
        if (Boolean.valueOf(z4) != null) {
            z2 = z4;
        }
        this.A02 = z2;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("saved_selected_multiple_choice_category");
        if (parcelableArrayList != null) {
            A12 = AnonymousClass8BR.A12(parcelableArrayList);
        } else {
            A12 = C17880vN.A12();
        }
        this.A01 = A12;
        this.A00 = bundle.getParcelableArrayList("saved_current_filter_categories");
    }

    public void A09(C37361pP r3) {
        HashSet A12;
        boolean z = false;
        this.A04 = C72453Mb.A1Y((Boolean) r3.A02("saved_open_now"));
        this.A03 = C72453Mb.A1Y((Boolean) r3.A02("saved_has_catalog"));
        Boolean bool = (Boolean) r3.A02("saved_distance");
        if (bool != null) {
            z = bool.booleanValue();
        }
        this.A02 = z;
        Collection collection = (Collection) r3.A02("saved_selected_multiple_choice_category");
        if (collection != null) {
            A12 = AnonymousClass8BR.A12(collection);
        } else {
            A12 = C17880vN.A12();
        }
        this.A01 = A12;
        this.A00 = (List) r3.A02("saved_current_filter_categories");
    }

    public void A0A(C37361pP r3) {
        r3.A04("saved_open_now", Boolean.valueOf(this.A04));
        r3.A04("saved_has_catalog", Boolean.valueOf(this.A03));
        r3.A04("saved_distance", Boolean.valueOf(this.A02));
        r3.A04("saved_selected_multiple_choice_category", C17880vN.A10(this.A01));
        r3.A04("saved_current_filter_categories", this.A00);
    }

    public boolean A0B() {
        if (!this.A01.isEmpty() || this.A04 || this.A03) {
            return false;
        }
        return true;
    }

    public boolean A0C(Bundle bundle) {
        if (bundle.getBoolean("saved_open_now") == this.A04 && this.A03 == bundle.getBoolean("saved_has_catalog") && this.A02 == bundle.getBoolean("saved_distance")) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("saved_selected_multiple_choice_category");
            if (this.A01.size() == parcelableArrayList.size()) {
                Iterator it = parcelableArrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!this.A01.contains(it.next())) {
                            break;
                        }
                    } else {
                        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("saved_current_filter_categories");
                        List list = this.A00;
                        if (list == null || parcelableArrayList2 == null) {
                            return false;
                        }
                        if (list.size() == parcelableArrayList2.size()) {
                            for (Object contains : this.A00) {
                                if (!parcelableArrayList2.contains(contains)) {
                                    return true;
                                }
                            }
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public A36(B57 b57, C22432B7o b7o, C18000vb r5, AnonymousClass1XN r6) {
        AnonymousClass10E r0;
        this.A05 = r5;
        this.A08 = r6;
        APL apl = (APL) b57;
        int i = apl.A00;
        Object obj = apl.A01;
        if (i != 0) {
            r0 = ((C37391pS) obj).A00;
        } else {
            r0 = ((AnonymousClass1K2) obj).A01;
        }
        this.A07 = new C184229ac(b7o, AnonymousClass8BU.A0L(r0.A00));
        this.A06 = b7o;
    }

    public Bundle A01() {
        Bundle A0D = C17880vN.A0D();
        A0D.putBoolean("saved_open_now", this.A04);
        A0D.putBoolean("saved_has_catalog", this.A03);
        A0D.putBoolean("saved_distance", this.A02);
        A0D.putParcelableArrayList("saved_selected_multiple_choice_category", C17880vN.A10(this.A01));
        List list = this.A00;
        if (list != null) {
            A0D.putParcelableArrayList("saved_current_filter_categories", C17880vN.A10(list));
        }
        return A0D;
    }

    public C190499l3 A02() {
        Integer num;
        ArrayList A13 = AnonymousClass000.A13();
        for (AEQ aeq : this.A01) {
            A13.add(aeq.A00);
        }
        if (A13.isEmpty()) {
            A13 = null;
        }
        if (this.A04) {
            num = C17880vN.A0h();
        } else {
            num = null;
        }
        return new C190499l3(num, A13, this.A03);
    }

    public C174078wC A03(C22553BCk bCk, List list) {
        HashSet A12 = C17880vN.A12();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AEQ aeq = (AEQ) it.next();
            A12.add(new AEQ(aeq.A00, aeq.A01));
        }
        A12.addAll(this.A01);
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it2 = A12.iterator();
        while (it2.hasNext()) {
            AEQ aeq2 = (AEQ) it2.next();
            A13.add(new AnonymousClass8nD(aeq2.A00, aeq2.A01, "", (String) null, (String) null, false));
        }
        this.A00 = A13;
        return A00(this, bCk, 76);
    }
}
