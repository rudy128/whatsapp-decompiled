package X;

import android.text.TextUtils;
import com.whatsapp.payments.PaymentConfiguration;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.1QS  reason: invalid class name */
public class AnonymousClass1QS {
    public A5I A00;
    public AZ8 A01;
    public PaymentConfiguration A02;
    public boolean A03;
    public final AnonymousClass1QR A04;
    public final AnonymousClass1KH A05;
    public final AnonymousClass1QO A06;
    public final AnonymousClass1QP A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass18O A09;
    public final AnonymousClass118 A0A;
    public final C18000vb A0B;
    public final AnonymousClass1QJ A0C;
    public final AnonymousClass1QE A0D = AnonymousClass1QE.A00("PaymentsManager", "infra", "COMMON");
    public final AnonymousClass10I A0E;
    public final AnonymousClass00H A0F = C221618v.A00(AnonymousClass16J.class);
    public final Map A0G;

    /* JADX WARNING: type inference failed for: r0v3, types: [X.AZ8, java.lang.Object] */
    public static synchronized void A00(AnonymousClass1QS r5) {
        synchronized (r5) {
            if (!r5.A03) {
                PaymentConfiguration A032 = r5.A03();
                r5.A02 = A032;
                if (A032 == null) {
                    r5.A0D.A05("initialize/paymentConfig is null");
                } else {
                    AnonymousClass18O r4 = r5.A09;
                    C18000vb r3 = r5.A0B;
                    AnonymousClass1QJ r2 = r5.A0C;
                    BD1 A012 = A032.A01();
                    ? obj = new Object();
                    obj.A00 = r4;
                    obj.A01 = r3;
                    obj.A02 = A012;
                    obj.CLa(r2);
                    r5.A01 = obj;
                    AnonymousClass1KH r42 = r5.A05;
                    r42.A0H(r5.A02);
                    AnonymousClass1QR r32 = r5.A04;
                    PaymentConfiguration paymentConfiguration = r5.A02;
                    r32.A00 = paymentConfiguration;
                    r5.A07.A00 = paymentConfiguration;
                    r5.A00 = new A5I(r32, r42, paymentConfiguration, r5.A0E);
                    r5.A03 = true;
                    r5.A0D.A06("initialized");
                }
            }
        }
    }

    public synchronized C57312is A04(String str) {
        A00(this);
        PaymentConfiguration paymentConfiguration = this.A02;
        if (paymentConfiguration == null) {
            return null;
        }
        return paymentConfiguration.A00(str);
    }

    @Deprecated
    public synchronized BD1 A06() {
        AZ8 az8;
        A00(this);
        az8 = this.A01;
        C17960vV.A07(az8);
        return az8;
    }

