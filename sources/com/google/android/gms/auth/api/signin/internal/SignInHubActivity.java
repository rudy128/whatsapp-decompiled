package com.google.android.gms.auth.api.signin.internal;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1FL;
import X.AnonymousClass8BR;
import X.BE7;
import X.C108945cZ;
import X.C17880vN;
import X.C18210vx;
import X.C25666Cjw;
import X.C26033Cqt;
import X.C26144Ct7;
import X.C26624D6s;
import X.DUO;
import android.accounts.Account;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@KeepName
public class SignInHubActivity extends AnonymousClass1FL {
    public static boolean A05;
    public int A00;
    public Intent A01;
    public SignInConfiguration A02;
    public boolean A03 = false;
    public boolean A04;

    private final void A00(int i) {
        Status status = new Status(i, (String) null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        A05 = false;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        RuntimeException runtimeException;
        if (!this.A03) {
            setResult(0);
            if (i == 40962) {
                int i3 = 8;
                Intent intent2 = intent;
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent2.getParcelableExtra("signInAccount");
                    if (signInAccount != null && (googleSignInAccount = signInAccount.A00) != null) {
                        C25666Cjw A002 = C25666Cjw.A00(this);
                        GoogleSignInOptions googleSignInOptions = this.A02.A00;
                        synchronized (A002) {
                            C26033Cqt cqt = A002.A02;
                            C18210vx.A00(googleSignInOptions);
                            String str = googleSignInAccount.A08;
                            cqt.A04("defaultGoogleSignInAccount", str);
                            C18210vx.A00(googleSignInOptions);
                            String A1H = AnonymousClass001.A1H(":", str, AnonymousClass000.A11("googleSignInAccount"));
                            JSONObject A15 = C17880vN.A15();
                            try {
                                String str2 = googleSignInAccount.A04;
                                if (str2 != null) {
                                    A15.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2);
                                }
                                String str3 = googleSignInAccount.A05;
                                if (str3 != null) {
                                    A15.put("tokenId", str3);
                                }
                                String str4 = googleSignInAccount.A06;
                                if (str4 != null) {
                                    A15.put("email", str4);
                                }
                                String str5 = googleSignInAccount.A07;
                                if (str5 != null) {
                                    A15.put(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME, str5);
                                }
                                String str6 = googleSignInAccount.A09;
                                if (str6 != null) {
                                    A15.put("givenName", str6);
                                }
                                String str7 = googleSignInAccount.A0A;
                                if (str7 != null) {
                                    A15.put("familyName", str7);
                                }
                                Uri uri = googleSignInAccount.A03;
                                if (uri != null) {
                                    A15.put("photoUrl", uri.toString());
                                }
                                String str8 = googleSignInAccount.A00;
                                if (str8 != null) {
                                    A15.put("serverAuthCode", str8);
                                }
                                A15.put("expirationTime", googleSignInAccount.A02);
                                A15.put("obfuscatedIdentifier", str);
                                JSONArray A1A = AnonymousClass8BR.A1A();
                                List list = googleSignInAccount.A0B;
                                Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
                                Arrays.sort(scopeArr, DUO.A00);
                                for (Scope scope : scopeArr) {
                                    A1A.put(scope.A01);
                                }
                                A15.put("grantedScopes", A1A);
                                A15.remove("serverAuthCode");
                                cqt.A04(A1H, A15.toString());
                                String A1H2 = AnonymousClass001.A1H(":", str, AnonymousClass000.A11("googleSignInOptions"));
                                JSONObject A152 = C17880vN.A15();
                                try {
                                    JSONArray A1A2 = AnonymousClass8BR.A1A();
                                    ArrayList arrayList = googleSignInOptions.A08;
                                    Collections.sort(arrayList, GoogleSignInOptions.A0H);
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        A1A2.put(((Scope) it.next()).A01);
                                    }
                                    A152.put("scopes", A1A2);
                                    Account account = googleSignInOptions.A00;
                                    if (account != null) {
                                        A152.put("accountName", account.name);
                                    }
                                    A152.put("idTokenRequested", googleSignInOptions.A05);
                                    A152.put("forceCodeForRefreshToken", googleSignInOptions.A0A);
                                    A152.put("serverAuthRequested", googleSignInOptions.A09);
                                    String str9 = googleSignInOptions.A01;
                                    if (!TextUtils.isEmpty(str9)) {
                                        A152.put("serverClientId", str9);
                                    }
                                    String str10 = googleSignInOptions.A02;
                                    if (!TextUtils.isEmpty(str10)) {
                                        A152.put("hostedDomain", str10);
                                    }
                                    cqt.A04(A1H2, A152.toString());
                                    A002.A00 = googleSignInAccount;
                                    A002.A01 = googleSignInOptions;
                                } catch (JSONException e) {
                                    runtimeException = AnonymousClass8BR.A0x(e);
                                    throw runtimeException;
                                }
                            } catch (JSONException e2) {
                                runtimeException = AnonymousClass8BR.A0x(e2);
                                throw runtimeException;
                            }
                        }
                        intent2.removeExtra("signInAccount");
                        intent2.putExtra("googleSignInAccount", googleSignInAccount);
                        this.A04 = true;
                        this.A00 = i2;
                        this.A01 = intent2;
                        C26144Ct7.A00(this).A03(new C26624D6s(this));
                        A05 = false;
                        return;
                    } else if (intent2.hasExtra("errorCode") && (i3 = intent2.getIntExtra("errorCode", 8)) == 13) {
                        i3 = 12501;
                    }
                }
                A00(i3);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        String str;
        String packageName;
        String str2;
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            str2 = "Null action";
        } else if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            str2 = "Action not implemented";
        } else {
            boolean equals = action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN");
            if (equals || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
                Bundle bundleExtra = intent.getBundleExtra("config");
                if (bundleExtra == null) {
                    str = "Activity started with no configuration.";
                } else {
                    SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
                    if (signInConfiguration == null) {
                        str = "Activity started with invalid configuration.";
                    } else {
                        this.A02 = signInConfiguration;
                        if (bundle != null) {
                            boolean z = bundle.getBoolean("signingInGoogleApiClients");
                            this.A04 = z;
                            if (z) {
                                this.A00 = bundle.getInt("signInResultCode");
                                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                                if (intent2 == null) {
                                    str = "Sign in result data cannot be null";
                                } else {
                                    this.A01 = intent2;
                                    C26144Ct7.A00(this).A03(new C26624D6s(this));
                                    A05 = false;
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else if (A05) {
                            setResult(0);
                            A00(12502);
                            return;
                        } else {
                            A05 = true;
                            Intent A0G = C108945cZ.A0G(action);
                            if (equals) {
                                packageName = "com.google.android.gms";
                            } else {
                                packageName = getPackageName();
                            }
                            A0G.setPackage(packageName);
                            A0G.putExtra("config", this.A02);
                            try {
                                startActivityForResult(A0G, 40962);
                                return;
                            } catch (ActivityNotFoundException unused) {
                                this.A03 = true;
                                Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                                A00(17);
                                return;
                            }
                        }
                    }
                }
                Log.e("AuthSignInClient", str);
                setResult(0);
            } else {
                BE7.A1K("Unknown action: ", String.valueOf(intent.getAction()), "AuthSignInClient");
            }
            finish();
            return;
        }
        Log.e("AuthSignInClient", str2);
        A00(12500);
    }

    public final void onDestroy() {
        super.onDestroy();
        A05 = false;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.A04);
        if (this.A04) {
            bundle.putInt("signInResultCode", this.A00);
            bundle.putParcelable("signInResultData", this.A01);
        }
    }
}
