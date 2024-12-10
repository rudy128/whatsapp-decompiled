package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1D6;
import X.AnonymousClass1D7;
import X.AnonymousClass1Y1;
import X.AnonymousClass1YF;
import X.AnonymousClass8BS;
import X.AnonymousClass8BT;
import X.AnonymousClass8BW;
import X.AnonymousClass8ES;
import X.BE7;
import X.BE9;
import X.BK3;
import X.BKB;
import X.BKE;
import X.BKJ;
import X.BKL;
import X.BKO;
import X.BKP;
import X.BKR;
import X.BKS;
import X.BKY;
import X.C0X;
import X.C0Z;
import X.C108985cd;
import X.C17880vN;
import X.C17900vP;
import X.C18070vi;
import X.C18210vx;
import X.C1V;
import X.C200610r;
import X.C22677BKa;
import X.C22679BKc;
import X.C22681BKe;
import X.C22682BKf;
import X.C22687BKk;
import X.C22689BKm;
import X.C22691BKo;
import X.C23027Ba3;
import X.C23115BbU;
import X.C23116BbV;
import X.C23118BbX;
import X.C23119BbY;
import X.C23120BbZ;
import X.C23121Bba;
import X.C23122Bbb;
import X.C23123Bbc;
import X.C23125Bbe;
import X.C23130Bbj;
import X.C23142Bbv;
import X.C23144Bbx;
import X.C23150Bc3;
import X.C23153Bc9;
import X.C23157BcD;
import X.C23158BcE;
import X.C23159BcF;
import X.C23169BcP;
import X.C23173BcT;
import X.C23204Bcy;
import X.C23206Bd0;
import X.C23229Bdf;
import X.C23230Bdg;
import X.C23232Bdi;
import X.C24366C0b;
import X.C24367C0c;
import X.C24398C1t;
import X.C24742CIe;
import X.C2O;
import X.C41381wH;
import X.C72463Mc;
import X.CXT;
import X.D41;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class PublicKeyCredentialControllerUtility {
    public static final long AUTH_MIN_VERSION_JSON_CREATE = 241217000;
    public static final Companion Companion = new Object();
    public static final int FLAGS = 11;
    public static final String JSON_KEY_ALG = "alg";
    public static final String JSON_KEY_APPID = "appid";
    public static final String JSON_KEY_ATTESTATION = "attestation";
    public static final String JSON_KEY_ATTESTATION_OBJ = "attestationObject";
    public static final String JSON_KEY_AUTH_ATTACHMENT = "authenticatorAttachment";
    public static final String JSON_KEY_AUTH_DATA = "authenticatorData";
    public static final String JSON_KEY_AUTH_SELECTION = "authenticatorSelection";
    public static final String JSON_KEY_CHALLENGE = "challenge";
    public static final String JSON_KEY_CLIENT_DATA = "clientDataJSON";
    public static final String JSON_KEY_CLIENT_EXTENSION_RESULTS = "clientExtensionResults";
    public static final String JSON_KEY_CRED_PROPS = "credProps";
    public static final String JSON_KEY_DISPLAY_NAME = "displayName";
    public static final String JSON_KEY_EXCLUDE_CREDENTIALS = "excludeCredentials";
    public static final String JSON_KEY_EXTENSTIONS = "extensions";
    public static final String JSON_KEY_ICON = "icon";
    public static final String JSON_KEY_ID = "id";
    public static final String JSON_KEY_KEY_PROTECTION_TYPE = "keyProtectionType";
    public static final String JSON_KEY_MATCHER_PROTECTION_TYPE = "matcherProtectionType";
    public static final String JSON_KEY_NAME = "name";
    public static final String JSON_KEY_PUB_KEY_CRED_PARAMS = "pubKeyCredParams";
    public static final String JSON_KEY_RAW_ID = "rawId";
    public static final String JSON_KEY_REQUIRE_RES_KEY = "requireResidentKey";
    public static final String JSON_KEY_RESPONSE = "response";
    public static final String JSON_KEY_RES_KEY = "residentKey";
    public static final String JSON_KEY_RK = "rk";
    public static final String JSON_KEY_RP = "rp";
    public static final String JSON_KEY_RPID = "rpId";
    public static final String JSON_KEY_SIGNATURE = "signature";
    public static final String JSON_KEY_THIRD_PARTY_PAYMENT = "thirdPartyPayment";
    public static final String JSON_KEY_TIMEOUT = "timeout";
    public static final String JSON_KEY_TRANSPORTS = "transports";
    public static final String JSON_KEY_TYPE = "type";
    public static final String JSON_KEY_USER = "user";
    public static final String JSON_KEY_USER_HANDLE = "userHandle";
    public static final String JSON_KEY_USER_VERIFICATION_METHOD = "userVerificationMethod";
    public static final String TAG = "PublicKeyUtility";
    public static final LinkedHashMap orderedErrorCodeToExceptions;

    public final class Companion {
        public final void addAuthenticatorAttestationResponse$credentials_play_services_auth_release(byte[] bArr, byte[] bArr2, String[] strArr, JSONObject jSONObject) {
            C18070vi.A0d(bArr, 0);
            C18070vi.A0o(bArr2, strArr, jSONObject);
            JSONObject A15 = C17880vN.A15();
            String str = PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA;
            String encodeToString = Base64.encodeToString(bArr, 11);
            C18070vi.A0X(encodeToString);
            A15.put(str, encodeToString);
            String str2 = PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION_OBJ;
            String encodeToString2 = Base64.encodeToString(bArr2, 11);
            C18070vi.A0X(encodeToString2);
            A15.put(str2, encodeToString2);
            A15.put(PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS, new JSONArray(strArr));
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, A15);
        }

        public final byte[] b64Decode(String str) {
            C18070vi.A0d(str, 0);
            byte[] A1a = BE7.A1a(str);
            C18070vi.A0X(A1a);
            return A1a;
        }

        public final String b64Encode(byte[] bArr) {
            C18070vi.A0d(bArr, 0);
            String A0x = AnonymousClass8BT.A0x(bArr);
            C18070vi.A0X(A0x);
            return A0x;
        }

        public final C24398C1t beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release(C0X c0x, String str) {
            C18070vi.A0d(c0x, 0);
            C24742CIe cIe = (C24742CIe) PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions.get(c0x);
            if (cIe == null) {
                return new AnonymousClass8ES(new C22691BKo(), AnonymousClass001.A1H("unknown fido gms exception - ", str, AnonymousClass000.A10()));
            }
            if (c0x == C0X.NOT_ALLOWED_ERR && str != null && AnonymousClass1YF.A0Y(str, "Unable to get sync account", false)) {
                return new BKJ("Passkey retrieval was cancelled by the user.");
            }
            return new AnonymousClass8ES(cIe, str);
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [X.CXT, java.lang.Object] */
        public final C23232Bdi convertJSON$credentials_play_services_auth_release(JSONObject jSONObject) {
            C18070vi.A0d(jSONObject, 0);
            ? obj = new Object();
            parseRequiredChallengeAndUser$credentials_play_services_auth_release(jSONObject, obj);
            parseRequiredRpAndParams$credentials_play_services_auth_release(jSONObject, obj);
            parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release(jSONObject, obj);
            parseOptionalTimeout$credentials_play_services_auth_release(jSONObject, obj);
            parseOptionalAuthenticatorSelection$credentials_play_services_auth_release(jSONObject, obj);
            parseOptionalExtensions$credentials_play_services_auth_release(jSONObject, obj);
            return obj.A00();
        }

        public final C23125Bbe convertToPlayAuthPasskeyJsonRequest(BKB bkb) {
            C18070vi.A0d(bkb, 0);
            return new C23125Bbe(true, bkb.A00);
        }

        public final C23130Bbj convertToPlayAuthPasskeyRequest(BKB bkb) {
            C18070vi.A0d(bkb, 0);
            JSONObject A16 = C17880vN.A16(bkb.A00);
            String optString = A16.optString(PublicKeyCredentialControllerUtility.JSON_KEY_RPID, "");
            if (AnonymousClass8BS.A00(optString) != 0) {
                return new C23130Bbj(getChallenge(A16), optString, true);
            }
            throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
        }

        public final void parseOptionalExtensions$credentials_play_services_auth_release(JSONObject jSONObject, CXT cxt) {
            JSONObject jSONObject2 = jSONObject;
            CXT cxt2 = cxt;
            boolean A17 = C18070vi.A17(jSONObject2, cxt2);
            String str = PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS;
            if (jSONObject2.has(str)) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(str);
                C23144Bbx bbx = null;
                C23116BbV bbV = null;
                C23115BbU bbU = null;
                String optString = jSONObject3.optString(PublicKeyCredentialControllerUtility.JSON_KEY_APPID, "");
                if (AnonymousClass8BS.A00(optString) > 0) {
                    bbx = new C23144Bbx(optString);
                }
                if (jSONObject3.optBoolean(PublicKeyCredentialControllerUtility.JSON_KEY_THIRD_PARTY_PAYMENT, false)) {
                    bbU = new C23115BbU(A17);
                }
                if (jSONObject3.optBoolean("uvm", false)) {
                    bbV = new C23116BbV(A17);
                }
                cxt2.A01 = new C23169BcP(bbx, bbU, bbV, (C23118BbX) null, (C23119BbY) null, (C23120BbZ) null, (C23159BcF) null, (C23206Bd0) null, (C23121Bba) null, (C23122Bbb) null, (C23027Ba3) null, (C23123Bbc) null);
            }
        }

        public final C2O publicKeyCredentialResponseContainsError(C23204Bcy bcy) {
            C18070vi.A0d(bcy, 0);
            Object obj = bcy.A02;
            if (obj == null && (obj = bcy.A01) == null && (obj = bcy.A03) == null) {
                throw AnonymousClass000.A0n("No response set.");
            } else if (!(obj instanceof C23229Bdf)) {
                return null;
            } else {
                C23229Bdf bdf = (C23229Bdf) obj;
                C0X c0x = bdf.A00;
                C18070vi.A0X(c0x);
                C24742CIe cIe = (C24742CIe) PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions.get(c0x);
                String str = bdf.A01;
                if (cIe == null) {
                    return C2O.A00(new C22691BKo(), AnonymousClass001.A1H("unknown fido gms exception - ", str, AnonymousClass000.A10()));
                }
                if (c0x == C0X.NOT_ALLOWED_ERR && str != null && AnonymousClass1YF.A0Y(str, "Unable to get sync account", false)) {
                    return new BKE("Passkey registration was cancelled by the user.");
                }
                return C2O.A00(cIe, str);
            }
        }

        public final String toAssertPasskeyResponse(C23142Bbv bbv) {
            Object obj;
            C18070vi.A0d(bbv, 0);
            JSONObject A15 = C17880vN.A15();
            C23204Bcy bcy = bbv.A01;
            if (bcy != null) {
                obj = bcy.A02;
                if (obj == null && (obj = bcy.A01) == null && (obj = bcy.A03) == null) {
                    throw AnonymousClass000.A0n("No response set.");
                }
            } else {
                obj = null;
            }
            C18070vi.A0b(obj);
            if (obj instanceof C23229Bdf) {
                C23229Bdf bdf = (C23229Bdf) obj;
                C0X c0x = bdf.A00;
                C18070vi.A0X(c0x);
                throw beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release(c0x, bdf.A01);
            } else if (obj instanceof C23230Bdg) {
                try {
                    String A02 = bcy.A02();
                    C18070vi.A0X(A02);
                    return A02;
                } catch (Throwable th) {
                    throw new BKL(C17900vP.A0C("The PublicKeyCredential response json had an unexpected exception when parsing: ", AnonymousClass000.A10(), th));
                }
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("AuthenticatorResponse expected assertion response but got: ");
                AnonymousClass8BW.A1M(obj, A10);
                Log.e(PublicKeyCredentialControllerUtility.TAG, A10.toString());
                return C18070vi.A0H(A15);
            }
        }

        private final byte[] getChallenge(JSONObject jSONObject) {
            String optString = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE, "");
            if (AnonymousClass8BS.A00(optString) != 0) {
                byte[] A1a = BE7.A1a(optString);
                C18070vi.A0X(A1a);
                return A1a;
            }
            throw new JSONException("Challenge not found in request or is unexpectedly empty");
        }

        private final boolean isDeviceGMSVersionOlderThan(Context context, long j) {
            long j2;
            if (C41381wH.A00.A02(context, 12451000) != 0) {
                return false;
            }
            PackageManager packageManager = context.getPackageManager();
            C18070vi.A0X(packageManager);
            int i = Build.VERSION.SDK_INT;
            PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 0);
            if (i >= 28) {
                C18070vi.A0X(packageInfo);
                j2 = GetGMSVersion.getVersionLong(packageInfo);
            } else {
                j2 = (long) packageInfo.versionCode;
            }
            if (j2 > j) {
                return true;
            }
            return false;
        }

        public final String getJSON_KEY_ALG$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ALG;
        }

        public final String getJSON_KEY_APPID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_APPID;
        }

        public final String getJSON_KEY_ATTESTATION$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION;
        }

        public final String getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION_OBJ;
        }

        public final String getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_ATTACHMENT;
        }

        public final String getJSON_KEY_AUTH_DATA$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_DATA;
        }

        public final String getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_SELECTION;
        }

        public final String getJSON_KEY_CHALLENGE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE;
        }

        public final String getJSON_KEY_CLIENT_DATA$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA;
        }

        public final String getJSON_KEY_CLIENT_EXTENSION_RESULTS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_EXTENSION_RESULTS;
        }

        public final String getJSON_KEY_CRED_PROPS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CRED_PROPS;
        }

        public final String getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME;
        }

        public final String getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXCLUDE_CREDENTIALS;
        }

        public final String getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS;
        }

        public final String getJSON_KEY_ICON$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ICON;
        }

        public final String getJSON_KEY_ID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        }

        public final String getJSON_KEY_KEY_PROTECTION_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_KEY_PROTECTION_TYPE;
        }

        public final String getJSON_KEY_MATCHER_PROTECTION_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_MATCHER_PROTECTION_TYPE;
        }

        public final String getJSON_KEY_NAME$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        }

        public final String getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_PUB_KEY_CRED_PARAMS;
        }

        public final String getJSON_KEY_RAW_ID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RAW_ID;
        }

        public final String getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_REQUIRE_RES_KEY;
        }

        public final String getJSON_KEY_RESPONSE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
        }

        public final String getJSON_KEY_RES_KEY$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RES_KEY;
        }

        public final String getJSON_KEY_RK$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RK;
        }

        public final String getJSON_KEY_RP$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RP;
        }

        public final String getJSON_KEY_RPID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RPID;
        }

        public final String getJSON_KEY_SIGNATURE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE;
        }

        public final String getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_THIRD_PARTY_PAYMENT;
        }

        public final String getJSON_KEY_TIMEOUT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
        }

        public final String getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS;
        }

        public final String getJSON_KEY_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        }

        public final String getJSON_KEY_USER$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        }

        public final String getJSON_KEY_USER_HANDLE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_HANDLE;
        }

        public final String getJSON_KEY_USER_VERIFICATION_METHOD$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_VERIFICATION_METHOD;
        }

        public final LinkedHashMap getOrderedErrorCodeToExceptions$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions;
        }

        public final boolean checkAlgSupported(int i) {
            try {
                D41.A00(i);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        public final C23232Bdi convert(BK3 bk3, Context context) {
            C18070vi.A0h(bk3, context);
            boolean isDeviceGMSVersionOlderThan = isDeviceGMSVersionOlderThan(context, 241217000);
            String str = bk3.A00;
            if (isDeviceGMSVersionOlderThan) {
                return new C23232Bdi(str);
            }
            return convertJSON$credentials_play_services_auth_release(C17880vN.A16(str));
        }

        public final void parseOptionalAuthenticatorSelection$credentials_play_services_auth_release(JSONObject jSONObject, CXT cxt) {
            C24367C0c c0c;
            String obj;
            String obj2;
            boolean A15 = C18070vi.A15(jSONObject, cxt);
            String str = PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_SELECTION;
            if (jSONObject.has(str)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                C0Z c0z = null;
                boolean optBoolean = jSONObject2.optBoolean(PublicKeyCredentialControllerUtility.JSON_KEY_REQUIRE_RES_KEY, A15);
                String optString = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_RES_KEY, "");
                if (AnonymousClass8BS.A00(optString) > 0) {
                    c0c = C24367C0c.A00(optString);
                } else {
                    c0c = null;
                }
                Boolean valueOf = Boolean.valueOf(optBoolean);
                String optString2 = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_ATTACHMENT, "");
                if (AnonymousClass8BS.A00(optString2) > 0) {
                    c0z = C0Z.A00(optString2);
                }
                if (c0z == null) {
                    obj = null;
                } else {
                    obj = c0z.toString();
                }
                if (c0c == null) {
                    obj2 = null;
                } else {
                    obj2 = c0c.toString();
                }
                cxt.A02 = new C23173BcT(valueOf, obj, (String) null, obj2);
            }
        }

        public final void parseOptionalTimeout$credentials_play_services_auth_release(JSONObject jSONObject, CXT cxt) {
            C18070vi.A0h(jSONObject, cxt);
            String str = PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
            if (jSONObject.has(str)) {
                cxt.A05 = Double.valueOf(((double) jSONObject.getLong(str)) / 1000.0d);
            }
        }

        public final void parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release(JSONObject jSONObject, CXT cxt) {
            ArrayList arrayList;
            C18070vi.A0h(jSONObject, cxt);
            ArrayList A13 = AnonymousClass000.A13();
            String str = PublicKeyCredentialControllerUtility.JSON_KEY_EXCLUDE_CREDENTIALS;
            if (jSONObject.has(str)) {
                JSONArray jSONArray = jSONObject.getJSONArray(str);
                int length = jSONArray.length();
                int i = 0;
                while (i < length) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    byte[] A1a = BE7.A1a(C18070vi.A0J(PublicKeyCredentialControllerUtility.JSON_KEY_ID, jSONObject2));
                    C18070vi.A0X(A1a);
                    String string = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                    if (AnonymousClass8BS.A00(string) == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor type value is not found or unexpectedly empty");
                    } else if (A1a.length != 0) {
                        String str2 = PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS;
                        if (jSONObject2.has(str2)) {
                            arrayList = AnonymousClass000.A13();
                            JSONArray jSONArray2 = jSONObject2.getJSONArray(str2);
                            int length2 = jSONArray2.length();
                            int i2 = 0;
                            while (i2 < length2) {
                                try {
                                    arrayList.add(Transport.A00(jSONArray2.getString(i2)));
                                    i2++;
                                } catch (C1V e) {
                                    throw C2O.A00(new BKS(), e.getMessage());
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        A13.add(new C23157BcD(string, arrayList, A1a));
                        i++;
                    } else {
                        throw new JSONException("PublicKeyCredentialDescriptor id value is not found or unexpectedly empty");
                    }
                }
            }
            cxt.A07 = A13;
            String str3 = "none";
            String optString = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION, str3);
            if (AnonymousClass8BS.A00(optString) != 0) {
                str3 = optString;
            }
            cxt.A00 = C24366C0b.A00(str3);
        }

        public final void parseRequiredChallengeAndUser$credentials_play_services_auth_release(JSONObject jSONObject, CXT cxt) {
            C18070vi.A0h(jSONObject, cxt);
            byte[] challenge = getChallenge(jSONObject);
            C18210vx.A00(challenge);
            cxt.A08 = challenge;
            JSONObject jSONObject2 = jSONObject.getJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            byte[] A1a = BE7.A1a(C18070vi.A0J(PublicKeyCredentialControllerUtility.JSON_KEY_ID, jSONObject2));
            C18070vi.A0X(A1a);
            String string = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            String string2 = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME);
            String optString = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, "");
            if (AnonymousClass8BS.A00(string2) == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing displayName or they are unexpectedly empty");
            } else if (A1a.length == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user id or they are unexpectedly empty");
            } else if (AnonymousClass8BS.A00(string) != 0) {
                cxt.A04 = new C23158BcE(string, optString, string2, A1a);
            } else {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user name or they are unexpectedly empty");
            }
        }

        public final void parseRequiredRpAndParams$credentials_play_services_auth_release(JSONObject jSONObject, CXT cxt) {
            C18070vi.A0h(jSONObject, cxt);
            JSONObject jSONObject2 = jSONObject.getJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_RP);
            String string = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            String optString = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "");
            String optString2 = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, "");
            C18070vi.A0b(optString2);
            if (optString2.length() == 0) {
                optString2 = null;
            }
            if (AnonymousClass8BS.A00(optString) == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp name is missing or unexpectedly empty");
            } else if (AnonymousClass8BS.A00(string) != 0) {
                cxt.A03 = new C23153Bc9(string, optString, optString2);
                JSONArray jSONArray = jSONObject.getJSONArray(PublicKeyCredentialControllerUtility.JSON_KEY_PUB_KEY_CRED_PARAMS);
                ArrayList A13 = AnonymousClass000.A13();
                int length = jSONArray.length();
                int i = 0;
                while (i < length) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    int i2 = (int) jSONObject3.getLong(PublicKeyCredentialControllerUtility.JSON_KEY_ALG);
                    String optString3 = jSONObject3.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "");
                    if (AnonymousClass8BS.A00(optString3) != 0) {
                        try {
                            D41.A00(i2);
                            A13.add(new C23150Bc3(optString3, i2));
                        } catch (Throwable unused) {
                        }
                        i++;
                    } else {
                        throw new JSONException("PublicKeyCredentialCreationOptions PublicKeyCredentialParameter type missing or unexpectedly empty");
                    }
                }
                cxt.A06 = A13;
            } else {
                throw new JSONException("PublicKeyCredentialCreationOptions rp ID is missing or unexpectedly empty");
            }
        }

        public /* synthetic */ Companion(AnonymousClass1Y1 r1) {
        }

        public Companion() {
        }
    }

    public final class GetGMSVersion {
        public static final GetGMSVersion INSTANCE = new Object();

        public static final long getVersionLong(PackageInfo packageInfo) {
            C18070vi.A0d(packageInfo, 0);
            return packageInfo.getLongVersionCode();
        }
    }

    public static final C23232Bdi convert(BK3 bk3, Context context) {
        return Companion.convert(bk3, context);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility$Companion, java.lang.Object] */
    static {
        AnonymousClass1D6[] r2 = new AnonymousClass1D6[12];
        C72463Mc.A1H(C0X.UNKNOWN_ERR, new C22691BKo(), r2);
        C108985cd.A1G(C0X.ABORT_ERR, new BKO(), r2);
        C72463Mc.A1I(C0X.ATTESTATION_NOT_PRIVATE_ERR, new C22681BKe(), r2);
        C72463Mc.A1J(C0X.CONSTRAINT_ERR, new BKP(), r2);
        AnonymousClass8BW.A1L(C0X.DATA_ERR, new BKR(), r2);
        BE9.A1E(C0X.INVALID_STATE_ERR, new BKY(), r2);
        BE9.A1F(C0X.ENCODING_ERR, new BKS(), r2);
        r2[7] = AnonymousClass1D6.A01(C0X.NETWORK_ERR, new C22677BKa());
        r2[8] = AnonymousClass1D6.A01(C0X.NOT_ALLOWED_ERR, new C22679BKc());
        r2[9] = AnonymousClass1D6.A01(C0X.NOT_SUPPORTED_ERR, new C22682BKf());
        r2[10] = AnonymousClass1D6.A01(C0X.SECURITY_ERR, new C22687BKk());
        r2[11] = AnonymousClass1D6.A01(C0X.TIMEOUT_ERR, new C22689BKm());
        LinkedHashMap linkedHashMap = new LinkedHashMap(C200610r.A03(12));
        AnonymousClass1D7.A0K(linkedHashMap, r2);
        orderedErrorCodeToExceptions = linkedHashMap;
    }
}
