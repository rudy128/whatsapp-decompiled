package X;

import android.content.Context;
import android.credentials.CreateCredentialRequest;
import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialRequest;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.concurrent.Executor;

/* renamed from: X.D6f  reason: case insensitive filesystem */
public final class C26612D6f implements C22530BBn {
    public final CredentialManager A00;

    public boolean isAvailableOnDevice() {
        if (Build.VERSION.SDK_INT < 34 || this.A00 == null) {
            return false;
        }
        return true;
    }

    public void onCreateCredential(Context context, C24898COr cOr, CancellationSignal cancellationSignal, Executor executor, E7A e7a) {
        E7A e7a2 = e7a;
        C27464Dft dft = new C27464Dft(e7a2);
        CredentialManager credentialManager = this.A00;
        if (credentialManager == null) {
            dft.invoke();
            return;
        }
        OutcomeReceiver cz5 = new Cz5(cOr, e7a2, this);
        Bundle bundle = cOr.A01;
        CMO cmo = cOr.A02;
        Bundle A0D = C17880vN.A0D();
        A0D.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_ID", cmo.A01);
        CharSequence charSequence = cmo.A00;
        if (!TextUtils.isEmpty(charSequence)) {
            A0D.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME", charSequence);
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            A0D.putString("androidx.credentials.BUNDLE_KEY_DEFAULT_PROVIDER", (String) null);
        }
        A0D.putParcelable("androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON", Icon.createWithResource(context, 2131232157));
        bundle.putBundle("androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO", A0D);
        CreateCredentialRequest.Builder alwaysSendAppInfoToProvider = new CreateCredentialRequest.Builder("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle, cOr.A00).setIsSystemProviderRequired(false).setAlwaysSendAppInfoToProvider(true);
        C18070vi.A0X(alwaysSendAppInfoToProvider);
        CreateCredentialRequest build = alwaysSendAppInfoToProvider.build();
        C18070vi.A0X(build);
        credentialManager.createCredential(context, build, cancellationSignal, executor, cz5);
    }

    public void onGetCredential(Context context, C24740CIc cIc, CancellationSignal cancellationSignal, Executor executor, E7A e7a) {
        E7A e7a2 = e7a;
        C27465Dfu dfu = new C27465Dfu(e7a2);
        CredentialManager credentialManager = this.A00;
        if (credentialManager == null) {
            dfu.invoke();
            return;
        }
        OutcomeReceiver cz4 = new C26404Cz4(e7a2, this);
        Bundle A0D = C17880vN.A0D();
        A0D.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        A0D.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", true);
        A0D.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", (Parcelable) null);
        GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder(A0D);
        for (C24899COs cOs : cIc.A00) {
            builder.addCredentialOption(new CredentialOption.Builder("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", cOs.A01, cOs.A00).setIsSystemProviderRequired(false).setAllowedProviders(cOs.A02).build());
        }
        GetCredentialRequest build = builder.build();
        C18070vi.A0X(build);
        credentialManager.getCredential(context, build, cancellationSignal, executor, cz4);
    }

    public C26612D6f(Context context) {
        this.A00 = (CredentialManager) context.getSystemService("credential");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:14|15|16|17|18) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0058 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C24741CId A00(android.credentials.GetCredentialResponse r3) {
        /*
            android.credentials.Credential r0 = r3.getCredential()
            X.C18070vi.A0X(r0)
            java.lang.String r3 = r0.getType()
            X.C18070vi.A0X(r3)
            android.os.Bundle r2 = r0.getData()
            X.C18070vi.A0X(r2)
            java.lang.String r0 = "android.credentials.TYPE_PASSWORD_CREDENTIAL"
            boolean r0 = r3.equals(r0)     // Catch:{ C1E -> 0x006a }
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = "androidx.credentials.BUNDLE_KEY_ID"
            java.lang.String r1 = r2.getString(r0)     // Catch:{ Exception -> 0x0064 }
            java.lang.String r0 = "androidx.credentials.BUNDLE_KEY_PASSWORD"
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x0064 }
            X.C18070vi.A0b(r1)     // Catch:{ Exception -> 0x0064 }
            X.C18070vi.A0b(r0)     // Catch:{ Exception -> 0x0064 }
            X.BK8 r1 = new X.BK8     // Catch:{ Exception -> 0x0064 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0064 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x0064 }
            if (r0 > 0) goto L_0x007c
            java.lang.String r0 = "password should not be empty"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ Exception -> 0x0064 }
            throw r0     // Catch:{ Exception -> 0x0064 }
        L_0x0041:
            java.lang.String r0 = "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL"
            boolean r0 = r3.equals(r0)     // Catch:{ C1E -> 0x006a }
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = "androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON"
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x0058 }
            X.C18070vi.A0b(r0)     // Catch:{ Exception -> 0x0058 }
            X.BK9 r1 = new X.BK9     // Catch:{ Exception -> 0x0058 }
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x0058 }
            goto L_0x007c
        L_0x0058:
            X.C1E r0 = new X.C1E     // Catch:{ C1E -> 0x006a }
            r0.<init>()     // Catch:{ C1E -> 0x006a }
            goto L_0x0069
        L_0x005e:
            X.C1E r0 = new X.C1E     // Catch:{ C1E -> 0x006a }
            r0.<init>()     // Catch:{ C1E -> 0x006a }
            goto L_0x0069
        L_0x0064:
            X.C1E r0 = new X.C1E     // Catch:{ C1E -> 0x006a }
            r0.<init>()     // Catch:{ C1E -> 0x006a }
        L_0x0069:
            throw r0     // Catch:{ C1E -> 0x006a }
        L_0x006a:
            X.BK7 r1 = new X.BK7
            r1.<init>(r2)
            int r0 = r3.length()
            if (r0 > 0) goto L_0x007c
            java.lang.String r0 = "type should not be empty"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x007c:
            X.CId r0 = new X.CId
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26612D6f.A00(android.credentials.GetCredentialResponse):X.CId");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:144|145|146) */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x030b, code lost:
        return new X.AnonymousClass8EL(r3, r2);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:144:0x0306 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C2O A01(android.credentials.CreateCredentialException r5) {
        /*
            java.lang.String r1 = r5.getType()
            int r0 = r1.hashCode()
            switch(r0) {
                case -2055374133: goto L_0x005d;
                case 1316905704: goto L_0x004b;
                case 2092588512: goto L_0x0039;
                case 2131915191: goto L_0x0027;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.String r2 = r5.getType()
            X.C18070vi.A0X(r2)
            java.lang.String r1 = "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION"
            r0 = 0
            boolean r0 = X.AnonymousClass1YE.A0A(r2, r1, r0)
            if (r0 == 0) goto L_0x0318
            java.lang.String r3 = r5.getType()
            X.C18070vi.A0X(r3)
            java.lang.String r2 = r5.getMessage()
            goto L_0x006f
        L_0x0027:
            java.lang.String r0 = "android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.getMessage()
            X.BKG r4 = new X.BKG
            r4.<init>(r0)
            return r4
        L_0x0039:
            java.lang.String r0 = "android.credentials.CreateCredentialException.TYPE_INTERRUPTED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.getMessage()
            X.BKF r4 = new X.BKF
            r4.<init>(r0)
            return r4
        L_0x004b:
            java.lang.String r0 = "android.credentials.CreateCredentialException.TYPE_UNKNOWN"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.getMessage()
            X.BKH r4 = new X.BKH
            r4.<init>(r0)
            return r4
        L_0x005d:
            java.lang.String r0 = "android.credentials.CreateCredentialException.TYPE_USER_CANCELED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.getMessage()
            X.BKE r4 = new X.BKE
            r4.<init>(r0)
            return r4
        L_0x006f:
            boolean r0 = X.AnonymousClass1YF.A0V(r3, r1)     // Catch:{ C1E -> 0x0312 }
            if (r0 == 0) goto L_0x030c
            java.lang.String r5 = "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/"
            X.BKo r4 = new X.BKo     // Catch:{ C1E -> 0x0306 }
            r4.<init>()     // Catch:{ C1E -> 0x0306 }
            r1 = 0
            X.8EQ r0 = new X.8EQ     // Catch:{ C1E -> 0x0306 }
            r0.<init>(r4, r1)     // Catch:{ C1E -> 0x0306 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_ABORT_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0306 }
            if (r0 == 0) goto L_0x0098
            X.BKO r0 = new X.BKO     // Catch:{ C1E -> 0x0306 }
            r0.<init>()     // Catch:{ C1E -> 0x0306 }
            X.8EQ r4 = X.C2O.A00(r0, r2)     // Catch:{ C1E -> 0x0306 }
            return r4
        L_0x0098:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_CONSTRAINT_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0306 }
            if (r0 == 0) goto L_0x00ae
            X.BKP r0 = new X.BKP     // Catch:{ C1E -> 0x0306 }
            r0.<init>()     // Catch:{ C1E -> 0x0306 }
            X.8EQ r4 = X.C2O.A00(r0, r2)     // Catch:{ C1E -> 0x0306 }
            return r4
        L_0x00ae:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_DATA_CLONE_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0306 }
            if (r0 == 0) goto L_0x00c4
            X.BKQ r0 = new X.BKQ     // Catch:{ C1E -> 0x0306 }
            r0.<init>()     // Catch:{ C1E -> 0x0306 }
            X.8EQ r4 = X.C2O.A00(r0, r2)     // Catch:{ C1E -> 0x0306 }
            return r4
        L_0x00c4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_DATA_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0306 }
            if (r0 == 0) goto L_0x00da
            X.BKR r0 = new X.BKR     // Catch:{ C1E -> 0x0306 }
            r0.<init>()     // Catch:{ C1E -> 0x0306 }
            X.8EQ r4 = X.C2O.A00(r0, r2)     // Catch:{ C1E -> 0x0306 }
            return r4
        L_0x00da:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_ENCODING_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0306 }
            if (r0 == 0) goto L_0x00f0
            X.BKS r0 = new X.BKS     // Catch:{ C1E -> 0x0306 }
            r0.<init>()     // Catch:{ C1E -> 0x0306 }
            X.8EQ r4 = X.C2O.A00(r0, r2)     // Catch:{ C1E -> 0x0306 }
            return r4
        L_0x00f0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0306 }
            if (r0 == 0) goto L_0x0106
            X.BKT r0 = new X.BKT     // Catch:{ C1E -> 0x0306 }
            r0.<init>()     // Catch:{ C1E -> 0x0306 }
            X.8EQ r4 = X.C2O.A00(r0, r2)     // Catch:{ C1E -> 0x0306 }
            return r4
        L_0x0106:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0306 }
            if (r0 == 0) goto L_0x011c
            X.BKU r0 = new X.BKU     // Catch:{ C1E -> 0x0306 }
            r0.<init>()     // Catch:{ C1E -> 0x0306 }
            X.8EQ r4 = X.C2O.A00(r0, r2)     // Catch:{ C1E -> 0x0306 }
            return r4
        L_0x011c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_INVALID_CHARACTER_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0306 }
            if (r0 == 0) goto L_0x0132
            X.BKV r0 = new X.BKV     // Catch:{ C1E -> 0x0306 }
            r0.<init>()     // Catch:{ C1E -> 0x0306 }
            X.8EQ r4 = X.C2O.A00(r0, r2)     // Catch:{ C1E -> 0x0306 }
            return r4
        L_0x0132:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0306 }
            if (r0 == 0) goto L_0x0148
            X.BKW r0 = new X.BKW     // Catch:{ C1E -> 0x0306 }
            r0.<init>()     // Catch:{ C1E -> 0x0306 }
            X.8EQ r4 = X.C2O.A00(r0, r2)     // Catch:{ C1E -> 0x0306 }
            return r4
        L_0x0148:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0306 }
            if (r0 == 0) goto L_0x015e
            X.BKX r0 = new X.BKX     // Catch:{ C1E -> 0x0306 }
            r0.<init>()     // Catch:{ C1E -> 0x0306 }
            X.8EQ r4 = X.C2O.A00(r0, r2)     // Catch:{ C1E -> 0x0306 }
            return r4
        L_0x015e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_INVALID_STATE_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0306 }
            if (r0 == 0) goto L_0x0174
            X.BKY r0 = new X.BKY     // Catch:{ C1E -> 0x0306 }
            r0.<init>()     // Catch:{ C1E -> 0x0306 }
            X.8EQ r4 = X.C2O.A00(r0, r2)     // Catch:{ C1E -> 0x0306 }
            return r4
        L_0x0174:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_NAMESPACE_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0306 }
            if (r0 == 0) goto L_0x018a
            X.BKZ r0 = new X.BKZ     // Catch:{ C1E -> 0x0306 }
            r0.<init>()     // Catch:{ C1E -> 0x0306 }
            X.8EQ r4 = X.C2O.A00(r0, r2)     // Catch:{ C1E -> 0x0306 }
            return r4
        L_0x018a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_NETWORK_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0306 }
            if (r0 == 0) goto L_0x01a0
            X.BKa r0 = new X.BKa     // Catch:{ C1E -> 0x0306 }
            r0.<init>()     // Catch:{ C1E -> 0x0306 }
            X.8EQ r4 = X.C2O.A00(r0, r2)     // Catch:{ C1E -> 0x0306 }
            return r4
        L_0x01a0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0306 }
            if (r0 == 0) goto L_0x01b6
            X.BKb r0 = new X.BKb     // Catch:{ C1E -> 0x0306 }
            r0.<init>()     // Catch:{ C1E -> 0x0306 }
            X.8EQ r4 = X.C2O.A00(r0, r2)     // Catch:{ C1E -> 0x0306 }
            return r4
        L_0x01b6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_NOT_ALLOWED_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0306 }
            if (r0 == 0) goto L_0x01cc
            X.BKc r0 = new X.BKc     // Catch:{ C1E -> 0x0306 }
            r0.<init>()     // Catch:{ C1E -> 0x0306 }
            X.8EQ r4 = X.C2O.A00(r0, r2)     // Catch:{ C1E -> 0x0306 }
            return r4
        L_0x01cc:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_NOT_FOUND_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0306 }
            if (r0 == 0) goto L_0x01e2
            X.BKd r0 = new X.BKd     // Catch:{ C1E -> 0x0306 }
            r0.<init>()     // Catch:{ C1E -> 0x0306 }
            X.8EQ r4 = X.C2O.A00(r0, r2)     // Catch:{ C1E -> 0x0306 }
            return r4
        L_0x01e2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_NOT_READABLE_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0306 }
            if (r0 == 0) goto L_0x01f8
            X.BKe r0 = new X.BKe     // Catch:{ C1E -> 0x0306 }
            r0.<init>()     // Catch:{ C1E -> 0x0306 }
            X.8EQ r4 = X.C2O.A00(r0, r2)     // Catch:{ C1E -> 0x0306 }
            return r4
        L_0x01f8:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_NOT_SUPPORTED_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0306 }
            if (r0 == 0) goto L_0x020e
            X.BKf r0 = new X.BKf     // Catch:{ C1E -> 0x0306 }
            r0.<init>()     // Catch:{ C1E -> 0x0306 }
            X.8EQ r4 = X.C2O.A00(r0, r2)     // Catch:{ C1E -> 0x0306 }
            return r4
        L_0x020e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_OPERATION_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0306 }
            if (r0 == 0) goto L_0x0224
            X.BKg r0 = new X.BKg     // Catch:{ C1E -> 0x0306 }
            r0.<init>()     // Catch:{ C1E -> 0x0306 }
            X.8EQ r4 = X.C2O.A00(r0, r2)     // Catch:{ C1E -> 0x0306 }
            return r4
        L_0x0224:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_OPT_OUT_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0306 }
            if (r0 == 0) goto L_0x023a
            X.BKh r0 = new X.BKh     // Catch:{ C1E -> 0x0306 }
            r0.<init>()     // Catch:{ C1E -> 0x0306 }
            X.8EQ r4 = X.C2O.A00(r0, r2)     // Catch:{ C1E -> 0x0306 }
            return r4
        L_0x023a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0306 }
            if (r0 == 0) goto L_0x0250
            X.BKi r0 = new X.BKi     // Catch:{ C1E -> 0x0306 }
            r0.<init>()     // Catch:{ C1E -> 0x0306 }
            X.8EQ r4 = X.C2O.A00(r0, r2)     // Catch:{ C1E -> 0x0306 }
            return r4
        L_0x0250:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_READ_ONLY_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0306 }
            if (r0 == 0) goto L_0x0266
            X.BKj r0 = new X.BKj     // Catch:{ C1E -> 0x0306 }
            r0.<init>()     // Catch:{ C1E -> 0x0306 }
            X.8EQ r4 = X.C2O.A00(r0, r2)     // Catch:{ C1E -> 0x0306 }
            return r4
        L_0x0266:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_SECURITY_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0306 }
            if (r0 == 0) goto L_0x027c
            X.BKk r0 = new X.BKk     // Catch:{ C1E -> 0x0306 }
            r0.<init>()     // Catch:{ C1E -> 0x0306 }
            X.8EQ r4 = X.C2O.A00(r0, r2)     // Catch:{ C1E -> 0x0306 }
            return r4
        L_0x027c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_SYNTAX_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0306 }
            if (r0 == 0) goto L_0x0292
            X.BKl r0 = new X.BKl     // Catch:{ C1E -> 0x0306 }
            r0.<init>()     // Catch:{ C1E -> 0x0306 }
            X.8EQ r4 = X.C2O.A00(r0, r2)     // Catch:{ C1E -> 0x0306 }
            return r4
        L_0x0292:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_TIMEOUT_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0306 }
            if (r0 == 0) goto L_0x02a8
            X.BKm r0 = new X.BKm     // Catch:{ C1E -> 0x0306 }
            r0.<init>()     // Catch:{ C1E -> 0x0306 }
            X.8EQ r4 = X.C2O.A00(r0, r2)     // Catch:{ C1E -> 0x0306 }
            return r4
        L_0x02a8:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0306 }
            if (r0 == 0) goto L_0x02be
            X.BKn r0 = new X.BKn     // Catch:{ C1E -> 0x0306 }
            r0.<init>()     // Catch:{ C1E -> 0x0306 }
            X.8EQ r4 = X.C2O.A00(r0, r2)     // Catch:{ C1E -> 0x0306 }
            return r4
        L_0x02be:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_UNKNOWN_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0306 }
            if (r0 == 0) goto L_0x02d4
            X.BKo r0 = new X.BKo     // Catch:{ C1E -> 0x0306 }
            r0.<init>()     // Catch:{ C1E -> 0x0306 }
            X.8EQ r4 = X.C2O.A00(r0, r2)     // Catch:{ C1E -> 0x0306 }
            return r4
        L_0x02d4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_VERSION_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0306 }
            if (r0 == 0) goto L_0x02ea
            X.BKp r0 = new X.BKp     // Catch:{ C1E -> 0x0306 }
            r0.<init>()     // Catch:{ C1E -> 0x0306 }
            X.8EQ r4 = X.C2O.A00(r0, r2)     // Catch:{ C1E -> 0x0306 }
            return r4
        L_0x02ea:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0306 }
            if (r0 == 0) goto L_0x0300
            X.BKq r0 = new X.BKq     // Catch:{ C1E -> 0x0306 }
            r0.<init>()     // Catch:{ C1E -> 0x0306 }
            X.8EQ r4 = X.C2O.A00(r0, r2)     // Catch:{ C1E -> 0x0306 }
            return r4
        L_0x0300:
            X.C1E r0 = new X.C1E     // Catch:{ C1E -> 0x0306 }
            r0.<init>()     // Catch:{ C1E -> 0x0306 }
            throw r0     // Catch:{ C1E -> 0x0306 }
        L_0x0306:
            X.8EL r4 = new X.8EL     // Catch:{ C1E -> 0x0312 }
            r4.<init>(r3, r2)     // Catch:{ C1E -> 0x0312 }
            return r4
        L_0x030c:
            X.C1E r0 = new X.C1E     // Catch:{ C1E -> 0x0312 }
            r0.<init>()     // Catch:{ C1E -> 0x0312 }
            throw r0     // Catch:{ C1E -> 0x0312 }
        L_0x0312:
            X.8EL r4 = new X.8EL
            r4.<init>(r3, r2)
            return r4
        L_0x0318:
            java.lang.String r1 = r5.getType()
            X.C18070vi.A0X(r1)
            java.lang.String r0 = r5.getMessage()
            X.8EL r4 = new X.8EL
            r4.<init>(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26612D6f.A01(android.credentials.CreateCredentialException):X.C2O");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:145|146|147) */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0329, code lost:
        return new X.AnonymousClass8EN(r3, r2);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:145:0x0324 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C24398C1t A02(android.credentials.GetCredentialException r5) {
        /*
            java.lang.String r1 = r5.getType()
            int r0 = r1.hashCode()
            switch(r0) {
                case -781118336: goto L_0x005d;
                case -45448328: goto L_0x004b;
                case 580557411: goto L_0x0039;
                case 627896683: goto L_0x0027;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.String r2 = r5.getType()
            X.C18070vi.A0X(r2)
            java.lang.String r1 = "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION"
            r0 = 0
            boolean r0 = X.AnonymousClass1YE.A0A(r2, r1, r0)
            if (r0 == 0) goto L_0x0336
            java.lang.String r3 = r5.getType()
            X.C18070vi.A0X(r3)
            java.lang.String r2 = r5.getMessage()
            goto L_0x006f
        L_0x0027:
            java.lang.String r0 = "android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.getMessage()
            X.BKN r4 = new X.BKN
            r4.<init>(r0)
            return r4
        L_0x0039:
            java.lang.String r0 = "android.credentials.GetCredentialException.TYPE_USER_CANCELED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.getMessage()
            X.BKJ r4 = new X.BKJ
            r4.<init>(r0)
            return r4
        L_0x004b:
            java.lang.String r0 = "android.credentials.GetCredentialException.TYPE_INTERRUPTED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.getMessage()
            X.BKK r4 = new X.BKK
            r4.<init>(r0)
            return r4
        L_0x005d:
            java.lang.String r0 = "android.credentials.GetCredentialException.TYPE_UNKNOWN"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.getMessage()
            X.BKL r4 = new X.BKL
            r4.<init>(r0)
            return r4
        L_0x006f:
            r0 = 0
            boolean r0 = X.AnonymousClass1YE.A0A(r3, r1, r0)     // Catch:{ C1E -> 0x0330 }
            if (r0 == 0) goto L_0x032a
            java.lang.String r5 = "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/"
            X.BKo r4 = new X.BKo     // Catch:{ C1E -> 0x0324 }
            r4.<init>()     // Catch:{ C1E -> 0x0324 }
            r1 = 0
            X.8ES r0 = new X.8ES     // Catch:{ C1E -> 0x0324 }
            r0.<init>(r4, r1)     // Catch:{ C1E -> 0x0324 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_ABORT_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0324 }
            if (r0 == 0) goto L_0x009a
            X.BKO r0 = new X.BKO     // Catch:{ C1E -> 0x0324 }
            r0.<init>()     // Catch:{ C1E -> 0x0324 }
            X.8ES r4 = new X.8ES     // Catch:{ C1E -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ C1E -> 0x0324 }
            return r4
        L_0x009a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_CONSTRAINT_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0324 }
            if (r0 == 0) goto L_0x00b1
            X.BKP r0 = new X.BKP     // Catch:{ C1E -> 0x0324 }
            r0.<init>()     // Catch:{ C1E -> 0x0324 }
            X.8ES r4 = new X.8ES     // Catch:{ C1E -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ C1E -> 0x0324 }
            return r4
        L_0x00b1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_DATA_CLONE_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0324 }
            if (r0 == 0) goto L_0x00c8
            X.BKQ r0 = new X.BKQ     // Catch:{ C1E -> 0x0324 }
            r0.<init>()     // Catch:{ C1E -> 0x0324 }
            X.8ES r4 = new X.8ES     // Catch:{ C1E -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ C1E -> 0x0324 }
            return r4
        L_0x00c8:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_DATA_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0324 }
            if (r0 == 0) goto L_0x00df
            X.BKR r0 = new X.BKR     // Catch:{ C1E -> 0x0324 }
            r0.<init>()     // Catch:{ C1E -> 0x0324 }
            X.8ES r4 = new X.8ES     // Catch:{ C1E -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ C1E -> 0x0324 }
            return r4
        L_0x00df:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_ENCODING_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0324 }
            if (r0 == 0) goto L_0x00f6
            X.BKS r0 = new X.BKS     // Catch:{ C1E -> 0x0324 }
            r0.<init>()     // Catch:{ C1E -> 0x0324 }
            X.8ES r4 = new X.8ES     // Catch:{ C1E -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ C1E -> 0x0324 }
            return r4
        L_0x00f6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0324 }
            if (r0 == 0) goto L_0x010d
            X.BKT r0 = new X.BKT     // Catch:{ C1E -> 0x0324 }
            r0.<init>()     // Catch:{ C1E -> 0x0324 }
            X.8ES r4 = new X.8ES     // Catch:{ C1E -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ C1E -> 0x0324 }
            return r4
        L_0x010d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0324 }
            if (r0 == 0) goto L_0x0124
            X.BKU r0 = new X.BKU     // Catch:{ C1E -> 0x0324 }
            r0.<init>()     // Catch:{ C1E -> 0x0324 }
            X.8ES r4 = new X.8ES     // Catch:{ C1E -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ C1E -> 0x0324 }
            return r4
        L_0x0124:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_INVALID_CHARACTER_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0324 }
            if (r0 == 0) goto L_0x013b
            X.BKV r0 = new X.BKV     // Catch:{ C1E -> 0x0324 }
            r0.<init>()     // Catch:{ C1E -> 0x0324 }
            X.8ES r4 = new X.8ES     // Catch:{ C1E -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ C1E -> 0x0324 }
            return r4
        L_0x013b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0324 }
            if (r0 == 0) goto L_0x0152
            X.BKW r0 = new X.BKW     // Catch:{ C1E -> 0x0324 }
            r0.<init>()     // Catch:{ C1E -> 0x0324 }
            X.8ES r4 = new X.8ES     // Catch:{ C1E -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ C1E -> 0x0324 }
            return r4
        L_0x0152:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0324 }
            if (r0 == 0) goto L_0x0169
            X.BKX r0 = new X.BKX     // Catch:{ C1E -> 0x0324 }
            r0.<init>()     // Catch:{ C1E -> 0x0324 }
            X.8ES r4 = new X.8ES     // Catch:{ C1E -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ C1E -> 0x0324 }
            return r4
        L_0x0169:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_INVALID_STATE_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0324 }
            if (r0 == 0) goto L_0x0180
            X.BKY r0 = new X.BKY     // Catch:{ C1E -> 0x0324 }
            r0.<init>()     // Catch:{ C1E -> 0x0324 }
            X.8ES r4 = new X.8ES     // Catch:{ C1E -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ C1E -> 0x0324 }
            return r4
        L_0x0180:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_NAMESPACE_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0324 }
            if (r0 == 0) goto L_0x0197
            X.BKZ r0 = new X.BKZ     // Catch:{ C1E -> 0x0324 }
            r0.<init>()     // Catch:{ C1E -> 0x0324 }
            X.8ES r4 = new X.8ES     // Catch:{ C1E -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ C1E -> 0x0324 }
            return r4
        L_0x0197:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_NETWORK_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0324 }
            if (r0 == 0) goto L_0x01ae
            X.BKa r0 = new X.BKa     // Catch:{ C1E -> 0x0324 }
            r0.<init>()     // Catch:{ C1E -> 0x0324 }
            X.8ES r4 = new X.8ES     // Catch:{ C1E -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ C1E -> 0x0324 }
            return r4
        L_0x01ae:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0324 }
            if (r0 == 0) goto L_0x01c5
            X.BKb r0 = new X.BKb     // Catch:{ C1E -> 0x0324 }
            r0.<init>()     // Catch:{ C1E -> 0x0324 }
            X.8ES r4 = new X.8ES     // Catch:{ C1E -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ C1E -> 0x0324 }
            return r4
        L_0x01c5:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_NOT_ALLOWED_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0324 }
            if (r0 == 0) goto L_0x01dc
            X.BKc r0 = new X.BKc     // Catch:{ C1E -> 0x0324 }
            r0.<init>()     // Catch:{ C1E -> 0x0324 }
            X.8ES r4 = new X.8ES     // Catch:{ C1E -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ C1E -> 0x0324 }
            return r4
        L_0x01dc:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_NOT_FOUND_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0324 }
            if (r0 == 0) goto L_0x01f3
            X.BKd r0 = new X.BKd     // Catch:{ C1E -> 0x0324 }
            r0.<init>()     // Catch:{ C1E -> 0x0324 }
            X.8ES r4 = new X.8ES     // Catch:{ C1E -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ C1E -> 0x0324 }
            return r4
        L_0x01f3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_NOT_READABLE_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0324 }
            if (r0 == 0) goto L_0x020a
            X.BKe r0 = new X.BKe     // Catch:{ C1E -> 0x0324 }
            r0.<init>()     // Catch:{ C1E -> 0x0324 }
            X.8ES r4 = new X.8ES     // Catch:{ C1E -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ C1E -> 0x0324 }
            return r4
        L_0x020a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_NOT_SUPPORTED_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0324 }
            if (r0 == 0) goto L_0x0221
            X.BKf r0 = new X.BKf     // Catch:{ C1E -> 0x0324 }
            r0.<init>()     // Catch:{ C1E -> 0x0324 }
            X.8ES r4 = new X.8ES     // Catch:{ C1E -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ C1E -> 0x0324 }
            return r4
        L_0x0221:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_OPERATION_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0324 }
            if (r0 == 0) goto L_0x0238
            X.BKg r0 = new X.BKg     // Catch:{ C1E -> 0x0324 }
            r0.<init>()     // Catch:{ C1E -> 0x0324 }
            X.8ES r4 = new X.8ES     // Catch:{ C1E -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ C1E -> 0x0324 }
            return r4
        L_0x0238:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_OPT_OUT_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0324 }
            if (r0 == 0) goto L_0x024f
            X.BKh r0 = new X.BKh     // Catch:{ C1E -> 0x0324 }
            r0.<init>()     // Catch:{ C1E -> 0x0324 }
            X.8ES r4 = new X.8ES     // Catch:{ C1E -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ C1E -> 0x0324 }
            return r4
        L_0x024f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0324 }
            if (r0 == 0) goto L_0x0266
            X.BKi r0 = new X.BKi     // Catch:{ C1E -> 0x0324 }
            r0.<init>()     // Catch:{ C1E -> 0x0324 }
            X.8ES r4 = new X.8ES     // Catch:{ C1E -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ C1E -> 0x0324 }
            return r4
        L_0x0266:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_READ_ONLY_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0324 }
            if (r0 == 0) goto L_0x027d
            X.BKj r0 = new X.BKj     // Catch:{ C1E -> 0x0324 }
            r0.<init>()     // Catch:{ C1E -> 0x0324 }
            X.8ES r4 = new X.8ES     // Catch:{ C1E -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ C1E -> 0x0324 }
            return r4
        L_0x027d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_SECURITY_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0324 }
            if (r0 == 0) goto L_0x0294
            X.BKk r0 = new X.BKk     // Catch:{ C1E -> 0x0324 }
            r0.<init>()     // Catch:{ C1E -> 0x0324 }
            X.8ES r4 = new X.8ES     // Catch:{ C1E -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ C1E -> 0x0324 }
            return r4
        L_0x0294:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_SYNTAX_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0324 }
            if (r0 == 0) goto L_0x02ab
            X.BKl r0 = new X.BKl     // Catch:{ C1E -> 0x0324 }
            r0.<init>()     // Catch:{ C1E -> 0x0324 }
            X.8ES r4 = new X.8ES     // Catch:{ C1E -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ C1E -> 0x0324 }
            return r4
        L_0x02ab:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_TIMEOUT_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0324 }
            if (r0 == 0) goto L_0x02c2
            X.BKm r0 = new X.BKm     // Catch:{ C1E -> 0x0324 }
            r0.<init>()     // Catch:{ C1E -> 0x0324 }
            X.8ES r4 = new X.8ES     // Catch:{ C1E -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ C1E -> 0x0324 }
            return r4
        L_0x02c2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0324 }
            if (r0 == 0) goto L_0x02d9
            X.BKn r0 = new X.BKn     // Catch:{ C1E -> 0x0324 }
            r0.<init>()     // Catch:{ C1E -> 0x0324 }
            X.8ES r4 = new X.8ES     // Catch:{ C1E -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ C1E -> 0x0324 }
            return r4
        L_0x02d9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_UNKNOWN_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0324 }
            if (r0 == 0) goto L_0x02f0
            X.BKo r0 = new X.BKo     // Catch:{ C1E -> 0x0324 }
            r0.<init>()     // Catch:{ C1E -> 0x0324 }
            X.8ES r4 = new X.8ES     // Catch:{ C1E -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ C1E -> 0x0324 }
            return r4
        L_0x02f0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_VERSION_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0324 }
            if (r0 == 0) goto L_0x0307
            X.BKp r0 = new X.BKp     // Catch:{ C1E -> 0x0324 }
            r0.<init>()     // Catch:{ C1E -> 0x0324 }
            X.8ES r4 = new X.8ES     // Catch:{ C1E -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ C1E -> 0x0324 }
            return r4
        L_0x0307:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ C1E -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ C1E -> 0x0324 }
            if (r0 == 0) goto L_0x031e
            X.BKq r0 = new X.BKq     // Catch:{ C1E -> 0x0324 }
            r0.<init>()     // Catch:{ C1E -> 0x0324 }
            X.8ES r4 = new X.8ES     // Catch:{ C1E -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ C1E -> 0x0324 }
            return r4
        L_0x031e:
            X.C1E r0 = new X.C1E     // Catch:{ C1E -> 0x0324 }
            r0.<init>()     // Catch:{ C1E -> 0x0324 }
            throw r0     // Catch:{ C1E -> 0x0324 }
        L_0x0324:
            X.8EN r4 = new X.8EN     // Catch:{ C1E -> 0x0330 }
            r4.<init>(r3, r2)     // Catch:{ C1E -> 0x0330 }
            return r4
        L_0x032a:
            X.C1E r0 = new X.C1E     // Catch:{ C1E -> 0x0330 }
            r0.<init>()     // Catch:{ C1E -> 0x0330 }
            throw r0     // Catch:{ C1E -> 0x0330 }
        L_0x0330:
            X.8EN r4 = new X.8EN
            r4.<init>(r3, r2)
            return r4
        L_0x0336:
            java.lang.String r1 = r5.getType()
            X.C18070vi.A0X(r1)
            java.lang.String r0 = r5.getMessage()
            X.8EN r4 = new X.8EN
            r4.<init>(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26612D6f.A02(android.credentials.GetCredentialException):X.C1t");
    }

    public static boolean A03(String str, String str2, StringBuilder sb) {
        sb.append(str);
        return str2.equals(sb.toString());
    }
}
