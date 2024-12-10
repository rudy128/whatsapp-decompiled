package X;

/* renamed from: X.1tO  reason: invalid class name and case insensitive filesystem */
public class C39631tO extends C39611tM implements C39621tN {
    public final AnonymousClass1E7 A00;
    public final AnonymousClass1BI A01;

    public AnonymousClass1BI BTb() {
        if (this instanceof C42191xm) {
            return ((C42191xm) this).A00.A0J;
        }
        return this.A01;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ConversationConversationsListItem{jid=");
        sb.append(this.A01);
        sb.append('}');
        return sb.toString();
    }

    public C39631tO(AnonymousClass1BI r2, int i) {
        super(r2, i);
        this.A01 = r2;
        this.A00 = null;
    }

    public C39631tO(AnonymousClass1E7 r2, AnonymousClass1BI r3) {
        super(r3, 2);
        this.A01 = r3;
        this.A00 = r2;
    }
}
