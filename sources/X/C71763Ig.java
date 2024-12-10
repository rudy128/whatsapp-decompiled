package X;

import com.whatsapp.contact.sync.NativeContactsDownloadHelper;
import com.whatsapp.jid.PhoneUserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Ig  reason: invalid class name and case insensitive filesystem */
public final class C71763Ig extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C26981Ug $callback;
    public final /* synthetic */ C46932Gl $downloadEvent;
    public final /* synthetic */ Integer $downloadTrigger;
    public final /* synthetic */ boolean $hasNext;
    public final /* synthetic */ boolean $isRestore;
    public final /* synthetic */ NativeContactsDownloadHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71763Ig(NativeContactsDownloadHelper nativeContactsDownloadHelper, C46932Gl r3, C26981Ug r4, Integer num, boolean z, boolean z2) {
        super(1);
        this.this$0 = nativeContactsDownloadHelper;
        this.$isRestore = z;
        this.$hasNext = z2;
        this.$downloadEvent = r3;
        this.$downloadTrigger = num;
        this.$callback = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        String A0I;
        List<C64582v0> list = (List) obj;
        C18070vi.A0d(list, 0);
        this.this$0.A04.addAll(list);
        if (this.$isRestore) {
            AnonymousClass1UY r5 = this.this$0.A03;
            ArrayList A13 = AnonymousClass000.A13();
            for (C64582v0 r2 : list) {
                AnonymousClass1M9 r0 = r5.A00;
                PhoneUserJid phoneUserJid = r2.A00;
                if (!r0.A0z(phoneUserJid)) {
                    AnonymousClass1E7 r6 = new AnonymousClass1E7(phoneUserJid);
                    String str2 = r2.A02;
                    r6.A0T = str2;
                    String str3 = r2.A03;
                    r6.A0S = str3;
                    r6.A0Q = r2.A01;
                    String str4 = "";
                    if (str2 == null || (str = AnonymousClass1YF.A0I(str2)) == null) {
                        str = str4;
                    }
                    if (!(str3 == null || (A0I = AnonymousClass1YF.A0I(str3)) == null)) {
                        str4 = A0I;
                    }
                    r6.A0R = AnonymousClass1YF.A0I(C17890vO.A0Z(str4, AnonymousClass000.A11(str), ' '));
                    r6.A09 = 1;
                    r6.A01 = 1;
                    r6.A0H = new C59042lf(-5, phoneUserJid.user);
                    A13.add(r6);
                }
            }
            r5.A00.A0s(A13, false);
        }
        if (!this.$hasNext) {
            if (this.$isRestore) {
                C26931Ua r3 = this.this$0.A01;
                C26931Ua.A00(r3, 7, AnonymousClass11P.A01(r3.A01));
            }
            NativeContactsDownloadHelper nativeContactsDownloadHelper = this.this$0;
            nativeContactsDownloadHelper.A02.A02(this.$downloadEvent, this.$downloadTrigger, (long) nativeContactsDownloadHelper.A04.size());
            this.$callback.BrF(new C46062Cs(this.this$0.A04));
        }
        return C27621Wu.A00;
    }
}
