package X;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import com.whatsapp.conversation.conversationrow.SecurityNotificationDialogFragment;
import com.whatsapp.jid.Jid;

/* renamed from: X.A9d  reason: case insensitive filesystem */
public class C20141A9d implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public C20141A9d(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A04 = str;
        this.A03 = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A00 != 0) {
            String str = this.A04;
            C20828Aa6 aa6 = ((C20859Aab) this.A01).A03;
            aa6.A0O.A07((AnonymousClass21K) this.A02, aa6.A08, 17);
            AnonymousClass8BT.A14((Context) this.A03, Uri.parse(str), "android.intent.action.VIEW");
            return;
        }
        SecurityNotificationDialogFragment securityNotificationDialogFragment = (SecurityNotificationDialogFragment) this.A01;
        String str2 = this.A04;
        Jid jid = (Jid) this.A03;
        if (securityNotificationDialogFragment.A01.A0O((AnonymousClass1BI) this.A02)) {
            str2 = jid.getRawString();
        }
        securityNotificationDialogFragment.A1k(AnonymousClass1LU.A1N(securityNotificationDialogFragment.A1n(), str2));
    }
}
