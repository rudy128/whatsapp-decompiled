package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.AXr  reason: case insensitive filesystem */
public class C20762AXr implements C22444B8c {
    public final AnonymousClass1QD A00;

    public static void A00(AnonymousClass1KI r7, C29621ca r8, C29621ca r9, ArrayList arrayList, int i) {
        C64502us r0;
        int length;
        int i2 = 0;
        if (i == 2) {
            C29621ca[] r6 = r9.A02;
            if (r6 != null) {
                int length2 = r6.length;
                while (i2 < length2) {
                    C29621ca r2 = r6[i2];
                    if (r2 != null) {
                        if ("bank".equals(r2.A00)) {
                            r0 = new AnonymousClass8pS();
                            r0.A05(r7, r8, 2);
                        } else if ("psp".equals(r2.A00) || "psp-routing".equals(r2.A00)) {
                            r0 = new AnonymousClass8pH();
                        }
                        r0.A05(r7, r2, 2);
                        arrayList.add(r0);
                    }
                    i2++;
                }
            }
        } else if (i == 4) {
            C29621ca[] r3 = r9.A02;
            if (r3 != null && (length = r3.length) > 0) {
                do {
                    C29621ca r1 = r3[i2];
                    if (r1 != null) {
                        AnonymousClass8pS r02 = new AnonymousClass8pS();
                        r02.A05(r7, r1, 4);
                        arrayList.add(r02);
                    }
                    i2++;
                } while (i2 < length);
            }
        } else if (i != 5) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("PAY: IndiaProtoParser got action: ");
            A10.append(i);
            C17890vO.A1A(A10, "; nothing to do");
        } else {
            AnonymousClass8pH r03 = new AnonymousClass8pH();
            r03.A05(r7, r9, 5);
            arrayList.add(r03);
        }
    }

    public C20762AXr(AnonymousClass1QD r1) {
        this.A00 = r1;
    }

    public ArrayList CB8(AnonymousClass1KI r10, C29621ca r11) {
        int i;
        boolean z;
        C29621ca A0j = AnonymousClass8BR.A0j(r11);
        ArrayList A13 = AnonymousClass000.A13();
        if (A0j == null) {
            Log.w("PAY: IndiaProtoParser empty account node");
        } else {
            String A0Q = A0j.A0Q("wa-support-phone-number", (String) null);
            if (!TextUtils.isEmpty(A0Q)) {
                C17880vN.A1E(AnonymousClass8BU.A07(this.A00), "payments_support_phone_number", A0Q);
            }
            String A0Q2 = A0j.A0Q("action", (String) null);
            if ("upi-batch".equalsIgnoreCase(A0Q2)) {
                i = 1;
            } else if ("upi-get-banks".equalsIgnoreCase(A0Q2)) {
                i = 2;
            } else if ("upi-register-vpa".equalsIgnoreCase(A0Q2)) {
                i = 4;
            } else if ("upi-list-keys".equalsIgnoreCase(A0Q2)) {
                i = 5;
            } else if ("upi-check-mpin".equalsIgnoreCase(A0Q2)) {
                i = 6;
            } else if ("pay-precheck".equalsIgnoreCase(A0Q2)) {
                i = 8;
            } else {
                boolean equalsIgnoreCase = "upi-get-psp-routing-and-list-keys".equalsIgnoreCase(A0Q2);
                i = 0;
                if (equalsIgnoreCase) {
                    i = 10;
                }
            }
            int i2 = 0;
            if (i == 1 || i == 10) {
                C29621ca[] r8 = A0j.A02;
                if (r8 != null) {
                    while (i2 < r8.length) {
                        C29621ca r2 = r8[i2];
                        if (r2 != null) {
                            String str = r2.A00;
                            switch (str.hashCode()) {
                                case -384112062:
                                    z = str.equals("psp-config");
                                    break;
                                case 3288564:
                                    if (str.equals("keys")) {
                                        A00(r10, A0j, r2, A13, 5);
                                        break;
                                    } else {
                                        continue;
                                    }
                                case 93503927:
                                    z = str.equals("banks");
                                    break;
                            }
                            if (z) {
                                A00(r10, A0j, r2, A13, 2);
                            }
                        }
                        i2++;
                    }
                }
            } else if (i == 2) {
                A00(r10, A0j, A0j, A13, 2);
                C29621ca[] r22 = A0j.A02;
                if (r22 != null) {
                    while (i2 < r22.length) {
                        C29621ca r1 = r22[i2];
                        if (r1 != null && "psp-config".equals(r1.A00)) {
                            A00(r10, A0j, r1, A13, 2);
                        }
                        i2++;
                    }
                }
            } else {
                A00(r10, A0j, A0j, A13, i);
                return A13;
            }
        }
        return A13;
    }
}
