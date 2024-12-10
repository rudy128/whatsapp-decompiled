package com.facebook.wearable.airshield.stream;

import X.AnonymousClass000;
import X.AnonymousClass1A8;
import X.C18070vi;
import X.C18100vl;
import X.C24583CAe;
import com.facebook.jni.HybridData;
import com.facebook.wearable.airshield.security.Hash;
import com.facebook.wearable.airshield.security.InitializationVector;
import com.facebook.wearable.airshield.security.PrivateKey;
import com.facebook.wearable.airshield.security.PublicKey;
import com.facebook.wearable.airshield.security.Random;

public final class CipherBuilder {
    public static final int CHALLENGE_SIZE = 16;
    public static final C24583CAe Companion = new Object();
    public static final int SEED_SIZE = 32;
    public byte[] challenge;
    public InitializationVector initializationVector;
    public final HybridData mHybridData = initHybrid();
    public PrivateKey privateKey;
    public PublicKey remotePublicKey;
    public byte[] seed;

    private final native Framing buildDecryptionFramingNative(int i, boolean z);

    private final native Framing buildEncryptionFramingNative(int i, boolean z);

    private final native Hash buildRxChallengeNative();

    private final native Hash buildTxChallengeNative();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    private final native void setChallengeNative(byte[] bArr);

    private final native void setInitializationVectorNative(long j);

    private final native void setPrivateKey(long j);

    private final native void setRemotePublicKeyNative(long j);

    private final native void setSeedNative(byte[] bArr);

    public final void setChallenge(byte[] bArr) {
        C18070vi.A0d(bArr, 0);
        this.challenge = bArr;
        setChallengeNative(bArr);
    }

    public final void setInitializationVector(InitializationVector initializationVector2) {
        C18070vi.A0d(initializationVector2, 0);
        this.initializationVector = initializationVector2;
        setInitializationVectorNative(initializationVector2.getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed());
    }

    public final void setPrivateKey(PrivateKey privateKey2) {
        C18070vi.A0d(privateKey2, 0);
        this.privateKey = privateKey2;
        setPrivateKey(privateKey2.getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed());
    }

    public final void setSeed(byte[] bArr) {
        C18070vi.A0d(bArr, 0);
        this.seed = bArr;
        setSeedNative(bArr);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.CAe] */
    static {
        AnonymousClass1A8.A06("airshield_light_mbed_jni");
    }

    private final void checkValues() {
        if (this.remotePublicKey == null) {
            throw AnonymousClass000.A0n("RemotePublicKey was not set");
        }
    }

    public final byte[] getChallenge() {
        return this.challenge;
    }

    public final InitializationVector getInitializationVector() {
        return this.initializationVector;
    }

    public final PrivateKey getPrivateKey() {
        return this.privateKey;
    }

    public final PublicKey getPublicKey() {
        return this.privateKey.recoverPublicKey();
    }

    public final PublicKey getRemotePublicKey() {
        return this.remotePublicKey;
    }

    public final byte[] getSeed() {
        return this.seed;
    }

    public final void setRemotePublicKey(PublicKey publicKey) {
        if (publicKey != null) {
            this.remotePublicKey = publicKey;
            setRemotePublicKeyNative(publicKey.getNative());
            return;
        }
        throw AnonymousClass000.A0n("remote public key is null");
    }

    public CipherBuilder() {
        PrivateKey privateKey2 = new PrivateKey();
        privateKey2.generate();
        setPrivateKey(privateKey2.getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed());
        this.privateKey = privateKey2;
        byte[] bArr = new byte[16];
        C18100vl r2 = Random.instance;
        ((Random) r2.getValue()).bytesNative(bArr);
        setChallengeNative(bArr);
        this.challenge = bArr;
        byte[] bArr2 = new byte[32];
        ((Random) r2.getValue()).bytesNative(bArr2);
        setSeedNative(bArr2);
        this.seed = bArr2;
        InitializationVector initializationVector2 = new InitializationVector();
        initializationVector2.generate();
        setInitializationVectorNative(initializationVector2.getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed());
        this.initializationVector = initializationVector2;
    }

    public final Framing buildDecryptionFraming(int i, boolean z) {
        checkValues();
        return buildDecryptionFramingNative(i, z);
    }

    public final Framing buildEncryptionFraming(int i, boolean z) {
        checkValues();
        return buildEncryptionFramingNative(i, z);
    }

    public final Hash buildRxChallenge() {
        checkValues();
        return buildRxChallengeNative();
    }

    public final Hash buildTxChallenge() {
        checkValues();
        return buildTxChallengeNative();
    }
}
