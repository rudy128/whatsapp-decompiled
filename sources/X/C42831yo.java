package X;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1yo  reason: invalid class name and case insensitive filesystem */
public class C42831yo implements Externalizable {
    public static final long serialVersionUID = 1;
    public int countryCode_ = 0;
    public C42911yw emergency_ = null;
    public C42911yw fixedLine_ = null;
    public C42911yw generalDesc_ = null;
    public boolean hasCountryCode;
    public boolean hasEmergency;
    public boolean hasFixedLine;
    public boolean hasGeneralDesc;
    public boolean hasId;
    public boolean hasInternationalPrefix;
    public boolean hasLeadingDigits;
    public boolean hasLeadingZeroPossible;
    public boolean hasMainCountryForCode;
    public boolean hasMobile;
    public boolean hasNationalPrefix;
    public boolean hasNationalPrefixForParsing;
    public boolean hasNationalPrefixTransformRule;
    public boolean hasNoInternationalDialling;
    public boolean hasPager;
    public boolean hasPersonalNumber;
    public boolean hasPreferredExtnPrefix;
    public boolean hasPreferredInternationalPrefix;
    public boolean hasPremiumRate;
    public boolean hasSameMobileAndFixedLinePattern;
    public boolean hasSharedCost;
    public boolean hasTollFree;
    public boolean hasUan;
    public boolean hasVoicemail;
    public boolean hasVoip;
    public String id_ = "";
    public String internationalPrefix_ = "";
    public List intlNumberFormat_ = new ArrayList();
    public String leadingDigits_ = "";
    public boolean leadingZeroPossible_ = false;
    public boolean mainCountryForCode_ = false;
    public C42911yw mobile_ = null;
    public String nationalPrefixForParsing_ = "";
    public String nationalPrefixTransformRule_ = "";
    public String nationalPrefix_ = "";
    public C42911yw noInternationalDialling_ = null;
    public List numberFormat_ = new ArrayList();
    public C42911yw pager_ = null;
    public C42911yw personalNumber_ = null;
    public String preferredExtnPrefix_ = "";
    public String preferredInternationalPrefix_ = "";
    public C42911yw premiumRate_ = null;
    public boolean sameMobileAndFixedLinePattern_ = false;
    public C42911yw sharedCost_ = null;
    public C42911yw tollFree_ = null;
    public C42911yw uan_ = null;
    public C42911yw voicemail_ = null;
    public C42911yw voip_ = null;

