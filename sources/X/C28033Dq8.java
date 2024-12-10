package X;

/* renamed from: X.Dq8  reason: case insensitive filesystem */
public final class C28033Dq8 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ E3W $failedCommand;
    public final /* synthetic */ C25146CZx this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28033Dq8(E3W e3w, C25146CZx cZx) {
        super(1);
        this.$failedCommand = e3w;
        this.this$0 = cZx;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        String obj2;
        StringBuilder A10;
        int i;
        E3W e3w = (E3W) obj;
        if (this.$failedCommand == e3w) {
            str = " > ";
        } else {
            str = "   ";
        }
        StringBuilder A11 = AnonymousClass000.A11(str);
        if (e3w instanceof D60) {
            A10 = AnonymousClass000.A10();
            A10.append("CommitTextCommand(text.length=");
            D60 d60 = (D60) e3w;
            A10.append(d60.A01.A00.length());
            A10.append(", newCursorPosition=");
            i = d60.A00;
        } else if (e3w instanceof C26608D5y) {
            A10 = AnonymousClass000.A10();
            A10.append("SetComposingTextCommand(text.length=");
            C26608D5y d5y = (C26608D5y) e3w;
            A10.append(d5y.A01.A00.length());
            A10.append(", newCursorPosition=");
            i = d5y.A00;
        } else if ((e3w instanceof C26607D5x) || (e3w instanceof C26605D5v) || (e3w instanceof C26606D5w) || (e3w instanceof C26609D5z) || (e3w instanceof C26604D5u) || (e3w instanceof C26603D5t)) {
            obj2 = e3w.toString();
            return AnonymousClass000.A0y(obj2, A11);
        } else {
            A10 = AnonymousClass000.A10();
            A10.append("Unknown EditCommand: ");
            String A0i = BEA.A0i(e3w);
            if (A0i == null) {
                A0i = "{anonymous EditCommand}";
            }
            A10.append(A0i);
            obj2 = A10.toString();
            return AnonymousClass000.A0y(obj2, A11);
        }
        A10.append(i);
        A10.append(')');
        obj2 = A10.toString();
        return AnonymousClass000.A0y(obj2, A11);
    }
}
