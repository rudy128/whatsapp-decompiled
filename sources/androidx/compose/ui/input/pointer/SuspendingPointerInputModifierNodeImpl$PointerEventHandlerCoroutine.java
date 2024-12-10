package androidx.compose.ui.input.pointer;

import X.AnonymousClass09X;
import X.AnonymousClass0CQ;
import X.AnonymousClass0Hm;
import X.AnonymousClass0QV;
import X.AnonymousClass1OR;
import X.C06970a9;
import X.C16880tN;
import X.C17750vA;
import X.C18560wh;
import X.C28644ECa;
import X.C30391dr;
import X.C30581eB;
import X.C31761g5;
import X.C31781g7;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine implements C30391dr, C28644ECa, C17750vA {
    public AnonymousClass0CQ A00 = AnonymousClass0CQ.Main;
    public C31761g5 A01;
    public final C30391dr A02;
    public final C18560wh A03 = AnonymousClass1OR.A00;
    public final /* synthetic */ AnonymousClass09X A04;
    public final /* synthetic */ AnonymousClass09X A05;

    public float BQU() {
        return this.A05.BQU();
    }

    public float BRu() {
        return this.A05.BRu();
    }

    public int CG9(float f) {
        return this.A05.CG9(f);
    }

    public float CPE(long j) {
        return this.A05.CPE(j);
    }

    public float CPF(float f) {
        return this.A05.CPF(f);
    }

    public float CPG(int i) {
        return this.A05.CPG(i);
    }

    public long CPH(long j) {
        return this.A05.CPH(j);
    }

    public float CPP(long j) {
        return this.A05.CPP(j);
    }

    public float CPQ(float f) {
        return this.A05.CPQ(f);
    }

    public long CPT(long j) {
        return this.A05.CPT(j);
    }

    public long CPU(float f) {
        return this.A05.CPU(f);
    }

    public long CPV(float f) {
        return this.A05.CPV(f);
    }

    public SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine(AnonymousClass09X r2, C30391dr r3) {
        this.A04 = r2;
        this.A02 = r3;
        this.A05 = r2;
    }

    public final void A02(AnonymousClass0Hm r3, AnonymousClass0CQ r4) {
        C31761g5 r1;
        if (r4 == this.A00 && (r1 = this.A01) != null) {
            this.A01 = null;
            r1.resumeWith(r3);
        }
    }

    public final void A03(Throwable th) {
        C31761g5 r0 = this.A01;
        if (r0 != null) {
            r0.BEN(th);
        }
        this.A01 = null;
    }

    public Object BCq(AnonymousClass0CQ r4, C30391dr r5) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C31781g7.A02;
        C31781g7 r0 = new C31781g7(1, C30581eB.A02(r5));
        r0.A0F();
        this.A00 = r4;
        this.A01 = r0;
        return r0.A0C();
    }

    public AnonymousClass0Hm BPt() {
        return this.A04.A01;
    }

    public long BRT() {
        return this.A04.A0N();
    }

    public long BZM() {
        return this.A04.A00;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object CSF(X.C30391dr r8, X.AnonymousClass1OS r9, long r10) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.AnonymousClass0bE
            if (r0 == 0) goto L_0x0024
            r5 = r8
            X.0bE r5 = (X.AnonymousClass0bE) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0024
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.1g4 r6 = X.AnonymousClass3F6.A03()
            int r0 = r5.label
            r4 = 1
            if (r0 == 0) goto L_0x0033
            if (r0 != r4) goto L_0x002e
            java.lang.Object r2 = r5.L$0
            X.1OB r2 = (X.AnonymousClass1OB) r2
            goto L_0x002a
        L_0x0024:
            X.0bE r5 = new X.0bE
            r5.<init>(r7, r8)
            goto L_0x0012
        L_0x002a:
            X.C30691eM.A01(r1)     // Catch:{ all -> 0x006e }
            goto L_0x0068
        L_0x002e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0033:
            X.C30691eM.A01(r1)
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x004c
            X.1g5 r1 = r7.A01
            if (r1 == 0) goto L_0x004c
            X.0af r0 = new X.0af
            r0.<init>(r10)
            X.1IU r0 = X.C30691eM.A00(r0)
            r1.resumeWith(r0)
        L_0x004c:
            X.09X r0 = r7.A04
            X.1OX r3 = r0.A0B()
            r2 = 0
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1 r1 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1
            r1.<init>(r7, r2, r10)
            r0 = 3
            X.1e4 r2 = X.AnonymousClass4Z4.A02(r2, r2, r1, r3, r0)
            r5.L$0 = r2     // Catch:{ all -> 0x006e }
            r5.label = r4     // Catch:{ all -> 0x006e }
            java.lang.Object r1 = r9.invoke(r7, r5)     // Catch:{ all -> 0x006e }
            if (r1 != r6) goto L_0x0068
            return r6
        L_0x0068:
            X.0ah r0 = X.C07290ah.A00
            r2.BEM(r0)
            return r1
        L_0x006e:
            r1 = move-exception
            X.0ah r0 = X.C07290ah.A00
            r2.BEM(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine.CSF(X.1dr, X.1OS, long):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object CSG(X.C30391dr r6, X.AnonymousClass1OS r7, long r8) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.AnonymousClass0b2
            if (r0 == 0) goto L_0x0020
            r4 = r6
            X.0b2 r4 = (X.AnonymousClass0b2) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0020
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r3 = r4.result
            X.1g4 r2 = X.AnonymousClass3F6.A03()
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L_0x002f
            if (r1 != r0) goto L_0x002a
            goto L_0x0026
        L_0x0020:
            X.0b2 r4 = new X.0b2
            r4.<init>(r5, r6)
            goto L_0x0012
        L_0x0026:
            X.C30691eM.A01(r3)     // Catch:{ 0af -> 0x003b }
            return r3
        L_0x002a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x002f:
            X.C30691eM.A01(r3)
            r4.label = r0     // Catch:{ 0af -> 0x003b }
            java.lang.Object r3 = r5.CSF(r4, r7, r8)     // Catch:{ 0af -> 0x003b }
            if (r3 != r2) goto L_0x003c
            return r2
        L_0x003b:
            r3 = 0
        L_0x003c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine.CSG(X.1dr, X.1OS, long):java.lang.Object");
    }

    public C16880tN getViewConfiguration() {
        return AnonymousClass0QV.A03(this.A04).A09;
    }

    public void resumeWith(Object obj) {
        C06970a9 A012 = this.A04.A05;
        synchronized (A012) {
            A012.A0H(this);
        }
        this.A02.resumeWith(obj);
    }

    public C18560wh getContext() {
        return this.A03;
    }
}
