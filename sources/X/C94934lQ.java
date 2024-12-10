package X;

import android.app.Activity;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.4lQ  reason: invalid class name and case insensitive filesystem */
public final class C94934lQ implements C1600386w {
    public final View A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass11S A02;
    public final AnonymousClass1M9 A03;
    public final C24921Me A04;
    public final C37451pZ A05;
    public final C134196qC A06;
    public final C31131f4 A07;
    public final C18000vb A08;
    public final C18030ve A09;
    public final AnonymousClass1L1 A0A;
    public final AnonymousClass10I A0B;
    public final AnonymousClass00H A0C;
    public final WeakReference A0D;

    public void C0k(int i) {
        C31131f4 r0 = this.A07;
        C441822l A012 = r0.A01();
        C145777Mo A002 = r0.A00();
        if (A002 != null && A012 != null) {
            this.A0B.CGF(new C98614rR(this, A012, 0, i, A002.A0Q));
        }
    }

    public C94934lQ(Activity activity, View view, AnonymousClass1KB r4, AnonymousClass11S r5, AnonymousClass1M9 r6, C24921Me r7, C37451pZ r8, C134196qC r9, C31131f4 r10, C18000vb r11, C18030ve r12, AnonymousClass1L1 r13, AnonymousClass10I r14, AnonymousClass00H r15) {
        this.A09 = r12;
        this.A00 = view;
        this.A06 = r9;
        this.A07 = r10;
        this.A0C = r15;
        this.A01 = r4;
        this.A0D = AnonymousClass3MW.A0z(activity);
        this.A08 = r11;
        this.A05 = r8;
        this.A02 = r5;
        this.A03 = r6;
        this.A04 = r7;
        this.A0B = r14;
        this.A0A = r13;
    }
}
