package com.google.android.play.core.integrity.model;

import X.AnonymousClass000;
import X.BE7;
import X.BEA;
import X.C17880vN;
import java.util.HashMap;
import java.util.Map;

public abstract class a {
    public static final Map a;
    public static final Map b;

    public static String a(int i) {
        Map map = a;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return "";
        }
        Map map2 = b;
        if (!map2.containsKey(valueOf)) {
            return "";
        }
        return BEA.A0l(" (https://developer.android.com/google/play/integrity/reference/com/google/android/play/core/integrity/model/IntegrityErrorCode.html#", C17880vN.A0s(valueOf, map2), AnonymousClass000.A11(C17880vN.A0s(valueOf, map)));
    }

    static {
        HashMap A11 = C17880vN.A11();
        a = A11;
        HashMap A112 = C17880vN.A11();
        b = A112;
        Integer A0Z = BE7.A0Z();
        A11.put(A0Z, "Integrity API is not available.\nIntegrity API is not enabled, or the Play Store version might be old.\nRecommended actions:\n1) Make sure that Integrity API is enabled in Google Play Console.\n2) Ask the user to update Play Store.\n");
        A11.put(-2, "The Play Store app is either not installed or not the official version.\nAsk the user to install an official and recent version of Play Store.\n");
        A11.put(-3, "Network error: unable to obtain integrity details.\nAsk the user to check for a connection.\n");
        A11.put(-4, "No active account found in the Play Store app. Note that the Play Integrity API now supports unauthenticated requests. This error code is used only for older Play Store versions that lack support.\nAsk the user to authenticate in Play Store.\n");
        A11.put(-5, "PackageManager could not find this app.\nSomething is wrong (possibly an attack). Non-actionable.\n");
        A11.put(-6, "Google Play Services is not available or version is too old.\nAsk the user to Install or Update Play Services.\n");
        A11.put(-7, "The calling app UID (user id) does not match the one from Package Manager.\nSomething is wrong (possibly an attack). Non-actionable.\n");
        A11.put(-8, "The calling app is making too many requests to the API and hence is throttled.\nRetry with an exponential backoff.\n");
        A11.put(-9, "Binding to the service in the Play Store has failed. This can be due to having an old Play Store version installed on the device.\nAsk the user to update Play Store.\n");
        A11.put(-10, "Nonce length is too short. The nonce must be a minimum of 16 bytes (before base64 encoding) to allow for a better security.\nRetry with a longer nonce.\n");
        A11.put(-11, "Nonce length is too long. The nonce must be less than 500 bytes before base64 encoding.\nRetry with a shorter nonce.\n");
        A11.put(-12, "Unknown internal Google server error.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n");
        A11.put(-13, "Nonce is not encoded as a base64 web-safe no-wrap string.\nRetry with correct nonce format.\n");
        A11.put(-14, "The Play Store needs to be updated.\nAsk the user to update the Google Play Store.\n");
        A11.put(-15, "Play Services needs to be updated.\nAsk the user to update Google Play Services.\n");
        A11.put(-16, "The provided cloud project number is invalid.\nUse the cloud project number which can be found in Project info in your Google Cloud Console for the cloud project where Play Integrity API is enabled.\n");
        Integer A0Y = BE7.A0Y();
        A11.put(A0Y, "Unknown error processing integrity request.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n");
        A11.put(-17, "There is a transient error on the calling device.\nRetry with an exponential backoff.\n");
        A112.put(A0Z, "API_NOT_AVAILABLE");
        A112.put(-3, "NETWORK_ERROR");
        A112.put(-2, "PLAY_STORE_NOT_FOUND");
        A112.put(-4, "PLAY_STORE_ACCOUNT_NOT_FOUND");
        A112.put(-14, "PLAY_STORE_VERSION_OUTDATED");
        A112.put(-5, "APP_NOT_INSTALLED");
        A112.put(-6, "PLAY_SERVICES_NOT_FOUND");
        A112.put(-15, "PLAY_SERVICES_VERSION_OUTDATED");
        A112.put(-7, "APP_UID_MISMATCH");
        A112.put(-8, "TOO_MANY_REQUESTS");
        A112.put(-9, "CANNOT_BIND_TO_SERVICE");
        A112.put(-10, "NONCE_TOO_SHORT");
        A112.put(-11, "NONCE_TOO_LONG");
        A112.put(-13, "NONCE_IS_NOT_BASE64");
        A112.put(-16, "CLOUD_PROJECT_NUMBER_IS_INVALID");
        A112.put(-12, "GOOGLE_SERVER_UNAVAILABLE");
        A112.put(A0Y, "INTERNAL_ERROR");
        A112.put(-17, "CLIENT_TRANSIENT_ERROR");
    }
}
