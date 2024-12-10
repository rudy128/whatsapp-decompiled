package X;

import android.os.SystemClock;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2wC  reason: invalid class name and case insensitive filesystem */
public final class C65312wC implements QuickPerformanceLogger, AnonymousClass19X {
    public static final Set A06;
    public final AnonymousClass19Y A00;
    public final C18100vl A01;
    public final C18100vl A02;
    public final AnonymousClass11P A03;
    public final AnonymousClass19A A04;
    public final AnonymousClass19O A05;

    public void endAllMarkers(short s, boolean z) {
        if (!A03((Integer) null)) {
            this.A00.endAllMarkers(s, z);
        }
    }

    public EventBuilder markEventBuilder(int i, String str) {
        int i2 = i;
        String str2 = str;
        if (!A02(this, str, 1, i)) {
            return new C65302wB(this.A04, this, (Integer) null, str2, i2);
        }
        C20378AIo aIo = C20378AIo.A00;
        C18070vi.A0Z(aIo);
        return aIo;
    }

    public void markJoinRequestForE2E(int i, int i2, String str, long j, TimeUnit timeUnit) {
        C18070vi.A0f(str, 2, timeUnit);
        A03(Integer.valueOf(i));
    }

    public void markJoinResponseForE2E(int i, int i2, String str, long j, TimeUnit timeUnit) {
        C18070vi.A0f(str, 2, timeUnit);
        A03(Integer.valueOf(i));
    }

    public void markerAnnotateCrucialForUserFlow(int i, int i2, String str, int i3) {
        C18070vi.A0d(str, 2);
        markerAnnotate(i, i2, str, i3);
    }

    public void markerEnd(int i, short s, long j, TimeUnit timeUnit) {
        int i2 = i;
        TimeUnit timeUnit2 = timeUnit;
        if (!A02(this, timeUnit, 3, i)) {
            this.A00.markerEnd(i2, s, A00(j, timeUnit), timeUnit2);
        }
    }

    public void markerEndAtPointForUserFlow(int i, int i2, short s, String str) {
        if (!A02(this, str, 3, i)) {
            this.A00.Biv(i, i2, s, str);
        }
    }

    public void markerGenerate(int i, short s, long j, TimeUnit timeUnit) {
        C18070vi.A0d(timeUnit, 3);
        A03(Integer.valueOf(i));
    }

    public void markerGenerateWithAnnotations(int i, short s, long j, TimeUnit timeUnit, Map map) {
        C18070vi.A0d(timeUnit, 3);
        A03(Integer.valueOf(i));
    }

    public void markerLinkPivot(int i, int i2, String str) {
        C18070vi.A0d(str, 2);
        A03(Integer.valueOf(i));
    }

    public void markerStartForE2E(int i, int i2, String str, boolean z, long j, TimeUnit timeUnit) {
        C18070vi.A0g(str, 2, timeUnit);
        A03(Integer.valueOf(i));
    }

    public void markerTag(int i, String str) {
        C18070vi.A0d(str, 1);
        A03(Integer.valueOf(i));
    }

    static {
        Integer[] numArr = new Integer[19];
        AnonymousClass000.A1L(numArr, 16318558);
        AnonymousClass000.A1M(numArr, 16318559);
        numArr[2] = 16321564;
        C17890vO.A1G(numArr, 674172413);
        numArr[4] = 328150699;
        numArr[5] = 231933222;
        C17890vO.A1H(numArr, 231936990);
        C17890vO.A1I(numArr, 231937012);
        numArr[8] = 231941967;
        numArr[9] = 231943291;
        numArr[10] = 231947811;
        numArr[11] = 231944056;
        numArr[12] = 231940913;
        numArr[13] = 979832838;
        numArr[14] = 979837301;
        numArr[15] = 979833239;
        numArr[16] = 979838258;
        numArr[17] = 231946607;
        numArr[18] = 231948284;
        A06 = C200410p.A0S(numArr);
    }

