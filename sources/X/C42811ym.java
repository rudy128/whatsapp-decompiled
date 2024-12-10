package X;

import java.io.Serializable;

/* renamed from: X.1ym  reason: invalid class name and case insensitive filesystem */
public class C42811ym implements Serializable {
    public static final long serialVersionUID = 1;
    public C42821yn countryCodeSource_ = C42821yn.FROM_NUMBER_WITH_PLUS_SIGN;
    public int countryCode_ = 0;
    public String extension_ = "";
    public boolean hasCountryCode;
    public boolean hasCountryCodeSource;
    public boolean hasExtension;
    public boolean hasItalianLeadingZero;
    public boolean hasNationalNumber;
    public boolean hasPreferredDomesticCarrierCode;
    public boolean hasRawInput;
    public boolean hasSecondLeadingZero;
    public boolean italianLeadingZero_ = false;
    public long nationalNumber_ = 0;
    public String preferredDomesticCarrierCode_ = "";
    public String rawInput_ = "";
    public boolean secondLeadingZero_ = false;

    public boolean A01(C42811ym r7) {
        if (r7 == null) {
            return false;
        }
        if (this == r7) {
            return true;
        }
        return this.countryCode_ == r7.countryCode_ && this.nationalNumber_ == r7.nationalNumber_ && this.extension_.equals(r7.extension_) && this.italianLeadingZero_ == r7.italianLeadingZero_ && this.rawInput_.equals(r7.rawInput_) && this.countryCodeSource_ == r7.countryCodeSource_ && this.preferredDomesticCarrierCode_.equals(r7.preferredDomesticCarrierCode_) && this.hasPreferredDomesticCarrierCode == r7.hasPreferredDomesticCarrierCode && this.secondLeadingZero_ == r7.secondLeadingZero_;
    }

    public void A00(C42811ym r4) {
        if (r4.hasCountryCode) {
            int i = r4.countryCode_;
            this.hasCountryCode = true;
            this.countryCode_ = i;
        }
        if (r4.hasNationalNumber) {
            long j = r4.nationalNumber_;
            this.hasNationalNumber = true;
            this.nationalNumber_ = j;
        }
        if (r4.hasExtension) {
            String str = r4.extension_;
            if (str != null) {
                this.hasExtension = true;
                this.extension_ = str;
            } else {
                throw new NullPointerException();
            }
        }
        if (r4.hasItalianLeadingZero) {
            boolean z = r4.italianLeadingZero_;
            this.hasItalianLeadingZero = true;
            this.italianLeadingZero_ = z;
        }
        if (r4.hasRawInput) {
            String str2 = r4.rawInput_;
            if (str2 != null) {
                this.hasRawInput = true;
                this.rawInput_ = str2;
            } else {
                throw new NullPointerException();
            }
        }
        if (r4.hasCountryCodeSource) {
            C42821yn r1 = r4.countryCodeSource_;
            if (r1 != null) {
                this.hasCountryCodeSource = true;
                this.countryCodeSource_ = r1;
            } else {
                throw new NullPointerException();
            }
        }
        if (r4.hasPreferredDomesticCarrierCode) {
            String str3 = r4.preferredDomesticCarrierCode_;
            if (str3 != null) {
                this.hasPreferredDomesticCarrierCode = true;
                this.preferredDomesticCarrierCode_ = str3;
            } else {
                throw new NullPointerException();
            }
        }
        if (r4.hasSecondLeadingZero) {
            boolean z2 = r4.secondLeadingZero_;
            this.hasSecondLeadingZero = true;
            this.secondLeadingZero_ = z2;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C42811ym) || !A01((C42811ym) obj)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (((((2173 + this.countryCode_) * 53) + Long.valueOf(this.nationalNumber_).hashCode()) * 53) + this.extension_.hashCode()) * 53;
        int i = 1231;
        int i2 = 1237;
        if (this.italianLeadingZero_) {
            i2 = 1231;
        }
        int hashCode2 = (((((((hashCode + i2) * 53) + this.rawInput_.hashCode()) * 53) + this.countryCodeSource_.hashCode()) * 53) + this.preferredDomesticCarrierCode_.hashCode()) * 53;
        int i3 = 1237;
        if (this.hasPreferredDomesticCarrierCode) {
            i3 = 1231;
        }
        int i4 = (hashCode2 + i3) * 53;
        if (!this.secondLeadingZero_) {
            i = 1237;
        }
        return i4 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Country Code: ");
        sb.append(this.countryCode_);
        sb.append(" National Number: ");
        sb.append(this.nationalNumber_);
        if (this.hasItalianLeadingZero && this.italianLeadingZero_) {
            sb.append(" Leading Zero: true");
        }
        if (this.hasExtension) {
            sb.append(" Extension: ");
            sb.append(this.extension_);
        }
        if (this.hasCountryCodeSource) {
            sb.append(" Country Code Source: ");
            sb.append(this.countryCodeSource_);
        }
        if (this.hasPreferredDomesticCarrierCode) {
            sb.append(" Preferred Domestic Carrier Code: ");
            sb.append(this.preferredDomesticCarrierCode_);
        }
        if (this.hasSecondLeadingZero && this.secondLeadingZero_) {
            sb.append(" Second Leading Zero: true");
        }
        return sb.toString();
    }
}
