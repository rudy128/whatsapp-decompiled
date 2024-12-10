package X;

import android.app.Activity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.7Ir  reason: invalid class name and case insensitive filesystem */
public class C144787Ir implements BC9 {
    public WeakReference A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass1NM A02;
    public final AnonymousClass11Z A03;
    public final C24921Me A04;
    public final AnonymousClass1E7 A05;
    public final AnonymousClass18K A06;

    public /* synthetic */ void BsA(long j) {
    }

    public void BsC(boolean z) {
        this.A00 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00dd, code lost:
        if (X.C22971Dz.A0V(r0.A0J) == false) goto L_0x00df;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C1409173o r9) {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.AnonymousClass68K
            if (r0 == 0) goto L_0x0060
            r4 = 2131894783(0x7f1221ff, float:1.942438E38)
            java.lang.ref.WeakReference r0 = r8.A00
            if (r0 == 0) goto L_0x00e6
            java.lang.Object r7 = r0.get()
            android.app.Activity r7 = (android.app.Activity) r7
            if (r7 == 0) goto L_0x00e6
            boolean r0 = X.AnonymousClass4Yv.A02(r7)
            if (r0 != 0) goto L_0x00e6
            X.1KB r6 = r8.A01
            X.1FR r0 = r6.A00
            if (r0 != r7) goto L_0x00e6
            int r5 = r9.A01
            r0 = 9
            r3 = 0
            if (r5 != r0) goto L_0x003e
            X.1NM r2 = r8.A02
            X.11Z r1 = r8.A03
            X.7Ek r0 = new X.7Ek
            r0.<init>(r7, r6, r1)
            boolean r0 = r2.A04(r0)
            if (r0 == 0) goto L_0x003d
        L_0x0035:
            r1 = 2131897256(0x7f122ba8, float:1.9429396E38)
        L_0x0038:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r8.A01(r0, r5, r4, r1)
        L_0x003d:
            return
        L_0x003e:
            r0 = 4
            if (r5 != r0) goto L_0x004e
            boolean r0 = X.AnonymousClass11Z.A00()
            r1 = 2131891424(0x7f1214e0, float:1.9417568E38)
            if (r0 == 0) goto L_0x0038
            r1 = 2131891423(0x7f1214df, float:1.9417566E38)
            goto L_0x0038
        L_0x004e:
            r0 = 5
            if (r5 != r0) goto L_0x0055
            r1 = 2131894784(0x7f122200, float:1.9424383E38)
            goto L_0x0038
        L_0x0055:
            r0 = 8
            if (r5 == r0) goto L_0x005c
            r0 = -1
            if (r5 != r0) goto L_0x0035
        L_0x005c:
            r1 = 2131891449(0x7f1214f9, float:1.9417618E38)
            goto L_0x0038
        L_0x0060:
            java.lang.ref.WeakReference r0 = r8.A00
            if (r0 == 0) goto L_0x00e3
            java.lang.Object r6 = r0.get()
            android.app.Activity r6 = (android.app.Activity) r6
            if (r6 == 0) goto L_0x00e3
            boolean r0 = X.AnonymousClass4Yv.A02(r6)
            if (r0 != 0) goto L_0x00e3
            X.1KB r3 = r8.A01
            X.1FR r0 = r3.A00
            if (r0 != r6) goto L_0x00e3
            int r5 = r9.A01
            r0 = 9
            r4 = 0
            if (r5 != r0) goto L_0x009a
            X.1NM r2 = r8.A02
            X.11Z r1 = r8.A03
            X.7Ek r0 = new X.7Ek
            r0.<init>(r6, r3, r1)
            boolean r0 = r2.A04(r0)
            if (r0 == 0) goto L_0x003d
        L_0x008e:
            r6 = 2131889562(0x7f120d9a, float:1.9413791E38)
            r3 = 2131897255(0x7f122ba7, float:1.9429394E38)
        L_0x0094:
            java.lang.Object[] r2 = new java.lang.Object[r4]
        L_0x0096:
            r8.A01(r2, r5, r6, r3)
            return
        L_0x009a:
            r0 = 4
            if (r5 != r0) goto L_0x00a4
            r6 = 2131889562(0x7f120d9a, float:1.9413791E38)
            r3 = 2131891426(0x7f1214e2, float:1.9417572E38)
            goto L_0x0094
        L_0x00a4:
            r0 = 5
            if (r5 != r0) goto L_0x00c6
            X.1E7 r1 = r8.A05
            r6 = 2131889562(0x7f120d9a, float:1.9413791E38)
            if (r1 == 0) goto L_0x00df
            X.1BI r0 = r1.A0J
            boolean r0 = X.C22971Dz.A0V(r0)
            r3 = 2131896939(0x7f122a6b, float:1.9428753E38)
            if (r0 == 0) goto L_0x00bc
            r3 = 2131892887(0x7f121a97, float:1.9420535E38)
        L_0x00bc:
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1a()
            X.1Me r0 = r8.A04
            X.AnonymousClass3MX.A1N(r0, r1, r2, r4)
            goto L_0x0096
        L_0x00c6:
            r0 = 8
            if (r5 == r0) goto L_0x00cd
            r0 = -1
            if (r5 != r0) goto L_0x008e
        L_0x00cd:
            r6 = 2131889562(0x7f120d9a, float:1.9413791E38)
            X.1E7 r0 = r8.A05
            if (r0 == 0) goto L_0x00df
            X.1BI r0 = r0.A0J
            boolean r0 = X.C22971Dz.A0V(r0)
            r3 = 2131892887(0x7f121a97, float:1.9420535E38)
            if (r0 != 0) goto L_0x0094
        L_0x00df:
            r3 = 2131891448(0x7f1214f8, float:1.9417616E38)
            goto L_0x0094
        L_0x00e3:
            java.lang.String r0 = "BaseDownloadListener/notifyUserOfResult/skip"
            goto L_0x00e8
        L_0x00e6:
            java.lang.String r0 = "productdownloadlistener/notifyuser/skip"
        L_0x00e8:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C144787Ir.A00(X.73o):void");
    }

    public void A01(Object[] objArr, int i, int i2, int i3) {
        Activity activity;
        WeakReference weakReference = this.A00;
        if (weakReference == null || (activity = (Activity) weakReference.get()) == null || AnonymousClass4Yv.A02(activity) || this.A01.A00 != activity) {
            Log.i("BaseDownloadListener/showErrorDialog/skip");
            return;
        }
        C17960vV.A07(activity);
        AnonymousClass1FR r3 = (AnonymousClass1FR) activity;
        Object[] objArr2 = objArr;
        int i4 = i2;
        int i5 = i3;
        if (i == 4) {
            r3.BhT(new C142967Bm(activity, C83974Hj.A00(this.A06, 4), 4), objArr2, i4, i5, 2131891847);
        } else {
            r3.BhU(objArr, i2, i3);
        }
    }

    public C144787Ir(Activity activity, AnonymousClass1KB r3, C24921Me r4, AnonymousClass1NM r5, AnonymousClass11Z r6, AnonymousClass1E7 r7, AnonymousClass18K r8) {
        this.A01 = r3;
        this.A06 = r8;
        this.A03 = r6;
        this.A04 = r4;
        this.A02 = r5;
        this.A00 = AnonymousClass3MW.A0z(activity);
        this.A05 = r7;
    }

    public void BsD(C1409173o r2, C136996uk r3) {
        if (!r2.A03()) {
            A00(r2);
            this.A00 = null;
        }
    }
}
