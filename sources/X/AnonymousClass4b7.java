package X;

import android.content.DialogInterface;

/* renamed from: X.4b7  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4b7 implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass1KB A00;
    public final /* synthetic */ C34531kd A01;
    public final /* synthetic */ C33251iW A02;
    public final /* synthetic */ AnonymousClass122 A03;
    public final /* synthetic */ AnonymousClass1WM A04;
    public final /* synthetic */ AnonymousClass4M0 A05;
    public final /* synthetic */ AnonymousClass10I A06;

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass4M0 r0 = this.A05;
        AnonymousClass1KB r7 = this.A00;
        C34531kd r8 = this.A01;
        AnonymousClass10I r2 = this.A06;
        C33251iW r9 = this.A02;
        AnonymousClass122 r6 = this.A03;
        AnonymousClass1WM r5 = this.A04;
        for (Object next : r0.A00) {
            C18070vi.A0b(next);
            r2.CGF(new C21472Akd(next, r5, r6, r7, r8, r9, 18));
        }
        dialogInterface.dismiss();
    }

    public /* synthetic */ AnonymousClass4b7(AnonymousClass1KB r1, C34531kd r2, C33251iW r3, AnonymousClass122 r4, AnonymousClass1WM r5, AnonymousClass4M0 r6, AnonymousClass10I r7) {
        this.A05 = r6;
        this.A00 = r1;
        this.A01 = r2;
        this.A06 = r7;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
    }
}