    private final long A00(long j, TimeUnit timeUnit) {
        if (j == -1) {
            return timeUnit.convert(currentMonotonicTimestampNanos(), TimeUnit.NANOSECONDS);
        }
        return j;
    }

    private final boolean A03(Integer num) {
        if (AnonymousClass000.A1Y(this.A01.getValue())) {
            return true;
        }
        if (num == null || A06.contains(num)) {
            return false;
        }
        return true;
    }

    public long currentMonotonicTimestampNanos() {
        return this.A00.A01.currentMonotonicTimestampNanos();
    }

    public boolean isMarkerOn(int i, int i2) {
        return this.A00.A01.isMarkerOn(i, i2);
    }

    public void markerEndForUserFlow(int i, String str, int i2, short s) {
        if (str == null) {
            markerEnd(i, i2, s);
        } else {
            markerEndAtPointForUserFlow(i, i2, s, str);
        }
    }

    public C65312wC(AnonymousClass11P r3, C18030ve r4, AnonymousClass19Y r5, AnonymousClass19A r6, AnonymousClass19O r7) {
        C18070vi.A0w(r4, r3, r6, r7, r5);
        this.A03 = r3;
        this.A04 = r6;
        this.A05 = r7;
        this.A00 = r5;
        Integer num = AnonymousClass00R.A01;
        this.A01 = AnonymousClass1DF.A00(num, new AnonymousClass3H3(r4));
        this.A02 = AnonymousClass1DF.A00(num, new AnonymousClass3H4(this));
    }

    public static boolean A01(C65312wC r1, int i) {
        return r1.A03(Integer.valueOf(i));
    }

    public static boolean A02(C65312wC r1, Object obj, int i, int i2) {
        C18070vi.A0d(obj, i);
        return r1.A03(Integer.valueOf(i2));
    }

    public void CKw(int i, int i2, String str) {
        if (!A01(this, i)) {
            this.A00.CKw(i, i2, str);
        }
    }

    public void CKx(int i, String str) {
        if (!A01(this, i)) {
            this.A00.CKx(i, str);
        }
    }

    public long currentMonotonicTimestamp() {
        return SystemClock.elapsedRealtime();
    }

    public void endAllInstancesOfMarker(int i, short s) {
        if (!A01(this, i)) {
            this.A00.endAllInstancesOfMarker(i, s);
        }
    }

    public void markerDrop(int i) {
        if (!A01(this, i)) {
            this.A00.markerDrop(i);
        }
    }

    public void markerDropForUserFlow(int i, int i2) {
        if (!A01(this, i)) {
            this.A00.markerDrop(i, i2);
        }
    }

    public void markerStart(int i) {
        if (!A01(this, i)) {
            this.A00.markerStart(i);
        }
    }

    public void markerStartForUserFlow(int i, int i2, boolean z, long j) {
        if (!A01(this, i)) {
            this.A00.Bj1(i, i2, z);
        }
    }

    public void markerStartWithCancelPolicy(int i, boolean z) {
        if (!A01(this, i)) {
            this.A00.Bj2(i, z);
        }
    }

    public int sampleRateForMarker(int i) {
        if (A01(this, i)) {
            return Integer.MAX_VALUE;
        }
        return (int) AnonymousClass19I.A00(this.A05.A01, i).A01;
    }

    public MarkerEditor withMarker(int i) {
        if (!A01(this, i)) {
            return new AnonymousClass2A6(this.A04, this, (Integer) null, i);
        }
        AnonymousClass8QW r0 = AnonymousClass8QW.A00;
        C18070vi.A0Z(r0);
        return r0;
    }

    public void markerAnnotate(int i, int i2, String str, double d) {
        int i3 = i;
        String str2 = str;
        if (!A02(this, str, 2, i)) {
            this.A00.markerAnnotate(i3, i2, str2, d);
        }
    }

