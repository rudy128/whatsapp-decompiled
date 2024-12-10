package X;

import com.whatsapp.contact.picker.ContactPickerFragment;
import java.util.HashSet;

/* renamed from: X.6uB  reason: invalid class name and case insensitive filesystem */
public final class C136666uB {
    public final C199429zz A00;
    public final ContactPickerFragment A01;
    public final AnonymousClass1BI A02;
    public final HashSet A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    public C136666uB(C199429zz r2, ContactPickerFragment contactPickerFragment, AnonymousClass1BI r4, HashSet hashSet, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        C18070vi.A0d(hashSet, 2);
        this.A01 = contactPickerFragment;
        this.A03 = hashSet;
        this.A02 = r4;
        this.A0A = z;
        this.A06 = z2;
        this.A0I = z3;
        this.A09 = z4;
        this.A0C = z5;
        this.A0H = z6;
        this.A07 = z7;
        this.A0B = z8;
        this.A0D = z9;
        this.A0G = z10;
        this.A0E = z11;
        this.A08 = z12;
        this.A04 = z13;
        this.A05 = z14;
        this.A0F = z15;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136666uB) {
                C136666uB r5 = (C136666uB) obj;
                if (!(C18070vi.A18(this.A01, r5.A01) && C18070vi.A18(this.A03, r5.A03) && C18070vi.A18(this.A02, r5.A02) && this.A0A == r5.A0A && this.A06 == r5.A06 && this.A0I == r5.A0I && this.A09 == r5.A09 && this.A0C == r5.A0C && this.A0H == r5.A0H && this.A07 == r5.A07 && this.A0B == r5.A0B && this.A0D == r5.A0D && this.A0G == r5.A0G && this.A0E == r5.A0E && this.A08 == r5.A08 && this.A04 == r5.A04 && this.A05 == r5.A05 && this.A0F == r5.A0F && C18070vi.A18(this.A00, r5.A00))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00((AnonymousClass000.A0N(this.A03, AnonymousClass000.A0L(this.A01)) + AnonymousClass001.A0k(this.A02)) * 31, this.A0A), this.A06), this.A0I), this.A09), this.A0C), this.A0H), this.A07), this.A0B), this.A0D), this.A0G), this.A0E), this.A08), this.A04), this.A05), this.A0F) + C17880vN.A02(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Params(fragment=");
        A10.append(this.A01);
        A10.append(", messageTypes=");
        A10.append(this.A03);
        A10.append(", forwardFromJid=");
        A10.append(this.A02);
        A10.append(", usageEmailHistory=");
        A10.append(this.A0A);
        A10.append(", usageBlockContact=");
        A10.append(this.A06);
        A10.append(", usageShare=");
        A10.append(this.A0I);
        A10.append(", usageCreateShortcut=");
        A10.append(this.A09);
        A10.append(", usageForward=");
        A10.append(this.A0C);
        A10.append(", usageSetGroupIcon=");
        A10.append(this.A0H);
        A10.append(", usageCallPicker=");
        A10.append(this.A07);
        A10.append(", usageForGroupCall=");
        A10.append(this.A0B);
        A10.append(", usageNewChat=");
        A10.append(this.A0D);
        A10.append(", usageSend=");
        A10.append(this.A0G);
        A10.append(", usagePayment=");
        A10.append(this.A0E);
        A10.append(", usageContactsList=");
        A10.append(this.A08);
        A10.append(", enforceHFMLimit=");
        A10.append(this.A04);
        A10.append(", usageAudienceSelection=");
        A10.append(this.A05);
        A10.append(", usageSelectStatusMentions=");
        A10.append(this.A0F);
        A10.append(", callSuggestionsResult=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
