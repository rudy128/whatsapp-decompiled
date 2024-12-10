package X;

/* renamed from: X.1UI  reason: invalid class name */
public final class AnonymousClass1UI extends AnonymousClass1O9 {
    public static final long serialVersionUID = 1;
    public final boolean isRecoverable;
    public final String stanza;

    public AnonymousClass1UI(String str) {
        super(str, (Throwable) null);
        this.isRecoverable = true;
        this.stanza = null;
    }

    public static AnonymousClass1UI A01(String str) {
        return new AnonymousClass1UI(str);
    }

    public C59092lk CPC(String str) {
        Throwable cause;
        String message = getMessage();
        if (message == null && ((cause = getCause()) == null || (message = cause.getMessage()) == null)) {
            message = "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("source=");
        sb.append(str);
        sb.append(" message=");
        sb.append(message);
        return new C59092lk("CorruptStreamException", sb.toString());
    }

    public AnonymousClass1UI(String str, Throwable th) {
        super(str, th);
        this.isRecoverable = true;
        this.stanza = null;
    }

    public AnonymousClass1UI(String str, String str2) {
        super(str, (Throwable) null);
        this.isRecoverable = true;
        this.stanza = str2;
    }

    public AnonymousClass1UI(Throwable th) {
        super((String) null, th);
        this.isRecoverable = true;
        this.stanza = null;
    }

    public AnonymousClass1UI() {
        super((String) null, (Throwable) null);
        this.isRecoverable = true;
        this.stanza = null;
    }
}
