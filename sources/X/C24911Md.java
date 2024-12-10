package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1Md  reason: invalid class name and case insensitive filesystem */
public class C24911Md {
    public final C18030ve A00;
    public final AnonymousClass19Y A01;
    public final ConcurrentHashMap A02 = new ConcurrentHashMap();

    public static boolean A00(C24911Md r5, String str, int i) {
        ConcurrentHashMap concurrentHashMap = r5.A02;
        Number number = (Number) concurrentHashMap.get(str);
        if (!C18020vd.A05(C18040vf.A02, r5.A00, 620)) {
            return false;
        }
        if (number != null && number.intValue() == i) {
            return false;
        }
        r5.A01.markerStart(i, str.hashCode());
        concurrentHashMap.put(str, Integer.valueOf(i));
        return true;
    }

    public void A01(String str) {
        Number number = (Number) this.A02.remove(str);
        if (number != null) {
            this.A01.Biv(number.intValue(), str.hashCode(), 213, "start_foreground_service");
        }
    }

    public void A02(String str, int i, boolean z, boolean z2) {
        Number number = (Number) this.A02.get(str);
        if (number != null) {
            AnonymousClass19Y r3 = this.A01;
            int intValue = number.intValue();
            int hashCode = str.hashCode();
            r3.markerAnnotate(intValue, hashCode, "is_video_call", z);
            r3.markerAnnotate(intValue, hashCode, "peer_participants_count", i);
            r3.markerAnnotate(intValue, hashCode, "is_rejoin", z2);
        }
    }

    public void A03(String str, String str2) {
        Number number = (Number) this.A02.get(str);
        if (number != null) {
            this.A01.markerPoint(number.intValue(), str.hashCode(), str2);
        }
    }

    public void A04(String str, short s) {
        Number number = (Number) this.A02.remove(str);
        if (number != null) {
            this.A01.markerEnd(number.intValue(), str.hashCode(), s);
        }
    }

    public C24911Md(C18030ve r2, AnonymousClass19Y r3) {
        this.A01 = r3;
        this.A00 = r2;
    }
}
