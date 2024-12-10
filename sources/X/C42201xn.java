package X;

import android.content.Context;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1xn  reason: invalid class name and case insensitive filesystem */
public class C42201xn {
    public final AnonymousClass11P A00;
    public final AnonymousClass118 A01;
    public final C18000vb A02;
    public final AnonymousClass1M9 A03;
    public final C24921Me A04;
    public final C26241Rj A05;

    public String A00(AnonymousClass1E7 r12) {
        Context context;
        int i;
        C53732d0 r4;
        Context context2;
        int i2;
        if (C22971Dz.A0N(r12.A0J)) {
            return null;
        }
        boolean A0F = r12.A0F();
        C26241Rj r42 = this.A05;
        Class<AnonymousClass1BI> cls = AnonymousClass1BI.class;
        if (A0F) {
            Jid A06 = r12.A06(cls);
            C17960vV.A07(A06);
            AnonymousClass1BI r2 = (AnonymousClass1BI) A06;
            C43371zh r1 = (C43371zh) r42.A0F.get(r2);
            Object obj = null;
            if (r1 != null) {
                int i3 = -1;
                if (C22971Dz.A0e(r2)) {
                    HashMap hashMap = r1.A06;
                    if (hashMap != null) {
                        long j = 0;
                        for (Map.Entry entry : hashMap.entrySet()) {
                            if (((C53722cz) entry.getValue()).A01 > j) {
                                obj = entry.getKey();
                                j = ((C53722cz) entry.getValue()).A01;
                                i3 = ((C53722cz) entry.getValue()).A00;
                            }
                        }
                        if (C26241Rj.A02(j)) {
                            C17960vV.A07(obj);
                            r4 = new C53732d0((AnonymousClass1BI) obj, i3);
                        }
                    }
                } else {
                    int A062 = r42.A06(r2, (UserJid) null);
                    if (A062 != -1) {
                        r4 = new C53732d0(r2, A062);
                    }
                }
                AnonymousClass1E7 A0H = this.A03.A0H(r4.A01);
                C24921Me r13 = this.A04;
                String A0T = r13.A0T(A0H, r13.A0B(r12.A0J));
                int i4 = r4.A00;
                if (i4 == 0) {
                    context2 = this.A01.A00;
                    i2 = 2131889003;
                } else if (i4 == 1) {
                    context2 = this.A01.A00;
                    i2 = 2131889004;
                }
                return context2.getString(i2, new Object[]{this.A02.A0F(A0T)});
            }
        } else {
            Jid A063 = r12.A06(cls);
            C17960vV.A07(A063);
            int A064 = r42.A06((AnonymousClass1BI) A063, (UserJid) null);
            if (A064 == 0) {
                context = this.A01.A00;
                i = 2131888988;
            } else if (A064 == 1) {
                context = this.A01.A00;
                i = 2131888989;
            }
            return context.getString(i);
        }
        return null;
    }

    public String A02(AnonymousClass1E7 r10, boolean z) {
        int i;
        String A002;
        if (z && (A002 = A00(r10)) != null) {
            return A002;
        }
        C26241Rj r1 = this.A05;
        Jid A06 = r10.A06(AnonymousClass1BI.class);
        C17960vV.A07(A06);
        long A07 = r1.A07((AnonymousClass1BI) A06);
        if (A07 == 0) {
            return "";
        }
        if (A07 == 1) {
            return this.A01.A00.getString(2131888979);
        }
        AnonymousClass11P r0 = this.A00;
        long A09 = r0.A09(A07);
        int A003 = A87.A00(30, AnonymousClass11P.A01(r0), A09);
        if (A003 <= 6) {
            if (A003 != 0) {
                if (A003 != 1) {
                    Calendar instance = Calendar.getInstance();
                    instance.setTimeInMillis(A09);
                    switch (instance.get(7)) {
                        case 1:
                            i = 2131888993;
                            break;
                        case 2:
                            i = 2131888991;
                            break;
                        case 3:
                            i = 2131888996;
                            break;
                        case 4:
                            i = 2131888997;
                            break;
                        case 5:
                            i = 2131888994;
                            break;
                        case 6:
                            i = 2131888990;
                            break;
                        case 7:
                            i = 2131888992;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                } else {
                    i = 2131888999;
                }
            } else {
                i = 2131888995;
            }
            C18000vb r5 = this.A02;
            String A004 = A8I.A00(r5, A09);
            return A8I.A01(r5, this.A01.A00.getString(i, new Object[]{A004}), A09);
        }
        String A032 = C64052u8.A03(this.A02, A003, A09);
        return this.A01.A00.getString(2131888998, new Object[]{A032});
    }

    public C42201xn(AnonymousClass1M9 r1, C24921Me r2, AnonymousClass11P r3, AnonymousClass118 r4, C18000vb r5, C26241Rj r6) {
        this.A01 = r4;
        this.A00 = r3;
        this.A03 = r1;
        this.A04 = r2;
        this.A02 = r5;
        this.A05 = r6;
    }

    public String A01(AnonymousClass1E7 r8) {
        if (A00(r8) != null) {
            return null;
        }
        C26241Rj r4 = this.A05;
        Class<AnonymousClass1BI> cls = AnonymousClass1BI.class;
        Jid A06 = r8.A06(cls);
        C17960vV.A07(A06);
        long A07 = r4.A07((AnonymousClass1BI) A06);
        Jid A062 = r8.A06(cls);
        C17960vV.A07(A062);
        if (1 == r4.A07((AnonymousClass1BI) A062)) {
            return null;
        }
        AnonymousClass11P r0 = this.A00;
        long A09 = r0.A09(A07);
        int A002 = A87.A00(30, AnonymousClass11P.A01(r0), A09);
        if (A002 > 6) {
            return C64052u8.A03(this.A02, A002, A09);
        }
        if (!(A002 == 0 || A002 == 1)) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(A09);
            instance.get(7);
        }
        C18000vb r1 = this.A02;
        return A8I.A01(r1, A8I.A00(r1, A09), A09);
    }
}
