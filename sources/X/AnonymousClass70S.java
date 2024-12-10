package X;

import android.os.SystemClock;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.HashSet;

/* renamed from: X.70S  reason: invalid class name */
public class AnonymousClass70S {
    public static final C18180vt A07 = new C18180vt(1, 10);
    public long A00 = -1;
    public final AnonymousClass64V A01;
    public final HashSet A02 = C17880vN.A12();
    public final HashSet A03 = C17880vN.A12();
    public final long A04;
    public final C18030ve A05;
    public final AnonymousClass18K A06;

    public void A00() {
        AnonymousClass64V r4 = this.A01;
        r4.A0Q = C108945cZ.A1B(SystemClock.uptimeMillis(), this.A04);
        this.A00 = SystemClock.uptimeMillis();
        r4.A05 = AnonymousClass000.A0h();
    }

    public void A01() {
        long j = this.A00;
        C17960vV.A0D(AnonymousClass000.A1R((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        AnonymousClass64V r4 = this.A01;
        r4.A03 = false;
        r4.A0d = C108945cZ.A1B(SystemClock.uptimeMillis(), j);
        r4.A0c = C108945cZ.A1B(SystemClock.uptimeMillis(), this.A04);
        r4.A0f = AnonymousClass2SU.A00(", ", this.A03);
        r4.A0e = AnonymousClass2SU.A00(", ", this.A02);
        this.A06.CC6(r4, A07);
    }

    public void A02() {
        float f;
        Long l;
        long j = this.A00;
        C17960vV.A0D(AnonymousClass000.A1R((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        AnonymousClass64V r4 = this.A01;
        r4.A0d = C108945cZ.A1B(SystemClock.uptimeMillis(), j);
        Long l2 = r4.A0W;
        if (!(l2 == null || (l = r4.A0J) == null)) {
            long longValue = l2.longValue();
            if (longValue > 0) {
                f = ((float) l.longValue()) / ((float) longValue);
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("mediatranscodequeue/srcLength");
                A10.append(l2);
                A10.append(" destinationSize=");
                A10.append(r4.A0J);
                A10.append(" compressionRate=");
                A10.append(f);
                A10.append(" duration=");
                A10.append(r4.A0d);
                A10.append(" width=");
                A10.append(r4.A0K);
                A10.append(" height=");
                A10.append(r4.A0I);
                A10.append(" isProgressiveJpeg=");
                A10.append(r4.A00);
                A10.append(" firstScanLength=");
                A10.append(r4.A0L);
                A10.append(" thumbnailLength=");
                C17900vP.A0b(r4.A0b, A10);
                r4.A03 = true;
                r4.A0c = C108945cZ.A1B(SystemClock.uptimeMillis(), this.A04);
                r4.A0f = AnonymousClass2SU.A00(", ", this.A03);
                r4.A0e = AnonymousClass2SU.A00(", ", this.A02);
                this.A06.CC7(r4);
            }
        }
        f = 0.0f;
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("mediatranscodequeue/srcLength");
        A102.append(l2);
        A102.append(" destinationSize=");
        A102.append(r4.A0J);
        A102.append(" compressionRate=");
        A102.append(f);
        A102.append(" duration=");
        A102.append(r4.A0d);
        A102.append(" width=");
        A102.append(r4.A0K);
        A102.append(" height=");
        A102.append(r4.A0I);
        A102.append(" isProgressiveJpeg=");
        A102.append(r4.A00);
        A102.append(" firstScanLength=");
        A102.append(r4.A0L);
        A102.append(" thumbnailLength=");
        C17900vP.A0b(r4.A0b, A102);
        r4.A03 = true;
        r4.A0c = C108945cZ.A1B(SystemClock.uptimeMillis(), this.A04);
        r4.A0f = AnonymousClass2SU.A00(", ", this.A03);
        r4.A0e = AnonymousClass2SU.A00(", ", this.A02);
        this.A06.CC7(r4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r5 != 4) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(int r5) {
        /*
            r4 = this;
            X.64V r3 = r4.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r3.A0B = r0
            r2 = 1
            if (r5 == r2) goto L_0x0014
            r1 = 2
            if (r5 == r1) goto L_0x0020
            r0 = 3
            if (r5 == r0) goto L_0x001b
            r0 = 4
            if (r5 == r0) goto L_0x0020
        L_0x0014:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
        L_0x0018:
            r3.A08 = r0
            return
        L_0x001b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0018
        L_0x0020:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass70S.A03(int):void");
    }

    public void A04(int i, int i2) {
        AnonymousClass64V r1 = this.A01;
        r1.A0K = C17880vN.A0n(i);
        r1.A0I = C17880vN.A0n(i2);
    }

    public void A05(long j) {
        this.A01.A0J = Long.valueOf(j);
    }

    public void A06(long j) {
        this.A01.A0b = Long.valueOf(j);
    }

    public void A07(C1405471x r6) {
        AnonymousClass64V r4 = this.A01;
        r4.A0X = C17880vN.A0n(r6.A02);
        r4.A0V = C17880vN.A0n(r6.A00);
        r4.A0S = Long.valueOf(((long) r6.A01()) / 1000);
        r4.A0T = Long.valueOf(r6.A03 / 1000);
    }

    public void A09(boolean z) {
        this.A01.A00 = Boolean.valueOf(z);
    }

    public AnonymousClass70S(C18030ve r3, AnonymousClass18K r4, Integer num, int i) {
        this.A06 = r4;
        this.A05 = r3;
        AnonymousClass64V r1 = new AnonymousClass64V();
        this.A01 = r1;
        r1.A0D = C17880vN.A0n(i);
        if (num != null) {
            r1.A0C = num;
        }
        this.A04 = SystemClock.uptimeMillis();
    }

    public void A08(String str) {
        int length = str.length();
        AnonymousClass64V r1 = this.A01;
        if (length > 10000) {
            str = str.substring(0, SearchActionVerificationClientService.NOTIFICATION_ID);
        }
        r1.A0h = str;
    }
}
