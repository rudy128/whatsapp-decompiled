package X;

import android.text.Editable;
import android.util.Base64;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.4iN  reason: invalid class name and case insensitive filesystem */
public final class C93064iN implements C108725cC {
    public final AnonymousClass190 A00;
    public final C116935ys A01;
    public final AnonymousClass4T1 A02;
    public final AnonymousClass1BI A03;
    public final C41111vp A04;
    public final C18100vl A05;
    public final C18600wl A06;
    public final AnonymousClass1OX A07;
    public final C131326ku A08;
    public final A06 A09;
    public final AnonymousClass4YH A0A = AnonymousClass4YH.A02;
    public final C32951i1 A0B;
    public final AtomicLong A0C;

    public void Bkw(AnonymousClass3V2 r1) {
    }

    public C86574Se C55(AnonymousClass3V2 r12, C57982jx r13) {
        int Baw;
        AnonymousClass1D6 r0;
        if (AnonymousClass3MW.A10(this.A04).size() == 1) {
            C108725cC A0T = r12.A0T();
            if (A0T == null) {
                Baw = 0;
            } else {
                Baw = A0T.Baw();
            }
            if (Baw == 1) {
                byte[] bytes = AnonymousClass3MW.A0y(this.A05).getBytes(C26571Sq.A05);
                C18070vi.A0X(bytes);
                r0 = AnonymousClass1D6.A01(Base64.encodeToString(bytes, 2), AnonymousClass6R7.EMU_FLASH);
            } else {
                r0 = new AnonymousClass1D6((Object) null, (Object) null);
            }
            String str = (String) r0.first;
            AnonymousClass6R7 r4 = (AnonymousClass6R7) r0.second;
            if (Baw == 1) {
                C32951i1 r10 = this.A0B;
                r10.A0T.execute(new C70773Cl(r10, r12.A06, C32951i1.A00(r10), 44));
            }
            C121636Kx r2 = this.A01.A01;
            synchronized (r2) {
                r2.A00.A07(-1);
            }
            if (!(str == null || r4 == null || Baw == 0)) {
                r13.A02 = new C20949Ac3(r4, str);
                r13.A05 = true;
                return new C86574Se((Integer) null);
            }
        }
        return AnonymousClass4WL.A00;
    }

    public int Baw() {
        List A10 = AnonymousClass3MW.A10(this.A04);
        if (A10.size() != 1 || ((AnonymousClass77E) C29431cG.A0b(A10)).A00 == null) {
            return 0;
        }
        return 1;
    }

    public void Bqz() {
        C18460wS r1 = C18460wS.A00;
        A01(this, r1);
        this.A04.A0F(r1);
        this.A02.A01();
    }

    public void Bsj(Editable editable) {
        AnonymousClass4T1 r1;
        String obj;
        int length;
        C1417676w r12;
        boolean z;
        if (editable == null || (obj = editable.toString()) == null || (length = obj.length()) == 0) {
            C18460wS r13 = C18460wS.A00;
            A01(this, r13);
            this.A04.A0F(r13);
            r1 = this.A02;
        } else {
            C134516qi r5 = new C134516qi(obj, AnonymousClass3MW.A0y(this.A05));
            C136896ua A002 = this.A08.A00(7);
            A002.A02();
            C121636Kx r2 = this.A01.A01;
            synchronized (r2) {
                r12 = (C1417676w) r2.A00.A04(r5);
            }
            if (r12 != null) {
                this.A02.A01();
                List list = r12.A00;
                List A003 = A00(list);
                A01(this, A003);
                this.A04.A0F(A003);
                A002.A01();
                A002.A04(AnonymousClass000.A0i(), AnonymousClass3MY.A0f(), C17880vN.A0n(length), C17880vN.A0n(list.size()));
                A002.A03();
                return;
            }
            if (!C42701yb.A01(this.A03)) {
                this.A00.A0G("MetaAiImagineTypeaheadDelegate-send-composer-text-for-non-bot-chat", (String) null, true);
                z = false;
            } else {
                z = true;
            }
            r1 = this.A02;
            if (z) {
                this.A09.A01(new C93044iL(this, r5, A002, r1.A00()));
                return;
            }
        }
        r1.A01();
    }

    public C93064iN(AnonymousClass190 r4, C131316kt r5, C131326ku r6, C116935ys r7, AnonymousClass4T1 r8, C32951i1 r9, AnonymousClass1BI r10, C18600wl r11, AnonymousClass1OX r12) {
        C18070vi.A0j(r4, r9);
        C18070vi.A0g(r6, 4, r5);
        C18070vi.A0d(r8, 9);
        this.A00 = r4;
        this.A0B = r9;
        this.A01 = r7;
        this.A08 = r6;
        this.A03 = r10;
        this.A07 = r12;
        this.A06 = r11;
        this.A02 = r8;
        AtomicLong atomicLong = new AtomicLong(0);
        this.A0C = atomicLong;
        this.A09 = r5.A00(atomicLong);
        this.A05 = AnonymousClass1DF.A01(C104725Pg.A00);
        this.A04 = AnonymousClass3MW.A0n(C18460wS.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r2.A00 != null) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A00(java.util.List r5) {
        /*
            java.util.Iterator r4 = r5.iterator()
        L_0x0004:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r3 = r4.next()
            r0 = r3
            X.77E r0 = (X.AnonymousClass77E) r0
            X.775 r2 = r0.A00
            if (r2 == 0) goto L_0x0004
            monitor-enter(r2)
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x001f
            android.graphics.Bitmap r0 = r2.A00     // Catch:{ all -> 0x002b }
            r1 = 0
            if (r0 == 0) goto L_0x0020
        L_0x001f:
            r1 = 1
        L_0x0020:
            monitor-exit(r2)
            r0 = 1
            if (r1 != r0) goto L_0x0004
            if (r3 == 0) goto L_0x002a
            java.util.List r5 = X.C18070vi.A0M(r3)
        L_0x002a:
            return r5
        L_0x002b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93064iN.A00(java.util.List):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (((X.AnonymousClass77E) X.C29431cG.A0b(r7)).A00 == null) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C93064iN r6, java.util.List r7) {
        /*
            int r3 = r6.Baw()
            int r0 = r7.size()
            r2 = 1
            if (r0 != r2) goto L_0x0016
            java.lang.Object r0 = X.C29431cG.A0b(r7)
            X.77E r0 = (X.AnonymousClass77E) r0
            X.775 r1 = r0.A00
            r0 = 1
            if (r1 != 0) goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            if (r3 == r2) goto L_0x002f
            if (r0 != r2) goto L_0x002f
            X.1i1 r5 = r6.A0B
            X.1BI r4 = r6.A03
            android.content.SharedPreferences r3 = X.C32951i1.A00(r5)
            X.10s r2 = r5.A0T
            r1 = 39
            X.3Cl r0 = new X.3Cl
            r0.<init>(r5, r4, r3, r1)
            r2.execute(r0)
        L_0x002f:
            java.util.concurrent.atomic.AtomicLong r2 = r6.A0C
            r0 = 200(0xc8, double:9.9E-322)
            r2.set(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93064iN.A01(X.4iN, java.util.List):void");
    }
}
