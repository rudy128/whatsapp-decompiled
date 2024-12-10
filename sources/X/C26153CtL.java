package X;

import com.facebook.wearable.mediastream.client.connection.HardwareDeviceStateManager$emitReadyDevices$1;
import com.facebook.wearable.mediastream.client.connection.HardwareDeviceStateManager$onDiscoveredDevices$1$2;
import com.facebook.wearable.mediastream.client.connection.HardwareDeviceStateManager$updateDeviceState$2$1;
import com.facebook.wearable.mediastream.client.connection.HardwareDeviceStateManager$updateDeviceState$2$2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: X.CtL  reason: case insensitive filesystem */
public final class C26153CtL {
    public CXV A00;
    public final C18100vl A01 = AnonymousClass1DF.A00(AnonymousClass00R.A00, C27890DnR.A00);
    public final AnonymousClass1G3 A02;
    public final AnonymousClass1G0 A03;

    public static /* synthetic */ void A01(C26153CtL ctL, Integer num, String str, int i, boolean z) {
        C22947BWt bWt = null;
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            bWt = C22947BWt.A00;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        ctL.A07(bWt, num, str, z);
    }

    public final void A07(C3Z c3z, Integer num, String str, boolean z) {
        C18090vk r5;
        AnonymousClass1OY A022;
        AnonymousClass1OS hardwareDeviceStateManager$updateDeviceState$2$2;
        C18090vk r0;
        Object cxv;
        int A0G = C72453Mb.A0G(str, c3z, 0);
        C25845Cn1 cn1 = C24712CGy.A01;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("update device ");
        A10.append(str);
        cn1.A01("sup:HardwareDeviceStateManager", AnonymousClass001.A1E(num, ": event = ", A10));
        C18100vl r3 = this.A01;
        Object A0n = AnonymousClass8BV.A0n(str, r3);
        if (A0n == null) {
            Map A12 = AnonymousClass3MW.A12(r3);
            if (c3z.equals(C22945BWr.A00)) {
                cxv = new BXC(str);
            } else if (c3z.equals(C22946BWs.A00)) {
                cxv = new BXD(str);
            } else if (c3z.equals(C22947BWt.A00)) {
                cxv = new CXV(str);
            } else {
                throw AnonymousClass3MW.A14();
            }
            A12.put(str, cxv);
            A0n = (CXV) AnonymousClass8BV.A0n(str, r3);
        }
        CXV cxv2 = (CXV) A0n;
        if (cxv2 != null) {
            if (num == null) {
                if (cxv2 instanceof BXD) {
                    r0 = ((BXD) cxv2).A00;
                } else {
                    r0 = cxv2.A07;
                }
                if (BE9.A1Y(r0)) {
                    A022 = AnonymousClass1OW.A02(C23871Hy.A00);
                    hardwareDeviceStateManager$updateDeviceState$2$2 = new HardwareDeviceStateManager$updateDeviceState$2$1(cxv2, this, (C30391dr) null);
                    AnonymousClass3MX.A1Q(hardwareDeviceStateManager$updateDeviceState$2$2, A022);
                }
            }
            if (cxv2 instanceof BXD) {
                r5 = ((BXD) cxv2).A00;
            } else {
                r5 = cxv2.A07;
            }
            boolean A1Y = BE9.A1Y(r5);
            if (num != null) {
                int intValue = num.intValue();
                if (intValue == 0 || intValue == 1 || intValue == A0G || intValue == 3) {
                    cxv2.A00 = intValue;
                } else if (intValue == 4 || intValue == 5) {
                    cxv2.A01 = intValue;
                } else if (intValue == 6 || intValue == 7) {
                    cxv2.A03 = intValue;
                } else if (intValue == 8 || intValue == 9) {
                    cxv2.A05 = num;
                } else if (intValue == 10 || intValue == 11 || intValue == 12 || intValue == 13 || intValue == 14 || intValue == 15) {
                    if (z) {
                        cxv2.A04 = num;
                    } else {
                        cxv2.A02 = intValue;
                    }
                }
            }
            if (BE9.A1Y(r5) && !A1Y) {
                cn1.A01("sup:HardwareDeviceStateManager", AnonymousClass001.A1E(cxv2, "Device ready: ", AnonymousClass000.A10()));
                A022 = AnonymousClass1OW.A02(C23871Hy.A00);
                hardwareDeviceStateManager$updateDeviceState$2$2 = new HardwareDeviceStateManager$updateDeviceState$2$2(cxv2, this, (C30391dr) null);
                AnonymousClass3MX.A1Q(hardwareDeviceStateManager$updateDeviceState$2$2, A022);
            }
        }
    }

