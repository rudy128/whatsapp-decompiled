package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.24e  reason: invalid class name and case insensitive filesystem */
public final class C446324e {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final UserJid A04;
    public final Boolean A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final List A0G;
    public final List A0H;
    public final boolean A0I;
    public final boolean A0J;

    public C446324e(UserJid userJid, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, List list2, int i, int i2, long j, long j2, boolean z, boolean z2) {
        C18070vi.A0d(userJid, 1);
        this.A04 = userJid;
        this.A01 = i;
        this.A0E = str;
        this.A0I = z;
        this.A06 = str2;
        this.A0D = str3;
        this.A09 = str4;
        this.A0H = list;
        this.A07 = str5;
        this.A0F = str6;
        this.A0A = str7;
        this.A0G = list2;
        this.A0J = z2;
        this.A0B = str8;
        this.A0C = str9;
        this.A08 = str10;
        this.A00 = i2;
        this.A02 = j;
        this.A03 = j2;
        this.A05 = bool;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C446324e) {
                C446324e r8 = (C446324e) obj;
                if (!C18070vi.A18(this.A04, r8.A04) || this.A01 != r8.A01 || !C18070vi.A18(this.A0E, r8.A0E) || this.A0I != r8.A0I || !C18070vi.A18(this.A06, r8.A06) || !C18070vi.A18(this.A0D, r8.A0D) || !C18070vi.A18(this.A09, r8.A09) || !C18070vi.A18(this.A0H, r8.A0H) || !C18070vi.A18(this.A07, r8.A07) || !C18070vi.A18(this.A0F, r8.A0F) || !C18070vi.A18(this.A0A, r8.A0A) || !C18070vi.A18(this.A0G, r8.A0G) || this.A0J != r8.A0J || !C18070vi.A18(this.A0B, r8.A0B) || !C18070vi.A18(this.A0C, r8.A0C) || !C18070vi.A18(this.A08, r8.A08) || this.A00 != r8.A00 || this.A02 != r8.A02 || this.A03 != r8.A03 || !C18070vi.A18(this.A05, r8.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BotProfile(userJid=");
        sb.append(this.A04);
        sb.append(", tag=");
        sb.append(this.A01);
        sb.append(", name=");
        sb.append(this.A0E);
        sb.append(", isDefault=");
        sb.append(this.A0I);
        sb.append(", attributes=");
        sb.append(this.A06);
        sb.append(", description=");
        sb.append(this.A0D);
        sb.append(", category=");
        sb.append(this.A09);
        sb.append(", prompts=");
        sb.append(this.A0H);
        sb.append(", avatarUrl=");
        sb.append(this.A07);
        sb.append(", personaId=");
        sb.append(this.A0F);
        sb.append(", commandsDescription=");
        sb.append(this.A0A);
        sb.append(", commands=");
        sb.append(this.A0G);
        sb.append(", isMetaCreated=");
        sb.append(this.A0J);
        sb.append(", creatorName=");
        sb.append(this.A0B);
        sb.append(", creatorProfileUrl=");
        sb.append(this.A0C);
        sb.append(", cardTitle=");
        sb.append(this.A08);
        sb.append(", count=");
        sb.append(this.A00);
        sb.append(", capabilities=");
        sb.append(this.A02);
        sb.append(", lastUpdatedTimeMs=");
        sb.append(this.A03);
        sb.append(", createdByMe=");
        sb.append(this.A05);
        sb.append(')');
        return sb.toString();
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7 = ((((this.A04.hashCode() * 31) + this.A01) * 31) + this.A0E.hashCode()) * 31;
        int i = 1237;
        if (this.A0I) {
            i = 1231;
        }
        int hashCode8 = (((((((((hashCode7 + i) * 31) + this.A06.hashCode()) * 31) + this.A0D.hashCode()) * 31) + this.A09.hashCode()) * 31) + this.A0H.hashCode()) * 31;
        String str = this.A07;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = (hashCode8 + hashCode) * 31;
        String str2 = this.A0F;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        String str3 = this.A0A;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int hashCode9 = (((i4 + hashCode3) * 31) + this.A0G.hashCode()) * 31;
        int i5 = 1237;
        if (this.A0J) {
            i5 = 1231;
        }
        int i6 = (hashCode9 + i5) * 31;
        String str4 = this.A0B;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i7 = (i6 + hashCode4) * 31;
        String str5 = this.A0C;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i8 = (i7 + hashCode5) * 31;
        String str6 = this.A08;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        long j = this.A02;
        long j2 = this.A03;
        int i9 = (((((((i8 + hashCode6) * 31) + this.A00) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Boolean bool = this.A05;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return i9 + i2;
    }
}
