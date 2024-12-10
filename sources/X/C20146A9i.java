package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import java.util.ArrayList;

/* renamed from: X.A9i  reason: case insensitive filesystem */
public class C20146A9i implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    public C20146A9i(Object obj, Object obj2, Object obj3, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A04 = str;
        this.A05 = str2;
        this.A02 = obj2;
        this.A03 = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
                Uri A002 = AnonymousClass129.A00((Pair) null, (AnonymousClass129) this.A01, "general", this.A04, this.A05);
                C18070vi.A0X(A002);
                ((AnonymousClass1L9) this.A02).A08((Context) this.A03, AnonymousClass3MY.A07(A002));
                return;
            case 1:
                String str = this.A04;
                String str2 = this.A05;
                Runnable runnable = (Runnable) this.A03;
                ((C29491cN) C18070vi.A0E(((C195019sf) this.A01).A02)).A0I((Context) this.A02, str, str2, (String) null, (String) null, (C18090vk) null, 1, false, false, false);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Activity activity = (Activity) this.A01;
                String str3 = this.A04;
                String str4 = this.A05;
                AnonymousClass4Yv.A00(activity, 125);
                boolean A003 = ((AnonymousClass1MB) this.A03).A00();
                StringBuilder A10 = AnonymousClass000.A10();
                C17890vO.A10("blocked +", str3, str4, A10);
                activity.startActivity(((C132216mP) this.A02).A00.A00((Bundle) null, (AnonymousClass770) null, (Integer) null, A10.toString(), (String) null, (ArrayList) null, (ArrayList) null, A003));
                return;
        }
    }
}
