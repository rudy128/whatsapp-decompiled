package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.5qL  reason: invalid class name and case insensitive filesystem */
public final class C114215qL extends DID {
    public final /* synthetic */ C23189Bcj A00;

    public static final C136046tB A00(String str, String str2) {
        List A0S = AnonymousClass1YF.A0S(str2, new String[]{"\n"}, 0);
        if (A0S.size() == 3) {
            return new C136046tB(Long.parseLong(C17880vN.A0w(A0S, 0)), str, C17880vN.A0w(A0S, 2), C17880vN.A0w(A0S, 1));
        }
        Log.w(C108955ca.A12(Locale.US, "Endpoint.from/ invalid advertisedString: %s, expected 3 parts", C108945cZ.A1b(str2, new Object[1], 0, 1)));
        return null;
    }

    public C114215qL(C23189Bcj bcj) {
        this.A00 = bcj;
    }

    public final /* bridge */ /* synthetic */ void BkV(Object obj) {
        Locale locale;
        Object[] objArr;
        AnonymousClass73G r6;
        HashMap hashMap;
        String str;
        int length;
        String str2;
        C23189Bcj bcj = this.A00;
        C138806xj r12 = (C138806xj) obj;
        if (bcj.A00 == null || ((str2 = bcj.A01) != null && !"__UNRECOGNIZED_BLUETOOTH_DEVICE__".equals(str2))) {
            String str3 = bcj.A01;
            String str4 = bcj.A02;
            String str5 = bcj.A03;
            C18070vi.A0d(str3, 0);
            Locale locale2 = Locale.US;
            Object[] A1a = C108945cZ.A1a(str3, str4, 3, 1);
            A1a[2] = str5;
            C108955ca.A1W("onEndpointFound(endpointId=%s, serviceId=%s, endpointName=%s)", locale2, Arrays.copyOf(A1a, 3));
            if ("thunderstorm".equals(str4)) {
                C18070vi.A0X(str5);
                C136046tB A002 = A00(str3, str5);
                if (A002 != null) {
                    r6 = r12.A00;
                    hashMap = r6.A0E;
                    hashMap.put(str3, A002);
                } else {
                    locale = Locale.US;
                    objArr = C108945cZ.A1b(str5, new Object[1], 0, 1);
                    C108955ca.A1W("onEndpointFound/invalid advertised string: %s", locale, objArr);
                    return;
                }
            } else {
                return;
            }
        } else {
            String str6 = bcj.A02;
            "__UNRECOGNIZED_BLUETOOTH_DEVICE__".getBytes();
            locale = Locale.US;
            Object[] A1a2 = C108945cZ.A1a("__UNRECOGNIZED_BLUETOOTH_DEVICE__", str6, 3, 1);
            A1a2[2] = "__UNRECOGNIZED_BLUETOOTH_DEVICE__";
            C108955ca.A1W("onEndpointFound(endpointId=%s, serviceId=%s, endpointName=%s)", locale, Arrays.copyOf(A1a2, 3));
            if ("thunderstorm".equals(str6)) {
                C136046tB A003 = A00("__UNRECOGNIZED_BLUETOOTH_DEVICE__", "__UNRECOGNIZED_BLUETOOTH_DEVICE__");
                if (A003 != null) {
                    r6 = r12.A00;
                    hashMap = r6.A0E;
                    hashMap.put("__UNRECOGNIZED_BLUETOOTH_DEVICE__", A003);
                } else {
                    objArr = C108945cZ.A1b("__UNRECOGNIZED_BLUETOOTH_DEVICE__", new Object[1], 0, 1);
                    C108955ca.A1W("onEndpointFound/invalid advertised string: %s", locale, objArr);
                    return;
                }
            } else {
                return;
            }
        }
        HashMap A11 = C17880vN.A11();
        Set keySet = hashMap.keySet();
        C18070vi.A0X(keySet);
        for (Object next : keySet) {
            C136046tB r9 = (C136046tB) hashMap.get(next);
            if (r9 != null) {
                C136046tB r0 = (C136046tB) hashMap.get(next);
                if (r0 != null) {
                    str = r0.A04;
                } else {
                    str = "";
                }
                C19830z4 r3 = r6.A0A;
                String string = C17890vO.A0B(r3).getString("thunderstorm_device_id", (String) null);
                if (string == null) {
                    string = C17890vO.A0Q();
                    C17880vN.A1E(C19830z4.A00(r3), "thunderstorm_device_id", string);
                }
                if (!C18070vi.A18(str, string)) {
                    if (A11.containsKey(str)) {
                        C136046tB r02 = (C136046tB) A11.get(str);
                        if (r02 != null) {
                            length = (r9.A01 > r02.A01 ? 1 : (r9.A01 == r02.A01 ? 0 : -1));
                        }
                    } else {
                        length = str.length();
                    }
                    if (length > 0) {
                        A11.put(str, r9);
                    }
                }
            }
        }
        Collection<C136046tB> A17 = C108955ca.A17(hashMap);
        ArrayList A0E = C29351c6.A0E(A17);
        for (C136046tB r03 : A17) {
            A0E.add(r03.A02);
        }
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next2 : A0E) {
            Collection<C136046tB> A172 = C108955ca.A17(A11);
            ArrayList A0E2 = C29351c6.A0E(A172);
            for (C136046tB r04 : A172) {
                A0E2.add(r04.A02);
            }
            AnonymousClass3MZ.A1V(next2, A13, A0E2.contains(next2) ? 1 : 0);
        }
        A13.isEmpty();
        AnonymousClass4Z0.A02(hashMap, A13.toArray(new String[0]));
        AnonymousClass1DT r1 = r6.A06;
        Set keySet2 = hashMap.keySet();
        C18070vi.A0X(keySet2);
        r1.A0F(C29431cG.A0t(keySet2));
    }
}
