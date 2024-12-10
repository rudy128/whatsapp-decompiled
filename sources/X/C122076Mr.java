package X;

import android.app.Activity;
import android.net.Uri;

/* renamed from: X.6Mr  reason: invalid class name and case insensitive filesystem */
public class C122076Mr extends AnonymousClass70X {
    public int A00;
    public int A01 = 0;
    public long A02;
    public Uri A03 = null;
    public Uri A04 = new Uri.Builder().build();
    public E41 A05;
    public C26378Cye A06;
    public C28613EAh A07;
    public C18030ve A08;
    public C135056ra A09;
    public AnonymousClass88T A0A;
    public C86024Pw A0B = null;
    public C121996Mj A0C;
    public String A0D = null;
    public boolean A0E;
    public boolean A0F = false;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S = false;
    public final C28606E9x A0T = new AnonymousClass7BC(this);
    public final C26204Cub A0U;
    public final C27066DRp A0V;
    public final AnonymousClass190 A0W;
    public final AnonymousClass1KB A0X;
    public final AnonymousClass6gC A0Y;
    public final AnonymousClass10I A0Z;
    public final C122126Mw A0a;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (r12.A0S == false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C122076Mr r12) {
        /*
            X.Cye r0 = r12.A06
            if (r0 != 0) goto L_0x0093
            X.6gC r2 = r12.A0Y
            X.0vl r0 = r2.A02
            boolean r1 = X.C72453Mb.A1a(r0)
            java.util.concurrent.atomic.AtomicLong r0 = X.C26378Cye.A0U
            X.Cub r4 = r12.A0U
            if (r1 == 0) goto L_0x00d2
            X.0vl r0 = r2.A00
            java.lang.Object r3 = r0.getValue()
            android.os.Looper r3 = (android.os.Looper) r3
            X.7B9 r1 = new X.7B9
            r1.<init>(r12)
            X.DRp r0 = r12.A0V
            X.Cye r2 = new X.Cye
            r2.<init>(r3, r1, r4, r0)
        L_0x0026:
            r12.A06 = r2
            X.4Pw r0 = r12.A0B
            if (r0 == 0) goto L_0x00ce
            boolean r10 = r0.A00()
            r11 = 1
        L_0x0031:
            android.net.Uri r4 = r12.A04
            android.net.Uri r5 = r12.A03
            boolean r0 = r12.A0D
            if (r0 == 0) goto L_0x003e
            boolean r0 = r12.A0S
            r8 = 1
            if (r0 != 0) goto L_0x003f
        L_0x003e:
            r8 = 0
        L_0x003f:
            int r7 = r12.A00
            boolean r9 = r12.A0F
            r3 = 0
            java.lang.String r6 = r12.A0D
            X.CbZ r1 = X.C137696vs.A00(r4, r5, r6, r7, r8, r9, r10, r11)
            X.E41 r0 = r12.A05
            if (r0 == 0) goto L_0x0050
            r1.A02 = r0
        L_0x0050:
            X.Cye r0 = r12.A06
            r0.A0I(r1)
            X.Cye r1 = r12.A06
            boolean r0 = r12.A0N
            float r0 = X.C108975cc.A00(r0)
            r1.A0F(r0)
            X.Cye r0 = r12.A06
            X.E9x r2 = r12.A0T
            android.os.Handler r1 = r0.A0C
            r0 = 44
            X.C108955ca.A1F(r1, r2, r0)
            X.6Mw r1 = r12.A0a
            X.Cye r0 = r12.A06
            r1.setPlayer(r0)
            boolean r0 = r12.A0F
            if (r0 == 0) goto L_0x009c
            long r2 = r12.A02
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0094
            X.Cye r0 = r12.A06
            r0.A0E()
        L_0x0086:
            X.EAh r1 = r12.A07
            if (r1 == 0) goto L_0x0093
            X.Cye r0 = r12.A06
            X.DGH r0 = r0.A0E
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A00
            r0.add(r1)
        L_0x0093:
            return
        L_0x0094:
            X.Cye r1 = r12.A06
            int r0 = r12.A00
            r1.A0G(r0, r2)
            goto L_0x0086
        L_0x009c:
            android.util.Pair r1 = r12.A04
            if (r1 == 0) goto L_0x0086
            java.lang.Object r0 = r1.first
            java.lang.Number r0 = (java.lang.Number) r0
            java.lang.Object r5 = r1.second
            java.lang.Number r5 = (java.lang.Number) r5
            if (r0 == 0) goto L_0x00bd
            int r4 = r0.intValue()
            if (r4 < 0) goto L_0x00bd
            X.Cye r2 = r12.A06
            int r0 = r5.intValue()
            long r0 = (long) r0
            r2.A0G(r4, r0)
        L_0x00ba:
            r12.A04 = r3
            goto L_0x0086
        L_0x00bd:
            if (r5 == 0) goto L_0x00ba
            int r2 = r5.intValue()
            if (r2 < 0) goto L_0x00ba
            X.Cye r1 = r12.A06
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            X.C109005cf.A0U(r1, r5, r0, r2)
            goto L_0x00ba
        L_0x00ce:
            r10 = 0
            r11 = 0
            goto L_0x0031
        L_0x00d2:
            X.7B9 r1 = new X.7B9
            r1.<init>(r12)
            X.DRp r0 = r12.A0V
            X.Cye r2 = new X.Cye
            r2.<init>(r1, r4, r0)
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122076Mr.A00(X.6Mr):void");
    }

    public void A0f(C142837Az r2) {
        r2.A00 = new C131776le(this);
        this.A05 = r2;
    }

    public C122076Mr(Activity activity, AnonymousClass190 r6, AnonymousClass1KB r7, AnonymousClass11C r8, AnonymousClass118 r9, C18030ve r10, AnonymousClass6gC r11, AnonymousClass10I r12, C135056ra r13, int i, boolean z) {
        this.A0W = r6;
        this.A08 = r10;
        this.A0X = r7;
        this.A05 = r8;
        this.A02 = activity;
        C27066DRp dRp = (C27066DRp) AnonymousClass3MX.A14(r11.A01);
        this.A0V = dRp;
        this.A0Y = r11;
        C122126Mw r0 = new C122126Mw(activity, r7, r10, z);
        this.A0a = r0;
        r0.setLayoutResizeMode(i);
        this.A09 = r13;
        this.A0Z = r12;
        this.A0U = C26204Cub.A01(r9.A00, dRp, C28620EAs.A00, C17880vN.A11());
    }

    public static void A01(C122076Mr r2, Integer num, String str, String str2, boolean z) {
        C17900vP.A0e("WaHeroPlayer/onError=", str, AnonymousClass000.A10());
        AnonymousClass88Q r0 = r2.A09;
        if (r0 != null) {
            r0.BtC(str, str2, z);
        }
        C135056ra r02 = r2.A09;
        if (r02 != null) {
            r02.A01(num);
        }
    }
}
