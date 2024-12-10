package X;

import android.content.SharedPreferences;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6z4  reason: invalid class name and case insensitive filesystem */
public class C139576z4 {
    public SharedPreferences A00;
    public boolean A01;
    public final AnonymousClass19F A02;
    public final C137996wM A03;
    public final C132366mf A04;
    public final C18010vc A05;
    public final C18030ve A06;

    public static synchronized void A00(C139576z4 r13) {
        synchronized (r13) {
            if (!r13.A01) {
                C137996wM r8 = r13.A03;
                C132366mf r6 = r13.A04;
                List<C128466g3> list = r8.A01.A00;
                ArrayList A13 = AnonymousClass000.A13();
                ArrayList A132 = AnonymousClass000.A13();
                for (C128466g3 r9 : list) {
                    if (r9.A00.BeY(r6)) {
                        C137996wM.A00(r8).update(r9.A01.getBytes());
                        int intValue = new BigInteger(1, C137996wM.A00(r8).digest(((String) r6.A00("device_id")).getBytes())).mod(new BigInteger(Integer.toString(SearchActionVerificationClientService.NOTIFICATION_ID))).intValue();
                        Iterator it = r9.A02.iterator();
                        int i = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C129676iB r3 = (C129676iB) it.next();
                            Iterator it2 = r3.A04.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    C128456g2 r1 = (C128456g2) it2.next();
                                    i += r1.A00;
                                    if (intValue < i) {
                                        Pair create = Pair.create(r3, r1);
                                        if (create != null) {
                                            C129676iB r4 = (C129676iB) create.first;
                                            C128456g2 r32 = (C128456g2) create.second;
                                            C160998Ax r0 = r4.A02;
                                            if (r0 == null || r0.BeY(r6)) {
                                                long A042 = C17880vN.A04(System.currentTimeMillis());
                                                if (A042 >= r4.A01 && A042 <= r4.A00) {
                                                    C132356me r02 = new C132356me(r32, r4, r9);
                                                    A13.add(r02);
                                                    A132.addAll(r02.A00.A02);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                SparseArray sparseArray = new SparseArray();
                Iterator it3 = A132.iterator();
                while (it3.hasNext()) {
                    C127266e4 r03 = (C127266e4) it3.next();
                    int i2 = r03.A00;
                    Object obj = r03.A01;
                    if (obj instanceof Boolean) {
                        obj = Integer.valueOf(AnonymousClass000.A1Y(obj) ? 1 : 0);
                    }
                    sparseArray.append(i2, obj.toString());
                }
                AnonymousClass19F r42 = r13.A02;
                synchronized (r42) {
                    try {
                        SharedPreferences.Editor edit = r42.A00.edit();
                        edit.remove("ab_props:sys:config_hash");
                        edit.remove("ab_props:sys:last_refresh_time");
                        edit.remove("ab_props:sys:last_version");
                        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                            AnonymousClass19F.A00(edit, r42, (String) sparseArray.valueAt(i3), sparseArray.keyAt(i3));
                        }
                        edit.apply();
                        r42.A05.A0K();
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
                HashSet A12 = C17880vN.A12();
                Iterator it4 = A13.iterator();
                while (it4.hasNext()) {
                    C108955ca.A1U((C132356me) it4.next(), A12);
                }
                try {
                    SharedPreferences sharedPreferences = r13.A00;
                    if (sharedPreferences == null) {
                        sharedPreferences = r13.A05.A05(C19620yd.A09);
                        r13.A00 = sharedPreferences;
                    }
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    edit2.putStringSet("ab_offline_props:offline_exposure_strings", A12);
                    edit2.apply();
                    r13.A01 = true;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        }
    }

    public synchronized int A01(int i) {
        A00(this);
        return C18020vd.A00(C18040vf.A02, this.A06, i);
    }

    public synchronized boolean A02(int i) {
        A00(this);
        return C18020vd.A05(C18040vf.A02, this.A06, i);
    }

    public C139576z4(C18030ve r1, AnonymousClass19F r2, C137996wM r3, C132366mf r4, C18010vc r5) {
        this.A06 = r1;
        this.A04 = r4;
        this.A02 = r2;
        this.A03 = r3;
        this.A05 = r5;
    }
}
