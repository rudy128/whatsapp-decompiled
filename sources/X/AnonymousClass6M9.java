package X;

import android.content.Intent;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.Collection;

/* renamed from: X.6M9  reason: invalid class name */
public final class AnonymousClass6M9 extends A34 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03 = SystemClock.elapsedRealtime();
    public final long A04;
    public final AnonymousClass1KB A05;
    public final C25001Mm A06;
    public final C41911xI A07;
    public final C19830z4 A08;
    public final AnonymousClass1RS A09;
    public final C24661Le A0A;
    public final C18030ve A0B;
    public final C32741hg A0C;
    public final WeakReference A0D;
    public final Collection A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r6 != 3) goto L_0x0020;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0G(java.lang.Object[] r8) {
        /*
            r7 = this;
            X.1Le r0 = r7.A0A
            int r6 = r7.A00
            java.util.Collection r5 = r7.A0E
            r0.A0G(r5, r6)
            X.1xI r0 = r7.A07
            r0.A02()
            X.1hg r4 = r7.A0C
            X.625 r3 = new X.625
            r3.<init>()
            r2 = 1
            if (r6 == 0) goto L_0x0066
            r1 = 3
            if (r6 == r2) goto L_0x0061
            r0 = 2
            if (r6 == r0) goto L_0x006b
            if (r6 == r1) goto L_0x0066
        L_0x0020:
            X.18K r0 = r4.A0C
            r0.CC7(r3)
            X.1Mm r1 = r7.A06
            com.whatsapp.jobqueue.job.SendStatusPrivacyListJob r0 = new com.whatsapp.jobqueue.job.SendStatusPrivacyListJob
            r0.<init>(r5, r6)
            r1.A01(r0)
            X.0z4 r0 = r7.A08
            r0.A16()
            long r2 = r7.A03
            long r0 = r7.A04
            X.AnonymousClass1FU.A0X(r2, r0)
            boolean r0 = r7.A0I
            if (r0 == 0) goto L_0x0099
            X.0ve r2 = r7.A0B
            r0 = 7906(0x1ee2, float:1.1079E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0055
            X.1RS r5 = r7.A09
            r4 = 1
        L_0x004e:
            X.1Cd r0 = r5.A05
            X.1au r3 = r0.A05()
            goto L_0x0072
        L_0x0055:
            r0 = 7905(0x1ee1, float:1.1077E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0099
            X.1RS r5 = r7.A09
            r4 = 0
            goto L_0x004e
        L_0x0061:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x006f
        L_0x0066:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x006f
        L_0x006b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x006f:
            r3.A00 = r0
            goto L_0x0020
        L_0x0072:
            X.1xA r2 = r3.BD0()     // Catch:{ all -> 0x008c }
            r1 = 0
            r0 = 0
            r5.A02(r1, r0, r4)     // Catch:{ all -> 0x0082 }
            r2.A00()     // Catch:{ all -> 0x0082 }
            r2.close()     // Catch:{ all -> 0x008c }
            goto L_0x0096
        L_0x0082:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0087 }
            goto L_0x008b
        L_0x0087:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x008c }
        L_0x008b:
            throw r1     // Catch:{ all -> 0x008c }
        L_0x008c:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0091 }
            throw r1
        L_0x0091:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x0096:
            r3.close()
        L_0x0099:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6M9.A0G(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        AnonymousClass1FU A0Z = C108945cZ.A0Z(this.A0D);
        if (A0Z != null && !A0Z.Bed()) {
            if (this.A0G) {
                A0Z.CEx();
            }
            int i = this.A02;
            if (i != -1) {
                this.A05.A08(this.A01, i);
            }
            if (this.A0H) {
                Intent intent = A0Z.getIntent();
                C18070vi.A0X(intent);
                A0Z.setResult(-1, C123626Ve.A00(intent));
            }
            if (this.A0F) {
                A0Z.finish();
            }
        } else if (this.A0G) {
            this.A05.A04();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6M9(AnonymousClass1FU r3, AnonymousClass1KB r4, C25001Mm r5, C41911xI r6, AnonymousClass11P r7, C19830z4 r8, AnonymousClass1RS r9, C24661Le r10, C18030ve r11, C32741hg r12, Collection collection, int i, int i2, int i3, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(r3, z3);
        C18070vi.A0w(r3, r7, r11, r4, r10);
        C18070vi.A0x(r5, r6, r12, r8, r9);
        this.A0B = r11;
        this.A05 = r4;
        this.A0A = r10;
        this.A06 = r5;
        this.A07 = r6;
        this.A0C = r12;
        this.A08 = r8;
        this.A09 = r9;
        this.A00 = i;
        this.A0E = collection;
        this.A04 = j;
        this.A0G = z;
        this.A0H = z2;
        this.A02 = i2;
        this.A01 = i3;
        this.A0F = z4;
        this.A0I = z5;
        this.A0D = AnonymousClass3MW.A0z(r3);
    }
}
