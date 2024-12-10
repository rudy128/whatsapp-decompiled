package X;

import com.whatsapp.thunderstorm.ThunderstormContactListItemElements;
import java.util.List;

/* renamed from: X.81X  reason: invalid class name */
public final class AnonymousClass81X extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass6J0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass81X(AnonymousClass6J0 r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        AnonymousClass6J0 r1 = this.this$0;
        List list = C42011xT.A0I;
        ThunderstormContactListItemElements thunderstormContactListItemElements = r1.A01;
        if (thunderstormContactListItemElements == null) {
            C18070vi.A11("item");
            throw null;
        }
        C18070vi.A0b(str);
        thunderstormContactListItemElements.setSubtitle(str);
        return C27621Wu.A00;
    }
}
