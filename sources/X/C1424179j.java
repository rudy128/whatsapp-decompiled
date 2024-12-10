package X;

import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.whatsapp.updates.ui.UpdatesFragment;
import com.whatsapp.updates.viewmodels.UpdatesViewModel;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.79j  reason: invalid class name and case insensitive filesystem */
public final class C1424179j implements AnonymousClass02H {
    public MenuItem A00;
    public MenuItem A01;
    public MenuItem A02;
    public MenuItem A03;
    public MenuItem A04;
    public MenuItem A05;
    public MenuItem A06;
    public MenuItem A07;
    public MenuItem A08;
    public MenuItem A09;
    public MenuItem A0A;
    public AnonymousClass02B A0B;
    public UpdatesFragment A0C;
    public AnonymousClass7K9 A0D;
    public boolean A0E;
    public final AnonymousClass70D A0F;
    public final WeakReference A0G;
    public final C34111jw A0H;
    public final C18000vb A0I;

    public C1424179j(Fragment fragment, C18000vb r6, UpdatesFragment updatesFragment, AnonymousClass7K9 r8, AnonymousClass70D r9) {
        AnonymousClass1FL A1B;
        C18070vi.A0g(r6, 4, r9);
        this.A0D = r8;
        this.A0C = updatesFragment;
        this.A0I = r6;
        this.A0F = r9;
        WeakReference A0z = AnonymousClass3MW.A0z(fragment);
        this.A0G = A0z;
        Fragment fragment2 = (Fragment) A0z.get();
        if (!(fragment2 == null || (A1B = fragment2.A1B()) == null)) {
            AnonymousClass7AS.A00(A1B, r9.A01, new AnonymousClass81Y(this), 27);
        }
        this.A0H = new C34111jw();
    }

    public boolean BqR(Menu menu, AnonymousClass02B r13) {
        long j;
        String str;
        String str2;
        AnonymousClass1FL A1B;
        AnonymousClass1FL A1B2;
        if (menu != null) {
            C137526vb.A00(menu);
        }
        this.A0B = r13;
        C34111jw r2 = this.A0H;
        r2.A00.clear();
        Set set = (Set) this.A0F.A01.A06();
        if (set != null) {
            j = (long) set.size();
        } else {
            j = 1;
        }
        if (menu != null) {
            MenuItem add = menu.add(0, 2131432625, 0, (CharSequence) null);
            add.setShowAsAction(2);
            add.setIcon(2131233226);
            WeakReference weakReference = this.A0G;
            Fragment fragment = (Fragment) weakReference.get();
            if (fragment == null || (A1B2 = fragment.A1B()) == null) {
                str = "";
            } else {
                str = C18070vi.A0F(A1B2, 2131892500);
            }
            add.setTitle(str);
            this.A07 = add;
            MenuItem add2 = menu.add(0, 2131432554, 0, (CharSequence) null);
            add2.setShowAsAction(2);
            add2.setIcon(2131231847);
            Fragment fragment2 = (Fragment) weakReference.get();
            if (fragment2 == null || (A1B = fragment2.A1B()) == null) {
                str2 = "";
            } else {
                str2 = C18070vi.A0F(A1B, 2131889323);
            }
            add2.setTitle(str2);
            this.A00 = add2;
            MenuItem add3 = menu.add(0, 2131432563, 0, (CharSequence) null);
            add3.setShowAsAction(2);
            add3.setIcon(2131232146);
            add3.setTitle(A00(j, 2131755248));
            this.A03 = add3;
            MenuItem add4 = menu.add(0, 2131432573, 0, (CharSequence) null);
            add4.setShowAsAction(2);
            add4.setIcon(2131232147);
            add4.setTitle(A00(j, 2131755467));
            this.A09 = add4;
            MenuItem add5 = menu.add(0, 2131432566, 0, (CharSequence) null);
            add5.setShowAsAction(2);
            add5.setIcon(2131232229);
            add5.setTitle(A00(j, 2131755337));
            this.A05 = add5;
            MenuItem add6 = menu.add(0, 2131432574, 0, (CharSequence) null);
            add6.setShowAsAction(2);
            add6.setIcon(2131231643);
            add6.setTitle(A00(j, 2131755468));
            this.A0A = add6;
            MenuItem add7 = menu.add(0, 2131432560, 0, 2131891882);
            add7.setShowAsAction(8);
            add7.setIcon(2131232236);
            this.A01 = add7;
            MenuItem add8 = menu.add(0, 2131432561, 0, 2131891883);
            add8.setShowAsAction(8);
            add8.setIcon(2131232371);
            this.A02 = add8;
            MenuItem add9 = menu.add(0, 2131432621, 0, 2131895596);
            add9.setShowAsAction(8);
            add9.setIcon(2131232223);
            this.A06 = add9;
            MenuItem add10 = menu.add(0, 2131432552, 0, 2131892878);
            add10.setShowAsAction(8);
            add10.setIcon(2131232010);
            this.A04 = add10;
            MenuItem add11 = menu.add(0, 2131432603, 0, 2131897305);
            add11.setShowAsAction(8);
            add11.setIcon(2131232077);
            this.A08 = add11;
        }
        r2.BBi(2131432625);
        r2.BBi(2131432554);
        r2.BBi(2131432563);
        r2.BBi(2131432573);
        r2.BBi(2131432566);
        r2.BBi(2131432574);
        r2.BBp(2131432560);
        r2.BBp(2131432561);
        r2.BBp(2131432621);
        r2.BBp(2131432552);
        r2.BBp(2131432603);
        return true;
    }

