package X;

import java.util.List;

/* renamed from: X.2n8  reason: invalid class name and case insensitive filesystem */
public final class C59942n8 {
    public final int A00;
    public final int A01;
    public final Boolean A02;
    public final Boolean A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final List A0D;
    public final List A0E;
    public final List A0F;
    public final boolean A0G;
    public final String A0H;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59942n8) {
                C59942n8 r5 = (C59942n8) obj;
                if (this.A0G != r5.A0G || this.A01 != r5.A01 || !C18070vi.A18(this.A0B, r5.A0B) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A0A, r5.A0A) || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A0F, r5.A0F) || !C18070vi.A18(this.A0C, r5.A0C) || !C18070vi.A18(this.A0H, r5.A0H) || !C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A0E, r5.A0E) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A08, r5.A08) || !C18070vi.A18(this.A09, r5.A09) || !C18070vi.A18(this.A05, r5.A05) || this.A00 != r5.A00 || !C18070vi.A18(this.A0D, r5.A0D)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 1237;
        if (this.A0G) {
            i = 1231;
        }
        int i2 = 0;
        List list = this.A0F;
        int A0N = (((((AnonymousClass000.A0N(this.A0E, (((((AnonymousClass000.A0N(list, ((((((((((((i * 31) + this.A01) * 31) + C17900vP.A00(this.A0B)) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + C17900vP.A00(this.A04)) * 31) + C17900vP.A00(this.A0A)) * 31) + C17900vP.A00(this.A06)) * 31) + C17900vP.A00(this.A0C)) * 31) + C17900vP.A00(this.A0H)) * 31) + C17900vP.A00(this.A07)) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + C17900vP.A00(this.A08)) * 31) + C17900vP.A00(this.A09)) * 31;
        String str = this.A05;
        if (str != null) {
            i2 = str.hashCode();
        }
        return AnonymousClass000.A0O(this.A0D, (((A0N + i2) * 31) + this.A00) * 31);
    }

    public C59942n8(Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, List list2, List list3, int i, int i2, boolean z) {
        this.A0G = z;
        this.A01 = i;
        this.A0B = str;
        this.A02 = bool;
        this.A04 = str2;
        this.A0A = str3;
        this.A06 = str4;
        this.A0F = list;
        this.A0C = str5;
        this.A0H = str6;
        this.A07 = str7;
        this.A0E = list2;
        this.A03 = bool2;
        this.A08 = str8;
        this.A09 = str9;
        this.A05 = str10;
        this.A00 = i2;
        this.A0D = list3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UsyncBotResponseData(tagMatch=");
        A10.append(this.A0G);
        A10.append(", tag=");
        A10.append(this.A01);
        A10.append(", name=");
        A10.append(this.A0B);
        A10.append(", isDefault=");
        A10.append(this.A02);
        A10.append(", attributes=");
        A10.append(this.A04);
        A10.append(", description=");
        A10.append(this.A0A);
        A10.append(", category=");
        A10.append(this.A06);
        A10.append(", prompts=");
        A10.append(this.A0F);
        A10.append(", personaId=");
        A10.append(this.A0C);
        A10.append(", phoneNumberJid=");
        A10.append(this.A0H);
        A10.append(", commandsDescription=");
        A10.append(this.A07);
        A10.append(", commands=");
        A10.append(this.A0E);
        A10.append(", isMetaCreated=");
        A10.append(this.A03);
        A10.append(", creatorName=");
        A10.append(this.A08);
        A10.append(", creatorProfileUrl=");
        A10.append(this.A09);
        A10.append(", cardTitle=");
        A10.append(this.A05);
        A10.append(", count=");
        A10.append(this.A00);
        A10.append(", capabilities=");
        return AnonymousClass001.A1F(this.A0D, A10);
    }
}
