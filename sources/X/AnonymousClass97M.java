package X;

/* renamed from: X.97M  reason: invalid class name */
public final class AnonymousClass97M extends C180379Mh {
    public C164398Yr A00;
    public final AnonymousClass206 A01;
    public final Long A02;

    public AnonymousClass97M(AnonymousClass206 r2, Long l) {
        this.A01 = r2;
        this.A02 = l;
        this.A00 = null;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass97M) {
                AnonymousClass97M r5 = (AnonymousClass97M) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass001.A0k(this.A01) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + C17880vN.A02(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ParsedEmbeddedContentMessageInfo(parsedMessage=");
        A10.append(this.A01);
        A10.append(", parsedMessageRowId=");
        A10.append(this.A02);
        A10.append(", embeddedE2EContentForSend=");
        return AnonymousClass001.A1F(this.A00, A10);
    }

    public AnonymousClass97M() {
        this((AnonymousClass206) null, (Long) null);
    }
}
