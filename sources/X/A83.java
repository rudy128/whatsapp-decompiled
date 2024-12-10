package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class A83 {
    public static final AnonymousClass1MD[] A00 = new AnonymousClass1MD[0];

    public static C29621ca A01(C194059r6 r9, int i) {
        String str;
        int i2 = r9.A00;
        if (i2 == 0) {
            str = "msg";
        } else if (i2 == 1) {
            str = "pkmsg";
        } else if (i2 == 2) {
            str = "skmsg";
        } else if (i2 != 3) {
            str = "msmsg";
        } else {
            str = "frskmsg";
        }
        return new C29621ca("enc", r9.A01, (AnonymousClass1MD[]) A04((Integer) null, str, (String) null, (String) null, i, false).toArray(A00));
    }

    public static ArrayList A04(Integer num, String str, String str2, String str3, int i, boolean z) {
        ArrayList A13 = AnonymousClass000.A13();
        C17890vO.A11("v", Integer.toString(2), A13);
        C17890vO.A11(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str, A13);
        if (i != 0) {
            C17890vO.A11("count", String.valueOf(i), A13);
        }
        if (str2 != null) {
            C17890vO.A11("mediatype", str2, A13);
        }
        if (str3 != null) {
            C17890vO.A11("native_flow_name", str3, A13);
        }
        if (num != null && num.intValue() > 0) {
            C17890vO.A11("duration", String.valueOf(num), A13);
        }
        if (z) {
            C17890vO.A11("decrypt-fail", "hide", A13);
        }
        return A13;
    }

    public static C29621ca A02(C194059r6 r6, Integer num, String str, String str2, int i, boolean z) {
        String str3;
        int i2 = r6.A00;
        if (i2 == 0) {
            str3 = "msg";
        } else if (i2 == 1) {
            str3 = "pkmsg";
        } else if (i2 == 2) {
            str3 = "skmsg";
        } else if (i2 != 3) {
            str3 = "msmsg";
        } else {
            str3 = "frskmsg";
        }
        return new C29621ca("enc", r6.A01, (AnonymousClass1MD[]) A04(num, str3, str, str2, i, z).toArray(A00));
    }

    public static C29621ca A00(DeviceJid deviceJid, AnonymousClass1MD r5, C29621ca... r6) {
        ArrayList A13 = AnonymousClass000.A13();
        int i = 0;
        do {
            C29621ca r0 = r6[i];
            if (r0 != null) {
                A13.add(r0);
            }
            i++;
        } while (i < 2);
        return AnonymousClass8BR.A0l("to", A05(deviceJid, r5), C17890vO.A1Y(A13, A13.size()));
    }

    public static AnonymousClass1MD[] A05(DeviceJid deviceJid, AnonymousClass1MD r3) {
        ArrayList A13 = AnonymousClass000.A13();
        C17890vO.A0n(deviceJid, "jid", A13);
        if (r3 != null) {
            A13.add(r3);
        }
        return (AnonymousClass1MD[]) A13.toArray(A00);
    }

    public static ArrayList A03(C192429oN r21, Integer num, String str, String str2, List list, Map map, Map map2, Map map3, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C29621ca A002;
        DeviceJid deviceJid;
        AnonymousClass1MD r0;
        AnonymousClass1MD r02;
        DeviceJid deviceJid2;
        C29621ca r11;
        AnonymousClass1MD r1;
        ArrayList A13 = AnonymousClass000.A13();
        HashSet A12 = C17880vN.A12();
        C192429oN r7 = r21;
        String str3 = str;
        Map map4 = map;
        int i2 = i;
        boolean z6 = z2;
        if (map2 != null) {
            Iterator A15 = AnonymousClass000.A15(map2);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                DeviceJid deviceJid3 = (DeviceJid) A16.getKey();
                UserJid userJid = deviceJid3.userJid;
                if (userJid != null) {
                    deviceJid2 = userJid.getPrimaryDevice();
                } else {
                    deviceJid2 = null;
                }
                String A0s = C17880vN.A0s(deviceJid2, map4);
                C194059r6 r15 = (C194059r6) A16.getValue();
                if (z3) {
                    r11 = C181459Qo.A00(deviceJid3.userJid, r7, str3);
                } else {
                    r11 = null;
                }
                String str4 = null;
                Integer num2 = null;
                String str5 = null;
                if (z) {
                    str4 = str3;
                    num2 = num;
                    str5 = str2;
                }
                C29621ca A02 = A02(r15, num2, str4, str5, i2, z6);
                if (r11 != null) {
                    A12.add(deviceJid3);
                }
                if (A0s != null) {
                    r1 = AnonymousClass8BR.A0h("eph_setting", A0s);
                } else {
                    r1 = null;
                }
                A13.add(A00(deviceJid3, r1, A02, r11));
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DeviceJid deviceJid4 = (DeviceJid) it.next();
                UserJid userJid2 = deviceJid4.userJid;
                if (userJid2 != null) {
                    deviceJid = userJid2.getPrimaryDevice();
                } else {
                    deviceJid = null;
                }
                String A0s2 = C17880vN.A0s(deviceJid, map4);
                if (!z4 || r21 == null) {
                    if (A0s2 != null) {
                        r0 = AnonymousClass8BR.A0h("eph_setting", A0s2);
                    } else {
                        r0 = null;
                    }
                    C29621ca.A05("to", A13, A05(deviceJid4, r0));
                } else {
                    C29621ca A003 = C181459Qo.A00(deviceJid4.userJid, r7, str3);
                    if (A0s2 != null) {
                        r02 = AnonymousClass8BR.A0h("eph_setting", A0s2);
                    } else {
                        r02 = null;
                    }
                    AnonymousClass8BT.A1J(A003, "to", A13, A05(deviceJid4, r02));
                }
            }
        }
        if (map3 != null) {
            Iterator A152 = AnonymousClass000.A15(map3);
            while (A152.hasNext()) {
                Map.Entry A162 = AnonymousClass000.A16(A152);
                DeviceJid deviceJid5 = (DeviceJid) A162.getKey();
                A13.add(A00(deviceJid5, (AnonymousClass1MD) null, A02((C194059r6) A162.getValue(), num, str, str2, i2, z6), C181459Qo.A00(deviceJid5.userJid, r7, str3)));
            }
        }
        if (z3 && z5 && r7 != null) {
            for (DeviceJid deviceJid6 : r7.A00) {
                if (!A12.contains(deviceJid6) && (A002 = C181459Qo.A00(deviceJid6.userJid, r7, str3)) != null) {
                    AnonymousClass8BT.A1J(A002, "to", A13, A05(deviceJid6, (AnonymousClass1MD) null));
                }
            }
        }
        return A13;
    }
}
