package X;

import com.whatsapp.jid.PhoneUserJid;
import java.util.Map;

/* renamed from: X.82g  reason: invalid class name and case insensitive filesystem */
public final class C1588482g extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass1M9 $contactManager;
    public final /* synthetic */ Map $lidToPnJidMap;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1588482g(AnonymousClass1M9 r2, Map map) {
        super(1);
        this.$contactManager = r2;
        this.$lidToPnJidMap = map;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass1BI r0 = ((C63312sr) obj).A04;
        AnonymousClass1M9 r3 = this.$contactManager;
        Map map = this.$lidToPnJidMap;
        if (!(r0 instanceof AnonymousClass1E1) || (r0 = (PhoneUserJid) map.get(r0)) != null) {
            return r3.A0H(r0);
        }
        return null;
    }
}
