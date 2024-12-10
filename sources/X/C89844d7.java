package X;

import android.app.Activity;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.4d7  reason: invalid class name and case insensitive filesystem */
public final class C89844d7 implements View.OnClickListener {
    public final View A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass1M9 A02;
    public final C24921Me A03;
    public final C37451pZ A04;
    public final C134196qC A05;
    public final C31131f4 A06;
    public final C18000vb A07;
    public final AnonymousClass1L1 A08;
    public final WeakReference A09;

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006c, code lost:
        if (r2 == 10) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r16) {
        /*
            r15 = this;
            r4 = r16
            r6 = 0
            X.C18070vi.A0d(r4, r6)
            X.1f4 r13 = r15.A06
            X.7Mo r2 = r13.A00()
            X.22l r3 = r13.A01()
            boolean r1 = r13.A0C()
            boolean r0 = r13.A0B()
            if (r1 != 0) goto L_0x0028
            if (r0 == 0) goto L_0x001f
            r13.A04()
        L_0x001f:
            monitor-enter(r13)
            r0 = 0
            r13.A02 = r0     // Catch:{ all -> 0x0025 }
            monitor-exit(r13)
            goto L_0x0047
        L_0x0025:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L_0x0028:
            if (r0 == 0) goto L_0x0043
            X.7Mo r1 = r13.A00()
            if (r1 == 0) goto L_0x0036
            int r0 = r1.A04
            int r0 = r0 + 1
            r1.A04 = r0
        L_0x0036:
            r13.A04()
            boolean r0 = r4 instanceof android.widget.ImageButton
            if (r0 == 0) goto L_0x0042
            android.widget.ImageButton r4 = (android.widget.ImageButton) r4
            X.AnonymousClass4aV.A05(r4)
        L_0x0042:
            return
        L_0x0043:
            if (r2 != 0) goto L_0x0099
            if (r3 == 0) goto L_0x0042
        L_0x0047:
            java.lang.ref.WeakReference r0 = r15.A09
            java.lang.Object r2 = r0.get()
            android.app.Activity r2 = (android.app.Activity) r2
            if (r3 == 0) goto L_0x0042
            if (r2 == 0) goto L_0x0042
            X.4aV r7 = X.AnonymousClass4aV.A00
            X.6qC r1 = r15.A05
            r5 = 0
            r0 = 1
            X.7Mo r4 = r1.A01(r2, r6, r0)
            r4.A0K = r3
            r4.A08 = r0
            int r2 = r3.A0D()
            r0 = 9
            if (r2 == r0) goto L_0x006e
            r1 = 10
            r0 = 0
            if (r2 != r1) goto L_0x006f
        L_0x006e:
            r0 = 1
        L_0x006f:
            r4.A0Q = r0
            r4.A0G = r5
            r0 = 1
            r4.A0C(r6, r0, r0)
            X.0vb r14 = r15.A07
            android.view.View r8 = r15.A00
            X.1pZ r12 = r15.A04
            X.11S r9 = r15.A01
            X.1M9 r10 = r15.A02
            X.1Me r11 = r15.A03
            r7.A0B(r8, r9, r10, r11, r12, r13, r14)
            X.1L1 r1 = r15.A08
            X.205 r0 = r3.A0v
            X.1BI r0 = r0.A00
            X.AnonymousClass4aV.A0A(r0, r1)
            X.7Mo r1 = r13.A00()
            if (r1 == 0) goto L_0x0042
            r0 = 1
            r1.A0T = r0
            return
        L_0x0099:
            r0 = 1
            r2.A0C(r6, r0, r0)
            boolean r0 = r4 instanceof android.widget.ImageButton
            if (r0 == 0) goto L_0x0042
            android.widget.ImageButton r4 = (android.widget.ImageButton) r4
            X.AnonymousClass4aV.A04(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89844d7.onClick(android.view.View):void");
    }

    public C89844d7(Activity activity, View view, AnonymousClass11S r4, AnonymousClass1M9 r5, C24921Me r6, C37451pZ r7, C134196qC r8, C31131f4 r9, C18000vb r10, AnonymousClass1L1 r11) {
        this.A00 = view;
        this.A05 = r8;
        this.A06 = r9;
        this.A07 = r10;
        this.A04 = r7;
        this.A01 = r4;
        this.A02 = r5;
        this.A03 = r6;
        this.A08 = r11;
        this.A09 = AnonymousClass3MW.A0z(activity);
    }
}
