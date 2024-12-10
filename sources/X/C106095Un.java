package X;

import com.whatsapp.contact.picker.CompoundContactsLoader$loadContacts$2$1$1;

/* renamed from: X.5Un  reason: invalid class name and case insensitive filesystem */
public final class C106095Un extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C18600wl $dispatcher;
    public final /* synthetic */ AnonymousClass1EC $groupJid;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106095Un(AnonymousClass1EC r2, C18600wl r3) {
        super(1);
        this.$groupJid = r2;
        this.$dispatcher = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C107975av r5 = (C107975av) obj;
        C18070vi.A0d(r5, 0);
        return new C28243Du4(new CompoundContactsLoader$loadContacts$2$1$1(r5, this.$groupJid, (C30391dr) null, this.$dispatcher));
    }
}