    public void markerAnnotate(int i, int i2, String str, int i3) {
        if (!A02(this, str, 2, i)) {
            this.A00.markerAnnotate(i, i2, str, i3);
        }
    }

    public void markerAnnotate(int i, int i2, String str, long j) {
        int i3 = i;
        String str2 = str;
        if (!A02(this, str, 2, i)) {
            this.A00.markerAnnotate(i3, i2, str2, j);
        }
    }

    public void markerAnnotate(int i, int i2, String str, String str2) {
        C18070vi.A0k(str, str2);
        if (!A01(this, i)) {
            this.A00.markerAnnotate(i, i2, str, str2);
        }
    }

    public void markerAnnotate(int i, int i2, String str, boolean z) {
        if (!A02(this, str, 2, i)) {
            this.A00.markerAnnotate(i, i2, str, z);
        }
    }

    public void markerAnnotate(int i, int i2, String str, double[] dArr) {
        C18070vi.A0k(str, dArr);
        if (!A01(this, i)) {
            this.A00.markerAnnotate(i, i2, str, dArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, int[] iArr) {
        C18070vi.A0k(str, iArr);
        if (!A01(this, i)) {
            this.A00.markerAnnotate(i, i2, str, iArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, long[] jArr) {
        C18070vi.A0k(str, jArr);
        if (!A01(this, i)) {
            this.A00.markerAnnotate(i, i2, str, jArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, String[] strArr) {
        C18070vi.A0k(str, strArr);
        if (!A01(this, i)) {
            this.A00.markerAnnotate(i, i2, str, strArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, boolean[] zArr) {
        C18070vi.A0k(str, zArr);
        if (!A01(this, i)) {
            this.A00.markerAnnotate(i, i2, str, zArr);
        }
    }

    public void markerAnnotate(int i, String str, double d) {
        if (!A02(this, str, 1, i)) {
            this.A00.markerAnnotate(i, str, d);
        }
    }

    public void markerAnnotate(int i, String str, int i2) {
        if (!A02(this, str, 1, i)) {
            this.A00.markerAnnotate(i, str, i2);
        }
    }

    public void markerAnnotate(int i, String str, long j) {
        if (!A02(this, str, 1, i)) {
            this.A00.markerAnnotate(i, str, j);
        }
    }

    public void markerAnnotate(int i, String str, String str2) {
        C18070vi.A0j(str, str2);
        if (!A01(this, i)) {
            this.A00.markerAnnotate(i, str, str2);
        }
    }

    public void markerAnnotate(int i, String str, boolean z) {
        if (!A02(this, str, 1, i)) {
            this.A00.markerAnnotate(i, str, z);
        }
    }

    public void markerAnnotate(int i, String str, double[] dArr) {
        C18070vi.A0j(str, dArr);
        if (!A01(this, i)) {
            this.A00.markerAnnotate(i, str, dArr);
        }
    }

    public void markerAnnotate(int i, String str, int[] iArr) {
        C18070vi.A0j(str, iArr);
        if (!A01(this, i)) {
            this.A00.markerAnnotate(i, str, iArr);
        }
    }

    public void markerAnnotate(int i, String str, long[] jArr) {
        C18070vi.A0j(str, jArr);
        if (!A01(this, i)) {
            this.A00.markerAnnotate(i, str, jArr);
        }
    }

    public void markerAnnotate(int i, String str, String[] strArr) {
        C18070vi.A0j(str, strArr);
        if (!A01(this, i)) {
            this.A00.markerAnnotate(i, str, strArr);
        }
    }

    public void markerAnnotate(int i, String str, boolean[] zArr) {
        C18070vi.A0j(str, zArr);
        if (!A01(this, i)) {
            this.A00.markerAnnotate(i, str, zArr);
        }
    }

    public void markerPoint(int i, int i2, String str) {
        if (!A02(this, str, 2, i)) {
            this.A00.markerPoint(i, i2, str);
        }
    }

    public void markerPoint(int i, int i2, String str, long j, TimeUnit timeUnit) {
        String str2 = str;
        C18070vi.A0d(str, 2);
        int i3 = i;
        TimeUnit timeUnit2 = timeUnit;
        if (!A02(this, timeUnit, 4, i)) {
            this.A00.markerPoint(i3, i2, str2, A00(j, timeUnit), timeUnit2);
        }
    }

    public void markerPoint(int i, int i2, String str, String str2) {
        if (!A02(this, str, 2, i)) {
            this.A00.markerPoint(i, i2, str, str2);
        }
    }

    public void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
        String str3 = str;
        C18070vi.A0d(str, 2);
        int i3 = i;
        TimeUnit timeUnit2 = timeUnit;
        if (!A02(this, timeUnit, 5, i)) {
            this.A00.markerPoint(i3, i2, str3, str2, A00(j, timeUnit), timeUnit2);
        }
    }

    public void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit, int i3) {
        C18070vi.A0g(str, 2, timeUnit);
        markerPoint(i, i2, str, str2, j, timeUnit);
    }

    public void markerPoint(int i, String str) {
        if (!A02(this, str, 1, i)) {
            this.A00.markerPoint(i, str);
        }
    }

    public void markerPoint(int i, String str, long j, TimeUnit timeUnit) {
        String str2 = str;
        C18070vi.A0d(str, 1);
        int i2 = i;
        TimeUnit timeUnit2 = timeUnit;
        if (!A02(this, timeUnit, 3, i)) {
            this.A00.markerPoint(i2, str2, A00(j, timeUnit), timeUnit2);
        }
    }

    public void markerPoint(int i, String str, String str2) {
        if (!A02(this, str, 1, i)) {
            this.A00.markerPoint(i, str, str2);
        }
    }

    public void markerPoint(int i, String str, String str2, long j, TimeUnit timeUnit) {
        String str3 = str;
        C18070vi.A0d(str, 1);
        int i2 = i;
        TimeUnit timeUnit2 = timeUnit;
        if (!A02(this, timeUnit, 4, i)) {
            this.A00.markerPoint(i2, str3, str2, A00(j, timeUnit), timeUnit2);
        }
    }

    public C65312wC() {
    }

    public boolean isMarkerOn(int i, int i2, boolean z) {
        return this.A00.A01.isMarkerOn(i, i2);
    }

    public EventBuilder markEventBuilder(int i, int i2, String str) {
        int i3 = i;
        String str2 = str;
        if (!A02(this, str, 2, i)) {
            return new C65302wB(this.A04, this, Integer.valueOf(i2), str2, i3);
        }
        C20378AIo aIo = C20378AIo.A00;
        C18070vi.A0Z(aIo);
        return aIo;
    }

    public void markerAnnotateCrucialForUserFlow(int i, int i2, String str, String str2) {
        C18070vi.A0k(str, str2);
        markerAnnotate(i, i2, str, str2);
    }

    public void markerDrop(int i, int i2) {
        if (!A01(this, i)) {
            this.A00.markerDrop(i, i2);
        }
    }

    public void markerEnd(int i, int i2, short s, long j, TimeUnit timeUnit) {
        int i3 = i;
        TimeUnit timeUnit2 = timeUnit;
        if (!A02(this, timeUnit, 4, i)) {
            this.A00.markerEnd(i3, i2, s, A00(j, timeUnit), timeUnit2);
        }
    }

    public void markerEndForUserFlow(int i, int i2, short s) {
        markerEndForUserFlow(i, (String) null, i2, s);
    }

    public void markerStart(int i, String str, String str2, long j, TimeUnit timeUnit) {
        String str3 = str;
        String str4 = str2;
        C18070vi.A0j(str, str2);
        int i2 = i;
        TimeUnit timeUnit2 = timeUnit;
        if (!A02(this, timeUnit, 4, i)) {
            this.A00.markerStart(i2, str3, str4, A00(j, timeUnit), timeUnit2);
        }
    }

    public void markerStartForUserFlow(int i, int i2, long j, TimeUnit timeUnit, boolean z) {
        int i3 = i;
        TimeUnit timeUnit2 = timeUnit;
        if (!A02(this, timeUnit, 3, i)) {
            boolean z2 = z;
            this.A00.markerStartWithCancelPolicy(i3, z2, i2, A00(j, timeUnit), timeUnit2);
        }
    }

    public void markerStartWithCancelPolicy(int i, boolean z, int i2, long j, TimeUnit timeUnit) {
        int i3 = i;
        TimeUnit timeUnit2 = timeUnit;
        if (!A02(this, timeUnit, 4, i)) {
            this.A00.markerStartWithCancelPolicy(i3, z, i2, A00(j, timeUnit), timeUnit2);
        }
    }

    public void markerTag(int i, int i2, String str) {
        C18070vi.A0d(str, 2);
        A03(Integer.valueOf(i));
    }

    public MarkerEditor withMarker(int i, int i2) {
        if (!A01(this, i)) {
            return new AnonymousClass2A6(this.A04, this, Integer.valueOf(i2), i);
        }
        AnonymousClass8QW r0 = AnonymousClass8QW.A00;
        C18070vi.A0Z(r0);
        return r0;
    }

    public boolean isMarkerOn(int i, boolean z) {
        return this.A00.A01.BfT(i);
    }

    public void markerEnd(int i, int i2, short s) {
        if (!A01(this, i)) {
            this.A00.markerEnd(i, i2, s);
        }
    }

    public void markerStart(int i, String str, String str2) {
        C18070vi.A0j(str, str2);
        if (!A01(this, i)) {
            this.A00.markerStart(i, str, str2);
        }
    }

    public void markerStartWithCancelPolicy(int i, boolean z, int i2) {
        if (!A01(this, i)) {
            this.A00.Bj1(i, i2, z);
        }
    }

    public void markerStartForUserFlow(int i, int i2, String str, boolean z, long j, long j2, TimeUnit timeUnit) {
        C18070vi.A0d(str, 2);
        int i3 = i;
        TimeUnit timeUnit2 = timeUnit;
        if (!A02(this, timeUnit2, 6, i)) {
            boolean z2 = z;
            this.A00.markerStartWithCancelPolicy(i3, z2, i2, A00(j2, timeUnit2), timeUnit2);
        }
    }

    public void markerEnd(int i, short s) {
        if (!A01(this, i)) {
            this.A00.markerEnd(i, s);
        }
    }

    public void markerStart(int i, int i2, long j, TimeUnit timeUnit) {
        int i3 = i;
        TimeUnit timeUnit2 = timeUnit;
        if (!A02(this, timeUnit, 3, i)) {
            this.A00.markerStartWithCancelPolicy(i3, true, i2, A00(j, timeUnit), timeUnit2);
        }
    }

    public void markerStartForUserFlow(int i, int i2, String str, boolean z, long j) {
        if (!A01(this, i)) {
            this.A00.Bj1(i, i2, z);
        }
    }

    public void markerStart(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
        String str3 = str;
        String str4 = str2;
        C18070vi.A0k(str, str2);
        int i3 = i;
        TimeUnit timeUnit2 = timeUnit;
        if (!A02(this, timeUnit, 5, i)) {
            this.A00.markerStart(i3, i2, str3, str4, A00(j, timeUnit), timeUnit2);
        }
    }

    public void markerStart(int i, int i2, String str, String str2) {
        C18070vi.A0k(str, str2);
        if (!A01(this, i)) {
            this.A00.markerStart(i, i2, str, str2);
        }
    }

    public void markerStart(int i, int i2, long j, TimeUnit timeUnit, int i3) {
        C18070vi.A0d(timeUnit, 3);
        markerStart(i, i2, j, timeUnit);
    }

    public void markerStart(int i, int i2) {
        if (!A01(this, i)) {
            this.A00.markerStart(i, i2);
        }
    }
}
