package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.AjP  reason: case insensitive filesystem */
public final /* synthetic */ class C21396AjP implements Runnable {
    public final /* synthetic */ B82 A00;
    public final /* synthetic */ A5U A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public final void run() {
        A5U a5u = this.A01;
        Integer num = this.A03;
        B82 b82 = this.A00;
        UserJid userJid = this.A02;
        String str = this.A04;
        boolean z = this.A07;
        String str2 = this.A05;
        String str3 = this.A06;
        if (a5u.A07(num)) {
            b82.Bju((C185899dK) null, 3, "extensions-metadata-response-error", true);
            return;
        }
        UserJid A0F = AnonymousClass8BV.A0F(userJid, a5u.A05);
        AnonymousClass00H r3 = a5u.A04;
        AnonymousClass8BR.A0V(r3).A0B(num, "metadata_network_start");
        C20081A6h.A02(AnonymousClass8BR.A0V(a5u.A03), "metadata_network_start", str.hashCode());
        if (num != null) {
            AnonymousClass8BR.A0V(r3).A06(num.intValue(), "flow_id", str);
        }
        C20081A6h A0V = AnonymousClass8BR.A0V(r3);
        if (num != null) {
            A0V.A06(num.intValue(), "endpoint_public_key_fetch_mode", "optional");
        }
        C189269io r32 = a5u.A00;
        String rawString = A0F.getRawString();
        C18070vi.A0d(rawString, 1);
        r32.A00(rawString, str, 7930724213641500L).CBv(new AU2(b82, a5u, A0F, num, str2, str3, str, z));
    }

    public /* synthetic */ C21396AjP(B82 b82, A5U a5u, UserJid userJid, Integer num, String str, String str2, String str3, boolean z) {
        this.A01 = a5u;
        this.A03 = num;
        this.A00 = b82;
        this.A02 = userJid;
        this.A04 = str;
        this.A07 = z;
        this.A05 = str2;
        this.A06 = str3;
    }
}
