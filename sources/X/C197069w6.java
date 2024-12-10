package X;

import android.database.Cursor;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9w6  reason: invalid class name and case insensitive filesystem */
public abstract class C197069w6 {
    public static final String A00 = AnonymousClass8BS.A0m("DiagnosticsWrkr");

    /* JADX INFO: finally extract failed */
    public static final String A00(BA3 ba3, B4S b4s, BA4 ba4, List list) {
        String str;
        Integer num;
        String str2;
        StringBuilder A10 = AnonymousClass000.A10();
        if (Build.VERSION.SDK_INT >= 23) {
            str = "Job Id";
        } else {
            str = "Alarm Id";
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("\n Id \t Class Name\t ");
        A102.append(str);
        C108985cd.A1L("\t State\t Unique Name\t Tags\t", A102, A10);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A2t a2t = (A2t) it.next();
            C194169rH Ba3 = ba3.Ba3(AnonymousClass9OL.A00(a2t));
            if (Ba3 != null) {
                num = Integer.valueOf(Ba3.A01);
            } else {
                num = null;
            }
            String str3 = a2t.A0M;
            AHX A002 = A3D.A00("SELECT name FROM workname WHERE work_spec_id=?", 1);
            A002.BDB(1, str3);
            C20076A6c a6c = ((C20363AHt) b4s).A01;
            a6c.A06();
            Cursor A003 = AnonymousClass9OB.A00(a6c, A002, false);
            try {
                ArrayList A0w = AnonymousClass8BV.A0w(A003);
                while (A003.moveToNext()) {
                    if (A003.isNull(0)) {
                        str2 = null;
                    } else {
                        str2 = A003.getString(0);
                    }
                    A0w.add(str2);
                }
                A003.close();
                A002.A00();
                String A0g = C29431cG.A0g(",", "", "", A0w, (C22821Di) null);
                String A0g2 = C29431cG.A0g(",", "", "", ba4.BaA(str3), (C22821Di) null);
                StringBuilder A103 = AnonymousClass000.A10();
                A103.append(10);
                A103.append(str3);
                A103.append("\t ");
                A103.append(a2t.A0I);
                A103.append("\t ");
                A103.append(num);
                A103.append("\t ");
                C17890vO.A10(C196349ut.A00(a2t.A0G), "\t ", A0g, A103);
                A103.append("\t ");
                A103.append(A0g2);
                A103.append(9);
                AnonymousClass8BS.A1D(A103, A10);
            } catch (Throwable th) {
                A003.close();
                A002.A00();
                throw th;
            }
        }
        return C18070vi.A0H(A10);
    }
}
