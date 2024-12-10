package X;

import android.app.Activity;
import android.content.DialogInterface;
import java.util.HashSet;

/* renamed from: X.4b2  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4b2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass1KB A01;
    public final /* synthetic */ C33251iW A02;
    public final /* synthetic */ AnonymousClass206 A03;
    public final /* synthetic */ AnonymousClass10I A04;

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass206 r2 = this.A03;
        AnonymousClass10I r1 = this.A04;
        C33251iW r3 = this.A02;
        AnonymousClass1KB r5 = this.A01;
        Activity activity = this.A00;
        C18070vi.A0d(dialogInterface, 5);
        HashSet A12 = C17880vN.A12();
        A12.add(r2);
        r1.CGF(new C70833Cr((Object) r3, (Object) A12, (Object) r5, (Object) activity, 36));
        dialogInterface.dismiss();
    }

    public /* synthetic */ AnonymousClass4b2(Activity activity, AnonymousClass1KB r2, C33251iW r3, AnonymousClass206 r4, AnonymousClass10I r5) {
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = activity;
    }
}
