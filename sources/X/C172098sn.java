package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8sn  reason: invalid class name and case insensitive filesystem */
public final class C172098sn extends C136716uH {
    public final int A00;
    public final C172058si A01;

    public C172098sn(C172058si r2, int i) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
        this.A00 = i;
    }

    public Object A04(C30391dr r11) {
        HashMap A02 = A3M.A02(this.A00.getJSONObject("data"));
        LinkedHashMap linkedHashMap = new LinkedHashMap(C200610r.A03(A02.size()));
        Iterator A0i = C17890vO.A0i(A02);
        while (A0i.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A0i);
            Object key = A16.getKey();
            String A0x = C17880vN.A0x(A16);
            Object value = A16.getValue();
            if ((value instanceof Map) && A0x != null) {
                int hashCode = A0x.hashCode();
                if (hashCode != -958754891) {
                    if (hashCode != -655245741) {
                        if (hashCode == 687985114 && A0x.equals("boolAnnotations")) {
                            Iterator A15 = AnonymousClass000.A15((Map) value);
                            while (A15.hasNext()) {
                                Map.Entry A162 = AnonymousClass000.A16(A15);
                                Object key2 = A162.getKey();
                                Object value2 = A162.getValue();
                                C172058si r2 = this.A01;
                                int i = this.A00;
                                C18070vi.A0z(key2, "null cannot be cast to non-null type kotlin.String");
                                C18070vi.A0z(value2, "null cannot be cast to non-null type kotlin.Boolean");
                                r2.A07(i, (String) key2, AnonymousClass000.A1Y(value2));
                            }
                        }
                    } else if (A0x.equals("stringAnnotations")) {
                        Iterator A152 = AnonymousClass000.A15((Map) value);
                        while (A152.hasNext()) {
                            Map.Entry A163 = AnonymousClass000.A16(A152);
                            Object key3 = A163.getKey();
                            Object value3 = A163.getValue();
                            C172058si r1 = this.A01;
                            int i2 = this.A00;
                            C18070vi.A0z(key3, "null cannot be cast to non-null type kotlin.String");
                            C18070vi.A0z(value3, "null cannot be cast to non-null type kotlin.String");
                            r1.A06(i2, (String) key3, (String) value3);
                        }
                    }
                } else if (A0x.equals("intAnnotations")) {
                    Iterator A153 = AnonymousClass000.A15((Map) value);
                    while (A153.hasNext()) {
                        Map.Entry A164 = AnonymousClass000.A16(A153);
                        Object key4 = A164.getKey();
                        Object value4 = A164.getValue();
                        C172058si r3 = this.A01;
                        int i3 = this.A00;
                        C18070vi.A0z(key4, "null cannot be cast to non-null type kotlin.String");
                        C18070vi.A0z(value4, "null cannot be cast to non-null type kotlin.Int");
                        r3.A05(i3, (String) key4, (long) AnonymousClass000.A0M(value4));
                    }
                }
            }
            linkedHashMap.put(key, C27621Wu.A00);
        }
        return C27621Wu.A00;
    }
}
