package X;

import android.database.ContentObserver;
import android.os.Handler;
import android.provider.ContactsContract;
import com.whatsapp.util.Log;

/* renamed from: X.6nh  reason: invalid class name and case insensitive filesystem */
public class C132846nh {
    public final Handler A00;
    public final C18030ve A01;
    public final ContentObserver A02;
    public final AnonymousClass11S A03;
    public final AnonymousClass00H A04;
    public volatile boolean A05;

    public void A00(AnonymousClass11C r4) {
        if (!this.A05) {
            synchronized (this) {
                if (!this.A05 && C72463Mc.A1W(this.A04) && !this.A03.A0N()) {
                    Log.i("androidcontactscontentobserver/registered");
                    this.A05 = true;
                    r4.A0O().A09(ContactsContract.Contacts.CONTENT_URI, this.A02);
                }
            }
        }
    }

    public C132846nh(AnonymousClass11S r3, AnonymousClass12E r4, C18030ve r5, C25151Nc r6, AnonymousClass00H r7) {
        this.A03 = r3;
        this.A04 = r7;
        this.A01 = r5;
        this.A00 = new C109615dj(r6.A00(), r3, this, r4);
        this.A02 = new C109345dI(r3, this);
    }
}
