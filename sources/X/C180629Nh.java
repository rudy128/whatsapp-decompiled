package X;

import com.whatsapp.util.Log;

/* renamed from: X.9Nh  reason: invalid class name and case insensitive filesystem */
public abstract class C180629Nh {
    public String A00() {
        String str;
        Object obj;
        if (!(this instanceof C178139By)) {
            return ((C178129Bx) this).A00.A02;
        }
        C178139By r0 = (C178139By) this;
        C197789xG r5 = r0.A00;
        String str2 = r0.A02;
        String str3 = r0.A01;
        StringBuilder A10 = AnonymousClass000.A10();
        if (r5.A00.intValue() != 0) {
            str = "BLOKS_LAYOUT_OBJECT";
        } else {
            str = "RAW_JSON";
        }
        A10.append(str);
        A10.append(":");
        A10.append(":");
        A10.append(str2);
        A10.append(":");
        A10.append("4a8a6a30659ce032132e4419bd9a779d6c626ff94a5d708eb753e8e100bbd3eb");
        A10.append(":");
        AnonymousClass8BS.A1D(r5.A01.A0N(), A10);
        if ((str3 != null && str3.length() > 0) || str3 != null) {
            try {
                String A05 = C17970vW.A05(str3);
                A10.append(":");
                A10.append(A05);
                obj = A10;
            } catch (Throwable th) {
                obj = C108945cZ.A1J(th);
            }
            Throwable A00 = C30671eK.A00(obj);
            if (A00 != null) {
                Log.e("Unable to calculate parameter hash.", A00);
            }
        }
        return C18070vi.A0H(A10);
    }
}
