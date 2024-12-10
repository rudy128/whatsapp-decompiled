package X;

import com.whatsapp.bridge.wfal.WfalManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1x6  reason: invalid class name and case insensitive filesystem */
public final class C41811x6 implements AnonymousClass1WS {
    public boolean A00 = true;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final HashMap A04 = new HashMap();

    public C41811x6(AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r5, 3);
        this.A03 = r3;
        this.A02 = r4;
        this.A01 = r5;
    }

    public /* synthetic */ void BmY(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void BsP(AnonymousClass206 r1) {
    }

    public /* synthetic */ void Bwj(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void ByG(AnonymousClass206 r1) {
    }

    public void ByH(AnonymousClass206 r4, int i) {
        C18070vi.A0d(r4, 0);
        if (C1402870s.A00(r4)) {
            List singletonList = Collections.singletonList(r4);
            C18070vi.A0X(singletonList);
            if (AnonymousClass74A.A08(singletonList) && WfalManager.A00((WfalManager) this.A03.get(), false)) {
                if (!(r4 instanceof AnonymousClass210)) {
                    ((C140116zy) this.A01.get()).A01(r4, A00(r4));
                } else if (this.A00) {
                    ((C140116zy) this.A01.get()).A02((AnonymousClass210) r4, A00(r4));
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ByK(X.AnonymousClass206 r8, int r9) {
        /*
            r7 = this;
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            r0 = 24
            if (r9 != r0) goto L_0x011e
            long r3 = r8.A0H
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x011e
            boolean r0 = X.C1402870s.A00(r8)
            if (r0 == 0) goto L_0x011e
            X.00H r3 = r7.A03
            java.lang.Object r1 = r3.get()
            com.whatsapp.bridge.wfal.WfalManager r1 = (com.whatsapp.bridge.wfal.WfalManager) r1
            r0 = 0
            boolean r0 = com.whatsapp.bridge.wfal.WfalManager.A00(r1, r0)
            if (r0 == 0) goto L_0x011e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "CrosspostMessageObserver/checking is auto-share crossposting message "
            r2.append(r0)
            long r0 = r8.A0x
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            X.C31081ez.A02(r0)
            X.77K r0 = X.C63672tV.A00(r8)
            if (r0 != 0) goto L_0x00ab
            java.lang.String r0 = "CrosspostMessageObserver/handle auto share message in previous app session"
            X.C31081ez.A02(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            X.00H r6 = r7.A02
            java.lang.Object r3 = r6.get()
            X.738 r3 = (X.AnonymousClass738) r3
            long r0 = r8.A0x
            X.6Re r2 = X.C122646Re.FACEBOOK
            X.AnonymousClass738.A02(r3)
            android.util.LongSparseArray r5 = r3.A00
            monitor-enter(r5)
            java.lang.Integer r0 = X.AnonymousClass738.A00(r2, r3, r0)     // Catch:{ all -> 0x00a8 }
            monitor-exit(r5)
            if (r0 == 0) goto L_0x006d
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x006d
            r4.add(r2)
        L_0x006d:
            java.lang.Object r0 = r6.get()
            X.738 r0 = (X.AnonymousClass738) r0
            long r2 = r8.A0x
            X.6Re r1 = X.C122646Re.INSTAGRAM
            X.AnonymousClass738.A02(r0)
            android.util.LongSparseArray r5 = r0.A00
            monitor-enter(r5)
            java.lang.Integer r0 = X.AnonymousClass738.A00(r1, r0, r2)     // Catch:{ all -> 0x00a8 }
            monitor-exit(r5)
            if (r0 == 0) goto L_0x008d
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x008d
            r4.add(r1)
        L_0x008d:
            boolean r0 = r4.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x011e
            X.00H r0 = r7.A01
            java.lang.Object r1 = r0.get()
            X.6zy r1 = (X.C140116zy) r1
            java.util.List r0 = java.util.Collections.singletonList(r8)
            X.C18070vi.A0X(r0)
            r1.A03(r0, r4)
            return
        L_0x00a8:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x00ab:
            java.util.List r0 = java.util.Collections.singletonList(r8)
            X.C18070vi.A0X(r0)
            boolean r0 = X.AnonymousClass74A.A08(r0)
            if (r0 == 0) goto L_0x011e
            boolean r0 = r7.A00
            if (r0 != 0) goto L_0x00c8
            java.util.HashMap r1 = r7.A04
            X.205 r0 = r8.A0v
            java.lang.String r0 = r0.A01
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x011e
        L_0x00c8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CrosspostMessageObserver/handle omitted auto share message. statusFragmentDestroyed: "
            r1.append(r0)
            boolean r0 = r7.A00
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.C31081ez.A02(r0)
            X.77K r1 = X.C63672tV.A00(r8)
            if (r1 == 0) goto L_0x011e
            boolean r0 = r1.A05
            boolean r2 = r1.A06
            if (r0 == 0) goto L_0x011f
            java.lang.Object r1 = r3.get()
            com.whatsapp.bridge.wfal.WfalManager r1 = (com.whatsapp.bridge.wfal.WfalManager) r1
            X.6Re r0 = X.C122646Re.FACEBOOK
            if (r2 == 0) goto L_0x0102
            X.77e r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x011e
        L_0x00fa:
            java.lang.Object r1 = r3.get()
            com.whatsapp.bridge.wfal.WfalManager r1 = (com.whatsapp.bridge.wfal.WfalManager) r1
            X.6Re r0 = X.C122646Re.INSTAGRAM
        L_0x0102:
            X.77e r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x011e
            X.00H r0 = r7.A01
            java.lang.Object r2 = r0.get()
            X.6zy r2 = (X.C140116zy) r2
            java.util.List r1 = java.util.Collections.singletonList(r8)
            X.C18070vi.A0X(r1)
            java.util.ArrayList r0 = A00(r8)
            r2.A03(r1, r0)
        L_0x011e:
            return
        L_0x011f:
            if (r2 == 0) goto L_0x011e
            goto L_0x00fa
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41811x6.ByK(X.206, int):void");
    }

    public /* synthetic */ void ByN(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByQ(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void ByR(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByY(Collection collection, int i) {
        AnonymousClass2TK.A00(this, collection, i);
    }

    public /* synthetic */ void ByZ(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void Bya(Collection collection, Map map) {
    }

    public /* synthetic */ void Byb(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void Byc(AnonymousClass1BI r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void Byd(Collection collection) {
    }

    public /* synthetic */ void Bz8(C29681ch r1) {
    }

    public /* synthetic */ void Bz9(AnonymousClass206 r1) {
    }

    public /* synthetic */ void BzA(C29681ch r1, boolean z) {
    }

    public /* synthetic */ void BzC(C29681ch r1) {
    }

    public /* synthetic */ void C0d(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void C0h(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public static final ArrayList A00(AnonymousClass206 r3) {
        ArrayList arrayList = new ArrayList();
        AnonymousClass77K A002 = C63672tV.A00(r3);
        if (A002 != null && A002.A05) {
            arrayList.add(C122646Re.FACEBOOK);
        }
        AnonymousClass77K A003 = C63672tV.A00(r3);
        if (A003 != null && A003.A06) {
            arrayList.add(C122646Re.INSTAGRAM);
        }
        return arrayList;
    }
}