    private final String A00(long j, int i) {
        C18000vb r2 = this.A0I;
        Object[] A1a = AnonymousClass3MW.A1a();
        AnonymousClass3MX.A1S(A1a, 0, j);
        String A0K = r2.A0K(A1a, i, j);
        C18070vi.A0X(A0K);
        return A0K;
    }

    public static final void A01(AnonymousClass02B r3, C1424179j r4, int i) {
        if (r3 != null) {
            Locale A0N = r4.A0I.A0N();
            Object[] A1a = AnonymousClass3MW.A1a();
            C17880vN.A1T(A1a, i, 0);
            r3.A0B(C108955ca.A12(A0N, "%d", Arrays.copyOf(A1a, 1)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011c, code lost:
        r0 = r2.A0F;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Bks(android.view.MenuItem r14, X.AnonymousClass02B r15) {
        /*
            r13 = this;
            X.70D r3 = r13.A0F
            X.1DT r0 = r3.A01
            java.lang.Object r4 = r0.A06()
            java.util.Set r4 = (java.util.Set) r4
            if (r4 != 0) goto L_0x000e
            X.1Om r4 = X.C25511Om.A00
        L_0x000e:
            X.7K9 r2 = r13.A0D
            r12 = 1
            if (r2 == 0) goto L_0x002e
            if (r14 == 0) goto L_0x002e
            int r1 = r14.getItemId()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r0 = 2131432566(0x7f0b1476, float:1.8486893E38)
            if (r5 == 0) goto L_0x002e
            if (r1 != r0) goto L_0x002f
            X.10I r1 = r2.A04
            r0 = 27
        L_0x0028:
            X.AnonymousClass7RD.A00(r1, r4, r2, r0)
        L_0x002b:
            com.whatsapp.updates.viewmodels.UpdatesViewModel.A0A(r2)
        L_0x002e:
            return r12
        L_0x002f:
            r0 = 2131432574(0x7f0b147e, float:1.848691E38)
            if (r1 != r0) goto L_0x0039
            X.10I r1 = r2.A04
            r0 = 26
            goto L_0x0028
        L_0x0039:
            r0 = 2131432554(0x7f0b146a, float:1.8486869E38)
            if (r1 == r0) goto L_0x002b
            r0 = 2131432563(0x7f0b1473, float:1.8486887E38)
            if (r1 != r0) goto L_0x0047
            r2.A05(r4)
            return r12
        L_0x0047:
            r0 = 2131432573(0x7f0b147d, float:1.8486907E38)
            if (r1 != r0) goto L_0x0050
            r2.A06(r4)
            return r12
        L_0x0050:
            r0 = 2131432603(0x7f0b149b, float:1.8486968E38)
            if (r1 != r0) goto L_0x00bd
            java.lang.ref.WeakReference r0 = r2.A0F
            java.lang.Object r9 = r0.get()
            X.1FB r9 = (X.AnonymousClass1FB) r9
            if (r9 == 0) goto L_0x002e
            X.3Rj r8 = X.AnonymousClass4a6.A00(r9)
            android.content.Context r5 = X.C108945cZ.A0F(r0)
            if (r5 != 0) goto L_0x0087
            java.lang.String r0 = ""
        L_0x006b:
            r8.A0S(r0)
            r1 = 2131898766(0x7f12318e, float:1.943246E38)
            r0 = 8
            X.AnonymousClass7AL.A00(r9, r8, r0, r1)
            r3 = 2131897305(0x7f122bd9, float:1.9429496E38)
            r1 = 18
            X.7AH r0 = new X.7AH
            r0.<init>(r4, r2, r1)
            r8.A0g(r9, r0, r3)
            X.AnonymousClass3MY.A1G(r8)
            return r12
        L_0x0087:
            int r0 = r4.size()
            long r0 = (long) r0
            r10 = 1
            r7 = 0
            int r3 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x00a8
            r3 = 2131897309(0x7f122bdd, float:1.9429504E38)
            java.lang.Object[] r1 = new java.lang.Object[r12]
            java.lang.Object r0 = X.C29431cG.A0X(r4)
            X.2Dk r0 = (X.C46162Dk) r0
            java.lang.String r0 = r0.A0T
            java.lang.String r0 = X.C17880vN.A0q(r5, r0, r1, r7, r3)
        L_0x00a4:
            X.C18070vi.A0X(r0)
            goto L_0x006b
        L_0x00a8:
            X.00H r3 = r2.A0E
            java.lang.Object r6 = X.C18070vi.A0E(r3)
            X.0vb r6 = (X.C18000vb) r6
            r5 = 2131755466(0x7f1001ca, float:1.9141812E38)
            java.lang.Object[] r3 = new java.lang.Object[r12]
            X.C17880vN.A1V(r3, r7, r0)
            java.lang.String r0 = r6.A0K(r3, r5, r0)
            goto L_0x00a4
        L_0x00bd:
            r0 = 2131432621(0x7f0b14ad, float:1.8487005E38)
            if (r1 != r0) goto L_0x00f2
            r13.A0E = r12
            com.whatsapp.updates.viewmodels.UpdatesViewModel r6 = r2.A03
            X.1Dg r0 = r6.A0M
            java.lang.Object r0 = r0.A06()
            X.6u6 r0 = (X.C136616u6) r0
            if (r0 == 0) goto L_0x01f6
            java.util.List r0 = r0.A08
            if (r0 == 0) goto L_0x01f6
            X.70D r5 = com.whatsapp.updates.viewmodels.UpdatesViewModel.A00(r6)
            java.util.ArrayList r2 = X.C29351c6.A0D(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x00e0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01cb
            java.lang.Object r0 = r1.next()
            X.6Jh r0 = (X.C121346Jh) r0
            X.2Dk r0 = r0.A0A
            r2.add(r0)
            goto L_0x00e0
        L_0x00f2:
            r0 = 2131432560(0x7f0b1470, float:1.848688E38)
            if (r1 != r0) goto L_0x0102
            r0 = 0
            r3.A00 = r0
            X.10I r1 = r2.A04
            r0 = 28
        L_0x00fe:
            X.AnonymousClass7RD.A00(r1, r2, r4, r0)
            return r12
        L_0x0102:
            r0 = 2131432561(0x7f0b1471, float:1.8486883E38)
            if (r1 != r0) goto L_0x010f
            r0 = 0
            r3.A00 = r0
            X.10I r1 = r2.A04
            r0 = 29
            goto L_0x00fe
        L_0x010f:
            r0 = 2131432552(0x7f0b1468, float:1.8486865E38)
            if (r1 != r0) goto L_0x016b
            java.lang.Object r5 = X.C29431cG.A0Y(r4)
            X.2Dk r5 = (X.C46162Dk) r5
            if (r5 == 0) goto L_0x0160
            java.lang.ref.WeakReference r0 = r2.A0F
            android.content.Context r7 = X.C108945cZ.A0F(r0)
            if (r7 == 0) goto L_0x0160
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            r10 = 3
            if (r0 == 0) goto L_0x0139
            android.content.Intent r1 = r0.getIntent()
            if (r1 == 0) goto L_0x0139
            java.lang.String r0 = "mat_entry_point"
            int r10 = r1.getIntExtra(r0, r10)
        L_0x0139:
            X.00H r0 = r2.A0D
            r0.get()
            X.1BI r8 = r5.A08()
            r11 = 5
            r9 = 0
            android.content.Intent r4 = X.AnonymousClass1LU.A10(r7, r8, r9, r10, r11, r12)
            X.1ch r1 = r5.A0M()
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            X.C108975cc.A12(r1, r0, r12)
            java.lang.String r1 = X.C108955ca.A0x(r7)
            X.C18070vi.A0X(r1)
            X.11P r0 = r2.A01
            X.C60442o2.A00(r4, r0, r1)
            r7.startActivity(r4, r9)
        L_0x0160:
            r0 = 0
            r3.A00 = r0
            X.7K9 r0 = r13.A0D
            if (r0 == 0) goto L_0x002e
            com.whatsapp.updates.viewmodels.UpdatesViewModel.A0A(r0)
            return r12
        L_0x016b:
            r0 = 2131432625(0x7f0b14b1, float:1.8487013E38)
            if (r1 != r0) goto L_0x002e
            java.lang.Object r10 = X.C29431cG.A0Y(r4)
            X.2Dk r10 = (X.C46162Dk) r10
            if (r10 == 0) goto L_0x0160
            java.lang.String r0 = "android.intent.action.SEND"
            android.content.Intent r7 = X.C108945cZ.A0G(r0)
            java.lang.String r9 = r10.A0R
            r8 = 0
            if (r9 == 0) goto L_0x01c5
            r5 = 2131892897(0x7f121aa1, float:1.9420555E38)
        L_0x0186:
            java.lang.ref.WeakReference r6 = r2.A0F
            android.content.Context r4 = X.C108945cZ.A0F(r6)
            if (r4 == 0) goto L_0x0160
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1b()
            java.lang.String r0 = r10.A0T
            r1[r8] = r0
            java.lang.String r5 = X.C17880vN.A0q(r4, r9, r1, r12, r5)
            if (r5 == 0) goto L_0x0160
            java.lang.String r0 = "android.intent.extra.TEXT"
            r7.putExtra(r0, r5)
            X.74D r4 = r2.A02
            X.1ch r2 = r10.A0M()
            java.lang.Integer r1 = X.AnonymousClass00R.A0N
            r0 = 3
            r4.A0D(r2, r1, r0, r0)
            java.lang.String r0 = "text/plain"
            r7.setType(r0)
            r0 = 524288(0x80000, float:7.34684E-40)
            r7.addFlags(r0)
            android.content.Context r1 = X.C108945cZ.A0F(r6)
            if (r1 == 0) goto L_0x0160
            android.content.Intent r0 = android.content.Intent.createChooser(r7, r5)
            r1.startActivity(r0)
            goto L_0x0160
        L_0x01c5:
            java.lang.String r9 = r10.A0S
            r5 = 2131892898(0x7f121aa2, float:1.9420557E38)
            goto L_0x0186
        L_0x01cb:
            java.lang.Object r4 = r5.A09
            monitor-enter(r4)
            java.util.Map r3 = r5.A0A     // Catch:{ all -> 0x01f2 }
            r3.clear()     // Catch:{ all -> 0x01f2 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x01f2 }
        L_0x01d7:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x01f2 }
            if (r0 == 0) goto L_0x01ee
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x01f2 }
            X.2Dk r1 = (X.C46162Dk) r1     // Catch:{ all -> 0x01f2 }
            X.1BI r0 = r1.A08()     // Catch:{ all -> 0x01f2 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x01f2 }
            r3.put(r0, r1)     // Catch:{ all -> 0x01f2 }
            goto L_0x01d7
        L_0x01ee:
            X.AnonymousClass70D.A00(r5, r3)     // Catch:{ all -> 0x01f2 }
            goto L_0x01f5
        L_0x01f2:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x01f5:
            monitor-exit(r4)
        L_0x01f6:
            com.whatsapp.updates.viewmodels.UpdatesViewModel.A0E(r6)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1424179j.Bks(android.view.MenuItem, X.02B):boolean");
    }

    public void BrJ(AnonymousClass02B r4) {
        AnonymousClass7K9 r2 = this.A0D;
        if (r2 != null) {
            AnonymousClass7K9.A00(r2).A00 = false;
            UpdatesViewModel.A0A(r2);
        }
        UpdatesFragment updatesFragment = this.A0C;
        if (updatesFragment != null) {
            updatesFragment.A0M = null;
        }
        this.A0D = null;
        this.A0C = null;
        this.A0B = null;
    }

    public boolean C1U(Menu menu, AnonymousClass02B r5) {
        AnonymousClass1FL A1B;
        WeakReference weakReference = this.A0G;
        Fragment fragment = (Fragment) weakReference.get();
        if (fragment == null || !fragment.A1b()) {
            return false;
        }
        A01(r5, this, this.A0F.A01().size());
        Fragment fragment2 = (Fragment) weakReference.get();
        if (!(fragment2 == null || (A1B = fragment2.A1B()) == null || menu == null)) {
            this.A0H.A00(A1B, menu);
        }
        return true;
    }
}
