package androidx.credentials.playservices.controllers.BeginSignIn;

import X.AnonymousClass000;
import X.AnonymousClass1Y1;
import X.BKA;
import X.BKB;
import X.C18070vi;
import X.C18210vx;
import X.C23111BbQ;
import X.C23125Bbe;
import X.C23130Bbj;
import X.C23139Bbs;
import X.C23140Bbt;
import X.C24740CIc;
import X.C24899COs;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;

public final class BeginSignInControllerUtility {
    public static final long AUTH_MIN_VERSION_JSON_PARSING = 231815000;
    public static final long AUTH_MIN_VERSION_PREFER_IMME_CRED = 241217000;
    public static final Companion Companion = new Object();
    public static final String TAG = "BeginSignInUtility";

    public final class Companion {
        private final boolean needsBackwardsCompatibleRequest(long j) {
            return j < BeginSignInControllerUtility.AUTH_MIN_VERSION_JSON_PARSING;
        }

        public final C23140Bbt constructBeginSignInRequest$credentials_play_services_auth_release(C24740CIc cIc, Context context) {
            C24740CIc cIc2 = cIc;
            Context context2 = context;
            boolean A17 = C18070vi.A17(cIc2, context2);
            boolean z = false;
            C23111BbQ bbQ = new C23111BbQ(false);
            C23139Bbs bbs = new C23139Bbs((String) null, (String) null, (String) null, (List) null, false, A17, false);
            C23130Bbj bbj = new C23130Bbj((byte[]) null, (String) null, false);
            C23125Bbe bbe = new C23125Bbe(false, (String) null);
            long determineDeviceGMSVersionCode = determineDeviceGMSVersionCode(context2);
            boolean z2 = false;
            for (C24899COs cOs : cIc2.A00) {
                if ((cOs instanceof BKB) && !z2) {
                    boolean needsBackwardsCompatibleRequest = needsBackwardsCompatibleRequest(determineDeviceGMSVersionCode);
                    PublicKeyCredentialControllerUtility.Companion companion = PublicKeyCredentialControllerUtility.Companion;
                    BKB bkb = (BKB) cOs;
                    if (needsBackwardsCompatibleRequest) {
                        bbj = companion.convertToPlayAuthPasskeyRequest(bkb);
                        C18210vx.A00(bbj);
                    } else {
                        bbe = companion.convertToPlayAuthPasskeyJsonRequest(bkb);
                        C18210vx.A00(bbe);
                    }
                    z2 = true;
                }
            }
            if (determineDeviceGMSVersionCode > 241217000) {
                z = true;
            }
            return new C23140Bbt(bbs, bbe, bbj, bbQ, (String) null, 0, false, z);
        }

        private final C23139Bbs convertToGoogleIdTokenOption(BKA bka) {
            throw AnonymousClass000.A0s("getFilterByAuthorizedAccounts");
        }

        private final long determineDeviceGMSVersionCode(Context context) {
            PackageManager packageManager = context.getPackageManager();
            C18070vi.A0X(packageManager);
            return (long) packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        }

        public /* synthetic */ Companion(AnonymousClass1Y1 r1) {
        }

        public Companion() {
        }
    }
}
