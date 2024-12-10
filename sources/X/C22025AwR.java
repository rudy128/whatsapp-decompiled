package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.AwR  reason: case insensitive filesystem */
public final class C22025AwR extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ String $directConnectionEncryptedInfo;
    public final /* synthetic */ String $iqId;
    public final /* synthetic */ C167828hq this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22025AwR(C167828hq r2, String str, String str2) {
        super(0);
        this.$iqId = str;
        this.this$0 = r2;
        this.$directConnectionEncryptedInfo = str2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C178759Ei r6;
        String str = this.$iqId;
        C187669gB r3 = this.this$0.A02;
        String str2 = this.$directConnectionEncryptedInfo;
        C18070vi.A0d(str, 0);
        UserJid userJid = r3.A02;
        String str3 = r3.A03;
        C178719Ee r7 = new C178719Ee(r3.A04, 7);
        C178759Ei r5 = new C178759Ei(r3.A05, 20);
        if (str2 != null) {
            r6 = new C178759Ei(str2, 21);
        } else {
            r6 = null;
        }
        return new AnonymousClass9F7(userJid, r5, r6, r7, str, str3);
    }
}
