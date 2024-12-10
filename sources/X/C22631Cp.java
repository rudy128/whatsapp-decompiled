package X;

import com.whatsapp.util.Log;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.1Cp  reason: invalid class name and case insensitive filesystem */
public class C22631Cp implements AnonymousClass11J {
    public final AnonymousClass11P A00;
    public final HashMap A01 = new HashMap();
    public final AnonymousClass10I A02;

    public static C61692q6 A00(C22631Cp r6, String str, boolean z, boolean z2) {
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            r6.A02(Arrays.asList(allByName), str, 0);
            return new C61692q6(new C53412cU(0, false), allByName, z2);
        } catch (UnknownHostException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("primary dns resolution failed for ");
            sb.append(str);
            Log.w(sb.toString(), e);
            try {
                ArrayList A012 = C26090Cs8.A01(str, 0);
                ArrayList arrayList = new ArrayList(A012.size());
                Iterator it = A012.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C25064CVw) it.next()).A01);
                }
                r6.A02(arrayList, str, 1);
                return new C61692q6(new C53412cU(1, false), (InetAddress[]) arrayList.toArray(new InetAddress[0]), z2);
            } catch (C22641Cq | UnknownHostException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("secondary dns resolution failed for ");
                sb2.append(str);
                Log.w(sb2.toString(), e2);
                if (z) {
                    try {
                        return A01(r6, str, true, z2);
                    } catch (UnknownHostException e3) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("hardcoded ip resolution failed for ");
                        sb3.append(str);
                        Log.w(sb3.toString(), e3);
                        throw e;
                    }
                } else {
                    throw e;
                }
            }
        }
    }

    public C61692q6 A03(String str) {
        C61692q6 A04 = A04(str, 0, true, false);
        Arrays.toString(A04.A05);
        return A04;
    }

    public C61692q6 A04(String str, long j, boolean z, boolean z2) {
        boolean z3;
        StringBuilder sb = new StringBuilder();
        sb.append("resolving ");
        String str2 = str;
        sb.append(str2);
        Log.i(sb.toString());
        synchronized (this) {
            HashMap hashMap = this.A01;
            List<C59722mm> list = (List) hashMap.get(str2);
            z3 = z2;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                HashSet hashSet = new HashSet();
                int i = 0;
                for (C59722mm r1 : list) {
                    AnonymousClass11P r14 = this.A00;
                    Long l = r1.A01;
                    if (l == null || AnonymousClass11P.A01(r14) < l.longValue()) {
                        arrayList.add(r1.A03);
                        i = r1.A00;
                    } else {
                        hashSet.add(r1);
                    }
                }
                list.removeAll(hashSet);
                if (list.isEmpty()) {
                    hashMap.remove(str2);
                }
                C61692q6 r12 = new C61692q6(new C53412cU(i, true), (InetAddress[]) arrayList.toArray(new InetAddress[0]), z3);
                InetAddress[] inetAddressArr = r12.A05;
                if (inetAddressArr != null && inetAddressArr.length > 0) {
                    return r12;
                }
            }
        }
        long j2 = j;
        boolean z4 = false;
        if (j >= 0) {
            z4 = true;
        }
        C17960vV.A0C(z4);
        boolean z5 = z;
        if (j == 0) {
            return A00(this, str2, z5, z3);
        }
        FutureTask futureTask = new FutureTask(new AnonymousClass3DE(this, str2, z5, z3));
        this.A02.CGN(futureTask);
        try {
            return (C61692q6) futureTask.get(j2, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            if (e.getCause() instanceof UnknownHostException) {
                throw e.getCause();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to lookup host ");
            sb2.append(str2);
            sb2.append(": ");
            sb2.append(e);
            throw new UnknownHostException(sb2.toString());
        } catch (InterruptedException | TimeoutException e2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Failed to lookup host ");
            sb3.append(str2);
            sb3.append(": ");
            sb3.append(e2);
            throw new UnknownHostException(sb3.toString());
        }
    }

    public void Bps(C59732mn r2) {
        synchronized (this) {
            this.A01.clear();
        }
    }

    public static C61692q6 A01(C22631Cp r4, String str, boolean z, boolean z2) {
        List list = (List) C64022u5.A00.get(str);
        if (list == null || list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("no hardcoded ips found for ");
            sb.append(str);
            throw new UnknownHostException(sb.toString());
        }
        if (z) {
            r4.A02(list, str, 2);
        }
        return new C61692q6(new C53412cU(2, false), (InetAddress[]) list.toArray(new InetAddress[0]), z2);
    }

    public C22631Cp(AnonymousClass11P r2, AnonymousClass10I r3) {
        this.A00 = r2;
        this.A02 = r3;
    }

    private void A02(Iterable iterable, String str, int i) {
        long currentTimeMillis = System.currentTimeMillis() + 3600000;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(new C59722mm(Long.valueOf(currentTimeMillis), (Short) null, (InetAddress) it.next(), i, false, false));
        }
        synchronized (this) {
            this.A01.put(str, arrayList);
        }
    }
}
