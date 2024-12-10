package X;

/* renamed from: X.2pw  reason: invalid class name and case insensitive filesystem */
public class C61592pw {
    public final AnonymousClass190 A00;
    public final C23651Hc A01;
    public final C18030ve A02;
    public final AnonymousClass00H A03;

    public C61592pw(AnonymousClass190 r1, C23651Hc r2, C18030ve r3, AnonymousClass00H r4) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
    }

    public static void A00(C56222h7 r2) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MessageReceiptXmppMethod/message-retry; message.key=");
        A10.append(r2.A0B);
        A10.append("; jid=");
        A10.append(r2.A05);
        A10.append("; retryCount=");
        C17900vP.A0o(A10, r2.A01);
    }
}