    public static /* synthetic */ void A02(C26153CtL ctL, Integer num, UUID uuid) {
        C22947BWt bWt = C22947BWt.A00;
        C18070vi.A0d(bWt, 2);
        ctL.A07(bWt, num, C18070vi.A0H(uuid), false);
    }

    public final CXV A03() {
        return this.A00;
    }

    public final List A04() {
        C18090vk r0;
        Collection values = AnonymousClass3MW.A12(this.A01).values();
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : values) {
            CXV cxv = (CXV) next;
            if (cxv instanceof BXD) {
                r0 = ((BXD) cxv).A00;
            } else {
                r0 = cxv.A07;
            }
            if (BE9.A1Y(r0)) {
                A13.add(next);
            }
        }
        return A13;
    }

    public final AnonymousClass1G0 A05() {
        return this.A03;
    }

    public final void A06() {
        AnonymousClass3MX.A1Q(new HardwareDeviceStateManager$emitReadyDevices$1(this, (C30391dr) null), AnonymousClass1OW.A02(C23871Hy.A00));
    }

    public final boolean A0A() {
        Collection<CXV> values = AnonymousClass3MW.A12(this.A01).values();
        if (values == null || !values.isEmpty()) {
            for (CXV cxv : values) {
                if (!BE9.A1Y(cxv.A06)) {
                    return false;
                }
            }
        }
        return true;
    }

    public C26153CtL() {
        C25701Ph A012 = C62922sD.A01(C25691Pg.SUSPEND, 0, 0);
        this.A02 = A012;
        this.A03 = new C25711Pi((AnonymousClass1OB) null, A012);
    }

    public final void A08(Map map) {
        CXV cxv;
        C18090vk r0;
        int i;
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            String A0x = C17880vN.A0x(A16);
            Object value = A16.getValue();
            if (C18070vi.A18(value, C22945BWr.A00)) {
                cxv = new BXC(A0x);
            } else if (C18070vi.A18(value, C22946BWs.A00)) {
                cxv = new BXD(A0x);
            } else if (C18070vi.A18(value, C22947BWt.A00)) {
                cxv = new CXV(A0x);
            } else {
                throw AnonymousClass3MW.A14();
            }
            C18100vl r4 = this.A01;
            CXV cxv2 = (CXV) AnonymousClass8BV.A0n(A0x, r4);
            if (cxv2 != null) {
                cxv.A00 = cxv2.A00;
                cxv.A01 = cxv2.A01;
                cxv.A05 = cxv2.A05;
                Integer num = cxv2.A04;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = cxv2.A02;
                }
                cxv.A02 = i;
                cxv.A03 = cxv2.A03;
                cxv.A04 = num;
            }
            AnonymousClass3MW.A12(r4).put(A0x, cxv);
            if (cxv instanceof BXD) {
                r0 = ((BXD) cxv).A00;
            } else {
                r0 = cxv.A07;
            }
            if (BE9.A1Y(r0)) {
                AnonymousClass3MX.A1Q(new HardwareDeviceStateManager$onDiscoveredDevices$1$2(cxv, this, (C30391dr) null), AnonymousClass1OW.A02(C23871Hy.A00));
            }
        }
        Set keySet = map.keySet();
        C18100vl r42 = this.A01;
        Map A12 = AnonymousClass3MW.A12(r42);
        LinkedHashMap A13 = C17880vN.A13();
        Iterator A152 = AnonymousClass000.A15(A12);
        while (A152.hasNext()) {
            Map.Entry A162 = AnonymousClass000.A16(A152);
            if (!keySet.contains(A162.getKey())) {
                C108985cd.A1R(A13, A162);
            }
        }
        Iterator A153 = AnonymousClass000.A15(A13);
        while (A153.hasNext()) {
            AnonymousClass3MW.A12(r42).remove(AnonymousClass000.A16(A153).getKey());
        }
    }

    public final void A09(UUID uuid) {
        this.A00 = (CXV) AnonymousClass8BV.A0n(C18070vi.A0H(uuid), this.A01);
    }
}
