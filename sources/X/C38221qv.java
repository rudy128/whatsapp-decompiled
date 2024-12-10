package X;

/* renamed from: X.1qv  reason: invalid class name and case insensitive filesystem */
public final class C38221qv {
    public final C36491nz A00;
    public final C36501o0 A01;
    public final C203411t A02;
    public final C37451pZ A03;
    public final C37471pb A04;
    public final C34021jm A05;
    public final C18000vb A06;
    public final C18030ve A07;
    public final AnonymousClass1DC A08;
    public final AnonymousClass00H A09;

    public C38221qv(C36491nz r2, C36501o0 r3, C203411t r4, C37451pZ r5, C37471pb r6, C34021jm r7, C18000vb r8, C18030ve r9, AnonymousClass1DC r10, AnonymousClass00H r11) {
        C18070vi.A0d(r6, 7);
        this.A07 = r9;
        this.A06 = r8;
        this.A08 = r10;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r5;
        this.A04 = r6;
        this.A02 = r4;
        this.A09 = r11;
        this.A05 = r7;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38221qv) {
                C38221qv r5 = (C38221qv) obj;
                if (!C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A08, r5.A08) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A09, r5.A09) || !C18070vi.A18(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((this.A07.hashCode() * 31) + this.A06.hashCode()) * 31) + this.A08.hashCode()) * 31) + this.A00.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A09.hashCode()) * 31) + this.A05.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RecyclerViewDelegateDependencies(abProps=");
        sb.append(this.A07);
        sb.append(", whatsAppLocale=");
        sb.append(this.A06);
        sb.append(", systemFeatures=");
        sb.append(this.A08);
        sb.append(", viewHolderFactory=");
        sb.append(this.A00);
        sb.append(", wdsViewHolderFactory=");
        sb.append(this.A01);
        sb.append(", contactPhotoLoader=");
        sb.append(this.A03);
        sb.append(", cancellableTaskRunner=");
        sb.append(this.A04);
        sb.append(", communityNavigator=");
        sb.append(this.A02);
        sb.append(", waAsyncInflaterManager=");
        sb.append(this.A09);
        sb.append(", conversationsListInterface=");
        sb.append(this.A05);
        sb.append(')');
        return sb.toString();
    }
}
