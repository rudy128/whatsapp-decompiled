package com.fbpay.auth.models;

import java.util.Collections;
import java.util.List;

public class PttPayload {
    public final String mAppId;
    public final String mAtFBID;
    public final String mAuthTicketType;
    public final List mCaps;
    public final String mCredId;
    public final String mCsc;
    public final String mDeviceId;
    public final String mEncryptedPaypalAccessToken;
    public final String mPin;
    public final String mPublicKey;
    public final String mSsoAccessToken;

    public static PttPayload deleteBio(String str) {
        return new PttPayload((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, str, (String) null);
    }

    public PttPayload(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, String str8, String str9, String str10) {
        this.mAuthTicketType = str;
        this.mDeviceId = str2;
        this.mAppId = str3;
        this.mPin = str4;
        this.mCsc = str5;
        this.mCredId = str6;
        this.mEncryptedPaypalAccessToken = str7;
        this.mCaps = list;
        this.mPublicKey = str8;
        this.mAtFBID = str9;
        this.mSsoAccessToken = str10;
    }

    public static PttPayload byBio(String str, String str2, String str3, List list) {
        return new PttPayload("BIO", str, str2, (String) null, (String) null, (String) null, (String) null, Collections.unmodifiableList(list), str3, (String) null, (String) null);
    }

    public static PttPayload byCsc(String str, String str2, String str3, String str4, String str5, List list) {
        return new PttPayload("CSC", str, str2, (String) null, str3, str4, (String) null, Collections.unmodifiableList(list), str5, (String) null, (String) null);
    }

    public static PttPayload byPayPal(String str, String str2, String str3, String str4, String str5, List list) {
        return new PttPayload("PAYPAL_ACCESS_TOKEN", str, str2, (String) null, (String) null, str4, str3, Collections.unmodifiableList(list), str5, (String) null, (String) null);
    }

    public static PttPayload byPin(String str, String str2, String str3, String str4, List list) {
        return new PttPayload("PIN", str, str2, str3, (String) null, (String) null, (String) null, Collections.unmodifiableList(list), str4, (String) null, (String) null);
    }

    public static PttPayload bySso(String str, String str2, String str3, String str4, String str5, List list) {
        return new PttPayload(str, str2, str3, (String) null, (String) null, (String) null, (String) null, Collections.unmodifiableList(list), str5, (String) null, str4);
    }

    public String getAppId() {
        return this.mAppId;
    }

    public String getAtFBID() {
        return this.mAtFBID;
    }

    public String getAuthTicketType() {
        return this.mAuthTicketType;
    }

    public List getCaps() {
        return this.mCaps;
    }

    public String getCredId() {
        return this.mCredId;
    }

    public String getCsc() {
        return this.mCsc;
    }

    public String getDeviceId() {
        return this.mDeviceId;
    }

    public String getEncryptedPaypalAccessToken() {
        return this.mEncryptedPaypalAccessToken;
    }

    public String getPin() {
        return this.mPin;
    }

    public String getPublicKey() {
        return this.mPublicKey;
    }

    public String getSsoAccessToken() {
        return this.mSsoAccessToken;
    }
}