    public synchronized void A09(boolean z, boolean z2) {
        AnonymousClass1QD r1;
        this.A0D.A06("reset");
        A00(this);
        this.A03 = false;
        AnonymousClass1QJ r3 = this.A0C;
        synchronized (r3) {
            try {
                AnonymousClass1QE.A02(r3.A02, (String) null, "reset country");
                r3.A00 = null;
                r3.A01 = false;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
        if (this.A05.A09 && !z2) {
            A5I a5i = this.A00;
            a5i.A03.CGD(new AnonymousClass8p0(a5i, new C21425Ajs((Object) this, 39)), new Void[0]);
        }
        ((AnonymousClass16J) this.A0F.get()).A00();
        if (z) {
            if (C18020vd.A05(C18040vf.A02, this.A06.A02, 2928)) {
                A02("p2m_context").A07();
            }
            A02("p2p_context").A07();
        } else {
            if (C18020vd.A05(C18040vf.A02, this.A06.A02, 2928)) {
                A02("p2m_context").A08();
            }
            A02("p2p_context").A08();
        }
        C20008A2y BWS = A06().BWS();
        if (BWS != null) {
            synchronized (BWS) {
                try {
                    if (C20008A2y.A00(BWS, C25511Om.A00)) {
                        BWS.A00.clear();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        }
        AnonymousClass3M8 BPV = this.A01.BPV();
        if (BPV != null) {
            BPV.BIC();
        }
        C196199uc BPW = this.A01.BPW();
        if (BPW != null) {
            synchronized (BPW) {
                try {
                    Log.i("PAY: IndiaUpiBlockListManager clear");
                    BPW.A09.clear();
                    r1 = BPW.A06;
                    r1.A0L("");
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            }
            synchronized (BPW) {
                Log.i("PAY: IndiaUpiBlockListManager setShouldFetch called");
                BPW.A00 = -1;
                r1.A03().edit().putLong("payments_block_list_last_sync_time", -1).apply();
            }
        }
    }

    public PaymentConfiguration A03() {
        PaymentConfiguration paymentConfiguration = this.A02;
        if (paymentConfiguration != null) {
            return paymentConfiguration;
        }
        PaymentConfiguration paymentConfiguration2 = (PaymentConfiguration) ((AnonymousClass10E) ((C000100c) AnonymousClass00E.A00(this.A0A.A00, C000100c.class))).Ao8.A00.A3j.get();
        this.A02 = paymentConfiguration2;
        return paymentConfiguration2;
    }

    public String A07(String str) {
        PaymentConfiguration paymentConfiguration = this.A02;
        if (paymentConfiguration != null) {
            paymentConfiguration.A01.A03();
            if (str != null) {
                str = str.toUpperCase(Locale.US);
            }
            if (!TextUtils.isEmpty(str)) {
                switch (str.hashCode()) {
                    case 66044:
                        if (str.equals("BRL")) {
                            return "BR";
                        }
                        break;
                    case 72653:
                        if (str.equals("INR")) {
                            return "IN";
                        }
                        break;
                    case 82032:
                        if (str.equals("SGD")) {
                            return "SG";
                        }
                        break;
                }
            }
        }
        C63572tK r0 = C63572tK.A0E;
        return "UNSET";
    }

    public AnonymousClass1QS(AnonymousClass18O r4, AnonymousClass118 r5, C18000vb r6, AnonymousClass1QR r7, AnonymousClass1KH r8, AnonymousClass1QJ r9, AnonymousClass1QO r10, AnonymousClass1QP r11, AnonymousClass10I r12, AnonymousClass00H r13, Map map) {
        this.A0A = r5;
        this.A0E = r12;
        this.A09 = r4;
        this.A05 = r8;
        this.A0B = r6;
        this.A07 = r11;
        this.A06 = r10;
        this.A0C = r9;
        this.A0G = map;
        this.A08 = r13;
        this.A04 = r7;
    }

    public A5I A01() {
        A00(this);
        A5I a5i = this.A00;
        C17960vV.A07(a5i);
        return a5i;
    }

    public AnonymousClass1QK A02(String str) {
        A00(this);
        Object obj = this.A0G.get(str);
        C17960vV.A07(obj);
        return (AnonymousClass1QK) obj;
    }

    public AZ9 A05(String str) {
        AZ9 az9;
        A00(this);
        PaymentConfiguration paymentConfiguration = this.A02;
        if (paymentConfiguration == null) {
            return null;
        }
        C18070vi.A0d(str, 0);
        C52412as r4 = (C52412as) paymentConfiguration.A01.A03();
        synchronized (r4) {
            az9 = null;
            for (Map.Entry value : r4.A00.entrySet()) {
                AZ9 az92 = (AZ9) ((C18140vp) value.getValue()).get();
                if (str.equalsIgnoreCase(az92.A07)) {
                    az9 = az92;
                }
            }
        }
        return az9;
    }

    public void A08(C33661jB r7) {
        boolean z;
        A00(this);
        AnonymousClass00H r3 = this.A0F;
        if (r3.get() != null) {
            AnonymousClass16J r2 = (AnonymousClass16J) r3.get();
            synchronized (r2) {
                z = false;
                if (r2.A00.size() > 0) {
                    z = true;
                }
            }
            if (z) {
                AnonymousClass16J r5 = (AnonymousClass16J) r3.get();
                synchronized (r5) {
                    HashSet hashSet = new HashSet();
                    Map map = r5.A00;
                    for (String str : map.keySet()) {
                        if (map.get(str) == r7) {
                            hashSet.add(str);
                        }
                    }
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        map.remove((String) it.next());
                    }
                }
            }
        }
    }
}
