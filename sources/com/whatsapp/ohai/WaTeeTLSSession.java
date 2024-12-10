package com.whatsapp.ohai;

import X.AnonymousClass1A8;
import X.C18070vi;
import X.C18100vl;
import X.C181529Qv;
import X.C21527Ala;
import X.C72453Mb;

public final class WaTeeTLSSession {
    public static final C181529Qv Companion = new Object();
    public final C18100vl nativeObject$delegate = C21527Ala.A00(6);

    public static final native long create();

    public static final native PerformHandshakeResult performHandshake(long j, byte[] bArr, byte[] bArr2);

    public static final native void release(long j);

    public static final native HttpResponse teeDecrypt(long j, short s, EncryptionContext encryptionContext, byte[] bArr, byte[] bArr2);

    public static final native EncryptionResult teeEncrypt(long j, HttpRequest httpRequest, PublicKeyConfig publicKeyConfig);

    public final HttpResponse teeDecryptResponse(short s, EncryptionContext encryptionContext, byte[] bArr, byte[] bArr2) {
        C18070vi.A0o(encryptionContext, bArr, bArr2);
        return teeDecrypt(C72453Mb.A0K(this.nativeObject$delegate), s, encryptionContext, bArr, bArr2);
    }

    private final long getNativeObject() {
        return C72453Mb.A0K(this.nativeObject$delegate);
    }

    public final void release() {
        release(C72453Mb.A0K(this.nativeObject$delegate));
    }

    public WaTeeTLSSession() {
        AnonymousClass1A8.A06("ohai");
    }

    public static final long nativeObject_delegate$lambda$0() {
        return create();
    }

    public final EncryptionResult teeEncryptRequest(HttpRequest httpRequest, PublicKeyConfig publicKeyConfig) {
        C18070vi.A0h(httpRequest, publicKeyConfig);
        return teeEncrypt(C72453Mb.A0K(this.nativeObject$delegate), httpRequest, publicKeyConfig);
    }

    public final PerformHandshakeResult teePerformHandshake(byte[] bArr, byte[] bArr2) {
        C18070vi.A0h(bArr, bArr2);
        return performHandshake(C72453Mb.A0K(this.nativeObject$delegate), bArr, bArr2);
    }
}
