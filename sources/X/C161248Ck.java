package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;
import java.lang.ref.WeakReference;

/* renamed from: X.8Ck  reason: invalid class name and case insensitive filesystem */
public final class C161248Ck extends Handler {
    public final C19880zA A00;
    public final AnonymousClass99E A01;
    public final String A02;
    public final String A03;
    public final WeakReference A04;

    public void handleMessage(Message message) {
        VerifyPhoneNumber verifyPhoneNumber;
        C18070vi.A0d(message, 0);
        if (message.what == 1 && (verifyPhoneNumber = (VerifyPhoneNumber) this.A04.get()) != null) {
            Object obj = message.obj;
            AnonymousClass8BR.A1I(obj);
            String str = this.A02;
            String str2 = this.A03;
            C17960vV.A07(str2);
            A80.A00(this.A00);
            verifyPhoneNumber.A4k(this.A01, (String) obj, str, str2, "sms", 4);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C161248Ck(Looper looper, C19880zA r3, AnonymousClass99E r4, VerifyPhoneNumber verifyPhoneNumber, String str, String str2) {
        super(looper);
        C18070vi.A0w(str, str2, looper, r3, r4);
        C17960vV.A07(looper);
        this.A02 = str;
        this.A03 = str2;
        this.A00 = r3;
        this.A01 = r4;
        this.A04 = AnonymousClass3MW.A0z(verifyPhoneNumber);
    }
}
