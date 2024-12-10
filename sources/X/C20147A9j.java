package X;

import android.content.DialogInterface;
import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: X.A9j  reason: case insensitive filesystem */
public final /* synthetic */ class C20147A9j implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass1FU A00;
    public final /* synthetic */ C132216mP A01;
    public final /* synthetic */ AnonymousClass1MB A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass1FU r6 = this.A00;
        Runnable runnable = this.A03;
        C132216mP r4 = this.A01;
        AnonymousClass1MB r1 = this.A02;
        String str = this.A04;
        String str2 = this.A05;
        AnonymousClass4Yv.A00(r6, 124);
        if (runnable != null) {
            runnable.run();
        }
        boolean A002 = r1.A00();
        StringBuilder A10 = AnonymousClass000.A10();
        C17890vO.A10("blocked +", str, str2, A10);
        r6.startActivity(r4.A00.A00((Bundle) null, (AnonymousClass770) null, (Integer) null, A10.toString(), (String) null, (ArrayList) null, (ArrayList) null, A002));
    }

    public /* synthetic */ C20147A9j(AnonymousClass1FU r1, C132216mP r2, AnonymousClass1MB r3, Runnable runnable, String str, String str2) {
        this.A00 = r1;
        this.A03 = runnable;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = str;
        this.A05 = str2;
    }
}
