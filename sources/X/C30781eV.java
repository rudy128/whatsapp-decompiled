package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.UserJid;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1eV  reason: invalid class name and case insensitive filesystem */
public final class C30781eV {
    public final C18030ve A00;
    public final AnonymousClass00H A01;
    public final Map A02;
    public final C30771eU A03;
    public final C30791eW A04;
    public final C30761eT A05;
    public final C30751eS A06;

    public C30781eV(C30771eU r9, C30761eT r10, C30751eS r11, C18030ve r12, AnonymousClass00H r13) {
        C18070vi.A0d(r11, 1);
        C18070vi.A0d(r10, 2);
        C18070vi.A0d(r9, 3);
        C18070vi.A0d(r13, 4);
        C18070vi.A0d(r12, 5);
        this.A06 = r11;
        this.A05 = r10;
        this.A03 = r9;
        this.A01 = r13;
        this.A00 = r12;
        C30791eW r6 = (C30791eW) AnonymousClass12Q.A02(AnonymousClass114.A00(), 49156);
        this.A04 = r6;
        this.A02 = AnonymousClass1D7.A0B(new AnonymousClass1D6(0, r6), new AnonymousClass1D6(1, r11), new AnonymousClass1D6(2, r10), new AnonymousClass1D6(3, r9));
    }

    public final C20942Abw A00(UserJid userJid) {
        C20942Abw A022;
        C18070vi.A0d(userJid, 0);
        List<C30741eR> asList = Arrays.asList(new C30741eR[]{this.A06, this.A05, this.A03});
        C18070vi.A0X(asList);
        for (C30741eR r1 : asList) {
            if (!(r1 instanceof C30751eS)) {
                if (!(r1 instanceof C30761eT)) {
                    if (r1 instanceof C30791eW) {
                        break;
                    }
                    A022 = ((C30771eU) r1).A02(userJid);
                    continue;
                } else {
                    A022 = (C20942Abw) ((A5T) ((C30761eT) r1).A00.get()).A02(userJid);
                    continue;
                }
            } else {
                A022 = ((C30751eS) r1).A02(userJid);
                continue;
            }
            if (A022 != null) {
                return A022;
            }
        }
        return new C20942Abw(0);
    }

    public final void A01(C20942Abw abw) {
        UserJid userJid;
        AnonymousClass1E2 r6;
        C49372Qf r5;
        Object obj;
        C179489Ie r0;
        Map map = this.A02;
        int i = abw.A00;
        Object obj2 = map.get(Integer.valueOf(i));
        C17960vV.A07(obj2);
        C30741eR r8 = (C30741eR) obj2;
        if (r8 instanceof C30751eS) {
            C30751eS r82 = (C30751eS) r8;
            AnonymousClass8oT r2 = (AnonymousClass8oT) abw;
            C18070vi.A0d(r2, 0);
            ((A5S) r82.A04.get()).A08(r2);
            String rawString = r2.A00.getRawString();
            C18070vi.A0d(rawString, 0);
            ((SharedPreferences) ((COQ) r82.A02.get()).A01.getValue()).edit().putBoolean(rawString, true).apply();
        } else if (r8 instanceof C30761eT) {
            AnonymousClass8oT r7 = (AnonymousClass8oT) abw;
            C18070vi.A0d(r7, 0);
            UserJid userJid2 = r7.A00;
            AnonymousClass00H r62 = ((C30761eT) r8).A00;
            AnonymousClass2DX r02 = (AnonymousClass2DX) ((A5T) r62.get()).A02(userJid2);
            if (r02 == null || System.currentTimeMillis() - r02.A00 > AnonymousClass2DX.A05) {
                ((A5T) r62.get()).A07(r7);
            }
        } else if (!(r8 instanceof C30791eW)) {
            C30771eU r83 = (C30771eU) r8;
            AnonymousClass8oQ r63 = (AnonymousClass8oQ) abw;
            C18070vi.A0d(r63, 0);
            AnonymousClass8oQ A022 = r83.A02(r63.A00);
            if (A022 == null || System.currentTimeMillis() - A022.A00 > AnonymousClass8oQ.A03 || !C18070vi.A18(A022.A02, r63.A02)) {
                ((A5S) r83.A00.get()).A08(r63);
            }
        }
        if (C18020vd.A05(C18040vf.A02, this.A00, 12526)) {
            C54222dn r3 = (C54222dn) this.A01.get();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        AnonymousClass8oQ r12 = (AnonymousClass8oQ) abw;
                        userJid = r12.A00;
                        r6 = r12.A01;
                        r5 = C49372Qf.DEEP_LINK;
                        Map map2 = r12.A02;
                        Object obj3 = map2.get(C179569Im.ENTRY_POINT_TYPE);
                        if (obj3 != null) {
                            linkedHashMap.put(C179489Ie.EXTERNAL_ENTRY_POINT_TYPE, obj3);
                        }
                        if (C18070vi.A18(map2.get(C179569Im.AUTH_FAIL), "1")) {
                            linkedHashMap.put(C179489Ie.PARTNER_AUTH_SUCCESS, "0");
                        }
                        obj = map2.get(C179569Im.PARTNER_NAME);
                        if (obj != null) {
                            r0 = C179489Ie.PARTNER_NAME;
                        }
                    } else {
                        userJid = ((AnonymousClass8oT) abw).A00;
                        r5 = C49372Qf.ORGANIC;
                        r6 = null;
                    }
                    ((AnonymousClass10I) r3.A01.get()).CGF(new C70633Bw(r3, new A1A(r5, r6, userJid, linkedHashMap, System.currentTimeMillis()), 34));
                }
                AnonymousClass8oR r122 = (AnonymousClass8oR) abw;
                userJid = r122.A00;
                r6 = r122.A03;
                r5 = C49372Qf.CTWA;
                obj = r122.A04;
                if (obj != null) {
                    r0 = C179489Ie.SOURCE_ID;
                }
                ((AnonymousClass10I) r3.A01.get()).CGF(new C70633Bw(r3, new A1A(r5, r6, userJid, linkedHashMap, System.currentTimeMillis()), 34));
                linkedHashMap.put(r0, obj);
                ((AnonymousClass10I) r3.A01.get()).CGF(new C70633Bw(r3, new A1A(r5, r6, userJid, linkedHashMap, System.currentTimeMillis()), 34));
            }
        }
    }
}
