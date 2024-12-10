package X;

/* renamed from: X.6EW  reason: invalid class name */
public final class AnonymousClass6EW extends C131626lP {
    public final String A00 = "acs.whatsapp.com";
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6EW) {
                AnonymousClass6EW r5 = (AnonymousClass6EW) obj;
                if (!"acs.whatsapp.com".equals("acs.whatsapp.com") || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass6EW(String str) {
        this.A01 = str;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A01, C17880vN.A03("acs.whatsapp.com"));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MusicCreationReporting(requestHost=");
        A10.append("acs.whatsapp.com");
        A10.append(", variables=");
        return C17900vP.A0B(this.A01, A10);
    }
}
