package X;

import android.app.ProgressDialog;
import android.content.Context;

/* renamed from: X.7wa  reason: invalid class name and case insensitive filesystem */
public final class C157227wa extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Integer $inviteSource;
    public final /* synthetic */ String $phoneNumber;
    public final /* synthetic */ ProgressDialog $progressDialog;
    public final /* synthetic */ String $uriPrefix;
    public final /* synthetic */ AnonymousClass733 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C157227wa(ProgressDialog progressDialog, Context context, AnonymousClass733 r4, Integer num, String str, String str2) {
        super(0);
        this.this$0 = r4;
        this.$context = context;
        this.$phoneNumber = str;
        this.$uriPrefix = str2;
        this.$inviteSource = num;
        this.$progressDialog = progressDialog;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C108965cb.A19(this.this$0.A01, this.$progressDialog, 21);
        AnonymousClass733 r1 = this.this$0;
        AnonymousClass733.A02(this.$context, r1, (C135686sb) null, this.$inviteSource, this.$phoneNumber, "https://whatsapp.com/dl/", this.$uriPrefix);
        return C27621Wu.A00;
    }
}
