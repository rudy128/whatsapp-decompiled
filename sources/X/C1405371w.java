package X;

import android.graphics.Bitmap;
import android.net.TrafficStats;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.71w  reason: invalid class name and case insensitive filesystem */
public final class C1405371w {
    public final AnonymousClass181 A00;
    public final C24371Kb A01;
    public final C126196cL A02;
    public final C24421Kg A03;
    public final C18600wl A04;

    public static final Bitmap A00(C1405371w r4, String str, boolean z) {
        if (!z) {
            C126196cL r0 = r4.A02;
            C18070vi.A0d(str, 0);
            String A042 = C17970vW.A04(str);
            C17960vV.A07(A042);
            C18070vi.A0X(A042);
            Bitmap A022 = ((A5O) r0.A00.getValue()).A02(A042, Integer.MAX_VALUE, Integer.MAX_VALUE, false);
            if (A022 != null) {
                return A022;
            }
        }
        C696137w r3 = new C696137w(str);
        C24421Kg r1 = r4.A03;
        r1.A0D();
        TrafficStats.setThreadStatsTag(27);
        return (Bitmap) r1.A0A(r3, 2).A00(new C144757Io(r4, r3, 1));
    }

    public final List A02(List list, C22821Di r8, AnonymousClass1OS r9, boolean z, boolean z2) {
        Object obj;
        if (z) {
            ((A5O) this.A02.A00.getValue()).A05(true);
        }
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : list) {
            Object obj2 = null;
            try {
                Bitmap A002 = A00(this, (String) r8.invoke(next), z);
                if (A002 != null) {
                    obj = r9.invoke(A002, next);
                } else {
                    obj = null;
                }
            } catch (Throwable th) {
                obj = C108945cZ.A1J(th);
            }
            Throwable A003 = C30671eK.A00(obj);
            if (A003 != null) {
                Log.e("AvatarAssetFetcher/fetchAssets", A003);
            }
            if (!(obj instanceof AnonymousClass1IU)) {
                obj2 = obj;
            }
            if (z2 && obj2 == null) {
                return C18460wS.A00;
            }
            if (obj2 != null) {
                A13.add(obj2);
            }
        }
        return A13;
    }

    public final void A03() {
        ((A5O) this.A02.A00.getValue()).A05(true);
    }

    public C1405371w(AnonymousClass181 r2, AnonymousClass118 r3, C24371Kb r4, C24421Kg r5, C18600wl r6) {
        C18070vi.A0w(r3, r2, r5, r4, r6);
        this.A00 = r2;
        this.A03 = r5;
        this.A01 = r4;
        this.A04 = r6;
        this.A02 = new C126196cL(r3);
    }

    public static void A01(AnonymousClass00H r1) {
        ((A5O) ((C1405371w) r1.get()).A02.A00.getValue()).A05(false);
    }
}
