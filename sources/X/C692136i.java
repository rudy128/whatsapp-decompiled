package X;

/* renamed from: X.36i  reason: invalid class name and case insensitive filesystem */
public final class C692136i implements AnonymousClass25D {
    public final C179539Ij A00;
    public final C179479Ic A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C692136i) {
                C692136i r5 = (C692136i) obj;
                if (this.A01 != r5.A01 || this.A00 != r5.A00 || !C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A0k = ((((((((((((AnonymousClass001.A0k(this.A01) * 31) + AnonymousClass001.A0k(this.A00)) * 31) + C17900vP.A00(this.A07)) * 31) + C17900vP.A00(this.A04)) * 31) + C17900vP.A00(this.A05)) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + C17900vP.A00(this.A06)) * 31;
        String str = this.A03;
        if (str != null) {
            i = str.hashCode();
        }
        return A0k + i;
    }

    public C692136i(C179539Ij r1, C179479Ic r2, Integer num, String str, String str2, String str3, String str4, String str5) {
        this.A01 = r2;
        this.A00 = r1;
        this.A07 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A02 = num;
        this.A06 = str4;
        this.A03 = str5;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BotPluginMetadata(provider=");
        A10.append(this.A01);
        A10.append(", pluginType=");
        A10.append(this.A00);
        A10.append(", thumbnailCdnUrl=");
        A10.append(this.A07);
        A10.append(", profilePhotoCdnUrl=");
        A10.append(this.A04);
        A10.append(", searchProviderUrl=");
        A10.append(this.A05);
        A10.append(", referenceIndex=");
        A10.append(this.A02);
        A10.append(", searchQuery=");
        A10.append(this.A06);
        A10.append(", faviconCdnUrl=");
        return C17900vP.A0B(this.A03, A10);
    }
}
