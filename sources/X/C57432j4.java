package X;

import com.whatsapp.acs.ACSTokenProviderImpl$ACSTokenListenerImpl$1;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* renamed from: X.2j4  reason: invalid class name and case insensitive filesystem */
public final class C57432j4 {
    public final WeakReference A00;
    public final AnonymousClass1OB A01;
    public final /* synthetic */ C65922xK A02;

    public final void A00(String str) {
        C18070vi.A0d(str, 0);
        this.A01.BEM((CancellationException) null);
        Map map = this.A02.A01.A09;
        if (map.containsKey(str)) {
            ((C63512tE) map.get(str)).A0A.remove(this);
        }
    }

    public C57432j4(C72353Lp r4, C65922xK r5, String str, AnonymousClass1OX r7) {
        this.A02 = r5;
        this.A00 = new WeakReference(r4);
        ACSTokenProviderImpl$ACSTokenListenerImpl$1 aCSTokenProviderImpl$ACSTokenListenerImpl$1 = new ACSTokenProviderImpl$ACSTokenListenerImpl$1(this, str, (C30391dr) null);
        this.A01 = C30451dy.A02(AnonymousClass00R.A00, AnonymousClass1OR.A00, aCSTokenProviderImpl$ACSTokenListenerImpl$1, r7);
    }
}
