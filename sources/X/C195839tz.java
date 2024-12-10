package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.9tz  reason: invalid class name and case insensitive filesystem */
public final class C195839tz {
    public long A00 = 1;
    public boolean A01;
    public final int A02;
    public final C194419rh A03;
    public final Jid A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195839tz) {
                C195839tz r8 = (C195839tz) obj;
                if (this.A00 != r8.A00 || this.A02 != r8.A02 || !C18070vi.A18(this.A04, r8.A04) || !C18070vi.A18(this.A07, r8.A07) || !C18070vi.A18(this.A0B, r8.A0B) || !C18070vi.A18(this.A0C, r8.A0C) || !C18070vi.A18(this.A09, r8.A09) || this.A0D != r8.A0D || !C18070vi.A18(this.A0A, r8.A0A) || this.A01 != r8.A01 || !C18070vi.A18(this.A08, r8.A08) || !C18070vi.A18(this.A06, r8.A06) || !C18070vi.A18(this.A05, r8.A05) || !C18070vi.A18(this.A03, r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C195839tz(C194419rh r3, Jid jid, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, boolean z, boolean z2) {
        this.A02 = i;
        this.A04 = jid;
        this.A07 = str;
        this.A0B = str2;
        this.A0C = str3;
        this.A09 = str4;
        this.A0D = z;
        this.A0A = str5;
        this.A01 = z2;
        this.A08 = str6;
        this.A06 = str7;
        this.A05 = str8;
        this.A03 = r3;
    }

    public int hashCode() {
        return ((((((AnonymousClass0DV.A00(C17890vO.A02(this.A0A, AnonymousClass0DV.A00((C17890vO.A02(this.A0C, C17890vO.A02(this.A0B, C17890vO.A02(this.A07, AnonymousClass000.A0N(this.A04, (AnonymousClass8BV.A00(this.A00) + this.A02) * 31)))) + C17900vP.A00(this.A09)) * 31, this.A0D)), this.A01) + C17900vP.A00(this.A08)) * 31) + C17900vP.A00(this.A06)) * 31) + C17900vP.A00(this.A05)) * 31) + C17880vN.A02(this.A03);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FlowsScreenProgressReportMetadata(sequenceNumber=");
        A10.append(this.A00);
        A10.append(", bizPlatform=");
        A10.append(this.A02);
        A10.append(", businessOwnerJid=");
        A10.append(this.A04);
        A10.append(", flowId=");
        A10.append(this.A07);
        A10.append(", messageId=");
        A10.append(this.A0B);
        A10.append(", sessionId=");
        A10.append(this.A0C);
        A10.append(", flowsCategories=");
        A10.append(this.A09);
        A10.append(", isTemplate=");
        A10.append(this.A0D);
        A10.append(", hsmTag=");
        A10.append(this.A0A);
        A10.append(", flowRestoredFromCache=");
        A10.append(this.A01);
        A10.append(", flowStatus=");
        A10.append(this.A08);
        A10.append(", entryPointConversionSource=");
        A10.append(this.A06);
        A10.append(", entryPointConversionApp=");
        A10.append(this.A05);
        A10.append(", entryPointMetaData=");
        return AnonymousClass001.A1F(this.A03, A10);
    }
}