    public void writeExternal(ObjectOutput objectOutput) {
        int i;
        objectOutput.writeBoolean(this.hasGeneralDesc);
        if (this.hasGeneralDesc) {
            this.generalDesc_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasFixedLine);
        if (this.hasFixedLine) {
            this.fixedLine_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasMobile);
        if (this.hasMobile) {
            this.mobile_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasTollFree);
        if (this.hasTollFree) {
            this.tollFree_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasPremiumRate);
        if (this.hasPremiumRate) {
            this.premiumRate_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasSharedCost);
        if (this.hasSharedCost) {
            this.sharedCost_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasPersonalNumber);
        if (this.hasPersonalNumber) {
            this.personalNumber_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasVoip);
        if (this.hasVoip) {
            this.voip_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasPager);
        if (this.hasPager) {
            this.pager_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasUan);
        if (this.hasUan) {
            this.uan_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasVoicemail);
        if (this.hasVoicemail) {
            this.voicemail_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasEmergency);
        if (this.hasEmergency) {
            this.emergency_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasNoInternationalDialling);
        if (this.hasNoInternationalDialling) {
            this.noInternationalDialling_.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.id_);
        objectOutput.writeInt(this.countryCode_);
        objectOutput.writeUTF(this.internationalPrefix_);
        objectOutput.writeBoolean(this.hasPreferredInternationalPrefix);
        if (this.hasPreferredInternationalPrefix) {
            objectOutput.writeUTF(this.preferredInternationalPrefix_);
        }
        objectOutput.writeBoolean(this.hasNationalPrefix);
        if (this.hasNationalPrefix) {
            objectOutput.writeUTF(this.nationalPrefix_);
        }
        objectOutput.writeBoolean(this.hasPreferredExtnPrefix);
        if (this.hasPreferredExtnPrefix) {
            objectOutput.writeUTF(this.preferredExtnPrefix_);
        }
        objectOutput.writeBoolean(this.hasNationalPrefixForParsing);
        if (this.hasNationalPrefixForParsing) {
            objectOutput.writeUTF(this.nationalPrefixForParsing_);
        }
        objectOutput.writeBoolean(this.hasNationalPrefixTransformRule);
        if (this.hasNationalPrefixTransformRule) {
            objectOutput.writeUTF(this.nationalPrefixTransformRule_);
        }
        objectOutput.writeBoolean(this.sameMobileAndFixedLinePattern_);
        int size = this.numberFormat_.size();
        objectOutput.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            ((C42901yv) this.numberFormat_.get(i2)).writeExternal(objectOutput);
        }
        List list = this.intlNumberFormat_;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        objectOutput.writeInt(i);
        for (int i3 = 0; i3 < i; i3++) {
            ((C42901yv) this.intlNumberFormat_.get(i3)).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.mainCountryForCode_);
        objectOutput.writeBoolean(this.hasLeadingDigits);
        if (this.hasLeadingDigits) {
            objectOutput.writeUTF(this.leadingDigits_);
        }
        objectOutput.writeBoolean(this.leadingZeroPossible_);
    }

    public void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            C42911yw r1 = new C42911yw();
            r1.readExternal(objectInput);
            this.hasGeneralDesc = true;
            this.generalDesc_ = r1;
        }
        if (objectInput.readBoolean()) {
            C42911yw r12 = new C42911yw();
            r12.readExternal(objectInput);
            this.hasFixedLine = true;
            this.fixedLine_ = r12;
        }
        if (objectInput.readBoolean()) {
            C42911yw r13 = new C42911yw();
            r13.readExternal(objectInput);
            this.hasMobile = true;
            this.mobile_ = r13;
        }
        if (objectInput.readBoolean()) {
            C42911yw r14 = new C42911yw();
            r14.readExternal(objectInput);
            this.hasTollFree = true;
            this.tollFree_ = r14;
        }
        if (objectInput.readBoolean()) {
            C42911yw r15 = new C42911yw();
            r15.readExternal(objectInput);
            this.hasPremiumRate = true;
            this.premiumRate_ = r15;
        }
        if (objectInput.readBoolean()) {
            C42911yw r16 = new C42911yw();
            r16.readExternal(objectInput);
            this.hasSharedCost = true;
            this.sharedCost_ = r16;
        }
        if (objectInput.readBoolean()) {
            C42911yw r17 = new C42911yw();
            r17.readExternal(objectInput);
            this.hasPersonalNumber = true;
            this.personalNumber_ = r17;
        }
        if (objectInput.readBoolean()) {
            C42911yw r18 = new C42911yw();
            r18.readExternal(objectInput);
            this.hasVoip = true;
            this.voip_ = r18;
        }
        if (objectInput.readBoolean()) {
            C42911yw r19 = new C42911yw();
            r19.readExternal(objectInput);
            this.hasPager = true;
            this.pager_ = r19;
        }
        if (objectInput.readBoolean()) {
            C42911yw r110 = new C42911yw();
            r110.readExternal(objectInput);
            this.hasUan = true;
            this.uan_ = r110;
        }
        if (objectInput.readBoolean()) {
            C42911yw r111 = new C42911yw();
            r111.readExternal(objectInput);
            this.hasVoicemail = true;
            this.voicemail_ = r111;
        }
        if (objectInput.readBoolean()) {
            C42911yw r112 = new C42911yw();
            r112.readExternal(objectInput);
            this.hasEmergency = true;
            this.emergency_ = r112;
        }
        if (objectInput.readBoolean()) {
            C42911yw r113 = new C42911yw();
            r113.readExternal(objectInput);
            this.hasNoInternationalDialling = true;
            this.noInternationalDialling_ = r113;
        }
        String readUTF = objectInput.readUTF();
        this.hasId = true;
        this.id_ = readUTF;
        int readInt = objectInput.readInt();
        this.hasCountryCode = true;
        this.countryCode_ = readInt;
        String readUTF2 = objectInput.readUTF();
        this.hasInternationalPrefix = true;
        this.internationalPrefix_ = readUTF2;
        if (objectInput.readBoolean()) {
            String readUTF3 = objectInput.readUTF();
            this.hasPreferredInternationalPrefix = true;
            this.preferredInternationalPrefix_ = readUTF3;
        }
        if (objectInput.readBoolean()) {
            String readUTF4 = objectInput.readUTF();
            this.hasNationalPrefix = true;
            this.nationalPrefix_ = readUTF4;
        }
        if (objectInput.readBoolean()) {
            String readUTF5 = objectInput.readUTF();
            this.hasPreferredExtnPrefix = true;
            this.preferredExtnPrefix_ = readUTF5;
        }
        if (objectInput.readBoolean()) {
            String readUTF6 = objectInput.readUTF();
            this.hasNationalPrefixForParsing = true;
            this.nationalPrefixForParsing_ = readUTF6;
        }
        if (objectInput.readBoolean()) {
            String readUTF7 = objectInput.readUTF();
            this.hasNationalPrefixTransformRule = true;
            this.nationalPrefixTransformRule_ = readUTF7;
        }
        boolean readBoolean = objectInput.readBoolean();
        this.hasSameMobileAndFixedLinePattern = true;
        this.sameMobileAndFixedLinePattern_ = readBoolean;
        int readInt2 = objectInput.readInt();
        for (int i = 0; i < readInt2; i++) {
            C42901yv r114 = new C42901yv();
            r114.readExternal(objectInput);
            this.numberFormat_.add(r114);
        }
        int readInt3 = objectInput.readInt();
        for (int i2 = 0; i2 < readInt3; i2++) {
            C42901yv r115 = new C42901yv();
            r115.readExternal(objectInput);
            this.intlNumberFormat_.add(r115);
        }
        boolean readBoolean2 = objectInput.readBoolean();
        this.hasMainCountryForCode = true;
        this.mainCountryForCode_ = readBoolean2;
        if (objectInput.readBoolean()) {
            String readUTF8 = objectInput.readUTF();
            this.hasLeadingDigits = true;
            this.leadingDigits_ = readUTF8;
        }
        boolean readBoolean3 = objectInput.readBoolean();
        this.hasLeadingZeroPossible = true;
        this.leadingZeroPossible_ = readBoolean3;
    }
}
