package X;

import android.text.TextUtils;
import com.whatsapp.Me;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* renamed from: X.1QJ  reason: invalid class name */
public class AnonymousClass1QJ {
    public C63572tK A00;
    public boolean A01;
    public final AnonymousClass1QE A02 = AnonymousClass1QE.A00("PaymentsCountryManager", "infra", "COMMON");
    public final AnonymousClass11S A03;
    public final AnonymousClass1KI A04;
    public final C18030ve A05;
    public final AnonymousClass1KG A06;
    public final AnonymousClass1QH A07;

    public synchronized AnonymousClass1KJ A01() {
        AnonymousClass1KJ r0;
        if (!this.A01) {
            A00();
        }
        C63572tK r02 = this.A00;
        if (r02 != null) {
            r0 = r02.A02;
        } else {
            r0 = null;
        }
        return r0;
    }

    public synchronized C63572tK A02() {
        if (!this.A01) {
            A00();
        }
        return this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        if (r1 == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A03() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.A01     // Catch:{ all -> 0x0014 }
            if (r0 != 0) goto L_0x0008
            r2.A00()     // Catch:{ all -> 0x0014 }
        L_0x0008:
            X.2tK r0 = r2.A00     // Catch:{ all -> 0x0014 }
            if (r0 == 0) goto L_0x0011
            boolean r1 = r0.A06     // Catch:{ all -> 0x0014 }
            r0 = 1
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            monitor-exit(r2)
            return r0
        L_0x0014:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QJ.A03():boolean");
    }

    private synchronized void A00() {
        String str;
        String A002;
        String[] strArr;
        synchronized (this) {
            AnonymousClass1QE r4 = this.A02;
            String str2 = null;
            AnonymousClass1QE.A02(r4, (String) null, "tryInitFromMock: no mockedCountry");
            AnonymousClass11S r1 = this.A03;
            r1.A0I();
            Me me = r1.A00;
            if (me != null) {
                str2 = me.number;
                str = me.cc;
            } else {
                str = null;
            }
            r1.A0I();
            if (r1.A0E == null || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append("phoneNumber:");
                sb.append(str2);
                sb.append(" countryCode:");
                sb.append(str);
                r4.A06(sb.toString());
            } else {
                C63572tK A012 = C63572tK.A01(str);
                C63572tK r5 = C63572tK.A0G;
                if (A012 == r5) {
                    if (!(str == null || (A002 = AnonymousClass1K3.A00(str)) == null || (strArr = (String[]) C62972sI.A00.A01(A002)) == null || strArr.length <= 0)) {
                        String str3 = strArr[0];
                        HashMap hashMap = C60812oe.A00;
                        if (hashMap.isEmpty()) {
                            hashMap.put("USD", C60812oe.A00("USD", "$", "D", "d", 2));
                            hashMap.put("PEN", C60812oe.A00("PEN", "S/", "@", "@", 2));
                            hashMap.put("MXN", C60812oe.A00("MXN", "Mex$", "@", "@", 2));
                            hashMap.put("COP", C60812oe.A00("COP", "Col$", "@", "@", 2));
                            hashMap.put("ARS", C60812oe.A00("ARS", "Arg$", "@", "@", 2));
                            hashMap.put("CLP", C60812oe.A00("CLP", "$", "@", "@", 0));
                            hashMap.put("IDR", C60812oe.A00("IDR", "Rp", "@", "@", 2));
                            hashMap.put("ILS", C60812oe.A00("ILS", "₪", "@", "@", 2));
                            hashMap.put("AED", C60812oe.A00("AED", "د.إ", "@", "@", 2));
                            hashMap.put("TRY", C60812oe.A00("TRY", "₺", "@", "@", 2));
                            hashMap.put("HKD", C60812oe.A00("HKD", "HK$", "@", "@", 2));
                            hashMap.put("ZAR", C60812oe.A00("ZAR", "R", "@", "@", 2));
                            hashMap.put("SAR", C60812oe.A00("SAR", "ر.س", "@", "@", 2));
                            hashMap.put("LKR", C60812oe.A00("LKR", "රු.", "@", "@", 2));
                            hashMap.put("VES", C60812oe.A00("VES", "Bs.S", "@", "@", 2));
                            hashMap.put("BOB", C60812oe.A00("BOB", "Bs", "@", "@", 2));
                            hashMap.put("MAD", C60812oe.A00("MAD", "د.م.", "@", "@", 2));
                            hashMap.put("XOF", C60812oe.A00("XOF", "CFA", "@", "@", 0));
                            hashMap.put("GTQ", C60812oe.A00("GTQ", "Q", "@", "@", 2));
                        }
                        if (hashMap.containsKey(str3)) {
                            AnonymousClass1KJ r11 = (AnonymousClass1KJ) hashMap.get(str3);
                            A012 = new C63572tK(r11, A002, str, new LinkedHashSet(Collections.singletonList(r11)), (int[]) null, (int[]) null, (AnonymousClass1QM[]) null, (AnonymousClass1QM[]) null, new AnonymousClass1QM[0], 0, 0, false, true, false);
                        }
                    }
                    A012 = r5;
                }
                if (A012 == r5) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("not enabled with unsupported country code: ");
                    sb2.append(str);
                    AnonymousClass1QE.A02(r4, (String) null, sb2.toString());
                    this.A00 = null;
                } else {
                    this.A00 = A012;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("init enabled for country: ");
                    sb3.append(A012.A03);
                    sb3.append(" and default currency: ");
                    String str4 = ((AnonymousClass1KL) A012.A02).A06;
                    C18070vi.A0W(str4);
                    sb3.append(str4);
                    r4.A06(sb3.toString());
                }
                this.A01 = true;
            }
        }
    }

    public AnonymousClass1QJ(AnonymousClass11S r4, AnonymousClass1KI r5, C18030ve r6, AnonymousClass1KG r7, AnonymousClass1QH r8) {
        this.A05 = r6;
        this.A03 = r4;
        this.A07 = r8;
        this.A06 = r7;
        this.A04 = r5;
    }
}
