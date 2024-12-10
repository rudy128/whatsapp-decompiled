package com.whatsapp.ohai;

import X.AnonymousClass00R;
import X.AnonymousClass4XD;
import X.C21527Ala;

public final class WaOhaiClient {
    public static final AnonymousClass4XD A00 = new AnonymousClass4XD(AnonymousClass00R.A00, new C21527Ala(5));

    public static final native HttpResponse decrypt(short s, EncryptionContext encryptionContext, byte[] bArr, byte[] bArr2);

    public static final native EncryptionResult encrypt(HttpRequest httpRequest, PublicKeyConfig publicKeyConfig);
}
